// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * 创建动态视频的应答包（透传给客户端）
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.CreateDynVideoResult}
 */
public final class CreateDynVideoResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.CreateDynVideoResult)
    CreateDynVideoResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDynVideoResult.newBuilder() to construct.
  private CreateDynVideoResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDynVideoResult() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDynVideoResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateDynVideoResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateDynVideoResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.CreateDynVideoResult.class, bilibili.dynamic.CreateDynVideoResult.Builder.class);
  }

  public static final int AID_FIELD_NUMBER = 1;
  private long aid_ = 0L;
  /**
   * <pre>
   * 稿件id
   * </pre>
   *
   * <code>int64 aid = 1;</code>
   * @return The aid.
   */
  @java.lang.Override
  public long getAid() {
    return aid_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * 说明信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 说明信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBMITACT_BANNER_FIELD_NUMBER = 3;
  private bilibili.dynamic.DynVideoSubmitActBanner submitactBanner_;
  /**
   * <pre>
   * 推荐的活动信息
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
   * @return Whether the submitactBanner field is set.
   */
  @java.lang.Override
  public boolean hasSubmitactBanner() {
    return submitactBanner_ != null;
  }
  /**
   * <pre>
   * 推荐的活动信息
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
   * @return The submitactBanner.
   */
  @java.lang.Override
  public bilibili.dynamic.DynVideoSubmitActBanner getSubmitactBanner() {
    return submitactBanner_ == null ? bilibili.dynamic.DynVideoSubmitActBanner.getDefaultInstance() : submitactBanner_;
  }
  /**
   * <pre>
   * 推荐的活动信息
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.DynVideoSubmitActBannerOrBuilder getSubmitactBannerOrBuilder() {
    return submitactBanner_ == null ? bilibili.dynamic.DynVideoSubmitActBanner.getDefaultInstance() : submitactBanner_;
  }

  public static final int PUSH_INTRO_FIELD_NUMBER = 4;
  private bilibili.dynamic.DynVideoPushIntro pushIntro_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
   * @return Whether the pushIntro field is set.
   */
  @java.lang.Override
  public boolean hasPushIntro() {
    return pushIntro_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
   * @return The pushIntro.
   */
  @java.lang.Override
  public bilibili.dynamic.DynVideoPushIntro getPushIntro() {
    return pushIntro_ == null ? bilibili.dynamic.DynVideoPushIntro.getDefaultInstance() : pushIntro_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.DynVideoPushIntroOrBuilder getPushIntroOrBuilder() {
    return pushIntro_ == null ? bilibili.dynamic.DynVideoPushIntro.getDefaultInstance() : pushIntro_;
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
    if (aid_ != 0L) {
      output.writeInt64(1, aid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (submitactBanner_ != null) {
      output.writeMessage(3, getSubmitactBanner());
    }
    if (pushIntro_ != null) {
      output.writeMessage(4, getPushIntro());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, aid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (submitactBanner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSubmitactBanner());
    }
    if (pushIntro_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPushIntro());
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
    if (!(obj instanceof bilibili.dynamic.CreateDynVideoResult)) {
      return super.equals(obj);
    }
    bilibili.dynamic.CreateDynVideoResult other = (bilibili.dynamic.CreateDynVideoResult) obj;

    if (getAid()
        != other.getAid()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasSubmitactBanner() != other.hasSubmitactBanner()) return false;
    if (hasSubmitactBanner()) {
      if (!getSubmitactBanner()
          .equals(other.getSubmitactBanner())) return false;
    }
    if (hasPushIntro() != other.hasPushIntro()) return false;
    if (hasPushIntro()) {
      if (!getPushIntro()
          .equals(other.getPushIntro())) return false;
    }
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
    hash = (37 * hash) + AID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAid());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasSubmitactBanner()) {
      hash = (37 * hash) + SUBMITACT_BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitactBanner().hashCode();
    }
    if (hasPushIntro()) {
      hash = (37 * hash) + PUSH_INTRO_FIELD_NUMBER;
      hash = (53 * hash) + getPushIntro().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateDynVideoResult parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.CreateDynVideoResult prototype) {
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
   * 创建动态视频的应答包（透传给客户端）
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.CreateDynVideoResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.CreateDynVideoResult)
      bilibili.dynamic.CreateDynVideoResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateDynVideoResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateDynVideoResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.CreateDynVideoResult.class, bilibili.dynamic.CreateDynVideoResult.Builder.class);
    }

    // Construct using bilibili.dynamic.CreateDynVideoResult.newBuilder()
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
      aid_ = 0L;
      message_ = "";
      submitactBanner_ = null;
      if (submitactBannerBuilder_ != null) {
        submitactBannerBuilder_.dispose();
        submitactBannerBuilder_ = null;
      }
      pushIntro_ = null;
      if (pushIntroBuilder_ != null) {
        pushIntroBuilder_.dispose();
        pushIntroBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateDynVideoResult_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateDynVideoResult getDefaultInstanceForType() {
      return bilibili.dynamic.CreateDynVideoResult.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.CreateDynVideoResult build() {
      bilibili.dynamic.CreateDynVideoResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateDynVideoResult buildPartial() {
      bilibili.dynamic.CreateDynVideoResult result = new bilibili.dynamic.CreateDynVideoResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.CreateDynVideoResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.aid_ = aid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.submitactBanner_ = submitactBannerBuilder_ == null
            ? submitactBanner_
            : submitactBannerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pushIntro_ = pushIntroBuilder_ == null
            ? pushIntro_
            : pushIntroBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.CreateDynVideoResult) {
        return mergeFrom((bilibili.dynamic.CreateDynVideoResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.CreateDynVideoResult other) {
      if (other == bilibili.dynamic.CreateDynVideoResult.getDefaultInstance()) return this;
      if (other.getAid() != 0L) {
        setAid(other.getAid());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSubmitactBanner()) {
        mergeSubmitactBanner(other.getSubmitactBanner());
      }
      if (other.hasPushIntro()) {
        mergePushIntro(other.getPushIntro());
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
              aid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSubmitactBannerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getPushIntroFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long aid_ ;
    /**
     * <pre>
     * 稿件id
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @return The aid.
     */
    @java.lang.Override
    public long getAid() {
      return aid_;
    }
    /**
     * <pre>
     * 稿件id
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @param value The aid to set.
     * @return This builder for chaining.
     */
    public Builder setAid(long value) {

      aid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 稿件id
     * </pre>
     *
     * <code>int64 aid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      aid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * 说明信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 说明信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 说明信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 说明信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 说明信息
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private bilibili.dynamic.DynVideoSubmitActBanner submitactBanner_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynVideoSubmitActBanner, bilibili.dynamic.DynVideoSubmitActBanner.Builder, bilibili.dynamic.DynVideoSubmitActBannerOrBuilder> submitactBannerBuilder_;
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     * @return Whether the submitactBanner field is set.
     */
    public boolean hasSubmitactBanner() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     * @return The submitactBanner.
     */
    public bilibili.dynamic.DynVideoSubmitActBanner getSubmitactBanner() {
      if (submitactBannerBuilder_ == null) {
        return submitactBanner_ == null ? bilibili.dynamic.DynVideoSubmitActBanner.getDefaultInstance() : submitactBanner_;
      } else {
        return submitactBannerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public Builder setSubmitactBanner(bilibili.dynamic.DynVideoSubmitActBanner value) {
      if (submitactBannerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submitactBanner_ = value;
      } else {
        submitactBannerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public Builder setSubmitactBanner(
        bilibili.dynamic.DynVideoSubmitActBanner.Builder builderForValue) {
      if (submitactBannerBuilder_ == null) {
        submitactBanner_ = builderForValue.build();
      } else {
        submitactBannerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public Builder mergeSubmitactBanner(bilibili.dynamic.DynVideoSubmitActBanner value) {
      if (submitactBannerBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          submitactBanner_ != null &&
          submitactBanner_ != bilibili.dynamic.DynVideoSubmitActBanner.getDefaultInstance()) {
          getSubmitactBannerBuilder().mergeFrom(value);
        } else {
          submitactBanner_ = value;
        }
      } else {
        submitactBannerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public Builder clearSubmitactBanner() {
      bitField0_ = (bitField0_ & ~0x00000004);
      submitactBanner_ = null;
      if (submitactBannerBuilder_ != null) {
        submitactBannerBuilder_.dispose();
        submitactBannerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public bilibili.dynamic.DynVideoSubmitActBanner.Builder getSubmitactBannerBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSubmitactBannerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    public bilibili.dynamic.DynVideoSubmitActBannerOrBuilder getSubmitactBannerOrBuilder() {
      if (submitactBannerBuilder_ != null) {
        return submitactBannerBuilder_.getMessageOrBuilder();
      } else {
        return submitactBanner_ == null ?
            bilibili.dynamic.DynVideoSubmitActBanner.getDefaultInstance() : submitactBanner_;
      }
    }
    /**
     * <pre>
     * 推荐的活动信息
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoSubmitActBanner submitact_banner = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynVideoSubmitActBanner, bilibili.dynamic.DynVideoSubmitActBanner.Builder, bilibili.dynamic.DynVideoSubmitActBannerOrBuilder> 
        getSubmitactBannerFieldBuilder() {
      if (submitactBannerBuilder_ == null) {
        submitactBannerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.DynVideoSubmitActBanner, bilibili.dynamic.DynVideoSubmitActBanner.Builder, bilibili.dynamic.DynVideoSubmitActBannerOrBuilder>(
                getSubmitactBanner(),
                getParentForChildren(),
                isClean());
        submitactBanner_ = null;
      }
      return submitactBannerBuilder_;
    }

    private bilibili.dynamic.DynVideoPushIntro pushIntro_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynVideoPushIntro, bilibili.dynamic.DynVideoPushIntro.Builder, bilibili.dynamic.DynVideoPushIntroOrBuilder> pushIntroBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     * @return Whether the pushIntro field is set.
     */
    public boolean hasPushIntro() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     * @return The pushIntro.
     */
    public bilibili.dynamic.DynVideoPushIntro getPushIntro() {
      if (pushIntroBuilder_ == null) {
        return pushIntro_ == null ? bilibili.dynamic.DynVideoPushIntro.getDefaultInstance() : pushIntro_;
      } else {
        return pushIntroBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public Builder setPushIntro(bilibili.dynamic.DynVideoPushIntro value) {
      if (pushIntroBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pushIntro_ = value;
      } else {
        pushIntroBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public Builder setPushIntro(
        bilibili.dynamic.DynVideoPushIntro.Builder builderForValue) {
      if (pushIntroBuilder_ == null) {
        pushIntro_ = builderForValue.build();
      } else {
        pushIntroBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public Builder mergePushIntro(bilibili.dynamic.DynVideoPushIntro value) {
      if (pushIntroBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          pushIntro_ != null &&
          pushIntro_ != bilibili.dynamic.DynVideoPushIntro.getDefaultInstance()) {
          getPushIntroBuilder().mergeFrom(value);
        } else {
          pushIntro_ = value;
        }
      } else {
        pushIntroBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public Builder clearPushIntro() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pushIntro_ = null;
      if (pushIntroBuilder_ != null) {
        pushIntroBuilder_.dispose();
        pushIntroBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public bilibili.dynamic.DynVideoPushIntro.Builder getPushIntroBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getPushIntroFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    public bilibili.dynamic.DynVideoPushIntroOrBuilder getPushIntroOrBuilder() {
      if (pushIntroBuilder_ != null) {
        return pushIntroBuilder_.getMessageOrBuilder();
      } else {
        return pushIntro_ == null ?
            bilibili.dynamic.DynVideoPushIntro.getDefaultInstance() : pushIntro_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.dynamic.DynVideoPushIntro push_intro = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynVideoPushIntro, bilibili.dynamic.DynVideoPushIntro.Builder, bilibili.dynamic.DynVideoPushIntroOrBuilder> 
        getPushIntroFieldBuilder() {
      if (pushIntroBuilder_ == null) {
        pushIntroBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.DynVideoPushIntro, bilibili.dynamic.DynVideoPushIntro.Builder, bilibili.dynamic.DynVideoPushIntroOrBuilder>(
                getPushIntro(),
                getParentForChildren(),
                isClean());
        pushIntro_ = null;
      }
      return pushIntroBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.CreateDynVideoResult)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.CreateDynVideoResult)
  private static final bilibili.dynamic.CreateDynVideoResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.CreateDynVideoResult();
  }

  public static bilibili.dynamic.CreateDynVideoResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDynVideoResult>
      PARSER = new com.google.protobuf.AbstractParser<CreateDynVideoResult>() {
    @java.lang.Override
    public CreateDynVideoResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDynVideoResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDynVideoResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.CreateDynVideoResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

