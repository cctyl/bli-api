// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.TopicActivities}
 */
public final class TopicActivities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.TopicActivities)
    TopicActivitiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicActivities.newBuilder() to construct.
  private TopicActivities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicActivities() {
    activity_ = java.util.Collections.emptyList();
    actListTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicActivities();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicActivities_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicActivities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.TopicActivities.class, bilibili.app.topic.v1.TopicActivities.Builder.class);
  }

  public static final int ACTIVITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.topic.v1.TopicActivity> activity_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.topic.v1.TopicActivity> getActivityList() {
    return activity_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.topic.v1.TopicActivityOrBuilder> 
      getActivityOrBuilderList() {
    return activity_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
   */
  @java.lang.Override
  public int getActivityCount() {
    return activity_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TopicActivity getActivity(int index) {
    return activity_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TopicActivityOrBuilder getActivityOrBuilder(
      int index) {
    return activity_.get(index);
  }

  public static final int ACT_LIST_TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object actListTitle_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string act_list_title = 2;</code>
   * @return The actListTitle.
   */
  @java.lang.Override
  public java.lang.String getActListTitle() {
    java.lang.Object ref = actListTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actListTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string act_list_title = 2;</code>
   * @return The bytes for actListTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActListTitleBytes() {
    java.lang.Object ref = actListTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actListTitle_ = b;
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
    for (int i = 0; i < activity_.size(); i++) {
      output.writeMessage(1, activity_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actListTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actListTitle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < activity_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, activity_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actListTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actListTitle_);
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
    if (!(obj instanceof bilibili.app.topic.v1.TopicActivities)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.TopicActivities other = (bilibili.app.topic.v1.TopicActivities) obj;

    if (!getActivityList()
        .equals(other.getActivityList())) return false;
    if (!getActListTitle()
        .equals(other.getActListTitle())) return false;
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
    if (getActivityCount() > 0) {
      hash = (37 * hash) + ACTIVITY_FIELD_NUMBER;
      hash = (53 * hash) + getActivityList().hashCode();
    }
    hash = (37 * hash) + ACT_LIST_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getActListTitle().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicActivities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicActivities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicActivities parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.TopicActivities prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.TopicActivities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.TopicActivities)
      bilibili.app.topic.v1.TopicActivitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicActivities_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicActivities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.TopicActivities.class, bilibili.app.topic.v1.TopicActivities.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.TopicActivities.newBuilder()
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
      if (activityBuilder_ == null) {
        activity_ = java.util.Collections.emptyList();
      } else {
        activity_ = null;
        activityBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      actListTitle_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicActivities_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicActivities getDefaultInstanceForType() {
      return bilibili.app.topic.v1.TopicActivities.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicActivities build() {
      bilibili.app.topic.v1.TopicActivities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicActivities buildPartial() {
      bilibili.app.topic.v1.TopicActivities result = new bilibili.app.topic.v1.TopicActivities(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.topic.v1.TopicActivities result) {
      if (activityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          activity_ = java.util.Collections.unmodifiableList(activity_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.activity_ = activity_;
      } else {
        result.activity_ = activityBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.topic.v1.TopicActivities result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.actListTitle_ = actListTitle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.TopicActivities) {
        return mergeFrom((bilibili.app.topic.v1.TopicActivities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.TopicActivities other) {
      if (other == bilibili.app.topic.v1.TopicActivities.getDefaultInstance()) return this;
      if (activityBuilder_ == null) {
        if (!other.activity_.isEmpty()) {
          if (activity_.isEmpty()) {
            activity_ = other.activity_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActivityIsMutable();
            activity_.addAll(other.activity_);
          }
          onChanged();
        }
      } else {
        if (!other.activity_.isEmpty()) {
          if (activityBuilder_.isEmpty()) {
            activityBuilder_.dispose();
            activityBuilder_ = null;
            activity_ = other.activity_;
            bitField0_ = (bitField0_ & ~0x00000001);
            activityBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActivityFieldBuilder() : null;
          } else {
            activityBuilder_.addAllMessages(other.activity_);
          }
        }
      }
      if (!other.getActListTitle().isEmpty()) {
        actListTitle_ = other.actListTitle_;
        bitField0_ |= 0x00000002;
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
              bilibili.app.topic.v1.TopicActivity m =
                  input.readMessage(
                      bilibili.app.topic.v1.TopicActivity.parser(),
                      extensionRegistry);
              if (activityBuilder_ == null) {
                ensureActivityIsMutable();
                activity_.add(m);
              } else {
                activityBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              actListTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<bilibili.app.topic.v1.TopicActivity> activity_ =
      java.util.Collections.emptyList();
    private void ensureActivityIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        activity_ = new java.util.ArrayList<bilibili.app.topic.v1.TopicActivity>(activity_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.TopicActivity, bilibili.app.topic.v1.TopicActivity.Builder, bilibili.app.topic.v1.TopicActivityOrBuilder> activityBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public java.util.List<bilibili.app.topic.v1.TopicActivity> getActivityList() {
      if (activityBuilder_ == null) {
        return java.util.Collections.unmodifiableList(activity_);
      } else {
        return activityBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public int getActivityCount() {
      if (activityBuilder_ == null) {
        return activity_.size();
      } else {
        return activityBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public bilibili.app.topic.v1.TopicActivity getActivity(int index) {
      if (activityBuilder_ == null) {
        return activity_.get(index);
      } else {
        return activityBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder setActivity(
        int index, bilibili.app.topic.v1.TopicActivity value) {
      if (activityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityIsMutable();
        activity_.set(index, value);
        onChanged();
      } else {
        activityBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder setActivity(
        int index, bilibili.app.topic.v1.TopicActivity.Builder builderForValue) {
      if (activityBuilder_ == null) {
        ensureActivityIsMutable();
        activity_.set(index, builderForValue.build());
        onChanged();
      } else {
        activityBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder addActivity(bilibili.app.topic.v1.TopicActivity value) {
      if (activityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityIsMutable();
        activity_.add(value);
        onChanged();
      } else {
        activityBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder addActivity(
        int index, bilibili.app.topic.v1.TopicActivity value) {
      if (activityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityIsMutable();
        activity_.add(index, value);
        onChanged();
      } else {
        activityBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder addActivity(
        bilibili.app.topic.v1.TopicActivity.Builder builderForValue) {
      if (activityBuilder_ == null) {
        ensureActivityIsMutable();
        activity_.add(builderForValue.build());
        onChanged();
      } else {
        activityBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder addActivity(
        int index, bilibili.app.topic.v1.TopicActivity.Builder builderForValue) {
      if (activityBuilder_ == null) {
        ensureActivityIsMutable();
        activity_.add(index, builderForValue.build());
        onChanged();
      } else {
        activityBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder addAllActivity(
        java.lang.Iterable<? extends bilibili.app.topic.v1.TopicActivity> values) {
      if (activityBuilder_ == null) {
        ensureActivityIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, activity_);
        onChanged();
      } else {
        activityBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder clearActivity() {
      if (activityBuilder_ == null) {
        activity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        activityBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public Builder removeActivity(int index) {
      if (activityBuilder_ == null) {
        ensureActivityIsMutable();
        activity_.remove(index);
        onChanged();
      } else {
        activityBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public bilibili.app.topic.v1.TopicActivity.Builder getActivityBuilder(
        int index) {
      return getActivityFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public bilibili.app.topic.v1.TopicActivityOrBuilder getActivityOrBuilder(
        int index) {
      if (activityBuilder_ == null) {
        return activity_.get(index);  } else {
        return activityBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public java.util.List<? extends bilibili.app.topic.v1.TopicActivityOrBuilder> 
         getActivityOrBuilderList() {
      if (activityBuilder_ != null) {
        return activityBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(activity_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public bilibili.app.topic.v1.TopicActivity.Builder addActivityBuilder() {
      return getActivityFieldBuilder().addBuilder(
          bilibili.app.topic.v1.TopicActivity.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public bilibili.app.topic.v1.TopicActivity.Builder addActivityBuilder(
        int index) {
      return getActivityFieldBuilder().addBuilder(
          index, bilibili.app.topic.v1.TopicActivity.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicActivity activity = 1;</code>
     */
    public java.util.List<bilibili.app.topic.v1.TopicActivity.Builder> 
         getActivityBuilderList() {
      return getActivityFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.TopicActivity, bilibili.app.topic.v1.TopicActivity.Builder, bilibili.app.topic.v1.TopicActivityOrBuilder> 
        getActivityFieldBuilder() {
      if (activityBuilder_ == null) {
        activityBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.topic.v1.TopicActivity, bilibili.app.topic.v1.TopicActivity.Builder, bilibili.app.topic.v1.TopicActivityOrBuilder>(
                activity_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        activity_ = null;
      }
      return activityBuilder_;
    }

    private java.lang.Object actListTitle_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string act_list_title = 2;</code>
     * @return The actListTitle.
     */
    public java.lang.String getActListTitle() {
      java.lang.Object ref = actListTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actListTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string act_list_title = 2;</code>
     * @return The bytes for actListTitle.
     */
    public com.google.protobuf.ByteString
        getActListTitleBytes() {
      java.lang.Object ref = actListTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actListTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string act_list_title = 2;</code>
     * @param value The actListTitle to set.
     * @return This builder for chaining.
     */
    public Builder setActListTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      actListTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string act_list_title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActListTitle() {
      actListTitle_ = getDefaultInstance().getActListTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string act_list_title = 2;</code>
     * @param value The bytes for actListTitle to set.
     * @return This builder for chaining.
     */
    public Builder setActListTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      actListTitle_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.TopicActivities)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.TopicActivities)
  private static final bilibili.app.topic.v1.TopicActivities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.TopicActivities();
  }

  public static bilibili.app.topic.v1.TopicActivities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicActivities>
      PARSER = new com.google.protobuf.AbstractParser<TopicActivities>() {
    @java.lang.Override
    public TopicActivities parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicActivities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicActivities> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.TopicActivities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
