// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v1/playurl.proto

package bilibili.pgc.gateway.player.v1;

/**
 * <pre>
 * 直播播放页信息-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v1.LivePlayViewReply}
 */
public final class LivePlayViewReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v1.LivePlayViewReply)
    LivePlayViewReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LivePlayViewReply.newBuilder() to construct.
  private LivePlayViewReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LivePlayViewReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LivePlayViewReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_LivePlayViewReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_LivePlayViewReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v1.LivePlayViewReply.class, bilibili.pgc.gateway.player.v1.LivePlayViewReply.Builder.class);
  }

  public static final int ROOM_INFO_FIELD_NUMBER = 1;
  private bilibili.pgc.gateway.player.v1.RoomInfo roomInfo_;
  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   * @return Whether the roomInfo field is set.
   */
  @java.lang.Override
  public boolean hasRoomInfo() {
    return roomInfo_ != null;
  }
  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   * @return The roomInfo.
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.RoomInfo getRoomInfo() {
    return roomInfo_ == null ? bilibili.pgc.gateway.player.v1.RoomInfo.getDefaultInstance() : roomInfo_;
  }
  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder getRoomInfoOrBuilder() {
    return roomInfo_ == null ? bilibili.pgc.gateway.player.v1.RoomInfo.getDefaultInstance() : roomInfo_;
  }

  public static final int PLAY_INFO_FIELD_NUMBER = 2;
  private bilibili.pgc.gateway.player.v1.LivePlayInfo playInfo_;
  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   * @return Whether the playInfo field is set.
   */
  @java.lang.Override
  public boolean hasPlayInfo() {
    return playInfo_ != null;
  }
  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   * @return The playInfo.
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.LivePlayInfo getPlayInfo() {
    return playInfo_ == null ? bilibili.pgc.gateway.player.v1.LivePlayInfo.getDefaultInstance() : playInfo_;
  }
  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder getPlayInfoOrBuilder() {
    return playInfo_ == null ? bilibili.pgc.gateway.player.v1.LivePlayInfo.getDefaultInstance() : playInfo_;
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
    if (roomInfo_ != null) {
      output.writeMessage(1, getRoomInfo());
    }
    if (playInfo_ != null) {
      output.writeMessage(2, getPlayInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roomInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRoomInfo());
    }
    if (playInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayInfo());
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v1.LivePlayViewReply)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v1.LivePlayViewReply other = (bilibili.pgc.gateway.player.v1.LivePlayViewReply) obj;

    if (hasRoomInfo() != other.hasRoomInfo()) return false;
    if (hasRoomInfo()) {
      if (!getRoomInfo()
          .equals(other.getRoomInfo())) return false;
    }
    if (hasPlayInfo() != other.hasPlayInfo()) return false;
    if (hasPlayInfo()) {
      if (!getPlayInfo()
          .equals(other.getPlayInfo())) return false;
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
    if (hasRoomInfo()) {
      hash = (37 * hash) + ROOM_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getRoomInfo().hashCode();
    }
    if (hasPlayInfo()) {
      hash = (37 * hash) + PLAY_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getPlayInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v1.LivePlayViewReply prototype) {
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
   * 直播播放页信息-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v1.LivePlayViewReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v1.LivePlayViewReply)
      bilibili.pgc.gateway.player.v1.LivePlayViewReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_LivePlayViewReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_LivePlayViewReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v1.LivePlayViewReply.class, bilibili.pgc.gateway.player.v1.LivePlayViewReply.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v1.LivePlayViewReply.newBuilder()
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
      roomInfo_ = null;
      if (roomInfoBuilder_ != null) {
        roomInfoBuilder_.dispose();
        roomInfoBuilder_ = null;
      }
      playInfo_ = null;
      if (playInfoBuilder_ != null) {
        playInfoBuilder_.dispose();
        playInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v1.Playurl.internal_static_bilibili_pgc_gateway_player_v1_LivePlayViewReply_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.LivePlayViewReply getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v1.LivePlayViewReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.LivePlayViewReply build() {
      bilibili.pgc.gateway.player.v1.LivePlayViewReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v1.LivePlayViewReply buildPartial() {
      bilibili.pgc.gateway.player.v1.LivePlayViewReply result = new bilibili.pgc.gateway.player.v1.LivePlayViewReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v1.LivePlayViewReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.roomInfo_ = roomInfoBuilder_ == null
            ? roomInfo_
            : roomInfoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playInfo_ = playInfoBuilder_ == null
            ? playInfo_
            : playInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v1.LivePlayViewReply) {
        return mergeFrom((bilibili.pgc.gateway.player.v1.LivePlayViewReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v1.LivePlayViewReply other) {
      if (other == bilibili.pgc.gateway.player.v1.LivePlayViewReply.getDefaultInstance()) return this;
      if (other.hasRoomInfo()) {
        mergeRoomInfo(other.getRoomInfo());
      }
      if (other.hasPlayInfo()) {
        mergePlayInfo(other.getPlayInfo());
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
              input.readMessage(
                  getRoomInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPlayInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private bilibili.pgc.gateway.player.v1.RoomInfo roomInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v1.RoomInfo, bilibili.pgc.gateway.player.v1.RoomInfo.Builder, bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder> roomInfoBuilder_;
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     * @return Whether the roomInfo field is set.
     */
    public boolean hasRoomInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     * @return The roomInfo.
     */
    public bilibili.pgc.gateway.player.v1.RoomInfo getRoomInfo() {
      if (roomInfoBuilder_ == null) {
        return roomInfo_ == null ? bilibili.pgc.gateway.player.v1.RoomInfo.getDefaultInstance() : roomInfo_;
      } else {
        return roomInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public Builder setRoomInfo(bilibili.pgc.gateway.player.v1.RoomInfo value) {
      if (roomInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        roomInfo_ = value;
      } else {
        roomInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public Builder setRoomInfo(
        bilibili.pgc.gateway.player.v1.RoomInfo.Builder builderForValue) {
      if (roomInfoBuilder_ == null) {
        roomInfo_ = builderForValue.build();
      } else {
        roomInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public Builder mergeRoomInfo(bilibili.pgc.gateway.player.v1.RoomInfo value) {
      if (roomInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          roomInfo_ != null &&
          roomInfo_ != bilibili.pgc.gateway.player.v1.RoomInfo.getDefaultInstance()) {
          getRoomInfoBuilder().mergeFrom(value);
        } else {
          roomInfo_ = value;
        }
      } else {
        roomInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public Builder clearRoomInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      roomInfo_ = null;
      if (roomInfoBuilder_ != null) {
        roomInfoBuilder_.dispose();
        roomInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public bilibili.pgc.gateway.player.v1.RoomInfo.Builder getRoomInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRoomInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    public bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder getRoomInfoOrBuilder() {
      if (roomInfoBuilder_ != null) {
        return roomInfoBuilder_.getMessageOrBuilder();
      } else {
        return roomInfo_ == null ?
            bilibili.pgc.gateway.player.v1.RoomInfo.getDefaultInstance() : roomInfo_;
      }
    }
    /**
     * <pre>
     * 房间信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v1.RoomInfo, bilibili.pgc.gateway.player.v1.RoomInfo.Builder, bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder> 
        getRoomInfoFieldBuilder() {
      if (roomInfoBuilder_ == null) {
        roomInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.pgc.gateway.player.v1.RoomInfo, bilibili.pgc.gateway.player.v1.RoomInfo.Builder, bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder>(
                getRoomInfo(),
                getParentForChildren(),
                isClean());
        roomInfo_ = null;
      }
      return roomInfoBuilder_;
    }

    private bilibili.pgc.gateway.player.v1.LivePlayInfo playInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v1.LivePlayInfo, bilibili.pgc.gateway.player.v1.LivePlayInfo.Builder, bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder> playInfoBuilder_;
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     * @return Whether the playInfo field is set.
     */
    public boolean hasPlayInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     * @return The playInfo.
     */
    public bilibili.pgc.gateway.player.v1.LivePlayInfo getPlayInfo() {
      if (playInfoBuilder_ == null) {
        return playInfo_ == null ? bilibili.pgc.gateway.player.v1.LivePlayInfo.getDefaultInstance() : playInfo_;
      } else {
        return playInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public Builder setPlayInfo(bilibili.pgc.gateway.player.v1.LivePlayInfo value) {
      if (playInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playInfo_ = value;
      } else {
        playInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public Builder setPlayInfo(
        bilibili.pgc.gateway.player.v1.LivePlayInfo.Builder builderForValue) {
      if (playInfoBuilder_ == null) {
        playInfo_ = builderForValue.build();
      } else {
        playInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public Builder mergePlayInfo(bilibili.pgc.gateway.player.v1.LivePlayInfo value) {
      if (playInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          playInfo_ != null &&
          playInfo_ != bilibili.pgc.gateway.player.v1.LivePlayInfo.getDefaultInstance()) {
          getPlayInfoBuilder().mergeFrom(value);
        } else {
          playInfo_ = value;
        }
      } else {
        playInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public Builder clearPlayInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      playInfo_ = null;
      if (playInfoBuilder_ != null) {
        playInfoBuilder_.dispose();
        playInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public bilibili.pgc.gateway.player.v1.LivePlayInfo.Builder getPlayInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPlayInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    public bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder getPlayInfoOrBuilder() {
      if (playInfoBuilder_ != null) {
        return playInfoBuilder_.getMessageOrBuilder();
      } else {
        return playInfo_ == null ?
            bilibili.pgc.gateway.player.v1.LivePlayInfo.getDefaultInstance() : playInfo_;
      }
    }
    /**
     * <pre>
     * 播放信息
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v1.LivePlayInfo, bilibili.pgc.gateway.player.v1.LivePlayInfo.Builder, bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder> 
        getPlayInfoFieldBuilder() {
      if (playInfoBuilder_ == null) {
        playInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.pgc.gateway.player.v1.LivePlayInfo, bilibili.pgc.gateway.player.v1.LivePlayInfo.Builder, bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder>(
                getPlayInfo(),
                getParentForChildren(),
                isClean());
        playInfo_ = null;
      }
      return playInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v1.LivePlayViewReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v1.LivePlayViewReply)
  private static final bilibili.pgc.gateway.player.v1.LivePlayViewReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v1.LivePlayViewReply();
  }

  public static bilibili.pgc.gateway.player.v1.LivePlayViewReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LivePlayViewReply>
      PARSER = new com.google.protobuf.AbstractParser<LivePlayViewReply>() {
    @java.lang.Override
    public LivePlayViewReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<LivePlayViewReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LivePlayViewReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v1.LivePlayViewReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

