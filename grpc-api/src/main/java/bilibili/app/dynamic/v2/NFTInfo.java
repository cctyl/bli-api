// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.NFTInfo}
 */
public final class NFTInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.NFTInfo)
    NFTInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NFTInfo.newBuilder() to construct.
  private NFTInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NFTInfo() {
    regionType_ = 0;
    regionIcon_ = "";
    regionShowStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NFTInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_NFTInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_NFTInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.NFTInfo.class, bilibili.app.dynamic.v2.NFTInfo.Builder.class);
  }

  public static final int REGION_TYPE_FIELD_NUMBER = 1;
  private int regionType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
   * @return The enum numeric value on the wire for regionType.
   */
  @java.lang.Override public int getRegionTypeValue() {
    return regionType_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
   * @return The regionType.
   */
  @java.lang.Override public bilibili.app.dynamic.v2.NFTRegionType getRegionType() {
    bilibili.app.dynamic.v2.NFTRegionType result = bilibili.app.dynamic.v2.NFTRegionType.forNumber(regionType_);
    return result == null ? bilibili.app.dynamic.v2.NFTRegionType.UNRECOGNIZED : result;
  }

  public static final int REGION_ICON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object regionIcon_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string region_icon = 2;</code>
   * @return The regionIcon.
   */
  @java.lang.Override
  public java.lang.String getRegionIcon() {
    java.lang.Object ref = regionIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regionIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string region_icon = 2;</code>
   * @return The bytes for regionIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionIconBytes() {
    java.lang.Object ref = regionIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regionIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_SHOW_STATUS_FIELD_NUMBER = 3;
  private int regionShowStatus_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
   * @return The enum numeric value on the wire for regionShowStatus.
   */
  @java.lang.Override public int getRegionShowStatusValue() {
    return regionShowStatus_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
   * @return The regionShowStatus.
   */
  @java.lang.Override public bilibili.app.dynamic.v2.NFTShowStatus getRegionShowStatus() {
    bilibili.app.dynamic.v2.NFTShowStatus result = bilibili.app.dynamic.v2.NFTShowStatus.forNumber(regionShowStatus_);
    return result == null ? bilibili.app.dynamic.v2.NFTShowStatus.UNRECOGNIZED : result;
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
    if (regionType_ != bilibili.app.dynamic.v2.NFTRegionType.nft_region_default.getNumber()) {
      output.writeEnum(1, regionType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, regionIcon_);
    }
    if (regionShowStatus_ != bilibili.app.dynamic.v2.NFTShowStatus.nft_show_default.getNumber()) {
      output.writeEnum(3, regionShowStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regionType_ != bilibili.app.dynamic.v2.NFTRegionType.nft_region_default.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, regionType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, regionIcon_);
    }
    if (regionShowStatus_ != bilibili.app.dynamic.v2.NFTShowStatus.nft_show_default.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, regionShowStatus_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.NFTInfo)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.NFTInfo other = (bilibili.app.dynamic.v2.NFTInfo) obj;

    if (regionType_ != other.regionType_) return false;
    if (!getRegionIcon()
        .equals(other.getRegionIcon())) return false;
    if (regionShowStatus_ != other.regionShowStatus_) return false;
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
    hash = (37 * hash) + REGION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + regionType_;
    hash = (37 * hash) + REGION_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getRegionIcon().hashCode();
    hash = (37 * hash) + REGION_SHOW_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + regionShowStatus_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.NFTInfo parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.NFTInfo prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.NFTInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.NFTInfo)
      bilibili.app.dynamic.v2.NFTInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_NFTInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_NFTInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.NFTInfo.class, bilibili.app.dynamic.v2.NFTInfo.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.NFTInfo.newBuilder()
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
      regionType_ = 0;
      regionIcon_ = "";
      regionShowStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_NFTInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.NFTInfo getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.NFTInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.NFTInfo build() {
      bilibili.app.dynamic.v2.NFTInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.NFTInfo buildPartial() {
      bilibili.app.dynamic.v2.NFTInfo result = new bilibili.app.dynamic.v2.NFTInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.NFTInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionType_ = regionType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.regionIcon_ = regionIcon_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.regionShowStatus_ = regionShowStatus_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.NFTInfo) {
        return mergeFrom((bilibili.app.dynamic.v2.NFTInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.NFTInfo other) {
      if (other == bilibili.app.dynamic.v2.NFTInfo.getDefaultInstance()) return this;
      if (other.regionType_ != 0) {
        setRegionTypeValue(other.getRegionTypeValue());
      }
      if (!other.getRegionIcon().isEmpty()) {
        regionIcon_ = other.regionIcon_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.regionShowStatus_ != 0) {
        setRegionShowStatusValue(other.getRegionShowStatusValue());
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
              regionType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              regionIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              regionShowStatus_ = input.readEnum();
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

    private int regionType_ = 0;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
     * @return The enum numeric value on the wire for regionType.
     */
    @java.lang.Override public int getRegionTypeValue() {
      return regionType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
     * @param value The enum numeric value on the wire for regionType to set.
     * @return This builder for chaining.
     */
    public Builder setRegionTypeValue(int value) {
      regionType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
     * @return The regionType.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.NFTRegionType getRegionType() {
      bilibili.app.dynamic.v2.NFTRegionType result = bilibili.app.dynamic.v2.NFTRegionType.forNumber(regionType_);
      return result == null ? bilibili.app.dynamic.v2.NFTRegionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
     * @param value The regionType to set.
     * @return This builder for chaining.
     */
    public Builder setRegionType(bilibili.app.dynamic.v2.NFTRegionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      regionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTRegionType region_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      regionType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object regionIcon_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string region_icon = 2;</code>
     * @return The regionIcon.
     */
    public java.lang.String getRegionIcon() {
      java.lang.Object ref = regionIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string region_icon = 2;</code>
     * @return The bytes for regionIcon.
     */
    public com.google.protobuf.ByteString
        getRegionIconBytes() {
      java.lang.Object ref = regionIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string region_icon = 2;</code>
     * @param value The regionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      regionIcon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string region_icon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionIcon() {
      regionIcon_ = getDefaultInstance().getRegionIcon();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string region_icon = 2;</code>
     * @param value The bytes for regionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      regionIcon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int regionShowStatus_ = 0;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
     * @return The enum numeric value on the wire for regionShowStatus.
     */
    @java.lang.Override public int getRegionShowStatusValue() {
      return regionShowStatus_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
     * @param value The enum numeric value on the wire for regionShowStatus to set.
     * @return This builder for chaining.
     */
    public Builder setRegionShowStatusValue(int value) {
      regionShowStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
     * @return The regionShowStatus.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.NFTShowStatus getRegionShowStatus() {
      bilibili.app.dynamic.v2.NFTShowStatus result = bilibili.app.dynamic.v2.NFTShowStatus.forNumber(regionShowStatus_);
      return result == null ? bilibili.app.dynamic.v2.NFTShowStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
     * @param value The regionShowStatus to set.
     * @return This builder for chaining.
     */
    public Builder setRegionShowStatus(bilibili.app.dynamic.v2.NFTShowStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      regionShowStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.NFTShowStatus region_show_status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionShowStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      regionShowStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.NFTInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.NFTInfo)
  private static final bilibili.app.dynamic.v2.NFTInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.NFTInfo();
  }

  public static bilibili.app.dynamic.v2.NFTInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NFTInfo>
      PARSER = new com.google.protobuf.AbstractParser<NFTInfo>() {
    @java.lang.Override
    public NFTInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<NFTInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NFTInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.NFTInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

