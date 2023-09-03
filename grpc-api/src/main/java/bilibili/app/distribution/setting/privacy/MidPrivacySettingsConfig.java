// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/privacy.proto

package bilibili.app.distribution.setting.privacy;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig}
 */
public final class MidPrivacySettingsConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)
    MidPrivacySettingsConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MidPrivacySettingsConfig.newBuilder() to construct.
  private MidPrivacySettingsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MidPrivacySettingsConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MidPrivacySettingsConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.distribution.setting.privacy.Privacy.internal_static_bilibili_app_distribution_setting_privacy_MidPrivacySettingsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.distribution.setting.privacy.Privacy.internal_static_bilibili_app_distribution_setting_privacy_MidPrivacySettingsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.class, bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.Builder.class);
  }

  public static final int RECOMMEND_TO_KNOWN_FIELD_NUMBER = 1;
  private bilibili.app.distribution.v1.BoolValue recommendToKnown_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
   * @return Whether the recommendToKnown field is set.
   */
  @java.lang.Override
  public boolean hasRecommendToKnown() {
    return recommendToKnown_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
   * @return The recommendToKnown.
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.BoolValue getRecommendToKnown() {
    return recommendToKnown_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : recommendToKnown_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.BoolValueOrBuilder getRecommendToKnownOrBuilder() {
    return recommendToKnown_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : recommendToKnown_;
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
    if (recommendToKnown_ != null) {
      output.writeMessage(1, getRecommendToKnown());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recommendToKnown_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecommendToKnown());
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
    if (!(obj instanceof bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)) {
      return super.equals(obj);
    }
    bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig other = (bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig) obj;

    if (hasRecommendToKnown() != other.hasRecommendToKnown()) return false;
    if (hasRecommendToKnown()) {
      if (!getRecommendToKnown()
          .equals(other.getRecommendToKnown())) return false;
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
    if (hasRecommendToKnown()) {
      hash = (37 * hash) + RECOMMEND_TO_KNOWN_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendToKnown().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig parseFrom(
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
  public static Builder newBuilder(bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)
      bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.distribution.setting.privacy.Privacy.internal_static_bilibili_app_distribution_setting_privacy_MidPrivacySettingsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.distribution.setting.privacy.Privacy.internal_static_bilibili_app_distribution_setting_privacy_MidPrivacySettingsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.class, bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.Builder.class);
    }

    // Construct using bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.newBuilder()
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
      recommendToKnown_ = null;
      if (recommendToKnownBuilder_ != null) {
        recommendToKnownBuilder_.dispose();
        recommendToKnownBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.distribution.setting.privacy.Privacy.internal_static_bilibili_app_distribution_setting_privacy_MidPrivacySettingsConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig getDefaultInstanceForType() {
      return bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig build() {
      bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig buildPartial() {
      bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig result = new bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recommendToKnown_ = recommendToKnownBuilder_ == null
            ? recommendToKnown_
            : recommendToKnownBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig) {
        return mergeFrom((bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig other) {
      if (other == bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig.getDefaultInstance()) return this;
      if (other.hasRecommendToKnown()) {
        mergeRecommendToKnown(other.getRecommendToKnown());
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
                  getRecommendToKnownFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private bilibili.app.distribution.v1.BoolValue recommendToKnown_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder> recommendToKnownBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     * @return Whether the recommendToKnown field is set.
     */
    public boolean hasRecommendToKnown() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     * @return The recommendToKnown.
     */
    public bilibili.app.distribution.v1.BoolValue getRecommendToKnown() {
      if (recommendToKnownBuilder_ == null) {
        return recommendToKnown_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : recommendToKnown_;
      } else {
        return recommendToKnownBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public Builder setRecommendToKnown(bilibili.app.distribution.v1.BoolValue value) {
      if (recommendToKnownBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recommendToKnown_ = value;
      } else {
        recommendToKnownBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public Builder setRecommendToKnown(
        bilibili.app.distribution.v1.BoolValue.Builder builderForValue) {
      if (recommendToKnownBuilder_ == null) {
        recommendToKnown_ = builderForValue.build();
      } else {
        recommendToKnownBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public Builder mergeRecommendToKnown(bilibili.app.distribution.v1.BoolValue value) {
      if (recommendToKnownBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          recommendToKnown_ != null &&
          recommendToKnown_ != bilibili.app.distribution.v1.BoolValue.getDefaultInstance()) {
          getRecommendToKnownBuilder().mergeFrom(value);
        } else {
          recommendToKnown_ = value;
        }
      } else {
        recommendToKnownBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public Builder clearRecommendToKnown() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recommendToKnown_ = null;
      if (recommendToKnownBuilder_ != null) {
        recommendToKnownBuilder_.dispose();
        recommendToKnownBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public bilibili.app.distribution.v1.BoolValue.Builder getRecommendToKnownBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecommendToKnownFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    public bilibili.app.distribution.v1.BoolValueOrBuilder getRecommendToKnownOrBuilder() {
      if (recommendToKnownBuilder_ != null) {
        return recommendToKnownBuilder_.getMessageOrBuilder();
      } else {
        return recommendToKnown_ == null ?
            bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : recommendToKnown_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue recommend_to_known = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder> 
        getRecommendToKnownFieldBuilder() {
      if (recommendToKnownBuilder_ == null) {
        recommendToKnownBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder>(
                getRecommendToKnown(),
                getParentForChildren(),
                isClean());
        recommendToKnown_ = null;
      }
      return recommendToKnownBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig)
  private static final bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig();
  }

  public static bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MidPrivacySettingsConfig>
      PARSER = new com.google.protobuf.AbstractParser<MidPrivacySettingsConfig>() {
    @java.lang.Override
    public MidPrivacySettingsConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MidPrivacySettingsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MidPrivacySettingsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
