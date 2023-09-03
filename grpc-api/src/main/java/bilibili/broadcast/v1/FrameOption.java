// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/broadcast.proto

package bilibili.broadcast.v1;

/**
 * <pre>
 * message_id: 
 *   client: 本次连接唯一的消息id，可用于回执
 *   server: 唯一消息id，可用于上报或者回执
 * sequence:
 *   client: 客户端应该每次请求时frame seq++，会返回对应的对称req/resp
 *   server: 服务端下行消息，只会返回默认值：0
 * </pre>
 *
 * Protobuf type {@code bilibili.broadcast.v1.FrameOption}
 */
public final class FrameOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.broadcast.v1.FrameOption)
    FrameOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrameOption.newBuilder() to construct.
  private FrameOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrameOption() {
    ackOrigin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrameOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.broadcast.v1.BroadcastOuterClass.internal_static_bilibili_broadcast_v1_FrameOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.broadcast.v1.BroadcastOuterClass.internal_static_bilibili_broadcast_v1_FrameOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.broadcast.v1.FrameOption.class, bilibili.broadcast.v1.FrameOption.Builder.class);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 1;
  private long messageId_ = 0L;
  /**
   * <pre>
   * 消息id
   * </pre>
   *
   * <code>int64 message_id = 1;</code>
   * @return The messageId.
   */
  @java.lang.Override
  public long getMessageId() {
    return messageId_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private long sequence_ = 0L;
  /**
   * <pre>
   * frame序号
   * </pre>
   *
   * <code>int64 sequence = 2;</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
  }

  public static final int IS_ACK_FIELD_NUMBER = 3;
  private boolean isAck_ = false;
  /**
   * <pre>
   * 是否进行消息回执(发出MessageAckReq)
   * downstream 上只有服务端设置为true，客户端响应
   * upstream   上只有客户端设置为true，服务端响应
   * 响应帧禁止设置is_ack，协议上禁止循环
   * 通常只有业务帧才可能设置is_ack, 因为协议栈(例如心跳、鉴权)另有响应约定
   * </pre>
   *
   * <code>bool is_ack = 3;</code>
   * @return The isAck.
   */
  @java.lang.Override
  public boolean getIsAck() {
    return isAck_;
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private bilibili.rpc.Status status_;
  /**
   * <pre>
   * 业务状态码
   * </pre>
   *
   * <code>.bilibili.rpc.Status status = 4;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * 业务状态码
   * </pre>
   *
   * <code>.bilibili.rpc.Status status = 4;</code>
   * @return The status.
   */
  @java.lang.Override
  public bilibili.rpc.Status getStatus() {
    return status_ == null ? bilibili.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * 业务状态码
   * </pre>
   *
   * <code>.bilibili.rpc.Status status = 4;</code>
   */
  @java.lang.Override
  public bilibili.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? bilibili.rpc.Status.getDefaultInstance() : status_;
  }

  public static final int ACK_ORIGIN_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ackOrigin_ = "";
  /**
   * <pre>
   * 业务ack来源, 仅downstream时候由服务端填写.
   * </pre>
   *
   * <code>string ack_origin = 5;</code>
   * @return The ackOrigin.
   */
  @java.lang.Override
  public java.lang.String getAckOrigin() {
    java.lang.Object ref = ackOrigin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ackOrigin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 业务ack来源, 仅downstream时候由服务端填写.
   * </pre>
   *
   * <code>string ack_origin = 5;</code>
   * @return The bytes for ackOrigin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAckOriginBytes() {
    java.lang.Object ref = ackOrigin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ackOrigin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (messageId_ != 0L) {
      output.writeInt64(1, messageId_);
    }
    if (sequence_ != 0L) {
      output.writeInt64(2, sequence_);
    }
    if (isAck_ != false) {
      output.writeBool(3, isAck_);
    }
    if (status_ != null) {
      output.writeMessage(4, getStatus());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ackOrigin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ackOrigin_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(6, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, messageId_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sequence_);
    }
    if (isAck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isAck_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStatus());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ackOrigin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ackOrigin_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, timestamp_);
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
    if (!(obj instanceof bilibili.broadcast.v1.FrameOption)) {
      return super.equals(obj);
    }
    bilibili.broadcast.v1.FrameOption other = (bilibili.broadcast.v1.FrameOption) obj;

    if (getMessageId()
        != other.getMessageId()) return false;
    if (getSequence()
        != other.getSequence()) return false;
    if (getIsAck()
        != other.getIsAck()) return false;
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getAckOrigin()
        .equals(other.getAckOrigin())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMessageId());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (37 * hash) + IS_ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAck());
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (37 * hash) + ACK_ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getAckOrigin().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.broadcast.v1.FrameOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.FrameOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.FrameOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.FrameOption parseFrom(
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
  public static Builder newBuilder(bilibili.broadcast.v1.FrameOption prototype) {
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
   * message_id: 
   *   client: 本次连接唯一的消息id，可用于回执
   *   server: 唯一消息id，可用于上报或者回执
   * sequence:
   *   client: 客户端应该每次请求时frame seq++，会返回对应的对称req/resp
   *   server: 服务端下行消息，只会返回默认值：0
   * </pre>
   *
   * Protobuf type {@code bilibili.broadcast.v1.FrameOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.broadcast.v1.FrameOption)
      bilibili.broadcast.v1.FrameOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.v1.BroadcastOuterClass.internal_static_bilibili_broadcast_v1_FrameOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.v1.BroadcastOuterClass.internal_static_bilibili_broadcast_v1_FrameOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.v1.FrameOption.class, bilibili.broadcast.v1.FrameOption.Builder.class);
    }

    // Construct using bilibili.broadcast.v1.FrameOption.newBuilder()
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
      messageId_ = 0L;
      sequence_ = 0L;
      isAck_ = false;
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      ackOrigin_ = "";
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.broadcast.v1.BroadcastOuterClass.internal_static_bilibili_broadcast_v1_FrameOption_descriptor;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.FrameOption getDefaultInstanceForType() {
      return bilibili.broadcast.v1.FrameOption.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.broadcast.v1.FrameOption build() {
      bilibili.broadcast.v1.FrameOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.FrameOption buildPartial() {
      bilibili.broadcast.v1.FrameOption result = new bilibili.broadcast.v1.FrameOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.broadcast.v1.FrameOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.messageId_ = messageId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sequence_ = sequence_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isAck_ = isAck_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ackOrigin_ = ackOrigin_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.timestamp_ = timestamp_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.broadcast.v1.FrameOption) {
        return mergeFrom((bilibili.broadcast.v1.FrameOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.broadcast.v1.FrameOption other) {
      if (other == bilibili.broadcast.v1.FrameOption.getDefaultInstance()) return this;
      if (other.getMessageId() != 0L) {
        setMessageId(other.getMessageId());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getIsAck() != false) {
        setIsAck(other.getIsAck());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (!other.getAckOrigin().isEmpty()) {
        ackOrigin_ = other.ackOrigin_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              messageId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sequence_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isAck_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              ackOrigin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              timestamp_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long messageId_ ;
    /**
     * <pre>
     * 消息id
     * </pre>
     *
     * <code>int64 message_id = 1;</code>
     * @return The messageId.
     */
    @java.lang.Override
    public long getMessageId() {
      return messageId_;
    }
    /**
     * <pre>
     * 消息id
     * </pre>
     *
     * <code>int64 message_id = 1;</code>
     * @param value The messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageId(long value) {

      messageId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息id
     * </pre>
     *
     * <code>int64 message_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      messageId_ = 0L;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
     * frame序号
     * </pre>
     *
     * <code>int64 sequence = 2;</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * frame序号
     * </pre>
     *
     * <code>int64 sequence = 2;</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * frame序号
     * </pre>
     *
     * <code>int64 sequence = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private boolean isAck_ ;
    /**
     * <pre>
     * 是否进行消息回执(发出MessageAckReq)
     * downstream 上只有服务端设置为true，客户端响应
     * upstream   上只有客户端设置为true，服务端响应
     * 响应帧禁止设置is_ack，协议上禁止循环
     * 通常只有业务帧才可能设置is_ack, 因为协议栈(例如心跳、鉴权)另有响应约定
     * </pre>
     *
     * <code>bool is_ack = 3;</code>
     * @return The isAck.
     */
    @java.lang.Override
    public boolean getIsAck() {
      return isAck_;
    }
    /**
     * <pre>
     * 是否进行消息回执(发出MessageAckReq)
     * downstream 上只有服务端设置为true，客户端响应
     * upstream   上只有客户端设置为true，服务端响应
     * 响应帧禁止设置is_ack，协议上禁止循环
     * 通常只有业务帧才可能设置is_ack, 因为协议栈(例如心跳、鉴权)另有响应约定
     * </pre>
     *
     * <code>bool is_ack = 3;</code>
     * @param value The isAck to set.
     * @return This builder for chaining.
     */
    public Builder setIsAck(boolean value) {

      isAck_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否进行消息回执(发出MessageAckReq)
     * downstream 上只有服务端设置为true，客户端响应
     * upstream   上只有客户端设置为true，服务端响应
     * 响应帧禁止设置is_ack，协议上禁止循环
     * 通常只有业务帧才可能设置is_ack, 因为协议栈(例如心跳、鉴权)另有响应约定
     * </pre>
     *
     * <code>bool is_ack = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAck() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isAck_ = false;
      onChanged();
      return this;
    }

    private bilibili.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.rpc.Status, bilibili.rpc.Status.Builder, bilibili.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     * @return The status.
     */
    public bilibili.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? bilibili.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public Builder setStatus(bilibili.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public Builder setStatus(
        bilibili.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public Builder mergeStatus(bilibili.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          status_ != null &&
          status_ != bilibili.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public bilibili.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    public bilibili.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            bilibili.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * 业务状态码
     * </pre>
     *
     * <code>.bilibili.rpc.Status status = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.rpc.Status, bilibili.rpc.Status.Builder, bilibili.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.rpc.Status, bilibili.rpc.Status.Builder, bilibili.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.lang.Object ackOrigin_ = "";
    /**
     * <pre>
     * 业务ack来源, 仅downstream时候由服务端填写.
     * </pre>
     *
     * <code>string ack_origin = 5;</code>
     * @return The ackOrigin.
     */
    public java.lang.String getAckOrigin() {
      java.lang.Object ref = ackOrigin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ackOrigin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 业务ack来源, 仅downstream时候由服务端填写.
     * </pre>
     *
     * <code>string ack_origin = 5;</code>
     * @return The bytes for ackOrigin.
     */
    public com.google.protobuf.ByteString
        getAckOriginBytes() {
      java.lang.Object ref = ackOrigin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ackOrigin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 业务ack来源, 仅downstream时候由服务端填写.
     * </pre>
     *
     * <code>string ack_origin = 5;</code>
     * @param value The ackOrigin to set.
     * @return This builder for chaining.
     */
    public Builder setAckOrigin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ackOrigin_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务ack来源, 仅downstream时候由服务端填写.
     * </pre>
     *
     * <code>string ack_origin = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAckOrigin() {
      ackOrigin_ = getDefaultInstance().getAckOrigin();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务ack来源, 仅downstream时候由服务端填写.
     * </pre>
     *
     * <code>string ack_origin = 5;</code>
     * @param value The bytes for ackOrigin to set.
     * @return This builder for chaining.
     */
    public Builder setAckOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ackOrigin_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000020);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.broadcast.v1.FrameOption)
  }

  // @@protoc_insertion_point(class_scope:bilibili.broadcast.v1.FrameOption)
  private static final bilibili.broadcast.v1.FrameOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.broadcast.v1.FrameOption();
  }

  public static bilibili.broadcast.v1.FrameOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrameOption>
      PARSER = new com.google.protobuf.AbstractParser<FrameOption>() {
    @java.lang.Override
    public FrameOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<FrameOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrameOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.broadcast.v1.FrameOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
