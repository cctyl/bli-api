// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.LbsPoiReply}
 */
public final class LbsPoiReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.LbsPoiReply)
    LbsPoiReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LbsPoiReply.newBuilder() to construct.
  private LbsPoiReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LbsPoiReply() {
    offset_ = "";
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LbsPoiReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.LbsPoiReply.class, bilibili.app.dynamic.v2.LbsPoiReply.Builder.class);
  }

  public static final int HAS_MORE_FIELD_NUMBER = 1;
  private boolean hasMore_ = false;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool has_more = 1;</code>
   * @return The hasMore.
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object offset_ = "";
  /**
   * <pre>
   * 
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
   * 
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

  public static final int DETAIL_FIELD_NUMBER = 3;
  private bilibili.app.dynamic.v2.LbsPoiDetail detail_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
   * @return Whether the detail field is set.
   */
  @java.lang.Override
  public boolean hasDetail() {
    return detail_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
   * @return The detail.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.LbsPoiDetail getDetail() {
    return detail_ == null ? bilibili.app.dynamic.v2.LbsPoiDetail.getDefaultInstance() : detail_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.LbsPoiDetailOrBuilder getDetailOrBuilder() {
    return detail_ == null ? bilibili.app.dynamic.v2.LbsPoiDetail.getDefaultInstance() : detail_;
  }

  public static final int LIST_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.DynamicItem> list_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.DynamicItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynamicItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
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
    if (hasMore_ != false) {
      output.writeBool(1, hasMore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, offset_);
    }
    if (detail_ != null) {
      output.writeMessage(3, getDetail());
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(4, list_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hasMore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(offset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, offset_);
    }
    if (detail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDetail());
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, list_.get(i));
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
    if (!(obj instanceof bilibili.app.dynamic.v2.LbsPoiReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.LbsPoiReply other = (bilibili.app.dynamic.v2.LbsPoiReply) obj;

    if (getHasMore()
        != other.getHasMore()) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (hasDetail() != other.hasDetail()) return false;
    if (hasDetail()) {
      if (!getDetail()
          .equals(other.getDetail())) return false;
    }
    if (!getListList()
        .equals(other.getListList())) return false;
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
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    if (hasDetail()) {
      hash = (37 * hash) + DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getDetail().hashCode();
    }
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.LbsPoiReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.LbsPoiReply prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.LbsPoiReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.LbsPoiReply)
      bilibili.app.dynamic.v2.LbsPoiReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.LbsPoiReply.class, bilibili.app.dynamic.v2.LbsPoiReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.LbsPoiReply.newBuilder()
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
      hasMore_ = false;
      offset_ = "";
      detail_ = null;
      if (detailBuilder_ != null) {
        detailBuilder_.dispose();
        detailBuilder_ = null;
      }
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
      } else {
        list_ = null;
        listBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_LbsPoiReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.LbsPoiReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReply build() {
      bilibili.app.dynamic.v2.LbsPoiReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.LbsPoiReply buildPartial() {
      bilibili.app.dynamic.v2.LbsPoiReply result = new bilibili.app.dynamic.v2.LbsPoiReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.LbsPoiReply result) {
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v2.LbsPoiReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hasMore_ = hasMore_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.detail_ = detailBuilder_ == null
            ? detail_
            : detailBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.LbsPoiReply) {
        return mergeFrom((bilibili.app.dynamic.v2.LbsPoiReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.LbsPoiReply other) {
      if (other == bilibili.app.dynamic.v2.LbsPoiReply.getDefaultInstance()) return this;
      if (other.getHasMore() != false) {
        setHasMore(other.getHasMore());
      }
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDetail()) {
        mergeDetail(other.getDetail());
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000008);
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
            bitField0_ = (bitField0_ & ~0x00000008);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
          }
        }
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
              hasMore_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              offset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDetailFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
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

    private boolean hasMore_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>bool has_more = 1;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>bool has_more = 1;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {

      hasMore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>bool has_more = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hasMore_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object offset_ = "";
    /**
     * <pre>
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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

    private bilibili.app.dynamic.v2.LbsPoiDetail detail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.LbsPoiDetail, bilibili.app.dynamic.v2.LbsPoiDetail.Builder, bilibili.app.dynamic.v2.LbsPoiDetailOrBuilder> detailBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     * @return Whether the detail field is set.
     */
    public boolean hasDetail() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     * @return The detail.
     */
    public bilibili.app.dynamic.v2.LbsPoiDetail getDetail() {
      if (detailBuilder_ == null) {
        return detail_ == null ? bilibili.app.dynamic.v2.LbsPoiDetail.getDefaultInstance() : detail_;
      } else {
        return detailBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public Builder setDetail(bilibili.app.dynamic.v2.LbsPoiDetail value) {
      if (detailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detail_ = value;
      } else {
        detailBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public Builder setDetail(
        bilibili.app.dynamic.v2.LbsPoiDetail.Builder builderForValue) {
      if (detailBuilder_ == null) {
        detail_ = builderForValue.build();
      } else {
        detailBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public Builder mergeDetail(bilibili.app.dynamic.v2.LbsPoiDetail value) {
      if (detailBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          detail_ != null &&
          detail_ != bilibili.app.dynamic.v2.LbsPoiDetail.getDefaultInstance()) {
          getDetailBuilder().mergeFrom(value);
        } else {
          detail_ = value;
        }
      } else {
        detailBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public Builder clearDetail() {
      bitField0_ = (bitField0_ & ~0x00000004);
      detail_ = null;
      if (detailBuilder_ != null) {
        detailBuilder_.dispose();
        detailBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public bilibili.app.dynamic.v2.LbsPoiDetail.Builder getDetailBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDetailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    public bilibili.app.dynamic.v2.LbsPoiDetailOrBuilder getDetailOrBuilder() {
      if (detailBuilder_ != null) {
        return detailBuilder_.getMessageOrBuilder();
      } else {
        return detail_ == null ?
            bilibili.app.dynamic.v2.LbsPoiDetail.getDefaultInstance() : detail_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.LbsPoiDetail detail = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.LbsPoiDetail, bilibili.app.dynamic.v2.LbsPoiDetail.Builder, bilibili.app.dynamic.v2.LbsPoiDetailOrBuilder> 
        getDetailFieldBuilder() {
      if (detailBuilder_ == null) {
        detailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.LbsPoiDetail, bilibili.app.dynamic.v2.LbsPoiDetail.Builder, bilibili.app.dynamic.v2.LbsPoiDetailOrBuilder>(
                getDetail(),
                getParentForChildren(),
                isClean());
        detail_ = null;
      }
      return detailBuilder_;
    }

    private java.util.List<bilibili.app.dynamic.v2.DynamicItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.dynamic.v2.DynamicItem>(list_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynamicItem, bilibili.app.dynamic.v2.DynamicItem.Builder, bilibili.app.dynamic.v2.DynamicItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
     */
    public bilibili.app.dynamic.v2.DynamicItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 4;</code>
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
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.LbsPoiReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.LbsPoiReply)
  private static final bilibili.app.dynamic.v2.LbsPoiReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.LbsPoiReply();
  }

  public static bilibili.app.dynamic.v2.LbsPoiReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LbsPoiReply>
      PARSER = new com.google.protobuf.AbstractParser<LbsPoiReply>() {
    @java.lang.Override
    public LbsPoiReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<LbsPoiReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LbsPoiReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.LbsPoiReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
