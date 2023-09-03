// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.Card}
 */
public final class Card extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.Card)
    CardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Card.newBuilder() to construct.
  private Card(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Card() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Card();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Card_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Card_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.Card.class, bilibili.web.interfaces.v1.Card.Builder.class);
  }

  public static final int CARD_FIELD_NUMBER = 1;
  private bilibili.web.interfaces.v1.AccountCard card_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   * @return Whether the card field is set.
   */
  @java.lang.Override
  public boolean hasCard() {
    return card_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   * @return The card.
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.AccountCard getCard() {
    return card_ == null ? bilibili.web.interfaces.v1.AccountCard.getDefaultInstance() : card_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.AccountCardOrBuilder getCardOrBuilder() {
    return card_ == null ? bilibili.web.interfaces.v1.AccountCard.getDefaultInstance() : card_;
  }

  public static final int SPACE_FIELD_NUMBER = 2;
  private bilibili.web.interfaces.v1.Space space_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   * @return Whether the space field is set.
   */
  @java.lang.Override
  public boolean hasSpace() {
    return space_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   * @return The space.
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.Space getSpace() {
    return space_ == null ? bilibili.web.interfaces.v1.Space.getDefaultInstance() : space_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.SpaceOrBuilder getSpaceOrBuilder() {
    return space_ == null ? bilibili.web.interfaces.v1.Space.getDefaultInstance() : space_;
  }

  public static final int FOLLOWING_FIELD_NUMBER = 3;
  private boolean following_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool following = 3;</code>
   * @return The following.
   */
  @java.lang.Override
  public boolean getFollowing() {
    return following_;
  }

  public static final int ARCHIVE_COUNT_FIELD_NUMBER = 4;
  private long archiveCount_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 archive_count = 4;</code>
   * @return The archiveCount.
   */
  @java.lang.Override
  public long getArchiveCount() {
    return archiveCount_;
  }

  public static final int ARTICLE_COUNT_FIELD_NUMBER = 5;
  private int articleCount_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 article_count = 5;</code>
   * @return The articleCount.
   */
  @java.lang.Override
  public int getArticleCount() {
    return articleCount_;
  }

  public static final int FOLLOWER_FIELD_NUMBER = 6;
  private long follower_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 follower = 6;</code>
   * @return The follower.
   */
  @java.lang.Override
  public long getFollower() {
    return follower_;
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
    if (card_ != null) {
      output.writeMessage(1, getCard());
    }
    if (space_ != null) {
      output.writeMessage(2, getSpace());
    }
    if (following_ != false) {
      output.writeBool(3, following_);
    }
    if (archiveCount_ != 0L) {
      output.writeInt64(4, archiveCount_);
    }
    if (articleCount_ != 0) {
      output.writeInt32(5, articleCount_);
    }
    if (follower_ != 0L) {
      output.writeInt64(6, follower_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (card_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCard());
    }
    if (space_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpace());
    }
    if (following_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, following_);
    }
    if (archiveCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, archiveCount_);
    }
    if (articleCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, articleCount_);
    }
    if (follower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, follower_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.Card)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.Card other = (bilibili.web.interfaces.v1.Card) obj;

    if (hasCard() != other.hasCard()) return false;
    if (hasCard()) {
      if (!getCard()
          .equals(other.getCard())) return false;
    }
    if (hasSpace() != other.hasSpace()) return false;
    if (hasSpace()) {
      if (!getSpace()
          .equals(other.getSpace())) return false;
    }
    if (getFollowing()
        != other.getFollowing()) return false;
    if (getArchiveCount()
        != other.getArchiveCount()) return false;
    if (getArticleCount()
        != other.getArticleCount()) return false;
    if (getFollower()
        != other.getFollower()) return false;
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
    if (hasCard()) {
      hash = (37 * hash) + CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCard().hashCode();
    }
    if (hasSpace()) {
      hash = (37 * hash) + SPACE_FIELD_NUMBER;
      hash = (53 * hash) + getSpace().hashCode();
    }
    hash = (37 * hash) + FOLLOWING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFollowing());
    hash = (37 * hash) + ARCHIVE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getArchiveCount());
    hash = (37 * hash) + ARTICLE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getArticleCount();
    hash = (37 * hash) + FOLLOWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFollower());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.Card parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Card parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Card parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Card parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.Card prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.Card}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.Card)
      bilibili.web.interfaces.v1.CardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Card_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Card_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.Card.class, bilibili.web.interfaces.v1.Card.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.Card.newBuilder()
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
      card_ = null;
      if (cardBuilder_ != null) {
        cardBuilder_.dispose();
        cardBuilder_ = null;
      }
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      following_ = false;
      archiveCount_ = 0L;
      articleCount_ = 0;
      follower_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Card_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Card getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.Card.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Card build() {
      bilibili.web.interfaces.v1.Card result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Card buildPartial() {
      bilibili.web.interfaces.v1.Card result = new bilibili.web.interfaces.v1.Card(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.Card result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.card_ = cardBuilder_ == null
            ? card_
            : cardBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.space_ = spaceBuilder_ == null
            ? space_
            : spaceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.following_ = following_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.archiveCount_ = archiveCount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.articleCount_ = articleCount_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.follower_ = follower_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.Card) {
        return mergeFrom((bilibili.web.interfaces.v1.Card)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.Card other) {
      if (other == bilibili.web.interfaces.v1.Card.getDefaultInstance()) return this;
      if (other.hasCard()) {
        mergeCard(other.getCard());
      }
      if (other.hasSpace()) {
        mergeSpace(other.getSpace());
      }
      if (other.getFollowing() != false) {
        setFollowing(other.getFollowing());
      }
      if (other.getArchiveCount() != 0L) {
        setArchiveCount(other.getArchiveCount());
      }
      if (other.getArticleCount() != 0) {
        setArticleCount(other.getArticleCount());
      }
      if (other.getFollower() != 0L) {
        setFollower(other.getFollower());
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
                  getCardFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSpaceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              following_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              archiveCount_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              articleCount_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              follower_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private bilibili.web.interfaces.v1.AccountCard card_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.AccountCard, bilibili.web.interfaces.v1.AccountCard.Builder, bilibili.web.interfaces.v1.AccountCardOrBuilder> cardBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     * @return Whether the card field is set.
     */
    public boolean hasCard() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     * @return The card.
     */
    public bilibili.web.interfaces.v1.AccountCard getCard() {
      if (cardBuilder_ == null) {
        return card_ == null ? bilibili.web.interfaces.v1.AccountCard.getDefaultInstance() : card_;
      } else {
        return cardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public Builder setCard(bilibili.web.interfaces.v1.AccountCard value) {
      if (cardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        card_ = value;
      } else {
        cardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public Builder setCard(
        bilibili.web.interfaces.v1.AccountCard.Builder builderForValue) {
      if (cardBuilder_ == null) {
        card_ = builderForValue.build();
      } else {
        cardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public Builder mergeCard(bilibili.web.interfaces.v1.AccountCard value) {
      if (cardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          card_ != null &&
          card_ != bilibili.web.interfaces.v1.AccountCard.getDefaultInstance()) {
          getCardBuilder().mergeFrom(value);
        } else {
          card_ = value;
        }
      } else {
        cardBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public Builder clearCard() {
      bitField0_ = (bitField0_ & ~0x00000001);
      card_ = null;
      if (cardBuilder_ != null) {
        cardBuilder_.dispose();
        cardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public bilibili.web.interfaces.v1.AccountCard.Builder getCardBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    public bilibili.web.interfaces.v1.AccountCardOrBuilder getCardOrBuilder() {
      if (cardBuilder_ != null) {
        return cardBuilder_.getMessageOrBuilder();
      } else {
        return card_ == null ?
            bilibili.web.interfaces.v1.AccountCard.getDefaultInstance() : card_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.AccountCard, bilibili.web.interfaces.v1.AccountCard.Builder, bilibili.web.interfaces.v1.AccountCardOrBuilder> 
        getCardFieldBuilder() {
      if (cardBuilder_ == null) {
        cardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.web.interfaces.v1.AccountCard, bilibili.web.interfaces.v1.AccountCard.Builder, bilibili.web.interfaces.v1.AccountCardOrBuilder>(
                getCard(),
                getParentForChildren(),
                isClean());
        card_ = null;
      }
      return cardBuilder_;
    }

    private bilibili.web.interfaces.v1.Space space_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.Space, bilibili.web.interfaces.v1.Space.Builder, bilibili.web.interfaces.v1.SpaceOrBuilder> spaceBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     * @return Whether the space field is set.
     */
    public boolean hasSpace() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     * @return The space.
     */
    public bilibili.web.interfaces.v1.Space getSpace() {
      if (spaceBuilder_ == null) {
        return space_ == null ? bilibili.web.interfaces.v1.Space.getDefaultInstance() : space_;
      } else {
        return spaceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public Builder setSpace(bilibili.web.interfaces.v1.Space value) {
      if (spaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        space_ = value;
      } else {
        spaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public Builder setSpace(
        bilibili.web.interfaces.v1.Space.Builder builderForValue) {
      if (spaceBuilder_ == null) {
        space_ = builderForValue.build();
      } else {
        spaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public Builder mergeSpace(bilibili.web.interfaces.v1.Space value) {
      if (spaceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          space_ != null &&
          space_ != bilibili.web.interfaces.v1.Space.getDefaultInstance()) {
          getSpaceBuilder().mergeFrom(value);
        } else {
          space_ = value;
        }
      } else {
        spaceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public Builder clearSpace() {
      bitField0_ = (bitField0_ & ~0x00000002);
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public bilibili.web.interfaces.v1.Space.Builder getSpaceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSpaceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    public bilibili.web.interfaces.v1.SpaceOrBuilder getSpaceOrBuilder() {
      if (spaceBuilder_ != null) {
        return spaceBuilder_.getMessageOrBuilder();
      } else {
        return space_ == null ?
            bilibili.web.interfaces.v1.Space.getDefaultInstance() : space_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.Space, bilibili.web.interfaces.v1.Space.Builder, bilibili.web.interfaces.v1.SpaceOrBuilder> 
        getSpaceFieldBuilder() {
      if (spaceBuilder_ == null) {
        spaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.web.interfaces.v1.Space, bilibili.web.interfaces.v1.Space.Builder, bilibili.web.interfaces.v1.SpaceOrBuilder>(
                getSpace(),
                getParentForChildren(),
                isClean());
        space_ = null;
      }
      return spaceBuilder_;
    }

    private boolean following_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool following = 3;</code>
     * @return The following.
     */
    @java.lang.Override
    public boolean getFollowing() {
      return following_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool following = 3;</code>
     * @param value The following to set.
     * @return This builder for chaining.
     */
    public Builder setFollowing(boolean value) {

      following_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool following = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFollowing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      following_ = false;
      onChanged();
      return this;
    }

    private long archiveCount_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 archive_count = 4;</code>
     * @return The archiveCount.
     */
    @java.lang.Override
    public long getArchiveCount() {
      return archiveCount_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 archive_count = 4;</code>
     * @param value The archiveCount to set.
     * @return This builder for chaining.
     */
    public Builder setArchiveCount(long value) {

      archiveCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 archive_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArchiveCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      archiveCount_ = 0L;
      onChanged();
      return this;
    }

    private int articleCount_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 article_count = 5;</code>
     * @return The articleCount.
     */
    @java.lang.Override
    public int getArticleCount() {
      return articleCount_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 article_count = 5;</code>
     * @param value The articleCount to set.
     * @return This builder for chaining.
     */
    public Builder setArticleCount(int value) {

      articleCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 article_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearArticleCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      articleCount_ = 0;
      onChanged();
      return this;
    }

    private long follower_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 follower = 6;</code>
     * @return The follower.
     */
    @java.lang.Override
    public long getFollower() {
      return follower_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 follower = 6;</code>
     * @param value The follower to set.
     * @return This builder for chaining.
     */
    public Builder setFollower(long value) {

      follower_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 follower = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFollower() {
      bitField0_ = (bitField0_ & ~0x00000020);
      follower_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.Card)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.Card)
  private static final bilibili.web.interfaces.v1.Card DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.Card();
  }

  public static bilibili.web.interfaces.v1.Card getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Card>
      PARSER = new com.google.protobuf.AbstractParser<Card>() {
    @java.lang.Override
    public Card parsePartialFrom(
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

  public static com.google.protobuf.Parser<Card> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Card> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.Card getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

