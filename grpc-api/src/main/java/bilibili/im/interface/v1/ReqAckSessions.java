// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 拉取已读消息-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqAckSessions}
 */
public final class ReqAckSessions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqAckSessions)
    ReqAckSessionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqAckSessions.newBuilder() to construct.
  private ReqAckSessions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqAckSessions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqAckSessions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckSessions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckSessions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqAckSessions.class, bilibili.im.interface.v1.ReqAckSessions.Builder.class);
  }

  public static final int BEGIN_TS_FIELD_NUMBER = 1;
  private long beginTs_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 begin_ts = 1;</code>
   * @return The beginTs.
   */
  @java.lang.Override
  public long getBeginTs() {
    return beginTs_;
  }

  public static final int END_TS_FIELD_NUMBER = 2;
  private int endTs_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 end_ts = 2;</code>
   * @return The endTs.
   */
  @java.lang.Override
  public int getEndTs() {
    return endTs_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
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
    if (beginTs_ != 0L) {
      output.writeUInt64(1, beginTs_);
    }
    if (endTs_ != 0) {
      output.writeUInt32(2, endTs_);
    }
    if (size_ != 0) {
      output.writeUInt32(3, size_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (beginTs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, beginTs_);
    }
    if (endTs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, endTs_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, size_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqAckSessions)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqAckSessions other = (bilibili.im.interface.v1.ReqAckSessions) obj;

    if (getBeginTs()
        != other.getBeginTs()) return false;
    if (getEndTs()
        != other.getEndTs()) return false;
    if (getSize()
        != other.getSize()) return false;
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
    hash = (37 * hash) + BEGIN_TS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBeginTs());
    hash = (37 * hash) + END_TS_FIELD_NUMBER;
    hash = (53 * hash) + getEndTs();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqAckSessions parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqAckSessions prototype) {
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
   * 拉取已读消息-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqAckSessions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqAckSessions)
      bilibili.im.interface.v1.ReqAckSessionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckSessions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckSessions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqAckSessions.class, bilibili.im.interface.v1.ReqAckSessions.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqAckSessions.newBuilder()
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
      beginTs_ = 0L;
      endTs_ = 0;
      size_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqAckSessions_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckSessions getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqAckSessions.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckSessions build() {
      bilibili.im.interface.v1.ReqAckSessions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqAckSessions buildPartial() {
      bilibili.im.interface.v1.ReqAckSessions result = new bilibili.im.interface.v1.ReqAckSessions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqAckSessions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.beginTs_ = beginTs_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endTs_ = endTs_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.size_ = size_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqAckSessions) {
        return mergeFrom((bilibili.im.interface.v1.ReqAckSessions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqAckSessions other) {
      if (other == bilibili.im.interface.v1.ReqAckSessions.getDefaultInstance()) return this;
      if (other.getBeginTs() != 0L) {
        setBeginTs(other.getBeginTs());
      }
      if (other.getEndTs() != 0) {
        setEndTs(other.getEndTs());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
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
              beginTs_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              endTs_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              size_ = input.readUInt32();
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

    private long beginTs_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @return The beginTs.
     */
    @java.lang.Override
    public long getBeginTs() {
      return beginTs_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @param value The beginTs to set.
     * @return This builder for chaining.
     */
    public Builder setBeginTs(long value) {

      beginTs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginTs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      beginTs_ = 0L;
      onChanged();
      return this;
    }

    private int endTs_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 end_ts = 2;</code>
     * @return The endTs.
     */
    @java.lang.Override
    public int getEndTs() {
      return endTs_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 end_ts = 2;</code>
     * @param value The endTs to set.
     * @return This builder for chaining.
     */
    public Builder setEndTs(int value) {

      endTs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 end_ts = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endTs_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 size = 3;</code>
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
     * <code>uint32 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {

      size_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      size_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqAckSessions)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqAckSessions)
  private static final bilibili.im.interface.v1.ReqAckSessions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqAckSessions();
  }

  public static bilibili.im.interface.v1.ReqAckSessions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqAckSessions>
      PARSER = new com.google.protobuf.AbstractParser<ReqAckSessions>() {
    @java.lang.Override
    public ReqAckSessions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqAckSessions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqAckSessions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqAckSessions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

