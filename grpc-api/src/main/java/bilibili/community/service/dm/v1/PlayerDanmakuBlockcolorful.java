// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * Protobuf type {@code bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful}
 */
public final class PlayerDanmakuBlockcolorful extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)
    PlayerDanmakuBlockcolorfulOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerDanmakuBlockcolorful.newBuilder() to construct.
  private PlayerDanmakuBlockcolorful(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerDanmakuBlockcolorful() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerDanmakuBlockcolorful();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_PlayerDanmakuBlockcolorful_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_PlayerDanmakuBlockcolorful_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.class, bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private boolean value_ = false;
  /**
   * <code>bool value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public boolean getValue() {
    return value_;
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
    if (value_ != false) {
      output.writeBool(1, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, value_);
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
    if (!(obj instanceof bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)) {
      return super.equals(obj);
    }
    bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful other = (bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful) obj;

    if (getValue()
        != other.getValue()) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful parseFrom(
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
  public static Builder newBuilder(bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful prototype) {
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
   * Protobuf type {@code bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)
      bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorfulOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_PlayerDanmakuBlockcolorful_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_PlayerDanmakuBlockcolorful_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.class, bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.Builder.class);
    }

    // Construct using bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.newBuilder()
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
      value_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_PlayerDanmakuBlockcolorful_descriptor;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful getDefaultInstanceForType() {
      return bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful build() {
      bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful buildPartial() {
      bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful result = new bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful) {
        return mergeFrom((bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful other) {
      if (other == bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful.getDefaultInstance()) return this;
      if (other.getValue() != false) {
        setValue(other.getValue());
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
              value_ = input.readBool();
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

    private boolean value_ ;
    /**
     * <code>bool value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public boolean getValue() {
      return value_;
    }
    /**
     * <code>bool value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(boolean value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)
  }

  // @@protoc_insertion_point(class_scope:bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful)
  private static final bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful();
  }

  public static bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerDanmakuBlockcolorful>
      PARSER = new com.google.protobuf.AbstractParser<PlayerDanmakuBlockcolorful>() {
    @java.lang.Override
    public PlayerDanmakuBlockcolorful parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayerDanmakuBlockcolorful> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerDanmakuBlockcolorful> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.community.service.dm.v1.PlayerDanmakuBlockcolorful getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

