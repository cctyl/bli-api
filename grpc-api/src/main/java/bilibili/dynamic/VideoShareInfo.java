// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.VideoShareInfo}
 */
public final class VideoShareInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.VideoShareInfo)
    VideoShareInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoShareInfo.newBuilder() to construct.
  private VideoShareInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoShareInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoShareInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_VideoShareInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_VideoShareInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.VideoShareInfo.class, bilibili.dynamic.VideoShareInfo.Builder.class);
  }

  public static final int CID_FIELD_NUMBER = 1;
  private long cid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 cid = 1;</code>
   * @return The cid.
   */
  @java.lang.Override
  public long getCid() {
    return cid_;
  }

  public static final int PART_FIELD_NUMBER = 2;
  private int part_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 part = 2;</code>
   * @return The part.
   */
  @java.lang.Override
  public int getPart() {
    return part_;
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
    if (cid_ != 0L) {
      output.writeInt64(1, cid_);
    }
    if (part_ != 0) {
      output.writeInt32(2, part_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, cid_);
    }
    if (part_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, part_);
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
    if (!(obj instanceof bilibili.dynamic.VideoShareInfo)) {
      return super.equals(obj);
    }
    bilibili.dynamic.VideoShareInfo other = (bilibili.dynamic.VideoShareInfo) obj;

    if (getCid()
        != other.getCid()) return false;
    if (getPart()
        != other.getPart()) return false;
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
    hash = (37 * hash) + CID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCid());
    hash = (37 * hash) + PART_FIELD_NUMBER;
    hash = (53 * hash) + getPart();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.VideoShareInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.VideoShareInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.VideoShareInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.VideoShareInfo parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.VideoShareInfo prototype) {
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
   * Protobuf type {@code bilibili.dynamic.VideoShareInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.VideoShareInfo)
      bilibili.dynamic.VideoShareInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_VideoShareInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_VideoShareInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.VideoShareInfo.class, bilibili.dynamic.VideoShareInfo.Builder.class);
    }

    // Construct using bilibili.dynamic.VideoShareInfo.newBuilder()
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
      cid_ = 0L;
      part_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_VideoShareInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.VideoShareInfo getDefaultInstanceForType() {
      return bilibili.dynamic.VideoShareInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.VideoShareInfo build() {
      bilibili.dynamic.VideoShareInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.VideoShareInfo buildPartial() {
      bilibili.dynamic.VideoShareInfo result = new bilibili.dynamic.VideoShareInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.VideoShareInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cid_ = cid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.part_ = part_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.VideoShareInfo) {
        return mergeFrom((bilibili.dynamic.VideoShareInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.VideoShareInfo other) {
      if (other == bilibili.dynamic.VideoShareInfo.getDefaultInstance()) return this;
      if (other.getCid() != 0L) {
        setCid(other.getCid());
      }
      if (other.getPart() != 0) {
        setPart(other.getPart());
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
              cid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              part_ = input.readInt32();
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

    private long cid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 cid = 1;</code>
     * @return The cid.
     */
    @java.lang.Override
    public long getCid() {
      return cid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 cid = 1;</code>
     * @param value The cid to set.
     * @return This builder for chaining.
     */
    public Builder setCid(long value) {

      cid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 cid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cid_ = 0L;
      onChanged();
      return this;
    }

    private int part_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 part = 2;</code>
     * @return The part.
     */
    @java.lang.Override
    public int getPart() {
      return part_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 part = 2;</code>
     * @param value The part to set.
     * @return This builder for chaining.
     */
    public Builder setPart(int value) {

      part_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 part = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      part_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.VideoShareInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.VideoShareInfo)
  private static final bilibili.dynamic.VideoShareInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.VideoShareInfo();
  }

  public static bilibili.dynamic.VideoShareInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoShareInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoShareInfo>() {
    @java.lang.Override
    public VideoShareInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoShareInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoShareInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.VideoShareInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

