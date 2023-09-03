// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 评论扩展
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ExtendReply}
 */
public final class ExtendReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ExtendReply)
    ExtendReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtendReply.newBuilder() to construct.
  private ExtendReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtendReply() {
    uri_ = "";
    params_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtendReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ExtendReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ExtendReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.ExtendReply.class, bilibili.app.dynamic.v2.ExtendReply.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * 基础跳转地址
   * </pre>
   *
   * <code>string uri = 1;</code>
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
   * 基础跳转地址
   * </pre>
   *
   * <code>string uri = 1;</code>
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

  public static final int PARAMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam> params_;
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam> getParamsList() {
    return params_;
  }
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder> 
      getParamsOrBuilderList() {
    return params_;
  }
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  @java.lang.Override
  public int getParamsCount() {
    return params_.size();
  }
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.ExtendReplyParam getParams(int index) {
    return params_.get(index);
  }
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder getParamsOrBuilder(
      int index) {
    return params_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    for (int i = 0; i < params_.size(); i++) {
      output.writeMessage(2, params_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    for (int i = 0; i < params_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, params_.get(i));
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
    if (!(obj instanceof bilibili.app.dynamic.v2.ExtendReply)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.ExtendReply other = (bilibili.app.dynamic.v2.ExtendReply) obj;

    if (!getUri()
        .equals(other.getUri())) return false;
    if (!getParamsList()
        .equals(other.getParamsList())) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (getParamsCount() > 0) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParamsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.ExtendReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.ExtendReply prototype) {
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
   * 评论扩展
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.ExtendReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ExtendReply)
      bilibili.app.dynamic.v2.ExtendReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ExtendReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ExtendReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.ExtendReply.class, bilibili.app.dynamic.v2.ExtendReply.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.ExtendReply.newBuilder()
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
      uri_ = "";
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
      } else {
        params_ = null;
        paramsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ExtendReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ExtendReply getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.ExtendReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ExtendReply build() {
      bilibili.app.dynamic.v2.ExtendReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.ExtendReply buildPartial() {
      bilibili.app.dynamic.v2.ExtendReply result = new bilibili.app.dynamic.v2.ExtendReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.ExtendReply result) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v2.ExtendReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.ExtendReply) {
        return mergeFrom((bilibili.app.dynamic.v2.ExtendReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.ExtendReply other) {
      if (other == bilibili.app.dynamic.v2.ExtendReply.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (paramsBuilder_ == null) {
        if (!other.params_.isEmpty()) {
          if (params_.isEmpty()) {
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamsIsMutable();
            params_.addAll(other.params_);
          }
          onChanged();
        }
      } else {
        if (!other.params_.isEmpty()) {
          if (paramsBuilder_.isEmpty()) {
            paramsBuilder_.dispose();
            paramsBuilder_ = null;
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000002);
            paramsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParamsFieldBuilder() : null;
          } else {
            paramsBuilder_.addAllMessages(other.params_);
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
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.app.dynamic.v2.ExtendReplyParam m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.ExtendReplyParam.parser(),
                      extensionRegistry);
              if (paramsBuilder_ == null) {
                ensureParamsIsMutable();
                params_.add(m);
              } else {
                paramsBuilder_.addMessage(m);
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

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * 基础跳转地址
     * </pre>
     *
     * <code>string uri = 1;</code>
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
     * 基础跳转地址
     * </pre>
     *
     * <code>string uri = 1;</code>
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
     * 基础跳转地址
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 基础跳转地址
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 基础跳转地址
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam> params_ =
      java.util.Collections.emptyList();
    private void ensureParamsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        params_ = new java.util.ArrayList<bilibili.app.dynamic.v2.ExtendReplyParam>(params_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.ExtendReplyParam, bilibili.app.dynamic.v2.ExtendReplyParam.Builder, bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder> paramsBuilder_;

    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam> getParamsList() {
      if (paramsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(params_);
      } else {
        return paramsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public int getParamsCount() {
      if (paramsBuilder_ == null) {
        return params_.size();
      } else {
        return paramsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public bilibili.app.dynamic.v2.ExtendReplyParam getParams(int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);
      } else {
        return paramsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder setParams(
        int index, bilibili.app.dynamic.v2.ExtendReplyParam value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.set(index, value);
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder setParams(
        int index, bilibili.app.dynamic.v2.ExtendReplyParam.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.set(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder addParams(bilibili.app.dynamic.v2.ExtendReplyParam value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder addParams(
        int index, bilibili.app.dynamic.v2.ExtendReplyParam value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(index, value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder addParams(
        bilibili.app.dynamic.v2.ExtendReplyParam.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder addParams(
        int index, bilibili.app.dynamic.v2.ExtendReplyParam.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder addAllParams(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.ExtendReplyParam> values) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, params_);
        onChanged();
      } else {
        paramsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        paramsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public Builder removeParams(int index) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.remove(index);
        onChanged();
      } else {
        paramsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public bilibili.app.dynamic.v2.ExtendReplyParam.Builder getParamsBuilder(
        int index) {
      return getParamsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder getParamsOrBuilder(
        int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);  } else {
        return paramsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder> 
         getParamsOrBuilderList() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(params_);
      }
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public bilibili.app.dynamic.v2.ExtendReplyParam.Builder addParamsBuilder() {
      return getParamsFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.ExtendReplyParam.getDefaultInstance());
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public bilibili.app.dynamic.v2.ExtendReplyParam.Builder addParamsBuilder(
        int index) {
      return getParamsFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.ExtendReplyParam.getDefaultInstance());
    }
    /**
     * <pre>
     * 参数部分
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam.Builder> 
         getParamsBuilderList() {
      return getParamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.ExtendReplyParam, bilibili.app.dynamic.v2.ExtendReplyParam.Builder, bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.ExtendReplyParam, bilibili.app.dynamic.v2.ExtendReplyParam.Builder, bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder>(
                params_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ExtendReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ExtendReply)
  private static final bilibili.app.dynamic.v2.ExtendReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.ExtendReply();
  }

  public static bilibili.app.dynamic.v2.ExtendReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtendReply>
      PARSER = new com.google.protobuf.AbstractParser<ExtendReply>() {
    @java.lang.Override
    public ExtendReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtendReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtendReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.ExtendReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

