// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.DisplayOption}
 */
public final class DisplayOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.DisplayOption)
    DisplayOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayOption.newBuilder() to construct.
  private DisplayOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayOption() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisplayOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_DisplayOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_DisplayOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.DisplayOption.class, bilibili.polymer.app.search.v1.DisplayOption.Builder.class);
  }

  public static final int VIDEO_TITLE_ROW_FIELD_NUMBER = 1;
  private int videoTitleRow_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 video_title_row = 1;</code>
   * @return The videoTitleRow.
   */
  @java.lang.Override
  public int getVideoTitleRow() {
    return videoTitleRow_;
  }

  public static final int SEARCH_PAGE_VISUAL_OPTI_FIELD_NUMBER = 2;
  private int searchPageVisualOpti_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 search_page_visual_opti = 2;</code>
   * @return The searchPageVisualOpti.
   */
  @java.lang.Override
  public int getSearchPageVisualOpti() {
    return searchPageVisualOpti_;
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
    if (videoTitleRow_ != 0) {
      output.writeInt32(1, videoTitleRow_);
    }
    if (searchPageVisualOpti_ != 0) {
      output.writeInt32(2, searchPageVisualOpti_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (videoTitleRow_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, videoTitleRow_);
    }
    if (searchPageVisualOpti_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, searchPageVisualOpti_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.DisplayOption)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.DisplayOption other = (bilibili.polymer.app.search.v1.DisplayOption) obj;

    if (getVideoTitleRow()
        != other.getVideoTitleRow()) return false;
    if (getSearchPageVisualOpti()
        != other.getSearchPageVisualOpti()) return false;
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
    hash = (37 * hash) + VIDEO_TITLE_ROW_FIELD_NUMBER;
    hash = (53 * hash) + getVideoTitleRow();
    hash = (37 * hash) + SEARCH_PAGE_VISUAL_OPTI_FIELD_NUMBER;
    hash = (53 * hash) + getSearchPageVisualOpti();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.DisplayOption parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.DisplayOption prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.DisplayOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.DisplayOption)
      bilibili.polymer.app.search.v1.DisplayOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_DisplayOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_DisplayOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.DisplayOption.class, bilibili.polymer.app.search.v1.DisplayOption.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.DisplayOption.newBuilder()
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
      videoTitleRow_ = 0;
      searchPageVisualOpti_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_DisplayOption_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.DisplayOption getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.DisplayOption.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.DisplayOption build() {
      bilibili.polymer.app.search.v1.DisplayOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.DisplayOption buildPartial() {
      bilibili.polymer.app.search.v1.DisplayOption result = new bilibili.polymer.app.search.v1.DisplayOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.DisplayOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.videoTitleRow_ = videoTitleRow_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchPageVisualOpti_ = searchPageVisualOpti_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.DisplayOption) {
        return mergeFrom((bilibili.polymer.app.search.v1.DisplayOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.DisplayOption other) {
      if (other == bilibili.polymer.app.search.v1.DisplayOption.getDefaultInstance()) return this;
      if (other.getVideoTitleRow() != 0) {
        setVideoTitleRow(other.getVideoTitleRow());
      }
      if (other.getSearchPageVisualOpti() != 0) {
        setSearchPageVisualOpti(other.getSearchPageVisualOpti());
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
              videoTitleRow_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              searchPageVisualOpti_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int videoTitleRow_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 video_title_row = 1;</code>
     * @return The videoTitleRow.
     */
    @java.lang.Override
    public int getVideoTitleRow() {
      return videoTitleRow_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 video_title_row = 1;</code>
     * @param value The videoTitleRow to set.
     * @return This builder for chaining.
     */
    public Builder setVideoTitleRow(int value) {

      videoTitleRow_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 video_title_row = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVideoTitleRow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      videoTitleRow_ = 0;
      onChanged();
      return this;
    }

    private int searchPageVisualOpti_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 search_page_visual_opti = 2;</code>
     * @return The searchPageVisualOpti.
     */
    @java.lang.Override
    public int getSearchPageVisualOpti() {
      return searchPageVisualOpti_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 search_page_visual_opti = 2;</code>
     * @param value The searchPageVisualOpti to set.
     * @return This builder for chaining.
     */
    public Builder setSearchPageVisualOpti(int value) {

      searchPageVisualOpti_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 search_page_visual_opti = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchPageVisualOpti() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchPageVisualOpti_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.DisplayOption)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.DisplayOption)
  private static final bilibili.polymer.app.search.v1.DisplayOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.DisplayOption();
  }

  public static bilibili.polymer.app.search.v1.DisplayOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisplayOption>
      PARSER = new com.google.protobuf.AbstractParser<DisplayOption>() {
    @java.lang.Override
    public DisplayOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisplayOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.DisplayOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

