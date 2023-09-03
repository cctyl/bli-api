// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/common.proto

package bilibili.app.card.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.card.v1.Avatar}
 */
public final class Avatar extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.card.v1.Avatar)
    AvatarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Avatar.newBuilder() to construct.
  private Avatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Avatar() {
    cover_ = "";
    text_ = "";
    uri_ = "";
    event_ = "";
    eventV2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Avatar();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.card.v1.Common.internal_static_bilibili_app_card_v1_Avatar_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.card.v1.Common.internal_static_bilibili_app_card_v1_Avatar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.card.v1.Avatar.class, bilibili.app.card.v1.Avatar.Builder.class);
  }

  public static final int COVER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cover_ = "";
  /**
   * <pre>
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

  public static final int TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 2;</code>
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
   * <code>string text = 2;</code>
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

  public static final int URI_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 3;</code>
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
   * <code>string uri = 3;</code>
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

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 4;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int EVENT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object event_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string event = 5;</code>
   * @return The event.
   */
  @java.lang.Override
  public java.lang.String getEvent() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      event_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string event = 5;</code>
   * @return The bytes for event.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventBytes() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      event_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_V2_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventV2_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string event_v2 = 6;</code>
   * @return The eventV2.
   */
  @java.lang.Override
  public java.lang.String getEventV2() {
    java.lang.Object ref = eventV2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventV2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string event_v2 = 6;</code>
   * @return The bytes for eventV2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventV2Bytes() {
    java.lang.Object ref = eventV2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventV2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFALUT_COVER_FIELD_NUMBER = 7;
  private int defalutCover_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 defalut_cover = 7;</code>
   * @return The defalutCover.
   */
  @java.lang.Override
  public int getDefalutCover() {
    return defalutCover_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    if (type_ != 0) {
      output.writeInt32(4, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(event_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, event_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventV2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, eventV2_);
    }
    if (defalutCover_ != 0) {
      output.writeInt32(7, defalutCover_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, text_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(event_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, event_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventV2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, eventV2_);
    }
    if (defalutCover_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, defalutCover_);
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
    if (!(obj instanceof bilibili.app.card.v1.Avatar)) {
      return super.equals(obj);
    }
    bilibili.app.card.v1.Avatar other = (bilibili.app.card.v1.Avatar) obj;

    if (!getCover()
        .equals(other.getCover())) return false;
    if (!getText()
        .equals(other.getText())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (getType()
        != other.getType()) return false;
    if (!getEvent()
        .equals(other.getEvent())) return false;
    if (!getEventV2()
        .equals(other.getEventV2())) return false;
    if (getDefalutCover()
        != other.getDefalutCover()) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getEvent().hashCode();
    hash = (37 * hash) + EVENT_V2_FIELD_NUMBER;
    hash = (53 * hash) + getEventV2().hashCode();
    hash = (37 * hash) + DEFALUT_COVER_FIELD_NUMBER;
    hash = (53 * hash) + getDefalutCover();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.card.v1.Avatar parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.Avatar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.Avatar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.Avatar parseFrom(
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
  public static Builder newBuilder(bilibili.app.card.v1.Avatar prototype) {
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
   * Protobuf type {@code bilibili.app.card.v1.Avatar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.card.v1.Avatar)
      bilibili.app.card.v1.AvatarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.card.v1.Common.internal_static_bilibili_app_card_v1_Avatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.card.v1.Common.internal_static_bilibili_app_card_v1_Avatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.card.v1.Avatar.class, bilibili.app.card.v1.Avatar.Builder.class);
    }

    // Construct using bilibili.app.card.v1.Avatar.newBuilder()
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
      text_ = "";
      uri_ = "";
      type_ = 0;
      event_ = "";
      eventV2_ = "";
      defalutCover_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.card.v1.Common.internal_static_bilibili_app_card_v1_Avatar_descriptor;
    }

    @java.lang.Override
    public bilibili.app.card.v1.Avatar getDefaultInstanceForType() {
      return bilibili.app.card.v1.Avatar.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.card.v1.Avatar build() {
      bilibili.app.card.v1.Avatar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.card.v1.Avatar buildPartial() {
      bilibili.app.card.v1.Avatar result = new bilibili.app.card.v1.Avatar(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.card.v1.Avatar result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cover_ = cover_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.event_ = event_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.eventV2_ = eventV2_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.defalutCover_ = defalutCover_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.card.v1.Avatar) {
        return mergeFrom((bilibili.app.card.v1.Avatar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.card.v1.Avatar other) {
      if (other == bilibili.app.card.v1.Avatar.getDefaultInstance()) return this;
      if (!other.getCover().isEmpty()) {
        cover_ = other.cover_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getEvent().isEmpty()) {
        event_ = other.event_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getEventV2().isEmpty()) {
        eventV2_ = other.eventV2_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (other.getDefalutCover() != 0) {
        setDefalutCover(other.getDefalutCover());
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
            case 18: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              type_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              event_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              eventV2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 56: {
              defalutCover_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 2;</code>
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
     * <code>string text = 2;</code>
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
     * <code>string text = 2;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 2;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
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
     * <code>string uri = 3;</code>
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
     * <code>string uri = 3;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object event_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string event = 5;</code>
     * @return The event.
     */
    public java.lang.String getEvent() {
      java.lang.Object ref = event_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        event_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event = 5;</code>
     * @return The bytes for event.
     */
    public com.google.protobuf.ByteString
        getEventBytes() {
      java.lang.Object ref = event_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        event_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event = 5;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      event_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      event_ = getDefaultInstance().getEvent();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event = 5;</code>
     * @param value The bytes for event to set.
     * @return This builder for chaining.
     */
    public Builder setEventBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      event_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object eventV2_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string event_v2 = 6;</code>
     * @return The eventV2.
     */
    public java.lang.String getEventV2() {
      java.lang.Object ref = eventV2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventV2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event_v2 = 6;</code>
     * @return The bytes for eventV2.
     */
    public com.google.protobuf.ByteString
        getEventV2Bytes() {
      java.lang.Object ref = eventV2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventV2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event_v2 = 6;</code>
     * @param value The eventV2 to set.
     * @return This builder for chaining.
     */
    public Builder setEventV2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventV2_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event_v2 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventV2() {
      eventV2_ = getDefaultInstance().getEventV2();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string event_v2 = 6;</code>
     * @param value The bytes for eventV2 to set.
     * @return This builder for chaining.
     */
    public Builder setEventV2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventV2_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private int defalutCover_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 defalut_cover = 7;</code>
     * @return The defalutCover.
     */
    @java.lang.Override
    public int getDefalutCover() {
      return defalutCover_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 defalut_cover = 7;</code>
     * @param value The defalutCover to set.
     * @return This builder for chaining.
     */
    public Builder setDefalutCover(int value) {

      defalutCover_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 defalut_cover = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefalutCover() {
      bitField0_ = (bitField0_ & ~0x00000040);
      defalutCover_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.card.v1.Avatar)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.card.v1.Avatar)
  private static final bilibili.app.card.v1.Avatar DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.card.v1.Avatar();
  }

  public static bilibili.app.card.v1.Avatar getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Avatar>
      PARSER = new com.google.protobuf.AbstractParser<Avatar>() {
    @java.lang.Override
    public Avatar parsePartialFrom(
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

  public static com.google.protobuf.Parser<Avatar> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Avatar> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.card.v1.Avatar getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
