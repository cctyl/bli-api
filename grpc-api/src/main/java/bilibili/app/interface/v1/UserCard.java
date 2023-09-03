// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/media.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.UserCard}
 */
public final class UserCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.UserCard)
    UserCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserCard.newBuilder() to construct.
  private UserCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserCard() {
    userName_ = "";
    userFace_ = "";
    userUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_UserCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_UserCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.UserCard.class, bilibili.app.interface.v1.UserCard.Builder.class);
  }

  public static final int USER_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userName_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_name = 1;</code>
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
   * </pre>
   *
   * <code>string user_name = 1;</code>
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

  public static final int USER_FACE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userFace_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_face = 2;</code>
   * @return The userFace.
   */
  @java.lang.Override
  public java.lang.String getUserFace() {
    java.lang.Object ref = userFace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userFace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_face = 2;</code>
   * @return The bytes for userFace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserFaceBytes() {
    java.lang.Object ref = userFace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userFace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userUrl_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_url = 3;</code>
   * @return The userUrl.
   */
  @java.lang.Override
  public java.lang.String getUserUrl() {
    java.lang.Object ref = userUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_url = 3;</code>
   * @return The bytes for userUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserUrlBytes() {
    java.lang.Object ref = userUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MID_FIELD_NUMBER = 4;
  private long mid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 4;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userFace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userFace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userUrl_);
    }
    if (mid_ != 0L) {
      output.writeInt64(4, mid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userFace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userFace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userUrl_);
    }
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, mid_);
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
    if (!(obj instanceof bilibili.app.interface.v1.UserCard)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.UserCard other = (bilibili.app.interface.v1.UserCard) obj;

    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getUserFace()
        .equals(other.getUserFace())) return false;
    if (!getUserUrl()
        .equals(other.getUserUrl())) return false;
    if (getMid()
        != other.getMid()) return false;
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
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + USER_FACE_FIELD_NUMBER;
    hash = (53 * hash) + getUserFace().hashCode();
    hash = (37 * hash) + USER_URL_FIELD_NUMBER;
    hash = (53 * hash) + getUserUrl().hashCode();
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.UserCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.UserCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.UserCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.UserCard parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.UserCard prototype) {
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
   * Protobuf type {@code bilibili.app.interface.v1.UserCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.UserCard)
      bilibili.app.interface.v1.UserCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_UserCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_UserCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.UserCard.class, bilibili.app.interface.v1.UserCard.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.UserCard.newBuilder()
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
      userName_ = "";
      userFace_ = "";
      userUrl_ = "";
      mid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_UserCard_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.UserCard getDefaultInstanceForType() {
      return bilibili.app.interface.v1.UserCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.UserCard build() {
      bilibili.app.interface.v1.UserCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.UserCard buildPartial() {
      bilibili.app.interface.v1.UserCard result = new bilibili.app.interface.v1.UserCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.UserCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userName_ = userName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userFace_ = userFace_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userUrl_ = userUrl_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.mid_ = mid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.UserCard) {
        return mergeFrom((bilibili.app.interface.v1.UserCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.UserCard other) {
      if (other == bilibili.app.interface.v1.UserCard.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserFace().isEmpty()) {
        userFace_ = other.userFace_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUserUrl().isEmpty()) {
        userUrl_ = other.userUrl_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getMid() != 0L) {
        setMid(other.getMid());
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
              userName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              userFace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              userUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              mid_ = input.readInt64();
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

    private java.lang.Object userName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_name = 1;</code>
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
     * </pre>
     *
     * <code>string user_name = 1;</code>
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
     * </pre>
     *
     * <code>string user_name = 1;</code>
     * @param value The userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserName() {
      userName_ = getDefaultInstance().getUserName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_name = 1;</code>
     * @param value The bytes for userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userFace_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_face = 2;</code>
     * @return The userFace.
     */
    public java.lang.String getUserFace() {
      java.lang.Object ref = userFace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userFace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_face = 2;</code>
     * @return The bytes for userFace.
     */
    public com.google.protobuf.ByteString
        getUserFaceBytes() {
      java.lang.Object ref = userFace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userFace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_face = 2;</code>
     * @param value The userFace to set.
     * @return This builder for chaining.
     */
    public Builder setUserFace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userFace_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_face = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserFace() {
      userFace_ = getDefaultInstance().getUserFace();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_face = 2;</code>
     * @param value The bytes for userFace to set.
     * @return This builder for chaining.
     */
    public Builder setUserFaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userFace_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object userUrl_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_url = 3;</code>
     * @return The userUrl.
     */
    public java.lang.String getUserUrl() {
      java.lang.Object ref = userUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_url = 3;</code>
     * @return The bytes for userUrl.
     */
    public com.google.protobuf.ByteString
        getUserUrlBytes() {
      java.lang.Object ref = userUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_url = 3;</code>
     * @param value The userUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUserUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserUrl() {
      userUrl_ = getDefaultInstance().getUserUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string user_url = 3;</code>
     * @param value The bytes for userUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUserUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long mid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 4;</code>
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
     * <code>int64 mid = 4;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 mid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.UserCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.UserCard)
  private static final bilibili.app.interface.v1.UserCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.UserCard();
  }

  public static bilibili.app.interface.v1.UserCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserCard>
      PARSER = new com.google.protobuf.AbstractParser<UserCard>() {
    @java.lang.Override
    public UserCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.UserCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

