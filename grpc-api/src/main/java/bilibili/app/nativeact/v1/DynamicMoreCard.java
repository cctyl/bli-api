// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.DynamicMoreCard}
 */
public final class DynamicMoreCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.DynamicMoreCard)
    DynamicMoreCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicMoreCard.newBuilder() to construct.
  private DynamicMoreCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicMoreCard() {
    text_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicMoreCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicMoreCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicMoreCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.DynamicMoreCard.class, bilibili.app.nativeact.v1.DynamicMoreCard.Builder.class);
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

  public static final int URI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBPAGE_DATA_FIELD_NUMBER = 3;
  private bilibili.app.nativeact.v1.SubpageData subpageData_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   * @return Whether the subpageData field is set.
   */
  @java.lang.Override
  public boolean hasSubpageData() {
    return subpageData_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   * @return The subpageData.
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.SubpageData getSubpageData() {
    return subpageData_ == null ? bilibili.app.nativeact.v1.SubpageData.getDefaultInstance() : subpageData_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.SubpageDataOrBuilder getSubpageDataOrBuilder() {
    return subpageData_ == null ? bilibili.app.nativeact.v1.SubpageData.getDefaultInstance() : subpageData_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    if (subpageData_ != null) {
      output.writeMessage(3, getSubpageData());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
    }
    if (subpageData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSubpageData());
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
    if (!(obj instanceof bilibili.app.nativeact.v1.DynamicMoreCard)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.DynamicMoreCard other = (bilibili.app.nativeact.v1.DynamicMoreCard) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (hasSubpageData() != other.hasSubpageData()) return false;
    if (hasSubpageData()) {
      if (!getSubpageData()
          .equals(other.getSubpageData())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasSubpageData()) {
      hash = (37 * hash) + SUBPAGE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getSubpageData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicMoreCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.DynamicMoreCard prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.DynamicMoreCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.DynamicMoreCard)
      bilibili.app.nativeact.v1.DynamicMoreCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicMoreCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicMoreCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.DynamicMoreCard.class, bilibili.app.nativeact.v1.DynamicMoreCard.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.DynamicMoreCard.newBuilder()
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
      uri_ = "";
      subpageData_ = null;
      if (subpageDataBuilder_ != null) {
        subpageDataBuilder_.dispose();
        subpageDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicMoreCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicMoreCard getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.DynamicMoreCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicMoreCard build() {
      bilibili.app.nativeact.v1.DynamicMoreCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicMoreCard buildPartial() {
      bilibili.app.nativeact.v1.DynamicMoreCard result = new bilibili.app.nativeact.v1.DynamicMoreCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.DynamicMoreCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subpageData_ = subpageDataBuilder_ == null
            ? subpageData_
            : subpageDataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.DynamicMoreCard) {
        return mergeFrom((bilibili.app.nativeact.v1.DynamicMoreCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.DynamicMoreCard other) {
      if (other == bilibili.app.nativeact.v1.DynamicMoreCard.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSubpageData()) {
        mergeSubpageData(other.getSubpageData());
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
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSubpageDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private bilibili.app.nativeact.v1.SubpageData subpageData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.SubpageData, bilibili.app.nativeact.v1.SubpageData.Builder, bilibili.app.nativeact.v1.SubpageDataOrBuilder> subpageDataBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     * @return Whether the subpageData field is set.
     */
    public boolean hasSubpageData() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     * @return The subpageData.
     */
    public bilibili.app.nativeact.v1.SubpageData getSubpageData() {
      if (subpageDataBuilder_ == null) {
        return subpageData_ == null ? bilibili.app.nativeact.v1.SubpageData.getDefaultInstance() : subpageData_;
      } else {
        return subpageDataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public Builder setSubpageData(bilibili.app.nativeact.v1.SubpageData value) {
      if (subpageDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subpageData_ = value;
      } else {
        subpageDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public Builder setSubpageData(
        bilibili.app.nativeact.v1.SubpageData.Builder builderForValue) {
      if (subpageDataBuilder_ == null) {
        subpageData_ = builderForValue.build();
      } else {
        subpageDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public Builder mergeSubpageData(bilibili.app.nativeact.v1.SubpageData value) {
      if (subpageDataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          subpageData_ != null &&
          subpageData_ != bilibili.app.nativeact.v1.SubpageData.getDefaultInstance()) {
          getSubpageDataBuilder().mergeFrom(value);
        } else {
          subpageData_ = value;
        }
      } else {
        subpageDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public Builder clearSubpageData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      subpageData_ = null;
      if (subpageDataBuilder_ != null) {
        subpageDataBuilder_.dispose();
        subpageDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public bilibili.app.nativeact.v1.SubpageData.Builder getSubpageDataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSubpageDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    public bilibili.app.nativeact.v1.SubpageDataOrBuilder getSubpageDataOrBuilder() {
      if (subpageDataBuilder_ != null) {
        return subpageDataBuilder_.getMessageOrBuilder();
      } else {
        return subpageData_ == null ?
            bilibili.app.nativeact.v1.SubpageData.getDefaultInstance() : subpageData_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.SubpageData, bilibili.app.nativeact.v1.SubpageData.Builder, bilibili.app.nativeact.v1.SubpageDataOrBuilder> 
        getSubpageDataFieldBuilder() {
      if (subpageDataBuilder_ == null) {
        subpageDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.nativeact.v1.SubpageData, bilibili.app.nativeact.v1.SubpageData.Builder, bilibili.app.nativeact.v1.SubpageDataOrBuilder>(
                getSubpageData(),
                getParentForChildren(),
                isClean());
        subpageData_ = null;
      }
      return subpageDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.DynamicMoreCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.DynamicMoreCard)
  private static final bilibili.app.nativeact.v1.DynamicMoreCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.DynamicMoreCard();
  }

  public static bilibili.app.nativeact.v1.DynamicMoreCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicMoreCard>
      PARSER = new com.google.protobuf.AbstractParser<DynamicMoreCard>() {
    @java.lang.Override
    public DynamicMoreCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicMoreCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicMoreCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.DynamicMoreCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

