// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 投票操作-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.DynVoteReq}
 */
public final class DynVoteReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.DynVoteReq)
    DynVoteReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynVoteReq.newBuilder() to construct.
  private DynVoteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynVoteReq() {
    votes_ = emptyLongList();
    status_ = 0;
    dynamicId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynVoteReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynVoteReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynVoteReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.DynVoteReq.class, bilibili.dynamic.gateway.DynVoteReq.Builder.class);
  }

  public static final int VOTE_ID_FIELD_NUMBER = 1;
  private long voteId_ = 0L;
  /**
   * <pre>
   * 投票ID
   * </pre>
   *
   * <code>int64 vote_id = 1;</code>
   * @return The voteId.
   */
  @java.lang.Override
  public long getVoteId() {
    return voteId_;
  }

  public static final int VOTES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList votes_;
  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @return A list containing the votes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getVotesList() {
    return votes_;
  }
  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @return The count of votes.
   */
  public int getVotesCount() {
    return votes_.size();
  }
  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @param index The index of the element to return.
   * @return The votes at the given index.
   */
  public long getVotes(int index) {
    return votes_.getLong(index);
  }
  private int votesMemoizedSerializedSize = -1;

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_ = 0;
  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public bilibili.dynamic.gateway.VoteStatus getStatus() {
    bilibili.dynamic.gateway.VoteStatus result = bilibili.dynamic.gateway.VoteStatus.forNumber(status_);
    return result == null ? bilibili.dynamic.gateway.VoteStatus.UNRECOGNIZED : result;
  }

  public static final int DYNAMIC_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dynamicId_ = "";
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 4;</code>
   * @return The dynamicId.
   */
  @java.lang.Override
  public java.lang.String getDynamicId() {
    java.lang.Object ref = dynamicId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynamicId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 4;</code>
   * @return The bytes for dynamicId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynamicIdBytes() {
    java.lang.Object ref = dynamicId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynamicId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARE_FIELD_NUMBER = 5;
  private boolean share_ = false;
  /**
   * <pre>
   * 是否分享
   * </pre>
   *
   * <code>bool share = 5;</code>
   * @return The share.
   */
  @java.lang.Override
  public boolean getShare() {
    return share_;
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
    getSerializedSize();
    if (voteId_ != 0L) {
      output.writeInt64(1, voteId_);
    }
    if (getVotesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(votesMemoizedSerializedSize);
    }
    for (int i = 0; i < votes_.size(); i++) {
      output.writeInt64NoTag(votes_.getLong(i));
    }
    if (status_ != bilibili.dynamic.gateway.VoteStatus.normal.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dynamicId_);
    }
    if (share_ != false) {
      output.writeBool(5, share_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (voteId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, voteId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < votes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(votes_.getLong(i));
      }
      size += dataSize;
      if (!getVotesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      votesMemoizedSerializedSize = dataSize;
    }
    if (status_ != bilibili.dynamic.gateway.VoteStatus.normal.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dynamicId_);
    }
    if (share_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, share_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.DynVoteReq)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.DynVoteReq other = (bilibili.dynamic.gateway.DynVoteReq) obj;

    if (getVoteId()
        != other.getVoteId()) return false;
    if (!getVotesList()
        .equals(other.getVotesList())) return false;
    if (status_ != other.status_) return false;
    if (!getDynamicId()
        .equals(other.getDynamicId())) return false;
    if (getShare()
        != other.getShare()) return false;
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
    hash = (37 * hash) + VOTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVoteId());
    if (getVotesCount() > 0) {
      hash = (37 * hash) + VOTES_FIELD_NUMBER;
      hash = (53 * hash) + getVotesList().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + DYNAMIC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicId().hashCode();
    hash = (37 * hash) + SHARE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShare());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynVoteReq parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.DynVoteReq prototype) {
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
   * 投票操作-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.DynVoteReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.DynVoteReq)
      bilibili.dynamic.gateway.DynVoteReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynVoteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynVoteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.DynVoteReq.class, bilibili.dynamic.gateway.DynVoteReq.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.DynVoteReq.newBuilder()
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
      voteId_ = 0L;
      votes_ = emptyLongList();
      status_ = 0;
      dynamicId_ = "";
      share_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynVoteReq_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynVoteReq getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.DynVoteReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynVoteReq build() {
      bilibili.dynamic.gateway.DynVoteReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynVoteReq buildPartial() {
      bilibili.dynamic.gateway.DynVoteReq result = new bilibili.dynamic.gateway.DynVoteReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.dynamic.gateway.DynVoteReq result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        votes_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.votes_ = votes_;
    }

    private void buildPartial0(bilibili.dynamic.gateway.DynVoteReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.voteId_ = voteId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dynamicId_ = dynamicId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.share_ = share_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.DynVoteReq) {
        return mergeFrom((bilibili.dynamic.gateway.DynVoteReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.DynVoteReq other) {
      if (other == bilibili.dynamic.gateway.DynVoteReq.getDefaultInstance()) return this;
      if (other.getVoteId() != 0L) {
        setVoteId(other.getVoteId());
      }
      if (!other.votes_.isEmpty()) {
        if (votes_.isEmpty()) {
          votes_ = other.votes_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureVotesIsMutable();
          votes_.addAll(other.votes_);
        }
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getDynamicId().isEmpty()) {
        dynamicId_ = other.dynamicId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getShare() != false) {
        setShare(other.getShare());
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
              voteId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              long v = input.readInt64();
              ensureVotesIsMutable();
              votes_.addLong(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureVotesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                votes_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 18
            case 24: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              dynamicId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              share_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long voteId_ ;
    /**
     * <pre>
     * 投票ID
     * </pre>
     *
     * <code>int64 vote_id = 1;</code>
     * @return The voteId.
     */
    @java.lang.Override
    public long getVoteId() {
      return voteId_;
    }
    /**
     * <pre>
     * 投票ID
     * </pre>
     *
     * <code>int64 vote_id = 1;</code>
     * @param value The voteId to set.
     * @return This builder for chaining.
     */
    public Builder setVoteId(long value) {

      voteId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 投票ID
     * </pre>
     *
     * <code>int64 vote_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVoteId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      voteId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList votes_ = emptyLongList();
    private void ensureVotesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        votes_ = mutableCopy(votes_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @return A list containing the votes.
     */
    public java.util.List<java.lang.Long>
        getVotesList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(votes_) : votes_;
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @return The count of votes.
     */
    public int getVotesCount() {
      return votes_.size();
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @param index The index of the element to return.
     * @return The votes at the given index.
     */
    public long getVotes(int index) {
      return votes_.getLong(index);
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @param index The index to set the value at.
     * @param value The votes to set.
     * @return This builder for chaining.
     */
    public Builder setVotes(
        int index, long value) {

      ensureVotesIsMutable();
      votes_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @param value The votes to add.
     * @return This builder for chaining.
     */
    public Builder addVotes(long value) {

      ensureVotesIsMutable();
      votes_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @param values The votes to add.
     * @return This builder for chaining.
     */
    public Builder addAllVotes(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureVotesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, votes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选项索引数组
     * </pre>
     *
     * <code>repeated int64 votes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVotes() {
      votes_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.VoteStatus getStatus() {
      bilibili.dynamic.gateway.VoteStatus result = bilibili.dynamic.gateway.VoteStatus.forNumber(status_);
      return result == null ? bilibili.dynamic.gateway.VoteStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(bilibili.dynamic.gateway.VoteStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dynamicId_ = "";
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 4;</code>
     * @return The dynamicId.
     */
    public java.lang.String getDynamicId() {
      java.lang.Object ref = dynamicId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynamicId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 4;</code>
     * @return The bytes for dynamicId.
     */
    public com.google.protobuf.ByteString
        getDynamicIdBytes() {
      java.lang.Object ref = dynamicId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynamicId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 4;</code>
     * @param value The dynamicId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dynamicId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynamicId() {
      dynamicId_ = getDefaultInstance().getDynamicId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 4;</code>
     * @param value The bytes for dynamicId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dynamicId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean share_ ;
    /**
     * <pre>
     * 是否分享
     * </pre>
     *
     * <code>bool share = 5;</code>
     * @return The share.
     */
    @java.lang.Override
    public boolean getShare() {
      return share_;
    }
    /**
     * <pre>
     * 是否分享
     * </pre>
     *
     * <code>bool share = 5;</code>
     * @param value The share to set.
     * @return This builder for chaining.
     */
    public Builder setShare(boolean value) {

      share_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否分享
     * </pre>
     *
     * <code>bool share = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearShare() {
      bitField0_ = (bitField0_ & ~0x00000010);
      share_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.DynVoteReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.DynVoteReq)
  private static final bilibili.dynamic.gateway.DynVoteReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.DynVoteReq();
  }

  public static bilibili.dynamic.gateway.DynVoteReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynVoteReq>
      PARSER = new com.google.protobuf.AbstractParser<DynVoteReq>() {
    @java.lang.Override
    public DynVoteReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynVoteReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynVoteReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.DynVoteReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

