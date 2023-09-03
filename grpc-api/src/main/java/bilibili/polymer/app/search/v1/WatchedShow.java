// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.WatchedShow}
 */
public final class WatchedShow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.WatchedShow)
    WatchedShowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WatchedShow.newBuilder() to construct.
  private WatchedShow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WatchedShow() {
    textSmall_ = "";
    textLarge_ = "";
    icon_ = "";
    iconLocation_ = "";
    iconWeb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WatchedShow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_WatchedShow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_WatchedShow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.WatchedShow.class, bilibili.polymer.app.search.v1.WatchedShow.Builder.class);
  }

  public static final int SWITCH_FIELD_NUMBER = 1;
  private boolean switch_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool switch = 1;</code>
   * @return The switch.
   */
  @java.lang.Override
  public boolean getSwitch() {
    return switch_;
  }

  public static final int NUM_FIELD_NUMBER = 2;
  private long num_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 num = 2;</code>
   * @return The num.
   */
  @java.lang.Override
  public long getNum() {
    return num_;
  }

  public static final int TEXT_SMALL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object textSmall_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_small = 3;</code>
   * @return The textSmall.
   */
  @java.lang.Override
  public java.lang.String getTextSmall() {
    java.lang.Object ref = textSmall_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      textSmall_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_small = 3;</code>
   * @return The bytes for textSmall.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextSmallBytes() {
    java.lang.Object ref = textSmall_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      textSmall_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_LARGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object textLarge_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_large = 4;</code>
   * @return The textLarge.
   */
  @java.lang.Override
  public java.lang.String getTextLarge() {
    java.lang.Object ref = textLarge_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      textLarge_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string text_large = 4;</code>
   * @return The bytes for textLarge.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextLargeBytes() {
    java.lang.Object ref = textLarge_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      textLarge_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 5;</code>
   * @return The icon.
   */
  @java.lang.Override
  public java.lang.String getIcon() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      icon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 5;</code>
   * @return The bytes for icon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconBytes() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      icon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_LOCATION_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iconLocation_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon_location = 6;</code>
   * @return The iconLocation.
   */
  @java.lang.Override
  public java.lang.String getIconLocation() {
    java.lang.Object ref = iconLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iconLocation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon_location = 6;</code>
   * @return The bytes for iconLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconLocationBytes() {
    java.lang.Object ref = iconLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iconLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_WEB_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iconWeb_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon_web = 7;</code>
   * @return The iconWeb.
   */
  @java.lang.Override
  public java.lang.String getIconWeb() {
    java.lang.Object ref = iconWeb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iconWeb_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon_web = 7;</code>
   * @return The bytes for iconWeb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconWebBytes() {
    java.lang.Object ref = iconWeb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iconWeb_ = b;
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
    if (switch_ != false) {
      output.writeBool(1, switch_);
    }
    if (num_ != 0L) {
      output.writeInt64(2, num_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textSmall_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, textSmall_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textLarge_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, textLarge_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconLocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, iconLocation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconWeb_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, iconWeb_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (switch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, switch_);
    }
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, num_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textSmall_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, textSmall_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(textLarge_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, textLarge_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, icon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconLocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, iconLocation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iconWeb_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, iconWeb_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.WatchedShow)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.WatchedShow other = (bilibili.polymer.app.search.v1.WatchedShow) obj;

    if (getSwitch()
        != other.getSwitch()) return false;
    if (getNum()
        != other.getNum()) return false;
    if (!getTextSmall()
        .equals(other.getTextSmall())) return false;
    if (!getTextLarge()
        .equals(other.getTextLarge())) return false;
    if (!getIcon()
        .equals(other.getIcon())) return false;
    if (!getIconLocation()
        .equals(other.getIconLocation())) return false;
    if (!getIconWeb()
        .equals(other.getIconWeb())) return false;
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
    hash = (37 * hash) + SWITCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSwitch());
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNum());
    hash = (37 * hash) + TEXT_SMALL_FIELD_NUMBER;
    hash = (53 * hash) + getTextSmall().hashCode();
    hash = (37 * hash) + TEXT_LARGE_FIELD_NUMBER;
    hash = (53 * hash) + getTextLarge().hashCode();
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
    hash = (37 * hash) + ICON_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getIconLocation().hashCode();
    hash = (37 * hash) + ICON_WEB_FIELD_NUMBER;
    hash = (53 * hash) + getIconWeb().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.WatchedShow parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.WatchedShow prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.WatchedShow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.WatchedShow)
      bilibili.polymer.app.search.v1.WatchedShowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_WatchedShow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_WatchedShow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.WatchedShow.class, bilibili.polymer.app.search.v1.WatchedShow.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.WatchedShow.newBuilder()
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
      switch_ = false;
      num_ = 0L;
      textSmall_ = "";
      textLarge_ = "";
      icon_ = "";
      iconLocation_ = "";
      iconWeb_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_WatchedShow_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.WatchedShow getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.WatchedShow.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.WatchedShow build() {
      bilibili.polymer.app.search.v1.WatchedShow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.WatchedShow buildPartial() {
      bilibili.polymer.app.search.v1.WatchedShow result = new bilibili.polymer.app.search.v1.WatchedShow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.WatchedShow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.switch_ = switch_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.num_ = num_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.textSmall_ = textSmall_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.textLarge_ = textLarge_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.icon_ = icon_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.iconLocation_ = iconLocation_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.iconWeb_ = iconWeb_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.WatchedShow) {
        return mergeFrom((bilibili.polymer.app.search.v1.WatchedShow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.WatchedShow other) {
      if (other == bilibili.polymer.app.search.v1.WatchedShow.getDefaultInstance()) return this;
      if (other.getSwitch() != false) {
        setSwitch(other.getSwitch());
      }
      if (other.getNum() != 0L) {
        setNum(other.getNum());
      }
      if (!other.getTextSmall().isEmpty()) {
        textSmall_ = other.textSmall_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getTextLarge().isEmpty()) {
        textLarge_ = other.textLarge_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getIconLocation().isEmpty()) {
        iconLocation_ = other.iconLocation_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (!other.getIconWeb().isEmpty()) {
        iconWeb_ = other.iconWeb_;
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
              switch_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              num_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              textSmall_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              textLarge_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              icon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              iconLocation_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              iconWeb_ = input.readStringRequireUtf8();
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

    private boolean switch_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool switch = 1;</code>
     * @return The switch.
     */
    @java.lang.Override
    public boolean getSwitch() {
      return switch_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool switch = 1;</code>
     * @param value The switch to set.
     * @return This builder for chaining.
     */
    public Builder setSwitch(boolean value) {

      switch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool switch = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSwitch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      switch_ = false;
      onChanged();
      return this;
    }

    private long num_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @return The num.
     */
    @java.lang.Override
    public long getNum() {
      return num_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(long value) {

      num_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      num_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object textSmall_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_small = 3;</code>
     * @return The textSmall.
     */
    public java.lang.String getTextSmall() {
      java.lang.Object ref = textSmall_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textSmall_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_small = 3;</code>
     * @return The bytes for textSmall.
     */
    public com.google.protobuf.ByteString
        getTextSmallBytes() {
      java.lang.Object ref = textSmall_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textSmall_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_small = 3;</code>
     * @param value The textSmall to set.
     * @return This builder for chaining.
     */
    public Builder setTextSmall(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      textSmall_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_small = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextSmall() {
      textSmall_ = getDefaultInstance().getTextSmall();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_small = 3;</code>
     * @param value The bytes for textSmall to set.
     * @return This builder for chaining.
     */
    public Builder setTextSmallBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      textSmall_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object textLarge_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_large = 4;</code>
     * @return The textLarge.
     */
    public java.lang.String getTextLarge() {
      java.lang.Object ref = textLarge_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textLarge_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_large = 4;</code>
     * @return The bytes for textLarge.
     */
    public com.google.protobuf.ByteString
        getTextLargeBytes() {
      java.lang.Object ref = textLarge_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textLarge_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_large = 4;</code>
     * @param value The textLarge to set.
     * @return This builder for chaining.
     */
    public Builder setTextLarge(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      textLarge_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_large = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextLarge() {
      textLarge_ = getDefaultInstance().getTextLarge();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string text_large = 4;</code>
     * @param value The bytes for textLarge to set.
     * @return This builder for chaining.
     */
    public Builder setTextLargeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      textLarge_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object icon_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 5;</code>
     * @return The icon.
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        icon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 5;</code>
     * @return The bytes for icon.
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 5;</code>
     * @param value The icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      icon_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      icon_ = getDefaultInstance().getIcon();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon = 5;</code>
     * @param value The bytes for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      icon_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object iconLocation_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_location = 6;</code>
     * @return The iconLocation.
     */
    public java.lang.String getIconLocation() {
      java.lang.Object ref = iconLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iconLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_location = 6;</code>
     * @return The bytes for iconLocation.
     */
    public com.google.protobuf.ByteString
        getIconLocationBytes() {
      java.lang.Object ref = iconLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iconLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_location = 6;</code>
     * @param value The iconLocation to set.
     * @return This builder for chaining.
     */
    public Builder setIconLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iconLocation_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_location = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIconLocation() {
      iconLocation_ = getDefaultInstance().getIconLocation();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_location = 6;</code>
     * @param value The bytes for iconLocation to set.
     * @return This builder for chaining.
     */
    public Builder setIconLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iconLocation_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object iconWeb_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_web = 7;</code>
     * @return The iconWeb.
     */
    public java.lang.String getIconWeb() {
      java.lang.Object ref = iconWeb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iconWeb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_web = 7;</code>
     * @return The bytes for iconWeb.
     */
    public com.google.protobuf.ByteString
        getIconWebBytes() {
      java.lang.Object ref = iconWeb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iconWeb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_web = 7;</code>
     * @param value The iconWeb to set.
     * @return This builder for chaining.
     */
    public Builder setIconWeb(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iconWeb_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_web = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIconWeb() {
      iconWeb_ = getDefaultInstance().getIconWeb();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string icon_web = 7;</code>
     * @param value The bytes for iconWeb to set.
     * @return This builder for chaining.
     */
    public Builder setIconWebBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iconWeb_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.WatchedShow)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.WatchedShow)
  private static final bilibili.polymer.app.search.v1.WatchedShow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.WatchedShow();
  }

  public static bilibili.polymer.app.search.v1.WatchedShow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WatchedShow>
      PARSER = new com.google.protobuf.AbstractParser<WatchedShow>() {
    @java.lang.Override
    public WatchedShow parsePartialFrom(
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

  public static com.google.protobuf.Parser<WatchedShow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WatchedShow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.WatchedShow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
