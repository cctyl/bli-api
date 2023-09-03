// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.CardVip}
 */
public final class CardVip extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.CardVip)
    CardVipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardVip.newBuilder() to construct.
  private CardVip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardVip() {
    dueRemark_ = "";
    vipStatusWarn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardVip();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_CardVip_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_CardVip_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.CardVip.class, bilibili.web.interfaces.v1.CardVip.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int DUE_REMARK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dueRemark_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string due_remark = 2;</code>
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
   * <code>string due_remark = 2;</code>
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

  public static final int ACCESS_STATUS_FIELD_NUMBER = 3;
  private int accessStatus_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 access_status = 3;</code>
   * @return The accessStatus.
   */
  @java.lang.Override
  public int getAccessStatus() {
    return accessStatus_;
  }

  public static final int VIP_STATUS_FIELD_NUMBER = 4;
  private int vipStatus_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 vip_status = 4;</code>
   * @return The vipStatus.
   */
  @java.lang.Override
  public int getVipStatus() {
    return vipStatus_;
  }

  public static final int VIP_STATUS_WARN_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vipStatusWarn_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_status_warn = 5;</code>
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
   * <code>string vip_status_warn = 5;</code>
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

  public static final int THEME_TYPE_FIELD_NUMBER = 6;
  private int themeType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 theme_type = 6;</code>
   * @return The themeType.
   */
  @java.lang.Override
  public int getThemeType() {
    return themeType_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dueRemark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dueRemark_);
    }
    if (accessStatus_ != 0) {
      output.writeInt32(3, accessStatus_);
    }
    if (vipStatus_ != 0) {
      output.writeInt32(4, vipStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vipStatusWarn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, vipStatusWarn_);
    }
    if (themeType_ != 0) {
      output.writeInt32(6, themeType_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dueRemark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dueRemark_);
    }
    if (accessStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, accessStatus_);
    }
    if (vipStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, vipStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vipStatusWarn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, vipStatusWarn_);
    }
    if (themeType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, themeType_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.CardVip)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.CardVip other = (bilibili.web.interfaces.v1.CardVip) obj;

    if (getType()
        != other.getType()) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.CardVip parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.CardVip parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.CardVip parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.CardVip prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.CardVip}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.CardVip)
      bilibili.web.interfaces.v1.CardVipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_CardVip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_CardVip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.CardVip.class, bilibili.web.interfaces.v1.CardVip.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.CardVip.newBuilder()
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
      dueRemark_ = "";
      accessStatus_ = 0;
      vipStatus_ = 0;
      vipStatusWarn_ = "";
      themeType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_CardVip_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.CardVip getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.CardVip.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.CardVip build() {
      bilibili.web.interfaces.v1.CardVip result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.CardVip buildPartial() {
      bilibili.web.interfaces.v1.CardVip result = new bilibili.web.interfaces.v1.CardVip(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.CardVip result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dueRemark_ = dueRemark_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accessStatus_ = accessStatus_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.vipStatus_ = vipStatus_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.vipStatusWarn_ = vipStatusWarn_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.themeType_ = themeType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.CardVip) {
        return mergeFrom((bilibili.web.interfaces.v1.CardVip)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.CardVip other) {
      if (other == bilibili.web.interfaces.v1.CardVip.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getDueRemark().isEmpty()) {
        dueRemark_ = other.dueRemark_;
        bitField0_ |= 0x00000002;
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
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getThemeType() != 0) {
        setThemeType(other.getThemeType());
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
            case 18: {
              dueRemark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              accessStatus_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              vipStatus_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              vipStatusWarn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              themeType_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object dueRemark_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 2;</code>
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
     * <code>string due_remark = 2;</code>
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
     * <code>string due_remark = 2;</code>
     * @param value The dueRemark to set.
     * @return This builder for chaining.
     */
    public Builder setDueRemark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dueRemark_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDueRemark() {
      dueRemark_ = getDefaultInstance().getDueRemark();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string due_remark = 2;</code>
     * @param value The bytes for dueRemark to set.
     * @return This builder for chaining.
     */
    public Builder setDueRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dueRemark_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int accessStatus_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 access_status = 3;</code>
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
     * <code>int32 access_status = 3;</code>
     * @param value The accessStatus to set.
     * @return This builder for chaining.
     */
    public Builder setAccessStatus(int value) {

      accessStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 access_status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      accessStatus_ = 0;
      onChanged();
      return this;
    }

    private int vipStatus_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 vip_status = 4;</code>
     * @return The vipStatus.
     */
    @java.lang.Override
    public int getVipStatus() {
      return vipStatus_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 vip_status = 4;</code>
     * @param value The vipStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatus(int value) {

      vipStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 vip_status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVipStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      vipStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object vipStatusWarn_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 5;</code>
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
     * <code>string vip_status_warn = 5;</code>
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
     * <code>string vip_status_warn = 5;</code>
     * @param value The vipStatusWarn to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatusWarn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vipStatusWarn_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearVipStatusWarn() {
      vipStatusWarn_ = getDefaultInstance().getVipStatusWarn();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string vip_status_warn = 5;</code>
     * @param value The bytes for vipStatusWarn to set.
     * @return This builder for chaining.
     */
    public Builder setVipStatusWarnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      vipStatusWarn_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int themeType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 theme_type = 6;</code>
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
     * <code>int32 theme_type = 6;</code>
     * @param value The themeType to set.
     * @return This builder for chaining.
     */
    public Builder setThemeType(int value) {

      themeType_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 theme_type = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearThemeType() {
      bitField0_ = (bitField0_ & ~0x00000020);
      themeType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.CardVip)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.CardVip)
  private static final bilibili.web.interfaces.v1.CardVip DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.CardVip();
  }

  public static bilibili.web.interfaces.v1.CardVip getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardVip>
      PARSER = new com.google.protobuf.AbstractParser<CardVip>() {
    @java.lang.Override
    public CardVip parsePartialFrom(
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

  public static com.google.protobuf.Parser<CardVip> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardVip> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.CardVip getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

