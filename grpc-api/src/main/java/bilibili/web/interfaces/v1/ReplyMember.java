// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.ReplyMember}
 */
public final class ReplyMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.ReplyMember)
    ReplyMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplyMember.newBuilder() to construct.
  private ReplyMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyMember() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplyMember();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReplyMember_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReplyMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.ReplyMember.class, bilibili.web.interfaces.v1.ReplyMember.Builder.class);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  private bilibili.web.interfaces.v1.ReplyMemberInfo info_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
   * @return The info.
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.ReplyMemberInfo getInfo() {
    return info_ == null ? bilibili.web.interfaces.v1.ReplyMemberInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? bilibili.web.interfaces.v1.ReplyMemberInfo.getDefaultInstance() : info_;
  }

  public static final int FANS_DETAIL_FIELD_NUMBER = 2;
  private bilibili.web.interfaces.v1.ReplyFansDetail fansDetail_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
   * @return Whether the fansDetail field is set.
   */
  @java.lang.Override
  public boolean hasFansDetail() {
    return fansDetail_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
   * @return The fansDetail.
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.ReplyFansDetail getFansDetail() {
    return fansDetail_ == null ? bilibili.web.interfaces.v1.ReplyFansDetail.getDefaultInstance() : fansDetail_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
   */
  @java.lang.Override
  public bilibili.web.interfaces.v1.ReplyFansDetailOrBuilder getFansDetailOrBuilder() {
    return fansDetail_ == null ? bilibili.web.interfaces.v1.ReplyFansDetail.getDefaultInstance() : fansDetail_;
  }

  public static final int FOLLOWING_FIELD_NUMBER = 3;
  private int following_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 following = 3;</code>
   * @return The following.
   */
  @java.lang.Override
  public int getFollowing() {
    return following_;
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
    if (info_ != null) {
      output.writeMessage(1, getInfo());
    }
    if (fansDetail_ != null) {
      output.writeMessage(2, getFansDetail());
    }
    if (following_ != 0) {
      output.writeInt32(3, following_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfo());
    }
    if (fansDetail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFansDetail());
    }
    if (following_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, following_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.ReplyMember)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.ReplyMember other = (bilibili.web.interfaces.v1.ReplyMember) obj;

    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (hasFansDetail() != other.hasFansDetail()) return false;
    if (hasFansDetail()) {
      if (!getFansDetail()
          .equals(other.getFansDetail())) return false;
    }
    if (getFollowing()
        != other.getFollowing()) return false;
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    if (hasFansDetail()) {
      hash = (37 * hash) + FANS_DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getFansDetail().hashCode();
    }
    hash = (37 * hash) + FOLLOWING_FIELD_NUMBER;
    hash = (53 * hash) + getFollowing();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReplyMember parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.ReplyMember prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.ReplyMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.ReplyMember)
      bilibili.web.interfaces.v1.ReplyMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReplyMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReplyMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.ReplyMember.class, bilibili.web.interfaces.v1.ReplyMember.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.ReplyMember.newBuilder()
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
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      fansDetail_ = null;
      if (fansDetailBuilder_ != null) {
        fansDetailBuilder_.dispose();
        fansDetailBuilder_ = null;
      }
      following_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReplyMember_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReplyMember getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.ReplyMember.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReplyMember build() {
      bilibili.web.interfaces.v1.ReplyMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReplyMember buildPartial() {
      bilibili.web.interfaces.v1.ReplyMember result = new bilibili.web.interfaces.v1.ReplyMember(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.ReplyMember result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fansDetail_ = fansDetailBuilder_ == null
            ? fansDetail_
            : fansDetailBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.following_ = following_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.ReplyMember) {
        return mergeFrom((bilibili.web.interfaces.v1.ReplyMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.ReplyMember other) {
      if (other == bilibili.web.interfaces.v1.ReplyMember.getDefaultInstance()) return this;
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (other.hasFansDetail()) {
        mergeFansDetail(other.getFansDetail());
      }
      if (other.getFollowing() != 0) {
        setFollowing(other.getFollowing());
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
                  getInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFansDetailFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              following_ = input.readInt32();
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

    private bilibili.web.interfaces.v1.ReplyMemberInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.ReplyMemberInfo, bilibili.web.interfaces.v1.ReplyMemberInfo.Builder, bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     * @return The info.
     */
    public bilibili.web.interfaces.v1.ReplyMemberInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? bilibili.web.interfaces.v1.ReplyMemberInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public Builder setInfo(bilibili.web.interfaces.v1.ReplyMemberInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public Builder setInfo(
        bilibili.web.interfaces.v1.ReplyMemberInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public Builder mergeInfo(bilibili.web.interfaces.v1.ReplyMemberInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          info_ != null &&
          info_ != bilibili.web.interfaces.v1.ReplyMemberInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public bilibili.web.interfaces.v1.ReplyMemberInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    public bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            bilibili.web.interfaces.v1.ReplyMemberInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyMemberInfo info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.ReplyMemberInfo, bilibili.web.interfaces.v1.ReplyMemberInfo.Builder, bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.web.interfaces.v1.ReplyMemberInfo, bilibili.web.interfaces.v1.ReplyMemberInfo.Builder, bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private bilibili.web.interfaces.v1.ReplyFansDetail fansDetail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.ReplyFansDetail, bilibili.web.interfaces.v1.ReplyFansDetail.Builder, bilibili.web.interfaces.v1.ReplyFansDetailOrBuilder> fansDetailBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     * @return Whether the fansDetail field is set.
     */
    public boolean hasFansDetail() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     * @return The fansDetail.
     */
    public bilibili.web.interfaces.v1.ReplyFansDetail getFansDetail() {
      if (fansDetailBuilder_ == null) {
        return fansDetail_ == null ? bilibili.web.interfaces.v1.ReplyFansDetail.getDefaultInstance() : fansDetail_;
      } else {
        return fansDetailBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public Builder setFansDetail(bilibili.web.interfaces.v1.ReplyFansDetail value) {
      if (fansDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fansDetail_ = value;
      } else {
        fansDetailBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public Builder setFansDetail(
        bilibili.web.interfaces.v1.ReplyFansDetail.Builder builderForValue) {
      if (fansDetailBuilder_ == null) {
        fansDetail_ = builderForValue.build();
      } else {
        fansDetailBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public Builder mergeFansDetail(bilibili.web.interfaces.v1.ReplyFansDetail value) {
      if (fansDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fansDetail_ != null &&
          fansDetail_ != bilibili.web.interfaces.v1.ReplyFansDetail.getDefaultInstance()) {
          getFansDetailBuilder().mergeFrom(value);
        } else {
          fansDetail_ = value;
        }
      } else {
        fansDetailBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public Builder clearFansDetail() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fansDetail_ = null;
      if (fansDetailBuilder_ != null) {
        fansDetailBuilder_.dispose();
        fansDetailBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public bilibili.web.interfaces.v1.ReplyFansDetail.Builder getFansDetailBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFansDetailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    public bilibili.web.interfaces.v1.ReplyFansDetailOrBuilder getFansDetailOrBuilder() {
      if (fansDetailBuilder_ != null) {
        return fansDetailBuilder_.getMessageOrBuilder();
      } else {
        return fansDetail_ == null ?
            bilibili.web.interfaces.v1.ReplyFansDetail.getDefaultInstance() : fansDetail_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.web.interfaces.v1.ReplyFansDetail fans_detail = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.web.interfaces.v1.ReplyFansDetail, bilibili.web.interfaces.v1.ReplyFansDetail.Builder, bilibili.web.interfaces.v1.ReplyFansDetailOrBuilder> 
        getFansDetailFieldBuilder() {
      if (fansDetailBuilder_ == null) {
        fansDetailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.web.interfaces.v1.ReplyFansDetail, bilibili.web.interfaces.v1.ReplyFansDetail.Builder, bilibili.web.interfaces.v1.ReplyFansDetailOrBuilder>(
                getFansDetail(),
                getParentForChildren(),
                isClean());
        fansDetail_ = null;
      }
      return fansDetailBuilder_;
    }

    private int following_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 following = 3;</code>
     * @return The following.
     */
    @java.lang.Override
    public int getFollowing() {
      return following_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 following = 3;</code>
     * @param value The following to set.
     * @return This builder for chaining.
     */
    public Builder setFollowing(int value) {

      following_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 following = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFollowing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      following_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.ReplyMember)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.ReplyMember)
  private static final bilibili.web.interfaces.v1.ReplyMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.ReplyMember();
  }

  public static bilibili.web.interfaces.v1.ReplyMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyMember>
      PARSER = new com.google.protobuf.AbstractParser<ReplyMember>() {
    @java.lang.Override
    public ReplyMember parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplyMember> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyMember> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.ReplyMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
