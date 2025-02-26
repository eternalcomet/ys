package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.command.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameQuest;
import java.util.List;
import java.util.stream.Collectors;

@Command(
        label = "quest",
        aliases = {"q"},
        usage = {"(add|finish|running|talking|debug|triggers|grouptriggers) [<questId>]", "dungeons"},
        permission = "player.quest",
        permissionTargeted = "player.quest.others")
public final class QuestCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() != 2 || (args.size() == 1 && !args.get(0).toLowerCase().equals("dungeons"))) {
            sendUsageMessage(sender);
            return;
        }

        String cmd = args.get(0).toLowerCase();
        int questId;

        try {
            questId = Integer.parseInt(args.get(1));
        } catch (Exception e) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.quest.invalid_id"));
            return;
        }

        switch (cmd) {
            case "add" -> {
                GameQuest quest = targetPlayer.getQuestManager().addQuest(questId);

                if (quest != null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.added", questId));
                    return;
                }

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
            }
            case "finish" -> {
                GameQuest quest = targetPlayer.getQuestManager().getQuestById(questId);

                if (quest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                quest.finish();

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.finished", questId));
            }
            case "running" -> {
                var quest = targetPlayer.getQuestManager().getQuestById(questId);
                if (quest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                CommandHandler.sendMessage(
                        sender,
                        translate(
                                sender,
                                "commands.quest.running",
                                questId,
                                translate(
                                        sender,
                                        switch (quest.state) {
                                            case QUEST_STATE_NONE, NONE -> "commands.quest.state.none";
                                            case QUEST_STATE_UNSTARTED, UNSTARTED -> "commands.quest.state.unstarted";
                                            case QUEST_STATE_UNFINISHED, UNFINISHED -> "commands.quest.state.unfinished";
                                            case QUEST_STATE_FINISHED, FINISHED -> "commands.quest.state.finished";
                                            case QUEST_STATE_FAILED, FAILED -> "commands.quest.state.failed";
                                        }),
                                quest.getState().getValue()));
            }
            case "talking" -> {
                var mainQuest = targetPlayer.getQuestManager().getMainQuestByTalkId(questId);
                if (mainQuest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                var talk = mainQuest.getTalks().get(questId);
                CommandHandler.sendMessage(
                        sender,
                        translate(
                                sender,
                                "commands.quest.talking",
                                questId,
                                talk == null
                                        ? translate(sender, "commands.quest.state.not_exists")
                                        : translate(sender, "commands.quest.state.exists"),
                                mainQuest.getParentQuestId(),
                                mainQuest.getState().getValue()));
            }
            case "dungeons" -> {
                var dungeons = targetPlayer.getPlayerProgress().getCompletedDungeons();
                CommandHandler.sendMessage(
                        sender,
                        "Dungeons completed: "
                                + String.join(", ", dungeons.intStream().mapToObj(String::valueOf).toList()));
            }
            case "debug" -> {
                var loggedQuests = targetPlayer.getQuestManager().getLoggedQuests();
                var shouldAdd = !loggedQuests.contains(questId);

                if (shouldAdd) loggedQuests.add(questId);
                else loggedQuests.remove(questId);

                CommandHandler.sendMessage(
                        sender,
                        "Quest %s will %s."
                                .formatted(questId, shouldAdd ? "now be logged" : "no longer be logged"));
            }
            case "triggers" -> {
                var quest = targetPlayer.getQuestManager().getQuestById(questId);
                if (quest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                CommandHandler.sendMessage(
                        sender,
                        "Triggers registered for %s: %s."
                                .formatted(questId, String.join(", ", quest.getTriggers().keySet())));
            }
            case "grouptriggers" -> {
                var scene = targetPlayer.getScene();
                var scriptManager = scene.getScriptManager();

                var group = scriptManager.getGroupById(questId);
                if (group == null) {
                    CommandHandler.sendMessage(sender, "The group does not exist.");
                    return;
                }

                CommandHandler.sendMessage(
                        sender,
                        group.triggers.entrySet().stream()
                                .map(entry -> "%s: %s".formatted(entry.getKey(), entry.getValue()))
                                .collect(Collectors.joining(", ")));
            }
            default -> this.sendUsageMessage(sender);
        }
    }
}
