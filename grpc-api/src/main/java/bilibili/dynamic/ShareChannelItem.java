// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * 渠道
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.ShareChannelItem}
 */
public final class ShareChannelItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.ShareChannelItem)
    ShareChannelItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShareChannelItem.newBuilder() to construct.
  private ShareChannelItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShareChannelItem() {
    name_ = "";
    picture_ = "";
    shareChannel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShareChannelItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_ShareChannelItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_ShareChannelItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.ShareChannelItem.class, bilibili.dynamic.ShareChannelItem.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * 展示文案
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 展示文案
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PICTURE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object picture_ = "";
  /**
   * <pre>
   * 展示图标
   * </pre>
   *
   * <code>string picture = 2;</code>
   * @return The picture.
   */
  @java.lang.Override
  public java.lang.String getPicture() {
    java.lang.Object ref = picture_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      picture_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 展示图标
   * </pre>
   *
   * <code>string picture = 2;</code>
   * @return The bytes for picture.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPictureBytes() {
    java.lang.Object ref = picture_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      picture_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARE_CHANNEL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareChannel_ = "";
  /**
   * <pre>
   * 渠道名称
   * </pre>
   *
   * <code>string share_channel = 3;</code>
   * @return The shareChannel.
   */
  @java.lang.Override
  public java.lang.String getShareChannel() {
    java.lang.Object ref = shareChannel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareChannel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 渠道名称
   * </pre>
   *
   * <code>string share_channel = 3;</code>
   * @return The bytes for shareChannel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareChannelBytes() {
    java.lang.Object ref = shareChannel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareChannel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESERVE_FIELD_NUMBER = 4;
  private bilibili.dynamic.ShareReserve reserve_;
  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
   * @return Whether the reserve field is set.
   */
  @java.lang.Override
  public boolean hasReserve() {
    return reserve_ != null;
  }
  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
   * @return The reserve.
   */
  @java.lang.Override
  public bilibili.dynamic.ShareReserve getReserve() {
    return reserve_ == null ? bilibili.dynamic.ShareReserve.getDefaultInstance() : reserve_;
  }
  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.ShareReserveOrBuilder getReserveOrBuilder() {
    return reserve_ == null ? bilibili.dynamic.ShareReserve.getDefaultInstance() : reserve_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(picture_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, picture_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareChannel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shareChannel_);
    }
    if (reserve_ != null) {
      output.writeMessage(4, getReserve());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(picture_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, picture_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareChannel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shareChannel_);
    }
    if (reserve_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getReserve());
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
    if (!(obj instanceof bilibili.dynamic.ShareChannelItem)) {
      return super.equals(obj);
    }
    bilibili.dynamic.ShareChannelItem other = (bilibili.dynamic.ShareChannelItem) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getPicture()
        .equals(other.getPicture())) return false;
    if (!getShareChannel()
        .equals(other.getShareChannel())) return false;
    if (hasReserve() != other.hasReserve()) return false;
    if (hasReserve()) {
      if (!getReserve()
          .equals(other.getReserve())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PICTURE_FIELD_NUMBER;
    hash = (53 * hash) + getPicture().hashCode();
    hash = (37 * hash) + SHARE_CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + getShareChannel().hashCode();
    if (hasReserve()) {
      hash = (37 * hash) + RESERVE_FIELD_NUMBER;
      hash = (53 * hash) + getReserve().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.ShareChannelItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.ShareChannelItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.ShareChannelItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.ShareChannelItem parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.ShareChannelItem prototype) {
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
   * 渠道
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.ShareChannelItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.ShareChannelItem)
      bilibili.dynamic.ShareChannelItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_ShareChannelItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_ShareChannelItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.ShareChannelItem.class, bilibili.dynamic.ShareChannelItem.Builder.class);
    }

    // Construct using bilibili.dynamic.ShareChannelItem.newBuilder()
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
      name_ = "";
      picture_ = "";
      shareChannel_ = "";
      reserve_ = null;
      if (reserveBuilder_ != null) {
        reserveBuilder_.dispose();
        reserveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_ShareChannelItem_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.ShareChannelItem getDefaultInstanceForType() {
      return bilibili.dynamic.ShareChannelItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.ShareChannelItem build() {
      bilibili.dynamic.ShareChannelItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.ShareChannelItem buildPartial() {
      bilibili.dynamic.ShareChannelItem result = new bilibili.dynamic.ShareChannelItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.ShareChannelItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.picture_ = picture_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.shareChannel_ = shareChannel_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reserve_ = reserveBuilder_ == null
            ? reserve_
            : reserveBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.ShareChannelItem) {
        return mergeFrom((bilibili.dynamic.ShareChannelItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.ShareChannelItem other) {
      if (other == bilibili.dynamic.ShareChannelItem.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPicture().isEmpty()) {
        picture_ = other.picture_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getShareChannel().isEmpty()) {
        shareChannel_ = other.shareChannel_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasReserve()) {
        mergeReserve(other.getReserve());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              picture_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              shareChannel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getReserveFieldBuilder().getBuilder(),
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 展示文案
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 展示文案
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 展示文案
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 展示文案
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 展示文案
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object picture_ = "";
    /**
     * <pre>
     * 展示图标
     * </pre>
     *
     * <code>string picture = 2;</code>
     * @return The picture.
     */
    public java.lang.String getPicture() {
      java.lang.Object ref = picture_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        picture_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 展示图标
     * </pre>
     *
     * <code>string picture = 2;</code>
     * @return The bytes for picture.
     */
    public com.google.protobuf.ByteString
        getPictureBytes() {
      java.lang.Object ref = picture_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        picture_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 展示图标
     * </pre>
     *
     * <code>string picture = 2;</code>
     * @param value The picture to set.
     * @return This builder for chaining.
     */
    public Builder setPicture(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      picture_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 展示图标
     * </pre>
     *
     * <code>string picture = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPicture() {
      picture_ = getDefaultInstance().getPicture();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 展示图标
     * </pre>
     *
     * <code>string picture = 2;</code>
     * @param value The bytes for picture to set.
     * @return This builder for chaining.
     */
    public Builder setPictureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      picture_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object shareChannel_ = "";
    /**
     * <pre>
     * 渠道名称
     * </pre>
     *
     * <code>string share_channel = 3;</code>
     * @return The shareChannel.
     */
    public java.lang.String getShareChannel() {
      java.lang.Object ref = shareChannel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareChannel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 渠道名称
     * </pre>
     *
     * <code>string share_channel = 3;</code>
     * @return The bytes for shareChannel.
     */
    public com.google.protobuf.ByteString
        getShareChannelBytes() {
      java.lang.Object ref = shareChannel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareChannel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 渠道名称
     * </pre>
     *
     * <code>string share_channel = 3;</code>
     * @param value The shareChannel to set.
     * @return This builder for chaining.
     */
    public Builder setShareChannel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareChannel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 渠道名称
     * </pre>
     *
     * <code>string share_channel = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShareChannel() {
      shareChannel_ = getDefaultInstance().getShareChannel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 渠道名称
     * </pre>
     *
     * <code>string share_channel = 3;</code>
     * @param value The bytes for shareChannel to set.
     * @return This builder for chaining.
     */
    public Builder setShareChannelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareChannel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private bilibili.dynamic.ShareReserve reserve_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.ShareReserve, bilibili.dynamic.ShareReserve.Builder, bilibili.dynamic.ShareReserveOrBuilder> reserveBuilder_;
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     * @return Whether the reserve field is set.
     */
    public boolean hasReserve() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     * @return The reserve.
     */
    public bilibili.dynamic.ShareReserve getReserve() {
      if (reserveBuilder_ == null) {
        return reserve_ == null ? bilibili.dynamic.ShareReserve.getDefaultInstance() : reserve_;
      } else {
        return reserveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public Builder setReserve(bilibili.dynamic.ShareReserve value) {
      if (reserveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reserve_ = value;
      } else {
        reserveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public Builder setReserve(
        bilibili.dynamic.ShareReserve.Builder builderForValue) {
      if (reserveBuilder_ == null) {
        reserve_ = builderForValue.build();
      } else {
        reserveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public Builder mergeReserve(bilibili.dynamic.ShareReserve value) {
      if (reserveBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          reserve_ != null &&
          reserve_ != bilibili.dynamic.ShareReserve.getDefaultInstance()) {
          getReserveBuilder().mergeFrom(value);
        } else {
          reserve_ = value;
        }
      } else {
        reserveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public Builder clearReserve() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reserve_ = null;
      if (reserveBuilder_ != null) {
        reserveBuilder_.dispose();
        reserveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public bilibili.dynamic.ShareReserve.Builder getReserveBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getReserveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    public bilibili.dynamic.ShareReserveOrBuilder getReserveOrBuilder() {
      if (reserveBuilder_ != null) {
        return reserveBuilder_.getMessageOrBuilder();
      } else {
        return reserve_ == null ?
            bilibili.dynamic.ShareReserve.getDefaultInstance() : reserve_;
      }
    }
    /**
     * <pre>
     * 预约卡分享图信息，仅分享有预约信息的动态时存在
     * </pre>
     *
     * <code>.bilibili.dynamic.ShareReserve reserve = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.ShareReserve, bilibili.dynamic.ShareReserve.Builder, bilibili.dynamic.ShareReserveOrBuilder> 
        getReserveFieldBuilder() {
      if (reserveBuilder_ == null) {
        reserveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.ShareReserve, bilibili.dynamic.ShareReserve.Builder, bilibili.dynamic.ShareReserveOrBuilder>(
                getReserve(),
                getParentForChildren(),
                isClean());
        reserve_ = null;
      }
      return reserveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.ShareChannelItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.ShareChannelItem)
  private static final bilibili.dynamic.ShareChannelItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.ShareChannelItem();
  }

  public static bilibili.dynamic.ShareChannelItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShareChannelItem>
      PARSER = new com.google.protobuf.AbstractParser<ShareChannelItem>() {
    @java.lang.Override
    public ShareChannelItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShareChannelItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShareChannelItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.ShareChannelItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

