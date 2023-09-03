// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.RcmdPlaylistReq}
 */
public final class RcmdPlaylistReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.RcmdPlaylistReq)
    RcmdPlaylistReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RcmdPlaylistReq.newBuilder() to construct.
  private RcmdPlaylistReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RcmdPlaylistReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RcmdPlaylistReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_RcmdPlaylistReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_RcmdPlaylistReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.RcmdPlaylistReq.class, bilibili.app.listener.v1.RcmdPlaylistReq.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private int from_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 from = 1;</code>
   * @return The from.
   */
  @java.lang.Override
  public int getFrom() {
    return from_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long id_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NEED_HISTORY_FIELD_NUMBER = 3;
  private boolean needHistory_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool need_history = 3;</code>
   * @return The needHistory.
   */
  @java.lang.Override
  public boolean getNeedHistory() {
    return needHistory_;
  }

  public static final int NEED_TOP_CARDS_FIELD_NUMBER = 4;
  private boolean needTopCards_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool need_top_cards = 4;</code>
   * @return The needTopCards.
   */
  @java.lang.Override
  public boolean getNeedTopCards() {
    return needTopCards_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 5;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
   * @return Whether the playerArgs field is set.
   */
  @java.lang.Override
  public boolean hasPlayerArgs() {
    return playerArgs_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
   * @return The playerArgs.
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
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
    if (from_ != 0) {
      output.writeInt32(1, from_);
    }
    if (id_ != 0L) {
      output.writeInt64(2, id_);
    }
    if (needHistory_ != false) {
      output.writeBool(3, needHistory_);
    }
    if (needTopCards_ != false) {
      output.writeBool(4, needTopCards_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(5, getPlayerArgs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (from_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, from_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, id_);
    }
    if (needHistory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, needHistory_);
    }
    if (needTopCards_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, needTopCards_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPlayerArgs());
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
    if (!(obj instanceof bilibili.app.listener.v1.RcmdPlaylistReq)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.RcmdPlaylistReq other = (bilibili.app.listener.v1.RcmdPlaylistReq) obj;

    if (getFrom()
        != other.getFrom()) return false;
    if (getId()
        != other.getId()) return false;
    if (getNeedHistory()
        != other.getNeedHistory()) return false;
    if (getNeedTopCards()
        != other.getNeedTopCards()) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NEED_HISTORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedHistory());
    hash = (37 * hash) + NEED_TOP_CARDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedTopCards());
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.RcmdPlaylistReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.RcmdPlaylistReq prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.RcmdPlaylistReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.RcmdPlaylistReq)
      bilibili.app.listener.v1.RcmdPlaylistReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_RcmdPlaylistReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_RcmdPlaylistReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.RcmdPlaylistReq.class, bilibili.app.listener.v1.RcmdPlaylistReq.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.RcmdPlaylistReq.newBuilder()
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
      from_ = 0;
      id_ = 0L;
      needHistory_ = false;
      needTopCards_ = false;
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_RcmdPlaylistReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.RcmdPlaylistReq getDefaultInstanceForType() {
      return bilibili.app.listener.v1.RcmdPlaylistReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.RcmdPlaylistReq build() {
      bilibili.app.listener.v1.RcmdPlaylistReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.RcmdPlaylistReq buildPartial() {
      bilibili.app.listener.v1.RcmdPlaylistReq result = new bilibili.app.listener.v1.RcmdPlaylistReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.RcmdPlaylistReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.needHistory_ = needHistory_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.needTopCards_ = needTopCards_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.RcmdPlaylistReq) {
        return mergeFrom((bilibili.app.listener.v1.RcmdPlaylistReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.RcmdPlaylistReq other) {
      if (other == bilibili.app.listener.v1.RcmdPlaylistReq.getDefaultInstance()) return this;
      if (other.getFrom() != 0) {
        setFrom(other.getFrom());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getNeedHistory() != false) {
        setNeedHistory(other.getNeedHistory());
      }
      if (other.getNeedTopCards() != false) {
        setNeedTopCards(other.getNeedTopCards());
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
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
              from_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              needHistory_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              needTopCards_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int from_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 from = 1;</code>
     * @return The from.
     */
    @java.lang.Override
    public int getFrom() {
      return from_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 from = 1;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(int value) {

      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 from = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      from_ = 0;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = 0L;
      onChanged();
      return this;
    }

    private boolean needHistory_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_history = 3;</code>
     * @return The needHistory.
     */
    @java.lang.Override
    public boolean getNeedHistory() {
      return needHistory_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_history = 3;</code>
     * @param value The needHistory to set.
     * @return This builder for chaining.
     */
    public Builder setNeedHistory(boolean value) {

      needHistory_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_history = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedHistory() {
      bitField0_ = (bitField0_ & ~0x00000004);
      needHistory_ = false;
      onChanged();
      return this;
    }

    private boolean needTopCards_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_top_cards = 4;</code>
     * @return The needTopCards.
     */
    @java.lang.Override
    public boolean getNeedTopCards() {
      return needTopCards_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_top_cards = 4;</code>
     * @param value The needTopCards to set.
     * @return This builder for chaining.
     */
    public Builder setNeedTopCards(boolean value) {

      needTopCards_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool need_top_cards = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedTopCards() {
      bitField0_ = (bitField0_ & ~0x00000008);
      needTopCards_ = false;
      onChanged();
      return this;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     * @return The playerArgs.
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
      if (playerArgsBuilder_ == null) {
        return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      } else {
        return playerArgsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder setPlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerArgs_ = value;
      } else {
        playerArgsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000010);
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
      if (playerArgsBuilder_ != null) {
        return playerArgsBuilder_.getMessageOrBuilder();
      } else {
        return playerArgs_ == null ?
            bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> 
        getPlayerArgsFieldBuilder() {
      if (playerArgsBuilder_ == null) {
        playerArgsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder>(
                getPlayerArgs(),
                getParentForChildren(),
                isClean());
        playerArgs_ = null;
      }
      return playerArgsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.RcmdPlaylistReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.RcmdPlaylistReq)
  private static final bilibili.app.listener.v1.RcmdPlaylistReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.RcmdPlaylistReq();
  }

  public static bilibili.app.listener.v1.RcmdPlaylistReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RcmdPlaylistReq>
      PARSER = new com.google.protobuf.AbstractParser<RcmdPlaylistReq>() {
    @java.lang.Override
    public RcmdPlaylistReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<RcmdPlaylistReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RcmdPlaylistReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.RcmdPlaylistReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

