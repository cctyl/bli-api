// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.ResourceReq}
 */
public final class ResourceReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.ResourceReq)
    ResourceReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceReq.newBuilder() to construct.
  private ResourceReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceReq() {
    rawParams_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_ResourceReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_ResourceReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.ResourceReq.class, bilibili.app.nativeact.v1.ResourceReq.Builder.class);
  }

  public static final int RAW_PARAMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rawParams_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string raw_params = 1;</code>
   * @return The rawParams.
   */
  @java.lang.Override
  public java.lang.String getRawParams() {
    java.lang.Object ref = rawParams_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawParams_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string raw_params = 1;</code>
   * @return The bytes for rawParams.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawParamsBytes() {
    java.lang.Object ref = rawParams_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawParams_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private bilibili.app.nativeact.v1.ResourceParams params_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   * @return The params.
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.ResourceParams getParams() {
    return params_ == null ? bilibili.app.nativeact.v1.ResourceParams.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.ResourceParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? bilibili.app.nativeact.v1.ResourceParams.getDefaultInstance() : params_;
  }

  public static final int PRIMARY_PAGE_ID_FIELD_NUMBER = 3;
  private long primaryPageId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 primary_page_id = 3;</code>
   * @return The primaryPageId.
   */
  @java.lang.Override
  public long getPrimaryPageId() {
    return primaryPageId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawParams_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rawParams_);
    }
    if (params_ != null) {
      output.writeMessage(2, getParams());
    }
    if (primaryPageId_ != 0L) {
      output.writeInt64(3, primaryPageId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawParams_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rawParams_);
    }
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParams());
    }
    if (primaryPageId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, primaryPageId_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.ResourceReq)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.ResourceReq other = (bilibili.app.nativeact.v1.ResourceReq) obj;

    if (!getRawParams()
        .equals(other.getRawParams())) return false;
    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (getPrimaryPageId()
        != other.getPrimaryPageId()) return false;
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
    hash = (37 * hash) + RAW_PARAMS_FIELD_NUMBER;
    hash = (53 * hash) + getRawParams().hashCode();
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (37 * hash) + PRIMARY_PAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrimaryPageId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.ResourceReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.ResourceReq prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.ResourceReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.ResourceReq)
      bilibili.app.nativeact.v1.ResourceReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_ResourceReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_ResourceReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.ResourceReq.class, bilibili.app.nativeact.v1.ResourceReq.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.ResourceReq.newBuilder()
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
      rawParams_ = "";
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      primaryPageId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_ResourceReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.ResourceReq getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.ResourceReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.ResourceReq build() {
      bilibili.app.nativeact.v1.ResourceReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.ResourceReq buildPartial() {
      bilibili.app.nativeact.v1.ResourceReq result = new bilibili.app.nativeact.v1.ResourceReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.ResourceReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rawParams_ = rawParams_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.primaryPageId_ = primaryPageId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.ResourceReq) {
        return mergeFrom((bilibili.app.nativeact.v1.ResourceReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.ResourceReq other) {
      if (other == bilibili.app.nativeact.v1.ResourceReq.getDefaultInstance()) return this;
      if (!other.getRawParams().isEmpty()) {
        rawParams_ = other.rawParams_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (other.getPrimaryPageId() != 0L) {
        setPrimaryPageId(other.getPrimaryPageId());
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
              rawParams_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              primaryPageId_ = input.readInt64();
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

    private java.lang.Object rawParams_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string raw_params = 1;</code>
     * @return The rawParams.
     */
    public java.lang.String getRawParams() {
      java.lang.Object ref = rawParams_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawParams_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string raw_params = 1;</code>
     * @return The bytes for rawParams.
     */
    public com.google.protobuf.ByteString
        getRawParamsBytes() {
      java.lang.Object ref = rawParams_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawParams_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string raw_params = 1;</code>
     * @param value The rawParams to set.
     * @return This builder for chaining.
     */
    public Builder setRawParams(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rawParams_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string raw_params = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawParams() {
      rawParams_ = getDefaultInstance().getRawParams();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string raw_params = 1;</code>
     * @param value The bytes for rawParams to set.
     * @return This builder for chaining.
     */
    public Builder setRawParamsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rawParams_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private bilibili.app.nativeact.v1.ResourceParams params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.ResourceParams, bilibili.app.nativeact.v1.ResourceParams.Builder, bilibili.app.nativeact.v1.ResourceParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     * @return The params.
     */
    public bilibili.app.nativeact.v1.ResourceParams getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? bilibili.app.nativeact.v1.ResourceParams.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public Builder setParams(bilibili.app.nativeact.v1.ResourceParams value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public Builder setParams(
        bilibili.app.nativeact.v1.ResourceParams.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public Builder mergeParams(bilibili.app.nativeact.v1.ResourceParams value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          params_ != null &&
          params_ != bilibili.app.nativeact.v1.ResourceParams.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public bilibili.app.nativeact.v1.ResourceParams.Builder getParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    public bilibili.app.nativeact.v1.ResourceParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            bilibili.app.nativeact.v1.ResourceParams.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.ResourceParams, bilibili.app.nativeact.v1.ResourceParams.Builder, bilibili.app.nativeact.v1.ResourceParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.nativeact.v1.ResourceParams, bilibili.app.nativeact.v1.ResourceParams.Builder, bilibili.app.nativeact.v1.ResourceParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private long primaryPageId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 primary_page_id = 3;</code>
     * @return The primaryPageId.
     */
    @java.lang.Override
    public long getPrimaryPageId() {
      return primaryPageId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 primary_page_id = 3;</code>
     * @param value The primaryPageId to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryPageId(long value) {

      primaryPageId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 primary_page_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryPageId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      primaryPageId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.ResourceReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.ResourceReq)
  private static final bilibili.app.nativeact.v1.ResourceReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.ResourceReq();
  }

  public static bilibili.app.nativeact.v1.ResourceReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceReq>
      PARSER = new com.google.protobuf.AbstractParser<ResourceReq>() {
    @java.lang.Override
    public ResourceReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.ResourceReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

