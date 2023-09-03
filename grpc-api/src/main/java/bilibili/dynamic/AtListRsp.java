// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * at列表-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.AtListRsp}
 */
public final class AtListRsp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.AtListRsp)
    AtListRspOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AtListRsp.newBuilder() to construct.
  private AtListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AtListRsp() {
    groups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AtListRsp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_AtListRsp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_AtListRsp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.AtListRsp.class, bilibili.dynamic.AtListRsp.Builder.class);
  }

  public static final int GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.dynamic.AtGroup> groups_;
  /**
   * <pre>
   * 分组信息
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.dynamic.AtGroup> getGroupsList() {
    return groups_;
  }
  /**
   * <pre>
   * 分组信息
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.dynamic.AtGroupOrBuilder> 
      getGroupsOrBuilderList() {
    return groups_;
  }
  /**
   * <pre>
   * 分组信息
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
   */
  @java.lang.Override
  public int getGroupsCount() {
    return groups_.size();
  }
  /**
   * <pre>
   * 分组信息
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.AtGroup getGroups(int index) {
    return groups_.get(index);
  }
  /**
   * <pre>
   * 分组信息
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.AtGroupOrBuilder getGroupsOrBuilder(
      int index) {
    return groups_.get(index);
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
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(1, groups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groups_.get(i));
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
    if (!(obj instanceof bilibili.dynamic.AtListRsp)) {
      return super.equals(obj);
    }
    bilibili.dynamic.AtListRsp other = (bilibili.dynamic.AtListRsp) obj;

    if (!getGroupsList()
        .equals(other.getGroupsList())) return false;
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
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.AtListRsp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.AtListRsp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.AtListRsp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.AtListRsp parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.AtListRsp prototype) {
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
   * at列表-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.AtListRsp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.AtListRsp)
      bilibili.dynamic.AtListRspOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_AtListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_AtListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.AtListRsp.class, bilibili.dynamic.AtListRsp.Builder.class);
    }

    // Construct using bilibili.dynamic.AtListRsp.newBuilder()
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
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
      } else {
        groups_ = null;
        groupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_AtListRsp_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.AtListRsp getDefaultInstanceForType() {
      return bilibili.dynamic.AtListRsp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.AtListRsp build() {
      bilibili.dynamic.AtListRsp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.AtListRsp buildPartial() {
      bilibili.dynamic.AtListRsp result = new bilibili.dynamic.AtListRsp(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.dynamic.AtListRsp result) {
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.dynamic.AtListRsp result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.AtListRsp) {
        return mergeFrom((bilibili.dynamic.AtListRsp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.AtListRsp other) {
      if (other == bilibili.dynamic.AtListRsp.getDefaultInstance()) return this;
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
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
              bilibili.dynamic.AtGroup m =
                  input.readMessage(
                      bilibili.dynamic.AtGroup.parser(),
                      extensionRegistry);
              if (groupsBuilder_ == null) {
                ensureGroupsIsMutable();
                groups_.add(m);
              } else {
                groupsBuilder_.addMessage(m);
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

    private java.util.List<bilibili.dynamic.AtGroup> groups_ =
      java.util.Collections.emptyList();
    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groups_ = new java.util.ArrayList<bilibili.dynamic.AtGroup>(groups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dynamic.AtGroup, bilibili.dynamic.AtGroup.Builder, bilibili.dynamic.AtGroupOrBuilder> groupsBuilder_;

    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public java.util.List<bilibili.dynamic.AtGroup> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public bilibili.dynamic.AtGroup getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder setGroups(
        int index, bilibili.dynamic.AtGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder setGroups(
        int index, bilibili.dynamic.AtGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder addGroups(bilibili.dynamic.AtGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder addGroups(
        int index, bilibili.dynamic.AtGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder addGroups(
        bilibili.dynamic.AtGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder addGroups(
        int index, bilibili.dynamic.AtGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder addAllGroups(
        java.lang.Iterable<? extends bilibili.dynamic.AtGroup> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public bilibili.dynamic.AtGroup.Builder getGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public bilibili.dynamic.AtGroupOrBuilder getGroupsOrBuilder(
        int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);  } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public java.util.List<? extends bilibili.dynamic.AtGroupOrBuilder> 
         getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public bilibili.dynamic.AtGroup.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
          bilibili.dynamic.AtGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public bilibili.dynamic.AtGroup.Builder addGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().addBuilder(
          index, bilibili.dynamic.AtGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * 分组信息
     * </pre>
     *
     * <code>repeated .bilibili.dynamic.AtGroup groups = 1;</code>
     */
    public java.util.List<bilibili.dynamic.AtGroup.Builder> 
         getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dynamic.AtGroup, bilibili.dynamic.AtGroup.Builder, bilibili.dynamic.AtGroupOrBuilder> 
        getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.dynamic.AtGroup, bilibili.dynamic.AtGroup.Builder, bilibili.dynamic.AtGroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.AtListRsp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.AtListRsp)
  private static final bilibili.dynamic.AtListRsp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.AtListRsp();
  }

  public static bilibili.dynamic.AtListRsp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AtListRsp>
      PARSER = new com.google.protobuf.AbstractParser<AtListRsp>() {
    @java.lang.Override
    public AtListRsp parsePartialFrom(
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

  public static com.google.protobuf.Parser<AtListRsp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AtListRsp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.AtListRsp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
