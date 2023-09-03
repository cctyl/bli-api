// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 综合页-话题广场-话题
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.TopicListItem}
 */
public final class TopicListItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.TopicListItem)
    TopicListItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicListItem.newBuilder() to construct.
  private TopicListItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicListItem() {
    icon_ = "";
    iconTitle_ = "";
    topicName_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicListItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_TopicListItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_TopicListItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.TopicListItem.class, bilibili.dynamic.gateway.TopicListItem.Builder.class);
  }

  public static final int ICON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <pre>
   * 前置图标
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
   * 前置图标
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

  public static final int ICON_TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iconTitle_ = "";
  /**
   * <pre>
   * 前置图标文案
   * </pre>
   *
   * <code>string icon_title = 2;</code>
   * @return The iconTitle.
   */
  @java.lang.Override
  public java.lang.String getIconTitle() {
    java.lang.Object ref = iconTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iconTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 前置图标文案
   * </pre>
   *
   * <code>string icon_title = 2;</code>
   * @return The bytes for iconTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconTitleBytes() {
    java.lang.Object ref = iconTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iconTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPIC_ID_FIELD_NUMBER = 3;
  private long topicId_ = 0L;
  /**
   * <pre>
   * 话题id
   * </pre>
   *
   * <code>int64 topic_id = 3;</code>
   * @return The topicId.
   */
  @java.lang.Override
  public long getTopicId() {
    return topicId_;
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object topicName_ = "";
  /**
   * <pre>
   * 话题名
   * </pre>
   *
   * <code>string topic_name = 4;</code>
   * @return The topicName.
   */
  @java.lang.Override
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 话题名
   * </pre>
   *
   * <code>string topic_name = 4;</code>
   * @return The bytes for topicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POS_FIELD_NUMBER = 6;
  private long pos_ = 0L;
  /**
   * <pre>
   * 卡片位次
   * </pre>
   *
   * <code>int64 pos = 6;</code>
   * @return The pos.
   */
  @java.lang.Override
  public long getPos() {
    return pos_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, iconTitle_);
    }
    if (topicId_ != 0L) {
      output.writeInt64(3, topicId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, url_);
    }
    if (pos_ != 0L) {
      output.writeInt64(6, pos_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, iconTitle_);
    }
    if (topicId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, topicId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, url_);
    }
    if (pos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, pos_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.TopicListItem)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.TopicListItem other = (bilibili.dynamic.gateway.TopicListItem) obj;

    if (!getIcon()
        .equals(other.getIcon())) return false;
    if (!getIconTitle()
        .equals(other.getIconTitle())) return false;
    if (getTopicId()
        != other.getTopicId()) return false;
    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (getPos()
        != other.getPos()) return false;
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
    hash = (37 * hash) + ICON_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getIconTitle().hashCode();
    hash = (37 * hash) + TOPIC_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopicId());
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPos());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.TopicListItem parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.TopicListItem prototype) {
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
   * 综合页-话题广场-话题
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.TopicListItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.TopicListItem)
      bilibili.dynamic.gateway.TopicListItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_TopicListItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_TopicListItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.TopicListItem.class, bilibili.dynamic.gateway.TopicListItem.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.TopicListItem.newBuilder()
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
      iconTitle_ = "";
      topicId_ = 0L;
      topicName_ = "";
      url_ = "";
      pos_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_TopicListItem_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.TopicListItem getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.TopicListItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.TopicListItem build() {
      bilibili.dynamic.gateway.TopicListItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.TopicListItem buildPartial() {
      bilibili.dynamic.gateway.TopicListItem result = new bilibili.dynamic.gateway.TopicListItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.TopicListItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.icon_ = icon_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.iconTitle_ = iconTitle_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.topicId_ = topicId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.topicName_ = topicName_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.pos_ = pos_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.TopicListItem) {
        return mergeFrom((bilibili.dynamic.gateway.TopicListItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.TopicListItem other) {
      if (other == bilibili.dynamic.gateway.TopicListItem.getDefaultInstance()) return this;
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getIconTitle().isEmpty()) {
        iconTitle_ = other.iconTitle_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTopicId() != 0L) {
        setTopicId(other.getTopicId());
      }
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getPos() != 0L) {
        setPos(other.getPos());
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
              iconTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              topicId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              topicName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              pos_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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
     * 前置图标
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
     * 前置图标
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
     * 前置图标
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
     * 前置图标
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
     * 前置图标
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

    private java.lang.Object iconTitle_ = "";
    /**
     * <pre>
     * 前置图标文案
     * </pre>
     *
     * <code>string icon_title = 2;</code>
     * @return The iconTitle.
     */
    public java.lang.String getIconTitle() {
      java.lang.Object ref = iconTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iconTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 前置图标文案
     * </pre>
     *
     * <code>string icon_title = 2;</code>
     * @return The bytes for iconTitle.
     */
    public com.google.protobuf.ByteString
        getIconTitleBytes() {
      java.lang.Object ref = iconTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iconTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 前置图标文案
     * </pre>
     *
     * <code>string icon_title = 2;</code>
     * @param value The iconTitle to set.
     * @return This builder for chaining.
     */
    public Builder setIconTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iconTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 前置图标文案
     * </pre>
     *
     * <code>string icon_title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIconTitle() {
      iconTitle_ = getDefaultInstance().getIconTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 前置图标文案
     * </pre>
     *
     * <code>string icon_title = 2;</code>
     * @param value The bytes for iconTitle to set.
     * @return This builder for chaining.
     */
    public Builder setIconTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iconTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long topicId_ ;
    /**
     * <pre>
     * 话题id
     * </pre>
     *
     * <code>int64 topic_id = 3;</code>
     * @return The topicId.
     */
    @java.lang.Override
    public long getTopicId() {
      return topicId_;
    }
    /**
     * <pre>
     * 话题id
     * </pre>
     *
     * <code>int64 topic_id = 3;</code>
     * @param value The topicId to set.
     * @return This builder for chaining.
     */
    public Builder setTopicId(long value) {

      topicId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 话题id
     * </pre>
     *
     * <code>int64 topic_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      topicId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object topicName_ = "";
    /**
     * <pre>
     * 话题名
     * </pre>
     *
     * <code>string topic_name = 4;</code>
     * @return The topicName.
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 话题名
     * </pre>
     *
     * <code>string topic_name = 4;</code>
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 话题名
     * </pre>
     *
     * <code>string topic_name = 4;</code>
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      topicName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 话题名
     * </pre>
     *
     * <code>string topic_name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = getDefaultInstance().getTopicName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 话题名
     * </pre>
     *
     * <code>string topic_name = 4;</code>
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topicName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * 跳转链接
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 跳转链接
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 跳转链接
     * </pre>
     *
     * <code>string url = 5;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 跳转链接
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 跳转链接
     * </pre>
     *
     * <code>string url = 5;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private long pos_ ;
    /**
     * <pre>
     * 卡片位次
     * </pre>
     *
     * <code>int64 pos = 6;</code>
     * @return The pos.
     */
    @java.lang.Override
    public long getPos() {
      return pos_;
    }
    /**
     * <pre>
     * 卡片位次
     * </pre>
     *
     * <code>int64 pos = 6;</code>
     * @param value The pos to set.
     * @return This builder for chaining.
     */
    public Builder setPos(long value) {

      pos_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡片位次
     * </pre>
     *
     * <code>int64 pos = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPos() {
      bitField0_ = (bitField0_ & ~0x00000020);
      pos_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.TopicListItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.TopicListItem)
  private static final bilibili.dynamic.gateway.TopicListItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.TopicListItem();
  }

  public static bilibili.dynamic.gateway.TopicListItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicListItem>
      PARSER = new com.google.protobuf.AbstractParser<TopicListItem>() {
    @java.lang.Override
    public TopicListItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicListItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicListItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.TopicListItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
