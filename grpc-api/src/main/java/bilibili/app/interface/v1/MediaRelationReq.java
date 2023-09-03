// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/media.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.MediaRelationReq}
 */
public final class MediaRelationReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.MediaRelationReq)
    MediaRelationReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaRelationReq.newBuilder() to construct.
  private MediaRelationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaRelationReq() {
    offset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaRelationReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaRelationReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaRelationReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.MediaRelationReq.class, bilibili.app.interface.v1.MediaRelationReq.Builder.class);
  }

  public static final int BIZ_ID_FIELD_NUMBER = 1;
  private long bizId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 biz_id = 1;</code>
   * @return The bizId.
   */
  @java.lang.Override
  public long getBizId() {
    return bizId_;
  }

  public static final int BIZ_TYPE_FIELD_NUMBER = 2;
  private long bizType_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 biz_type = 2;</code>
   * @return The bizType.
   */
  @java.lang.Override
  public long getBizType() {
    return bizType_;
  }

  public static final int FEED_ID_FIELD_NUMBER = 3;
  private long feedId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 feed_id = 3;</code>
   * @return The feedId.
   */
  @java.lang.Override
  public long getFeedId() {
    return feedId_;
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object offset_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string offset = 5;</code>
   * @return The offset.
   */
  @java.lang.Override
  public java.lang.String getOffset() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      offset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string offset = 5;</code>
   * @return The bytes for offset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOffsetBytes() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      offset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PS_FIELD_NUMBER = 6;
  private int ps_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ps = 6;</code>
   * @return The ps.
   */
  @java.lang.Override
  public int getPs() {
    return ps_;
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
    if (bizId_ != 0L) {
      output.writeInt64(1, bizId_);
    }
    if (bizType_ != 0L) {
      output.writeInt64(2, bizType_);
    }
    if (feedId_ != 0L) {
      output.writeInt64(3, feedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, offset_);
    }
    if (ps_ != 0) {
      output.writeInt32(6, ps_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bizId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bizId_);
    }
    if (bizType_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bizType_);
    }
    if (feedId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, feedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, offset_);
    }
    if (ps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, ps_);
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
    if (!(obj instanceof bilibili.app.interface.v1.MediaRelationReq)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.MediaRelationReq other = (bilibili.app.interface.v1.MediaRelationReq) obj;

    if (getBizId()
        != other.getBizId()) return false;
    if (getBizType()
        != other.getBizType()) return false;
    if (getFeedId()
        != other.getFeedId()) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getPs()
        != other.getPs()) return false;
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
    hash = (37 * hash) + BIZ_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBizId());
    hash = (37 * hash) + BIZ_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBizType());
    hash = (37 * hash) + FEED_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFeedId());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + PS_FIELD_NUMBER;
    hash = (53 * hash) + getPs();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaRelationReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.MediaRelationReq prototype) {
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
   * Protobuf type {@code bilibili.app.interface.v1.MediaRelationReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.MediaRelationReq)
      bilibili.app.interface.v1.MediaRelationReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaRelationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaRelationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.MediaRelationReq.class, bilibili.app.interface.v1.MediaRelationReq.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.MediaRelationReq.newBuilder()
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
      bizId_ = 0L;
      bizType_ = 0L;
      feedId_ = 0L;
      offset_ = "";
      ps_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaRelationReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaRelationReq getDefaultInstanceForType() {
      return bilibili.app.interface.v1.MediaRelationReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaRelationReq build() {
      bilibili.app.interface.v1.MediaRelationReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaRelationReq buildPartial() {
      bilibili.app.interface.v1.MediaRelationReq result = new bilibili.app.interface.v1.MediaRelationReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.MediaRelationReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bizId_ = bizId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bizType_ = bizType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.feedId_ = feedId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ps_ = ps_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.MediaRelationReq) {
        return mergeFrom((bilibili.app.interface.v1.MediaRelationReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.MediaRelationReq other) {
      if (other == bilibili.app.interface.v1.MediaRelationReq.getDefaultInstance()) return this;
      if (other.getBizId() != 0L) {
        setBizId(other.getBizId());
      }
      if (other.getBizType() != 0L) {
        setBizType(other.getBizType());
      }
      if (other.getFeedId() != 0L) {
        setFeedId(other.getFeedId());
      }
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getPs() != 0) {
        setPs(other.getPs());
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
              bizId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              bizType_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              feedId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 42: {
              offset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
            case 48: {
              ps_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 48
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

    private long bizId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_id = 1;</code>
     * @return The bizId.
     */
    @java.lang.Override
    public long getBizId() {
      return bizId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_id = 1;</code>
     * @param value The bizId to set.
     * @return This builder for chaining.
     */
    public Builder setBizId(long value) {

      bizId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bizId_ = 0L;
      onChanged();
      return this;
    }

    private long bizType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_type = 2;</code>
     * @return The bizType.
     */
    @java.lang.Override
    public long getBizType() {
      return bizType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_type = 2;</code>
     * @param value The bizType to set.
     * @return This builder for chaining.
     */
    public Builder setBizType(long value) {

      bizType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 biz_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bizType_ = 0L;
      onChanged();
      return this;
    }

    private long feedId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 feed_id = 3;</code>
     * @return The feedId.
     */
    @java.lang.Override
    public long getFeedId() {
      return feedId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 feed_id = 3;</code>
     * @param value The feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedId(long value) {

      feedId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 feed_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      feedId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object offset_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string offset = 5;</code>
     * @return The offset.
     */
    public java.lang.String getOffset() {
      java.lang.Object ref = offset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        offset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string offset = 5;</code>
     * @return The bytes for offset.
     */
    public com.google.protobuf.ByteString
        getOffsetBytes() {
      java.lang.Object ref = offset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        offset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string offset = 5;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      offset_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string offset = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      offset_ = getDefaultInstance().getOffset();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string offset = 5;</code>
     * @param value The bytes for offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      offset_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int ps_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ps = 6;</code>
     * @return The ps.
     */
    @java.lang.Override
    public int getPs() {
      return ps_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ps = 6;</code>
     * @param value The ps to set.
     * @return This builder for chaining.
     */
    public Builder setPs(int value) {

      ps_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ps = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPs() {
      bitField0_ = (bitField0_ & ~0x00000010);
      ps_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.MediaRelationReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.MediaRelationReq)
  private static final bilibili.app.interface.v1.MediaRelationReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.MediaRelationReq();
  }

  public static bilibili.app.interface.v1.MediaRelationReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaRelationReq>
      PARSER = new com.google.protobuf.AbstractParser<MediaRelationReq>() {
    @java.lang.Override
    public MediaRelationReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaRelationReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaRelationReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.MediaRelationReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

