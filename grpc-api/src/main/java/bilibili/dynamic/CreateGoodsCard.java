// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * 创建动态时附带的商品大卡详情
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.CreateGoodsCard}
 */
public final class CreateGoodsCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.CreateGoodsCard)
    CreateGoodsCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGoodsCard.newBuilder() to construct.
  private CreateGoodsCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGoodsCard() {
    itemId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGoodsCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateGoodsCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateGoodsCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.CreateGoodsCard.class, bilibili.dynamic.CreateGoodsCard.Builder.class);
  }

  public static final int ITEM_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList itemId_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * 商品大卡中的商品id
   * </pre>
   *
   * <code>repeated string item_id = 1;</code>
   * @return A list containing the itemId.
   */
  public com.google.protobuf.ProtocolStringList
      getItemIdList() {
    return itemId_;
  }
  /**
   * <pre>
   * 商品大卡中的商品id
   * </pre>
   *
   * <code>repeated string item_id = 1;</code>
   * @return The count of itemId.
   */
  public int getItemIdCount() {
    return itemId_.size();
  }
  /**
   * <pre>
   * 商品大卡中的商品id
   * </pre>
   *
   * <code>repeated string item_id = 1;</code>
   * @param index The index of the element to return.
   * @return The itemId at the given index.
   */
  public java.lang.String getItemId(int index) {
    return itemId_.get(index);
  }
  /**
   * <pre>
   * 商品大卡中的商品id
   * </pre>
   *
   * <code>repeated string item_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the itemId at the given index.
   */
  public com.google.protobuf.ByteString
      getItemIdBytes(int index) {
    return itemId_.getByteString(index);
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
    for (int i = 0; i < itemId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemId_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < itemId_.size(); i++) {
        dataSize += computeStringSizeNoTag(itemId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getItemIdList().size();
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
    if (!(obj instanceof bilibili.dynamic.CreateGoodsCard)) {
      return super.equals(obj);
    }
    bilibili.dynamic.CreateGoodsCard other = (bilibili.dynamic.CreateGoodsCard) obj;

    if (!getItemIdList()
        .equals(other.getItemIdList())) return false;
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
    if (getItemIdCount() > 0) {
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemIdList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateGoodsCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateGoodsCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateGoodsCard parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.CreateGoodsCard prototype) {
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
   * 创建动态时附带的商品大卡详情
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.CreateGoodsCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.CreateGoodsCard)
      bilibili.dynamic.CreateGoodsCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateGoodsCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateGoodsCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.CreateGoodsCard.class, bilibili.dynamic.CreateGoodsCard.Builder.class);
    }

    // Construct using bilibili.dynamic.CreateGoodsCard.newBuilder()
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
      itemId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateGoodsCard_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateGoodsCard getDefaultInstanceForType() {
      return bilibili.dynamic.CreateGoodsCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.CreateGoodsCard build() {
      bilibili.dynamic.CreateGoodsCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateGoodsCard buildPartial() {
      bilibili.dynamic.CreateGoodsCard result = new bilibili.dynamic.CreateGoodsCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.CreateGoodsCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        itemId_.makeImmutable();
        result.itemId_ = itemId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.CreateGoodsCard) {
        return mergeFrom((bilibili.dynamic.CreateGoodsCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.CreateGoodsCard other) {
      if (other == bilibili.dynamic.CreateGoodsCard.getDefaultInstance()) return this;
      if (!other.itemId_.isEmpty()) {
        if (itemId_.isEmpty()) {
          itemId_ = other.itemId_;
          bitField0_ |= 0x00000001;
        } else {
          ensureItemIdIsMutable();
          itemId_.addAll(other.itemId_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureItemIdIsMutable();
              itemId_.add(s);
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

    private com.google.protobuf.LazyStringArrayList itemId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureItemIdIsMutable() {
      if (!itemId_.isModifiable()) {
        itemId_ = new com.google.protobuf.LazyStringArrayList(itemId_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @return A list containing the itemId.
     */
    public com.google.protobuf.ProtocolStringList
        getItemIdList() {
      itemId_.makeImmutable();
      return itemId_;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @return The count of itemId.
     */
    public int getItemIdCount() {
      return itemId_.size();
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param index The index of the element to return.
     * @return The itemId at the given index.
     */
    public java.lang.String getItemId(int index) {
      return itemId_.get(index);
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the itemId at the given index.
     */
    public com.google.protobuf.ByteString
        getItemIdBytes(int index) {
      return itemId_.getByteString(index);
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureItemIdIsMutable();
      itemId_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param value The itemId to add.
     * @return This builder for chaining.
     */
    public Builder addItemId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureItemIdIsMutable();
      itemId_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param values The itemId to add.
     * @return This builder for chaining.
     */
    public Builder addAllItemId(
        java.lang.Iterable<java.lang.String> values) {
      ensureItemIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, itemId_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      itemId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 商品大卡中的商品id
     * </pre>
     *
     * <code>repeated string item_id = 1;</code>
     * @param value The bytes of the itemId to add.
     * @return This builder for chaining.
     */
    public Builder addItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureItemIdIsMutable();
      itemId_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.CreateGoodsCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.CreateGoodsCard)
  private static final bilibili.dynamic.CreateGoodsCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.CreateGoodsCard();
  }

  public static bilibili.dynamic.CreateGoodsCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGoodsCard>
      PARSER = new com.google.protobuf.AbstractParser<CreateGoodsCard>() {
    @java.lang.Override
    public CreateGoodsCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGoodsCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGoodsCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.CreateGoodsCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

