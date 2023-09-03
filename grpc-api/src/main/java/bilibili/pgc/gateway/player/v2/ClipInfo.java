// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * 跳过片头/片尾配置
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v2.ClipInfo}
 */
public final class ClipInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v2.ClipInfo)
    ClipInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClipInfo.newBuilder() to construct.
  private ClipInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClipInfo() {
    clipType_ = 0;
    toastText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClipInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_ClipInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_ClipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v2.ClipInfo.class, bilibili.pgc.gateway.player.v2.ClipInfo.Builder.class);
  }

  public static final int MATERIAL_NO_FIELD_NUMBER = 1;
  private long materialNo_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 material_no = 1;</code>
   * @return The materialNo.
   */
  @java.lang.Override
  public long getMaterialNo() {
    return materialNo_;
  }

  public static final int START_FIELD_NUMBER = 2;
  private int start_ = 0;
  /**
   * <pre>
   * DASH分段始
   * </pre>
   *
   * <code>int32 start = 2;</code>
   * @return The start.
   */
  @java.lang.Override
  public int getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 3;
  private int end_ = 0;
  /**
   * <pre>
   * DASH分段终
   * </pre>
   *
   * <code>int32 end = 3;</code>
   * @return The end.
   */
  @java.lang.Override
  public int getEnd() {
    return end_;
  }

  public static final int CLIP_TYPE_FIELD_NUMBER = 4;
  private int clipType_ = 0;
  /**
   * <pre>
   * Clip类型
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
   * @return The enum numeric value on the wire for clipType.
   */
  @java.lang.Override public int getClipTypeValue() {
    return clipType_;
  }
  /**
   * <pre>
   * Clip类型
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
   * @return The clipType.
   */
  @java.lang.Override public bilibili.pgc.gateway.player.v2.ClipType getClipType() {
    bilibili.pgc.gateway.player.v2.ClipType result = bilibili.pgc.gateway.player.v2.ClipType.forNumber(clipType_);
    return result == null ? bilibili.pgc.gateway.player.v2.ClipType.UNRECOGNIZED : result;
  }

  public static final int TOAST_TEXT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toastText_ = "";
  /**
   * <pre>
   * 跳过片头/片尾时的提示语
   * </pre>
   *
   * <code>string toast_text = 5;</code>
   * @return The toastText.
   */
  @java.lang.Override
  public java.lang.String getToastText() {
    java.lang.Object ref = toastText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toastText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 跳过片头/片尾时的提示语
   * </pre>
   *
   * <code>string toast_text = 5;</code>
   * @return The bytes for toastText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToastTextBytes() {
    java.lang.Object ref = toastText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toastText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MULTI_VIEW_FIELD_NUMBER = 6;
  private bilibili.pgc.gateway.player.v2.MultiView multiView_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
   * @return Whether the multiView field is set.
   */
  @java.lang.Override
  public boolean hasMultiView() {
    return multiView_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
   * @return The multiView.
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.MultiView getMultiView() {
    return multiView_ == null ? bilibili.pgc.gateway.player.v2.MultiView.getDefaultInstance() : multiView_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.MultiViewOrBuilder getMultiViewOrBuilder() {
    return multiView_ == null ? bilibili.pgc.gateway.player.v2.MultiView.getDefaultInstance() : multiView_;
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
    if (materialNo_ != 0L) {
      output.writeInt64(1, materialNo_);
    }
    if (start_ != 0) {
      output.writeInt32(2, start_);
    }
    if (end_ != 0) {
      output.writeInt32(3, end_);
    }
    if (clipType_ != bilibili.pgc.gateway.player.v2.ClipType.NT_UNKNOWN.getNumber()) {
      output.writeEnum(4, clipType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toastText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, toastText_);
    }
    if (multiView_ != null) {
      output.writeMessage(6, getMultiView());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (materialNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, materialNo_);
    }
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, start_);
    }
    if (end_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, end_);
    }
    if (clipType_ != bilibili.pgc.gateway.player.v2.ClipType.NT_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, clipType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toastText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, toastText_);
    }
    if (multiView_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getMultiView());
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v2.ClipInfo)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v2.ClipInfo other = (bilibili.pgc.gateway.player.v2.ClipInfo) obj;

    if (getMaterialNo()
        != other.getMaterialNo()) return false;
    if (getStart()
        != other.getStart()) return false;
    if (getEnd()
        != other.getEnd()) return false;
    if (clipType_ != other.clipType_) return false;
    if (!getToastText()
        .equals(other.getToastText())) return false;
    if (hasMultiView() != other.hasMultiView()) return false;
    if (hasMultiView()) {
      if (!getMultiView()
          .equals(other.getMultiView())) return false;
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
    hash = (37 * hash) + MATERIAL_NO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaterialNo());
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd();
    hash = (37 * hash) + CLIP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + clipType_;
    hash = (37 * hash) + TOAST_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getToastText().hashCode();
    if (hasMultiView()) {
      hash = (37 * hash) + MULTI_VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getMultiView().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.ClipInfo parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v2.ClipInfo prototype) {
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
   * 跳过片头/片尾配置
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v2.ClipInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v2.ClipInfo)
      bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_ClipInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_ClipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v2.ClipInfo.class, bilibili.pgc.gateway.player.v2.ClipInfo.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v2.ClipInfo.newBuilder()
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
      materialNo_ = 0L;
      start_ = 0;
      end_ = 0;
      clipType_ = 0;
      toastText_ = "";
      multiView_ = null;
      if (multiViewBuilder_ != null) {
        multiViewBuilder_.dispose();
        multiViewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_ClipInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.ClipInfo getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v2.ClipInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.ClipInfo build() {
      bilibili.pgc.gateway.player.v2.ClipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.ClipInfo buildPartial() {
      bilibili.pgc.gateway.player.v2.ClipInfo result = new bilibili.pgc.gateway.player.v2.ClipInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v2.ClipInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.materialNo_ = materialNo_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.start_ = start_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.end_ = end_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.clipType_ = clipType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.toastText_ = toastText_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.multiView_ = multiViewBuilder_ == null
            ? multiView_
            : multiViewBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v2.ClipInfo) {
        return mergeFrom((bilibili.pgc.gateway.player.v2.ClipInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v2.ClipInfo other) {
      if (other == bilibili.pgc.gateway.player.v2.ClipInfo.getDefaultInstance()) return this;
      if (other.getMaterialNo() != 0L) {
        setMaterialNo(other.getMaterialNo());
      }
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0) {
        setEnd(other.getEnd());
      }
      if (other.clipType_ != 0) {
        setClipTypeValue(other.getClipTypeValue());
      }
      if (!other.getToastText().isEmpty()) {
        toastText_ = other.toastText_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.hasMultiView()) {
        mergeMultiView(other.getMultiView());
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
              materialNo_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              start_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              end_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              clipType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              toastText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getMultiViewFieldBuilder().getBuilder(),
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

    private long materialNo_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 material_no = 1;</code>
     * @return The materialNo.
     */
    @java.lang.Override
    public long getMaterialNo() {
      return materialNo_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 material_no = 1;</code>
     * @param value The materialNo to set.
     * @return This builder for chaining.
     */
    public Builder setMaterialNo(long value) {

      materialNo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 material_no = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaterialNo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      materialNo_ = 0L;
      onChanged();
      return this;
    }

    private int start_ ;
    /**
     * <pre>
     * DASH分段始
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @return The start.
     */
    @java.lang.Override
    public int getStart() {
      return start_;
    }
    /**
     * <pre>
     * DASH分段始
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(int value) {

      start_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DASH分段始
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      start_ = 0;
      onChanged();
      return this;
    }

    private int end_ ;
    /**
     * <pre>
     * DASH分段终
     * </pre>
     *
     * <code>int32 end = 3;</code>
     * @return The end.
     */
    @java.lang.Override
    public int getEnd() {
      return end_;
    }
    /**
     * <pre>
     * DASH分段终
     * </pre>
     *
     * <code>int32 end = 3;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(int value) {

      end_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DASH分段终
     * </pre>
     *
     * <code>int32 end = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000004);
      end_ = 0;
      onChanged();
      return this;
    }

    private int clipType_ = 0;
    /**
     * <pre>
     * Clip类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
     * @return The enum numeric value on the wire for clipType.
     */
    @java.lang.Override public int getClipTypeValue() {
      return clipType_;
    }
    /**
     * <pre>
     * Clip类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
     * @param value The enum numeric value on the wire for clipType to set.
     * @return This builder for chaining.
     */
    public Builder setClipTypeValue(int value) {
      clipType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Clip类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
     * @return The clipType.
     */
    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.ClipType getClipType() {
      bilibili.pgc.gateway.player.v2.ClipType result = bilibili.pgc.gateway.player.v2.ClipType.forNumber(clipType_);
      return result == null ? bilibili.pgc.gateway.player.v2.ClipType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Clip类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
     * @param value The clipType to set.
     * @return This builder for chaining.
     */
    public Builder setClipType(bilibili.pgc.gateway.player.v2.ClipType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      clipType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Clip类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.ClipType clip_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClipType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      clipType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object toastText_ = "";
    /**
     * <pre>
     * 跳过片头/片尾时的提示语
     * </pre>
     *
     * <code>string toast_text = 5;</code>
     * @return The toastText.
     */
    public java.lang.String getToastText() {
      java.lang.Object ref = toastText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toastText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 跳过片头/片尾时的提示语
     * </pre>
     *
     * <code>string toast_text = 5;</code>
     * @return The bytes for toastText.
     */
    public com.google.protobuf.ByteString
        getToastTextBytes() {
      java.lang.Object ref = toastText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toastText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 跳过片头/片尾时的提示语
     * </pre>
     *
     * <code>string toast_text = 5;</code>
     * @param value The toastText to set.
     * @return This builder for chaining.
     */
    public Builder setToastText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toastText_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 跳过片头/片尾时的提示语
     * </pre>
     *
     * <code>string toast_text = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearToastText() {
      toastText_ = getDefaultInstance().getToastText();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 跳过片头/片尾时的提示语
     * </pre>
     *
     * <code>string toast_text = 5;</code>
     * @param value The bytes for toastText to set.
     * @return This builder for chaining.
     */
    public Builder setToastTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toastText_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private bilibili.pgc.gateway.player.v2.MultiView multiView_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v2.MultiView, bilibili.pgc.gateway.player.v2.MultiView.Builder, bilibili.pgc.gateway.player.v2.MultiViewOrBuilder> multiViewBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     * @return Whether the multiView field is set.
     */
    public boolean hasMultiView() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     * @return The multiView.
     */
    public bilibili.pgc.gateway.player.v2.MultiView getMultiView() {
      if (multiViewBuilder_ == null) {
        return multiView_ == null ? bilibili.pgc.gateway.player.v2.MultiView.getDefaultInstance() : multiView_;
      } else {
        return multiViewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public Builder setMultiView(bilibili.pgc.gateway.player.v2.MultiView value) {
      if (multiViewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        multiView_ = value;
      } else {
        multiViewBuilder_.setMessage(value);
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
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public Builder setMultiView(
        bilibili.pgc.gateway.player.v2.MultiView.Builder builderForValue) {
      if (multiViewBuilder_ == null) {
        multiView_ = builderForValue.build();
      } else {
        multiViewBuilder_.setMessage(builderForValue.build());
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
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public Builder mergeMultiView(bilibili.pgc.gateway.player.v2.MultiView value) {
      if (multiViewBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          multiView_ != null &&
          multiView_ != bilibili.pgc.gateway.player.v2.MultiView.getDefaultInstance()) {
          getMultiViewBuilder().mergeFrom(value);
        } else {
          multiView_ = value;
        }
      } else {
        multiViewBuilder_.mergeFrom(value);
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
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public Builder clearMultiView() {
      bitField0_ = (bitField0_ & ~0x00000020);
      multiView_ = null;
      if (multiViewBuilder_ != null) {
        multiViewBuilder_.dispose();
        multiViewBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public bilibili.pgc.gateway.player.v2.MultiView.Builder getMultiViewBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getMultiViewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    public bilibili.pgc.gateway.player.v2.MultiViewOrBuilder getMultiViewOrBuilder() {
      if (multiViewBuilder_ != null) {
        return multiViewBuilder_.getMessageOrBuilder();
      } else {
        return multiView_ == null ?
            bilibili.pgc.gateway.player.v2.MultiView.getDefaultInstance() : multiView_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.MultiView multi_view = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v2.MultiView, bilibili.pgc.gateway.player.v2.MultiView.Builder, bilibili.pgc.gateway.player.v2.MultiViewOrBuilder> 
        getMultiViewFieldBuilder() {
      if (multiViewBuilder_ == null) {
        multiViewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.pgc.gateway.player.v2.MultiView, bilibili.pgc.gateway.player.v2.MultiView.Builder, bilibili.pgc.gateway.player.v2.MultiViewOrBuilder>(
                getMultiView(),
                getParentForChildren(),
                isClean());
        multiView_ = null;
      }
      return multiViewBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v2.ClipInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v2.ClipInfo)
  private static final bilibili.pgc.gateway.player.v2.ClipInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v2.ClipInfo();
  }

  public static bilibili.pgc.gateway.player.v2.ClipInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClipInfo>
      PARSER = new com.google.protobuf.AbstractParser<ClipInfo>() {
    @java.lang.Override
    public ClipInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClipInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClipInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.ClipInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

