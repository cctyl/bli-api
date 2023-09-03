// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.DynamicResp}
 */
public final class DynamicResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.DynamicResp)
    DynamicRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicResp.newBuilder() to construct.
  private DynamicResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.DynamicResp.class, bilibili.app.nativeact.v1.DynamicResp.Builder.class);
  }

  public static final int MODULE_FIELD_NUMBER = 1;
  private bilibili.app.nativeact.v1.Module module_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
   * @return Whether the module field is set.
   */
  @java.lang.Override
  public boolean hasModule() {
    return module_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
   * @return The module.
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.Module getModule() {
    return module_ == null ? bilibili.app.nativeact.v1.Module.getDefaultInstance() : module_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.nativeact.v1.ModuleOrBuilder getModuleOrBuilder() {
    return module_ == null ? bilibili.app.nativeact.v1.Module.getDefaultInstance() : module_;
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
    if (module_ != null) {
      output.writeMessage(1, getModule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (module_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModule());
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
    if (!(obj instanceof bilibili.app.nativeact.v1.DynamicResp)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.DynamicResp other = (bilibili.app.nativeact.v1.DynamicResp) obj;

    if (hasModule() != other.hasModule()) return false;
    if (hasModule()) {
      if (!getModule()
          .equals(other.getModule())) return false;
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
    if (hasModule()) {
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.DynamicResp parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.DynamicResp prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.DynamicResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.DynamicResp)
      bilibili.app.nativeact.v1.DynamicRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.DynamicResp.class, bilibili.app.nativeact.v1.DynamicResp.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.DynamicResp.newBuilder()
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
      module_ = null;
      if (moduleBuilder_ != null) {
        moduleBuilder_.dispose();
        moduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_DynamicResp_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicResp getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.DynamicResp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicResp build() {
      bilibili.app.nativeact.v1.DynamicResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.DynamicResp buildPartial() {
      bilibili.app.nativeact.v1.DynamicResp result = new bilibili.app.nativeact.v1.DynamicResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.DynamicResp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.module_ = moduleBuilder_ == null
            ? module_
            : moduleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.DynamicResp) {
        return mergeFrom((bilibili.app.nativeact.v1.DynamicResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.DynamicResp other) {
      if (other == bilibili.app.nativeact.v1.DynamicResp.getDefaultInstance()) return this;
      if (other.hasModule()) {
        mergeModule(other.getModule());
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
                  getModuleFieldBuilder().getBuilder(),
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

    private bilibili.app.nativeact.v1.Module module_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.Module, bilibili.app.nativeact.v1.Module.Builder, bilibili.app.nativeact.v1.ModuleOrBuilder> moduleBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     * @return Whether the module field is set.
     */
    public boolean hasModule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     * @return The module.
     */
    public bilibili.app.nativeact.v1.Module getModule() {
      if (moduleBuilder_ == null) {
        return module_ == null ? bilibili.app.nativeact.v1.Module.getDefaultInstance() : module_;
      } else {
        return moduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public Builder setModule(bilibili.app.nativeact.v1.Module value) {
      if (moduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        module_ = value;
      } else {
        moduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public Builder setModule(
        bilibili.app.nativeact.v1.Module.Builder builderForValue) {
      if (moduleBuilder_ == null) {
        module_ = builderForValue.build();
      } else {
        moduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public Builder mergeModule(bilibili.app.nativeact.v1.Module value) {
      if (moduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          module_ != null &&
          module_ != bilibili.app.nativeact.v1.Module.getDefaultInstance()) {
          getModuleBuilder().mergeFrom(value);
        } else {
          module_ = value;
        }
      } else {
        moduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public Builder clearModule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      module_ = null;
      if (moduleBuilder_ != null) {
        moduleBuilder_.dispose();
        moduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public bilibili.app.nativeact.v1.Module.Builder getModuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getModuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    public bilibili.app.nativeact.v1.ModuleOrBuilder getModuleOrBuilder() {
      if (moduleBuilder_ != null) {
        return moduleBuilder_.getMessageOrBuilder();
      } else {
        return module_ == null ?
            bilibili.app.nativeact.v1.Module.getDefaultInstance() : module_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.Module module = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.nativeact.v1.Module, bilibili.app.nativeact.v1.Module.Builder, bilibili.app.nativeact.v1.ModuleOrBuilder> 
        getModuleFieldBuilder() {
      if (moduleBuilder_ == null) {
        moduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.nativeact.v1.Module, bilibili.app.nativeact.v1.Module.Builder, bilibili.app.nativeact.v1.ModuleOrBuilder>(
                getModule(),
                getParentForChildren(),
                isClean());
        module_ = null;
      }
      return moduleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.DynamicResp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.DynamicResp)
  private static final bilibili.app.nativeact.v1.DynamicResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.DynamicResp();
  }

  public static bilibili.app.nativeact.v1.DynamicResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicResp>
      PARSER = new com.google.protobuf.AbstractParser<DynamicResp>() {
    @java.lang.Override
    public DynamicResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.DynamicResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

