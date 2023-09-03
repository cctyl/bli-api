// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.FunctionalCard}
 */
public final class FunctionalCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.FunctionalCard)
    FunctionalCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionalCard.newBuilder() to construct.
  private FunctionalCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionalCard() {
    capsules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionalCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_FunctionalCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_FunctionalCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.FunctionalCard.class, bilibili.app.topic.v1.FunctionalCard.Builder.class);
  }

  public static final int CAPSULES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.topic.v1.TopicCapsule> capsules_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.topic.v1.TopicCapsule> getCapsulesList() {
    return capsules_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.topic.v1.TopicCapsuleOrBuilder> 
      getCapsulesOrBuilderList() {
    return capsules_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
   */
  @java.lang.Override
  public int getCapsulesCount() {
    return capsules_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TopicCapsule getCapsules(int index) {
    return capsules_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TopicCapsuleOrBuilder getCapsulesOrBuilder(
      int index) {
    return capsules_.get(index);
  }

  public static final int TRAFFIC_CARD_FIELD_NUMBER = 2;
  private bilibili.app.topic.v1.TrafficCard trafficCard_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
   * @return Whether the trafficCard field is set.
   */
  @java.lang.Override
  public boolean hasTrafficCard() {
    return trafficCard_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
   * @return The trafficCard.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TrafficCard getTrafficCard() {
    return trafficCard_ == null ? bilibili.app.topic.v1.TrafficCard.getDefaultInstance() : trafficCard_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.TrafficCardOrBuilder getTrafficCardOrBuilder() {
    return trafficCard_ == null ? bilibili.app.topic.v1.TrafficCard.getDefaultInstance() : trafficCard_;
  }

  public static final int GAME_CARD_FIELD_NUMBER = 3;
  private bilibili.app.topic.v1.GameCard gameCard_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
   * @return Whether the gameCard field is set.
   */
  @java.lang.Override
  public boolean hasGameCard() {
    return gameCard_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
   * @return The gameCard.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.GameCard getGameCard() {
    return gameCard_ == null ? bilibili.app.topic.v1.GameCard.getDefaultInstance() : gameCard_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.GameCardOrBuilder getGameCardOrBuilder() {
    return gameCard_ == null ? bilibili.app.topic.v1.GameCard.getDefaultInstance() : gameCard_;
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
    for (int i = 0; i < capsules_.size(); i++) {
      output.writeMessage(1, capsules_.get(i));
    }
    if (trafficCard_ != null) {
      output.writeMessage(2, getTrafficCard());
    }
    if (gameCard_ != null) {
      output.writeMessage(3, getGameCard());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < capsules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, capsules_.get(i));
    }
    if (trafficCard_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTrafficCard());
    }
    if (gameCard_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGameCard());
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
    if (!(obj instanceof bilibili.app.topic.v1.FunctionalCard)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.FunctionalCard other = (bilibili.app.topic.v1.FunctionalCard) obj;

    if (!getCapsulesList()
        .equals(other.getCapsulesList())) return false;
    if (hasTrafficCard() != other.hasTrafficCard()) return false;
    if (hasTrafficCard()) {
      if (!getTrafficCard()
          .equals(other.getTrafficCard())) return false;
    }
    if (hasGameCard() != other.hasGameCard()) return false;
    if (hasGameCard()) {
      if (!getGameCard()
          .equals(other.getGameCard())) return false;
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
    if (getCapsulesCount() > 0) {
      hash = (37 * hash) + CAPSULES_FIELD_NUMBER;
      hash = (53 * hash) + getCapsulesList().hashCode();
    }
    if (hasTrafficCard()) {
      hash = (37 * hash) + TRAFFIC_CARD_FIELD_NUMBER;
      hash = (53 * hash) + getTrafficCard().hashCode();
    }
    if (hasGameCard()) {
      hash = (37 * hash) + GAME_CARD_FIELD_NUMBER;
      hash = (53 * hash) + getGameCard().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.FunctionalCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.FunctionalCard prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.FunctionalCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.FunctionalCard)
      bilibili.app.topic.v1.FunctionalCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_FunctionalCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_FunctionalCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.FunctionalCard.class, bilibili.app.topic.v1.FunctionalCard.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.FunctionalCard.newBuilder()
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
      if (capsulesBuilder_ == null) {
        capsules_ = java.util.Collections.emptyList();
      } else {
        capsules_ = null;
        capsulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      trafficCard_ = null;
      if (trafficCardBuilder_ != null) {
        trafficCardBuilder_.dispose();
        trafficCardBuilder_ = null;
      }
      gameCard_ = null;
      if (gameCardBuilder_ != null) {
        gameCardBuilder_.dispose();
        gameCardBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_FunctionalCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.FunctionalCard getDefaultInstanceForType() {
      return bilibili.app.topic.v1.FunctionalCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.FunctionalCard build() {
      bilibili.app.topic.v1.FunctionalCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.FunctionalCard buildPartial() {
      bilibili.app.topic.v1.FunctionalCard result = new bilibili.app.topic.v1.FunctionalCard(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.topic.v1.FunctionalCard result) {
      if (capsulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          capsules_ = java.util.Collections.unmodifiableList(capsules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.capsules_ = capsules_;
      } else {
        result.capsules_ = capsulesBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.topic.v1.FunctionalCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.trafficCard_ = trafficCardBuilder_ == null
            ? trafficCard_
            : trafficCardBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gameCard_ = gameCardBuilder_ == null
            ? gameCard_
            : gameCardBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.FunctionalCard) {
        return mergeFrom((bilibili.app.topic.v1.FunctionalCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.FunctionalCard other) {
      if (other == bilibili.app.topic.v1.FunctionalCard.getDefaultInstance()) return this;
      if (capsulesBuilder_ == null) {
        if (!other.capsules_.isEmpty()) {
          if (capsules_.isEmpty()) {
            capsules_ = other.capsules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCapsulesIsMutable();
            capsules_.addAll(other.capsules_);
          }
          onChanged();
        }
      } else {
        if (!other.capsules_.isEmpty()) {
          if (capsulesBuilder_.isEmpty()) {
            capsulesBuilder_.dispose();
            capsulesBuilder_ = null;
            capsules_ = other.capsules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            capsulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCapsulesFieldBuilder() : null;
          } else {
            capsulesBuilder_.addAllMessages(other.capsules_);
          }
        }
      }
      if (other.hasTrafficCard()) {
        mergeTrafficCard(other.getTrafficCard());
      }
      if (other.hasGameCard()) {
        mergeGameCard(other.getGameCard());
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
              bilibili.app.topic.v1.TopicCapsule m =
                  input.readMessage(
                      bilibili.app.topic.v1.TopicCapsule.parser(),
                      extensionRegistry);
              if (capsulesBuilder_ == null) {
                ensureCapsulesIsMutable();
                capsules_.add(m);
              } else {
                capsulesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTrafficCardFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGameCardFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<bilibili.app.topic.v1.TopicCapsule> capsules_ =
      java.util.Collections.emptyList();
    private void ensureCapsulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        capsules_ = new java.util.ArrayList<bilibili.app.topic.v1.TopicCapsule>(capsules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.TopicCapsule, bilibili.app.topic.v1.TopicCapsule.Builder, bilibili.app.topic.v1.TopicCapsuleOrBuilder> capsulesBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public java.util.List<bilibili.app.topic.v1.TopicCapsule> getCapsulesList() {
      if (capsulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(capsules_);
      } else {
        return capsulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public int getCapsulesCount() {
      if (capsulesBuilder_ == null) {
        return capsules_.size();
      } else {
        return capsulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public bilibili.app.topic.v1.TopicCapsule getCapsules(int index) {
      if (capsulesBuilder_ == null) {
        return capsules_.get(index);
      } else {
        return capsulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder setCapsules(
        int index, bilibili.app.topic.v1.TopicCapsule value) {
      if (capsulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCapsulesIsMutable();
        capsules_.set(index, value);
        onChanged();
      } else {
        capsulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder setCapsules(
        int index, bilibili.app.topic.v1.TopicCapsule.Builder builderForValue) {
      if (capsulesBuilder_ == null) {
        ensureCapsulesIsMutable();
        capsules_.set(index, builderForValue.build());
        onChanged();
      } else {
        capsulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder addCapsules(bilibili.app.topic.v1.TopicCapsule value) {
      if (capsulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCapsulesIsMutable();
        capsules_.add(value);
        onChanged();
      } else {
        capsulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder addCapsules(
        int index, bilibili.app.topic.v1.TopicCapsule value) {
      if (capsulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCapsulesIsMutable();
        capsules_.add(index, value);
        onChanged();
      } else {
        capsulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder addCapsules(
        bilibili.app.topic.v1.TopicCapsule.Builder builderForValue) {
      if (capsulesBuilder_ == null) {
        ensureCapsulesIsMutable();
        capsules_.add(builderForValue.build());
        onChanged();
      } else {
        capsulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder addCapsules(
        int index, bilibili.app.topic.v1.TopicCapsule.Builder builderForValue) {
      if (capsulesBuilder_ == null) {
        ensureCapsulesIsMutable();
        capsules_.add(index, builderForValue.build());
        onChanged();
      } else {
        capsulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder addAllCapsules(
        java.lang.Iterable<? extends bilibili.app.topic.v1.TopicCapsule> values) {
      if (capsulesBuilder_ == null) {
        ensureCapsulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, capsules_);
        onChanged();
      } else {
        capsulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder clearCapsules() {
      if (capsulesBuilder_ == null) {
        capsules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        capsulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public Builder removeCapsules(int index) {
      if (capsulesBuilder_ == null) {
        ensureCapsulesIsMutable();
        capsules_.remove(index);
        onChanged();
      } else {
        capsulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public bilibili.app.topic.v1.TopicCapsule.Builder getCapsulesBuilder(
        int index) {
      return getCapsulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public bilibili.app.topic.v1.TopicCapsuleOrBuilder getCapsulesOrBuilder(
        int index) {
      if (capsulesBuilder_ == null) {
        return capsules_.get(index);  } else {
        return capsulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public java.util.List<? extends bilibili.app.topic.v1.TopicCapsuleOrBuilder> 
         getCapsulesOrBuilderList() {
      if (capsulesBuilder_ != null) {
        return capsulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(capsules_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public bilibili.app.topic.v1.TopicCapsule.Builder addCapsulesBuilder() {
      return getCapsulesFieldBuilder().addBuilder(
          bilibili.app.topic.v1.TopicCapsule.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public bilibili.app.topic.v1.TopicCapsule.Builder addCapsulesBuilder(
        int index) {
      return getCapsulesFieldBuilder().addBuilder(
          index, bilibili.app.topic.v1.TopicCapsule.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.TopicCapsule capsules = 1;</code>
     */
    public java.util.List<bilibili.app.topic.v1.TopicCapsule.Builder> 
         getCapsulesBuilderList() {
      return getCapsulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.TopicCapsule, bilibili.app.topic.v1.TopicCapsule.Builder, bilibili.app.topic.v1.TopicCapsuleOrBuilder> 
        getCapsulesFieldBuilder() {
      if (capsulesBuilder_ == null) {
        capsulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.topic.v1.TopicCapsule, bilibili.app.topic.v1.TopicCapsule.Builder, bilibili.app.topic.v1.TopicCapsuleOrBuilder>(
                capsules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        capsules_ = null;
      }
      return capsulesBuilder_;
    }

    private bilibili.app.topic.v1.TrafficCard trafficCard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.TrafficCard, bilibili.app.topic.v1.TrafficCard.Builder, bilibili.app.topic.v1.TrafficCardOrBuilder> trafficCardBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     * @return Whether the trafficCard field is set.
     */
    public boolean hasTrafficCard() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     * @return The trafficCard.
     */
    public bilibili.app.topic.v1.TrafficCard getTrafficCard() {
      if (trafficCardBuilder_ == null) {
        return trafficCard_ == null ? bilibili.app.topic.v1.TrafficCard.getDefaultInstance() : trafficCard_;
      } else {
        return trafficCardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public Builder setTrafficCard(bilibili.app.topic.v1.TrafficCard value) {
      if (trafficCardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trafficCard_ = value;
      } else {
        trafficCardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public Builder setTrafficCard(
        bilibili.app.topic.v1.TrafficCard.Builder builderForValue) {
      if (trafficCardBuilder_ == null) {
        trafficCard_ = builderForValue.build();
      } else {
        trafficCardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public Builder mergeTrafficCard(bilibili.app.topic.v1.TrafficCard value) {
      if (trafficCardBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          trafficCard_ != null &&
          trafficCard_ != bilibili.app.topic.v1.TrafficCard.getDefaultInstance()) {
          getTrafficCardBuilder().mergeFrom(value);
        } else {
          trafficCard_ = value;
        }
      } else {
        trafficCardBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public Builder clearTrafficCard() {
      bitField0_ = (bitField0_ & ~0x00000002);
      trafficCard_ = null;
      if (trafficCardBuilder_ != null) {
        trafficCardBuilder_.dispose();
        trafficCardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public bilibili.app.topic.v1.TrafficCard.Builder getTrafficCardBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTrafficCardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    public bilibili.app.topic.v1.TrafficCardOrBuilder getTrafficCardOrBuilder() {
      if (trafficCardBuilder_ != null) {
        return trafficCardBuilder_.getMessageOrBuilder();
      } else {
        return trafficCard_ == null ?
            bilibili.app.topic.v1.TrafficCard.getDefaultInstance() : trafficCard_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.TrafficCard traffic_card = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.TrafficCard, bilibili.app.topic.v1.TrafficCard.Builder, bilibili.app.topic.v1.TrafficCardOrBuilder> 
        getTrafficCardFieldBuilder() {
      if (trafficCardBuilder_ == null) {
        trafficCardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.TrafficCard, bilibili.app.topic.v1.TrafficCard.Builder, bilibili.app.topic.v1.TrafficCardOrBuilder>(
                getTrafficCard(),
                getParentForChildren(),
                isClean());
        trafficCard_ = null;
      }
      return trafficCardBuilder_;
    }

    private bilibili.app.topic.v1.GameCard gameCard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.GameCard, bilibili.app.topic.v1.GameCard.Builder, bilibili.app.topic.v1.GameCardOrBuilder> gameCardBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     * @return Whether the gameCard field is set.
     */
    public boolean hasGameCard() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     * @return The gameCard.
     */
    public bilibili.app.topic.v1.GameCard getGameCard() {
      if (gameCardBuilder_ == null) {
        return gameCard_ == null ? bilibili.app.topic.v1.GameCard.getDefaultInstance() : gameCard_;
      } else {
        return gameCardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public Builder setGameCard(bilibili.app.topic.v1.GameCard value) {
      if (gameCardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameCard_ = value;
      } else {
        gameCardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public Builder setGameCard(
        bilibili.app.topic.v1.GameCard.Builder builderForValue) {
      if (gameCardBuilder_ == null) {
        gameCard_ = builderForValue.build();
      } else {
        gameCardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public Builder mergeGameCard(bilibili.app.topic.v1.GameCard value) {
      if (gameCardBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          gameCard_ != null &&
          gameCard_ != bilibili.app.topic.v1.GameCard.getDefaultInstance()) {
          getGameCardBuilder().mergeFrom(value);
        } else {
          gameCard_ = value;
        }
      } else {
        gameCardBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public Builder clearGameCard() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gameCard_ = null;
      if (gameCardBuilder_ != null) {
        gameCardBuilder_.dispose();
        gameCardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public bilibili.app.topic.v1.GameCard.Builder getGameCardBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGameCardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    public bilibili.app.topic.v1.GameCardOrBuilder getGameCardOrBuilder() {
      if (gameCardBuilder_ != null) {
        return gameCardBuilder_.getMessageOrBuilder();
      } else {
        return gameCard_ == null ?
            bilibili.app.topic.v1.GameCard.getDefaultInstance() : gameCard_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.GameCard game_card = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.GameCard, bilibili.app.topic.v1.GameCard.Builder, bilibili.app.topic.v1.GameCardOrBuilder> 
        getGameCardFieldBuilder() {
      if (gameCardBuilder_ == null) {
        gameCardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.GameCard, bilibili.app.topic.v1.GameCard.Builder, bilibili.app.topic.v1.GameCardOrBuilder>(
                getGameCard(),
                getParentForChildren(),
                isClean());
        gameCard_ = null;
      }
      return gameCardBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.FunctionalCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.FunctionalCard)
  private static final bilibili.app.topic.v1.FunctionalCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.FunctionalCard();
  }

  public static bilibili.app.topic.v1.FunctionalCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionalCard>
      PARSER = new com.google.protobuf.AbstractParser<FunctionalCard>() {
    @java.lang.Override
    public FunctionalCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunctionalCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionalCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.FunctionalCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
