// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.FeedViewItem}
 */
public final class FeedViewItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.FeedViewItem)
    FeedViewItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedViewItem.newBuilder() to construct.
  private FeedViewItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedViewItem() {
    goto_ = "";
    uri_ = "";
    trackId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedViewItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_FeedViewItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_FeedViewItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.FeedViewItem.class, bilibili.app.view.v1.FeedViewItem.Builder.class);
  }

  public static final int VIEW_FIELD_NUMBER = 1;
  private bilibili.app.view.v1.ViewReply view_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
   * @return Whether the view field is set.
   */
  @java.lang.Override
  public boolean hasView() {
    return view_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
   * @return The view.
   */
  @java.lang.Override
  public bilibili.app.view.v1.ViewReply getView() {
    return view_ == null ? bilibili.app.view.v1.ViewReply.getDefaultInstance() : view_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.ViewReplyOrBuilder getViewOrBuilder() {
    return view_ == null ? bilibili.app.view.v1.ViewReply.getDefaultInstance() : view_;
  }

  public static final int GOTO_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object goto_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string goto = 2;</code>
   * @return The goto.
   */
  @java.lang.Override
  public java.lang.String getGoto() {
    java.lang.Object ref = goto_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      goto_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string goto = 2;</code>
   * @return The bytes for goto.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGotoBytes() {
    java.lang.Object ref = goto_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      goto_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACK_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object trackId_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string track_id = 4;</code>
   * @return The trackId.
   */
  @java.lang.Override
  public java.lang.String getTrackId() {
    java.lang.Object ref = trackId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trackId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string track_id = 4;</code>
   * @return The bytes for trackId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTrackIdBytes() {
    java.lang.Object ref = trackId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trackId_ = b;
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
    if (view_ != null) {
      output.writeMessage(1, getView());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(goto_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, goto_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, trackId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (view_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getView());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(goto_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, goto_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, trackId_);
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
    if (!(obj instanceof bilibili.app.view.v1.FeedViewItem)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.FeedViewItem other = (bilibili.app.view.v1.FeedViewItem) obj;

    if (hasView() != other.hasView()) return false;
    if (hasView()) {
      if (!getView()
          .equals(other.getView())) return false;
    }
    if (!getGoto()
        .equals(other.getGoto())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (!getTrackId()
        .equals(other.getTrackId())) return false;
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
    if (hasView()) {
      hash = (37 * hash) + VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getView().hashCode();
    }
    hash = (37 * hash) + GOTO_FIELD_NUMBER;
    hash = (53 * hash) + getGoto().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + TRACK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTrackId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.FeedViewItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.FeedViewItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.FeedViewItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.FeedViewItem prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.FeedViewItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.FeedViewItem)
      bilibili.app.view.v1.FeedViewItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_FeedViewItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_FeedViewItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.FeedViewItem.class, bilibili.app.view.v1.FeedViewItem.Builder.class);
    }

    // Construct using bilibili.app.view.v1.FeedViewItem.newBuilder()
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
      view_ = null;
      if (viewBuilder_ != null) {
        viewBuilder_.dispose();
        viewBuilder_ = null;
      }
      goto_ = "";
      uri_ = "";
      trackId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_FeedViewItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.FeedViewItem getDefaultInstanceForType() {
      return bilibili.app.view.v1.FeedViewItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.FeedViewItem build() {
      bilibili.app.view.v1.FeedViewItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.FeedViewItem buildPartial() {
      bilibili.app.view.v1.FeedViewItem result = new bilibili.app.view.v1.FeedViewItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.FeedViewItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.view_ = viewBuilder_ == null
            ? view_
            : viewBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.goto_ = goto_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.trackId_ = trackId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.FeedViewItem) {
        return mergeFrom((bilibili.app.view.v1.FeedViewItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.FeedViewItem other) {
      if (other == bilibili.app.view.v1.FeedViewItem.getDefaultInstance()) return this;
      if (other.hasView()) {
        mergeView(other.getView());
      }
      if (!other.getGoto().isEmpty()) {
        goto_ = other.goto_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getTrackId().isEmpty()) {
        trackId_ = other.trackId_;
        bitField0_ |= 0x00000008;
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
              input.readMessage(
                  getViewFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              goto_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              trackId_ = input.readStringRequireUtf8();
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

    private bilibili.app.view.v1.ViewReply view_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.ViewReply, bilibili.app.view.v1.ViewReply.Builder, bilibili.app.view.v1.ViewReplyOrBuilder> viewBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     * @return Whether the view field is set.
     */
    public boolean hasView() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     * @return The view.
     */
    public bilibili.app.view.v1.ViewReply getView() {
      if (viewBuilder_ == null) {
        return view_ == null ? bilibili.app.view.v1.ViewReply.getDefaultInstance() : view_;
      } else {
        return viewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public Builder setView(bilibili.app.view.v1.ViewReply value) {
      if (viewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        view_ = value;
      } else {
        viewBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public Builder setView(
        bilibili.app.view.v1.ViewReply.Builder builderForValue) {
      if (viewBuilder_ == null) {
        view_ = builderForValue.build();
      } else {
        viewBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public Builder mergeView(bilibili.app.view.v1.ViewReply value) {
      if (viewBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          view_ != null &&
          view_ != bilibili.app.view.v1.ViewReply.getDefaultInstance()) {
          getViewBuilder().mergeFrom(value);
        } else {
          view_ = value;
        }
      } else {
        viewBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000001);
      view_ = null;
      if (viewBuilder_ != null) {
        viewBuilder_.dispose();
        viewBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public bilibili.app.view.v1.ViewReply.Builder getViewBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getViewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    public bilibili.app.view.v1.ViewReplyOrBuilder getViewOrBuilder() {
      if (viewBuilder_ != null) {
        return viewBuilder_.getMessageOrBuilder();
      } else {
        return view_ == null ?
            bilibili.app.view.v1.ViewReply.getDefaultInstance() : view_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.ViewReply view = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.ViewReply, bilibili.app.view.v1.ViewReply.Builder, bilibili.app.view.v1.ViewReplyOrBuilder> 
        getViewFieldBuilder() {
      if (viewBuilder_ == null) {
        viewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.ViewReply, bilibili.app.view.v1.ViewReply.Builder, bilibili.app.view.v1.ViewReplyOrBuilder>(
                getView(),
                getParentForChildren(),
                isClean());
        view_ = null;
      }
      return viewBuilder_;
    }

    private java.lang.Object goto_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string goto = 2;</code>
     * @return The goto.
     */
    public java.lang.String getGoto() {
      java.lang.Object ref = goto_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        goto_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string goto = 2;</code>
     * @return The bytes for goto.
     */
    public com.google.protobuf.ByteString
        getGotoBytes() {
      java.lang.Object ref = goto_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        goto_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string goto = 2;</code>
     * @param value The goto to set.
     * @return This builder for chaining.
     */
    public Builder setGoto(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      goto_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string goto = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGoto() {
      goto_ = getDefaultInstance().getGoto();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string goto = 2;</code>
     * @param value The bytes for goto to set.
     * @return This builder for chaining.
     */
    public Builder setGotoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      goto_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string uri = 3;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object trackId_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string track_id = 4;</code>
     * @return The trackId.
     */
    public java.lang.String getTrackId() {
      java.lang.Object ref = trackId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trackId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string track_id = 4;</code>
     * @return The bytes for trackId.
     */
    public com.google.protobuf.ByteString
        getTrackIdBytes() {
      java.lang.Object ref = trackId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trackId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string track_id = 4;</code>
     * @param value The trackId to set.
     * @return This builder for chaining.
     */
    public Builder setTrackId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      trackId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string track_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrackId() {
      trackId_ = getDefaultInstance().getTrackId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string track_id = 4;</code>
     * @param value The bytes for trackId to set.
     * @return This builder for chaining.
     */
    public Builder setTrackIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      trackId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.FeedViewItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.FeedViewItem)
  private static final bilibili.app.view.v1.FeedViewItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.FeedViewItem();
  }

  public static bilibili.app.view.v1.FeedViewItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedViewItem>
      PARSER = new com.google.protobuf.AbstractParser<FeedViewItem>() {
    @java.lang.Override
    public FeedViewItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedViewItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedViewItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.FeedViewItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

