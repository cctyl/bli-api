// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/avatar.proto

package bilibili.dagw.component.avatar.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.dagw.component.avatar.v1.LayerConfig}
 */
public final class LayerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dagw.component.avatar.v1.LayerConfig)
    LayerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LayerConfig.newBuilder() to construct.
  private LayerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LayerConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LayerConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetTags();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dagw.component.avatar.v1.LayerConfig.class, bilibili.dagw.component.avatar.v1.LayerConfig.Builder.class);
  }

  public static final int TAGS_FIELD_NUMBER = 1;
  private static final class TagsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>newDefaultInstance(
                bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_TagsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                bilibili.dagw.component.avatar.v1.LayerTagConfig.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> tags_;
  private com.google.protobuf.MapField<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
  internalGetTags() {
    if (tags_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TagsDefaultEntryHolder.defaultEntry);
    }
    return tags_;
  }
  public int getTagsCount() {
    return internalGetTags().getMap().size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
   */
  @java.lang.Override
  public boolean containsTags(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetTags().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> getTags() {
    return getTagsMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> getTagsMap() {
    return internalGetTags().getMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
bilibili.dagw.component.avatar.v1.LayerTagConfig getTagsOrDefault(
      java.lang.String key,
      /* nullable */
bilibili.dagw.component.avatar.v1.LayerTagConfig defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> map =
        internalGetTags().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
   */
  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.LayerTagConfig getTagsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> map =
        internalGetTags().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int IS_CRITICAL_FIELD_NUMBER = 2;
  private boolean isCritical_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_critical = 2;</code>
   * @return The isCritical.
   */
  @java.lang.Override
  public boolean getIsCritical() {
    return isCritical_;
  }

  public static final int ALLOW_OVER_PAINT_FIELD_NUMBER = 3;
  private boolean allowOverPaint_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool allow_over_paint = 3;</code>
   * @return The allowOverPaint.
   */
  @java.lang.Override
  public boolean getAllowOverPaint() {
    return allowOverPaint_;
  }

  public static final int LAYER_MASK_FIELD_NUMBER = 4;
  private bilibili.dagw.component.avatar.common.MaskProperty layerMask_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
   * @return Whether the layerMask field is set.
   */
  @java.lang.Override
  public boolean hasLayerMask() {
    return layerMask_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
   * @return The layerMask.
   */
  @java.lang.Override
  public bilibili.dagw.component.avatar.common.MaskProperty getLayerMask() {
    return layerMask_ == null ? bilibili.dagw.component.avatar.common.MaskProperty.getDefaultInstance() : layerMask_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
   */
  @java.lang.Override
  public bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder getLayerMaskOrBuilder() {
    return layerMask_ == null ? bilibili.dagw.component.avatar.common.MaskProperty.getDefaultInstance() : layerMask_;
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
      .serializeStringMapTo(
        output,
        internalGetTags(),
        TagsDefaultEntryHolder.defaultEntry,
        1);
    if (isCritical_ != false) {
      output.writeBool(2, isCritical_);
    }
    if (allowOverPaint_ != false) {
      output.writeBool(3, allowOverPaint_);
    }
    if (layerMask_ != null) {
      output.writeMessage(4, getLayerMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> entry
         : internalGetTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
      tags__ = TagsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, tags__);
    }
    if (isCritical_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isCritical_);
    }
    if (allowOverPaint_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowOverPaint_);
    }
    if (layerMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLayerMask());
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
    if (!(obj instanceof bilibili.dagw.component.avatar.v1.LayerConfig)) {
      return super.equals(obj);
    }
    bilibili.dagw.component.avatar.v1.LayerConfig other = (bilibili.dagw.component.avatar.v1.LayerConfig) obj;

    if (!internalGetTags().equals(
        other.internalGetTags())) return false;
    if (getIsCritical()
        != other.getIsCritical()) return false;
    if (getAllowOverPaint()
        != other.getAllowOverPaint()) return false;
    if (hasLayerMask() != other.hasLayerMask()) return false;
    if (hasLayerMask()) {
      if (!getLayerMask()
          .equals(other.getLayerMask())) return false;
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
    if (!internalGetTags().getMap().isEmpty()) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTags().hashCode();
    }
    hash = (37 * hash) + IS_CRITICAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCritical());
    hash = (37 * hash) + ALLOW_OVER_PAINT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowOverPaint());
    if (hasLayerMask()) {
      hash = (37 * hash) + LAYER_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getLayerMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.LayerConfig parseFrom(
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
  public static Builder newBuilder(bilibili.dagw.component.avatar.v1.LayerConfig prototype) {
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
   * Protobuf type {@code bilibili.dagw.component.avatar.v1.LayerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dagw.component.avatar.v1.LayerConfig)
      bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetTags();
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
          return internalGetMutableTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dagw.component.avatar.v1.LayerConfig.class, bilibili.dagw.component.avatar.v1.LayerConfig.Builder.class);
    }

    // Construct using bilibili.dagw.component.avatar.v1.LayerConfig.newBuilder()
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
      internalGetMutableTags().clear();
      isCritical_ = false;
      allowOverPaint_ = false;
      layerMask_ = null;
      if (layerMaskBuilder_ != null) {
        layerMaskBuilder_.dispose();
        layerMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dagw.component.avatar.v1.Avatar.internal_static_bilibili_dagw_component_avatar_v1_LayerConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.LayerConfig getDefaultInstanceForType() {
      return bilibili.dagw.component.avatar.v1.LayerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.LayerConfig build() {
      bilibili.dagw.component.avatar.v1.LayerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.LayerConfig buildPartial() {
      bilibili.dagw.component.avatar.v1.LayerConfig result = new bilibili.dagw.component.avatar.v1.LayerConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dagw.component.avatar.v1.LayerConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tags_ = internalGetTags();
        result.tags_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isCritical_ = isCritical_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowOverPaint_ = allowOverPaint_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.layerMask_ = layerMaskBuilder_ == null
            ? layerMask_
            : layerMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dagw.component.avatar.v1.LayerConfig) {
        return mergeFrom((bilibili.dagw.component.avatar.v1.LayerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dagw.component.avatar.v1.LayerConfig other) {
      if (other == bilibili.dagw.component.avatar.v1.LayerConfig.getDefaultInstance()) return this;
      internalGetMutableTags().mergeFrom(
          other.internalGetTags());
      bitField0_ |= 0x00000001;
      if (other.getIsCritical() != false) {
        setIsCritical(other.getIsCritical());
      }
      if (other.getAllowOverPaint() != false) {
        setAllowOverPaint(other.getAllowOverPaint());
      }
      if (other.hasLayerMask()) {
        mergeLayerMask(other.getLayerMask());
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
              com.google.protobuf.MapEntry<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
              tags__ = input.readMessage(
                  TagsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableTags().getMutableMap().put(
                  tags__.getKey(), tags__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              isCritical_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              allowOverPaint_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getLayerMaskFieldBuilder().getBuilder(),
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

    private com.google.protobuf.MapField<
        java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> tags_;
    private com.google.protobuf.MapField<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
        internalGetTags() {
      if (tags_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      return tags_;
    }
    private com.google.protobuf.MapField<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
        internalGetMutableTags() {
      if (tags_ == null) {
        tags_ = com.google.protobuf.MapField.newMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      if (!tags_.isMutable()) {
        tags_ = tags_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return tags_;
    }
    public int getTagsCount() {
      return internalGetTags().getMap().size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    @java.lang.Override
    public boolean containsTags(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetTags().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTagsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> getTags() {
      return getTagsMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> getTagsMap() {
      return internalGetTags().getMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
bilibili.dagw.component.avatar.v1.LayerTagConfig getTagsOrDefault(
        java.lang.String key,
        /* nullable */
bilibili.dagw.component.avatar.v1.LayerTagConfig defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> map =
          internalGetTags().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.LayerTagConfig getTagsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> map =
          internalGetTags().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearTags() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableTags().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    public Builder removeTags(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableTags().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig>
        getMutableTags() {
      bitField0_ |= 0x00000001;
      return internalGetMutableTags().getMutableMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    public Builder putTags(
        java.lang.String key,
        bilibili.dagw.component.avatar.v1.LayerTagConfig value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableTags().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, .bilibili.dagw.component.avatar.v1.LayerTagConfig&gt; tags = 1;</code>
     */
    public Builder putAllTags(
        java.util.Map<java.lang.String, bilibili.dagw.component.avatar.v1.LayerTagConfig> values) {
      internalGetMutableTags().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private boolean isCritical_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_critical = 2;</code>
     * @return The isCritical.
     */
    @java.lang.Override
    public boolean getIsCritical() {
      return isCritical_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_critical = 2;</code>
     * @param value The isCritical to set.
     * @return This builder for chaining.
     */
    public Builder setIsCritical(boolean value) {

      isCritical_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_critical = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCritical() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isCritical_ = false;
      onChanged();
      return this;
    }

    private boolean allowOverPaint_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_over_paint = 3;</code>
     * @return The allowOverPaint.
     */
    @java.lang.Override
    public boolean getAllowOverPaint() {
      return allowOverPaint_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_over_paint = 3;</code>
     * @param value The allowOverPaint to set.
     * @return This builder for chaining.
     */
    public Builder setAllowOverPaint(boolean value) {

      allowOverPaint_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_over_paint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowOverPaint() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowOverPaint_ = false;
      onChanged();
      return this;
    }

    private bilibili.dagw.component.avatar.common.MaskProperty layerMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dagw.component.avatar.common.MaskProperty, bilibili.dagw.component.avatar.common.MaskProperty.Builder, bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder> layerMaskBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     * @return Whether the layerMask field is set.
     */
    public boolean hasLayerMask() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     * @return The layerMask.
     */
    public bilibili.dagw.component.avatar.common.MaskProperty getLayerMask() {
      if (layerMaskBuilder_ == null) {
        return layerMask_ == null ? bilibili.dagw.component.avatar.common.MaskProperty.getDefaultInstance() : layerMask_;
      } else {
        return layerMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public Builder setLayerMask(bilibili.dagw.component.avatar.common.MaskProperty value) {
      if (layerMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        layerMask_ = value;
      } else {
        layerMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public Builder setLayerMask(
        bilibili.dagw.component.avatar.common.MaskProperty.Builder builderForValue) {
      if (layerMaskBuilder_ == null) {
        layerMask_ = builderForValue.build();
      } else {
        layerMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public Builder mergeLayerMask(bilibili.dagw.component.avatar.common.MaskProperty value) {
      if (layerMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          layerMask_ != null &&
          layerMask_ != bilibili.dagw.component.avatar.common.MaskProperty.getDefaultInstance()) {
          getLayerMaskBuilder().mergeFrom(value);
        } else {
          layerMask_ = value;
        }
      } else {
        layerMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public Builder clearLayerMask() {
      bitField0_ = (bitField0_ & ~0x00000008);
      layerMask_ = null;
      if (layerMaskBuilder_ != null) {
        layerMaskBuilder_.dispose();
        layerMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public bilibili.dagw.component.avatar.common.MaskProperty.Builder getLayerMaskBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getLayerMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    public bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder getLayerMaskOrBuilder() {
      if (layerMaskBuilder_ != null) {
        return layerMaskBuilder_.getMessageOrBuilder();
      } else {
        return layerMask_ == null ?
            bilibili.dagw.component.avatar.common.MaskProperty.getDefaultInstance() : layerMask_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dagw.component.avatar.common.MaskProperty layer_mask = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dagw.component.avatar.common.MaskProperty, bilibili.dagw.component.avatar.common.MaskProperty.Builder, bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder> 
        getLayerMaskFieldBuilder() {
      if (layerMaskBuilder_ == null) {
        layerMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dagw.component.avatar.common.MaskProperty, bilibili.dagw.component.avatar.common.MaskProperty.Builder, bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder>(
                getLayerMask(),
                getParentForChildren(),
                isClean());
        layerMask_ = null;
      }
      return layerMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dagw.component.avatar.v1.LayerConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dagw.component.avatar.v1.LayerConfig)
  private static final bilibili.dagw.component.avatar.v1.LayerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dagw.component.avatar.v1.LayerConfig();
  }

  public static bilibili.dagw.component.avatar.v1.LayerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LayerConfig>
      PARSER = new com.google.protobuf.AbstractParser<LayerConfig>() {
    @java.lang.Override
    public LayerConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LayerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LayerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.LayerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

