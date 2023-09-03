// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.ListenerGuideBar}
 */
public final class ListenerGuideBar extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.ListenerGuideBar)
    ListenerGuideBarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListenerGuideBar.newBuilder() to construct.
  private ListenerGuideBar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListenerGuideBar() {
    icon_ = "";
    text_ = "";
    btnText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListenerGuideBar();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ListenerGuideBar_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ListenerGuideBar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.ListenerGuideBar.class, bilibili.app.view.v1.ListenerGuideBar.Builder.class);
  }

  public static final int SHOW_STRATEGY_FIELD_NUMBER = 1;
  private long showStrategy_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 show_strategy = 1;</code>
   * @return The showStrategy.
   */
  @java.lang.Override
  public long getShowStrategy() {
    return showStrategy_;
  }

  public static final int ICON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 2;</code>
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
   * <code>string icon = 2;</code>
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

  public static final int TEXT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 3;</code>
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
   * <code>string text = 3;</code>
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

  public static final int BTN_TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object btnText_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_text = 4;</code>
   * @return The btnText.
   */
  @java.lang.Override
  public java.lang.String getBtnText() {
    java.lang.Object ref = btnText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      btnText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_text = 4;</code>
   * @return The bytes for btnText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBtnTextBytes() {
    java.lang.Object ref = btnText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      btnText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOW_TIME_FIELD_NUMBER = 5;
  private long showTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 show_time = 5;</code>
   * @return The showTime.
   */
  @java.lang.Override
  public long getShowTime() {
    return showTime_;
  }

  public static final int BACKGROUND_TIME_FIELD_NUMBER = 6;
  private long backgroundTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 background_time = 6;</code>
   * @return The backgroundTime.
   */
  @java.lang.Override
  public long getBackgroundTime() {
    return backgroundTime_;
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
    if (showStrategy_ != 0L) {
      output.writeInt64(1, showStrategy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, btnText_);
    }
    if (showTime_ != 0L) {
      output.writeInt64(5, showTime_);
    }
    if (backgroundTime_ != 0L) {
      output.writeInt64(6, backgroundTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (showStrategy_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, showStrategy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, btnText_);
    }
    if (showTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, showTime_);
    }
    if (backgroundTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, backgroundTime_);
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
    if (!(obj instanceof bilibili.app.view.v1.ListenerGuideBar)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.ListenerGuideBar other = (bilibili.app.view.v1.ListenerGuideBar) obj;

    if (getShowStrategy()
        != other.getShowStrategy()) return false;
    if (!getIcon()
        .equals(other.getIcon())) return false;
    if (!getText()
        .equals(other.getText())) return false;
    if (!getBtnText()
        .equals(other.getBtnText())) return false;
    if (getShowTime()
        != other.getShowTime()) return false;
    if (getBackgroundTime()
        != other.getBackgroundTime()) return false;
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
    hash = (37 * hash) + SHOW_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShowStrategy());
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + BTN_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getBtnText().hashCode();
    hash = (37 * hash) + SHOW_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShowTime());
    hash = (37 * hash) + BACKGROUND_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBackgroundTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ListenerGuideBar parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.ListenerGuideBar prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.ListenerGuideBar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.ListenerGuideBar)
      bilibili.app.view.v1.ListenerGuideBarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ListenerGuideBar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ListenerGuideBar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.ListenerGuideBar.class, bilibili.app.view.v1.ListenerGuideBar.Builder.class);
    }

    // Construct using bilibili.app.view.v1.ListenerGuideBar.newBuilder()
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
      showStrategy_ = 0L;
      icon_ = "";
      text_ = "";
      btnText_ = "";
      showTime_ = 0L;
      backgroundTime_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ListenerGuideBar_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ListenerGuideBar getDefaultInstanceForType() {
      return bilibili.app.view.v1.ListenerGuideBar.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.ListenerGuideBar build() {
      bilibili.app.view.v1.ListenerGuideBar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ListenerGuideBar buildPartial() {
      bilibili.app.view.v1.ListenerGuideBar result = new bilibili.app.view.v1.ListenerGuideBar(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.ListenerGuideBar result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.showStrategy_ = showStrategy_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.icon_ = icon_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.btnText_ = btnText_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.showTime_ = showTime_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.backgroundTime_ = backgroundTime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.ListenerGuideBar) {
        return mergeFrom((bilibili.app.view.v1.ListenerGuideBar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.ListenerGuideBar other) {
      if (other == bilibili.app.view.v1.ListenerGuideBar.getDefaultInstance()) return this;
      if (other.getShowStrategy() != 0L) {
        setShowStrategy(other.getShowStrategy());
      }
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getBtnText().isEmpty()) {
        btnText_ = other.btnText_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getShowTime() != 0L) {
        setShowTime(other.getShowTime());
      }
      if (other.getBackgroundTime() != 0L) {
        setBackgroundTime(other.getBackgroundTime());
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
              showStrategy_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              icon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              btnText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              showTime_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              backgroundTime_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long showStrategy_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_strategy = 1;</code>
     * @return The showStrategy.
     */
    @java.lang.Override
    public long getShowStrategy() {
      return showStrategy_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_strategy = 1;</code>
     * @param value The showStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setShowStrategy(long value) {

      showStrategy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_strategy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowStrategy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      showStrategy_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object icon_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 2;</code>
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
     * <code>string icon = 2;</code>
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
     * <code>string icon = 2;</code>
     * @param value The icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      icon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      icon_ = getDefaultInstance().getIcon();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 2;</code>
     * @param value The bytes for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      icon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 3;</code>
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
     * <code>string text = 3;</code>
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
     * <code>string text = 3;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 3;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object btnText_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return The btnText.
     */
    public java.lang.String getBtnText() {
      java.lang.Object ref = btnText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        btnText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return The bytes for btnText.
     */
    public com.google.protobuf.ByteString
        getBtnTextBytes() {
      java.lang.Object ref = btnText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        btnText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @param value The btnText to set.
     * @return This builder for chaining.
     */
    public Builder setBtnText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      btnText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBtnText() {
      btnText_ = getDefaultInstance().getBtnText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @param value The bytes for btnText to set.
     * @return This builder for chaining.
     */
    public Builder setBtnTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      btnText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long showTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_time = 5;</code>
     * @return The showTime.
     */
    @java.lang.Override
    public long getShowTime() {
      return showTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_time = 5;</code>
     * @param value The showTime to set.
     * @return This builder for chaining.
     */
    public Builder setShowTime(long value) {

      showTime_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 show_time = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowTime() {
      bitField0_ = (bitField0_ & ~0x00000010);
      showTime_ = 0L;
      onChanged();
      return this;
    }

    private long backgroundTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 background_time = 6;</code>
     * @return The backgroundTime.
     */
    @java.lang.Override
    public long getBackgroundTime() {
      return backgroundTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 background_time = 6;</code>
     * @param value The backgroundTime to set.
     * @return This builder for chaining.
     */
    public Builder setBackgroundTime(long value) {

      backgroundTime_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 background_time = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackgroundTime() {
      bitField0_ = (bitField0_ & ~0x00000020);
      backgroundTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.ListenerGuideBar)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.ListenerGuideBar)
  private static final bilibili.app.view.v1.ListenerGuideBar DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.ListenerGuideBar();
  }

  public static bilibili.app.view.v1.ListenerGuideBar getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListenerGuideBar>
      PARSER = new com.google.protobuf.AbstractParser<ListenerGuideBar>() {
    @java.lang.Override
    public ListenerGuideBar parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListenerGuideBar> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListenerGuideBar> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.ListenerGuideBar getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

