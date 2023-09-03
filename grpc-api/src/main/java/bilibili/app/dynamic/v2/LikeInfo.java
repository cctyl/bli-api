// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 点赞拓展信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.LikeInfo}
 */
public final class LikeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.LikeInfo)
    LikeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LikeInfo.newBuilder() to construct.
  private LikeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LikeInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LikeInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LikeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LikeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.LikeInfo.class, bilibili.app.dynamic.v2.LikeInfo.Builder.class);
  }

  public static final int ANIMATION_FIELD_NUMBER = 1;
  private bilibili.app.dynamic.v2.LikeAnimation animation_;
  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   * @return Whether the animation field is set.
   */
  @java.lang.Override
  public boolean hasAnimation() {
    return animation_ != null;
  }
  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   * @return The animation.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.LikeAnimation getAnimation() {
    return animation_ == null ? bilibili.app.dynamic.v2.LikeAnimation.getDefaultInstance() : animation_;
  }
  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.LikeAnimationOrBuilder getAnimationOrBuilder() {
    return animation_ == null ? bilibili.app.dynamic.v2.LikeAnimation.getDefaultInstance() : animation_;
  }

  public static final int IS_LIKE_FIELD_NUMBER = 2;
  private boolean isLike_ = false;
  /**
   * <pre>
   * 是否点赞
   * </pre>
   *
   * <code>bool is_like = 2;</code>
   * @return The isLike.
   */
  @java.lang.Override
  public boolean getIsLike() {
    return isLike_;
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
    if (animation_ != null) {
      output.writeMessage(1, getAnimation());
    }
    if (isLike_ != false) {
      output.writeBool(2, isLike_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (animation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAnimation());
    }
    if (isLike_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isLike_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.LikeInfo)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.LikeInfo other = (bilibili.app.dynamic.v2.LikeInfo) obj;

    if (hasAnimation() != other.hasAnimation()) return false;
    if (hasAnimation()) {
      if (!getAnimation()
          .equals(other.getAnimation())) return false;
    }
    if (getIsLike()
        != other.getIsLike()) return false;
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
    if (hasAnimation()) {
      hash = (37 * hash) + ANIMATION_FIELD_NUMBER;
      hash = (53 * hash) + getAnimation().hashCode();
    }
    hash = (37 * hash) + IS_LIKE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLike());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LikeInfo parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.LikeInfo prototype) {
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
   * 点赞拓展信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.LikeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.LikeInfo)
      bilibili.app.dynamic.v2.LikeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LikeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LikeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.LikeInfo.class, bilibili.app.dynamic.v2.LikeInfo.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.LikeInfo.newBuilder()
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
      animation_ = null;
      if (animationBuilder_ != null) {
        animationBuilder_.dispose();
        animationBuilder_ = null;
      }
      isLike_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LikeInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LikeInfo getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.LikeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LikeInfo build() {
      bilibili.app.dynamic.v2.LikeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LikeInfo buildPartial() {
      bilibili.app.dynamic.v2.LikeInfo result = new bilibili.app.dynamic.v2.LikeInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.LikeInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.animation_ = animationBuilder_ == null
            ? animation_
            : animationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isLike_ = isLike_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.LikeInfo) {
        return mergeFrom((bilibili.app.dynamic.v2.LikeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.LikeInfo other) {
      if (other == bilibili.app.dynamic.v2.LikeInfo.getDefaultInstance()) return this;
      if (other.hasAnimation()) {
        mergeAnimation(other.getAnimation());
      }
      if (other.getIsLike() != false) {
        setIsLike(other.getIsLike());
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
                  getAnimationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              isLike_ = input.readBool();
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

    private bilibili.app.dynamic.v2.LikeAnimation animation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.LikeAnimation, bilibili.app.dynamic.v2.LikeAnimation.Builder, bilibili.app.dynamic.v2.LikeAnimationOrBuilder> animationBuilder_;
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     * @return Whether the animation field is set.
     */
    public boolean hasAnimation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     * @return The animation.
     */
    public bilibili.app.dynamic.v2.LikeAnimation getAnimation() {
      if (animationBuilder_ == null) {
        return animation_ == null ? bilibili.app.dynamic.v2.LikeAnimation.getDefaultInstance() : animation_;
      } else {
        return animationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public Builder setAnimation(bilibili.app.dynamic.v2.LikeAnimation value) {
      if (animationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        animation_ = value;
      } else {
        animationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public Builder setAnimation(
        bilibili.app.dynamic.v2.LikeAnimation.Builder builderForValue) {
      if (animationBuilder_ == null) {
        animation_ = builderForValue.build();
      } else {
        animationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public Builder mergeAnimation(bilibili.app.dynamic.v2.LikeAnimation value) {
      if (animationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          animation_ != null &&
          animation_ != bilibili.app.dynamic.v2.LikeAnimation.getDefaultInstance()) {
          getAnimationBuilder().mergeFrom(value);
        } else {
          animation_ = value;
        }
      } else {
        animationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public Builder clearAnimation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      animation_ = null;
      if (animationBuilder_ != null) {
        animationBuilder_.dispose();
        animationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public bilibili.app.dynamic.v2.LikeAnimation.Builder getAnimationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAnimationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    public bilibili.app.dynamic.v2.LikeAnimationOrBuilder getAnimationOrBuilder() {
      if (animationBuilder_ != null) {
        return animationBuilder_.getMessageOrBuilder();
      } else {
        return animation_ == null ?
            bilibili.app.dynamic.v2.LikeAnimation.getDefaultInstance() : animation_;
      }
    }
    /**
     * <pre>
     * 点赞动画
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.LikeAnimation, bilibili.app.dynamic.v2.LikeAnimation.Builder, bilibili.app.dynamic.v2.LikeAnimationOrBuilder> 
        getAnimationFieldBuilder() {
      if (animationBuilder_ == null) {
        animationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.LikeAnimation, bilibili.app.dynamic.v2.LikeAnimation.Builder, bilibili.app.dynamic.v2.LikeAnimationOrBuilder>(
                getAnimation(),
                getParentForChildren(),
                isClean());
        animation_ = null;
      }
      return animationBuilder_;
    }

    private boolean isLike_ ;
    /**
     * <pre>
     * 是否点赞
     * </pre>
     *
     * <code>bool is_like = 2;</code>
     * @return The isLike.
     */
    @java.lang.Override
    public boolean getIsLike() {
      return isLike_;
    }
    /**
     * <pre>
     * 是否点赞
     * </pre>
     *
     * <code>bool is_like = 2;</code>
     * @param value The isLike to set.
     * @return This builder for chaining.
     */
    public Builder setIsLike(boolean value) {

      isLike_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否点赞
     * </pre>
     *
     * <code>bool is_like = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLike() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isLike_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.LikeInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.LikeInfo)
  private static final bilibili.app.dynamic.v2.LikeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.LikeInfo();
  }

  public static bilibili.app.dynamic.v2.LikeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LikeInfo>
      PARSER = new com.google.protobuf.AbstractParser<LikeInfo>() {
    @java.lang.Override
    public LikeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<LikeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LikeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.LikeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
