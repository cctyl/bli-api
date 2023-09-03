// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.playershared.PlayDeviceConf}
 */
public final class PlayDeviceConf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.playershared.PlayDeviceConf)
    PlayDeviceConfOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayDeviceConf.newBuilder() to construct.
  private PlayDeviceConf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayDeviceConf() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayDeviceConf();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetDeviceConfs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.playershared.PlayDeviceConf.class, bilibili.playershared.PlayDeviceConf.Builder.class);
  }

  public static final int DEVICE_CONFS_FIELD_NUMBER = 1;
  private static final class DeviceConfsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, bilibili.playershared.DeviceConf> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, bilibili.playershared.DeviceConf>newDefaultInstance(
                bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_DeviceConfsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                bilibili.playershared.DeviceConf.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, bilibili.playershared.DeviceConf> deviceConfs_;
  private com.google.protobuf.MapField<java.lang.Integer, bilibili.playershared.DeviceConf>
  internalGetDeviceConfs() {
    if (deviceConfs_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DeviceConfsDefaultEntryHolder.defaultEntry);
    }
    return deviceConfs_;
  }
  public int getDeviceConfsCount() {
    return internalGetDeviceConfs().getMap().size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  @java.lang.Override
  public boolean containsDeviceConfs(
      int key) {

    return internalGetDeviceConfs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDeviceConfsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> getDeviceConfs() {
    return getDeviceConfsMap();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> getDeviceConfsMap() {
    return internalGetDeviceConfs().getMap();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
bilibili.playershared.DeviceConf getDeviceConfsOrDefault(
      int key,
      /* nullable */
bilibili.playershared.DeviceConf defaultValue) {

    java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> map =
        internalGetDeviceConfs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  @java.lang.Override
  public bilibili.playershared.DeviceConf getDeviceConfsOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> map =
        internalGetDeviceConfs().getMap();
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
      .serializeIntegerMapTo(
        output,
        internalGetDeviceConfs(),
        DeviceConfsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, bilibili.playershared.DeviceConf> entry
         : internalGetDeviceConfs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, bilibili.playershared.DeviceConf>
      deviceConfs__ = DeviceConfsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, deviceConfs__);
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
    if (!(obj instanceof bilibili.playershared.PlayDeviceConf)) {
      return super.equals(obj);
    }
    bilibili.playershared.PlayDeviceConf other = (bilibili.playershared.PlayDeviceConf) obj;

    if (!internalGetDeviceConfs().equals(
        other.internalGetDeviceConfs())) return false;
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
    if (!internalGetDeviceConfs().getMap().isEmpty()) {
      hash = (37 * hash) + DEVICE_CONFS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDeviceConfs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.playershared.PlayDeviceConf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.PlayDeviceConf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.playershared.PlayDeviceConf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.PlayDeviceConf parseFrom(
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
  public static Builder newBuilder(bilibili.playershared.PlayDeviceConf prototype) {
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
   * Protobuf type {@code bilibili.playershared.PlayDeviceConf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.playershared.PlayDeviceConf)
      bilibili.playershared.PlayDeviceConfOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetDeviceConfs();
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
          return internalGetMutableDeviceConfs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.playershared.PlayDeviceConf.class, bilibili.playershared.PlayDeviceConf.Builder.class);
    }

    // Construct using bilibili.playershared.PlayDeviceConf.newBuilder()
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
      internalGetMutableDeviceConfs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_PlayDeviceConf_descriptor;
    }

    @java.lang.Override
    public bilibili.playershared.PlayDeviceConf getDefaultInstanceForType() {
      return bilibili.playershared.PlayDeviceConf.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.playershared.PlayDeviceConf build() {
      bilibili.playershared.PlayDeviceConf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.playershared.PlayDeviceConf buildPartial() {
      bilibili.playershared.PlayDeviceConf result = new bilibili.playershared.PlayDeviceConf(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.playershared.PlayDeviceConf result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deviceConfs_ = internalGetDeviceConfs();
        result.deviceConfs_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.playershared.PlayDeviceConf) {
        return mergeFrom((bilibili.playershared.PlayDeviceConf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.playershared.PlayDeviceConf other) {
      if (other == bilibili.playershared.PlayDeviceConf.getDefaultInstance()) return this;
      internalGetMutableDeviceConfs().mergeFrom(
          other.internalGetDeviceConfs());
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
              com.google.protobuf.MapEntry<java.lang.Integer, bilibili.playershared.DeviceConf>
              deviceConfs__ = input.readMessage(
                  DeviceConfsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableDeviceConfs().getMutableMap().put(
                  deviceConfs__.getKey(), deviceConfs__.getValue());
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
        java.lang.Integer, bilibili.playershared.DeviceConf> deviceConfs_;
    private com.google.protobuf.MapField<java.lang.Integer, bilibili.playershared.DeviceConf>
        internalGetDeviceConfs() {
      if (deviceConfs_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DeviceConfsDefaultEntryHolder.defaultEntry);
      }
      return deviceConfs_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, bilibili.playershared.DeviceConf>
        internalGetMutableDeviceConfs() {
      if (deviceConfs_ == null) {
        deviceConfs_ = com.google.protobuf.MapField.newMapField(
            DeviceConfsDefaultEntryHolder.defaultEntry);
      }
      if (!deviceConfs_.isMutable()) {
        deviceConfs_ = deviceConfs_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return deviceConfs_;
    }
    public int getDeviceConfsCount() {
      return internalGetDeviceConfs().getMap().size();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    @java.lang.Override
    public boolean containsDeviceConfs(
        int key) {

      return internalGetDeviceConfs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDeviceConfsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> getDeviceConfs() {
      return getDeviceConfsMap();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> getDeviceConfsMap() {
      return internalGetDeviceConfs().getMap();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
bilibili.playershared.DeviceConf getDeviceConfsOrDefault(
        int key,
        /* nullable */
bilibili.playershared.DeviceConf defaultValue) {

      java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> map =
          internalGetDeviceConfs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    @java.lang.Override
    public bilibili.playershared.DeviceConf getDeviceConfsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> map =
          internalGetDeviceConfs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearDeviceConfs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableDeviceConfs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    public Builder removeDeviceConfs(
        int key) {

      internalGetMutableDeviceConfs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf>
        getMutableDeviceConfs() {
      bitField0_ |= 0x00000001;
      return internalGetMutableDeviceConfs().getMutableMap();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    public Builder putDeviceConfs(
        int key,
        bilibili.playershared.DeviceConf value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableDeviceConfs().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
     */
    public Builder putAllDeviceConfs(
        java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf> values) {
      internalGetMutableDeviceConfs().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:bilibili.playershared.PlayDeviceConf)
  }

  // @@protoc_insertion_point(class_scope:bilibili.playershared.PlayDeviceConf)
  private static final bilibili.playershared.PlayDeviceConf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.playershared.PlayDeviceConf();
  }

  public static bilibili.playershared.PlayDeviceConf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayDeviceConf>
      PARSER = new com.google.protobuf.AbstractParser<PlayDeviceConf>() {
    @java.lang.Override
    public PlayDeviceConf parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayDeviceConf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayDeviceConf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.playershared.PlayDeviceConf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

