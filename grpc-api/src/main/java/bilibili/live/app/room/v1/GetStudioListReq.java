// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/live/app/room/v1/room.proto

package bilibili.live.app.room.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.live.app.room.v1.GetStudioListReq}
 */
public final class GetStudioListReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.live.app.room.v1.GetStudioListReq)
    GetStudioListReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetStudioListReq.newBuilder() to construct.
  private GetStudioListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetStudioListReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetStudioListReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.live.app.room.v1.Room.internal_static_bilibili_live_app_room_v1_GetStudioListReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.live.app.room.v1.Room.internal_static_bilibili_live_app_room_v1_GetStudioListReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.live.app.room.v1.GetStudioListReq.class, bilibili.live.app.room.v1.GetStudioListReq.Builder.class);
  }

  public static final int ROOM_ID_FIELD_NUMBER = 1;
  private long roomId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_id = 1;</code>
   * @return The roomId.
   */
  @java.lang.Override
  public long getRoomId() {
    return roomId_;
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
    if (roomId_ != 0L) {
      output.writeInt64(1, roomId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roomId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, roomId_);
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
    if (!(obj instanceof bilibili.live.app.room.v1.GetStudioListReq)) {
      return super.equals(obj);
    }
    bilibili.live.app.room.v1.GetStudioListReq other = (bilibili.live.app.room.v1.GetStudioListReq) obj;

    if (getRoomId()
        != other.getRoomId()) return false;
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
    hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoomId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.live.app.room.v1.GetStudioListReq parseFrom(
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
  public static Builder newBuilder(bilibili.live.app.room.v1.GetStudioListReq prototype) {
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
   * Protobuf type {@code bilibili.live.app.room.v1.GetStudioListReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.live.app.room.v1.GetStudioListReq)
      bilibili.live.app.room.v1.GetStudioListReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.live.app.room.v1.Room.internal_static_bilibili_live_app_room_v1_GetStudioListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.live.app.room.v1.Room.internal_static_bilibili_live_app_room_v1_GetStudioListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.live.app.room.v1.GetStudioListReq.class, bilibili.live.app.room.v1.GetStudioListReq.Builder.class);
    }

    // Construct using bilibili.live.app.room.v1.GetStudioListReq.newBuilder()
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
      roomId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.live.app.room.v1.Room.internal_static_bilibili_live_app_room_v1_GetStudioListReq_descriptor;
    }

    @java.lang.Override
    public bilibili.live.app.room.v1.GetStudioListReq getDefaultInstanceForType() {
      return bilibili.live.app.room.v1.GetStudioListReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.live.app.room.v1.GetStudioListReq build() {
      bilibili.live.app.room.v1.GetStudioListReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.live.app.room.v1.GetStudioListReq buildPartial() {
      bilibili.live.app.room.v1.GetStudioListReq result = new bilibili.live.app.room.v1.GetStudioListReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.live.app.room.v1.GetStudioListReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.roomId_ = roomId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.live.app.room.v1.GetStudioListReq) {
        return mergeFrom((bilibili.live.app.room.v1.GetStudioListReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.live.app.room.v1.GetStudioListReq other) {
      if (other == bilibili.live.app.room.v1.GetStudioListReq.getDefaultInstance()) return this;
      if (other.getRoomId() != 0L) {
        setRoomId(other.getRoomId());
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
              roomId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long roomId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 1;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 1;</code>
     * @param value The roomId to set.
     * @return This builder for chaining.
     */
    public Builder setRoomId(long value) {

      roomId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 room_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoomId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      roomId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.live.app.room.v1.GetStudioListReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.live.app.room.v1.GetStudioListReq)
  private static final bilibili.live.app.room.v1.GetStudioListReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.live.app.room.v1.GetStudioListReq();
  }

  public static bilibili.live.app.room.v1.GetStudioListReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStudioListReq>
      PARSER = new com.google.protobuf.AbstractParser<GetStudioListReq>() {
    @java.lang.Override
    public GetStudioListReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetStudioListReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStudioListReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.live.app.room.v1.GetStudioListReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

