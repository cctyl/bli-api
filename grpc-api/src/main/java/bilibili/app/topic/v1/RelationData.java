// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.RelationData}
 */
public final class RelationData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.RelationData)
    RelationDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelationData.newBuilder() to construct.
  private RelationData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelationData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RelationData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RelationData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.RelationData.class, bilibili.app.topic.v1.RelationData.Builder.class);
  }

  public static final int IS_FAV_FIELD_NUMBER = 1;
  private boolean isFav_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_fav = 1;</code>
   * @return The isFav.
   */
  @java.lang.Override
  public boolean getIsFav() {
    return isFav_;
  }

  public static final int IS_COIN_FIELD_NUMBER = 2;
  private boolean isCoin_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_coin = 2;</code>
   * @return The isCoin.
   */
  @java.lang.Override
  public boolean getIsCoin() {
    return isCoin_;
  }

  public static final int IS_FOLLOW_FIELD_NUMBER = 3;
  private boolean isFollow_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_follow = 3;</code>
   * @return The isFollow.
   */
  @java.lang.Override
  public boolean getIsFollow() {
    return isFollow_;
  }

  public static final int IS_LIKE_FIELD_NUMBER = 4;
  private boolean isLike_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_like = 4;</code>
   * @return The isLike.
   */
  @java.lang.Override
  public boolean getIsLike() {
    return isLike_;
  }

  public static final int LIKE_COUNT_FIELD_NUMBER = 5;
  private long likeCount_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 like_count = 5;</code>
   * @return The likeCount.
   */
  @java.lang.Override
  public long getLikeCount() {
    return likeCount_;
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
    if (isFav_ != false) {
      output.writeBool(1, isFav_);
    }
    if (isCoin_ != false) {
      output.writeBool(2, isCoin_);
    }
    if (isFollow_ != false) {
      output.writeBool(3, isFollow_);
    }
    if (isLike_ != false) {
      output.writeBool(4, isLike_);
    }
    if (likeCount_ != 0L) {
      output.writeInt64(5, likeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isFav_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isFav_);
    }
    if (isCoin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isCoin_);
    }
    if (isFollow_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isFollow_);
    }
    if (isLike_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isLike_);
    }
    if (likeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, likeCount_);
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
    if (!(obj instanceof bilibili.app.topic.v1.RelationData)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.RelationData other = (bilibili.app.topic.v1.RelationData) obj;

    if (getIsFav()
        != other.getIsFav()) return false;
    if (getIsCoin()
        != other.getIsCoin()) return false;
    if (getIsFollow()
        != other.getIsFollow()) return false;
    if (getIsLike()
        != other.getIsLike()) return false;
    if (getLikeCount()
        != other.getLikeCount()) return false;
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
    hash = (37 * hash) + IS_FAV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFav());
    hash = (37 * hash) + IS_COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCoin());
    hash = (37 * hash) + IS_FOLLOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFollow());
    hash = (37 * hash) + IS_LIKE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLike());
    hash = (37 * hash) + LIKE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLikeCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.RelationData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RelationData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RelationData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.RelationData parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.RelationData prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.RelationData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.RelationData)
      bilibili.app.topic.v1.RelationDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RelationData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RelationData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.RelationData.class, bilibili.app.topic.v1.RelationData.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.RelationData.newBuilder()
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
      isFav_ = false;
      isCoin_ = false;
      isFollow_ = false;
      isLike_ = false;
      likeCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_RelationData_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RelationData getDefaultInstanceForType() {
      return bilibili.app.topic.v1.RelationData.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RelationData build() {
      bilibili.app.topic.v1.RelationData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.RelationData buildPartial() {
      bilibili.app.topic.v1.RelationData result = new bilibili.app.topic.v1.RelationData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.topic.v1.RelationData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isFav_ = isFav_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isCoin_ = isCoin_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isFollow_ = isFollow_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isLike_ = isLike_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.likeCount_ = likeCount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.RelationData) {
        return mergeFrom((bilibili.app.topic.v1.RelationData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.RelationData other) {
      if (other == bilibili.app.topic.v1.RelationData.getDefaultInstance()) return this;
      if (other.getIsFav() != false) {
        setIsFav(other.getIsFav());
      }
      if (other.getIsCoin() != false) {
        setIsCoin(other.getIsCoin());
      }
      if (other.getIsFollow() != false) {
        setIsFollow(other.getIsFollow());
      }
      if (other.getIsLike() != false) {
        setIsLike(other.getIsLike());
      }
      if (other.getLikeCount() != 0L) {
        setLikeCount(other.getLikeCount());
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
              isFav_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              isCoin_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isFollow_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              isLike_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              likeCount_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private boolean isFav_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_fav = 1;</code>
     * @return The isFav.
     */
    @java.lang.Override
    public boolean getIsFav() {
      return isFav_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_fav = 1;</code>
     * @param value The isFav to set.
     * @return This builder for chaining.
     */
    public Builder setIsFav(boolean value) {

      isFav_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_fav = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFav() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isFav_ = false;
      onChanged();
      return this;
    }

    private boolean isCoin_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_coin = 2;</code>
     * @return The isCoin.
     */
    @java.lang.Override
    public boolean getIsCoin() {
      return isCoin_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_coin = 2;</code>
     * @param value The isCoin to set.
     * @return This builder for chaining.
     */
    public Builder setIsCoin(boolean value) {

      isCoin_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_coin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCoin() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isCoin_ = false;
      onChanged();
      return this;
    }

    private boolean isFollow_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_follow = 3;</code>
     * @return The isFollow.
     */
    @java.lang.Override
    public boolean getIsFollow() {
      return isFollow_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_follow = 3;</code>
     * @param value The isFollow to set.
     * @return This builder for chaining.
     */
    public Builder setIsFollow(boolean value) {

      isFollow_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_follow = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFollow() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isFollow_ = false;
      onChanged();
      return this;
    }

    private boolean isLike_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_like = 4;</code>
     * @return The isLike.
     */
    @java.lang.Override
    public boolean getIsLike() {
      return isLike_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_like = 4;</code>
     * @param value The isLike to set.
     * @return This builder for chaining.
     */
    public Builder setIsLike(boolean value) {

      isLike_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool is_like = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLike() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isLike_ = false;
      onChanged();
      return this;
    }

    private long likeCount_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 like_count = 5;</code>
     * @return The likeCount.
     */
    @java.lang.Override
    public long getLikeCount() {
      return likeCount_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 like_count = 5;</code>
     * @param value The likeCount to set.
     * @return This builder for chaining.
     */
    public Builder setLikeCount(long value) {

      likeCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 like_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLikeCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      likeCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.RelationData)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.RelationData)
  private static final bilibili.app.topic.v1.RelationData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.RelationData();
  }

  public static bilibili.app.topic.v1.RelationData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationData>
      PARSER = new com.google.protobuf.AbstractParser<RelationData>() {
    @java.lang.Override
    public RelationData parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.RelationData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

