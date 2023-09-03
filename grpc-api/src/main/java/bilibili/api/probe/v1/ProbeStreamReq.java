// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/api/probe/v1/probe.proto

package bilibili.api.probe.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.api.probe.v1.ProbeStreamReq}
 */
public final class ProbeStreamReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.api.probe.v1.ProbeStreamReq)
    ProbeStreamReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProbeStreamReq.newBuilder() to construct.
  private ProbeStreamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProbeStreamReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProbeStreamReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.api.probe.v1.ProbeOuterClass.internal_static_bilibili_api_probe_v1_ProbeStreamReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.api.probe.v1.ProbeOuterClass.internal_static_bilibili_api_probe_v1_ProbeStreamReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.api.probe.v1.ProbeStreamReq.class, bilibili.api.probe.v1.ProbeStreamReq.Builder.class);
  }

  public static final int MID_FIELD_NUMBER = 1;
  private long mid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private long sequence_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 sequence = 2;</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
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
    if (mid_ != 0L) {
      output.writeInt64(1, mid_);
    }
    if (sequence_ != 0L) {
      output.writeInt64(2, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, mid_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sequence_);
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
    if (!(obj instanceof bilibili.api.probe.v1.ProbeStreamReq)) {
      return super.equals(obj);
    }
    bilibili.api.probe.v1.ProbeStreamReq other = (bilibili.api.probe.v1.ProbeStreamReq) obj;

    if (getMid()
        != other.getMid()) return false;
    if (getSequence()
        != other.getSequence()) return false;
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
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.api.probe.v1.ProbeStreamReq parseFrom(
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
  public static Builder newBuilder(bilibili.api.probe.v1.ProbeStreamReq prototype) {
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
   * Protobuf type {@code bilibili.api.probe.v1.ProbeStreamReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.api.probe.v1.ProbeStreamReq)
      bilibili.api.probe.v1.ProbeStreamReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.api.probe.v1.ProbeOuterClass.internal_static_bilibili_api_probe_v1_ProbeStreamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.api.probe.v1.ProbeOuterClass.internal_static_bilibili_api_probe_v1_ProbeStreamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.api.probe.v1.ProbeStreamReq.class, bilibili.api.probe.v1.ProbeStreamReq.Builder.class);
    }

    // Construct using bilibili.api.probe.v1.ProbeStreamReq.newBuilder()
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
      mid_ = 0L;
      sequence_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.api.probe.v1.ProbeOuterClass.internal_static_bilibili_api_probe_v1_ProbeStreamReq_descriptor;
    }

    @java.lang.Override
    public bilibili.api.probe.v1.ProbeStreamReq getDefaultInstanceForType() {
      return bilibili.api.probe.v1.ProbeStreamReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.api.probe.v1.ProbeStreamReq build() {
      bilibili.api.probe.v1.ProbeStreamReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.api.probe.v1.ProbeStreamReq buildPartial() {
      bilibili.api.probe.v1.ProbeStreamReq result = new bilibili.api.probe.v1.ProbeStreamReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.api.probe.v1.ProbeStreamReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sequence_ = sequence_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.api.probe.v1.ProbeStreamReq) {
        return mergeFrom((bilibili.api.probe.v1.ProbeStreamReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.api.probe.v1.ProbeStreamReq other) {
      if (other == bilibili.api.probe.v1.ProbeStreamReq.getDefaultInstance()) return this;
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
              mid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sequence_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long mid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @return The mid.
     */
    @java.lang.Override
    public long getMid() {
      return mid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 0L;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
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


    // @@protoc_insertion_point(builder_scope:bilibili.api.probe.v1.ProbeStreamReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.api.probe.v1.ProbeStreamReq)
  private static final bilibili.api.probe.v1.ProbeStreamReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.api.probe.v1.ProbeStreamReq();
  }

  public static bilibili.api.probe.v1.ProbeStreamReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProbeStreamReq>
      PARSER = new com.google.protobuf.AbstractParser<ProbeStreamReq>() {
    @java.lang.Override
    public ProbeStreamReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProbeStreamReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProbeStreamReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.api.probe.v1.ProbeStreamReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
