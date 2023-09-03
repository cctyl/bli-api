// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 拉取会话详情-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqSessionDetail}
 */
public final class ReqSessionDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqSessionDetail)
    ReqSessionDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqSessionDetail.newBuilder() to construct.
  private ReqSessionDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqSessionDetail() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqSessionDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqSessionDetail.class, bilibili.im.interface.v1.ReqSessionDetail.Builder.class);
  }

  public static final int TALKER_ID_FIELD_NUMBER = 1;
  private long talkerId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 talker_id = 1;</code>
   * @return The talkerId.
   */
  @java.lang.Override
  public long getTalkerId() {
    return talkerId_;
  }

  public static final int SESSION_TYPE_FIELD_NUMBER = 2;
  private int sessionType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 session_type = 2;</code>
   * @return The sessionType.
   */
  @java.lang.Override
  public int getSessionType() {
    return sessionType_;
  }

  public static final int UID_FIELD_NUMBER = 3;
  private long uid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 uid = 3;</code>
   * @return The uid.
   */
  @java.lang.Override
  public long getUid() {
    return uid_;
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
    if (talkerId_ != 0L) {
      output.writeUInt64(1, talkerId_);
    }
    if (sessionType_ != 0) {
      output.writeUInt32(2, sessionType_);
    }
    if (uid_ != 0L) {
      output.writeUInt64(3, uid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (talkerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, talkerId_);
    }
    if (sessionType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, sessionType_);
    }
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, uid_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqSessionDetail)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqSessionDetail other = (bilibili.im.interface.v1.ReqSessionDetail) obj;

    if (getTalkerId()
        != other.getTalkerId()) return false;
    if (getSessionType()
        != other.getSessionType()) return false;
    if (getUid()
        != other.getUid()) return false;
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
    hash = (37 * hash) + TALKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTalkerId());
    hash = (37 * hash) + SESSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionType();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionDetail parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqSessionDetail prototype) {
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
   * 拉取会话详情-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqSessionDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqSessionDetail)
      bilibili.im.interface.v1.ReqSessionDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqSessionDetail.class, bilibili.im.interface.v1.ReqSessionDetail.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqSessionDetail.newBuilder()
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
      talkerId_ = 0L;
      sessionType_ = 0;
      uid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionDetail_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionDetail getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqSessionDetail.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionDetail build() {
      bilibili.im.interface.v1.ReqSessionDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionDetail buildPartial() {
      bilibili.im.interface.v1.ReqSessionDetail result = new bilibili.im.interface.v1.ReqSessionDetail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqSessionDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.talkerId_ = talkerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionType_ = sessionType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uid_ = uid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqSessionDetail) {
        return mergeFrom((bilibili.im.interface.v1.ReqSessionDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqSessionDetail other) {
      if (other == bilibili.im.interface.v1.ReqSessionDetail.getDefaultInstance()) return this;
      if (other.getTalkerId() != 0L) {
        setTalkerId(other.getTalkerId());
      }
      if (other.getSessionType() != 0) {
        setSessionType(other.getSessionType());
      }
      if (other.getUid() != 0L) {
        setUid(other.getUid());
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
              talkerId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sessionType_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              uid_ = input.readUInt64();
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

    private long talkerId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return The talkerId.
     */
    @java.lang.Override
    public long getTalkerId() {
      return talkerId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @param value The talkerId to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerId(long value) {

      talkerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTalkerId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      talkerId_ = 0L;
      onChanged();
      return this;
    }

    private int sessionType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 2;</code>
     * @return The sessionType.
     */
    @java.lang.Override
    public int getSessionType() {
      return sessionType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 2;</code>
     * @param value The sessionType to set.
     * @return This builder for chaining.
     */
    public Builder setSessionType(int value) {

      sessionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionType_ = 0;
      onChanged();
      return this;
    }

    private long uid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public long getUid() {
      return uid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 uid = 3;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(long value) {

      uid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 uid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      uid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqSessionDetail)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqSessionDetail)
  private static final bilibili.im.interface.v1.ReqSessionDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqSessionDetail();
  }

  public static bilibili.im.interface.v1.ReqSessionDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqSessionDetail>
      PARSER = new com.google.protobuf.AbstractParser<ReqSessionDetail>() {
    @java.lang.Override
    public ReqSessionDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqSessionDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqSessionDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqSessionDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

