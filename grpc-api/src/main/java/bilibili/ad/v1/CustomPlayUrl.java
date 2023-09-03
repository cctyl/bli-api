// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.ad.v1.CustomPlayUrl}
 */
public final class CustomPlayUrl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.ad.v1.CustomPlayUrl)
    CustomPlayUrlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomPlayUrl.newBuilder() to construct.
  private CustomPlayUrl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomPlayUrl() {
    urls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomPlayUrl();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_CustomPlayUrl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_CustomPlayUrl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.ad.v1.CustomPlayUrl.class, bilibili.ad.v1.CustomPlayUrl.Builder.class);
  }

  public static final int PLAY_TIME_FIELD_NUMBER = 1;
  private int playTime_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 play_time = 1;</code>
   * @return The playTime.
   */
  @java.lang.Override
  public int getPlayTime() {
    return playTime_;
  }

  public static final int URLS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList urls_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string urls = 2;</code>
   * @return A list containing the urls.
   */
  public com.google.protobuf.ProtocolStringList
      getUrlsList() {
    return urls_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string urls = 2;</code>
   * @return The count of urls.
   */
  public int getUrlsCount() {
    return urls_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string urls = 2;</code>
   * @param index The index of the element to return.
   * @return The urls at the given index.
   */
  public java.lang.String getUrls(int index) {
    return urls_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string urls = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the urls at the given index.
   */
  public com.google.protobuf.ByteString
      getUrlsBytes(int index) {
    return urls_.getByteString(index);
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
    if (playTime_ != 0) {
      output.writeInt32(1, playTime_);
    }
    for (int i = 0; i < urls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, urls_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, playTime_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < urls_.size(); i++) {
        dataSize += computeStringSizeNoTag(urls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrlsList().size();
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
    if (!(obj instanceof bilibili.ad.v1.CustomPlayUrl)) {
      return super.equals(obj);
    }
    bilibili.ad.v1.CustomPlayUrl other = (bilibili.ad.v1.CustomPlayUrl) obj;

    if (getPlayTime()
        != other.getPlayTime()) return false;
    if (!getUrlsList()
        .equals(other.getUrlsList())) return false;
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
    hash = (37 * hash) + PLAY_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getPlayTime();
    if (getUrlsCount() > 0) {
      hash = (37 * hash) + URLS_FIELD_NUMBER;
      hash = (53 * hash) + getUrlsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.CustomPlayUrl parseFrom(
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
  public static Builder newBuilder(bilibili.ad.v1.CustomPlayUrl prototype) {
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
   * Protobuf type {@code bilibili.ad.v1.CustomPlayUrl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.ad.v1.CustomPlayUrl)
      bilibili.ad.v1.CustomPlayUrlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_CustomPlayUrl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_CustomPlayUrl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.ad.v1.CustomPlayUrl.class, bilibili.ad.v1.CustomPlayUrl.Builder.class);
    }

    // Construct using bilibili.ad.v1.CustomPlayUrl.newBuilder()
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
      playTime_ = 0;
      urls_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_CustomPlayUrl_descriptor;
    }

    @java.lang.Override
    public bilibili.ad.v1.CustomPlayUrl getDefaultInstanceForType() {
      return bilibili.ad.v1.CustomPlayUrl.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.ad.v1.CustomPlayUrl build() {
      bilibili.ad.v1.CustomPlayUrl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.ad.v1.CustomPlayUrl buildPartial() {
      bilibili.ad.v1.CustomPlayUrl result = new bilibili.ad.v1.CustomPlayUrl(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.ad.v1.CustomPlayUrl result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.playTime_ = playTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        urls_.makeImmutable();
        result.urls_ = urls_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.ad.v1.CustomPlayUrl) {
        return mergeFrom((bilibili.ad.v1.CustomPlayUrl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.ad.v1.CustomPlayUrl other) {
      if (other == bilibili.ad.v1.CustomPlayUrl.getDefaultInstance()) return this;
      if (other.getPlayTime() != 0) {
        setPlayTime(other.getPlayTime());
      }
      if (!other.urls_.isEmpty()) {
        if (urls_.isEmpty()) {
          urls_ = other.urls_;
          bitField0_ |= 0x00000002;
        } else {
          ensureUrlsIsMutable();
          urls_.addAll(other.urls_);
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
            case 8: {
              playTime_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUrlsIsMutable();
              urls_.add(s);
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

    private int playTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 play_time = 1;</code>
     * @return The playTime.
     */
    @java.lang.Override
    public int getPlayTime() {
      return playTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 play_time = 1;</code>
     * @param value The playTime to set.
     * @return This builder for chaining.
     */
    public Builder setPlayTime(int value) {

      playTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 play_time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      playTime_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList urls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUrlsIsMutable() {
      if (!urls_.isModifiable()) {
        urls_ = new com.google.protobuf.LazyStringArrayList(urls_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @return A list containing the urls.
     */
    public com.google.protobuf.ProtocolStringList
        getUrlsList() {
      urls_.makeImmutable();
      return urls_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @return The count of urls.
     */
    public int getUrlsCount() {
      return urls_.size();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param index The index of the element to return.
     * @return The urls at the given index.
     */
    public java.lang.String getUrls(int index) {
      return urls_.get(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the urls at the given index.
     */
    public com.google.protobuf.ByteString
        getUrlsBytes(int index) {
      return urls_.getByteString(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param index The index to set the value at.
     * @param value The urls to set.
     * @return This builder for chaining.
     */
    public Builder setUrls(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlsIsMutable();
      urls_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param value The urls to add.
     * @return This builder for chaining.
     */
    public Builder addUrls(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlsIsMutable();
      urls_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param values The urls to add.
     * @return This builder for chaining.
     */
    public Builder addAllUrls(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, urls_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrls() {
      urls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated string urls = 2;</code>
     * @param value The bytes of the urls to add.
     * @return This builder for chaining.
     */
    public Builder addUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUrlsIsMutable();
      urls_.add(value);
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


    // @@protoc_insertion_point(builder_scope:bilibili.ad.v1.CustomPlayUrl)
  }

  // @@protoc_insertion_point(class_scope:bilibili.ad.v1.CustomPlayUrl)
  private static final bilibili.ad.v1.CustomPlayUrl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.ad.v1.CustomPlayUrl();
  }

  public static bilibili.ad.v1.CustomPlayUrl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomPlayUrl>
      PARSER = new com.google.protobuf.AbstractParser<CustomPlayUrl>() {
    @java.lang.Override
    public CustomPlayUrl parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomPlayUrl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomPlayUrl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.ad.v1.CustomPlayUrl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

