// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/single.proto

package bilibili.app.card.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.card.v1.ThreeItemV1Item}
 */
public final class ThreeItemV1Item extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.card.v1.ThreeItemV1Item)
    ThreeItemV1ItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreeItemV1Item.newBuilder() to construct.
  private ThreeItemV1Item(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreeItemV1Item() {
    coverLeftText_ = "";
    desc1_ = "";
    desc2_ = "";
    badge_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreeItemV1Item();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_ThreeItemV1Item_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_ThreeItemV1Item_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.card.v1.ThreeItemV1Item.class, bilibili.app.card.v1.ThreeItemV1Item.Builder.class);
  }

  public static final int BASE_FIELD_NUMBER = 1;
  private bilibili.app.card.v1.Base base_;
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return Whether the base field is set.
   */
  @java.lang.Override
  public boolean hasBase() {
    return base_ != null;
  }
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return The base.
   */
  @java.lang.Override
  public bilibili.app.card.v1.Base getBase() {
    return base_ == null ? bilibili.app.card.v1.Base.getDefaultInstance() : base_;
  }
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder() {
    return base_ == null ? bilibili.app.card.v1.Base.getDefaultInstance() : base_;
  }

  public static final int COVERLEFTTEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object coverLeftText_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string coverLeftText = 2;</code>
   * @return The coverLeftText.
   */
  @java.lang.Override
  public java.lang.String getCoverLeftText() {
    java.lang.Object ref = coverLeftText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coverLeftText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string coverLeftText = 2;</code>
   * @return The bytes for coverLeftText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoverLeftTextBytes() {
    java.lang.Object ref = coverLeftText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coverLeftText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COVERLEFTICON_FIELD_NUMBER = 3;
  private int coverLeftIcon_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 coverLeftIcon = 3;</code>
   * @return The coverLeftIcon.
   */
  @java.lang.Override
  public int getCoverLeftIcon() {
    return coverLeftIcon_;
  }

  public static final int DESC1_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc1_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc1 = 4;</code>
   * @return The desc1.
   */
  @java.lang.Override
  public java.lang.String getDesc1() {
    java.lang.Object ref = desc1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc1_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc1 = 4;</code>
   * @return The bytes for desc1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDesc1Bytes() {
    java.lang.Object ref = desc1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC2_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc2_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 5;</code>
   * @return The desc2.
   */
  @java.lang.Override
  public java.lang.String getDesc2() {
    java.lang.Object ref = desc2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 5;</code>
   * @return The bytes for desc2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDesc2Bytes() {
    java.lang.Object ref = desc2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BADGE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object badge_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 6;</code>
   * @return The badge.
   */
  @java.lang.Override
  public java.lang.String getBadge() {
    java.lang.Object ref = badge_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      badge_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 6;</code>
   * @return The bytes for badge.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBadgeBytes() {
    java.lang.Object ref = badge_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      badge_ = b;
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
    if (base_ != null) {
      output.writeMessage(1, getBase());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(coverLeftText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, coverLeftText_);
    }
    if (coverLeftIcon_ != 0) {
      output.writeInt32(3, coverLeftIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, desc1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, desc2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, badge_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (base_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBase());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(coverLeftText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, coverLeftText_);
    }
    if (coverLeftIcon_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, coverLeftIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, desc1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, desc2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, badge_);
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
    if (!(obj instanceof bilibili.app.card.v1.ThreeItemV1Item)) {
      return super.equals(obj);
    }
    bilibili.app.card.v1.ThreeItemV1Item other = (bilibili.app.card.v1.ThreeItemV1Item) obj;

    if (hasBase() != other.hasBase()) return false;
    if (hasBase()) {
      if (!getBase()
          .equals(other.getBase())) return false;
    }
    if (!getCoverLeftText()
        .equals(other.getCoverLeftText())) return false;
    if (getCoverLeftIcon()
        != other.getCoverLeftIcon()) return false;
    if (!getDesc1()
        .equals(other.getDesc1())) return false;
    if (!getDesc2()
        .equals(other.getDesc2())) return false;
    if (!getBadge()
        .equals(other.getBadge())) return false;
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
    if (hasBase()) {
      hash = (37 * hash) + BASE_FIELD_NUMBER;
      hash = (53 * hash) + getBase().hashCode();
    }
    hash = (37 * hash) + COVERLEFTTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCoverLeftText().hashCode();
    hash = (37 * hash) + COVERLEFTICON_FIELD_NUMBER;
    hash = (53 * hash) + getCoverLeftIcon();
    hash = (37 * hash) + DESC1_FIELD_NUMBER;
    hash = (53 * hash) + getDesc1().hashCode();
    hash = (37 * hash) + DESC2_FIELD_NUMBER;
    hash = (53 * hash) + getDesc2().hashCode();
    hash = (37 * hash) + BADGE_FIELD_NUMBER;
    hash = (53 * hash) + getBadge().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV1Item parseFrom(
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
  public static Builder newBuilder(bilibili.app.card.v1.ThreeItemV1Item prototype) {
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
   * Protobuf type {@code bilibili.app.card.v1.ThreeItemV1Item}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.card.v1.ThreeItemV1Item)
      bilibili.app.card.v1.ThreeItemV1ItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_ThreeItemV1Item_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_ThreeItemV1Item_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.card.v1.ThreeItemV1Item.class, bilibili.app.card.v1.ThreeItemV1Item.Builder.class);
    }

    // Construct using bilibili.app.card.v1.ThreeItemV1Item.newBuilder()
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
      base_ = null;
      if (baseBuilder_ != null) {
        baseBuilder_.dispose();
        baseBuilder_ = null;
      }
      coverLeftText_ = "";
      coverLeftIcon_ = 0;
      desc1_ = "";
      desc2_ = "";
      badge_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_ThreeItemV1Item_descriptor;
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV1Item getDefaultInstanceForType() {
      return bilibili.app.card.v1.ThreeItemV1Item.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV1Item build() {
      bilibili.app.card.v1.ThreeItemV1Item result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV1Item buildPartial() {
      bilibili.app.card.v1.ThreeItemV1Item result = new bilibili.app.card.v1.ThreeItemV1Item(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.card.v1.ThreeItemV1Item result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.base_ = baseBuilder_ == null
            ? base_
            : baseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coverLeftText_ = coverLeftText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.coverLeftIcon_ = coverLeftIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.desc1_ = desc1_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.desc2_ = desc2_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.badge_ = badge_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.card.v1.ThreeItemV1Item) {
        return mergeFrom((bilibili.app.card.v1.ThreeItemV1Item)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.card.v1.ThreeItemV1Item other) {
      if (other == bilibili.app.card.v1.ThreeItemV1Item.getDefaultInstance()) return this;
      if (other.hasBase()) {
        mergeBase(other.getBase());
      }
      if (!other.getCoverLeftText().isEmpty()) {
        coverLeftText_ = other.coverLeftText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getCoverLeftIcon() != 0) {
        setCoverLeftIcon(other.getCoverLeftIcon());
      }
      if (!other.getDesc1().isEmpty()) {
        desc1_ = other.desc1_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getDesc2().isEmpty()) {
        desc2_ = other.desc2_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getBadge().isEmpty()) {
        badge_ = other.badge_;
        bitField0_ |= 0x00000020;
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
              input.readMessage(
                  getBaseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              coverLeftText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              coverLeftIcon_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              desc1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              desc2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              badge_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private bilibili.app.card.v1.Base base_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.card.v1.Base, bilibili.app.card.v1.Base.Builder, bilibili.app.card.v1.BaseOrBuilder> baseBuilder_;
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     * @return Whether the base field is set.
     */
    public boolean hasBase() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     * @return The base.
     */
    public bilibili.app.card.v1.Base getBase() {
      if (baseBuilder_ == null) {
        return base_ == null ? bilibili.app.card.v1.Base.getDefaultInstance() : base_;
      } else {
        return baseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public Builder setBase(bilibili.app.card.v1.Base value) {
      if (baseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        base_ = value;
      } else {
        baseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public Builder setBase(
        bilibili.app.card.v1.Base.Builder builderForValue) {
      if (baseBuilder_ == null) {
        base_ = builderForValue.build();
      } else {
        baseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public Builder mergeBase(bilibili.app.card.v1.Base value) {
      if (baseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          base_ != null &&
          base_ != bilibili.app.card.v1.Base.getDefaultInstance()) {
          getBaseBuilder().mergeFrom(value);
        } else {
          base_ = value;
        }
      } else {
        baseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public Builder clearBase() {
      bitField0_ = (bitField0_ & ~0x00000001);
      base_ = null;
      if (baseBuilder_ != null) {
        baseBuilder_.dispose();
        baseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public bilibili.app.card.v1.Base.Builder getBaseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    public bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder() {
      if (baseBuilder_ != null) {
        return baseBuilder_.getMessageOrBuilder();
      } else {
        return base_ == null ?
            bilibili.app.card.v1.Base.getDefaultInstance() : base_;
      }
    }
    /**
     * <pre>
     * 条目基本信息
     * </pre>
     *
     * <code>.bilibili.app.card.v1.Base base = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.card.v1.Base, bilibili.app.card.v1.Base.Builder, bilibili.app.card.v1.BaseOrBuilder> 
        getBaseFieldBuilder() {
      if (baseBuilder_ == null) {
        baseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.card.v1.Base, bilibili.app.card.v1.Base.Builder, bilibili.app.card.v1.BaseOrBuilder>(
                getBase(),
                getParentForChildren(),
                isClean());
        base_ = null;
      }
      return baseBuilder_;
    }

    private java.lang.Object coverLeftText_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string coverLeftText = 2;</code>
     * @return The coverLeftText.
     */
    public java.lang.String getCoverLeftText() {
      java.lang.Object ref = coverLeftText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coverLeftText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string coverLeftText = 2;</code>
     * @return The bytes for coverLeftText.
     */
    public com.google.protobuf.ByteString
        getCoverLeftTextBytes() {
      java.lang.Object ref = coverLeftText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coverLeftText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string coverLeftText = 2;</code>
     * @param value The coverLeftText to set.
     * @return This builder for chaining.
     */
    public Builder setCoverLeftText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      coverLeftText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string coverLeftText = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoverLeftText() {
      coverLeftText_ = getDefaultInstance().getCoverLeftText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string coverLeftText = 2;</code>
     * @param value The bytes for coverLeftText to set.
     * @return This builder for chaining.
     */
    public Builder setCoverLeftTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      coverLeftText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int coverLeftIcon_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coverLeftIcon = 3;</code>
     * @return The coverLeftIcon.
     */
    @java.lang.Override
    public int getCoverLeftIcon() {
      return coverLeftIcon_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coverLeftIcon = 3;</code>
     * @param value The coverLeftIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCoverLeftIcon(int value) {

      coverLeftIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coverLeftIcon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoverLeftIcon() {
      bitField0_ = (bitField0_ & ~0x00000004);
      coverLeftIcon_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object desc1_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc1 = 4;</code>
     * @return The desc1.
     */
    public java.lang.String getDesc1() {
      java.lang.Object ref = desc1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc1 = 4;</code>
     * @return The bytes for desc1.
     */
    public com.google.protobuf.ByteString
        getDesc1Bytes() {
      java.lang.Object ref = desc1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc1 = 4;</code>
     * @param value The desc1 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc1_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc1 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc1() {
      desc1_ = getDefaultInstance().getDesc1();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc1 = 4;</code>
     * @param value The bytes for desc1 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc1_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object desc2_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return The desc2.
     */
    public java.lang.String getDesc2() {
      java.lang.Object ref = desc2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return The bytes for desc2.
     */
    public com.google.protobuf.ByteString
        getDesc2Bytes() {
      java.lang.Object ref = desc2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @param value The desc2 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc2() {
      desc2_ = getDefaultInstance().getDesc2();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @param value The bytes for desc2 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object badge_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return The badge.
     */
    public java.lang.String getBadge() {
      java.lang.Object ref = badge_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        badge_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return The bytes for badge.
     */
    public com.google.protobuf.ByteString
        getBadgeBytes() {
      java.lang.Object ref = badge_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        badge_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @param value The badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadge(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      badge_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadge() {
      badge_ = getDefaultInstance().getBadge();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @param value The bytes for badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      badge_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.card.v1.ThreeItemV1Item)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.card.v1.ThreeItemV1Item)
  private static final bilibili.app.card.v1.ThreeItemV1Item DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.card.v1.ThreeItemV1Item();
  }

  public static bilibili.app.card.v1.ThreeItemV1Item getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreeItemV1Item>
      PARSER = new com.google.protobuf.AbstractParser<ThreeItemV1Item>() {
    @java.lang.Override
    public ThreeItemV1Item parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreeItemV1Item> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreeItemV1Item> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.card.v1.ThreeItemV1Item getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

