// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.VideoRights}
 */
public final class VideoRights extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.VideoRights)
    VideoRightsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoRights.newBuilder() to construct.
  private VideoRights(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoRights() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoRights();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VideoRights_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VideoRights_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.VideoRights.class, bilibili.app.nativeact.v1.VideoRights.Builder.class);
  }

  public static final int UGC_PAY_FIELD_NUMBER = 1;
  private boolean ugcPay_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool ugc_pay = 1;</code>
   * @return The ugcPay.
   */
  @java.lang.Override
  public boolean getUgcPay() {
    return ugcPay_;
  }

  public static final int IS_COOPERATION_FIELD_NUMBER = 2;
  private boolean isCooperation_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_cooperation = 2;</code>
   * @return The isCooperation.
   */
  @java.lang.Override
  public boolean getIsCooperation() {
    return isCooperation_;
  }

  public static final int IS_PGC_FIELD_NUMBER = 3;
  private boolean isPgc_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_pgc = 3;</code>
   * @return The isPgc.
   */
  @java.lang.Override
  public boolean getIsPgc() {
    return isPgc_;
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
    if (ugcPay_ != false) {
      output.writeBool(1, ugcPay_);
    }
    if (isCooperation_ != false) {
      output.writeBool(2, isCooperation_);
    }
    if (isPgc_ != false) {
      output.writeBool(3, isPgc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ugcPay_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ugcPay_);
    }
    if (isCooperation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isCooperation_);
    }
    if (isPgc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isPgc_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.VideoRights)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.VideoRights other = (bilibili.app.nativeact.v1.VideoRights) obj;

    if (getUgcPay()
        != other.getUgcPay()) return false;
    if (getIsCooperation()
        != other.getIsCooperation()) return false;
    if (getIsPgc()
        != other.getIsPgc()) return false;
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
    hash = (37 * hash) + UGC_PAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUgcPay());
    hash = (37 * hash) + IS_COOPERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCooperation());
    hash = (37 * hash) + IS_PGC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPgc());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.VideoRights parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.VideoRights prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.VideoRights}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.VideoRights)
      bilibili.app.nativeact.v1.VideoRightsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VideoRights_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VideoRights_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.VideoRights.class, bilibili.app.nativeact.v1.VideoRights.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.VideoRights.newBuilder()
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
      ugcPay_ = false;
      isCooperation_ = false;
      isPgc_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_VideoRights_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VideoRights getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.VideoRights.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VideoRights build() {
      bilibili.app.nativeact.v1.VideoRights result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.VideoRights buildPartial() {
      bilibili.app.nativeact.v1.VideoRights result = new bilibili.app.nativeact.v1.VideoRights(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.VideoRights result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ugcPay_ = ugcPay_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isCooperation_ = isCooperation_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isPgc_ = isPgc_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.VideoRights) {
        return mergeFrom((bilibili.app.nativeact.v1.VideoRights)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.VideoRights other) {
      if (other == bilibili.app.nativeact.v1.VideoRights.getDefaultInstance()) return this;
      if (other.getUgcPay() != false) {
        setUgcPay(other.getUgcPay());
      }
      if (other.getIsCooperation() != false) {
        setIsCooperation(other.getIsCooperation());
      }
      if (other.getIsPgc() != false) {
        setIsPgc(other.getIsPgc());
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
              ugcPay_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              isCooperation_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isPgc_ = input.readBool();
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

    private boolean ugcPay_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool ugc_pay = 1;</code>
     * @return The ugcPay.
     */
    @java.lang.Override
    public boolean getUgcPay() {
      return ugcPay_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool ugc_pay = 1;</code>
     * @param value The ugcPay to set.
     * @return This builder for chaining.
     */
    public Builder setUgcPay(boolean value) {

      ugcPay_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool ugc_pay = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUgcPay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ugcPay_ = false;
      onChanged();
      return this;
    }

    private boolean isCooperation_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_cooperation = 2;</code>
     * @return The isCooperation.
     */
    @java.lang.Override
    public boolean getIsCooperation() {
      return isCooperation_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_cooperation = 2;</code>
     * @param value The isCooperation to set.
     * @return This builder for chaining.
     */
    public Builder setIsCooperation(boolean value) {

      isCooperation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_cooperation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCooperation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isCooperation_ = false;
      onChanged();
      return this;
    }

    private boolean isPgc_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_pgc = 3;</code>
     * @return The isPgc.
     */
    @java.lang.Override
    public boolean getIsPgc() {
      return isPgc_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_pgc = 3;</code>
     * @param value The isPgc to set.
     * @return This builder for chaining.
     */
    public Builder setIsPgc(boolean value) {

      isPgc_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_pgc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPgc() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isPgc_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.VideoRights)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.VideoRights)
  private static final bilibili.app.nativeact.v1.VideoRights DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.VideoRights();
  }

  public static bilibili.app.nativeact.v1.VideoRights getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoRights>
      PARSER = new com.google.protobuf.AbstractParser<VideoRights>() {
    @java.lang.Override
    public VideoRights parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoRights> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoRights> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.VideoRights getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
