// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v1/playurl.proto

package bilibili.pgc.gateway.player.v1;

/**
 * <pre>
 * 其他业务信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v1.BusinessInfo}
 */
public final class BusinessInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v1.BusinessInfo)
    BusinessInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessInfo.newBuilder() to construct.
  private BusinessInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessInfo() {
    marlinToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_BusinessInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_BusinessInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v1.BusinessInfo.class, bilibili.pgc.gateway.player.v1.BusinessInfo.Builder.class);
  }

  public static final int IS_PREVIEW_FIELD_NUMBER = 1;
  private boolean isPreview_ = false;
  /**
   * <pre>
   * 当前视频是否是预览
   * </pre>
   *
   * <code>bool is_preview = 1;</code>
   * @return The isPreview.
   */
  @java.lang.Override
  public boolean getIsPreview() {
    return isPreview_;
  }

  public static final int BP_FIELD_NUMBER = 2;
  private boolean bp_ = false;
  /**
   * <pre>
   * 用户是否承包过
   * </pre>
   *
   * <code>bool bp = 2;</code>
   * @return The bp.
   */
  @java.lang.Override
  public boolean getBp() {
    return bp_;
  }

  public static final int MARLIN_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object marlinToken_ = "";
  /**
   * <pre>
   * drm使用
   * </pre>
   *
   * <code>string marlin_token = 3;</code>
   * @return The marlinToken.
   */
  @java.lang.Override
  public java.lang.String getMarlinToken() {
    java.lang.Object ref = marlinToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marlinToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * drm使用
   * </pre>
   *
   * <code>string marlin_token = 3;</code>
   * @return The bytes for marlinToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMarlinTokenBytes() {
    java.lang.Object ref = marlinToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marlinToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (isPreview_ != false) {
      output.writeBool(1, isPreview_);
    }
    if (bp_ != false) {
      output.writeBool(2, bp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(marlinToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, marlinToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isPreview_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isPreview_);
    }
    if (bp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, bp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(marlinToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, marlinToken_);
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v1.BusinessInfo)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v1.BusinessInfo other = (bilibili.pgc.gateway.player.v1.BusinessInfo) obj;

    if (getIsPreview()
        != other.getIsPreview()) return false;
    if (getBp()
        != other.getBp()) return false;
    if (!getMarlinToken()
        .equals(other.getMarlinToken())) return false;
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
    hash = (37 * hash) + IS_PREVIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPreview());
    hash = (37 * hash) + BP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBp());
    hash = (37 * hash) + MARLIN_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getMarlinToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.BusinessInfo parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v1.BusinessInfo prototype) {
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
   * 其他业务信息
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v1.BusinessInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v1.BusinessInfo)
      bilibili.pgc.gateway.player.v1.BusinessInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_BusinessInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_BusinessInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v1.BusinessInfo.class, bilibili.pgc.gateway.player.v1.BusinessInfo.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v1.BusinessInfo.newBuilder()
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
      isPreview_ = false;
      bp_ = false;
      marlinToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_BusinessInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.BusinessInfo getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v1.BusinessInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.BusinessInfo build() {
      bilibili.pgc.gateway.player.v1.BusinessInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.BusinessInfo buildPartial() {
      bilibili.pgc.gateway.player.v1.BusinessInfo result = new bilibili.pgc.gateway.player.v1.BusinessInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v1.BusinessInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isPreview_ = isPreview_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bp_ = bp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.marlinToken_ = marlinToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v1.BusinessInfo) {
        return mergeFrom((bilibili.pgc.gateway.player.v1.BusinessInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v1.BusinessInfo other) {
      if (other == bilibili.pgc.gateway.player.v1.BusinessInfo.getDefaultInstance()) return this;
      if (other.getIsPreview() != false) {
        setIsPreview(other.getIsPreview());
      }
      if (other.getBp() != false) {
        setBp(other.getBp());
      }
      if (!other.getMarlinToken().isEmpty()) {
        marlinToken_ = other.marlinToken_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              isPreview_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              bp_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              marlinToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private boolean isPreview_ ;
    /**
     * <pre>
     * 当前视频是否是预览
     * </pre>
     *
     * <code>bool is_preview = 1;</code>
     * @return The isPreview.
     */
    @java.lang.Override
    public boolean getIsPreview() {
      return isPreview_;
    }
    /**
     * <pre>
     * 当前视频是否是预览
     * </pre>
     *
     * <code>bool is_preview = 1;</code>
     * @param value The isPreview to set.
     * @return This builder for chaining.
     */
    public Builder setIsPreview(boolean value) {

      isPreview_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前视频是否是预览
     * </pre>
     *
     * <code>bool is_preview = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPreview() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isPreview_ = false;
      onChanged();
      return this;
    }

    private boolean bp_ ;
    /**
     * <pre>
     * 用户是否承包过
     * </pre>
     *
     * <code>bool bp = 2;</code>
     * @return The bp.
     */
    @java.lang.Override
    public boolean getBp() {
      return bp_;
    }
    /**
     * <pre>
     * 用户是否承包过
     * </pre>
     *
     * <code>bool bp = 2;</code>
     * @param value The bp to set.
     * @return This builder for chaining.
     */
    public Builder setBp(boolean value) {

      bp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户是否承包过
     * </pre>
     *
     * <code>bool bp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bp_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object marlinToken_ = "";
    /**
     * <pre>
     * drm使用
     * </pre>
     *
     * <code>string marlin_token = 3;</code>
     * @return The marlinToken.
     */
    public java.lang.String getMarlinToken() {
      java.lang.Object ref = marlinToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marlinToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * drm使用
     * </pre>
     *
     * <code>string marlin_token = 3;</code>
     * @return The bytes for marlinToken.
     */
    public com.google.protobuf.ByteString
        getMarlinTokenBytes() {
      java.lang.Object ref = marlinToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marlinToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * drm使用
     * </pre>
     *
     * <code>string marlin_token = 3;</code>
     * @param value The marlinToken to set.
     * @return This builder for chaining.
     */
    public Builder setMarlinToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      marlinToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * drm使用
     * </pre>
     *
     * <code>string marlin_token = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMarlinToken() {
      marlinToken_ = getDefaultInstance().getMarlinToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * drm使用
     * </pre>
     *
     * <code>string marlin_token = 3;</code>
     * @param value The bytes for marlinToken to set.
     * @return This builder for chaining.
     */
    public Builder setMarlinTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      marlinToken_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v1.BusinessInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v1.BusinessInfo)
  private static final bilibili.pgc.gateway.player.v1.BusinessInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v1.BusinessInfo();
  }

  public static bilibili.pgc.gateway.player.v1.BusinessInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessInfo>
      PARSER = new com.google.protobuf.AbstractParser<BusinessInfo>() {
    @java.lang.Override
    public BusinessInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.BusinessInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

