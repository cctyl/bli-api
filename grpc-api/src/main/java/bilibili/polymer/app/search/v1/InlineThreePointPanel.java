// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.InlineThreePointPanel}
 */
public final class InlineThreePointPanel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.InlineThreePointPanel)
    InlineThreePointPanelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InlineThreePointPanel.newBuilder() to construct.
  private InlineThreePointPanel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InlineThreePointPanel() {
    shareId_ = "";
    shareOrigin_ = "";
    functionalButtons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InlineThreePointPanel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_InlineThreePointPanel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_InlineThreePointPanel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.InlineThreePointPanel.class, bilibili.polymer.app.search.v1.InlineThreePointPanel.Builder.class);
  }

  public static final int PANEL_TYPE_FIELD_NUMBER = 1;
  private int panelType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 panel_type = 1;</code>
   * @return The panelType.
   */
  @java.lang.Override
  public int getPanelType() {
    return panelType_;
  }

  public static final int SHARE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareId_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_id = 2;</code>
   * @return The shareId.
   */
  @java.lang.Override
  public java.lang.String getShareId() {
    java.lang.Object ref = shareId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_id = 2;</code>
   * @return The bytes for shareId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareIdBytes() {
    java.lang.Object ref = shareId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARE_ORIGIN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareOrigin_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_origin = 3;</code>
   * @return The shareOrigin.
   */
  @java.lang.Override
  public java.lang.String getShareOrigin() {
    java.lang.Object ref = shareOrigin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareOrigin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_origin = 3;</code>
   * @return The bytes for shareOrigin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareOriginBytes() {
    java.lang.Object ref = shareOrigin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareOrigin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUNCTIONAL_BUTTONS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.polymer.app.search.v1.ShareButtonItem> functionalButtons_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.polymer.app.search.v1.ShareButtonItem> getFunctionalButtonsList() {
    return functionalButtons_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder> 
      getFunctionalButtonsOrBuilderList() {
    return functionalButtons_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
   */
  @java.lang.Override
  public int getFunctionalButtonsCount() {
    return functionalButtons_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.ShareButtonItem getFunctionalButtons(int index) {
    return functionalButtons_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder getFunctionalButtonsOrBuilder(
      int index) {
    return functionalButtons_.get(index);
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
    if (panelType_ != 0) {
      output.writeInt32(1, panelType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shareId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareOrigin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shareOrigin_);
    }
    for (int i = 0; i < functionalButtons_.size(); i++) {
      output.writeMessage(4, functionalButtons_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (panelType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, panelType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shareId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareOrigin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shareOrigin_);
    }
    for (int i = 0; i < functionalButtons_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, functionalButtons_.get(i));
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.InlineThreePointPanel)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.InlineThreePointPanel other = (bilibili.polymer.app.search.v1.InlineThreePointPanel) obj;

    if (getPanelType()
        != other.getPanelType()) return false;
    if (!getShareId()
        .equals(other.getShareId())) return false;
    if (!getShareOrigin()
        .equals(other.getShareOrigin())) return false;
    if (!getFunctionalButtonsList()
        .equals(other.getFunctionalButtonsList())) return false;
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
    hash = (37 * hash) + PANEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPanelType();
    hash = (37 * hash) + SHARE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getShareId().hashCode();
    hash = (37 * hash) + SHARE_ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getShareOrigin().hashCode();
    if (getFunctionalButtonsCount() > 0) {
      hash = (37 * hash) + FUNCTIONAL_BUTTONS_FIELD_NUMBER;
      hash = (53 * hash) + getFunctionalButtonsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.InlineThreePointPanel parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.InlineThreePointPanel prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.InlineThreePointPanel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.InlineThreePointPanel)
      bilibili.polymer.app.search.v1.InlineThreePointPanelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_InlineThreePointPanel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_InlineThreePointPanel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.InlineThreePointPanel.class, bilibili.polymer.app.search.v1.InlineThreePointPanel.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.InlineThreePointPanel.newBuilder()
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
      panelType_ = 0;
      shareId_ = "";
      shareOrigin_ = "";
      if (functionalButtonsBuilder_ == null) {
        functionalButtons_ = java.util.Collections.emptyList();
      } else {
        functionalButtons_ = null;
        functionalButtonsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_InlineThreePointPanel_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.InlineThreePointPanel getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.InlineThreePointPanel.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.InlineThreePointPanel build() {
      bilibili.polymer.app.search.v1.InlineThreePointPanel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.InlineThreePointPanel buildPartial() {
      bilibili.polymer.app.search.v1.InlineThreePointPanel result = new bilibili.polymer.app.search.v1.InlineThreePointPanel(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.polymer.app.search.v1.InlineThreePointPanel result) {
      if (functionalButtonsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          functionalButtons_ = java.util.Collections.unmodifiableList(functionalButtons_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.functionalButtons_ = functionalButtons_;
      } else {
        result.functionalButtons_ = functionalButtonsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.InlineThreePointPanel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.panelType_ = panelType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shareId_ = shareId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.shareOrigin_ = shareOrigin_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.InlineThreePointPanel) {
        return mergeFrom((bilibili.polymer.app.search.v1.InlineThreePointPanel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.InlineThreePointPanel other) {
      if (other == bilibili.polymer.app.search.v1.InlineThreePointPanel.getDefaultInstance()) return this;
      if (other.getPanelType() != 0) {
        setPanelType(other.getPanelType());
      }
      if (!other.getShareId().isEmpty()) {
        shareId_ = other.shareId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getShareOrigin().isEmpty()) {
        shareOrigin_ = other.shareOrigin_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (functionalButtonsBuilder_ == null) {
        if (!other.functionalButtons_.isEmpty()) {
          if (functionalButtons_.isEmpty()) {
            functionalButtons_ = other.functionalButtons_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFunctionalButtonsIsMutable();
            functionalButtons_.addAll(other.functionalButtons_);
          }
          onChanged();
        }
      } else {
        if (!other.functionalButtons_.isEmpty()) {
          if (functionalButtonsBuilder_.isEmpty()) {
            functionalButtonsBuilder_.dispose();
            functionalButtonsBuilder_ = null;
            functionalButtons_ = other.functionalButtons_;
            bitField0_ = (bitField0_ & ~0x00000008);
            functionalButtonsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFunctionalButtonsFieldBuilder() : null;
          } else {
            functionalButtonsBuilder_.addAllMessages(other.functionalButtons_);
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
              panelType_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              shareId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              shareOrigin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              bilibili.polymer.app.search.v1.ShareButtonItem m =
                  input.readMessage(
                      bilibili.polymer.app.search.v1.ShareButtonItem.parser(),
                      extensionRegistry);
              if (functionalButtonsBuilder_ == null) {
                ensureFunctionalButtonsIsMutable();
                functionalButtons_.add(m);
              } else {
                functionalButtonsBuilder_.addMessage(m);
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

    private int panelType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 panel_type = 1;</code>
     * @return The panelType.
     */
    @java.lang.Override
    public int getPanelType() {
      return panelType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 panel_type = 1;</code>
     * @param value The panelType to set.
     * @return This builder for chaining.
     */
    public Builder setPanelType(int value) {

      panelType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 panel_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPanelType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      panelType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object shareId_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_id = 2;</code>
     * @return The shareId.
     */
    public java.lang.String getShareId() {
      java.lang.Object ref = shareId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_id = 2;</code>
     * @return The bytes for shareId.
     */
    public com.google.protobuf.ByteString
        getShareIdBytes() {
      java.lang.Object ref = shareId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_id = 2;</code>
     * @param value The shareId to set.
     * @return This builder for chaining.
     */
    public Builder setShareId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShareId() {
      shareId_ = getDefaultInstance().getShareId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_id = 2;</code>
     * @param value The bytes for shareId to set.
     * @return This builder for chaining.
     */
    public Builder setShareIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object shareOrigin_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_origin = 3;</code>
     * @return The shareOrigin.
     */
    public java.lang.String getShareOrigin() {
      java.lang.Object ref = shareOrigin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareOrigin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_origin = 3;</code>
     * @return The bytes for shareOrigin.
     */
    public com.google.protobuf.ByteString
        getShareOriginBytes() {
      java.lang.Object ref = shareOrigin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareOrigin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_origin = 3;</code>
     * @param value The shareOrigin to set.
     * @return This builder for chaining.
     */
    public Builder setShareOrigin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareOrigin_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_origin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShareOrigin() {
      shareOrigin_ = getDefaultInstance().getShareOrigin();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string share_origin = 3;</code>
     * @param value The bytes for shareOrigin to set.
     * @return This builder for chaining.
     */
    public Builder setShareOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareOrigin_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.polymer.app.search.v1.ShareButtonItem> functionalButtons_ =
      java.util.Collections.emptyList();
    private void ensureFunctionalButtonsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        functionalButtons_ = new java.util.ArrayList<bilibili.polymer.app.search.v1.ShareButtonItem>(functionalButtons_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.polymer.app.search.v1.ShareButtonItem, bilibili.polymer.app.search.v1.ShareButtonItem.Builder, bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder> functionalButtonsBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public java.util.List<bilibili.polymer.app.search.v1.ShareButtonItem> getFunctionalButtonsList() {
      if (functionalButtonsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(functionalButtons_);
      } else {
        return functionalButtonsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public int getFunctionalButtonsCount() {
      if (functionalButtonsBuilder_ == null) {
        return functionalButtons_.size();
      } else {
        return functionalButtonsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public bilibili.polymer.app.search.v1.ShareButtonItem getFunctionalButtons(int index) {
      if (functionalButtonsBuilder_ == null) {
        return functionalButtons_.get(index);
      } else {
        return functionalButtonsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder setFunctionalButtons(
        int index, bilibili.polymer.app.search.v1.ShareButtonItem value) {
      if (functionalButtonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.set(index, value);
        onChanged();
      } else {
        functionalButtonsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder setFunctionalButtons(
        int index, bilibili.polymer.app.search.v1.ShareButtonItem.Builder builderForValue) {
      if (functionalButtonsBuilder_ == null) {
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.set(index, builderForValue.build());
        onChanged();
      } else {
        functionalButtonsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder addFunctionalButtons(bilibili.polymer.app.search.v1.ShareButtonItem value) {
      if (functionalButtonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.add(value);
        onChanged();
      } else {
        functionalButtonsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder addFunctionalButtons(
        int index, bilibili.polymer.app.search.v1.ShareButtonItem value) {
      if (functionalButtonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.add(index, value);
        onChanged();
      } else {
        functionalButtonsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder addFunctionalButtons(
        bilibili.polymer.app.search.v1.ShareButtonItem.Builder builderForValue) {
      if (functionalButtonsBuilder_ == null) {
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.add(builderForValue.build());
        onChanged();
      } else {
        functionalButtonsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder addFunctionalButtons(
        int index, bilibili.polymer.app.search.v1.ShareButtonItem.Builder builderForValue) {
      if (functionalButtonsBuilder_ == null) {
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.add(index, builderForValue.build());
        onChanged();
      } else {
        functionalButtonsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder addAllFunctionalButtons(
        java.lang.Iterable<? extends bilibili.polymer.app.search.v1.ShareButtonItem> values) {
      if (functionalButtonsBuilder_ == null) {
        ensureFunctionalButtonsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, functionalButtons_);
        onChanged();
      } else {
        functionalButtonsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder clearFunctionalButtons() {
      if (functionalButtonsBuilder_ == null) {
        functionalButtons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        functionalButtonsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public Builder removeFunctionalButtons(int index) {
      if (functionalButtonsBuilder_ == null) {
        ensureFunctionalButtonsIsMutable();
        functionalButtons_.remove(index);
        onChanged();
      } else {
        functionalButtonsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public bilibili.polymer.app.search.v1.ShareButtonItem.Builder getFunctionalButtonsBuilder(
        int index) {
      return getFunctionalButtonsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder getFunctionalButtonsOrBuilder(
        int index) {
      if (functionalButtonsBuilder_ == null) {
        return functionalButtons_.get(index);  } else {
        return functionalButtonsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public java.util.List<? extends bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder> 
         getFunctionalButtonsOrBuilderList() {
      if (functionalButtonsBuilder_ != null) {
        return functionalButtonsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(functionalButtons_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public bilibili.polymer.app.search.v1.ShareButtonItem.Builder addFunctionalButtonsBuilder() {
      return getFunctionalButtonsFieldBuilder().addBuilder(
          bilibili.polymer.app.search.v1.ShareButtonItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public bilibili.polymer.app.search.v1.ShareButtonItem.Builder addFunctionalButtonsBuilder(
        int index) {
      return getFunctionalButtonsFieldBuilder().addBuilder(
          index, bilibili.polymer.app.search.v1.ShareButtonItem.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.polymer.app.search.v1.ShareButtonItem functional_buttons = 4;</code>
     */
    public java.util.List<bilibili.polymer.app.search.v1.ShareButtonItem.Builder> 
         getFunctionalButtonsBuilderList() {
      return getFunctionalButtonsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.polymer.app.search.v1.ShareButtonItem, bilibili.polymer.app.search.v1.ShareButtonItem.Builder, bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder> 
        getFunctionalButtonsFieldBuilder() {
      if (functionalButtonsBuilder_ == null) {
        functionalButtonsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.polymer.app.search.v1.ShareButtonItem, bilibili.polymer.app.search.v1.ShareButtonItem.Builder, bilibili.polymer.app.search.v1.ShareButtonItemOrBuilder>(
                functionalButtons_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        functionalButtons_ = null;
      }
      return functionalButtonsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.InlineThreePointPanel)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.InlineThreePointPanel)
  private static final bilibili.polymer.app.search.v1.InlineThreePointPanel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.InlineThreePointPanel();
  }

  public static bilibili.polymer.app.search.v1.InlineThreePointPanel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InlineThreePointPanel>
      PARSER = new com.google.protobuf.AbstractParser<InlineThreePointPanel>() {
    @java.lang.Override
    public InlineThreePointPanel parsePartialFrom(
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

  public static com.google.protobuf.Parser<InlineThreePointPanel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InlineThreePointPanel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.InlineThreePointPanel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

