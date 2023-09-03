// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 空间页动态-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DynSpaceReq}
 */
public final class DynSpaceReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DynSpaceReq)
    DynSpaceReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynSpaceReq.newBuilder() to construct.
  private DynSpaceReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynSpaceReq() {
    historyOffset_ = "";
    from_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynSpaceReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.DynSpaceReq.class, bilibili.app.dynamic.v2.DynSpaceReq.Builder.class);
  }

  public static final int HOST_UID_FIELD_NUMBER = 1;
  private long hostUid_ = 0L;
  /**
   * <pre>
   * 被访问者，也就是空间主人的uid
   * </pre>
   *
   * <code>int64 host_uid = 1;</code>
   * @return The hostUid.
   */
  @java.lang.Override
  public long getHostUid() {
    return hostUid_;
  }

  public static final int HISTORY_OFFSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object historyOffset_ = "";
  /**
   * <pre>
   * 动态偏移history_offset
   * </pre>
   *
   * <code>string history_offset = 2;</code>
   * @return The historyOffset.
   */
  @java.lang.Override
  public java.lang.String getHistoryOffset() {
    java.lang.Object ref = historyOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      historyOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态偏移history_offset
   * </pre>
   *
   * <code>string history_offset = 2;</code>
   * @return The bytes for historyOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHistoryOffsetBytes() {
    java.lang.Object ref = historyOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      historyOffset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 3;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return Whether the playerArgs field is set.
   */
  @java.lang.Override
  public boolean hasPlayerArgs() {
    return playerArgs_ != null;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return The playerArgs.
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }

  public static final int LOCAL_TIME_FIELD_NUMBER = 4;
  private int localTime_ = 0;
  /**
   * <pre>
   * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
   * </pre>
   *
   * <code>int32 local_time = 4;</code>
   * @return The localTime.
   */
  @java.lang.Override
  public int getLocalTime() {
    return localTime_;
  }

  public static final int PAGE_FIELD_NUMBER = 5;
  private long page_ = 0L;
  /**
   * <pre>
   * 向下翻页数，默认从1开始
   * </pre>
   *
   * <code>int64 page = 5;</code>
   * @return The page.
   */
  @java.lang.Override
  public long getPage() {
    return page_;
  }

  public static final int FROM_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <pre>
   * 来源，空间页：space，直播tab：live
   * </pre>
   *
   * <code>string from = 6;</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 来源，空间页：space，直播tab：live
   * </pre>
   *
   * <code>string from = 6;</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
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
    if (hostUid_ != 0L) {
      output.writeInt64(1, hostUid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(historyOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, historyOffset_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(3, getPlayerArgs());
    }
    if (localTime_ != 0) {
      output.writeInt32(4, localTime_);
    }
    if (page_ != 0L) {
      output.writeInt64(5, page_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, from_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hostUid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hostUid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(historyOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, historyOffset_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlayerArgs());
    }
    if (localTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, localTime_);
    }
    if (page_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, page_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, from_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.DynSpaceReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.DynSpaceReq other = (bilibili.app.dynamic.v2.DynSpaceReq) obj;

    if (getHostUid()
        != other.getHostUid()) return false;
    if (!getHistoryOffset()
        .equals(other.getHistoryOffset())) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
    }
    if (getLocalTime()
        != other.getLocalTime()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (!getFrom()
        .equals(other.getFrom())) return false;
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
    hash = (37 * hash) + HOST_UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHostUid());
    hash = (37 * hash) + HISTORY_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getHistoryOffset().hashCode();
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (37 * hash) + LOCAL_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getLocalTime();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPage());
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.DynSpaceReq prototype) {
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
   * 空间页动态-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.DynSpaceReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DynSpaceReq)
      bilibili.app.dynamic.v2.DynSpaceReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.DynSpaceReq.class, bilibili.app.dynamic.v2.DynSpaceReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.DynSpaceReq.newBuilder()
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
      hostUid_ = 0L;
      historyOffset_ = "";
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      localTime_ = 0;
      page_ = 0L;
      from_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.DynSpaceReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceReq build() {
      bilibili.app.dynamic.v2.DynSpaceReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceReq buildPartial() {
      bilibili.app.dynamic.v2.DynSpaceReq result = new bilibili.app.dynamic.v2.DynSpaceReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.DynSpaceReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostUid_ = hostUid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.historyOffset_ = historyOffset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.localTime_ = localTime_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.from_ = from_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.DynSpaceReq) {
        return mergeFrom((bilibili.app.dynamic.v2.DynSpaceReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.DynSpaceReq other) {
      if (other == bilibili.app.dynamic.v2.DynSpaceReq.getDefaultInstance()) return this;
      if (other.getHostUid() != 0L) {
        setHostUid(other.getHostUid());
      }
      if (!other.getHistoryOffset().isEmpty()) {
        historyOffset_ = other.historyOffset_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
      }
      if (other.getLocalTime() != 0) {
        setLocalTime(other.getLocalTime());
      }
      if (other.getPage() != 0L) {
        setPage(other.getPage());
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000020;
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
              hostUid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              historyOffset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              localTime_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              page_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              from_ = input.readStringRequireUtf8();
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

    private long hostUid_ ;
    /**
     * <pre>
     * 被访问者，也就是空间主人的uid
     * </pre>
     *
     * <code>int64 host_uid = 1;</code>
     * @return The hostUid.
     */
    @java.lang.Override
    public long getHostUid() {
      return hostUid_;
    }
    /**
     * <pre>
     * 被访问者，也就是空间主人的uid
     * </pre>
     *
     * <code>int64 host_uid = 1;</code>
     * @param value The hostUid to set.
     * @return This builder for chaining.
     */
    public Builder setHostUid(long value) {

      hostUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 被访问者，也就是空间主人的uid
     * </pre>
     *
     * <code>int64 host_uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostUid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hostUid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object historyOffset_ = "";
    /**
     * <pre>
     * 动态偏移history_offset
     * </pre>
     *
     * <code>string history_offset = 2;</code>
     * @return The historyOffset.
     */
    public java.lang.String getHistoryOffset() {
      java.lang.Object ref = historyOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        historyOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 动态偏移history_offset
     * </pre>
     *
     * <code>string history_offset = 2;</code>
     * @return The bytes for historyOffset.
     */
    public com.google.protobuf.ByteString
        getHistoryOffsetBytes() {
      java.lang.Object ref = historyOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        historyOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 动态偏移history_offset
     * </pre>
     *
     * <code>string history_offset = 2;</code>
     * @param value The historyOffset to set.
     * @return This builder for chaining.
     */
    public Builder setHistoryOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      historyOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态偏移history_offset
     * </pre>
     *
     * <code>string history_offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHistoryOffset() {
      historyOffset_ = getDefaultInstance().getHistoryOffset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态偏移history_offset
     * </pre>
     *
     * <code>string history_offset = 2;</code>
     * @param value The bytes for historyOffset to set.
     * @return This builder for chaining.
     */
    public Builder setHistoryOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      historyOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
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
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
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
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
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

    private int localTime_ ;
    /**
     * <pre>
     * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @return The localTime.
     */
    @java.lang.Override
    public int getLocalTime() {
      return localTime_;
    }
    /**
     * <pre>
     * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @param value The localTime to set.
     * @return This builder for chaining.
     */
    public Builder setLocalTime(int value) {

      localTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      localTime_ = 0;
      onChanged();
      return this;
    }

    private long page_ ;
    /**
     * <pre>
     * 向下翻页数，默认从1开始
     * </pre>
     *
     * <code>int64 page = 5;</code>
     * @return The page.
     */
    @java.lang.Override
    public long getPage() {
      return page_;
    }
    /**
     * <pre>
     * 向下翻页数，默认从1开始
     * </pre>
     *
     * <code>int64 page = 5;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(long value) {

      page_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 向下翻页数，默认从1开始
     * </pre>
     *
     * <code>int64 page = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000010);
      page_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <pre>
     * 来源，空间页：space，直播tab：live
     * </pre>
     *
     * <code>string from = 6;</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 来源，空间页：space，直播tab：live
     * </pre>
     *
     * <code>string from = 6;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 来源，空间页：space，直播tab：live
     * </pre>
     *
     * <code>string from = 6;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 来源，空间页：space，直播tab：live
     * </pre>
     *
     * <code>string from = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 来源，空间页：space，直播tab：live
     * </pre>
     *
     * <code>string from = 6;</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DynSpaceReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DynSpaceReq)
  private static final bilibili.app.dynamic.v2.DynSpaceReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.DynSpaceReq();
  }

  public static bilibili.app.dynamic.v2.DynSpaceReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynSpaceReq>
      PARSER = new com.google.protobuf.AbstractParser<DynSpaceReq>() {
    @java.lang.Override
    public DynSpaceReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynSpaceReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynSpaceReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.DynSpaceReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

