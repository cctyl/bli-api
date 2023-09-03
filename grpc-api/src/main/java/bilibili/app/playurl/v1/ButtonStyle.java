// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.playurl.v1.ButtonStyle}
 */
public final class ButtonStyle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.playurl.v1.ButtonStyle)
    ButtonStyleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ButtonStyle.newBuilder() to construct.
  private ButtonStyle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ButtonStyle() {
    text_ = "";
    textColor_ = "";
    bgColor_ = "";
    jumpLink_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ButtonStyle();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_ButtonStyle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_ButtonStyle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.playurl.v1.ButtonStyle.class, bilibili.app.playurl.v1.ButtonStyle.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_COLOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object textColor_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_color = 2;</code>
   * @return The textColor.
   */
  @java.lang.Override
  public java.lang.String getTextColor() {
    java.lang.Object ref = textColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      textColor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_color = 2;</code>
   * @return The bytes for textColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextColorBytes() {
    java.lang.Object ref = textColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      textColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BG_COLOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bgColor_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string bg_color = 3;</code>
   * @return The bgColor.
   */
  @java.lang.Override
  public java.lang.String getBgColor() {
    java.lang.Object ref = bgColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bgColor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string bg_color = 3;</code>
   * @return The bytes for bgColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBgColorBytes() {
    java.lang.Object ref = bgColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bgColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JUMP_LINK_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jumpLink_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 4;</code>
   * @return The jumpLink.
   */
  @java.lang.Override
  public java.lang.String getJumpLink() {
    java.lang.Object ref = jumpLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jumpLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 4;</code>
   * @return The bytes for jumpLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJumpLinkBytes() {
    java.lang.Object ref = jumpLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jumpLink_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, textColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bgColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jumpLink_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, textColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bgColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, jumpLink_);
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
    if (!(obj instanceof bilibili.app.playurl.v1.ButtonStyle)) {
      return super.equals(obj);
    }
    bilibili.app.playurl.v1.ButtonStyle other = (bilibili.app.playurl.v1.ButtonStyle) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (!getTextColor()
        .equals(other.getTextColor())) return false;
    if (!getBgColor()
        .equals(other.getBgColor())) return false;
    if (!getJumpLink()
        .equals(other.getJumpLink())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + TEXT_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getTextColor().hashCode();
    hash = (37 * hash) + BG_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getBgColor().hashCode();
    hash = (37 * hash) + JUMP_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getJumpLink().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.ButtonStyle parseFrom(
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
  public static Builder newBuilder(bilibili.app.playurl.v1.ButtonStyle prototype) {
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
   * Protobuf type {@code bilibili.app.playurl.v1.ButtonStyle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.playurl.v1.ButtonStyle)
      bilibili.app.playurl.v1.ButtonStyleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_ButtonStyle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_ButtonStyle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.playurl.v1.ButtonStyle.class, bilibili.app.playurl.v1.ButtonStyle.Builder.class);
    }

    // Construct using bilibili.app.playurl.v1.ButtonStyle.newBuilder()
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
      text_ = "";
      textColor_ = "";
      bgColor_ = "";
      jumpLink_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_ButtonStyle_descriptor;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.ButtonStyle getDefaultInstanceForType() {
      return bilibili.app.playurl.v1.ButtonStyle.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.ButtonStyle build() {
      bilibili.app.playurl.v1.ButtonStyle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.ButtonStyle buildPartial() {
      bilibili.app.playurl.v1.ButtonStyle result = new bilibili.app.playurl.v1.ButtonStyle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.playurl.v1.ButtonStyle result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.textColor_ = textColor_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bgColor_ = bgColor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.jumpLink_ = jumpLink_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.playurl.v1.ButtonStyle) {
        return mergeFrom((bilibili.app.playurl.v1.ButtonStyle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.playurl.v1.ButtonStyle other) {
      if (other == bilibili.app.playurl.v1.ButtonStyle.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTextColor().isEmpty()) {
        textColor_ = other.textColor_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBgColor().isEmpty()) {
        bgColor_ = other.bgColor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getJumpLink().isEmpty()) {
        jumpLink_ = other.jumpLink_;
        bitField0_ |= 0x00000008;
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
            case 10: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              textColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              bgColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              jumpLink_ = input.readStringRequireUtf8();
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object textColor_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_color = 2;</code>
     * @return The textColor.
     */
    public java.lang.String getTextColor() {
      java.lang.Object ref = textColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_color = 2;</code>
     * @return The bytes for textColor.
     */
    public com.google.protobuf.ByteString
        getTextColorBytes() {
      java.lang.Object ref = textColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_color = 2;</code>
     * @param value The textColor to set.
     * @return This builder for chaining.
     */
    public Builder setTextColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      textColor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_color = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextColor() {
      textColor_ = getDefaultInstance().getTextColor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_color = 2;</code>
     * @param value The bytes for textColor to set.
     * @return This builder for chaining.
     */
    public Builder setTextColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      textColor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object bgColor_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string bg_color = 3;</code>
     * @return The bgColor.
     */
    public java.lang.String getBgColor() {
      java.lang.Object ref = bgColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bgColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string bg_color = 3;</code>
     * @return The bytes for bgColor.
     */
    public com.google.protobuf.ByteString
        getBgColorBytes() {
      java.lang.Object ref = bgColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bgColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string bg_color = 3;</code>
     * @param value The bgColor to set.
     * @return This builder for chaining.
     */
    public Builder setBgColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bgColor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string bg_color = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBgColor() {
      bgColor_ = getDefaultInstance().getBgColor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string bg_color = 3;</code>
     * @param value The bytes for bgColor to set.
     * @return This builder for chaining.
     */
    public Builder setBgColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bgColor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object jumpLink_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return The jumpLink.
     */
    public java.lang.String getJumpLink() {
      java.lang.Object ref = jumpLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jumpLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return The bytes for jumpLink.
     */
    public com.google.protobuf.ByteString
        getJumpLinkBytes() {
      java.lang.Object ref = jumpLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jumpLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @param value The jumpLink to set.
     * @return This builder for chaining.
     */
    public Builder setJumpLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jumpLink_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpLink() {
      jumpLink_ = getDefaultInstance().getJumpLink();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @param value The bytes for jumpLink to set.
     * @return This builder for chaining.
     */
    public Builder setJumpLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jumpLink_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.playurl.v1.ButtonStyle)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.playurl.v1.ButtonStyle)
  private static final bilibili.app.playurl.v1.ButtonStyle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.playurl.v1.ButtonStyle();
  }

  public static bilibili.app.playurl.v1.ButtonStyle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ButtonStyle>
      PARSER = new com.google.protobuf.AbstractParser<ButtonStyle>() {
    @java.lang.Override
    public ButtonStyle parsePartialFrom(
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

  public static com.google.protobuf.Parser<ButtonStyle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ButtonStyle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.playurl.v1.ButtonStyle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

