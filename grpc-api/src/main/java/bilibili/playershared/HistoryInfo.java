// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.playershared.HistoryInfo}
 */
public final class HistoryInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.playershared.HistoryInfo)
    HistoryInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistoryInfo.newBuilder() to construct.
  private HistoryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistoryInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistoryInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_HistoryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_HistoryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.playershared.HistoryInfo.class, bilibili.playershared.HistoryInfo.Builder.class);
  }

  public static final int PROGRESS_FIELD_NUMBER = 1;
  private long progress_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 progress = 1;</code>
   * @return The progress.
   */
  @java.lang.Override
  public long getProgress() {
    return progress_;
  }

  public static final int LAST_PLAY_CID_FIELD_NUMBER = 2;
  private long lastPlayCid_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 last_play_cid = 2;</code>
   * @return The lastPlayCid.
   */
  @java.lang.Override
  public long getLastPlayCid() {
    return lastPlayCid_;
  }

  public static final int TOAST_FIELD_NUMBER = 3;
  private bilibili.playershared.Toast toast_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast = 3;</code>
   * @return Whether the toast field is set.
   */
  @java.lang.Override
  public boolean hasToast() {
    return toast_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast = 3;</code>
   * @return The toast.
   */
  @java.lang.Override
  public bilibili.playershared.Toast getToast() {
    return toast_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toast_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast = 3;</code>
   */
  @java.lang.Override
  public bilibili.playershared.ToastOrBuilder getToastOrBuilder() {
    return toast_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toast_;
  }

  public static final int TOAST_WITHOUT_TIME_FIELD_NUMBER = 4;
  private bilibili.playershared.Toast toastWithoutTime_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
   * @return Whether the toastWithoutTime field is set.
   */
  @java.lang.Override
  public boolean hasToastWithoutTime() {
    return toastWithoutTime_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
   * @return The toastWithoutTime.
   */
  @java.lang.Override
  public bilibili.playershared.Toast getToastWithoutTime() {
    return toastWithoutTime_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toastWithoutTime_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
   */
  @java.lang.Override
  public bilibili.playershared.ToastOrBuilder getToastWithoutTimeOrBuilder() {
    return toastWithoutTime_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toastWithoutTime_;
  }

  public static final int LAST_PLAY_AID_FIELD_NUMBER = 5;
  private long lastPlayAid_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 last_play_aid = 5;</code>
   * @return The lastPlayAid.
   */
  @java.lang.Override
  public long getLastPlayAid() {
    return lastPlayAid_;
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
    if (progress_ != 0L) {
      output.writeInt64(1, progress_);
    }
    if (lastPlayCid_ != 0L) {
      output.writeInt64(2, lastPlayCid_);
    }
    if (toast_ != null) {
      output.writeMessage(3, getToast());
    }
    if (toastWithoutTime_ != null) {
      output.writeMessage(4, getToastWithoutTime());
    }
    if (lastPlayAid_ != 0L) {
      output.writeInt64(5, lastPlayAid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (progress_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, progress_);
    }
    if (lastPlayCid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastPlayCid_);
    }
    if (toast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToast());
    }
    if (toastWithoutTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getToastWithoutTime());
    }
    if (lastPlayAid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, lastPlayAid_);
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
    if (!(obj instanceof bilibili.playershared.HistoryInfo)) {
      return super.equals(obj);
    }
    bilibili.playershared.HistoryInfo other = (bilibili.playershared.HistoryInfo) obj;

    if (getProgress()
        != other.getProgress()) return false;
    if (getLastPlayCid()
        != other.getLastPlayCid()) return false;
    if (hasToast() != other.hasToast()) return false;
    if (hasToast()) {
      if (!getToast()
          .equals(other.getToast())) return false;
    }
    if (hasToastWithoutTime() != other.hasToastWithoutTime()) return false;
    if (hasToastWithoutTime()) {
      if (!getToastWithoutTime()
          .equals(other.getToastWithoutTime())) return false;
    }
    if (getLastPlayAid()
        != other.getLastPlayAid()) return false;
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
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProgress());
    hash = (37 * hash) + LAST_PLAY_CID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastPlayCid());
    if (hasToast()) {
      hash = (37 * hash) + TOAST_FIELD_NUMBER;
      hash = (53 * hash) + getToast().hashCode();
    }
    if (hasToastWithoutTime()) {
      hash = (37 * hash) + TOAST_WITHOUT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getToastWithoutTime().hashCode();
    }
    hash = (37 * hash) + LAST_PLAY_AID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastPlayAid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.playershared.HistoryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.HistoryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.playershared.HistoryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.HistoryInfo parseFrom(
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
  public static Builder newBuilder(bilibili.playershared.HistoryInfo prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.playershared.HistoryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.playershared.HistoryInfo)
      bilibili.playershared.HistoryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_HistoryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_HistoryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.playershared.HistoryInfo.class, bilibili.playershared.HistoryInfo.Builder.class);
    }

    // Construct using bilibili.playershared.HistoryInfo.newBuilder()
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
      progress_ = 0L;
      lastPlayCid_ = 0L;
      toast_ = null;
      if (toastBuilder_ != null) {
        toastBuilder_.dispose();
        toastBuilder_ = null;
      }
      toastWithoutTime_ = null;
      if (toastWithoutTimeBuilder_ != null) {
        toastWithoutTimeBuilder_.dispose();
        toastWithoutTimeBuilder_ = null;
      }
      lastPlayAid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_HistoryInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.playershared.HistoryInfo getDefaultInstanceForType() {
      return bilibili.playershared.HistoryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.playershared.HistoryInfo build() {
      bilibili.playershared.HistoryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.playershared.HistoryInfo buildPartial() {
      bilibili.playershared.HistoryInfo result = new bilibili.playershared.HistoryInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.playershared.HistoryInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.progress_ = progress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastPlayCid_ = lastPlayCid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.toast_ = toastBuilder_ == null
            ? toast_
            : toastBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.toastWithoutTime_ = toastWithoutTimeBuilder_ == null
            ? toastWithoutTime_
            : toastWithoutTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.lastPlayAid_ = lastPlayAid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.playershared.HistoryInfo) {
        return mergeFrom((bilibili.playershared.HistoryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.playershared.HistoryInfo other) {
      if (other == bilibili.playershared.HistoryInfo.getDefaultInstance()) return this;
      if (other.getProgress() != 0L) {
        setProgress(other.getProgress());
      }
      if (other.getLastPlayCid() != 0L) {
        setLastPlayCid(other.getLastPlayCid());
      }
      if (other.hasToast()) {
        mergeToast(other.getToast());
      }
      if (other.hasToastWithoutTime()) {
        mergeToastWithoutTime(other.getToastWithoutTime());
      }
      if (other.getLastPlayAid() != 0L) {
        setLastPlayAid(other.getLastPlayAid());
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
              progress_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              lastPlayCid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getToastFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getToastWithoutTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              lastPlayAid_ = input.readInt64();
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

    private long progress_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 progress = 1;</code>
     * @return The progress.
     */
    @java.lang.Override
    public long getProgress() {
      return progress_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 progress = 1;</code>
     * @param value The progress to set.
     * @return This builder for chaining.
     */
    public Builder setProgress(long value) {

      progress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 progress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgress() {
      bitField0_ = (bitField0_ & ~0x00000001);
      progress_ = 0L;
      onChanged();
      return this;
    }

    private long lastPlayCid_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_cid = 2;</code>
     * @return The lastPlayCid.
     */
    @java.lang.Override
    public long getLastPlayCid() {
      return lastPlayCid_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_cid = 2;</code>
     * @param value The lastPlayCid to set.
     * @return This builder for chaining.
     */
    public Builder setLastPlayCid(long value) {

      lastPlayCid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_cid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastPlayCid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastPlayCid_ = 0L;
      onChanged();
      return this;
    }

    private bilibili.playershared.Toast toast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder> toastBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     * @return Whether the toast field is set.
     */
    public boolean hasToast() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     * @return The toast.
     */
    public bilibili.playershared.Toast getToast() {
      if (toastBuilder_ == null) {
        return toast_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toast_;
      } else {
        return toastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public Builder setToast(bilibili.playershared.Toast value) {
      if (toastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toast_ = value;
      } else {
        toastBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public Builder setToast(
        bilibili.playershared.Toast.Builder builderForValue) {
      if (toastBuilder_ == null) {
        toast_ = builderForValue.build();
      } else {
        toastBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public Builder mergeToast(bilibili.playershared.Toast value) {
      if (toastBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          toast_ != null &&
          toast_ != bilibili.playershared.Toast.getDefaultInstance()) {
          getToastBuilder().mergeFrom(value);
        } else {
          toast_ = value;
        }
      } else {
        toastBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public Builder clearToast() {
      bitField0_ = (bitField0_ & ~0x00000004);
      toast_ = null;
      if (toastBuilder_ != null) {
        toastBuilder_.dispose();
        toastBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public bilibili.playershared.Toast.Builder getToastBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getToastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    public bilibili.playershared.ToastOrBuilder getToastOrBuilder() {
      if (toastBuilder_ != null) {
        return toastBuilder_.getMessageOrBuilder();
      } else {
        return toast_ == null ?
            bilibili.playershared.Toast.getDefaultInstance() : toast_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder> 
        getToastFieldBuilder() {
      if (toastBuilder_ == null) {
        toastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder>(
                getToast(),
                getParentForChildren(),
                isClean());
        toast_ = null;
      }
      return toastBuilder_;
    }

    private bilibili.playershared.Toast toastWithoutTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder> toastWithoutTimeBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     * @return Whether the toastWithoutTime field is set.
     */
    public boolean hasToastWithoutTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     * @return The toastWithoutTime.
     */
    public bilibili.playershared.Toast getToastWithoutTime() {
      if (toastWithoutTimeBuilder_ == null) {
        return toastWithoutTime_ == null ? bilibili.playershared.Toast.getDefaultInstance() : toastWithoutTime_;
      } else {
        return toastWithoutTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public Builder setToastWithoutTime(bilibili.playershared.Toast value) {
      if (toastWithoutTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toastWithoutTime_ = value;
      } else {
        toastWithoutTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public Builder setToastWithoutTime(
        bilibili.playershared.Toast.Builder builderForValue) {
      if (toastWithoutTimeBuilder_ == null) {
        toastWithoutTime_ = builderForValue.build();
      } else {
        toastWithoutTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public Builder mergeToastWithoutTime(bilibili.playershared.Toast value) {
      if (toastWithoutTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          toastWithoutTime_ != null &&
          toastWithoutTime_ != bilibili.playershared.Toast.getDefaultInstance()) {
          getToastWithoutTimeBuilder().mergeFrom(value);
        } else {
          toastWithoutTime_ = value;
        }
      } else {
        toastWithoutTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public Builder clearToastWithoutTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      toastWithoutTime_ = null;
      if (toastWithoutTimeBuilder_ != null) {
        toastWithoutTimeBuilder_.dispose();
        toastWithoutTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public bilibili.playershared.Toast.Builder getToastWithoutTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getToastWithoutTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    public bilibili.playershared.ToastOrBuilder getToastWithoutTimeOrBuilder() {
      if (toastWithoutTimeBuilder_ != null) {
        return toastWithoutTimeBuilder_.getMessageOrBuilder();
      } else {
        return toastWithoutTime_ == null ?
            bilibili.playershared.Toast.getDefaultInstance() : toastWithoutTime_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Toast toast_without_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder> 
        getToastWithoutTimeFieldBuilder() {
      if (toastWithoutTimeBuilder_ == null) {
        toastWithoutTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.playershared.Toast, bilibili.playershared.Toast.Builder, bilibili.playershared.ToastOrBuilder>(
                getToastWithoutTime(),
                getParentForChildren(),
                isClean());
        toastWithoutTime_ = null;
      }
      return toastWithoutTimeBuilder_;
    }

    private long lastPlayAid_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_aid = 5;</code>
     * @return The lastPlayAid.
     */
    @java.lang.Override
    public long getLastPlayAid() {
      return lastPlayAid_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_aid = 5;</code>
     * @param value The lastPlayAid to set.
     * @return This builder for chaining.
     */
    public Builder setLastPlayAid(long value) {

      lastPlayAid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 last_play_aid = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastPlayAid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      lastPlayAid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.playershared.HistoryInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.playershared.HistoryInfo)
  private static final bilibili.playershared.HistoryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.playershared.HistoryInfo();
  }

  public static bilibili.playershared.HistoryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistoryInfo>
      PARSER = new com.google.protobuf.AbstractParser<HistoryInfo>() {
    @java.lang.Override
    public HistoryInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistoryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistoryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.playershared.HistoryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

