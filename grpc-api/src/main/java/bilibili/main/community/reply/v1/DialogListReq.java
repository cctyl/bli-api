// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

/**
 * <pre>
 * 对话评论树-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.main.community.reply.v1.DialogListReq}
 */
public final class DialogListReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.main.community.reply.v1.DialogListReq)
    DialogListReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DialogListReq.newBuilder() to construct.
  private DialogListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DialogListReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DialogListReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_DialogListReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_DialogListReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.main.community.reply.v1.DialogListReq.class, bilibili.main.community.reply.v1.DialogListReq.Builder.class);
  }

  public static final int OID_FIELD_NUMBER = 1;
  private long oid_ = 0L;
  /**
   * <pre>
   * 目标评论区id
   * </pre>
   *
   * <code>int64 oid = 1;</code>
   * @return The oid.
   */
  @java.lang.Override
  public long getOid() {
    return oid_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private long type_ = 0L;
  /**
   * <pre>
   * 目标评论区业务type
   * </pre>
   *
   * <code>int64 type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public long getType() {
    return type_;
  }

  public static final int ROOT_FIELD_NUMBER = 3;
  private long root_ = 0L;
  /**
   * <pre>
   * 根评论rpid
   * </pre>
   *
   * <code>int64 root = 3;</code>
   * @return The root.
   */
  @java.lang.Override
  public long getRoot() {
    return root_;
  }

  public static final int RPID_FIELD_NUMBER = 4;
  private long rpid_ = 0L;
  /**
   * <pre>
   * 对话评论rpid
   * </pre>
   *
   * <code>int64 rpid = 4;</code>
   * @return The rpid.
   */
  @java.lang.Override
  public long getRpid() {
    return rpid_;
  }

  public static final int CURSOR_FIELD_NUMBER = 5;
  private bilibili.main.community.reply.v1.CursorReq cursor_;
  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return cursor_ != null;
  }
  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
   * @return The cursor.
   */
  @java.lang.Override
  public bilibili.main.community.reply.v1.CursorReq getCursor() {
    return cursor_ == null ? bilibili.main.community.reply.v1.CursorReq.getDefaultInstance() : cursor_;
  }
  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
   */
  @java.lang.Override
  public bilibili.main.community.reply.v1.CursorReqOrBuilder getCursorOrBuilder() {
    return cursor_ == null ? bilibili.main.community.reply.v1.CursorReq.getDefaultInstance() : cursor_;
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
    if (oid_ != 0L) {
      output.writeInt64(1, oid_);
    }
    if (type_ != 0L) {
      output.writeInt64(2, type_);
    }
    if (root_ != 0L) {
      output.writeInt64(3, root_);
    }
    if (rpid_ != 0L) {
      output.writeInt64(4, rpid_);
    }
    if (cursor_ != null) {
      output.writeMessage(5, getCursor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, oid_);
    }
    if (type_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, type_);
    }
    if (root_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, root_);
    }
    if (rpid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, rpid_);
    }
    if (cursor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCursor());
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
    if (!(obj instanceof bilibili.main.community.reply.v1.DialogListReq)) {
      return super.equals(obj);
    }
    bilibili.main.community.reply.v1.DialogListReq other = (bilibili.main.community.reply.v1.DialogListReq) obj;

    if (getOid()
        != other.getOid()) return false;
    if (getType()
        != other.getType()) return false;
    if (getRoot()
        != other.getRoot()) return false;
    if (getRpid()
        != other.getRpid()) return false;
    if (hasCursor() != other.hasCursor()) return false;
    if (hasCursor()) {
      if (!getCursor()
          .equals(other.getCursor())) return false;
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
    hash = (37 * hash) + OID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOid());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getType());
    hash = (37 * hash) + ROOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoot());
    hash = (37 * hash) + RPID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRpid());
    if (hasCursor()) {
      hash = (37 * hash) + CURSOR_FIELD_NUMBER;
      hash = (53 * hash) + getCursor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.DialogListReq parseFrom(
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
  public static Builder newBuilder(bilibili.main.community.reply.v1.DialogListReq prototype) {
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
   * 对话评论树-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.main.community.reply.v1.DialogListReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.main.community.reply.v1.DialogListReq)
      bilibili.main.community.reply.v1.DialogListReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_DialogListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_DialogListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.main.community.reply.v1.DialogListReq.class, bilibili.main.community.reply.v1.DialogListReq.Builder.class);
    }

    // Construct using bilibili.main.community.reply.v1.DialogListReq.newBuilder()
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
      oid_ = 0L;
      type_ = 0L;
      root_ = 0L;
      rpid_ = 0L;
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_DialogListReq_descriptor;
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.DialogListReq getDefaultInstanceForType() {
      return bilibili.main.community.reply.v1.DialogListReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.DialogListReq build() {
      bilibili.main.community.reply.v1.DialogListReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.DialogListReq buildPartial() {
      bilibili.main.community.reply.v1.DialogListReq result = new bilibili.main.community.reply.v1.DialogListReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.main.community.reply.v1.DialogListReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.oid_ = oid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.root_ = root_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rpid_ = rpid_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.cursor_ = cursorBuilder_ == null
            ? cursor_
            : cursorBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.main.community.reply.v1.DialogListReq) {
        return mergeFrom((bilibili.main.community.reply.v1.DialogListReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.main.community.reply.v1.DialogListReq other) {
      if (other == bilibili.main.community.reply.v1.DialogListReq.getDefaultInstance()) return this;
      if (other.getOid() != 0L) {
        setOid(other.getOid());
      }
      if (other.getType() != 0L) {
        setType(other.getType());
      }
      if (other.getRoot() != 0L) {
        setRoot(other.getRoot());
      }
      if (other.getRpid() != 0L) {
        setRpid(other.getRpid());
      }
      if (other.hasCursor()) {
        mergeCursor(other.getCursor());
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
              oid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              type_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              root_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              rpid_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getCursorFieldBuilder().getBuilder(),
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

    private long oid_ ;
    /**
     * <pre>
     * 目标评论区id
     * </pre>
     *
     * <code>int64 oid = 1;</code>
     * @return The oid.
     */
    @java.lang.Override
    public long getOid() {
      return oid_;
    }
    /**
     * <pre>
     * 目标评论区id
     * </pre>
     *
     * <code>int64 oid = 1;</code>
     * @param value The oid to set.
     * @return This builder for chaining.
     */
    public Builder setOid(long value) {

      oid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 目标评论区id
     * </pre>
     *
     * <code>int64 oid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      oid_ = 0L;
      onChanged();
      return this;
    }

    private long type_ ;
    /**
     * <pre>
     * 目标评论区业务type
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public long getType() {
      return type_;
    }
    /**
     * <pre>
     * 目标评论区业务type
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(long value) {

      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 目标评论区业务type
     * </pre>
     *
     * <code>int64 type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0L;
      onChanged();
      return this;
    }

    private long root_ ;
    /**
     * <pre>
     * 根评论rpid
     * </pre>
     *
     * <code>int64 root = 3;</code>
     * @return The root.
     */
    @java.lang.Override
    public long getRoot() {
      return root_;
    }
    /**
     * <pre>
     * 根评论rpid
     * </pre>
     *
     * <code>int64 root = 3;</code>
     * @param value The root to set.
     * @return This builder for chaining.
     */
    public Builder setRoot(long value) {

      root_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 根评论rpid
     * </pre>
     *
     * <code>int64 root = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoot() {
      bitField0_ = (bitField0_ & ~0x00000004);
      root_ = 0L;
      onChanged();
      return this;
    }

    private long rpid_ ;
    /**
     * <pre>
     * 对话评论rpid
     * </pre>
     *
     * <code>int64 rpid = 4;</code>
     * @return The rpid.
     */
    @java.lang.Override
    public long getRpid() {
      return rpid_;
    }
    /**
     * <pre>
     * 对话评论rpid
     * </pre>
     *
     * <code>int64 rpid = 4;</code>
     * @param value The rpid to set.
     * @return This builder for chaining.
     */
    public Builder setRpid(long value) {

      rpid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 对话评论rpid
     * </pre>
     *
     * <code>int64 rpid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRpid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      rpid_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.main.community.reply.v1.CursorReq cursor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.main.community.reply.v1.CursorReq, bilibili.main.community.reply.v1.CursorReq.Builder, bilibili.main.community.reply.v1.CursorReqOrBuilder> cursorBuilder_;
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     * @return Whether the cursor field is set.
     */
    public boolean hasCursor() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     * @return The cursor.
     */
    public bilibili.main.community.reply.v1.CursorReq getCursor() {
      if (cursorBuilder_ == null) {
        return cursor_ == null ? bilibili.main.community.reply.v1.CursorReq.getDefaultInstance() : cursor_;
      } else {
        return cursorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public Builder setCursor(bilibili.main.community.reply.v1.CursorReq value) {
      if (cursorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cursor_ = value;
      } else {
        cursorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public Builder setCursor(
        bilibili.main.community.reply.v1.CursorReq.Builder builderForValue) {
      if (cursorBuilder_ == null) {
        cursor_ = builderForValue.build();
      } else {
        cursorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public Builder mergeCursor(bilibili.main.community.reply.v1.CursorReq value) {
      if (cursorBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          cursor_ != null &&
          cursor_ != bilibili.main.community.reply.v1.CursorReq.getDefaultInstance()) {
          getCursorBuilder().mergeFrom(value);
        } else {
          cursor_ = value;
        }
      } else {
        cursorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public Builder clearCursor() {
      bitField0_ = (bitField0_ & ~0x00000010);
      cursor_ = null;
      if (cursorBuilder_ != null) {
        cursorBuilder_.dispose();
        cursorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public bilibili.main.community.reply.v1.CursorReq.Builder getCursorBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getCursorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    public bilibili.main.community.reply.v1.CursorReqOrBuilder getCursorOrBuilder() {
      if (cursorBuilder_ != null) {
        return cursorBuilder_.getMessageOrBuilder();
      } else {
        return cursor_ == null ?
            bilibili.main.community.reply.v1.CursorReq.getDefaultInstance() : cursor_;
      }
    }
    /**
     * <pre>
     * 页面游标
     * </pre>
     *
     * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.main.community.reply.v1.CursorReq, bilibili.main.community.reply.v1.CursorReq.Builder, bilibili.main.community.reply.v1.CursorReqOrBuilder> 
        getCursorFieldBuilder() {
      if (cursorBuilder_ == null) {
        cursorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.main.community.reply.v1.CursorReq, bilibili.main.community.reply.v1.CursorReq.Builder, bilibili.main.community.reply.v1.CursorReqOrBuilder>(
                getCursor(),
                getParentForChildren(),
                isClean());
        cursor_ = null;
      }
      return cursorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.main.community.reply.v1.DialogListReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.main.community.reply.v1.DialogListReq)
  private static final bilibili.main.community.reply.v1.DialogListReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.main.community.reply.v1.DialogListReq();
  }

  public static bilibili.main.community.reply.v1.DialogListReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DialogListReq>
      PARSER = new com.google.protobuf.AbstractParser<DialogListReq>() {
    @java.lang.Override
    public DialogListReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DialogListReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DialogListReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.main.community.reply.v1.DialogListReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
