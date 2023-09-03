// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 搜索历史记录-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.SearchReply}
 */
public final class SearchReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.SearchReply)
    SearchReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchReply.newBuilder() to construct.
  private SearchReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchReply() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_SearchReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_SearchReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.SearchReply.class, bilibili.app.interface.v1.SearchReply.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.interface.v1.CursorItem> items_;
  /**
   * <pre>
   * 卡片内容
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.interface.v1.CursorItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * 卡片内容
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.interface.v1.CursorItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * 卡片内容
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * 卡片内容
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.CursorItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * 卡片内容
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.CursorItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int HASMORE_FIELD_NUMBER = 2;
  private boolean hasMore_ = false;
  /**
   * <pre>
   * 是否未拉取完
   * </pre>
   *
   * <code>bool hasMore = 2;</code>
   * @return The hasMore.
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
  }

  public static final int PAGE_FIELD_NUMBER = 3;
  private bilibili.app.interface.v1.Page page_;
  /**
   * <pre>
   * 页面信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Page page = 3;</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return page_ != null;
  }
  /**
   * <pre>
   * 页面信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Page page = 3;</code>
   * @return The page.
   */
  @java.lang.Override
  public bilibili.app.interface.v1.Page getPage() {
    return page_ == null ? bilibili.app.interface.v1.Page.getDefaultInstance() : page_;
  }
  /**
   * <pre>
   * 页面信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Page page = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.PageOrBuilder getPageOrBuilder() {
    return page_ == null ? bilibili.app.interface.v1.Page.getDefaultInstance() : page_;
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
    if (hasMore_ != false) {
      output.writeBool(2, hasMore_);
    }
    if (page_ != null) {
      output.writeMessage(3, getPage());
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
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasMore_);
    }
    if (page_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPage());
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
    if (!(obj instanceof bilibili.app.interface.v1.SearchReply)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.SearchReply other = (bilibili.app.interface.v1.SearchReply) obj;

    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (getHasMore()
        != other.getHasMore()) return false;
    if (hasPage() != other.hasPage()) return false;
    if (hasPage()) {
      if (!getPage()
          .equals(other.getPage())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + HASMORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    if (hasPage()) {
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.SearchReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.SearchReply prototype) {
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
   * 搜索历史记录-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.SearchReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.SearchReply)
      bilibili.app.interface.v1.SearchReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_SearchReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_SearchReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.SearchReply.class, bilibili.app.interface.v1.SearchReply.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.SearchReply.newBuilder()
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
      hasMore_ = false;
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_SearchReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchReply getDefaultInstanceForType() {
      return bilibili.app.interface.v1.SearchReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchReply build() {
      bilibili.app.interface.v1.SearchReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchReply buildPartial() {
      bilibili.app.interface.v1.SearchReply result = new bilibili.app.interface.v1.SearchReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.interface.v1.SearchReply result) {
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

    private void buildPartial0(bilibili.app.interface.v1.SearchReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hasMore_ = hasMore_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.SearchReply) {
        return mergeFrom((bilibili.app.interface.v1.SearchReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.SearchReply other) {
      if (other == bilibili.app.interface.v1.SearchReply.getDefaultInstance()) return this;
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
      if (other.getHasMore() != false) {
        setHasMore(other.getHasMore());
      }
      if (other.hasPage()) {
        mergePage(other.getPage());
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
              bilibili.app.interface.v1.CursorItem m =
                  input.readMessage(
                      bilibili.app.interface.v1.CursorItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              hasMore_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.util.List<bilibili.app.interface.v1.CursorItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<bilibili.app.interface.v1.CursorItem>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.interface.v1.CursorItem, bilibili.app.interface.v1.CursorItem.Builder, bilibili.app.interface.v1.CursorItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public java.util.List<bilibili.app.interface.v1.CursorItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public bilibili.app.interface.v1.CursorItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder setItems(
        int index, bilibili.app.interface.v1.CursorItem value) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder setItems(
        int index, bilibili.app.interface.v1.CursorItem.Builder builderForValue) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder addItems(bilibili.app.interface.v1.CursorItem value) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder addItems(
        int index, bilibili.app.interface.v1.CursorItem value) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder addItems(
        bilibili.app.interface.v1.CursorItem.Builder builderForValue) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder addItems(
        int index, bilibili.app.interface.v1.CursorItem.Builder builderForValue) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends bilibili.app.interface.v1.CursorItem> values) {
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
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
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public bilibili.app.interface.v1.CursorItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public bilibili.app.interface.v1.CursorItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public java.util.List<? extends bilibili.app.interface.v1.CursorItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public bilibili.app.interface.v1.CursorItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          bilibili.app.interface.v1.CursorItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public bilibili.app.interface.v1.CursorItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, bilibili.app.interface.v1.CursorItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 卡片内容
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.CursorItem items = 1;</code>
     */
    public java.util.List<bilibili.app.interface.v1.CursorItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.interface.v1.CursorItem, bilibili.app.interface.v1.CursorItem.Builder, bilibili.app.interface.v1.CursorItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.interface.v1.CursorItem, bilibili.app.interface.v1.CursorItem.Builder, bilibili.app.interface.v1.CursorItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private boolean hasMore_ ;
    /**
     * <pre>
     * 是否未拉取完
     * </pre>
     *
     * <code>bool hasMore = 2;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 是否未拉取完
     * </pre>
     *
     * <code>bool hasMore = 2;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {

      hasMore_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否未拉取完
     * </pre>
     *
     * <code>bool hasMore = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hasMore_ = false;
      onChanged();
      return this;
    }

    private bilibili.app.interface.v1.Page page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.Page, bilibili.app.interface.v1.Page.Builder, bilibili.app.interface.v1.PageOrBuilder> pageBuilder_;
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     * @return The page.
     */
    public bilibili.app.interface.v1.Page getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? bilibili.app.interface.v1.Page.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public Builder setPage(bilibili.app.interface.v1.Page value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public Builder setPage(
        bilibili.app.interface.v1.Page.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public Builder mergePage(bilibili.app.interface.v1.Page value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          page_ != null &&
          page_ != bilibili.app.interface.v1.Page.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public bilibili.app.interface.v1.Page.Builder getPageBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    public bilibili.app.interface.v1.PageOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            bilibili.app.interface.v1.Page.getDefaultInstance() : page_;
      }
    }
    /**
     * <pre>
     * 页面信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.Page page = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.Page, bilibili.app.interface.v1.Page.Builder, bilibili.app.interface.v1.PageOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.interface.v1.Page, bilibili.app.interface.v1.Page.Builder, bilibili.app.interface.v1.PageOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.SearchReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.SearchReply)
  private static final bilibili.app.interface.v1.SearchReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.SearchReply();
  }

  public static bilibili.app.interface.v1.SearchReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchReply>
      PARSER = new com.google.protobuf.AbstractParser<SearchReply>() {
    @java.lang.Override
    public SearchReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.SearchReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
