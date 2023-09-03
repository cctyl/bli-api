// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.community.service.dm.v1.CheckBox}
 */
public final class CheckBox extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.community.service.dm.v1.CheckBox)
    CheckBoxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckBox.newBuilder() to construct.
  private CheckBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckBox() {
    text_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckBox();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_CheckBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_CheckBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.community.service.dm.v1.CheckBox.class, bilibili.community.service.dm.v1.CheckBox.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.community.service.dm.v1.CheckboxType getType() {
    bilibili.community.service.dm.v1.CheckboxType result = bilibili.community.service.dm.v1.CheckboxType.forNumber(type_);
    return result == null ? bilibili.community.service.dm.v1.CheckboxType.UNRECOGNIZED : result;
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
  private boolean defaultValue_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool default_value = 3;</code>
   * @return The defaultValue.
   */
  @java.lang.Override
  public boolean getDefaultValue() {
    return defaultValue_;
  }

  public static final int SHOW_FIELD_NUMBER = 4;
  private boolean show_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool show = 4;</code>
   * @return The show.
   */
  @java.lang.Override
  public boolean getShow() {
    return show_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (type_ != bilibili.community.service.dm.v1.CheckboxType.CheckboxTypeNone.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (defaultValue_ != false) {
      output.writeBool(3, defaultValue_);
    }
    if (show_ != false) {
      output.writeBool(4, show_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (type_ != bilibili.community.service.dm.v1.CheckboxType.CheckboxTypeNone.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (defaultValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, defaultValue_);
    }
    if (show_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, show_);
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
    if (!(obj instanceof bilibili.community.service.dm.v1.CheckBox)) {
      return super.equals(obj);
    }
    bilibili.community.service.dm.v1.CheckBox other = (bilibili.community.service.dm.v1.CheckBox) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (type_ != other.type_) return false;
    if (getDefaultValue()
        != other.getDefaultValue()) return false;
    if (getShow()
        != other.getShow()) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultValue());
    hash = (37 * hash) + SHOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShow());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.CheckBox parseFrom(
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
  public static Builder newBuilder(bilibili.community.service.dm.v1.CheckBox prototype) {
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
   * Protobuf type {@code bilibili.community.service.dm.v1.CheckBox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.community.service.dm.v1.CheckBox)
      bilibili.community.service.dm.v1.CheckBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_CheckBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_CheckBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.community.service.dm.v1.CheckBox.class, bilibili.community.service.dm.v1.CheckBox.Builder.class);
    }

    // Construct using bilibili.community.service.dm.v1.CheckBox.newBuilder()
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
      text_ = "";
      type_ = 0;
      defaultValue_ = false;
      show_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_CheckBox_descriptor;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.CheckBox getDefaultInstanceForType() {
      return bilibili.community.service.dm.v1.CheckBox.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.CheckBox build() {
      bilibili.community.service.dm.v1.CheckBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.CheckBox buildPartial() {
      bilibili.community.service.dm.v1.CheckBox result = new bilibili.community.service.dm.v1.CheckBox(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.community.service.dm.v1.CheckBox result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultValue_ = defaultValue_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.show_ = show_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.community.service.dm.v1.CheckBox) {
        return mergeFrom((bilibili.community.service.dm.v1.CheckBox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.community.service.dm.v1.CheckBox other) {
      if (other == bilibili.community.service.dm.v1.CheckBox.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getDefaultValue() != false) {
        setDefaultValue(other.getDefaultValue());
      }
      if (other.getShow() != false) {
        setShow(other.getShow());
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
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              defaultValue_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              show_ = input.readBool();
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.community.service.dm.v1.CheckboxType getType() {
      bilibili.community.service.dm.v1.CheckboxType result = bilibili.community.service.dm.v1.CheckboxType.forNumber(type_);
      return result == null ? bilibili.community.service.dm.v1.CheckboxType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.community.service.dm.v1.CheckboxType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.community.service.dm.v1.CheckboxType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean defaultValue_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool default_value = 3;</code>
     * @return The defaultValue.
     */
    @java.lang.Override
    public boolean getDefaultValue() {
      return defaultValue_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool default_value = 3;</code>
     * @param value The defaultValue to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultValue(boolean value) {

      defaultValue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool default_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      defaultValue_ = false;
      onChanged();
      return this;
    }

    private boolean show_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show = 4;</code>
     * @return The show.
     */
    @java.lang.Override
    public boolean getShow() {
      return show_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show = 4;</code>
     * @param value The show to set.
     * @return This builder for chaining.
     */
    public Builder setShow(boolean value) {

      show_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShow() {
      bitField0_ = (bitField0_ & ~0x00000008);
      show_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.community.service.dm.v1.CheckBox)
  }

  // @@protoc_insertion_point(class_scope:bilibili.community.service.dm.v1.CheckBox)
  private static final bilibili.community.service.dm.v1.CheckBox DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.community.service.dm.v1.CheckBox();
  }

  public static bilibili.community.service.dm.v1.CheckBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckBox>
      PARSER = new com.google.protobuf.AbstractParser<CheckBox>() {
    @java.lang.Override
    public CheckBox parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.community.service.dm.v1.CheckBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

