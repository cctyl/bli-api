// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 小视频连播页-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.SVideoReply}
 */
public final class SVideoReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.SVideoReply)
    SVideoReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SVideoReply.newBuilder() to construct.
  private SVideoReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SVideoReply() {
    list_ = java.util.Collections.emptyList();
    offset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SVideoReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_SVideoReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_SVideoReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.SVideoReply.class, bilibili.app.dynamic.v1.SVideoReply.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v1.SVideoItem> list_;
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v1.SVideoItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v1.SVideoItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
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
   * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.SVideoItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.SVideoItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object offset_ = "";
  /**
   * <pre>
   * 翻页游标
   * </pre>
   *
   * <code>string offset = 2;</code>
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
   * 翻页游标
   * </pre>
   *
   * <code>string offset = 2;</code>
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

  public static final int HAS_MORE_FIELD_NUMBER = 3;
  private int hasMore_ = 0;
  /**
   * <pre>
   * 是否还有更多数据
   * 1:有
   * </pre>
   *
   * <code>int32 has_more = 3;</code>
   * @return The hasMore.
   */
  @java.lang.Override
  public int getHasMore() {
    return hasMore_;
  }

  public static final int TOP_FIELD_NUMBER = 4;
  private bilibili.app.dynamic.v1.SVideoTop top_;
  /**
   * <pre>
   * 顶部
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
   * @return Whether the top field is set.
   */
  @java.lang.Override
  public boolean hasTop() {
    return top_ != null;
  }
  /**
   * <pre>
   * 顶部
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
   * @return The top.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.SVideoTop getTop() {
    return top_ == null ? bilibili.app.dynamic.v1.SVideoTop.getDefaultInstance() : top_;
  }
  /**
   * <pre>
   * 顶部
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.SVideoTopOrBuilder getTopOrBuilder() {
    return top_ == null ? bilibili.app.dynamic.v1.SVideoTop.getDefaultInstance() : top_;
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
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(1, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, offset_);
    }
    if (hasMore_ != 0) {
      output.writeInt32(3, hasMore_);
    }
    if (top_ != null) {
      output.writeMessage(4, getTop());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, offset_);
    }
    if (hasMore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hasMore_);
    }
    if (top_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTop());
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
    if (!(obj instanceof bilibili.app.dynamic.v1.SVideoReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.SVideoReply other = (bilibili.app.dynamic.v1.SVideoReply) obj;

    if (!getListList()
        .equals(other.getListList())) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getHasMore()
        != other.getHasMore()) return false;
    if (hasTop() != other.hasTop()) return false;
    if (hasTop()) {
      if (!getTop()
          .equals(other.getTop())) return false;
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
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + getHasMore();
    if (hasTop()) {
      hash = (37 * hash) + TOP_FIELD_NUMBER;
      hash = (53 * hash) + getTop().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.SVideoReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.SVideoReply prototype) {
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
   * 小视频连播页-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.SVideoReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.SVideoReply)
      bilibili.app.dynamic.v1.SVideoReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_SVideoReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_SVideoReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.SVideoReply.class, bilibili.app.dynamic.v1.SVideoReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.SVideoReply.newBuilder()
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
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
      } else {
        list_ = null;
        listBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      offset_ = "";
      hasMore_ = 0;
      top_ = null;
      if (topBuilder_ != null) {
        topBuilder_.dispose();
        topBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_SVideoReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.SVideoReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.SVideoReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.SVideoReply build() {
      bilibili.app.dynamic.v1.SVideoReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.SVideoReply buildPartial() {
      bilibili.app.dynamic.v1.SVideoReply result = new bilibili.app.dynamic.v1.SVideoReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v1.SVideoReply result) {
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v1.SVideoReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hasMore_ = hasMore_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.top_ = topBuilder_ == null
            ? top_
            : topBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.SVideoReply) {
        return mergeFrom((bilibili.app.dynamic.v1.SVideoReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.SVideoReply other) {
      if (other == bilibili.app.dynamic.v1.SVideoReply.getDefaultInstance()) return this;
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
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
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getHasMore() != 0) {
        setHasMore(other.getHasMore());
      }
      if (other.hasTop()) {
        mergeTop(other.getTop());
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
              bilibili.app.dynamic.v1.SVideoItem m =
                  input.readMessage(
                      bilibili.app.dynamic.v1.SVideoItem.parser(),
                      extensionRegistry);
              if (listBuilder_ == null) {
                ensureListIsMutable();
                list_.add(m);
              } else {
                listBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              offset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              hasMore_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getTopFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<bilibili.app.dynamic.v1.SVideoItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.dynamic.v1.SVideoItem>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v1.SVideoItem, bilibili.app.dynamic.v1.SVideoItem.Builder, bilibili.app.dynamic.v1.SVideoItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v1.SVideoItem> getListList() {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public bilibili.app.dynamic.v1.SVideoItem getList(int index) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v1.SVideoItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v1.SVideoItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder addList(bilibili.app.dynamic.v1.SVideoItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v1.SVideoItem value) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder addList(
        bilibili.app.dynamic.v1.SVideoItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v1.SVideoItem.Builder builderForValue) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.app.dynamic.v1.SVideoItem> values) {
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public bilibili.app.dynamic.v1.SVideoItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public bilibili.app.dynamic.v1.SVideoItemOrBuilder getListOrBuilder(
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v1.SVideoItemOrBuilder> 
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
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public bilibili.app.dynamic.v1.SVideoItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.dynamic.v1.SVideoItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public bilibili.app.dynamic.v1.SVideoItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v1.SVideoItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.SVideoItem list = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v1.SVideoItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v1.SVideoItem, bilibili.app.dynamic.v1.SVideoItem.Builder, bilibili.app.dynamic.v1.SVideoItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v1.SVideoItem, bilibili.app.dynamic.v1.SVideoItem.Builder, bilibili.app.dynamic.v1.SVideoItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private java.lang.Object offset_ = "";
    /**
     * <pre>
     * 翻页游标
     * </pre>
     *
     * <code>string offset = 2;</code>
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
     * 翻页游标
     * </pre>
     *
     * <code>string offset = 2;</code>
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
     * 翻页游标
     * </pre>
     *
     * <code>string offset = 2;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      offset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 翻页游标
     * </pre>
     *
     * <code>string offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      offset_ = getDefaultInstance().getOffset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 翻页游标
     * </pre>
     *
     * <code>string offset = 2;</code>
     * @param value The bytes for offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      offset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int hasMore_ ;
    /**
     * <pre>
     * 是否还有更多数据
     * 1:有
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public int getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * 1:有
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(int value) {

      hasMore_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * 1:有
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hasMore_ = 0;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v1.SVideoTop top_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.SVideoTop, bilibili.app.dynamic.v1.SVideoTop.Builder, bilibili.app.dynamic.v1.SVideoTopOrBuilder> topBuilder_;
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     * @return Whether the top field is set.
     */
    public boolean hasTop() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     * @return The top.
     */
    public bilibili.app.dynamic.v1.SVideoTop getTop() {
      if (topBuilder_ == null) {
        return top_ == null ? bilibili.app.dynamic.v1.SVideoTop.getDefaultInstance() : top_;
      } else {
        return topBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public Builder setTop(bilibili.app.dynamic.v1.SVideoTop value) {
      if (topBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        top_ = value;
      } else {
        topBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public Builder setTop(
        bilibili.app.dynamic.v1.SVideoTop.Builder builderForValue) {
      if (topBuilder_ == null) {
        top_ = builderForValue.build();
      } else {
        topBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public Builder mergeTop(bilibili.app.dynamic.v1.SVideoTop value) {
      if (topBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          top_ != null &&
          top_ != bilibili.app.dynamic.v1.SVideoTop.getDefaultInstance()) {
          getTopBuilder().mergeFrom(value);
        } else {
          top_ = value;
        }
      } else {
        topBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public Builder clearTop() {
      bitField0_ = (bitField0_ & ~0x00000008);
      top_ = null;
      if (topBuilder_ != null) {
        topBuilder_.dispose();
        topBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public bilibili.app.dynamic.v1.SVideoTop.Builder getTopBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTopFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    public bilibili.app.dynamic.v1.SVideoTopOrBuilder getTopOrBuilder() {
      if (topBuilder_ != null) {
        return topBuilder_.getMessageOrBuilder();
      } else {
        return top_ == null ?
            bilibili.app.dynamic.v1.SVideoTop.getDefaultInstance() : top_;
      }
    }
    /**
     * <pre>
     * 顶部
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.SVideoTop top = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v1.SVideoTop, bilibili.app.dynamic.v1.SVideoTop.Builder, bilibili.app.dynamic.v1.SVideoTopOrBuilder> 
        getTopFieldBuilder() {
      if (topBuilder_ == null) {
        topBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v1.SVideoTop, bilibili.app.dynamic.v1.SVideoTop.Builder, bilibili.app.dynamic.v1.SVideoTopOrBuilder>(
                getTop(),
                getParentForChildren(),
                isClean());
        top_ = null;
      }
      return topBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.SVideoReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.SVideoReply)
  private static final bilibili.app.dynamic.v1.SVideoReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.SVideoReply();
  }

  public static bilibili.app.dynamic.v1.SVideoReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SVideoReply>
      PARSER = new com.google.protobuf.AbstractParser<SVideoReply>() {
    @java.lang.Override
    public SVideoReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SVideoReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SVideoReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.SVideoReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

