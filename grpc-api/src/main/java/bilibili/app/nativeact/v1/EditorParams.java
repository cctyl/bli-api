// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.EditorParams}
 */
public final class EditorParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.EditorParams)
    EditorParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditorParams.newBuilder() to construct.
  private EditorParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditorParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditorParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_EditorParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_EditorParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.EditorParams.class, bilibili.app.nativeact.v1.EditorParams.Builder.class);
  }

  public static final int OFFSET_FIELD_NUMBER = 1;
  private long offset_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 offset = 1;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int MODULE_ID_FIELD_NUMBER = 2;
  private long moduleId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 module_id = 2;</code>
   * @return The moduleId.
   */
  @java.lang.Override
  public long getModuleId() {
    return moduleId_;
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
    if (offset_ != 0L) {
      output.writeInt64(1, offset_);
    }
    if (moduleId_ != 0L) {
      output.writeInt64(2, moduleId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, offset_);
    }
    if (moduleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, moduleId_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.EditorParams)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.EditorParams other = (bilibili.app.nativeact.v1.EditorParams) obj;

    if (getOffset()
        != other.getOffset()) return false;
    if (getModuleId()
        != other.getModuleId()) return false;
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
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModuleId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.EditorParams parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.EditorParams prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.EditorParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.EditorParams)
      bilibili.app.nativeact.v1.EditorParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_EditorParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_EditorParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.EditorParams.class, bilibili.app.nativeact.v1.EditorParams.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.EditorParams.newBuilder()
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
      offset_ = 0L;
      moduleId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_EditorParams_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.EditorParams getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.EditorParams.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.EditorParams build() {
      bilibili.app.nativeact.v1.EditorParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.EditorParams buildPartial() {
      bilibili.app.nativeact.v1.EditorParams result = new bilibili.app.nativeact.v1.EditorParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.EditorParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.moduleId_ = moduleId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.EditorParams) {
        return mergeFrom((bilibili.app.nativeact.v1.EditorParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.EditorParams other) {
      if (other == bilibili.app.nativeact.v1.EditorParams.getDefaultInstance()) return this;
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getModuleId() != 0L) {
        setModuleId(other.getModuleId());
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
              offset_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              moduleId_ = input.readInt64();
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

    private long offset_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      offset_ = 0L;
      onChanged();
      return this;
    }

    private long moduleId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 module_id = 2;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public long getModuleId() {
      return moduleId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 module_id = 2;</code>
     * @param value The moduleId to set.
     * @return This builder for chaining.
     */
    public Builder setModuleId(long value) {

      moduleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 module_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      moduleId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.EditorParams)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.EditorParams)
  private static final bilibili.app.nativeact.v1.EditorParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.EditorParams();
  }

  public static bilibili.app.nativeact.v1.EditorParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditorParams>
      PARSER = new com.google.protobuf.AbstractParser<EditorParams>() {
    @java.lang.Override
    public EditorParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditorParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditorParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.EditorParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
