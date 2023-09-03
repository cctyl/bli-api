// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/gaia/gw/gw_api.proto

package bilibili.gaia.gw;

/**
 * <pre>
 * 应用列表上报-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.gaia.gw.GaiaEncryptMsgReq}
 */
public final class GaiaEncryptMsgReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.gaia.gw.GaiaEncryptMsgReq)
    GaiaEncryptMsgReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GaiaEncryptMsgReq.newBuilder() to construct.
  private GaiaEncryptMsgReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GaiaEncryptMsgReq() {
    encryptPayload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GaiaEncryptMsgReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_GaiaEncryptMsgReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_GaiaEncryptMsgReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.gaia.gw.GaiaEncryptMsgReq.class, bilibili.gaia.gw.GaiaEncryptMsgReq.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private bilibili.gaia.gw.GaiaMsgHeader header_;
  /**
   * <pre>
   * 上报头部
   * </pre>
   *
   * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * 上报头部
   * </pre>
   *
   * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public bilibili.gaia.gw.GaiaMsgHeader getHeader() {
    return header_ == null ? bilibili.gaia.gw.GaiaMsgHeader.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * 上报头部
   * </pre>
   *
   * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
   */
  @java.lang.Override
  public bilibili.gaia.gw.GaiaMsgHeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? bilibili.gaia.gw.GaiaMsgHeader.getDefaultInstance() : header_;
  }

  public static final int ENCRYPT_PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString encryptPayload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 加密数据
   * </pre>
   *
   * <code>bytes encrypt_payload = 2;</code>
   * @return The encryptPayload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncryptPayload() {
    return encryptPayload_;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (!encryptPayload_.isEmpty()) {
      output.writeBytes(2, encryptPayload_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (!encryptPayload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, encryptPayload_);
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
    if (!(obj instanceof bilibili.gaia.gw.GaiaEncryptMsgReq)) {
      return super.equals(obj);
    }
    bilibili.gaia.gw.GaiaEncryptMsgReq other = (bilibili.gaia.gw.GaiaEncryptMsgReq) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getEncryptPayload()
        .equals(other.getEncryptPayload())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + ENCRYPT_PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptPayload().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.GaiaEncryptMsgReq parseFrom(
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
  public static Builder newBuilder(bilibili.gaia.gw.GaiaEncryptMsgReq prototype) {
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
   * 应用列表上报-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.gaia.gw.GaiaEncryptMsgReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.gaia.gw.GaiaEncryptMsgReq)
      bilibili.gaia.gw.GaiaEncryptMsgReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_GaiaEncryptMsgReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_GaiaEncryptMsgReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.gaia.gw.GaiaEncryptMsgReq.class, bilibili.gaia.gw.GaiaEncryptMsgReq.Builder.class);
    }

    // Construct using bilibili.gaia.gw.GaiaEncryptMsgReq.newBuilder()
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
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      encryptPayload_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_GaiaEncryptMsgReq_descriptor;
    }

    @java.lang.Override
    public bilibili.gaia.gw.GaiaEncryptMsgReq getDefaultInstanceForType() {
      return bilibili.gaia.gw.GaiaEncryptMsgReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.gaia.gw.GaiaEncryptMsgReq build() {
      bilibili.gaia.gw.GaiaEncryptMsgReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.gaia.gw.GaiaEncryptMsgReq buildPartial() {
      bilibili.gaia.gw.GaiaEncryptMsgReq result = new bilibili.gaia.gw.GaiaEncryptMsgReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.gaia.gw.GaiaEncryptMsgReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.encryptPayload_ = encryptPayload_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.gaia.gw.GaiaEncryptMsgReq) {
        return mergeFrom((bilibili.gaia.gw.GaiaEncryptMsgReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.gaia.gw.GaiaEncryptMsgReq other) {
      if (other == bilibili.gaia.gw.GaiaEncryptMsgReq.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getEncryptPayload() != com.google.protobuf.ByteString.EMPTY) {
        setEncryptPayload(other.getEncryptPayload());
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
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              encryptPayload_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private bilibili.gaia.gw.GaiaMsgHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.gaia.gw.GaiaMsgHeader, bilibili.gaia.gw.GaiaMsgHeader.Builder, bilibili.gaia.gw.GaiaMsgHeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     * @return The header.
     */
    public bilibili.gaia.gw.GaiaMsgHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? bilibili.gaia.gw.GaiaMsgHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public Builder setHeader(bilibili.gaia.gw.GaiaMsgHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public Builder setHeader(
        bilibili.gaia.gw.GaiaMsgHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public Builder mergeHeader(bilibili.gaia.gw.GaiaMsgHeader value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          header_ != null &&
          header_ != bilibili.gaia.gw.GaiaMsgHeader.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public bilibili.gaia.gw.GaiaMsgHeader.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    public bilibili.gaia.gw.GaiaMsgHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            bilibili.gaia.gw.GaiaMsgHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * 上报头部
     * </pre>
     *
     * <code>.bilibili.gaia.gw.GaiaMsgHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.gaia.gw.GaiaMsgHeader, bilibili.gaia.gw.GaiaMsgHeader.Builder, bilibili.gaia.gw.GaiaMsgHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.gaia.gw.GaiaMsgHeader, bilibili.gaia.gw.GaiaMsgHeader.Builder, bilibili.gaia.gw.GaiaMsgHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.ByteString encryptPayload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 加密数据
     * </pre>
     *
     * <code>bytes encrypt_payload = 2;</code>
     * @return The encryptPayload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncryptPayload() {
      return encryptPayload_;
    }
    /**
     * <pre>
     * 加密数据
     * </pre>
     *
     * <code>bytes encrypt_payload = 2;</code>
     * @param value The encryptPayload to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptPayload(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      encryptPayload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 加密数据
     * </pre>
     *
     * <code>bytes encrypt_payload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      encryptPayload_ = getDefaultInstance().getEncryptPayload();
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


    // @@protoc_insertion_point(builder_scope:bilibili.gaia.gw.GaiaEncryptMsgReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.gaia.gw.GaiaEncryptMsgReq)
  private static final bilibili.gaia.gw.GaiaEncryptMsgReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.gaia.gw.GaiaEncryptMsgReq();
  }

  public static bilibili.gaia.gw.GaiaEncryptMsgReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GaiaEncryptMsgReq>
      PARSER = new com.google.protobuf.AbstractParser<GaiaEncryptMsgReq>() {
    @java.lang.Override
    public GaiaEncryptMsgReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GaiaEncryptMsgReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GaiaEncryptMsgReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.gaia.gw.GaiaEncryptMsgReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
