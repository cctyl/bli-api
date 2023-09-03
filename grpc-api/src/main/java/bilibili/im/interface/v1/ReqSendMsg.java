// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 发送消息-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqSendMsg}
 */
public final class ReqSendMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqSendMsg)
    ReqSendMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqSendMsg.newBuilder() to construct.
  private ReqSendMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqSendMsg() {
    cookie_ = "";
    cookie2_ = "";
    devId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqSendMsg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSendMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSendMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqSendMsg.class, bilibili.im.interface.v1.ReqSendMsg.Builder.class);
  }

  public static final int MSG_FIELD_NUMBER = 1;
  private bilibili.im.type.Msg msg_;
  /**
   * <pre>
   * 消息内容
   * </pre>
   *
   * <code>.bilibili.im.type.Msg msg = 1;</code>
   * @return Whether the msg field is set.
   */
  @java.lang.Override
  public boolean hasMsg() {
    return msg_ != null;
  }
  /**
   * <pre>
   * 消息内容
   * </pre>
   *
   * <code>.bilibili.im.type.Msg msg = 1;</code>
   * @return The msg.
   */
  @java.lang.Override
  public bilibili.im.type.Msg getMsg() {
    return msg_ == null ? bilibili.im.type.Msg.getDefaultInstance() : msg_;
  }
  /**
   * <pre>
   * 消息内容
   * </pre>
   *
   * <code>.bilibili.im.type.Msg msg = 1;</code>
   */
  @java.lang.Override
  public bilibili.im.type.MsgOrBuilder getMsgOrBuilder() {
    return msg_ == null ? bilibili.im.type.Msg.getDefaultInstance() : msg_;
  }

  public static final int COOKIE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cookie_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string cookie = 2;</code>
   * @return The cookie.
   */
  @java.lang.Override
  public java.lang.String getCookie() {
    java.lang.Object ref = cookie_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cookie_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string cookie = 2;</code>
   * @return The bytes for cookie.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCookieBytes() {
    java.lang.Object ref = cookie_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cookie_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COOKIE2_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cookie2_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string cookie2 = 3;</code>
   * @return The cookie2.
   */
  @java.lang.Override
  public java.lang.String getCookie2() {
    java.lang.Object ref = cookie2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cookie2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string cookie2 = 3;</code>
   * @return The bytes for cookie2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCookie2Bytes() {
    java.lang.Object ref = cookie2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cookie2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 4;
  private int errorCode_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 error_code = 4;</code>
   * @return The errorCode.
   */
  @java.lang.Override
  public int getErrorCode() {
    return errorCode_;
  }

  public static final int DEV_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object devId_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string dev_id = 5;</code>
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
   * <code>string dev_id = 5;</code>
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
    if (msg_ != null) {
      output.writeMessage(1, getMsg());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cookie_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cookie_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cookie2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cookie2_);
    }
    if (errorCode_ != 0) {
      output.writeInt32(4, errorCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, devId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMsg());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cookie_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cookie_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cookie2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cookie2_);
    }
    if (errorCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, errorCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, devId_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqSendMsg)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqSendMsg other = (bilibili.im.interface.v1.ReqSendMsg) obj;

    if (hasMsg() != other.hasMsg()) return false;
    if (hasMsg()) {
      if (!getMsg()
          .equals(other.getMsg())) return false;
    }
    if (!getCookie()
        .equals(other.getCookie())) return false;
    if (!getCookie2()
        .equals(other.getCookie2())) return false;
    if (getErrorCode()
        != other.getErrorCode()) return false;
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
    if (hasMsg()) {
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
    }
    hash = (37 * hash) + COOKIE_FIELD_NUMBER;
    hash = (53 * hash) + getCookie().hashCode();
    hash = (37 * hash) + COOKIE2_FIELD_NUMBER;
    hash = (53 * hash) + getCookie2().hashCode();
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode();
    hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDevId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqSendMsg parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqSendMsg prototype) {
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
   * 发送消息-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqSendMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqSendMsg)
      bilibili.im.interface.v1.ReqSendMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSendMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSendMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqSendMsg.class, bilibili.im.interface.v1.ReqSendMsg.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqSendMsg.newBuilder()
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
      msg_ = null;
      if (msgBuilder_ != null) {
        msgBuilder_.dispose();
        msgBuilder_ = null;
      }
      cookie_ = "";
      cookie2_ = "";
      errorCode_ = 0;
      devId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqSendMsg_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSendMsg getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqSendMsg.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSendMsg build() {
      bilibili.im.interface.v1.ReqSendMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqSendMsg buildPartial() {
      bilibili.im.interface.v1.ReqSendMsg result = new bilibili.im.interface.v1.ReqSendMsg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqSendMsg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.msg_ = msgBuilder_ == null
            ? msg_
            : msgBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cookie_ = cookie_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cookie2_ = cookie2_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.errorCode_ = errorCode_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.devId_ = devId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqSendMsg) {
        return mergeFrom((bilibili.im.interface.v1.ReqSendMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqSendMsg other) {
      if (other == bilibili.im.interface.v1.ReqSendMsg.getDefaultInstance()) return this;
      if (other.hasMsg()) {
        mergeMsg(other.getMsg());
      }
      if (!other.getCookie().isEmpty()) {
        cookie_ = other.cookie_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCookie2().isEmpty()) {
        cookie2_ = other.cookie2_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getErrorCode() != 0) {
        setErrorCode(other.getErrorCode());
      }
      if (!other.getDevId().isEmpty()) {
        devId_ = other.devId_;
        bitField0_ |= 0x00000010;
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
            case 10: {
              input.readMessage(
                  getMsgFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              cookie_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              cookie2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              errorCode_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              devId_ = input.readStringRequireUtf8();
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

    private bilibili.im.type.Msg msg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.Msg, bilibili.im.type.Msg.Builder, bilibili.im.type.MsgOrBuilder> msgBuilder_;
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     * @return Whether the msg field is set.
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     * @return The msg.
     */
    public bilibili.im.type.Msg getMsg() {
      if (msgBuilder_ == null) {
        return msg_ == null ? bilibili.im.type.Msg.getDefaultInstance() : msg_;
      } else {
        return msgBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public Builder setMsg(bilibili.im.type.Msg value) {
      if (msgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
      } else {
        msgBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public Builder setMsg(
        bilibili.im.type.Msg.Builder builderForValue) {
      if (msgBuilder_ == null) {
        msg_ = builderForValue.build();
      } else {
        msgBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public Builder mergeMsg(bilibili.im.type.Msg value) {
      if (msgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          msg_ != null &&
          msg_ != bilibili.im.type.Msg.getDefaultInstance()) {
          getMsgBuilder().mergeFrom(value);
        } else {
          msg_ = value;
        }
      } else {
        msgBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public Builder clearMsg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      msg_ = null;
      if (msgBuilder_ != null) {
        msgBuilder_.dispose();
        msgBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public bilibili.im.type.Msg.Builder getMsgBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMsgFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    public bilibili.im.type.MsgOrBuilder getMsgOrBuilder() {
      if (msgBuilder_ != null) {
        return msgBuilder_.getMessageOrBuilder();
      } else {
        return msg_ == null ?
            bilibili.im.type.Msg.getDefaultInstance() : msg_;
      }
    }
    /**
     * <pre>
     * 消息内容
     * </pre>
     *
     * <code>.bilibili.im.type.Msg msg = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.im.type.Msg, bilibili.im.type.Msg.Builder, bilibili.im.type.MsgOrBuilder> 
        getMsgFieldBuilder() {
      if (msgBuilder_ == null) {
        msgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.im.type.Msg, bilibili.im.type.Msg.Builder, bilibili.im.type.MsgOrBuilder>(
                getMsg(),
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      return msgBuilder_;
    }

    private java.lang.Object cookie_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie = 2;</code>
     * @return The cookie.
     */
    public java.lang.String getCookie() {
      java.lang.Object ref = cookie_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cookie_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie = 2;</code>
     * @return The bytes for cookie.
     */
    public com.google.protobuf.ByteString
        getCookieBytes() {
      java.lang.Object ref = cookie_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cookie_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie = 2;</code>
     * @param value The cookie to set.
     * @return This builder for chaining.
     */
    public Builder setCookie(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cookie_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCookie() {
      cookie_ = getDefaultInstance().getCookie();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie = 2;</code>
     * @param value The bytes for cookie to set.
     * @return This builder for chaining.
     */
    public Builder setCookieBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cookie_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object cookie2_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie2 = 3;</code>
     * @return The cookie2.
     */
    public java.lang.String getCookie2() {
      java.lang.Object ref = cookie2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cookie2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie2 = 3;</code>
     * @return The bytes for cookie2.
     */
    public com.google.protobuf.ByteString
        getCookie2Bytes() {
      java.lang.Object ref = cookie2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cookie2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie2 = 3;</code>
     * @param value The cookie2 to set.
     * @return This builder for chaining.
     */
    public Builder setCookie2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cookie2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie2 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCookie2() {
      cookie2_ = getDefaultInstance().getCookie2();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cookie2 = 3;</code>
     * @param value The bytes for cookie2 to set.
     * @return This builder for chaining.
     */
    public Builder setCookie2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cookie2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int errorCode_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 error_code = 4;</code>
     * @return The errorCode.
     */
    @java.lang.Override
    public int getErrorCode() {
      return errorCode_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 error_code = 4;</code>
     * @param value The errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCode(int value) {

      errorCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 error_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorCode() {
      bitField0_ = (bitField0_ & ~0x00000008);
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object devId_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 5;</code>
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
     * <code>string dev_id = 5;</code>
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
     * <code>string dev_id = 5;</code>
     * @param value The devId to set.
     * @return This builder for chaining.
     */
    public Builder setDevId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      devId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevId() {
      devId_ = getDefaultInstance().getDevId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string dev_id = 5;</code>
     * @param value The bytes for devId to set.
     * @return This builder for chaining.
     */
    public Builder setDevIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      devId_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqSendMsg)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqSendMsg)
  private static final bilibili.im.interface.v1.ReqSendMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqSendMsg();
  }

  public static bilibili.im.interface.v1.ReqSendMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqSendMsg>
      PARSER = new com.google.protobuf.AbstractParser<ReqSendMsg>() {
    @java.lang.Override
    public ReqSendMsg parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqSendMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqSendMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqSendMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

