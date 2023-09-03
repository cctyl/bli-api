// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/plugin.proto

package bilibili.dagw.component.avatar.v1.plugin;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig}
 */
public final class LiveAnimeConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)
    LiveAnimeConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LiveAnimeConfig.newBuilder() to construct.
  private LiveAnimeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LiveAnimeConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LiveAnimeConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.class, bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.Builder.class);
  }

  public static final int IS_LIVE_FIELD_NUMBER = 1;
  private boolean isLive_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_live = 1;</code>
   * @return The isLive.
   */
  @java.lang.Override
  public boolean getIsLive() {
    return isLive_;
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
    if (isLive_ != false) {
      output.writeBool(1, isLive_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isLive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isLive_);
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
    if (!(obj instanceof bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)) {
      return super.equals(obj);
    }
    bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig other = (bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig) obj;

    if (getIsLive()
        != other.getIsLive()) return false;
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
    hash = (37 * hash) + IS_LIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig parseFrom(
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
  public static Builder newBuilder(bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig prototype) {
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
   * Protobuf type {@code bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)
      bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.class, bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.Builder.class);
    }

    // Construct using bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.newBuilder()
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
      isLive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig getDefaultInstanceForType() {
      return bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig build() {
      bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig buildPartial() {
      bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig result = new bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isLive_ = isLive_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig) {
        return mergeFrom((bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig other) {
      if (other == bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig.getDefaultInstance()) return this;
      if (other.getIsLive() != false) {
        setIsLive(other.getIsLive());
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
              isLive_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean isLive_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_live = 1;</code>
     * @return The isLive.
     */
    @java.lang.Override
    public boolean getIsLive() {
      return isLive_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_live = 1;</code>
     * @param value The isLive to set.
     * @return This builder for chaining.
     */
    public Builder setIsLive(boolean value) {

      isLive_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_live = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isLive_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig)
  private static final bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig();
  }

  public static bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LiveAnimeConfig>
      PARSER = new com.google.protobuf.AbstractParser<LiveAnimeConfig>() {
    @java.lang.Override
    public LiveAnimeConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LiveAnimeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LiveAnimeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
