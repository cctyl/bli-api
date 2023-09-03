// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ModuleTopicBrief}
 */
public final class ModuleTopicBrief extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ModuleTopicBrief)
    ModuleTopicBriefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleTopicBrief.newBuilder() to construct.
  private ModuleTopicBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleTopicBrief() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleTopicBrief();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleTopicBrief_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleTopicBrief_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.ModuleTopicBrief.class, bilibili.app.dynamic.v2.ModuleTopicBrief.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private bilibili.app.dynamic.v2.TopicItem topic_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
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
   * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.TopicItem getTopic() {
    return topic_ == null ? bilibili.app.dynamic.v2.TopicItem.getDefaultInstance() : topic_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.TopicItemOrBuilder getTopicOrBuilder() {
    return topic_ == null ? bilibili.app.dynamic.v2.TopicItem.getDefaultInstance() : topic_;
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
    if (!(obj instanceof bilibili.app.dynamic.v2.ModuleTopicBrief)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.ModuleTopicBrief other = (bilibili.app.dynamic.v2.ModuleTopicBrief) obj;

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

  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ModuleTopicBrief parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.ModuleTopicBrief prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.ModuleTopicBrief}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ModuleTopicBrief)
      bilibili.app.dynamic.v2.ModuleTopicBriefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleTopicBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleTopicBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.ModuleTopicBrief.class, bilibili.app.dynamic.v2.ModuleTopicBrief.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.ModuleTopicBrief.newBuilder()
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
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleTopicBrief_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ModuleTopicBrief getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.ModuleTopicBrief.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ModuleTopicBrief build() {
      bilibili.app.dynamic.v2.ModuleTopicBrief result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ModuleTopicBrief buildPartial() {
      bilibili.app.dynamic.v2.ModuleTopicBrief result = new bilibili.app.dynamic.v2.ModuleTopicBrief(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.ModuleTopicBrief result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topicBuilder_ == null
            ? topic_
            : topicBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.ModuleTopicBrief) {
        return mergeFrom((bilibili.app.dynamic.v2.ModuleTopicBrief)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.ModuleTopicBrief other) {
      if (other == bilibili.app.dynamic.v2.ModuleTopicBrief.getDefaultInstance()) return this;
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

    private bilibili.app.dynamic.v2.TopicItem topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.TopicItem, bilibili.app.dynamic.v2.TopicItem.Builder, bilibili.app.dynamic.v2.TopicItemOrBuilder> topicBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     * @return The topic.
     */
    public bilibili.app.dynamic.v2.TopicItem getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? bilibili.app.dynamic.v2.TopicItem.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    public Builder setTopic(bilibili.app.dynamic.v2.TopicItem value) {
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
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    public Builder setTopic(
        bilibili.app.dynamic.v2.TopicItem.Builder builderForValue) {
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
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    public Builder mergeTopic(bilibili.app.dynamic.v2.TopicItem value) {
      if (topicBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          topic_ != null &&
          topic_ != bilibili.app.dynamic.v2.TopicItem.getDefaultInstance()) {
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
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
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
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    public bilibili.app.dynamic.v2.TopicItem.Builder getTopicBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    public bilibili.app.dynamic.v2.TopicItemOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            bilibili.app.dynamic.v2.TopicItem.getDefaultInstance() : topic_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.TopicItem topic = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.TopicItem, bilibili.app.dynamic.v2.TopicItem.Builder, bilibili.app.dynamic.v2.TopicItemOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.TopicItem, bilibili.app.dynamic.v2.TopicItem.Builder, bilibili.app.dynamic.v2.TopicItemOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ModuleTopicBrief)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ModuleTopicBrief)
  private static final bilibili.app.dynamic.v2.ModuleTopicBrief DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.ModuleTopicBrief();
  }

  public static bilibili.app.dynamic.v2.ModuleTopicBrief getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleTopicBrief>
      PARSER = new com.google.protobuf.AbstractParser<ModuleTopicBrief>() {
    @java.lang.Override
    public ModuleTopicBrief parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModuleTopicBrief> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleTopicBrief> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.ModuleTopicBrief getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
