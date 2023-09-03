// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.community.service.dm.v1.Label}
 */
public final class Label extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.community.service.dm.v1.Label)
    LabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Label.newBuilder() to construct.
  private Label(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Label() {
    title_ = "";
    content_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Label();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_Label_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_Label_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.community.service.dm.v1.Label.class, bilibili.community.service.dm.v1.Label.Builder.class);
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

  public static final int CONTENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList content_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @return A list containing the content.
   */
  public com.google.protobuf.ProtocolStringList
      getContentList() {
    return content_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @return The count of content.
   */
  public int getContentCount() {
    return content_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @param index The index of the element to return.
   * @return The content at the given index.
   */
  public java.lang.String getContent(int index) {
    return content_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the content at the given index.
   */
  public com.google.protobuf.ByteString
      getContentBytes(int index) {
    return content_.getByteString(index);
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
    for (int i = 0; i < content_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < content_.size(); i++) {
        dataSize += computeStringSizeNoTag(content_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContentList().size();
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
    if (!(obj instanceof bilibili.community.service.dm.v1.Label)) {
      return super.equals(obj);
    }
    bilibili.community.service.dm.v1.Label other = (bilibili.community.service.dm.v1.Label) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getContentList()
        .equals(other.getContentList())) return false;
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
    if (getContentCount() > 0) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContentList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.community.service.dm.v1.Label parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.Label parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.Label parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.Label parseFrom(
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
  public static Builder newBuilder(bilibili.community.service.dm.v1.Label prototype) {
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
   * Protobuf type {@code bilibili.community.service.dm.v1.Label}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.community.service.dm.v1.Label)
      bilibili.community.service.dm.v1.LabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_Label_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_Label_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.community.service.dm.v1.Label.class, bilibili.community.service.dm.v1.Label.Builder.class);
    }

    // Construct using bilibili.community.service.dm.v1.Label.newBuilder()
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
      content_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_Label_descriptor;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.Label getDefaultInstanceForType() {
      return bilibili.community.service.dm.v1.Label.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.Label build() {
      bilibili.community.service.dm.v1.Label result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.Label buildPartial() {
      bilibili.community.service.dm.v1.Label result = new bilibili.community.service.dm.v1.Label(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.community.service.dm.v1.Label result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        content_.makeImmutable();
        result.content_ = content_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.community.service.dm.v1.Label) {
        return mergeFrom((bilibili.community.service.dm.v1.Label)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.community.service.dm.v1.Label other) {
      if (other == bilibili.community.service.dm.v1.Label.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.content_.isEmpty()) {
        if (content_.isEmpty()) {
          content_ = other.content_;
          bitField0_ |= 0x00000002;
        } else {
          ensureContentIsMutable();
          content_.addAll(other.content_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureContentIsMutable();
              content_.add(s);
              break;
            } // case 18
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

    private com.google.protobuf.LazyStringArrayList content_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureContentIsMutable() {
      if (!content_.isModifiable()) {
        content_ = new com.google.protobuf.LazyStringArrayList(content_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @return A list containing the content.
     */
    public com.google.protobuf.ProtocolStringList
        getContentList() {
      content_.makeImmutable();
      return content_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @return The count of content.
     */
    public int getContentCount() {
      return content_.size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param index The index of the element to return.
     * @return The content at the given index.
     */
    public java.lang.String getContent(int index) {
      return content_.get(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the content at the given index.
     */
    public com.google.protobuf.ByteString
        getContentBytes(int index) {
      return content_.getByteString(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param index The index to set the value at.
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureContentIsMutable();
      content_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param value The content to add.
     * @return This builder for chaining.
     */
    public Builder addContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureContentIsMutable();
      content_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param values The content to add.
     * @return This builder for chaining.
     */
    public Builder addAllContent(
        java.lang.Iterable<java.lang.String> values) {
      ensureContentIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, content_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string content = 2;</code>
     * @param value The bytes of the content to add.
     * @return This builder for chaining.
     */
    public Builder addContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureContentIsMutable();
      content_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.community.service.dm.v1.Label)
  }

  // @@protoc_insertion_point(class_scope:bilibili.community.service.dm.v1.Label)
  private static final bilibili.community.service.dm.v1.Label DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.community.service.dm.v1.Label();
  }

  public static bilibili.community.service.dm.v1.Label getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Label>
      PARSER = new com.google.protobuf.AbstractParser<Label>() {
    @java.lang.Override
    public Label parsePartialFrom(
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

  public static com.google.protobuf.Parser<Label> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Label> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.community.service.dm.v1.Label getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
