// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 大会员信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.VipInfo}
 */
public final class VipInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.VipInfo)
    VipInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VipInfo.newBuilder() to construct.
  private VipInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VipInfo() {
    nicknameColor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VipInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_VipInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_VipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.VipInfo.class, bilibili.app.dynamic.v2.VipInfo.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * 大会员类型
   * </pre>
   *
   * <code>int32 Type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_ = 0;
  /**
   * <pre>
   * 大会员状态
   * </pre>
   *
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int DUE_DATE_FIELD_NUMBER = 3;
  private long dueDate_ = 0L;
  /**
   * <pre>
   * 到期时间
   * </pre>
   *
   * <code>int64 due_date = 3;</code>
   * @return The dueDate.
   */
  @java.lang.Override
  public long getDueDate() {
    return dueDate_;
  }

  public static final int LABEL_FIELD_NUMBER = 4;
  private bilibili.app.dynamic.v2.VipLabel label_;
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
   * @return Whether the label field is set.
   */
  @java.lang.Override
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
   * @return The label.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.VipLabel getLabel() {
    return label_ == null ? bilibili.app.dynamic.v2.VipLabel.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.VipLabelOrBuilder getLabelOrBuilder() {
    return label_ == null ? bilibili.app.dynamic.v2.VipLabel.getDefaultInstance() : label_;
  }

  public static final int THEME_TYPE_FIELD_NUMBER = 5;
  private int themeType_ = 0;
  /**
   * <pre>
   * 主题
   * </pre>
   *
   * <code>int32 theme_type = 5;</code>
   * @return The themeType.
   */
  @java.lang.Override
  public int getThemeType() {
    return themeType_;
  }

  public static final int AVATAR_SUBSCRIPT_FIELD_NUMBER = 6;
  private int avatarSubscript_ = 0;
  /**
   * <pre>
   * 大会员角标
   * 0:无角标 1:粉色大会员角标 2:绿色小会员角标
   * </pre>
   *
   * <code>int32 avatar_subscript = 6;</code>
   * @return The avatarSubscript.
   */
  @java.lang.Override
  public int getAvatarSubscript() {
    return avatarSubscript_;
  }

  public static final int NICKNAME_COLOR_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nicknameColor_ = "";
  /**
   * <pre>
   * 昵称色值，可能为空，色值示例：#FFFB9E60
   * </pre>
   *
   * <code>string nickname_color = 7;</code>
   * @return The nicknameColor.
   */
  @java.lang.Override
  public java.lang.String getNicknameColor() {
    java.lang.Object ref = nicknameColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nicknameColor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 昵称色值，可能为空，色值示例：#FFFB9E60
   * </pre>
   *
   * <code>string nickname_color = 7;</code>
   * @return The bytes for nicknameColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNicknameColorBytes() {
    java.lang.Object ref = nicknameColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nicknameColor_ = b;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (status_ != 0) {
      output.writeInt32(2, status_);
    }
    if (dueDate_ != 0L) {
      output.writeInt64(3, dueDate_);
    }
    if (label_ != null) {
      output.writeMessage(4, getLabel());
    }
    if (themeType_ != 0) {
      output.writeInt32(5, themeType_);
    }
    if (avatarSubscript_ != 0) {
      output.writeInt32(6, avatarSubscript_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nicknameColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, nicknameColor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, status_);
    }
    if (dueDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dueDate_);
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLabel());
    }
    if (themeType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, themeType_);
    }
    if (avatarSubscript_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, avatarSubscript_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nicknameColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, nicknameColor_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.VipInfo)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.VipInfo other = (bilibili.app.dynamic.v2.VipInfo) obj;

    if (getType()
        != other.getType()) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (getDueDate()
        != other.getDueDate()) return false;
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
    }
    if (getThemeType()
        != other.getThemeType()) return false;
    if (getAvatarSubscript()
        != other.getAvatarSubscript()) return false;
    if (!getNicknameColor()
        .equals(other.getNicknameColor())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + DUE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDueDate());
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (37 * hash) + THEME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getThemeType();
    hash = (37 * hash) + AVATAR_SUBSCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getAvatarSubscript();
    hash = (37 * hash) + NICKNAME_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getNicknameColor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.VipInfo parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.VipInfo prototype) {
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
   * 大会员信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.VipInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.VipInfo)
      bilibili.app.dynamic.v2.VipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_VipInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_VipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.VipInfo.class, bilibili.app.dynamic.v2.VipInfo.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.VipInfo.newBuilder()
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
      type_ = 0;
      status_ = 0;
      dueDate_ = 0L;
      label_ = null;
      if (labelBuilder_ != null) {
        labelBuilder_.dispose();
        labelBuilder_ = null;
      }
      themeType_ = 0;
      avatarSubscript_ = 0;
      nicknameColor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_VipInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.VipInfo getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.VipInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.VipInfo build() {
      bilibili.app.dynamic.v2.VipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.VipInfo buildPartial() {
      bilibili.app.dynamic.v2.VipInfo result = new bilibili.app.dynamic.v2.VipInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.VipInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dueDate_ = dueDate_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.label_ = labelBuilder_ == null
            ? label_
            : labelBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.themeType_ = themeType_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.avatarSubscript_ = avatarSubscript_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.nicknameColor_ = nicknameColor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.VipInfo) {
        return mergeFrom((bilibili.app.dynamic.v2.VipInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.VipInfo other) {
      if (other == bilibili.app.dynamic.v2.VipInfo.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.getDueDate() != 0L) {
        setDueDate(other.getDueDate());
      }
      if (other.hasLabel()) {
        mergeLabel(other.getLabel());
      }
      if (other.getThemeType() != 0) {
        setThemeType(other.getThemeType());
      }
      if (other.getAvatarSubscript() != 0) {
        setAvatarSubscript(other.getAvatarSubscript());
      }
      if (!other.getNicknameColor().isEmpty()) {
        nicknameColor_ = other.nicknameColor_;
        bitField0_ |= 0x00000040;
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
              type_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              status_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              dueDate_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              themeType_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              avatarSubscript_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              nicknameColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private int type_ ;
    /**
     * <pre>
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {

      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      onChanged();
      return this;
    }

    private long dueDate_ ;
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @return The dueDate.
     */
    @java.lang.Override
    public long getDueDate() {
      return dueDate_;
    }
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @param value The dueDate to set.
     * @return This builder for chaining.
     */
    public Builder setDueDate(long value) {

      dueDate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDueDate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dueDate_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v2.VipLabel label_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.VipLabel, bilibili.app.dynamic.v2.VipLabel.Builder, bilibili.app.dynamic.v2.VipLabelOrBuilder> labelBuilder_;
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     * @return Whether the label field is set.
     */
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     * @return The label.
     */
    public bilibili.app.dynamic.v2.VipLabel getLabel() {
      if (labelBuilder_ == null) {
        return label_ == null ? bilibili.app.dynamic.v2.VipLabel.getDefaultInstance() : label_;
      } else {
        return labelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public Builder setLabel(bilibili.app.dynamic.v2.VipLabel value) {
      if (labelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
      } else {
        labelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public Builder setLabel(
        bilibili.app.dynamic.v2.VipLabel.Builder builderForValue) {
      if (labelBuilder_ == null) {
        label_ = builderForValue.build();
      } else {
        labelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public Builder mergeLabel(bilibili.app.dynamic.v2.VipLabel value) {
      if (labelBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          label_ != null &&
          label_ != bilibili.app.dynamic.v2.VipLabel.getDefaultInstance()) {
          getLabelBuilder().mergeFrom(value);
        } else {
          label_ = value;
        }
      } else {
        labelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public Builder clearLabel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      label_ = null;
      if (labelBuilder_ != null) {
        labelBuilder_.dispose();
        labelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public bilibili.app.dynamic.v2.VipLabel.Builder getLabelBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    public bilibili.app.dynamic.v2.VipLabelOrBuilder getLabelOrBuilder() {
      if (labelBuilder_ != null) {
        return labelBuilder_.getMessageOrBuilder();
      } else {
        return label_ == null ?
            bilibili.app.dynamic.v2.VipLabel.getDefaultInstance() : label_;
      }
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.VipLabel label = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.VipLabel, bilibili.app.dynamic.v2.VipLabel.Builder, bilibili.app.dynamic.v2.VipLabelOrBuilder> 
        getLabelFieldBuilder() {
      if (labelBuilder_ == null) {
        labelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.VipLabel, bilibili.app.dynamic.v2.VipLabel.Builder, bilibili.app.dynamic.v2.VipLabelOrBuilder>(
                getLabel(),
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      return labelBuilder_;
    }

    private int themeType_ ;
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @return The themeType.
     */
    @java.lang.Override
    public int getThemeType() {
      return themeType_;
    }
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @param value The themeType to set.
     * @return This builder for chaining.
     */
    public Builder setThemeType(int value) {

      themeType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearThemeType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      themeType_ = 0;
      onChanged();
      return this;
    }

    private int avatarSubscript_ ;
    /**
     * <pre>
     * 大会员角标
     * 0:无角标 1:粉色大会员角标 2:绿色小会员角标
     * </pre>
     *
     * <code>int32 avatar_subscript = 6;</code>
     * @return The avatarSubscript.
     */
    @java.lang.Override
    public int getAvatarSubscript() {
      return avatarSubscript_;
    }
    /**
     * <pre>
     * 大会员角标
     * 0:无角标 1:粉色大会员角标 2:绿色小会员角标
     * </pre>
     *
     * <code>int32 avatar_subscript = 6;</code>
     * @param value The avatarSubscript to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarSubscript(int value) {

      avatarSubscript_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 大会员角标
     * 0:无角标 1:粉色大会员角标 2:绿色小会员角标
     * </pre>
     *
     * <code>int32 avatar_subscript = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarSubscript() {
      bitField0_ = (bitField0_ & ~0x00000020);
      avatarSubscript_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nicknameColor_ = "";
    /**
     * <pre>
     * 昵称色值，可能为空，色值示例：#FFFB9E60
     * </pre>
     *
     * <code>string nickname_color = 7;</code>
     * @return The nicknameColor.
     */
    public java.lang.String getNicknameColor() {
      java.lang.Object ref = nicknameColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nicknameColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 昵称色值，可能为空，色值示例：#FFFB9E60
     * </pre>
     *
     * <code>string nickname_color = 7;</code>
     * @return The bytes for nicknameColor.
     */
    public com.google.protobuf.ByteString
        getNicknameColorBytes() {
      java.lang.Object ref = nicknameColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nicknameColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 昵称色值，可能为空，色值示例：#FFFB9E60
     * </pre>
     *
     * <code>string nickname_color = 7;</code>
     * @param value The nicknameColor to set.
     * @return This builder for chaining.
     */
    public Builder setNicknameColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nicknameColor_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 昵称色值，可能为空，色值示例：#FFFB9E60
     * </pre>
     *
     * <code>string nickname_color = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNicknameColor() {
      nicknameColor_ = getDefaultInstance().getNicknameColor();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 昵称色值，可能为空，色值示例：#FFFB9E60
     * </pre>
     *
     * <code>string nickname_color = 7;</code>
     * @param value The bytes for nicknameColor to set.
     * @return This builder for chaining.
     */
    public Builder setNicknameColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nicknameColor_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.VipInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.VipInfo)
  private static final bilibili.app.dynamic.v2.VipInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.VipInfo();
  }

  public static bilibili.app.dynamic.v2.VipInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VipInfo>
      PARSER = new com.google.protobuf.AbstractParser<VipInfo>() {
    @java.lang.Override
    public VipInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VipInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VipInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.VipInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

