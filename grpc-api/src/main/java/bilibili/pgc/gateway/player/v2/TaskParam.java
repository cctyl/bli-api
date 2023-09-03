// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * 任务参数信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v2.TaskParam}
 */
public final class TaskParam extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v2.TaskParam)
    TaskParamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskParam.newBuilder() to construct.
  private TaskParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskParam() {
    taskType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskParam();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_TaskParam_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_TaskParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v2.TaskParam.class, bilibili.pgc.gateway.player.v2.TaskParam.Builder.class);
  }

  public static final int TASK_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskType_ = "";
  /**
   * <pre>
   * 任务类型
   * </pre>
   *
   * <code>string task_type = 1;</code>
   * @return The taskType.
   */
  @java.lang.Override
  public java.lang.String getTaskType() {
    java.lang.Object ref = taskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 任务类型
   * </pre>
   *
   * <code>string task_type = 1;</code>
   * @return The bytes for taskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskTypeBytes() {
    java.lang.Object ref = taskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
  private long activityId_ = 0L;
  /**
   * <pre>
   * 活动ID
   * </pre>
   *
   * <code>int64 activity_id = 2;</code>
   * @return The activityId.
   */
  @java.lang.Override
  public long getActivityId() {
    return activityId_;
  }

  public static final int TIPS_ID_FIELD_NUMBER = 3;
  private long tipsId_ = 0L;
  /**
   * <pre>
   * 提示ID
   * </pre>
   *
   * <code>int64 tips_id = 3;</code>
   * @return The tipsId.
   */
  @java.lang.Override
  public long getTipsId() {
    return tipsId_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, taskType_);
    }
    if (activityId_ != 0L) {
      output.writeInt64(2, activityId_);
    }
    if (tipsId_ != 0L) {
      output.writeInt64(3, tipsId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, taskType_);
    }
    if (activityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, activityId_);
    }
    if (tipsId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, tipsId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bilibili.pgc.gateway.player.v2.TaskParam)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v2.TaskParam other = (bilibili.pgc.gateway.player.v2.TaskParam) obj;

    if (!getTaskType()
        .equals(other.getTaskType())) return false;
    if (getActivityId()
        != other.getActivityId()) return false;
    if (getTipsId()
        != other.getTipsId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TASK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTaskType().hashCode();
    hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActivityId());
    hash = (37 * hash) + TIPS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTipsId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.TaskParam parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(bilibili.pgc.gateway.player.v2.TaskParam prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 任务参数信息
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v2.TaskParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v2.TaskParam)
      bilibili.pgc.gateway.player.v2.TaskParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_TaskParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_TaskParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v2.TaskParam.class, bilibili.pgc.gateway.player.v2.TaskParam.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v2.TaskParam.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      taskType_ = "";
      activityId_ = 0L;
      tipsId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_TaskParam_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.TaskParam getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v2.TaskParam.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.TaskParam build() {
      bilibili.pgc.gateway.player.v2.TaskParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.TaskParam buildPartial() {
      bilibili.pgc.gateway.player.v2.TaskParam result = new bilibili.pgc.gateway.player.v2.TaskParam(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v2.TaskParam result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskType_ = taskType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.activityId_ = activityId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tipsId_ = tipsId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v2.TaskParam) {
        return mergeFrom((bilibili.pgc.gateway.player.v2.TaskParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v2.TaskParam other) {
      if (other == bilibili.pgc.gateway.player.v2.TaskParam.getDefaultInstance()) return this;
      if (!other.getTaskType().isEmpty()) {
        taskType_ = other.taskType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getActivityId() != 0L) {
        setActivityId(other.getActivityId());
      }
      if (other.getTipsId() != 0L) {
        setTipsId(other.getTipsId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              taskType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              activityId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              tipsId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object taskType_ = "";
    /**
     * <pre>
     * 任务类型
     * </pre>
     *
     * <code>string task_type = 1;</code>
     * @return The taskType.
     */
    public java.lang.String getTaskType() {
      java.lang.Object ref = taskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 任务类型
     * </pre>
     *
     * <code>string task_type = 1;</code>
     * @return The bytes for taskType.
     */
    public com.google.protobuf.ByteString
        getTaskTypeBytes() {
      java.lang.Object ref = taskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 任务类型
     * </pre>
     *
     * <code>string task_type = 1;</code>
     * @param value The taskType to set.
     * @return This builder for chaining.
     */
    public Builder setTaskType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 任务类型
     * </pre>
     *
     * <code>string task_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskType() {
      taskType_ = getDefaultInstance().getTaskType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 任务类型
     * </pre>
     *
     * <code>string task_type = 1;</code>
     * @param value The bytes for taskType to set.
     * @return This builder for chaining.
     */
    public Builder setTaskTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long activityId_ ;
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public long getActivityId() {
      return activityId_;
    }
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @param value The activityId to set.
     * @return This builder for chaining.
     */
    public Builder setActivityId(long value) {

      activityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      activityId_ = 0L;
      onChanged();
      return this;
    }

    private long tipsId_ ;
    /**
     * <pre>
     * 提示ID
     * </pre>
     *
     * <code>int64 tips_id = 3;</code>
     * @return The tipsId.
     */
    @java.lang.Override
    public long getTipsId() {
      return tipsId_;
    }
    /**
     * <pre>
     * 提示ID
     * </pre>
     *
     * <code>int64 tips_id = 3;</code>
     * @param value The tipsId to set.
     * @return This builder for chaining.
     */
    public Builder setTipsId(long value) {

      tipsId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 提示ID
     * </pre>
     *
     * <code>int64 tips_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTipsId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tipsId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v2.TaskParam)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v2.TaskParam)
  private static final bilibili.pgc.gateway.player.v2.TaskParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v2.TaskParam();
  }

  public static bilibili.pgc.gateway.player.v2.TaskParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskParam>
      PARSER = new com.google.protobuf.AbstractParser<TaskParam>() {
    @java.lang.Override
    public TaskParam parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TaskParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskParam> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.TaskParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

