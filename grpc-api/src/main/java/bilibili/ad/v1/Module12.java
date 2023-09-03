// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.ad.v1.Module12}
 */
public final class Module12 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.ad.v1.Module12)
    Module12OrBuilder {
private static final long serialVersionUID = 0L;
  // Use Module12.newBuilder() to construct.
  private Module12(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Module12() {
    commentList_ = java.util.Collections.emptyList();
    commentNum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Module12();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module12_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module12_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.ad.v1.Module12.class, bilibili.ad.v1.Module12.Builder.class);
  }

  public static final int DISPLAY_FIELD_NUMBER = 1;
  private boolean display_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool display = 1;</code>
   * @return The display.
   */
  @java.lang.Override
  public boolean getDisplay() {
    return display_;
  }

  public static final int COMMENT_LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.ad.v1.Comment> commentList_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.ad.v1.Comment> getCommentListList() {
    return commentList_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.ad.v1.CommentOrBuilder> 
      getCommentListOrBuilderList() {
    return commentList_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
   */
  @java.lang.Override
  public int getCommentListCount() {
    return commentList_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
   */
  @java.lang.Override
  public bilibili.ad.v1.Comment getCommentList(int index) {
    return commentList_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
   */
  @java.lang.Override
  public bilibili.ad.v1.CommentOrBuilder getCommentListOrBuilder(
      int index) {
    return commentList_.get(index);
  }

  public static final int COMMENT_NUM_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object commentNum_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string comment_num = 3;</code>
   * @return The commentNum.
   */
  @java.lang.Override
  public java.lang.String getCommentNum() {
    java.lang.Object ref = commentNum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commentNum_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string comment_num = 3;</code>
   * @return The bytes for commentNum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentNumBytes() {
    java.lang.Object ref = commentNum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commentNum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOW_ALL_COMMENT_FIELD_NUMBER = 4;
  private boolean showAllComment_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool show_all_comment = 4;</code>
   * @return The showAllComment.
   */
  @java.lang.Override
  public boolean getShowAllComment() {
    return showAllComment_;
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
    if (display_ != false) {
      output.writeBool(1, display_);
    }
    for (int i = 0; i < commentList_.size(); i++) {
      output.writeMessage(2, commentList_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commentNum_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, commentNum_);
    }
    if (showAllComment_ != false) {
      output.writeBool(4, showAllComment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (display_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, display_);
    }
    for (int i = 0; i < commentList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, commentList_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commentNum_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, commentNum_);
    }
    if (showAllComment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, showAllComment_);
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
    if (!(obj instanceof bilibili.ad.v1.Module12)) {
      return super.equals(obj);
    }
    bilibili.ad.v1.Module12 other = (bilibili.ad.v1.Module12) obj;

    if (getDisplay()
        != other.getDisplay()) return false;
    if (!getCommentListList()
        .equals(other.getCommentListList())) return false;
    if (!getCommentNum()
        .equals(other.getCommentNum())) return false;
    if (getShowAllComment()
        != other.getShowAllComment()) return false;
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
    hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplay());
    if (getCommentListCount() > 0) {
      hash = (37 * hash) + COMMENT_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCommentListList().hashCode();
    }
    hash = (37 * hash) + COMMENT_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getCommentNum().hashCode();
    hash = (37 * hash) + SHOW_ALL_COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShowAllComment());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.ad.v1.Module12 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module12 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.ad.v1.Module12 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.Module12 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module12 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.ad.v1.Module12 parseFrom(
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
  public static Builder newBuilder(bilibili.ad.v1.Module12 prototype) {
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
   * Protobuf type {@code bilibili.ad.v1.Module12}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.ad.v1.Module12)
      bilibili.ad.v1.Module12OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module12_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module12_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.ad.v1.Module12.class, bilibili.ad.v1.Module12.Builder.class);
    }

    // Construct using bilibili.ad.v1.Module12.newBuilder()
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
      display_ = false;
      if (commentListBuilder_ == null) {
        commentList_ = java.util.Collections.emptyList();
      } else {
        commentList_ = null;
        commentListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      commentNum_ = "";
      showAllComment_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.ad.v1.Ad.internal_static_bilibili_ad_v1_Module12_descriptor;
    }

    @java.lang.Override
    public bilibili.ad.v1.Module12 getDefaultInstanceForType() {
      return bilibili.ad.v1.Module12.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.ad.v1.Module12 build() {
      bilibili.ad.v1.Module12 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.ad.v1.Module12 buildPartial() {
      bilibili.ad.v1.Module12 result = new bilibili.ad.v1.Module12(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.ad.v1.Module12 result) {
      if (commentListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          commentList_ = java.util.Collections.unmodifiableList(commentList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.commentList_ = commentList_;
      } else {
        result.commentList_ = commentListBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.ad.v1.Module12 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.display_ = display_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.commentNum_ = commentNum_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.showAllComment_ = showAllComment_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.ad.v1.Module12) {
        return mergeFrom((bilibili.ad.v1.Module12)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.ad.v1.Module12 other) {
      if (other == bilibili.ad.v1.Module12.getDefaultInstance()) return this;
      if (other.getDisplay() != false) {
        setDisplay(other.getDisplay());
      }
      if (commentListBuilder_ == null) {
        if (!other.commentList_.isEmpty()) {
          if (commentList_.isEmpty()) {
            commentList_ = other.commentList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCommentListIsMutable();
            commentList_.addAll(other.commentList_);
          }
          onChanged();
        }
      } else {
        if (!other.commentList_.isEmpty()) {
          if (commentListBuilder_.isEmpty()) {
            commentListBuilder_.dispose();
            commentListBuilder_ = null;
            commentList_ = other.commentList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            commentListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommentListFieldBuilder() : null;
          } else {
            commentListBuilder_.addAllMessages(other.commentList_);
          }
        }
      }
      if (!other.getCommentNum().isEmpty()) {
        commentNum_ = other.commentNum_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getShowAllComment() != false) {
        setShowAllComment(other.getShowAllComment());
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
              display_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              bilibili.ad.v1.Comment m =
                  input.readMessage(
                      bilibili.ad.v1.Comment.parser(),
                      extensionRegistry);
              if (commentListBuilder_ == null) {
                ensureCommentListIsMutable();
                commentList_.add(m);
              } else {
                commentListBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              commentNum_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              showAllComment_ = input.readBool();
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

    private boolean display_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @return The display.
     */
    @java.lang.Override
    public boolean getDisplay() {
      return display_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @param value The display to set.
     * @return This builder for chaining.
     */
    public Builder setDisplay(boolean value) {

      display_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool display = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      display_ = false;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.ad.v1.Comment> commentList_ =
      java.util.Collections.emptyList();
    private void ensureCommentListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        commentList_ = new java.util.ArrayList<bilibili.ad.v1.Comment>(commentList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.ad.v1.Comment, bilibili.ad.v1.Comment.Builder, bilibili.ad.v1.CommentOrBuilder> commentListBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public java.util.List<bilibili.ad.v1.Comment> getCommentListList() {
      if (commentListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commentList_);
      } else {
        return commentListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public int getCommentListCount() {
      if (commentListBuilder_ == null) {
        return commentList_.size();
      } else {
        return commentListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public bilibili.ad.v1.Comment getCommentList(int index) {
      if (commentListBuilder_ == null) {
        return commentList_.get(index);
      } else {
        return commentListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder setCommentList(
        int index, bilibili.ad.v1.Comment value) {
      if (commentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentListIsMutable();
        commentList_.set(index, value);
        onChanged();
      } else {
        commentListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder setCommentList(
        int index, bilibili.ad.v1.Comment.Builder builderForValue) {
      if (commentListBuilder_ == null) {
        ensureCommentListIsMutable();
        commentList_.set(index, builderForValue.build());
        onChanged();
      } else {
        commentListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder addCommentList(bilibili.ad.v1.Comment value) {
      if (commentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentListIsMutable();
        commentList_.add(value);
        onChanged();
      } else {
        commentListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder addCommentList(
        int index, bilibili.ad.v1.Comment value) {
      if (commentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentListIsMutable();
        commentList_.add(index, value);
        onChanged();
      } else {
        commentListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder addCommentList(
        bilibili.ad.v1.Comment.Builder builderForValue) {
      if (commentListBuilder_ == null) {
        ensureCommentListIsMutable();
        commentList_.add(builderForValue.build());
        onChanged();
      } else {
        commentListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder addCommentList(
        int index, bilibili.ad.v1.Comment.Builder builderForValue) {
      if (commentListBuilder_ == null) {
        ensureCommentListIsMutable();
        commentList_.add(index, builderForValue.build());
        onChanged();
      } else {
        commentListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder addAllCommentList(
        java.lang.Iterable<? extends bilibili.ad.v1.Comment> values) {
      if (commentListBuilder_ == null) {
        ensureCommentListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commentList_);
        onChanged();
      } else {
        commentListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder clearCommentList() {
      if (commentListBuilder_ == null) {
        commentList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        commentListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public Builder removeCommentList(int index) {
      if (commentListBuilder_ == null) {
        ensureCommentListIsMutable();
        commentList_.remove(index);
        onChanged();
      } else {
        commentListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public bilibili.ad.v1.Comment.Builder getCommentListBuilder(
        int index) {
      return getCommentListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public bilibili.ad.v1.CommentOrBuilder getCommentListOrBuilder(
        int index) {
      if (commentListBuilder_ == null) {
        return commentList_.get(index);  } else {
        return commentListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public java.util.List<? extends bilibili.ad.v1.CommentOrBuilder> 
         getCommentListOrBuilderList() {
      if (commentListBuilder_ != null) {
        return commentListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commentList_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public bilibili.ad.v1.Comment.Builder addCommentListBuilder() {
      return getCommentListFieldBuilder().addBuilder(
          bilibili.ad.v1.Comment.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public bilibili.ad.v1.Comment.Builder addCommentListBuilder(
        int index) {
      return getCommentListFieldBuilder().addBuilder(
          index, bilibili.ad.v1.Comment.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.ad.v1.Comment comment_list = 2;</code>
     */
    public java.util.List<bilibili.ad.v1.Comment.Builder> 
         getCommentListBuilderList() {
      return getCommentListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.ad.v1.Comment, bilibili.ad.v1.Comment.Builder, bilibili.ad.v1.CommentOrBuilder> 
        getCommentListFieldBuilder() {
      if (commentListBuilder_ == null) {
        commentListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.ad.v1.Comment, bilibili.ad.v1.Comment.Builder, bilibili.ad.v1.CommentOrBuilder>(
                commentList_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        commentList_ = null;
      }
      return commentListBuilder_;
    }

    private java.lang.Object commentNum_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string comment_num = 3;</code>
     * @return The commentNum.
     */
    public java.lang.String getCommentNum() {
      java.lang.Object ref = commentNum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commentNum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comment_num = 3;</code>
     * @return The bytes for commentNum.
     */
    public com.google.protobuf.ByteString
        getCommentNumBytes() {
      java.lang.Object ref = commentNum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commentNum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comment_num = 3;</code>
     * @param value The commentNum to set.
     * @return This builder for chaining.
     */
    public Builder setCommentNum(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      commentNum_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comment_num = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommentNum() {
      commentNum_ = getDefaultInstance().getCommentNum();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string comment_num = 3;</code>
     * @param value The bytes for commentNum to set.
     * @return This builder for chaining.
     */
    public Builder setCommentNumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      commentNum_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean showAllComment_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show_all_comment = 4;</code>
     * @return The showAllComment.
     */
    @java.lang.Override
    public boolean getShowAllComment() {
      return showAllComment_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show_all_comment = 4;</code>
     * @param value The showAllComment to set.
     * @return This builder for chaining.
     */
    public Builder setShowAllComment(boolean value) {

      showAllComment_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool show_all_comment = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowAllComment() {
      bitField0_ = (bitField0_ & ~0x00000008);
      showAllComment_ = false;
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


    // @@protoc_insertion_point(builder_scope:bilibili.ad.v1.Module12)
  }

  // @@protoc_insertion_point(class_scope:bilibili.ad.v1.Module12)
  private static final bilibili.ad.v1.Module12 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.ad.v1.Module12();
  }

  public static bilibili.ad.v1.Module12 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module12>
      PARSER = new com.google.protobuf.AbstractParser<Module12>() {
    @java.lang.Override
    public Module12 parsePartialFrom(
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

  public static com.google.protobuf.Parser<Module12> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module12> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.ad.v1.Module12 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
