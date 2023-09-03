// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 播放页推荐IFS-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.RelatesFeedReply}
 */
public final class RelatesFeedReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.RelatesFeedReply)
    RelatesFeedReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelatesFeedReply.newBuilder() to construct.
  private RelatesFeedReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelatesFeedReply() {
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelatesFeedReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_RelatesFeedReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_RelatesFeedReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.RelatesFeedReply.class, bilibili.app.view.v1.RelatesFeedReply.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.view.v1.Relate> list_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.view.v1.Relate> getListList() {
    return list_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.view.v1.RelateOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.Relate getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.RelateOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int HAS_NEXT_FIELD_NUMBER = 2;
  private boolean hasNext_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_next = 2;</code>
   * @return The hasNext.
   */
  @java.lang.Override
  public boolean getHasNext() {
    return hasNext_;
  }

  public static final int PAGINATION_FIELD_NUMBER = 3;
  private bilibili.pagination.PaginationReply pagination_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public bilibili.pagination.PaginationReply getPagination() {
    return pagination_ == null ? bilibili.pagination.PaginationReply.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
   */
  @java.lang.Override
  public bilibili.pagination.PaginationReplyOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? bilibili.pagination.PaginationReply.getDefaultInstance() : pagination_;
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
    if (hasNext_ != false) {
      output.writeBool(2, hasNext_);
    }
    if (pagination_ != null) {
      output.writeMessage(3, getPagination());
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
    if (hasNext_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasNext_);
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPagination());
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
    if (!(obj instanceof bilibili.app.view.v1.RelatesFeedReply)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.RelatesFeedReply other = (bilibili.app.view.v1.RelatesFeedReply) obj;

    if (!getListList()
        .equals(other.getListList())) return false;
    if (getHasNext()
        != other.getHasNext()) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    hash = (37 * hash) + HAS_NEXT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasNext());
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.RelatesFeedReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.RelatesFeedReply prototype) {
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
   * 播放页推荐IFS-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.RelatesFeedReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.RelatesFeedReply)
      bilibili.app.view.v1.RelatesFeedReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_RelatesFeedReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_RelatesFeedReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.RelatesFeedReply.class, bilibili.app.view.v1.RelatesFeedReply.Builder.class);
    }

    // Construct using bilibili.app.view.v1.RelatesFeedReply.newBuilder()
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
      hasNext_ = false;
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_RelatesFeedReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.RelatesFeedReply getDefaultInstanceForType() {
      return bilibili.app.view.v1.RelatesFeedReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.RelatesFeedReply build() {
      bilibili.app.view.v1.RelatesFeedReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.RelatesFeedReply buildPartial() {
      bilibili.app.view.v1.RelatesFeedReply result = new bilibili.app.view.v1.RelatesFeedReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.view.v1.RelatesFeedReply result) {
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

    private void buildPartial0(bilibili.app.view.v1.RelatesFeedReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hasNext_ = hasNext_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.RelatesFeedReply) {
        return mergeFrom((bilibili.app.view.v1.RelatesFeedReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.RelatesFeedReply other) {
      if (other == bilibili.app.view.v1.RelatesFeedReply.getDefaultInstance()) return this;
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
      if (other.getHasNext() != false) {
        setHasNext(other.getHasNext());
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              bilibili.app.view.v1.Relate m =
                  input.readMessage(
                      bilibili.app.view.v1.Relate.parser(),
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
              hasNext_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.util.List<bilibili.app.view.v1.Relate> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.view.v1.Relate>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.view.v1.Relate, bilibili.app.view.v1.Relate.Builder, bilibili.app.view.v1.RelateOrBuilder> listBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public java.util.List<bilibili.app.view.v1.Relate> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public bilibili.app.view.v1.Relate getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.view.v1.Relate value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.app.view.v1.Relate.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder addList(bilibili.app.view.v1.Relate value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.view.v1.Relate value) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder addList(
        bilibili.app.view.v1.Relate.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.app.view.v1.Relate.Builder builderForValue) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.app.view.v1.Relate> values) {
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
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
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public bilibili.app.view.v1.Relate.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public bilibili.app.view.v1.RelateOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public java.util.List<? extends bilibili.app.view.v1.RelateOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public bilibili.app.view.v1.Relate.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.view.v1.Relate.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public bilibili.app.view.v1.Relate.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.view.v1.Relate.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.view.v1.Relate list = 1;</code>
     */
    public java.util.List<bilibili.app.view.v1.Relate.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.view.v1.Relate, bilibili.app.view.v1.Relate.Builder, bilibili.app.view.v1.RelateOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.view.v1.Relate, bilibili.app.view.v1.Relate.Builder, bilibili.app.view.v1.RelateOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private boolean hasNext_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_next = 2;</code>
     * @return The hasNext.
     */
    @java.lang.Override
    public boolean getHasNext() {
      return hasNext_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_next = 2;</code>
     * @param value The hasNext to set.
     * @return This builder for chaining.
     */
    public Builder setHasNext(boolean value) {

      hasNext_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool has_next = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasNext() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hasNext_ = false;
      onChanged();
      return this;
    }

    private bilibili.pagination.PaginationReply pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pagination.PaginationReply, bilibili.pagination.PaginationReply.Builder, bilibili.pagination.PaginationReplyOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     * @return The pagination.
     */
    public bilibili.pagination.PaginationReply getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? bilibili.pagination.PaginationReply.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public Builder setPagination(bilibili.pagination.PaginationReply value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public Builder setPagination(
        bilibili.pagination.PaginationReply.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public Builder mergePagination(bilibili.pagination.PaginationReply value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          pagination_ != null &&
          pagination_ != bilibili.pagination.PaginationReply.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public bilibili.pagination.PaginationReply.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    public bilibili.pagination.PaginationReplyOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            bilibili.pagination.PaginationReply.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.pagination.PaginationReply pagination = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pagination.PaginationReply, bilibili.pagination.PaginationReply.Builder, bilibili.pagination.PaginationReplyOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.pagination.PaginationReply, bilibili.pagination.PaginationReply.Builder, bilibili.pagination.PaginationReplyOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.RelatesFeedReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.RelatesFeedReply)
  private static final bilibili.app.view.v1.RelatesFeedReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.RelatesFeedReply();
  }

  public static bilibili.app.view.v1.RelatesFeedReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelatesFeedReply>
      PARSER = new com.google.protobuf.AbstractParser<RelatesFeedReply>() {
    @java.lang.Override
    public RelatesFeedReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelatesFeedReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelatesFeedReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.RelatesFeedReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

