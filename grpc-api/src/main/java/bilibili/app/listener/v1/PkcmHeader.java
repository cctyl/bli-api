// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.PkcmHeader}
 */
public final class PkcmHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.PkcmHeader)
    PkcmHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PkcmHeader.newBuilder() to construct.
  private PkcmHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PkcmHeader() {
    title_ = "";
    desc_ = "";
    btnIcon_ = "";
    btnText_ = "";
    btnUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PkcmHeader();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PkcmHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PkcmHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.PkcmHeader.class, bilibili.app.listener.v1.PkcmHeader.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
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
   * <code>string title = 1;</code>
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

  public static final int DESC_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  @java.lang.Override
  public java.lang.String getDesc() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescBytes() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BTN_ICON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object btnIcon_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_icon = 3;</code>
   * @return The btnIcon.
   */
  @java.lang.Override
  public java.lang.String getBtnIcon() {
    java.lang.Object ref = btnIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      btnIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_icon = 3;</code>
   * @return The bytes for btnIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBtnIconBytes() {
    java.lang.Object ref = btnIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      btnIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BTN_TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object btnText_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_text = 4;</code>
   * @return The btnText.
   */
  @java.lang.Override
  public java.lang.String getBtnText() {
    java.lang.Object ref = btnText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      btnText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_text = 4;</code>
   * @return The bytes for btnText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBtnTextBytes() {
    java.lang.Object ref = btnText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      btnText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BTN_URI_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object btnUri_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_uri = 5;</code>
   * @return The btnUri.
   */
  @java.lang.Override
  public java.lang.String getBtnUri() {
    java.lang.Object ref = btnUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      btnUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string btn_uri = 5;</code>
   * @return The bytes for btnUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBtnUriBytes() {
    java.lang.Object ref = btnUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      btnUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnIcon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, btnIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, btnText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, btnUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnIcon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, btnIcon_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, btnText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(btnUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, btnUri_);
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
    if (!(obj instanceof bilibili.app.listener.v1.PkcmHeader)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.PkcmHeader other = (bilibili.app.listener.v1.PkcmHeader) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDesc()
        .equals(other.getDesc())) return false;
    if (!getBtnIcon()
        .equals(other.getBtnIcon())) return false;
    if (!getBtnText()
        .equals(other.getBtnText())) return false;
    if (!getBtnUri()
        .equals(other.getBtnUri())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + BTN_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getBtnIcon().hashCode();
    hash = (37 * hash) + BTN_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getBtnText().hashCode();
    hash = (37 * hash) + BTN_URI_FIELD_NUMBER;
    hash = (53 * hash) + getBtnUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PkcmHeader parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.PkcmHeader prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.PkcmHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.PkcmHeader)
      bilibili.app.listener.v1.PkcmHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PkcmHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PkcmHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.PkcmHeader.class, bilibili.app.listener.v1.PkcmHeader.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.PkcmHeader.newBuilder()
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
      title_ = "";
      desc_ = "";
      btnIcon_ = "";
      btnText_ = "";
      btnUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PkcmHeader_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PkcmHeader getDefaultInstanceForType() {
      return bilibili.app.listener.v1.PkcmHeader.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PkcmHeader build() {
      bilibili.app.listener.v1.PkcmHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PkcmHeader buildPartial() {
      bilibili.app.listener.v1.PkcmHeader result = new bilibili.app.listener.v1.PkcmHeader(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.PkcmHeader result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.desc_ = desc_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.btnIcon_ = btnIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.btnText_ = btnText_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.btnUri_ = btnUri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.PkcmHeader) {
        return mergeFrom((bilibili.app.listener.v1.PkcmHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.PkcmHeader other) {
      if (other == bilibili.app.listener.v1.PkcmHeader.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBtnIcon().isEmpty()) {
        btnIcon_ = other.btnIcon_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getBtnText().isEmpty()) {
        btnText_ = other.btnText_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getBtnUri().isEmpty()) {
        btnUri_ = other.btnUri_;
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
            case 10: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              desc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              btnIcon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              btnText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              btnUri_ = input.readStringRequireUtf8();
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 1;</code>
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
     * <code>string title = 1;</code>
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
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object desc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return The desc.
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return The bytes for desc.
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      desc_ = getDefaultInstance().getDesc();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object btnIcon_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_icon = 3;</code>
     * @return The btnIcon.
     */
    public java.lang.String getBtnIcon() {
      java.lang.Object ref = btnIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        btnIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_icon = 3;</code>
     * @return The bytes for btnIcon.
     */
    public com.google.protobuf.ByteString
        getBtnIconBytes() {
      java.lang.Object ref = btnIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        btnIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_icon = 3;</code>
     * @param value The btnIcon to set.
     * @return This builder for chaining.
     */
    public Builder setBtnIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      btnIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_icon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBtnIcon() {
      btnIcon_ = getDefaultInstance().getBtnIcon();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_icon = 3;</code>
     * @param value The bytes for btnIcon to set.
     * @return This builder for chaining.
     */
    public Builder setBtnIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      btnIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object btnText_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return The btnText.
     */
    public java.lang.String getBtnText() {
      java.lang.Object ref = btnText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        btnText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return The bytes for btnText.
     */
    public com.google.protobuf.ByteString
        getBtnTextBytes() {
      java.lang.Object ref = btnText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        btnText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @param value The btnText to set.
     * @return This builder for chaining.
     */
    public Builder setBtnText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      btnText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBtnText() {
      btnText_ = getDefaultInstance().getBtnText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_text = 4;</code>
     * @param value The bytes for btnText to set.
     * @return This builder for chaining.
     */
    public Builder setBtnTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      btnText_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object btnUri_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_uri = 5;</code>
     * @return The btnUri.
     */
    public java.lang.String getBtnUri() {
      java.lang.Object ref = btnUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        btnUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_uri = 5;</code>
     * @return The bytes for btnUri.
     */
    public com.google.protobuf.ByteString
        getBtnUriBytes() {
      java.lang.Object ref = btnUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        btnUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_uri = 5;</code>
     * @param value The btnUri to set.
     * @return This builder for chaining.
     */
    public Builder setBtnUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      btnUri_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_uri = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBtnUri() {
      btnUri_ = getDefaultInstance().getBtnUri();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string btn_uri = 5;</code>
     * @param value The bytes for btnUri to set.
     * @return This builder for chaining.
     */
    public Builder setBtnUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      btnUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.PkcmHeader)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.PkcmHeader)
  private static final bilibili.app.listener.v1.PkcmHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.PkcmHeader();
  }

  public static bilibili.app.listener.v1.PkcmHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PkcmHeader>
      PARSER = new com.google.protobuf.AbstractParser<PkcmHeader>() {
    @java.lang.Override
    public PkcmHeader parsePartialFrom(
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

  public static com.google.protobuf.Parser<PkcmHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PkcmHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.PkcmHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

