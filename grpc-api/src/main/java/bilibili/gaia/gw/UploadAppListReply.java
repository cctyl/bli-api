// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/gaia/gw/gw_api.proto

package bilibili.gaia.gw;

/**
 * <pre>
 * 应用列表上报-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.gaia.gw.UploadAppListReply}
 */
public final class UploadAppListReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.gaia.gw.UploadAppListReply)
    UploadAppListReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadAppListReply.newBuilder() to construct.
  private UploadAppListReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadAppListReply() {
    traceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadAppListReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_UploadAppListReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_UploadAppListReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.gaia.gw.UploadAppListReply.class, bilibili.gaia.gw.UploadAppListReply.Builder.class);
  }

  public static final int TRACE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object traceId_ = "";
  /**
   * <pre>
   * 上报响应id
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   * @return The traceId.
   */
  @java.lang.Override
  public java.lang.String getTraceId() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 上报响应id
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   * @return The bytes for traceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTraceIdBytes() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      traceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(traceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, traceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(traceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, traceId_);
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
    if (!(obj instanceof bilibili.gaia.gw.UploadAppListReply)) {
      return super.equals(obj);
    }
    bilibili.gaia.gw.UploadAppListReply other = (bilibili.gaia.gw.UploadAppListReply) obj;

    if (!getTraceId()
        .equals(other.getTraceId())) return false;
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
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.UploadAppListReply parseFrom(
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
  public static Builder newBuilder(bilibili.gaia.gw.UploadAppListReply prototype) {
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
   * 应用列表上报-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.gaia.gw.UploadAppListReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.gaia.gw.UploadAppListReply)
      bilibili.gaia.gw.UploadAppListReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_UploadAppListReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_UploadAppListReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.gaia.gw.UploadAppListReply.class, bilibili.gaia.gw.UploadAppListReply.Builder.class);
    }

    // Construct using bilibili.gaia.gw.UploadAppListReply.newBuilder()
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
      traceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_UploadAppListReply_descriptor;
    }

    @java.lang.Override
    public bilibili.gaia.gw.UploadAppListReply getDefaultInstanceForType() {
      return bilibili.gaia.gw.UploadAppListReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.gaia.gw.UploadAppListReply build() {
      bilibili.gaia.gw.UploadAppListReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.gaia.gw.UploadAppListReply buildPartial() {
      bilibili.gaia.gw.UploadAppListReply result = new bilibili.gaia.gw.UploadAppListReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.gaia.gw.UploadAppListReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.traceId_ = traceId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.gaia.gw.UploadAppListReply) {
        return mergeFrom((bilibili.gaia.gw.UploadAppListReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.gaia.gw.UploadAppListReply other) {
      if (other == bilibili.gaia.gw.UploadAppListReply.getDefaultInstance()) return this;
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        bitField0_ |= 0x00000001;
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
              traceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object traceId_ = "";
    /**
     * <pre>
     * 上报响应id
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     * @return The traceId.
     */
    public java.lang.String getTraceId() {
      java.lang.Object ref = traceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 上报响应id
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     * @return The bytes for traceId.
     */
    public com.google.protobuf.ByteString
        getTraceIdBytes() {
      java.lang.Object ref = traceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        traceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 上报响应id
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     * @param value The traceId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      traceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报响应id
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraceId() {
      traceId_ = getDefaultInstance().getTraceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报响应id
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     * @param value The bytes for traceId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      traceId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.gaia.gw.UploadAppListReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.gaia.gw.UploadAppListReply)
  private static final bilibili.gaia.gw.UploadAppListReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.gaia.gw.UploadAppListReply();
  }

  public static bilibili.gaia.gw.UploadAppListReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadAppListReply>
      PARSER = new com.google.protobuf.AbstractParser<UploadAppListReply>() {
    @java.lang.Override
    public UploadAppListReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadAppListReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadAppListReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.gaia.gw.UploadAppListReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
