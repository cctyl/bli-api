// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 页面信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.Page}
 */
public final class Page extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.Page)
    PageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Page.newBuilder() to construct.
  private Page(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Page() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Page();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_Page_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_Page_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.Page.class, bilibili.app.interface.v1.Page.Builder.class);
  }

  public static final int PN_FIELD_NUMBER = 1;
  private long pn_ = 0L;
  /**
   * <pre>
   * 当前页码
   * </pre>
   *
   * <code>int64 pn = 1;</code>
   * @return The pn.
   */
  @java.lang.Override
  public long getPn() {
    return pn_;
  }

  public static final int TOTAL_FIELD_NUMBER = 2;
  private long total_ = 0L;
  /**
   * <pre>
   * 总计条目数
   * </pre>
   *
   * <code>int64 total = 2;</code>
   * @return The total.
   */
  @java.lang.Override
  public long getTotal() {
    return total_;
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
    if (pn_ != 0L) {
      output.writeInt64(1, pn_);
    }
    if (total_ != 0L) {
      output.writeInt64(2, total_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pn_);
    }
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, total_);
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
    if (!(obj instanceof bilibili.app.interface.v1.Page)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.Page other = (bilibili.app.interface.v1.Page) obj;

    if (getPn()
        != other.getPn()) return false;
    if (getTotal()
        != other.getTotal()) return false;
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
    hash = (37 * hash) + PN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPn());
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.Page parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.Page parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.Page parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.Page parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.Page parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.Page parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.Page prototype) {
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
   * 页面信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.Page}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.Page)
      bilibili.app.interface.v1.PageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_Page_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_Page_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.Page.class, bilibili.app.interface.v1.Page.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.Page.newBuilder()
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
      pn_ = 0L;
      total_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_Page_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.Page getDefaultInstanceForType() {
      return bilibili.app.interface.v1.Page.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.Page build() {
      bilibili.app.interface.v1.Page result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.Page buildPartial() {
      bilibili.app.interface.v1.Page result = new bilibili.app.interface.v1.Page(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.Page result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pn_ = pn_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.total_ = total_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.Page) {
        return mergeFrom((bilibili.app.interface.v1.Page)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.Page other) {
      if (other == bilibili.app.interface.v1.Page.getDefaultInstance()) return this;
      if (other.getPn() != 0L) {
        setPn(other.getPn());
      }
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
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
              pn_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              total_ = input.readInt64();
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

    private long pn_ ;
    /**
     * <pre>
     * 当前页码
     * </pre>
     *
     * <code>int64 pn = 1;</code>
     * @return The pn.
     */
    @java.lang.Override
    public long getPn() {
      return pn_;
    }
    /**
     * <pre>
     * 当前页码
     * </pre>
     *
     * <code>int64 pn = 1;</code>
     * @param value The pn to set.
     * @return This builder for chaining.
     */
    public Builder setPn(long value) {

      pn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前页码
     * </pre>
     *
     * <code>int64 pn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPn() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pn_ = 0L;
      onChanged();
      return this;
    }

    private long total_ ;
    /**
     * <pre>
     * 总计条目数
     * </pre>
     *
     * <code>int64 total = 2;</code>
     * @return The total.
     */
    @java.lang.Override
    public long getTotal() {
      return total_;
    }
    /**
     * <pre>
     * 总计条目数
     * </pre>
     *
     * <code>int64 total = 2;</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(long value) {

      total_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 总计条目数
     * </pre>
     *
     * <code>int64 total = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      bitField0_ = (bitField0_ & ~0x00000002);
      total_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.Page)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.Page)
  private static final bilibili.app.interface.v1.Page DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.Page();
  }

  public static bilibili.app.interface.v1.Page getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Page>
      PARSER = new com.google.protobuf.AbstractParser<Page>() {
    @java.lang.Override
    public Page parsePartialFrom(
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

  public static com.google.protobuf.Parser<Page> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Page> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.Page getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
