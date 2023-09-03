// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 更新应援团小助手消息已拉取进度-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqAckAssisMsg}
 */
public final class ReqAckAssisMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqAckAssisMsg)
    ReqAckAssisMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqAckAssisMsg.newBuilder() to construct.
  private ReqAckAssisMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqAckAssisMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqAckAssisMsg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckAssisMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckAssisMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqAckAssisMsg.class, bilibili.im.interface.v1.ReqAckAssisMsg.Builder.class);
  }

  public static final int ACK_SEQNO_FIELD_NUMBER = 1;
  private long ackSeqno_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 ack_seqno = 1;</code>
   * @return The ackSeqno.
   */
  @java.lang.Override
  public long getAckSeqno() {
    return ackSeqno_;
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
    if (ackSeqno_ != 0L) {
      output.writeUInt64(1, ackSeqno_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ackSeqno_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ackSeqno_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqAckAssisMsg)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqAckAssisMsg other = (bilibili.im.interface.v1.ReqAckAssisMsg) obj;

    if (getAckSeqno()
        != other.getAckSeqno()) return false;
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
    hash = (37 * hash) + ACK_SEQNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAckSeqno());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckAssisMsg parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqAckAssisMsg prototype) {
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
   * 更新应援团小助手消息已拉取进度-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqAckAssisMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqAckAssisMsg)
      bilibili.im.interface.v1.ReqAckAssisMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckAssisMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckAssisMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqAckAssisMsg.class, bilibili.im.interface.v1.ReqAckAssisMsg.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqAckAssisMsg.newBuilder()
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
      ackSeqno_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckAssisMsg_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckAssisMsg getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqAckAssisMsg.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckAssisMsg build() {
      bilibili.im.interface.v1.ReqAckAssisMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckAssisMsg buildPartial() {
      bilibili.im.interface.v1.ReqAckAssisMsg result = new bilibili.im.interface.v1.ReqAckAssisMsg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqAckAssisMsg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ackSeqno_ = ackSeqno_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqAckAssisMsg) {
        return mergeFrom((bilibili.im.interface.v1.ReqAckAssisMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqAckAssisMsg other) {
      if (other == bilibili.im.interface.v1.ReqAckAssisMsg.getDefaultInstance()) return this;
      if (other.getAckSeqno() != 0L) {
        setAckSeqno(other.getAckSeqno());
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
              ackSeqno_ = input.readUInt64();
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

    private long ackSeqno_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 ack_seqno = 1;</code>
     * @return The ackSeqno.
     */
    @java.lang.Override
    public long getAckSeqno() {
      return ackSeqno_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 ack_seqno = 1;</code>
     * @param value The ackSeqno to set.
     * @return This builder for chaining.
     */
    public Builder setAckSeqno(long value) {

      ackSeqno_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 ack_seqno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAckSeqno() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ackSeqno_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqAckAssisMsg)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqAckAssisMsg)
  private static final bilibili.im.interface.v1.ReqAckAssisMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqAckAssisMsg();
  }

  public static bilibili.im.interface.v1.ReqAckAssisMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqAckAssisMsg>
      PARSER = new com.google.protobuf.AbstractParser<ReqAckAssisMsg>() {
    @java.lang.Override
    public ReqAckAssisMsg parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqAckAssisMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqAckAssisMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqAckAssisMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
