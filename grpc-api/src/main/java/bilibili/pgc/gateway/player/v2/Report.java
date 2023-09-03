// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * 埋点上报信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v2.Report}
 */
public final class Report extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v2.Report)
    ReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Report.newBuilder() to construct.
  private Report(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Report() {
    showEventId_ = "";
    clickEventId_ = "";
    extends_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Report();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Report_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Report_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v2.Report.class, bilibili.pgc.gateway.player.v2.Report.Builder.class);
  }

  public static final int SHOW_EVENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object showEventId_ = "";
  /**
   * <pre>
   * 曝光事件
   * </pre>
   *
   * <code>string show_event_id = 1;</code>
   * @return The showEventId.
   */
  @java.lang.Override
  public java.lang.String getShowEventId() {
    java.lang.Object ref = showEventId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      showEventId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 曝光事件
   * </pre>
   *
   * <code>string show_event_id = 1;</code>
   * @return The bytes for showEventId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShowEventIdBytes() {
    java.lang.Object ref = showEventId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      showEventId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLICK_EVENT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clickEventId_ = "";
  /**
   * <pre>
   * 点击事件
   * </pre>
   *
   * <code>string click_event_id = 2;</code>
   * @return The clickEventId.
   */
  @java.lang.Override
  public java.lang.String getClickEventId() {
    java.lang.Object ref = clickEventId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clickEventId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 点击事件
   * </pre>
   *
   * <code>string click_event_id = 2;</code>
   * @return The bytes for clickEventId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClickEventIdBytes() {
    java.lang.Object ref = clickEventId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clickEventId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extends_ = "";
  /**
   * <pre>
   * 埋点透传参数
   * </pre>
   *
   * <code>string extends = 3;</code>
   * @return The extends.
   */
  @java.lang.Override
  public java.lang.String getExtends() {
    java.lang.Object ref = extends_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extends_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 埋点透传参数
   * </pre>
   *
   * <code>string extends = 3;</code>
   * @return The bytes for extends.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtendsBytes() {
    java.lang.Object ref = extends_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extends_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(showEventId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, showEventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clickEventId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clickEventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extends_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extends_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(showEventId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, showEventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clickEventId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clickEventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extends_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extends_);
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v2.Report)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v2.Report other = (bilibili.pgc.gateway.player.v2.Report) obj;

    if (!getShowEventId()
        .equals(other.getShowEventId())) return false;
    if (!getClickEventId()
        .equals(other.getClickEventId())) return false;
    if (!getExtends()
        .equals(other.getExtends())) return false;
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
    hash = (37 * hash) + SHOW_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getShowEventId().hashCode();
    hash = (37 * hash) + CLICK_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClickEventId().hashCode();
    hash = (37 * hash) + EXTENDS_FIELD_NUMBER;
    hash = (53 * hash) + getExtends().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.Report parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v2.Report prototype) {
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
   * 埋点上报信息
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v2.Report}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v2.Report)
      bilibili.pgc.gateway.player.v2.ReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Report_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Report_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v2.Report.class, bilibili.pgc.gateway.player.v2.Report.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v2.Report.newBuilder()
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
      showEventId_ = "";
      clickEventId_ = "";
      extends_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_Report_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Report getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v2.Report.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Report build() {
      bilibili.pgc.gateway.player.v2.Report result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.Report buildPartial() {
      bilibili.pgc.gateway.player.v2.Report result = new bilibili.pgc.gateway.player.v2.Report(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v2.Report result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.showEventId_ = showEventId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clickEventId_ = clickEventId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.extends_ = extends_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v2.Report) {
        return mergeFrom((bilibili.pgc.gateway.player.v2.Report)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v2.Report other) {
      if (other == bilibili.pgc.gateway.player.v2.Report.getDefaultInstance()) return this;
      if (!other.getShowEventId().isEmpty()) {
        showEventId_ = other.showEventId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClickEventId().isEmpty()) {
        clickEventId_ = other.clickEventId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getExtends().isEmpty()) {
        extends_ = other.extends_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              showEventId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clickEventId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              extends_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object showEventId_ = "";
    /**
     * <pre>
     * 曝光事件
     * </pre>
     *
     * <code>string show_event_id = 1;</code>
     * @return The showEventId.
     */
    public java.lang.String getShowEventId() {
      java.lang.Object ref = showEventId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        showEventId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 曝光事件
     * </pre>
     *
     * <code>string show_event_id = 1;</code>
     * @return The bytes for showEventId.
     */
    public com.google.protobuf.ByteString
        getShowEventIdBytes() {
      java.lang.Object ref = showEventId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        showEventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 曝光事件
     * </pre>
     *
     * <code>string show_event_id = 1;</code>
     * @param value The showEventId to set.
     * @return This builder for chaining.
     */
    public Builder setShowEventId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      showEventId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 曝光事件
     * </pre>
     *
     * <code>string show_event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowEventId() {
      showEventId_ = getDefaultInstance().getShowEventId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 曝光事件
     * </pre>
     *
     * <code>string show_event_id = 1;</code>
     * @param value The bytes for showEventId to set.
     * @return This builder for chaining.
     */
    public Builder setShowEventIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      showEventId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clickEventId_ = "";
    /**
     * <pre>
     * 点击事件
     * </pre>
     *
     * <code>string click_event_id = 2;</code>
     * @return The clickEventId.
     */
    public java.lang.String getClickEventId() {
      java.lang.Object ref = clickEventId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clickEventId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 点击事件
     * </pre>
     *
     * <code>string click_event_id = 2;</code>
     * @return The bytes for clickEventId.
     */
    public com.google.protobuf.ByteString
        getClickEventIdBytes() {
      java.lang.Object ref = clickEventId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clickEventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 点击事件
     * </pre>
     *
     * <code>string click_event_id = 2;</code>
     * @param value The clickEventId to set.
     * @return This builder for chaining.
     */
    public Builder setClickEventId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clickEventId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点击事件
     * </pre>
     *
     * <code>string click_event_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClickEventId() {
      clickEventId_ = getDefaultInstance().getClickEventId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 点击事件
     * </pre>
     *
     * <code>string click_event_id = 2;</code>
     * @param value The bytes for clickEventId to set.
     * @return This builder for chaining.
     */
    public Builder setClickEventIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clickEventId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object extends_ = "";
    /**
     * <pre>
     * 埋点透传参数
     * </pre>
     *
     * <code>string extends = 3;</code>
     * @return The extends.
     */
    public java.lang.String getExtends() {
      java.lang.Object ref = extends_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extends_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 埋点透传参数
     * </pre>
     *
     * <code>string extends = 3;</code>
     * @return The bytes for extends.
     */
    public com.google.protobuf.ByteString
        getExtendsBytes() {
      java.lang.Object ref = extends_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extends_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 埋点透传参数
     * </pre>
     *
     * <code>string extends = 3;</code>
     * @param value The extends to set.
     * @return This builder for chaining.
     */
    public Builder setExtends(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extends_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 埋点透传参数
     * </pre>
     *
     * <code>string extends = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtends() {
      extends_ = getDefaultInstance().getExtends();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 埋点透传参数
     * </pre>
     *
     * <code>string extends = 3;</code>
     * @param value The bytes for extends to set.
     * @return This builder for chaining.
     */
    public Builder setExtendsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extends_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v2.Report)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v2.Report)
  private static final bilibili.pgc.gateway.player.v2.Report DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v2.Report();
  }

  public static bilibili.pgc.gateway.player.v2.Report getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Report>
      PARSER = new com.google.protobuf.AbstractParser<Report>() {
    @java.lang.Override
    public Report parsePartialFrom(
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

  public static com.google.protobuf.Parser<Report> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Report> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.Report getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

