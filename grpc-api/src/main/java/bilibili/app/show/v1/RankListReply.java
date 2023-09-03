// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/rank/v1/rank.proto

package bilibili.app.show.v1;

/**
 * <pre>
 * 排行榜信息-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.show.v1.RankListReply}
 */
public final class RankListReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.show.v1.RankListReply)
    RankListReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RankListReply.newBuilder() to construct.
  private RankListReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RankListReply() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RankListReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankListReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankListReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.show.v1.RankListReply.class, bilibili.app.show.v1.RankListReply.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.show.v1.Item> items_;
  /**
   * <pre>
   * 排行榜列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.show.v1.Item> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * 排行榜列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.show.v1.ItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * 排行榜列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * 排行榜列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.show.v1.Item getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * 排行榜列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.show.v1.ItemOrBuilder getItemsOrBuilder(
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
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
    if (!(obj instanceof bilibili.app.show.v1.RankListReply)) {
      return super.equals(obj);
    }
    bilibili.app.show.v1.RankListReply other = (bilibili.app.show.v1.RankListReply) obj;

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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.show.v1.RankListReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankListReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankListReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankListReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.show.v1.RankListReply prototype) {
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
   * 排行榜信息-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.show.v1.RankListReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.show.v1.RankListReply)
      bilibili.app.show.v1.RankListReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankListReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankListReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.show.v1.RankListReply.class, bilibili.app.show.v1.RankListReply.Builder.class);
    }

    // Construct using bilibili.app.show.v1.RankListReply.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankListReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankListReply getDefaultInstanceForType() {
      return bilibili.app.show.v1.RankListReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankListReply build() {
      bilibili.app.show.v1.RankListReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankListReply buildPartial() {
      bilibili.app.show.v1.RankListReply result = new bilibili.app.show.v1.RankListReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.show.v1.RankListReply result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.show.v1.RankListReply result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.show.v1.RankListReply) {
        return mergeFrom((bilibili.app.show.v1.RankListReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.show.v1.RankListReply other) {
      if (other == bilibili.app.show.v1.RankListReply.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
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
              bilibili.app.show.v1.Item m =
                  input.readMessage(
                      bilibili.app.show.v1.Item.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<bilibili.app.show.v1.Item> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<bilibili.app.show.v1.Item>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.show.v1.Item, bilibili.app.show.v1.Item.Builder, bilibili.app.show.v1.ItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public java.util.List<bilibili.app.show.v1.Item> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public bilibili.app.show.v1.Item getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder setItems(
        int index, bilibili.app.show.v1.Item value) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder setItems(
        int index, bilibili.app.show.v1.Item.Builder builderForValue) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder addItems(bilibili.app.show.v1.Item value) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder addItems(
        int index, bilibili.app.show.v1.Item value) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder addItems(
        bilibili.app.show.v1.Item.Builder builderForValue) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder addItems(
        int index, bilibili.app.show.v1.Item.Builder builderForValue) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends bilibili.app.show.v1.Item> values) {
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
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
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public bilibili.app.show.v1.Item.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public bilibili.app.show.v1.ItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public java.util.List<? extends bilibili.app.show.v1.ItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public bilibili.app.show.v1.Item.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          bilibili.app.show.v1.Item.getDefaultInstance());
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public bilibili.app.show.v1.Item.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, bilibili.app.show.v1.Item.getDefaultInstance());
    }
    /**
     * <pre>
     * 排行榜列表
     * </pre>
     *
     * <code>repeated .bilibili.app.show.v1.Item items = 1;</code>
     */
    public java.util.List<bilibili.app.show.v1.Item.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.show.v1.Item, bilibili.app.show.v1.Item.Builder, bilibili.app.show.v1.ItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.show.v1.Item, bilibili.app.show.v1.Item.Builder, bilibili.app.show.v1.ItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.show.v1.RankListReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.show.v1.RankListReply)
  private static final bilibili.app.show.v1.RankListReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.show.v1.RankListReply();
  }

  public static bilibili.app.show.v1.RankListReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RankListReply>
      PARSER = new com.google.protobuf.AbstractParser<RankListReply>() {
    @java.lang.Override
    public RankListReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<RankListReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RankListReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.show.v1.RankListReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

