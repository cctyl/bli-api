// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/double.proto

package bilibili.app.card.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.card.v1.ThreeItemV2Item}
 */
public final class ThreeItemV2Item extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.card.v1.ThreeItemV2Item)
    ThreeItemV2ItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreeItemV2Item.newBuilder() to construct.
  private ThreeItemV2Item(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreeItemV2Item() {
    descText1_ = "";
    descText2_ = "";
    badge_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreeItemV2Item();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.card.v1.Double.internal_static_bilibili_app_card_v1_ThreeItemV2Item_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.card.v1.Double.internal_static_bilibili_app_card_v1_ThreeItemV2Item_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.card.v1.ThreeItemV2Item.class, bilibili.app.card.v1.ThreeItemV2Item.Builder.class);
  }

  public static final int BASE_FIELD_NUMBER = 1;
  private bilibili.app.card.v1.Base base_;
  /**
   * <pre>
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
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder() {
    return base_ == null ? bilibili.app.card.v1.Base.getDefaultInstance() : base_;
  }

  public static final int COVER_LEFT_ICON_FIELD_NUMBER = 2;
  private int coverLeftIcon_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_left_icon = 2;</code>
   * @return The coverLeftIcon.
   */
  @java.lang.Override
  public int getCoverLeftIcon() {
    return coverLeftIcon_;
  }

  public static final int DESC_TEXT_1_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object descText1_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_text_1 = 3;</code>
   * @return The descText1.
   */
  @java.lang.Override
  public java.lang.String getDescText1() {
    java.lang.Object ref = descText1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descText1_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_text_1 = 3;</code>
   * @return The bytes for descText1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescText1Bytes() {
    java.lang.Object ref = descText1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descText1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC_ICON_1_FIELD_NUMBER = 4;
  private int descIcon1_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 desc_icon_1 = 4;</code>
   * @return The descIcon1.
   */
  @java.lang.Override
  public int getDescIcon1() {
    return descIcon1_;
  }

  public static final int DESC_TEXT_2_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object descText2_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_text_2 = 5;</code>
   * @return The descText2.
   */
  @java.lang.Override
  public java.lang.String getDescText2() {
    java.lang.Object ref = descText2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descText2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_text_2 = 5;</code>
   * @return The bytes for descText2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescText2Bytes() {
    java.lang.Object ref = descText2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descText2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC_ICON_2_FIELD_NUMBER = 6;
  private int descIcon2_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 desc_icon_2 = 6;</code>
   * @return The descIcon2.
   */
  @java.lang.Override
  public int getDescIcon2() {
    return descIcon2_;
  }

  public static final int BADGE_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object badge_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 7;</code>
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
   * <code>string badge = 7;</code>
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
    if (coverLeftIcon_ != 0) {
      output.writeInt32(2, coverLeftIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descText1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, descText1_);
    }
    if (descIcon1_ != 0) {
      output.writeInt32(4, descIcon1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descText2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, descText2_);
    }
    if (descIcon2_ != 0) {
      output.writeInt32(6, descIcon2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, badge_);
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
    if (coverLeftIcon_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, coverLeftIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descText1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, descText1_);
    }
    if (descIcon1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, descIcon1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descText2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, descText2_);
    }
    if (descIcon2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, descIcon2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, badge_);
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
    if (!(obj instanceof bilibili.app.card.v1.ThreeItemV2Item)) {
      return super.equals(obj);
    }
    bilibili.app.card.v1.ThreeItemV2Item other = (bilibili.app.card.v1.ThreeItemV2Item) obj;

    if (hasBase() != other.hasBase()) return false;
    if (hasBase()) {
      if (!getBase()
          .equals(other.getBase())) return false;
    }
    if (getCoverLeftIcon()
        != other.getCoverLeftIcon()) return false;
    if (!getDescText1()
        .equals(other.getDescText1())) return false;
    if (getDescIcon1()
        != other.getDescIcon1()) return false;
    if (!getDescText2()
        .equals(other.getDescText2())) return false;
    if (getDescIcon2()
        != other.getDescIcon2()) return false;
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
    hash = (37 * hash) + COVER_LEFT_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getCoverLeftIcon();
    hash = (37 * hash) + DESC_TEXT_1_FIELD_NUMBER;
    hash = (53 * hash) + getDescText1().hashCode();
    hash = (37 * hash) + DESC_ICON_1_FIELD_NUMBER;
    hash = (53 * hash) + getDescIcon1();
    hash = (37 * hash) + DESC_TEXT_2_FIELD_NUMBER;
    hash = (53 * hash) + getDescText2().hashCode();
    hash = (37 * hash) + DESC_ICON_2_FIELD_NUMBER;
    hash = (53 * hash) + getDescIcon2();
    hash = (37 * hash) + BADGE_FIELD_NUMBER;
    hash = (53 * hash) + getBadge().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.ThreeItemV2Item parseFrom(
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
  public static Builder newBuilder(bilibili.app.card.v1.ThreeItemV2Item prototype) {
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
   * Protobuf type {@code bilibili.app.card.v1.ThreeItemV2Item}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.card.v1.ThreeItemV2Item)
      bilibili.app.card.v1.ThreeItemV2ItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.card.v1.Double.internal_static_bilibili_app_card_v1_ThreeItemV2Item_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.card.v1.Double.internal_static_bilibili_app_card_v1_ThreeItemV2Item_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.card.v1.ThreeItemV2Item.class, bilibili.app.card.v1.ThreeItemV2Item.Builder.class);
    }

    // Construct using bilibili.app.card.v1.ThreeItemV2Item.newBuilder()
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
      coverLeftIcon_ = 0;
      descText1_ = "";
      descIcon1_ = 0;
      descText2_ = "";
      descIcon2_ = 0;
      badge_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.card.v1.Double.internal_static_bilibili_app_card_v1_ThreeItemV2Item_descriptor;
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV2Item getDefaultInstanceForType() {
      return bilibili.app.card.v1.ThreeItemV2Item.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV2Item build() {
      bilibili.app.card.v1.ThreeItemV2Item result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.card.v1.ThreeItemV2Item buildPartial() {
      bilibili.app.card.v1.ThreeItemV2Item result = new bilibili.app.card.v1.ThreeItemV2Item(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.card.v1.ThreeItemV2Item result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.base_ = baseBuilder_ == null
            ? base_
            : baseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coverLeftIcon_ = coverLeftIcon_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.descText1_ = descText1_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.descIcon1_ = descIcon1_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.descText2_ = descText2_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.descIcon2_ = descIcon2_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.badge_ = badge_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.card.v1.ThreeItemV2Item) {
        return mergeFrom((bilibili.app.card.v1.ThreeItemV2Item)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.card.v1.ThreeItemV2Item other) {
      if (other == bilibili.app.card.v1.ThreeItemV2Item.getDefaultInstance()) return this;
      if (other.hasBase()) {
        mergeBase(other.getBase());
      }
      if (other.getCoverLeftIcon() != 0) {
        setCoverLeftIcon(other.getCoverLeftIcon());
      }
      if (!other.getDescText1().isEmpty()) {
        descText1_ = other.descText1_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getDescIcon1() != 0) {
        setDescIcon1(other.getDescIcon1());
      }
      if (!other.getDescText2().isEmpty()) {
        descText2_ = other.descText2_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getDescIcon2() != 0) {
        setDescIcon2(other.getDescIcon2());
      }
      if (!other.getBadge().isEmpty()) {
        badge_ = other.badge_;
        bitField0_ |= 0x00000040;
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
            case 16: {
              coverLeftIcon_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              descText1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              descIcon1_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              descText2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              descIcon2_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              badge_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private int coverLeftIcon_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 cover_left_icon = 2;</code>
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
     * <code>int32 cover_left_icon = 2;</code>
     * @param value The coverLeftIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCoverLeftIcon(int value) {

      coverLeftIcon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 cover_left_icon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoverLeftIcon() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coverLeftIcon_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object descText1_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_1 = 3;</code>
     * @return The descText1.
     */
    public java.lang.String getDescText1() {
      java.lang.Object ref = descText1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descText1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_1 = 3;</code>
     * @return The bytes for descText1.
     */
    public com.google.protobuf.ByteString
        getDescText1Bytes() {
      java.lang.Object ref = descText1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descText1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_1 = 3;</code>
     * @param value The descText1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescText1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      descText1_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_1 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescText1() {
      descText1_ = getDefaultInstance().getDescText1();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_1 = 3;</code>
     * @param value The bytes for descText1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescText1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      descText1_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int descIcon1_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_1 = 4;</code>
     * @return The descIcon1.
     */
    @java.lang.Override
    public int getDescIcon1() {
      return descIcon1_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_1 = 4;</code>
     * @param value The descIcon1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescIcon1(int value) {

      descIcon1_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_1 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescIcon1() {
      bitField0_ = (bitField0_ & ~0x00000008);
      descIcon1_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object descText2_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_2 = 5;</code>
     * @return The descText2.
     */
    public java.lang.String getDescText2() {
      java.lang.Object ref = descText2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descText2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_2 = 5;</code>
     * @return The bytes for descText2.
     */
    public com.google.protobuf.ByteString
        getDescText2Bytes() {
      java.lang.Object ref = descText2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descText2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_2 = 5;</code>
     * @param value The descText2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescText2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      descText2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescText2() {
      descText2_ = getDefaultInstance().getDescText2();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_text_2 = 5;</code>
     * @param value The bytes for descText2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescText2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      descText2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int descIcon2_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_2 = 6;</code>
     * @return The descIcon2.
     */
    @java.lang.Override
    public int getDescIcon2() {
      return descIcon2_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_2 = 6;</code>
     * @param value The descIcon2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescIcon2(int value) {

      descIcon2_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 desc_icon_2 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescIcon2() {
      bitField0_ = (bitField0_ & ~0x00000020);
      descIcon2_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object badge_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 7;</code>
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
     * <code>string badge = 7;</code>
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
     * <code>string badge = 7;</code>
     * @param value The badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadge(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      badge_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadge() {
      badge_ = getDefaultInstance().getBadge();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 7;</code>
     * @param value The bytes for badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      badge_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.card.v1.ThreeItemV2Item)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.card.v1.ThreeItemV2Item)
  private static final bilibili.app.card.v1.ThreeItemV2Item DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.card.v1.ThreeItemV2Item();
  }

  public static bilibili.app.card.v1.ThreeItemV2Item getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreeItemV2Item>
      PARSER = new com.google.protobuf.AbstractParser<ThreeItemV2Item>() {
    @java.lang.Override
    public ThreeItemV2Item parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreeItemV2Item> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreeItemV2Item> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.card.v1.ThreeItemV2Item getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

