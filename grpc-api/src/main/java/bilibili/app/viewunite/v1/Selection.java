// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.viewunite.v1.Selection}
 */
public final class Selection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.viewunite.v1.Selection)
    SelectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Selection.newBuilder() to construct.
  private Selection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Selection() {
    title_ = "";
    item_ = java.util.Collections.emptyList();
    arcType_ = 0;
    selectionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Selection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_Selection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_Selection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.viewunite.v1.Selection.class, bilibili.app.viewunite.v1.Selection.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 
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
   * 
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

  public static final int ITEM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.viewunite.v1.SelectionItem> item_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.viewunite.v1.SelectionItem> getItemList() {
    return item_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.viewunite.v1.SelectionItemOrBuilder> 
      getItemOrBuilderList() {
    return item_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
   */
  @java.lang.Override
  public int getItemCount() {
    return item_.size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.SelectionItem getItem(int index) {
    return item_.get(index);
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.SelectionItemOrBuilder getItemOrBuilder(
      int index) {
    return item_.get(index);
  }

  public static final int ARC_TYPE_FIELD_NUMBER = 3;
  private int arcType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
   * @return The enum numeric value on the wire for arcType.
   */
  @java.lang.Override public int getArcTypeValue() {
    return arcType_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
   * @return The arcType.
   */
  @java.lang.Override public bilibili.app.viewunite.v1.ArcType getArcType() {
    bilibili.app.viewunite.v1.ArcType result = bilibili.app.viewunite.v1.ArcType.forNumber(arcType_);
    return result == null ? bilibili.app.viewunite.v1.ArcType.UNRECOGNIZED : result;
  }

  public static final int SELECTION_TYPE_FIELD_NUMBER = 4;
  private int selectionType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
   * @return The enum numeric value on the wire for selectionType.
   */
  @java.lang.Override public int getSelectionTypeValue() {
    return selectionType_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
   * @return The selectionType.
   */
  @java.lang.Override public bilibili.app.viewunite.v1.SelectionType getSelectionType() {
    bilibili.app.viewunite.v1.SelectionType result = bilibili.app.viewunite.v1.SelectionType.forNumber(selectionType_);
    return result == null ? bilibili.app.viewunite.v1.SelectionType.UNRECOGNIZED : result;
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
    for (int i = 0; i < item_.size(); i++) {
      output.writeMessage(2, item_.get(i));
    }
    if (arcType_ != bilibili.app.viewunite.v1.ArcType.UNKNOWN.getNumber()) {
      output.writeEnum(3, arcType_);
    }
    if (selectionType_ != bilibili.app.viewunite.v1.SelectionType.LONGTITLE.getNumber()) {
      output.writeEnum(4, selectionType_);
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
    for (int i = 0; i < item_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, item_.get(i));
    }
    if (arcType_ != bilibili.app.viewunite.v1.ArcType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, arcType_);
    }
    if (selectionType_ != bilibili.app.viewunite.v1.SelectionType.LONGTITLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, selectionType_);
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
    if (!(obj instanceof bilibili.app.viewunite.v1.Selection)) {
      return super.equals(obj);
    }
    bilibili.app.viewunite.v1.Selection other = (bilibili.app.viewunite.v1.Selection) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getItemList()
        .equals(other.getItemList())) return false;
    if (arcType_ != other.arcType_) return false;
    if (selectionType_ != other.selectionType_) return false;
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
    if (getItemCount() > 0) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItemList().hashCode();
    }
    hash = (37 * hash) + ARC_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + arcType_;
    hash = (37 * hash) + SELECTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + selectionType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.viewunite.v1.Selection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.Selection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.Selection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.Selection parseFrom(
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
  public static Builder newBuilder(bilibili.app.viewunite.v1.Selection prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.viewunite.v1.Selection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.viewunite.v1.Selection)
      bilibili.app.viewunite.v1.SelectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_Selection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_Selection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.viewunite.v1.Selection.class, bilibili.app.viewunite.v1.Selection.Builder.class);
    }

    // Construct using bilibili.app.viewunite.v1.Selection.newBuilder()
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
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
      } else {
        item_ = null;
        itemBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      arcType_ = 0;
      selectionType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_Selection_descriptor;
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.Selection getDefaultInstanceForType() {
      return bilibili.app.viewunite.v1.Selection.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.Selection build() {
      bilibili.app.viewunite.v1.Selection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.Selection buildPartial() {
      bilibili.app.viewunite.v1.Selection result = new bilibili.app.viewunite.v1.Selection(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.viewunite.v1.Selection result) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          item_ = java.util.Collections.unmodifiableList(item_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.viewunite.v1.Selection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.arcType_ = arcType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.selectionType_ = selectionType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.viewunite.v1.Selection) {
        return mergeFrom((bilibili.app.viewunite.v1.Selection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.viewunite.v1.Selection other) {
      if (other == bilibili.app.viewunite.v1.Selection.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (itemBuilder_ == null) {
        if (!other.item_.isEmpty()) {
          if (item_.isEmpty()) {
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemIsMutable();
            item_.addAll(other.item_);
          }
          onChanged();
        }
      } else {
        if (!other.item_.isEmpty()) {
          if (itemBuilder_.isEmpty()) {
            itemBuilder_.dispose();
            itemBuilder_ = null;
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemFieldBuilder() : null;
          } else {
            itemBuilder_.addAllMessages(other.item_);
          }
        }
      }
      if (other.arcType_ != 0) {
        setArcTypeValue(other.getArcTypeValue());
      }
      if (other.selectionType_ != 0) {
        setSelectionTypeValue(other.getSelectionTypeValue());
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
              bilibili.app.viewunite.v1.SelectionItem m =
                  input.readMessage(
                      bilibili.app.viewunite.v1.SelectionItem.parser(),
                      extensionRegistry);
              if (itemBuilder_ == null) {
                ensureItemIsMutable();
                item_.add(m);
              } else {
                itemBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              arcType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              selectionType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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

    private java.util.List<bilibili.app.viewunite.v1.SelectionItem> item_ =
      java.util.Collections.emptyList();
    private void ensureItemIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        item_ = new java.util.ArrayList<bilibili.app.viewunite.v1.SelectionItem>(item_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.viewunite.v1.SelectionItem, bilibili.app.viewunite.v1.SelectionItem.Builder, bilibili.app.viewunite.v1.SelectionItemOrBuilder> itemBuilder_;

    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public java.util.List<bilibili.app.viewunite.v1.SelectionItem> getItemList() {
      if (itemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(item_);
      } else {
        return itemBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public int getItemCount() {
      if (itemBuilder_ == null) {
        return item_.size();
      } else {
        return itemBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public bilibili.app.viewunite.v1.SelectionItem getItem(int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);
      } else {
        return itemBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder setItem(
        int index, bilibili.app.viewunite.v1.SelectionItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.set(index, value);
        onChanged();
      } else {
        itemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder setItem(
        int index, bilibili.app.viewunite.v1.SelectionItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder addItem(bilibili.app.viewunite.v1.SelectionItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(value);
        onChanged();
      } else {
        itemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder addItem(
        int index, bilibili.app.viewunite.v1.SelectionItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(index, value);
        onChanged();
      } else {
        itemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder addItem(
        bilibili.app.viewunite.v1.SelectionItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder addItem(
        int index, bilibili.app.viewunite.v1.SelectionItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder addAllItem(
        java.lang.Iterable<? extends bilibili.app.viewunite.v1.SelectionItem> values) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, item_);
        onChanged();
      } else {
        itemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public Builder removeItem(int index) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.remove(index);
        onChanged();
      } else {
        itemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public bilibili.app.viewunite.v1.SelectionItem.Builder getItemBuilder(
        int index) {
      return getItemFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public bilibili.app.viewunite.v1.SelectionItemOrBuilder getItemOrBuilder(
        int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);  } else {
        return itemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public java.util.List<? extends bilibili.app.viewunite.v1.SelectionItemOrBuilder> 
         getItemOrBuilderList() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(item_);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public bilibili.app.viewunite.v1.SelectionItem.Builder addItemBuilder() {
      return getItemFieldBuilder().addBuilder(
          bilibili.app.viewunite.v1.SelectionItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public bilibili.app.viewunite.v1.SelectionItem.Builder addItemBuilder(
        int index) {
      return getItemFieldBuilder().addBuilder(
          index, bilibili.app.viewunite.v1.SelectionItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.viewunite.v1.SelectionItem item = 2;</code>
     */
    public java.util.List<bilibili.app.viewunite.v1.SelectionItem.Builder> 
         getItemBuilderList() {
      return getItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.viewunite.v1.SelectionItem, bilibili.app.viewunite.v1.SelectionItem.Builder, bilibili.app.viewunite.v1.SelectionItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.viewunite.v1.SelectionItem, bilibili.app.viewunite.v1.SelectionItem.Builder, bilibili.app.viewunite.v1.SelectionItemOrBuilder>(
                item_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private int arcType_ = 0;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
     * @return The enum numeric value on the wire for arcType.
     */
    @java.lang.Override public int getArcTypeValue() {
      return arcType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
     * @param value The enum numeric value on the wire for arcType to set.
     * @return This builder for chaining.
     */
    public Builder setArcTypeValue(int value) {
      arcType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
     * @return The arcType.
     */
    @java.lang.Override
    public bilibili.app.viewunite.v1.ArcType getArcType() {
      bilibili.app.viewunite.v1.ArcType result = bilibili.app.viewunite.v1.ArcType.forNumber(arcType_);
      return result == null ? bilibili.app.viewunite.v1.ArcType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
     * @param value The arcType to set.
     * @return This builder for chaining.
     */
    public Builder setArcType(bilibili.app.viewunite.v1.ArcType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      arcType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ArcType arc_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArcType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      arcType_ = 0;
      onChanged();
      return this;
    }

    private int selectionType_ = 0;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
     * @return The enum numeric value on the wire for selectionType.
     */
    @java.lang.Override public int getSelectionTypeValue() {
      return selectionType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
     * @param value The enum numeric value on the wire for selectionType to set.
     * @return This builder for chaining.
     */
    public Builder setSelectionTypeValue(int value) {
      selectionType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
     * @return The selectionType.
     */
    @java.lang.Override
    public bilibili.app.viewunite.v1.SelectionType getSelectionType() {
      bilibili.app.viewunite.v1.SelectionType result = bilibili.app.viewunite.v1.SelectionType.forNumber(selectionType_);
      return result == null ? bilibili.app.viewunite.v1.SelectionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
     * @param value The selectionType to set.
     * @return This builder for chaining.
     */
    public Builder setSelectionType(bilibili.app.viewunite.v1.SelectionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      selectionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionType selection_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSelectionType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      selectionType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.viewunite.v1.Selection)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.viewunite.v1.Selection)
  private static final bilibili.app.viewunite.v1.Selection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.viewunite.v1.Selection();
  }

  public static bilibili.app.viewunite.v1.Selection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Selection>
      PARSER = new com.google.protobuf.AbstractParser<Selection>() {
    @java.lang.Override
    public Selection parsePartialFrom(
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

  public static com.google.protobuf.Parser<Selection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Selection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.viewunite.v1.Selection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

