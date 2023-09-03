// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.Area}
 */
public final class Area extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.Area)
    AreaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Area.newBuilder() to construct.
  private Area(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Area() {
    ukey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Area();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_Area_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_Area_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.Area.class, bilibili.app.nativeact.v1.Area.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 height = 1;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private long width_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 width = 2;</code>
   * @return The width.
   */
  @java.lang.Override
  public long getWidth() {
    return width_;
  }

  public static final int X_FIELD_NUMBER = 3;
  private long x_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 x = 3;</code>
   * @return The x.
   */
  @java.lang.Override
  public long getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 4;
  private long y_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 y = 4;</code>
   * @return The y.
   */
  @java.lang.Override
  public long getY() {
    return y_;
  }

  public static final int UKEY_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ukey_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string ukey = 5;</code>
   * @return The ukey.
   */
  @java.lang.Override
  public java.lang.String getUkey() {
    java.lang.Object ref = ukey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ukey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string ukey = 5;</code>
   * @return The bytes for ukey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUkeyBytes() {
    java.lang.Object ref = ukey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ukey_ = b;
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
    if (height_ != 0L) {
      output.writeInt64(1, height_);
    }
    if (width_ != 0L) {
      output.writeInt64(2, width_);
    }
    if (x_ != 0L) {
      output.writeInt64(3, x_);
    }
    if (y_ != 0L) {
      output.writeInt64(4, y_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ukey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ukey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, height_);
    }
    if (width_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, width_);
    }
    if (x_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, x_);
    }
    if (y_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, y_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ukey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ukey_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.Area)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.Area other = (bilibili.app.nativeact.v1.Area) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (getX()
        != other.getX()) return false;
    if (getY()
        != other.getY()) return false;
    if (!getUkey()
        .equals(other.getUkey())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWidth());
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getY());
    hash = (37 * hash) + UKEY_FIELD_NUMBER;
    hash = (53 * hash) + getUkey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.Area parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.Area parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.Area parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.Area parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.Area prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.Area}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.Area)
      bilibili.app.nativeact.v1.AreaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_Area_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_Area_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.Area.class, bilibili.app.nativeact.v1.Area.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.Area.newBuilder()
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
      height_ = 0L;
      width_ = 0L;
      x_ = 0L;
      y_ = 0L;
      ukey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_Area_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.Area getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.Area.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.Area build() {
      bilibili.app.nativeact.v1.Area result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.Area buildPartial() {
      bilibili.app.nativeact.v1.Area result = new bilibili.app.nativeact.v1.Area(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.Area result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.width_ = width_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.x_ = x_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.y_ = y_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ukey_ = ukey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.Area) {
        return mergeFrom((bilibili.app.nativeact.v1.Area)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.Area other) {
      if (other == bilibili.app.nativeact.v1.Area.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getWidth() != 0L) {
        setWidth(other.getWidth());
      }
      if (other.getX() != 0L) {
        setX(other.getX());
      }
      if (other.getY() != 0L) {
        setY(other.getY());
      }
      if (!other.getUkey().isEmpty()) {
        ukey_ = other.ukey_;
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
            case 8: {
              height_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              width_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              x_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              y_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              ukey_ = input.readStringRequireUtf8();
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

    private long height_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 height = 1;</code>
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
     * <code>int64 height = 1;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private long width_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 width = 2;</code>
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
     * <code>int64 width = 2;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(long value) {

      width_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 width = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      width_ = 0L;
      onChanged();
      return this;
    }

    private long x_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 x = 3;</code>
     * @return The x.
     */
    @java.lang.Override
    public long getX() {
      return x_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 x = 3;</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(long value) {

      x_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 x = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000004);
      x_ = 0L;
      onChanged();
      return this;
    }

    private long y_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 y = 4;</code>
     * @return The y.
     */
    @java.lang.Override
    public long getY() {
      return y_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 y = 4;</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(long value) {

      y_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 y = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000008);
      y_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object ukey_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string ukey = 5;</code>
     * @return The ukey.
     */
    public java.lang.String getUkey() {
      java.lang.Object ref = ukey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ukey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string ukey = 5;</code>
     * @return The bytes for ukey.
     */
    public com.google.protobuf.ByteString
        getUkeyBytes() {
      java.lang.Object ref = ukey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ukey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string ukey = 5;</code>
     * @param value The ukey to set.
     * @return This builder for chaining.
     */
    public Builder setUkey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ukey_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string ukey = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUkey() {
      ukey_ = getDefaultInstance().getUkey();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string ukey = 5;</code>
     * @param value The bytes for ukey to set.
     * @return This builder for chaining.
     */
    public Builder setUkeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ukey_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.Area)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.Area)
  private static final bilibili.app.nativeact.v1.Area DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.Area();
  }

  public static bilibili.app.nativeact.v1.Area getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Area>
      PARSER = new com.google.protobuf.AbstractParser<Area>() {
    @java.lang.Override
    public Area parsePartialFrom(
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

  public static com.google.protobuf.Parser<Area> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Area> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.Area getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

