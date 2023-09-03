// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.PlayDASH}
 */
public final class PlayDASH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.PlayDASH)
    PlayDASHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayDASH.newBuilder() to construct.
  private PlayDASH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayDASH() {
    audio_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayDASH();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayDASH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayDASH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.PlayDASH.class, bilibili.app.listener.v1.PlayDASH.Builder.class);
  }

  public static final int DURATION_FIELD_NUMBER = 1;
  private int duration_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 duration = 1;</code>
   * @return The duration.
   */
  @java.lang.Override
  public int getDuration() {
    return duration_;
  }

  public static final int MIN_BUFFER_TIME_FIELD_NUMBER = 2;
  private float minBufferTime_ = 0F;
  /**
   * <pre>
   * </pre>
   *
   * <code>float min_buffer_time = 2;</code>
   * @return The minBufferTime.
   */
  @java.lang.Override
  public float getMinBufferTime() {
    return minBufferTime_;
  }

  public static final int AUDIO_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.listener.v1.DashItem> audio_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.listener.v1.DashItem> getAudioList() {
    return audio_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.listener.v1.DashItemOrBuilder> 
      getAudioOrBuilderList() {
    return audio_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
   */
  @java.lang.Override
  public int getAudioCount() {
    return audio_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.listener.v1.DashItem getAudio(int index) {
    return audio_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.listener.v1.DashItemOrBuilder getAudioOrBuilder(
      int index) {
    return audio_.get(index);
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
    if (duration_ != 0) {
      output.writeInt32(1, duration_);
    }
    if (java.lang.Float.floatToRawIntBits(minBufferTime_) != 0) {
      output.writeFloat(2, minBufferTime_);
    }
    for (int i = 0; i < audio_.size(); i++) {
      output.writeMessage(3, audio_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (duration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, duration_);
    }
    if (java.lang.Float.floatToRawIntBits(minBufferTime_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, minBufferTime_);
    }
    for (int i = 0; i < audio_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, audio_.get(i));
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
    if (!(obj instanceof bilibili.app.listener.v1.PlayDASH)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.PlayDASH other = (bilibili.app.listener.v1.PlayDASH) obj;

    if (getDuration()
        != other.getDuration()) return false;
    if (java.lang.Float.floatToIntBits(getMinBufferTime())
        != java.lang.Float.floatToIntBits(
            other.getMinBufferTime())) return false;
    if (!getAudioList()
        .equals(other.getAudioList())) return false;
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
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration();
    hash = (37 * hash) + MIN_BUFFER_TIME_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMinBufferTime());
    if (getAudioCount() > 0) {
      hash = (37 * hash) + AUDIO_FIELD_NUMBER;
      hash = (53 * hash) + getAudioList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayDASH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayDASH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayDASH parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.PlayDASH prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.PlayDASH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.PlayDASH)
      bilibili.app.listener.v1.PlayDASHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayDASH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayDASH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.PlayDASH.class, bilibili.app.listener.v1.PlayDASH.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.PlayDASH.newBuilder()
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
      duration_ = 0;
      minBufferTime_ = 0F;
      if (audioBuilder_ == null) {
        audio_ = java.util.Collections.emptyList();
      } else {
        audio_ = null;
        audioBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayDASH_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayDASH getDefaultInstanceForType() {
      return bilibili.app.listener.v1.PlayDASH.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayDASH build() {
      bilibili.app.listener.v1.PlayDASH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayDASH buildPartial() {
      bilibili.app.listener.v1.PlayDASH result = new bilibili.app.listener.v1.PlayDASH(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.listener.v1.PlayDASH result) {
      if (audioBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          audio_ = java.util.Collections.unmodifiableList(audio_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.audio_ = audio_;
      } else {
        result.audio_ = audioBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.listener.v1.PlayDASH result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.duration_ = duration_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minBufferTime_ = minBufferTime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.PlayDASH) {
        return mergeFrom((bilibili.app.listener.v1.PlayDASH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.PlayDASH other) {
      if (other == bilibili.app.listener.v1.PlayDASH.getDefaultInstance()) return this;
      if (other.getDuration() != 0) {
        setDuration(other.getDuration());
      }
      if (other.getMinBufferTime() != 0F) {
        setMinBufferTime(other.getMinBufferTime());
      }
      if (audioBuilder_ == null) {
        if (!other.audio_.isEmpty()) {
          if (audio_.isEmpty()) {
            audio_ = other.audio_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAudioIsMutable();
            audio_.addAll(other.audio_);
          }
          onChanged();
        }
      } else {
        if (!other.audio_.isEmpty()) {
          if (audioBuilder_.isEmpty()) {
            audioBuilder_.dispose();
            audioBuilder_ = null;
            audio_ = other.audio_;
            bitField0_ = (bitField0_ & ~0x00000004);
            audioBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAudioFieldBuilder() : null;
          } else {
            audioBuilder_.addAllMessages(other.audio_);
          }
        }
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
              duration_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 21: {
              minBufferTime_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 26: {
              bilibili.app.listener.v1.DashItem m =
                  input.readMessage(
                      bilibili.app.listener.v1.DashItem.parser(),
                      extensionRegistry);
              if (audioBuilder_ == null) {
                ensureAudioIsMutable();
                audio_.add(m);
              } else {
                audioBuilder_.addMessage(m);
              }
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

    private int duration_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(int value) {

      duration_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      duration_ = 0;
      onChanged();
      return this;
    }

    private float minBufferTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>float min_buffer_time = 2;</code>
     * @return The minBufferTime.
     */
    @java.lang.Override
    public float getMinBufferTime() {
      return minBufferTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>float min_buffer_time = 2;</code>
     * @param value The minBufferTime to set.
     * @return This builder for chaining.
     */
    public Builder setMinBufferTime(float value) {

      minBufferTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>float min_buffer_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinBufferTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minBufferTime_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.app.listener.v1.DashItem> audio_ =
      java.util.Collections.emptyList();
    private void ensureAudioIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        audio_ = new java.util.ArrayList<bilibili.app.listener.v1.DashItem>(audio_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.listener.v1.DashItem, bilibili.app.listener.v1.DashItem.Builder, bilibili.app.listener.v1.DashItemOrBuilder> audioBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public java.util.List<bilibili.app.listener.v1.DashItem> getAudioList() {
      if (audioBuilder_ == null) {
        return java.util.Collections.unmodifiableList(audio_);
      } else {
        return audioBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public int getAudioCount() {
      if (audioBuilder_ == null) {
        return audio_.size();
      } else {
        return audioBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public bilibili.app.listener.v1.DashItem getAudio(int index) {
      if (audioBuilder_ == null) {
        return audio_.get(index);
      } else {
        return audioBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder setAudio(
        int index, bilibili.app.listener.v1.DashItem value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudioIsMutable();
        audio_.set(index, value);
        onChanged();
      } else {
        audioBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder setAudio(
        int index, bilibili.app.listener.v1.DashItem.Builder builderForValue) {
      if (audioBuilder_ == null) {
        ensureAudioIsMutable();
        audio_.set(index, builderForValue.build());
        onChanged();
      } else {
        audioBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder addAudio(bilibili.app.listener.v1.DashItem value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudioIsMutable();
        audio_.add(value);
        onChanged();
      } else {
        audioBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder addAudio(
        int index, bilibili.app.listener.v1.DashItem value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudioIsMutable();
        audio_.add(index, value);
        onChanged();
      } else {
        audioBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder addAudio(
        bilibili.app.listener.v1.DashItem.Builder builderForValue) {
      if (audioBuilder_ == null) {
        ensureAudioIsMutable();
        audio_.add(builderForValue.build());
        onChanged();
      } else {
        audioBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder addAudio(
        int index, bilibili.app.listener.v1.DashItem.Builder builderForValue) {
      if (audioBuilder_ == null) {
        ensureAudioIsMutable();
        audio_.add(index, builderForValue.build());
        onChanged();
      } else {
        audioBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder addAllAudio(
        java.lang.Iterable<? extends bilibili.app.listener.v1.DashItem> values) {
      if (audioBuilder_ == null) {
        ensureAudioIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, audio_);
        onChanged();
      } else {
        audioBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder clearAudio() {
      if (audioBuilder_ == null) {
        audio_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        audioBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public Builder removeAudio(int index) {
      if (audioBuilder_ == null) {
        ensureAudioIsMutable();
        audio_.remove(index);
        onChanged();
      } else {
        audioBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public bilibili.app.listener.v1.DashItem.Builder getAudioBuilder(
        int index) {
      return getAudioFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public bilibili.app.listener.v1.DashItemOrBuilder getAudioOrBuilder(
        int index) {
      if (audioBuilder_ == null) {
        return audio_.get(index);  } else {
        return audioBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public java.util.List<? extends bilibili.app.listener.v1.DashItemOrBuilder> 
         getAudioOrBuilderList() {
      if (audioBuilder_ != null) {
        return audioBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(audio_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public bilibili.app.listener.v1.DashItem.Builder addAudioBuilder() {
      return getAudioFieldBuilder().addBuilder(
          bilibili.app.listener.v1.DashItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public bilibili.app.listener.v1.DashItem.Builder addAudioBuilder(
        int index) {
      return getAudioFieldBuilder().addBuilder(
          index, bilibili.app.listener.v1.DashItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.listener.v1.DashItem audio = 3;</code>
     */
    public java.util.List<bilibili.app.listener.v1.DashItem.Builder> 
         getAudioBuilderList() {
      return getAudioFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.listener.v1.DashItem, bilibili.app.listener.v1.DashItem.Builder, bilibili.app.listener.v1.DashItemOrBuilder> 
        getAudioFieldBuilder() {
      if (audioBuilder_ == null) {
        audioBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.listener.v1.DashItem, bilibili.app.listener.v1.DashItem.Builder, bilibili.app.listener.v1.DashItemOrBuilder>(
                audio_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        audio_ = null;
      }
      return audioBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.PlayDASH)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.PlayDASH)
  private static final bilibili.app.listener.v1.PlayDASH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.PlayDASH();
  }

  public static bilibili.app.listener.v1.PlayDASH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayDASH>
      PARSER = new com.google.protobuf.AbstractParser<PlayDASH>() {
    @java.lang.Override
    public PlayDASH parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayDASH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayDASH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.PlayDASH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

