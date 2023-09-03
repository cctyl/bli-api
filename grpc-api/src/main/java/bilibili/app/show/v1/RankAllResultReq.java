// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/rank/v1/rank.proto

package bilibili.app.show.v1;

/**
 * <pre>
 * 全站排行榜-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.show.v1.RankAllResultReq}
 */
public final class RankAllResultReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.show.v1.RankAllResultReq)
    RankAllResultReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RankAllResultReq.newBuilder() to construct.
  private RankAllResultReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RankAllResultReq() {
    order_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RankAllResultReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankAllResultReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankAllResultReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.show.v1.RankAllResultReq.class, bilibili.app.show.v1.RankAllResultReq.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object order_ = "";
  /**
   * <pre>
   * 必须为"all"
   * </pre>
   *
   * <code>string order = 1;</code>
   * @return The order.
   */
  @java.lang.Override
  public java.lang.String getOrder() {
    java.lang.Object ref = order_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      order_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 必须为"all"
   * </pre>
   *
   * <code>string order = 1;</code>
   * @return The bytes for order.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderBytes() {
    java.lang.Object ref = order_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      order_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PN_FIELD_NUMBER = 2;
  private int pn_ = 0;
  /**
   * <pre>
   * 页码
   * 默认1页
   * </pre>
   *
   * <code>int32 pn = 2;</code>
   * @return The pn.
   */
  @java.lang.Override
  public int getPn() {
    return pn_;
  }

  public static final int PS_FIELD_NUMBER = 3;
  private int ps_ = 0;
  /**
   * <pre>
   * 每页项数
   * 默认100项，最大100
   * </pre>
   *
   * <code>int32 ps = 3;</code>
   * @return The ps.
   */
  @java.lang.Override
  public int getPs() {
    return ps_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(order_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, order_);
    }
    if (pn_ != 0) {
      output.writeInt32(2, pn_);
    }
    if (ps_ != 0) {
      output.writeInt32(3, ps_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(order_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, order_);
    }
    if (pn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pn_);
    }
    if (ps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ps_);
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
    if (!(obj instanceof bilibili.app.show.v1.RankAllResultReq)) {
      return super.equals(obj);
    }
    bilibili.app.show.v1.RankAllResultReq other = (bilibili.app.show.v1.RankAllResultReq) obj;

    if (!getOrder()
        .equals(other.getOrder())) return false;
    if (getPn()
        != other.getPn()) return false;
    if (getPs()
        != other.getPs()) return false;
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
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder().hashCode();
    hash = (37 * hash) + PN_FIELD_NUMBER;
    hash = (53 * hash) + getPn();
    hash = (37 * hash) + PS_FIELD_NUMBER;
    hash = (53 * hash) + getPs();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.show.v1.RankAllResultReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.show.v1.RankAllResultReq prototype) {
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
   * 全站排行榜-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.show.v1.RankAllResultReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.show.v1.RankAllResultReq)
      bilibili.app.show.v1.RankAllResultReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankAllResultReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankAllResultReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.show.v1.RankAllResultReq.class, bilibili.app.show.v1.RankAllResultReq.Builder.class);
    }

    // Construct using bilibili.app.show.v1.RankAllResultReq.newBuilder()
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
      order_ = "";
      pn_ = 0;
      ps_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.show.v1.RankOuterClass.internal_static_bilibili_app_show_v1_RankAllResultReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankAllResultReq getDefaultInstanceForType() {
      return bilibili.app.show.v1.RankAllResultReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankAllResultReq build() {
      bilibili.app.show.v1.RankAllResultReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.show.v1.RankAllResultReq buildPartial() {
      bilibili.app.show.v1.RankAllResultReq result = new bilibili.app.show.v1.RankAllResultReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.show.v1.RankAllResultReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.order_ = order_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pn_ = pn_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ps_ = ps_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.show.v1.RankAllResultReq) {
        return mergeFrom((bilibili.app.show.v1.RankAllResultReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.show.v1.RankAllResultReq other) {
      if (other == bilibili.app.show.v1.RankAllResultReq.getDefaultInstance()) return this;
      if (!other.getOrder().isEmpty()) {
        order_ = other.order_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPn() != 0) {
        setPn(other.getPn());
      }
      if (other.getPs() != 0) {
        setPs(other.getPs());
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
              order_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              pn_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              ps_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object order_ = "";
    /**
     * <pre>
     * 必须为"all"
     * </pre>
     *
     * <code>string order = 1;</code>
     * @return The order.
     */
    public java.lang.String getOrder() {
      java.lang.Object ref = order_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        order_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 必须为"all"
     * </pre>
     *
     * <code>string order = 1;</code>
     * @return The bytes for order.
     */
    public com.google.protobuf.ByteString
        getOrderBytes() {
      java.lang.Object ref = order_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        order_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 必须为"all"
     * </pre>
     *
     * <code>string order = 1;</code>
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      order_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须为"all"
     * </pre>
     *
     * <code>string order = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrder() {
      order_ = getDefaultInstance().getOrder();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须为"all"
     * </pre>
     *
     * <code>string order = 1;</code>
     * @param value The bytes for order to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      order_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int pn_ ;
    /**
     * <pre>
     * 页码
     * 默认1页
     * </pre>
     *
     * <code>int32 pn = 2;</code>
     * @return The pn.
     */
    @java.lang.Override
    public int getPn() {
      return pn_;
    }
    /**
     * <pre>
     * 页码
     * 默认1页
     * </pre>
     *
     * <code>int32 pn = 2;</code>
     * @param value The pn to set.
     * @return This builder for chaining.
     */
    public Builder setPn(int value) {

      pn_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页码
     * 默认1页
     * </pre>
     *
     * <code>int32 pn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPn() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pn_ = 0;
      onChanged();
      return this;
    }

    private int ps_ ;
    /**
     * <pre>
     * 每页项数
     * 默认100项，最大100
     * </pre>
     *
     * <code>int32 ps = 3;</code>
     * @return The ps.
     */
    @java.lang.Override
    public int getPs() {
      return ps_;
    }
    /**
     * <pre>
     * 每页项数
     * 默认100项，最大100
     * </pre>
     *
     * <code>int32 ps = 3;</code>
     * @param value The ps to set.
     * @return This builder for chaining.
     */
    public Builder setPs(int value) {

      ps_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 每页项数
     * 默认100项，最大100
     * </pre>
     *
     * <code>int32 ps = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ps_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.show.v1.RankAllResultReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.show.v1.RankAllResultReq)
  private static final bilibili.app.show.v1.RankAllResultReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.show.v1.RankAllResultReq();
  }

  public static bilibili.app.show.v1.RankAllResultReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RankAllResultReq>
      PARSER = new com.google.protobuf.AbstractParser<RankAllResultReq>() {
    @java.lang.Override
    public RankAllResultReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<RankAllResultReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RankAllResultReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.show.v1.RankAllResultReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

