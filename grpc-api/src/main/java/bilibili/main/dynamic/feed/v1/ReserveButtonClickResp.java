// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/interfaces/feed/v1/api.proto

package bilibili.main.dynamic.feed.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.main.dynamic.feed.v1.ReserveButtonClickResp}
 */
public final class ReserveButtonClickResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)
    ReserveButtonClickRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReserveButtonClickResp.newBuilder() to construct.
  private ReserveButtonClickResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReserveButtonClickResp() {
    finalBtnStatus_ = 0;
    btnMode_ = 0;
    descUpdate_ = "";
    activityUrl_ = "";
    toast_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReserveButtonClickResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_ReserveButtonClickResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_ReserveButtonClickResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.class, bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.Builder.class);
  }

  public static final int FINAL_BTN_STATUS_FIELD_NUMBER = 1;
  private int finalBtnStatus_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
   * @return The enum numeric value on the wire for finalBtnStatus.
   */
  @java.lang.Override public int getFinalBtnStatusValue() {
    return finalBtnStatus_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
   * @return The finalBtnStatus.
   */
  @java.lang.Override public bilibili.main.dynamic.feed.v1.ReserveButtonStatus getFinalBtnStatus() {
    bilibili.main.dynamic.feed.v1.ReserveButtonStatus result = bilibili.main.dynamic.feed.v1.ReserveButtonStatus.forNumber(finalBtnStatus_);
    return result == null ? bilibili.main.dynamic.feed.v1.ReserveButtonStatus.UNRECOGNIZED : result;
  }

  public static final int BTN_MODE_FIELD_NUMBER = 2;
  private int btnMode_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
   * @return The enum numeric value on the wire for btnMode.
   */
  @java.lang.Override public int getBtnModeValue() {
    return btnMode_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
   * @return The btnMode.
   */
  @java.lang.Override public bilibili.main.dynamic.feed.v1.ReserveButtonMode getBtnMode() {
    bilibili.main.dynamic.feed.v1.ReserveButtonMode result = bilibili.main.dynamic.feed.v1.ReserveButtonMode.forNumber(btnMode_);
    return result == null ? bilibili.main.dynamic.feed.v1.ReserveButtonMode.UNRECOGNIZED : result;
  }

  public static final int RESERVE_UPDATE_FIELD_NUMBER = 3;
  private long reserveUpdate_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 reserve_update = 3;</code>
   * @return The reserveUpdate.
   */
  @java.lang.Override
  public long getReserveUpdate() {
    return reserveUpdate_;
  }

  public static final int DESC_UPDATE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object descUpdate_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_update = 4;</code>
   * @return The descUpdate.
   */
  @java.lang.Override
  public java.lang.String getDescUpdate() {
    java.lang.Object ref = descUpdate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descUpdate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc_update = 4;</code>
   * @return The bytes for descUpdate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescUpdateBytes() {
    java.lang.Object ref = descUpdate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descUpdate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_ACTIVITY_FIELD_NUMBER = 5;
  private boolean hasActivity_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_activity = 5;</code>
   * @return The hasActivity.
   */
  @java.lang.Override
  public boolean getHasActivity() {
    return hasActivity_;
  }

  public static final int ACTIVITY_URL_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object activityUrl_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_url = 6;</code>
   * @return The activityUrl.
   */
  @java.lang.Override
  public java.lang.String getActivityUrl() {
    java.lang.Object ref = activityUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activityUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_url = 6;</code>
   * @return The bytes for activityUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActivityUrlBytes() {
    java.lang.Object ref = activityUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activityUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOAST_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toast_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string toast = 7;</code>
   * @return The toast.
   */
  @java.lang.Override
  public java.lang.String getToast() {
    java.lang.Object ref = toast_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toast_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string toast = 7;</code>
   * @return The bytes for toast.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToastBytes() {
    java.lang.Object ref = toast_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toast_ = b;
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
    if (finalBtnStatus_ != bilibili.main.dynamic.feed.v1.ReserveButtonStatus.RESERVE_BUTTON_STATUS_NONE.getNumber()) {
      output.writeEnum(1, finalBtnStatus_);
    }
    if (btnMode_ != bilibili.main.dynamic.feed.v1.ReserveButtonMode.RESERVE_BUTTON_MODE_NONE.getNumber()) {
      output.writeEnum(2, btnMode_);
    }
    if (reserveUpdate_ != 0L) {
      output.writeInt64(3, reserveUpdate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descUpdate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, descUpdate_);
    }
    if (hasActivity_ != false) {
      output.writeBool(5, hasActivity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activityUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, activityUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toast_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, toast_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (finalBtnStatus_ != bilibili.main.dynamic.feed.v1.ReserveButtonStatus.RESERVE_BUTTON_STATUS_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, finalBtnStatus_);
    }
    if (btnMode_ != bilibili.main.dynamic.feed.v1.ReserveButtonMode.RESERVE_BUTTON_MODE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, btnMode_);
    }
    if (reserveUpdate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, reserveUpdate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descUpdate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, descUpdate_);
    }
    if (hasActivity_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hasActivity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activityUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, activityUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toast_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, toast_);
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
    if (!(obj instanceof bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)) {
      return super.equals(obj);
    }
    bilibili.main.dynamic.feed.v1.ReserveButtonClickResp other = (bilibili.main.dynamic.feed.v1.ReserveButtonClickResp) obj;

    if (finalBtnStatus_ != other.finalBtnStatus_) return false;
    if (btnMode_ != other.btnMode_) return false;
    if (getReserveUpdate()
        != other.getReserveUpdate()) return false;
    if (!getDescUpdate()
        .equals(other.getDescUpdate())) return false;
    if (getHasActivity()
        != other.getHasActivity()) return false;
    if (!getActivityUrl()
        .equals(other.getActivityUrl())) return false;
    if (!getToast()
        .equals(other.getToast())) return false;
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
    hash = (37 * hash) + FINAL_BTN_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + finalBtnStatus_;
    hash = (37 * hash) + BTN_MODE_FIELD_NUMBER;
    hash = (53 * hash) + btnMode_;
    hash = (37 * hash) + RESERVE_UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReserveUpdate());
    hash = (37 * hash) + DESC_UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + getDescUpdate().hashCode();
    hash = (37 * hash) + HAS_ACTIVITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasActivity());
    hash = (37 * hash) + ACTIVITY_URL_FIELD_NUMBER;
    hash = (53 * hash) + getActivityUrl().hashCode();
    hash = (37 * hash) + TOAST_FIELD_NUMBER;
    hash = (53 * hash) + getToast().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp parseFrom(
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
  public static Builder newBuilder(bilibili.main.dynamic.feed.v1.ReserveButtonClickResp prototype) {
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
   * Protobuf type {@code bilibili.main.dynamic.feed.v1.ReserveButtonClickResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)
      bilibili.main.dynamic.feed.v1.ReserveButtonClickRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_ReserveButtonClickResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_ReserveButtonClickResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.class, bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.Builder.class);
    }

    // Construct using bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.newBuilder()
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
      finalBtnStatus_ = 0;
      btnMode_ = 0;
      reserveUpdate_ = 0L;
      descUpdate_ = "";
      hasActivity_ = false;
      activityUrl_ = "";
      toast_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.main.dynamic.feed.v1.Api.internal_static_bilibili_main_dynamic_feed_v1_ReserveButtonClickResp_descriptor;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.ReserveButtonClickResp getDefaultInstanceForType() {
      return bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.ReserveButtonClickResp build() {
      bilibili.main.dynamic.feed.v1.ReserveButtonClickResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.ReserveButtonClickResp buildPartial() {
      bilibili.main.dynamic.feed.v1.ReserveButtonClickResp result = new bilibili.main.dynamic.feed.v1.ReserveButtonClickResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.main.dynamic.feed.v1.ReserveButtonClickResp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.finalBtnStatus_ = finalBtnStatus_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.btnMode_ = btnMode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reserveUpdate_ = reserveUpdate_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.descUpdate_ = descUpdate_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.hasActivity_ = hasActivity_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.activityUrl_ = activityUrl_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.toast_ = toast_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.main.dynamic.feed.v1.ReserveButtonClickResp) {
        return mergeFrom((bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.main.dynamic.feed.v1.ReserveButtonClickResp other) {
      if (other == bilibili.main.dynamic.feed.v1.ReserveButtonClickResp.getDefaultInstance()) return this;
      if (other.finalBtnStatus_ != 0) {
        setFinalBtnStatusValue(other.getFinalBtnStatusValue());
      }
      if (other.btnMode_ != 0) {
        setBtnModeValue(other.getBtnModeValue());
      }
      if (other.getReserveUpdate() != 0L) {
        setReserveUpdate(other.getReserveUpdate());
      }
      if (!other.getDescUpdate().isEmpty()) {
        descUpdate_ = other.descUpdate_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getHasActivity() != false) {
        setHasActivity(other.getHasActivity());
      }
      if (!other.getActivityUrl().isEmpty()) {
        activityUrl_ = other.activityUrl_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (!other.getToast().isEmpty()) {
        toast_ = other.toast_;
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
              finalBtnStatus_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              btnMode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              reserveUpdate_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              descUpdate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              hasActivity_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              activityUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              toast_ = input.readStringRequireUtf8();
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

    private int finalBtnStatus_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
     * @return The enum numeric value on the wire for finalBtnStatus.
     */
    @java.lang.Override public int getFinalBtnStatusValue() {
      return finalBtnStatus_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
     * @param value The enum numeric value on the wire for finalBtnStatus to set.
     * @return This builder for chaining.
     */
    public Builder setFinalBtnStatusValue(int value) {
      finalBtnStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
     * @return The finalBtnStatus.
     */
    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.ReserveButtonStatus getFinalBtnStatus() {
      bilibili.main.dynamic.feed.v1.ReserveButtonStatus result = bilibili.main.dynamic.feed.v1.ReserveButtonStatus.forNumber(finalBtnStatus_);
      return result == null ? bilibili.main.dynamic.feed.v1.ReserveButtonStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
     * @param value The finalBtnStatus to set.
     * @return This builder for chaining.
     */
    public Builder setFinalBtnStatus(bilibili.main.dynamic.feed.v1.ReserveButtonStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      finalBtnStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonStatus final_btn_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFinalBtnStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      finalBtnStatus_ = 0;
      onChanged();
      return this;
    }

    private int btnMode_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
     * @return The enum numeric value on the wire for btnMode.
     */
    @java.lang.Override public int getBtnModeValue() {
      return btnMode_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
     * @param value The enum numeric value on the wire for btnMode to set.
     * @return This builder for chaining.
     */
    public Builder setBtnModeValue(int value) {
      btnMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
     * @return The btnMode.
     */
    @java.lang.Override
    public bilibili.main.dynamic.feed.v1.ReserveButtonMode getBtnMode() {
      bilibili.main.dynamic.feed.v1.ReserveButtonMode result = bilibili.main.dynamic.feed.v1.ReserveButtonMode.forNumber(btnMode_);
      return result == null ? bilibili.main.dynamic.feed.v1.ReserveButtonMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
     * @param value The btnMode to set.
     * @return This builder for chaining.
     */
    public Builder setBtnMode(bilibili.main.dynamic.feed.v1.ReserveButtonMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      btnMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.main.dynamic.feed.v1.ReserveButtonMode btn_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBtnMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      btnMode_ = 0;
      onChanged();
      return this;
    }

    private long reserveUpdate_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_update = 3;</code>
     * @return The reserveUpdate.
     */
    @java.lang.Override
    public long getReserveUpdate() {
      return reserveUpdate_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_update = 3;</code>
     * @param value The reserveUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setReserveUpdate(long value) {

      reserveUpdate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 reserve_update = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveUpdate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      reserveUpdate_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object descUpdate_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_update = 4;</code>
     * @return The descUpdate.
     */
    public java.lang.String getDescUpdate() {
      java.lang.Object ref = descUpdate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descUpdate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_update = 4;</code>
     * @return The bytes for descUpdate.
     */
    public com.google.protobuf.ByteString
        getDescUpdateBytes() {
      java.lang.Object ref = descUpdate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descUpdate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_update = 4;</code>
     * @param value The descUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setDescUpdate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      descUpdate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_update = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescUpdate() {
      descUpdate_ = getDefaultInstance().getDescUpdate();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc_update = 4;</code>
     * @param value The bytes for descUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setDescUpdateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      descUpdate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean hasActivity_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_activity = 5;</code>
     * @return The hasActivity.
     */
    @java.lang.Override
    public boolean getHasActivity() {
      return hasActivity_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_activity = 5;</code>
     * @param value The hasActivity to set.
     * @return This builder for chaining.
     */
    public Builder setHasActivity(boolean value) {

      hasActivity_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_activity = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasActivity() {
      bitField0_ = (bitField0_ & ~0x00000010);
      hasActivity_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object activityUrl_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_url = 6;</code>
     * @return The activityUrl.
     */
    public java.lang.String getActivityUrl() {
      java.lang.Object ref = activityUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activityUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_url = 6;</code>
     * @return The bytes for activityUrl.
     */
    public com.google.protobuf.ByteString
        getActivityUrlBytes() {
      java.lang.Object ref = activityUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activityUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_url = 6;</code>
     * @param value The activityUrl to set.
     * @return This builder for chaining.
     */
    public Builder setActivityUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      activityUrl_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityUrl() {
      activityUrl_ = getDefaultInstance().getActivityUrl();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string activity_url = 6;</code>
     * @param value The bytes for activityUrl to set.
     * @return This builder for chaining.
     */
    public Builder setActivityUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      activityUrl_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object toast_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string toast = 7;</code>
     * @return The toast.
     */
    public java.lang.String getToast() {
      java.lang.Object ref = toast_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toast_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string toast = 7;</code>
     * @return The bytes for toast.
     */
    public com.google.protobuf.ByteString
        getToastBytes() {
      java.lang.Object ref = toast_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toast_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string toast = 7;</code>
     * @param value The toast to set.
     * @return This builder for chaining.
     */
    public Builder setToast(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toast_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string toast = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearToast() {
      toast_ = getDefaultInstance().getToast();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string toast = 7;</code>
     * @param value The bytes for toast to set.
     * @return This builder for chaining.
     */
    public Builder setToastBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toast_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.main.dynamic.feed.v1.ReserveButtonClickResp)
  private static final bilibili.main.dynamic.feed.v1.ReserveButtonClickResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.main.dynamic.feed.v1.ReserveButtonClickResp();
  }

  public static bilibili.main.dynamic.feed.v1.ReserveButtonClickResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReserveButtonClickResp>
      PARSER = new com.google.protobuf.AbstractParser<ReserveButtonClickResp>() {
    @java.lang.Override
    public ReserveButtonClickResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReserveButtonClickResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReserveButtonClickResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.main.dynamic.feed.v1.ReserveButtonClickResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

