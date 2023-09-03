// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.GuideBarInfo}
 */
public final class GuideBarInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.GuideBarInfo)
    GuideBarInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuideBarInfo.newBuilder() to construct.
  private GuideBarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuideBarInfo() {
    desc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuideBarInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_GuideBarInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_GuideBarInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.GuideBarInfo.class, bilibili.app.dynamic.v2.GuideBarInfo.Builder.class);
  }

  public static final int SHOW_FIELD_NUMBER = 1;
  private int show_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 show = 1;</code>
   * @return The show.
   */
  @java.lang.Override
  public int getShow() {
    return show_;
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private int page_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 page = 2;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int POSITION_FIELD_NUMBER = 3;
  private int position_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 position = 3;</code>
   * @return The position.
   */
  @java.lang.Override
  public int getPosition() {
    return position_;
  }

  public static final int DESC_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object desc_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 4;</code>
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
   * <code>string desc = 4;</code>
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

  public static final int JUMP_PAGE_FIELD_NUMBER = 5;
  private int jumpPage_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 jump_page = 5;</code>
   * @return The jumpPage.
   */
  @java.lang.Override
  public int getJumpPage() {
    return jumpPage_;
  }

  public static final int JUMP_POSITION_FIELD_NUMBER = 6;
  private int jumpPosition_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 jump_position = 6;</code>
   * @return The jumpPosition.
   */
  @java.lang.Override
  public int getJumpPosition() {
    return jumpPosition_;
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
    if (show_ != 0) {
      output.writeInt32(1, show_);
    }
    if (page_ != 0) {
      output.writeInt32(2, page_);
    }
    if (position_ != 0) {
      output.writeInt32(3, position_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, desc_);
    }
    if (jumpPage_ != 0) {
      output.writeInt32(5, jumpPage_);
    }
    if (jumpPosition_ != 0) {
      output.writeInt32(6, jumpPosition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (show_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, show_);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, page_);
    }
    if (position_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, position_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, desc_);
    }
    if (jumpPage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, jumpPage_);
    }
    if (jumpPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, jumpPosition_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.GuideBarInfo)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.GuideBarInfo other = (bilibili.app.dynamic.v2.GuideBarInfo) obj;

    if (getShow()
        != other.getShow()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getPosition()
        != other.getPosition()) return false;
    if (!getDesc()
        .equals(other.getDesc())) return false;
    if (getJumpPage()
        != other.getJumpPage()) return false;
    if (getJumpPosition()
        != other.getJumpPosition()) return false;
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
    hash = (37 * hash) + SHOW_FIELD_NUMBER;
    hash = (53 * hash) + getShow();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getPosition();
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + JUMP_PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getJumpPage();
    hash = (37 * hash) + JUMP_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getJumpPosition();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.GuideBarInfo parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.GuideBarInfo prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.GuideBarInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.GuideBarInfo)
      bilibili.app.dynamic.v2.GuideBarInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_GuideBarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_GuideBarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.GuideBarInfo.class, bilibili.app.dynamic.v2.GuideBarInfo.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.GuideBarInfo.newBuilder()
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
      show_ = 0;
      page_ = 0;
      position_ = 0;
      desc_ = "";
      jumpPage_ = 0;
      jumpPosition_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_GuideBarInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.GuideBarInfo getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.GuideBarInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.GuideBarInfo build() {
      bilibili.app.dynamic.v2.GuideBarInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.GuideBarInfo buildPartial() {
      bilibili.app.dynamic.v2.GuideBarInfo result = new bilibili.app.dynamic.v2.GuideBarInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.GuideBarInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.show_ = show_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.position_ = position_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.desc_ = desc_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.jumpPage_ = jumpPage_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.jumpPosition_ = jumpPosition_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.GuideBarInfo) {
        return mergeFrom((bilibili.app.dynamic.v2.GuideBarInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.GuideBarInfo other) {
      if (other == bilibili.app.dynamic.v2.GuideBarInfo.getDefaultInstance()) return this;
      if (other.getShow() != 0) {
        setShow(other.getShow());
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getPosition() != 0) {
        setPosition(other.getPosition());
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getJumpPage() != 0) {
        setJumpPage(other.getJumpPage());
      }
      if (other.getJumpPosition() != 0) {
        setJumpPosition(other.getJumpPosition());
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
              show_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              page_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              position_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              desc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              jumpPage_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              jumpPosition_ = input.readInt32();
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

    private int show_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 show = 1;</code>
     * @return The show.
     */
    @java.lang.Override
    public int getShow() {
      return show_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 show = 1;</code>
     * @param value The show to set.
     * @return This builder for chaining.
     */
    public Builder setShow(int value) {

      show_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 show = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      show_ = 0;
      onChanged();
      return this;
    }

    private int page_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {

      page_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 page = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = 0;
      onChanged();
      return this;
    }

    private int position_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 position = 3;</code>
     * @return The position.
     */
    @java.lang.Override
    public int getPosition() {
      return position_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 position = 3;</code>
     * @param value The position to set.
     * @return This builder for chaining.
     */
    public Builder setPosition(int value) {

      position_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 position = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosition() {
      bitField0_ = (bitField0_ & ~0x00000004);
      position_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object desc_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
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
     * <code>string desc = 4;</code>
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
     * <code>string desc = 4;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      desc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      desc_ = getDefaultInstance().getDesc();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string desc = 4;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      desc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int jumpPage_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_page = 5;</code>
     * @return The jumpPage.
     */
    @java.lang.Override
    public int getJumpPage() {
      return jumpPage_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_page = 5;</code>
     * @param value The jumpPage to set.
     * @return This builder for chaining.
     */
    public Builder setJumpPage(int value) {

      jumpPage_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_page = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpPage() {
      bitField0_ = (bitField0_ & ~0x00000010);
      jumpPage_ = 0;
      onChanged();
      return this;
    }

    private int jumpPosition_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_position = 6;</code>
     * @return The jumpPosition.
     */
    @java.lang.Override
    public int getJumpPosition() {
      return jumpPosition_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_position = 6;</code>
     * @param value The jumpPosition to set.
     * @return This builder for chaining.
     */
    public Builder setJumpPosition(int value) {

      jumpPosition_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 jump_position = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpPosition() {
      bitField0_ = (bitField0_ & ~0x00000020);
      jumpPosition_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.GuideBarInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.GuideBarInfo)
  private static final bilibili.app.dynamic.v2.GuideBarInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.GuideBarInfo();
  }

  public static bilibili.app.dynamic.v2.GuideBarInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuideBarInfo>
      PARSER = new com.google.protobuf.AbstractParser<GuideBarInfo>() {
    @java.lang.Override
    public GuideBarInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuideBarInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuideBarInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.GuideBarInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

