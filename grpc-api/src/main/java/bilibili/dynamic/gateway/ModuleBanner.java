// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 动态列表-通栏
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.ModuleBanner}
 */
public final class ModuleBanner extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.ModuleBanner)
    ModuleBannerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleBanner.newBuilder() to construct.
  private ModuleBanner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleBanner() {
    title_ = "";
    type_ = 0;
    dislikeText_ = "";
    dislikeIcon_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleBanner();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBanner_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBanner_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.ModuleBanner.class, bilibili.dynamic.gateway.ModuleBanner.Builder.class);
  }

  private int itemCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object item_;
  public enum ItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    USER(3),
    ITEM_NOT_SET(0);
    private final int value;
    private ItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static ItemCase forNumber(int value) {
      switch (value) {
        case 3: return USER;
        case 0: return ITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ItemCase
  getItemCase() {
    return ItemCase.forNumber(
        itemCase_);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 模块标题
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
   * 模块标题
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

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <pre>
   * 卡片类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * 卡片类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.dynamic.gateway.ModuleBannerType getType() {
    bilibili.dynamic.gateway.ModuleBannerType result = bilibili.dynamic.gateway.ModuleBannerType.forNumber(type_);
    return result == null ? bilibili.dynamic.gateway.ModuleBannerType.UNRECOGNIZED : result;
  }

  public static final int USER_FIELD_NUMBER = 3;
  /**
   * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return itemCase_ == 3;
  }
  /**
   * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
   * @return The user.
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBannerUser getUser() {
    if (itemCase_ == 3) {
       return (bilibili.dynamic.gateway.ModuleBannerUser) item_;
    }
    return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
  }
  /**
   * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBannerUserOrBuilder getUserOrBuilder() {
    if (itemCase_ == 3) {
       return (bilibili.dynamic.gateway.ModuleBannerUser) item_;
    }
    return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
  }

  public static final int DISLIKE_TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dislikeText_ = "";
  /**
   * <pre>
   * 不感兴趣文案
   * </pre>
   *
   * <code>string dislike_text = 4;</code>
   * @return The dislikeText.
   */
  @java.lang.Override
  public java.lang.String getDislikeText() {
    java.lang.Object ref = dislikeText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dislikeText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 不感兴趣文案
   * </pre>
   *
   * <code>string dislike_text = 4;</code>
   * @return The bytes for dislikeText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDislikeTextBytes() {
    java.lang.Object ref = dislikeText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dislikeText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISLIKE_ICON_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dislikeIcon_ = "";
  /**
   * <pre>
   * 不感兴趣图标
   * </pre>
   *
   * <code>string dislike_icon = 5;</code>
   * @return The dislikeIcon.
   */
  @java.lang.Override
  public java.lang.String getDislikeIcon() {
    java.lang.Object ref = dislikeIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dislikeIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 不感兴趣图标
   * </pre>
   *
   * <code>string dislike_icon = 5;</code>
   * @return The bytes for dislikeIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDislikeIconBytes() {
    java.lang.Object ref = dislikeIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dislikeIcon_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (type_ != bilibili.dynamic.gateway.ModuleBannerType.module_banner_type_none.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (itemCase_ == 3) {
      output.writeMessage(3, (bilibili.dynamic.gateway.ModuleBannerUser) item_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dislikeText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dislikeText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dislikeIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dislikeIcon_);
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
    if (type_ != bilibili.dynamic.gateway.ModuleBannerType.module_banner_type_none.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (itemCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (bilibili.dynamic.gateway.ModuleBannerUser) item_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dislikeText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dislikeText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dislikeIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dislikeIcon_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.ModuleBanner)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.ModuleBanner other = (bilibili.dynamic.gateway.ModuleBanner) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (type_ != other.type_) return false;
    if (!getDislikeText()
        .equals(other.getDislikeText())) return false;
    if (!getDislikeIcon()
        .equals(other.getDislikeIcon())) return false;
    if (!getItemCase().equals(other.getItemCase())) return false;
    switch (itemCase_) {
      case 3:
        if (!getUser()
            .equals(other.getUser())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DISLIKE_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getDislikeText().hashCode();
    hash = (37 * hash) + DISLIKE_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getDislikeIcon().hashCode();
    switch (itemCase_) {
      case 3:
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBanner parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.ModuleBanner prototype) {
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
   * 动态列表-通栏
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.ModuleBanner}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.ModuleBanner)
      bilibili.dynamic.gateway.ModuleBannerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBanner_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBanner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.ModuleBanner.class, bilibili.dynamic.gateway.ModuleBanner.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.ModuleBanner.newBuilder()
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
      type_ = 0;
      if (userBuilder_ != null) {
        userBuilder_.clear();
      }
      dislikeText_ = "";
      dislikeIcon_ = "";
      itemCase_ = 0;
      item_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBanner_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBanner getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.ModuleBanner.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBanner build() {
      bilibili.dynamic.gateway.ModuleBanner result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBanner buildPartial() {
      bilibili.dynamic.gateway.ModuleBanner result = new bilibili.dynamic.gateway.ModuleBanner(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.ModuleBanner result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dislikeText_ = dislikeText_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.dislikeIcon_ = dislikeIcon_;
      }
    }

    private void buildPartialOneofs(bilibili.dynamic.gateway.ModuleBanner result) {
      result.itemCase_ = itemCase_;
      result.item_ = this.item_;
      if (itemCase_ == 3 &&
          userBuilder_ != null) {
        result.item_ = userBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.ModuleBanner) {
        return mergeFrom((bilibili.dynamic.gateway.ModuleBanner)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.ModuleBanner other) {
      if (other == bilibili.dynamic.gateway.ModuleBanner.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getDislikeText().isEmpty()) {
        dislikeText_ = other.dislikeText_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getDislikeIcon().isEmpty()) {
        dislikeIcon_ = other.dislikeIcon_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      switch (other.getItemCase()) {
        case USER: {
          mergeUser(other.getUser());
          break;
        }
        case ITEM_NOT_SET: {
          break;
        }
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
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              itemCase_ = 3;
              break;
            } // case 26
            case 34: {
              dislikeText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              dislikeIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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
    private int itemCase_ = 0;
    private java.lang.Object item_;
    public ItemCase
        getItemCase() {
      return ItemCase.forNumber(
          itemCase_);
    }

    public Builder clearItem() {
      itemCase_ = 0;
      item_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * 模块标题
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
     * 模块标题
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
     * 模块标题
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
     * 模块标题
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
     * 模块标题
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

    private int type_ = 0;
    /**
     * <pre>
     * 卡片类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * 卡片类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡片类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerType getType() {
      bilibili.dynamic.gateway.ModuleBannerType result = bilibili.dynamic.gateway.ModuleBannerType.forNumber(type_);
      return result == null ? bilibili.dynamic.gateway.ModuleBannerType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 卡片类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.dynamic.gateway.ModuleBannerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡片类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.ModuleBannerType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.ModuleBannerUser, bilibili.dynamic.gateway.ModuleBannerUser.Builder, bilibili.dynamic.gateway.ModuleBannerUserOrBuilder> userBuilder_;
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
      return itemCase_ == 3;
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     * @return The user.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerUser getUser() {
      if (userBuilder_ == null) {
        if (itemCase_ == 3) {
          return (bilibili.dynamic.gateway.ModuleBannerUser) item_;
        }
        return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
      } else {
        if (itemCase_ == 3) {
          return userBuilder_.getMessage();
        }
        return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    public Builder setUser(bilibili.dynamic.gateway.ModuleBannerUser value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    public Builder setUser(
        bilibili.dynamic.gateway.ModuleBannerUser.Builder builderForValue) {
      if (userBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    public Builder mergeUser(bilibili.dynamic.gateway.ModuleBannerUser value) {
      if (userBuilder_ == null) {
        if (itemCase_ == 3 &&
            item_ != bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance()) {
          item_ = bilibili.dynamic.gateway.ModuleBannerUser.newBuilder((bilibili.dynamic.gateway.ModuleBannerUser) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 3) {
          userBuilder_.mergeFrom(value);
        } else {
          userBuilder_.setMessage(value);
        }
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        if (itemCase_ == 3) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 3) {
          itemCase_ = 0;
          item_ = null;
        }
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUser.Builder getUserBuilder() {
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerUserOrBuilder getUserOrBuilder() {
      if ((itemCase_ == 3) && (userBuilder_ != null)) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 3) {
          return (bilibili.dynamic.gateway.ModuleBannerUser) item_;
        }
        return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.dynamic.gateway.ModuleBannerUser user = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.ModuleBannerUser, bilibili.dynamic.gateway.ModuleBannerUser.Builder, bilibili.dynamic.gateway.ModuleBannerUserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        if (!(itemCase_ == 3)) {
          item_ = bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
        }
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.gateway.ModuleBannerUser, bilibili.dynamic.gateway.ModuleBannerUser.Builder, bilibili.dynamic.gateway.ModuleBannerUserOrBuilder>(
                (bilibili.dynamic.gateway.ModuleBannerUser) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 3;
      onChanged();
      return userBuilder_;
    }

    private java.lang.Object dislikeText_ = "";
    /**
     * <pre>
     * 不感兴趣文案
     * </pre>
     *
     * <code>string dislike_text = 4;</code>
     * @return The dislikeText.
     */
    public java.lang.String getDislikeText() {
      java.lang.Object ref = dislikeText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dislikeText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 不感兴趣文案
     * </pre>
     *
     * <code>string dislike_text = 4;</code>
     * @return The bytes for dislikeText.
     */
    public com.google.protobuf.ByteString
        getDislikeTextBytes() {
      java.lang.Object ref = dislikeText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dislikeText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 不感兴趣文案
     * </pre>
     *
     * <code>string dislike_text = 4;</code>
     * @param value The dislikeText to set.
     * @return This builder for chaining.
     */
    public Builder setDislikeText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dislikeText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不感兴趣文案
     * </pre>
     *
     * <code>string dislike_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDislikeText() {
      dislikeText_ = getDefaultInstance().getDislikeText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不感兴趣文案
     * </pre>
     *
     * <code>string dislike_text = 4;</code>
     * @param value The bytes for dislikeText to set.
     * @return This builder for chaining.
     */
    public Builder setDislikeTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dislikeText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object dislikeIcon_ = "";
    /**
     * <pre>
     * 不感兴趣图标
     * </pre>
     *
     * <code>string dislike_icon = 5;</code>
     * @return The dislikeIcon.
     */
    public java.lang.String getDislikeIcon() {
      java.lang.Object ref = dislikeIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dislikeIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 不感兴趣图标
     * </pre>
     *
     * <code>string dislike_icon = 5;</code>
     * @return The bytes for dislikeIcon.
     */
    public com.google.protobuf.ByteString
        getDislikeIconBytes() {
      java.lang.Object ref = dislikeIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dislikeIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 不感兴趣图标
     * </pre>
     *
     * <code>string dislike_icon = 5;</code>
     * @param value The dislikeIcon to set.
     * @return This builder for chaining.
     */
    public Builder setDislikeIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dislikeIcon_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不感兴趣图标
     * </pre>
     *
     * <code>string dislike_icon = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDislikeIcon() {
      dislikeIcon_ = getDefaultInstance().getDislikeIcon();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不感兴趣图标
     * </pre>
     *
     * <code>string dislike_icon = 5;</code>
     * @param value The bytes for dislikeIcon to set.
     * @return This builder for chaining.
     */
    public Builder setDislikeIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dislikeIcon_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.ModuleBanner)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.ModuleBanner)
  private static final bilibili.dynamic.gateway.ModuleBanner DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.ModuleBanner();
  }

  public static bilibili.dynamic.gateway.ModuleBanner getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleBanner>
      PARSER = new com.google.protobuf.AbstractParser<ModuleBanner>() {
    @java.lang.Override
    public ModuleBanner parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModuleBanner> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleBanner> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBanner getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
