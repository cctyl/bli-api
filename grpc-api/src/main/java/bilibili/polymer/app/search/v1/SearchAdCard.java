// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.SearchAdCard}
 */
public final class SearchAdCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.SearchAdCard)
    SearchAdCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchAdCard.newBuilder() to construct.
  private SearchAdCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchAdCard() {
    jsonStr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchAdCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchAdCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchAdCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.SearchAdCard.class, bilibili.polymer.app.search.v1.SearchAdCard.Builder.class);
  }

  public static final int JSON_STR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jsonStr_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string json_str = 1;</code>
   * @return The jsonStr.
   */
  @java.lang.Override
  public java.lang.String getJsonStr() {
    java.lang.Object ref = jsonStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jsonStr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string json_str = 1;</code>
   * @return The bytes for jsonStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJsonStrBytes() {
    java.lang.Object ref = jsonStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jsonStr_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonStr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jsonStr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonStr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jsonStr_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.SearchAdCard)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.SearchAdCard other = (bilibili.polymer.app.search.v1.SearchAdCard) obj;

    if (!getJsonStr()
        .equals(other.getJsonStr())) return false;
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
    hash = (37 * hash) + JSON_STR_FIELD_NUMBER;
    hash = (53 * hash) + getJsonStr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchAdCard parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.SearchAdCard prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.SearchAdCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.SearchAdCard)
      bilibili.polymer.app.search.v1.SearchAdCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchAdCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchAdCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.SearchAdCard.class, bilibili.polymer.app.search.v1.SearchAdCard.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.SearchAdCard.newBuilder()
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
      jsonStr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchAdCard_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchAdCard getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.SearchAdCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchAdCard build() {
      bilibili.polymer.app.search.v1.SearchAdCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchAdCard buildPartial() {
      bilibili.polymer.app.search.v1.SearchAdCard result = new bilibili.polymer.app.search.v1.SearchAdCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.SearchAdCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.jsonStr_ = jsonStr_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.SearchAdCard) {
        return mergeFrom((bilibili.polymer.app.search.v1.SearchAdCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.SearchAdCard other) {
      if (other == bilibili.polymer.app.search.v1.SearchAdCard.getDefaultInstance()) return this;
      if (!other.getJsonStr().isEmpty()) {
        jsonStr_ = other.jsonStr_;
        bitField0_ |= 0x00000001;
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
              jsonStr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object jsonStr_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string json_str = 1;</code>
     * @return The jsonStr.
     */
    public java.lang.String getJsonStr() {
      java.lang.Object ref = jsonStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string json_str = 1;</code>
     * @return The bytes for jsonStr.
     */
    public com.google.protobuf.ByteString
        getJsonStrBytes() {
      java.lang.Object ref = jsonStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string json_str = 1;</code>
     * @param value The jsonStr to set.
     * @return This builder for chaining.
     */
    public Builder setJsonStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jsonStr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string json_str = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsonStr() {
      jsonStr_ = getDefaultInstance().getJsonStr();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string json_str = 1;</code>
     * @param value The bytes for jsonStr to set.
     * @return This builder for chaining.
     */
    public Builder setJsonStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jsonStr_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.SearchAdCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.SearchAdCard)
  private static final bilibili.polymer.app.search.v1.SearchAdCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.SearchAdCard();
  }

  public static bilibili.polymer.app.search.v1.SearchAdCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAdCard>
      PARSER = new com.google.protobuf.AbstractParser<SearchAdCard>() {
    @java.lang.Override
    public SearchAdCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchAdCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAdCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.SearchAdCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
