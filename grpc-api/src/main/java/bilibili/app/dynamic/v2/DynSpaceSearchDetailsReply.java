// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply}
 */
public final class DynSpaceSearchDetailsReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)
    DynSpaceSearchDetailsReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynSpaceSearchDetailsReply.newBuilder() to construct.
  private DynSpaceSearchDetailsReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynSpaceSearchDetailsReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynSpaceSearchDetailsReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetItems();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.class, bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private static final class ItemsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>newDefaultInstance(
                bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_ItemsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> items_;
  private com.google.protobuf.MapField<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
  internalGetItems() {
    if (items_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ItemsDefaultEntryHolder.defaultEntry);
    }
    return items_;
  }
  public int getItemsCount() {
    return internalGetItems().getMap().size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
   */
  @java.lang.Override
  public boolean containsItems(
      long key) {

    return internalGetItems().getMap().containsKey(key);
  }
  /**
   * Use {@link #getItemsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> getItems() {
    return getItemsMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> getItemsMap() {
    return internalGetItems().getMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
bilibili.app.dynamic.v2.DynamicItem getItemsOrDefault(
      long key,
      /* nullable */
bilibili.app.dynamic.v2.DynamicItem defaultValue) {

    java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> map =
        internalGetItems().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItem getItemsOrThrow(
      long key) {

    java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> map =
        internalGetItems().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetItems(),
        ItemsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> entry
         : internalGetItems().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
      items__ = ItemsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, items__);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply other = (bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply) obj;

    if (!internalGetItems().equals(
        other.internalGetItems())) return false;
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
    if (!internalGetItems().getMap().isEmpty()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetItems().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)
      bilibili.app.dynamic.v2.DynSpaceSearchDetailsReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetItems();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableItems();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.class, bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.newBuilder()
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
      internalGetMutableItems().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynSpaceSearchDetailsReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply build() {
      bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply buildPartial() {
      bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply result = new bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.items_ = internalGetItems();
        result.items_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply) {
        return mergeFrom((bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply other) {
      if (other == bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply.getDefaultInstance()) return this;
      internalGetMutableItems().mergeFrom(
          other.internalGetItems());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
              items__ = input.readMessage(
                  ItemsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableItems().getMutableMap().put(
                  items__.getKey(), items__.getValue());
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.MapField<
        java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> items_;
    private com.google.protobuf.MapField<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
        internalGetItems() {
      if (items_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ItemsDefaultEntryHolder.defaultEntry);
      }
      return items_;
    }
    private com.google.protobuf.MapField<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
        internalGetMutableItems() {
      if (items_ == null) {
        items_ = com.google.protobuf.MapField.newMapField(
            ItemsDefaultEntryHolder.defaultEntry);
      }
      if (!items_.isMutable()) {
        items_ = items_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return items_;
    }
    public int getItemsCount() {
      return internalGetItems().getMap().size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    @java.lang.Override
    public boolean containsItems(
        long key) {

      return internalGetItems().getMap().containsKey(key);
    }
    /**
     * Use {@link #getItemsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> getItems() {
      return getItemsMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> getItemsMap() {
      return internalGetItems().getMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
bilibili.app.dynamic.v2.DynamicItem getItemsOrDefault(
        long key,
        /* nullable */
bilibili.app.dynamic.v2.DynamicItem defaultValue) {

      java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> map =
          internalGetItems().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.DynamicItem getItemsOrThrow(
        long key) {

      java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> map =
          internalGetItems().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearItems() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableItems().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    public Builder removeItems(
        long key) {

      internalGetMutableItems().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem>
        getMutableItems() {
      bitField0_ |= 0x00000001;
      return internalGetMutableItems().getMutableMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    public Builder putItems(
        long key,
        bilibili.app.dynamic.v2.DynamicItem value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableItems().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.dynamic.v2.DynamicItem&gt; items = 1;</code>
     */
    public Builder putAllItems(
        java.util.Map<java.lang.Long, bilibili.app.dynamic.v2.DynamicItem> values) {
      internalGetMutableItems().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply)
  private static final bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply();
  }

  public static bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynSpaceSearchDetailsReply>
      PARSER = new com.google.protobuf.AbstractParser<DynSpaceSearchDetailsReply>() {
    @java.lang.Override
    public DynSpaceSearchDetailsReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynSpaceSearchDetailsReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynSpaceSearchDetailsReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.DynSpaceSearchDetailsReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

