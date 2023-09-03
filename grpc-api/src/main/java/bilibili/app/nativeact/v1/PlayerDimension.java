// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.PlayerDimension}
 */
public final class PlayerDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.PlayerDimension)
    PlayerDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerDimension.newBuilder() to construct.
  private PlayerDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerDimension() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerDimension();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_PlayerDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_PlayerDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.PlayerDimension.class, bilibili.app.nativeact.v1.PlayerDimension.Builder.class);
  }

  public static final int WIDTH_FIELD_NUMBER = 1;
  private long width_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 width = 1;</code>
   * @return The width.
   */
  @java.lang.Override
  public long getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROTATE_FIELD_NUMBER = 3;
  private boolean rotate_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool rotate = 3;</code>
   * @return The rotate.
   */
  @java.lang.Override
  public boolean getRotate() {
    return rotate_;
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
    if (width_ != 0L) {
      output.writeInt64(1, width_);
    }
    if (height_ != 0L) {
      output.writeInt64(2, height_);
    }
    if (rotate_ != false) {
      output.writeBool(3, rotate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (width_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, width_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, height_);
    }
    if (rotate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, rotate_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.PlayerDimension)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.PlayerDimension other = (bilibili.app.nativeact.v1.PlayerDimension) obj;

    if (getWidth()
        != other.getWidth()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getRotate()
        != other.getRotate()) return false;
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
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWidth());
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + ROTATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRotate());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.PlayerDimension parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.PlayerDimension prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.PlayerDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.PlayerDimension)
      bilibili.app.nativeact.v1.PlayerDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_PlayerDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_PlayerDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.PlayerDimension.class, bilibili.app.nativeact.v1.PlayerDimension.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.PlayerDimension.newBuilder()
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
      width_ = 0L;
      height_ = 0L;
      rotate_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_PlayerDimension_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.PlayerDimension getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.PlayerDimension.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.PlayerDimension build() {
      bilibili.app.nativeact.v1.PlayerDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.PlayerDimension buildPartial() {
      bilibili.app.nativeact.v1.PlayerDimension result = new bilibili.app.nativeact.v1.PlayerDimension(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.PlayerDimension result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.width_ = width_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rotate_ = rotate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.PlayerDimension) {
        return mergeFrom((bilibili.app.nativeact.v1.PlayerDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.PlayerDimension other) {
      if (other == bilibili.app.nativeact.v1.PlayerDimension.getDefaultInstance()) return this;
      if (other.getWidth() != 0L) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRotate() != false) {
        setRotate(other.getRotate());
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
              width_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              height_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              rotate_ = input.readBool();
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

    private long width_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 width = 1;</code>
     * @return The width.
     */
    @java.lang.Override
    public long getWidth() {
      return width_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 width = 1;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(long value) {

      width_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 width = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0L;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      onChanged();
      return this;
    }

    private boolean rotate_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool rotate = 3;</code>
     * @return The rotate.
     */
    @java.lang.Override
    public boolean getRotate() {
      return rotate_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool rotate = 3;</code>
     * @param value The rotate to set.
     * @return This builder for chaining.
     */
    public Builder setRotate(boolean value) {

      rotate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool rotate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRotate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rotate_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.PlayerDimension)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.PlayerDimension)
  private static final bilibili.app.nativeact.v1.PlayerDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.PlayerDimension();
  }

  public static bilibili.app.nativeact.v1.PlayerDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerDimension>
      PARSER = new com.google.protobuf.AbstractParser<PlayerDimension>() {
    @java.lang.Override
    public PlayerDimension parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayerDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.PlayerDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

