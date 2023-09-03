// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/interfaces/feed/v1/api.proto

package bilibili.main.dynamic.feed.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.main.dynamic.feed.v1.DynamicButtonClickReq}
 */
public final class DynamicButtonClickReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)
    DynamicButtonClickReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicButtonClickReq.newBuilder() to construct.
  private DynamicButtonClickReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicButtonClickReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicButtonClickReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_DynamicButtonClickReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_DynamicButtonClickReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.class, bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)) {
      return super.equals(obj);
    }
    bilibili.main.dynamic.feed.v1.DynamicButtonClickReq other = (bilibili.main.dynamic.feed.v1.DynamicButtonClickReq) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq parseFrom(
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
  public static Builder newBuilder(bilibili.main.dynamic.feed.v1.DynamicButtonClickReq prototype) {
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
   * Protobuf type {@code bilibili.main.dynamic.feed.v1.DynamicButtonClickReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)
      bilibili.main.dynamic.feed.v1.DynamicButtonClickReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_DynamicButtonClickReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_DynamicButtonClickReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.class, bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.Builder.class);
    }

    // Construct using bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_DynamicButtonClickReq_descriptor;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.DynamicButtonClickReq getDefaultInstanceForType() {
      return bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.DynamicButtonClickReq build() {
      bilibili.main.dynamic.feed.v1.DynamicButtonClickReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.DynamicButtonClickReq buildPartial() {
      bilibili.main.dynamic.feed.v1.DynamicButtonClickReq result = new bilibili.main.dynamic.feed.v1.DynamicButtonClickReq(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.main.dynamic.feed.v1.DynamicButtonClickReq) {
        return mergeFrom((bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.main.dynamic.feed.v1.DynamicButtonClickReq other) {
      if (other == bilibili.main.dynamic.feed.v1.DynamicButtonClickReq.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.main.dynamic.feed.v1.DynamicButtonClickReq)
  private static final bilibili.main.dynamic.feed.v1.DynamicButtonClickReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.main.dynamic.feed.v1.DynamicButtonClickReq();
  }

  public static bilibili.main.dynamic.feed.v1.DynamicButtonClickReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicButtonClickReq>
      PARSER = new com.google.protobuf.AbstractParser<DynamicButtonClickReq>() {
    @java.lang.Override
    public DynamicButtonClickReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicButtonClickReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicButtonClickReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.main.dynamic.feed.v1.DynamicButtonClickReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

