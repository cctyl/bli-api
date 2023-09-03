// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 获取最新的历史记录-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.LatestHistoryReq}
 */
public final class LatestHistoryReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.LatestHistoryReq)
    LatestHistoryReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LatestHistoryReq.newBuilder() to construct.
  private LatestHistoryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LatestHistoryReq() {
    business_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LatestHistoryReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_LatestHistoryReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_LatestHistoryReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.LatestHistoryReq.class, bilibili.app.interface.v1.LatestHistoryReq.Builder.class);
  }

  public static final int BUSINESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object business_ = "";
  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 1;</code>
   * @return The business.
   */
  @java.lang.Override
  public java.lang.String getBusiness() {
    java.lang.Object ref = business_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      business_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 1;</code>
   * @return The bytes for business.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBusinessBytes() {
    java.lang.Object ref = business_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      business_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_PRELOAD_FIELD_NUMBER = 2;
  private bilibili.app.interface.v1.PlayerPreloadParams playerPreload_;
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   * @return Whether the playerPreload field is set.
   */
  @java.lang.Override
  public boolean hasPlayerPreload() {
    return playerPreload_ != null;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   * @return The playerPreload.
   */
  @java.lang.Override
  public bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload() {
    return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder() {
    return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(business_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, business_);
    }
    if (playerPreload_ != null) {
      output.writeMessage(2, getPlayerPreload());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(business_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, business_);
    }
    if (playerPreload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayerPreload());
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
    if (!(obj instanceof bilibili.app.interface.v1.LatestHistoryReq)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.LatestHistoryReq other = (bilibili.app.interface.v1.LatestHistoryReq) obj;

    if (!getBusiness()
        .equals(other.getBusiness())) return false;
    if (hasPlayerPreload() != other.hasPlayerPreload()) return false;
    if (hasPlayerPreload()) {
      if (!getPlayerPreload()
          .equals(other.getPlayerPreload())) return false;
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
    hash = (37 * hash) + BUSINESS_FIELD_NUMBER;
    hash = (53 * hash) + getBusiness().hashCode();
    if (hasPlayerPreload()) {
      hash = (37 * hash) + PLAYER_PRELOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerPreload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.LatestHistoryReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.LatestHistoryReq prototype) {
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
   * 获取最新的历史记录-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.LatestHistoryReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.LatestHistoryReq)
      bilibili.app.interface.v1.LatestHistoryReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_LatestHistoryReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_LatestHistoryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.LatestHistoryReq.class, bilibili.app.interface.v1.LatestHistoryReq.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.LatestHistoryReq.newBuilder()
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
      business_ = "";
      playerPreload_ = null;
      if (playerPreloadBuilder_ != null) {
        playerPreloadBuilder_.dispose();
        playerPreloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_LatestHistoryReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.LatestHistoryReq getDefaultInstanceForType() {
      return bilibili.app.interface.v1.LatestHistoryReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.LatestHistoryReq build() {
      bilibili.app.interface.v1.LatestHistoryReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.LatestHistoryReq buildPartial() {
      bilibili.app.interface.v1.LatestHistoryReq result = new bilibili.app.interface.v1.LatestHistoryReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.LatestHistoryReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.business_ = business_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playerPreload_ = playerPreloadBuilder_ == null
            ? playerPreload_
            : playerPreloadBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.LatestHistoryReq) {
        return mergeFrom((bilibili.app.interface.v1.LatestHistoryReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.LatestHistoryReq other) {
      if (other == bilibili.app.interface.v1.LatestHistoryReq.getDefaultInstance()) return this;
      if (!other.getBusiness().isEmpty()) {
        business_ = other.business_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPlayerPreload()) {
        mergePlayerPreload(other.getPlayerPreload());
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
              business_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPlayerPreloadFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object business_ = "";
    /**
     * <pre>
     * 业务类型
     * archive:视频 live:直播 article:专栏 goods:商品 show:展演
     * </pre>
     *
     * <code>string business = 1;</code>
     * @return The business.
     */
    public java.lang.String getBusiness() {
      java.lang.Object ref = business_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        business_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 业务类型
     * archive:视频 live:直播 article:专栏 goods:商品 show:展演
     * </pre>
     *
     * <code>string business = 1;</code>
     * @return The bytes for business.
     */
    public com.google.protobuf.ByteString
        getBusinessBytes() {
      java.lang.Object ref = business_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        business_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 业务类型
     * archive:视频 live:直播 article:专栏 goods:商品 show:展演
     * </pre>
     *
     * <code>string business = 1;</code>
     * @param value The business to set.
     * @return This builder for chaining.
     */
    public Builder setBusiness(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      business_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型
     * archive:视频 live:直播 article:专栏 goods:商品 show:展演
     * </pre>
     *
     * <code>string business = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBusiness() {
      business_ = getDefaultInstance().getBusiness();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型
     * archive:视频 live:直播 article:专栏 goods:商品 show:展演
     * </pre>
     *
     * <code>string business = 1;</code>
     * @param value The bytes for business to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      business_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private bilibili.app.interface.v1.PlayerPreloadParams playerPreload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder> playerPreloadBuilder_;
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     * @return Whether the playerPreload field is set.
     */
    public boolean hasPlayerPreload() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     * @return The playerPreload.
     */
    public bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload() {
      if (playerPreloadBuilder_ == null) {
        return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
      } else {
        return playerPreloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public Builder setPlayerPreload(bilibili.app.interface.v1.PlayerPreloadParams value) {
      if (playerPreloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerPreload_ = value;
      } else {
        playerPreloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public Builder setPlayerPreload(
        bilibili.app.interface.v1.PlayerPreloadParams.Builder builderForValue) {
      if (playerPreloadBuilder_ == null) {
        playerPreload_ = builderForValue.build();
      } else {
        playerPreloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public Builder mergePlayerPreload(bilibili.app.interface.v1.PlayerPreloadParams value) {
      if (playerPreloadBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          playerPreload_ != null &&
          playerPreload_ != bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance()) {
          getPlayerPreloadBuilder().mergeFrom(value);
        } else {
          playerPreload_ = value;
        }
      } else {
        playerPreloadBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public Builder clearPlayerPreload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      playerPreload_ = null;
      if (playerPreloadBuilder_ != null) {
        playerPreloadBuilder_.dispose();
        playerPreloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public bilibili.app.interface.v1.PlayerPreloadParams.Builder getPlayerPreloadBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPlayerPreloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    public bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder() {
      if (playerPreloadBuilder_ != null) {
        return playerPreloadBuilder_.getMessageOrBuilder();
      } else {
        return playerPreload_ == null ?
            bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
      }
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder> 
        getPlayerPreloadFieldBuilder() {
      if (playerPreloadBuilder_ == null) {
        playerPreloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder>(
                getPlayerPreload(),
                getParentForChildren(),
                isClean());
        playerPreload_ = null;
      }
      return playerPreloadBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.LatestHistoryReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.LatestHistoryReq)
  private static final bilibili.app.interface.v1.LatestHistoryReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.LatestHistoryReq();
  }

  public static bilibili.app.interface.v1.LatestHistoryReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatestHistoryReq>
      PARSER = new com.google.protobuf.AbstractParser<LatestHistoryReq>() {
    @java.lang.Override
    public LatestHistoryReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatestHistoryReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatestHistoryReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.LatestHistoryReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
