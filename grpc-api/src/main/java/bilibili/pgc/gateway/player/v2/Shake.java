// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * 震动
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v2.Shake}
 */
public final class Shake extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v2.Shake)
    ShakeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Shake.newBuilder() to construct.
  private Shake(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Shake() {
    file_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Shake();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Shake_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Shake_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v2.Shake.class, bilibili.pgc.gateway.player.v2.Shake.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object file_ = "";
  /**
   * <pre>
   * 文件地址
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      file_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 文件地址
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileBytes() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      file_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v2.Shake)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v2.Shake other = (bilibili.pgc.gateway.player.v2.Shake) obj;

    if (!getFile()
        .equals(other.getFile())) return false;
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
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Shake parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v2.Shake prototype) {
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
   * 震动
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v2.Shake}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v2.Shake)
      bilibili.pgc.gateway.player.v2.ShakeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Shake_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Shake_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v2.Shake.class, bilibili.pgc.gateway.player.v2.Shake.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v2.Shake.newBuilder()
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
      file_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Shake_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Shake getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v2.Shake.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Shake build() {
      bilibili.pgc.gateway.player.v2.Shake result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Shake buildPartial() {
      bilibili.pgc.gateway.player.v2.Shake result = new bilibili.pgc.gateway.player.v2.Shake(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v2.Shake result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.file_ = file_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v2.Shake) {
        return mergeFrom((bilibili.pgc.gateway.player.v2.Shake)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v2.Shake other) {
      if (other == bilibili.pgc.gateway.player.v2.Shake.getDefaultInstance()) return this;
      if (!other.getFile().isEmpty()) {
        file_ = other.file_;
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
              file_ = input.readStringRequireUtf8();
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

    private java.lang.Object file_ = "";
    /**
     * <pre>
     * 文件地址
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The file.
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        file_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 文件地址
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The bytes for file.
     */
    public com.google.protobuf.ByteString
        getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 文件地址
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      file_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件地址
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      file_ = getDefaultInstance().getFile();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件地址
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      file_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v2.Shake)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v2.Shake)
  private static final bilibili.pgc.gateway.player.v2.Shake DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v2.Shake();
  }

  public static bilibili.pgc.gateway.player.v2.Shake getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Shake>
      PARSER = new com.google.protobuf.AbstractParser<Shake>() {
    @java.lang.Override
    public Shake parsePartialFrom(
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

  public static com.google.protobuf.Parser<Shake> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Shake> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.Shake getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

