// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/mixture/v1/mixture.proto

package bilibili.app.show.mixture.v1;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.show.mixture.v1.WidgetReq}
 */
public final class WidgetReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.show.mixture.v1.WidgetReq)
    WidgetReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WidgetReq.newBuilder() to construct.
  private WidgetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WidgetReq() {
    fromSpmid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WidgetReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.show.mixture.v1.MixtureOuterClass.internal_static_bilibili_app_show_mixture_v1_WidgetReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.show.mixture.v1.MixtureOuterClass.internal_static_bilibili_app_show_mixture_v1_WidgetReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.show.mixture.v1.WidgetReq.class, bilibili.app.show.mixture.v1.WidgetReq.Builder.class);
  }

  public static final int FROM_SPMID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromSpmid_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string from_spmid = 1;</code>
   * @return The fromSpmid.
   */
  @java.lang.Override
  public java.lang.String getFromSpmid() {
    java.lang.Object ref = fromSpmid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromSpmid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string from_spmid = 1;</code>
   * @return The bytes for fromSpmid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromSpmidBytes() {
    java.lang.Object ref = fromSpmid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromSpmid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_NO_FIELD_NUMBER = 2;
  private int pageNo_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>uint32 page_no = 2;</code>
   * @return The pageNo.
   */
  @java.lang.Override
  public int getPageNo() {
    return pageNo_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSpmid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromSpmid_);
    }
    if (pageNo_ != 0) {
      output.writeUInt32(2, pageNo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSpmid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromSpmid_);
    }
    if (pageNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, pageNo_);
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
    if (!(obj instanceof bilibili.app.show.mixture.v1.WidgetReq)) {
      return super.equals(obj);
    }
    bilibili.app.show.mixture.v1.WidgetReq other = (bilibili.app.show.mixture.v1.WidgetReq) obj;

    if (!getFromSpmid()
        .equals(other.getFromSpmid())) return false;
    if (getPageNo()
        != other.getPageNo()) return false;
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
    hash = (37 * hash) + FROM_SPMID_FIELD_NUMBER;
    hash = (53 * hash) + getFromSpmid().hashCode();
    hash = (37 * hash) + PAGE_NO_FIELD_NUMBER;
    hash = (53 * hash) + getPageNo();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.mixture.v1.WidgetReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.show.mixture.v1.WidgetReq prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.show.mixture.v1.WidgetReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.show.mixture.v1.WidgetReq)
      bilibili.app.show.mixture.v1.WidgetReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.show.mixture.v1.MixtureOuterClass.internal_static_bilibili_app_show_mixture_v1_WidgetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.show.mixture.v1.MixtureOuterClass.internal_static_bilibili_app_show_mixture_v1_WidgetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.show.mixture.v1.WidgetReq.class, bilibili.app.show.mixture.v1.WidgetReq.Builder.class);
    }

    // Construct using bilibili.app.show.mixture.v1.WidgetReq.newBuilder()
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
      fromSpmid_ = "";
      pageNo_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.show.mixture.v1.MixtureOuterClass.internal_static_bilibili_app_show_mixture_v1_WidgetReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.show.mixture.v1.WidgetReq getDefaultInstanceForType() {
      return bilibili.app.show.mixture.v1.WidgetReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.show.mixture.v1.WidgetReq build() {
      bilibili.app.show.mixture.v1.WidgetReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.show.mixture.v1.WidgetReq buildPartial() {
      bilibili.app.show.mixture.v1.WidgetReq result = new bilibili.app.show.mixture.v1.WidgetReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.show.mixture.v1.WidgetReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fromSpmid_ = fromSpmid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageNo_ = pageNo_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.show.mixture.v1.WidgetReq) {
        return mergeFrom((bilibili.app.show.mixture.v1.WidgetReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.show.mixture.v1.WidgetReq other) {
      if (other == bilibili.app.show.mixture.v1.WidgetReq.getDefaultInstance()) return this;
      if (!other.getFromSpmid().isEmpty()) {
        fromSpmid_ = other.fromSpmid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPageNo() != 0) {
        setPageNo(other.getPageNo());
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
              fromSpmid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              pageNo_ = input.readUInt32();
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

    private java.lang.Object fromSpmid_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string from_spmid = 1;</code>
     * @return The fromSpmid.
     */
    public java.lang.String getFromSpmid() {
      java.lang.Object ref = fromSpmid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromSpmid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string from_spmid = 1;</code>
     * @return The bytes for fromSpmid.
     */
    public com.google.protobuf.ByteString
        getFromSpmidBytes() {
      java.lang.Object ref = fromSpmid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromSpmid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string from_spmid = 1;</code>
     * @param value The fromSpmid to set.
     * @return This builder for chaining.
     */
    public Builder setFromSpmid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromSpmid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string from_spmid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromSpmid() {
      fromSpmid_ = getDefaultInstance().getFromSpmid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string from_spmid = 1;</code>
     * @param value The bytes for fromSpmid to set.
     * @return This builder for chaining.
     */
    public Builder setFromSpmidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromSpmid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int pageNo_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint32 page_no = 2;</code>
     * @return The pageNo.
     */
    @java.lang.Override
    public int getPageNo() {
      return pageNo_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint32 page_no = 2;</code>
     * @param value The pageNo to set.
     * @return This builder for chaining.
     */
    public Builder setPageNo(int value) {

      pageNo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint32 page_no = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageNo_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.show.mixture.v1.WidgetReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.show.mixture.v1.WidgetReq)
  private static final bilibili.app.show.mixture.v1.WidgetReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.show.mixture.v1.WidgetReq();
  }

  public static bilibili.app.show.mixture.v1.WidgetReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WidgetReq>
      PARSER = new com.google.protobuf.AbstractParser<WidgetReq>() {
    @java.lang.Override
    public WidgetReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<WidgetReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WidgetReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.show.mixture.v1.WidgetReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
