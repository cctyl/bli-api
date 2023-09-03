// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 三点-收藏
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.ThreePointFavorite}
 */
public final class ThreePointFavorite extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.ThreePointFavorite)
    ThreePointFavoriteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreePointFavorite.newBuilder() to construct.
  private ThreePointFavorite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreePointFavorite() {
    icon_ = "";
    title_ = "";
    cancelIcon_ = "";
    cancelTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreePointFavorite();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointFavorite_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointFavorite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.ThreePointFavorite.class, bilibili.dynamic.gateway.ThreePointFavorite.Builder.class);
  }

  public static final int ICON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <pre>
   * icon
   * </pre>
   *
   * <code>string icon = 1;</code>
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
   * icon
   * </pre>
   *
   * <code>string icon = 1;</code>
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

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
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
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
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

  public static final int ID_FIELD_NUMBER = 3;
  private long id_ = 0L;
  /**
   * <pre>
   * 物料ID
   * </pre>
   *
   * <code>int64 id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int IS_FAVOURITE_FIELD_NUMBER = 4;
  private boolean isFavourite_ = false;
  /**
   * <pre>
   * 是否订阅
   * </pre>
   *
   * <code>bool is_favourite = 4;</code>
   * @return The isFavourite.
   */
  @java.lang.Override
  public boolean getIsFavourite() {
    return isFavourite_;
  }

  public static final int CANCEL_ICON_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cancelIcon_ = "";
  /**
   * <pre>
   * 取消收藏图标
   * </pre>
   *
   * <code>string cancel_icon = 5;</code>
   * @return The cancelIcon.
   */
  @java.lang.Override
  public java.lang.String getCancelIcon() {
    java.lang.Object ref = cancelIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cancelIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 取消收藏图标
   * </pre>
   *
   * <code>string cancel_icon = 5;</code>
   * @return The bytes for cancelIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCancelIconBytes() {
    java.lang.Object ref = cancelIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cancelIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CANCEL_TITLE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cancelTitle_ = "";
  /**
   * <pre>
   * 取消收藏文案
   * </pre>
   *
   * <code>string cancel_title = 6;</code>
   * @return The cancelTitle.
   */
  @java.lang.Override
  public java.lang.String getCancelTitle() {
    java.lang.Object ref = cancelTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cancelTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 取消收藏文案
   * </pre>
   *
   * <code>string cancel_title = 6;</code>
   * @return The bytes for cancelTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCancelTitleBytes() {
    java.lang.Object ref = cancelTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cancelTitle_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (id_ != 0L) {
      output.writeInt64(3, id_);
    }
    if (isFavourite_ != false) {
      output.writeBool(4, isFavourite_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cancelIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, cancelIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cancelTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, cancelTitle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (isFavourite_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isFavourite_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cancelIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, cancelIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cancelTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, cancelTitle_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.ThreePointFavorite)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.ThreePointFavorite other = (bilibili.dynamic.gateway.ThreePointFavorite) obj;

    if (!getIcon()
        .equals(other.getIcon())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (getId()
        != other.getId()) return false;
    if (getIsFavourite()
        != other.getIsFavourite()) return false;
    if (!getCancelIcon()
        .equals(other.getCancelIcon())) return false;
    if (!getCancelTitle()
        .equals(other.getCancelTitle())) return false;
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
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + IS_FAVOURITE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFavourite());
    hash = (37 * hash) + CANCEL_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getCancelIcon().hashCode();
    hash = (37 * hash) + CANCEL_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getCancelTitle().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ThreePointFavorite parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.ThreePointFavorite prototype) {
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
   * 三点-收藏
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.ThreePointFavorite}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.ThreePointFavorite)
      bilibili.dynamic.gateway.ThreePointFavoriteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointFavorite_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointFavorite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.ThreePointFavorite.class, bilibili.dynamic.gateway.ThreePointFavorite.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.ThreePointFavorite.newBuilder()
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
      icon_ = "";
      title_ = "";
      id_ = 0L;
      isFavourite_ = false;
      cancelIcon_ = "";
      cancelTitle_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ThreePointFavorite_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointFavorite getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.ThreePointFavorite.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointFavorite build() {
      bilibili.dynamic.gateway.ThreePointFavorite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ThreePointFavorite buildPartial() {
      bilibili.dynamic.gateway.ThreePointFavorite result = new bilibili.dynamic.gateway.ThreePointFavorite(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.ThreePointFavorite result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.icon_ = icon_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isFavourite_ = isFavourite_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.cancelIcon_ = cancelIcon_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.cancelTitle_ = cancelTitle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.ThreePointFavorite) {
        return mergeFrom((bilibili.dynamic.gateway.ThreePointFavorite)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.ThreePointFavorite other) {
      if (other == bilibili.dynamic.gateway.ThreePointFavorite.getDefaultInstance()) return this;
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getIsFavourite() != false) {
        setIsFavourite(other.getIsFavourite());
      }
      if (!other.getCancelIcon().isEmpty()) {
        cancelIcon_ = other.cancelIcon_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getCancelTitle().isEmpty()) {
        cancelTitle_ = other.cancelTitle_;
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
              icon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              isFavourite_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              cancelIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              cancelTitle_ = input.readStringRequireUtf8();
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

    private java.lang.Object icon_ = "";
    /**
     * <pre>
     * icon
     * </pre>
     *
     * <code>string icon = 1;</code>
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
     * icon
     * </pre>
     *
     * <code>string icon = 1;</code>
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
     * icon
     * </pre>
     *
     * <code>string icon = 1;</code>
     * @param value The icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      icon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * icon
     * </pre>
     *
     * <code>string icon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      icon_ = getDefaultInstance().getIcon();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * icon
     * </pre>
     *
     * <code>string icon = 1;</code>
     * @param value The bytes for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      icon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * 标题
     * </pre>
     *
     * <code>string title = 2;</code>
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
     * 标题
     * </pre>
     *
     * <code>string title = 2;</code>
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
     * 标题
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标题
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标题
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * 物料ID
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * 物料ID
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 物料ID
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      id_ = 0L;
      onChanged();
      return this;
    }

    private boolean isFavourite_ ;
    /**
     * <pre>
     * 是否订阅
     * </pre>
     *
     * <code>bool is_favourite = 4;</code>
     * @return The isFavourite.
     */
    @java.lang.Override
    public boolean getIsFavourite() {
      return isFavourite_;
    }
    /**
     * <pre>
     * 是否订阅
     * </pre>
     *
     * <code>bool is_favourite = 4;</code>
     * @param value The isFavourite to set.
     * @return This builder for chaining.
     */
    public Builder setIsFavourite(boolean value) {

      isFavourite_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否订阅
     * </pre>
     *
     * <code>bool is_favourite = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFavourite() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isFavourite_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object cancelIcon_ = "";
    /**
     * <pre>
     * 取消收藏图标
     * </pre>
     *
     * <code>string cancel_icon = 5;</code>
     * @return The cancelIcon.
     */
    public java.lang.String getCancelIcon() {
      java.lang.Object ref = cancelIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cancelIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 取消收藏图标
     * </pre>
     *
     * <code>string cancel_icon = 5;</code>
     * @return The bytes for cancelIcon.
     */
    public com.google.protobuf.ByteString
        getCancelIconBytes() {
      java.lang.Object ref = cancelIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cancelIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 取消收藏图标
     * </pre>
     *
     * <code>string cancel_icon = 5;</code>
     * @param value The cancelIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCancelIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cancelIcon_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 取消收藏图标
     * </pre>
     *
     * <code>string cancel_icon = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCancelIcon() {
      cancelIcon_ = getDefaultInstance().getCancelIcon();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 取消收藏图标
     * </pre>
     *
     * <code>string cancel_icon = 5;</code>
     * @param value The bytes for cancelIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCancelIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cancelIcon_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object cancelTitle_ = "";
    /**
     * <pre>
     * 取消收藏文案
     * </pre>
     *
     * <code>string cancel_title = 6;</code>
     * @return The cancelTitle.
     */
    public java.lang.String getCancelTitle() {
      java.lang.Object ref = cancelTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cancelTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 取消收藏文案
     * </pre>
     *
     * <code>string cancel_title = 6;</code>
     * @return The bytes for cancelTitle.
     */
    public com.google.protobuf.ByteString
        getCancelTitleBytes() {
      java.lang.Object ref = cancelTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cancelTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 取消收藏文案
     * </pre>
     *
     * <code>string cancel_title = 6;</code>
     * @param value The cancelTitle to set.
     * @return This builder for chaining.
     */
    public Builder setCancelTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cancelTitle_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 取消收藏文案
     * </pre>
     *
     * <code>string cancel_title = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCancelTitle() {
      cancelTitle_ = getDefaultInstance().getCancelTitle();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 取消收藏文案
     * </pre>
     *
     * <code>string cancel_title = 6;</code>
     * @param value The bytes for cancelTitle to set.
     * @return This builder for chaining.
     */
    public Builder setCancelTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cancelTitle_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.ThreePointFavorite)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.ThreePointFavorite)
  private static final bilibili.dynamic.gateway.ThreePointFavorite DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.ThreePointFavorite();
  }

  public static bilibili.dynamic.gateway.ThreePointFavorite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreePointFavorite>
      PARSER = new com.google.protobuf.AbstractParser<ThreePointFavorite>() {
    @java.lang.Override
    public ThreePointFavorite parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreePointFavorite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreePointFavorite> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.ThreePointFavorite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

