// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

/**
 * <pre>
 * 查询单条评论-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.main.community.reply.v1.ReplyInfoReq}
 */
public final class ReplyInfoReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.main.community.reply.v1.ReplyInfoReq)
    ReplyInfoReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplyInfoReq.newBuilder() to construct.
  private ReplyInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyInfoReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplyInfoReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_ReplyInfoReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_ReplyInfoReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.main.community.reply.v1.ReplyInfoReq.class, bilibili.main.community.reply.v1.ReplyInfoReq.Builder.class);
  }

  public static final int RPID_FIELD_NUMBER = 1;
  private long rpid_ = 0L;
  /**
   * <pre>
   * 评论rpid
   * </pre>
   *
   * <code>int64 rpid = 1;</code>
   * @return The rpid.
   */
  @java.lang.Override
  public long getRpid() {
    return rpid_;
  }

  public static final int SCENE_FIELD_NUMBER = 2;
  private int scene_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 scene = 2;</code>
   * @return The scene.
   */
  @java.lang.Override
  public int getScene() {
    return scene_;
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
    if (rpid_ != 0L) {
      output.writeInt64(1, rpid_);
    }
    if (scene_ != 0) {
      output.writeInt32(2, scene_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rpid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rpid_);
    }
    if (scene_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, scene_);
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
    if (!(obj instanceof bilibili.main.community.reply.v1.ReplyInfoReq)) {
      return super.equals(obj);
    }
    bilibili.main.community.reply.v1.ReplyInfoReq other = (bilibili.main.community.reply.v1.ReplyInfoReq) obj;

    if (getRpid()
        != other.getRpid()) return false;
    if (getScene()
        != other.getScene()) return false;
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
    hash = (37 * hash) + RPID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRpid());
    hash = (37 * hash) + SCENE_FIELD_NUMBER;
    hash = (53 * hash) + getScene();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.community.reply.v1.ReplyInfoReq parseFrom(
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
  public static Builder newBuilder(bilibili.main.community.reply.v1.ReplyInfoReq prototype) {
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
   * 查询单条评论-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.main.community.reply.v1.ReplyInfoReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.main.community.reply.v1.ReplyInfoReq)
      bilibili.main.community.reply.v1.ReplyInfoReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_ReplyInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_ReplyInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.main.community.reply.v1.ReplyInfoReq.class, bilibili.main.community.reply.v1.ReplyInfoReq.Builder.class);
    }

    // Construct using bilibili.main.community.reply.v1.ReplyInfoReq.newBuilder()
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
      rpid_ = 0L;
      scene_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.main.community.reply.v1.ReplyOuterClass.internal_static_bilibili_main_community_reply_v1_ReplyInfoReq_descriptor;
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.ReplyInfoReq getDefaultInstanceForType() {
      return bilibili.main.community.reply.v1.ReplyInfoReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.ReplyInfoReq build() {
      bilibili.main.community.reply.v1.ReplyInfoReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.main.community.reply.v1.ReplyInfoReq buildPartial() {
      bilibili.main.community.reply.v1.ReplyInfoReq result = new bilibili.main.community.reply.v1.ReplyInfoReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.main.community.reply.v1.ReplyInfoReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rpid_ = rpid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scene_ = scene_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.main.community.reply.v1.ReplyInfoReq) {
        return mergeFrom((bilibili.main.community.reply.v1.ReplyInfoReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.main.community.reply.v1.ReplyInfoReq other) {
      if (other == bilibili.main.community.reply.v1.ReplyInfoReq.getDefaultInstance()) return this;
      if (other.getRpid() != 0L) {
        setRpid(other.getRpid());
      }
      if (other.getScene() != 0) {
        setScene(other.getScene());
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
              rpid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              scene_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long rpid_ ;
    /**
     * <pre>
     * 评论rpid
     * </pre>
     *
     * <code>int64 rpid = 1;</code>
     * @return The rpid.
     */
    @java.lang.Override
    public long getRpid() {
      return rpid_;
    }
    /**
     * <pre>
     * 评论rpid
     * </pre>
     *
     * <code>int64 rpid = 1;</code>
     * @param value The rpid to set.
     * @return This builder for chaining.
     */
    public Builder setRpid(long value) {

      rpid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 评论rpid
     * </pre>
     *
     * <code>int64 rpid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRpid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rpid_ = 0L;
      onChanged();
      return this;
    }

    private int scene_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 scene = 2;</code>
     * @return The scene.
     */
    @java.lang.Override
    public int getScene() {
      return scene_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 scene = 2;</code>
     * @param value The scene to set.
     * @return This builder for chaining.
     */
    public Builder setScene(int value) {

      scene_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 scene = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScene() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scene_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.main.community.reply.v1.ReplyInfoReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.main.community.reply.v1.ReplyInfoReq)
  private static final bilibili.main.community.reply.v1.ReplyInfoReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.main.community.reply.v1.ReplyInfoReq();
  }

  public static bilibili.main.community.reply.v1.ReplyInfoReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyInfoReq>
      PARSER = new com.google.protobuf.AbstractParser<ReplyInfoReq>() {
    @java.lang.Override
    public ReplyInfoReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplyInfoReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyInfoReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.main.community.reply.v1.ReplyInfoReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
