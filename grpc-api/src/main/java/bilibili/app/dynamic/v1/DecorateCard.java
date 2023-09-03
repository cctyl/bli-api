// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 装扮卡片
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DecorateCard}
 */
public final class DecorateCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DecorateCard)
    DecorateCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DecorateCard.newBuilder() to construct.
  private DecorateCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DecorateCard() {
    cardUrl_ = "";
    jumpUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DecorateCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DecorateCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DecorateCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.DecorateCard.class, bilibili.app.dynamic.v1.DecorateCard.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <pre>
   * 装扮卡片id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CARD_URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cardUrl_ = "";
  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The cardUrl.
   */
  @java.lang.Override
  public java.lang.String getCardUrl() {
    java.lang.Object ref = cardUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The bytes for cardUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCardUrlBytes() {
    java.lang.Object ref = cardUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JUMP_URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jumpUrl_ = "";
  /**
   * <pre>
   * 装扮卡片点击跳转链接
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
   * 装扮卡片点击跳转链接
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

  public static final int FAN_FIELD_NUMBER = 4;
  private bilibili.app.dynamic.v1.DecoCardFan fan_;
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   * @return Whether the fan field is set.
   */
  @java.lang.Override
  public boolean hasFan() {
    return fan_ != null;
  }
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   * @return The fan.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.DecoCardFan getFan() {
    return fan_ == null ? bilibili.app.dynamic.v1.DecoCardFan.getDefaultInstance() : fan_;
  }
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.DecoCardFanOrBuilder getFanOrBuilder() {
    return fan_ == null ? bilibili.app.dynamic.v1.DecoCardFan.getDefaultInstance() : fan_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cardUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cardUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jumpUrl_);
    }
    if (fan_ != null) {
      output.writeMessage(4, getFan());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cardUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cardUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jumpUrl_);
    }
    if (fan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFan());
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
    if (!(obj instanceof bilibili.app.dynamic.v1.DecorateCard)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.DecorateCard other = (bilibili.app.dynamic.v1.DecorateCard) obj;

    if (getId()
        != other.getId()) return false;
    if (!getCardUrl()
        .equals(other.getCardUrl())) return false;
    if (!getJumpUrl()
        .equals(other.getJumpUrl())) return false;
    if (hasFan() != other.hasFan()) return false;
    if (hasFan()) {
      if (!getFan()
          .equals(other.getFan())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CARD_URL_FIELD_NUMBER;
    hash = (53 * hash) + getCardUrl().hashCode();
    hash = (37 * hash) + JUMP_URL_FIELD_NUMBER;
    hash = (53 * hash) + getJumpUrl().hashCode();
    if (hasFan()) {
      hash = (37 * hash) + FAN_FIELD_NUMBER;
      hash = (53 * hash) + getFan().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DecorateCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.DecorateCard prototype) {
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
   * 装扮卡片
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DecorateCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DecorateCard)
      bilibili.app.dynamic.v1.DecorateCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DecorateCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DecorateCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.DecorateCard.class, bilibili.app.dynamic.v1.DecorateCard.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.DecorateCard.newBuilder()
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
      id_ = 0L;
      cardUrl_ = "";
      jumpUrl_ = "";
      fan_ = null;
      if (fanBuilder_ != null) {
        fanBuilder_.dispose();
        fanBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DecorateCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DecorateCard getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.DecorateCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DecorateCard build() {
      bilibili.app.dynamic.v1.DecorateCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DecorateCard buildPartial() {
      bilibili.app.dynamic.v1.DecorateCard result = new bilibili.app.dynamic.v1.DecorateCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v1.DecorateCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cardUrl_ = cardUrl_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jumpUrl_ = jumpUrl_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fan_ = fanBuilder_ == null
            ? fan_
            : fanBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.DecorateCard) {
        return mergeFrom((bilibili.app.dynamic.v1.DecorateCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.DecorateCard other) {
      if (other == bilibili.app.dynamic.v1.DecorateCard.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getCardUrl().isEmpty()) {
        cardUrl_ = other.cardUrl_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getJumpUrl().isEmpty()) {
        jumpUrl_ = other.jumpUrl_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasFan()) {
        mergeFan(other.getFan());
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
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              cardUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              jumpUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFanFieldBuilder().getBuilder(),
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

    private long id_ ;
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object cardUrl_ = "";
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return The cardUrl.
     */
    public java.lang.String getCardUrl() {
      java.lang.Object ref = cardUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return The bytes for cardUrl.
     */
    public com.google.protobuf.ByteString
        getCardUrlBytes() {
      java.lang.Object ref = cardUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @param value The cardUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCardUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cardUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCardUrl() {
      cardUrl_ = getDefaultInstance().getCardUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @param value The bytes for cardUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCardUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cardUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object jumpUrl_ = "";
    /**
     * <pre>
     * 装扮卡片点击跳转链接
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
     * 装扮卡片点击跳转链接
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
     * 装扮卡片点击跳转链接
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
     * 装扮卡片点击跳转链接
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
     * 装扮卡片点击跳转链接
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

    private bilibili.app.dynamic.v1.DecoCardFan fan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.DecoCardFan, bilibili.app.dynamic.v1.DecoCardFan.Builder, bilibili.app.dynamic.v1.DecoCardFanOrBuilder> fanBuilder_;
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     * @return Whether the fan field is set.
     */
    public boolean hasFan() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     * @return The fan.
     */
    public bilibili.app.dynamic.v1.DecoCardFan getFan() {
      if (fanBuilder_ == null) {
        return fan_ == null ? bilibili.app.dynamic.v1.DecoCardFan.getDefaultInstance() : fan_;
      } else {
        return fanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public Builder setFan(bilibili.app.dynamic.v1.DecoCardFan value) {
      if (fanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fan_ = value;
      } else {
        fanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public Builder setFan(
        bilibili.app.dynamic.v1.DecoCardFan.Builder builderForValue) {
      if (fanBuilder_ == null) {
        fan_ = builderForValue.build();
      } else {
        fanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public Builder mergeFan(bilibili.app.dynamic.v1.DecoCardFan value) {
      if (fanBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          fan_ != null &&
          fan_ != bilibili.app.dynamic.v1.DecoCardFan.getDefaultInstance()) {
          getFanBuilder().mergeFrom(value);
        } else {
          fan_ = value;
        }
      } else {
        fanBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public Builder clearFan() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fan_ = null;
      if (fanBuilder_ != null) {
        fanBuilder_.dispose();
        fanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public bilibili.app.dynamic.v1.DecoCardFan.Builder getFanBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getFanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    public bilibili.app.dynamic.v1.DecoCardFanOrBuilder getFanOrBuilder() {
      if (fanBuilder_ != null) {
        return fanBuilder_.getMessageOrBuilder();
      } else {
        return fan_ == null ?
            bilibili.app.dynamic.v1.DecoCardFan.getDefaultInstance() : fan_;
      }
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.DecoCardFan, bilibili.app.dynamic.v1.DecoCardFan.Builder, bilibili.app.dynamic.v1.DecoCardFanOrBuilder> 
        getFanFieldBuilder() {
      if (fanBuilder_ == null) {
        fanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v1.DecoCardFan, bilibili.app.dynamic.v1.DecoCardFan.Builder, bilibili.app.dynamic.v1.DecoCardFanOrBuilder>(
                getFan(),
                getParentForChildren(),
                isClean());
        fan_ = null;
      }
      return fanBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DecorateCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DecorateCard)
  private static final bilibili.app.dynamic.v1.DecorateCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.DecorateCard();
  }

  public static bilibili.app.dynamic.v1.DecorateCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DecorateCard>
      PARSER = new com.google.protobuf.AbstractParser<DecorateCard>() {
    @java.lang.Override
    public DecorateCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<DecorateCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DecorateCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.DecorateCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

