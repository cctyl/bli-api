// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/search.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 获取搜索建议-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.SuggestionResult3Req}
 */
public final class SuggestionResult3Req extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.SuggestionResult3Req)
    SuggestionResult3ReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestionResult3Req.newBuilder() to construct.
  private SuggestionResult3Req(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestionResult3Req() {
    keyword_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestionResult3Req();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Req_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.SuggestionResult3Req.class, bilibili.app.interface.v1.SuggestionResult3Req.Builder.class);
  }

  public static final int KEYWORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyword_ = "";
  /**
   * <pre>
   * 关键字
   * </pre>
   *
   * <code>string keyword = 1;</code>
   * @return The keyword.
   */
  @java.lang.Override
  public java.lang.String getKeyword() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyword_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 关键字
   * </pre>
   *
   * <code>string keyword = 1;</code>
   * @return The bytes for keyword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordBytes() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIGHLIGHT_FIELD_NUMBER = 2;
  private int highlight_ = 0;
  /**
   * <pre>
   * 是否语法高亮
   * 0:不显示 1:显示
   * </pre>
   *
   * <code>int32 highlight = 2;</code>
   * @return The highlight.
   */
  @java.lang.Override
  public int getHighlight() {
    return highlight_;
  }

  public static final int TEENAGERS_MODE_FIELD_NUMBER = 3;
  private int teenagersMode_ = 0;
  /**
   * <pre>
   * 是否青少年模式
   * 1:开启青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 3;</code>
   * @return The teenagersMode.
   */
  @java.lang.Override
  public int getTeenagersMode() {
    return teenagersMode_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyword_);
    }
    if (highlight_ != 0) {
      output.writeInt32(2, highlight_);
    }
    if (teenagersMode_ != 0) {
      output.writeInt32(3, teenagersMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyword_);
    }
    if (highlight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, highlight_);
    }
    if (teenagersMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, teenagersMode_);
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
    if (!(obj instanceof bilibili.app.interface.v1.SuggestionResult3Req)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.SuggestionResult3Req other = (bilibili.app.interface.v1.SuggestionResult3Req) obj;

    if (!getKeyword()
        .equals(other.getKeyword())) return false;
    if (getHighlight()
        != other.getHighlight()) return false;
    if (getTeenagersMode()
        != other.getTeenagersMode()) return false;
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
    hash = (37 * hash) + KEYWORD_FIELD_NUMBER;
    hash = (53 * hash) + getKeyword().hashCode();
    hash = (37 * hash) + HIGHLIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHighlight();
    hash = (37 * hash) + TEENAGERS_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getTeenagersMode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Req parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.SuggestionResult3Req prototype) {
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
   * 获取搜索建议-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.SuggestionResult3Req}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.SuggestionResult3Req)
      bilibili.app.interface.v1.SuggestionResult3ReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Req_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.SuggestionResult3Req.class, bilibili.app.interface.v1.SuggestionResult3Req.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.SuggestionResult3Req.newBuilder()
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
      keyword_ = "";
      highlight_ = 0;
      teenagersMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Req getDefaultInstanceForType() {
      return bilibili.app.interface.v1.SuggestionResult3Req.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Req build() {
      bilibili.app.interface.v1.SuggestionResult3Req result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Req buildPartial() {
      bilibili.app.interface.v1.SuggestionResult3Req result = new bilibili.app.interface.v1.SuggestionResult3Req(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.SuggestionResult3Req result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyword_ = keyword_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.highlight_ = highlight_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.teenagersMode_ = teenagersMode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.SuggestionResult3Req) {
        return mergeFrom((bilibili.app.interface.v1.SuggestionResult3Req)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.SuggestionResult3Req other) {
      if (other == bilibili.app.interface.v1.SuggestionResult3Req.getDefaultInstance()) return this;
      if (!other.getKeyword().isEmpty()) {
        keyword_ = other.keyword_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getHighlight() != 0) {
        setHighlight(other.getHighlight());
      }
      if (other.getTeenagersMode() != 0) {
        setTeenagersMode(other.getTeenagersMode());
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
              keyword_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              highlight_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              teenagersMode_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object keyword_ = "";
    /**
     * <pre>
     * 关键字
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return The keyword.
     */
    public java.lang.String getKeyword() {
      java.lang.Object ref = keyword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 关键字
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return The bytes for keyword.
     */
    public com.google.protobuf.ByteString
        getKeywordBytes() {
      java.lang.Object ref = keyword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 关键字
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @param value The keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeyword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyword_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关键字
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyword() {
      keyword_ = getDefaultInstance().getKeyword();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关键字
     * </pre>
     *
     * <code>string keyword = 1;</code>
     * @param value The bytes for keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyword_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int highlight_ ;
    /**
     * <pre>
     * 是否语法高亮
     * 0:不显示 1:显示
     * </pre>
     *
     * <code>int32 highlight = 2;</code>
     * @return The highlight.
     */
    @java.lang.Override
    public int getHighlight() {
      return highlight_;
    }
    /**
     * <pre>
     * 是否语法高亮
     * 0:不显示 1:显示
     * </pre>
     *
     * <code>int32 highlight = 2;</code>
     * @param value The highlight to set.
     * @return This builder for chaining.
     */
    public Builder setHighlight(int value) {

      highlight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否语法高亮
     * 0:不显示 1:显示
     * </pre>
     *
     * <code>int32 highlight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighlight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      highlight_ = 0;
      onChanged();
      return this;
    }

    private int teenagersMode_ ;
    /**
     * <pre>
     * 是否青少年模式
     * 1:开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 3;</code>
     * @return The teenagersMode.
     */
    @java.lang.Override
    public int getTeenagersMode() {
      return teenagersMode_;
    }
    /**
     * <pre>
     * 是否青少年模式
     * 1:开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 3;</code>
     * @param value The teenagersMode to set.
     * @return This builder for chaining.
     */
    public Builder setTeenagersMode(int value) {

      teenagersMode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否青少年模式
     * 1:开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeenagersMode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      teenagersMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.SuggestionResult3Req)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.SuggestionResult3Req)
  private static final bilibili.app.interface.v1.SuggestionResult3Req DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.SuggestionResult3Req();
  }

  public static bilibili.app.interface.v1.SuggestionResult3Req getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestionResult3Req>
      PARSER = new com.google.protobuf.AbstractParser<SuggestionResult3Req>() {
    @java.lang.Override
    public SuggestionResult3Req parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestionResult3Req> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestionResult3Req> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.SuggestionResult3Req getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
