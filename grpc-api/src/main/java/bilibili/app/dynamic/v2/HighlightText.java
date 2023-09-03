// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 高亮文本
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.HighlightText}
 */
public final class HighlightText extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.HighlightText)
    HighlightTextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HighlightText.newBuilder() to construct.
  private HighlightText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HighlightText() {
    text_ = "";
    textStyle_ = 0;
    jumpUrl_ = "";
    icon_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HighlightText();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HighlightText_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HighlightText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.HighlightText.class, bilibili.app.dynamic.v2.HighlightText.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * 展示文本
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
   * 展示文本
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

  public static final int TEXT_STYLE_FIELD_NUMBER = 2;
  private int textStyle_ = 0;
  /**
   * <pre>
   * 高亮类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
   * @return The enum numeric value on the wire for textStyle.
   */
  @java.lang.Override public int getTextStyleValue() {
    return textStyle_;
  }
  /**
   * <pre>
   * 高亮类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
   * @return The textStyle.
   */
  @java.lang.Override public bilibili.app.dynamic.v2.HighlightTextStyle getTextStyle() {
    bilibili.app.dynamic.v2.HighlightTextStyle result = bilibili.app.dynamic.v2.HighlightTextStyle.forNumber(textStyle_);
    return result == null ? bilibili.app.dynamic.v2.HighlightTextStyle.UNRECOGNIZED : result;
  }

  public static final int JUMP_URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jumpUrl_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The jumpUrl.
   */
  @java.lang.Override
  public java.lang.String getJumpUrl() {
    java.lang.Object ref = jumpUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jumpUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The bytes for jumpUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJumpUrlBytes() {
    java.lang.Object ref = jumpUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jumpUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 4;</code>
   * @return The icon.
   */
  @java.lang.Override
  public java.lang.String getIcon() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      icon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 4;</code>
   * @return The bytes for icon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconBytes() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      icon_ = b;
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
    if (textStyle_ != bilibili.app.dynamic.v2.HighlightTextStyle.style_none.getNumber()) {
      output.writeEnum(2, textStyle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jumpUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, icon_);
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
    if (textStyle_ != bilibili.app.dynamic.v2.HighlightTextStyle.style_none.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, textStyle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jumpUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, icon_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.HighlightText)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.HighlightText other = (bilibili.app.dynamic.v2.HighlightText) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (textStyle_ != other.textStyle_) return false;
    if (!getJumpUrl()
        .equals(other.getJumpUrl())) return false;
    if (!getIcon()
        .equals(other.getIcon())) return false;
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
    hash = (37 * hash) + TEXT_STYLE_FIELD_NUMBER;
    hash = (53 * hash) + textStyle_;
    hash = (37 * hash) + JUMP_URL_FIELD_NUMBER;
    hash = (53 * hash) + getJumpUrl().hashCode();
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HighlightText parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.HighlightText prototype) {
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
   * 高亮文本
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.HighlightText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.HighlightText)
      bilibili.app.dynamic.v2.HighlightTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HighlightText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HighlightText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.HighlightText.class, bilibili.app.dynamic.v2.HighlightText.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.HighlightText.newBuilder()
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
      textStyle_ = 0;
      jumpUrl_ = "";
      icon_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HighlightText_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HighlightText getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.HighlightText.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HighlightText build() {
      bilibili.app.dynamic.v2.HighlightText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HighlightText buildPartial() {
      bilibili.app.dynamic.v2.HighlightText result = new bilibili.app.dynamic.v2.HighlightText(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.HighlightText result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.textStyle_ = textStyle_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jumpUrl_ = jumpUrl_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.icon_ = icon_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.HighlightText) {
        return mergeFrom((bilibili.app.dynamic.v2.HighlightText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.HighlightText other) {
      if (other == bilibili.app.dynamic.v2.HighlightText.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.textStyle_ != 0) {
        setTextStyleValue(other.getTextStyleValue());
      }
      if (!other.getJumpUrl().isEmpty()) {
        jumpUrl_ = other.jumpUrl_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
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
            case 16: {
              textStyle_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              jumpUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              icon_ = input.readStringRequireUtf8();
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
     * 展示文本
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
     * 展示文本
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
     * 展示文本
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
     * 展示文本
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
     * 展示文本
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

    private int textStyle_ = 0;
    /**
     * <pre>
     * 高亮类型
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
     * @return The enum numeric value on the wire for textStyle.
     */
    @java.lang.Override public int getTextStyleValue() {
      return textStyle_;
    }
    /**
     * <pre>
     * 高亮类型
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
     * @param value The enum numeric value on the wire for textStyle to set.
     * @return This builder for chaining.
     */
    public Builder setTextStyleValue(int value) {
      textStyle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 高亮类型
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
     * @return The textStyle.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.HighlightTextStyle getTextStyle() {
      bilibili.app.dynamic.v2.HighlightTextStyle result = bilibili.app.dynamic.v2.HighlightTextStyle.forNumber(textStyle_);
      return result == null ? bilibili.app.dynamic.v2.HighlightTextStyle.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 高亮类型
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
     * @param value The textStyle to set.
     * @return This builder for chaining.
     */
    public Builder setTextStyle(bilibili.app.dynamic.v2.HighlightTextStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      textStyle_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 高亮类型
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.HighlightTextStyle text_style = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextStyle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      textStyle_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object jumpUrl_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return The jumpUrl.
     */
    public java.lang.String getJumpUrl() {
      java.lang.Object ref = jumpUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jumpUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return The bytes for jumpUrl.
     */
    public com.google.protobuf.ByteString
        getJumpUrlBytes() {
      java.lang.Object ref = jumpUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jumpUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @param value The jumpUrl to set.
     * @return This builder for chaining.
     */
    public Builder setJumpUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jumpUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpUrl() {
      jumpUrl_ = getDefaultInstance().getJumpUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @param value The bytes for jumpUrl to set.
     * @return This builder for chaining.
     */
    public Builder setJumpUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jumpUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object icon_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 4;</code>
     * @return The icon.
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        icon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 4;</code>
     * @return The bytes for icon.
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 4;</code>
     * @param value The icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      icon_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      icon_ = getDefaultInstance().getIcon();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 4;</code>
     * @param value The bytes for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      icon_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.HighlightText)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.HighlightText)
  private static final bilibili.app.dynamic.v2.HighlightText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.HighlightText();
  }

  public static bilibili.app.dynamic.v2.HighlightText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HighlightText>
      PARSER = new com.google.protobuf.AbstractParser<HighlightText>() {
    @java.lang.Override
    public HighlightText parsePartialFrom(
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

  public static com.google.protobuf.Parser<HighlightText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HighlightText> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.HighlightText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
