// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 不喜欢原因项
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.DislikeReasons}
 */
public final class DislikeReasons extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.DislikeReasons)
    DislikeReasonsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DislikeReasons.newBuilder() to construct.
  private DislikeReasons(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DislikeReasons() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DislikeReasons();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DislikeReasons_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DislikeReasons_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.DislikeReasons.class, bilibili.app.view.v1.DislikeReasons.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <pre>
   * 类型
   * 1:全部类型 3:TAG 4:UP主
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int MID_FIELD_NUMBER = 2;
  private long mid_ = 0L;
  /**
   * <pre>
   * 相关UP主mid
   * </pre>
   *
   * <code>int64 mid = 2;</code>
   * @return The mid.
   */
  @java.lang.Override
  public long getMid() {
    return mid_;
  }

  public static final int RID_FIELD_NUMBER = 3;
  private int rid_ = 0;
  /**
   * <pre>
   * 相关分区tid
   * </pre>
   *
   * <code>int32 rid = 3;</code>
   * @return The rid.
   */
  @java.lang.Override
  public int getRid() {
    return rid_;
  }

  public static final int TAG_ID_FIELD_NUMBER = 4;
  private long tagId_ = 0L;
  /**
   * <pre>
   * 相关TAG id
   * </pre>
   *
   * <code>int64 tag_id = 4;</code>
   * @return The tagId.
   */
  @java.lang.Override
  public long getTagId() {
    return tagId_;
  }

  public static final int NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * 相关名称
   * </pre>
   *
   * <code>string name = 5;</code>
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
   * <pre>
   * 相关名称
   * </pre>
   *
   * <code>string name = 5;</code>
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (mid_ != 0L) {
      output.writeInt64(2, mid_);
    }
    if (rid_ != 0) {
      output.writeInt32(3, rid_);
    }
    if (tagId_ != 0L) {
      output.writeInt64(4, tagId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (mid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mid_);
    }
    if (rid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, rid_);
    }
    if (tagId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, tagId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
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
    if (!(obj instanceof bilibili.app.view.v1.DislikeReasons)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.DislikeReasons other = (bilibili.app.view.v1.DislikeReasons) obj;

    if (getId()
        != other.getId()) return false;
    if (getMid()
        != other.getMid()) return false;
    if (getRid()
        != other.getRid()) return false;
    if (getTagId()
        != other.getTagId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMid());
    hash = (37 * hash) + RID_FIELD_NUMBER;
    hash = (53 * hash) + getRid();
    hash = (37 * hash) + TAG_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTagId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.DislikeReasons parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DislikeReasons parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DislikeReasons parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.DislikeReasons prototype) {
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
   * 不喜欢原因项
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.DislikeReasons}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.DislikeReasons)
      bilibili.app.view.v1.DislikeReasonsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DislikeReasons_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DislikeReasons_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.DislikeReasons.class, bilibili.app.view.v1.DislikeReasons.Builder.class);
    }

    // Construct using bilibili.app.view.v1.DislikeReasons.newBuilder()
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
      id_ = 0L;
      mid_ = 0L;
      rid_ = 0;
      tagId_ = 0L;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DislikeReasons_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.DislikeReasons getDefaultInstanceForType() {
      return bilibili.app.view.v1.DislikeReasons.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.DislikeReasons build() {
      bilibili.app.view.v1.DislikeReasons result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.DislikeReasons buildPartial() {
      bilibili.app.view.v1.DislikeReasons result = new bilibili.app.view.v1.DislikeReasons(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.DislikeReasons result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mid_ = mid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rid_ = rid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tagId_ = tagId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.DislikeReasons) {
        return mergeFrom((bilibili.app.view.v1.DislikeReasons)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.DislikeReasons other) {
      if (other == bilibili.app.view.v1.DislikeReasons.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getMid() != 0L) {
        setMid(other.getMid());
      }
      if (other.getRid() != 0) {
        setRid(other.getRid());
      }
      if (other.getTagId() != 0L) {
        setTagId(other.getTagId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
            case 8: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              mid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              rid_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              tagId_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              name_ = input.readStringRequireUtf8();
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

    private long id_ ;
    /**
     * <pre>
     * 类型
     * 1:全部类型 3:TAG 4:UP主
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * 类型
     * 1:全部类型 3:TAG 4:UP主
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型
     * 1:全部类型 3:TAG 4:UP主
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private long mid_ ;
    /**
     * <pre>
     * 相关UP主mid
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
     * 相关UP主mid
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
     * 相关UP主mid
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

    private int rid_ ;
    /**
     * <pre>
     * 相关分区tid
     * </pre>
     *
     * <code>int32 rid = 3;</code>
     * @return The rid.
     */
    @java.lang.Override
    public int getRid() {
      return rid_;
    }
    /**
     * <pre>
     * 相关分区tid
     * </pre>
     *
     * <code>int32 rid = 3;</code>
     * @param value The rid to set.
     * @return This builder for chaining.
     */
    public Builder setRid(int value) {

      rid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 相关分区tid
     * </pre>
     *
     * <code>int32 rid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rid_ = 0;
      onChanged();
      return this;
    }

    private long tagId_ ;
    /**
     * <pre>
     * 相关TAG id
     * </pre>
     *
     * <code>int64 tag_id = 4;</code>
     * @return The tagId.
     */
    @java.lang.Override
    public long getTagId() {
      return tagId_;
    }
    /**
     * <pre>
     * 相关TAG id
     * </pre>
     *
     * <code>int64 tag_id = 4;</code>
     * @param value The tagId to set.
     * @return This builder for chaining.
     */
    public Builder setTagId(long value) {

      tagId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 相关TAG id
     * </pre>
     *
     * <code>int64 tag_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTagId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      tagId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 相关名称
     * </pre>
     *
     * <code>string name = 5;</code>
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
     * <pre>
     * 相关名称
     * </pre>
     *
     * <code>string name = 5;</code>
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
     * <pre>
     * 相关名称
     * </pre>
     *
     * <code>string name = 5;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 相关名称
     * </pre>
     *
     * <code>string name = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 相关名称
     * </pre>
     *
     * <code>string name = 5;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.DislikeReasons)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.DislikeReasons)
  private static final bilibili.app.view.v1.DislikeReasons DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.DislikeReasons();
  }

  public static bilibili.app.view.v1.DislikeReasons getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DislikeReasons>
      PARSER = new com.google.protobuf.AbstractParser<DislikeReasons>() {
    @java.lang.Override
    public DislikeReasons parsePartialFrom(
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

  public static com.google.protobuf.Parser<DislikeReasons> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DislikeReasons> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.DislikeReasons getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
