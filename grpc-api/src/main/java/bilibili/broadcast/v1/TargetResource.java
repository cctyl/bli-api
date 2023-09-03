// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/push.proto

package bilibili.broadcast.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.broadcast.v1.TargetResource}
 */
public final class TargetResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.broadcast.v1.TargetResource)
    TargetResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetResource.newBuilder() to construct.
  private TargetResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetResource() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetResource();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.broadcast.v1.TargetResource.class, bilibili.broadcast.v1.TargetResource.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   *直播:   roomid
   *UGC:   avid
   *PGC:   seasonid
   *Story: avid
   *举个例子
   *Type: LINK_TYPE_BANGUMI (番剧)
   *Resource: {"seasonid":"123"}
   *
   *Type: LINK_TYPE_VIDEO (视频)
   *Resource: {"avid":"123"}
   *
   *Type: LINK_TYPE_LIVE (直播)
   *Resource: {"roomid":"123"}
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   *直播:   roomid
   *UGC:   avid
   *PGC:   seasonid
   *Story: avid
   *举个例子
   *Type: LINK_TYPE_BANGUMI (番剧)
   *Resource: {"seasonid":"123"}
   *
   *Type: LINK_TYPE_VIDEO (视频)
   *Resource: {"avid":"123"}
   *
   *Type: LINK_TYPE_LIVE (直播)
   *Resource: {"roomid":"123"}
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.broadcast.v1.LinkType getType() {
    bilibili.broadcast.v1.LinkType result = bilibili.broadcast.v1.LinkType.forNumber(type_);
    return result == null ? bilibili.broadcast.v1.LinkType.UNRECOGNIZED : result;
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private static final class ResourceDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_ResourceEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> resource_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetResource() {
    if (resource_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResourceDefaultEntryHolder.defaultEntry);
    }
    return resource_;
  }
  public int getResourceCount() {
    return internalGetResource().getMap().size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, string&gt; Resource = 2;</code>
   */
  @java.lang.Override
  public boolean containsResource(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetResource().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResourceMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getResource() {
    return getResourceMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, string&gt; Resource = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getResourceMap() {
    return internalGetResource().getMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, string&gt; Resource = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getResourceOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResource().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, string&gt; Resource = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getResourceOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResource().getMap();
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
    if (type_ != bilibili.broadcast.v1.LinkType.LINK_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(1, type_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetResource(),
        ResourceDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != bilibili.broadcast.v1.LinkType.LINK_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetResource().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      resource__ = ResourceDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, resource__);
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
    if (!(obj instanceof bilibili.broadcast.v1.TargetResource)) {
      return super.equals(obj);
    }
    bilibili.broadcast.v1.TargetResource other = (bilibili.broadcast.v1.TargetResource) obj;

    if (type_ != other.type_) return false;
    if (!internalGetResource().equals(
        other.internalGetResource())) return false;
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
    hash = (53 * hash) + type_;
    if (!internalGetResource().getMap().isEmpty()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.broadcast.v1.TargetResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.TargetResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.TargetResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.TargetResource parseFrom(
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
  public static Builder newBuilder(bilibili.broadcast.v1.TargetResource prototype) {
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
   * Protobuf type {@code bilibili.broadcast.v1.TargetResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.broadcast.v1.TargetResource)
      bilibili.broadcast.v1.TargetResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetResource();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableResource();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.v1.TargetResource.class, bilibili.broadcast.v1.TargetResource.Builder.class);
    }

    // Construct using bilibili.broadcast.v1.TargetResource.newBuilder()
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
      internalGetMutableResource().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.broadcast.v1.PushOuterClass.internal_static_bilibili_broadcast_v1_TargetResource_descriptor;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.TargetResource getDefaultInstanceForType() {
      return bilibili.broadcast.v1.TargetResource.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.broadcast.v1.TargetResource build() {
      bilibili.broadcast.v1.TargetResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.TargetResource buildPartial() {
      bilibili.broadcast.v1.TargetResource result = new bilibili.broadcast.v1.TargetResource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.broadcast.v1.TargetResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resource_ = internalGetResource();
        result.resource_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.broadcast.v1.TargetResource) {
        return mergeFrom((bilibili.broadcast.v1.TargetResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.broadcast.v1.TargetResource other) {
      if (other == bilibili.broadcast.v1.TargetResource.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      internalGetMutableResource().mergeFrom(
          other.internalGetResource());
      bitField0_ |= 0x00000002;
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              resource__ = input.readMessage(
                  ResourceDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableResource().getMutableMap().put(
                  resource__.getKey(), resource__.getValue());
              bitField0_ |= 0x00000002;
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

    private int type_ = 0;
    /**
     * <pre>
     *直播:   roomid
     *UGC:   avid
     *PGC:   seasonid
     *Story: avid
     *举个例子
     *Type: LINK_TYPE_BANGUMI (番剧)
     *Resource: {"seasonid":"123"}
     *
     *Type: LINK_TYPE_VIDEO (视频)
     *Resource: {"avid":"123"}
     *
     *Type: LINK_TYPE_LIVE (直播)
     *Resource: {"roomid":"123"}
     * </pre>
     *
     * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     *直播:   roomid
     *UGC:   avid
     *PGC:   seasonid
     *Story: avid
     *举个例子
     *Type: LINK_TYPE_BANGUMI (番剧)
     *Resource: {"seasonid":"123"}
     *
     *Type: LINK_TYPE_VIDEO (视频)
     *Resource: {"avid":"123"}
     *
     *Type: LINK_TYPE_LIVE (直播)
     *Resource: {"roomid":"123"}
     * </pre>
     *
     * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *直播:   roomid
     *UGC:   avid
     *PGC:   seasonid
     *Story: avid
     *举个例子
     *Type: LINK_TYPE_BANGUMI (番剧)
     *Resource: {"seasonid":"123"}
     *
     *Type: LINK_TYPE_VIDEO (视频)
     *Resource: {"avid":"123"}
     *
     *Type: LINK_TYPE_LIVE (直播)
     *Resource: {"roomid":"123"}
     * </pre>
     *
     * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.broadcast.v1.LinkType getType() {
      bilibili.broadcast.v1.LinkType result = bilibili.broadcast.v1.LinkType.forNumber(type_);
      return result == null ? bilibili.broadcast.v1.LinkType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *直播:   roomid
     *UGC:   avid
     *PGC:   seasonid
     *Story: avid
     *举个例子
     *Type: LINK_TYPE_BANGUMI (番剧)
     *Resource: {"seasonid":"123"}
     *
     *Type: LINK_TYPE_VIDEO (视频)
     *Resource: {"avid":"123"}
     *
     *Type: LINK_TYPE_LIVE (直播)
     *Resource: {"roomid":"123"}
     * </pre>
     *
     * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.broadcast.v1.LinkType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *直播:   roomid
     *UGC:   avid
     *PGC:   seasonid
     *Story: avid
     *举个例子
     *Type: LINK_TYPE_BANGUMI (番剧)
     *Resource: {"seasonid":"123"}
     *
     *Type: LINK_TYPE_VIDEO (视频)
     *Resource: {"avid":"123"}
     *
     *Type: LINK_TYPE_LIVE (直播)
     *Resource: {"roomid":"123"}
     * </pre>
     *
     * <code>.bilibili.broadcast.v1.LinkType Type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> resource_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetResource() {
      if (resource_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResourceDefaultEntryHolder.defaultEntry);
      }
      return resource_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableResource() {
      if (resource_ == null) {
        resource_ = com.google.protobuf.MapField.newMapField(
            ResourceDefaultEntryHolder.defaultEntry);
      }
      if (!resource_.isMutable()) {
        resource_ = resource_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return resource_;
    }
    public int getResourceCount() {
      return internalGetResource().getMap().size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    @java.lang.Override
    public boolean containsResource(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetResource().getMap().containsKey(key);
    }
    /**
     * Use {@link #getResourceMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getResource() {
      return getResourceMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getResourceMap() {
      return internalGetResource().getMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getResourceOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResource().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getResourceOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResource().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableResource().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    public Builder removeResource(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableResource().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableResource() {
      bitField0_ |= 0x00000002;
      return internalGetMutableResource().getMutableMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    public Builder putResource(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableResource().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;string, string&gt; Resource = 2;</code>
     */
    public Builder putAllResource(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableResource().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.broadcast.v1.TargetResource)
  }

  // @@protoc_insertion_point(class_scope:bilibili.broadcast.v1.TargetResource)
  private static final bilibili.broadcast.v1.TargetResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.broadcast.v1.TargetResource();
  }

  public static bilibili.broadcast.v1.TargetResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetResource>
      PARSER = new com.google.protobuf.AbstractParser<TargetResource>() {
    @java.lang.Override
    public TargetResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.broadcast.v1.TargetResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

