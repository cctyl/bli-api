// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.topic.v1.TopicSetSortCfg}
 */
public final class TopicSetSortCfg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.topic.v1.TopicSetSortCfg)
    TopicSetSortCfgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicSetSortCfg.newBuilder() to construct.
  private TopicSetSortCfg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicSetSortCfg() {
    allSortBy_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicSetSortCfg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicSetSortCfg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicSetSortCfg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.topic.v1.TopicSetSortCfg.class, bilibili.app.topic.v1.TopicSetSortCfg.Builder.class);
  }

  public static final int DEFAULT_SORT_BY_FIELD_NUMBER = 1;
  private long defaultSortBy_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 default_sort_by = 1;</code>
   * @return The defaultSortBy.
   */
  @java.lang.Override
  public long getDefaultSortBy() {
    return defaultSortBy_;
  }

  public static final int ALL_SORT_BY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.topic.v1.SortContent> allSortBy_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.topic.v1.SortContent> getAllSortByList() {
    return allSortBy_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.topic.v1.SortContentOrBuilder> 
      getAllSortByOrBuilderList() {
    return allSortBy_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  @java.lang.Override
  public int getAllSortByCount() {
    return allSortBy_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.SortContent getAllSortBy(int index) {
    return allSortBy_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.topic.v1.SortContentOrBuilder getAllSortByOrBuilder(
      int index) {
    return allSortBy_.get(index);
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
    if (defaultSortBy_ != 0L) {
      output.writeInt64(1, defaultSortBy_);
    }
    for (int i = 0; i < allSortBy_.size(); i++) {
      output.writeMessage(2, allSortBy_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultSortBy_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, defaultSortBy_);
    }
    for (int i = 0; i < allSortBy_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, allSortBy_.get(i));
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
    if (!(obj instanceof bilibili.app.topic.v1.TopicSetSortCfg)) {
      return super.equals(obj);
    }
    bilibili.app.topic.v1.TopicSetSortCfg other = (bilibili.app.topic.v1.TopicSetSortCfg) obj;

    if (getDefaultSortBy()
        != other.getDefaultSortBy()) return false;
    if (!getAllSortByList()
        .equals(other.getAllSortByList())) return false;
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
    hash = (37 * hash) + DEFAULT_SORT_BY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDefaultSortBy());
    if (getAllSortByCount() > 0) {
      hash = (37 * hash) + ALL_SORT_BY_FIELD_NUMBER;
      hash = (53 * hash) + getAllSortByList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.topic.v1.TopicSetSortCfg parseFrom(
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
  public static Builder newBuilder(bilibili.app.topic.v1.TopicSetSortCfg prototype) {
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
   * Protobuf type {@code bilibili.app.topic.v1.TopicSetSortCfg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.topic.v1.TopicSetSortCfg)
      bilibili.app.topic.v1.TopicSetSortCfgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicSetSortCfg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicSetSortCfg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.topic.v1.TopicSetSortCfg.class, bilibili.app.topic.v1.TopicSetSortCfg.Builder.class);
    }

    // Construct using bilibili.app.topic.v1.TopicSetSortCfg.newBuilder()
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
      defaultSortBy_ = 0L;
      if (allSortByBuilder_ == null) {
        allSortBy_ = java.util.Collections.emptyList();
      } else {
        allSortBy_ = null;
        allSortByBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.topic.v1.TopicOuterClass.internal_static_bilibili_app_topic_v1_TopicSetSortCfg_descriptor;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicSetSortCfg getDefaultInstanceForType() {
      return bilibili.app.topic.v1.TopicSetSortCfg.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicSetSortCfg build() {
      bilibili.app.topic.v1.TopicSetSortCfg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.topic.v1.TopicSetSortCfg buildPartial() {
      bilibili.app.topic.v1.TopicSetSortCfg result = new bilibili.app.topic.v1.TopicSetSortCfg(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.topic.v1.TopicSetSortCfg result) {
      if (allSortByBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          allSortBy_ = java.util.Collections.unmodifiableList(allSortBy_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.allSortBy_ = allSortBy_;
      } else {
        result.allSortBy_ = allSortByBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.topic.v1.TopicSetSortCfg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.defaultSortBy_ = defaultSortBy_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.topic.v1.TopicSetSortCfg) {
        return mergeFrom((bilibili.app.topic.v1.TopicSetSortCfg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.topic.v1.TopicSetSortCfg other) {
      if (other == bilibili.app.topic.v1.TopicSetSortCfg.getDefaultInstance()) return this;
      if (other.getDefaultSortBy() != 0L) {
        setDefaultSortBy(other.getDefaultSortBy());
      }
      if (allSortByBuilder_ == null) {
        if (!other.allSortBy_.isEmpty()) {
          if (allSortBy_.isEmpty()) {
            allSortBy_ = other.allSortBy_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAllSortByIsMutable();
            allSortBy_.addAll(other.allSortBy_);
          }
          onChanged();
        }
      } else {
        if (!other.allSortBy_.isEmpty()) {
          if (allSortByBuilder_.isEmpty()) {
            allSortByBuilder_.dispose();
            allSortByBuilder_ = null;
            allSortBy_ = other.allSortBy_;
            bitField0_ = (bitField0_ & ~0x00000002);
            allSortByBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllSortByFieldBuilder() : null;
          } else {
            allSortByBuilder_.addAllMessages(other.allSortBy_);
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
              defaultSortBy_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              bilibili.app.topic.v1.SortContent m =
                  input.readMessage(
                      bilibili.app.topic.v1.SortContent.parser(),
                      extensionRegistry);
              if (allSortByBuilder_ == null) {
                ensureAllSortByIsMutable();
                allSortBy_.add(m);
              } else {
                allSortByBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private long defaultSortBy_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 default_sort_by = 1;</code>
     * @return The defaultSortBy.
     */
    @java.lang.Override
    public long getDefaultSortBy() {
      return defaultSortBy_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 default_sort_by = 1;</code>
     * @param value The defaultSortBy to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultSortBy(long value) {

      defaultSortBy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 default_sort_by = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultSortBy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      defaultSortBy_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.app.topic.v1.SortContent> allSortBy_ =
      java.util.Collections.emptyList();
    private void ensureAllSortByIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        allSortBy_ = new java.util.ArrayList<bilibili.app.topic.v1.SortContent>(allSortBy_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.SortContent, bilibili.app.topic.v1.SortContent.Builder, bilibili.app.topic.v1.SortContentOrBuilder> allSortByBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public java.util.List<bilibili.app.topic.v1.SortContent> getAllSortByList() {
      if (allSortByBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allSortBy_);
      } else {
        return allSortByBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public int getAllSortByCount() {
      if (allSortByBuilder_ == null) {
        return allSortBy_.size();
      } else {
        return allSortByBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public bilibili.app.topic.v1.SortContent getAllSortBy(int index) {
      if (allSortByBuilder_ == null) {
        return allSortBy_.get(index);
      } else {
        return allSortByBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder setAllSortBy(
        int index, bilibili.app.topic.v1.SortContent value) {
      if (allSortByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllSortByIsMutable();
        allSortBy_.set(index, value);
        onChanged();
      } else {
        allSortByBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder setAllSortBy(
        int index, bilibili.app.topic.v1.SortContent.Builder builderForValue) {
      if (allSortByBuilder_ == null) {
        ensureAllSortByIsMutable();
        allSortBy_.set(index, builderForValue.build());
        onChanged();
      } else {
        allSortByBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder addAllSortBy(bilibili.app.topic.v1.SortContent value) {
      if (allSortByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllSortByIsMutable();
        allSortBy_.add(value);
        onChanged();
      } else {
        allSortByBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder addAllSortBy(
        int index, bilibili.app.topic.v1.SortContent value) {
      if (allSortByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllSortByIsMutable();
        allSortBy_.add(index, value);
        onChanged();
      } else {
        allSortByBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder addAllSortBy(
        bilibili.app.topic.v1.SortContent.Builder builderForValue) {
      if (allSortByBuilder_ == null) {
        ensureAllSortByIsMutable();
        allSortBy_.add(builderForValue.build());
        onChanged();
      } else {
        allSortByBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder addAllSortBy(
        int index, bilibili.app.topic.v1.SortContent.Builder builderForValue) {
      if (allSortByBuilder_ == null) {
        ensureAllSortByIsMutable();
        allSortBy_.add(index, builderForValue.build());
        onChanged();
      } else {
        allSortByBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder addAllAllSortBy(
        java.lang.Iterable<? extends bilibili.app.topic.v1.SortContent> values) {
      if (allSortByBuilder_ == null) {
        ensureAllSortByIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allSortBy_);
        onChanged();
      } else {
        allSortByBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder clearAllSortBy() {
      if (allSortByBuilder_ == null) {
        allSortBy_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        allSortByBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public Builder removeAllSortBy(int index) {
      if (allSortByBuilder_ == null) {
        ensureAllSortByIsMutable();
        allSortBy_.remove(index);
        onChanged();
      } else {
        allSortByBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public bilibili.app.topic.v1.SortContent.Builder getAllSortByBuilder(
        int index) {
      return getAllSortByFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public bilibili.app.topic.v1.SortContentOrBuilder getAllSortByOrBuilder(
        int index) {
      if (allSortByBuilder_ == null) {
        return allSortBy_.get(index);  } else {
        return allSortByBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public java.util.List<? extends bilibili.app.topic.v1.SortContentOrBuilder> 
         getAllSortByOrBuilderList() {
      if (allSortByBuilder_ != null) {
        return allSortByBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allSortBy_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public bilibili.app.topic.v1.SortContent.Builder addAllSortByBuilder() {
      return getAllSortByFieldBuilder().addBuilder(
          bilibili.app.topic.v1.SortContent.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public bilibili.app.topic.v1.SortContent.Builder addAllSortByBuilder(
        int index) {
      return getAllSortByFieldBuilder().addBuilder(
          index, bilibili.app.topic.v1.SortContent.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
     */
    public java.util.List<bilibili.app.topic.v1.SortContent.Builder> 
         getAllSortByBuilderList() {
      return getAllSortByFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.topic.v1.SortContent, bilibili.app.topic.v1.SortContent.Builder, bilibili.app.topic.v1.SortContentOrBuilder> 
        getAllSortByFieldBuilder() {
      if (allSortByBuilder_ == null) {
        allSortByBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.topic.v1.SortContent, bilibili.app.topic.v1.SortContent.Builder, bilibili.app.topic.v1.SortContentOrBuilder>(
                allSortBy_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        allSortBy_ = null;
      }
      return allSortByBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.topic.v1.TopicSetSortCfg)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.topic.v1.TopicSetSortCfg)
  private static final bilibili.app.topic.v1.TopicSetSortCfg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.topic.v1.TopicSetSortCfg();
  }

  public static bilibili.app.topic.v1.TopicSetSortCfg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicSetSortCfg>
      PARSER = new com.google.protobuf.AbstractParser<TopicSetSortCfg>() {
    @java.lang.Override
    public TopicSetSortCfg parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicSetSortCfg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicSetSortCfg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.topic.v1.TopicSetSortCfg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
