// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.OperationCard}
 */
public final class OperationCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.OperationCard)
    OperationCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationCard.newBuilder() to construct.
  private OperationCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationCard() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperationCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_OperationCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_OperationCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.OperationCard.class, bilibili.app.topic.v1.OperationCard.Builder.class);
  }

  private int cardCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object card_;
  public enum CardCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LARGE_COVER_INLINE(1),
    CARD_NOT_SET(0);
    private final int value;
    private CardCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CardCase valueOf(int value) {
      return forNumber(value);
    }

    public static CardCase forNumber(int value) {
      switch (value) {
        case 1: return LARGE_COVER_INLINE;
        case 0: return CARD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CardCase
  getCardCase() {
    return CardCase.forNumber(
        cardCase_);
  }

  public static final int LARGE_COVER_INLINE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
   * @return Whether the largeCoverInline field is set.
   */
  @java.lang.Override
  public boolean hasLargeCoverInline() {
    return cardCase_ == 1;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
   * @return The largeCoverInline.
   */
  @java.lang.Override
  public bilibili.app.topic.v1.LargeCoverInline getLargeCoverInline() {
    if (cardCase_ == 1) {
       return (bilibili.app.topic.v1.LargeCoverInline) card_;
    }
    return bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.LargeCoverInlineOrBuilder getLargeCoverInlineOrBuilder() {
    if (cardCase_ == 1) {
       return (bilibili.app.topic.v1.LargeCoverInline) card_;
    }
    return bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
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
    if (cardCase_ == 1) {
      output.writeMessage(1, (bilibili.app.topic.v1.LargeCoverInline) card_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cardCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (bilibili.app.topic.v1.LargeCoverInline) card_);
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
    if (!(obj instanceof bilibili.app.topic.v1.OperationCard)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.OperationCard other = (bilibili.app.topic.v1.OperationCard) obj;

    if (!getCardCase().equals(other.getCardCase())) return false;
    switch (cardCase_) {
      case 1:
        if (!getLargeCoverInline()
            .equals(other.getLargeCoverInline())) return false;
        break;
      case 0:
      default:
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
    switch (cardCase_) {
      case 1:
        hash = (37 * hash) + LARGE_COVER_INLINE_FIELD_NUMBER;
        hash = (53 * hash) + getLargeCoverInline().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.OperationCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.OperationCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.OperationCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.OperationCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.OperationCard prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.OperationCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.OperationCard)
      bilibili.app.topic.v1.OperationCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_OperationCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_OperationCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.OperationCard.class, bilibili.app.topic.v1.OperationCard.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.OperationCard.newBuilder()
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
      if (largeCoverInlineBuilder_ != null) {
        largeCoverInlineBuilder_.clear();
      }
      cardCase_ = 0;
      card_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_OperationCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.OperationCard getDefaultInstanceForType() {
      return bilibili.app.topic.v1.OperationCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.OperationCard build() {
      bilibili.app.topic.v1.OperationCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.OperationCard buildPartial() {
      bilibili.app.topic.v1.OperationCard result = new bilibili.app.topic.v1.OperationCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.topic.v1.OperationCard result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(bilibili.app.topic.v1.OperationCard result) {
      result.cardCase_ = cardCase_;
      result.card_ = this.card_;
      if (cardCase_ == 1 &&
          largeCoverInlineBuilder_ != null) {
        result.card_ = largeCoverInlineBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.OperationCard) {
        return mergeFrom((bilibili.app.topic.v1.OperationCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.OperationCard other) {
      if (other == bilibili.app.topic.v1.OperationCard.getDefaultInstance()) return this;
      switch (other.getCardCase()) {
        case LARGE_COVER_INLINE: {
          mergeLargeCoverInline(other.getLargeCoverInline());
          break;
        }
        case CARD_NOT_SET: {
          break;
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
            case 10: {
              input.readMessage(
                  getLargeCoverInlineFieldBuilder().getBuilder(),
                  extensionRegistry);
              cardCase_ = 1;
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
    private int cardCase_ = 0;
    private java.lang.Object card_;
    public CardCase
        getCardCase() {
      return CardCase.forNumber(
          cardCase_);
    }

    public Builder clearCard() {
      cardCase_ = 0;
      card_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.LargeCoverInline, bilibili.app.topic.v1.LargeCoverInline.Builder, bilibili.app.topic.v1.LargeCoverInlineOrBuilder> largeCoverInlineBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     * @return Whether the largeCoverInline field is set.
     */
    @java.lang.Override
    public boolean hasLargeCoverInline() {
      return cardCase_ == 1;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     * @return The largeCoverInline.
     */
    @java.lang.Override
    public bilibili.app.topic.v1.LargeCoverInline getLargeCoverInline() {
      if (largeCoverInlineBuilder_ == null) {
        if (cardCase_ == 1) {
          return (bilibili.app.topic.v1.LargeCoverInline) card_;
        }
        return bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
      } else {
        if (cardCase_ == 1) {
          return largeCoverInlineBuilder_.getMessage();
        }
        return bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    public Builder setLargeCoverInline(bilibili.app.topic.v1.LargeCoverInline value) {
      if (largeCoverInlineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        card_ = value;
        onChanged();
      } else {
        largeCoverInlineBuilder_.setMessage(value);
      }
      cardCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    public Builder setLargeCoverInline(
        bilibili.app.topic.v1.LargeCoverInline.Builder builderForValue) {
      if (largeCoverInlineBuilder_ == null) {
        card_ = builderForValue.build();
        onChanged();
      } else {
        largeCoverInlineBuilder_.setMessage(builderForValue.build());
      }
      cardCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    public Builder mergeLargeCoverInline(bilibili.app.topic.v1.LargeCoverInline value) {
      if (largeCoverInlineBuilder_ == null) {
        if (cardCase_ == 1 &&
            card_ != bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance()) {
          card_ = bilibili.app.topic.v1.LargeCoverInline.newBuilder((bilibili.app.topic.v1.LargeCoverInline) card_)
              .mergeFrom(value).buildPartial();
        } else {
          card_ = value;
        }
        onChanged();
      } else {
        if (cardCase_ == 1) {
          largeCoverInlineBuilder_.mergeFrom(value);
        } else {
          largeCoverInlineBuilder_.setMessage(value);
        }
      }
      cardCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    public Builder clearLargeCoverInline() {
      if (largeCoverInlineBuilder_ == null) {
        if (cardCase_ == 1) {
          cardCase_ = 0;
          card_ = null;
          onChanged();
        }
      } else {
        if (cardCase_ == 1) {
          cardCase_ = 0;
          card_ = null;
        }
        largeCoverInlineBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    public bilibili.app.topic.v1.LargeCoverInline.Builder getLargeCoverInlineBuilder() {
      return getLargeCoverInlineFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    @java.lang.Override
    public bilibili.app.topic.v1.LargeCoverInlineOrBuilder getLargeCoverInlineOrBuilder() {
      if ((cardCase_ == 1) && (largeCoverInlineBuilder_ != null)) {
        return largeCoverInlineBuilder_.getMessageOrBuilder();
      } else {
        if (cardCase_ == 1) {
          return (bilibili.app.topic.v1.LargeCoverInline) card_;
        }
        return bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.topic.v1.LargeCoverInline large_cover_inline = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.topic.v1.LargeCoverInline, bilibili.app.topic.v1.LargeCoverInline.Builder, bilibili.app.topic.v1.LargeCoverInlineOrBuilder> 
        getLargeCoverInlineFieldBuilder() {
      if (largeCoverInlineBuilder_ == null) {
        if (!(cardCase_ == 1)) {
          card_ = bilibili.app.topic.v1.LargeCoverInline.getDefaultInstance();
        }
        largeCoverInlineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.topic.v1.LargeCoverInline, bilibili.app.topic.v1.LargeCoverInline.Builder, bilibili.app.topic.v1.LargeCoverInlineOrBuilder>(
                (bilibili.app.topic.v1.LargeCoverInline) card_,
                getParentForChildren(),
                isClean());
        card_ = null;
      }
      cardCase_ = 1;
      onChanged();
      return largeCoverInlineBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.OperationCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.OperationCard)
  private static final bilibili.app.topic.v1.OperationCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.OperationCard();
  }

  public static bilibili.app.topic.v1.OperationCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationCard>
      PARSER = new com.google.protobuf.AbstractParser<OperationCard>() {
    @java.lang.Override
    public OperationCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<OperationCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.OperationCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

