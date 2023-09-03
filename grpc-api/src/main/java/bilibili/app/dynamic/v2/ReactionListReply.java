// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 新版动态转发点赞列表-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ReactionListReply}
 */
public final class ReactionListReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ReactionListReply)
    ReactionListReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReactionListReply.newBuilder() to construct.
  private ReactionListReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReactionListReply() {
    title_ = "";
    list_ = java.util.Collections.emptyList();
    offset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReactionListReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ReactionListReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ReactionListReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.ReactionListReply.class, bilibili.app.dynamic.v2.ReactionListReply.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 标题
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
   * 标题
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

  public static final int LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.ReactionListItem> list_;
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.ReactionListItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.ReactionListItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.ReactionListItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.ReactionListItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object offset_ = "";
  /**
   * <pre>
   * 偏移
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The offset.
   */
  @java.lang.Override
  public java.lang.String getOffset() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      offset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 偏移
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The bytes for offset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOffsetBytes() {
    java.lang.Object ref = offset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      offset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_MORE_FIELD_NUMBER = 4;
  private boolean hasMore_ = false;
  /**
   * <pre>
   * 是否还有更多
   * </pre>
   *
   * <code>bool has_more = 4;</code>
   * @return The hasMore.
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
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
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(2, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, offset_);
    }
    if (hasMore_ != false) {
      output.writeBool(4, hasMore_);
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
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, offset_);
    }
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, hasMore_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.ReactionListReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.ReactionListReply other = (bilibili.app.dynamic.v2.ReactionListReply) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getHasMore()
        != other.getHasMore()) return false;
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
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ReactionListReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.ReactionListReply prototype) {
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
   * 新版动态转发点赞列表-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.ReactionListReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ReactionListReply)
      bilibili.app.dynamic.v2.ReactionListReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ReactionListReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ReactionListReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.ReactionListReply.class, bilibili.app.dynamic.v2.ReactionListReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.ReactionListReply.newBuilder()
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
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
      } else {
        list_ = null;
        listBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = "";
      hasMore_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ReactionListReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ReactionListReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.ReactionListReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ReactionListReply build() {
      bilibili.app.dynamic.v2.ReactionListReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ReactionListReply buildPartial() {
      bilibili.app.dynamic.v2.ReactionListReply result = new bilibili.app.dynamic.v2.ReactionListReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.ReactionListReply result) {
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v2.ReactionListReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.hasMore_ = hasMore_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.ReactionListReply) {
        return mergeFrom((bilibili.app.dynamic.v2.ReactionListReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.ReactionListReply other) {
      if (other == bilibili.app.dynamic.v2.ReactionListReply.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureListIsMutable();
            list_.addAll(other.list_);
          }
          onChanged();
        }
      } else {
        if (!other.list_.isEmpty()) {
          if (listBuilder_.isEmpty()) {
            listBuilder_.dispose();
            listBuilder_ = null;
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000002);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
          }
        }
      }
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getHasMore() != false) {
        setHasMore(other.getHasMore());
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
              bilibili.app.dynamic.v2.ReactionListItem m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.ReactionListItem.parser(),
                      extensionRegistry);
              if (listBuilder_ == null) {
                ensureListIsMutable();
                list_.add(m);
              } else {
                listBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              offset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              hasMore_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * 标题
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
     * 标题
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
     * 标题
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
     * 标题
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
     * 标题
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

    private java.util.List<bilibili.app.dynamic.v2.ReactionListItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.dynamic.v2.ReactionListItem>(list_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.ReactionListItem, bilibili.app.dynamic.v2.ReactionListItem.Builder, bilibili.app.dynamic.v2.ReactionListItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.ReactionListItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public int getListCount() {
      if (listBuilder_ == null) {
        return list_.size();
      } else {
        return listBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public bilibili.app.dynamic.v2.ReactionListItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v2.ReactionListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.set(index, value);
        onChanged();
      } else {
        listBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v2.ReactionListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.set(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder addList(bilibili.app.dynamic.v2.ReactionListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(value);
        onChanged();
      } else {
        listBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v2.ReactionListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(index, value);
        onChanged();
      } else {
        listBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder addList(
        bilibili.app.dynamic.v2.ReactionListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v2.ReactionListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.ReactionListItem> values) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, list_);
        onChanged();
      } else {
        listBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public Builder removeList(int index) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.remove(index);
        onChanged();
      } else {
        listBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public bilibili.app.dynamic.v2.ReactionListItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public bilibili.app.dynamic.v2.ReactionListItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.ReactionListItemOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public bilibili.app.dynamic.v2.ReactionListItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.ReactionListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public bilibili.app.dynamic.v2.ReactionListItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.ReactionListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ReactionListItem list = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.ReactionListItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.ReactionListItem, bilibili.app.dynamic.v2.ReactionListItem.Builder, bilibili.app.dynamic.v2.ReactionListItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.ReactionListItem, bilibili.app.dynamic.v2.ReactionListItem.Builder, bilibili.app.dynamic.v2.ReactionListItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private java.lang.Object offset_ = "";
    /**
     * <pre>
     * 偏移
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return The offset.
     */
    public java.lang.String getOffset() {
      java.lang.Object ref = offset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        offset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 偏移
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return The bytes for offset.
     */
    public com.google.protobuf.ByteString
        getOffsetBytes() {
      java.lang.Object ref = offset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        offset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 偏移
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 偏移
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      offset_ = getDefaultInstance().getOffset();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 偏移
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @param value The bytes for offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean hasMore_ ;
    /**
     * <pre>
     * 是否还有更多
     * </pre>
     *
     * <code>bool has_more = 4;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 是否还有更多
     * </pre>
     *
     * <code>bool has_more = 4;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {

      hasMore_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否还有更多
     * </pre>
     *
     * <code>bool has_more = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      bitField0_ = (bitField0_ & ~0x00000008);
      hasMore_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ReactionListReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ReactionListReply)
  private static final bilibili.app.dynamic.v2.ReactionListReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.ReactionListReply();
  }

  public static bilibili.app.dynamic.v2.ReactionListReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReactionListReply>
      PARSER = new com.google.protobuf.AbstractParser<ReactionListReply>() {
    @java.lang.Override
    public ReactionListReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReactionListReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReactionListReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.ReactionListReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

