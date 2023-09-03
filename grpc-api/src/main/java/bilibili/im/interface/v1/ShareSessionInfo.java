// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 会话信息，用于私信分享
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ShareSessionInfo}
 */
public final class ShareSessionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ShareSessionInfo)
    ShareSessionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShareSessionInfo.newBuilder() to construct.
  private ShareSessionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShareSessionInfo() {
    talkerUname_ = "";
    talkerIcon_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShareSessionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ShareSessionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ShareSessionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ShareSessionInfo.class, bilibili.im.interface.v1.ShareSessionInfo.Builder.class);
  }

  public static final int TALKER_ID_FIELD_NUMBER = 1;
  private long talkerId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 talker_id = 1;</code>
   * @return The talkerId.
   */
  @java.lang.Override
  public long getTalkerId() {
    return talkerId_;
  }

  public static final int TALKER_UNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object talkerUname_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string talker_uname = 2;</code>
   * @return The talkerUname.
   */
  @java.lang.Override
  public java.lang.String getTalkerUname() {
    java.lang.Object ref = talkerUname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      talkerUname_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string talker_uname = 2;</code>
   * @return The bytes for talkerUname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTalkerUnameBytes() {
    java.lang.Object ref = talkerUname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      talkerUname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TALKER_ICON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object talkerIcon_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string talker_icon = 3;</code>
   * @return The talkerIcon.
   */
  @java.lang.Override
  public java.lang.String getTalkerIcon() {
    java.lang.Object ref = talkerIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      talkerIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string talker_icon = 3;</code>
   * @return The bytes for talkerIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTalkerIconBytes() {
    java.lang.Object ref = talkerIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      talkerIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFICIAL_TYPE_FIELD_NUMBER = 4;
  private int officialType_ = 0;
  /**
   * <pre>
   * 认证信息
   * -1: 无认证 0:个人认证 1:机构认证
   * </pre>
   *
   * <code>int32 official_type = 4;</code>
   * @return The officialType.
   */
  @java.lang.Override
  public int getOfficialType() {
    return officialType_;
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
    if (talkerId_ != 0L) {
      output.writeUInt64(1, talkerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(talkerUname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, talkerUname_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(talkerIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, talkerIcon_);
    }
    if (officialType_ != 0) {
      output.writeInt32(4, officialType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (talkerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, talkerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(talkerUname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, talkerUname_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(talkerIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, talkerIcon_);
    }
    if (officialType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, officialType_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ShareSessionInfo)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ShareSessionInfo other = (bilibili.im.interface.v1.ShareSessionInfo) obj;

    if (getTalkerId()
        != other.getTalkerId()) return false;
    if (!getTalkerUname()
        .equals(other.getTalkerUname())) return false;
    if (!getTalkerIcon()
        .equals(other.getTalkerIcon())) return false;
    if (getOfficialType()
        != other.getOfficialType()) return false;
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
    hash = (37 * hash) + TALKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTalkerId());
    hash = (37 * hash) + TALKER_UNAME_FIELD_NUMBER;
    hash = (53 * hash) + getTalkerUname().hashCode();
    hash = (37 * hash) + TALKER_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getTalkerIcon().hashCode();
    hash = (37 * hash) + OFFICIAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getOfficialType();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ShareSessionInfo parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ShareSessionInfo prototype) {
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
   * 会话信息，用于私信分享
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ShareSessionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ShareSessionInfo)
      bilibili.im.interface.v1.ShareSessionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ShareSessionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ShareSessionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ShareSessionInfo.class, bilibili.im.interface.v1.ShareSessionInfo.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ShareSessionInfo.newBuilder()
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
      talkerId_ = 0L;
      talkerUname_ = "";
      talkerIcon_ = "";
      officialType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ShareSessionInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ShareSessionInfo getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ShareSessionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ShareSessionInfo build() {
      bilibili.im.interface.v1.ShareSessionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ShareSessionInfo buildPartial() {
      bilibili.im.interface.v1.ShareSessionInfo result = new bilibili.im.interface.v1.ShareSessionInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ShareSessionInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.talkerId_ = talkerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.talkerUname_ = talkerUname_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.talkerIcon_ = talkerIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.officialType_ = officialType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ShareSessionInfo) {
        return mergeFrom((bilibili.im.interface.v1.ShareSessionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ShareSessionInfo other) {
      if (other == bilibili.im.interface.v1.ShareSessionInfo.getDefaultInstance()) return this;
      if (other.getTalkerId() != 0L) {
        setTalkerId(other.getTalkerId());
      }
      if (!other.getTalkerUname().isEmpty()) {
        talkerUname_ = other.talkerUname_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTalkerIcon().isEmpty()) {
        talkerIcon_ = other.talkerIcon_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getOfficialType() != 0) {
        setOfficialType(other.getOfficialType());
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
              talkerId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              talkerUname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              talkerIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              officialType_ = input.readInt32();
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

    private long talkerId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return The talkerId.
     */
    @java.lang.Override
    public long getTalkerId() {
      return talkerId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @param value The talkerId to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerId(long value) {

      talkerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 talker_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTalkerId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      talkerId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object talkerUname_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_uname = 2;</code>
     * @return The talkerUname.
     */
    public java.lang.String getTalkerUname() {
      java.lang.Object ref = talkerUname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        talkerUname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_uname = 2;</code>
     * @return The bytes for talkerUname.
     */
    public com.google.protobuf.ByteString
        getTalkerUnameBytes() {
      java.lang.Object ref = talkerUname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        talkerUname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_uname = 2;</code>
     * @param value The talkerUname to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerUname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      talkerUname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_uname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTalkerUname() {
      talkerUname_ = getDefaultInstance().getTalkerUname();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_uname = 2;</code>
     * @param value The bytes for talkerUname to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerUnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      talkerUname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object talkerIcon_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_icon = 3;</code>
     * @return The talkerIcon.
     */
    public java.lang.String getTalkerIcon() {
      java.lang.Object ref = talkerIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        talkerIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_icon = 3;</code>
     * @return The bytes for talkerIcon.
     */
    public com.google.protobuf.ByteString
        getTalkerIconBytes() {
      java.lang.Object ref = talkerIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        talkerIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_icon = 3;</code>
     * @param value The talkerIcon to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      talkerIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_icon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTalkerIcon() {
      talkerIcon_ = getDefaultInstance().getTalkerIcon();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string talker_icon = 3;</code>
     * @param value The bytes for talkerIcon to set.
     * @return This builder for chaining.
     */
    public Builder setTalkerIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      talkerIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int officialType_ ;
    /**
     * <pre>
     * 认证信息
     * -1: 无认证 0:个人认证 1:机构认证
     * </pre>
     *
     * <code>int32 official_type = 4;</code>
     * @return The officialType.
     */
    @java.lang.Override
    public int getOfficialType() {
      return officialType_;
    }
    /**
     * <pre>
     * 认证信息
     * -1: 无认证 0:个人认证 1:机构认证
     * </pre>
     *
     * <code>int32 official_type = 4;</code>
     * @param value The officialType to set.
     * @return This builder for chaining.
     */
    public Builder setOfficialType(int value) {

      officialType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 认证信息
     * -1: 无认证 0:个人认证 1:机构认证
     * </pre>
     *
     * <code>int32 official_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfficialType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      officialType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ShareSessionInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ShareSessionInfo)
  private static final bilibili.im.interface.v1.ShareSessionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ShareSessionInfo();
  }

  public static bilibili.im.interface.v1.ShareSessionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShareSessionInfo>
      PARSER = new com.google.protobuf.AbstractParser<ShareSessionInfo>() {
    @java.lang.Override
    public ShareSessionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShareSessionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShareSessionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ShareSessionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
