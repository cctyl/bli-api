// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

/**
 * <pre>
 * 单个字幕信息
 * </pre>
 *
 * Protobuf type {@code bilibili.tv.interfaces.dm.v1.SubtitleItem}
 */
public final class SubtitleItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.tv.interfaces.dm.v1.SubtitleItem)
    SubtitleItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubtitleItem.newBuilder() to construct.
  private SubtitleItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubtitleItem() {
    idStr_ = "";
    lan_ = "";
    lanDoc_ = "";
    subtitleUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubtitleItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_SubtitleItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_SubtitleItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.tv.interfaces.dm.v1.SubtitleItem.class, bilibili.tv.interfaces.dm.v1.SubtitleItem.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <pre>
   * 字幕id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int ID_STR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object idStr_ = "";
  /**
   * <pre>
   * 字幕id str
   * </pre>
   *
   * <code>string id_str = 2;</code>
   * @return The idStr.
   */
  @java.lang.Override
  public java.lang.String getIdStr() {
    java.lang.Object ref = idStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idStr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 字幕id str
   * </pre>
   *
   * <code>string id_str = 2;</code>
   * @return The bytes for idStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdStrBytes() {
    java.lang.Object ref = idStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lan_ = "";
  /**
   * <pre>
   * 字幕语言代码
   * </pre>
   *
   * <code>string lan = 3;</code>
   * @return The lan.
   */
  @java.lang.Override
  public java.lang.String getLan() {
    java.lang.Object ref = lan_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lan_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 字幕语言代码
   * </pre>
   *
   * <code>string lan = 3;</code>
   * @return The bytes for lan.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanBytes() {
    java.lang.Object ref = lan_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lan_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAN_DOC_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lanDoc_ = "";
  /**
   * <pre>
   * 字幕语言
   * </pre>
   *
   * <code>string lan_doc = 4;</code>
   * @return The lanDoc.
   */
  @java.lang.Override
  public java.lang.String getLanDoc() {
    java.lang.Object ref = lanDoc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lanDoc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 字幕语言
   * </pre>
   *
   * <code>string lan_doc = 4;</code>
   * @return The bytes for lanDoc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanDocBytes() {
    java.lang.Object ref = lanDoc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lanDoc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBTITLE_URL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subtitleUrl_ = "";
  /**
   * <pre>
   * 字幕文件url
   * </pre>
   *
   * <code>string subtitle_url = 5;</code>
   * @return The subtitleUrl.
   */
  @java.lang.Override
  public java.lang.String getSubtitleUrl() {
    java.lang.Object ref = subtitleUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subtitleUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 字幕文件url
   * </pre>
   *
   * <code>string subtitle_url = 5;</code>
   * @return The bytes for subtitleUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubtitleUrlBytes() {
    java.lang.Object ref = subtitleUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subtitleUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHOR_FIELD_NUMBER = 6;
  private bilibili.tv.interfaces.dm.v1.UserInfo author_;
  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   * @return Whether the author field is set.
   */
  @java.lang.Override
  public boolean hasAuthor() {
    return author_ != null;
  }
  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   * @return The author.
   */
  @java.lang.Override
  public bilibili.tv.interfaces.dm.v1.UserInfo getAuthor() {
    return author_ == null ? bilibili.tv.interfaces.dm.v1.UserInfo.getDefaultInstance() : author_;
  }
  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   */
  @java.lang.Override
  public bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder getAuthorOrBuilder() {
    return author_ == null ? bilibili.tv.interfaces.dm.v1.UserInfo.getDefaultInstance() : author_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(idStr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, idStr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lan_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lan_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lanDoc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lanDoc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitleUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, subtitleUrl_);
    }
    if (author_ != null) {
      output.writeMessage(6, getAuthor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(idStr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, idStr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lan_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lan_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lanDoc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lanDoc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitleUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, subtitleUrl_);
    }
    if (author_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getAuthor());
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
    if (!(obj instanceof bilibili.tv.interfaces.dm.v1.SubtitleItem)) {
      return super.equals(obj);
    }
    bilibili.tv.interfaces.dm.v1.SubtitleItem other = (bilibili.tv.interfaces.dm.v1.SubtitleItem) obj;

    if (getId()
        != other.getId()) return false;
    if (!getIdStr()
        .equals(other.getIdStr())) return false;
    if (!getLan()
        .equals(other.getLan())) return false;
    if (!getLanDoc()
        .equals(other.getLanDoc())) return false;
    if (!getSubtitleUrl()
        .equals(other.getSubtitleUrl())) return false;
    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor()
          .equals(other.getAuthor())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ID_STR_FIELD_NUMBER;
    hash = (53 * hash) + getIdStr().hashCode();
    hash = (37 * hash) + LAN_FIELD_NUMBER;
    hash = (53 * hash) + getLan().hashCode();
    hash = (37 * hash) + LAN_DOC_FIELD_NUMBER;
    hash = (53 * hash) + getLanDoc().hashCode();
    hash = (37 * hash) + SUBTITLE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSubtitleUrl().hashCode();
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.SubtitleItem parseFrom(
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
  public static Builder newBuilder(bilibili.tv.interfaces.dm.v1.SubtitleItem prototype) {
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
   * 单个字幕信息
   * </pre>
   *
   * Protobuf type {@code bilibili.tv.interfaces.dm.v1.SubtitleItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.tv.interfaces.dm.v1.SubtitleItem)
      bilibili.tv.interfaces.dm.v1.SubtitleItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_SubtitleItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_SubtitleItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.tv.interfaces.dm.v1.SubtitleItem.class, bilibili.tv.interfaces.dm.v1.SubtitleItem.Builder.class);
    }

    // Construct using bilibili.tv.interfaces.dm.v1.SubtitleItem.newBuilder()
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
      id_ = 0L;
      idStr_ = "";
      lan_ = "";
      lanDoc_ = "";
      subtitleUrl_ = "";
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_SubtitleItem_descriptor;
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.SubtitleItem getDefaultInstanceForType() {
      return bilibili.tv.interfaces.dm.v1.SubtitleItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.SubtitleItem build() {
      bilibili.tv.interfaces.dm.v1.SubtitleItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.SubtitleItem buildPartial() {
      bilibili.tv.interfaces.dm.v1.SubtitleItem result = new bilibili.tv.interfaces.dm.v1.SubtitleItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.tv.interfaces.dm.v1.SubtitleItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.idStr_ = idStr_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lan_ = lan_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lanDoc_ = lanDoc_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.subtitleUrl_ = subtitleUrl_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.author_ = authorBuilder_ == null
            ? author_
            : authorBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.tv.interfaces.dm.v1.SubtitleItem) {
        return mergeFrom((bilibili.tv.interfaces.dm.v1.SubtitleItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.tv.interfaces.dm.v1.SubtitleItem other) {
      if (other == bilibili.tv.interfaces.dm.v1.SubtitleItem.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getIdStr().isEmpty()) {
        idStr_ = other.idStr_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLan().isEmpty()) {
        lan_ = other.lan_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getLanDoc().isEmpty()) {
        lanDoc_ = other.lanDoc_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSubtitleUrl().isEmpty()) {
        subtitleUrl_ = other.subtitleUrl_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
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
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              idStr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              lan_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              lanDoc_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              subtitleUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getAuthorFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private long id_ ;
    /**
     * <pre>
     * 字幕id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * 字幕id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object idStr_ = "";
    /**
     * <pre>
     * 字幕id str
     * </pre>
     *
     * <code>string id_str = 2;</code>
     * @return The idStr.
     */
    public java.lang.String getIdStr() {
      java.lang.Object ref = idStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 字幕id str
     * </pre>
     *
     * <code>string id_str = 2;</code>
     * @return The bytes for idStr.
     */
    public com.google.protobuf.ByteString
        getIdStrBytes() {
      java.lang.Object ref = idStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 字幕id str
     * </pre>
     *
     * <code>string id_str = 2;</code>
     * @param value The idStr to set.
     * @return This builder for chaining.
     */
    public Builder setIdStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      idStr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕id str
     * </pre>
     *
     * <code>string id_str = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdStr() {
      idStr_ = getDefaultInstance().getIdStr();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕id str
     * </pre>
     *
     * <code>string id_str = 2;</code>
     * @param value The bytes for idStr to set.
     * @return This builder for chaining.
     */
    public Builder setIdStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      idStr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object lan_ = "";
    /**
     * <pre>
     * 字幕语言代码
     * </pre>
     *
     * <code>string lan = 3;</code>
     * @return The lan.
     */
    public java.lang.String getLan() {
      java.lang.Object ref = lan_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lan_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 字幕语言代码
     * </pre>
     *
     * <code>string lan = 3;</code>
     * @return The bytes for lan.
     */
    public com.google.protobuf.ByteString
        getLanBytes() {
      java.lang.Object ref = lan_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lan_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 字幕语言代码
     * </pre>
     *
     * <code>string lan = 3;</code>
     * @param value The lan to set.
     * @return This builder for chaining.
     */
    public Builder setLan(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lan_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕语言代码
     * </pre>
     *
     * <code>string lan = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLan() {
      lan_ = getDefaultInstance().getLan();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕语言代码
     * </pre>
     *
     * <code>string lan = 3;</code>
     * @param value The bytes for lan to set.
     * @return This builder for chaining.
     */
    public Builder setLanBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lan_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object lanDoc_ = "";
    /**
     * <pre>
     * 字幕语言
     * </pre>
     *
     * <code>string lan_doc = 4;</code>
     * @return The lanDoc.
     */
    public java.lang.String getLanDoc() {
      java.lang.Object ref = lanDoc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lanDoc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 字幕语言
     * </pre>
     *
     * <code>string lan_doc = 4;</code>
     * @return The bytes for lanDoc.
     */
    public com.google.protobuf.ByteString
        getLanDocBytes() {
      java.lang.Object ref = lanDoc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lanDoc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 字幕语言
     * </pre>
     *
     * <code>string lan_doc = 4;</code>
     * @param value The lanDoc to set.
     * @return This builder for chaining.
     */
    public Builder setLanDoc(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lanDoc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕语言
     * </pre>
     *
     * <code>string lan_doc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanDoc() {
      lanDoc_ = getDefaultInstance().getLanDoc();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕语言
     * </pre>
     *
     * <code>string lan_doc = 4;</code>
     * @param value The bytes for lanDoc to set.
     * @return This builder for chaining.
     */
    public Builder setLanDocBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lanDoc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object subtitleUrl_ = "";
    /**
     * <pre>
     * 字幕文件url
     * </pre>
     *
     * <code>string subtitle_url = 5;</code>
     * @return The subtitleUrl.
     */
    public java.lang.String getSubtitleUrl() {
      java.lang.Object ref = subtitleUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subtitleUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 字幕文件url
     * </pre>
     *
     * <code>string subtitle_url = 5;</code>
     * @return The bytes for subtitleUrl.
     */
    public com.google.protobuf.ByteString
        getSubtitleUrlBytes() {
      java.lang.Object ref = subtitleUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subtitleUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 字幕文件url
     * </pre>
     *
     * <code>string subtitle_url = 5;</code>
     * @param value The subtitleUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subtitleUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕文件url
     * </pre>
     *
     * <code>string subtitle_url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubtitleUrl() {
      subtitleUrl_ = getDefaultInstance().getSubtitleUrl();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕文件url
     * </pre>
     *
     * <code>string subtitle_url = 5;</code>
     * @param value The bytes for subtitleUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subtitleUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private bilibili.tv.interfaces.dm.v1.UserInfo author_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.tv.interfaces.dm.v1.UserInfo, bilibili.tv.interfaces.dm.v1.UserInfo.Builder, bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder> authorBuilder_;
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     * @return Whether the author field is set.
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     * @return The author.
     */
    public bilibili.tv.interfaces.dm.v1.UserInfo getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null ? bilibili.tv.interfaces.dm.v1.UserInfo.getDefaultInstance() : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public Builder setAuthor(bilibili.tv.interfaces.dm.v1.UserInfo value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
      } else {
        authorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public Builder setAuthor(
        bilibili.tv.interfaces.dm.v1.UserInfo.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public Builder mergeAuthor(bilibili.tv.interfaces.dm.v1.UserInfo value) {
      if (authorBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          author_ != null &&
          author_ != bilibili.tv.interfaces.dm.v1.UserInfo.getDefaultInstance()) {
          getAuthorBuilder().mergeFrom(value);
        } else {
          author_ = value;
        }
      } else {
        authorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public Builder clearAuthor() {
      bitField0_ = (bitField0_ & ~0x00000020);
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public bilibili.tv.interfaces.dm.v1.UserInfo.Builder getAuthorBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    public bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null ?
            bilibili.tv.interfaces.dm.v1.UserInfo.getDefaultInstance() : author_;
      }
    }
    /**
     * <pre>
     * 字幕作者信息
     * </pre>
     *
     * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.tv.interfaces.dm.v1.UserInfo, bilibili.tv.interfaces.dm.v1.UserInfo.Builder, bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder> 
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.tv.interfaces.dm.v1.UserInfo, bilibili.tv.interfaces.dm.v1.UserInfo.Builder, bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder>(
                getAuthor(),
                getParentForChildren(),
                isClean());
        author_ = null;
      }
      return authorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.tv.interfaces.dm.v1.SubtitleItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.tv.interfaces.dm.v1.SubtitleItem)
  private static final bilibili.tv.interfaces.dm.v1.SubtitleItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.tv.interfaces.dm.v1.SubtitleItem();
  }

  public static bilibili.tv.interfaces.dm.v1.SubtitleItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubtitleItem>
      PARSER = new com.google.protobuf.AbstractParser<SubtitleItem>() {
    @java.lang.Override
    public SubtitleItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubtitleItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubtitleItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.tv.interfaces.dm.v1.SubtitleItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
