// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.TagCount}
 */
public final class TagCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.TagCount)
    TagCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TagCount.newBuilder() to construct.
  private TagCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TagCount() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TagCount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_TagCount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_TagCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.TagCount.class, bilibili.web.interfaces.v1.TagCount.Builder.class);
  }

  public static final int VIEW_FIELD_NUMBER = 1;
  private long view_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 view = 1;</code>
   * @return The view.
   */
  @java.lang.Override
  public long getView() {
    return view_;
  }

  public static final int USE_FIELD_NUMBER = 2;
  private long use_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 use = 2;</code>
   * @return The use.
   */
  @java.lang.Override
  public long getUse() {
    return use_;
  }

  public static final int ATTEN_FIELD_NUMBER = 3;
  private long atten_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 atten = 3;</code>
   * @return The atten.
   */
  @java.lang.Override
  public long getAtten() {
    return atten_;
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
    if (view_ != 0L) {
      output.writeInt64(1, view_);
    }
    if (use_ != 0L) {
      output.writeInt64(2, use_);
    }
    if (atten_ != 0L) {
      output.writeInt64(3, atten_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (view_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, view_);
    }
    if (use_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, use_);
    }
    if (atten_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, atten_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.TagCount)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.TagCount other = (bilibili.web.interfaces.v1.TagCount) obj;

    if (getView()
        != other.getView()) return false;
    if (getUse()
        != other.getUse()) return false;
    if (getAtten()
        != other.getAtten()) return false;
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
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getView());
    hash = (37 * hash) + USE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUse());
    hash = (37 * hash) + ATTEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAtten());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.TagCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.TagCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.TagCount parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.TagCount prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.TagCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.TagCount)
      bilibili.web.interfaces.v1.TagCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_TagCount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_TagCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.TagCount.class, bilibili.web.interfaces.v1.TagCount.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.TagCount.newBuilder()
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
      view_ = 0L;
      use_ = 0L;
      atten_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_TagCount_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.TagCount getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.TagCount.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.TagCount build() {
      bilibili.web.interfaces.v1.TagCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.TagCount buildPartial() {
      bilibili.web.interfaces.v1.TagCount result = new bilibili.web.interfaces.v1.TagCount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.TagCount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.view_ = view_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.use_ = use_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.atten_ = atten_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.TagCount) {
        return mergeFrom((bilibili.web.interfaces.v1.TagCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.TagCount other) {
      if (other == bilibili.web.interfaces.v1.TagCount.getDefaultInstance()) return this;
      if (other.getView() != 0L) {
        setView(other.getView());
      }
      if (other.getUse() != 0L) {
        setUse(other.getUse());
      }
      if (other.getAtten() != 0L) {
        setAtten(other.getAtten());
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
              view_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              use_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              atten_ = input.readInt64();
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

    private long view_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 view = 1;</code>
     * @return The view.
     */
    @java.lang.Override
    public long getView() {
      return view_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 view = 1;</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(long value) {

      view_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 view = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000001);
      view_ = 0L;
      onChanged();
      return this;
    }

    private long use_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 use = 2;</code>
     * @return The use.
     */
    @java.lang.Override
    public long getUse() {
      return use_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 use = 2;</code>
     * @param value The use to set.
     * @return This builder for chaining.
     */
    public Builder setUse(long value) {

      use_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 use = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUse() {
      bitField0_ = (bitField0_ & ~0x00000002);
      use_ = 0L;
      onChanged();
      return this;
    }

    private long atten_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 atten = 3;</code>
     * @return The atten.
     */
    @java.lang.Override
    public long getAtten() {
      return atten_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 atten = 3;</code>
     * @param value The atten to set.
     * @return This builder for chaining.
     */
    public Builder setAtten(long value) {

      atten_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 atten = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAtten() {
      bitField0_ = (bitField0_ & ~0x00000004);
      atten_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.TagCount)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.TagCount)
  private static final bilibili.web.interfaces.v1.TagCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.TagCount();
  }

  public static bilibili.web.interfaces.v1.TagCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagCount>
      PARSER = new com.google.protobuf.AbstractParser<TagCount>() {
    @java.lang.Override
    public TagCount parsePartialFrom(
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

  public static com.google.protobuf.Parser<TagCount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagCount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.TagCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
