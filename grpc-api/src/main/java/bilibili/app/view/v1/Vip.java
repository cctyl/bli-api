// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 会员信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.Vip}
 */
public final class Vip extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.Vip)
    VipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vip.newBuilder() to construct.
  private Vip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vip() {
    dueRemark_ = "";
    vipStatusWarn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Vip();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_Vip_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_Vip_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.Vip.class, bilibili.app.view.v1.Vip.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   *会员类型
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int DUE_DATE_FIELD_NUMBER = 2;
  private long dueDate_ = 0L;
  /**
   * <pre>
   *到期时间
   * </pre>
   *
   * <code>int64 due_date = 2;</code>
   * @return The dueDate.
   */
  @java.lang.Override
  public long getDueDate() {
    return dueDate_;
  }

  public static final int DUE_REMARK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dueRemark_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string due_remark = 3;</code>
   * @return The dueRemark.
   */
  @java.lang.Override
  public java.lang.String getDueRemark() {
    java.lang.Object ref = dueRemark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dueRemark_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string due_remark = 3;</code>
   * @return The bytes for dueRemark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDueRemarkBytes() {
    java.lang.Object ref = dueRemark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dueRemark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_STATUS_FIELD_NUMBER = 4;
  private int accessStatus_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 access_status = 4;</code>
   * @return The accessStatus.
   */
  @java.lang.Override
  public int getAccessStatus() {
    return accessStatus_;
  }

  public static final int VIP_STATUS_FIELD_NUMBER = 5;
  private int vipStatus_ = 0;
  /**
   * <pre>
   *会员状态
   * </pre>
   *
   * <code>int32 vip_status = 5;</code>
   * @return The vipStatus.
   */
  @java.lang.Override
  public int getVipStatus() {
    return vipStatus_;
  }

  public static final int VIP_STATUS_WARN_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vipStatusWarn_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_status_warn = 6;</code>
   * @return The vipStatusWarn.
   */
  @java.lang.Override
  public java.lang.String getVipStatusWarn() {
    java.lang.Object ref = vipStatusWarn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vipStatusWarn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_status_warn = 6;</code>
   * @return The bytes for vipStatusWarn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVipStatusWarnBytes() {
    java.lang.Object ref = vipStatusWarn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vipStatusWarn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THEME_TYPE_FIELD_NUMBER = 7;
  private int themeType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 theme_type = 7;</code>
   * @return The themeType.
   */
  @java.lang.Override
  public int getThemeType() {
    return themeType_;
  }

  public static final int LABEL_FIELD_NUMBER = 8;
  private bilibili.app.view.v1.VipLabel label_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
   * @return Whether the label field is set.
   */
  @java.lang.Override
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
   * @return The label.
   */
  @java.lang.Override
  public bilibili.app.view.v1.VipLabel getLabel() {
    return label_ == null ? bilibili.app.view.v1.VipLabel.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.VipLabelOrBuilder getLabelOrBuilder() {
    return label_ == null ? bilibili.app.view.v1.VipLabel.getDefaultInstance() : label_;
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
    if (dueDate_ != 0L) {
      output.writeInt64(2, dueDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dueRemark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dueRemark_);
    }
    if (accessStatus_ != 0) {
      output.writeInt32(4, accessStatus_);
    }
    if (vipStatus_ != 0) {
      output.writeInt32(5, vipStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vipStatusWarn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, vipStatusWarn_);
    }
    if (themeType_ != 0) {
      output.writeInt32(7, themeType_);
    }
    if (label_ != null) {
      output.writeMessage(8, getLabel());
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
    if (dueDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, dueDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dueRemark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dueRemark_);
    }
    if (accessStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, accessStatus_);
    }
    if (vipStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, vipStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vipStatusWarn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, vipStatusWarn_);
    }
    if (themeType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, themeType_);
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getLabel());
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
    if (!(obj instanceof bilibili.app.view.v1.Vip)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.Vip other = (bilibili.app.view.v1.Vip) obj;

    if (getType()
        != other.getType()) return false;
    if (getDueDate()
        != other.getDueDate()) return false;
    if (!getDueRemark()
        .equals(other.getDueRemark())) return false;
    if (getAccessStatus()
        != other.getAccessStatus()) return false;
    if (getVipStatus()
        != other.getVipStatus()) return false;
    if (!getVipStatusWarn()
        .equals(other.getVipStatusWarn())) return false;
    if (getThemeType()
        != other.getThemeType()) return false;
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + DUE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDueDate());
    hash = (37 * hash) + DUE_REMARK_FIELD_NUMBER;
    hash = (53 * hash) + getDueRemark().hashCode();
    hash = (37 * hash) + ACCESS_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getAccessStatus();
    hash = (37 * hash) + VIP_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getVipStatus();
    hash = (37 * hash) + VIP_STATUS_WARN_FIELD_NUMBER;
    hash = (53 * hash) + getVipStatusWarn().hashCode();
    hash = (37 * hash) + THEME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getThemeType();
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.Vip parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.Vip parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.Vip parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.Vip parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.Vip parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.Vip parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.Vip prototype) {
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
   * 会员信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.Vip}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.Vip)
      bilibili.app.view.v1.VipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_Vip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_Vip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.Vip.class, bilibili.app.view.v1.Vip.Builder.class);
    }

    // Construct using bilibili.app.view.v1.Vip.newBuilder()
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
      dueDate_ = 0L;
      dueRemark_ = "";
      accessStatus_ = 0;
      vipStatus_ = 0;
      vipStatusWarn_ = "";
      themeType_ = 0;
      label_ = null;
      if (labelBuilder_ != null) {
        labelBuilder_.dispose();
        labelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_Vip_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.Vip getDefaultInstanceForType() {
      return bilibili.app.view.v1.Vip.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.Vip build() {
      bilibili.app.view.v1.Vip result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.Vip buildPartial() {
      bilibili.app.view.v1.Vip result = new bilibili.app.view.v1.Vip(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.Vip result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dueDate_ = dueDate_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dueRemark_ = dueRemark_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.accessStatus_ = accessStatus_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.vipStatus_ = vipStatus_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.vipStatusWarn_ = vipStatusWarn_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.themeType_ = themeType_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.label_ = labelBuilder_ == null
            ? label_
            : labelBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.Vip) {
        return mergeFrom((bilibili.app.view.v1.Vip)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.Vip other) {
      if (other == bilibili.app.view.v1.Vip.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getDueDate() != 0L) {
        setDueDate(other.getDueDate());
      }
      if (!other.getDueRemark().isEmpty()) {
        dueRemark_ = other.dueRemark_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getAccessStatus() != 0) {
        setAccessStatus(other.getAccessStatus());
      }
      if (other.getVipStatus() != 0) {
        setVipStatus(other.getVipStatus());
      }
      if (!other.getVipStatusWarn().isEmpty()) {
        vipStatusWarn_ = other.vipStatusWarn_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (other.getThemeType() != 0) {
        setThemeType(other.getThemeType());
      }
      if (other.hasLabel()) {
        mergeLabel(other.getLabel());
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
              dueDate_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              dueRemark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              accessStatus_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              vipStatus_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              vipStatusWarn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 56: {
              themeType_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 66: {
              input.readMessage(
                  getLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000080;
              break;
            } // case 66
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
     *会员类型
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     *会员类型
     * </pre>
     *
     * <code>int32 type = 1;</code>
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
     *会员类型
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long dueDate_ ;
    /**
     * <pre>
     *到期时间
     * </pre>
     *
     * <code>int64 due_date = 2;</code>
     * @return The dueDate.
     */
    @java.lang.Override
    public long getDueDate() {
      return dueDate_;
    }
    /**
     * <pre>
     *到期时间
     * </pre>
     *
     * <code>int64 due_date = 2;</code>
     * @param value The dueDate to set.
     * @return This builder for chaining.
     */
    public Builder setDueDate(long value) {

      dueDate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *到期时间
     * </pre>
     *
     * <code>int64 due_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDueDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dueDate_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dueRemark_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 3;</code>
     * @return The dueRemark.
     */
    public java.lang.String getDueRemark() {
      java.lang.Object ref = dueRemark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dueRemark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 3;</code>
     * @return The bytes for dueRemark.
     */
    public com.google.protobuf.ByteString
        getDueRemarkBytes() {
      java.lang.Object ref = dueRemark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dueRemark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 3;</code>
     * @param value The dueRemark to set.
     * @return This builder for chaining.
     */
    public Builder setDueRemark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dueRemark_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDueRemark() {
      dueRemark_ = getDefaultInstance().getDueRemark();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 3;</code>
     * @param value The bytes for dueRemark to set.
     * @return This builder for chaining.
     */
    public Builder setDueRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dueRemark_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int accessStatus_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 access_status = 4;</code>
     * @return The accessStatus.
     */
    @java.lang.Override
    public int getAccessStatus() {
      return accessStatus_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 access_status = 4;</code>
     * @param value The accessStatus to set.
     * @return This builder for chaining.
     */
    public Builder setAccessStatus(int value) {

      accessStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 access_status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      accessStatus_ = 0;
      onChanged();
      return this;
    }

    private int vipStatus_ ;
    /**
     * <pre>
     *会员状态
     * </pre>
     *
     * <code>int32 vip_status = 5;</code>
     * @return The vipStatus.
     */
    @java.lang.Override
    public int getVipStatus() {
      return vipStatus_;
    }
    /**
     * <pre>
     *会员状态
     * </pre>
     *
     * <code>int32 vip_status = 5;</code>
     * @param value The vipStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatus(int value) {

      vipStatus_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *会员状态
     * </pre>
     *
     * <code>int32 vip_status = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearVipStatus() {
      bitField0_ = (bitField0_ & ~0x00000010);
      vipStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object vipStatusWarn_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 6;</code>
     * @return The vipStatusWarn.
     */
    public java.lang.String getVipStatusWarn() {
      java.lang.Object ref = vipStatusWarn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vipStatusWarn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 6;</code>
     * @return The bytes for vipStatusWarn.
     */
    public com.google.protobuf.ByteString
        getVipStatusWarnBytes() {
      java.lang.Object ref = vipStatusWarn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vipStatusWarn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 6;</code>
     * @param value The vipStatusWarn to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatusWarn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vipStatusWarn_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearVipStatusWarn() {
      vipStatusWarn_ = getDefaultInstance().getVipStatusWarn();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 6;</code>
     * @param value The bytes for vipStatusWarn to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatusWarnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      vipStatusWarn_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private int themeType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 theme_type = 7;</code>
     * @return The themeType.
     */
    @java.lang.Override
    public int getThemeType() {
      return themeType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 theme_type = 7;</code>
     * @param value The themeType to set.
     * @return This builder for chaining.
     */
    public Builder setThemeType(int value) {

      themeType_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 theme_type = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearThemeType() {
      bitField0_ = (bitField0_ & ~0x00000040);
      themeType_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.view.v1.VipLabel label_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.VipLabel, bilibili.app.view.v1.VipLabel.Builder, bilibili.app.view.v1.VipLabelOrBuilder> labelBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     * @return Whether the label field is set.
     */
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     * @return The label.
     */
    public bilibili.app.view.v1.VipLabel getLabel() {
      if (labelBuilder_ == null) {
        return label_ == null ? bilibili.app.view.v1.VipLabel.getDefaultInstance() : label_;
      } else {
        return labelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public Builder setLabel(bilibili.app.view.v1.VipLabel value) {
      if (labelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
      } else {
        labelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public Builder setLabel(
        bilibili.app.view.v1.VipLabel.Builder builderForValue) {
      if (labelBuilder_ == null) {
        label_ = builderForValue.build();
      } else {
        labelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public Builder mergeLabel(bilibili.app.view.v1.VipLabel value) {
      if (labelBuilder_ == null) {
        if (((bitField0_ & 0x00000080) != 0) &&
          label_ != null &&
          label_ != bilibili.app.view.v1.VipLabel.getDefaultInstance()) {
          getLabelBuilder().mergeFrom(value);
        } else {
          label_ = value;
        }
      } else {
        labelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public Builder clearLabel() {
      bitField0_ = (bitField0_ & ~0x00000080);
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
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public bilibili.app.view.v1.VipLabel.Builder getLabelBuilder() {
      bitField0_ |= 0x00000080;
      onChanged();
      return getLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    public bilibili.app.view.v1.VipLabelOrBuilder getLabelOrBuilder() {
      if (labelBuilder_ != null) {
        return labelBuilder_.getMessageOrBuilder();
      } else {
        return label_ == null ?
            bilibili.app.view.v1.VipLabel.getDefaultInstance() : label_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.VipLabel label = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.VipLabel, bilibili.app.view.v1.VipLabel.Builder, bilibili.app.view.v1.VipLabelOrBuilder> 
        getLabelFieldBuilder() {
      if (labelBuilder_ == null) {
        labelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.VipLabel, bilibili.app.view.v1.VipLabel.Builder, bilibili.app.view.v1.VipLabelOrBuilder>(
                getLabel(),
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      return labelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.Vip)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.Vip)
  private static final bilibili.app.view.v1.Vip DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.Vip();
  }

  public static bilibili.app.view.v1.Vip getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vip>
      PARSER = new com.google.protobuf.AbstractParser<Vip>() {
    @java.lang.Override
    public Vip parsePartialFrom(
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

  public static com.google.protobuf.Parser<Vip> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vip> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.Vip getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
