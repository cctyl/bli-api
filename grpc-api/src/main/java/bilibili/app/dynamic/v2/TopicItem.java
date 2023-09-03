// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.TopicItem}
 */
public final class TopicItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.TopicItem)
    TopicItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicItem.newBuilder() to construct.
  private TopicItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicItem() {
    topicName_ = "";
    url_ = "";
    desc_ = "";
    desc2_ = "";
    rcmdDesc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TopicItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TopicItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.TopicItem.class, bilibili.app.dynamic.v2.TopicItem.Builder.class);
  }

  public static final int TOPIC_ID_FIELD_NUMBER = 1;
  private long topicId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 topic_id = 1;</code>
   * @return The topicId.
   */
  @java.lang.Override
  public long getTopicId() {
    return topicId_;
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object topicName_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string topic_name = 2;</code>
   * @return The topicName.
   */
  @java.lang.Override
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string topic_name = 2;</code>
   * @return The bytes for topicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 4;</code>
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
   * </pre>
   *
   * <code>string desc = 4;</code>
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

  public static final int DESC2_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc2_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 5;</code>
   * @return The desc2.
   */
  @java.lang.Override
  public java.lang.String getDesc2() {
    java.lang.Object ref = desc2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 5;</code>
   * @return The bytes for desc2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDesc2Bytes() {
    java.lang.Object ref = desc2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RCMD_DESC_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rcmdDesc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string rcmd_desc = 6;</code>
   * @return The rcmdDesc.
   */
  @java.lang.Override
  public java.lang.String getRcmdDesc() {
    java.lang.Object ref = rcmdDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rcmdDesc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string rcmd_desc = 6;</code>
   * @return The bytes for rcmdDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRcmdDescBytes() {
    java.lang.Object ref = rcmdDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rcmdDesc_ = b;
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
    if (topicId_ != 0L) {
      output.writeInt64(1, topicId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, desc2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rcmdDesc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, rcmdDesc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topicId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, topicId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, desc2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rcmdDesc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, rcmdDesc_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.TopicItem)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.TopicItem other = (bilibili.app.dynamic.v2.TopicItem) obj;

    if (getTopicId()
        != other.getTopicId()) return false;
    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getDesc()
        .equals(other.getDesc())) return false;
    if (!getDesc2()
        .equals(other.getDesc2())) return false;
    if (!getRcmdDesc()
        .equals(other.getRcmdDesc())) return false;
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
    hash = (37 * hash) + TOPIC_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopicId());
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + DESC2_FIELD_NUMBER;
    hash = (53 * hash) + getDesc2().hashCode();
    hash = (37 * hash) + RCMD_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getRcmdDesc().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TopicItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.TopicItem prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.TopicItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.TopicItem)
      bilibili.app.dynamic.v2.TopicItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TopicItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TopicItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.TopicItem.class, bilibili.app.dynamic.v2.TopicItem.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.TopicItem.newBuilder()
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
      topicId_ = 0L;
      topicName_ = "";
      url_ = "";
      desc_ = "";
      desc2_ = "";
      rcmdDesc_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TopicItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TopicItem getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.TopicItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TopicItem build() {
      bilibili.app.dynamic.v2.TopicItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TopicItem buildPartial() {
      bilibili.app.dynamic.v2.TopicItem result = new bilibili.app.dynamic.v2.TopicItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.TopicItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topicId_ = topicId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topicName_ = topicName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.desc_ = desc_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.desc2_ = desc2_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.rcmdDesc_ = rcmdDesc_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.TopicItem) {
        return mergeFrom((bilibili.app.dynamic.v2.TopicItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.TopicItem other) {
      if (other == bilibili.app.dynamic.v2.TopicItem.getDefaultInstance()) return this;
      if (other.getTopicId() != 0L) {
        setTopicId(other.getTopicId());
      }
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getDesc2().isEmpty()) {
        desc2_ = other.desc2_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getRcmdDesc().isEmpty()) {
        rcmdDesc_ = other.rcmdDesc_;
        bitField0_ |= 0x00000020;
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
            case 8: {
              topicId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              topicName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              desc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              desc2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              rcmdDesc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private long topicId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 topic_id = 1;</code>
     * @return The topicId.
     */
    @java.lang.Override
    public long getTopicId() {
      return topicId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 topic_id = 1;</code>
     * @param value The topicId to set.
     * @return This builder for chaining.
     */
    public Builder setTopicId(long value) {

      topicId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 topic_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      topicId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object topicName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string topic_name = 2;</code>
     * @return The topicName.
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string topic_name = 2;</code>
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string topic_name = 2;</code>
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      topicName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string topic_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = getDefaultInstance().getTopicName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string topic_name = 2;</code>
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topicName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string url = 3;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string url = 3;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string url = 3;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string url = 3;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object desc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
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
     * </pre>
     *
     * <code>string desc = 4;</code>
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
     * </pre>
     *
     * <code>string desc = 4;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      desc_ = getDefaultInstance().getDesc();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object desc2_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return The desc2.
     */
    public java.lang.String getDesc2() {
      java.lang.Object ref = desc2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return The bytes for desc2.
     */
    public com.google.protobuf.ByteString
        getDesc2Bytes() {
      java.lang.Object ref = desc2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @param value The desc2 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc2() {
      desc2_ = getDefaultInstance().getDesc2();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc2 = 5;</code>
     * @param value The bytes for desc2 to set.
     * @return This builder for chaining.
     */
    public Builder setDesc2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc2_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object rcmdDesc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string rcmd_desc = 6;</code>
     * @return The rcmdDesc.
     */
    public java.lang.String getRcmdDesc() {
      java.lang.Object ref = rcmdDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rcmdDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string rcmd_desc = 6;</code>
     * @return The bytes for rcmdDesc.
     */
    public com.google.protobuf.ByteString
        getRcmdDescBytes() {
      java.lang.Object ref = rcmdDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rcmdDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string rcmd_desc = 6;</code>
     * @param value The rcmdDesc to set.
     * @return This builder for chaining.
     */
    public Builder setRcmdDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rcmdDesc_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string rcmd_desc = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRcmdDesc() {
      rcmdDesc_ = getDefaultInstance().getRcmdDesc();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string rcmd_desc = 6;</code>
     * @param value The bytes for rcmdDesc to set.
     * @return This builder for chaining.
     */
    public Builder setRcmdDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rcmdDesc_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.TopicItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.TopicItem)
  private static final bilibili.app.dynamic.v2.TopicItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.TopicItem();
  }

  public static bilibili.app.dynamic.v2.TopicItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicItem>
      PARSER = new com.google.protobuf.AbstractParser<TopicItem>() {
    @java.lang.Override
    public TopicItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.TopicItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
