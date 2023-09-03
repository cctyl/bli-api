// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 三点-关注
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.ThreePointAttention}
 */
public final class ThreePointAttention extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.ThreePointAttention)
    ThreePointAttentionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreePointAttention.newBuilder() to construct.
  private ThreePointAttention(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreePointAttention() {
    attentionIcon_ = "";
    attentionText_ = "";
    notAttentionIcon_ = "";
    notAttentionText_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreePointAttention();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointAttention_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointAttention_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.ThreePointAttention.class, bilibili.dynamic.gateway.ThreePointAttention.Builder.class);
  }

  public static final int ATTENTION_ICON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attentionIcon_ = "";
  /**
   * <pre>
   * attention icon
   * </pre>
   *
   * <code>string attention_icon = 1;</code>
   * @return The attentionIcon.
   */
  @java.lang.Override
  public java.lang.String getAttentionIcon() {
    java.lang.Object ref = attentionIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attentionIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * attention icon
   * </pre>
   *
   * <code>string attention_icon = 1;</code>
   * @return The bytes for attentionIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttentionIconBytes() {
    java.lang.Object ref = attentionIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attentionIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTENTION_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attentionText_ = "";
  /**
   * <pre>
   * 关注时显示的文案
   * </pre>
   *
   * <code>string attention_text = 2;</code>
   * @return The attentionText.
   */
  @java.lang.Override
  public java.lang.String getAttentionText() {
    java.lang.Object ref = attentionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attentionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 关注时显示的文案
   * </pre>
   *
   * <code>string attention_text = 2;</code>
   * @return The bytes for attentionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttentionTextBytes() {
    java.lang.Object ref = attentionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attentionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOT_ATTENTION_ICON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notAttentionIcon_ = "";
  /**
   * <pre>
   * not attention icon
   * </pre>
   *
   * <code>string not_attention_icon = 3;</code>
   * @return The notAttentionIcon.
   */
  @java.lang.Override
  public java.lang.String getNotAttentionIcon() {
    java.lang.Object ref = notAttentionIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notAttentionIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * not attention icon
   * </pre>
   *
   * <code>string not_attention_icon = 3;</code>
   * @return The bytes for notAttentionIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotAttentionIconBytes() {
    java.lang.Object ref = notAttentionIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notAttentionIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOT_ATTENTION_TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notAttentionText_ = "";
  /**
   * <pre>
   * 未关注时显示的文案
   * </pre>
   *
   * <code>string not_attention_text = 4;</code>
   * @return The notAttentionText.
   */
  @java.lang.Override
  public java.lang.String getNotAttentionText() {
    java.lang.Object ref = notAttentionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notAttentionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 未关注时显示的文案
   * </pre>
   *
   * <code>string not_attention_text = 4;</code>
   * @return The bytes for notAttentionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotAttentionTextBytes() {
    java.lang.Object ref = notAttentionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notAttentionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_ = 0;
  /**
   * <pre>
   * 当前关注状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * 当前关注状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
   * @return The status.
   */
  @java.lang.Override public bilibili.dynamic.gateway.ThreePointAttentionStatus getStatus() {
    bilibili.dynamic.gateway.ThreePointAttentionStatus result = bilibili.dynamic.gateway.ThreePointAttentionStatus.forNumber(status_);
    return result == null ? bilibili.dynamic.gateway.ThreePointAttentionStatus.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attentionIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attentionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attentionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attentionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notAttentionIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, notAttentionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notAttentionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, notAttentionText_);
    }
    if (status_ != bilibili.dynamic.gateway.ThreePointAttentionStatus.tp_not_attention.getNumber()) {
      output.writeEnum(5, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attentionIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attentionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attentionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, attentionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notAttentionIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, notAttentionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notAttentionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, notAttentionText_);
    }
    if (status_ != bilibili.dynamic.gateway.ThreePointAttentionStatus.tp_not_attention.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.ThreePointAttention)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.ThreePointAttention other = (bilibili.dynamic.gateway.ThreePointAttention) obj;

    if (!getAttentionIcon()
        .equals(other.getAttentionIcon())) return false;
    if (!getAttentionText()
        .equals(other.getAttentionText())) return false;
    if (!getNotAttentionIcon()
        .equals(other.getNotAttentionIcon())) return false;
    if (!getNotAttentionText()
        .equals(other.getNotAttentionText())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + ATTENTION_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getAttentionIcon().hashCode();
    hash = (37 * hash) + ATTENTION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getAttentionText().hashCode();
    hash = (37 * hash) + NOT_ATTENTION_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getNotAttentionIcon().hashCode();
    hash = (37 * hash) + NOT_ATTENTION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getNotAttentionText().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointAttention parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.ThreePointAttention prototype) {
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
   * 三点-关注
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.ThreePointAttention}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.ThreePointAttention)
      bilibili.dynamic.gateway.ThreePointAttentionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointAttention_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointAttention_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.ThreePointAttention.class, bilibili.dynamic.gateway.ThreePointAttention.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.ThreePointAttention.newBuilder()
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
      attentionIcon_ = "";
      attentionText_ = "";
      notAttentionIcon_ = "";
      notAttentionText_ = "";
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointAttention_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointAttention getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.ThreePointAttention.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointAttention build() {
      bilibili.dynamic.gateway.ThreePointAttention result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointAttention buildPartial() {
      bilibili.dynamic.gateway.ThreePointAttention result = new bilibili.dynamic.gateway.ThreePointAttention(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.ThreePointAttention result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attentionIcon_ = attentionIcon_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attentionText_ = attentionText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.notAttentionIcon_ = notAttentionIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.notAttentionText_ = notAttentionText_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.status_ = status_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.ThreePointAttention) {
        return mergeFrom((bilibili.dynamic.gateway.ThreePointAttention)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.ThreePointAttention other) {
      if (other == bilibili.dynamic.gateway.ThreePointAttention.getDefaultInstance()) return this;
      if (!other.getAttentionIcon().isEmpty()) {
        attentionIcon_ = other.attentionIcon_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAttentionText().isEmpty()) {
        attentionText_ = other.attentionText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNotAttentionIcon().isEmpty()) {
        notAttentionIcon_ = other.notAttentionIcon_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getNotAttentionText().isEmpty()) {
        notAttentionText_ = other.notAttentionText_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              attentionIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              attentionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              notAttentionIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              notAttentionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              status_ = input.readEnum();
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

    private java.lang.Object attentionIcon_ = "";
    /**
     * <pre>
     * attention icon
     * </pre>
     *
     * <code>string attention_icon = 1;</code>
     * @return The attentionIcon.
     */
    public java.lang.String getAttentionIcon() {
      java.lang.Object ref = attentionIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attentionIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * attention icon
     * </pre>
     *
     * <code>string attention_icon = 1;</code>
     * @return The bytes for attentionIcon.
     */
    public com.google.protobuf.ByteString
        getAttentionIconBytes() {
      java.lang.Object ref = attentionIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attentionIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * attention icon
     * </pre>
     *
     * <code>string attention_icon = 1;</code>
     * @param value The attentionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setAttentionIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attentionIcon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * attention icon
     * </pre>
     *
     * <code>string attention_icon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttentionIcon() {
      attentionIcon_ = getDefaultInstance().getAttentionIcon();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * attention icon
     * </pre>
     *
     * <code>string attention_icon = 1;</code>
     * @param value The bytes for attentionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setAttentionIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attentionIcon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object attentionText_ = "";
    /**
     * <pre>
     * 关注时显示的文案
     * </pre>
     *
     * <code>string attention_text = 2;</code>
     * @return The attentionText.
     */
    public java.lang.String getAttentionText() {
      java.lang.Object ref = attentionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attentionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 关注时显示的文案
     * </pre>
     *
     * <code>string attention_text = 2;</code>
     * @return The bytes for attentionText.
     */
    public com.google.protobuf.ByteString
        getAttentionTextBytes() {
      java.lang.Object ref = attentionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attentionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 关注时显示的文案
     * </pre>
     *
     * <code>string attention_text = 2;</code>
     * @param value The attentionText to set.
     * @return This builder for chaining.
     */
    public Builder setAttentionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attentionText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关注时显示的文案
     * </pre>
     *
     * <code>string attention_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttentionText() {
      attentionText_ = getDefaultInstance().getAttentionText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关注时显示的文案
     * </pre>
     *
     * <code>string attention_text = 2;</code>
     * @param value The bytes for attentionText to set.
     * @return This builder for chaining.
     */
    public Builder setAttentionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attentionText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object notAttentionIcon_ = "";
    /**
     * <pre>
     * not attention icon
     * </pre>
     *
     * <code>string not_attention_icon = 3;</code>
     * @return The notAttentionIcon.
     */
    public java.lang.String getNotAttentionIcon() {
      java.lang.Object ref = notAttentionIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notAttentionIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * not attention icon
     * </pre>
     *
     * <code>string not_attention_icon = 3;</code>
     * @return The bytes for notAttentionIcon.
     */
    public com.google.protobuf.ByteString
        getNotAttentionIconBytes() {
      java.lang.Object ref = notAttentionIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notAttentionIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * not attention icon
     * </pre>
     *
     * <code>string not_attention_icon = 3;</code>
     * @param value The notAttentionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setNotAttentionIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notAttentionIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * not attention icon
     * </pre>
     *
     * <code>string not_attention_icon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotAttentionIcon() {
      notAttentionIcon_ = getDefaultInstance().getNotAttentionIcon();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * not attention icon
     * </pre>
     *
     * <code>string not_attention_icon = 3;</code>
     * @param value The bytes for notAttentionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setNotAttentionIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notAttentionIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object notAttentionText_ = "";
    /**
     * <pre>
     * 未关注时显示的文案
     * </pre>
     *
     * <code>string not_attention_text = 4;</code>
     * @return The notAttentionText.
     */
    public java.lang.String getNotAttentionText() {
      java.lang.Object ref = notAttentionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notAttentionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 未关注时显示的文案
     * </pre>
     *
     * <code>string not_attention_text = 4;</code>
     * @return The bytes for notAttentionText.
     */
    public com.google.protobuf.ByteString
        getNotAttentionTextBytes() {
      java.lang.Object ref = notAttentionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notAttentionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 未关注时显示的文案
     * </pre>
     *
     * <code>string not_attention_text = 4;</code>
     * @param value The notAttentionText to set.
     * @return This builder for chaining.
     */
    public Builder setNotAttentionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notAttentionText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 未关注时显示的文案
     * </pre>
     *
     * <code>string not_attention_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotAttentionText() {
      notAttentionText_ = getDefaultInstance().getNotAttentionText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 未关注时显示的文案
     * </pre>
     *
     * <code>string not_attention_text = 4;</code>
     * @param value The bytes for notAttentionText to set.
     * @return This builder for chaining.
     */
    public Builder setNotAttentionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notAttentionText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * 当前关注状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * 当前关注状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前关注状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
     * @return The status.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointAttentionStatus getStatus() {
      bilibili.dynamic.gateway.ThreePointAttentionStatus result = bilibili.dynamic.gateway.ThreePointAttentionStatus.forNumber(status_);
      return result == null ? bilibili.dynamic.gateway.ThreePointAttentionStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 当前关注状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(bilibili.dynamic.gateway.ThreePointAttentionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前关注状态
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ThreePointAttentionStatus status = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000010);
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.ThreePointAttention)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.ThreePointAttention)
  private static final bilibili.dynamic.gateway.ThreePointAttention DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.ThreePointAttention();
  }

  public static bilibili.dynamic.gateway.ThreePointAttention getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreePointAttention>
      PARSER = new com.google.protobuf.AbstractParser<ThreePointAttention>() {
    @java.lang.Override
    public ThreePointAttention parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreePointAttention> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreePointAttention> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.ThreePointAttention getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

