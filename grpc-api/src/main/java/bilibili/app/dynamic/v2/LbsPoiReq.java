// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.LbsPoiReq}
 */
public final class LbsPoiReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.LbsPoiReq)
    LbsPoiReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LbsPoiReq.newBuilder() to construct.
  private LbsPoiReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LbsPoiReq() {
    poi_ = "";
    offset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LbsPoiReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.LbsPoiReq.class, bilibili.app.dynamic.v2.LbsPoiReq.Builder.class);
  }

  public static final int POI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object poi_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string poi = 1;</code>
   * @return The poi.
   */
  @java.lang.Override
  public java.lang.String getPoi() {
    java.lang.Object ref = poi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poi_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string poi = 1;</code>
   * @return The bytes for poi.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoiBytes() {
    java.lang.Object ref = poi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private long type_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public long getType() {
    return type_;
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object offset_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The offset.
   */
  @java.lang.Override
  public java.lang.String getOffset() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      offset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The bytes for offset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOffsetBytes() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      offset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFRESH_TYPE_FIELD_NUMBER = 4;
  private int refreshType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 refresh_type = 4;</code>
   * @return The refreshType.
   */
  @java.lang.Override
  public int getRefreshType() {
    return refreshType_;
  }

  public static final int LOCAL_TIME_FIELD_NUMBER = 5;
  private int localTime_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 local_time = 5;</code>
   * @return The localTime.
   */
  @java.lang.Override
  public int getLocalTime() {
    return localTime_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 6;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
   * @return Whether the playerArgs field is set.
   */
  @java.lang.Override
  public boolean hasPlayerArgs() {
    return playerArgs_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
   * @return The playerArgs.
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poi_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poi_);
    }
    if (type_ != 0L) {
      output.writeInt64(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, offset_);
    }
    if (refreshType_ != 0) {
      output.writeInt32(4, refreshType_);
    }
    if (localTime_ != 0) {
      output.writeInt32(5, localTime_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(6, getPlayerArgs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poi_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poi_);
    }
    if (type_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, offset_);
    }
    if (refreshType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, refreshType_);
    }
    if (localTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, localTime_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getPlayerArgs());
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
    if (!(obj instanceof bilibili.app.dynamic.v2.LbsPoiReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.LbsPoiReq other = (bilibili.app.dynamic.v2.LbsPoiReq) obj;

    if (!getPoi()
        .equals(other.getPoi())) return false;
    if (getType()
        != other.getType()) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getRefreshType()
        != other.getRefreshType()) return false;
    if (getLocalTime()
        != other.getLocalTime()) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
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
    hash = (37 * hash) + POI_FIELD_NUMBER;
    hash = (53 * hash) + getPoi().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getType());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + REFRESH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getRefreshType();
    hash = (37 * hash) + LOCAL_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getLocalTime();
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.LbsPoiReq prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.LbsPoiReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.LbsPoiReq)
      bilibili.app.dynamic.v2.LbsPoiReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.LbsPoiReq.class, bilibili.app.dynamic.v2.LbsPoiReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.LbsPoiReq.newBuilder()
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
      poi_ = "";
      type_ = 0L;
      offset_ = "";
      refreshType_ = 0;
      localTime_ = 0;
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.LbsPoiReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReq build() {
      bilibili.app.dynamic.v2.LbsPoiReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReq buildPartial() {
      bilibili.app.dynamic.v2.LbsPoiReq result = new bilibili.app.dynamic.v2.LbsPoiReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.LbsPoiReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poi_ = poi_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.refreshType_ = refreshType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.localTime_ = localTime_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.LbsPoiReq) {
        return mergeFrom((bilibili.app.dynamic.v2.LbsPoiReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.LbsPoiReq other) {
      if (other == bilibili.app.dynamic.v2.LbsPoiReq.getDefaultInstance()) return this;
      if (!other.getPoi().isEmpty()) {
        poi_ = other.poi_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getType() != 0L) {
        setType(other.getType());
      }
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getRefreshType() != 0) {
        setRefreshType(other.getRefreshType());
      }
      if (other.getLocalTime() != 0) {
        setLocalTime(other.getLocalTime());
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
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
              poi_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              offset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              refreshType_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              localTime_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object poi_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string poi = 1;</code>
     * @return The poi.
     */
    public java.lang.String getPoi() {
      java.lang.Object ref = poi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poi_ = s;
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
     * <code>string poi = 1;</code>
     * @return The bytes for poi.
     */
    public com.google.protobuf.ByteString
        getPoiBytes() {
      java.lang.Object ref = poi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poi_ = b;
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
     * <code>string poi = 1;</code>
     * @param value The poi to set.
     * @return This builder for chaining.
     */
    public Builder setPoi(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      poi_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string poi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoi() {
      poi_ = getDefaultInstance().getPoi();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string poi = 1;</code>
     * @param value The bytes for poi to set.
     * @return This builder for chaining.
     */
    public Builder setPoiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      poi_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long type_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public long getType() {
      return type_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(long value) {

      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object offset_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return The offset.
     */
    public java.lang.String getOffset() {
      java.lang.Object ref = offset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        offset_ = s;
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
     * <code>string offset = 3;</code>
     * @return The bytes for offset.
     */
    public com.google.protobuf.ByteString
        getOffsetBytes() {
      java.lang.Object ref = offset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        offset_ = b;
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
     * <code>string offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      offset_ = getDefaultInstance().getOffset();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @param value The bytes for offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int refreshType_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 refresh_type = 4;</code>
     * @return The refreshType.
     */
    @java.lang.Override
    public int getRefreshType() {
      return refreshType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 refresh_type = 4;</code>
     * @param value The refreshType to set.
     * @return This builder for chaining.
     */
    public Builder setRefreshType(int value) {

      refreshType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 refresh_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRefreshType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      refreshType_ = 0;
      onChanged();
      return this;
    }

    private int localTime_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 local_time = 5;</code>
     * @return The localTime.
     */
    @java.lang.Override
    public int getLocalTime() {
      return localTime_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 local_time = 5;</code>
     * @param value The localTime to set.
     * @return This builder for chaining.
     */
    public Builder setLocalTime(int value) {

      localTime_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 local_time = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalTime() {
      bitField0_ = (bitField0_ & ~0x00000010);
      localTime_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     * @return The playerArgs.
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
      if (playerArgsBuilder_ == null) {
        return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      } else {
        return playerArgsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public Builder setPlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerArgs_ = value;
      } else {
        playerArgsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000020);
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
      if (playerArgsBuilder_ != null) {
        return playerArgsBuilder_.getMessageOrBuilder();
      } else {
        return playerArgs_ == null ?
            bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> 
        getPlayerArgsFieldBuilder() {
      if (playerArgsBuilder_ == null) {
        playerArgsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder>(
                getPlayerArgs(),
                getParentForChildren(),
                isClean());
        playerArgs_ = null;
      }
      return playerArgsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.LbsPoiReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.LbsPoiReq)
  private static final bilibili.app.dynamic.v2.LbsPoiReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.LbsPoiReq();
  }

  public static bilibili.app.dynamic.v2.LbsPoiReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LbsPoiReq>
      PARSER = new com.google.protobuf.AbstractParser<LbsPoiReq>() {
    @java.lang.Override
    public LbsPoiReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<LbsPoiReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LbsPoiReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.LbsPoiReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

