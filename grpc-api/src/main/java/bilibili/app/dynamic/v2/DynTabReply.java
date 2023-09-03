// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DynTabReply}
 */
public final class DynTabReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DynTabReply)
    DynTabReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynTabReply.newBuilder() to construct.
  private DynTabReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynTabReply() {
    dynTab_ = java.util.Collections.emptyList();
    screenTab_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynTabReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynTabReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynTabReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.DynTabReply.class, bilibili.app.dynamic.v2.DynTabReply.Builder.class);
  }

  public static final int DYN_TAB_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.DynTab> dynTab_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.DynTab> getDynTabList() {
    return dynTab_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.DynTabOrBuilder> 
      getDynTabOrBuilderList() {
    return dynTab_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
   */
  @java.lang.Override
  public int getDynTabCount() {
    return dynTab_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynTab getDynTab(int index) {
    return dynTab_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynTabOrBuilder getDynTabOrBuilder(
      int index) {
    return dynTab_.get(index);
  }

  public static final int SCREEN_TAB_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.DynScreenTab> screenTab_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.DynScreenTab> getScreenTabList() {
    return screenTab_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.DynScreenTabOrBuilder> 
      getScreenTabOrBuilderList() {
    return screenTab_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
   */
  @java.lang.Override
  public int getScreenTabCount() {
    return screenTab_.size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynScreenTab getScreenTab(int index) {
    return screenTab_.get(index);
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.DynScreenTabOrBuilder getScreenTabOrBuilder(
      int index) {
    return screenTab_.get(index);
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
    for (int i = 0; i < dynTab_.size(); i++) {
      output.writeMessage(1, dynTab_.get(i));
    }
    for (int i = 0; i < screenTab_.size(); i++) {
      output.writeMessage(2, screenTab_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dynTab_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dynTab_.get(i));
    }
    for (int i = 0; i < screenTab_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, screenTab_.get(i));
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
    if (!(obj instanceof bilibili.app.dynamic.v2.DynTabReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.DynTabReply other = (bilibili.app.dynamic.v2.DynTabReply) obj;

    if (!getDynTabList()
        .equals(other.getDynTabList())) return false;
    if (!getScreenTabList()
        .equals(other.getScreenTabList())) return false;
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
    if (getDynTabCount() > 0) {
      hash = (37 * hash) + DYN_TAB_FIELD_NUMBER;
      hash = (53 * hash) + getDynTabList().hashCode();
    }
    if (getScreenTabCount() > 0) {
      hash = (37 * hash) + SCREEN_TAB_FIELD_NUMBER;
      hash = (53 * hash) + getScreenTabList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.DynTabReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.DynTabReply prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.DynTabReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DynTabReply)
      bilibili.app.dynamic.v2.DynTabReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynTabReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynTabReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.DynTabReply.class, bilibili.app.dynamic.v2.DynTabReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.DynTabReply.newBuilder()
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
      if (dynTabBuilder_ == null) {
        dynTab_ = java.util.Collections.emptyList();
      } else {
        dynTab_ = null;
        dynTabBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (screenTabBuilder_ == null) {
        screenTab_ = java.util.Collections.emptyList();
      } else {
        screenTab_ = null;
        screenTabBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynTabReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynTabReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.DynTabReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynTabReply build() {
      bilibili.app.dynamic.v2.DynTabReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.DynTabReply buildPartial() {
      bilibili.app.dynamic.v2.DynTabReply result = new bilibili.app.dynamic.v2.DynTabReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.DynTabReply result) {
      if (dynTabBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dynTab_ = java.util.Collections.unmodifiableList(dynTab_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dynTab_ = dynTab_;
      } else {
        result.dynTab_ = dynTabBuilder_.build();
      }
      if (screenTabBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          screenTab_ = java.util.Collections.unmodifiableList(screenTab_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.screenTab_ = screenTab_;
      } else {
        result.screenTab_ = screenTabBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v2.DynTabReply result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.DynTabReply) {
        return mergeFrom((bilibili.app.dynamic.v2.DynTabReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.DynTabReply other) {
      if (other == bilibili.app.dynamic.v2.DynTabReply.getDefaultInstance()) return this;
      if (dynTabBuilder_ == null) {
        if (!other.dynTab_.isEmpty()) {
          if (dynTab_.isEmpty()) {
            dynTab_ = other.dynTab_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDynTabIsMutable();
            dynTab_.addAll(other.dynTab_);
          }
          onChanged();
        }
      } else {
        if (!other.dynTab_.isEmpty()) {
          if (dynTabBuilder_.isEmpty()) {
            dynTabBuilder_.dispose();
            dynTabBuilder_ = null;
            dynTab_ = other.dynTab_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dynTabBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDynTabFieldBuilder() : null;
          } else {
            dynTabBuilder_.addAllMessages(other.dynTab_);
          }
        }
      }
      if (screenTabBuilder_ == null) {
        if (!other.screenTab_.isEmpty()) {
          if (screenTab_.isEmpty()) {
            screenTab_ = other.screenTab_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureScreenTabIsMutable();
            screenTab_.addAll(other.screenTab_);
          }
          onChanged();
        }
      } else {
        if (!other.screenTab_.isEmpty()) {
          if (screenTabBuilder_.isEmpty()) {
            screenTabBuilder_.dispose();
            screenTabBuilder_ = null;
            screenTab_ = other.screenTab_;
            bitField0_ = (bitField0_ & ~0x00000002);
            screenTabBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getScreenTabFieldBuilder() : null;
          } else {
            screenTabBuilder_.addAllMessages(other.screenTab_);
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
              bilibili.app.dynamic.v2.DynTab m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.DynTab.parser(),
                      extensionRegistry);
              if (dynTabBuilder_ == null) {
                ensureDynTabIsMutable();
                dynTab_.add(m);
              } else {
                dynTabBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              bilibili.app.dynamic.v2.DynScreenTab m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.DynScreenTab.parser(),
                      extensionRegistry);
              if (screenTabBuilder_ == null) {
                ensureScreenTabIsMutable();
                screenTab_.add(m);
              } else {
                screenTabBuilder_.addMessage(m);
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

    private java.util.List<bilibili.app.dynamic.v2.DynTab> dynTab_ =
      java.util.Collections.emptyList();
    private void ensureDynTabIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dynTab_ = new java.util.ArrayList<bilibili.app.dynamic.v2.DynTab>(dynTab_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynTab, bilibili.app.dynamic.v2.DynTab.Builder, bilibili.app.dynamic.v2.DynTabOrBuilder> dynTabBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynTab> getDynTabList() {
      if (dynTabBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dynTab_);
      } else {
        return dynTabBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public int getDynTabCount() {
      if (dynTabBuilder_ == null) {
        return dynTab_.size();
      } else {
        return dynTabBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynTab getDynTab(int index) {
      if (dynTabBuilder_ == null) {
        return dynTab_.get(index);
      } else {
        return dynTabBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder setDynTab(
        int index, bilibili.app.dynamic.v2.DynTab value) {
      if (dynTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynTabIsMutable();
        dynTab_.set(index, value);
        onChanged();
      } else {
        dynTabBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder setDynTab(
        int index, bilibili.app.dynamic.v2.DynTab.Builder builderForValue) {
      if (dynTabBuilder_ == null) {
        ensureDynTabIsMutable();
        dynTab_.set(index, builderForValue.build());
        onChanged();
      } else {
        dynTabBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder addDynTab(bilibili.app.dynamic.v2.DynTab value) {
      if (dynTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynTabIsMutable();
        dynTab_.add(value);
        onChanged();
      } else {
        dynTabBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder addDynTab(
        int index, bilibili.app.dynamic.v2.DynTab value) {
      if (dynTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynTabIsMutable();
        dynTab_.add(index, value);
        onChanged();
      } else {
        dynTabBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder addDynTab(
        bilibili.app.dynamic.v2.DynTab.Builder builderForValue) {
      if (dynTabBuilder_ == null) {
        ensureDynTabIsMutable();
        dynTab_.add(builderForValue.build());
        onChanged();
      } else {
        dynTabBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder addDynTab(
        int index, bilibili.app.dynamic.v2.DynTab.Builder builderForValue) {
      if (dynTabBuilder_ == null) {
        ensureDynTabIsMutable();
        dynTab_.add(index, builderForValue.build());
        onChanged();
      } else {
        dynTabBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder addAllDynTab(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.DynTab> values) {
      if (dynTabBuilder_ == null) {
        ensureDynTabIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dynTab_);
        onChanged();
      } else {
        dynTabBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder clearDynTab() {
      if (dynTabBuilder_ == null) {
        dynTab_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dynTabBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public Builder removeDynTab(int index) {
      if (dynTabBuilder_ == null) {
        ensureDynTabIsMutable();
        dynTab_.remove(index);
        onChanged();
      } else {
        dynTabBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynTab.Builder getDynTabBuilder(
        int index) {
      return getDynTabFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynTabOrBuilder getDynTabOrBuilder(
        int index) {
      if (dynTabBuilder_ == null) {
        return dynTab_.get(index);  } else {
        return dynTabBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.DynTabOrBuilder> 
         getDynTabOrBuilderList() {
      if (dynTabBuilder_ != null) {
        return dynTabBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dynTab_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynTab.Builder addDynTabBuilder() {
      return getDynTabFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.DynTab.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public bilibili.app.dynamic.v2.DynTab.Builder addDynTabBuilder(
        int index) {
      return getDynTabFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.DynTab.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynTab dyn_tab = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynTab.Builder> 
         getDynTabBuilderList() {
      return getDynTabFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynTab, bilibili.app.dynamic.v2.DynTab.Builder, bilibili.app.dynamic.v2.DynTabOrBuilder> 
        getDynTabFieldBuilder() {
      if (dynTabBuilder_ == null) {
        dynTabBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.DynTab, bilibili.app.dynamic.v2.DynTab.Builder, bilibili.app.dynamic.v2.DynTabOrBuilder>(
                dynTab_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dynTab_ = null;
      }
      return dynTabBuilder_;
    }

    private java.util.List<bilibili.app.dynamic.v2.DynScreenTab> screenTab_ =
      java.util.Collections.emptyList();
    private void ensureScreenTabIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        screenTab_ = new java.util.ArrayList<bilibili.app.dynamic.v2.DynScreenTab>(screenTab_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynScreenTab, bilibili.app.dynamic.v2.DynScreenTab.Builder, bilibili.app.dynamic.v2.DynScreenTabOrBuilder> screenTabBuilder_;

    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynScreenTab> getScreenTabList() {
      if (screenTabBuilder_ == null) {
        return java.util.Collections.unmodifiableList(screenTab_);
      } else {
        return screenTabBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public int getScreenTabCount() {
      if (screenTabBuilder_ == null) {
        return screenTab_.size();
      } else {
        return screenTabBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynScreenTab getScreenTab(int index) {
      if (screenTabBuilder_ == null) {
        return screenTab_.get(index);
      } else {
        return screenTabBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder setScreenTab(
        int index, bilibili.app.dynamic.v2.DynScreenTab value) {
      if (screenTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenTabIsMutable();
        screenTab_.set(index, value);
        onChanged();
      } else {
        screenTabBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder setScreenTab(
        int index, bilibili.app.dynamic.v2.DynScreenTab.Builder builderForValue) {
      if (screenTabBuilder_ == null) {
        ensureScreenTabIsMutable();
        screenTab_.set(index, builderForValue.build());
        onChanged();
      } else {
        screenTabBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder addScreenTab(bilibili.app.dynamic.v2.DynScreenTab value) {
      if (screenTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenTabIsMutable();
        screenTab_.add(value);
        onChanged();
      } else {
        screenTabBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder addScreenTab(
        int index, bilibili.app.dynamic.v2.DynScreenTab value) {
      if (screenTabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenTabIsMutable();
        screenTab_.add(index, value);
        onChanged();
      } else {
        screenTabBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder addScreenTab(
        bilibili.app.dynamic.v2.DynScreenTab.Builder builderForValue) {
      if (screenTabBuilder_ == null) {
        ensureScreenTabIsMutable();
        screenTab_.add(builderForValue.build());
        onChanged();
      } else {
        screenTabBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder addScreenTab(
        int index, bilibili.app.dynamic.v2.DynScreenTab.Builder builderForValue) {
      if (screenTabBuilder_ == null) {
        ensureScreenTabIsMutable();
        screenTab_.add(index, builderForValue.build());
        onChanged();
      } else {
        screenTabBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder addAllScreenTab(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.DynScreenTab> values) {
      if (screenTabBuilder_ == null) {
        ensureScreenTabIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, screenTab_);
        onChanged();
      } else {
        screenTabBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder clearScreenTab() {
      if (screenTabBuilder_ == null) {
        screenTab_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        screenTabBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public Builder removeScreenTab(int index) {
      if (screenTabBuilder_ == null) {
        ensureScreenTabIsMutable();
        screenTab_.remove(index);
        onChanged();
      } else {
        screenTabBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynScreenTab.Builder getScreenTabBuilder(
        int index) {
      return getScreenTabFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynScreenTabOrBuilder getScreenTabOrBuilder(
        int index) {
      if (screenTabBuilder_ == null) {
        return screenTab_.get(index);  } else {
        return screenTabBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.DynScreenTabOrBuilder> 
         getScreenTabOrBuilderList() {
      if (screenTabBuilder_ != null) {
        return screenTabBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(screenTab_);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynScreenTab.Builder addScreenTabBuilder() {
      return getScreenTabFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.DynScreenTab.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public bilibili.app.dynamic.v2.DynScreenTab.Builder addScreenTabBuilder(
        int index) {
      return getScreenTabFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.DynScreenTab.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.DynScreenTab screen_tab = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.DynScreenTab.Builder> 
         getScreenTabBuilderList() {
      return getScreenTabFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.DynScreenTab, bilibili.app.dynamic.v2.DynScreenTab.Builder, bilibili.app.dynamic.v2.DynScreenTabOrBuilder> 
        getScreenTabFieldBuilder() {
      if (screenTabBuilder_ == null) {
        screenTabBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.DynScreenTab, bilibili.app.dynamic.v2.DynScreenTab.Builder, bilibili.app.dynamic.v2.DynScreenTabOrBuilder>(
                screenTab_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        screenTab_ = null;
      }
      return screenTabBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DynTabReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DynTabReply)
  private static final bilibili.app.dynamic.v2.DynTabReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.DynTabReply();
  }

  public static bilibili.app.dynamic.v2.DynTabReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynTabReply>
      PARSER = new com.google.protobuf.AbstractParser<DynTabReply>() {
    @java.lang.Override
    public DynTabReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynTabReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynTabReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.DynTabReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

