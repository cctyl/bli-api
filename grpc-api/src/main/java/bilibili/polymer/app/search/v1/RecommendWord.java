// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.RecommendWord}
 */
public final class RecommendWord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.RecommendWord)
    RecommendWordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecommendWord.newBuilder() to construct.
  private RecommendWord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecommendWord() {
    param_ = "";
    type_ = "";
    title_ = "";
    fromSource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecommendWord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_RecommendWord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_RecommendWord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.RecommendWord.class, bilibili.polymer.app.search.v1.RecommendWord.Builder.class);
  }

  public static final int PARAM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object param_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string param = 1;</code>
   * @return The param.
   */
  @java.lang.Override
  public java.lang.String getParam() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      param_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string param = 1;</code>
   * @return The bytes for param.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParamBytes() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      param_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 3;</code>
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
   * <code>string title = 3;</code>
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

  public static final int FROM_SOURCE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromSource_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_source = 4;</code>
   * @return The fromSource.
   */
  @java.lang.Override
  public java.lang.String getFromSource() {
    java.lang.Object ref = fromSource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromSource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_source = 4;</code>
   * @return The bytes for fromSource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromSourceBytes() {
    java.lang.Object ref = fromSource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromSource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(param_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, param_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fromSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(param_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, param_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fromSource_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.RecommendWord)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.RecommendWord other = (bilibili.polymer.app.search.v1.RecommendWord) obj;

    if (!getParam()
        .equals(other.getParam())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getFromSource()
        .equals(other.getFromSource())) return false;
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
    hash = (37 * hash) + PARAM_FIELD_NUMBER;
    hash = (53 * hash) + getParam().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + FROM_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getFromSource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.RecommendWord parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.RecommendWord prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.RecommendWord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.RecommendWord)
      bilibili.polymer.app.search.v1.RecommendWordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_RecommendWord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_RecommendWord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.RecommendWord.class, bilibili.polymer.app.search.v1.RecommendWord.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.RecommendWord.newBuilder()
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
      param_ = "";
      type_ = "";
      title_ = "";
      fromSource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_RecommendWord_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.RecommendWord getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.RecommendWord.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.RecommendWord build() {
      bilibili.polymer.app.search.v1.RecommendWord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.RecommendWord buildPartial() {
      bilibili.polymer.app.search.v1.RecommendWord result = new bilibili.polymer.app.search.v1.RecommendWord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.RecommendWord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.param_ = param_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fromSource_ = fromSource_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.RecommendWord) {
        return mergeFrom((bilibili.polymer.app.search.v1.RecommendWord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.RecommendWord other) {
      if (other == bilibili.polymer.app.search.v1.RecommendWord.getDefaultInstance()) return this;
      if (!other.getParam().isEmpty()) {
        param_ = other.param_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getFromSource().isEmpty()) {
        fromSource_ = other.fromSource_;
        bitField0_ |= 0x00000008;
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
              param_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              fromSource_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object param_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string param = 1;</code>
     * @return The param.
     */
    public java.lang.String getParam() {
      java.lang.Object ref = param_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string param = 1;</code>
     * @return The bytes for param.
     */
    public com.google.protobuf.ByteString
        getParamBytes() {
      java.lang.Object ref = param_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string param = 1;</code>
     * @param value The param to set.
     * @return This builder for chaining.
     */
    public Builder setParam(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      param_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string param = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam() {
      param_ = getDefaultInstance().getParam();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string param = 1;</code>
     * @param value The bytes for param to set.
     * @return This builder for chaining.
     */
    public Builder setParamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      param_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 3;</code>
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
     * <code>string title = 3;</code>
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
     * <code>string title = 3;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 3;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object fromSource_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_source = 4;</code>
     * @return The fromSource.
     */
    public java.lang.String getFromSource() {
      java.lang.Object ref = fromSource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromSource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_source = 4;</code>
     * @return The bytes for fromSource.
     */
    public com.google.protobuf.ByteString
        getFromSourceBytes() {
      java.lang.Object ref = fromSource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromSource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_source = 4;</code>
     * @param value The fromSource to set.
     * @return This builder for chaining.
     */
    public Builder setFromSource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromSource_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_source = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromSource() {
      fromSource_ = getDefaultInstance().getFromSource();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_source = 4;</code>
     * @param value The bytes for fromSource to set.
     * @return This builder for chaining.
     */
    public Builder setFromSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromSource_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.RecommendWord)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.RecommendWord)
  private static final bilibili.polymer.app.search.v1.RecommendWord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.RecommendWord();
  }

  public static bilibili.polymer.app.search.v1.RecommendWord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendWord>
      PARSER = new com.google.protobuf.AbstractParser<RecommendWord>() {
    @java.lang.Override
    public RecommendWord parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecommendWord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendWord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.RecommendWord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
