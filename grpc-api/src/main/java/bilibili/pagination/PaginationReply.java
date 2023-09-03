// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pagination/pagination.proto

package bilibili.pagination;

/**
 * <pre>
 * 分页信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pagination.PaginationReply}
 */
public final class PaginationReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pagination.PaginationReply)
    PaginationReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginationReply.newBuilder() to construct.
  private PaginationReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginationReply() {
    next_ = "";
    prev_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginationReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_PaginationReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_PaginationReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pagination.PaginationReply.class, bilibili.pagination.PaginationReply.Builder.class);
  }

  public static final int NEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object next_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string next = 1;</code>
   * @return The next.
   */
  @java.lang.Override
  public java.lang.String getNext() {
    java.lang.Object ref = next_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      next_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string next = 1;</code>
   * @return The bytes for next.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextBytes() {
    java.lang.Object ref = next_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      next_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREV_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object prev_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string prev = 2;</code>
   * @return The prev.
   */
  @java.lang.Override
  public java.lang.String getPrev() {
    java.lang.Object ref = prev_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prev_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string prev = 2;</code>
   * @return The bytes for prev.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrevBytes() {
    java.lang.Object ref = prev_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prev_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(next_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, next_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prev_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prev_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(next_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, next_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prev_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prev_);
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
    if (!(obj instanceof bilibili.pagination.PaginationReply)) {
      return super.equals(obj);
    }
    bilibili.pagination.PaginationReply other = (bilibili.pagination.PaginationReply) obj;

    if (!getNext()
        .equals(other.getNext())) return false;
    if (!getPrev()
        .equals(other.getPrev())) return false;
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
    hash = (37 * hash) + NEXT_FIELD_NUMBER;
    hash = (53 * hash) + getNext().hashCode();
    hash = (37 * hash) + PREV_FIELD_NUMBER;
    hash = (53 * hash) + getPrev().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pagination.PaginationReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.PaginationReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pagination.PaginationReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pagination.PaginationReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pagination.PaginationReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pagination.PaginationReply parseFrom(
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
  public static Builder newBuilder(bilibili.pagination.PaginationReply prototype) {
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
   * Protobuf type {@code bilibili.pagination.PaginationReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pagination.PaginationReply)
      bilibili.pagination.PaginationReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_PaginationReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_PaginationReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pagination.PaginationReply.class, bilibili.pagination.PaginationReply.Builder.class);
    }

    // Construct using bilibili.pagination.PaginationReply.newBuilder()
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
      next_ = "";
      prev_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pagination.PaginationOuterClass.internal_static_bilibili_pagination_PaginationReply_descriptor;
    }

    @java.lang.Override
    public bilibili.pagination.PaginationReply getDefaultInstanceForType() {
      return bilibili.pagination.PaginationReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pagination.PaginationReply build() {
      bilibili.pagination.PaginationReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pagination.PaginationReply buildPartial() {
      bilibili.pagination.PaginationReply result = new bilibili.pagination.PaginationReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pagination.PaginationReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.next_ = next_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.prev_ = prev_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pagination.PaginationReply) {
        return mergeFrom((bilibili.pagination.PaginationReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pagination.PaginationReply other) {
      if (other == bilibili.pagination.PaginationReply.getDefaultInstance()) return this;
      if (!other.getNext().isEmpty()) {
        next_ = other.next_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrev().isEmpty()) {
        prev_ = other.prev_;
        bitField0_ |= 0x00000002;
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
              next_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              prev_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object next_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string next = 1;</code>
     * @return The next.
     */
    public java.lang.String getNext() {
      java.lang.Object ref = next_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        next_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next = 1;</code>
     * @return The bytes for next.
     */
    public com.google.protobuf.ByteString
        getNextBytes() {
      java.lang.Object ref = next_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        next_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next = 1;</code>
     * @param value The next to set.
     * @return This builder for chaining.
     */
    public Builder setNext(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      next_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNext() {
      next_ = getDefaultInstance().getNext();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string next = 1;</code>
     * @param value The bytes for next to set.
     * @return This builder for chaining.
     */
    public Builder setNextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      next_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object prev_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev = 2;</code>
     * @return The prev.
     */
    public java.lang.String getPrev() {
      java.lang.Object ref = prev_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prev_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev = 2;</code>
     * @return The bytes for prev.
     */
    public com.google.protobuf.ByteString
        getPrevBytes() {
      java.lang.Object ref = prev_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prev_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev = 2;</code>
     * @param value The prev to set.
     * @return This builder for chaining.
     */
    public Builder setPrev(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      prev_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrev() {
      prev_ = getDefaultInstance().getPrev();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string prev = 2;</code>
     * @param value The bytes for prev to set.
     * @return This builder for chaining.
     */
    public Builder setPrevBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      prev_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pagination.PaginationReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pagination.PaginationReply)
  private static final bilibili.pagination.PaginationReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pagination.PaginationReply();
  }

  public static bilibili.pagination.PaginationReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginationReply>
      PARSER = new com.google.protobuf.AbstractParser<PaginationReply>() {
    @java.lang.Override
    public PaginationReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<PaginationReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginationReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pagination.PaginationReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

