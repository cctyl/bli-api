// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.viewunite.v1.ViewReply}
 */
public final class ViewReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.viewunite.v1.ViewReply)
    ViewReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ViewReply.newBuilder() to construct.
  private ViewReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViewReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ViewReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_ViewReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_ViewReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.viewunite.v1.ViewReply.class, bilibili.app.viewunite.v1.ViewReply.Builder.class);
  }

  public static final int VIEW_BASE_FIELD_NUMBER = 1;
  private bilibili.app.viewunite.v1.ViewBase viewBase_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
   * @return Whether the viewBase field is set.
   */
  @java.lang.Override
  public boolean hasViewBase() {
    return viewBase_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
   * @return The viewBase.
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.ViewBase getViewBase() {
    return viewBase_ == null ? bilibili.app.viewunite.v1.ViewBase.getDefaultInstance() : viewBase_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.ViewBaseOrBuilder getViewBaseOrBuilder() {
    return viewBase_ == null ? bilibili.app.viewunite.v1.ViewBase.getDefaultInstance() : viewBase_;
  }

  public static final int SELECTION_MODULE_FIELD_NUMBER = 3;
  private bilibili.app.viewunite.v1.SelectionModule selectionModule_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
   * @return Whether the selectionModule field is set.
   */
  @java.lang.Override
  public boolean hasSelectionModule() {
    return selectionModule_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
   * @return The selectionModule.
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.SelectionModule getSelectionModule() {
    return selectionModule_ == null ? bilibili.app.viewunite.v1.SelectionModule.getDefaultInstance() : selectionModule_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.viewunite.v1.SelectionModuleOrBuilder getSelectionModuleOrBuilder() {
    return selectionModule_ == null ? bilibili.app.viewunite.v1.SelectionModule.getDefaultInstance() : selectionModule_;
  }

  public static final int SUPPLEMENT_FIELD_NUMBER = 4;
  private com.google.protobuf.Any supplement_;
  /**
   * <pre>
   * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
   * </pre>
   *
   * <code>.google.protobuf.Any supplement = 4;</code>
   * @return Whether the supplement field is set.
   */
  @java.lang.Override
  public boolean hasSupplement() {
    return supplement_ != null;
  }
  /**
   * <pre>
   * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
   * </pre>
   *
   * <code>.google.protobuf.Any supplement = 4;</code>
   * @return The supplement.
   */
  @java.lang.Override
  public com.google.protobuf.Any getSupplement() {
    return supplement_ == null ? com.google.protobuf.Any.getDefaultInstance() : supplement_;
  }
  /**
   * <pre>
   * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
   * </pre>
   *
   * <code>.google.protobuf.Any supplement = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSupplementOrBuilder() {
    return supplement_ == null ? com.google.protobuf.Any.getDefaultInstance() : supplement_;
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
    if (viewBase_ != null) {
      output.writeMessage(1, getViewBase());
    }
    if (selectionModule_ != null) {
      output.writeMessage(3, getSelectionModule());
    }
    if (supplement_ != null) {
      output.writeMessage(4, getSupplement());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (viewBase_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getViewBase());
    }
    if (selectionModule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSelectionModule());
    }
    if (supplement_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSupplement());
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
    if (!(obj instanceof bilibili.app.viewunite.v1.ViewReply)) {
      return super.equals(obj);
    }
    bilibili.app.viewunite.v1.ViewReply other = (bilibili.app.viewunite.v1.ViewReply) obj;

    if (hasViewBase() != other.hasViewBase()) return false;
    if (hasViewBase()) {
      if (!getViewBase()
          .equals(other.getViewBase())) return false;
    }
    if (hasSelectionModule() != other.hasSelectionModule()) return false;
    if (hasSelectionModule()) {
      if (!getSelectionModule()
          .equals(other.getSelectionModule())) return false;
    }
    if (hasSupplement() != other.hasSupplement()) return false;
    if (hasSupplement()) {
      if (!getSupplement()
          .equals(other.getSupplement())) return false;
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
    if (hasViewBase()) {
      hash = (37 * hash) + VIEW_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getViewBase().hashCode();
    }
    if (hasSelectionModule()) {
      hash = (37 * hash) + SELECTION_MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getSelectionModule().hashCode();
    }
    if (hasSupplement()) {
      hash = (37 * hash) + SUPPLEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSupplement().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.v1.ViewReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.viewunite.v1.ViewReply prototype) {
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
   * Protobuf type {@code bilibili.app.viewunite.v1.ViewReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.viewunite.v1.ViewReply)
      bilibili.app.viewunite.v1.ViewReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_ViewReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_ViewReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.viewunite.v1.ViewReply.class, bilibili.app.viewunite.v1.ViewReply.Builder.class);
    }

    // Construct using bilibili.app.viewunite.v1.ViewReply.newBuilder()
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
      viewBase_ = null;
      if (viewBaseBuilder_ != null) {
        viewBaseBuilder_.dispose();
        viewBaseBuilder_ = null;
      }
      selectionModule_ = null;
      if (selectionModuleBuilder_ != null) {
        selectionModuleBuilder_.dispose();
        selectionModuleBuilder_ = null;
      }
      supplement_ = null;
      if (supplementBuilder_ != null) {
        supplementBuilder_.dispose();
        supplementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.viewunite.v1.Viewunite.internal_static_bilibili_app_viewunite_v1_ViewReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.ViewReply getDefaultInstanceForType() {
      return bilibili.app.viewunite.v1.ViewReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.ViewReply build() {
      bilibili.app.viewunite.v1.ViewReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.viewunite.v1.ViewReply buildPartial() {
      bilibili.app.viewunite.v1.ViewReply result = new bilibili.app.viewunite.v1.ViewReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.viewunite.v1.ViewReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.viewBase_ = viewBaseBuilder_ == null
            ? viewBase_
            : viewBaseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.selectionModule_ = selectionModuleBuilder_ == null
            ? selectionModule_
            : selectionModuleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.supplement_ = supplementBuilder_ == null
            ? supplement_
            : supplementBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.viewunite.v1.ViewReply) {
        return mergeFrom((bilibili.app.viewunite.v1.ViewReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.viewunite.v1.ViewReply other) {
      if (other == bilibili.app.viewunite.v1.ViewReply.getDefaultInstance()) return this;
      if (other.hasViewBase()) {
        mergeViewBase(other.getViewBase());
      }
      if (other.hasSelectionModule()) {
        mergeSelectionModule(other.getSelectionModule());
      }
      if (other.hasSupplement()) {
        mergeSupplement(other.getSupplement());
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
                  getViewBaseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getSelectionModuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getSupplementFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private bilibili.app.viewunite.v1.ViewBase viewBase_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.viewunite.v1.ViewBase, bilibili.app.viewunite.v1.ViewBase.Builder, bilibili.app.viewunite.v1.ViewBaseOrBuilder> viewBaseBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     * @return Whether the viewBase field is set.
     */
    public boolean hasViewBase() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     * @return The viewBase.
     */
    public bilibili.app.viewunite.v1.ViewBase getViewBase() {
      if (viewBaseBuilder_ == null) {
        return viewBase_ == null ? bilibili.app.viewunite.v1.ViewBase.getDefaultInstance() : viewBase_;
      } else {
        return viewBaseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public Builder setViewBase(bilibili.app.viewunite.v1.ViewBase value) {
      if (viewBaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        viewBase_ = value;
      } else {
        viewBaseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public Builder setViewBase(
        bilibili.app.viewunite.v1.ViewBase.Builder builderForValue) {
      if (viewBaseBuilder_ == null) {
        viewBase_ = builderForValue.build();
      } else {
        viewBaseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public Builder mergeViewBase(bilibili.app.viewunite.v1.ViewBase value) {
      if (viewBaseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          viewBase_ != null &&
          viewBase_ != bilibili.app.viewunite.v1.ViewBase.getDefaultInstance()) {
          getViewBaseBuilder().mergeFrom(value);
        } else {
          viewBase_ = value;
        }
      } else {
        viewBaseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public Builder clearViewBase() {
      bitField0_ = (bitField0_ & ~0x00000001);
      viewBase_ = null;
      if (viewBaseBuilder_ != null) {
        viewBaseBuilder_.dispose();
        viewBaseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public bilibili.app.viewunite.v1.ViewBase.Builder getViewBaseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getViewBaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    public bilibili.app.viewunite.v1.ViewBaseOrBuilder getViewBaseOrBuilder() {
      if (viewBaseBuilder_ != null) {
        return viewBaseBuilder_.getMessageOrBuilder();
      } else {
        return viewBase_ == null ?
            bilibili.app.viewunite.v1.ViewBase.getDefaultInstance() : viewBase_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.ViewBase view_base = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.viewunite.v1.ViewBase, bilibili.app.viewunite.v1.ViewBase.Builder, bilibili.app.viewunite.v1.ViewBaseOrBuilder> 
        getViewBaseFieldBuilder() {
      if (viewBaseBuilder_ == null) {
        viewBaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.viewunite.v1.ViewBase, bilibili.app.viewunite.v1.ViewBase.Builder, bilibili.app.viewunite.v1.ViewBaseOrBuilder>(
                getViewBase(),
                getParentForChildren(),
                isClean());
        viewBase_ = null;
      }
      return viewBaseBuilder_;
    }

    private bilibili.app.viewunite.v1.SelectionModule selectionModule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.viewunite.v1.SelectionModule, bilibili.app.viewunite.v1.SelectionModule.Builder, bilibili.app.viewunite.v1.SelectionModuleOrBuilder> selectionModuleBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     * @return Whether the selectionModule field is set.
     */
    public boolean hasSelectionModule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     * @return The selectionModule.
     */
    public bilibili.app.viewunite.v1.SelectionModule getSelectionModule() {
      if (selectionModuleBuilder_ == null) {
        return selectionModule_ == null ? bilibili.app.viewunite.v1.SelectionModule.getDefaultInstance() : selectionModule_;
      } else {
        return selectionModuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public Builder setSelectionModule(bilibili.app.viewunite.v1.SelectionModule value) {
      if (selectionModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selectionModule_ = value;
      } else {
        selectionModuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public Builder setSelectionModule(
        bilibili.app.viewunite.v1.SelectionModule.Builder builderForValue) {
      if (selectionModuleBuilder_ == null) {
        selectionModule_ = builderForValue.build();
      } else {
        selectionModuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public Builder mergeSelectionModule(bilibili.app.viewunite.v1.SelectionModule value) {
      if (selectionModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          selectionModule_ != null &&
          selectionModule_ != bilibili.app.viewunite.v1.SelectionModule.getDefaultInstance()) {
          getSelectionModuleBuilder().mergeFrom(value);
        } else {
          selectionModule_ = value;
        }
      } else {
        selectionModuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public Builder clearSelectionModule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      selectionModule_ = null;
      if (selectionModuleBuilder_ != null) {
        selectionModuleBuilder_.dispose();
        selectionModuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public bilibili.app.viewunite.v1.SelectionModule.Builder getSelectionModuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSelectionModuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    public bilibili.app.viewunite.v1.SelectionModuleOrBuilder getSelectionModuleOrBuilder() {
      if (selectionModuleBuilder_ != null) {
        return selectionModuleBuilder_.getMessageOrBuilder();
      } else {
        return selectionModule_ == null ?
            bilibili.app.viewunite.v1.SelectionModule.getDefaultInstance() : selectionModule_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.viewunite.v1.SelectionModule selection_module = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.viewunite.v1.SelectionModule, bilibili.app.viewunite.v1.SelectionModule.Builder, bilibili.app.viewunite.v1.SelectionModuleOrBuilder> 
        getSelectionModuleFieldBuilder() {
      if (selectionModuleBuilder_ == null) {
        selectionModuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.viewunite.v1.SelectionModule, bilibili.app.viewunite.v1.SelectionModule.Builder, bilibili.app.viewunite.v1.SelectionModuleOrBuilder>(
                getSelectionModule(),
                getParentForChildren(),
                isClean());
        selectionModule_ = null;
      }
      return selectionModuleBuilder_;
    }

    private com.google.protobuf.Any supplement_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> supplementBuilder_;
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     * @return Whether the supplement field is set.
     */
    public boolean hasSupplement() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     * @return The supplement.
     */
    public com.google.protobuf.Any getSupplement() {
      if (supplementBuilder_ == null) {
        return supplement_ == null ? com.google.protobuf.Any.getDefaultInstance() : supplement_;
      } else {
        return supplementBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public Builder setSupplement(com.google.protobuf.Any value) {
      if (supplementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        supplement_ = value;
      } else {
        supplementBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public Builder setSupplement(
        com.google.protobuf.Any.Builder builderForValue) {
      if (supplementBuilder_ == null) {
        supplement_ = builderForValue.build();
      } else {
        supplementBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public Builder mergeSupplement(com.google.protobuf.Any value) {
      if (supplementBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          supplement_ != null &&
          supplement_ != com.google.protobuf.Any.getDefaultInstance()) {
          getSupplementBuilder().mergeFrom(value);
        } else {
          supplement_ = value;
        }
      } else {
        supplementBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public Builder clearSupplement() {
      bitField0_ = (bitField0_ & ~0x00000004);
      supplement_ = null;
      if (supplementBuilder_ != null) {
        supplementBuilder_.dispose();
        supplementBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public com.google.protobuf.Any.Builder getSupplementBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSupplementFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    public com.google.protobuf.AnyOrBuilder getSupplementOrBuilder() {
      if (supplementBuilder_ != null) {
        return supplementBuilder_.getMessageOrBuilder();
      } else {
        return supplement_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : supplement_;
      }
    }
    /**
     * <pre>
     * 使用 pgcanymodel / ugcanymodel 进行proto any转换成对应业务码结构体
     * </pre>
     *
     * <code>.google.protobuf.Any supplement = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getSupplementFieldBuilder() {
      if (supplementBuilder_ == null) {
        supplementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getSupplement(),
                getParentForChildren(),
                isClean());
        supplement_ = null;
      }
      return supplementBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.viewunite.v1.ViewReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.viewunite.v1.ViewReply)
  private static final bilibili.app.viewunite.v1.ViewReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.viewunite.v1.ViewReply();
  }

  public static bilibili.app.viewunite.v1.ViewReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViewReply>
      PARSER = new com.google.protobuf.AbstractParser<ViewReply>() {
    @java.lang.Override
    public ViewReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ViewReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViewReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.viewunite.v1.ViewReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
