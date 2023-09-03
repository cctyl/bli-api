// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.SearchComicCard}
 */
public final class SearchComicCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.SearchComicCard)
    SearchComicCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchComicCard.newBuilder() to construct.
  private SearchComicCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchComicCard() {
    title_ = "";
    cover_ = "";
    name_ = "";
    style_ = "";
    comicUrl_ = "";
    badge_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchComicCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchComicCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchComicCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.SearchComicCard.class, bilibili.polymer.app.search.v1.SearchComicCard.Builder.class);
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

  public static final int COVER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cover_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  @java.lang.Override
  public java.lang.String getCover() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cover_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoverBytes() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cover_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STYLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object style_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string style = 4;</code>
   * @return The style.
   */
  @java.lang.Override
  public java.lang.String getStyle() {
    java.lang.Object ref = style_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      style_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string style = 4;</code>
   * @return The bytes for style.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStyleBytes() {
    java.lang.Object ref = style_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      style_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMIC_URL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object comicUrl_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string comic_url = 5;</code>
   * @return The comicUrl.
   */
  @java.lang.Override
  public java.lang.String getComicUrl() {
    java.lang.Object ref = comicUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comicUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string comic_url = 5;</code>
   * @return The bytes for comicUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getComicUrlBytes() {
    java.lang.Object ref = comicUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comicUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BADGE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object badge_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 6;</code>
   * @return The badge.
   */
  @java.lang.Override
  public java.lang.String getBadge() {
    java.lang.Object ref = badge_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      badge_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 6;</code>
   * @return The bytes for badge.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBadgeBytes() {
    java.lang.Object ref = badge_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      badge_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cover_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(style_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, style_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comicUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, comicUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, badge_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cover_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(style_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, style_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comicUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, comicUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(badge_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, badge_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.SearchComicCard)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.SearchComicCard other = (bilibili.polymer.app.search.v1.SearchComicCard) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getCover()
        .equals(other.getCover())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getStyle()
        .equals(other.getStyle())) return false;
    if (!getComicUrl()
        .equals(other.getComicUrl())) return false;
    if (!getBadge()
        .equals(other.getBadge())) return false;
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
    hash = (37 * hash) + COVER_FIELD_NUMBER;
    hash = (53 * hash) + getCover().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + STYLE_FIELD_NUMBER;
    hash = (53 * hash) + getStyle().hashCode();
    hash = (37 * hash) + COMIC_URL_FIELD_NUMBER;
    hash = (53 * hash) + getComicUrl().hashCode();
    hash = (37 * hash) + BADGE_FIELD_NUMBER;
    hash = (53 * hash) + getBadge().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.SearchComicCard parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.SearchComicCard prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.SearchComicCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.SearchComicCard)
      bilibili.polymer.app.search.v1.SearchComicCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchComicCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchComicCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.SearchComicCard.class, bilibili.polymer.app.search.v1.SearchComicCard.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.SearchComicCard.newBuilder()
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
      cover_ = "";
      name_ = "";
      style_ = "";
      comicUrl_ = "";
      badge_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_SearchComicCard_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchComicCard getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.SearchComicCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchComicCard build() {
      bilibili.polymer.app.search.v1.SearchComicCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.SearchComicCard buildPartial() {
      bilibili.polymer.app.search.v1.SearchComicCard result = new bilibili.polymer.app.search.v1.SearchComicCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.SearchComicCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cover_ = cover_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.style_ = style_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.comicUrl_ = comicUrl_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.badge_ = badge_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.SearchComicCard) {
        return mergeFrom((bilibili.polymer.app.search.v1.SearchComicCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.SearchComicCard other) {
      if (other == bilibili.polymer.app.search.v1.SearchComicCard.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCover().isEmpty()) {
        cover_ = other.cover_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getStyle().isEmpty()) {
        style_ = other.style_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getComicUrl().isEmpty()) {
        comicUrl_ = other.comicUrl_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getBadge().isEmpty()) {
        badge_ = other.badge_;
        bitField0_ |= 0x00000020;
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
              cover_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              style_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              comicUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              badge_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object cover_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 2;</code>
     * @return The cover.
     */
    public java.lang.String getCover() {
      java.lang.Object ref = cover_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cover_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 2;</code>
     * @return The bytes for cover.
     */
    public com.google.protobuf.ByteString
        getCoverBytes() {
      java.lang.Object ref = cover_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cover_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 2;</code>
     * @param value The cover to set.
     * @return This builder for chaining.
     */
    public Builder setCover(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cover_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCover() {
      cover_ = getDefaultInstance().getCover();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 2;</code>
     * @param value The bytes for cover to set.
     * @return This builder for chaining.
     */
    public Builder setCoverBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cover_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object style_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string style = 4;</code>
     * @return The style.
     */
    public java.lang.String getStyle() {
      java.lang.Object ref = style_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        style_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string style = 4;</code>
     * @return The bytes for style.
     */
    public com.google.protobuf.ByteString
        getStyleBytes() {
      java.lang.Object ref = style_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        style_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string style = 4;</code>
     * @param value The style to set.
     * @return This builder for chaining.
     */
    public Builder setStyle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      style_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string style = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStyle() {
      style_ = getDefaultInstance().getStyle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string style = 4;</code>
     * @param value The bytes for style to set.
     * @return This builder for chaining.
     */
    public Builder setStyleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      style_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object comicUrl_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string comic_url = 5;</code>
     * @return The comicUrl.
     */
    public java.lang.String getComicUrl() {
      java.lang.Object ref = comicUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comicUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comic_url = 5;</code>
     * @return The bytes for comicUrl.
     */
    public com.google.protobuf.ByteString
        getComicUrlBytes() {
      java.lang.Object ref = comicUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comicUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comic_url = 5;</code>
     * @param value The comicUrl to set.
     * @return This builder for chaining.
     */
    public Builder setComicUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      comicUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comic_url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearComicUrl() {
      comicUrl_ = getDefaultInstance().getComicUrl();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comic_url = 5;</code>
     * @param value The bytes for comicUrl to set.
     * @return This builder for chaining.
     */
    public Builder setComicUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      comicUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object badge_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return The badge.
     */
    public java.lang.String getBadge() {
      java.lang.Object ref = badge_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        badge_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return The bytes for badge.
     */
    public com.google.protobuf.ByteString
        getBadgeBytes() {
      java.lang.Object ref = badge_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        badge_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @param value The badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadge(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      badge_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadge() {
      badge_ = getDefaultInstance().getBadge();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string badge = 6;</code>
     * @param value The bytes for badge to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      badge_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.SearchComicCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.SearchComicCard)
  private static final bilibili.polymer.app.search.v1.SearchComicCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.SearchComicCard();
  }

  public static bilibili.polymer.app.search.v1.SearchComicCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchComicCard>
      PARSER = new com.google.protobuf.AbstractParser<SearchComicCard>() {
    @java.lang.Override
    public SearchComicCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchComicCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchComicCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.SearchComicCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

