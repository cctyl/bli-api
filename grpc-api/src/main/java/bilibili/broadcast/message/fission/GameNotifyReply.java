// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/fission/notify.proto

package bilibili.broadcast.message.fission;

/**
 * Protobuf type {@code bilibili.broadcast.message.fission.GameNotifyReply}
 */
public final class GameNotifyReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.broadcast.message.fission.GameNotifyReply)
    GameNotifyReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameNotifyReply.newBuilder() to construct.
  private GameNotifyReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameNotifyReply() {
    data_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameNotifyReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.broadcast.message.fission.Notify.internal_static_bilibili_broadcast_message_fission_GameNotifyReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.broadcast.message.fission.Notify.internal_static_bilibili_broadcast_message_fission_GameNotifyReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.broadcast.message.fission.GameNotifyReply.class, bilibili.broadcast.message.fission.GameNotifyReply.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * 类型字段
   * </pre>
   *
   * <code>uint32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object data_ = "";
  /**
   * <pre>
   * 数据字段
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 数据字段
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The bytes for data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != 0) {
      output.writeUInt32(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
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
    if (!(obj instanceof bilibili.broadcast.message.fission.GameNotifyReply)) {
      return super.equals(obj);
    }
    bilibili.broadcast.message.fission.GameNotifyReply other = (bilibili.broadcast.message.fission.GameNotifyReply) obj;

    if (getType()
        != other.getType()) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (53 * hash) + getType();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.message.fission.GameNotifyReply parseFrom(
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
  public static Builder newBuilder(bilibili.broadcast.message.fission.GameNotifyReply prototype) {
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
   * Protobuf type {@code bilibili.broadcast.message.fission.GameNotifyReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.broadcast.message.fission.GameNotifyReply)
      bilibili.broadcast.message.fission.GameNotifyReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.message.fission.Notify.internal_static_bilibili_broadcast_message_fission_GameNotifyReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.message.fission.Notify.internal_static_bilibili_broadcast_message_fission_GameNotifyReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.message.fission.GameNotifyReply.class, bilibili.broadcast.message.fission.GameNotifyReply.Builder.class);
    }

    // Construct using bilibili.broadcast.message.fission.GameNotifyReply.newBuilder()
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
      data_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.broadcast.message.fission.Notify.internal_static_bilibili_broadcast_message_fission_GameNotifyReply_descriptor;
    }

    @java.lang.Override
    public bilibili.broadcast.message.fission.GameNotifyReply getDefaultInstanceForType() {
      return bilibili.broadcast.message.fission.GameNotifyReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.broadcast.message.fission.GameNotifyReply build() {
      bilibili.broadcast.message.fission.GameNotifyReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.broadcast.message.fission.GameNotifyReply buildPartial() {
      bilibili.broadcast.message.fission.GameNotifyReply result = new bilibili.broadcast.message.fission.GameNotifyReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.broadcast.message.fission.GameNotifyReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.data_ = data_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.broadcast.message.fission.GameNotifyReply) {
        return mergeFrom((bilibili.broadcast.message.fission.GameNotifyReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.broadcast.message.fission.GameNotifyReply other) {
      if (other == bilibili.broadcast.message.fission.GameNotifyReply.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              type_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              data_ = input.readStringRequireUtf8();
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

    private int type_ ;
    /**
     * <pre>
     * 类型字段
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 类型字段
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型字段
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object data_ = "";
    /**
     * <pre>
     * 数据字段
     * </pre>
     *
     * <code>string data = 2;</code>
     * @return The data.
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 数据字段
     * </pre>
     *
     * <code>string data = 2;</code>
     * @return The bytes for data.
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 数据字段
     * </pre>
     *
     * <code>string data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 数据字段
     * </pre>
     *
     * <code>string data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      data_ = getDefaultInstance().getData();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 数据字段
     * </pre>
     *
     * <code>string data = 2;</code>
     * @param value The bytes for data to set.
     * @return This builder for chaining.
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      data_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.broadcast.message.fission.GameNotifyReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.broadcast.message.fission.GameNotifyReply)
  private static final bilibili.broadcast.message.fission.GameNotifyReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.broadcast.message.fission.GameNotifyReply();
  }

  public static bilibili.broadcast.message.fission.GameNotifyReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameNotifyReply>
      PARSER = new com.google.protobuf.AbstractParser<GameNotifyReply>() {
    @java.lang.Override
    public GameNotifyReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameNotifyReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameNotifyReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.broadcast.message.fission.GameNotifyReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
