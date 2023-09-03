// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.ad.v1.Module10}
 */
public final class Module10 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.ad.v1.Module10)
    Module10OrBuilder {
private static final long serialVersionUID = 0L;
  // Use Module10.newBuilder() to construct.
  private Module10(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Module10() {
    latestUpdate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Module10();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module10_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module10_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.ad.v1.Module10.class, bilibili.ad.v1.Module10.Builder.class);
  }

  public static final int DISPLAY_FIELD_NUMBER = 1;
  private boolean display_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool display = 1;</code>
   * @return The display.
   */
  @java.lang.Override
  public boolean getDisplay() {
    return display_;
  }

  public static final int LATEST_UPDATE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object latestUpdate_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string latest_update = 2;</code>
   * @return The latestUpdate.
   */
  @java.lang.Override
  public java.lang.String getLatestUpdate() {
    java.lang.Object ref = latestUpdate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latestUpdate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string latest_update = 2;</code>
   * @return The bytes for latestUpdate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLatestUpdateBytes() {
    java.lang.Object ref = latestUpdate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      latestUpdate_ = b;
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
    if (display_ != false) {
      output.writeBool(1, display_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestUpdate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, latestUpdate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (display_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, display_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestUpdate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, latestUpdate_);
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
    if (!(obj instanceof bilibili.ad.v1.Module10)) {
      return super.equals(obj);
    }
    bilibili.ad.v1.Module10 other = (bilibili.ad.v1.Module10) obj;

    if (getDisplay()
        != other.getDisplay()) return false;
    if (!getLatestUpdate()
        .equals(other.getLatestUpdate())) return false;
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
    hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplay());
    hash = (37 * hash) + LATEST_UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + getLatestUpdate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.ad.v1.Module10 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module10 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module10 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.Module10 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module10 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module10 parseFrom(
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
  public static Builder newBuilder(bilibili.ad.v1.Module10 prototype) {
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
   * Protobuf type {@code bilibili.ad.v1.Module10}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.ad.v1.Module10)
      bilibili.ad.v1.Module10OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module10_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module10_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.ad.v1.Module10.class, bilibili.ad.v1.Module10.Builder.class);
    }

    // Construct using bilibili.ad.v1.Module10.newBuilder()
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
      display_ = false;
      latestUpdate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module10_descriptor;
    }

    @java.lang.Override
    public bilibili.ad.v1.Module10 getDefaultInstanceForType() {
      return bilibili.ad.v1.Module10.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.ad.v1.Module10 build() {
      bilibili.ad.v1.Module10 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.ad.v1.Module10 buildPartial() {
      bilibili.ad.v1.Module10 result = new bilibili.ad.v1.Module10(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.ad.v1.Module10 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.display_ = display_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.latestUpdate_ = latestUpdate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.ad.v1.Module10) {
        return mergeFrom((bilibili.ad.v1.Module10)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.ad.v1.Module10 other) {
      if (other == bilibili.ad.v1.Module10.getDefaultInstance()) return this;
      if (other.getDisplay() != false) {
        setDisplay(other.getDisplay());
      }
      if (!other.getLatestUpdate().isEmpty()) {
        latestUpdate_ = other.latestUpdate_;
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
            case 8: {
              display_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              latestUpdate_ = input.readStringRequireUtf8();
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

    private boolean display_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @return The display.
     */
    @java.lang.Override
    public boolean getDisplay() {
      return display_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @param value The display to set.
     * @return This builder for chaining.
     */
    public Builder setDisplay(boolean value) {

      display_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      display_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object latestUpdate_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string latest_update = 2;</code>
     * @return The latestUpdate.
     */
    public java.lang.String getLatestUpdate() {
      java.lang.Object ref = latestUpdate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestUpdate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string latest_update = 2;</code>
     * @return The bytes for latestUpdate.
     */
    public com.google.protobuf.ByteString
        getLatestUpdateBytes() {
      java.lang.Object ref = latestUpdate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latestUpdate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string latest_update = 2;</code>
     * @param value The latestUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setLatestUpdate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      latestUpdate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string latest_update = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatestUpdate() {
      latestUpdate_ = getDefaultInstance().getLatestUpdate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string latest_update = 2;</code>
     * @param value The bytes for latestUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setLatestUpdateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      latestUpdate_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.ad.v1.Module10)
  }

  // @@protoc_insertion_point(class_scope:bilibili.ad.v1.Module10)
  private static final bilibili.ad.v1.Module10 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.ad.v1.Module10();
  }

  public static bilibili.ad.v1.Module10 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module10>
      PARSER = new com.google.protobuf.AbstractParser<Module10>() {
    @java.lang.Override
    public Module10 parsePartialFrom(
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

  public static com.google.protobuf.Parser<Module10> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module10> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.ad.v1.Module10 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
