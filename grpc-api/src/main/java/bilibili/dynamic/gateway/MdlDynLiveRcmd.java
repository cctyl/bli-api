// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 动态列表渲染部分-详情模块-直播推荐
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.MdlDynLiveRcmd}
 */
public final class MdlDynLiveRcmd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.MdlDynLiveRcmd)
    MdlDynLiveRcmdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MdlDynLiveRcmd.newBuilder() to construct.
  private MdlDynLiveRcmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MdlDynLiveRcmd() {
    content_ = "";
    reserveType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MdlDynLiveRcmd();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_MdlDynLiveRcmd_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_MdlDynLiveRcmd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.MdlDynLiveRcmd.class, bilibili.dynamic.gateway.MdlDynLiveRcmd.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * 直播数据
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 直播数据
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESERVE_TYPE_FIELD_NUMBER = 2;
  private int reserveType_ = 0;
  /**
   * <pre>
   * 是否是预约召回
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
   * @return The enum numeric value on the wire for reserveType.
   */
  @java.lang.Override public int getReserveTypeValue() {
    return reserveType_;
  }
  /**
   * <pre>
   * 是否是预约召回
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
   * @return The reserveType.
   */
  @java.lang.Override public bilibili.dynamic.gateway.ReserveType getReserveType() {
    bilibili.dynamic.gateway.ReserveType result = bilibili.dynamic.gateway.ReserveType.forNumber(reserveType_);
    return result == null ? bilibili.dynamic.gateway.ReserveType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (reserveType_ != bilibili.dynamic.gateway.ReserveType.reserve_none.getNumber()) {
      output.writeEnum(2, reserveType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (reserveType_ != bilibili.dynamic.gateway.ReserveType.reserve_none.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, reserveType_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.MdlDynLiveRcmd)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.MdlDynLiveRcmd other = (bilibili.dynamic.gateway.MdlDynLiveRcmd) obj;

    if (!getContent()
        .equals(other.getContent())) return false;
    if (reserveType_ != other.reserveType_) return false;
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + RESERVE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + reserveType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.MdlDynLiveRcmd parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.MdlDynLiveRcmd prototype) {
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
   * 动态列表渲染部分-详情模块-直播推荐
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.MdlDynLiveRcmd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.MdlDynLiveRcmd)
      bilibili.dynamic.gateway.MdlDynLiveRcmdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_MdlDynLiveRcmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_MdlDynLiveRcmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.MdlDynLiveRcmd.class, bilibili.dynamic.gateway.MdlDynLiveRcmd.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.MdlDynLiveRcmd.newBuilder()
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
      content_ = "";
      reserveType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_MdlDynLiveRcmd_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.MdlDynLiveRcmd getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.MdlDynLiveRcmd.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.MdlDynLiveRcmd build() {
      bilibili.dynamic.gateway.MdlDynLiveRcmd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.MdlDynLiveRcmd buildPartial() {
      bilibili.dynamic.gateway.MdlDynLiveRcmd result = new bilibili.dynamic.gateway.MdlDynLiveRcmd(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.MdlDynLiveRcmd result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reserveType_ = reserveType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.MdlDynLiveRcmd) {
        return mergeFrom((bilibili.dynamic.gateway.MdlDynLiveRcmd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.MdlDynLiveRcmd other) {
      if (other == bilibili.dynamic.gateway.MdlDynLiveRcmd.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.reserveType_ != 0) {
        setReserveTypeValue(other.getReserveTypeValue());
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
              content_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              reserveType_ = input.readEnum();
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

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * 直播数据
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 直播数据
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 直播数据
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播数据
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 直播数据
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int reserveType_ = 0;
    /**
     * <pre>
     * 是否是预约召回
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
     * @return The enum numeric value on the wire for reserveType.
     */
    @java.lang.Override public int getReserveTypeValue() {
      return reserveType_;
    }
    /**
     * <pre>
     * 是否是预约召回
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
     * @param value The enum numeric value on the wire for reserveType to set.
     * @return This builder for chaining.
     */
    public Builder setReserveTypeValue(int value) {
      reserveType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否是预约召回
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
     * @return The reserveType.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ReserveType getReserveType() {
      bilibili.dynamic.gateway.ReserveType result = bilibili.dynamic.gateway.ReserveType.forNumber(reserveType_);
      return result == null ? bilibili.dynamic.gateway.ReserveType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 是否是预约召回
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
     * @param value The reserveType to set.
     * @return This builder for chaining.
     */
    public Builder setReserveType(bilibili.dynamic.gateway.ReserveType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      reserveType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否是预约召回
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reserveType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.MdlDynLiveRcmd)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.MdlDynLiveRcmd)
  private static final bilibili.dynamic.gateway.MdlDynLiveRcmd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.MdlDynLiveRcmd();
  }

  public static bilibili.dynamic.gateway.MdlDynLiveRcmd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MdlDynLiveRcmd>
      PARSER = new com.google.protobuf.AbstractParser<MdlDynLiveRcmd>() {
    @java.lang.Override
    public MdlDynLiveRcmd parsePartialFrom(
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

  public static com.google.protobuf.Parser<MdlDynLiveRcmd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MdlDynLiveRcmd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.MdlDynLiveRcmd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

