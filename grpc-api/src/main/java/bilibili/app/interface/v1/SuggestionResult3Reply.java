// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/search.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 获取搜索建议-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.SuggestionResult3Reply}
 */
public final class SuggestionResult3Reply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.SuggestionResult3Reply)
    SuggestionResult3ReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestionResult3Reply.newBuilder() to construct.
  private SuggestionResult3Reply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestionResult3Reply() {
    trackid_ = "";
    list_ = java.util.Collections.emptyList();
    expStr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestionResult3Reply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.SuggestionResult3Reply.class, bilibili.app.interface.v1.SuggestionResult3Reply.Builder.class);
  }

  public static final int TRACKID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object trackid_ = "";
  /**
   * <pre>
   * 搜索追踪id
   * </pre>
   *
   * <code>string trackid = 1;</code>
   * @return The trackid.
   */
  @java.lang.Override
  public java.lang.String getTrackid() {
    java.lang.Object ref = trackid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trackid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 搜索追踪id
   * </pre>
   *
   * <code>string trackid = 1;</code>
   * @return The bytes for trackid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTrackidBytes() {
    java.lang.Object ref = trackid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trackid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.interface.v1.ResultItem> list_;
  /**
   * <pre>
   * 搜索建议条目列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.interface.v1.ResultItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 搜索建议条目列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.interface.v1.ResultItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 搜索建议条目列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 搜索建议条目列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.ResultItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 搜索建议条目列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.ResultItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int EXP_STR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object expStr_ = "";
  /**
   * <pre>
   * 搜索的abtest 实验信息
   * </pre>
   *
   * <code>string exp_str = 3;</code>
   * @return The expStr.
   */
  @java.lang.Override
  public java.lang.String getExpStr() {
    java.lang.Object ref = expStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expStr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 搜索的abtest 实验信息
   * </pre>
   *
   * <code>string exp_str = 3;</code>
   * @return The bytes for expStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpStrBytes() {
    java.lang.Object ref = expStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expStr_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trackid_);
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(2, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expStr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, expStr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trackid_);
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, list_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expStr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, expStr_);
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
    if (!(obj instanceof bilibili.app.interface.v1.SuggestionResult3Reply)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.SuggestionResult3Reply other = (bilibili.app.interface.v1.SuggestionResult3Reply) obj;

    if (!getTrackid()
        .equals(other.getTrackid())) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
    if (!getExpStr()
        .equals(other.getExpStr())) return false;
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
    hash = (37 * hash) + TRACKID_FIELD_NUMBER;
    hash = (53 * hash) + getTrackid().hashCode();
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + EXP_STR_FIELD_NUMBER;
    hash = (53 * hash) + getExpStr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.SuggestionResult3Reply parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.SuggestionResult3Reply prototype) {
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
   * 获取搜索建议-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.SuggestionResult3Reply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.SuggestionResult3Reply)
      bilibili.app.interface.v1.SuggestionResult3ReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.SuggestionResult3Reply.class, bilibili.app.interface.v1.SuggestionResult3Reply.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.SuggestionResult3Reply.newBuilder()
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
      trackid_ = "";
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
      } else {
        list_ = null;
        listBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      expStr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.SearchOuterClass.internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Reply getDefaultInstanceForType() {
      return bilibili.app.interface.v1.SuggestionResult3Reply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Reply build() {
      bilibili.app.interface.v1.SuggestionResult3Reply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.SuggestionResult3Reply buildPartial() {
      bilibili.app.interface.v1.SuggestionResult3Reply result = new bilibili.app.interface.v1.SuggestionResult3Reply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.interface.v1.SuggestionResult3Reply result) {
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

    private void buildPartial0(bilibili.app.interface.v1.SuggestionResult3Reply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trackid_ = trackid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expStr_ = expStr_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.SuggestionResult3Reply) {
        return mergeFrom((bilibili.app.interface.v1.SuggestionResult3Reply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.SuggestionResult3Reply other) {
      if (other == bilibili.app.interface.v1.SuggestionResult3Reply.getDefaultInstance()) return this;
      if (!other.getTrackid().isEmpty()) {
        trackid_ = other.trackid_;
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
      if (!other.getExpStr().isEmpty()) {
        expStr_ = other.expStr_;
        bitField0_ |= 0x00000004;
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
              trackid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.app.interface.v1.ResultItem m =
                  input.readMessage(
                      bilibili.app.interface.v1.ResultItem.parser(),
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
              expStr_ = input.readStringRequireUtf8();
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

    private java.lang.Object trackid_ = "";
    /**
     * <pre>
     * 搜索追踪id
     * </pre>
     *
     * <code>string trackid = 1;</code>
     * @return The trackid.
     */
    public java.lang.String getTrackid() {
      java.lang.Object ref = trackid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trackid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 搜索追踪id
     * </pre>
     *
     * <code>string trackid = 1;</code>
     * @return The bytes for trackid.
     */
    public com.google.protobuf.ByteString
        getTrackidBytes() {
      java.lang.Object ref = trackid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trackid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 搜索追踪id
     * </pre>
     *
     * <code>string trackid = 1;</code>
     * @param value The trackid to set.
     * @return This builder for chaining.
     */
    public Builder setTrackid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      trackid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索追踪id
     * </pre>
     *
     * <code>string trackid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrackid() {
      trackid_ = getDefaultInstance().getTrackid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索追踪id
     * </pre>
     *
     * <code>string trackid = 1;</code>
     * @param value The bytes for trackid to set.
     * @return This builder for chaining.
     */
    public Builder setTrackidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      trackid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.app.interface.v1.ResultItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        list_ = new java.util.ArrayList<bilibili.app.interface.v1.ResultItem>(list_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.interface.v1.ResultItem, bilibili.app.interface.v1.ResultItem.Builder, bilibili.app.interface.v1.ResultItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public java.util.List<bilibili.app.interface.v1.ResultItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public bilibili.app.interface.v1.ResultItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder setList(
        int index, bilibili.app.interface.v1.ResultItem value) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder setList(
        int index, bilibili.app.interface.v1.ResultItem.Builder builderForValue) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder addList(bilibili.app.interface.v1.ResultItem value) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder addList(
        int index, bilibili.app.interface.v1.ResultItem value) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder addList(
        bilibili.app.interface.v1.ResultItem.Builder builderForValue) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder addList(
        int index, bilibili.app.interface.v1.ResultItem.Builder builderForValue) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends bilibili.app.interface.v1.ResultItem> values) {
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
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
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public bilibili.app.interface.v1.ResultItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public bilibili.app.interface.v1.ResultItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public java.util.List<? extends bilibili.app.interface.v1.ResultItemOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public bilibili.app.interface.v1.ResultItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          bilibili.app.interface.v1.ResultItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public bilibili.app.interface.v1.ResultItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, bilibili.app.interface.v1.ResultItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 搜索建议条目列表
     * </pre>
     *
     * <code>repeated .bilibili.app.interface.v1.ResultItem list = 2;</code>
     */
    public java.util.List<bilibili.app.interface.v1.ResultItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.interface.v1.ResultItem, bilibili.app.interface.v1.ResultItem.Builder, bilibili.app.interface.v1.ResultItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.interface.v1.ResultItem, bilibili.app.interface.v1.ResultItem.Builder, bilibili.app.interface.v1.ResultItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private java.lang.Object expStr_ = "";
    /**
     * <pre>
     * 搜索的abtest 实验信息
     * </pre>
     *
     * <code>string exp_str = 3;</code>
     * @return The expStr.
     */
    public java.lang.String getExpStr() {
      java.lang.Object ref = expStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 搜索的abtest 实验信息
     * </pre>
     *
     * <code>string exp_str = 3;</code>
     * @return The bytes for expStr.
     */
    public com.google.protobuf.ByteString
        getExpStrBytes() {
      java.lang.Object ref = expStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 搜索的abtest 实验信息
     * </pre>
     *
     * <code>string exp_str = 3;</code>
     * @param value The expStr to set.
     * @return This builder for chaining.
     */
    public Builder setExpStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      expStr_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索的abtest 实验信息
     * </pre>
     *
     * <code>string exp_str = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpStr() {
      expStr_ = getDefaultInstance().getExpStr();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 搜索的abtest 实验信息
     * </pre>
     *
     * <code>string exp_str = 3;</code>
     * @param value The bytes for expStr to set.
     * @return This builder for chaining.
     */
    public Builder setExpStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      expStr_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.SuggestionResult3Reply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.SuggestionResult3Reply)
  private static final bilibili.app.interface.v1.SuggestionResult3Reply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.SuggestionResult3Reply();
  }

  public static bilibili.app.interface.v1.SuggestionResult3Reply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestionResult3Reply>
      PARSER = new com.google.protobuf.AbstractParser<SuggestionResult3Reply>() {
    @java.lang.Override
    public SuggestionResult3Reply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestionResult3Reply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestionResult3Reply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.SuggestionResult3Reply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
