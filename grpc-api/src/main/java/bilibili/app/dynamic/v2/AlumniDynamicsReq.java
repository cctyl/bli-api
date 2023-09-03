// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.AlumniDynamicsReq}
 */
public final class AlumniDynamicsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.AlumniDynamicsReq)
    AlumniDynamicsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlumniDynamicsReq.newBuilder() to construct.
  private AlumniDynamicsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlumniDynamicsReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlumniDynamicsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AlumniDynamicsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AlumniDynamicsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.AlumniDynamicsReq.class, bilibili.app.dynamic.v2.AlumniDynamicsReq.Builder.class);
  }

  public static final int CAMPUS_ID_FIELD_NUMBER = 1;
  private long campusId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 campus_id = 1;</code>
   * @return The campusId.
   */
  @java.lang.Override
  public long getCampusId() {
    return campusId_;
  }

  public static final int FIRST_TIME_FIELD_NUMBER = 2;
  private int firstTime_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 first_time = 2;</code>
   * @return The firstTime.
   */
  @java.lang.Override
  public int getFirstTime() {
    return firstTime_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 3;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return Whether the playerArgs field is set.
   */
  @java.lang.Override
  public boolean hasPlayerArgs() {
    return playerArgs_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return The playerArgs.
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }

  public static final int LOCAL_TIME_FIELD_NUMBER = 4;
  private int localTime_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 local_time = 4;</code>
   * @return The localTime.
   */
  @java.lang.Override
  public int getLocalTime() {
    return localTime_;
  }

  public static final int PAGE_FIELD_NUMBER = 5;
  private int page_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 page = 5;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int FROM_TYPE_FIELD_NUMBER = 6;
  private int fromType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 from_type = 6;</code>
   * @return The fromType.
   */
  @java.lang.Override
  public int getFromType() {
    return fromType_;
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
    if (campusId_ != 0L) {
      output.writeInt64(1, campusId_);
    }
    if (firstTime_ != 0) {
      output.writeInt32(2, firstTime_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(3, getPlayerArgs());
    }
    if (localTime_ != 0) {
      output.writeInt32(4, localTime_);
    }
    if (page_ != 0) {
      output.writeInt32(5, page_);
    }
    if (fromType_ != 0) {
      output.writeInt32(6, fromType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campusId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, campusId_);
    }
    if (firstTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, firstTime_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlayerArgs());
    }
    if (localTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, localTime_);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, page_);
    }
    if (fromType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, fromType_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.AlumniDynamicsReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.AlumniDynamicsReq other = (bilibili.app.dynamic.v2.AlumniDynamicsReq) obj;

    if (getCampusId()
        != other.getCampusId()) return false;
    if (getFirstTime()
        != other.getFirstTime()) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
    }
    if (getLocalTime()
        != other.getLocalTime()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getFromType()
        != other.getFromType()) return false;
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
    hash = (37 * hash) + CAMPUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampusId());
    hash = (37 * hash) + FIRST_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstTime();
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (37 * hash) + LOCAL_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getLocalTime();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + FROM_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFromType();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.AlumniDynamicsReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.AlumniDynamicsReq prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.AlumniDynamicsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.AlumniDynamicsReq)
      bilibili.app.dynamic.v2.AlumniDynamicsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AlumniDynamicsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AlumniDynamicsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.AlumniDynamicsReq.class, bilibili.app.dynamic.v2.AlumniDynamicsReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.AlumniDynamicsReq.newBuilder()
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
      campusId_ = 0L;
      firstTime_ = 0;
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      localTime_ = 0;
      page_ = 0;
      fromType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AlumniDynamicsReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.AlumniDynamicsReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.AlumniDynamicsReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.AlumniDynamicsReq build() {
      bilibili.app.dynamic.v2.AlumniDynamicsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.AlumniDynamicsReq buildPartial() {
      bilibili.app.dynamic.v2.AlumniDynamicsReq result = new bilibili.app.dynamic.v2.AlumniDynamicsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.AlumniDynamicsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campusId_ = campusId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.firstTime_ = firstTime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.localTime_ = localTime_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.fromType_ = fromType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.AlumniDynamicsReq) {
        return mergeFrom((bilibili.app.dynamic.v2.AlumniDynamicsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.AlumniDynamicsReq other) {
      if (other == bilibili.app.dynamic.v2.AlumniDynamicsReq.getDefaultInstance()) return this;
      if (other.getCampusId() != 0L) {
        setCampusId(other.getCampusId());
      }
      if (other.getFirstTime() != 0) {
        setFirstTime(other.getFirstTime());
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
      }
      if (other.getLocalTime() != 0) {
        setLocalTime(other.getLocalTime());
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getFromType() != 0) {
        setFromType(other.getFromType());
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
              campusId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              firstTime_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              localTime_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              page_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              fromType_ = input.readInt32();
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

    private long campusId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @return The campusId.
     */
    @java.lang.Override
    public long getCampusId() {
      return campusId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @param value The campusId to set.
     * @return This builder for chaining.
     */
    public Builder setCampusId(long value) {

      campusId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campusId_ = 0L;
      onChanged();
      return this;
    }

    private int firstTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 first_time = 2;</code>
     * @return The firstTime.
     */
    @java.lang.Override
    public int getFirstTime() {
      return firstTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 first_time = 2;</code>
     * @param value The firstTime to set.
     * @return This builder for chaining.
     */
    public Builder setFirstTime(int value) {

      firstTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 first_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      firstTime_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     * @return The playerArgs.
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
      if (playerArgsBuilder_ == null) {
        return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      } else {
        return playerArgsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder setPlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerArgs_ = value;
      } else {
        playerArgsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
      if (playerArgsBuilder_ != null) {
        return playerArgsBuilder_.getMessageOrBuilder();
      } else {
        return playerArgs_ == null ?
            bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> 
        getPlayerArgsFieldBuilder() {
      if (playerArgsBuilder_ == null) {
        playerArgsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder>(
                getPlayerArgs(),
                getParentForChildren(),
                isClean());
        playerArgs_ = null;
      }
      return playerArgsBuilder_;
    }

    private int localTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @return The localTime.
     */
    @java.lang.Override
    public int getLocalTime() {
      return localTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @param value The localTime to set.
     * @return This builder for chaining.
     */
    public Builder setLocalTime(int value) {

      localTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 local_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      localTime_ = 0;
      onChanged();
      return this;
    }

    private int page_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 5;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 5;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {

      page_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000010);
      page_ = 0;
      onChanged();
      return this;
    }

    private int fromType_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 from_type = 6;</code>
     * @return The fromType.
     */
    @java.lang.Override
    public int getFromType() {
      return fromType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 from_type = 6;</code>
     * @param value The fromType to set.
     * @return This builder for chaining.
     */
    public Builder setFromType(int value) {

      fromType_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 from_type = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromType() {
      bitField0_ = (bitField0_ & ~0x00000020);
      fromType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.AlumniDynamicsReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.AlumniDynamicsReq)
  private static final bilibili.app.dynamic.v2.AlumniDynamicsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.AlumniDynamicsReq();
  }

  public static bilibili.app.dynamic.v2.AlumniDynamicsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlumniDynamicsReq>
      PARSER = new com.google.protobuf.AbstractParser<AlumniDynamicsReq>() {
    @java.lang.Override
    public AlumniDynamicsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlumniDynamicsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlumniDynamicsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.AlumniDynamicsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

