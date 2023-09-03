// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 标准卡
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.StandardCard}
 */
public final class StandardCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.StandardCard)
    StandardCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StandardCard.newBuilder() to construct.
  private StandardCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StandardCard() {
    title_ = "";
    buttonTitle_ = "";
    buttonSelectedTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StandardCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_StandardCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_StandardCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.StandardCard.class, bilibili.app.view.v1.StandardCard.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 卡片文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 卡片文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUTTON_TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object buttonTitle_ = "";
  /**
   * <pre>
   * 按钮文字 未操作
   * </pre>
   *
   * <code>string button_title = 2;</code>
   * @return The buttonTitle.
   */
  @java.lang.Override
  public java.lang.String getButtonTitle() {
    java.lang.Object ref = buttonTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buttonTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 按钮文字 未操作
   * </pre>
   *
   * <code>string button_title = 2;</code>
   * @return The bytes for buttonTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getButtonTitleBytes() {
    java.lang.Object ref = buttonTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buttonTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUTTON_SELECTED_TITLE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object buttonSelectedTitle_ = "";
  /**
   * <pre>
   * 按钮文字 已操作
   * </pre>
   *
   * <code>string button_selected_title = 3;</code>
   * @return The buttonSelectedTitle.
   */
  @java.lang.Override
  public java.lang.String getButtonSelectedTitle() {
    java.lang.Object ref = buttonSelectedTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buttonSelectedTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 按钮文字 已操作
   * </pre>
   *
   * <code>string button_selected_title = 3;</code>
   * @return The bytes for buttonSelectedTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getButtonSelectedTitleBytes() {
    java.lang.Object ref = buttonSelectedTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buttonSelectedTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOW_SELECTED_FIELD_NUMBER = 4;
  private boolean showSelected_ = false;
  /**
   * <pre>
   * 已操作态是否显示
   * </pre>
   *
   * <code>bool show_selected = 4;</code>
   * @return The showSelected.
   */
  @java.lang.Override
  public boolean getShowSelected() {
    return showSelected_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buttonTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, buttonTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buttonSelectedTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, buttonSelectedTitle_);
    }
    if (showSelected_ != false) {
      output.writeBool(4, showSelected_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buttonTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, buttonTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buttonSelectedTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, buttonSelectedTitle_);
    }
    if (showSelected_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, showSelected_);
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
    if (!(obj instanceof bilibili.app.view.v1.StandardCard)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.StandardCard other = (bilibili.app.view.v1.StandardCard) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getButtonTitle()
        .equals(other.getButtonTitle())) return false;
    if (!getButtonSelectedTitle()
        .equals(other.getButtonSelectedTitle())) return false;
    if (getShowSelected()
        != other.getShowSelected()) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + BUTTON_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getButtonTitle().hashCode();
    hash = (37 * hash) + BUTTON_SELECTED_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getButtonSelectedTitle().hashCode();
    hash = (37 * hash) + SHOW_SELECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShowSelected());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.StandardCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.StandardCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.StandardCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.StandardCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.StandardCard prototype) {
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
   * 标准卡
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.StandardCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.StandardCard)
      bilibili.app.view.v1.StandardCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_StandardCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_StandardCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.StandardCard.class, bilibili.app.view.v1.StandardCard.Builder.class);
    }

    // Construct using bilibili.app.view.v1.StandardCard.newBuilder()
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
      title_ = "";
      buttonTitle_ = "";
      buttonSelectedTitle_ = "";
      showSelected_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_StandardCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.StandardCard getDefaultInstanceForType() {
      return bilibili.app.view.v1.StandardCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.StandardCard build() {
      bilibili.app.view.v1.StandardCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.StandardCard buildPartial() {
      bilibili.app.view.v1.StandardCard result = new bilibili.app.view.v1.StandardCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.StandardCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.buttonTitle_ = buttonTitle_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.buttonSelectedTitle_ = buttonSelectedTitle_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.showSelected_ = showSelected_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.StandardCard) {
        return mergeFrom((bilibili.app.view.v1.StandardCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.StandardCard other) {
      if (other == bilibili.app.view.v1.StandardCard.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getButtonTitle().isEmpty()) {
        buttonTitle_ = other.buttonTitle_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getButtonSelectedTitle().isEmpty()) {
        buttonSelectedTitle_ = other.buttonSelectedTitle_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getShowSelected() != false) {
        setShowSelected(other.getShowSelected());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              buttonTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              buttonSelectedTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              showSelected_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * 卡片文案
     * </pre>
     *
     * <code>string title = 1;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 卡片文案
     * </pre>
     *
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 卡片文案
     * </pre>
     *
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡片文案
     * </pre>
     *
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡片文案
     * </pre>
     *
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object buttonTitle_ = "";
    /**
     * <pre>
     * 按钮文字 未操作
     * </pre>
     *
     * <code>string button_title = 2;</code>
     * @return The buttonTitle.
     */
    public java.lang.String getButtonTitle() {
      java.lang.Object ref = buttonTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buttonTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 按钮文字 未操作
     * </pre>
     *
     * <code>string button_title = 2;</code>
     * @return The bytes for buttonTitle.
     */
    public com.google.protobuf.ByteString
        getButtonTitleBytes() {
      java.lang.Object ref = buttonTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buttonTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 按钮文字 未操作
     * </pre>
     *
     * <code>string button_title = 2;</code>
     * @param value The buttonTitle to set.
     * @return This builder for chaining.
     */
    public Builder setButtonTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      buttonTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮文字 未操作
     * </pre>
     *
     * <code>string button_title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearButtonTitle() {
      buttonTitle_ = getDefaultInstance().getButtonTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮文字 未操作
     * </pre>
     *
     * <code>string button_title = 2;</code>
     * @param value The bytes for buttonTitle to set.
     * @return This builder for chaining.
     */
    public Builder setButtonTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      buttonTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object buttonSelectedTitle_ = "";
    /**
     * <pre>
     * 按钮文字 已操作
     * </pre>
     *
     * <code>string button_selected_title = 3;</code>
     * @return The buttonSelectedTitle.
     */
    public java.lang.String getButtonSelectedTitle() {
      java.lang.Object ref = buttonSelectedTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buttonSelectedTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 按钮文字 已操作
     * </pre>
     *
     * <code>string button_selected_title = 3;</code>
     * @return The bytes for buttonSelectedTitle.
     */
    public com.google.protobuf.ByteString
        getButtonSelectedTitleBytes() {
      java.lang.Object ref = buttonSelectedTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buttonSelectedTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 按钮文字 已操作
     * </pre>
     *
     * <code>string button_selected_title = 3;</code>
     * @param value The buttonSelectedTitle to set.
     * @return This builder for chaining.
     */
    public Builder setButtonSelectedTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      buttonSelectedTitle_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮文字 已操作
     * </pre>
     *
     * <code>string button_selected_title = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearButtonSelectedTitle() {
      buttonSelectedTitle_ = getDefaultInstance().getButtonSelectedTitle();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮文字 已操作
     * </pre>
     *
     * <code>string button_selected_title = 3;</code>
     * @param value The bytes for buttonSelectedTitle to set.
     * @return This builder for chaining.
     */
    public Builder setButtonSelectedTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      buttonSelectedTitle_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean showSelected_ ;
    /**
     * <pre>
     * 已操作态是否显示
     * </pre>
     *
     * <code>bool show_selected = 4;</code>
     * @return The showSelected.
     */
    @java.lang.Override
    public boolean getShowSelected() {
      return showSelected_;
    }
    /**
     * <pre>
     * 已操作态是否显示
     * </pre>
     *
     * <code>bool show_selected = 4;</code>
     * @param value The showSelected to set.
     * @return This builder for chaining.
     */
    public Builder setShowSelected(boolean value) {

      showSelected_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 已操作态是否显示
     * </pre>
     *
     * <code>bool show_selected = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowSelected() {
      bitField0_ = (bitField0_ & ~0x00000008);
      showSelected_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.StandardCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.StandardCard)
  private static final bilibili.app.view.v1.StandardCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.StandardCard();
  }

  public static bilibili.app.view.v1.StandardCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StandardCard>
      PARSER = new com.google.protobuf.AbstractParser<StandardCard>() {
    @java.lang.Override
    public StandardCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<StandardCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StandardCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.StandardCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

