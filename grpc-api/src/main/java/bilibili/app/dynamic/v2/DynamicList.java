// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 *动态卡片列表
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DynamicList}
 */
public final class DynamicList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DynamicList)
    DynamicListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicList.newBuilder() to construct.
  private DynamicList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicList() {
    list_ = java.util.Collections.emptyList();
    historyOffset_ = "";
    updateBaseline_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynamicList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynamicList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.DynamicList.class, bilibili.app.dynamic.v2.DynamicList.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.DynamicItem> list_;
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.DynamicItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int UPDATE_NUM_FIELD_NUMBER = 2;
  private long updateNum_ = 0L;
  /**
   * <pre>
   * 更新的动态数
   * </pre>
   *
   * <code>int64 update_num = 2;</code>
   * @return The updateNum.
   */
  @java.lang.Override
  public long getUpdateNum() {
    return updateNum_;
  }

  public static final int HISTORY_OFFSET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object historyOffset_ = "";
  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The historyOffset.
   */
  @java.lang.Override
  public java.lang.String getHistoryOffset() {
    java.lang.Object ref = historyOffset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      historyOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The bytes for historyOffset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHistoryOffsetBytes() {
    java.lang.Object ref = historyOffset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      historyOffset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_BASELINE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object updateBaseline_ = "";
  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The updateBaseline.
   */
  @java.lang.Override
  public java.lang.String getUpdateBaseline() {
    java.lang.Object ref = updateBaseline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      updateBaseline_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The bytes for updateBaseline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUpdateBaselineBytes() {
    java.lang.Object ref = updateBaseline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      updateBaseline_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_MORE_FIELD_NUMBER = 5;
  private boolean hasMore_ = false;
  /**
   * <pre>
   * 是否还有更多数据
   * </pre>
   *
   * <code>bool has_more = 5;</code>
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
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(1, list_.get(i));
    }
    if (updateNum_ != 0L) {
      output.writeInt64(2, updateNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(historyOffset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, historyOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updateBaseline_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, updateBaseline_);
    }
    if (hasMore_ != false) {
      output.writeBool(5, hasMore_);
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
    if (updateNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, updateNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(historyOffset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, historyOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updateBaseline_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, updateBaseline_);
    }
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hasMore_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.DynamicList)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.DynamicList other = (bilibili.app.dynamic.v2.DynamicList) obj;

    if (!getListList()
        .equals(other.getListList())) return false;
    if (getUpdateNum()
        != other.getUpdateNum()) return false;
    if (!getHistoryOffset()
        .equals(other.getHistoryOffset())) return false;
    if (!getUpdateBaseline()
        .equals(other.getUpdateBaseline())) return false;
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
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + UPDATE_NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateNum());
    hash = (37 * hash) + HISTORY_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getHistoryOffset().hashCode();
    hash = (37 * hash) + UPDATE_BASELINE_FIELD_NUMBER;
    hash = (53 * hash) + getUpdateBaseline().hashCode();
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynamicList parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.DynamicList prototype) {
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
   *动态卡片列表
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.DynamicList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DynamicList)
      bilibili.app.dynamic.v2.DynamicListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynamicList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynamicList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.DynamicList.class, bilibili.app.dynamic.v2.DynamicList.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.DynamicList.newBuilder()
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
      updateNum_ = 0L;
      historyOffset_ = "";
      updateBaseline_ = "";
      hasMore_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynamicList_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynamicList getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.DynamicList.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynamicList build() {
      bilibili.app.dynamic.v2.DynamicList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynamicList buildPartial() {
      bilibili.app.dynamic.v2.DynamicList result = new bilibili.app.dynamic.v2.DynamicList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.DynamicList result) {
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

    private void buildPartial0(bilibili.app.dynamic.v2.DynamicList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateNum_ = updateNum_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.historyOffset_ = historyOffset_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.updateBaseline_ = updateBaseline_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.hasMore_ = hasMore_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.DynamicList) {
        return mergeFrom((bilibili.app.dynamic.v2.DynamicList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.DynamicList other) {
      if (other == bilibili.app.dynamic.v2.DynamicList.getDefaultInstance()) return this;
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
      if (other.getUpdateNum() != 0L) {
        setUpdateNum(other.getUpdateNum());
      }
      if (!other.getHistoryOffset().isEmpty()) {
        historyOffset_ = other.historyOffset_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getUpdateBaseline().isEmpty()) {
        updateBaseline_ = other.updateBaseline_;
        bitField0_ |= 0x00000008;
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
              bilibili.app.dynamic.v2.DynamicItem m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.DynamicItem.parser(),
                      extensionRegistry);
              if (listBuilder_ == null) {
                ensureListIsMutable();
                list_.add(m);
              } else {
                listBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              updateNum_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              historyOffset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              updateBaseline_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              hasMore_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.util.List<bilibili.app.dynamic.v2.DynamicItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.dynamic.v2.DynamicItem>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynamicItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v2.DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.dynamic.v2.DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder addList(bilibili.app.dynamic.v2.DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v2.DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder addList(
        bilibili.app.dynamic.v2.DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.dynamic.v2.DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.DynamicItem> values) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynamicItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private long updateNum_ ;
    /**
     * <pre>
     * 更新的动态数
     * </pre>
     *
     * <code>int64 update_num = 2;</code>
     * @return The updateNum.
     */
    @java.lang.Override
    public long getUpdateNum() {
      return updateNum_;
    }
    /**
     * <pre>
     * 更新的动态数
     * </pre>
     *
     * <code>int64 update_num = 2;</code>
     * @param value The updateNum to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateNum(long value) {

      updateNum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 更新的动态数
     * </pre>
     *
     * <code>int64 update_num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateNum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateNum_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object historyOffset_ = "";
    /**
     * <pre>
     * 历史偏移
     * </pre>
     *
     * <code>string history_offset = 3;</code>
     * @return The historyOffset.
     */
    public java.lang.String getHistoryOffset() {
      java.lang.Object ref = historyOffset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        historyOffset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 历史偏移
     * </pre>
     *
     * <code>string history_offset = 3;</code>
     * @return The bytes for historyOffset.
     */
    public com.google.protobuf.ByteString
        getHistoryOffsetBytes() {
      java.lang.Object ref = historyOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        historyOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 历史偏移
     * </pre>
     *
     * <code>string history_offset = 3;</code>
     * @param value The historyOffset to set.
     * @return This builder for chaining.
     */
    public Builder setHistoryOffset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      historyOffset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史偏移
     * </pre>
     *
     * <code>string history_offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHistoryOffset() {
      historyOffset_ = getDefaultInstance().getHistoryOffset();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史偏移
     * </pre>
     *
     * <code>string history_offset = 3;</code>
     * @param value The bytes for historyOffset to set.
     * @return This builder for chaining.
     */
    public Builder setHistoryOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      historyOffset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object updateBaseline_ = "";
    /**
     * <pre>
     * 更新基础信息
     * </pre>
     *
     * <code>string update_baseline = 4;</code>
     * @return The updateBaseline.
     */
    public java.lang.String getUpdateBaseline() {
      java.lang.Object ref = updateBaseline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        updateBaseline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 更新基础信息
     * </pre>
     *
     * <code>string update_baseline = 4;</code>
     * @return The bytes for updateBaseline.
     */
    public com.google.protobuf.ByteString
        getUpdateBaselineBytes() {
      java.lang.Object ref = updateBaseline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        updateBaseline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 更新基础信息
     * </pre>
     *
     * <code>string update_baseline = 4;</code>
     * @param value The updateBaseline to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateBaseline(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      updateBaseline_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 更新基础信息
     * </pre>
     *
     * <code>string update_baseline = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateBaseline() {
      updateBaseline_ = getDefaultInstance().getUpdateBaseline();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 更新基础信息
     * </pre>
     *
     * <code>string update_baseline = 4;</code>
     * @param value The bytes for updateBaseline to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateBaselineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      updateBaseline_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean hasMore_ ;
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>bool has_more = 5;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>bool has_more = 5;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {

      hasMore_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>bool has_more = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      bitField0_ = (bitField0_ & ~0x00000010);
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DynamicList)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DynamicList)
  private static final bilibili.app.dynamic.v2.DynamicList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.DynamicList();
  }

  public static bilibili.app.dynamic.v2.DynamicList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicList>
      PARSER = new com.google.protobuf.AbstractParser<DynamicList>() {
    @java.lang.Override
    public DynamicList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

