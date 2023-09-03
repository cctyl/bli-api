// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.playurl.v1.CloudConf}
 */
public final class CloudConf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.playurl.v1.CloudConf)
    CloudConfOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudConf.newBuilder() to construct.
  private CloudConf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudConf() {
    confType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudConf();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_CloudConf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_CloudConf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.playurl.v1.CloudConf.class, bilibili.app.playurl.v1.CloudConf.Builder.class);
  }

  public static final int SHOW_FIELD_NUMBER = 1;
  private boolean show_ = false;
  /**
   * <pre>
   * 是否展示功能
   * </pre>
   *
   * <code>bool show = 1;</code>
   * @return The show.
   */
  @java.lang.Override
  public boolean getShow() {
    return show_;
  }

  public static final int CONF_TYPE_FIELD_NUMBER = 2;
  private int confType_ = 0;
  /**
   * <pre>
   * 设置类型
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
   * @return The enum numeric value on the wire for confType.
   */
  @java.lang.Override public int getConfTypeValue() {
    return confType_;
  }
  /**
   * <pre>
   * 设置类型
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
   * @return The confType.
   */
  @java.lang.Override public bilibili.app.playurl.v1.ConfType getConfType() {
    bilibili.app.playurl.v1.ConfType result = bilibili.app.playurl.v1.ConfType.forNumber(confType_);
    return result == null ? bilibili.app.playurl.v1.ConfType.UNRECOGNIZED : result;
  }

  public static final int FIELD_VALUE_FIELD_NUMBER = 3;
  private bilibili.app.playurl.v1.FieldValue fieldValue_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
   * @return Whether the fieldValue field is set.
   */
  @java.lang.Override
  public boolean hasFieldValue() {
    return fieldValue_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
   * @return The fieldValue.
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.FieldValue getFieldValue() {
    return fieldValue_ == null ? bilibili.app.playurl.v1.FieldValue.getDefaultInstance() : fieldValue_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.FieldValueOrBuilder getFieldValueOrBuilder() {
    return fieldValue_ == null ? bilibili.app.playurl.v1.FieldValue.getDefaultInstance() : fieldValue_;
  }

  public static final int CONF_VALUE_FIELD_NUMBER = 4;
  private bilibili.app.playurl.v1.ConfValue confValue_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
   * @return Whether the confValue field is set.
   */
  @java.lang.Override
  public boolean hasConfValue() {
    return confValue_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
   * @return The confValue.
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.ConfValue getConfValue() {
    return confValue_ == null ? bilibili.app.playurl.v1.ConfValue.getDefaultInstance() : confValue_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.playurl.v1.ConfValueOrBuilder getConfValueOrBuilder() {
    return confValue_ == null ? bilibili.app.playurl.v1.ConfValue.getDefaultInstance() : confValue_;
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
    if (show_ != false) {
      output.writeBool(1, show_);
    }
    if (confType_ != bilibili.app.playurl.v1.ConfType.NoType.getNumber()) {
      output.writeEnum(2, confType_);
    }
    if (fieldValue_ != null) {
      output.writeMessage(3, getFieldValue());
    }
    if (confValue_ != null) {
      output.writeMessage(4, getConfValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (show_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, show_);
    }
    if (confType_ != bilibili.app.playurl.v1.ConfType.NoType.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, confType_);
    }
    if (fieldValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFieldValue());
    }
    if (confValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getConfValue());
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
    if (!(obj instanceof bilibili.app.playurl.v1.CloudConf)) {
      return super.equals(obj);
    }
    bilibili.app.playurl.v1.CloudConf other = (bilibili.app.playurl.v1.CloudConf) obj;

    if (getShow()
        != other.getShow()) return false;
    if (confType_ != other.confType_) return false;
    if (hasFieldValue() != other.hasFieldValue()) return false;
    if (hasFieldValue()) {
      if (!getFieldValue()
          .equals(other.getFieldValue())) return false;
    }
    if (hasConfValue() != other.hasConfValue()) return false;
    if (hasConfValue()) {
      if (!getConfValue()
          .equals(other.getConfValue())) return false;
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
    hash = (37 * hash) + SHOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShow());
    hash = (37 * hash) + CONF_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + confType_;
    if (hasFieldValue()) {
      hash = (37 * hash) + FIELD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFieldValue().hashCode();
    }
    if (hasConfValue()) {
      hash = (37 * hash) + CONF_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getConfValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.CloudConf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.CloudConf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.playurl.v1.CloudConf parseFrom(
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
  public static Builder newBuilder(bilibili.app.playurl.v1.CloudConf prototype) {
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
   * Protobuf type {@code bilibili.app.playurl.v1.CloudConf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.playurl.v1.CloudConf)
      bilibili.app.playurl.v1.CloudConfOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_CloudConf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_CloudConf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.playurl.v1.CloudConf.class, bilibili.app.playurl.v1.CloudConf.Builder.class);
    }

    // Construct using bilibili.app.playurl.v1.CloudConf.newBuilder()
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
      show_ = false;
      confType_ = 0;
      fieldValue_ = null;
      if (fieldValueBuilder_ != null) {
        fieldValueBuilder_.dispose();
        fieldValueBuilder_ = null;
      }
      confValue_ = null;
      if (confValueBuilder_ != null) {
        confValueBuilder_.dispose();
        confValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.playurl.v1.Playurl.internal_static_bilibili_app_playurl_v1_CloudConf_descriptor;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.CloudConf getDefaultInstanceForType() {
      return bilibili.app.playurl.v1.CloudConf.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.CloudConf build() {
      bilibili.app.playurl.v1.CloudConf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.playurl.v1.CloudConf buildPartial() {
      bilibili.app.playurl.v1.CloudConf result = new bilibili.app.playurl.v1.CloudConf(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.playurl.v1.CloudConf result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.show_ = show_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.confType_ = confType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldValue_ = fieldValueBuilder_ == null
            ? fieldValue_
            : fieldValueBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.confValue_ = confValueBuilder_ == null
            ? confValue_
            : confValueBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.playurl.v1.CloudConf) {
        return mergeFrom((bilibili.app.playurl.v1.CloudConf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.playurl.v1.CloudConf other) {
      if (other == bilibili.app.playurl.v1.CloudConf.getDefaultInstance()) return this;
      if (other.getShow() != false) {
        setShow(other.getShow());
      }
      if (other.confType_ != 0) {
        setConfTypeValue(other.getConfTypeValue());
      }
      if (other.hasFieldValue()) {
        mergeFieldValue(other.getFieldValue());
      }
      if (other.hasConfValue()) {
        mergeConfValue(other.getConfValue());
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
              show_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              confType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getFieldValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getConfValueFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private boolean show_ ;
    /**
     * <pre>
     * 是否展示功能
     * </pre>
     *
     * <code>bool show = 1;</code>
     * @return The show.
     */
    @java.lang.Override
    public boolean getShow() {
      return show_;
    }
    /**
     * <pre>
     * 是否展示功能
     * </pre>
     *
     * <code>bool show = 1;</code>
     * @param value The show to set.
     * @return This builder for chaining.
     */
    public Builder setShow(boolean value) {

      show_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否展示功能
     * </pre>
     *
     * <code>bool show = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      show_ = false;
      onChanged();
      return this;
    }

    private int confType_ = 0;
    /**
     * <pre>
     * 设置类型
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
     * @return The enum numeric value on the wire for confType.
     */
    @java.lang.Override public int getConfTypeValue() {
      return confType_;
    }
    /**
     * <pre>
     * 设置类型
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
     * @param value The enum numeric value on the wire for confType to set.
     * @return This builder for chaining.
     */
    public Builder setConfTypeValue(int value) {
      confType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设置类型
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
     * @return The confType.
     */
    @java.lang.Override
    public bilibili.app.playurl.v1.ConfType getConfType() {
      bilibili.app.playurl.v1.ConfType result = bilibili.app.playurl.v1.ConfType.forNumber(confType_);
      return result == null ? bilibili.app.playurl.v1.ConfType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 设置类型
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
     * @param value The confType to set.
     * @return This builder for chaining.
     */
    public Builder setConfType(bilibili.app.playurl.v1.ConfType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      confType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设置类型
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfType conf_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      confType_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.playurl.v1.FieldValue fieldValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.FieldValue, bilibili.app.playurl.v1.FieldValue.Builder, bilibili.app.playurl.v1.FieldValueOrBuilder> fieldValueBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     * @return Whether the fieldValue field is set.
     */
    public boolean hasFieldValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     * @return The fieldValue.
     */
    public bilibili.app.playurl.v1.FieldValue getFieldValue() {
      if (fieldValueBuilder_ == null) {
        return fieldValue_ == null ? bilibili.app.playurl.v1.FieldValue.getDefaultInstance() : fieldValue_;
      } else {
        return fieldValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public Builder setFieldValue(bilibili.app.playurl.v1.FieldValue value) {
      if (fieldValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldValue_ = value;
      } else {
        fieldValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public Builder setFieldValue(
        bilibili.app.playurl.v1.FieldValue.Builder builderForValue) {
      if (fieldValueBuilder_ == null) {
        fieldValue_ = builderForValue.build();
      } else {
        fieldValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public Builder mergeFieldValue(bilibili.app.playurl.v1.FieldValue value) {
      if (fieldValueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          fieldValue_ != null &&
          fieldValue_ != bilibili.app.playurl.v1.FieldValue.getDefaultInstance()) {
          getFieldValueBuilder().mergeFrom(value);
        } else {
          fieldValue_ = value;
        }
      } else {
        fieldValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public Builder clearFieldValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fieldValue_ = null;
      if (fieldValueBuilder_ != null) {
        fieldValueBuilder_.dispose();
        fieldValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public bilibili.app.playurl.v1.FieldValue.Builder getFieldValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFieldValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    public bilibili.app.playurl.v1.FieldValueOrBuilder getFieldValueOrBuilder() {
      if (fieldValueBuilder_ != null) {
        return fieldValueBuilder_.getMessageOrBuilder();
      } else {
        return fieldValue_ == null ?
            bilibili.app.playurl.v1.FieldValue.getDefaultInstance() : fieldValue_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.FieldValue field_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.FieldValue, bilibili.app.playurl.v1.FieldValue.Builder, bilibili.app.playurl.v1.FieldValueOrBuilder> 
        getFieldValueFieldBuilder() {
      if (fieldValueBuilder_ == null) {
        fieldValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.playurl.v1.FieldValue, bilibili.app.playurl.v1.FieldValue.Builder, bilibili.app.playurl.v1.FieldValueOrBuilder>(
                getFieldValue(),
                getParentForChildren(),
                isClean());
        fieldValue_ = null;
      }
      return fieldValueBuilder_;
    }

    private bilibili.app.playurl.v1.ConfValue confValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.ConfValue, bilibili.app.playurl.v1.ConfValue.Builder, bilibili.app.playurl.v1.ConfValueOrBuilder> confValueBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     * @return Whether the confValue field is set.
     */
    public boolean hasConfValue() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     * @return The confValue.
     */
    public bilibili.app.playurl.v1.ConfValue getConfValue() {
      if (confValueBuilder_ == null) {
        return confValue_ == null ? bilibili.app.playurl.v1.ConfValue.getDefaultInstance() : confValue_;
      } else {
        return confValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public Builder setConfValue(bilibili.app.playurl.v1.ConfValue value) {
      if (confValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        confValue_ = value;
      } else {
        confValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public Builder setConfValue(
        bilibili.app.playurl.v1.ConfValue.Builder builderForValue) {
      if (confValueBuilder_ == null) {
        confValue_ = builderForValue.build();
      } else {
        confValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public Builder mergeConfValue(bilibili.app.playurl.v1.ConfValue value) {
      if (confValueBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          confValue_ != null &&
          confValue_ != bilibili.app.playurl.v1.ConfValue.getDefaultInstance()) {
          getConfValueBuilder().mergeFrom(value);
        } else {
          confValue_ = value;
        }
      } else {
        confValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public Builder clearConfValue() {
      bitField0_ = (bitField0_ & ~0x00000008);
      confValue_ = null;
      if (confValueBuilder_ != null) {
        confValueBuilder_.dispose();
        confValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public bilibili.app.playurl.v1.ConfValue.Builder getConfValueBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getConfValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    public bilibili.app.playurl.v1.ConfValueOrBuilder getConfValueOrBuilder() {
      if (confValueBuilder_ != null) {
        return confValueBuilder_.getMessageOrBuilder();
      } else {
        return confValue_ == null ?
            bilibili.app.playurl.v1.ConfValue.getDefaultInstance() : confValue_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.playurl.v1.ConfValue conf_value = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.playurl.v1.ConfValue, bilibili.app.playurl.v1.ConfValue.Builder, bilibili.app.playurl.v1.ConfValueOrBuilder> 
        getConfValueFieldBuilder() {
      if (confValueBuilder_ == null) {
        confValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.playurl.v1.ConfValue, bilibili.app.playurl.v1.ConfValue.Builder, bilibili.app.playurl.v1.ConfValueOrBuilder>(
                getConfValue(),
                getParentForChildren(),
                isClean());
        confValue_ = null;
      }
      return confValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.playurl.v1.CloudConf)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.playurl.v1.CloudConf)
  private static final bilibili.app.playurl.v1.CloudConf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.playurl.v1.CloudConf();
  }

  public static bilibili.app.playurl.v1.CloudConf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudConf>
      PARSER = new com.google.protobuf.AbstractParser<CloudConf>() {
    @java.lang.Override
    public CloudConf parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudConf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudConf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.playurl.v1.CloudConf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
