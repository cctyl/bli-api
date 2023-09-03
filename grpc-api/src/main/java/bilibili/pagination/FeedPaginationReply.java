// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pagination/pagination.proto

package bilibili.pagination;

/**
 * <pre>
 * 分页信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pagination.FeedPaginationReply}
 */
public final class FeedPaginationReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pagination.FeedPaginationReply)
    FeedPaginationReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedPaginationReply.newBuilder() to construct.
  private FeedPaginationReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedPaginationReply() {
    nextOffset_ = "";
    prevOffset_ = "";
    lastReadOffset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedPaginationReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_FeedPaginationReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_FeedPaginationReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pagination.FeedPaginationReply.class, bilibili.pagination.FeedPaginationReply.Builder.class);
  }

  public static final int NEXT_OFFSET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextOffset_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string next_offset = 1;</code>
   * @return The nextOffset.
   */
  @java.lang.Override
  public java.lang.String getNextOffset() {
    java.lang.Object ref = nextOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string next_offset = 1;</code>
   * @return The bytes for nextOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextOffsetBytes() {
    java.lang.Object ref = nextOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextOffset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREV_OFFSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object prevOffset_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string prev_offset = 2;</code>
   * @return The prevOffset.
   */
  @java.lang.Override
  public java.lang.String getPrevOffset() {
    java.lang.Object ref = prevOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prevOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string prev_offset = 2;</code>
   * @return The bytes for prevOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrevOffsetBytes() {
    java.lang.Object ref = prevOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prevOffset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_READ_OFFSET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lastReadOffset_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string last_read_offset = 3;</code>
   * @return The lastReadOffset.
   */
  @java.lang.Override
  public java.lang.String getLastReadOffset() {
    java.lang.Object ref = lastReadOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastReadOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string last_read_offset = 3;</code>
   * @return The bytes for lastReadOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLastReadOffsetBytes() {
    java.lang.Object ref = lastReadOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastReadOffset_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prevOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prevOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastReadOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastReadOffset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prevOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prevOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastReadOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastReadOffset_);
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
    if (!(obj instanceof bilibili.pagination.FeedPaginationReply)) {
      return super.equals(obj);
    }
    bilibili.pagination.FeedPaginationReply other = (bilibili.pagination.FeedPaginationReply) obj;

    if (!getNextOffset()
        .equals(other.getNextOffset())) return false;
    if (!getPrevOffset()
        .equals(other.getPrevOffset())) return false;
    if (!getLastReadOffset()
        .equals(other.getLastReadOffset())) return false;
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
    hash = (37 * hash) + NEXT_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getNextOffset().hashCode();
    hash = (37 * hash) + PREV_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPrevOffset().hashCode();
    hash = (37 * hash) + LAST_READ_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getLastReadOffset().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pagination.FeedPaginationReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pagination.FeedPaginationReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pagination.FeedPaginationReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pagination.FeedPaginationReply parseFrom(
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
  public static Builder newBuilder(bilibili.pagination.FeedPaginationReply prototype) {
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
   * 分页信息
   * </pre>
   *
   * Protobuf type {@code bilibili.pagination.FeedPaginationReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pagination.FeedPaginationReply)
      bilibili.pagination.FeedPaginationReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_FeedPaginationReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_FeedPaginationReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pagination.FeedPaginationReply.class, bilibili.pagination.FeedPaginationReply.Builder.class);
    }

    // Construct using bilibili.pagination.FeedPaginationReply.newBuilder()
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
      nextOffset_ = "";
      prevOffset_ = "";
      lastReadOffset_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_FeedPaginationReply_descriptor;
    }

    @java.lang.Override
    public bilibili.pagination.FeedPaginationReply getDefaultInstanceForType() {
      return bilibili.pagination.FeedPaginationReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pagination.FeedPaginationReply build() {
      bilibili.pagination.FeedPaginationReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pagination.FeedPaginationReply buildPartial() {
      bilibili.pagination.FeedPaginationReply result = new bilibili.pagination.FeedPaginationReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pagination.FeedPaginationReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextOffset_ = nextOffset_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.prevOffset_ = prevOffset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastReadOffset_ = lastReadOffset_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pagination.FeedPaginationReply) {
        return mergeFrom((bilibili.pagination.FeedPaginationReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pagination.FeedPaginationReply other) {
      if (other == bilibili.pagination.FeedPaginationReply.getDefaultInstance()) return this;
      if (!other.getNextOffset().isEmpty()) {
        nextOffset_ = other.nextOffset_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrevOffset().isEmpty()) {
        prevOffset_ = other.prevOffset_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLastReadOffset().isEmpty()) {
        lastReadOffset_ = other.lastReadOffset_;
        bitField0_ |= 0x00000004;
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
              nextOffset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              prevOffset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              lastReadOffset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object nextOffset_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string next_offset = 1;</code>
     * @return The nextOffset.
     */
    public java.lang.String getNextOffset() {
      java.lang.Object ref = nextOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next_offset = 1;</code>
     * @return The bytes for nextOffset.
     */
    public com.google.protobuf.ByteString
        getNextOffsetBytes() {
      java.lang.Object ref = nextOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next_offset = 1;</code>
     * @param value The nextOffset to set.
     * @return This builder for chaining.
     */
    public Builder setNextOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextOffset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next_offset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextOffset() {
      nextOffset_ = getDefaultInstance().getNextOffset();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next_offset = 1;</code>
     * @param value The bytes for nextOffset to set.
     * @return This builder for chaining.
     */
    public Builder setNextOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextOffset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object prevOffset_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev_offset = 2;</code>
     * @return The prevOffset.
     */
    public java.lang.String getPrevOffset() {
      java.lang.Object ref = prevOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prevOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev_offset = 2;</code>
     * @return The bytes for prevOffset.
     */
    public com.google.protobuf.ByteString
        getPrevOffsetBytes() {
      java.lang.Object ref = prevOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prevOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev_offset = 2;</code>
     * @param value The prevOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPrevOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      prevOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev_offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrevOffset() {
      prevOffset_ = getDefaultInstance().getPrevOffset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev_offset = 2;</code>
     * @param value The bytes for prevOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPrevOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      prevOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object lastReadOffset_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string last_read_offset = 3;</code>
     * @return The lastReadOffset.
     */
    public java.lang.String getLastReadOffset() {
      java.lang.Object ref = lastReadOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastReadOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string last_read_offset = 3;</code>
     * @return The bytes for lastReadOffset.
     */
    public com.google.protobuf.ByteString
        getLastReadOffsetBytes() {
      java.lang.Object ref = lastReadOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastReadOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string last_read_offset = 3;</code>
     * @param value The lastReadOffset to set.
     * @return This builder for chaining.
     */
    public Builder setLastReadOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lastReadOffset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string last_read_offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastReadOffset() {
      lastReadOffset_ = getDefaultInstance().getLastReadOffset();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string last_read_offset = 3;</code>
     * @param value The bytes for lastReadOffset to set.
     * @return This builder for chaining.
     */
    public Builder setLastReadOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lastReadOffset_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pagination.FeedPaginationReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pagination.FeedPaginationReply)
  private static final bilibili.pagination.FeedPaginationReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pagination.FeedPaginationReply();
  }

  public static bilibili.pagination.FeedPaginationReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedPaginationReply>
      PARSER = new com.google.protobuf.AbstractParser<FeedPaginationReply>() {
    @java.lang.Override
    public FeedPaginationReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedPaginationReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedPaginationReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pagination.FeedPaginationReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

