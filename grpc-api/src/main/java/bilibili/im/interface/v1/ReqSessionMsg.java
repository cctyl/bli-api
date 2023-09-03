// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 同步版本拉取消息-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqSessionMsg}
 */
public final class ReqSessionMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqSessionMsg)
    ReqSessionMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqSessionMsg.newBuilder() to construct.
  private ReqSessionMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqSessionMsg() {
    devId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqSessionMsg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqSessionMsg.class, bilibili.im.interface.v1.ReqSessionMsg.Builder.class);
  }

  public static final int TALKER_ID_FIELD_NUMBER = 1;
  private long talkerId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 talker_id = 1;</code>
   * @return The talkerId.
   */
  @java.lang.Override
  public long getTalkerId() {
    return talkerId_;
  }

  public static final int SESSION_TYPE_FIELD_NUMBER = 2;
  private int sessionType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 session_type = 2;</code>
   * @return The sessionType.
   */
  @java.lang.Override
  public int getSessionType() {
    return sessionType_;
  }

  public static final int END_SEQNO_FIELD_NUMBER = 3;
  private long endSeqno_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 end_seqno = 3;</code>
   * @return The endSeqno.
   */
  @java.lang.Override
  public long getEndSeqno() {
    return endSeqno_;
  }

  public static final int BEGIN_SEQNO_FIELD_NUMBER = 4;
  private long beginSeqno_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 begin_seqno = 4;</code>
   * @return The beginSeqno.
   */
  @java.lang.Override
  public long getBeginSeqno() {
    return beginSeqno_;
  }

  public static final int SIZE_FIELD_NUMBER = 5;
  private int size_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 size = 5;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int ORDER_FIELD_NUMBER = 6;
  private int order_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 order = 6;</code>
   * @return The order.
   */
  @java.lang.Override
  public int getOrder() {
    return order_;
  }

  public static final int DEV_ID_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object devId_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string dev_id = 7;</code>
   * @return The devId.
   */
  @java.lang.Override
  public java.lang.String getDevId() {
    java.lang.Object ref = devId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      devId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string dev_id = 7;</code>
   * @return The bytes for devId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDevIdBytes() {
    java.lang.Object ref = devId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      devId_ = b;
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
    if (talkerId_ != 0L) {
      output.writeUInt64(1, talkerId_);
    }
    if (sessionType_ != 0) {
      output.writeInt32(2, sessionType_);
    }
    if (endSeqno_ != 0L) {
      output.writeUInt64(3, endSeqno_);
    }
    if (beginSeqno_ != 0L) {
      output.writeUInt64(4, beginSeqno_);
    }
    if (size_ != 0) {
      output.writeInt32(5, size_);
    }
    if (order_ != 0) {
      output.writeInt32(6, order_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, devId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (talkerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, talkerId_);
    }
    if (sessionType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sessionType_);
    }
    if (endSeqno_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, endSeqno_);
    }
    if (beginSeqno_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, beginSeqno_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, size_);
    }
    if (order_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, order_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, devId_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqSessionMsg)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqSessionMsg other = (bilibili.im.interface.v1.ReqSessionMsg) obj;

    if (getTalkerId()
        != other.getTalkerId()) return false;
    if (getSessionType()
        != other.getSessionType()) return false;
    if (getEndSeqno()
        != other.getEndSeqno()) return false;
    if (getBeginSeqno()
        != other.getBeginSeqno()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getOrder()
        != other.getOrder()) return false;
    if (!getDevId()
        .equals(other.getDevId())) return false;
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
    hash = (37 * hash) + TALKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTalkerId());
    hash = (37 * hash) + SESSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionType();
    hash = (37 * hash) + END_SEQNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndSeqno());
    hash = (37 * hash) + BEGIN_SEQNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBeginSeqno());
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder();
    hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDevId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSessionMsg parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqSessionMsg prototype) {
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
   * 同步版本拉取消息-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqSessionMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqSessionMsg)
      bilibili.im.interface.v1.ReqSessionMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqSessionMsg.class, bilibili.im.interface.v1.ReqSessionMsg.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqSessionMsg.newBuilder()
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
      talkerId_ = 0L;
      sessionType_ = 0;
      endSeqno_ = 0L;
      beginSeqno_ = 0L;
      size_ = 0;
      order_ = 0;
      devId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSessionMsg_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionMsg getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqSessionMsg.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionMsg build() {
      bilibili.im.interface.v1.ReqSessionMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSessionMsg buildPartial() {
      bilibili.im.interface.v1.ReqSessionMsg result = new bilibili.im.interface.v1.ReqSessionMsg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqSessionMsg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.talkerId_ = talkerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionType_ = sessionType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endSeqno_ = endSeqno_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.beginSeqno_ = beginSeqno_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.size_ = size_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.order_ = order_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.devId_ = devId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqSessionMsg) {
        return mergeFrom((bilibili.im.interface.v1.ReqSessionMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqSessionMsg other) {
      if (other == bilibili.im.interface.v1.ReqSessionMsg.getDefaultInstance()) return this;
      if (other.getTalkerId() != 0L) {
        setTalkerId(other.getTalkerId());
      }
      if (other.getSessionType() != 0) {
        setSessionType(other.getSessionType());
      }
      if (other.getEndSeqno() != 0L) {
        setEndSeqno(other.getEndSeqno());
      }
      if (other.getBeginSeqno() != 0L) {
        setBeginSeqno(other.getBeginSeqno());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getOrder() != 0) {
        setOrder(other.getOrder());
      }
      if (!other.getDevId().isEmpty()) {
        devId_ = other.devId_;
        bitField0_ |= 0x00000040;
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
              talkerId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sessionType_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              endSeqno_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              beginSeqno_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              size_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              order_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              devId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private long talkerId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return The talkerId.
     */
    @java.lang.Override
    public long getTalkerId() {
      return talkerId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @param value The talkerId to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerId(long value) {

      talkerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTalkerId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      talkerId_ = 0L;
      onChanged();
      return this;
    }

    private int sessionType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 session_type = 2;</code>
     * @return The sessionType.
     */
    @java.lang.Override
    public int getSessionType() {
      return sessionType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 session_type = 2;</code>
     * @param value The sessionType to set.
     * @return This builder for chaining.
     */
    public Builder setSessionType(int value) {

      sessionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 session_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionType_ = 0;
      onChanged();
      return this;
    }

    private long endSeqno_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_seqno = 3;</code>
     * @return The endSeqno.
     */
    @java.lang.Override
    public long getEndSeqno() {
      return endSeqno_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_seqno = 3;</code>
     * @param value The endSeqno to set.
     * @return This builder for chaining.
     */
    public Builder setEndSeqno(long value) {

      endSeqno_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_seqno = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndSeqno() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endSeqno_ = 0L;
      onChanged();
      return this;
    }

    private long beginSeqno_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_seqno = 4;</code>
     * @return The beginSeqno.
     */
    @java.lang.Override
    public long getBeginSeqno() {
      return beginSeqno_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_seqno = 4;</code>
     * @param value The beginSeqno to set.
     * @return This builder for chaining.
     */
    public Builder setBeginSeqno(long value) {

      beginSeqno_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_seqno = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginSeqno() {
      bitField0_ = (bitField0_ & ~0x00000008);
      beginSeqno_ = 0L;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 size = 5;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 size = 5;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {

      size_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 size = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000010);
      size_ = 0;
      onChanged();
      return this;
    }

    private int order_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 6;</code>
     * @return The order.
     */
    @java.lang.Override
    public int getOrder() {
      return order_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 6;</code>
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(int value) {

      order_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrder() {
      bitField0_ = (bitField0_ & ~0x00000020);
      order_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object devId_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 7;</code>
     * @return The devId.
     */
    public java.lang.String getDevId() {
      java.lang.Object ref = devId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        devId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 7;</code>
     * @return The bytes for devId.
     */
    public com.google.protobuf.ByteString
        getDevIdBytes() {
      java.lang.Object ref = devId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        devId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 7;</code>
     * @param value The devId to set.
     * @return This builder for chaining.
     */
    public Builder setDevId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      devId_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevId() {
      devId_ = getDefaultInstance().getDevId();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 7;</code>
     * @param value The bytes for devId to set.
     * @return This builder for chaining.
     */
    public Builder setDevIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      devId_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqSessionMsg)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqSessionMsg)
  private static final bilibili.im.interface.v1.ReqSessionMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqSessionMsg();
  }

  public static bilibili.im.interface.v1.ReqSessionMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqSessionMsg>
      PARSER = new com.google.protobuf.AbstractParser<ReqSessionMsg>() {
    @java.lang.Override
    public ReqSessionMsg parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqSessionMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqSessionMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqSessionMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

