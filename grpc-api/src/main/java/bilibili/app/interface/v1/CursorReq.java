// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 获取历史记录列表(旧版)-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.CursorReq}
 */
public final class CursorReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.CursorReq)
    CursorReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CursorReq.newBuilder() to construct.
  private CursorReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CursorReq() {
    business_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CursorReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CursorReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CursorReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.CursorReq.class, bilibili.app.interface.v1.CursorReq.Builder.class);
  }

  public static final int CURSOR_FIELD_NUMBER = 1;
  private bilibili.app.interface.v1.Cursor cursor_;
  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return cursor_ != null;
  }
  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   * @return The cursor.
   */
  @java.lang.Override
  public bilibili.app.interface.v1.Cursor getCursor() {
    return cursor_ == null ? bilibili.app.interface.v1.Cursor.getDefaultInstance() : cursor_;
  }
  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.CursorOrBuilder getCursorOrBuilder() {
    return cursor_ == null ? bilibili.app.interface.v1.Cursor.getDefaultInstance() : cursor_;
  }

  public static final int BUSINESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object business_ = "";
  /**
   * <pre>
   * 业务类型
   * all:全部 archive:视频 live:直播 article:专栏
   * </pre>
   *
   * <code>string business = 2;</code>
   * @return The business.
   */
  @java.lang.Override
  public java.lang.String getBusiness() {
    java.lang.Object ref = business_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      business_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 业务类型
   * all:全部 archive:视频 live:直播 article:专栏
   * </pre>
   *
   * <code>string business = 2;</code>
   * @return The bytes for business.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBusinessBytes() {
    java.lang.Object ref = business_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      business_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_PRELOAD_FIELD_NUMBER = 3;
  private bilibili.app.interface.v1.PlayerPreloadParams playerPreload_;
  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   * @return Whether the playerPreload field is set.
   */
  @java.lang.Override
  public boolean hasPlayerPreload() {
    return playerPreload_ != null;
  }
  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   * @return The playerPreload.
   */
  @java.lang.Override
  public bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload() {
    return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
  }
  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder() {
    return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 4;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
    if (cursor_ != null) {
      output.writeMessage(1, getCursor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(business_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, business_);
    }
    if (playerPreload_ != null) {
      output.writeMessage(3, getPlayerPreload());
    }
    if (playerArgs_ != null) {
      output.writeMessage(4, getPlayerArgs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cursor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCursor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(business_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, business_);
    }
    if (playerPreload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlayerPreload());
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPlayerArgs());
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
    if (!(obj instanceof bilibili.app.interface.v1.CursorReq)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.CursorReq other = (bilibili.app.interface.v1.CursorReq) obj;

    if (hasCursor() != other.hasCursor()) return false;
    if (hasCursor()) {
      if (!getCursor()
          .equals(other.getCursor())) return false;
    }
    if (!getBusiness()
        .equals(other.getBusiness())) return false;
    if (hasPlayerPreload() != other.hasPlayerPreload()) return false;
    if (hasPlayerPreload()) {
      if (!getPlayerPreload()
          .equals(other.getPlayerPreload())) return false;
    }
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
    if (hasCursor()) {
      hash = (37 * hash) + CURSOR_FIELD_NUMBER;
      hash = (53 * hash) + getCursor().hashCode();
    }
    hash = (37 * hash) + BUSINESS_FIELD_NUMBER;
    hash = (53 * hash) + getBusiness().hashCode();
    if (hasPlayerPreload()) {
      hash = (37 * hash) + PLAYER_PRELOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerPreload().hashCode();
    }
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.CursorReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CursorReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CursorReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CursorReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.CursorReq prototype) {
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
   * 获取历史记录列表(旧版)-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.CursorReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.CursorReq)
      bilibili.app.interface.v1.CursorReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CursorReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CursorReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.CursorReq.class, bilibili.app.interface.v1.CursorReq.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.CursorReq.newBuilder()
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
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      business_ = "";
      playerPreload_ = null;
      if (playerPreloadBuilder_ != null) {
        playerPreloadBuilder_.dispose();
        playerPreloadBuilder_ = null;
      }
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
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CursorReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CursorReq getDefaultInstanceForType() {
      return bilibili.app.interface.v1.CursorReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CursorReq build() {
      bilibili.app.interface.v1.CursorReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CursorReq buildPartial() {
      bilibili.app.interface.v1.CursorReq result = new bilibili.app.interface.v1.CursorReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.CursorReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cursor_ = cursorBuilder_ == null
            ? cursor_
            : cursorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.business_ = business_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.playerPreload_ = playerPreloadBuilder_ == null
            ? playerPreload_
            : playerPreloadBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.CursorReq) {
        return mergeFrom((bilibili.app.interface.v1.CursorReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.CursorReq other) {
      if (other == bilibili.app.interface.v1.CursorReq.getDefaultInstance()) return this;
      if (other.hasCursor()) {
        mergeCursor(other.getCursor());
      }
      if (!other.getBusiness().isEmpty()) {
        business_ = other.business_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPlayerPreload()) {
        mergePlayerPreload(other.getPlayerPreload());
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
              input.readMessage(
                  getCursorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              business_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPlayerPreloadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private bilibili.app.interface.v1.Cursor cursor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.Cursor, bilibili.app.interface.v1.Cursor.Builder, bilibili.app.interface.v1.CursorOrBuilder> cursorBuilder_;
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     * @return Whether the cursor field is set.
     */
    public boolean hasCursor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     * @return The cursor.
     */
    public bilibili.app.interface.v1.Cursor getCursor() {
      if (cursorBuilder_ == null) {
        return cursor_ == null ? bilibili.app.interface.v1.Cursor.getDefaultInstance() : cursor_;
      } else {
        return cursorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(bilibili.app.interface.v1.Cursor value) {
      if (cursorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cursor_ = value;
      } else {
        cursorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(
        bilibili.app.interface.v1.Cursor.Builder builderForValue) {
      if (cursorBuilder_ == null) {
        cursor_ = builderForValue.build();
      } else {
        cursorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public Builder mergeCursor(bilibili.app.interface.v1.Cursor value) {
      if (cursorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cursor_ != null &&
          cursor_ != bilibili.app.interface.v1.Cursor.getDefaultInstance()) {
          getCursorBuilder().mergeFrom(value);
        } else {
          cursor_ = value;
        }
      } else {
        cursorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public Builder clearCursor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public bilibili.app.interface.v1.Cursor.Builder getCursorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCursorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    public bilibili.app.interface.v1.CursorOrBuilder getCursorOrBuilder() {
      if (cursorBuilder_ != null) {
        return cursorBuilder_.getMessageOrBuilder();
      } else {
        return cursor_ == null ?
            bilibili.app.interface.v1.Cursor.getDefaultInstance() : cursor_;
      }
    }
    /**
     * <pre>
     * 游标信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.Cursor, bilibili.app.interface.v1.Cursor.Builder, bilibili.app.interface.v1.CursorOrBuilder> 
        getCursorFieldBuilder() {
      if (cursorBuilder_ == null) {
        cursorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.interface.v1.Cursor, bilibili.app.interface.v1.Cursor.Builder, bilibili.app.interface.v1.CursorOrBuilder>(
                getCursor(),
                getParentForChildren(),
                isClean());
        cursor_ = null;
      }
      return cursorBuilder_;
    }

    private java.lang.Object business_ = "";
    /**
     * <pre>
     * 业务类型
     * all:全部 archive:视频 live:直播 article:专栏
     * </pre>
     *
     * <code>string business = 2;</code>
     * @return The business.
     */
    public java.lang.String getBusiness() {
      java.lang.Object ref = business_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        business_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 业务类型
     * all:全部 archive:视频 live:直播 article:专栏
     * </pre>
     *
     * <code>string business = 2;</code>
     * @return The bytes for business.
     */
    public com.google.protobuf.ByteString
        getBusinessBytes() {
      java.lang.Object ref = business_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        business_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 业务类型
     * all:全部 archive:视频 live:直播 article:专栏
     * </pre>
     *
     * <code>string business = 2;</code>
     * @param value The business to set.
     * @return This builder for chaining.
     */
    public Builder setBusiness(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      business_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型
     * all:全部 archive:视频 live:直播 article:专栏
     * </pre>
     *
     * <code>string business = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBusiness() {
      business_ = getDefaultInstance().getBusiness();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型
     * all:全部 archive:视频 live:直播 article:专栏
     * </pre>
     *
     * <code>string business = 2;</code>
     * @param value The bytes for business to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      business_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private bilibili.app.interface.v1.PlayerPreloadParams playerPreload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder> playerPreloadBuilder_;
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     * @return Whether the playerPreload field is set.
     */
    public boolean hasPlayerPreload() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     * @return The playerPreload.
     */
    public bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload() {
      if (playerPreloadBuilder_ == null) {
        return playerPreload_ == null ? bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
      } else {
        return playerPreloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public Builder setPlayerPreload(bilibili.app.interface.v1.PlayerPreloadParams value) {
      if (playerPreloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerPreload_ = value;
      } else {
        playerPreloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public Builder setPlayerPreload(
        bilibili.app.interface.v1.PlayerPreloadParams.Builder builderForValue) {
      if (playerPreloadBuilder_ == null) {
        playerPreload_ = builderForValue.build();
      } else {
        playerPreloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public Builder mergePlayerPreload(bilibili.app.interface.v1.PlayerPreloadParams value) {
      if (playerPreloadBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          playerPreload_ != null &&
          playerPreload_ != bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance()) {
          getPlayerPreloadBuilder().mergeFrom(value);
        } else {
          playerPreload_ = value;
        }
      } else {
        playerPreloadBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public Builder clearPlayerPreload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      playerPreload_ = null;
      if (playerPreloadBuilder_ != null) {
        playerPreloadBuilder_.dispose();
        playerPreloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public bilibili.app.interface.v1.PlayerPreloadParams.Builder getPlayerPreloadBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPlayerPreloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    public bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder() {
      if (playerPreloadBuilder_ != null) {
        return playerPreloadBuilder_.getMessageOrBuilder();
      } else {
        return playerPreload_ == null ?
            bilibili.app.interface.v1.PlayerPreloadParams.getDefaultInstance() : playerPreload_;
      }
    }
    /**
     * <pre>
     * 秒开参数(旧版)
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder> 
        getPlayerPreloadFieldBuilder() {
      if (playerPreloadBuilder_ == null) {
        playerPreloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.interface.v1.PlayerPreloadParams, bilibili.app.interface.v1.PlayerPreloadParams.Builder, bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder>(
                getPlayerPreload(),
                getParentForChildren(),
                isClean());
        playerPreload_ = null;
      }
      return playerPreloadBuilder_;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000008);
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.CursorReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.CursorReq)
  private static final bilibili.app.interface.v1.CursorReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.CursorReq();
  }

  public static bilibili.app.interface.v1.CursorReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CursorReq>
      PARSER = new com.google.protobuf.AbstractParser<CursorReq>() {
    @java.lang.Override
    public CursorReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CursorReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CursorReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.CursorReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

