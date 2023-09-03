// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/media.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.MediaPerson}
 */
public final class MediaPerson extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.MediaPerson)
    MediaPersonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaPerson.newBuilder() to construct.
  private MediaPerson(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaPerson() {
    realName_ = "";
    squareUrl_ = "";
    character_ = "";
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaPerson();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaPerson_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaPerson_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.MediaPerson.class, bilibili.app.interface.v1.MediaPerson.Builder.class);
  }

  public static final int REAL_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object realName_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string real_name = 1;</code>
   * @return The realName.
   */
  @java.lang.Override
  public java.lang.String getRealName() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      realName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string real_name = 1;</code>
   * @return The bytes for realName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRealNameBytes() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      realName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SQUARE_URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object squareUrl_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string square_url = 2;</code>
   * @return The squareUrl.
   */
  @java.lang.Override
  public java.lang.String getSquareUrl() {
    java.lang.Object ref = squareUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      squareUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string square_url = 2;</code>
   * @return The bytes for squareUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSquareUrlBytes() {
    java.lang.Object ref = squareUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      squareUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHARACTER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object character_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string character = 3;</code>
   * @return The character.
   */
  @java.lang.Override
  public java.lang.String getCharacter() {
    java.lang.Object ref = character_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      character_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string character = 3;</code>
   * @return The bytes for character.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCharacterBytes() {
    java.lang.Object ref = character_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      character_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERSON_ID_FIELD_NUMBER = 4;
  private long personId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 person_id = 4;</code>
   * @return The personId.
   */
  @java.lang.Override
  public long getPersonId() {
    return personId_;
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 5;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 5;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(realName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, realName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(squareUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, squareUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(character_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, character_);
    }
    if (personId_ != 0L) {
      output.writeInt64(4, personId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(realName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, realName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(squareUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, squareUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(character_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, character_);
    }
    if (personId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, personId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, type_);
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
    if (!(obj instanceof bilibili.app.interface.v1.MediaPerson)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.MediaPerson other = (bilibili.app.interface.v1.MediaPerson) obj;

    if (!getRealName()
        .equals(other.getRealName())) return false;
    if (!getSquareUrl()
        .equals(other.getSquareUrl())) return false;
    if (!getCharacter()
        .equals(other.getCharacter())) return false;
    if (getPersonId()
        != other.getPersonId()) return false;
    if (!getType()
        .equals(other.getType())) return false;
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
    hash = (37 * hash) + REAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRealName().hashCode();
    hash = (37 * hash) + SQUARE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSquareUrl().hashCode();
    hash = (37 * hash) + CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + getCharacter().hashCode();
    hash = (37 * hash) + PERSON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPersonId());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaPerson parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaPerson parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.MediaPerson parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.MediaPerson prototype) {
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
   * Protobuf type {@code bilibili.app.interface.v1.MediaPerson}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.MediaPerson)
      bilibili.app.interface.v1.MediaPersonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaPerson_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaPerson_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.MediaPerson.class, bilibili.app.interface.v1.MediaPerson.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.MediaPerson.newBuilder()
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
      realName_ = "";
      squareUrl_ = "";
      character_ = "";
      personId_ = 0L;
      type_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.MediaOuterClass.internal_static_bilibili_app_interface_v1_MediaPerson_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaPerson getDefaultInstanceForType() {
      return bilibili.app.interface.v1.MediaPerson.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaPerson build() {
      bilibili.app.interface.v1.MediaPerson result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.MediaPerson buildPartial() {
      bilibili.app.interface.v1.MediaPerson result = new bilibili.app.interface.v1.MediaPerson(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.MediaPerson result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.realName_ = realName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.squareUrl_ = squareUrl_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.character_ = character_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.personId_ = personId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.type_ = type_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.MediaPerson) {
        return mergeFrom((bilibili.app.interface.v1.MediaPerson)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.MediaPerson other) {
      if (other == bilibili.app.interface.v1.MediaPerson.getDefaultInstance()) return this;
      if (!other.getRealName().isEmpty()) {
        realName_ = other.realName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSquareUrl().isEmpty()) {
        squareUrl_ = other.squareUrl_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCharacter().isEmpty()) {
        character_ = other.character_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPersonId() != 0L) {
        setPersonId(other.getPersonId());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000010;
        onChanged();
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
              realName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              squareUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              character_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              personId_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              type_ = input.readStringRequireUtf8();
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

    private java.lang.Object realName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string real_name = 1;</code>
     * @return The realName.
     */
    public java.lang.String getRealName() {
      java.lang.Object ref = realName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        realName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string real_name = 1;</code>
     * @return The bytes for realName.
     */
    public com.google.protobuf.ByteString
        getRealNameBytes() {
      java.lang.Object ref = realName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        realName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string real_name = 1;</code>
     * @param value The realName to set.
     * @return This builder for chaining.
     */
    public Builder setRealName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      realName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string real_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRealName() {
      realName_ = getDefaultInstance().getRealName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string real_name = 1;</code>
     * @param value The bytes for realName to set.
     * @return This builder for chaining.
     */
    public Builder setRealNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      realName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object squareUrl_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string square_url = 2;</code>
     * @return The squareUrl.
     */
    public java.lang.String getSquareUrl() {
      java.lang.Object ref = squareUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        squareUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string square_url = 2;</code>
     * @return The bytes for squareUrl.
     */
    public com.google.protobuf.ByteString
        getSquareUrlBytes() {
      java.lang.Object ref = squareUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        squareUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string square_url = 2;</code>
     * @param value The squareUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSquareUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      squareUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string square_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSquareUrl() {
      squareUrl_ = getDefaultInstance().getSquareUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string square_url = 2;</code>
     * @param value The bytes for squareUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSquareUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      squareUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object character_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string character = 3;</code>
     * @return The character.
     */
    public java.lang.String getCharacter() {
      java.lang.Object ref = character_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        character_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string character = 3;</code>
     * @return The bytes for character.
     */
    public com.google.protobuf.ByteString
        getCharacterBytes() {
      java.lang.Object ref = character_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        character_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string character = 3;</code>
     * @param value The character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      character_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string character = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCharacter() {
      character_ = getDefaultInstance().getCharacter();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string character = 3;</code>
     * @param value The bytes for character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      character_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long personId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 person_id = 4;</code>
     * @return The personId.
     */
    @java.lang.Override
    public long getPersonId() {
      return personId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 person_id = 4;</code>
     * @param value The personId to set.
     * @return This builder for chaining.
     */
    public Builder setPersonId(long value) {

      personId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 person_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPersonId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      personId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 5;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 5;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 5;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 5;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.MediaPerson)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.MediaPerson)
  private static final bilibili.app.interface.v1.MediaPerson DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.MediaPerson();
  }

  public static bilibili.app.interface.v1.MediaPerson getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaPerson>
      PARSER = new com.google.protobuf.AbstractParser<MediaPerson>() {
    @java.lang.Override
    public MediaPerson parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaPerson> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaPerson> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.MediaPerson getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

