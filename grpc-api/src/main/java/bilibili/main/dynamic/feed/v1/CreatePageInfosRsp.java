// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/interfaces/feed/v1/api.proto

package bilibili.main.dynamic.feed.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.main.dynamic.feed.v1.CreatePageInfosRsp}
 */
public final class CreatePageInfosRsp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)
    CreatePageInfosRspOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePageInfosRsp.newBuilder() to construct.
  private CreatePageInfosRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePageInfosRsp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePageInfosRsp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_CreatePageInfosRsp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_CreatePageInfosRsp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.class, bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return topic_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public bilibili.main.dynamic.feed.v1.CreatePageTopicInfo getTopic() {
    return topic_ == null ? bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.getDefaultInstance() : topic_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
   */
  @java.lang.Override
  public bilibili.main.dynamic.feed.v1.CreatePageTopicInfoOrBuilder getTopicOrBuilder() {
    return topic_ == null ? bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.getDefaultInstance() : topic_;
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
    if (topic_ != null) {
      output.writeMessage(1, getTopic());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topic_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTopic());
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
    if (!(obj instanceof bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)) {
      return super.equals(obj);
    }
    bilibili.main.dynamic.feed.v1.CreatePageInfosRsp other = (bilibili.main.dynamic.feed.v1.CreatePageInfosRsp) obj;

    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic()
          .equals(other.getTopic())) return false;
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
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp parseFrom(
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
  public static Builder newBuilder(bilibili.main.dynamic.feed.v1.CreatePageInfosRsp prototype) {
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
   * Protobuf type {@code bilibili.main.dynamic.feed.v1.CreatePageInfosRsp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)
      bilibili.main.dynamic.feed.v1.CreatePageInfosRspOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_CreatePageInfosRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_CreatePageInfosRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.class, bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.Builder.class);
    }

    // Construct using bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.newBuilder()
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
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_CreatePageInfosRsp_descriptor;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.CreatePageInfosRsp getDefaultInstanceForType() {
      return bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.CreatePageInfosRsp build() {
      bilibili.main.dynamic.feed.v1.CreatePageInfosRsp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.CreatePageInfosRsp buildPartial() {
      bilibili.main.dynamic.feed.v1.CreatePageInfosRsp result = new bilibili.main.dynamic.feed.v1.CreatePageInfosRsp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.main.dynamic.feed.v1.CreatePageInfosRsp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topicBuilder_ == null
            ? topic_
            : topicBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.main.dynamic.feed.v1.CreatePageInfosRsp) {
        return mergeFrom((bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.main.dynamic.feed.v1.CreatePageInfosRsp other) {
      if (other == bilibili.main.dynamic.feed.v1.CreatePageInfosRsp.getDefaultInstance()) return this;
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
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
                  getTopicFieldBuilder().getBuilder(),
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

    private bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.main.dynamic.feed.v1.CreatePageTopicInfo, bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.Builder, bilibili.main.dynamic.feed.v1.CreatePageTopicInfoOrBuilder> topicBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     * @return The topic.
     */
    public bilibili.main.dynamic.feed.v1.CreatePageTopicInfo getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public Builder setTopic(bilibili.main.dynamic.feed.v1.CreatePageTopicInfo value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
      } else {
        topicBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public Builder setTopic(
        bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public Builder mergeTopic(bilibili.main.dynamic.feed.v1.CreatePageTopicInfo value) {
      if (topicBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          topic_ != null &&
          topic_ != bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.getDefaultInstance()) {
          getTopicBuilder().mergeFrom(value);
        } else {
          topic_ = value;
        }
      } else {
        topicBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public Builder clearTopic() {
      bitField0_ = (bitField0_ & ~0x00000001);
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.Builder getTopicBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    public bilibili.main.dynamic.feed.v1.CreatePageTopicInfoOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.getDefaultInstance() : topic_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.CreatePageTopicInfo topic = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.main.dynamic.feed.v1.CreatePageTopicInfo, bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.Builder, bilibili.main.dynamic.feed.v1.CreatePageTopicInfoOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.main.dynamic.feed.v1.CreatePageTopicInfo, bilibili.main.dynamic.feed.v1.CreatePageTopicInfo.Builder, bilibili.main.dynamic.feed.v1.CreatePageTopicInfoOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.main.dynamic.feed.v1.CreatePageInfosRsp)
  private static final bilibili.main.dynamic.feed.v1.CreatePageInfosRsp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.main.dynamic.feed.v1.CreatePageInfosRsp();
  }

  public static bilibili.main.dynamic.feed.v1.CreatePageInfosRsp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePageInfosRsp>
      PARSER = new com.google.protobuf.AbstractParser<CreatePageInfosRsp>() {
    @java.lang.Override
    public CreatePageInfosRsp parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePageInfosRsp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePageInfosRsp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.main.dynamic.feed.v1.CreatePageInfosRsp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
