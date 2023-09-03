// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.CampusRcmdItem}
 */
public final class CampusRcmdItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.CampusRcmdItem)
    CampusRcmdItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampusRcmdItem.newBuilder() to construct.
  private CampusRcmdItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampusRcmdItem() {
    title_ = "";
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampusRcmdItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusRcmdItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusRcmdItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.CampusRcmdItem.class, bilibili.app.dynamic.v2.CampusRcmdItem.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
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

  public static final int ITEMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.RcmdItem> items_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.RcmdItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.RcmdItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.RcmdItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.RcmdItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int CAMPUS_ID_FIELD_NUMBER = 3;
  private long campusId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 campus_id = 3;</code>
   * @return The campusId.
   */
  @java.lang.Override
  public long getCampusId() {
    return campusId_;
  }

  public static final int ENTRY_LABEL_FIELD_NUMBER = 4;
  private bilibili.app.dynamic.v2.CampusLabel entryLabel_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
   * @return Whether the entryLabel field is set.
   */
  @java.lang.Override
  public boolean hasEntryLabel() {
    return entryLabel_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
   * @return The entryLabel.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusLabel getEntryLabel() {
    return entryLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : entryLabel_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusLabelOrBuilder getEntryLabelOrBuilder() {
    return entryLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : entryLabel_;
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    if (campusId_ != 0L) {
      output.writeInt64(3, campusId_);
    }
    if (entryLabel_ != null) {
      output.writeMessage(4, getEntryLabel());
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
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
    }
    if (campusId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, campusId_);
    }
    if (entryLabel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEntryLabel());
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
    if (!(obj instanceof bilibili.app.dynamic.v2.CampusRcmdItem)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.CampusRcmdItem other = (bilibili.app.dynamic.v2.CampusRcmdItem) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (getCampusId()
        != other.getCampusId()) return false;
    if (hasEntryLabel() != other.hasEntryLabel()) return false;
    if (hasEntryLabel()) {
      if (!getEntryLabel()
          .equals(other.getEntryLabel())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + CAMPUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampusId());
    if (hasEntryLabel()) {
      hash = (37 * hash) + ENTRY_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getEntryLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusRcmdItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.CampusRcmdItem prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.CampusRcmdItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.CampusRcmdItem)
      bilibili.app.dynamic.v2.CampusRcmdItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusRcmdItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusRcmdItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.CampusRcmdItem.class, bilibili.app.dynamic.v2.CampusRcmdItem.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.CampusRcmdItem.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      campusId_ = 0L;
      entryLabel_ = null;
      if (entryLabelBuilder_ != null) {
        entryLabelBuilder_.dispose();
        entryLabelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusRcmdItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusRcmdItem getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.CampusRcmdItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusRcmdItem build() {
      bilibili.app.dynamic.v2.CampusRcmdItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusRcmdItem buildPartial() {
      bilibili.app.dynamic.v2.CampusRcmdItem result = new bilibili.app.dynamic.v2.CampusRcmdItem(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.CampusRcmdItem result) {
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

    private void buildPartial0(bilibili.app.dynamic.v2.CampusRcmdItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.campusId_ = campusId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.entryLabel_ = entryLabelBuilder_ == null
            ? entryLabel_
            : entryLabelBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.CampusRcmdItem) {
        return mergeFrom((bilibili.app.dynamic.v2.CampusRcmdItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.CampusRcmdItem other) {
      if (other == bilibili.app.dynamic.v2.CampusRcmdItem.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
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
      if (other.getCampusId() != 0L) {
        setCampusId(other.getCampusId());
      }
      if (other.hasEntryLabel()) {
        mergeEntryLabel(other.getEntryLabel());
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
            case 18: {
              bilibili.app.dynamic.v2.RcmdItem m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.RcmdItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              campusId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getEntryLabelFieldBuilder().getBuilder(),
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
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

    private java.util.List<bilibili.app.dynamic.v2.RcmdItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new java.util.ArrayList<bilibili.app.dynamic.v2.RcmdItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.RcmdItem, bilibili.app.dynamic.v2.RcmdItem.Builder, bilibili.app.dynamic.v2.RcmdItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.RcmdItem> getItemsList() {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public bilibili.app.dynamic.v2.RcmdItem getItems(int index) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.app.dynamic.v2.RcmdItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder setItems(
        int index, bilibili.app.dynamic.v2.RcmdItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder addItems(bilibili.app.dynamic.v2.RcmdItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.app.dynamic.v2.RcmdItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder addItems(
        bilibili.app.dynamic.v2.RcmdItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder addItems(
        int index, bilibili.app.dynamic.v2.RcmdItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.RcmdItem> values) {
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public bilibili.app.dynamic.v2.RcmdItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public bilibili.app.dynamic.v2.RcmdItemOrBuilder getItemsOrBuilder(
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.RcmdItemOrBuilder> 
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
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public bilibili.app.dynamic.v2.RcmdItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.RcmdItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public bilibili.app.dynamic.v2.RcmdItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.RcmdItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.RcmdItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.RcmdItem, bilibili.app.dynamic.v2.RcmdItem.Builder, bilibili.app.dynamic.v2.RcmdItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.RcmdItem, bilibili.app.dynamic.v2.RcmdItem.Builder, bilibili.app.dynamic.v2.RcmdItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private long campusId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 3;</code>
     * @return The campusId.
     */
    @java.lang.Override
    public long getCampusId() {
      return campusId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 3;</code>
     * @param value The campusId to set.
     * @return This builder for chaining.
     */
    public Builder setCampusId(long value) {

      campusId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      campusId_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v2.CampusLabel entryLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder> entryLabelBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     * @return Whether the entryLabel field is set.
     */
    public boolean hasEntryLabel() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     * @return The entryLabel.
     */
    public bilibili.app.dynamic.v2.CampusLabel getEntryLabel() {
      if (entryLabelBuilder_ == null) {
        return entryLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : entryLabel_;
      } else {
        return entryLabelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public Builder setEntryLabel(bilibili.app.dynamic.v2.CampusLabel value) {
      if (entryLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryLabel_ = value;
      } else {
        entryLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public Builder setEntryLabel(
        bilibili.app.dynamic.v2.CampusLabel.Builder builderForValue) {
      if (entryLabelBuilder_ == null) {
        entryLabel_ = builderForValue.build();
      } else {
        entryLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public Builder mergeEntryLabel(bilibili.app.dynamic.v2.CampusLabel value) {
      if (entryLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          entryLabel_ != null &&
          entryLabel_ != bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance()) {
          getEntryLabelBuilder().mergeFrom(value);
        } else {
          entryLabel_ = value;
        }
      } else {
        entryLabelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public Builder clearEntryLabel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      entryLabel_ = null;
      if (entryLabelBuilder_ != null) {
        entryLabelBuilder_.dispose();
        entryLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public bilibili.app.dynamic.v2.CampusLabel.Builder getEntryLabelBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getEntryLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    public bilibili.app.dynamic.v2.CampusLabelOrBuilder getEntryLabelOrBuilder() {
      if (entryLabelBuilder_ != null) {
        return entryLabelBuilder_.getMessageOrBuilder();
      } else {
        return entryLabel_ == null ?
            bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : entryLabel_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel entry_label = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder> 
        getEntryLabelFieldBuilder() {
      if (entryLabelBuilder_ == null) {
        entryLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder>(
                getEntryLabel(),
                getParentForChildren(),
                isClean());
        entryLabel_ = null;
      }
      return entryLabelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.CampusRcmdItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.CampusRcmdItem)
  private static final bilibili.app.dynamic.v2.CampusRcmdItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.CampusRcmdItem();
  }

  public static bilibili.app.dynamic.v2.CampusRcmdItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampusRcmdItem>
      PARSER = new com.google.protobuf.AbstractParser<CampusRcmdItem>() {
    @java.lang.Override
    public CampusRcmdItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampusRcmdItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampusRcmdItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusRcmdItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

