// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameStartReq.proto

package emu.grasscutter.net.proto;

public final class MusicGameStartReqOuterClass {
    private MusicGameStartReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MusicGameStartReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MusicGameStartReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 music_basic_id = 2;</code>
         *
         * @return The musicBasicId.
         */
        int getMusicBasicId();

        /**
         * <code>bool is_save_score = 11;</code>
         *
         * @return The isSaveScore.
         */
        boolean getIsSaveScore();

        /**
         * <code>uint64 ugc_guid = 3;</code>
         *
         * @return The ugcGuid.
         */
        long getUgcGuid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8406 (3.2)
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MusicGameStartReq}
     */
    public static final class MusicGameStartReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MusicGameStartReq)
            MusicGameStartReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MusicGameStartReq.newBuilder() to construct.
        private MusicGameStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MusicGameStartReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MusicGameStartReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MusicGameStartReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 16:
                            {
                                musicBasicId_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                ugcGuid_ = input.readUInt64();
                                break;
                            }
                        case 88:
                            {
                                isSaveScore_ = input.readBool();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.MusicGameStartReqOuterClass
                    .internal_static_MusicGameStartReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MusicGameStartReqOuterClass
                    .internal_static_MusicGameStartReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq.class,
                            emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq.Builder
                                    .class);
        }

        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 2;
        private int musicBasicId_;
        /**
         * <code>uint32 music_basic_id = 2;</code>
         *
         * @return The musicBasicId.
         */
        @java.lang.Override
        public int getMusicBasicId() {
            return musicBasicId_;
        }

        public static final int IS_SAVE_SCORE_FIELD_NUMBER = 11;
        private boolean isSaveScore_;
        /**
         * <code>bool is_save_score = 11;</code>
         *
         * @return The isSaveScore.
         */
        @java.lang.Override
        public boolean getIsSaveScore() {
            return isSaveScore_;
        }

        public static final int UGC_GUID_FIELD_NUMBER = 3;
        private long ugcGuid_;
        /**
         * <code>uint64 ugc_guid = 3;</code>
         *
         * @return The ugcGuid.
         */
        @java.lang.Override
        public long getUgcGuid() {
            return ugcGuid_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (musicBasicId_ != 0) {
                output.writeUInt32(2, musicBasicId_);
            }
            if (ugcGuid_ != 0L) {
                output.writeUInt64(3, ugcGuid_);
            }
            if (isSaveScore_ != false) {
                output.writeBool(11, isSaveScore_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (musicBasicId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, musicBasicId_);
            }
            if (ugcGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, ugcGuid_);
            }
            if (isSaveScore_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, isSaveScore_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj
                    instanceof emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq other =
                    (emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq) obj;

            if (getMusicBasicId() != other.getMusicBasicId()) return false;
            if (getIsSaveScore() != other.getIsSaveScore()) return false;
            if (getUgcGuid() != other.getUgcGuid()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMusicBasicId();
            hash = (37 * hash) + IS_SAVE_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsSaveScore());
            hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getUgcGuid());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 8406 (3.2)
         * EnetChannelId: 0
         * EnetIsReliable: true
         * IsAllowClient: true
         * </pre>
         *
         * Protobuf type {@code MusicGameStartReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MusicGameStartReq)
                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MusicGameStartReqOuterClass
                        .internal_static_MusicGameStartReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MusicGameStartReqOuterClass
                        .internal_static_MusicGameStartReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq.class,
                                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                musicBasicId_ = 0;

                isSaveScore_ = false;

                ugcGuid_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MusicGameStartReqOuterClass
                        .internal_static_MusicGameStartReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq build() {
                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                    buildPartial() {
                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq result =
                        new emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq(this);
                result.musicBasicId_ = musicBasicId_;
                result.isSaveScore_ = isSaveScore_;
                result.ugcGuid_ = ugcGuid_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq other) {
                if (other
                        == emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                                .getDefaultInstance()) return this;
                if (other.getMusicBasicId() != 0) {
                    setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getIsSaveScore() != false) {
                    setIsSaveScore(other.getIsSaveScore());
                }
                if (other.getUgcGuid() != 0L) {
                    setUgcGuid(other.getUgcGuid());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int musicBasicId_;
            /**
             * <code>uint32 music_basic_id = 2;</code>
             *
             * @return The musicBasicId.
             */
            @java.lang.Override
            public int getMusicBasicId() {
                return musicBasicId_;
            }
            /**
             * <code>uint32 music_basic_id = 2;</code>
             *
             * @param value The musicBasicId to set.
             * @return This builder for chaining.
             */
            public Builder setMusicBasicId(int value) {

                musicBasicId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 music_basic_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMusicBasicId() {

                musicBasicId_ = 0;
                onChanged();
                return this;
            }

            private boolean isSaveScore_;
            /**
             * <code>bool is_save_score = 11;</code>
             *
             * @return The isSaveScore.
             */
            @java.lang.Override
            public boolean getIsSaveScore() {
                return isSaveScore_;
            }
            /**
             * <code>bool is_save_score = 11;</code>
             *
             * @param value The isSaveScore to set.
             * @return This builder for chaining.
             */
            public Builder setIsSaveScore(boolean value) {

                isSaveScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_save_score = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsSaveScore() {

                isSaveScore_ = false;
                onChanged();
                return this;
            }

            private long ugcGuid_;
            /**
             * <code>uint64 ugc_guid = 3;</code>
             *
             * @return The ugcGuid.
             */
            @java.lang.Override
            public long getUgcGuid() {
                return ugcGuid_;
            }
            /**
             * <code>uint64 ugc_guid = 3;</code>
             *
             * @param value The ugcGuid to set.
             * @return This builder for chaining.
             */
            public Builder setUgcGuid(long value) {

                ugcGuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 ugc_guid = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUgcGuid() {

                ugcGuid_ = 0L;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:MusicGameStartReq)
        }

        // @@protoc_insertion_point(class_scope:MusicGameStartReq)
        private static final emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq();
        }

        public static emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MusicGameStartReq> PARSER =
                new com.google.protobuf.AbstractParser<MusicGameStartReq>() {
                    @java.lang.Override
                    public MusicGameStartReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MusicGameStartReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MusicGameStartReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MusicGameStartReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MusicGameStartReqOuterClass.MusicGameStartReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MusicGameStartReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MusicGameStartReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\027MusicGameStartReq.proto\"T\n\021MusicGameSt"
                    + "artReq\022\026\n\016music_basic_id\030\002 \001(\r\022\025\n\ris_sav"
                    + "e_score\030\013 \001(\010\022\020\n\010ugc_guid\030\003 \001(\004B\033\n\031emu.g"
                    + "rasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_MusicGameStartReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameStartReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MusicGameStartReq_descriptor,
                        new java.lang.String[] {
                            "MusicBasicId", "IsSaveScore", "UgcGuid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
