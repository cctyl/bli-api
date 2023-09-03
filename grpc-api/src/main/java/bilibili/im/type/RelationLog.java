// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.im.type.RelationLog}
 */
public final class RelationLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.type.RelationLog)
    RelationLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelationLog.newBuilder() to construct.
  private RelationLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationLog() {
    logType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelationLog();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.type.Im.internal_static_bilibili_im_type_RelationLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.type.Im.internal_static_bilibili_im_type_RelationLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.type.RelationLog.class, bilibili.im.type.RelationLog.Builder.class);
  }

  public static final int LOG_TYPE_FIELD_NUMBER = 1;
  private int logType_ = 0;
  /**
   * <pre>
   * 操作类型
   * </pre>
   *
   * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
   * @return The enum numeric value on the wire for logType.
   */
  @java.lang.Override public int getLogTypeValue() {
    return logType_;
  }
  /**
   * <pre>
   * 操作类型
   * </pre>
   *
   * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
   * @return The logType.
   */
  @java.lang.Override public bilibili.im.type.RelationLogType getLogType() {
    bilibili.im.type.RelationLogType result = bilibili.im.type.RelationLogType.forNumber(logType_);
    return result == null ? bilibili.im.type.RelationLogType.UNRECOGNIZED : result;
  }

  public static final int OPLOG_SEQNO_FIELD_NUMBER = 2;
  private long oplogSeqno_ = 0L;
  /**
   * <pre>
   * 操作seqno
   * </pre>
   *
   * <code>uint64 oplog_seqno = 2;</code>
   * @return The oplogSeqno.
   */
  @java.lang.Override
  public long getOplogSeqno() {
    return oplogSeqno_;
  }

  public static final int FRIEND_RELATION_FIELD_NUMBER = 3;
  private bilibili.im.type.FriendRelation friendRelation_;
  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   * @return Whether the friendRelation field is set.
   */
  @java.lang.Override
  public boolean hasFriendRelation() {
    return friendRelation_ != null;
  }
  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   * @return The friendRelation.
   */
  @java.lang.Override
  public bilibili.im.type.FriendRelation getFriendRelation() {
    return friendRelation_ == null ? bilibili.im.type.FriendRelation.getDefaultInstance() : friendRelation_;
  }
  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   */
  @java.lang.Override
  public bilibili.im.type.FriendRelationOrBuilder getFriendRelationOrBuilder() {
    return friendRelation_ == null ? bilibili.im.type.FriendRelation.getDefaultInstance() : friendRelation_;
  }

  public static final int GROUP_RELATION_FIELD_NUMBER = 4;
  private bilibili.im.type.GroupRelation groupRelation_;
  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   * @return Whether the groupRelation field is set.
   */
  @java.lang.Override
  public boolean hasGroupRelation() {
    return groupRelation_ != null;
  }
  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   * @return The groupRelation.
   */
  @java.lang.Override
  public bilibili.im.type.GroupRelation getGroupRelation() {
    return groupRelation_ == null ? bilibili.im.type.GroupRelation.getDefaultInstance() : groupRelation_;
  }
  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   */
  @java.lang.Override
  public bilibili.im.type.GroupRelationOrBuilder getGroupRelationOrBuilder() {
    return groupRelation_ == null ? bilibili.im.type.GroupRelation.getDefaultInstance() : groupRelation_;
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
    if (logType_ != bilibili.im.type.RelationLogType.EN_INVALID_LOG_TYPE.getNumber()) {
      output.writeEnum(1, logType_);
    }
    if (oplogSeqno_ != 0L) {
      output.writeUInt64(2, oplogSeqno_);
    }
    if (friendRelation_ != null) {
      output.writeMessage(3, getFriendRelation());
    }
    if (groupRelation_ != null) {
      output.writeMessage(4, getGroupRelation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logType_ != bilibili.im.type.RelationLogType.EN_INVALID_LOG_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, logType_);
    }
    if (oplogSeqno_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, oplogSeqno_);
    }
    if (friendRelation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFriendRelation());
    }
    if (groupRelation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getGroupRelation());
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
    if (!(obj instanceof bilibili.im.type.RelationLog)) {
      return super.equals(obj);
    }
    bilibili.im.type.RelationLog other = (bilibili.im.type.RelationLog) obj;

    if (logType_ != other.logType_) return false;
    if (getOplogSeqno()
        != other.getOplogSeqno()) return false;
    if (hasFriendRelation() != other.hasFriendRelation()) return false;
    if (hasFriendRelation()) {
      if (!getFriendRelation()
          .equals(other.getFriendRelation())) return false;
    }
    if (hasGroupRelation() != other.hasGroupRelation()) return false;
    if (hasGroupRelation()) {
      if (!getGroupRelation()
          .equals(other.getGroupRelation())) return false;
    }
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
    hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + logType_;
    hash = (37 * hash) + OPLOG_SEQNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOplogSeqno());
    if (hasFriendRelation()) {
      hash = (37 * hash) + FRIEND_RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getFriendRelation().hashCode();
    }
    if (hasGroupRelation()) {
      hash = (37 * hash) + GROUP_RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getGroupRelation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.type.RelationLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.RelationLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.RelationLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.type.RelationLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.type.RelationLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.type.RelationLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.type.RelationLog parseFrom(
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
  public static Builder newBuilder(bilibili.im.type.RelationLog prototype) {
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
   * </pre>
   *
   * Protobuf type {@code bilibili.im.type.RelationLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.type.RelationLog)
      bilibili.im.type.RelationLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_RelationLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_RelationLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.type.RelationLog.class, bilibili.im.type.RelationLog.Builder.class);
    }

    // Construct using bilibili.im.type.RelationLog.newBuilder()
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
      logType_ = 0;
      oplogSeqno_ = 0L;
      friendRelation_ = null;
      if (friendRelationBuilder_ != null) {
        friendRelationBuilder_.dispose();
        friendRelationBuilder_ = null;
      }
      groupRelation_ = null;
      if (groupRelationBuilder_ != null) {
        groupRelationBuilder_.dispose();
        groupRelationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_RelationLog_descriptor;
    }

    @java.lang.Override
    public bilibili.im.type.RelationLog getDefaultInstanceForType() {
      return bilibili.im.type.RelationLog.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.type.RelationLog build() {
      bilibili.im.type.RelationLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.type.RelationLog buildPartial() {
      bilibili.im.type.RelationLog result = new bilibili.im.type.RelationLog(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.type.RelationLog result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logType_ = logType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oplogSeqno_ = oplogSeqno_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.friendRelation_ = friendRelationBuilder_ == null
            ? friendRelation_
            : friendRelationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.groupRelation_ = groupRelationBuilder_ == null
            ? groupRelation_
            : groupRelationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.type.RelationLog) {
        return mergeFrom((bilibili.im.type.RelationLog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.type.RelationLog other) {
      if (other == bilibili.im.type.RelationLog.getDefaultInstance()) return this;
      if (other.logType_ != 0) {
        setLogTypeValue(other.getLogTypeValue());
      }
      if (other.getOplogSeqno() != 0L) {
        setOplogSeqno(other.getOplogSeqno());
      }
      if (other.hasFriendRelation()) {
        mergeFriendRelation(other.getFriendRelation());
      }
      if (other.hasGroupRelation()) {
        mergeGroupRelation(other.getGroupRelation());
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
            case 8: {
              logType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              oplogSeqno_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getFriendRelationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getGroupRelationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int logType_ = 0;
    /**
     * <pre>
     * 操作类型
     * </pre>
     *
     * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
     * @return The enum numeric value on the wire for logType.
     */
    @java.lang.Override public int getLogTypeValue() {
      return logType_;
    }
    /**
     * <pre>
     * 操作类型
     * </pre>
     *
     * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
     * @param value The enum numeric value on the wire for logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogTypeValue(int value) {
      logType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 操作类型
     * </pre>
     *
     * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
     * @return The logType.
     */
    @java.lang.Override
    public bilibili.im.type.RelationLogType getLogType() {
      bilibili.im.type.RelationLogType result = bilibili.im.type.RelationLogType.forNumber(logType_);
      return result == null ? bilibili.im.type.RelationLogType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 操作类型
     * </pre>
     *
     * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
     * @param value The logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogType(bilibili.im.type.RelationLogType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      logType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 操作类型
     * </pre>
     *
     * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      logType_ = 0;
      onChanged();
      return this;
    }

    private long oplogSeqno_ ;
    /**
     * <pre>
     * 操作seqno
     * </pre>
     *
     * <code>uint64 oplog_seqno = 2;</code>
     * @return The oplogSeqno.
     */
    @java.lang.Override
    public long getOplogSeqno() {
      return oplogSeqno_;
    }
    /**
     * <pre>
     * 操作seqno
     * </pre>
     *
     * <code>uint64 oplog_seqno = 2;</code>
     * @param value The oplogSeqno to set.
     * @return This builder for chaining.
     */
    public Builder setOplogSeqno(long value) {

      oplogSeqno_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 操作seqno
     * </pre>
     *
     * <code>uint64 oplog_seqno = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOplogSeqno() {
      bitField0_ = (bitField0_ & ~0x00000002);
      oplogSeqno_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.im.type.FriendRelation friendRelation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.FriendRelation, bilibili.im.type.FriendRelation.Builder, bilibili.im.type.FriendRelationOrBuilder> friendRelationBuilder_;
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     * @return Whether the friendRelation field is set.
     */
    public boolean hasFriendRelation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     * @return The friendRelation.
     */
    public bilibili.im.type.FriendRelation getFriendRelation() {
      if (friendRelationBuilder_ == null) {
        return friendRelation_ == null ? bilibili.im.type.FriendRelation.getDefaultInstance() : friendRelation_;
      } else {
        return friendRelationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public Builder setFriendRelation(bilibili.im.type.FriendRelation value) {
      if (friendRelationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        friendRelation_ = value;
      } else {
        friendRelationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public Builder setFriendRelation(
        bilibili.im.type.FriendRelation.Builder builderForValue) {
      if (friendRelationBuilder_ == null) {
        friendRelation_ = builderForValue.build();
      } else {
        friendRelationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public Builder mergeFriendRelation(bilibili.im.type.FriendRelation value) {
      if (friendRelationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          friendRelation_ != null &&
          friendRelation_ != bilibili.im.type.FriendRelation.getDefaultInstance()) {
          getFriendRelationBuilder().mergeFrom(value);
        } else {
          friendRelation_ = value;
        }
      } else {
        friendRelationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public Builder clearFriendRelation() {
      bitField0_ = (bitField0_ & ~0x00000004);
      friendRelation_ = null;
      if (friendRelationBuilder_ != null) {
        friendRelationBuilder_.dispose();
        friendRelationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public bilibili.im.type.FriendRelation.Builder getFriendRelationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFriendRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    public bilibili.im.type.FriendRelationOrBuilder getFriendRelationOrBuilder() {
      if (friendRelationBuilder_ != null) {
        return friendRelationBuilder_.getMessageOrBuilder();
      } else {
        return friendRelation_ == null ?
            bilibili.im.type.FriendRelation.getDefaultInstance() : friendRelation_;
      }
    }
    /**
     * <pre>
     * 好友信息
     * </pre>
     *
     * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.FriendRelation, bilibili.im.type.FriendRelation.Builder, bilibili.im.type.FriendRelationOrBuilder> 
        getFriendRelationFieldBuilder() {
      if (friendRelationBuilder_ == null) {
        friendRelationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.im.type.FriendRelation, bilibili.im.type.FriendRelation.Builder, bilibili.im.type.FriendRelationOrBuilder>(
                getFriendRelation(),
                getParentForChildren(),
                isClean());
        friendRelation_ = null;
      }
      return friendRelationBuilder_;
    }

    private bilibili.im.type.GroupRelation groupRelation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.GroupRelation, bilibili.im.type.GroupRelation.Builder, bilibili.im.type.GroupRelationOrBuilder> groupRelationBuilder_;
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     * @return Whether the groupRelation field is set.
     */
    public boolean hasGroupRelation() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     * @return The groupRelation.
     */
    public bilibili.im.type.GroupRelation getGroupRelation() {
      if (groupRelationBuilder_ == null) {
        return groupRelation_ == null ? bilibili.im.type.GroupRelation.getDefaultInstance() : groupRelation_;
      } else {
        return groupRelationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public Builder setGroupRelation(bilibili.im.type.GroupRelation value) {
      if (groupRelationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupRelation_ = value;
      } else {
        groupRelationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public Builder setGroupRelation(
        bilibili.im.type.GroupRelation.Builder builderForValue) {
      if (groupRelationBuilder_ == null) {
        groupRelation_ = builderForValue.build();
      } else {
        groupRelationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public Builder mergeGroupRelation(bilibili.im.type.GroupRelation value) {
      if (groupRelationBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          groupRelation_ != null &&
          groupRelation_ != bilibili.im.type.GroupRelation.getDefaultInstance()) {
          getGroupRelationBuilder().mergeFrom(value);
        } else {
          groupRelation_ = value;
        }
      } else {
        groupRelationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public Builder clearGroupRelation() {
      bitField0_ = (bitField0_ & ~0x00000008);
      groupRelation_ = null;
      if (groupRelationBuilder_ != null) {
        groupRelationBuilder_.dispose();
        groupRelationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public bilibili.im.type.GroupRelation.Builder getGroupRelationBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getGroupRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    public bilibili.im.type.GroupRelationOrBuilder getGroupRelationOrBuilder() {
      if (groupRelationBuilder_ != null) {
        return groupRelationBuilder_.getMessageOrBuilder();
      } else {
        return groupRelation_ == null ?
            bilibili.im.type.GroupRelation.getDefaultInstance() : groupRelation_;
      }
    }
    /**
     * <pre>
     * 群信息
     * </pre>
     *
     * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.GroupRelation, bilibili.im.type.GroupRelation.Builder, bilibili.im.type.GroupRelationOrBuilder> 
        getGroupRelationFieldBuilder() {
      if (groupRelationBuilder_ == null) {
        groupRelationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.im.type.GroupRelation, bilibili.im.type.GroupRelation.Builder, bilibili.im.type.GroupRelationOrBuilder>(
                getGroupRelation(),
                getParentForChildren(),
                isClean());
        groupRelation_ = null;
      }
      return groupRelationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.type.RelationLog)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.type.RelationLog)
  private static final bilibili.im.type.RelationLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.type.RelationLog();
  }

  public static bilibili.im.type.RelationLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationLog>
      PARSER = new com.google.protobuf.AbstractParser<RelationLog>() {
    @java.lang.Override
    public RelationLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.type.RelationLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

