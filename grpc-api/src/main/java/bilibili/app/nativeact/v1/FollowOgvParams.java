// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.nativeact.v1.FollowOgvParams}
 */
public final class FollowOgvParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.nativeact.v1.FollowOgvParams)
    FollowOgvParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FollowOgvParams.newBuilder() to construct.
  private FollowOgvParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FollowOgvParams() {
    action_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FollowOgvParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_FollowOgvParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_FollowOgvParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.nativeact.v1.FollowOgvParams.class, bilibili.app.nativeact.v1.FollowOgvParams.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
   * @return The action.
   */
  @java.lang.Override public bilibili.app.nativeact.v1.ActionType getAction() {
    bilibili.app.nativeact.v1.ActionType result = bilibili.app.nativeact.v1.ActionType.forNumber(action_);
    return result == null ? bilibili.app.nativeact.v1.ActionType.UNRECOGNIZED : result;
  }

  public static final int SEASON_ID_FIELD_NUMBER = 2;
  private int seasonId_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 season_id = 2;</code>
   * @return The seasonId.
   */
  @java.lang.Override
  public int getSeasonId() {
    return seasonId_;
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
    if (action_ != bilibili.app.nativeact.v1.ActionType.Default.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (seasonId_ != 0) {
      output.writeInt32(2, seasonId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != bilibili.app.nativeact.v1.ActionType.Default.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (seasonId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, seasonId_);
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
    if (!(obj instanceof bilibili.app.nativeact.v1.FollowOgvParams)) {
      return super.equals(obj);
    }
    bilibili.app.nativeact.v1.FollowOgvParams other = (bilibili.app.nativeact.v1.FollowOgvParams) obj;

    if (action_ != other.action_) return false;
    if (getSeasonId()
        != other.getSeasonId()) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + SEASON_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSeasonId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.nativeact.v1.FollowOgvParams parseFrom(
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
  public static Builder newBuilder(bilibili.app.nativeact.v1.FollowOgvParams prototype) {
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
   * Protobuf type {@code bilibili.app.nativeact.v1.FollowOgvParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.nativeact.v1.FollowOgvParams)
      bilibili.app.nativeact.v1.FollowOgvParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_FollowOgvParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_FollowOgvParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.nativeact.v1.FollowOgvParams.class, bilibili.app.nativeact.v1.FollowOgvParams.Builder.class);
    }

    // Construct using bilibili.app.nativeact.v1.FollowOgvParams.newBuilder()
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
      action_ = 0;
      seasonId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.nativeact.v1.Nativeact.internal_static_bilibili_app_nativeact_v1_FollowOgvParams_descriptor;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.FollowOgvParams getDefaultInstanceForType() {
      return bilibili.app.nativeact.v1.FollowOgvParams.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.FollowOgvParams build() {
      bilibili.app.nativeact.v1.FollowOgvParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.nativeact.v1.FollowOgvParams buildPartial() {
      bilibili.app.nativeact.v1.FollowOgvParams result = new bilibili.app.nativeact.v1.FollowOgvParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.nativeact.v1.FollowOgvParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seasonId_ = seasonId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.nativeact.v1.FollowOgvParams) {
        return mergeFrom((bilibili.app.nativeact.v1.FollowOgvParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.nativeact.v1.FollowOgvParams other) {
      if (other == bilibili.app.nativeact.v1.FollowOgvParams.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (other.getSeasonId() != 0) {
        setSeasonId(other.getSeasonId());
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
              action_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              seasonId_ = input.readInt32();
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

    private int action_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public bilibili.app.nativeact.v1.ActionType getAction() {
      bilibili.app.nativeact.v1.ActionType result = bilibili.app.nativeact.v1.ActionType.forNumber(action_);
      return result == null ? bilibili.app.nativeact.v1.ActionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(bilibili.app.nativeact.v1.ActionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.nativeact.v1.ActionType action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private int seasonId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 season_id = 2;</code>
     * @return The seasonId.
     */
    @java.lang.Override
    public int getSeasonId() {
      return seasonId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 season_id = 2;</code>
     * @param value The seasonId to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonId(int value) {

      seasonId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 season_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seasonId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.nativeact.v1.FollowOgvParams)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.nativeact.v1.FollowOgvParams)
  private static final bilibili.app.nativeact.v1.FollowOgvParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.nativeact.v1.FollowOgvParams();
  }

  public static bilibili.app.nativeact.v1.FollowOgvParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FollowOgvParams>
      PARSER = new com.google.protobuf.AbstractParser<FollowOgvParams>() {
    @java.lang.Override
    public FollowOgvParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<FollowOgvParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FollowOgvParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.nativeact.v1.FollowOgvParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

