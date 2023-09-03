// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.TimeLineEvents}
 */
public final class TimeLineEvents extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.TimeLineEvents)
    TimeLineEventsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeLineEvents.newBuilder() to construct.
  private TimeLineEvents(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeLineEvents() {
    title_ = "";
    timeDesc_ = "";
    jumpLink_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeLineEvents();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TimeLineEvents_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TimeLineEvents_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.TimeLineEvents.class, bilibili.app.topic.v1.TimeLineEvents.Builder.class);
  }

  public static final int EVENT_ID_FIELD_NUMBER = 1;
  private long eventId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 event_id = 1;</code>
   * @return The eventId.
   */
  @java.lang.Override
  public long getEventId() {
    return eventId_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_DESC_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timeDesc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string time_desc = 3;</code>
   * @return The timeDesc.
   */
  @java.lang.Override
  public java.lang.String getTimeDesc() {
    java.lang.Object ref = timeDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeDesc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string time_desc = 3;</code>
   * @return The bytes for timeDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeDescBytes() {
    java.lang.Object ref = timeDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timeDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JUMP_LINK_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jumpLink_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 4;</code>
   * @return The jumpLink.
   */
  @java.lang.Override
  public java.lang.String getJumpLink() {
    java.lang.Object ref = jumpLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jumpLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 4;</code>
   * @return The bytes for jumpLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJumpLinkBytes() {
    java.lang.Object ref = jumpLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jumpLink_ = b;
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
    if (eventId_ != 0L) {
      output.writeInt64(1, eventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeDesc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timeDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jumpLink_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, eventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeDesc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timeDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jumpLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, jumpLink_);
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
    if (!(obj instanceof bilibili.app.topic.v1.TimeLineEvents)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.TimeLineEvents other = (bilibili.app.topic.v1.TimeLineEvents) obj;

    if (getEventId()
        != other.getEventId()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getTimeDesc()
        .equals(other.getTimeDesc())) return false;
    if (!getJumpLink()
        .equals(other.getJumpLink())) return false;
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
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventId());
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + TIME_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getTimeDesc().hashCode();
    hash = (37 * hash) + JUMP_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getJumpLink().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TimeLineEvents parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.TimeLineEvents prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.TimeLineEvents}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.TimeLineEvents)
      bilibili.app.topic.v1.TimeLineEventsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TimeLineEvents_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TimeLineEvents_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.TimeLineEvents.class, bilibili.app.topic.v1.TimeLineEvents.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.TimeLineEvents.newBuilder()
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
      eventId_ = 0L;
      title_ = "";
      timeDesc_ = "";
      jumpLink_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TimeLineEvents_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TimeLineEvents getDefaultInstanceForType() {
      return bilibili.app.topic.v1.TimeLineEvents.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TimeLineEvents build() {
      bilibili.app.topic.v1.TimeLineEvents result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TimeLineEvents buildPartial() {
      bilibili.app.topic.v1.TimeLineEvents result = new bilibili.app.topic.v1.TimeLineEvents(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.topic.v1.TimeLineEvents result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventId_ = eventId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeDesc_ = timeDesc_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.jumpLink_ = jumpLink_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.TimeLineEvents) {
        return mergeFrom((bilibili.app.topic.v1.TimeLineEvents)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.TimeLineEvents other) {
      if (other == bilibili.app.topic.v1.TimeLineEvents.getDefaultInstance()) return this;
      if (other.getEventId() != 0L) {
        setEventId(other.getEventId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTimeDesc().isEmpty()) {
        timeDesc_ = other.timeDesc_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getJumpLink().isEmpty()) {
        jumpLink_ = other.jumpLink_;
        bitField0_ |= 0x00000008;
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
              eventId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              timeDesc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              jumpLink_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long eventId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 event_id = 1;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public long getEventId() {
      return eventId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 event_id = 1;</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(long value) {

      eventId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eventId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object timeDesc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string time_desc = 3;</code>
     * @return The timeDesc.
     */
    public java.lang.String getTimeDesc() {
      java.lang.Object ref = timeDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string time_desc = 3;</code>
     * @return The bytes for timeDesc.
     */
    public com.google.protobuf.ByteString
        getTimeDescBytes() {
      java.lang.Object ref = timeDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string time_desc = 3;</code>
     * @param value The timeDesc to set.
     * @return This builder for chaining.
     */
    public Builder setTimeDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timeDesc_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string time_desc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeDesc() {
      timeDesc_ = getDefaultInstance().getTimeDesc();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string time_desc = 3;</code>
     * @param value The bytes for timeDesc to set.
     * @return This builder for chaining.
     */
    public Builder setTimeDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timeDesc_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object jumpLink_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return The jumpLink.
     */
    public java.lang.String getJumpLink() {
      java.lang.Object ref = jumpLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jumpLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return The bytes for jumpLink.
     */
    public com.google.protobuf.ByteString
        getJumpLinkBytes() {
      java.lang.Object ref = jumpLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jumpLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @param value The jumpLink to set.
     * @return This builder for chaining.
     */
    public Builder setJumpLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jumpLink_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpLink() {
      jumpLink_ = getDefaultInstance().getJumpLink();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string jump_link = 4;</code>
     * @param value The bytes for jumpLink to set.
     * @return This builder for chaining.
     */
    public Builder setJumpLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jumpLink_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.TimeLineEvents)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.TimeLineEvents)
  private static final bilibili.app.topic.v1.TimeLineEvents DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.TimeLineEvents();
  }

  public static bilibili.app.topic.v1.TimeLineEvents getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeLineEvents>
      PARSER = new com.google.protobuf.AbstractParser<TimeLineEvents>() {
    @java.lang.Override
    public TimeLineEvents parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeLineEvents> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeLineEvents> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.TimeLineEvents getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
