// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.CampusBillboardInternalReq}
 */
public final class CampusBillboardInternalReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.CampusBillboardInternalReq)
    CampusBillboardInternalReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampusBillboardInternalReq.newBuilder() to construct.
  private CampusBillboardInternalReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampusBillboardInternalReq() {
    versionCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampusBillboardInternalReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusBillboardInternalReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusBillboardInternalReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.CampusBillboardInternalReq.class, bilibili.app.dynamic.v2.CampusBillboardInternalReq.Builder.class);
  }

  public static final int MID_FIELD_NUMBER = 1;
  private long mid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
  }

  public static final int CAMPUS_ID_FIELD_NUMBER = 2;
  private long campusId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 campus_id = 2;</code>
   * @return The campusId.
   */
  @java.lang.Override
  public long getCampusId() {
    return campusId_;
  }

  public static final int VERSION_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object versionCode_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string version_code = 3;</code>
   * @return The versionCode.
   */
  @java.lang.Override
  public java.lang.String getVersionCode() {
    java.lang.Object ref = versionCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string version_code = 3;</code>
   * @return The bytes for versionCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionCodeBytes() {
    java.lang.Object ref = versionCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      versionCode_ = b;
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
    if (mid_ != 0L) {
      output.writeInt64(1, mid_);
    }
    if (campusId_ != 0L) {
      output.writeInt64(2, campusId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, versionCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, mid_);
    }
    if (campusId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, campusId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, versionCode_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.CampusBillboardInternalReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.CampusBillboardInternalReq other = (bilibili.app.dynamic.v2.CampusBillboardInternalReq) obj;

    if (getMid()
        != other.getMid()) return false;
    if (getCampusId()
        != other.getCampusId()) return false;
    if (!getVersionCode()
        .equals(other.getVersionCode())) return false;
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
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (37 * hash) + CAMPUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampusId());
    hash = (37 * hash) + VERSION_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getVersionCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.CampusBillboardInternalReq prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.CampusBillboardInternalReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.CampusBillboardInternalReq)
      bilibili.app.dynamic.v2.CampusBillboardInternalReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusBillboardInternalReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusBillboardInternalReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.CampusBillboardInternalReq.class, bilibili.app.dynamic.v2.CampusBillboardInternalReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.CampusBillboardInternalReq.newBuilder()
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
      mid_ = 0L;
      campusId_ = 0L;
      versionCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusBillboardInternalReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusBillboardInternalReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.CampusBillboardInternalReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusBillboardInternalReq build() {
      bilibili.app.dynamic.v2.CampusBillboardInternalReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusBillboardInternalReq buildPartial() {
      bilibili.app.dynamic.v2.CampusBillboardInternalReq result = new bilibili.app.dynamic.v2.CampusBillboardInternalReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.CampusBillboardInternalReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campusId_ = campusId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.versionCode_ = versionCode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.CampusBillboardInternalReq) {
        return mergeFrom((bilibili.app.dynamic.v2.CampusBillboardInternalReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.CampusBillboardInternalReq other) {
      if (other == bilibili.app.dynamic.v2.CampusBillboardInternalReq.getDefaultInstance()) return this;
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (other.getCampusId() != 0L) {
        setCampusId(other.getCampusId());
      }
      if (!other.getVersionCode().isEmpty()) {
        versionCode_ = other.versionCode_;
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
              mid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              campusId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              versionCode_ = input.readStringRequireUtf8();
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

    private long mid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @return The mid.
     */
    @java.lang.Override
    public long getMid() {
      return mid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 0L;
      onChanged();
      return this;
    }

    private long campusId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 2;</code>
     * @return The campusId.
     */
    @java.lang.Override
    public long getCampusId() {
      return campusId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 2;</code>
     * @param value The campusId to set.
     * @return This builder for chaining.
     */
    public Builder setCampusId(long value) {

      campusId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      campusId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object versionCode_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string version_code = 3;</code>
     * @return The versionCode.
     */
    public java.lang.String getVersionCode() {
      java.lang.Object ref = versionCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string version_code = 3;</code>
     * @return The bytes for versionCode.
     */
    public com.google.protobuf.ByteString
        getVersionCodeBytes() {
      java.lang.Object ref = versionCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string version_code = 3;</code>
     * @param value The versionCode to set.
     * @return This builder for chaining.
     */
    public Builder setVersionCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      versionCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string version_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersionCode() {
      versionCode_ = getDefaultInstance().getVersionCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string version_code = 3;</code>
     * @param value The bytes for versionCode to set.
     * @return This builder for chaining.
     */
    public Builder setVersionCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      versionCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.CampusBillboardInternalReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.CampusBillboardInternalReq)
  private static final bilibili.app.dynamic.v2.CampusBillboardInternalReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.CampusBillboardInternalReq();
  }

  public static bilibili.app.dynamic.v2.CampusBillboardInternalReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampusBillboardInternalReq>
      PARSER = new com.google.protobuf.AbstractParser<CampusBillboardInternalReq>() {
    @java.lang.Override
    public CampusBillboardInternalReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampusBillboardInternalReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampusBillboardInternalReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusBillboardInternalReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
