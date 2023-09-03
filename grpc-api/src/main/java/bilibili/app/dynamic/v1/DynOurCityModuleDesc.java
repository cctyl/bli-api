// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 动态同城物料-描述模块
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynOurCityModuleDesc}
 */
public final class DynOurCityModuleDesc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynOurCityModuleDesc)
    DynOurCityModuleDescOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynOurCityModuleDesc.newBuilder() to construct.
  private DynOurCityModuleDesc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynOurCityModuleDesc() {
    desc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynOurCityModuleDesc();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleDesc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleDesc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.DynOurCityModuleDesc.class, bilibili.app.dynamic.v1.DynOurCityModuleDesc.Builder.class);
  }

  public static final int DESC_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc_ = "";
  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string desc = 1;</code>
   * @return The desc.
   */
  @java.lang.Override
  public java.lang.String getDesc() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string desc = 1;</code>
   * @return The bytes for desc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescBytes() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, desc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, desc_);
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
    if (!(obj instanceof bilibili.app.dynamic.v1.DynOurCityModuleDesc)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.DynOurCityModuleDesc other = (bilibili.app.dynamic.v1.DynOurCityModuleDesc) obj;

    if (!getDesc()
        .equals(other.getDesc())) return false;
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
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.DynOurCityModuleDesc prototype) {
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
   * 动态同城物料-描述模块
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DynOurCityModuleDesc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynOurCityModuleDesc)
      bilibili.app.dynamic.v1.DynOurCityModuleDescOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleDesc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleDesc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.DynOurCityModuleDesc.class, bilibili.app.dynamic.v1.DynOurCityModuleDesc.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.DynOurCityModuleDesc.newBuilder()
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
      desc_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleDesc_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynOurCityModuleDesc getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.DynOurCityModuleDesc.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynOurCityModuleDesc build() {
      bilibili.app.dynamic.v1.DynOurCityModuleDesc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.DynOurCityModuleDesc buildPartial() {
      bilibili.app.dynamic.v1.DynOurCityModuleDesc result = new bilibili.app.dynamic.v1.DynOurCityModuleDesc(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v1.DynOurCityModuleDesc result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.desc_ = desc_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.DynOurCityModuleDesc) {
        return mergeFrom((bilibili.app.dynamic.v1.DynOurCityModuleDesc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.DynOurCityModuleDesc other) {
      if (other == bilibili.app.dynamic.v1.DynOurCityModuleDesc.getDefaultInstance()) return this;
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              desc_ = input.readStringRequireUtf8();
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

    private java.lang.Object desc_ = "";
    /**
     * <pre>
     * 描述信息
     * </pre>
     *
     * <code>string desc = 1;</code>
     * @return The desc.
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 描述信息
     * </pre>
     *
     * <code>string desc = 1;</code>
     * @return The bytes for desc.
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 描述信息
     * </pre>
     *
     * <code>string desc = 1;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 描述信息
     * </pre>
     *
     * <code>string desc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      desc_ = getDefaultInstance().getDesc();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 描述信息
     * </pre>
     *
     * <code>string desc = 1;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynOurCityModuleDesc)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynOurCityModuleDesc)
  private static final bilibili.app.dynamic.v1.DynOurCityModuleDesc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.DynOurCityModuleDesc();
  }

  public static bilibili.app.dynamic.v1.DynOurCityModuleDesc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynOurCityModuleDesc>
      PARSER = new com.google.protobuf.AbstractParser<DynOurCityModuleDesc>() {
    @java.lang.Override
    public DynOurCityModuleDesc parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynOurCityModuleDesc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynOurCityModuleDesc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.DynOurCityModuleDesc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
