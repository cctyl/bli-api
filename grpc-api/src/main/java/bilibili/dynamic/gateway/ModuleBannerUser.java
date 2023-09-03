// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 动态通栏-用户
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.ModuleBannerUser}
 */
public final class ModuleBannerUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.ModuleBannerUser)
    ModuleBannerUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleBannerUser.newBuilder() to construct.
  private ModuleBannerUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleBannerUser() {
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleBannerUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBannerUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBannerUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.ModuleBannerUser.class, bilibili.dynamic.gateway.ModuleBannerUser.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem> list_;
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBannerUserItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder getListOrBuilder(
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
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(1, list_.get(i));
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bilibili.dynamic.gateway.ModuleBannerUser)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.ModuleBannerUser other = (bilibili.dynamic.gateway.ModuleBannerUser) obj;

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
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.ModuleBannerUser parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.ModuleBannerUser prototype) {
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
   * 动态通栏-用户
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.ModuleBannerUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.ModuleBannerUser)
      bilibili.dynamic.gateway.ModuleBannerUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBannerUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBannerUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.ModuleBannerUser.class, bilibili.dynamic.gateway.ModuleBannerUser.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.ModuleBannerUser.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_ModuleBannerUser_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerUser getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerUser build() {
      bilibili.dynamic.gateway.ModuleBannerUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.ModuleBannerUser buildPartial() {
      bilibili.dynamic.gateway.ModuleBannerUser result = new bilibili.dynamic.gateway.ModuleBannerUser(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.dynamic.gateway.ModuleBannerUser result) {
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

    private void buildPartial0(bilibili.dynamic.gateway.ModuleBannerUser result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.ModuleBannerUser) {
        return mergeFrom((bilibili.dynamic.gateway.ModuleBannerUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.ModuleBannerUser other) {
      if (other == bilibili.dynamic.gateway.ModuleBannerUser.getDefaultInstance()) return this;
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
              bilibili.dynamic.gateway.ModuleBannerUserItem m =
                  input.readMessage(
                      bilibili.dynamic.gateway.ModuleBannerUserItem.parser(),
                      extensionRegistry);
              if (listBuilder_ == null) {
                ensureListIsMutable();
                list_.add(m);
              } else {
                listBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<bilibili.dynamic.gateway.ModuleBannerUserItem>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dynamic.gateway.ModuleBannerUserItem, bilibili.dynamic.gateway.ModuleBannerUserItem.Builder, bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUserItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.dynamic.gateway.ModuleBannerUserItem value) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder setList(
        int index, bilibili.dynamic.gateway.ModuleBannerUserItem.Builder builderForValue) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder addList(bilibili.dynamic.gateway.ModuleBannerUserItem value) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.dynamic.gateway.ModuleBannerUserItem value) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder addList(
        bilibili.dynamic.gateway.ModuleBannerUserItem.Builder builderForValue) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder addList(
        int index, bilibili.dynamic.gateway.ModuleBannerUserItem.Builder builderForValue) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.dynamic.gateway.ModuleBannerUserItem> values) {
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
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
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUserItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public java.util.List<? extends bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUserItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.dynamic.gateway.ModuleBannerUserItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public bilibili.dynamic.gateway.ModuleBannerUserItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.dynamic.gateway.ModuleBannerUserItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 卡片列表
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
     */
    public java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dynamic.gateway.ModuleBannerUserItem, bilibili.dynamic.gateway.ModuleBannerUserItem.Builder, bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.dynamic.gateway.ModuleBannerUserItem, bilibili.dynamic.gateway.ModuleBannerUserItem.Builder, bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.ModuleBannerUser)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.ModuleBannerUser)
  private static final bilibili.dynamic.gateway.ModuleBannerUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.ModuleBannerUser();
  }

  public static bilibili.dynamic.gateway.ModuleBannerUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleBannerUser>
      PARSER = new com.google.protobuf.AbstractParser<ModuleBannerUser>() {
    @java.lang.Override
    public ModuleBannerUser parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModuleBannerUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleBannerUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.ModuleBannerUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

