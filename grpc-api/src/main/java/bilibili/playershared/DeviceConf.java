// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.playershared.DeviceConf}
 */
public final class DeviceConf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.playershared.DeviceConf)
    DeviceConfOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceConf.newBuilder() to construct.
  private DeviceConf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceConf() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceConf();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_DeviceConf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_DeviceConf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.playershared.DeviceConf.class, bilibili.playershared.DeviceConf.Builder.class);
  }

  public static final int CONF_VALUE_FIELD_NUMBER = 1;
  private bilibili.playershared.ConfValue confValue_;
  /**
   * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
   * @return Whether the confValue field is set.
   */
  @java.lang.Override
  public boolean hasConfValue() {
    return confValue_ != null;
  }
  /**
   * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
   * @return The confValue.
   */
  @java.lang.Override
  public bilibili.playershared.ConfValue getConfValue() {
    return confValue_ == null ? bilibili.playershared.ConfValue.getDefaultInstance() : confValue_;
  }
  /**
   * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
   */
  @java.lang.Override
  public bilibili.playershared.ConfValueOrBuilder getConfValueOrBuilder() {
    return confValue_ == null ? bilibili.playershared.ConfValue.getDefaultInstance() : confValue_;
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
    if (confValue_ != null) {
      output.writeMessage(1, getConfValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (confValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfValue());
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
    if (!(obj instanceof bilibili.playershared.DeviceConf)) {
      return super.equals(obj);
    }
    bilibili.playershared.DeviceConf other = (bilibili.playershared.DeviceConf) obj;

    if (hasConfValue() != other.hasConfValue()) return false;
    if (hasConfValue()) {
      if (!getConfValue()
          .equals(other.getConfValue())) return false;
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
    if (hasConfValue()) {
      hash = (37 * hash) + CONF_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getConfValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.playershared.DeviceConf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.DeviceConf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.DeviceConf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.DeviceConf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.playershared.DeviceConf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.DeviceConf parseFrom(
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
  public static Builder newBuilder(bilibili.playershared.DeviceConf prototype) {
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
   * Protobuf type {@code bilibili.playershared.DeviceConf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.playershared.DeviceConf)
      bilibili.playershared.DeviceConfOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_DeviceConf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_DeviceConf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.playershared.DeviceConf.class, bilibili.playershared.DeviceConf.Builder.class);
    }

    // Construct using bilibili.playershared.DeviceConf.newBuilder()
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
      confValue_ = null;
      if (confValueBuilder_ != null) {
        confValueBuilder_.dispose();
        confValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_DeviceConf_descriptor;
    }

    @java.lang.Override
    public bilibili.playershared.DeviceConf getDefaultInstanceForType() {
      return bilibili.playershared.DeviceConf.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.playershared.DeviceConf build() {
      bilibili.playershared.DeviceConf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.playershared.DeviceConf buildPartial() {
      bilibili.playershared.DeviceConf result = new bilibili.playershared.DeviceConf(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.playershared.DeviceConf result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.confValue_ = confValueBuilder_ == null
            ? confValue_
            : confValueBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.playershared.DeviceConf) {
        return mergeFrom((bilibili.playershared.DeviceConf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.playershared.DeviceConf other) {
      if (other == bilibili.playershared.DeviceConf.getDefaultInstance()) return this;
      if (other.hasConfValue()) {
        mergeConfValue(other.getConfValue());
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
                  getConfValueFieldBuilder().getBuilder(),
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

    private bilibili.playershared.ConfValue confValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.ConfValue, bilibili.playershared.ConfValue.Builder, bilibili.playershared.ConfValueOrBuilder> confValueBuilder_;
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     * @return Whether the confValue field is set.
     */
    public boolean hasConfValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     * @return The confValue.
     */
    public bilibili.playershared.ConfValue getConfValue() {
      if (confValueBuilder_ == null) {
        return confValue_ == null ? bilibili.playershared.ConfValue.getDefaultInstance() : confValue_;
      } else {
        return confValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public Builder setConfValue(bilibili.playershared.ConfValue value) {
      if (confValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        confValue_ = value;
      } else {
        confValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public Builder setConfValue(
        bilibili.playershared.ConfValue.Builder builderForValue) {
      if (confValueBuilder_ == null) {
        confValue_ = builderForValue.build();
      } else {
        confValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public Builder mergeConfValue(bilibili.playershared.ConfValue value) {
      if (confValueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          confValue_ != null &&
          confValue_ != bilibili.playershared.ConfValue.getDefaultInstance()) {
          getConfValueBuilder().mergeFrom(value);
        } else {
          confValue_ = value;
        }
      } else {
        confValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public Builder clearConfValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      confValue_ = null;
      if (confValueBuilder_ != null) {
        confValueBuilder_.dispose();
        confValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public bilibili.playershared.ConfValue.Builder getConfValueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConfValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    public bilibili.playershared.ConfValueOrBuilder getConfValueOrBuilder() {
      if (confValueBuilder_ != null) {
        return confValueBuilder_.getMessageOrBuilder();
      } else {
        return confValue_ == null ?
            bilibili.playershared.ConfValue.getDefaultInstance() : confValue_;
      }
    }
    /**
     * <code>.bilibili.playershared.ConfValue conf_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.ConfValue, bilibili.playershared.ConfValue.Builder, bilibili.playershared.ConfValueOrBuilder> 
        getConfValueFieldBuilder() {
      if (confValueBuilder_ == null) {
        confValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.playershared.ConfValue, bilibili.playershared.ConfValue.Builder, bilibili.playershared.ConfValueOrBuilder>(
                getConfValue(),
                getParentForChildren(),
                isClean());
        confValue_ = null;
      }
      return confValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.playershared.DeviceConf)
  }

  // @@protoc_insertion_point(class_scope:bilibili.playershared.DeviceConf)
  private static final bilibili.playershared.DeviceConf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.playershared.DeviceConf();
  }

  public static bilibili.playershared.DeviceConf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceConf>
      PARSER = new com.google.protobuf.AbstractParser<DeviceConf>() {
    @java.lang.Override
    public DeviceConf parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceConf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceConf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.playershared.DeviceConf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
