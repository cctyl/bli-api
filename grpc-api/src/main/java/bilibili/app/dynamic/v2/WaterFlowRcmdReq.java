// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/campus.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.WaterFlowRcmdReq}
 */
public final class WaterFlowRcmdReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.WaterFlowRcmdReq)
    WaterFlowRcmdReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WaterFlowRcmdReq.newBuilder() to construct.
  private WaterFlowRcmdReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WaterFlowRcmdReq() {
    from_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WaterFlowRcmdReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.CampusOuterClass.internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.CampusOuterClass.internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.WaterFlowRcmdReq.class, bilibili.app.dynamic.v2.WaterFlowRcmdReq.Builder.class);
  }

  public static final int CAMPUS_ID_FIELD_NUMBER = 1;
  private long campusId_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 campus_id = 1;</code>
   * @return The campusId.
   */
  @java.lang.Override
  public long getCampusId() {
    return campusId_;
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private int page_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 page = 2;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 3;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * 
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
   * 
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
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
  }

  public static final int FROM_FIELD_NUMBER = 4;
  private int from_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
   * @return The enum numeric value on the wire for from.
   */
  @java.lang.Override public int getFromValue() {
    return from_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
   * @return The from.
   */
  @java.lang.Override public bilibili.app.dynamic.v2.CampusRcmdReqFrom getFrom() {
    bilibili.app.dynamic.v2.CampusRcmdReqFrom result = bilibili.app.dynamic.v2.CampusRcmdReqFrom.forNumber(from_);
    return result == null ? bilibili.app.dynamic.v2.CampusRcmdReqFrom.UNRECOGNIZED : result;
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
    if (page_ != 0) {
      output.writeInt32(2, page_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(3, getPlayerArgs());
    }
    if (from_ != bilibili.app.dynamic.v2.CampusRcmdReqFrom.CAMPUS_RCMD_FROM_UNKNOWN.getNumber()) {
      output.writeEnum(4, from_);
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
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, page_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlayerArgs());
    }
    if (from_ != bilibili.app.dynamic.v2.CampusRcmdReqFrom.CAMPUS_RCMD_FROM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, from_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.WaterFlowRcmdReq)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.WaterFlowRcmdReq other = (bilibili.app.dynamic.v2.WaterFlowRcmdReq) obj;

    if (getCampusId()
        != other.getCampusId()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
    }
    if (from_ != other.from_) return false;
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
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + from_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.WaterFlowRcmdReq prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.WaterFlowRcmdReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.WaterFlowRcmdReq)
      bilibili.app.dynamic.v2.WaterFlowRcmdReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.CampusOuterClass.internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.CampusOuterClass.internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.WaterFlowRcmdReq.class, bilibili.app.dynamic.v2.WaterFlowRcmdReq.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.WaterFlowRcmdReq.newBuilder()
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
      page_ = 0;
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      from_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.CampusOuterClass.internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.WaterFlowRcmdReq getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.WaterFlowRcmdReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.WaterFlowRcmdReq build() {
      bilibili.app.dynamic.v2.WaterFlowRcmdReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.WaterFlowRcmdReq buildPartial() {
      bilibili.app.dynamic.v2.WaterFlowRcmdReq result = new bilibili.app.dynamic.v2.WaterFlowRcmdReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.WaterFlowRcmdReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campusId_ = campusId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.from_ = from_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.WaterFlowRcmdReq) {
        return mergeFrom((bilibili.app.dynamic.v2.WaterFlowRcmdReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.WaterFlowRcmdReq other) {
      if (other == bilibili.app.dynamic.v2.WaterFlowRcmdReq.getDefaultInstance()) return this;
      if (other.getCampusId() != 0L) {
        setCampusId(other.getCampusId());
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
      }
      if (other.from_ != 0) {
        setFromValue(other.getFromValue());
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
              page_ = input.readInt32();
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
              from_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * 
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
     * 
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
     * 
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

    private int page_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {

      page_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.middleware.v1.PlayerArgs, bilibili.app.archive.middleware.v1.PlayerArgs.Builder, bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder> playerArgsBuilder_;
    /**
     * <pre>
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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

    private int from_ = 0;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
     * @return The enum numeric value on the wire for from.
     */
    @java.lang.Override public int getFromValue() {
      return from_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
     * @param value The enum numeric value on the wire for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromValue(int value) {
      from_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
     * @return The from.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusRcmdReqFrom getFrom() {
      bilibili.app.dynamic.v2.CampusRcmdReqFrom result = bilibili.app.dynamic.v2.CampusRcmdReqFrom.forNumber(from_);
      return result == null ? bilibili.app.dynamic.v2.CampusRcmdReqFrom.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(bilibili.app.dynamic.v2.CampusRcmdReqFrom value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      from_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusRcmdReqFrom from = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      bitField0_ = (bitField0_ & ~0x00000008);
      from_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.WaterFlowRcmdReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.WaterFlowRcmdReq)
  private static final bilibili.app.dynamic.v2.WaterFlowRcmdReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.WaterFlowRcmdReq();
  }

  public static bilibili.app.dynamic.v2.WaterFlowRcmdReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WaterFlowRcmdReq>
      PARSER = new com.google.protobuf.AbstractParser<WaterFlowRcmdReq>() {
    @java.lang.Override
    public WaterFlowRcmdReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<WaterFlowRcmdReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WaterFlowRcmdReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.WaterFlowRcmdReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
