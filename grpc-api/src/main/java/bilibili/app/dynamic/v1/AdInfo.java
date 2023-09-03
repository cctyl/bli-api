// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 行政区划信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.AdInfo}
 */
public final class AdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.AdInfo)
    AdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdInfo.newBuilder() to construct.
  private AdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdInfo() {
    nationCode_ = "";
    adcode_ = "";
    cityCode_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_AdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_AdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.AdInfo.class, bilibili.app.dynamic.v1.AdInfo.Builder.class);
  }

  public static final int NATION_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nationCode_ = "";
  /**
   * <pre>
   * 国家代码(ISO3166标准3位数字码)
   * </pre>
   *
   * <code>string nation_code = 1;</code>
   * @return The nationCode.
   */
  @java.lang.Override
  public java.lang.String getNationCode() {
    java.lang.Object ref = nationCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nationCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 国家代码(ISO3166标准3位数字码)
   * </pre>
   *
   * <code>string nation_code = 1;</code>
   * @return The bytes for nationCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNationCodeBytes() {
    java.lang.Object ref = nationCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nationCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADCODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object adcode_ = "";
  /**
   * <pre>
   * 行政区划代码，规则详见：行政区划代码说明
   * </pre>
   *
   * <code>string adcode = 2;</code>
   * @return The adcode.
   */
  @java.lang.Override
  public java.lang.String getAdcode() {
    java.lang.Object ref = adcode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adcode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 行政区划代码，规则详见：行政区划代码说明
   * </pre>
   *
   * <code>string adcode = 2;</code>
   * @return The bytes for adcode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdcodeBytes() {
    java.lang.Object ref = adcode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adcode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cityCode_ = "";
  /**
   * <pre>
   * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
   * </pre>
   *
   * <code>string city_code = 3;</code>
   * @return The cityCode.
   */
  @java.lang.Override
  public java.lang.String getCityCode() {
    java.lang.Object ref = cityCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cityCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
   * </pre>
   *
   * <code>string city_code = 3;</code>
   * @return The bytes for cityCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityCodeBytes() {
    java.lang.Object ref = cityCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cityCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * 行政区划名称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 行政区划名称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GPS_FIELD_NUMBER = 5;
  private bilibili.app.dynamic.v1.Gps gps_;
  /**
   * <pre>
   * 行政区划中心点坐标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
   * @return Whether the gps field is set.
   */
  @java.lang.Override
  public boolean hasGps() {
    return gps_ != null;
  }
  /**
   * <pre>
   * 行政区划中心点坐标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
   * @return The gps.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.Gps getGps() {
    return gps_ == null ? bilibili.app.dynamic.v1.Gps.getDefaultInstance() : gps_;
  }
  /**
   * <pre>
   * 行政区划中心点坐标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.GpsOrBuilder getGpsOrBuilder() {
    return gps_ == null ? bilibili.app.dynamic.v1.Gps.getDefaultInstance() : gps_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nationCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nationCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adcode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, adcode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cityCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cityCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (gps_ != null) {
      output.writeMessage(5, getGps());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nationCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nationCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adcode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, adcode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cityCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cityCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (gps_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getGps());
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
    if (!(obj instanceof bilibili.app.dynamic.v1.AdInfo)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.AdInfo other = (bilibili.app.dynamic.v1.AdInfo) obj;

    if (!getNationCode()
        .equals(other.getNationCode())) return false;
    if (!getAdcode()
        .equals(other.getAdcode())) return false;
    if (!getCityCode()
        .equals(other.getCityCode())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasGps() != other.hasGps()) return false;
    if (hasGps()) {
      if (!getGps()
          .equals(other.getGps())) return false;
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
    hash = (37 * hash) + NATION_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getNationCode().hashCode();
    hash = (37 * hash) + ADCODE_FIELD_NUMBER;
    hash = (53 * hash) + getAdcode().hashCode();
    hash = (37 * hash) + CITY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCityCode().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasGps()) {
      hash = (37 * hash) + GPS_FIELD_NUMBER;
      hash = (53 * hash) + getGps().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.AdInfo parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.AdInfo prototype) {
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
   * 行政区划信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.AdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.AdInfo)
      bilibili.app.dynamic.v1.AdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_AdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_AdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.AdInfo.class, bilibili.app.dynamic.v1.AdInfo.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.AdInfo.newBuilder()
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
      nationCode_ = "";
      adcode_ = "";
      cityCode_ = "";
      name_ = "";
      gps_ = null;
      if (gpsBuilder_ != null) {
        gpsBuilder_.dispose();
        gpsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_AdInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.AdInfo getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.AdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.AdInfo build() {
      bilibili.app.dynamic.v1.AdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.AdInfo buildPartial() {
      bilibili.app.dynamic.v1.AdInfo result = new bilibili.app.dynamic.v1.AdInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v1.AdInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nationCode_ = nationCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adcode_ = adcode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cityCode_ = cityCode_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.gps_ = gpsBuilder_ == null
            ? gps_
            : gpsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.AdInfo) {
        return mergeFrom((bilibili.app.dynamic.v1.AdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.AdInfo other) {
      if (other == bilibili.app.dynamic.v1.AdInfo.getDefaultInstance()) return this;
      if (!other.getNationCode().isEmpty()) {
        nationCode_ = other.nationCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAdcode().isEmpty()) {
        adcode_ = other.adcode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCityCode().isEmpty()) {
        cityCode_ = other.cityCode_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.hasGps()) {
        mergeGps(other.getGps());
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
              nationCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              adcode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              cityCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getGpsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object nationCode_ = "";
    /**
     * <pre>
     * 国家代码(ISO3166标准3位数字码)
     * </pre>
     *
     * <code>string nation_code = 1;</code>
     * @return The nationCode.
     */
    public java.lang.String getNationCode() {
      java.lang.Object ref = nationCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nationCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 国家代码(ISO3166标准3位数字码)
     * </pre>
     *
     * <code>string nation_code = 1;</code>
     * @return The bytes for nationCode.
     */
    public com.google.protobuf.ByteString
        getNationCodeBytes() {
      java.lang.Object ref = nationCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nationCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 国家代码(ISO3166标准3位数字码)
     * </pre>
     *
     * <code>string nation_code = 1;</code>
     * @param value The nationCode to set.
     * @return This builder for chaining.
     */
    public Builder setNationCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nationCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国家代码(ISO3166标准3位数字码)
     * </pre>
     *
     * <code>string nation_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNationCode() {
      nationCode_ = getDefaultInstance().getNationCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国家代码(ISO3166标准3位数字码)
     * </pre>
     *
     * <code>string nation_code = 1;</code>
     * @param value The bytes for nationCode to set.
     * @return This builder for chaining.
     */
    public Builder setNationCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nationCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object adcode_ = "";
    /**
     * <pre>
     * 行政区划代码，规则详见：行政区划代码说明
     * </pre>
     *
     * <code>string adcode = 2;</code>
     * @return The adcode.
     */
    public java.lang.String getAdcode() {
      java.lang.Object ref = adcode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adcode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 行政区划代码，规则详见：行政区划代码说明
     * </pre>
     *
     * <code>string adcode = 2;</code>
     * @return The bytes for adcode.
     */
    public com.google.protobuf.ByteString
        getAdcodeBytes() {
      java.lang.Object ref = adcode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 行政区划代码，规则详见：行政区划代码说明
     * </pre>
     *
     * <code>string adcode = 2;</code>
     * @param value The adcode to set.
     * @return This builder for chaining.
     */
    public Builder setAdcode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      adcode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划代码，规则详见：行政区划代码说明
     * </pre>
     *
     * <code>string adcode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdcode() {
      adcode_ = getDefaultInstance().getAdcode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划代码，规则详见：行政区划代码说明
     * </pre>
     *
     * <code>string adcode = 2;</code>
     * @param value The bytes for adcode to set.
     * @return This builder for chaining.
     */
    public Builder setAdcodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      adcode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object cityCode_ = "";
    /**
     * <pre>
     * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
     * </pre>
     *
     * <code>string city_code = 3;</code>
     * @return The cityCode.
     */
    public java.lang.String getCityCode() {
      java.lang.Object ref = cityCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cityCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
     * </pre>
     *
     * <code>string city_code = 3;</code>
     * @return The bytes for cityCode.
     */
    public com.google.protobuf.ByteString
        getCityCodeBytes() {
      java.lang.Object ref = cityCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cityCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
     * </pre>
     *
     * <code>string city_code = 3;</code>
     * @param value The cityCode to set.
     * @return This builder for chaining.
     */
    public Builder setCityCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cityCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
     * </pre>
     *
     * <code>string city_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCityCode() {
      cityCode_ = getDefaultInstance().getCityCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 城市代码，由国家码+行政区划代码(提出城市级别)组合而来，总共为9位
     * </pre>
     *
     * <code>string city_code = 3;</code>
     * @param value The bytes for cityCode to set.
     * @return This builder for chaining.
     */
    public Builder setCityCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cityCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 行政区划名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 行政区划名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 行政区划名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v1.Gps gps_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.Gps, bilibili.app.dynamic.v1.Gps.Builder, bilibili.app.dynamic.v1.GpsOrBuilder> gpsBuilder_;
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     * @return Whether the gps field is set.
     */
    public boolean hasGps() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     * @return The gps.
     */
    public bilibili.app.dynamic.v1.Gps getGps() {
      if (gpsBuilder_ == null) {
        return gps_ == null ? bilibili.app.dynamic.v1.Gps.getDefaultInstance() : gps_;
      } else {
        return gpsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public Builder setGps(bilibili.app.dynamic.v1.Gps value) {
      if (gpsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gps_ = value;
      } else {
        gpsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public Builder setGps(
        bilibili.app.dynamic.v1.Gps.Builder builderForValue) {
      if (gpsBuilder_ == null) {
        gps_ = builderForValue.build();
      } else {
        gpsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public Builder mergeGps(bilibili.app.dynamic.v1.Gps value) {
      if (gpsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          gps_ != null &&
          gps_ != bilibili.app.dynamic.v1.Gps.getDefaultInstance()) {
          getGpsBuilder().mergeFrom(value);
        } else {
          gps_ = value;
        }
      } else {
        gpsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public Builder clearGps() {
      bitField0_ = (bitField0_ & ~0x00000010);
      gps_ = null;
      if (gpsBuilder_ != null) {
        gpsBuilder_.dispose();
        gpsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public bilibili.app.dynamic.v1.Gps.Builder getGpsBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getGpsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    public bilibili.app.dynamic.v1.GpsOrBuilder getGpsOrBuilder() {
      if (gpsBuilder_ != null) {
        return gpsBuilder_.getMessageOrBuilder();
      } else {
        return gps_ == null ?
            bilibili.app.dynamic.v1.Gps.getDefaultInstance() : gps_;
      }
    }
    /**
     * <pre>
     * 行政区划中心点坐标
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.Gps gps = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.Gps, bilibili.app.dynamic.v1.Gps.Builder, bilibili.app.dynamic.v1.GpsOrBuilder> 
        getGpsFieldBuilder() {
      if (gpsBuilder_ == null) {
        gpsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v1.Gps, bilibili.app.dynamic.v1.Gps.Builder, bilibili.app.dynamic.v1.GpsOrBuilder>(
                getGps(),
                getParentForChildren(),
                isClean());
        gps_ = null;
      }
      return gpsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.AdInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.AdInfo)
  private static final bilibili.app.dynamic.v1.AdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.AdInfo();
  }

  public static bilibili.app.dynamic.v1.AdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdInfo>
      PARSER = new com.google.protobuf.AbstractParser<AdInfo>() {
    @java.lang.Override
    public AdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.AdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

