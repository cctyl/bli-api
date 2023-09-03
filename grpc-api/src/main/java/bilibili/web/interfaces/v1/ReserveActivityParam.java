// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.ReserveActivityParam}
 */
public final class ReserveActivityParam extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.ReserveActivityParam)
    ReserveActivityParamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReserveActivityParam.newBuilder() to construct.
  private ReserveActivityParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReserveActivityParam() {
    from_ = "";
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReserveActivityParam();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReserveActivityParam_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReserveActivityParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.ReserveActivityParam.class, bilibili.web.interfaces.v1.ReserveActivityParam.Builder.class);
  }

  public static final int RESERVE_ID_FIELD_NUMBER = 1;
  private long reserveId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 reserve_id = 1;</code>
   * @return The reserveId.
   */
  @java.lang.Override
  public long getReserveId() {
    return reserveId_;
  }

  public static final int FROM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string from = 2;</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string from = 2;</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OID_FIELD_NUMBER = 4;
  private long oid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 oid = 4;</code>
   * @return The oid.
   */
  @java.lang.Override
  public long getOid() {
    return oid_;
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
    if (reserveId_ != 0L) {
      output.writeInt64(1, reserveId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (oid_ != 0L) {
      output.writeInt64(4, oid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reserveId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, reserveId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (oid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, oid_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.ReserveActivityParam)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.ReserveActivityParam other = (bilibili.web.interfaces.v1.ReserveActivityParam) obj;

    if (getReserveId()
        != other.getReserveId()) return false;
    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (getOid()
        != other.getOid()) return false;
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
    hash = (37 * hash) + RESERVE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReserveId());
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + OID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.ReserveActivityParam parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.ReserveActivityParam prototype) {
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
   * </pre>
   *
   * Protobuf type {@code bilibili.web.interfaces.v1.ReserveActivityParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.ReserveActivityParam)
      bilibili.web.interfaces.v1.ReserveActivityParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReserveActivityParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReserveActivityParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.ReserveActivityParam.class, bilibili.web.interfaces.v1.ReserveActivityParam.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.ReserveActivityParam.newBuilder()
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
      reserveId_ = 0L;
      from_ = "";
      type_ = "";
      oid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_ReserveActivityParam_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReserveActivityParam getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.ReserveActivityParam.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReserveActivityParam build() {
      bilibili.web.interfaces.v1.ReserveActivityParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.ReserveActivityParam buildPartial() {
      bilibili.web.interfaces.v1.ReserveActivityParam result = new bilibili.web.interfaces.v1.ReserveActivityParam(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.ReserveActivityParam result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reserveId_ = reserveId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.oid_ = oid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.ReserveActivityParam) {
        return mergeFrom((bilibili.web.interfaces.v1.ReserveActivityParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.ReserveActivityParam other) {
      if (other == bilibili.web.interfaces.v1.ReserveActivityParam.getDefaultInstance()) return this;
      if (other.getReserveId() != 0L) {
        setReserveId(other.getReserveId());
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getOid() != 0L) {
        setOid(other.getOid());
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
              reserveId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              oid_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long reserveId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @return The reserveId.
     */
    @java.lang.Override
    public long getReserveId() {
      return reserveId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @param value The reserveId to set.
     * @return This builder for chaining.
     */
    public Builder setReserveId(long value) {

      reserveId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reserveId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string from = 2;</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from = 2;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from = 2;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from = 2;</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long oid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 oid = 4;</code>
     * @return The oid.
     */
    @java.lang.Override
    public long getOid() {
      return oid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 oid = 4;</code>
     * @param value The oid to set.
     * @return This builder for chaining.
     */
    public Builder setOid(long value) {

      oid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 oid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      oid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.ReserveActivityParam)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.ReserveActivityParam)
  private static final bilibili.web.interfaces.v1.ReserveActivityParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.ReserveActivityParam();
  }

  public static bilibili.web.interfaces.v1.ReserveActivityParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReserveActivityParam>
      PARSER = new com.google.protobuf.AbstractParser<ReserveActivityParam>() {
    @java.lang.Override
    public ReserveActivityParam parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReserveActivityParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReserveActivityParam> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.ReserveActivityParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
