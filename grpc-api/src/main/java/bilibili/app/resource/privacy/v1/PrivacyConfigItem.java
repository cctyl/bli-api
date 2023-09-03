// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/resource/privacy/v1/api.proto

package bilibili.app.resource.privacy.v1;

/**
 * <pre>
 * 隐私设置
 * </pre>
 *
 * Protobuf type {@code bilibili.app.resource.privacy.v1.PrivacyConfigItem}
 */
public final class PrivacyConfigItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.resource.privacy.v1.PrivacyConfigItem)
    PrivacyConfigItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrivacyConfigItem.newBuilder() to construct.
  private PrivacyConfigItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrivacyConfigItem() {
    privacyConfigType_ = 0;
    title_ = "";
    state_ = 0;
    subTitle_ = "";
    subTitleUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrivacyConfigItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.resource.privacy.v1.Api.internal_static_bilibili_app_resource_privacy_v1_PrivacyConfigItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.resource.privacy.v1.Api.internal_static_bilibili_app_resource_privacy_v1_PrivacyConfigItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.resource.privacy.v1.PrivacyConfigItem.class, bilibili.app.resource.privacy.v1.PrivacyConfigItem.Builder.class);
  }

  public static final int PRIVACY_CONFIG_TYPE_FIELD_NUMBER = 1;
  private int privacyConfigType_ = 0;
  /**
   * <pre>
   * 隐私开关类型
   * </pre>
   *
   * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
   * @return The enum numeric value on the wire for privacyConfigType.
   */
  @java.lang.Override public int getPrivacyConfigTypeValue() {
    return privacyConfigType_;
  }
  /**
   * <pre>
   * 隐私开关类型
   * </pre>
   *
   * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
   * @return The privacyConfigType.
   */
  @java.lang.Override public bilibili.app.resource.privacy.v1.PrivacyConfigType getPrivacyConfigType() {
    bilibili.app.resource.privacy.v1.PrivacyConfigType result = bilibili.app.resource.privacy.v1.PrivacyConfigType.forNumber(privacyConfigType_);
    return result == null ? bilibili.app.resource.privacy.v1.PrivacyConfigType.UNRECOGNIZED : result;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_ = 0;
  /**
   * <pre>
   * 隐私开关状态
   * </pre>
   *
   * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * 隐私开关状态
   * </pre>
   *
   * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
   * @return The state.
   */
  @java.lang.Override public bilibili.app.resource.privacy.v1.PrivacyConfigState getState() {
    bilibili.app.resource.privacy.v1.PrivacyConfigState result = bilibili.app.resource.privacy.v1.PrivacyConfigState.forNumber(state_);
    return result == null ? bilibili.app.resource.privacy.v1.PrivacyConfigState.UNRECOGNIZED : result;
  }

  public static final int SUB_TITLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subTitle_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string sub_title = 4;</code>
   * @return The subTitle.
   */
  @java.lang.Override
  public java.lang.String getSubTitle() {
    java.lang.Object ref = subTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string sub_title = 4;</code>
   * @return The bytes for subTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubTitleBytes() {
    java.lang.Object ref = subTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUB_TITLE_URI_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subTitleUri_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string sub_title_uri = 5;</code>
   * @return The subTitleUri.
   */
  @java.lang.Override
  public java.lang.String getSubTitleUri() {
    java.lang.Object ref = subTitleUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subTitleUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string sub_title_uri = 5;</code>
   * @return The bytes for subTitleUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubTitleUriBytes() {
    java.lang.Object ref = subTitleUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subTitleUri_ = b;
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
    if (privacyConfigType_ != bilibili.app.resource.privacy.v1.PrivacyConfigType.none.getNumber()) {
      output.writeEnum(1, privacyConfigType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (state_ != bilibili.app.resource.privacy.v1.PrivacyConfigState.close.getNumber()) {
      output.writeEnum(3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subTitleUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, subTitleUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (privacyConfigType_ != bilibili.app.resource.privacy.v1.PrivacyConfigType.none.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, privacyConfigType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (state_ != bilibili.app.resource.privacy.v1.PrivacyConfigState.close.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subTitleUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, subTitleUri_);
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
    if (!(obj instanceof bilibili.app.resource.privacy.v1.PrivacyConfigItem)) {
      return super.equals(obj);
    }
    bilibili.app.resource.privacy.v1.PrivacyConfigItem other = (bilibili.app.resource.privacy.v1.PrivacyConfigItem) obj;

    if (privacyConfigType_ != other.privacyConfigType_) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (state_ != other.state_) return false;
    if (!getSubTitle()
        .equals(other.getSubTitle())) return false;
    if (!getSubTitleUri()
        .equals(other.getSubTitleUri())) return false;
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
    hash = (37 * hash) + PRIVACY_CONFIG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + privacyConfigType_;
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + SUB_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getSubTitle().hashCode();
    hash = (37 * hash) + SUB_TITLE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getSubTitleUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.resource.privacy.v1.PrivacyConfigItem prototype) {
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
   * 隐私设置
   * </pre>
   *
   * Protobuf type {@code bilibili.app.resource.privacy.v1.PrivacyConfigItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.resource.privacy.v1.PrivacyConfigItem)
      bilibili.app.resource.privacy.v1.PrivacyConfigItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.resource.privacy.v1.Api.internal_static_bilibili_app_resource_privacy_v1_PrivacyConfigItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.resource.privacy.v1.Api.internal_static_bilibili_app_resource_privacy_v1_PrivacyConfigItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.resource.privacy.v1.PrivacyConfigItem.class, bilibili.app.resource.privacy.v1.PrivacyConfigItem.Builder.class);
    }

    // Construct using bilibili.app.resource.privacy.v1.PrivacyConfigItem.newBuilder()
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
      privacyConfigType_ = 0;
      title_ = "";
      state_ = 0;
      subTitle_ = "";
      subTitleUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.resource.privacy.v1.Api.internal_static_bilibili_app_resource_privacy_v1_PrivacyConfigItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.resource.privacy.v1.PrivacyConfigItem getDefaultInstanceForType() {
      return bilibili.app.resource.privacy.v1.PrivacyConfigItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.resource.privacy.v1.PrivacyConfigItem build() {
      bilibili.app.resource.privacy.v1.PrivacyConfigItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.resource.privacy.v1.PrivacyConfigItem buildPartial() {
      bilibili.app.resource.privacy.v1.PrivacyConfigItem result = new bilibili.app.resource.privacy.v1.PrivacyConfigItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.resource.privacy.v1.PrivacyConfigItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privacyConfigType_ = privacyConfigType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subTitle_ = subTitle_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.subTitleUri_ = subTitleUri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.resource.privacy.v1.PrivacyConfigItem) {
        return mergeFrom((bilibili.app.resource.privacy.v1.PrivacyConfigItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.resource.privacy.v1.PrivacyConfigItem other) {
      if (other == bilibili.app.resource.privacy.v1.PrivacyConfigItem.getDefaultInstance()) return this;
      if (other.privacyConfigType_ != 0) {
        setPrivacyConfigTypeValue(other.getPrivacyConfigTypeValue());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getSubTitle().isEmpty()) {
        subTitle_ = other.subTitle_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSubTitleUri().isEmpty()) {
        subTitleUri_ = other.subTitleUri_;
        bitField0_ |= 0x00000010;
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
              privacyConfigType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              subTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              subTitleUri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int privacyConfigType_ = 0;
    /**
     * <pre>
     * 隐私开关类型
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
     * @return The enum numeric value on the wire for privacyConfigType.
     */
    @java.lang.Override public int getPrivacyConfigTypeValue() {
      return privacyConfigType_;
    }
    /**
     * <pre>
     * 隐私开关类型
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
     * @param value The enum numeric value on the wire for privacyConfigType to set.
     * @return This builder for chaining.
     */
    public Builder setPrivacyConfigTypeValue(int value) {
      privacyConfigType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 隐私开关类型
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
     * @return The privacyConfigType.
     */
    @java.lang.Override
    public bilibili.app.resource.privacy.v1.PrivacyConfigType getPrivacyConfigType() {
      bilibili.app.resource.privacy.v1.PrivacyConfigType result = bilibili.app.resource.privacy.v1.PrivacyConfigType.forNumber(privacyConfigType_);
      return result == null ? bilibili.app.resource.privacy.v1.PrivacyConfigType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 隐私开关类型
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
     * @param value The privacyConfigType to set.
     * @return This builder for chaining.
     */
    public Builder setPrivacyConfigType(bilibili.app.resource.privacy.v1.PrivacyConfigType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      privacyConfigType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 隐私开关类型
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigType privacy_config_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivacyConfigType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      privacyConfigType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * 隐私开关状态
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * 隐私开关状态
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 隐私开关状态
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
     * @return The state.
     */
    @java.lang.Override
    public bilibili.app.resource.privacy.v1.PrivacyConfigState getState() {
      bilibili.app.resource.privacy.v1.PrivacyConfigState result = bilibili.app.resource.privacy.v1.PrivacyConfigState.forNumber(state_);
      return result == null ? bilibili.app.resource.privacy.v1.PrivacyConfigState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 隐私开关状态
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(bilibili.app.resource.privacy.v1.PrivacyConfigState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 隐私开关状态
     * </pre>
     *
     * <code>.bilibili.app.resource.privacy.v1.PrivacyConfigState state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object subTitle_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title = 4;</code>
     * @return The subTitle.
     */
    public java.lang.String getSubTitle() {
      java.lang.Object ref = subTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title = 4;</code>
     * @return The bytes for subTitle.
     */
    public com.google.protobuf.ByteString
        getSubTitleBytes() {
      java.lang.Object ref = subTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title = 4;</code>
     * @param value The subTitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subTitle_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubTitle() {
      subTitle_ = getDefaultInstance().getSubTitle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title = 4;</code>
     * @param value The bytes for subTitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subTitle_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object subTitleUri_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title_uri = 5;</code>
     * @return The subTitleUri.
     */
    public java.lang.String getSubTitleUri() {
      java.lang.Object ref = subTitleUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subTitleUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title_uri = 5;</code>
     * @return The bytes for subTitleUri.
     */
    public com.google.protobuf.ByteString
        getSubTitleUriBytes() {
      java.lang.Object ref = subTitleUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subTitleUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title_uri = 5;</code>
     * @param value The subTitleUri to set.
     * @return This builder for chaining.
     */
    public Builder setSubTitleUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subTitleUri_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title_uri = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubTitleUri() {
      subTitleUri_ = getDefaultInstance().getSubTitleUri();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string sub_title_uri = 5;</code>
     * @param value The bytes for subTitleUri to set.
     * @return This builder for chaining.
     */
    public Builder setSubTitleUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subTitleUri_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.resource.privacy.v1.PrivacyConfigItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.resource.privacy.v1.PrivacyConfigItem)
  private static final bilibili.app.resource.privacy.v1.PrivacyConfigItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.resource.privacy.v1.PrivacyConfigItem();
  }

  public static bilibili.app.resource.privacy.v1.PrivacyConfigItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivacyConfigItem>
      PARSER = new com.google.protobuf.AbstractParser<PrivacyConfigItem>() {
    @java.lang.Override
    public PrivacyConfigItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrivacyConfigItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivacyConfigItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.resource.privacy.v1.PrivacyConfigItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

