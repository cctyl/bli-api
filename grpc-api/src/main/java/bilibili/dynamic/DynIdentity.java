// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * 动态的标识
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.DynIdentity}
 */
public final class DynIdentity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.DynIdentity)
    DynIdentityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynIdentity.newBuilder() to construct.
  private DynIdentity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynIdentity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynIdentity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynIdentity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynIdentity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.DynIdentity.class, bilibili.dynamic.DynIdentity.Builder.class);
  }

  public static final int DYN_ID_FIELD_NUMBER = 1;
  private long dynId_ = 0L;
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>int64 dyn_id = 1;</code>
   * @return The dynId.
   */
  @java.lang.Override
  public long getDynId() {
    return dynId_;
  }

  public static final int REVS_ID_FIELD_NUMBER = 2;
  private bilibili.dynamic.DynRevsId revsId_;
  /**
   * <pre>
   * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
   * </pre>
   *
   * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
   * @return Whether the revsId field is set.
   */
  @java.lang.Override
  public boolean hasRevsId() {
    return revsId_ != null;
  }
  /**
   * <pre>
   * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
   * </pre>
   *
   * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
   * @return The revsId.
   */
  @java.lang.Override
  public bilibili.dynamic.DynRevsId getRevsId() {
    return revsId_ == null ? bilibili.dynamic.DynRevsId.getDefaultInstance() : revsId_;
  }
  /**
   * <pre>
   * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
   * </pre>
   *
   * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.DynRevsIdOrBuilder getRevsIdOrBuilder() {
    return revsId_ == null ? bilibili.dynamic.DynRevsId.getDefaultInstance() : revsId_;
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
    if (dynId_ != 0L) {
      output.writeInt64(1, dynId_);
    }
    if (revsId_ != null) {
      output.writeMessage(2, getRevsId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dynId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, dynId_);
    }
    if (revsId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRevsId());
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
    if (!(obj instanceof bilibili.dynamic.DynIdentity)) {
      return super.equals(obj);
    }
    bilibili.dynamic.DynIdentity other = (bilibili.dynamic.DynIdentity) obj;

    if (getDynId()
        != other.getDynId()) return false;
    if (hasRevsId() != other.hasRevsId()) return false;
    if (hasRevsId()) {
      if (!getRevsId()
          .equals(other.getRevsId())) return false;
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
    hash = (37 * hash) + DYN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDynId());
    if (hasRevsId()) {
      hash = (37 * hash) + REVS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRevsId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.DynIdentity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.DynIdentity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynIdentity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynIdentity parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.DynIdentity prototype) {
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
   * 动态的标识
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.DynIdentity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.DynIdentity)
      bilibili.dynamic.DynIdentityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynIdentity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.DynIdentity.class, bilibili.dynamic.DynIdentity.Builder.class);
    }

    // Construct using bilibili.dynamic.DynIdentity.newBuilder()
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
      dynId_ = 0L;
      revsId_ = null;
      if (revsIdBuilder_ != null) {
        revsIdBuilder_.dispose();
        revsIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynIdentity_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.DynIdentity getDefaultInstanceForType() {
      return bilibili.dynamic.DynIdentity.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.DynIdentity build() {
      bilibili.dynamic.DynIdentity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.DynIdentity buildPartial() {
      bilibili.dynamic.DynIdentity result = new bilibili.dynamic.DynIdentity(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.DynIdentity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dynId_ = dynId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revsId_ = revsIdBuilder_ == null
            ? revsId_
            : revsIdBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.DynIdentity) {
        return mergeFrom((bilibili.dynamic.DynIdentity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.DynIdentity other) {
      if (other == bilibili.dynamic.DynIdentity.getDefaultInstance()) return this;
      if (other.getDynId() != 0L) {
        setDynId(other.getDynId());
      }
      if (other.hasRevsId()) {
        mergeRevsId(other.getRevsId());
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
              dynId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRevsIdFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private long dynId_ ;
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>int64 dyn_id = 1;</code>
     * @return The dynId.
     */
    @java.lang.Override
    public long getDynId() {
      return dynId_;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>int64 dyn_id = 1;</code>
     * @param value The dynId to set.
     * @return This builder for chaining.
     */
    public Builder setDynId(long value) {

      dynId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>int64 dyn_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dynId_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.dynamic.DynRevsId revsId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynRevsId, bilibili.dynamic.DynRevsId.Builder, bilibili.dynamic.DynRevsIdOrBuilder> revsIdBuilder_;
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     * @return Whether the revsId field is set.
     */
    public boolean hasRevsId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     * @return The revsId.
     */
    public bilibili.dynamic.DynRevsId getRevsId() {
      if (revsIdBuilder_ == null) {
        return revsId_ == null ? bilibili.dynamic.DynRevsId.getDefaultInstance() : revsId_;
      } else {
        return revsIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public Builder setRevsId(bilibili.dynamic.DynRevsId value) {
      if (revsIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        revsId_ = value;
      } else {
        revsIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public Builder setRevsId(
        bilibili.dynamic.DynRevsId.Builder builderForValue) {
      if (revsIdBuilder_ == null) {
        revsId_ = builderForValue.build();
      } else {
        revsIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public Builder mergeRevsId(bilibili.dynamic.DynRevsId value) {
      if (revsIdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          revsId_ != null &&
          revsId_ != bilibili.dynamic.DynRevsId.getDefaultInstance()) {
          getRevsIdBuilder().mergeFrom(value);
        } else {
          revsId_ = value;
        }
      } else {
        revsIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public Builder clearRevsId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      revsId_ = null;
      if (revsIdBuilder_ != null) {
        revsIdBuilder_.dispose();
        revsIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public bilibili.dynamic.DynRevsId.Builder getRevsIdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRevsIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    public bilibili.dynamic.DynRevsIdOrBuilder getRevsIdOrBuilder() {
      if (revsIdBuilder_ != null) {
        return revsIdBuilder_.getMessageOrBuilder();
      } else {
        return revsId_ == null ?
            bilibili.dynamic.DynRevsId.getDefaultInstance() : revsId_;
      }
    }
    /**
     * <pre>
     * 动态反向id，通过(type+rid组合)也可以唯一标识一个动态，与dyn_id出现任意一个即可
     * </pre>
     *
     * <code>.bilibili.dynamic.DynRevsId revs_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.DynRevsId, bilibili.dynamic.DynRevsId.Builder, bilibili.dynamic.DynRevsIdOrBuilder> 
        getRevsIdFieldBuilder() {
      if (revsIdBuilder_ == null) {
        revsIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.DynRevsId, bilibili.dynamic.DynRevsId.Builder, bilibili.dynamic.DynRevsIdOrBuilder>(
                getRevsId(),
                getParentForChildren(),
                isClean());
        revsId_ = null;
      }
      return revsIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.DynIdentity)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.DynIdentity)
  private static final bilibili.dynamic.DynIdentity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.DynIdentity();
  }

  public static bilibili.dynamic.DynIdentity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynIdentity>
      PARSER = new com.google.protobuf.AbstractParser<DynIdentity>() {
    @java.lang.Override
    public DynIdentity parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynIdentity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynIdentity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.DynIdentity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
