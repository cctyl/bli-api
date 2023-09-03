// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.PlayURLResp}
 */
public final class PlayURLResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.PlayURLResp)
    PlayURLRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayURLResp.newBuilder() to construct.
  private PlayURLResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayURLResp() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayURLResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetPlayerInfo();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.PlayURLResp.class, bilibili.app.listener.v1.PlayURLResp.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private bilibili.app.listener.v1.PlayItem item_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return The item.
   */
  @java.lang.Override
  public bilibili.app.listener.v1.PlayItem getItem() {
    return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder() {
    return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
  }

  public static final int PLAYABLE_FIELD_NUMBER = 2;
  private int playable_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 playable = 2;</code>
   * @return The playable.
   */
  @java.lang.Override
  public int getPlayable() {
    return playable_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYERINFO_FIELD_NUMBER = 4;
  private static final class PlayerInfoDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, bilibili.app.listener.v1.PlayInfo> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, bilibili.app.listener.v1.PlayInfo>newDefaultInstance(
                bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_PlayerInfoEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                bilibili.app.listener.v1.PlayInfo.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Long, bilibili.app.listener.v1.PlayInfo> playerInfo_;
  private com.google.protobuf.MapField<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
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
   * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
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
  public java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> getPlayerInfo() {
    return getPlayerInfoMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> getPlayerInfoMap() {
    return internalGetPlayerInfo().getMap();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
   */
  @java.lang.Override
  public /* nullable */
bilibili.app.listener.v1.PlayInfo getPlayerInfoOrDefault(
      long key,
      /* nullable */
bilibili.app.listener.v1.PlayInfo defaultValue) {

    java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> map =
        internalGetPlayerInfo().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.listener.v1.PlayInfo getPlayerInfoOrThrow(
      long key) {

    java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> map =
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
    if (item_ != null) {
      output.writeMessage(1, getItem());
    }
    if (playable_ != 0) {
      output.writeInt32(2, playable_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetPlayerInfo(),
        PlayerInfoDefaultEntryHolder.defaultEntry,
        4);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItem());
    }
    if (playable_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, playable_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    for (java.util.Map.Entry<java.lang.Long, bilibili.app.listener.v1.PlayInfo> entry
         : internalGetPlayerInfo().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
      playerInfo__ = PlayerInfoDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, playerInfo__);
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
    if (!(obj instanceof bilibili.app.listener.v1.PlayURLResp)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.PlayURLResp other = (bilibili.app.listener.v1.PlayURLResp) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem()
          .equals(other.getItem())) return false;
    }
    if (getPlayable()
        != other.getPlayable()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (37 * hash) + PLAYABLE_FIELD_NUMBER;
    hash = (53 * hash) + getPlayable();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (!internalGetPlayerInfo().getMap().isEmpty()) {
      hash = (37 * hash) + PLAYERINFO_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPlayerInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayURLResp parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.PlayURLResp prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.PlayURLResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.PlayURLResp)
      bilibili.app.listener.v1.PlayURLRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
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
        case 4:
          return internalGetMutablePlayerInfo();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.PlayURLResp.class, bilibili.app.listener.v1.PlayURLResp.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.PlayURLResp.newBuilder()
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
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      playable_ = 0;
      message_ = "";
      internalGetMutablePlayerInfo().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayURLResp_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayURLResp getDefaultInstanceForType() {
      return bilibili.app.listener.v1.PlayURLResp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayURLResp build() {
      bilibili.app.listener.v1.PlayURLResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayURLResp buildPartial() {
      bilibili.app.listener.v1.PlayURLResp result = new bilibili.app.listener.v1.PlayURLResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.PlayURLResp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.item_ = itemBuilder_ == null
            ? item_
            : itemBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playable_ = playable_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.playerInfo_ = internalGetPlayerInfo();
        result.playerInfo_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.PlayURLResp) {
        return mergeFrom((bilibili.app.listener.v1.PlayURLResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.PlayURLResp other) {
      if (other == bilibili.app.listener.v1.PlayURLResp.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (other.getPlayable() != 0) {
        setPlayable(other.getPlayable());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      internalGetMutablePlayerInfo().mergeFrom(
          other.internalGetPlayerInfo());
      bitField0_ |= 0x00000008;
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
              input.readMessage(
                  getItemFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              playable_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              com.google.protobuf.MapEntry<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
              playerInfo__ = input.readMessage(
                  PlayerInfoDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutablePlayerInfo().getMutableMap().put(
                  playerInfo__.getKey(), playerInfo__.getValue());
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

    private bilibili.app.listener.v1.PlayItem item_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder> itemBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     * @return The item.
     */
    public bilibili.app.listener.v1.PlayItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder setItem(bilibili.app.listener.v1.PlayItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
      } else {
        itemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder setItem(
        bilibili.app.listener.v1.PlayItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder mergeItem(bilibili.app.listener.v1.PlayItem value) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          item_ != null &&
          item_ != bilibili.app.listener.v1.PlayItem.getDefaultInstance()) {
          getItemBuilder().mergeFrom(value);
        } else {
          item_ = value;
        }
      } else {
        itemBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder clearItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public bilibili.app.listener.v1.PlayItem.Builder getItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private int playable_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 playable = 2;</code>
     * @return The playable.
     */
    @java.lang.Override
    public int getPlayable() {
      return playable_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 playable = 2;</code>
     * @param value The playable to set.
     * @return This builder for chaining.
     */
    public Builder setPlayable(int value) {

      playable_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 playable = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      playable_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Long, bilibili.app.listener.v1.PlayInfo> playerInfo_;
    private com.google.protobuf.MapField<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
        internalGetPlayerInfo() {
      if (playerInfo_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerInfoDefaultEntryHolder.defaultEntry);
      }
      return playerInfo_;
    }
    private com.google.protobuf.MapField<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
        internalGetMutablePlayerInfo() {
      if (playerInfo_ == null) {
        playerInfo_ = com.google.protobuf.MapField.newMapField(
            PlayerInfoDefaultEntryHolder.defaultEntry);
      }
      if (!playerInfo_.isMutable()) {
        playerInfo_ = playerInfo_.copy();
      }
      bitField0_ |= 0x00000008;
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
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
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
    public java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> getPlayerInfo() {
      return getPlayerInfoMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> getPlayerInfoMap() {
      return internalGetPlayerInfo().getMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
     */
    @java.lang.Override
    public /* nullable */
bilibili.app.listener.v1.PlayInfo getPlayerInfoOrDefault(
        long key,
        /* nullable */
bilibili.app.listener.v1.PlayInfo defaultValue) {

      java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> map =
          internalGetPlayerInfo().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
     */
    @java.lang.Override
    public bilibili.app.listener.v1.PlayInfo getPlayerInfoOrThrow(
        long key) {

      java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> map =
          internalGetPlayerInfo().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearPlayerInfo() {
      bitField0_ = (bitField0_ & ~0x00000008);
      internalGetMutablePlayerInfo().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
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
    public java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo>
        getMutablePlayerInfo() {
      bitField0_ |= 0x00000008;
      return internalGetMutablePlayerInfo().getMutableMap();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
     */
    public Builder putPlayerInfo(
        long key,
        bilibili.app.listener.v1.PlayInfo value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutablePlayerInfo().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>map&lt;int64, .bilibili.app.listener.v1.PlayInfo&gt; playerInfo = 4;</code>
     */
    public Builder putAllPlayerInfo(
        java.util.Map<java.lang.Long, bilibili.app.listener.v1.PlayInfo> values) {
      internalGetMutablePlayerInfo().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.PlayURLResp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.PlayURLResp)
  private static final bilibili.app.listener.v1.PlayURLResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.PlayURLResp();
  }

  public static bilibili.app.listener.v1.PlayURLResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayURLResp>
      PARSER = new com.google.protobuf.AbstractParser<PlayURLResp>() {
    @java.lang.Override
    public PlayURLResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayURLResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayURLResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.PlayURLResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

