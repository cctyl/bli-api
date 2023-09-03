// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 动态点赞-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.DynThumbReq}
 */
public final class DynThumbReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.DynThumbReq)
    DynThumbReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynThumbReq.newBuilder() to construct.
  private DynThumbReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynThumbReq() {
    dynId_ = "";
    rid_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynThumbReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynThumbReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynThumbReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.DynThumbReq.class, bilibili.dynamic.gateway.DynThumbReq.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private long uid_ = 0L;
  /**
   * <pre>
   * 用户uid
   * </pre>
   *
   * <code>int64 uid = 1;</code>
   * @return The uid.
   */
  @java.lang.Override
  public long getUid() {
    return uid_;
  }

  public static final int DYN_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dynId_ = "";
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dyn_id = 2;</code>
   * @return The dynId.
   */
  @java.lang.Override
  public java.lang.String getDynId() {
    java.lang.Object ref = dynId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dyn_id = 2;</code>
   * @return The bytes for dynId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynIdBytes() {
    java.lang.Object ref = dynId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DYN_TYPE_FIELD_NUMBER = 3;
  private long dynType_ = 0L;
  /**
   * <pre>
   * 动态类型(透传extend中的dyn_type)
   * </pre>
   *
   * <code>int64 dyn_type = 3;</code>
   * @return The dynType.
   */
  @java.lang.Override
  public long getDynType() {
    return dynType_;
  }

  public static final int RID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rid_ = "";
  /**
   * <pre>
   * 业务方资源id
   * </pre>
   *
   * <code>string rid = 4;</code>
   * @return The rid.
   */
  @java.lang.Override
  public java.lang.String getRid() {
    java.lang.Object ref = rid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 业务方资源id
   * </pre>
   *
   * <code>string rid = 4;</code>
   * @return The bytes for rid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRidBytes() {
    java.lang.Object ref = rid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_ = 0;
  /**
   * <pre>
   * 点赞类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * 点赞类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.dynamic.gateway.ThumbType getType() {
    bilibili.dynamic.gateway.ThumbType result = bilibili.dynamic.gateway.ThumbType.forNumber(type_);
    return result == null ? bilibili.dynamic.gateway.ThumbType.UNRECOGNIZED : result;
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
    if (uid_ != 0L) {
      output.writeInt64(1, uid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dynId_);
    }
    if (dynType_ != 0L) {
      output.writeInt64(3, dynType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, rid_);
    }
    if (type_ != bilibili.dynamic.gateway.ThumbType.cancel.getNumber()) {
      output.writeEnum(5, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, uid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dynId_);
    }
    if (dynType_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dynType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, rid_);
    }
    if (type_ != bilibili.dynamic.gateway.ThumbType.cancel.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, type_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.DynThumbReq)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.DynThumbReq other = (bilibili.dynamic.gateway.DynThumbReq) obj;

    if (getUid()
        != other.getUid()) return false;
    if (!getDynId()
        .equals(other.getDynId())) return false;
    if (getDynType()
        != other.getDynType()) return false;
    if (!getRid()
        .equals(other.getRid())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (37 * hash) + DYN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDynId().hashCode();
    hash = (37 * hash) + DYN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDynType());
    hash = (37 * hash) + RID_FIELD_NUMBER;
    hash = (53 * hash) + getRid().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.DynThumbReq parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.DynThumbReq prototype) {
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
   * 动态点赞-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.DynThumbReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.DynThumbReq)
      bilibili.dynamic.gateway.DynThumbReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynThumbReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynThumbReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.DynThumbReq.class, bilibili.dynamic.gateway.DynThumbReq.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.DynThumbReq.newBuilder()
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
      uid_ = 0L;
      dynId_ = "";
      dynType_ = 0L;
      rid_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_DynThumbReq_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynThumbReq getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.DynThumbReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynThumbReq build() {
      bilibili.dynamic.gateway.DynThumbReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.DynThumbReq buildPartial() {
      bilibili.dynamic.gateway.DynThumbReq result = new bilibili.dynamic.gateway.DynThumbReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.DynThumbReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uid_ = uid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dynId_ = dynId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dynType_ = dynType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rid_ = rid_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.type_ = type_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.DynThumbReq) {
        return mergeFrom((bilibili.dynamic.gateway.DynThumbReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.DynThumbReq other) {
      if (other == bilibili.dynamic.gateway.DynThumbReq.getDefaultInstance()) return this;
      if (other.getUid() != 0L) {
        setUid(other.getUid());
      }
      if (!other.getDynId().isEmpty()) {
        dynId_ = other.dynId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getDynType() != 0L) {
        setDynType(other.getDynType());
      }
      if (!other.getRid().isEmpty()) {
        rid_ = other.rid_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              uid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              dynId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              dynType_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              rid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long uid_ ;
    /**
     * <pre>
     * 用户uid
     * </pre>
     *
     * <code>int64 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public long getUid() {
      return uid_;
    }
    /**
     * <pre>
     * 用户uid
     * </pre>
     *
     * <code>int64 uid = 1;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(long value) {

      uid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户uid
     * </pre>
     *
     * <code>int64 uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dynId_ = "";
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dyn_id = 2;</code>
     * @return The dynId.
     */
    public java.lang.String getDynId() {
      java.lang.Object ref = dynId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynId_ = s;
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
     * <code>string dyn_id = 2;</code>
     * @return The bytes for dynId.
     */
    public com.google.protobuf.ByteString
        getDynIdBytes() {
      java.lang.Object ref = dynId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynId_ = b;
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
     * <code>string dyn_id = 2;</code>
     * @param value The dynId to set.
     * @return This builder for chaining.
     */
    public Builder setDynId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dynId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dyn_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynId() {
      dynId_ = getDefaultInstance().getDynId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dyn_id = 2;</code>
     * @param value The bytes for dynId to set.
     * @return This builder for chaining.
     */
    public Builder setDynIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dynId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long dynType_ ;
    /**
     * <pre>
     * 动态类型(透传extend中的dyn_type)
     * </pre>
     *
     * <code>int64 dyn_type = 3;</code>
     * @return The dynType.
     */
    @java.lang.Override
    public long getDynType() {
      return dynType_;
    }
    /**
     * <pre>
     * 动态类型(透传extend中的dyn_type)
     * </pre>
     *
     * <code>int64 dyn_type = 3;</code>
     * @param value The dynType to set.
     * @return This builder for chaining.
     */
    public Builder setDynType(long value) {

      dynType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态类型(透传extend中的dyn_type)
     * </pre>
     *
     * <code>int64 dyn_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dynType_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object rid_ = "";
    /**
     * <pre>
     * 业务方资源id
     * </pre>
     *
     * <code>string rid = 4;</code>
     * @return The rid.
     */
    public java.lang.String getRid() {
      java.lang.Object ref = rid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 业务方资源id
     * </pre>
     *
     * <code>string rid = 4;</code>
     * @return The bytes for rid.
     */
    public com.google.protobuf.ByteString
        getRidBytes() {
      java.lang.Object ref = rid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 业务方资源id
     * </pre>
     *
     * <code>string rid = 4;</code>
     * @param value The rid to set.
     * @return This builder for chaining.
     */
    public Builder setRid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务方资源id
     * </pre>
     *
     * <code>string rid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRid() {
      rid_ = getDefaultInstance().getRid();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务方资源id
     * </pre>
     *
     * <code>string rid = 4;</code>
     * @param value The bytes for rid to set.
     * @return This builder for chaining.
     */
    public Builder setRidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * 点赞类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * 点赞类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ThumbType getType() {
      bilibili.dynamic.gateway.ThumbType result = bilibili.dynamic.gateway.ThumbType.forNumber(type_);
      return result == null ? bilibili.dynamic.gateway.ThumbType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 点赞类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.dynamic.gateway.ThumbType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThumbType type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.DynThumbReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.DynThumbReq)
  private static final bilibili.dynamic.gateway.DynThumbReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.DynThumbReq();
  }

  public static bilibili.dynamic.gateway.DynThumbReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynThumbReq>
      PARSER = new com.google.protobuf.AbstractParser<DynThumbReq>() {
    @java.lang.Override
    public DynThumbReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynThumbReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynThumbReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.DynThumbReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
