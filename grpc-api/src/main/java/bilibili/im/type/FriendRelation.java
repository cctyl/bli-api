// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.im.type.FriendRelation}
 */
public final class FriendRelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.type.FriendRelation)
    FriendRelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FriendRelation.newBuilder() to construct.
  private FriendRelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FriendRelation() {
    userName_ = "";
    face_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FriendRelation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.type.Im.internal_static_bilibili_im_type_FriendRelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.type.Im.internal_static_bilibili_im_type_FriendRelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.type.FriendRelation.class, bilibili.im.type.FriendRelation.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private long uid_ = 0L;
  /**
   * <pre>
   * 用户mid
   * </pre>
   *
   * <code>uint64 uid = 1;</code>
   * @return The uid.
   */
  @java.lang.Override
  public long getUid() {
    return uid_;
  }

  public static final int USER_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userName_ = "";
  /**
   * <pre>
   * 用户昵称
   * </pre>
   *
   * <code>string user_name = 2;</code>
   * @return The userName.
   */
  @java.lang.Override
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户昵称
   * </pre>
   *
   * <code>string user_name = 2;</code>
   * @return The bytes for userName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FACE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object face_ = "";
  /**
   * <pre>
   * 头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The face.
   */
  @java.lang.Override
  public java.lang.String getFace() {
    java.lang.Object ref = face_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      face_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The bytes for face.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFaceBytes() {
    java.lang.Object ref = face_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      face_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIP_LEVEL_FIELD_NUMBER = 4;
  private int vipLevel_ = 0;
  /**
   * <pre>
   * vip类型
   * 0:无 1:月度大会员 2:年度大会员
   * </pre>
   *
   * <code>uint32 vip_level = 4;</code>
   * @return The vipLevel.
   */
  @java.lang.Override
  public int getVipLevel() {
    return vipLevel_;
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
    if (uid_ != 0L) {
      output.writeUInt64(1, uid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(face_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, face_);
    }
    if (vipLevel_ != 0) {
      output.writeUInt32(4, vipLevel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, uid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(face_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, face_);
    }
    if (vipLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, vipLevel_);
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
    if (!(obj instanceof bilibili.im.type.FriendRelation)) {
      return super.equals(obj);
    }
    bilibili.im.type.FriendRelation other = (bilibili.im.type.FriendRelation) obj;

    if (getUid()
        != other.getUid()) return false;
    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getFace()
        .equals(other.getFace())) return false;
    if (getVipLevel()
        != other.getVipLevel()) return false;
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
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + FACE_FIELD_NUMBER;
    hash = (53 * hash) + getFace().hashCode();
    hash = (37 * hash) + VIP_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getVipLevel();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.type.FriendRelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.FriendRelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.type.FriendRelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.type.FriendRelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.type.FriendRelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.type.FriendRelation parseFrom(
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
  public static Builder newBuilder(bilibili.im.type.FriendRelation prototype) {
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
   * Protobuf type {@code bilibili.im.type.FriendRelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.type.FriendRelation)
      bilibili.im.type.FriendRelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_FriendRelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_FriendRelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.type.FriendRelation.class, bilibili.im.type.FriendRelation.Builder.class);
    }

    // Construct using bilibili.im.type.FriendRelation.newBuilder()
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
      uid_ = 0L;
      userName_ = "";
      face_ = "";
      vipLevel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.type.Im.internal_static_bilibili_im_type_FriendRelation_descriptor;
    }

    @java.lang.Override
    public bilibili.im.type.FriendRelation getDefaultInstanceForType() {
      return bilibili.im.type.FriendRelation.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.type.FriendRelation build() {
      bilibili.im.type.FriendRelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.type.FriendRelation buildPartial() {
      bilibili.im.type.FriendRelation result = new bilibili.im.type.FriendRelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.type.FriendRelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uid_ = uid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userName_ = userName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.face_ = face_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.vipLevel_ = vipLevel_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.type.FriendRelation) {
        return mergeFrom((bilibili.im.type.FriendRelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.type.FriendRelation other) {
      if (other == bilibili.im.type.FriendRelation.getDefaultInstance()) return this;
      if (other.getUid() != 0L) {
        setUid(other.getUid());
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFace().isEmpty()) {
        face_ = other.face_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getVipLevel() != 0) {
        setVipLevel(other.getVipLevel());
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
              uid_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              userName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              face_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              vipLevel_ = input.readUInt32();
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

    private long uid_ ;
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>uint64 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public long getUid() {
      return uid_;
    }
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>uint64 uid = 1;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(long value) {

      uid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户mid
     * </pre>
     *
     * <code>uint64 uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <pre>
     * 用户昵称
     * </pre>
     *
     * <code>string user_name = 2;</code>
     * @return The userName.
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户昵称
     * </pre>
     *
     * <code>string user_name = 2;</code>
     * @return The bytes for userName.
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户昵称
     * </pre>
     *
     * <code>string user_name = 2;</code>
     * @param value The userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户昵称
     * </pre>
     *
     * <code>string user_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserName() {
      userName_ = getDefaultInstance().getUserName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户昵称
     * </pre>
     *
     * <code>string user_name = 2;</code>
     * @param value The bytes for userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object face_ = "";
    /**
     * <pre>
     * 头像url
     * </pre>
     *
     * <code>string face = 3;</code>
     * @return The face.
     */
    public java.lang.String getFace() {
      java.lang.Object ref = face_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        face_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 头像url
     * </pre>
     *
     * <code>string face = 3;</code>
     * @return The bytes for face.
     */
    public com.google.protobuf.ByteString
        getFaceBytes() {
      java.lang.Object ref = face_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        face_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 头像url
     * </pre>
     *
     * <code>string face = 3;</code>
     * @param value The face to set.
     * @return This builder for chaining.
     */
    public Builder setFace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      face_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 头像url
     * </pre>
     *
     * <code>string face = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFace() {
      face_ = getDefaultInstance().getFace();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 头像url
     * </pre>
     *
     * <code>string face = 3;</code>
     * @param value The bytes for face to set.
     * @return This builder for chaining.
     */
    public Builder setFaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      face_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int vipLevel_ ;
    /**
     * <pre>
     * vip类型
     * 0:无 1:月度大会员 2:年度大会员
     * </pre>
     *
     * <code>uint32 vip_level = 4;</code>
     * @return The vipLevel.
     */
    @java.lang.Override
    public int getVipLevel() {
      return vipLevel_;
    }
    /**
     * <pre>
     * vip类型
     * 0:无 1:月度大会员 2:年度大会员
     * </pre>
     *
     * <code>uint32 vip_level = 4;</code>
     * @param value The vipLevel to set.
     * @return This builder for chaining.
     */
    public Builder setVipLevel(int value) {

      vipLevel_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * vip类型
     * 0:无 1:月度大会员 2:年度大会员
     * </pre>
     *
     * <code>uint32 vip_level = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVipLevel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      vipLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.type.FriendRelation)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.type.FriendRelation)
  private static final bilibili.im.type.FriendRelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.type.FriendRelation();
  }

  public static bilibili.im.type.FriendRelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FriendRelation>
      PARSER = new com.google.protobuf.AbstractParser<FriendRelation>() {
    @java.lang.Override
    public FriendRelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<FriendRelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FriendRelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.type.FriendRelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
