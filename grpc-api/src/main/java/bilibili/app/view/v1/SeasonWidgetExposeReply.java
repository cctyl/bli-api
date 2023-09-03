// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.SeasonWidgetExposeReply}
 */
public final class SeasonWidgetExposeReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.SeasonWidgetExposeReply)
    SeasonWidgetExposeReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeasonWidgetExposeReply.newBuilder() to construct.
  private SeasonWidgetExposeReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeasonWidgetExposeReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeasonWidgetExposeReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonWidgetExposeReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonWidgetExposeReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.SeasonWidgetExposeReply.class, bilibili.app.view.v1.SeasonWidgetExposeReply.Builder.class);
  }

  public static final int SEASON_ID_FIELD_NUMBER = 1;
  private long seasonId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 season_id = 1;</code>
   * @return The seasonId.
   */
  @java.lang.Override
  public long getSeasonId() {
    return seasonId_;
  }

  public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
  private long activityId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 activity_id = 2;</code>
   * @return The activityId.
   */
  @java.lang.Override
  public long getActivityId() {
    return activityId_;
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
    if (seasonId_ != 0L) {
      output.writeInt64(1, seasonId_);
    }
    if (activityId_ != 0L) {
      output.writeInt64(2, activityId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seasonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, seasonId_);
    }
    if (activityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, activityId_);
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
    if (!(obj instanceof bilibili.app.view.v1.SeasonWidgetExposeReply)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.SeasonWidgetExposeReply other = (bilibili.app.view.v1.SeasonWidgetExposeReply) obj;

    if (getSeasonId()
        != other.getSeasonId()) return false;
    if (getActivityId()
        != other.getActivityId()) return false;
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
    hash = (37 * hash) + SEASON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeasonId());
    hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActivityId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonWidgetExposeReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.SeasonWidgetExposeReply prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.SeasonWidgetExposeReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.SeasonWidgetExposeReply)
      bilibili.app.view.v1.SeasonWidgetExposeReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonWidgetExposeReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonWidgetExposeReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.SeasonWidgetExposeReply.class, bilibili.app.view.v1.SeasonWidgetExposeReply.Builder.class);
    }

    // Construct using bilibili.app.view.v1.SeasonWidgetExposeReply.newBuilder()
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
      seasonId_ = 0L;
      activityId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonWidgetExposeReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonWidgetExposeReply getDefaultInstanceForType() {
      return bilibili.app.view.v1.SeasonWidgetExposeReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonWidgetExposeReply build() {
      bilibili.app.view.v1.SeasonWidgetExposeReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonWidgetExposeReply buildPartial() {
      bilibili.app.view.v1.SeasonWidgetExposeReply result = new bilibili.app.view.v1.SeasonWidgetExposeReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.SeasonWidgetExposeReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.seasonId_ = seasonId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.activityId_ = activityId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.SeasonWidgetExposeReply) {
        return mergeFrom((bilibili.app.view.v1.SeasonWidgetExposeReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.SeasonWidgetExposeReply other) {
      if (other == bilibili.app.view.v1.SeasonWidgetExposeReply.getDefaultInstance()) return this;
      if (other.getSeasonId() != 0L) {
        setSeasonId(other.getSeasonId());
      }
      if (other.getActivityId() != 0L) {
        setActivityId(other.getActivityId());
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
              seasonId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              activityId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long seasonId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
     * @return The seasonId.
     */
    @java.lang.Override
    public long getSeasonId() {
      return seasonId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
     * @param value The seasonId to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonId(long value) {

      seasonId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      seasonId_ = 0L;
      onChanged();
      return this;
    }

    private long activityId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public long getActivityId() {
      return activityId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @param value The activityId to set.
     * @return This builder for chaining.
     */
    public Builder setActivityId(long value) {

      activityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 activity_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      activityId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.SeasonWidgetExposeReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.SeasonWidgetExposeReply)
  private static final bilibili.app.view.v1.SeasonWidgetExposeReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.SeasonWidgetExposeReply();
  }

  public static bilibili.app.view.v1.SeasonWidgetExposeReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeasonWidgetExposeReply>
      PARSER = new com.google.protobuf.AbstractParser<SeasonWidgetExposeReply>() {
    @java.lang.Override
    public SeasonWidgetExposeReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SeasonWidgetExposeReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeasonWidgetExposeReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.SeasonWidgetExposeReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

