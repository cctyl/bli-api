// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 批量动态id获取动态详情请求参数
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynDetailsReq}
 */
public final class DynDetailsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynDetailsReq)
    DynDetailsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynDetailsReq.newBuilder() to construct.
  private DynDetailsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynDetailsReq() {
    dynamicIds_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynDetailsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.DynDetailsReq.class, bilibili.app.dynamic.v1.DynDetailsReq.Builder.class);
  }

  public static final int TEENAGERS_MODE_FIELD_NUMBER = 1;
  private int teenagersMode_ = 0;
  /**
   * <pre>
   * 青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 1;</code>
   * @return The teenagersMode.
   */
  @java.lang.Override
  public int getTeenagersMode() {
    return teenagersMode_;
  }

  public static final int DYNAMIC_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dynamicIds_ = "";
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 2;</code>
   * @return The dynamicIds.
   */
  @java.lang.Override
  public java.lang.String getDynamicIds() {
    java.lang.Object ref = dynamicIds_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynamicIds_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 2;</code>
   * @return The bytes for dynamicIds.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynamicIdsBytes() {
    java.lang.Object ref = dynamicIds_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynamicIds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QN_FIELD_NUMBER = 3;
  private int qn_ = 0;
  /**
   * <pre>
   * 清晰度
   * </pre>
   *
   * <code>int32 qn = 3;</code>
   * @return The qn.
   */
  @java.lang.Override
  public int getQn() {
    return qn_;
  }

  public static final int FNVER_FIELD_NUMBER = 4;
  private int fnver_ = 0;
  /**
   * <pre>
   * 流版本
   * </pre>
   *
   * <code>int32 fnver = 4;</code>
   * @return The fnver.
   */
  @java.lang.Override
  public int getFnver() {
    return fnver_;
  }

  public static final int FNVAL_FIELD_NUMBER = 5;
  private int fnval_ = 0;
  /**
   * <pre>
   * 流功能
   * </pre>
   *
   * <code>int32 fnval = 5;</code>
   * @return The fnval.
   */
  @java.lang.Override
  public int getFnval() {
    return fnval_;
  }

  public static final int FORCE_HOST_FIELD_NUMBER = 6;
  private int forceHost_ = 0;
  /**
   * <pre>
   * 是否强制使用域名
   * </pre>
   *
   * <code>int32 force_host = 6;</code>
   * @return The forceHost.
   */
  @java.lang.Override
  public int getForceHost() {
    return forceHost_;
  }

  public static final int FOURK_FIELD_NUMBER = 7;
  private int fourk_ = 0;
  /**
   * <pre>
   * 是否4k
   * </pre>
   *
   * <code>int32 fourk = 7;</code>
   * @return The fourk.
   */
  @java.lang.Override
  public int getFourk() {
    return fourk_;
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
    if (teenagersMode_ != 0) {
      output.writeInt32(1, teenagersMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicIds_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dynamicIds_);
    }
    if (qn_ != 0) {
      output.writeInt32(3, qn_);
    }
    if (fnver_ != 0) {
      output.writeInt32(4, fnver_);
    }
    if (fnval_ != 0) {
      output.writeInt32(5, fnval_);
    }
    if (forceHost_ != 0) {
      output.writeInt32(6, forceHost_);
    }
    if (fourk_ != 0) {
      output.writeInt32(7, fourk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (teenagersMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, teenagersMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicIds_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dynamicIds_);
    }
    if (qn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, qn_);
    }
    if (fnver_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fnver_);
    }
    if (fnval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, fnval_);
    }
    if (forceHost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, forceHost_);
    }
    if (fourk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, fourk_);
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
    if (!(obj instanceof bilibili.app.dynamic.v1.DynDetailsReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.DynDetailsReq other = (bilibili.app.dynamic.v1.DynDetailsReq) obj;

    if (getTeenagersMode()
        != other.getTeenagersMode()) return false;
    if (!getDynamicIds()
        .equals(other.getDynamicIds())) return false;
    if (getQn()
        != other.getQn()) return false;
    if (getFnver()
        != other.getFnver()) return false;
    if (getFnval()
        != other.getFnval()) return false;
    if (getForceHost()
        != other.getForceHost()) return false;
    if (getFourk()
        != other.getFourk()) return false;
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
    hash = (37 * hash) + TEENAGERS_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getTeenagersMode();
    hash = (37 * hash) + DYNAMIC_IDS_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicIds().hashCode();
    hash = (37 * hash) + QN_FIELD_NUMBER;
    hash = (53 * hash) + getQn();
    hash = (37 * hash) + FNVER_FIELD_NUMBER;
    hash = (53 * hash) + getFnver();
    hash = (37 * hash) + FNVAL_FIELD_NUMBER;
    hash = (53 * hash) + getFnval();
    hash = (37 * hash) + FORCE_HOST_FIELD_NUMBER;
    hash = (53 * hash) + getForceHost();
    hash = (37 * hash) + FOURK_FIELD_NUMBER;
    hash = (53 * hash) + getFourk();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynDetailsReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.DynDetailsReq prototype) {
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
   * 批量动态id获取动态详情请求参数
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DynDetailsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynDetailsReq)
      bilibili.app.dynamic.v1.DynDetailsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.DynDetailsReq.class, bilibili.app.dynamic.v1.DynDetailsReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.DynDetailsReq.newBuilder()
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
      teenagersMode_ = 0;
      dynamicIds_ = "";
      qn_ = 0;
      fnver_ = 0;
      fnval_ = 0;
      forceHost_ = 0;
      fourk_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynDetailsReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.DynDetailsReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynDetailsReq build() {
      bilibili.app.dynamic.v1.DynDetailsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynDetailsReq buildPartial() {
      bilibili.app.dynamic.v1.DynDetailsReq result = new bilibili.app.dynamic.v1.DynDetailsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v1.DynDetailsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.teenagersMode_ = teenagersMode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dynamicIds_ = dynamicIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.qn_ = qn_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fnver_ = fnver_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fnval_ = fnval_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.forceHost_ = forceHost_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.fourk_ = fourk_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.DynDetailsReq) {
        return mergeFrom((bilibili.app.dynamic.v1.DynDetailsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.DynDetailsReq other) {
      if (other == bilibili.app.dynamic.v1.DynDetailsReq.getDefaultInstance()) return this;
      if (other.getTeenagersMode() != 0) {
        setTeenagersMode(other.getTeenagersMode());
      }
      if (!other.getDynamicIds().isEmpty()) {
        dynamicIds_ = other.dynamicIds_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getQn() != 0) {
        setQn(other.getQn());
      }
      if (other.getFnver() != 0) {
        setFnver(other.getFnver());
      }
      if (other.getFnval() != 0) {
        setFnval(other.getFnval());
      }
      if (other.getForceHost() != 0) {
        setForceHost(other.getForceHost());
      }
      if (other.getFourk() != 0) {
        setFourk(other.getFourk());
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
              teenagersMode_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              dynamicIds_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              qn_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              fnver_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              fnval_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              forceHost_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              fourk_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private int teenagersMode_ ;
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @return The teenagersMode.
     */
    @java.lang.Override
    public int getTeenagersMode() {
      return teenagersMode_;
    }
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @param value The teenagersMode to set.
     * @return This builder for chaining.
     */
    public Builder setTeenagersMode(int value) {

      teenagersMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeenagersMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      teenagersMode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dynamicIds_ = "";
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @return The dynamicIds.
     */
    public java.lang.String getDynamicIds() {
      java.lang.Object ref = dynamicIds_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynamicIds_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @return The bytes for dynamicIds.
     */
    public com.google.protobuf.ByteString
        getDynamicIdsBytes() {
      java.lang.Object ref = dynamicIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynamicIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @param value The dynamicIds to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dynamicIds_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynamicIds() {
      dynamicIds_ = getDefaultInstance().getDynamicIds();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @param value The bytes for dynamicIds to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dynamicIds_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int qn_ ;
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @return The qn.
     */
    @java.lang.Override
    public int getQn() {
      return qn_;
    }
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @param value The qn to set.
     * @return This builder for chaining.
     */
    public Builder setQn(int value) {

      qn_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQn() {
      bitField0_ = (bitField0_ & ~0x00000004);
      qn_ = 0;
      onChanged();
      return this;
    }

    private int fnver_ ;
    /**
     * <pre>
     * 流版本
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @return The fnver.
     */
    @java.lang.Override
    public int getFnver() {
      return fnver_;
    }
    /**
     * <pre>
     * 流版本
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @param value The fnver to set.
     * @return This builder for chaining.
     */
    public Builder setFnver(int value) {

      fnver_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流版本
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFnver() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fnver_ = 0;
      onChanged();
      return this;
    }

    private int fnval_ ;
    /**
     * <pre>
     * 流功能
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @return The fnval.
     */
    @java.lang.Override
    public int getFnval() {
      return fnval_;
    }
    /**
     * <pre>
     * 流功能
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @param value The fnval to set.
     * @return This builder for chaining.
     */
    public Builder setFnval(int value) {

      fnval_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流功能
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFnval() {
      bitField0_ = (bitField0_ & ~0x00000010);
      fnval_ = 0;
      onChanged();
      return this;
    }

    private int forceHost_ ;
    /**
     * <pre>
     * 是否强制使用域名
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @return The forceHost.
     */
    @java.lang.Override
    public int getForceHost() {
      return forceHost_;
    }
    /**
     * <pre>
     * 是否强制使用域名
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @param value The forceHost to set.
     * @return This builder for chaining.
     */
    public Builder setForceHost(int value) {

      forceHost_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否强制使用域名
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearForceHost() {
      bitField0_ = (bitField0_ & ~0x00000020);
      forceHost_ = 0;
      onChanged();
      return this;
    }

    private int fourk_ ;
    /**
     * <pre>
     * 是否4k
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @return The fourk.
     */
    @java.lang.Override
    public int getFourk() {
      return fourk_;
    }
    /**
     * <pre>
     * 是否4k
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @param value The fourk to set.
     * @return This builder for chaining.
     */
    public Builder setFourk(int value) {

      fourk_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否4k
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFourk() {
      bitField0_ = (bitField0_ & ~0x00000040);
      fourk_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynDetailsReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynDetailsReq)
  private static final bilibili.app.dynamic.v1.DynDetailsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.DynDetailsReq();
  }

  public static bilibili.app.dynamic.v1.DynDetailsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynDetailsReq>
      PARSER = new com.google.protobuf.AbstractParser<DynDetailsReq>() {
    @java.lang.Override
    public DynDetailsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynDetailsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynDetailsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.DynDetailsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
