// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.ArcsPlayer}
 */
public final class ArcsPlayer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.ArcsPlayer)
    ArcsPlayerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArcsPlayer.newBuilder() to construct.
  private ArcsPlayer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArcsPlayer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArcsPlayer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetPlayerInfo();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.ArcsPlayer.class, bilibili.app.view.v1.ArcsPlayer.Builder.class);
  }

  public static final int AID_FIELD_NUMBER = 1;
  private long aid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 aid = 1;</code>
   * @return The aid.
   */
  @java.lang.Override
  public long getAid() {
    return aid_;
  }

  public static final int PLAYER_INFO_FIELD_NUMBER = 2;
  private static final class PlayerInfoDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, java.lang.String>newDefaultInstance(
                bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_PlayerInfoEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Long, java.lang.String> playerInfo_;
  private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
  internalGetPlayerInfo() {
    if (playerInfo_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PlayerInfoDefaultEntryHolder.defaultEntry);
    }
    return playerInfo_;
  }
  public int getPlayerInfoCount() {
    return internalGetPlayerInfo().getMap().size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, string&gt; player_info = 2;</code>
   */
  @java.lang.Override
  public boolean containsPlayerInfo(
      long key) {

    return internalGetPlayerInfo().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPlayerInfoMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, java.lang.String> getPlayerInfo() {
    return getPlayerInfoMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, string&gt; player_info = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Long, java.lang.String> getPlayerInfoMap() {
    return internalGetPlayerInfo().getMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, string&gt; player_info = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getPlayerInfoOrDefault(
      long key,
      /* nullable */
java.lang.String defaultValue) {

    java.util.Map<java.lang.Long, java.lang.String> map =
        internalGetPlayerInfo().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, string&gt; player_info = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getPlayerInfoOrThrow(
      long key) {

    java.util.Map<java.lang.Long, java.lang.String> map =
        internalGetPlayerInfo().getMap();
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
    if (aid_ != 0L) {
      output.writeInt64(1, aid_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetPlayerInfo(),
        PlayerInfoDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, aid_);
    }
    for (java.util.Map.Entry<java.lang.Long, java.lang.String> entry
         : internalGetPlayerInfo().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, java.lang.String>
      playerInfo__ = PlayerInfoDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, playerInfo__);
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
    if (!(obj instanceof bilibili.app.view.v1.ArcsPlayer)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.ArcsPlayer other = (bilibili.app.view.v1.ArcsPlayer) obj;

    if (getAid()
        != other.getAid()) return false;
    if (!internalGetPlayerInfo().equals(
        other.internalGetPlayerInfo())) return false;
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
    hash = (37 * hash) + AID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAid());
    if (!internalGetPlayerInfo().getMap().isEmpty()) {
      hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPlayerInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ArcsPlayer parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.ArcsPlayer prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.ArcsPlayer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.ArcsPlayer)
      bilibili.app.view.v1.ArcsPlayerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetPlayerInfo();
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
          return internalGetMutablePlayerInfo();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.ArcsPlayer.class, bilibili.app.view.v1.ArcsPlayer.Builder.class);
    }

    // Construct using bilibili.app.view.v1.ArcsPlayer.newBuilder()
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
      aid_ = 0L;
      internalGetMutablePlayerInfo().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ArcsPlayer_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ArcsPlayer getDefaultInstanceForType() {
      return bilibili.app.view.v1.ArcsPlayer.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.ArcsPlayer build() {
      bilibili.app.view.v1.ArcsPlayer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ArcsPlayer buildPartial() {
      bilibili.app.view.v1.ArcsPlayer result = new bilibili.app.view.v1.ArcsPlayer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.ArcsPlayer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.aid_ = aid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playerInfo_ = internalGetPlayerInfo();
        result.playerInfo_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.ArcsPlayer) {
        return mergeFrom((bilibili.app.view.v1.ArcsPlayer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.ArcsPlayer other) {
      if (other == bilibili.app.view.v1.ArcsPlayer.getDefaultInstance()) return this;
      if (other.getAid() != 0L) {
        setAid(other.getAid());
      }
      internalGetMutablePlayerInfo().mergeFrom(
          other.internalGetPlayerInfo());
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
              aid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.Long, java.lang.String>
              playerInfo__ = input.readMessage(
                  PlayerInfoDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutablePlayerInfo().getMutableMap().put(
                  playerInfo__.getKey(), playerInfo__.getValue());
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

    private long aid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @return The aid.
     */
    @java.lang.Override
    public long getAid() {
      return aid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @param value The aid to set.
     * @return This builder for chaining.
     */
    public Builder setAid(long value) {

      aid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      aid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.String> playerInfo_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
        internalGetPlayerInfo() {
      if (playerInfo_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerInfoDefaultEntryHolder.defaultEntry);
      }
      return playerInfo_;
    }
    private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
        internalGetMutablePlayerInfo() {
      if (playerInfo_ == null) {
        playerInfo_ = com.google.protobuf.MapField.newMapField(
            PlayerInfoDefaultEntryHolder.defaultEntry);
      }
      if (!playerInfo_.isMutable()) {
        playerInfo_ = playerInfo_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return playerInfo_;
    }
    public int getPlayerInfoCount() {
      return internalGetPlayerInfo().getMap().size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    @java.lang.Override
    public boolean containsPlayerInfo(
        long key) {

      return internalGetPlayerInfo().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPlayerInfoMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.String> getPlayerInfo() {
      return getPlayerInfoMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, java.lang.String> getPlayerInfoMap() {
      return internalGetPlayerInfo().getMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getPlayerInfoOrDefault(
        long key,
        /* nullable */
java.lang.String defaultValue) {

      java.util.Map<java.lang.Long, java.lang.String> map =
          internalGetPlayerInfo().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getPlayerInfoOrThrow(
        long key) {

      java.util.Map<java.lang.Long, java.lang.String> map =
          internalGetPlayerInfo().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearPlayerInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutablePlayerInfo().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    public Builder removePlayerInfo(
        long key) {

      internalGetMutablePlayerInfo().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.String>
        getMutablePlayerInfo() {
      bitField0_ |= 0x00000002;
      return internalGetMutablePlayerInfo().getMutableMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    public Builder putPlayerInfo(
        long key,
        java.lang.String value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutablePlayerInfo().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, string&gt; player_info = 2;</code>
     */
    public Builder putAllPlayerInfo(
        java.util.Map<java.lang.Long, java.lang.String> values) {
      internalGetMutablePlayerInfo().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.ArcsPlayer)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.ArcsPlayer)
  private static final bilibili.app.view.v1.ArcsPlayer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.ArcsPlayer();
  }

  public static bilibili.app.view.v1.ArcsPlayer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArcsPlayer>
      PARSER = new com.google.protobuf.AbstractParser<ArcsPlayer>() {
    @java.lang.Override
    public ArcsPlayer parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArcsPlayer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArcsPlayer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.ArcsPlayer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

