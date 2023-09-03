// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/plugin.proto

package bilibili.dagw.component.avatar.v1.plugin;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2}
 */
public final class GyroscopeEntityV2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)
    GyroscopeEntityV2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use GyroscopeEntityV2.newBuilder() to construct.
  private GyroscopeEntityV2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GyroscopeEntityV2() {
    displayType_ = "";
    contents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GyroscopeEntityV2();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.class, bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.Builder.class);
  }

  public static final int DISPLAY_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayType_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string display_type = 1;</code>
   * @return The displayType.
   */
  @java.lang.Override
  public java.lang.String getDisplayType() {
    java.lang.Object ref = displayType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string display_type = 1;</code>
   * @return The bytes for displayType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayTypeBytes() {
    java.lang.Object ref = displayType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> contents_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> getContentsList() {
    return contents_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder> 
      getContentsOrBuilderList() {
    return contents_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  @java.lang.Override
  public int getContentsCount() {
    return contents_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 getContents(int index) {
    return contents_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder getContentsOrBuilder(
      int index) {
    return contents_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayType_);
    }
    for (int i = 0; i < contents_.size(); i++) {
      output.writeMessage(2, contents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayType_);
    }
    for (int i = 0; i < contents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, contents_.get(i));
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
    if (!(obj instanceof bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)) {
      return super.equals(obj);
    }
    bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 other = (bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2) obj;

    if (!getDisplayType()
        .equals(other.getDisplayType())) return false;
    if (!getContentsList()
        .equals(other.getContentsList())) return false;
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
    hash = (37 * hash) + DISPLAY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayType().hashCode();
    if (getContentsCount() > 0) {
      hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getContentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 parseFrom(
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
  public static Builder newBuilder(bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 prototype) {
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
   * Protobuf type {@code bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)
      bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.class, bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.Builder.class);
    }

    // Construct using bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.newBuilder()
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
      displayType_ = "";
      if (contentsBuilder_ == null) {
        contents_ = java.util.Collections.emptyList();
      } else {
        contents_ = null;
        contentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dagw.component.avatar.v1.plugin.Plugin.internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 getDefaultInstanceForType() {
      return bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 build() {
      bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 buildPartial() {
      bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 result = new bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 result) {
      if (contentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          contents_ = java.util.Collections.unmodifiableList(contents_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.contents_ = contents_;
      } else {
        result.contents_ = contentsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayType_ = displayType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2) {
        return mergeFrom((bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 other) {
      if (other == bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2.getDefaultInstance()) return this;
      if (!other.getDisplayType().isEmpty()) {
        displayType_ = other.displayType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (contentsBuilder_ == null) {
        if (!other.contents_.isEmpty()) {
          if (contents_.isEmpty()) {
            contents_ = other.contents_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureContentsIsMutable();
            contents_.addAll(other.contents_);
          }
          onChanged();
        }
      } else {
        if (!other.contents_.isEmpty()) {
          if (contentsBuilder_.isEmpty()) {
            contentsBuilder_.dispose();
            contentsBuilder_ = null;
            contents_ = other.contents_;
            bitField0_ = (bitField0_ & ~0x00000002);
            contentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContentsFieldBuilder() : null;
          } else {
            contentsBuilder_.addAllMessages(other.contents_);
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
              displayType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 m =
                  input.readMessage(
                      bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.parser(),
                      extensionRegistry);
              if (contentsBuilder_ == null) {
                ensureContentsIsMutable();
                contents_.add(m);
              } else {
                contentsBuilder_.addMessage(m);
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

    private java.lang.Object displayType_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string display_type = 1;</code>
     * @return The displayType.
     */
    public java.lang.String getDisplayType() {
      java.lang.Object ref = displayType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string display_type = 1;</code>
     * @return The bytes for displayType.
     */
    public com.google.protobuf.ByteString
        getDisplayTypeBytes() {
      java.lang.Object ref = displayType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string display_type = 1;</code>
     * @param value The displayType to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string display_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayType() {
      displayType_ = getDefaultInstance().getDisplayType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string display_type = 1;</code>
     * @param value The bytes for displayType to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> contents_ =
      java.util.Collections.emptyList();
    private void ensureContentsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        contents_ = new java.util.ArrayList<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2>(contents_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder> contentsBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> getContentsList() {
      if (contentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contents_);
      } else {
        return contentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public int getContentsCount() {
      if (contentsBuilder_ == null) {
        return contents_.size();
      } else {
        return contentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 getContents(int index) {
      if (contentsBuilder_ == null) {
        return contents_.get(index);
      } else {
        return contentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder setContents(
        int index, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 value) {
      if (contentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentsIsMutable();
        contents_.set(index, value);
        onChanged();
      } else {
        contentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder setContents(
        int index, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder builderForValue) {
      if (contentsBuilder_ == null) {
        ensureContentsIsMutable();
        contents_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder addContents(bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 value) {
      if (contentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentsIsMutable();
        contents_.add(value);
        onChanged();
      } else {
        contentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder addContents(
        int index, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 value) {
      if (contentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentsIsMutable();
        contents_.add(index, value);
        onChanged();
      } else {
        contentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder addContents(
        bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder builderForValue) {
      if (contentsBuilder_ == null) {
        ensureContentsIsMutable();
        contents_.add(builderForValue.build());
        onChanged();
      } else {
        contentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder addContents(
        int index, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder builderForValue) {
      if (contentsBuilder_ == null) {
        ensureContentsIsMutable();
        contents_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder addAllContents(
        java.lang.Iterable<? extends bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> values) {
      if (contentsBuilder_ == null) {
        ensureContentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contents_);
        onChanged();
      } else {
        contentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder clearContents() {
      if (contentsBuilder_ == null) {
        contents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        contentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public Builder removeContents(int index) {
      if (contentsBuilder_ == null) {
        ensureContentsIsMutable();
        contents_.remove(index);
        onChanged();
      } else {
        contentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder getContentsBuilder(
        int index) {
      return getContentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder getContentsOrBuilder(
        int index) {
      if (contentsBuilder_ == null) {
        return contents_.get(index);  } else {
        return contentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public java.util.List<? extends bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder> 
         getContentsOrBuilderList() {
      if (contentsBuilder_ != null) {
        return contentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contents_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder addContentsBuilder() {
      return getContentsFieldBuilder().addBuilder(
          bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder addContentsBuilder(
        int index) {
      return getContentsFieldBuilder().addBuilder(
          index, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
     */
    public java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder> 
         getContentsBuilderList() {
      return getContentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder> 
        getContentsFieldBuilder() {
      if (contentsBuilder_ == null) {
        contentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2.Builder, bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder>(
                contents_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        contents_ = null;
      }
      return contentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)
  private static final bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2();
  }

  public static bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GyroscopeEntityV2>
      PARSER = new com.google.protobuf.AbstractParser<GyroscopeEntityV2>() {
    @java.lang.Override
    public GyroscopeEntityV2 parsePartialFrom(
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

  public static com.google.protobuf.Parser<GyroscopeEntityV2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GyroscopeEntityV2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
