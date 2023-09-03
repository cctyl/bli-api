// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.HomeSubscribeReply}
 */
public final class HomeSubscribeReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.HomeSubscribeReply)
    HomeSubscribeReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HomeSubscribeReply.newBuilder() to construct.
  private HomeSubscribeReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HomeSubscribeReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HomeSubscribeReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HomeSubscribeReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HomeSubscribeReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.HomeSubscribeReply.class, bilibili.app.dynamic.v2.HomeSubscribeReply.Builder.class);
  }

  public static final int ONLINE_FIELD_NUMBER = 1;
  private int online_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 online = 1;</code>
   * @return The online.
   */
  @java.lang.Override
  public int getOnline() {
    return online_;
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
    if (online_ != 0) {
      output.writeInt32(1, online_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (online_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, online_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.HomeSubscribeReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.HomeSubscribeReply other = (bilibili.app.dynamic.v2.HomeSubscribeReply) obj;

    if (getOnline()
        != other.getOnline()) return false;
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
    hash = (37 * hash) + ONLINE_FIELD_NUMBER;
    hash = (53 * hash) + getOnline();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.HomeSubscribeReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.HomeSubscribeReply prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.HomeSubscribeReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.HomeSubscribeReply)
      bilibili.app.dynamic.v2.HomeSubscribeReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HomeSubscribeReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HomeSubscribeReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.HomeSubscribeReply.class, bilibili.app.dynamic.v2.HomeSubscribeReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.HomeSubscribeReply.newBuilder()
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
      online_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_HomeSubscribeReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HomeSubscribeReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.HomeSubscribeReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HomeSubscribeReply build() {
      bilibili.app.dynamic.v2.HomeSubscribeReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.HomeSubscribeReply buildPartial() {
      bilibili.app.dynamic.v2.HomeSubscribeReply result = new bilibili.app.dynamic.v2.HomeSubscribeReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.HomeSubscribeReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.online_ = online_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.HomeSubscribeReply) {
        return mergeFrom((bilibili.app.dynamic.v2.HomeSubscribeReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.HomeSubscribeReply other) {
      if (other == bilibili.app.dynamic.v2.HomeSubscribeReply.getDefaultInstance()) return this;
      if (other.getOnline() != 0) {
        setOnline(other.getOnline());
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
              online_ = input.readInt32();
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

    private int online_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 online = 1;</code>
     * @return The online.
     */
    @java.lang.Override
    public int getOnline() {
      return online_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 online = 1;</code>
     * @param value The online to set.
     * @return This builder for chaining.
     */
    public Builder setOnline(int value) {

      online_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 online = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnline() {
      bitField0_ = (bitField0_ & ~0x00000001);
      online_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.HomeSubscribeReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.HomeSubscribeReply)
  private static final bilibili.app.dynamic.v2.HomeSubscribeReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.HomeSubscribeReply();
  }

  public static bilibili.app.dynamic.v2.HomeSubscribeReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HomeSubscribeReply>
      PARSER = new com.google.protobuf.AbstractParser<HomeSubscribeReply>() {
    @java.lang.Override
    public HomeSubscribeReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<HomeSubscribeReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HomeSubscribeReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.HomeSubscribeReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

