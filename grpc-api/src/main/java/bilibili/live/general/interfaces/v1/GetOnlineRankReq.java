// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/live/general/interfaces/v1/interfaces.proto

package bilibili.live.general.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.live.general.interfaces.v1.GetOnlineRankReq}
 */
public final class GetOnlineRankReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.live.general.interfaces.v1.GetOnlineRankReq)
    GetOnlineRankReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOnlineRankReq.newBuilder() to construct.
  private GetOnlineRankReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOnlineRankReq() {
    platform_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOnlineRankReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.live.general.interfaces.v1.Interfaces.internal_static_bilibili_live_general_interfaces_v1_GetOnlineRankReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.live.general.interfaces.v1.Interfaces.internal_static_bilibili_live_general_interfaces_v1_GetOnlineRankReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.live.general.interfaces.v1.GetOnlineRankReq.class, bilibili.live.general.interfaces.v1.GetOnlineRankReq.Builder.class);
  }

  public static final int RUID_FIELD_NUMBER = 1;
  private long ruid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ruid = 1;</code>
   * @return The ruid.
   */
  @java.lang.Override
  public long getRuid() {
    return ruid_;
  }

  public static final int ROOM_ID_FIELD_NUMBER = 2;
  private long roomId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_id = 2;</code>
   * @return The roomId.
   */
  @java.lang.Override
  public long getRoomId() {
    return roomId_;
  }

  public static final int PAGE_FIELD_NUMBER = 3;
  private long page_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page = 3;</code>
   * @return The page.
   */
  @java.lang.Override
  public long getPage() {
    return page_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private long pageSize_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page_size = 4;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int PLATFORM_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object platform_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 5;</code>
   * @return The platform.
   */
  @java.lang.Override
  public java.lang.String getPlatform() {
    java.lang.Object ref = platform_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      platform_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 5;</code>
   * @return The bytes for platform.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlatformBytes() {
    java.lang.Object ref = platform_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      platform_ = b;
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
    if (ruid_ != 0L) {
      output.writeInt64(1, ruid_);
    }
    if (roomId_ != 0L) {
      output.writeInt64(2, roomId_);
    }
    if (page_ != 0L) {
      output.writeInt64(3, page_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(platform_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, platform_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ruid_);
    }
    if (roomId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, roomId_);
    }
    if (page_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, page_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(platform_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, platform_);
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
    if (!(obj instanceof bilibili.live.general.interfaces.v1.GetOnlineRankReq)) {
      return super.equals(obj);
    }
    bilibili.live.general.interfaces.v1.GetOnlineRankReq other = (bilibili.live.general.interfaces.v1.GetOnlineRankReq) obj;

    if (getRuid()
        != other.getRuid()) return false;
    if (getRoomId()
        != other.getRoomId()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPlatform()
        .equals(other.getPlatform())) return false;
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
    hash = (37 * hash) + RUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRuid());
    hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoomId());
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPage());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + getPlatform().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq parseFrom(
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
  public static Builder newBuilder(bilibili.live.general.interfaces.v1.GetOnlineRankReq prototype) {
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
   * Protobuf type {@code bilibili.live.general.interfaces.v1.GetOnlineRankReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.live.general.interfaces.v1.GetOnlineRankReq)
      bilibili.live.general.interfaces.v1.GetOnlineRankReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.live.general.interfaces.v1.Interfaces.internal_static_bilibili_live_general_interfaces_v1_GetOnlineRankReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.live.general.interfaces.v1.Interfaces.internal_static_bilibili_live_general_interfaces_v1_GetOnlineRankReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.live.general.interfaces.v1.GetOnlineRankReq.class, bilibili.live.general.interfaces.v1.GetOnlineRankReq.Builder.class);
    }

    // Construct using bilibili.live.general.interfaces.v1.GetOnlineRankReq.newBuilder()
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
      ruid_ = 0L;
      roomId_ = 0L;
      page_ = 0L;
      pageSize_ = 0L;
      platform_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.live.general.interfaces.v1.Interfaces.internal_static_bilibili_live_general_interfaces_v1_GetOnlineRankReq_descriptor;
    }

    @java.lang.Override
    public bilibili.live.general.interfaces.v1.GetOnlineRankReq getDefaultInstanceForType() {
      return bilibili.live.general.interfaces.v1.GetOnlineRankReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.live.general.interfaces.v1.GetOnlineRankReq build() {
      bilibili.live.general.interfaces.v1.GetOnlineRankReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.live.general.interfaces.v1.GetOnlineRankReq buildPartial() {
      bilibili.live.general.interfaces.v1.GetOnlineRankReq result = new bilibili.live.general.interfaces.v1.GetOnlineRankReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.live.general.interfaces.v1.GetOnlineRankReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruid_ = ruid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.roomId_ = roomId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.platform_ = platform_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.live.general.interfaces.v1.GetOnlineRankReq) {
        return mergeFrom((bilibili.live.general.interfaces.v1.GetOnlineRankReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.live.general.interfaces.v1.GetOnlineRankReq other) {
      if (other == bilibili.live.general.interfaces.v1.GetOnlineRankReq.getDefaultInstance()) return this;
      if (other.getRuid() != 0L) {
        setRuid(other.getRuid());
      }
      if (other.getRoomId() != 0L) {
        setRoomId(other.getRoomId());
      }
      if (other.getPage() != 0L) {
        setPage(other.getPage());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPlatform().isEmpty()) {
        platform_ = other.platform_;
        bitField0_ |= 0x00000010;
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
              ruid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              roomId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              page_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              pageSize_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              platform_ = input.readStringRequireUtf8();
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

    private long ruid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ruid = 1;</code>
     * @return The ruid.
     */
    @java.lang.Override
    public long getRuid() {
      return ruid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ruid = 1;</code>
     * @param value The ruid to set.
     * @return This builder for chaining.
     */
    public Builder setRuid(long value) {

      ruid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ruid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRuid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ruid_ = 0L;
      onChanged();
      return this;
    }

    private long roomId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 2;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 2;</code>
     * @param value The roomId to set.
     * @return This builder for chaining.
     */
    public Builder setRoomId(long value) {

      roomId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoomId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      roomId_ = 0L;
      onChanged();
      return this;
    }

    private long page_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page = 3;</code>
     * @return The page.
     */
    @java.lang.Override
    public long getPage() {
      return page_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page = 3;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(long value) {

      page_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      page_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page_size = 4;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page_size = 4;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {

      pageSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 page_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object platform_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string platform = 5;</code>
     * @return The platform.
     */
    public java.lang.String getPlatform() {
      java.lang.Object ref = platform_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        platform_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string platform = 5;</code>
     * @return The bytes for platform.
     */
    public com.google.protobuf.ByteString
        getPlatformBytes() {
      java.lang.Object ref = platform_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        platform_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string platform = 5;</code>
     * @param value The platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatform(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      platform_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string platform = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatform() {
      platform_ = getDefaultInstance().getPlatform();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string platform = 5;</code>
     * @param value The bytes for platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      platform_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:bilibili.live.general.interfaces.v1.GetOnlineRankReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.live.general.interfaces.v1.GetOnlineRankReq)
  private static final bilibili.live.general.interfaces.v1.GetOnlineRankReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.live.general.interfaces.v1.GetOnlineRankReq();
  }

  public static bilibili.live.general.interfaces.v1.GetOnlineRankReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOnlineRankReq>
      PARSER = new com.google.protobuf.AbstractParser<GetOnlineRankReq>() {
    @java.lang.Override
    public GetOnlineRankReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOnlineRankReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOnlineRankReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.live.general.interfaces.v1.GetOnlineRankReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
