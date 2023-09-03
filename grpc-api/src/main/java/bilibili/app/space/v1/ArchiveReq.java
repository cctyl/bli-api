// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/space/v1/space.proto

package bilibili.app.space.v1;

/**
 * <pre>
 *-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.space.v1.ArchiveReq}
 */
public final class ArchiveReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.space.v1.ArchiveReq)
    ArchiveReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArchiveReq.newBuilder() to construct.
  private ArchiveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArchiveReq() {
    order_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArchiveReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.space.v1.SpaceOuterClass.internal_static_bilibili_app_space_v1_ArchiveReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.space.v1.SpaceOuterClass.internal_static_bilibili_app_space_v1_ArchiveReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.space.v1.ArchiveReq.class, bilibili.app.space.v1.ArchiveReq.Builder.class);
  }

  public static final int VMID_FIELD_NUMBER = 1;
  private long vmid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 vmid = 1;</code>
   * @return The vmid.
   */
  @java.lang.Override
  public long getVmid() {
    return vmid_;
  }

  public static final int PN_FIELD_NUMBER = 2;
  private int pn_ = 0;
  /**
   * <pre>
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
   * </pre>
   *
   * <code>int32 ps = 3;</code>
   * @return The ps.
   */
  @java.lang.Override
  public int getPs() {
    return ps_;
  }

  public static final int ORDER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object order_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string order = 4;</code>
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
   * </pre>
   *
   * <code>string order = 4;</code>
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
    if (vmid_ != 0L) {
      output.writeInt64(1, vmid_);
    }
    if (pn_ != 0) {
      output.writeInt32(2, pn_);
    }
    if (ps_ != 0) {
      output.writeInt32(3, ps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(order_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, order_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vmid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, vmid_);
    }
    if (pn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pn_);
    }
    if (ps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(order_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, order_);
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
    if (!(obj instanceof bilibili.app.space.v1.ArchiveReq)) {
      return super.equals(obj);
    }
    bilibili.app.space.v1.ArchiveReq other = (bilibili.app.space.v1.ArchiveReq) obj;

    if (getVmid()
        != other.getVmid()) return false;
    if (getPn()
        != other.getPn()) return false;
    if (getPs()
        != other.getPs()) return false;
    if (!getOrder()
        .equals(other.getOrder())) return false;
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
    hash = (37 * hash) + VMID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVmid());
    hash = (37 * hash) + PN_FIELD_NUMBER;
    hash = (53 * hash) + getPn();
    hash = (37 * hash) + PS_FIELD_NUMBER;
    hash = (53 * hash) + getPs();
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.space.v1.ArchiveReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.space.v1.ArchiveReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.space.v1.ArchiveReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.space.v1.ArchiveReq prototype) {
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
   *-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.space.v1.ArchiveReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.space.v1.ArchiveReq)
      bilibili.app.space.v1.ArchiveReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.space.v1.SpaceOuterClass.internal_static_bilibili_app_space_v1_ArchiveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.space.v1.SpaceOuterClass.internal_static_bilibili_app_space_v1_ArchiveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.space.v1.ArchiveReq.class, bilibili.app.space.v1.ArchiveReq.Builder.class);
    }

    // Construct using bilibili.app.space.v1.ArchiveReq.newBuilder()
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
      vmid_ = 0L;
      pn_ = 0;
      ps_ = 0;
      order_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.space.v1.SpaceOuterClass.internal_static_bilibili_app_space_v1_ArchiveReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.space.v1.ArchiveReq getDefaultInstanceForType() {
      return bilibili.app.space.v1.ArchiveReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.space.v1.ArchiveReq build() {
      bilibili.app.space.v1.ArchiveReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.space.v1.ArchiveReq buildPartial() {
      bilibili.app.space.v1.ArchiveReq result = new bilibili.app.space.v1.ArchiveReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.space.v1.ArchiveReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vmid_ = vmid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pn_ = pn_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ps_ = ps_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.order_ = order_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.space.v1.ArchiveReq) {
        return mergeFrom((bilibili.app.space.v1.ArchiveReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.space.v1.ArchiveReq other) {
      if (other == bilibili.app.space.v1.ArchiveReq.getDefaultInstance()) return this;
      if (other.getVmid() != 0L) {
        setVmid(other.getVmid());
      }
      if (other.getPn() != 0) {
        setPn(other.getPn());
      }
      if (other.getPs() != 0) {
        setPs(other.getPs());
      }
      if (!other.getOrder().isEmpty()) {
        order_ = other.order_;
        bitField0_ |= 0x00000008;
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
              vmid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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
            case 34: {
              order_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long vmid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 vmid = 1;</code>
     * @return The vmid.
     */
    @java.lang.Override
    public long getVmid() {
      return vmid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 vmid = 1;</code>
     * @param value The vmid to set.
     * @return This builder for chaining.
     */
    public Builder setVmid(long value) {

      vmid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 vmid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVmid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vmid_ = 0L;
      onChanged();
      return this;
    }

    private int pn_ ;
    /**
     * <pre>
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

    private java.lang.Object order_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string order = 4;</code>
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
     * </pre>
     *
     * <code>string order = 4;</code>
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
     * </pre>
     *
     * <code>string order = 4;</code>
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      order_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string order = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrder() {
      order_ = getDefaultInstance().getOrder();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string order = 4;</code>
     * @param value The bytes for order to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      order_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.space.v1.ArchiveReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.space.v1.ArchiveReq)
  private static final bilibili.app.space.v1.ArchiveReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.space.v1.ArchiveReq();
  }

  public static bilibili.app.space.v1.ArchiveReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArchiveReq>
      PARSER = new com.google.protobuf.AbstractParser<ArchiveReq>() {
    @java.lang.Override
    public ArchiveReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArchiveReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArchiveReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.space.v1.ArchiveReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

