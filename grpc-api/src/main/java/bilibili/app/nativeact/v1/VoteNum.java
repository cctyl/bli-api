// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.VoteNum}
 */
public final class VoteNum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.VoteNum)
    VoteNumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteNum.newBuilder() to construct.
  private VoteNum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteNum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteNum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VoteNum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VoteNum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.VoteNum.class, bilibili.app.nativeact.v1.VoteNum.Builder.class);
  }

  public static final int AREA_FIELD_NUMBER = 1;
  private bilibili.app.nativeact.v1.Area area_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
   * @return Whether the area field is set.
   */
  @java.lang.Override
  public boolean hasArea() {
    return area_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
   * @return The area.
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.Area getArea() {
    return area_ == null ? bilibili.app.nativeact.v1.Area.getDefaultInstance() : area_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.AreaOrBuilder getAreaOrBuilder() {
    return area_ == null ? bilibili.app.nativeact.v1.Area.getDefaultInstance() : area_;
  }

  public static final int NUM_FIELD_NUMBER = 2;
  private long num_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 num = 2;</code>
   * @return The num.
   */
  @java.lang.Override
  public long getNum() {
    return num_;
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
    if (area_ != null) {
      output.writeMessage(1, getArea());
    }
    if (num_ != 0L) {
      output.writeInt64(2, num_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (area_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getArea());
    }
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, num_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.VoteNum)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.VoteNum other = (bilibili.app.nativeact.v1.VoteNum) obj;

    if (hasArea() != other.hasArea()) return false;
    if (hasArea()) {
      if (!getArea()
          .equals(other.getArea())) return false;
    }
    if (getNum()
        != other.getNum()) return false;
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
    if (hasArea()) {
      hash = (37 * hash) + AREA_FIELD_NUMBER;
      hash = (53 * hash) + getArea().hashCode();
    }
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNum());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VoteNum parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.VoteNum prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.VoteNum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.VoteNum)
      bilibili.app.nativeact.v1.VoteNumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VoteNum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VoteNum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.VoteNum.class, bilibili.app.nativeact.v1.VoteNum.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.VoteNum.newBuilder()
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
      area_ = null;
      if (areaBuilder_ != null) {
        areaBuilder_.dispose();
        areaBuilder_ = null;
      }
      num_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VoteNum_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VoteNum getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.VoteNum.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VoteNum build() {
      bilibili.app.nativeact.v1.VoteNum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VoteNum buildPartial() {
      bilibili.app.nativeact.v1.VoteNum result = new bilibili.app.nativeact.v1.VoteNum(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.VoteNum result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.area_ = areaBuilder_ == null
            ? area_
            : areaBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.num_ = num_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.VoteNum) {
        return mergeFrom((bilibili.app.nativeact.v1.VoteNum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.VoteNum other) {
      if (other == bilibili.app.nativeact.v1.VoteNum.getDefaultInstance()) return this;
      if (other.hasArea()) {
        mergeArea(other.getArea());
      }
      if (other.getNum() != 0L) {
        setNum(other.getNum());
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
              input.readMessage(
                  getAreaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              num_ = input.readInt64();
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

    private bilibili.app.nativeact.v1.Area area_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.Area, bilibili.app.nativeact.v1.Area.Builder, bilibili.app.nativeact.v1.AreaOrBuilder> areaBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     * @return Whether the area field is set.
     */
    public boolean hasArea() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     * @return The area.
     */
    public bilibili.app.nativeact.v1.Area getArea() {
      if (areaBuilder_ == null) {
        return area_ == null ? bilibili.app.nativeact.v1.Area.getDefaultInstance() : area_;
      } else {
        return areaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public Builder setArea(bilibili.app.nativeact.v1.Area value) {
      if (areaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        area_ = value;
      } else {
        areaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public Builder setArea(
        bilibili.app.nativeact.v1.Area.Builder builderForValue) {
      if (areaBuilder_ == null) {
        area_ = builderForValue.build();
      } else {
        areaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public Builder mergeArea(bilibili.app.nativeact.v1.Area value) {
      if (areaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          area_ != null &&
          area_ != bilibili.app.nativeact.v1.Area.getDefaultInstance()) {
          getAreaBuilder().mergeFrom(value);
        } else {
          area_ = value;
        }
      } else {
        areaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public Builder clearArea() {
      bitField0_ = (bitField0_ & ~0x00000001);
      area_ = null;
      if (areaBuilder_ != null) {
        areaBuilder_.dispose();
        areaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public bilibili.app.nativeact.v1.Area.Builder getAreaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAreaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    public bilibili.app.nativeact.v1.AreaOrBuilder getAreaOrBuilder() {
      if (areaBuilder_ != null) {
        return areaBuilder_.getMessageOrBuilder();
      } else {
        return area_ == null ?
            bilibili.app.nativeact.v1.Area.getDefaultInstance() : area_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Area area = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.Area, bilibili.app.nativeact.v1.Area.Builder, bilibili.app.nativeact.v1.AreaOrBuilder> 
        getAreaFieldBuilder() {
      if (areaBuilder_ == null) {
        areaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.nativeact.v1.Area, bilibili.app.nativeact.v1.Area.Builder, bilibili.app.nativeact.v1.AreaOrBuilder>(
                getArea(),
                getParentForChildren(),
                isClean());
        area_ = null;
      }
      return areaBuilder_;
    }

    private long num_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @return The num.
     */
    @java.lang.Override
    public long getNum() {
      return num_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(long value) {

      num_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      num_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.VoteNum)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.VoteNum)
  private static final bilibili.app.nativeact.v1.VoteNum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.VoteNum();
  }

  public static bilibili.app.nativeact.v1.VoteNum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteNum>
      PARSER = new com.google.protobuf.AbstractParser<VoteNum>() {
    @java.lang.Override
    public VoteNum parsePartialFrom(
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

  public static com.google.protobuf.Parser<VoteNum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteNum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.VoteNum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

