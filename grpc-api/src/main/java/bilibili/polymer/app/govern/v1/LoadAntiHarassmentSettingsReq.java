// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/community/govern/v1/govern.proto

package bilibili.polymer.app.govern.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq}
 */
public final class LoadAntiHarassmentSettingsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)
    LoadAntiHarassmentSettingsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadAntiHarassmentSettingsReq.newBuilder() to construct.
  private LoadAntiHarassmentSettingsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadAntiHarassmentSettingsReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoadAntiHarassmentSettingsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_LoadAntiHarassmentSettingsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_LoadAntiHarassmentSettingsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.class, bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.Builder.class);
  }

  public static final int BIZ_TYPE_FIELD_NUMBER = 1;
  private int bizType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 biz_type = 1;</code>
   * @return The bizType.
   */
  @java.lang.Override
  public int getBizType() {
    return bizType_;
  }

  public static final int RECV_MID_FIELD_NUMBER = 2;
  private long recvMid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 recv_mid = 2;</code>
   * @return The recvMid.
   */
  @java.lang.Override
  public long getRecvMid() {
    return recvMid_;
  }

  public static final int SEND_MID_FIELD_NUMBER = 3;
  private long sendMid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 send_mid = 3;</code>
   * @return The sendMid.
   */
  @java.lang.Override
  public long getSendMid() {
    return sendMid_;
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
    if (bizType_ != 0) {
      output.writeInt32(1, bizType_);
    }
    if (recvMid_ != 0L) {
      output.writeInt64(2, recvMid_);
    }
    if (sendMid_ != 0L) {
      output.writeInt64(3, sendMid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bizType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bizType_);
    }
    if (recvMid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, recvMid_);
    }
    if (sendMid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, sendMid_);
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
    if (!(obj instanceof bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq other = (bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq) obj;

    if (getBizType()
        != other.getBizType()) return false;
    if (getRecvMid()
        != other.getRecvMid()) return false;
    if (getSendMid()
        != other.getSendMid()) return false;
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
    hash = (37 * hash) + BIZ_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBizType();
    hash = (37 * hash) + RECV_MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRecvMid());
    hash = (37 * hash) + SEND_MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSendMid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)
      bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_LoadAntiHarassmentSettingsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_LoadAntiHarassmentSettingsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.class, bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.Builder.class);
    }

    // Construct using bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.newBuilder()
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
      bizType_ = 0;
      recvMid_ = 0L;
      sendMid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_LoadAntiHarassmentSettingsReq_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq getDefaultInstanceForType() {
      return bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq build() {
      bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq buildPartial() {
      bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq result = new bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bizType_ = bizType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recvMid_ = recvMid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sendMid_ = sendMid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq) {
        return mergeFrom((bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq other) {
      if (other == bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq.getDefaultInstance()) return this;
      if (other.getBizType() != 0) {
        setBizType(other.getBizType());
      }
      if (other.getRecvMid() != 0L) {
        setRecvMid(other.getRecvMid());
      }
      if (other.getSendMid() != 0L) {
        setSendMid(other.getSendMid());
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
              bizType_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              recvMid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              sendMid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int bizType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 biz_type = 1;</code>
     * @return The bizType.
     */
    @java.lang.Override
    public int getBizType() {
      return bizType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 biz_type = 1;</code>
     * @param value The bizType to set.
     * @return This builder for chaining.
     */
    public Builder setBizType(int value) {

      bizType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 biz_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bizType_ = 0;
      onChanged();
      return this;
    }

    private long recvMid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 recv_mid = 2;</code>
     * @return The recvMid.
     */
    @java.lang.Override
    public long getRecvMid() {
      return recvMid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 recv_mid = 2;</code>
     * @param value The recvMid to set.
     * @return This builder for chaining.
     */
    public Builder setRecvMid(long value) {

      recvMid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 recv_mid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecvMid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      recvMid_ = 0L;
      onChanged();
      return this;
    }

    private long sendMid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 send_mid = 3;</code>
     * @return The sendMid.
     */
    @java.lang.Override
    public long getSendMid() {
      return sendMid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 send_mid = 3;</code>
     * @param value The sendMid to set.
     * @return This builder for chaining.
     */
    public Builder setSendMid(long value) {

      sendMid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 send_mid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendMid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sendMid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq)
  private static final bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq();
  }

  public static bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadAntiHarassmentSettingsReq>
      PARSER = new com.google.protobuf.AbstractParser<LoadAntiHarassmentSettingsReq>() {
    @java.lang.Override
    public LoadAntiHarassmentSettingsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoadAntiHarassmentSettingsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadAntiHarassmentSettingsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

