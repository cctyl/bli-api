// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/main/native.proto

package bilibili.broadcast.message.main;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.broadcast.message.main.NativePageEvent}
 */
public final class NativePageEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.broadcast.message.main.NativePageEvent)
    NativePageEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NativePageEvent.newBuilder() to construct.
  private NativePageEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NativePageEvent() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NativePageEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.broadcast.message.main.Native.internal_static_bilibili_broadcast_message_main_NativePageEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.broadcast.message.main.Native.internal_static_bilibili_broadcast_message_main_NativePageEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.broadcast.message.main.NativePageEvent.class, bilibili.broadcast.message.main.NativePageEvent.Builder.class);
  }

  public static final int PAGEID_FIELD_NUMBER = 1;
  private long pageID_ = 0L;
  /**
   * <pre>
   * Native页ID
   * </pre>
   *
   * <code>int64 PageID = 1;</code>
   * @return The pageID.
   */
  @java.lang.Override
  public long getPageID() {
    return pageID_;
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.broadcast.message.main.EventItem> items_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.broadcast.message.main.EventItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.broadcast.message.main.EventItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
   */
  @java.lang.Override
  public bilibili.broadcast.message.main.EventItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
   */
  @java.lang.Override
  public bilibili.broadcast.message.main.EventItemOrBuilder getItemsOrBuilder(
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
    if (pageID_ != 0L) {
      output.writeInt64(1, pageID_);
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
    if (pageID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageID_);
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
    if (!(obj instanceof bilibili.broadcast.message.main.NativePageEvent)) {
      return super.equals(obj);
    }
    bilibili.broadcast.message.main.NativePageEvent other = (bilibili.broadcast.message.main.NativePageEvent) obj;

    if (getPageID()
        != other.getPageID()) return false;
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
    hash = (37 * hash) + PAGEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageID());
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.main.NativePageEvent parseFrom(
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
  public static Builder newBuilder(bilibili.broadcast.message.main.NativePageEvent prototype) {
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
   * Protobuf type {@code bilibili.broadcast.message.main.NativePageEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.broadcast.message.main.NativePageEvent)
      bilibili.broadcast.message.main.NativePageEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.message.main.Native.internal_static_bilibili_broadcast_message_main_NativePageEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.message.main.Native.internal_static_bilibili_broadcast_message_main_NativePageEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.message.main.NativePageEvent.class, bilibili.broadcast.message.main.NativePageEvent.Builder.class);
    }

    // Construct using bilibili.broadcast.message.main.NativePageEvent.newBuilder()
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
      pageID_ = 0L;
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
      return bilibili.broadcast.message.main.Native.internal_static_bilibili_broadcast_message_main_NativePageEvent_descriptor;
    }

    @java.lang.Override
    public bilibili.broadcast.message.main.NativePageEvent getDefaultInstanceForType() {
      return bilibili.broadcast.message.main.NativePageEvent.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.broadcast.message.main.NativePageEvent build() {
      bilibili.broadcast.message.main.NativePageEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.broadcast.message.main.NativePageEvent buildPartial() {
      bilibili.broadcast.message.main.NativePageEvent result = new bilibili.broadcast.message.main.NativePageEvent(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.broadcast.message.main.NativePageEvent result) {
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

    private void buildPartial0(bilibili.broadcast.message.main.NativePageEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageID_ = pageID_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.broadcast.message.main.NativePageEvent) {
        return mergeFrom((bilibili.broadcast.message.main.NativePageEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.broadcast.message.main.NativePageEvent other) {
      if (other == bilibili.broadcast.message.main.NativePageEvent.getDefaultInstance()) return this;
      if (other.getPageID() != 0L) {
        setPageID(other.getPageID());
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
            case 8: {
              pageID_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              bilibili.broadcast.message.main.EventItem m =
                  input.readMessage(
                      bilibili.broadcast.message.main.EventItem.parser(),
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

    private long pageID_ ;
    /**
     * <pre>
     * Native页ID
     * </pre>
     *
     * <code>int64 PageID = 1;</code>
     * @return The pageID.
     */
    @java.lang.Override
    public long getPageID() {
      return pageID_;
    }
    /**
     * <pre>
     * Native页ID
     * </pre>
     *
     * <code>int64 PageID = 1;</code>
     * @param value The pageID to set.
     * @return This builder for chaining.
     */
    public Builder setPageID(long value) {

      pageID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Native页ID
     * </pre>
     *
     * <code>int64 PageID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageID_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.broadcast.message.main.EventItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new java.util.ArrayList<bilibili.broadcast.message.main.EventItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.broadcast.message.main.EventItem, bilibili.broadcast.message.main.EventItem.Builder, bilibili.broadcast.message.main.EventItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public java.util.List<bilibili.broadcast.message.main.EventItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public bilibili.broadcast.message.main.EventItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.broadcast.message.main.EventItem value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.broadcast.message.main.EventItem.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder addItems(bilibili.broadcast.message.main.EventItem value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.broadcast.message.main.EventItem value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder addItems(
        bilibili.broadcast.message.main.EventItem.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.broadcast.message.main.EventItem.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends bilibili.broadcast.message.main.EventItem> values) {
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public bilibili.broadcast.message.main.EventItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public bilibili.broadcast.message.main.EventItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public java.util.List<? extends bilibili.broadcast.message.main.EventItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public bilibili.broadcast.message.main.EventItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          bilibili.broadcast.message.main.EventItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public bilibili.broadcast.message.main.EventItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, bilibili.broadcast.message.main.EventItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.broadcast.message.main.EventItem Items = 2;</code>
     */
    public java.util.List<bilibili.broadcast.message.main.EventItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.broadcast.message.main.EventItem, bilibili.broadcast.message.main.EventItem.Builder, bilibili.broadcast.message.main.EventItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.broadcast.message.main.EventItem, bilibili.broadcast.message.main.EventItem.Builder, bilibili.broadcast.message.main.EventItemOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:bilibili.broadcast.message.main.NativePageEvent)
  }

  // @@protoc_insertion_point(class_scope:bilibili.broadcast.message.main.NativePageEvent)
  private static final bilibili.broadcast.message.main.NativePageEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.broadcast.message.main.NativePageEvent();
  }

  public static bilibili.broadcast.message.main.NativePageEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NativePageEvent>
      PARSER = new com.google.protobuf.AbstractParser<NativePageEvent>() {
    @java.lang.Override
    public NativePageEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<NativePageEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NativePageEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.broadcast.message.main.NativePageEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
