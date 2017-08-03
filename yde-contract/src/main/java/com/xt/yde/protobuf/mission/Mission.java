// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gamemission.protobuf

package com.xt.yde.protobuf.mission;

public final class Mission {
  private Mission() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MissionClearGameRequestMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.xt.yde.protobuf.mission.MissionClearGameRequestMsg}
   *
   * <pre>
   *结算请求
   * </pre>
   */
  public static final class MissionClearGameRequestMsg extends
      com.google.protobuf.GeneratedMessage
      implements MissionClearGameRequestMsgOrBuilder {
    // Use MissionClearGameRequestMsg.newBuilder() to construct.
    private MissionClearGameRequestMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MissionClearGameRequestMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MissionClearGameRequestMsg defaultInstance;
    public static MissionClearGameRequestMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MissionClearGameRequestMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MissionClearGameRequestMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.class, com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MissionClearGameRequestMsg> PARSER =
        new com.google.protobuf.AbstractParser<MissionClearGameRequestMsg>() {
      public MissionClearGameRequestMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MissionClearGameRequestMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MissionClearGameRequestMsg> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.xt.yde.protobuf.mission.MissionClearGameRequestMsg}
     *
     * <pre>
     *结算请求
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.class, com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.Builder.class);
      }

      // Construct using com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor;
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg getDefaultInstanceForType() {
        return com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.getDefaultInstance();
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg build() {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg buildPartial() {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg result = new com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg) {
          return mergeFrom((com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg other) {
        if (other == com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xt.yde.protobuf.mission.Mission.MissionClearGameRequestMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.xt.yde.protobuf.mission.MissionClearGameRequestMsg)
    }

    static {
      defaultInstance = new MissionClearGameRequestMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.xt.yde.protobuf.mission.MissionClearGameRequestMsg)
  }

  public interface MissionClearGameResponseMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string times = 1;
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    boolean hasTimes();
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    java.lang.String getTimes();
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    com.google.protobuf.ByteString
        getTimesBytes();

    // required float totalMoney = 2;
    /**
     * <code>required float totalMoney = 2;</code>
     *
     * <pre>
     *获奖金额
     * </pre>
     */
    boolean hasTotalMoney();
    /**
     * <code>required float totalMoney = 2;</code>
     *
     * <pre>
     *获奖金额
     * </pre>
     */
    float getTotalMoney();
  }
  /**
   * Protobuf type {@code com.xt.yde.protobuf.mission.MissionClearGameResponseMsg}
   *
   * <pre>
   *结算应答
   * </pre>
   */
  public static final class MissionClearGameResponseMsg extends
      com.google.protobuf.GeneratedMessage
      implements MissionClearGameResponseMsgOrBuilder {
    // Use MissionClearGameResponseMsg.newBuilder() to construct.
    private MissionClearGameResponseMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MissionClearGameResponseMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MissionClearGameResponseMsg defaultInstance;
    public static MissionClearGameResponseMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MissionClearGameResponseMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MissionClearGameResponseMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              times_ = input.readBytes();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              totalMoney_ = input.readFloat();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.class, com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MissionClearGameResponseMsg> PARSER =
        new com.google.protobuf.AbstractParser<MissionClearGameResponseMsg>() {
      public MissionClearGameResponseMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MissionClearGameResponseMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MissionClearGameResponseMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string times = 1;
    public static final int TIMES_FIELD_NUMBER = 1;
    private java.lang.Object times_;
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    public boolean hasTimes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    public java.lang.String getTimes() {
      java.lang.Object ref = times_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          times_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string times = 1;</code>
     *
     * <pre>
     *获奖倍数
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTimesBytes() {
      java.lang.Object ref = times_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        times_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required float totalMoney = 2;
    public static final int TOTALMONEY_FIELD_NUMBER = 2;
    private float totalMoney_;
    /**
     * <code>required float totalMoney = 2;</code>
     *
     * <pre>
     *获奖金额
     * </pre>
     */
    public boolean hasTotalMoney() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required float totalMoney = 2;</code>
     *
     * <pre>
     *获奖金额
     * </pre>
     */
    public float getTotalMoney() {
      return totalMoney_;
    }

    private void initFields() {
      times_ = "";
      totalMoney_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTimes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTotalMoney()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTimesBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, totalMoney_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTimesBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, totalMoney_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.xt.yde.protobuf.mission.MissionClearGameResponseMsg}
     *
     * <pre>
     *结算应答
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.class, com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.Builder.class);
      }

      // Construct using com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        times_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        totalMoney_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xt.yde.protobuf.mission.Mission.internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor;
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg getDefaultInstanceForType() {
        return com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.getDefaultInstance();
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg build() {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg buildPartial() {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg result = new com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.times_ = times_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.totalMoney_ = totalMoney_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg) {
          return mergeFrom((com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg other) {
        if (other == com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg.getDefaultInstance()) return this;
        if (other.hasTimes()) {
          bitField0_ |= 0x00000001;
          times_ = other.times_;
          onChanged();
        }
        if (other.hasTotalMoney()) {
          setTotalMoney(other.getTotalMoney());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTimes()) {
          
          return false;
        }
        if (!hasTotalMoney()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xt.yde.protobuf.mission.Mission.MissionClearGameResponseMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string times = 1;
      private java.lang.Object times_ = "";
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public boolean hasTimes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public java.lang.String getTimes() {
        java.lang.Object ref = times_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          times_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTimesBytes() {
        java.lang.Object ref = times_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          times_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public Builder setTimes(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        times_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public Builder clearTimes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        times_ = getDefaultInstance().getTimes();
        onChanged();
        return this;
      }
      /**
       * <code>required string times = 1;</code>
       *
       * <pre>
       *获奖倍数
       * </pre>
       */
      public Builder setTimesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        times_ = value;
        onChanged();
        return this;
      }

      // required float totalMoney = 2;
      private float totalMoney_ ;
      /**
       * <code>required float totalMoney = 2;</code>
       *
       * <pre>
       *获奖金额
       * </pre>
       */
      public boolean hasTotalMoney() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required float totalMoney = 2;</code>
       *
       * <pre>
       *获奖金额
       * </pre>
       */
      public float getTotalMoney() {
        return totalMoney_;
      }
      /**
       * <code>required float totalMoney = 2;</code>
       *
       * <pre>
       *获奖金额
       * </pre>
       */
      public Builder setTotalMoney(float value) {
        bitField0_ |= 0x00000002;
        totalMoney_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float totalMoney = 2;</code>
       *
       * <pre>
       *获奖金额
       * </pre>
       */
      public Builder clearTotalMoney() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalMoney_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.xt.yde.protobuf.mission.MissionClearGameResponseMsg)
    }

    static {
      defaultInstance = new MissionClearGameResponseMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.xt.yde.protobuf.mission.MissionClearGameResponseMsg)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024gamemission.protobuf\022\033com.xt.yde.proto" +
      "buf.mission\"\034\n\032MissionClearGameRequestMs" +
      "g\"@\n\033MissionClearGameResponseMsg\022\r\n\005time" +
      "s\030\001 \002(\t\022\022\n\ntotalMoney\030\002 \002(\002B\tB\007Mission"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xt_yde_protobuf_mission_MissionClearGameRequestMsg_descriptor,
              new java.lang.String[] { });
          internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xt_yde_protobuf_mission_MissionClearGameResponseMsg_descriptor,
              new java.lang.String[] { "Times", "TotalMoney", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}