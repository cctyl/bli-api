// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.TopicCardItem}
 */
public final class TopicCardItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.TopicCardItem)
    TopicCardItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicCardItem.newBuilder() to construct.
  private TopicCardItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicCardItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicCardItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicCardItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicCardItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.TopicCardItem.class, bilibili.app.topic.v1.TopicCardItem.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int DYNAMIC_ITEM_FIELD_NUMBER = 2;
  private bilibili.app.dynamic.v2.DynamicItem dynamicItem_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
   * @return Whether the dynamicItem field is set.
   */
  @java.lang.Override
  public boolean hasDynamicItem() {
    return dynamicItem_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
   * @return The dynamicItem.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItem getDynamicItem() {
    return dynamicItem_ == null ? bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance() : dynamicItem_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItemOrBuilder getDynamicItemOrBuilder() {
    return dynamicItem_ == null ? bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance() : dynamicItem_;
  }

  public static final int FORD_CARD_ITEM_FIELD_NUMBER = 3;
  private bilibili.app.topic.v1.FoldCardItem fordCardItem_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
   * @return Whether the fordCardItem field is set.
   */
  @java.lang.Override
  public boolean hasFordCardItem() {
    return fordCardItem_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
   * @return The fordCardItem.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.FoldCardItem getFordCardItem() {
    return fordCardItem_ == null ? bilibili.app.topic.v1.FoldCardItem.getDefaultInstance() : fordCardItem_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.FoldCardItemOrBuilder getFordCardItemOrBuilder() {
    return fordCardItem_ == null ? bilibili.app.topic.v1.FoldCardItem.getDefaultInstance() : fordCardItem_;
  }

  public static final int VIDEO_SMALL_CARD_ITEM_FIELD_NUMBER = 4;
  private bilibili.app.topic.v1.VideoSmallCardItem videoSmallCardItem_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
   * @return Whether the videoSmallCardItem field is set.
   */
  @java.lang.Override
  public boolean hasVideoSmallCardItem() {
    return videoSmallCardItem_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
   * @return The videoSmallCardItem.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.VideoSmallCardItem getVideoSmallCardItem() {
    return videoSmallCardItem_ == null ? bilibili.app.topic.v1.VideoSmallCardItem.getDefaultInstance() : videoSmallCardItem_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.VideoSmallCardItemOrBuilder getVideoSmallCardItemOrBuilder() {
    return videoSmallCardItem_ == null ? bilibili.app.topic.v1.VideoSmallCardItem.getDefaultInstance() : videoSmallCardItem_;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (dynamicItem_ != null) {
      output.writeMessage(2, getDynamicItem());
    }
    if (fordCardItem_ != null) {
      output.writeMessage(3, getFordCardItem());
    }
    if (videoSmallCardItem_ != null) {
      output.writeMessage(4, getVideoSmallCardItem());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (dynamicItem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDynamicItem());
    }
    if (fordCardItem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFordCardItem());
    }
    if (videoSmallCardItem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getVideoSmallCardItem());
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
    if (!(obj instanceof bilibili.app.topic.v1.TopicCardItem)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.TopicCardItem other = (bilibili.app.topic.v1.TopicCardItem) obj;

    if (getType()
        != other.getType()) return false;
    if (hasDynamicItem() != other.hasDynamicItem()) return false;
    if (hasDynamicItem()) {
      if (!getDynamicItem()
          .equals(other.getDynamicItem())) return false;
    }
    if (hasFordCardItem() != other.hasFordCardItem()) return false;
    if (hasFordCardItem()) {
      if (!getFordCardItem()
          .equals(other.getFordCardItem())) return false;
    }
    if (hasVideoSmallCardItem() != other.hasVideoSmallCardItem()) return false;
    if (hasVideoSmallCardItem()) {
      if (!getVideoSmallCardItem()
          .equals(other.getVideoSmallCardItem())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    if (hasDynamicItem()) {
      hash = (37 * hash) + DYNAMIC_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getDynamicItem().hashCode();
    }
    if (hasFordCardItem()) {
      hash = (37 * hash) + FORD_CARD_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getFordCardItem().hashCode();
    }
    if (hasVideoSmallCardItem()) {
      hash = (37 * hash) + VIDEO_SMALL_CARD_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getVideoSmallCardItem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicCardItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.TopicCardItem prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.TopicCardItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.TopicCardItem)
      bilibili.app.topic.v1.TopicCardItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicCardItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicCardItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.TopicCardItem.class, bilibili.app.topic.v1.TopicCardItem.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.TopicCardItem.newBuilder()
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
      type_ = 0;
      dynamicItem_ = null;
      if (dynamicItemBuilder_ != null) {
        dynamicItemBuilder_.dispose();
        dynamicItemBuilder_ = null;
      }
      fordCardItem_ = null;
      if (fordCardItemBuilder_ != null) {
        fordCardItemBuilder_.dispose();
        fordCardItemBuilder_ = null;
      }
      videoSmallCardItem_ = null;
      if (videoSmallCardItemBuilder_ != null) {
        videoSmallCardItemBuilder_.dispose();
        videoSmallCardItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicCardItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicCardItem getDefaultInstanceForType() {
      return bilibili.app.topic.v1.TopicCardItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicCardItem build() {
      bilibili.app.topic.v1.TopicCardItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicCardItem buildPartial() {
      bilibili.app.topic.v1.TopicCardItem result = new bilibili.app.topic.v1.TopicCardItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.topic.v1.TopicCardItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dynamicItem_ = dynamicItemBuilder_ == null
            ? dynamicItem_
            : dynamicItemBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fordCardItem_ = fordCardItemBuilder_ == null
            ? fordCardItem_
            : fordCardItemBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.videoSmallCardItem_ = videoSmallCardItemBuilder_ == null
            ? videoSmallCardItem_
            : videoSmallCardItemBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.TopicCardItem) {
        return mergeFrom((bilibili.app.topic.v1.TopicCardItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.TopicCardItem other) {
      if (other == bilibili.app.topic.v1.TopicCardItem.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.hasDynamicItem()) {
        mergeDynamicItem(other.getDynamicItem());
      }
      if (other.hasFordCardItem()) {
        mergeFordCardItem(other.getFordCardItem());
      }
      if (other.hasVideoSmallCardItem()) {
        mergeVideoSmallCardItem(other.getVideoSmallCardItem());
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
              type_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getDynamicItemFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFordCardItemFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getVideoSmallCardItemFieldBuilder().getBuilder(),
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

    private int type_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 type = 1;</code>
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
     * <code>int32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v2.DynamicItem dynamicItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder> dynamicItemBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     * @return Whether the dynamicItem field is set.
     */
    public boolean hasDynamicItem() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     * @return The dynamicItem.
     */
    public bilibili.app.dynamic.v2.DynamicItem getDynamicItem() {
      if (dynamicItemBuilder_ == null) {
        return dynamicItem_ == null ? bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance() : dynamicItem_;
      } else {
        return dynamicItemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public Builder setDynamicItem(bilibili.app.dynamic.v2.DynamicItem value) {
      if (dynamicItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dynamicItem_ = value;
      } else {
        dynamicItemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public Builder setDynamicItem(
        bilibili.app.dynamic.v2.DynamicItem.Builder builderForValue) {
      if (dynamicItemBuilder_ == null) {
        dynamicItem_ = builderForValue.build();
      } else {
        dynamicItemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public Builder mergeDynamicItem(bilibili.app.dynamic.v2.DynamicItem value) {
      if (dynamicItemBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dynamicItem_ != null &&
          dynamicItem_ != bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance()) {
          getDynamicItemBuilder().mergeFrom(value);
        } else {
          dynamicItem_ = value;
        }
      } else {
        dynamicItemBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public Builder clearDynamicItem() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dynamicItem_ = null;
      if (dynamicItemBuilder_ != null) {
        dynamicItemBuilder_.dispose();
        dynamicItemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder getDynamicItemBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDynamicItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItemOrBuilder getDynamicItemOrBuilder() {
      if (dynamicItemBuilder_ != null) {
        return dynamicItemBuilder_.getMessageOrBuilder();
      } else {
        return dynamicItem_ == null ?
            bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance() : dynamicItem_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic_item = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
        getDynamicItemFieldBuilder() {
      if (dynamicItemBuilder_ == null) {
        dynamicItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder>(
                getDynamicItem(),
                getParentForChildren(),
                isClean());
        dynamicItem_ = null;
      }
      return dynamicItemBuilder_;
    }

    private bilibili.app.topic.v1.FoldCardItem fordCardItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.FoldCardItem, bilibili.app.topic.v1.FoldCardItem.Builder, bilibili.app.topic.v1.FoldCardItemOrBuilder> fordCardItemBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     * @return Whether the fordCardItem field is set.
     */
    public boolean hasFordCardItem() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     * @return The fordCardItem.
     */
    public bilibili.app.topic.v1.FoldCardItem getFordCardItem() {
      if (fordCardItemBuilder_ == null) {
        return fordCardItem_ == null ? bilibili.app.topic.v1.FoldCardItem.getDefaultInstance() : fordCardItem_;
      } else {
        return fordCardItemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public Builder setFordCardItem(bilibili.app.topic.v1.FoldCardItem value) {
      if (fordCardItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fordCardItem_ = value;
      } else {
        fordCardItemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public Builder setFordCardItem(
        bilibili.app.topic.v1.FoldCardItem.Builder builderForValue) {
      if (fordCardItemBuilder_ == null) {
        fordCardItem_ = builderForValue.build();
      } else {
        fordCardItemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public Builder mergeFordCardItem(bilibili.app.topic.v1.FoldCardItem value) {
      if (fordCardItemBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          fordCardItem_ != null &&
          fordCardItem_ != bilibili.app.topic.v1.FoldCardItem.getDefaultInstance()) {
          getFordCardItemBuilder().mergeFrom(value);
        } else {
          fordCardItem_ = value;
        }
      } else {
        fordCardItemBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public Builder clearFordCardItem() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fordCardItem_ = null;
      if (fordCardItemBuilder_ != null) {
        fordCardItemBuilder_.dispose();
        fordCardItemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public bilibili.app.topic.v1.FoldCardItem.Builder getFordCardItemBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFordCardItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    public bilibili.app.topic.v1.FoldCardItemOrBuilder getFordCardItemOrBuilder() {
      if (fordCardItemBuilder_ != null) {
        return fordCardItemBuilder_.getMessageOrBuilder();
      } else {
        return fordCardItem_ == null ?
            bilibili.app.topic.v1.FoldCardItem.getDefaultInstance() : fordCardItem_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.FoldCardItem ford_card_item = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.FoldCardItem, bilibili.app.topic.v1.FoldCardItem.Builder, bilibili.app.topic.v1.FoldCardItemOrBuilder> 
        getFordCardItemFieldBuilder() {
      if (fordCardItemBuilder_ == null) {
        fordCardItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.FoldCardItem, bilibili.app.topic.v1.FoldCardItem.Builder, bilibili.app.topic.v1.FoldCardItemOrBuilder>(
                getFordCardItem(),
                getParentForChildren(),
                isClean());
        fordCardItem_ = null;
      }
      return fordCardItemBuilder_;
    }

    private bilibili.app.topic.v1.VideoSmallCardItem videoSmallCardItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.VideoSmallCardItem, bilibili.app.topic.v1.VideoSmallCardItem.Builder, bilibili.app.topic.v1.VideoSmallCardItemOrBuilder> videoSmallCardItemBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     * @return Whether the videoSmallCardItem field is set.
     */
    public boolean hasVideoSmallCardItem() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     * @return The videoSmallCardItem.
     */
    public bilibili.app.topic.v1.VideoSmallCardItem getVideoSmallCardItem() {
      if (videoSmallCardItemBuilder_ == null) {
        return videoSmallCardItem_ == null ? bilibili.app.topic.v1.VideoSmallCardItem.getDefaultInstance() : videoSmallCardItem_;
      } else {
        return videoSmallCardItemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public Builder setVideoSmallCardItem(bilibili.app.topic.v1.VideoSmallCardItem value) {
      if (videoSmallCardItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        videoSmallCardItem_ = value;
      } else {
        videoSmallCardItemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public Builder setVideoSmallCardItem(
        bilibili.app.topic.v1.VideoSmallCardItem.Builder builderForValue) {
      if (videoSmallCardItemBuilder_ == null) {
        videoSmallCardItem_ = builderForValue.build();
      } else {
        videoSmallCardItemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public Builder mergeVideoSmallCardItem(bilibili.app.topic.v1.VideoSmallCardItem value) {
      if (videoSmallCardItemBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          videoSmallCardItem_ != null &&
          videoSmallCardItem_ != bilibili.app.topic.v1.VideoSmallCardItem.getDefaultInstance()) {
          getVideoSmallCardItemBuilder().mergeFrom(value);
        } else {
          videoSmallCardItem_ = value;
        }
      } else {
        videoSmallCardItemBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public Builder clearVideoSmallCardItem() {
      bitField0_ = (bitField0_ & ~0x00000008);
      videoSmallCardItem_ = null;
      if (videoSmallCardItemBuilder_ != null) {
        videoSmallCardItemBuilder_.dispose();
        videoSmallCardItemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public bilibili.app.topic.v1.VideoSmallCardItem.Builder getVideoSmallCardItemBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getVideoSmallCardItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    public bilibili.app.topic.v1.VideoSmallCardItemOrBuilder getVideoSmallCardItemOrBuilder() {
      if (videoSmallCardItemBuilder_ != null) {
        return videoSmallCardItemBuilder_.getMessageOrBuilder();
      } else {
        return videoSmallCardItem_ == null ?
            bilibili.app.topic.v1.VideoSmallCardItem.getDefaultInstance() : videoSmallCardItem_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.VideoSmallCardItem video_small_card_item = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.VideoSmallCardItem, bilibili.app.topic.v1.VideoSmallCardItem.Builder, bilibili.app.topic.v1.VideoSmallCardItemOrBuilder> 
        getVideoSmallCardItemFieldBuilder() {
      if (videoSmallCardItemBuilder_ == null) {
        videoSmallCardItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.VideoSmallCardItem, bilibili.app.topic.v1.VideoSmallCardItem.Builder, bilibili.app.topic.v1.VideoSmallCardItemOrBuilder>(
                getVideoSmallCardItem(),
                getParentForChildren(),
                isClean());
        videoSmallCardItem_ = null;
      }
      return videoSmallCardItemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.TopicCardItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.TopicCardItem)
  private static final bilibili.app.topic.v1.TopicCardItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.TopicCardItem();
  }

  public static bilibili.app.topic.v1.TopicCardItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicCardItem>
      PARSER = new com.google.protobuf.AbstractParser<TopicCardItem>() {
    @java.lang.Override
    public TopicCardItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicCardItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicCardItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.TopicCardItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

