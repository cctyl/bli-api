// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/api/player/v1/player.proto

package bilibili.api.player.v1;

/**
 * <pre>
 * 客户端心跳上报-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.api.player.v1.HeartbeatReply}
 */
public final class HeartbeatReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.api.player.v1.HeartbeatReply)
    HeartbeatReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeartbeatReply.newBuilder() to construct.
  private HeartbeatReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartbeatReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeartbeatReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.api.player.v1.Player.internal_static_bilibili_api_player_v1_HeartbeatReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.api.player.v1.Player.internal_static_bilibili_api_player_v1_HeartbeatReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.api.player.v1.HeartbeatReply.class, bilibili.api.player.v1.HeartbeatReply.Builder.class);
  }

  public static final int TS_FIELD_NUMBER = 1;
  private long ts_ = 0L;
  /**
   * <pre>
   * 时间戳
   * </pre>
   *
   * <code>int64 ts = 1;</code>
   * @return The ts.
   */
  @java.lang.Override
  public long getTs() {
    return ts_;
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
    if (ts_ != 0L) {
      output.writeInt64(1, ts_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ts_);
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
    if (!(obj instanceof bilibili.api.player.v1.HeartbeatReply)) {
      return super.equals(obj);
    }
    bilibili.api.player.v1.HeartbeatReply other = (bilibili.api.player.v1.HeartbeatReply) obj;

    if (getTs()
        != other.getTs()) return false;
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
    hash = (37 * hash) + TS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTs());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.api.player.v1.HeartbeatReply parseFrom(
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
  public static Builder newBuilder(bilibili.api.player.v1.HeartbeatReply prototype) {
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
   * 客户端心跳上报-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.api.player.v1.HeartbeatReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.api.player.v1.HeartbeatReply)
      bilibili.api.player.v1.HeartbeatReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.api.player.v1.Player.internal_static_bilibili_api_player_v1_HeartbeatReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.api.player.v1.Player.internal_static_bilibili_api_player_v1_HeartbeatReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.api.player.v1.HeartbeatReply.class, bilibili.api.player.v1.HeartbeatReply.Builder.class);
    }

    // Construct using bilibili.api.player.v1.HeartbeatReply.newBuilder()
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
      ts_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.api.player.v1.Player.internal_static_bilibili_api_player_v1_HeartbeatReply_descriptor;
    }

    @java.lang.Override
    public bilibili.api.player.v1.HeartbeatReply getDefaultInstanceForType() {
      return bilibili.api.player.v1.HeartbeatReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.api.player.v1.HeartbeatReply build() {
      bilibili.api.player.v1.HeartbeatReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.api.player.v1.HeartbeatReply buildPartial() {
      bilibili.api.player.v1.HeartbeatReply result = new bilibili.api.player.v1.HeartbeatReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.api.player.v1.HeartbeatReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ts_ = ts_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.api.player.v1.HeartbeatReply) {
        return mergeFrom((bilibili.api.player.v1.HeartbeatReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.api.player.v1.HeartbeatReply other) {
      if (other == bilibili.api.player.v1.HeartbeatReply.getDefaultInstance()) return this;
      if (other.getTs() != 0L) {
        setTs(other.getTs());
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
              ts_ = input.readInt64();
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

    private long ts_ ;
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 ts = 1;</code>
     * @return The ts.
     */
    @java.lang.Override
    public long getTs() {
      return ts_;
    }
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 ts = 1;</code>
     * @param value The ts to set.
     * @return This builder for chaining.
     */
    public Builder setTs(long value) {

      ts_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 ts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ts_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.api.player.v1.HeartbeatReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.api.player.v1.HeartbeatReply)
  private static final bilibili.api.player.v1.HeartbeatReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.api.player.v1.HeartbeatReply();
  }

  public static bilibili.api.player.v1.HeartbeatReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartbeatReply>
      PARSER = new com.google.protobuf.AbstractParser<HeartbeatReply>() {
    @java.lang.Override
    public HeartbeatReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<HeartbeatReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartbeatReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.api.player.v1.HeartbeatReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

