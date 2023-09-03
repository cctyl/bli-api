// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 三点-稍后在看
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ThreePointWait}
 */
public final class ThreePointWait extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ThreePointWait)
    ThreePointWaitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreePointWait.newBuilder() to construct.
  private ThreePointWait(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreePointWait() {
    additionIcon_ = "";
    additionText_ = "";
    noAdditionIcon_ = "";
    noAdditionText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreePointWait();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointWait_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointWait_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.ThreePointWait.class, bilibili.app.dynamic.v2.ThreePointWait.Builder.class);
  }

  public static final int ADDITION_ICON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object additionIcon_ = "";
  /**
   * <pre>
   * addition icon
   * </pre>
   *
   * <code>string addition_icon = 1;</code>
   * @return The additionIcon.
   */
  @java.lang.Override
  public java.lang.String getAdditionIcon() {
    java.lang.Object ref = additionIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      additionIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * addition icon
   * </pre>
   *
   * <code>string addition_icon = 1;</code>
   * @return The bytes for additionIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdditionIconBytes() {
    java.lang.Object ref = additionIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      additionIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITION_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object additionText_ = "";
  /**
   * <pre>
   * 已添加时的文案
   * </pre>
   *
   * <code>string addition_text = 2;</code>
   * @return The additionText.
   */
  @java.lang.Override
  public java.lang.String getAdditionText() {
    java.lang.Object ref = additionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      additionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 已添加时的文案
   * </pre>
   *
   * <code>string addition_text = 2;</code>
   * @return The bytes for additionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdditionTextBytes() {
    java.lang.Object ref = additionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      additionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NO_ADDITION_ICON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object noAdditionIcon_ = "";
  /**
   * <pre>
   * no addition icon
   * </pre>
   *
   * <code>string no_addition_icon = 3;</code>
   * @return The noAdditionIcon.
   */
  @java.lang.Override
  public java.lang.String getNoAdditionIcon() {
    java.lang.Object ref = noAdditionIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      noAdditionIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * no addition icon
   * </pre>
   *
   * <code>string no_addition_icon = 3;</code>
   * @return The bytes for noAdditionIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNoAdditionIconBytes() {
    java.lang.Object ref = noAdditionIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      noAdditionIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NO_ADDITION_TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object noAdditionText_ = "";
  /**
   * <pre>
   * 未添加时的文案
   * </pre>
   *
   * <code>string no_addition_text = 4;</code>
   * @return The noAdditionText.
   */
  @java.lang.Override
  public java.lang.String getNoAdditionText() {
    java.lang.Object ref = noAdditionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      noAdditionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 未添加时的文案
   * </pre>
   *
   * <code>string no_addition_text = 4;</code>
   * @return The bytes for noAdditionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNoAdditionTextBytes() {
    java.lang.Object ref = noAdditionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      noAdditionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 5;
  private long id_ = 0L;
  /**
   * <pre>
   * avid
   * </pre>
   *
   * <code>int64 id = 5;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(additionIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, additionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(additionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, additionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noAdditionIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, noAdditionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noAdditionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, noAdditionText_);
    }
    if (id_ != 0L) {
      output.writeInt64(5, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(additionIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, additionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(additionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, additionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noAdditionIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, noAdditionIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noAdditionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, noAdditionText_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, id_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.ThreePointWait)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.ThreePointWait other = (bilibili.app.dynamic.v2.ThreePointWait) obj;

    if (!getAdditionIcon()
        .equals(other.getAdditionIcon())) return false;
    if (!getAdditionText()
        .equals(other.getAdditionText())) return false;
    if (!getNoAdditionIcon()
        .equals(other.getNoAdditionIcon())) return false;
    if (!getNoAdditionText()
        .equals(other.getNoAdditionText())) return false;
    if (getId()
        != other.getId()) return false;
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
    hash = (37 * hash) + ADDITION_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getAdditionIcon().hashCode();
    hash = (37 * hash) + ADDITION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getAdditionText().hashCode();
    hash = (37 * hash) + NO_ADDITION_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getNoAdditionIcon().hashCode();
    hash = (37 * hash) + NO_ADDITION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getNoAdditionText().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ThreePointWait parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.ThreePointWait prototype) {
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
   * 三点-稍后在看
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.ThreePointWait}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ThreePointWait)
      bilibili.app.dynamic.v2.ThreePointWaitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointWait_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointWait_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.ThreePointWait.class, bilibili.app.dynamic.v2.ThreePointWait.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.ThreePointWait.newBuilder()
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
      additionIcon_ = "";
      additionText_ = "";
      noAdditionIcon_ = "";
      noAdditionText_ = "";
      id_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointWait_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ThreePointWait getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.ThreePointWait.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ThreePointWait build() {
      bilibili.app.dynamic.v2.ThreePointWait result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ThreePointWait buildPartial() {
      bilibili.app.dynamic.v2.ThreePointWait result = new bilibili.app.dynamic.v2.ThreePointWait(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.ThreePointWait result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.additionIcon_ = additionIcon_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.additionText_ = additionText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.noAdditionIcon_ = noAdditionIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.noAdditionText_ = noAdditionText_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.id_ = id_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.ThreePointWait) {
        return mergeFrom((bilibili.app.dynamic.v2.ThreePointWait)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.ThreePointWait other) {
      if (other == bilibili.app.dynamic.v2.ThreePointWait.getDefaultInstance()) return this;
      if (!other.getAdditionIcon().isEmpty()) {
        additionIcon_ = other.additionIcon_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAdditionText().isEmpty()) {
        additionText_ = other.additionText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNoAdditionIcon().isEmpty()) {
        noAdditionIcon_ = other.noAdditionIcon_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getNoAdditionText().isEmpty()) {
        noAdditionText_ = other.noAdditionText_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
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
              additionIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              additionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              noAdditionIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              noAdditionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object additionIcon_ = "";
    /**
     * <pre>
     * addition icon
     * </pre>
     *
     * <code>string addition_icon = 1;</code>
     * @return The additionIcon.
     */
    public java.lang.String getAdditionIcon() {
      java.lang.Object ref = additionIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        additionIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * addition icon
     * </pre>
     *
     * <code>string addition_icon = 1;</code>
     * @return The bytes for additionIcon.
     */
    public com.google.protobuf.ByteString
        getAdditionIconBytes() {
      java.lang.Object ref = additionIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        additionIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * addition icon
     * </pre>
     *
     * <code>string addition_icon = 1;</code>
     * @param value The additionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      additionIcon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addition icon
     * </pre>
     *
     * <code>string addition_icon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionIcon() {
      additionIcon_ = getDefaultInstance().getAdditionIcon();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addition icon
     * </pre>
     *
     * <code>string addition_icon = 1;</code>
     * @param value The bytes for additionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      additionIcon_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object additionText_ = "";
    /**
     * <pre>
     * 已添加时的文案
     * </pre>
     *
     * <code>string addition_text = 2;</code>
     * @return The additionText.
     */
    public java.lang.String getAdditionText() {
      java.lang.Object ref = additionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        additionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 已添加时的文案
     * </pre>
     *
     * <code>string addition_text = 2;</code>
     * @return The bytes for additionText.
     */
    public com.google.protobuf.ByteString
        getAdditionTextBytes() {
      java.lang.Object ref = additionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        additionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 已添加时的文案
     * </pre>
     *
     * <code>string addition_text = 2;</code>
     * @param value The additionText to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      additionText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 已添加时的文案
     * </pre>
     *
     * <code>string addition_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionText() {
      additionText_ = getDefaultInstance().getAdditionText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 已添加时的文案
     * </pre>
     *
     * <code>string addition_text = 2;</code>
     * @param value The bytes for additionText to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      additionText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object noAdditionIcon_ = "";
    /**
     * <pre>
     * no addition icon
     * </pre>
     *
     * <code>string no_addition_icon = 3;</code>
     * @return The noAdditionIcon.
     */
    public java.lang.String getNoAdditionIcon() {
      java.lang.Object ref = noAdditionIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        noAdditionIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * no addition icon
     * </pre>
     *
     * <code>string no_addition_icon = 3;</code>
     * @return The bytes for noAdditionIcon.
     */
    public com.google.protobuf.ByteString
        getNoAdditionIconBytes() {
      java.lang.Object ref = noAdditionIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        noAdditionIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * no addition icon
     * </pre>
     *
     * <code>string no_addition_icon = 3;</code>
     * @param value The noAdditionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setNoAdditionIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      noAdditionIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * no addition icon
     * </pre>
     *
     * <code>string no_addition_icon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNoAdditionIcon() {
      noAdditionIcon_ = getDefaultInstance().getNoAdditionIcon();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * no addition icon
     * </pre>
     *
     * <code>string no_addition_icon = 3;</code>
     * @param value The bytes for noAdditionIcon to set.
     * @return This builder for chaining.
     */
    public Builder setNoAdditionIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      noAdditionIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object noAdditionText_ = "";
    /**
     * <pre>
     * 未添加时的文案
     * </pre>
     *
     * <code>string no_addition_text = 4;</code>
     * @return The noAdditionText.
     */
    public java.lang.String getNoAdditionText() {
      java.lang.Object ref = noAdditionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        noAdditionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 未添加时的文案
     * </pre>
     *
     * <code>string no_addition_text = 4;</code>
     * @return The bytes for noAdditionText.
     */
    public com.google.protobuf.ByteString
        getNoAdditionTextBytes() {
      java.lang.Object ref = noAdditionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        noAdditionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 未添加时的文案
     * </pre>
     *
     * <code>string no_addition_text = 4;</code>
     * @param value The noAdditionText to set.
     * @return This builder for chaining.
     */
    public Builder setNoAdditionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      noAdditionText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 未添加时的文案
     * </pre>
     *
     * <code>string no_addition_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNoAdditionText() {
      noAdditionText_ = getDefaultInstance().getNoAdditionText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 未添加时的文案
     * </pre>
     *
     * <code>string no_addition_text = 4;</code>
     * @param value The bytes for noAdditionText to set.
     * @return This builder for chaining.
     */
    public Builder setNoAdditionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      noAdditionText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * avid
     * </pre>
     *
     * <code>int64 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * avid
     * </pre>
     *
     * <code>int64 id = 5;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * avid
     * </pre>
     *
     * <code>int64 id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      id_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ThreePointWait)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ThreePointWait)
  private static final bilibili.app.dynamic.v2.ThreePointWait DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.ThreePointWait();
  }

  public static bilibili.app.dynamic.v2.ThreePointWait getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreePointWait>
      PARSER = new com.google.protobuf.AbstractParser<ThreePointWait>() {
    @java.lang.Override
    public ThreePointWait parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreePointWait> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreePointWait> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.ThreePointWait getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

