// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 动态同城点击上报-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.OurCityClickReportReq}
 */
public final class OurCityClickReportReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.OurCityClickReportReq)
    OurCityClickReportReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OurCityClickReportReq.newBuilder() to construct.
  private OurCityClickReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OurCityClickReportReq() {
    dynamicId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OurCityClickReportReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OurCityClickReportReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OurCityClickReportReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.OurCityClickReportReq.class, bilibili.app.dynamic.v1.OurCityClickReportReq.Builder.class);
  }

  public static final int DYNAMIC_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dynamicId_ = "";
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 1;</code>
   * @return The dynamicId.
   */
  @java.lang.Override
  public java.lang.String getDynamicId() {
    java.lang.Object ref = dynamicId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynamicId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 1;</code>
   * @return The bytes for dynamicId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynamicIdBytes() {
    java.lang.Object ref = dynamicId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynamicId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_ID_FIELD_NUMBER = 2;
  private long cityId_ = 0L;
  /**
   * <pre>
   * 城市ID
   * </pre>
   *
   * <code>int64 city_id = 2;</code>
   * @return The cityId.
   */
  @java.lang.Override
  public long getCityId() {
    return cityId_;
  }

  public static final int LAT_FIELD_NUMBER = 3;
  private double lat_ = 0D;
  /**
   * <pre>
   * 纬度
   * </pre>
   *
   * <code>double lat = 3;</code>
   * @return The lat.
   */
  @java.lang.Override
  public double getLat() {
    return lat_;
  }

  public static final int LNG_FIELD_NUMBER = 4;
  private double lng_ = 0D;
  /**
   * <pre>
   * 经度
   * </pre>
   *
   * <code>double lng = 4;</code>
   * @return The lng.
   */
  @java.lang.Override
  public double getLng() {
    return lng_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dynamicId_);
    }
    if (cityId_ != 0L) {
      output.writeInt64(2, cityId_);
    }
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      output.writeDouble(3, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lng_) != 0) {
      output.writeDouble(4, lng_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dynamicId_);
    }
    if (cityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, cityId_);
    }
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lng_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, lng_);
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
    if (!(obj instanceof bilibili.app.dynamic.v1.OurCityClickReportReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.OurCityClickReportReq other = (bilibili.app.dynamic.v1.OurCityClickReportReq) obj;

    if (!getDynamicId()
        .equals(other.getDynamicId())) return false;
    if (getCityId()
        != other.getCityId()) return false;
    if (java.lang.Double.doubleToLongBits(getLat())
        != java.lang.Double.doubleToLongBits(
            other.getLat())) return false;
    if (java.lang.Double.doubleToLongBits(getLng())
        != java.lang.Double.doubleToLongBits(
            other.getLng())) return false;
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
    hash = (37 * hash) + DYNAMIC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicId().hashCode();
    hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCityId());
    hash = (37 * hash) + LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLat()));
    hash = (37 * hash) + LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLng()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.OurCityClickReportReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.OurCityClickReportReq prototype) {
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
   * 动态同城点击上报-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.OurCityClickReportReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.OurCityClickReportReq)
      bilibili.app.dynamic.v1.OurCityClickReportReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OurCityClickReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OurCityClickReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.OurCityClickReportReq.class, bilibili.app.dynamic.v1.OurCityClickReportReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.OurCityClickReportReq.newBuilder()
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
      dynamicId_ = "";
      cityId_ = 0L;
      lat_ = 0D;
      lng_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OurCityClickReportReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.OurCityClickReportReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.OurCityClickReportReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.OurCityClickReportReq build() {
      bilibili.app.dynamic.v1.OurCityClickReportReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.OurCityClickReportReq buildPartial() {
      bilibili.app.dynamic.v1.OurCityClickReportReq result = new bilibili.app.dynamic.v1.OurCityClickReportReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v1.OurCityClickReportReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dynamicId_ = dynamicId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cityId_ = cityId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lat_ = lat_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lng_ = lng_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.OurCityClickReportReq) {
        return mergeFrom((bilibili.app.dynamic.v1.OurCityClickReportReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.OurCityClickReportReq other) {
      if (other == bilibili.app.dynamic.v1.OurCityClickReportReq.getDefaultInstance()) return this;
      if (!other.getDynamicId().isEmpty()) {
        dynamicId_ = other.dynamicId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCityId() != 0L) {
        setCityId(other.getCityId());
      }
      if (other.getLat() != 0D) {
        setLat(other.getLat());
      }
      if (other.getLng() != 0D) {
        setLng(other.getLng());
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
              dynamicId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              cityId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 25: {
              lat_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 33: {
              lng_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
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

    private java.lang.Object dynamicId_ = "";
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 1;</code>
     * @return The dynamicId.
     */
    public java.lang.String getDynamicId() {
      java.lang.Object ref = dynamicId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynamicId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 1;</code>
     * @return The bytes for dynamicId.
     */
    public com.google.protobuf.ByteString
        getDynamicIdBytes() {
      java.lang.Object ref = dynamicId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynamicId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 1;</code>
     * @param value The dynamicId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dynamicId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynamicId() {
      dynamicId_ = getDefaultInstance().getDynamicId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态ID
     * </pre>
     *
     * <code>string dynamic_id = 1;</code>
     * @param value The bytes for dynamicId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dynamicId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long cityId_ ;
    /**
     * <pre>
     * 城市ID
     * </pre>
     *
     * <code>int64 city_id = 2;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public long getCityId() {
      return cityId_;
    }
    /**
     * <pre>
     * 城市ID
     * </pre>
     *
     * <code>int64 city_id = 2;</code>
     * @param value The cityId to set.
     * @return This builder for chaining.
     */
    public Builder setCityId(long value) {

      cityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 城市ID
     * </pre>
     *
     * <code>int64 city_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCityId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cityId_ = 0L;
      onChanged();
      return this;
    }

    private double lat_ ;
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double lat = 3;</code>
     * @return The lat.
     */
    @java.lang.Override
    public double getLat() {
      return lat_;
    }
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double lat = 3;</code>
     * @param value The lat to set.
     * @return This builder for chaining.
     */
    public Builder setLat(double value) {

      lat_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double lat = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLat() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lat_ = 0D;
      onChanged();
      return this;
    }

    private double lng_ ;
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double lng = 4;</code>
     * @return The lng.
     */
    @java.lang.Override
    public double getLng() {
      return lng_;
    }
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double lng = 4;</code>
     * @param value The lng to set.
     * @return This builder for chaining.
     */
    public Builder setLng(double value) {

      lng_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double lng = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLng() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lng_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.OurCityClickReportReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.OurCityClickReportReq)
  private static final bilibili.app.dynamic.v1.OurCityClickReportReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.OurCityClickReportReq();
  }

  public static bilibili.app.dynamic.v1.OurCityClickReportReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OurCityClickReportReq>
      PARSER = new com.google.protobuf.AbstractParser<OurCityClickReportReq>() {
    @java.lang.Override
    public OurCityClickReportReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<OurCityClickReportReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OurCityClickReportReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.OurCityClickReportReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
