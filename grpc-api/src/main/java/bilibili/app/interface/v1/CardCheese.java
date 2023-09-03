// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 课程卡片
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.CardCheese}
 */
public final class CardCheese extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.CardCheese)
    CardCheeseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardCheese.newBuilder() to construct.
  private CardCheese(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardCheese() {
    cover_ = "";
    subtitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardCheese();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CardCheese_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CardCheese_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.CardCheese.class, bilibili.app.interface.v1.CardCheese.Builder.class);
  }

  public static final int COVER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cover_ = "";
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 1;</code>
   * @return The cover.
   */
  @java.lang.Override
  public java.lang.String getCover() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cover_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 1;</code>
   * @return The bytes for cover.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoverBytes() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cover_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROGRESS_FIELD_NUMBER = 2;
  private long progress_ = 0L;
  /**
   * <pre>
   * 观看进度
   * </pre>
   *
   * <code>int64 progress = 2;</code>
   * @return The progress.
   */
  @java.lang.Override
  public long getProgress() {
    return progress_;
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private long duration_ = 0L;
  /**
   * <pre>
   * 总计时长
   * </pre>
   *
   * <code>int64 duration = 3;</code>
   * @return The duration.
   */
  @java.lang.Override
  public long getDuration() {
    return duration_;
  }

  public static final int SUBTITLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subtitle_ = "";
  /**
   * <pre>
   * 单集标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The subtitle.
   */
  @java.lang.Override
  public java.lang.String getSubtitle() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subtitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 单集标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The bytes for subtitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubtitleBytes() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subtitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 5;
  private long state_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 state = 5;</code>
   * @return The state.
   */
  @java.lang.Override
  public long getState() {
    return state_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cover_);
    }
    if (progress_ != 0L) {
      output.writeInt64(2, progress_);
    }
    if (duration_ != 0L) {
      output.writeInt64(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subtitle_);
    }
    if (state_ != 0L) {
      output.writeInt64(5, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cover_);
    }
    if (progress_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, progress_);
    }
    if (duration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subtitle_);
    }
    if (state_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, state_);
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
    if (!(obj instanceof bilibili.app.interface.v1.CardCheese)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.CardCheese other = (bilibili.app.interface.v1.CardCheese) obj;

    if (!getCover()
        .equals(other.getCover())) return false;
    if (getProgress()
        != other.getProgress()) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (!getSubtitle()
        .equals(other.getSubtitle())) return false;
    if (getState()
        != other.getState()) return false;
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
    hash = (37 * hash) + COVER_FIELD_NUMBER;
    hash = (53 * hash) + getCover().hashCode();
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProgress());
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDuration());
    hash = (37 * hash) + SUBTITLE_FIELD_NUMBER;
    hash = (53 * hash) + getSubtitle().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getState());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.CardCheese parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CardCheese parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CardCheese parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.CardCheese parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.CardCheese prototype) {
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
   * 课程卡片
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.CardCheese}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.CardCheese)
      bilibili.app.interface.v1.CardCheeseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CardCheese_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CardCheese_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.CardCheese.class, bilibili.app.interface.v1.CardCheese.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.CardCheese.newBuilder()
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
      cover_ = "";
      progress_ = 0L;
      duration_ = 0L;
      subtitle_ = "";
      state_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_CardCheese_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CardCheese getDefaultInstanceForType() {
      return bilibili.app.interface.v1.CardCheese.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CardCheese build() {
      bilibili.app.interface.v1.CardCheese result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.CardCheese buildPartial() {
      bilibili.app.interface.v1.CardCheese result = new bilibili.app.interface.v1.CardCheese(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.CardCheese result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cover_ = cover_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progress_ = progress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.duration_ = duration_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subtitle_ = subtitle_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.state_ = state_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.CardCheese) {
        return mergeFrom((bilibili.app.interface.v1.CardCheese)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.CardCheese other) {
      if (other == bilibili.app.interface.v1.CardCheese.getDefaultInstance()) return this;
      if (!other.getCover().isEmpty()) {
        cover_ = other.cover_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getProgress() != 0L) {
        setProgress(other.getProgress());
      }
      if (other.getDuration() != 0L) {
        setDuration(other.getDuration());
      }
      if (!other.getSubtitle().isEmpty()) {
        subtitle_ = other.subtitle_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getState() != 0L) {
        setState(other.getState());
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
              cover_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              progress_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              duration_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              subtitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              state_ = input.readInt64();
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

    private java.lang.Object cover_ = "";
    /**
     * <pre>
     * 封面url
     * </pre>
     *
     * <code>string cover = 1;</code>
     * @return The cover.
     */
    public java.lang.String getCover() {
      java.lang.Object ref = cover_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cover_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 封面url
     * </pre>
     *
     * <code>string cover = 1;</code>
     * @return The bytes for cover.
     */
    public com.google.protobuf.ByteString
        getCoverBytes() {
      java.lang.Object ref = cover_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cover_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 封面url
     * </pre>
     *
     * <code>string cover = 1;</code>
     * @param value The cover to set.
     * @return This builder for chaining.
     */
    public Builder setCover(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cover_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 封面url
     * </pre>
     *
     * <code>string cover = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCover() {
      cover_ = getDefaultInstance().getCover();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 封面url
     * </pre>
     *
     * <code>string cover = 1;</code>
     * @param value The bytes for cover to set.
     * @return This builder for chaining.
     */
    public Builder setCoverBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cover_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long progress_ ;
    /**
     * <pre>
     * 观看进度
     * </pre>
     *
     * <code>int64 progress = 2;</code>
     * @return The progress.
     */
    @java.lang.Override
    public long getProgress() {
      return progress_;
    }
    /**
     * <pre>
     * 观看进度
     * </pre>
     *
     * <code>int64 progress = 2;</code>
     * @param value The progress to set.
     * @return This builder for chaining.
     */
    public Builder setProgress(long value) {

      progress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 观看进度
     * </pre>
     *
     * <code>int64 progress = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      progress_ = 0L;
      onChanged();
      return this;
    }

    private long duration_ ;
    /**
     * <pre>
     * 总计时长
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @return The duration.
     */
    @java.lang.Override
    public long getDuration() {
      return duration_;
    }
    /**
     * <pre>
     * 总计时长
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(long value) {

      duration_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 总计时长
     * </pre>
     *
     * <code>int64 duration = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      duration_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subtitle_ = "";
    /**
     * <pre>
     * 单集标题
     * </pre>
     *
     * <code>string subtitle = 4;</code>
     * @return The subtitle.
     */
    public java.lang.String getSubtitle() {
      java.lang.Object ref = subtitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subtitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 单集标题
     * </pre>
     *
     * <code>string subtitle = 4;</code>
     * @return The bytes for subtitle.
     */
    public com.google.protobuf.ByteString
        getSubtitleBytes() {
      java.lang.Object ref = subtitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subtitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 单集标题
     * </pre>
     *
     * <code>string subtitle = 4;</code>
     * @param value The subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subtitle_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 单集标题
     * </pre>
     *
     * <code>string subtitle = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubtitle() {
      subtitle_ = getDefaultInstance().getSubtitle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 单集标题
     * </pre>
     *
     * <code>string subtitle = 4;</code>
     * @param value The bytes for subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subtitle_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long state_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @return The state.
     */
    @java.lang.Override
    public long getState() {
      return state_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(long value) {

      state_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000010);
      state_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.CardCheese)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.CardCheese)
  private static final bilibili.app.interface.v1.CardCheese DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.CardCheese();
  }

  public static bilibili.app.interface.v1.CardCheese getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardCheese>
      PARSER = new com.google.protobuf.AbstractParser<CardCheese>() {
    @java.lang.Override
    public CardCheese parsePartialFrom(
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

  public static com.google.protobuf.Parser<CardCheese> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardCheese> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.CardCheese getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

