// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 广告配置
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.CMConfig}
 */
public final class CMConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.CMConfig)
    CMConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CMConfig.newBuilder() to construct.
  private CMConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CMConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CMConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CMConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CMConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.CMConfig.class, bilibili.app.view.v1.CMConfig.Builder.class);
  }

  public static final int ADS_CONTROL_FIELD_NUMBER = 1;
  private com.google.protobuf.Any adsControl_;
  /**
   * <pre>
   * 广告配置数据(需要二次解包)
   * </pre>
   *
   * <code>.google.protobuf.Any ads_control = 1;</code>
   * @return Whether the adsControl field is set.
   */
  @java.lang.Override
  public boolean hasAdsControl() {
    return adsControl_ != null;
  }
  /**
   * <pre>
   * 广告配置数据(需要二次解包)
   * </pre>
   *
   * <code>.google.protobuf.Any ads_control = 1;</code>
   * @return The adsControl.
   */
  @java.lang.Override
  public com.google.protobuf.Any getAdsControl() {
    return adsControl_ == null ? com.google.protobuf.Any.getDefaultInstance() : adsControl_;
  }
  /**
   * <pre>
   * 广告配置数据(需要二次解包)
   * </pre>
   *
   * <code>.google.protobuf.Any ads_control = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getAdsControlOrBuilder() {
    return adsControl_ == null ? com.google.protobuf.Any.getDefaultInstance() : adsControl_;
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
    if (adsControl_ != null) {
      output.writeMessage(1, getAdsControl());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adsControl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdsControl());
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
    if (!(obj instanceof bilibili.app.view.v1.CMConfig)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.CMConfig other = (bilibili.app.view.v1.CMConfig) obj;

    if (hasAdsControl() != other.hasAdsControl()) return false;
    if (hasAdsControl()) {
      if (!getAdsControl()
          .equals(other.getAdsControl())) return false;
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
    if (hasAdsControl()) {
      hash = (37 * hash) + ADS_CONTROL_FIELD_NUMBER;
      hash = (53 * hash) + getAdsControl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.CMConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.CMConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CMConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CMConfig parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.CMConfig prototype) {
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
   * 广告配置
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.CMConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.CMConfig)
      bilibili.app.view.v1.CMConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CMConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CMConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.CMConfig.class, bilibili.app.view.v1.CMConfig.Builder.class);
    }

    // Construct using bilibili.app.view.v1.CMConfig.newBuilder()
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
      adsControl_ = null;
      if (adsControlBuilder_ != null) {
        adsControlBuilder_.dispose();
        adsControlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CMConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.CMConfig getDefaultInstanceForType() {
      return bilibili.app.view.v1.CMConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.CMConfig build() {
      bilibili.app.view.v1.CMConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.CMConfig buildPartial() {
      bilibili.app.view.v1.CMConfig result = new bilibili.app.view.v1.CMConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.CMConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adsControl_ = adsControlBuilder_ == null
            ? adsControl_
            : adsControlBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.CMConfig) {
        return mergeFrom((bilibili.app.view.v1.CMConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.CMConfig other) {
      if (other == bilibili.app.view.v1.CMConfig.getDefaultInstance()) return this;
      if (other.hasAdsControl()) {
        mergeAdsControl(other.getAdsControl());
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
                  getAdsControlFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Any adsControl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> adsControlBuilder_;
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     * @return Whether the adsControl field is set.
     */
    public boolean hasAdsControl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     * @return The adsControl.
     */
    public com.google.protobuf.Any getAdsControl() {
      if (adsControlBuilder_ == null) {
        return adsControl_ == null ? com.google.protobuf.Any.getDefaultInstance() : adsControl_;
      } else {
        return adsControlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public Builder setAdsControl(com.google.protobuf.Any value) {
      if (adsControlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adsControl_ = value;
      } else {
        adsControlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public Builder setAdsControl(
        com.google.protobuf.Any.Builder builderForValue) {
      if (adsControlBuilder_ == null) {
        adsControl_ = builderForValue.build();
      } else {
        adsControlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public Builder mergeAdsControl(com.google.protobuf.Any value) {
      if (adsControlBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          adsControl_ != null &&
          adsControl_ != com.google.protobuf.Any.getDefaultInstance()) {
          getAdsControlBuilder().mergeFrom(value);
        } else {
          adsControl_ = value;
        }
      } else {
        adsControlBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public Builder clearAdsControl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adsControl_ = null;
      if (adsControlBuilder_ != null) {
        adsControlBuilder_.dispose();
        adsControlBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public com.google.protobuf.Any.Builder getAdsControlBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAdsControlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    public com.google.protobuf.AnyOrBuilder getAdsControlOrBuilder() {
      if (adsControlBuilder_ != null) {
        return adsControlBuilder_.getMessageOrBuilder();
      } else {
        return adsControl_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : adsControl_;
      }
    }
    /**
     * <pre>
     * 广告配置数据(需要二次解包)
     * </pre>
     *
     * <code>.google.protobuf.Any ads_control = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAdsControlFieldBuilder() {
      if (adsControlBuilder_ == null) {
        adsControlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getAdsControl(),
                getParentForChildren(),
                isClean());
        adsControl_ = null;
      }
      return adsControlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.CMConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.CMConfig)
  private static final bilibili.app.view.v1.CMConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.CMConfig();
  }

  public static bilibili.app.view.v1.CMConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CMConfig>
      PARSER = new com.google.protobuf.AbstractParser<CMConfig>() {
    @java.lang.Override
    public CMConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CMConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CMConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.CMConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

