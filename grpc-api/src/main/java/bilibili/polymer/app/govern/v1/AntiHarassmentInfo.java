// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/community/govern/v1/govern.proto

package bilibili.polymer.app.govern.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.govern.v1.AntiHarassmentInfo}
 */
public final class AntiHarassmentInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.govern.v1.AntiHarassmentInfo)
    AntiHarassmentInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AntiHarassmentInfo.newBuilder() to construct.
  private AntiHarassmentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AntiHarassmentInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AntiHarassmentInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_AntiHarassmentInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_AntiHarassmentInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.govern.v1.AntiHarassmentInfo.class, bilibili.polymer.app.govern.v1.AntiHarassmentInfo.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private int limit_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 limit = 1;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
  }

  public static final int FOLLOW_TIME_LIMIT_SECOND_FIELD_NUMBER = 2;
  private int followTimeLimitSecond_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 follow_time_limit_second = 2;</code>
   * @return The followTimeLimitSecond.
   */
  @java.lang.Override
  public int getFollowTimeLimitSecond() {
    return followTimeLimitSecond_;
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 3;
  private long expireTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 expire_time = 3;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public long getExpireTime() {
    return expireTime_;
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
    if (limit_ != 0) {
      output.writeInt32(1, limit_);
    }
    if (followTimeLimitSecond_ != 0) {
      output.writeInt32(2, followTimeLimitSecond_);
    }
    if (expireTime_ != 0L) {
      output.writeInt64(3, expireTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, limit_);
    }
    if (followTimeLimitSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, followTimeLimitSecond_);
    }
    if (expireTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, expireTime_);
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
    if (!(obj instanceof bilibili.polymer.app.govern.v1.AntiHarassmentInfo)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.govern.v1.AntiHarassmentInfo other = (bilibili.polymer.app.govern.v1.AntiHarassmentInfo) obj;

    if (getLimit()
        != other.getLimit()) return false;
    if (getFollowTimeLimitSecond()
        != other.getFollowTimeLimitSecond()) return false;
    if (getExpireTime()
        != other.getExpireTime()) return false;
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
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + FOLLOW_TIME_LIMIT_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getFollowTimeLimitSecond();
    hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.govern.v1.AntiHarassmentInfo prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.govern.v1.AntiHarassmentInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.govern.v1.AntiHarassmentInfo)
      bilibili.polymer.app.govern.v1.AntiHarassmentInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_AntiHarassmentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_AntiHarassmentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.govern.v1.AntiHarassmentInfo.class, bilibili.polymer.app.govern.v1.AntiHarassmentInfo.Builder.class);
    }

    // Construct using bilibili.polymer.app.govern.v1.AntiHarassmentInfo.newBuilder()
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
      limit_ = 0;
      followTimeLimitSecond_ = 0;
      expireTime_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_AntiHarassmentInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.AntiHarassmentInfo getDefaultInstanceForType() {
      return bilibili.polymer.app.govern.v1.AntiHarassmentInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.AntiHarassmentInfo build() {
      bilibili.polymer.app.govern.v1.AntiHarassmentInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.AntiHarassmentInfo buildPartial() {
      bilibili.polymer.app.govern.v1.AntiHarassmentInfo result = new bilibili.polymer.app.govern.v1.AntiHarassmentInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.govern.v1.AntiHarassmentInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.followTimeLimitSecond_ = followTimeLimitSecond_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expireTime_ = expireTime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.govern.v1.AntiHarassmentInfo) {
        return mergeFrom((bilibili.polymer.app.govern.v1.AntiHarassmentInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.govern.v1.AntiHarassmentInfo other) {
      if (other == bilibili.polymer.app.govern.v1.AntiHarassmentInfo.getDefaultInstance()) return this;
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getFollowTimeLimitSecond() != 0) {
        setFollowTimeLimitSecond(other.getFollowTimeLimitSecond());
      }
      if (other.getExpireTime() != 0L) {
        setExpireTime(other.getExpireTime());
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
              limit_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              followTimeLimitSecond_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              expireTime_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int limit_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {

      limit_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      limit_ = 0;
      onChanged();
      return this;
    }

    private int followTimeLimitSecond_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 follow_time_limit_second = 2;</code>
     * @return The followTimeLimitSecond.
     */
    @java.lang.Override
    public int getFollowTimeLimitSecond() {
      return followTimeLimitSecond_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 follow_time_limit_second = 2;</code>
     * @param value The followTimeLimitSecond to set.
     * @return This builder for chaining.
     */
    public Builder setFollowTimeLimitSecond(int value) {

      followTimeLimitSecond_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 follow_time_limit_second = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFollowTimeLimitSecond() {
      bitField0_ = (bitField0_ & ~0x00000002);
      followTimeLimitSecond_ = 0;
      onChanged();
      return this;
    }

    private long expireTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 expire_time = 3;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public long getExpireTime() {
      return expireTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 expire_time = 3;</code>
     * @param value The expireTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTime(long value) {

      expireTime_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 expire_time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expireTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.govern.v1.AntiHarassmentInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.govern.v1.AntiHarassmentInfo)
  private static final bilibili.polymer.app.govern.v1.AntiHarassmentInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.govern.v1.AntiHarassmentInfo();
  }

  public static bilibili.polymer.app.govern.v1.AntiHarassmentInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AntiHarassmentInfo>
      PARSER = new com.google.protobuf.AbstractParser<AntiHarassmentInfo>() {
    @java.lang.Override
    public AntiHarassmentInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AntiHarassmentInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AntiHarassmentInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.govern.v1.AntiHarassmentInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
