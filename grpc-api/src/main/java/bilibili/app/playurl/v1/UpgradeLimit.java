// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * 互动视频升级提示
 * </pre>
 *
 * Protobuf type {@code bilibili.app.playurl.v1.UpgradeLimit}
 */
public final class UpgradeLimit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.playurl.v1.UpgradeLimit)
    UpgradeLimitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpgradeLimit.newBuilder() to construct.
  private UpgradeLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpgradeLimit() {
    message_ = "";
    image_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpgradeLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_UpgradeLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_UpgradeLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.playurl.v1.UpgradeLimit.class, bilibili.app.playurl.v1.UpgradeLimit.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * 错误信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 错误信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object image_ = "";
  /**
   * <pre>
   * 图片url
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The image.
   */
  @java.lang.Override
  public java.lang.String getImage() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      image_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 图片url
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The bytes for image.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageBytes() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      image_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUTTON_FIELD_NUMBER = 4;
  private bilibili.app.playurl.v1.UpgradeButton button_;
  /**
   * <pre>
   * 按钮信息
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
   * @return Whether the button field is set.
   */
  @java.lang.Override
  public boolean hasButton() {
    return button_ != null;
  }
  /**
   * <pre>
   * 按钮信息
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
   * @return The button.
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.UpgradeButton getButton() {
    return button_ == null ? bilibili.app.playurl.v1.UpgradeButton.getDefaultInstance() : button_;
  }
  /**
   * <pre>
   * 按钮信息
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.UpgradeButtonOrBuilder getButtonOrBuilder() {
    return button_ == null ? bilibili.app.playurl.v1.UpgradeButton.getDefaultInstance() : button_;
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, image_);
    }
    if (button_ != null) {
      output.writeMessage(4, getButton());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, image_);
    }
    if (button_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getButton());
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
    if (!(obj instanceof bilibili.app.playurl.v1.UpgradeLimit)) {
      return super.equals(obj);
    }
    bilibili.app.playurl.v1.UpgradeLimit other = (bilibili.app.playurl.v1.UpgradeLimit) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getImage()
        .equals(other.getImage())) return false;
    if (hasButton() != other.hasButton()) return false;
    if (hasButton()) {
      if (!getButton()
          .equals(other.getButton())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getImage().hashCode();
    if (hasButton()) {
      hash = (37 * hash) + BUTTON_FIELD_NUMBER;
      hash = (53 * hash) + getButton().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.UpgradeLimit parseFrom(
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
  public static Builder newBuilder(bilibili.app.playurl.v1.UpgradeLimit prototype) {
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
   * 互动视频升级提示
   * </pre>
   *
   * Protobuf type {@code bilibili.app.playurl.v1.UpgradeLimit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.playurl.v1.UpgradeLimit)
      bilibili.app.playurl.v1.UpgradeLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_UpgradeLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_UpgradeLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.playurl.v1.UpgradeLimit.class, bilibili.app.playurl.v1.UpgradeLimit.Builder.class);
    }

    // Construct using bilibili.app.playurl.v1.UpgradeLimit.newBuilder()
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
      code_ = 0;
      message_ = "";
      image_ = "";
      button_ = null;
      if (buttonBuilder_ != null) {
        buttonBuilder_.dispose();
        buttonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_UpgradeLimit_descriptor;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.UpgradeLimit getDefaultInstanceForType() {
      return bilibili.app.playurl.v1.UpgradeLimit.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.UpgradeLimit build() {
      bilibili.app.playurl.v1.UpgradeLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.UpgradeLimit buildPartial() {
      bilibili.app.playurl.v1.UpgradeLimit result = new bilibili.app.playurl.v1.UpgradeLimit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.playurl.v1.UpgradeLimit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.image_ = image_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.button_ = buttonBuilder_ == null
            ? button_
            : buttonBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.playurl.v1.UpgradeLimit) {
        return mergeFrom((bilibili.app.playurl.v1.UpgradeLimit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.playurl.v1.UpgradeLimit other) {
      if (other == bilibili.app.playurl.v1.UpgradeLimit.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getImage().isEmpty()) {
        image_ = other.image_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasButton()) {
        mergeButton(other.getButton());
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
              code_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              image_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getButtonFieldBuilder().getBuilder(),
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

    private int code_ ;
    /**
     * <pre>
     * 错误码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     * 错误码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {

      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 错误码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * 错误信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 错误信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 错误信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 错误信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 错误信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object image_ = "";
    /**
     * <pre>
     * 图片url
     * </pre>
     *
     * <code>string image = 3;</code>
     * @return The image.
     */
    public java.lang.String getImage() {
      java.lang.Object ref = image_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        image_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 图片url
     * </pre>
     *
     * <code>string image = 3;</code>
     * @return The bytes for image.
     */
    public com.google.protobuf.ByteString
        getImageBytes() {
      java.lang.Object ref = image_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        image_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 图片url
     * </pre>
     *
     * <code>string image = 3;</code>
     * @param value The image to set.
     * @return This builder for chaining.
     */
    public Builder setImage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      image_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 图片url
     * </pre>
     *
     * <code>string image = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearImage() {
      image_ = getDefaultInstance().getImage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 图片url
     * </pre>
     *
     * <code>string image = 3;</code>
     * @param value The bytes for image to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      image_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private bilibili.app.playurl.v1.UpgradeButton button_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.UpgradeButton, bilibili.app.playurl.v1.UpgradeButton.Builder, bilibili.app.playurl.v1.UpgradeButtonOrBuilder> buttonBuilder_;
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     * @return Whether the button field is set.
     */
    public boolean hasButton() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     * @return The button.
     */
    public bilibili.app.playurl.v1.UpgradeButton getButton() {
      if (buttonBuilder_ == null) {
        return button_ == null ? bilibili.app.playurl.v1.UpgradeButton.getDefaultInstance() : button_;
      } else {
        return buttonBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public Builder setButton(bilibili.app.playurl.v1.UpgradeButton value) {
      if (buttonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        button_ = value;
      } else {
        buttonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public Builder setButton(
        bilibili.app.playurl.v1.UpgradeButton.Builder builderForValue) {
      if (buttonBuilder_ == null) {
        button_ = builderForValue.build();
      } else {
        buttonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public Builder mergeButton(bilibili.app.playurl.v1.UpgradeButton value) {
      if (buttonBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          button_ != null &&
          button_ != bilibili.app.playurl.v1.UpgradeButton.getDefaultInstance()) {
          getButtonBuilder().mergeFrom(value);
        } else {
          button_ = value;
        }
      } else {
        buttonBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public Builder clearButton() {
      bitField0_ = (bitField0_ & ~0x00000008);
      button_ = null;
      if (buttonBuilder_ != null) {
        buttonBuilder_.dispose();
        buttonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public bilibili.app.playurl.v1.UpgradeButton.Builder getButtonBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getButtonFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    public bilibili.app.playurl.v1.UpgradeButtonOrBuilder getButtonOrBuilder() {
      if (buttonBuilder_ != null) {
        return buttonBuilder_.getMessageOrBuilder();
      } else {
        return button_ == null ?
            bilibili.app.playurl.v1.UpgradeButton.getDefaultInstance() : button_;
      }
    }
    /**
     * <pre>
     * 按钮信息
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.UpgradeButton button = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.UpgradeButton, bilibili.app.playurl.v1.UpgradeButton.Builder, bilibili.app.playurl.v1.UpgradeButtonOrBuilder> 
        getButtonFieldBuilder() {
      if (buttonBuilder_ == null) {
        buttonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.playurl.v1.UpgradeButton, bilibili.app.playurl.v1.UpgradeButton.Builder, bilibili.app.playurl.v1.UpgradeButtonOrBuilder>(
                getButton(),
                getParentForChildren(),
                isClean());
        button_ = null;
      }
      return buttonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.playurl.v1.UpgradeLimit)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.playurl.v1.UpgradeLimit)
  private static final bilibili.app.playurl.v1.UpgradeLimit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.playurl.v1.UpgradeLimit();
  }

  public static bilibili.app.playurl.v1.UpgradeLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpgradeLimit>
      PARSER = new com.google.protobuf.AbstractParser<UpgradeLimit>() {
    @java.lang.Override
    public UpgradeLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpgradeLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpgradeLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.playurl.v1.UpgradeLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

