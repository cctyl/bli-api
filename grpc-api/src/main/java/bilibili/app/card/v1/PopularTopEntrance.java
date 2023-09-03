// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/single.proto

package bilibili.app.card.v1;

/**
 * <pre>
 * 热门列表顶部按钮
 * </pre>
 *
 * Protobuf type {@code bilibili.app.card.v1.PopularTopEntrance}
 */
public final class PopularTopEntrance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.card.v1.PopularTopEntrance)
    PopularTopEntranceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PopularTopEntrance.newBuilder() to construct.
  private PopularTopEntrance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PopularTopEntrance() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PopularTopEntrance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_PopularTopEntrance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_PopularTopEntrance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.card.v1.PopularTopEntrance.class, bilibili.app.card.v1.PopularTopEntrance.Builder.class);
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

  public static final int ITEMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.card.v1.EntranceItem> items_;
  /**
   * <pre>
   * 按钮项
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.card.v1.EntranceItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * 按钮项
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.card.v1.EntranceItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * 按钮项
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * 按钮项
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.card.v1.EntranceItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * 按钮项
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.card.v1.EntranceItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
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
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
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
    if (!(obj instanceof bilibili.app.card.v1.PopularTopEntrance)) {
      return super.equals(obj);
    }
    bilibili.app.card.v1.PopularTopEntrance other = (bilibili.app.card.v1.PopularTopEntrance) obj;

    if (hasBase() != other.hasBase()) return false;
    if (hasBase()) {
      if (!getBase()
          .equals(other.getBase())) return false;
    }
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.card.v1.PopularTopEntrance parseFrom(
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
  public static Builder newBuilder(bilibili.app.card.v1.PopularTopEntrance prototype) {
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
   * 热门列表顶部按钮
   * </pre>
   *
   * Protobuf type {@code bilibili.app.card.v1.PopularTopEntrance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.card.v1.PopularTopEntrance)
      bilibili.app.card.v1.PopularTopEntranceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_PopularTopEntrance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_PopularTopEntrance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.card.v1.PopularTopEntrance.class, bilibili.app.card.v1.PopularTopEntrance.Builder.class);
    }

    // Construct using bilibili.app.card.v1.PopularTopEntrance.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.card.v1.Single.internal_static_bilibili_app_card_v1_PopularTopEntrance_descriptor;
    }

    @java.lang.Override
    public bilibili.app.card.v1.PopularTopEntrance getDefaultInstanceForType() {
      return bilibili.app.card.v1.PopularTopEntrance.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.card.v1.PopularTopEntrance build() {
      bilibili.app.card.v1.PopularTopEntrance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.card.v1.PopularTopEntrance buildPartial() {
      bilibili.app.card.v1.PopularTopEntrance result = new bilibili.app.card.v1.PopularTopEntrance(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.card.v1.PopularTopEntrance result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.card.v1.PopularTopEntrance result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.base_ = baseBuilder_ == null
            ? base_
            : baseBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.card.v1.PopularTopEntrance) {
        return mergeFrom((bilibili.app.card.v1.PopularTopEntrance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.card.v1.PopularTopEntrance other) {
      if (other == bilibili.app.card.v1.PopularTopEntrance.getDefaultInstance()) return this;
      if (other.hasBase()) {
        mergeBase(other.getBase());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
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
              input.readMessage(
                  getBaseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.app.card.v1.EntranceItem m =
                  input.readMessage(
                      bilibili.app.card.v1.EntranceItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.util.List<bilibili.app.card.v1.EntranceItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new java.util.ArrayList<bilibili.app.card.v1.EntranceItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.card.v1.EntranceItem, bilibili.app.card.v1.EntranceItem.Builder, bilibili.app.card.v1.EntranceItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public java.util.List<bilibili.app.card.v1.EntranceItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public bilibili.app.card.v1.EntranceItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.app.card.v1.EntranceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.app.card.v1.EntranceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder addItems(bilibili.app.card.v1.EntranceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.app.card.v1.EntranceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder addItems(
        bilibili.app.card.v1.EntranceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.app.card.v1.EntranceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends bilibili.app.card.v1.EntranceItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public bilibili.app.card.v1.EntranceItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public bilibili.app.card.v1.EntranceItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public java.util.List<? extends bilibili.app.card.v1.EntranceItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public bilibili.app.card.v1.EntranceItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          bilibili.app.card.v1.EntranceItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public bilibili.app.card.v1.EntranceItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, bilibili.app.card.v1.EntranceItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 按钮项
     * </pre>
     *
     * <code>repeated .bilibili.app.card.v1.EntranceItem items = 2;</code>
     */
    public java.util.List<bilibili.app.card.v1.EntranceItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.card.v1.EntranceItem, bilibili.app.card.v1.EntranceItem.Builder, bilibili.app.card.v1.EntranceItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.card.v1.EntranceItem, bilibili.app.card.v1.EntranceItem.Builder, bilibili.app.card.v1.EntranceItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.card.v1.PopularTopEntrance)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.card.v1.PopularTopEntrance)
  private static final bilibili.app.card.v1.PopularTopEntrance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.card.v1.PopularTopEntrance();
  }

  public static bilibili.app.card.v1.PopularTopEntrance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopularTopEntrance>
      PARSER = new com.google.protobuf.AbstractParser<PopularTopEntrance>() {
    @java.lang.Override
    public PopularTopEntrance parsePartialFrom(
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

  public static com.google.protobuf.Parser<PopularTopEntrance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopularTopEntrance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.card.v1.PopularTopEntrance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

