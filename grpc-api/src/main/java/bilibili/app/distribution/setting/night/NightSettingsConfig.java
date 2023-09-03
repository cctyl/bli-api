// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/night.proto

package bilibili.app.distribution.setting.night;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.distribution.setting.night.NightSettingsConfig}
 */
public final class NightSettingsConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.distribution.setting.night.NightSettingsConfig)
    NightSettingsConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NightSettingsConfig.newBuilder() to construct.
  private NightSettingsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NightSettingsConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NightSettingsConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.distribution.setting.night.Night.internal_static_bilibili_app_distribution_setting_night_NightSettingsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.distribution.setting.night.Night.internal_static_bilibili_app_distribution_setting_night_NightSettingsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.distribution.setting.night.NightSettingsConfig.class, bilibili.app.distribution.setting.night.NightSettingsConfig.Builder.class);
  }

  public static final int IS_NIGHT_FOLLOW_SYSTEM_FIELD_NUMBER = 1;
  private bilibili.app.distribution.v1.BoolValue isNightFollowSystem_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
   * @return Whether the isNightFollowSystem field is set.
   */
  @java.lang.Override
  public boolean hasIsNightFollowSystem() {
    return isNightFollowSystem_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
   * @return The isNightFollowSystem.
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.BoolValue getIsNightFollowSystem() {
    return isNightFollowSystem_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : isNightFollowSystem_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.BoolValueOrBuilder getIsNightFollowSystemOrBuilder() {
    return isNightFollowSystem_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : isNightFollowSystem_;
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
    if (isNightFollowSystem_ != null) {
      output.writeMessage(1, getIsNightFollowSystem());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isNightFollowSystem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIsNightFollowSystem());
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
    if (!(obj instanceof bilibili.app.distribution.setting.night.NightSettingsConfig)) {
      return super.equals(obj);
    }
    bilibili.app.distribution.setting.night.NightSettingsConfig other = (bilibili.app.distribution.setting.night.NightSettingsConfig) obj;

    if (hasIsNightFollowSystem() != other.hasIsNightFollowSystem()) return false;
    if (hasIsNightFollowSystem()) {
      if (!getIsNightFollowSystem()
          .equals(other.getIsNightFollowSystem())) return false;
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
    if (hasIsNightFollowSystem()) {
      hash = (37 * hash) + IS_NIGHT_FOLLOW_SYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getIsNightFollowSystem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.night.NightSettingsConfig parseFrom(
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
  public static Builder newBuilder(bilibili.app.distribution.setting.night.NightSettingsConfig prototype) {
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
   * Protobuf type {@code bilibili.app.distribution.setting.night.NightSettingsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.distribution.setting.night.NightSettingsConfig)
      bilibili.app.distribution.setting.night.NightSettingsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.distribution.setting.night.Night.internal_static_bilibili_app_distribution_setting_night_NightSettingsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.distribution.setting.night.Night.internal_static_bilibili_app_distribution_setting_night_NightSettingsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.distribution.setting.night.NightSettingsConfig.class, bilibili.app.distribution.setting.night.NightSettingsConfig.Builder.class);
    }

    // Construct using bilibili.app.distribution.setting.night.NightSettingsConfig.newBuilder()
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
      isNightFollowSystem_ = null;
      if (isNightFollowSystemBuilder_ != null) {
        isNightFollowSystemBuilder_.dispose();
        isNightFollowSystemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.distribution.setting.night.Night.internal_static_bilibili_app_distribution_setting_night_NightSettingsConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.night.NightSettingsConfig getDefaultInstanceForType() {
      return bilibili.app.distribution.setting.night.NightSettingsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.night.NightSettingsConfig build() {
      bilibili.app.distribution.setting.night.NightSettingsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.night.NightSettingsConfig buildPartial() {
      bilibili.app.distribution.setting.night.NightSettingsConfig result = new bilibili.app.distribution.setting.night.NightSettingsConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.distribution.setting.night.NightSettingsConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isNightFollowSystem_ = isNightFollowSystemBuilder_ == null
            ? isNightFollowSystem_
            : isNightFollowSystemBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.distribution.setting.night.NightSettingsConfig) {
        return mergeFrom((bilibili.app.distribution.setting.night.NightSettingsConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.distribution.setting.night.NightSettingsConfig other) {
      if (other == bilibili.app.distribution.setting.night.NightSettingsConfig.getDefaultInstance()) return this;
      if (other.hasIsNightFollowSystem()) {
        mergeIsNightFollowSystem(other.getIsNightFollowSystem());
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
                  getIsNightFollowSystemFieldBuilder().getBuilder(),
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

    private bilibili.app.distribution.v1.BoolValue isNightFollowSystem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder> isNightFollowSystemBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     * @return Whether the isNightFollowSystem field is set.
     */
    public boolean hasIsNightFollowSystem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     * @return The isNightFollowSystem.
     */
    public bilibili.app.distribution.v1.BoolValue getIsNightFollowSystem() {
      if (isNightFollowSystemBuilder_ == null) {
        return isNightFollowSystem_ == null ? bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : isNightFollowSystem_;
      } else {
        return isNightFollowSystemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public Builder setIsNightFollowSystem(bilibili.app.distribution.v1.BoolValue value) {
      if (isNightFollowSystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        isNightFollowSystem_ = value;
      } else {
        isNightFollowSystemBuilder_.setMessage(value);
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
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public Builder setIsNightFollowSystem(
        bilibili.app.distribution.v1.BoolValue.Builder builderForValue) {
      if (isNightFollowSystemBuilder_ == null) {
        isNightFollowSystem_ = builderForValue.build();
      } else {
        isNightFollowSystemBuilder_.setMessage(builderForValue.build());
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
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public Builder mergeIsNightFollowSystem(bilibili.app.distribution.v1.BoolValue value) {
      if (isNightFollowSystemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          isNightFollowSystem_ != null &&
          isNightFollowSystem_ != bilibili.app.distribution.v1.BoolValue.getDefaultInstance()) {
          getIsNightFollowSystemBuilder().mergeFrom(value);
        } else {
          isNightFollowSystem_ = value;
        }
      } else {
        isNightFollowSystemBuilder_.mergeFrom(value);
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
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public Builder clearIsNightFollowSystem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isNightFollowSystem_ = null;
      if (isNightFollowSystemBuilder_ != null) {
        isNightFollowSystemBuilder_.dispose();
        isNightFollowSystemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public bilibili.app.distribution.v1.BoolValue.Builder getIsNightFollowSystemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIsNightFollowSystemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    public bilibili.app.distribution.v1.BoolValueOrBuilder getIsNightFollowSystemOrBuilder() {
      if (isNightFollowSystemBuilder_ != null) {
        return isNightFollowSystemBuilder_.getMessageOrBuilder();
      } else {
        return isNightFollowSystem_ == null ?
            bilibili.app.distribution.v1.BoolValue.getDefaultInstance() : isNightFollowSystem_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.BoolValue is_night_follow_system = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder> 
        getIsNightFollowSystemFieldBuilder() {
      if (isNightFollowSystemBuilder_ == null) {
        isNightFollowSystemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.distribution.v1.BoolValue, bilibili.app.distribution.v1.BoolValue.Builder, bilibili.app.distribution.v1.BoolValueOrBuilder>(
                getIsNightFollowSystem(),
                getParentForChildren(),
                isClean());
        isNightFollowSystem_ = null;
      }
      return isNightFollowSystemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.distribution.setting.night.NightSettingsConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.distribution.setting.night.NightSettingsConfig)
  private static final bilibili.app.distribution.setting.night.NightSettingsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.distribution.setting.night.NightSettingsConfig();
  }

  public static bilibili.app.distribution.setting.night.NightSettingsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NightSettingsConfig>
      PARSER = new com.google.protobuf.AbstractParser<NightSettingsConfig>() {
    @java.lang.Override
    public NightSettingsConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NightSettingsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NightSettingsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.distribution.setting.night.NightSettingsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
