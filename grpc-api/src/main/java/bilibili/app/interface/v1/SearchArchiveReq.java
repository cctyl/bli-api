// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/space.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.SearchArchiveReq}
 */
public final class SearchArchiveReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.SearchArchiveReq)
    SearchArchiveReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchArchiveReq.newBuilder() to construct.
  private SearchArchiveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchArchiveReq() {
    keyword_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchArchiveReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.SpaceOuterClass.internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.SpaceOuterClass.internal_static_bilibili_app_interface_v1_SearchArchiveReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.SearchArchiveReq.class, bilibili.app.interface.v1.SearchArchiveReq.Builder.class);
  }

  public static final int KEYWORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyword_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string keyword = 1;</code>
   * @return The keyword.
   */
  @java.lang.Override
  public java.lang.String getKeyword() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyword_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string keyword = 1;</code>
   * @return The bytes for keyword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordBytes() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MID_FIELD_NUMBER = 2;
  private long mid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 2;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
  }

  public static final int PN_FIELD_NUMBER = 3;
  private long pn_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pn = 3;</code>
   * @return The pn.
   */
  @java.lang.Override
  public long getPn() {
    return pn_;
  }

  public static final int PS_FIELD_NUMBER = 4;
  private long ps_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ps = 4;</code>
   * @return The ps.
   */
  @java.lang.Override
  public long getPs() {
    return ps_;
  }

  public static final int PLAYER_ARGS_FIELD_NUMBER = 5;
  private bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder() {
    return playerArgs_ == null ? bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyword_);
    }
    if (mid_ != 0L) {
      output.writeInt64(2, mid_);
    }
    if (pn_ != 0L) {
      output.writeInt64(3, pn_);
    }
    if (ps_ != 0L) {
      output.writeInt64(4, ps_);
    }
    if (playerArgs_ != null) {
      output.writeMessage(5, getPlayerArgs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyword_);
    }
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mid_);
    }
    if (pn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pn_);
    }
    if (ps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, ps_);
    }
    if (playerArgs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPlayerArgs());
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
    if (!(obj instanceof bilibili.app.interface.v1.SearchArchiveReq)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.SearchArchiveReq other = (bilibili.app.interface.v1.SearchArchiveReq) obj;

    if (!getKeyword()
        .equals(other.getKeyword())) return false;
    if (getMid()
        != other.getMid()) return false;
    if (getPn()
        != other.getPn()) return false;
    if (getPs()
        != other.getPs()) return false;
    if (hasPlayerArgs() != other.hasPlayerArgs()) return false;
    if (hasPlayerArgs()) {
      if (!getPlayerArgs()
          .equals(other.getPlayerArgs())) return false;
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
    hash = (37 * hash) + KEYWORD_FIELD_NUMBER;
    hash = (53 * hash) + getKeyword().hashCode();
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (37 * hash) + PN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPn());
    hash = (37 * hash) + PS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPs());
    if (hasPlayerArgs()) {
      hash = (37 * hash) + PLAYER_ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SearchArchiveReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.SearchArchiveReq prototype) {
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
   * Protobuf type {@code bilibili.app.interface.v1.SearchArchiveReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.SearchArchiveReq)
      bilibili.app.interface.v1.SearchArchiveReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.SpaceOuterClass.internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.SpaceOuterClass.internal_static_bilibili_app_interface_v1_SearchArchiveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.SearchArchiveReq.class, bilibili.app.interface.v1.SearchArchiveReq.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.SearchArchiveReq.newBuilder()
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
      keyword_ = "";
      mid_ = 0L;
      pn_ = 0L;
      ps_ = 0L;
      playerArgs_ = null;
      if (playerArgsBuilder_ != null) {
        playerArgsBuilder_.dispose();
        playerArgsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.SpaceOuterClass.internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchArchiveReq getDefaultInstanceForType() {
      return bilibili.app.interface.v1.SearchArchiveReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchArchiveReq build() {
      bilibili.app.interface.v1.SearchArchiveReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SearchArchiveReq buildPartial() {
      bilibili.app.interface.v1.SearchArchiveReq result = new bilibili.app.interface.v1.SearchArchiveReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.SearchArchiveReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyword_ = keyword_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pn_ = pn_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ps_ = ps_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.playerArgs_ = playerArgsBuilder_ == null
            ? playerArgs_
            : playerArgsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.SearchArchiveReq) {
        return mergeFrom((bilibili.app.interface.v1.SearchArchiveReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.SearchArchiveReq other) {
      if (other == bilibili.app.interface.v1.SearchArchiveReq.getDefaultInstance()) return this;
      if (!other.getKeyword().isEmpty()) {
        keyword_ = other.keyword_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (other.getPn() != 0L) {
        setPn(other.getPn());
      }
      if (other.getPs() != 0L) {
        setPs(other.getPs());
      }
      if (other.hasPlayerArgs()) {
        mergePlayerArgs(other.getPlayerArgs());
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
              keyword_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              mid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              pn_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              ps_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getPlayerArgsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object keyword_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return The keyword.
     */
    public java.lang.String getKeyword() {
      java.lang.Object ref = keyword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return The bytes for keyword.
     */
    public com.google.protobuf.ByteString
        getKeywordBytes() {
      java.lang.Object ref = keyword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @param value The keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeyword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyword_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyword() {
      keyword_ = getDefaultInstance().getKeyword();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @param value The bytes for keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyword_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long mid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @return The mid.
     */
    @java.lang.Override
    public long getMid() {
      return mid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mid_ = 0L;
      onChanged();
      return this;
    }

    private long pn_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 pn = 3;</code>
     * @return The pn.
     */
    @java.lang.Override
    public long getPn() {
      return pn_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 pn = 3;</code>
     * @param value The pn to set.
     * @return This builder for chaining.
     */
    public Builder setPn(long value) {

      pn_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 pn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPn() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pn_ = 0L;
      onChanged();
      return this;
    }

    private long ps_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ps = 4;</code>
     * @return The ps.
     */
    @java.lang.Override
    public long getPs() {
      return ps_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ps = 4;</code>
     * @param value The ps to set.
     * @return This builder for chaining.
     */
    public Builder setPs(long value) {

      ps_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 ps = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ps_ = 0L;
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     * @return Whether the playerArgs field is set.
     */
    public boolean hasPlayerArgs() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder setPlayerArgs(
        bilibili.app.archive.middleware.v1.PlayerArgs.Builder builderForValue) {
      if (playerArgsBuilder_ == null) {
        playerArgs_ = builderForValue.build();
      } else {
        playerArgsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder mergePlayerArgs(bilibili.app.archive.middleware.v1.PlayerArgs value) {
      if (playerArgsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          playerArgs_ != null &&
          playerArgs_ != bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance()) {
          getPlayerArgsBuilder().mergeFrom(value);
        } else {
          playerArgs_ = value;
        }
      } else {
        playerArgsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public Builder clearPlayerArgs() {
      bitField0_ = (bitField0_ & ~0x00000010);
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
     */
    public bilibili.app.archive.middleware.v1.PlayerArgs.Builder getPlayerArgsBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getPlayerArgsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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
     * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.SearchArchiveReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.SearchArchiveReq)
  private static final bilibili.app.interface.v1.SearchArchiveReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.SearchArchiveReq();
  }

  public static bilibili.app.interface.v1.SearchArchiveReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchArchiveReq>
      PARSER = new com.google.protobuf.AbstractParser<SearchArchiveReq>() {
    @java.lang.Override
    public SearchArchiveReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchArchiveReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchArchiveReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.SearchArchiveReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
