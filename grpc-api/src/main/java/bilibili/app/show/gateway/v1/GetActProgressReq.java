// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/gateway/v1/service.proto

package bilibili.app.show.gateway.v1;

/**
 * <pre>
 * 获取Native页进度数据-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.show.gateway.v1.GetActProgressReq}
 */
public final class GetActProgressReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.show.gateway.v1.GetActProgressReq)
    GetActProgressReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActProgressReq.newBuilder() to construct.
  private GetActProgressReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActProgressReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetActProgressReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.show.gateway.v1.Service.internal_static_bilibili_app_show_gateway_v1_GetActProgressReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.show.gateway.v1.Service.internal_static_bilibili_app_show_gateway_v1_GetActProgressReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.show.gateway.v1.GetActProgressReq.class, bilibili.app.show.gateway.v1.GetActProgressReq.Builder.class);
  }

  public static final int PAGEID_FIELD_NUMBER = 1;
  private long pageID_ = 0L;
  /**
   * <pre>
   * Native页id
   * </pre>
   *
   * <code>int64 pageID = 1;</code>
   * @return The pageID.
   */
  @java.lang.Override
  public long getPageID() {
    return pageID_;
  }

  public static final int MID_FIELD_NUMBER = 2;
  private long mid_ = 0L;
  /**
   * <pre>
   * 用户mid
   * </pre>
   *
   * <code>int64 mid = 2;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
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
    if (pageID_ != 0L) {
      output.writeInt64(1, pageID_);
    }
    if (mid_ != 0L) {
      output.writeInt64(2, mid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageID_);
    }
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mid_);
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
    if (!(obj instanceof bilibili.app.show.gateway.v1.GetActProgressReq)) {
      return super.equals(obj);
    }
    bilibili.app.show.gateway.v1.GetActProgressReq other = (bilibili.app.show.gateway.v1.GetActProgressReq) obj;

    if (getPageID()
        != other.getPageID()) return false;
    if (getMid()
        != other.getMid()) return false;
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
    hash = (37 * hash) + PAGEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageID());
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.gateway.v1.GetActProgressReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.show.gateway.v1.GetActProgressReq prototype) {
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
   * 获取Native页进度数据-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.show.gateway.v1.GetActProgressReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.show.gateway.v1.GetActProgressReq)
      bilibili.app.show.gateway.v1.GetActProgressReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.show.gateway.v1.Service.internal_static_bilibili_app_show_gateway_v1_GetActProgressReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.show.gateway.v1.Service.internal_static_bilibili_app_show_gateway_v1_GetActProgressReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.show.gateway.v1.GetActProgressReq.class, bilibili.app.show.gateway.v1.GetActProgressReq.Builder.class);
    }

    // Construct using bilibili.app.show.gateway.v1.GetActProgressReq.newBuilder()
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
      pageID_ = 0L;
      mid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.show.gateway.v1.Service.internal_static_bilibili_app_show_gateway_v1_GetActProgressReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.show.gateway.v1.GetActProgressReq getDefaultInstanceForType() {
      return bilibili.app.show.gateway.v1.GetActProgressReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.show.gateway.v1.GetActProgressReq build() {
      bilibili.app.show.gateway.v1.GetActProgressReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.show.gateway.v1.GetActProgressReq buildPartial() {
      bilibili.app.show.gateway.v1.GetActProgressReq result = new bilibili.app.show.gateway.v1.GetActProgressReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.show.gateway.v1.GetActProgressReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageID_ = pageID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mid_ = mid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.show.gateway.v1.GetActProgressReq) {
        return mergeFrom((bilibili.app.show.gateway.v1.GetActProgressReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.show.gateway.v1.GetActProgressReq other) {
      if (other == bilibili.app.show.gateway.v1.GetActProgressReq.getDefaultInstance()) return this;
      if (other.getPageID() != 0L) {
        setPageID(other.getPageID());
      }
      if (other.getMid() != 0L) {
        setMid(other.getMid());
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
              pageID_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              mid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long pageID_ ;
    /**
     * <pre>
     * Native页id
     * </pre>
     *
     * <code>int64 pageID = 1;</code>
     * @return The pageID.
     */
    @java.lang.Override
    public long getPageID() {
      return pageID_;
    }
    /**
     * <pre>
     * Native页id
     * </pre>
     *
     * <code>int64 pageID = 1;</code>
     * @param value The pageID to set.
     * @return This builder for chaining.
     */
    public Builder setPageID(long value) {

      pageID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Native页id
     * </pre>
     *
     * <code>int64 pageID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageID_ = 0L;
      onChanged();
      return this;
    }

    private long mid_ ;
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @return The mid.
     */
    @java.lang.Override
    public long getMid() {
      return mid_;
    }
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.show.gateway.v1.GetActProgressReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.show.gateway.v1.GetActProgressReq)
  private static final bilibili.app.show.gateway.v1.GetActProgressReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.show.gateway.v1.GetActProgressReq();
  }

  public static bilibili.app.show.gateway.v1.GetActProgressReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActProgressReq>
      PARSER = new com.google.protobuf.AbstractParser<GetActProgressReq>() {
    @java.lang.Override
    public GetActProgressReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetActProgressReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActProgressReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.show.gateway.v1.GetActProgressReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

