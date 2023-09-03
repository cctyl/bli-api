// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/v1/distribution.proto

package bilibili.app.distribution.v1;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.distribution.v1.GetUserPreferenceReply}
 */
public final class GetUserPreferenceReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.distribution.v1.GetUserPreferenceReply)
    GetUserPreferenceReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserPreferenceReply.newBuilder() to construct.
  private GetUserPreferenceReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserPreferenceReply() {
    value_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserPreferenceReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.distribution.v1.DistributionOuterClass.internal_static_bilibili_app_distribution_v1_GetUserPreferenceReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.distribution.v1.DistributionOuterClass.internal_static_bilibili_app_distribution_v1_GetUserPreferenceReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.distribution.v1.GetUserPreferenceReply.class, bilibili.app.distribution.v1.GetUserPreferenceReply.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Any> value_;
  /**
   * <pre>
   * 对应 GetUserPreferenceReq 的请求的类型
   * </pre>
   *
   * <code>repeated .google.protobuf.Any value = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getValueList() {
    return value_;
  }
  /**
   * <pre>
   * 对应 GetUserPreferenceReq 的请求的类型
   * </pre>
   *
   * <code>repeated .google.protobuf.Any value = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getValueOrBuilderList() {
    return value_;
  }
  /**
   * <pre>
   * 对应 GetUserPreferenceReq 的请求的类型
   * </pre>
   *
   * <code>repeated .google.protobuf.Any value = 1;</code>
   */
  @java.lang.Override
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <pre>
   * 对应 GetUserPreferenceReq 的请求的类型
   * </pre>
   *
   * <code>repeated .google.protobuf.Any value = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getValue(int index) {
    return value_.get(index);
  }
  /**
   * <pre>
   * 对应 GetUserPreferenceReq 的请求的类型
   * </pre>
   *
   * <code>repeated .google.protobuf.Any value = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getValueOrBuilder(
      int index) {
    return value_.get(index);
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
    for (int i = 0; i < value_.size(); i++) {
      output.writeMessage(1, value_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < value_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, value_.get(i));
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
    if (!(obj instanceof bilibili.app.distribution.v1.GetUserPreferenceReply)) {
      return super.equals(obj);
    }
    bilibili.app.distribution.v1.GetUserPreferenceReply other = (bilibili.app.distribution.v1.GetUserPreferenceReply) obj;

    if (!getValueList()
        .equals(other.getValueList())) return false;
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
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.v1.GetUserPreferenceReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.distribution.v1.GetUserPreferenceReply prototype) {
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
   * Protobuf type {@code bilibili.app.distribution.v1.GetUserPreferenceReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.distribution.v1.GetUserPreferenceReply)
      bilibili.app.distribution.v1.GetUserPreferenceReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.distribution.v1.DistributionOuterClass.internal_static_bilibili_app_distribution_v1_GetUserPreferenceReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.distribution.v1.DistributionOuterClass.internal_static_bilibili_app_distribution_v1_GetUserPreferenceReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.distribution.v1.GetUserPreferenceReply.class, bilibili.app.distribution.v1.GetUserPreferenceReply.Builder.class);
    }

    // Construct using bilibili.app.distribution.v1.GetUserPreferenceReply.newBuilder()
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
      if (valueBuilder_ == null) {
        value_ = java.util.Collections.emptyList();
      } else {
        value_ = null;
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.distribution.v1.DistributionOuterClass.internal_static_bilibili_app_distribution_v1_GetUserPreferenceReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.distribution.v1.GetUserPreferenceReply getDefaultInstanceForType() {
      return bilibili.app.distribution.v1.GetUserPreferenceReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.distribution.v1.GetUserPreferenceReply build() {
      bilibili.app.distribution.v1.GetUserPreferenceReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.distribution.v1.GetUserPreferenceReply buildPartial() {
      bilibili.app.distribution.v1.GetUserPreferenceReply result = new bilibili.app.distribution.v1.GetUserPreferenceReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.distribution.v1.GetUserPreferenceReply result) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          value_ = java.util.Collections.unmodifiableList(value_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.distribution.v1.GetUserPreferenceReply result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.distribution.v1.GetUserPreferenceReply) {
        return mergeFrom((bilibili.app.distribution.v1.GetUserPreferenceReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.distribution.v1.GetUserPreferenceReply other) {
      if (other == bilibili.app.distribution.v1.GetUserPreferenceReply.getDefaultInstance()) return this;
      if (valueBuilder_ == null) {
        if (!other.value_.isEmpty()) {
          if (value_.isEmpty()) {
            value_ = other.value_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValueIsMutable();
            value_.addAll(other.value_);
          }
          onChanged();
        }
      } else {
        if (!other.value_.isEmpty()) {
          if (valueBuilder_.isEmpty()) {
            valueBuilder_.dispose();
            valueBuilder_ = null;
            value_ = other.value_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valueBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValueFieldBuilder() : null;
          } else {
            valueBuilder_.addAllMessages(other.value_);
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
              com.google.protobuf.Any m =
                  input.readMessage(
                      com.google.protobuf.Any.parser(),
                      extensionRegistry);
              if (valueBuilder_ == null) {
                ensureValueIsMutable();
                value_.add(m);
              } else {
                valueBuilder_.addMessage(m);
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

    private java.util.List<com.google.protobuf.Any> value_ =
      java.util.Collections.emptyList();
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        value_ = new java.util.ArrayList<com.google.protobuf.Any>(value_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> valueBuilder_;

    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public java.util.List<com.google.protobuf.Any> getValueList() {
      if (valueBuilder_ == null) {
        return java.util.Collections.unmodifiableList(value_);
      } else {
        return valueBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public int getValueCount() {
      if (valueBuilder_ == null) {
        return value_.size();
      } else {
        return valueBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public com.google.protobuf.Any getValue(int index) {
      if (valueBuilder_ == null) {
        return value_.get(index);
      } else {
        return valueBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder setValue(
        int index, com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueIsMutable();
        value_.set(index, value);
        onChanged();
      } else {
        valueBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder setValue(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (valueBuilder_ == null) {
        ensureValueIsMutable();
        value_.set(index, builderForValue.build());
        onChanged();
      } else {
        valueBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder addValue(com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueIsMutable();
        value_.add(value);
        onChanged();
      } else {
        valueBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder addValue(
        int index, com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueIsMutable();
        value_.add(index, value);
        onChanged();
      } else {
        valueBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder addValue(
        com.google.protobuf.Any.Builder builderForValue) {
      if (valueBuilder_ == null) {
        ensureValueIsMutable();
        value_.add(builderForValue.build());
        onChanged();
      } else {
        valueBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder addValue(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (valueBuilder_ == null) {
        ensureValueIsMutable();
        value_.add(index, builderForValue.build());
        onChanged();
      } else {
        valueBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder addAllValue(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (valueBuilder_ == null) {
        ensureValueIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, value_);
        onChanged();
      } else {
        valueBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public Builder removeValue(int index) {
      if (valueBuilder_ == null) {
        ensureValueIsMutable();
        value_.remove(index);
        onChanged();
      } else {
        valueBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public com.google.protobuf.Any.Builder getValueBuilder(
        int index) {
      return getValueFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public com.google.protobuf.AnyOrBuilder getValueOrBuilder(
        int index) {
      if (valueBuilder_ == null) {
        return value_.get(index);  } else {
        return valueBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getValueOrBuilderList() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(value_);
      }
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public com.google.protobuf.Any.Builder addValueBuilder() {
      return getValueFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public com.google.protobuf.Any.Builder addValueBuilder(
        int index) {
      return getValueFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * 对应 GetUserPreferenceReq 的请求的类型
     * </pre>
     *
     * <code>repeated .google.protobuf.Any value = 1;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getValueBuilderList() {
      return getValueFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                value_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.distribution.v1.GetUserPreferenceReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.distribution.v1.GetUserPreferenceReply)
  private static final bilibili.app.distribution.v1.GetUserPreferenceReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.distribution.v1.GetUserPreferenceReply();
  }

  public static bilibili.app.distribution.v1.GetUserPreferenceReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserPreferenceReply>
      PARSER = new com.google.protobuf.AbstractParser<GetUserPreferenceReply>() {
    @java.lang.Override
    public GetUserPreferenceReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetUserPreferenceReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserPreferenceReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.distribution.v1.GetUserPreferenceReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
