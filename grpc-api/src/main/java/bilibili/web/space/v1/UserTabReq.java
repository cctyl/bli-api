// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/space/v1/space.proto

package bilibili.web.space.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.space.v1.UserTabReq}
 */
public final class UserTabReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.space.v1.UserTabReq)
    UserTabReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserTabReq.newBuilder() to construct.
  private UserTabReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTabReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserTabReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.space.v1.Space.internal_static_bilibili_web_space_v1_UserTabReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.space.v1.Space.internal_static_bilibili_web_space_v1_UserTabReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.space.v1.UserTabReq.class, bilibili.web.space.v1.UserTabReq.Builder.class);
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

  public static final int PLAT_FIELD_NUMBER = 2;
  private int plat_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 plat = 2;</code>
   * @return The plat.
   */
  @java.lang.Override
  public int getPlat() {
    return plat_;
  }

  public static final int BUILD_FIELD_NUMBER = 3;
  private int build_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 build = 3;</code>
   * @return The build.
   */
  @java.lang.Override
  public int getBuild() {
    return build_;
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
    if (plat_ != 0) {
      output.writeInt32(2, plat_);
    }
    if (build_ != 0) {
      output.writeInt32(3, build_);
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
    if (plat_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, plat_);
    }
    if (build_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, build_);
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
    if (!(obj instanceof bilibili.web.space.v1.UserTabReq)) {
      return super.equals(obj);
    }
    bilibili.web.space.v1.UserTabReq other = (bilibili.web.space.v1.UserTabReq) obj;

    if (getMid()
        != other.getMid()) return false;
    if (getPlat()
        != other.getPlat()) return false;
    if (getBuild()
        != other.getBuild()) return false;
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
    hash = (37 * hash) + PLAT_FIELD_NUMBER;
    hash = (53 * hash) + getPlat();
    hash = (37 * hash) + BUILD_FIELD_NUMBER;
    hash = (53 * hash) + getBuild();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.space.v1.UserTabReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.space.v1.UserTabReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.space.v1.UserTabReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.space.v1.UserTabReq parseFrom(
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
  public static Builder newBuilder(bilibili.web.space.v1.UserTabReq prototype) {
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
   * Protobuf type {@code bilibili.web.space.v1.UserTabReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.space.v1.UserTabReq)
      bilibili.web.space.v1.UserTabReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.space.v1.Space.internal_static_bilibili_web_space_v1_UserTabReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.space.v1.Space.internal_static_bilibili_web_space_v1_UserTabReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.space.v1.UserTabReq.class, bilibili.web.space.v1.UserTabReq.Builder.class);
    }

    // Construct using bilibili.web.space.v1.UserTabReq.newBuilder()
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
      plat_ = 0;
      build_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.space.v1.Space.internal_static_bilibili_web_space_v1_UserTabReq_descriptor;
    }

    @java.lang.Override
    public bilibili.web.space.v1.UserTabReq getDefaultInstanceForType() {
      return bilibili.web.space.v1.UserTabReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.space.v1.UserTabReq build() {
      bilibili.web.space.v1.UserTabReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.space.v1.UserTabReq buildPartial() {
      bilibili.web.space.v1.UserTabReq result = new bilibili.web.space.v1.UserTabReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.space.v1.UserTabReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.plat_ = plat_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.build_ = build_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.space.v1.UserTabReq) {
        return mergeFrom((bilibili.web.space.v1.UserTabReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.space.v1.UserTabReq other) {
      if (other == bilibili.web.space.v1.UserTabReq.getDefaultInstance()) return this;
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (other.getPlat() != 0) {
        setPlat(other.getPlat());
      }
      if (other.getBuild() != 0) {
        setBuild(other.getBuild());
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
              plat_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              build_ = input.readInt32();
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

    private int plat_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 plat = 2;</code>
     * @return The plat.
     */
    @java.lang.Override
    public int getPlat() {
      return plat_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 plat = 2;</code>
     * @param value The plat to set.
     * @return This builder for chaining.
     */
    public Builder setPlat(int value) {

      plat_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 plat = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      plat_ = 0;
      onChanged();
      return this;
    }

    private int build_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 build = 3;</code>
     * @return The build.
     */
    @java.lang.Override
    public int getBuild() {
      return build_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 build = 3;</code>
     * @param value The build to set.
     * @return This builder for chaining.
     */
    public Builder setBuild(int value) {

      build_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 build = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuild() {
      bitField0_ = (bitField0_ & ~0x00000004);
      build_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.space.v1.UserTabReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.space.v1.UserTabReq)
  private static final bilibili.web.space.v1.UserTabReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.space.v1.UserTabReq();
  }

  public static bilibili.web.space.v1.UserTabReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTabReq>
      PARSER = new com.google.protobuf.AbstractParser<UserTabReq>() {
    @java.lang.Override
    public UserTabReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserTabReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTabReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.space.v1.UserTabReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

