// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/relation/interfaces/api.proto

package bilibili.relation.interface.v1;

/**
 * Protobuf type {@code bilibili.relation.interface.v1.AtItem}
 */
public final class AtItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.relation.interface.v1.AtItem)
    AtItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AtItem.newBuilder() to construct.
  private AtItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AtItem() {
    name_ = "";
    face_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AtItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.relation.interface.v1.Api.internal_static_bilibili_relation_interface_v1_AtItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.relation.interface.v1.Api.internal_static_bilibili_relation_interface_v1_AtItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.relation.interface.v1.AtItem.class, bilibili.relation.interface.v1.AtItem.Builder.class);
  }

  public static final int MID_FIELD_NUMBER = 1;
  private long mid_ = 0L;
  /**
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FACE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object face_ = "";
  /**
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

  public static final int FANS_FIELD_NUMBER = 4;
  private int fans_ = 0;
  /**
   * <code>int32 fans = 4;</code>
   * @return The fans.
   */
  @java.lang.Override
  public int getFans() {
    return fans_;
  }

  public static final int OFFICIAL_VERIFY_TYPE_FIELD_NUMBER = 5;
  private int officialVerifyType_ = 0;
  /**
   * <code>int32 official_verify_type = 5;</code>
   * @return The officialVerifyType.
   */
  @java.lang.Override
  public int getOfficialVerifyType() {
    return officialVerifyType_;
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
    if (mid_ != 0L) {
      output.writeInt64(1, mid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(face_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, face_);
    }
    if (fans_ != 0) {
      output.writeInt32(4, fans_);
    }
    if (officialVerifyType_ != 0) {
      output.writeInt32(5, officialVerifyType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, mid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(face_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, face_);
    }
    if (fans_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fans_);
    }
    if (officialVerifyType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, officialVerifyType_);
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
    if (!(obj instanceof bilibili.relation.interface.v1.AtItem)) {
      return super.equals(obj);
    }
    bilibili.relation.interface.v1.AtItem other = (bilibili.relation.interface.v1.AtItem) obj;

    if (getMid()
        != other.getMid()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getFace()
        .equals(other.getFace())) return false;
    if (getFans()
        != other.getFans()) return false;
    if (getOfficialVerifyType()
        != other.getOfficialVerifyType()) return false;
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
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FACE_FIELD_NUMBER;
    hash = (53 * hash) + getFace().hashCode();
    hash = (37 * hash) + FANS_FIELD_NUMBER;
    hash = (53 * hash) + getFans();
    hash = (37 * hash) + OFFICIAL_VERIFY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getOfficialVerifyType();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.relation.interface.v1.AtItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.relation.interface.v1.AtItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.relation.interface.v1.AtItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.relation.interface.v1.AtItem parseFrom(
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
  public static Builder newBuilder(bilibili.relation.interface.v1.AtItem prototype) {
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
   * Protobuf type {@code bilibili.relation.interface.v1.AtItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.relation.interface.v1.AtItem)
      bilibili.relation.interface.v1.AtItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.relation.interface.v1.Api.internal_static_bilibili_relation_interface_v1_AtItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.relation.interface.v1.Api.internal_static_bilibili_relation_interface_v1_AtItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.relation.interface.v1.AtItem.class, bilibili.relation.interface.v1.AtItem.Builder.class);
    }

    // Construct using bilibili.relation.interface.v1.AtItem.newBuilder()
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
      mid_ = 0L;
      name_ = "";
      face_ = "";
      fans_ = 0;
      officialVerifyType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.relation.interface.v1.Api.internal_static_bilibili_relation_interface_v1_AtItem_descriptor;
    }

    @java.lang.Override
    public bilibili.relation.interface.v1.AtItem getDefaultInstanceForType() {
      return bilibili.relation.interface.v1.AtItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.relation.interface.v1.AtItem build() {
      bilibili.relation.interface.v1.AtItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.relation.interface.v1.AtItem buildPartial() {
      bilibili.relation.interface.v1.AtItem result = new bilibili.relation.interface.v1.AtItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.relation.interface.v1.AtItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.face_ = face_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fans_ = fans_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.officialVerifyType_ = officialVerifyType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.relation.interface.v1.AtItem) {
        return mergeFrom((bilibili.relation.interface.v1.AtItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.relation.interface.v1.AtItem other) {
      if (other == bilibili.relation.interface.v1.AtItem.getDefaultInstance()) return this;
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFace().isEmpty()) {
        face_ = other.face_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getFans() != 0) {
        setFans(other.getFans());
      }
      if (other.getOfficialVerifyType() != 0) {
        setOfficialVerifyType(other.getOfficialVerifyType());
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
              mid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              face_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              fans_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              officialVerifyType_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long mid_ ;
    /**
     * <code>int64 mid = 1;</code>
     * @return The mid.
     */
    @java.lang.Override
    public long getMid() {
      return mid_;
    }
    /**
     * <code>int64 mid = 1;</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(long value) {

      mid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object face_ = "";
    /**
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

    private int fans_ ;
    /**
     * <code>int32 fans = 4;</code>
     * @return The fans.
     */
    @java.lang.Override
    public int getFans() {
      return fans_;
    }
    /**
     * <code>int32 fans = 4;</code>
     * @param value The fans to set.
     * @return This builder for chaining.
     */
    public Builder setFans(int value) {

      fans_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fans = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFans() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fans_ = 0;
      onChanged();
      return this;
    }

    private int officialVerifyType_ ;
    /**
     * <code>int32 official_verify_type = 5;</code>
     * @return The officialVerifyType.
     */
    @java.lang.Override
    public int getOfficialVerifyType() {
      return officialVerifyType_;
    }
    /**
     * <code>int32 official_verify_type = 5;</code>
     * @param value The officialVerifyType to set.
     * @return This builder for chaining.
     */
    public Builder setOfficialVerifyType(int value) {

      officialVerifyType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 official_verify_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfficialVerifyType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      officialVerifyType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.relation.interface.v1.AtItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.relation.interface.v1.AtItem)
  private static final bilibili.relation.interface.v1.AtItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.relation.interface.v1.AtItem();
  }

  public static bilibili.relation.interface.v1.AtItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AtItem>
      PARSER = new com.google.protobuf.AbstractParser<AtItem>() {
    @java.lang.Override
    public AtItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<AtItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AtItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.relation.interface.v1.AtItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
