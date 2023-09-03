// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.RightTopLiveBadge}
 */
public final class RightTopLiveBadge extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.RightTopLiveBadge)
    RightTopLiveBadgeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RightTopLiveBadge.newBuilder() to construct.
  private RightTopLiveBadge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RightTopLiveBadge() {
    liveStatsDesc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RightTopLiveBadge();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RightTopLiveBadge_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RightTopLiveBadge_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.RightTopLiveBadge.class, bilibili.app.topic.v1.RightTopLiveBadge.Builder.class);
  }

  public static final int LIVE_STATUS_FIELD_NUMBER = 1;
  private long liveStatus_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 live_status = 1;</code>
   * @return The liveStatus.
   */
  @java.lang.Override
  public long getLiveStatus() {
    return liveStatus_;
  }

  public static final int IN_LIVE_FIELD_NUMBER = 2;
  private bilibili.app.topic.v1.LiveBadgeResource inLive_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   * @return Whether the inLive field is set.
   */
  @java.lang.Override
  public boolean hasInLive() {
    return inLive_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   * @return The inLive.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.LiveBadgeResource getInLive() {
    return inLive_ == null ? bilibili.app.topic.v1.LiveBadgeResource.getDefaultInstance() : inLive_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.LiveBadgeResourceOrBuilder getInLiveOrBuilder() {
    return inLive_ == null ? bilibili.app.topic.v1.LiveBadgeResource.getDefaultInstance() : inLive_;
  }

  public static final int LIVE_STATS_DESC_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object liveStatsDesc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string live_stats_desc = 3;</code>
   * @return The liveStatsDesc.
   */
  @java.lang.Override
  public java.lang.String getLiveStatsDesc() {
    java.lang.Object ref = liveStatsDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      liveStatsDesc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string live_stats_desc = 3;</code>
   * @return The bytes for liveStatsDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLiveStatsDescBytes() {
    java.lang.Object ref = liveStatsDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      liveStatsDesc_ = b;
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
    if (liveStatus_ != 0L) {
      output.writeInt64(1, liveStatus_);
    }
    if (inLive_ != null) {
      output.writeMessage(2, getInLive());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(liveStatsDesc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, liveStatsDesc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (liveStatus_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, liveStatus_);
    }
    if (inLive_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInLive());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(liveStatsDesc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, liveStatsDesc_);
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
    if (!(obj instanceof bilibili.app.topic.v1.RightTopLiveBadge)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.RightTopLiveBadge other = (bilibili.app.topic.v1.RightTopLiveBadge) obj;

    if (getLiveStatus()
        != other.getLiveStatus()) return false;
    if (hasInLive() != other.hasInLive()) return false;
    if (hasInLive()) {
      if (!getInLive()
          .equals(other.getInLive())) return false;
    }
    if (!getLiveStatsDesc()
        .equals(other.getLiveStatsDesc())) return false;
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
    hash = (37 * hash) + LIVE_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLiveStatus());
    if (hasInLive()) {
      hash = (37 * hash) + IN_LIVE_FIELD_NUMBER;
      hash = (53 * hash) + getInLive().hashCode();
    }
    hash = (37 * hash) + LIVE_STATS_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getLiveStatsDesc().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RightTopLiveBadge parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.RightTopLiveBadge prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.RightTopLiveBadge}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.RightTopLiveBadge)
      bilibili.app.topic.v1.RightTopLiveBadgeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RightTopLiveBadge_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RightTopLiveBadge_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.RightTopLiveBadge.class, bilibili.app.topic.v1.RightTopLiveBadge.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.RightTopLiveBadge.newBuilder()
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
      liveStatus_ = 0L;
      inLive_ = null;
      if (inLiveBuilder_ != null) {
        inLiveBuilder_.dispose();
        inLiveBuilder_ = null;
      }
      liveStatsDesc_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RightTopLiveBadge_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RightTopLiveBadge getDefaultInstanceForType() {
      return bilibili.app.topic.v1.RightTopLiveBadge.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RightTopLiveBadge build() {
      bilibili.app.topic.v1.RightTopLiveBadge result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RightTopLiveBadge buildPartial() {
      bilibili.app.topic.v1.RightTopLiveBadge result = new bilibili.app.topic.v1.RightTopLiveBadge(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.topic.v1.RightTopLiveBadge result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.liveStatus_ = liveStatus_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inLive_ = inLiveBuilder_ == null
            ? inLive_
            : inLiveBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.liveStatsDesc_ = liveStatsDesc_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.RightTopLiveBadge) {
        return mergeFrom((bilibili.app.topic.v1.RightTopLiveBadge)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.RightTopLiveBadge other) {
      if (other == bilibili.app.topic.v1.RightTopLiveBadge.getDefaultInstance()) return this;
      if (other.getLiveStatus() != 0L) {
        setLiveStatus(other.getLiveStatus());
      }
      if (other.hasInLive()) {
        mergeInLive(other.getInLive());
      }
      if (!other.getLiveStatsDesc().isEmpty()) {
        liveStatsDesc_ = other.liveStatsDesc_;
        bitField0_ |= 0x00000004;
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
              liveStatus_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getInLiveFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              liveStatsDesc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long liveStatus_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 live_status = 1;</code>
     * @return The liveStatus.
     */
    @java.lang.Override
    public long getLiveStatus() {
      return liveStatus_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 live_status = 1;</code>
     * @param value The liveStatus to set.
     * @return This builder for chaining.
     */
    public Builder setLiveStatus(long value) {

      liveStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 live_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLiveStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      liveStatus_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.app.topic.v1.LiveBadgeResource inLive_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.LiveBadgeResource, bilibili.app.topic.v1.LiveBadgeResource.Builder, bilibili.app.topic.v1.LiveBadgeResourceOrBuilder> inLiveBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     * @return Whether the inLive field is set.
     */
    public boolean hasInLive() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     * @return The inLive.
     */
    public bilibili.app.topic.v1.LiveBadgeResource getInLive() {
      if (inLiveBuilder_ == null) {
        return inLive_ == null ? bilibili.app.topic.v1.LiveBadgeResource.getDefaultInstance() : inLive_;
      } else {
        return inLiveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public Builder setInLive(bilibili.app.topic.v1.LiveBadgeResource value) {
      if (inLiveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inLive_ = value;
      } else {
        inLiveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public Builder setInLive(
        bilibili.app.topic.v1.LiveBadgeResource.Builder builderForValue) {
      if (inLiveBuilder_ == null) {
        inLive_ = builderForValue.build();
      } else {
        inLiveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public Builder mergeInLive(bilibili.app.topic.v1.LiveBadgeResource value) {
      if (inLiveBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          inLive_ != null &&
          inLive_ != bilibili.app.topic.v1.LiveBadgeResource.getDefaultInstance()) {
          getInLiveBuilder().mergeFrom(value);
        } else {
          inLive_ = value;
        }
      } else {
        inLiveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public Builder clearInLive() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inLive_ = null;
      if (inLiveBuilder_ != null) {
        inLiveBuilder_.dispose();
        inLiveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public bilibili.app.topic.v1.LiveBadgeResource.Builder getInLiveBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInLiveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    public bilibili.app.topic.v1.LiveBadgeResourceOrBuilder getInLiveOrBuilder() {
      if (inLiveBuilder_ != null) {
        return inLiveBuilder_.getMessageOrBuilder();
      } else {
        return inLive_ == null ?
            bilibili.app.topic.v1.LiveBadgeResource.getDefaultInstance() : inLive_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.LiveBadgeResource, bilibili.app.topic.v1.LiveBadgeResource.Builder, bilibili.app.topic.v1.LiveBadgeResourceOrBuilder> 
        getInLiveFieldBuilder() {
      if (inLiveBuilder_ == null) {
        inLiveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.LiveBadgeResource, bilibili.app.topic.v1.LiveBadgeResource.Builder, bilibili.app.topic.v1.LiveBadgeResourceOrBuilder>(
                getInLive(),
                getParentForChildren(),
                isClean());
        inLive_ = null;
      }
      return inLiveBuilder_;
    }

    private java.lang.Object liveStatsDesc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string live_stats_desc = 3;</code>
     * @return The liveStatsDesc.
     */
    public java.lang.String getLiveStatsDesc() {
      java.lang.Object ref = liveStatsDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        liveStatsDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string live_stats_desc = 3;</code>
     * @return The bytes for liveStatsDesc.
     */
    public com.google.protobuf.ByteString
        getLiveStatsDescBytes() {
      java.lang.Object ref = liveStatsDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        liveStatsDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string live_stats_desc = 3;</code>
     * @param value The liveStatsDesc to set.
     * @return This builder for chaining.
     */
    public Builder setLiveStatsDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      liveStatsDesc_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string live_stats_desc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLiveStatsDesc() {
      liveStatsDesc_ = getDefaultInstance().getLiveStatsDesc();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string live_stats_desc = 3;</code>
     * @param value The bytes for liveStatsDesc to set.
     * @return This builder for chaining.
     */
    public Builder setLiveStatsDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      liveStatsDesc_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.RightTopLiveBadge)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.RightTopLiveBadge)
  private static final bilibili.app.topic.v1.RightTopLiveBadge DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.RightTopLiveBadge();
  }

  public static bilibili.app.topic.v1.RightTopLiveBadge getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RightTopLiveBadge>
      PARSER = new com.google.protobuf.AbstractParser<RightTopLiveBadge>() {
    @java.lang.Override
    public RightTopLiveBadge parsePartialFrom(
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

  public static com.google.protobuf.Parser<RightTopLiveBadge> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RightTopLiveBadge> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.RightTopLiveBadge getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
