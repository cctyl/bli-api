// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.ReserveReply}
 */
public final class ReserveReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.ReserveReply)
    ReserveReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReserveReply.newBuilder() to construct.
  private ReserveReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReserveReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReserveReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ReserveReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ReserveReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.ReserveReply.class, bilibili.app.view.v1.ReserveReply.Builder.class);
  }

  public static final int RESERVE_ID_FIELD_NUMBER = 1;
  private long reserveId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 reserve_id = 1;</code>
   * @return The reserveId.
   */
  @java.lang.Override
  public long getReserveId() {
    return reserveId_;
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
    if (reserveId_ != 0L) {
      output.writeInt64(1, reserveId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reserveId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, reserveId_);
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
    if (!(obj instanceof bilibili.app.view.v1.ReserveReply)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.ReserveReply other = (bilibili.app.view.v1.ReserveReply) obj;

    if (getReserveId()
        != other.getReserveId()) return false;
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
    hash = (37 * hash) + RESERVE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReserveId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.ReserveReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ReserveReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ReserveReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.ReserveReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.ReserveReply prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.ReserveReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.ReserveReply)
      bilibili.app.view.v1.ReserveReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ReserveReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ReserveReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.ReserveReply.class, bilibili.app.view.v1.ReserveReply.Builder.class);
    }

    // Construct using bilibili.app.view.v1.ReserveReply.newBuilder()
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
      reserveId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_ReserveReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ReserveReply getDefaultInstanceForType() {
      return bilibili.app.view.v1.ReserveReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.ReserveReply build() {
      bilibili.app.view.v1.ReserveReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.ReserveReply buildPartial() {
      bilibili.app.view.v1.ReserveReply result = new bilibili.app.view.v1.ReserveReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.ReserveReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reserveId_ = reserveId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.ReserveReply) {
        return mergeFrom((bilibili.app.view.v1.ReserveReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.ReserveReply other) {
      if (other == bilibili.app.view.v1.ReserveReply.getDefaultInstance()) return this;
      if (other.getReserveId() != 0L) {
        setReserveId(other.getReserveId());
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
              reserveId_ = input.readInt64();
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

    private long reserveId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @return The reserveId.
     */
    @java.lang.Override
    public long getReserveId() {
      return reserveId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @param value The reserveId to set.
     * @return This builder for chaining.
     */
    public Builder setReserveId(long value) {

      reserveId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reserveId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.ReserveReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.ReserveReply)
  private static final bilibili.app.view.v1.ReserveReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.ReserveReply();
  }

  public static bilibili.app.view.v1.ReserveReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReserveReply>
      PARSER = new com.google.protobuf.AbstractParser<ReserveReply>() {
    @java.lang.Override
    public ReserveReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReserveReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReserveReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.ReserveReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

