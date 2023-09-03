// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/account/fission/v1/fission.proto

package bilibili.account.fission.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.account.fission.v1.PrivacyReq}
 */
public final class PrivacyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.account.fission.v1.PrivacyReq)
    PrivacyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrivacyReq.newBuilder() to construct.
  private PrivacyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrivacyReq() {
    activityUid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrivacyReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.account.fission.v1.FissionOuterClass.internal_static_bilibili_account_fission_v1_PrivacyReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.account.fission.v1.FissionOuterClass.internal_static_bilibili_account_fission_v1_PrivacyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.account.fission.v1.PrivacyReq.class, bilibili.account.fission.v1.PrivacyReq.Builder.class);
  }

  public static final int ACTIVITY_UID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object activityUid_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_uid = 1;</code>
   * @return The activityUid.
   */
  @java.lang.Override
  public java.lang.String getActivityUid() {
    java.lang.Object ref = activityUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activityUid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_uid = 1;</code>
   * @return The bytes for activityUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActivityUidBytes() {
    java.lang.Object ref = activityUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activityUid_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activityUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, activityUid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activityUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, activityUid_);
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
    if (!(obj instanceof bilibili.account.fission.v1.PrivacyReq)) {
      return super.equals(obj);
    }
    bilibili.account.fission.v1.PrivacyReq other = (bilibili.account.fission.v1.PrivacyReq) obj;

    if (!getActivityUid()
        .equals(other.getActivityUid())) return false;
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
    hash = (37 * hash) + ACTIVITY_UID_FIELD_NUMBER;
    hash = (53 * hash) + getActivityUid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.account.fission.v1.PrivacyReq parseFrom(
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
  public static Builder newBuilder(bilibili.account.fission.v1.PrivacyReq prototype) {
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
   * Protobuf type {@code bilibili.account.fission.v1.PrivacyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.account.fission.v1.PrivacyReq)
      bilibili.account.fission.v1.PrivacyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.account.fission.v1.FissionOuterClass.internal_static_bilibili_account_fission_v1_PrivacyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.account.fission.v1.FissionOuterClass.internal_static_bilibili_account_fission_v1_PrivacyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.account.fission.v1.PrivacyReq.class, bilibili.account.fission.v1.PrivacyReq.Builder.class);
    }

    // Construct using bilibili.account.fission.v1.PrivacyReq.newBuilder()
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
      activityUid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.account.fission.v1.FissionOuterClass.internal_static_bilibili_account_fission_v1_PrivacyReq_descriptor;
    }

    @java.lang.Override
    public bilibili.account.fission.v1.PrivacyReq getDefaultInstanceForType() {
      return bilibili.account.fission.v1.PrivacyReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.account.fission.v1.PrivacyReq build() {
      bilibili.account.fission.v1.PrivacyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.account.fission.v1.PrivacyReq buildPartial() {
      bilibili.account.fission.v1.PrivacyReq result = new bilibili.account.fission.v1.PrivacyReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.account.fission.v1.PrivacyReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.activityUid_ = activityUid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.account.fission.v1.PrivacyReq) {
        return mergeFrom((bilibili.account.fission.v1.PrivacyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.account.fission.v1.PrivacyReq other) {
      if (other == bilibili.account.fission.v1.PrivacyReq.getDefaultInstance()) return this;
      if (!other.getActivityUid().isEmpty()) {
        activityUid_ = other.activityUid_;
        bitField0_ |= 0x00000001;
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
              activityUid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object activityUid_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_uid = 1;</code>
     * @return The activityUid.
     */
    public java.lang.String getActivityUid() {
      java.lang.Object ref = activityUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activityUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_uid = 1;</code>
     * @return The bytes for activityUid.
     */
    public com.google.protobuf.ByteString
        getActivityUidBytes() {
      java.lang.Object ref = activityUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activityUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_uid = 1;</code>
     * @param value The activityUid to set.
     * @return This builder for chaining.
     */
    public Builder setActivityUid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      activityUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityUid() {
      activityUid_ = getDefaultInstance().getActivityUid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_uid = 1;</code>
     * @param value The bytes for activityUid to set.
     * @return This builder for chaining.
     */
    public Builder setActivityUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      activityUid_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.account.fission.v1.PrivacyReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.account.fission.v1.PrivacyReq)
  private static final bilibili.account.fission.v1.PrivacyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.account.fission.v1.PrivacyReq();
  }

  public static bilibili.account.fission.v1.PrivacyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivacyReq>
      PARSER = new com.google.protobuf.AbstractParser<PrivacyReq>() {
    @java.lang.Override
    public PrivacyReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrivacyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivacyReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.account.fission.v1.PrivacyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

