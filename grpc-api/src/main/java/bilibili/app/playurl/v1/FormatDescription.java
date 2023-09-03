// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * 清晰度描述
 * </pre>
 *
 * Protobuf type {@code bilibili.app.playurl.v1.FormatDescription}
 */
public final class FormatDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.playurl.v1.FormatDescription)
    FormatDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FormatDescription.newBuilder() to construct.
  private FormatDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormatDescription() {
    format_ = "";
    description_ = "";
    newDescription_ = "";
    displayDesc_ = "";
    superscript_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FormatDescription();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_FormatDescription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_FormatDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.playurl.v1.FormatDescription.class, bilibili.app.playurl.v1.FormatDescription.Builder.class);
  }

  public static final int QUALITY_FIELD_NUMBER = 1;
  private int quality_ = 0;
  /**
   * <pre>
   * 清晰度
   * </pre>
   *
   * <code>int32 quality = 1;</code>
   * @return The quality.
   */
  @java.lang.Override
  public int getQuality() {
    return quality_;
  }

  public static final int FORMAT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object format_ = "";
  /**
   * <pre>
   * 清晰度格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 清晰度格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * 清晰度描述
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 清晰度描述
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_DESCRIPTION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newDescription_ = "";
  /**
   * <pre>
   * 新描述
   * </pre>
   *
   * <code>string new_description = 4;</code>
   * @return The newDescription.
   */
  @java.lang.Override
  public java.lang.String getNewDescription() {
    java.lang.Object ref = newDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 新描述
   * </pre>
   *
   * <code>string new_description = 4;</code>
   * @return The bytes for newDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewDescriptionBytes() {
    java.lang.Object ref = newDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_DESC_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayDesc_ = "";
  /**
   * <pre>
   * 选中态的清晰度描述
   * </pre>
   *
   * <code>string display_desc = 5;</code>
   * @return The displayDesc.
   */
  @java.lang.Override
  public java.lang.String getDisplayDesc() {
    java.lang.Object ref = displayDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayDesc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 选中态的清晰度描述
   * </pre>
   *
   * <code>string display_desc = 5;</code>
   * @return The bytes for displayDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayDescBytes() {
    java.lang.Object ref = displayDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUPERSCRIPT_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object superscript_ = "";
  /**
   * <pre>
   * 选中态的清晰度描述的角标
   * </pre>
   *
   * <code>string superscript = 6;</code>
   * @return The superscript.
   */
  @java.lang.Override
  public java.lang.String getSuperscript() {
    java.lang.Object ref = superscript_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      superscript_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 选中态的清晰度描述的角标
   * </pre>
   *
   * <code>string superscript = 6;</code>
   * @return The bytes for superscript.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSuperscriptBytes() {
    java.lang.Object ref = superscript_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      superscript_ = b;
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
    if (quality_ != 0) {
      output.writeInt32(1, quality_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newDescription_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayDesc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, displayDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(superscript_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, superscript_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (quality_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, quality_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newDescription_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayDesc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, displayDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(superscript_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, superscript_);
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
    if (!(obj instanceof bilibili.app.playurl.v1.FormatDescription)) {
      return super.equals(obj);
    }
    bilibili.app.playurl.v1.FormatDescription other = (bilibili.app.playurl.v1.FormatDescription) obj;

    if (getQuality()
        != other.getQuality()) return false;
    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getNewDescription()
        .equals(other.getNewDescription())) return false;
    if (!getDisplayDesc()
        .equals(other.getDisplayDesc())) return false;
    if (!getSuperscript()
        .equals(other.getSuperscript())) return false;
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
    hash = (37 * hash) + QUALITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuality();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + NEW_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getNewDescription().hashCode();
    hash = (37 * hash) + DISPLAY_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayDesc().hashCode();
    hash = (37 * hash) + SUPERSCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getSuperscript().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.FormatDescription parseFrom(
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
  public static Builder newBuilder(bilibili.app.playurl.v1.FormatDescription prototype) {
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
   * 清晰度描述
   * </pre>
   *
   * Protobuf type {@code bilibili.app.playurl.v1.FormatDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.playurl.v1.FormatDescription)
      bilibili.app.playurl.v1.FormatDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_FormatDescription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_FormatDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.playurl.v1.FormatDescription.class, bilibili.app.playurl.v1.FormatDescription.Builder.class);
    }

    // Construct using bilibili.app.playurl.v1.FormatDescription.newBuilder()
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
      quality_ = 0;
      format_ = "";
      description_ = "";
      newDescription_ = "";
      displayDesc_ = "";
      superscript_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_FormatDescription_descriptor;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.FormatDescription getDefaultInstanceForType() {
      return bilibili.app.playurl.v1.FormatDescription.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.FormatDescription build() {
      bilibili.app.playurl.v1.FormatDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.FormatDescription buildPartial() {
      bilibili.app.playurl.v1.FormatDescription result = new bilibili.app.playurl.v1.FormatDescription(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.playurl.v1.FormatDescription result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.quality_ = quality_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.newDescription_ = newDescription_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.displayDesc_ = displayDesc_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.superscript_ = superscript_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.playurl.v1.FormatDescription) {
        return mergeFrom((bilibili.app.playurl.v1.FormatDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.playurl.v1.FormatDescription other) {
      if (other == bilibili.app.playurl.v1.FormatDescription.getDefaultInstance()) return this;
      if (other.getQuality() != 0) {
        setQuality(other.getQuality());
      }
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getNewDescription().isEmpty()) {
        newDescription_ = other.newDescription_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getDisplayDesc().isEmpty()) {
        displayDesc_ = other.displayDesc_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getSuperscript().isEmpty()) {
        superscript_ = other.superscript_;
        bitField0_ |= 0x00000020;
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
              quality_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              format_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              newDescription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              displayDesc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              superscript_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private int quality_ ;
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 quality = 1;</code>
     * @return The quality.
     */
    @java.lang.Override
    public int getQuality() {
      return quality_;
    }
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 quality = 1;</code>
     * @param value The quality to set.
     * @return This builder for chaining.
     */
    public Builder setQuality(int value) {

      quality_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度
     * </pre>
     *
     * <code>int32 quality = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuality() {
      bitField0_ = (bitField0_ & ~0x00000001);
      quality_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <pre>
     * 清晰度格式
     * </pre>
     *
     * <code>string format = 2;</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 清晰度格式
     * </pre>
     *
     * <code>string format = 2;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 清晰度格式
     * </pre>
     *
     * <code>string format = 2;</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度格式
     * </pre>
     *
     * <code>string format = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      format_ = getDefaultInstance().getFormat();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度格式
     * </pre>
     *
     * <code>string format = 2;</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * 清晰度描述
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 清晰度描述
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 清晰度描述
     * </pre>
     *
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度描述
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 清晰度描述
     * </pre>
     *
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object newDescription_ = "";
    /**
     * <pre>
     * 新描述
     * </pre>
     *
     * <code>string new_description = 4;</code>
     * @return The newDescription.
     */
    public java.lang.String getNewDescription() {
      java.lang.Object ref = newDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 新描述
     * </pre>
     *
     * <code>string new_description = 4;</code>
     * @return The bytes for newDescription.
     */
    public com.google.protobuf.ByteString
        getNewDescriptionBytes() {
      java.lang.Object ref = newDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 新描述
     * </pre>
     *
     * <code>string new_description = 4;</code>
     * @param value The newDescription to set.
     * @return This builder for chaining.
     */
    public Builder setNewDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newDescription_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 新描述
     * </pre>
     *
     * <code>string new_description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewDescription() {
      newDescription_ = getDefaultInstance().getNewDescription();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 新描述
     * </pre>
     *
     * <code>string new_description = 4;</code>
     * @param value The bytes for newDescription to set.
     * @return This builder for chaining.
     */
    public Builder setNewDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newDescription_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object displayDesc_ = "";
    /**
     * <pre>
     * 选中态的清晰度描述
     * </pre>
     *
     * <code>string display_desc = 5;</code>
     * @return The displayDesc.
     */
    public java.lang.String getDisplayDesc() {
      java.lang.Object ref = displayDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 选中态的清晰度描述
     * </pre>
     *
     * <code>string display_desc = 5;</code>
     * @return The bytes for displayDesc.
     */
    public com.google.protobuf.ByteString
        getDisplayDescBytes() {
      java.lang.Object ref = displayDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 选中态的清晰度描述
     * </pre>
     *
     * <code>string display_desc = 5;</code>
     * @param value The displayDesc to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayDesc_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选中态的清晰度描述
     * </pre>
     *
     * <code>string display_desc = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayDesc() {
      displayDesc_ = getDefaultInstance().getDisplayDesc();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选中态的清晰度描述
     * </pre>
     *
     * <code>string display_desc = 5;</code>
     * @param value The bytes for displayDesc to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayDesc_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object superscript_ = "";
    /**
     * <pre>
     * 选中态的清晰度描述的角标
     * </pre>
     *
     * <code>string superscript = 6;</code>
     * @return The superscript.
     */
    public java.lang.String getSuperscript() {
      java.lang.Object ref = superscript_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        superscript_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 选中态的清晰度描述的角标
     * </pre>
     *
     * <code>string superscript = 6;</code>
     * @return The bytes for superscript.
     */
    public com.google.protobuf.ByteString
        getSuperscriptBytes() {
      java.lang.Object ref = superscript_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        superscript_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 选中态的清晰度描述的角标
     * </pre>
     *
     * <code>string superscript = 6;</code>
     * @param value The superscript to set.
     * @return This builder for chaining.
     */
    public Builder setSuperscript(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      superscript_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选中态的清晰度描述的角标
     * </pre>
     *
     * <code>string superscript = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuperscript() {
      superscript_ = getDefaultInstance().getSuperscript();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选中态的清晰度描述的角标
     * </pre>
     *
     * <code>string superscript = 6;</code>
     * @param value The bytes for superscript to set.
     * @return This builder for chaining.
     */
    public Builder setSuperscriptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      superscript_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.playurl.v1.FormatDescription)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.playurl.v1.FormatDescription)
  private static final bilibili.app.playurl.v1.FormatDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.playurl.v1.FormatDescription();
  }

  public static bilibili.app.playurl.v1.FormatDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormatDescription>
      PARSER = new com.google.protobuf.AbstractParser<FormatDescription>() {
    @java.lang.Override
    public FormatDescription parsePartialFrom(
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

  public static com.google.protobuf.Parser<FormatDescription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormatDescription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.playurl.v1.FormatDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
