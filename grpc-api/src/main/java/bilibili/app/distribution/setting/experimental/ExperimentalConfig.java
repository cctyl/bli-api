// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/experimental.proto

package bilibili.app.distribution.setting.experimental;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.distribution.setting.experimental.ExperimentalConfig}
 */
public final class ExperimentalConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.distribution.setting.experimental.ExperimentalConfig)
    ExperimentalConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExperimentalConfig.newBuilder() to construct.
  private ExperimentalConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExperimentalConfig() {
    exps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExperimentalConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.distribution.setting.experimental.Experimental.internal_static_bilibili_app_distribution_setting_experimental_ExperimentalConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.distribution.setting.experimental.Experimental.internal_static_bilibili_app_distribution_setting_experimental_ExperimentalConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.distribution.setting.experimental.ExperimentalConfig.class, bilibili.app.distribution.setting.experimental.ExperimentalConfig.Builder.class);
  }

  public static final int FLAG_FIELD_NUMBER = 1;
  private bilibili.app.distribution.v1.StringValue flag_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
   * @return Whether the flag field is set.
   */
  @java.lang.Override
  public boolean hasFlag() {
    return flag_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
   * @return The flag.
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.StringValue getFlag() {
    return flag_ == null ? bilibili.app.distribution.v1.StringValue.getDefaultInstance() : flag_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.distribution.v1.StringValueOrBuilder getFlagOrBuilder() {
    return flag_ == null ? bilibili.app.distribution.v1.StringValue.getDefaultInstance() : flag_;
  }

  public static final int EXPS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.distribution.setting.experimental.Exp> exps_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.distribution.setting.experimental.Exp> getExpsList() {
    return exps_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.distribution.setting.experimental.ExpOrBuilder> 
      getExpsOrBuilderList() {
    return exps_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
   */
  @java.lang.Override
  public int getExpsCount() {
    return exps_.size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.distribution.setting.experimental.Exp getExps(int index) {
    return exps_.get(index);
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.distribution.setting.experimental.ExpOrBuilder getExpsOrBuilder(
      int index) {
    return exps_.get(index);
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
    if (flag_ != null) {
      output.writeMessage(1, getFlag());
    }
    for (int i = 0; i < exps_.size(); i++) {
      output.writeMessage(2, exps_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFlag());
    }
    for (int i = 0; i < exps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, exps_.get(i));
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
    if (!(obj instanceof bilibili.app.distribution.setting.experimental.ExperimentalConfig)) {
      return super.equals(obj);
    }
    bilibili.app.distribution.setting.experimental.ExperimentalConfig other = (bilibili.app.distribution.setting.experimental.ExperimentalConfig) obj;

    if (hasFlag() != other.hasFlag()) return false;
    if (hasFlag()) {
      if (!getFlag()
          .equals(other.getFlag())) return false;
    }
    if (!getExpsList()
        .equals(other.getExpsList())) return false;
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
    if (hasFlag()) {
      hash = (37 * hash) + FLAG_FIELD_NUMBER;
      hash = (53 * hash) + getFlag().hashCode();
    }
    if (getExpsCount() > 0) {
      hash = (37 * hash) + EXPS_FIELD_NUMBER;
      hash = (53 * hash) + getExpsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig parseFrom(
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
  public static Builder newBuilder(bilibili.app.distribution.setting.experimental.ExperimentalConfig prototype) {
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
   * Protobuf type {@code bilibili.app.distribution.setting.experimental.ExperimentalConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.distribution.setting.experimental.ExperimentalConfig)
      bilibili.app.distribution.setting.experimental.ExperimentalConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.distribution.setting.experimental.Experimental.internal_static_bilibili_app_distribution_setting_experimental_ExperimentalConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.distribution.setting.experimental.Experimental.internal_static_bilibili_app_distribution_setting_experimental_ExperimentalConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.distribution.setting.experimental.ExperimentalConfig.class, bilibili.app.distribution.setting.experimental.ExperimentalConfig.Builder.class);
    }

    // Construct using bilibili.app.distribution.setting.experimental.ExperimentalConfig.newBuilder()
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
      flag_ = null;
      if (flagBuilder_ != null) {
        flagBuilder_.dispose();
        flagBuilder_ = null;
      }
      if (expsBuilder_ == null) {
        exps_ = java.util.Collections.emptyList();
      } else {
        exps_ = null;
        expsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.distribution.setting.experimental.Experimental.internal_static_bilibili_app_distribution_setting_experimental_ExperimentalConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.experimental.ExperimentalConfig getDefaultInstanceForType() {
      return bilibili.app.distribution.setting.experimental.ExperimentalConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.experimental.ExperimentalConfig build() {
      bilibili.app.distribution.setting.experimental.ExperimentalConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.experimental.ExperimentalConfig buildPartial() {
      bilibili.app.distribution.setting.experimental.ExperimentalConfig result = new bilibili.app.distribution.setting.experimental.ExperimentalConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.distribution.setting.experimental.ExperimentalConfig result) {
      if (expsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          exps_ = java.util.Collections.unmodifiableList(exps_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.exps_ = exps_;
      } else {
        result.exps_ = expsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.distribution.setting.experimental.ExperimentalConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flag_ = flagBuilder_ == null
            ? flag_
            : flagBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.distribution.setting.experimental.ExperimentalConfig) {
        return mergeFrom((bilibili.app.distribution.setting.experimental.ExperimentalConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.distribution.setting.experimental.ExperimentalConfig other) {
      if (other == bilibili.app.distribution.setting.experimental.ExperimentalConfig.getDefaultInstance()) return this;
      if (other.hasFlag()) {
        mergeFlag(other.getFlag());
      }
      if (expsBuilder_ == null) {
        if (!other.exps_.isEmpty()) {
          if (exps_.isEmpty()) {
            exps_ = other.exps_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureExpsIsMutable();
            exps_.addAll(other.exps_);
          }
          onChanged();
        }
      } else {
        if (!other.exps_.isEmpty()) {
          if (expsBuilder_.isEmpty()) {
            expsBuilder_.dispose();
            expsBuilder_ = null;
            exps_ = other.exps_;
            bitField0_ = (bitField0_ & ~0x00000002);
            expsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExpsFieldBuilder() : null;
          } else {
            expsBuilder_.addAllMessages(other.exps_);
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
              input.readMessage(
                  getFlagFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.app.distribution.setting.experimental.Exp m =
                  input.readMessage(
                      bilibili.app.distribution.setting.experimental.Exp.parser(),
                      extensionRegistry);
              if (expsBuilder_ == null) {
                ensureExpsIsMutable();
                exps_.add(m);
              } else {
                expsBuilder_.addMessage(m);
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

    private bilibili.app.distribution.v1.StringValue flag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.StringValue, bilibili.app.distribution.v1.StringValue.Builder, bilibili.app.distribution.v1.StringValueOrBuilder> flagBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     * @return Whether the flag field is set.
     */
    public boolean hasFlag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     * @return The flag.
     */
    public bilibili.app.distribution.v1.StringValue getFlag() {
      if (flagBuilder_ == null) {
        return flag_ == null ? bilibili.app.distribution.v1.StringValue.getDefaultInstance() : flag_;
      } else {
        return flagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public Builder setFlag(bilibili.app.distribution.v1.StringValue value) {
      if (flagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flag_ = value;
      } else {
        flagBuilder_.setMessage(value);
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
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public Builder setFlag(
        bilibili.app.distribution.v1.StringValue.Builder builderForValue) {
      if (flagBuilder_ == null) {
        flag_ = builderForValue.build();
      } else {
        flagBuilder_.setMessage(builderForValue.build());
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
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public Builder mergeFlag(bilibili.app.distribution.v1.StringValue value) {
      if (flagBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          flag_ != null &&
          flag_ != bilibili.app.distribution.v1.StringValue.getDefaultInstance()) {
          getFlagBuilder().mergeFrom(value);
        } else {
          flag_ = value;
        }
      } else {
        flagBuilder_.mergeFrom(value);
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
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public Builder clearFlag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      flag_ = null;
      if (flagBuilder_ != null) {
        flagBuilder_.dispose();
        flagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public bilibili.app.distribution.v1.StringValue.Builder getFlagBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFlagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    public bilibili.app.distribution.v1.StringValueOrBuilder getFlagOrBuilder() {
      if (flagBuilder_ != null) {
        return flagBuilder_.getMessageOrBuilder();
      } else {
        return flag_ == null ?
            bilibili.app.distribution.v1.StringValue.getDefaultInstance() : flag_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.StringValue flag = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.distribution.v1.StringValue, bilibili.app.distribution.v1.StringValue.Builder, bilibili.app.distribution.v1.StringValueOrBuilder> 
        getFlagFieldBuilder() {
      if (flagBuilder_ == null) {
        flagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.distribution.v1.StringValue, bilibili.app.distribution.v1.StringValue.Builder, bilibili.app.distribution.v1.StringValueOrBuilder>(
                getFlag(),
                getParentForChildren(),
                isClean());
        flag_ = null;
      }
      return flagBuilder_;
    }

    private java.util.List<bilibili.app.distribution.setting.experimental.Exp> exps_ =
      java.util.Collections.emptyList();
    private void ensureExpsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        exps_ = new java.util.ArrayList<bilibili.app.distribution.setting.experimental.Exp>(exps_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.distribution.setting.experimental.Exp, bilibili.app.distribution.setting.experimental.Exp.Builder, bilibili.app.distribution.setting.experimental.ExpOrBuilder> expsBuilder_;

    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public java.util.List<bilibili.app.distribution.setting.experimental.Exp> getExpsList() {
      if (expsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exps_);
      } else {
        return expsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public int getExpsCount() {
      if (expsBuilder_ == null) {
        return exps_.size();
      } else {
        return expsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public bilibili.app.distribution.setting.experimental.Exp getExps(int index) {
      if (expsBuilder_ == null) {
        return exps_.get(index);
      } else {
        return expsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder setExps(
        int index, bilibili.app.distribution.setting.experimental.Exp value) {
      if (expsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpsIsMutable();
        exps_.set(index, value);
        onChanged();
      } else {
        expsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder setExps(
        int index, bilibili.app.distribution.setting.experimental.Exp.Builder builderForValue) {
      if (expsBuilder_ == null) {
        ensureExpsIsMutable();
        exps_.set(index, builderForValue.build());
        onChanged();
      } else {
        expsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder addExps(bilibili.app.distribution.setting.experimental.Exp value) {
      if (expsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpsIsMutable();
        exps_.add(value);
        onChanged();
      } else {
        expsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder addExps(
        int index, bilibili.app.distribution.setting.experimental.Exp value) {
      if (expsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpsIsMutable();
        exps_.add(index, value);
        onChanged();
      } else {
        expsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder addExps(
        bilibili.app.distribution.setting.experimental.Exp.Builder builderForValue) {
      if (expsBuilder_ == null) {
        ensureExpsIsMutable();
        exps_.add(builderForValue.build());
        onChanged();
      } else {
        expsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder addExps(
        int index, bilibili.app.distribution.setting.experimental.Exp.Builder builderForValue) {
      if (expsBuilder_ == null) {
        ensureExpsIsMutable();
        exps_.add(index, builderForValue.build());
        onChanged();
      } else {
        expsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder addAllExps(
        java.lang.Iterable<? extends bilibili.app.distribution.setting.experimental.Exp> values) {
      if (expsBuilder_ == null) {
        ensureExpsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exps_);
        onChanged();
      } else {
        expsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder clearExps() {
      if (expsBuilder_ == null) {
        exps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        expsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public Builder removeExps(int index) {
      if (expsBuilder_ == null) {
        ensureExpsIsMutable();
        exps_.remove(index);
        onChanged();
      } else {
        expsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public bilibili.app.distribution.setting.experimental.Exp.Builder getExpsBuilder(
        int index) {
      return getExpsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public bilibili.app.distribution.setting.experimental.ExpOrBuilder getExpsOrBuilder(
        int index) {
      if (expsBuilder_ == null) {
        return exps_.get(index);  } else {
        return expsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public java.util.List<? extends bilibili.app.distribution.setting.experimental.ExpOrBuilder> 
         getExpsOrBuilderList() {
      if (expsBuilder_ != null) {
        return expsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exps_);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public bilibili.app.distribution.setting.experimental.Exp.Builder addExpsBuilder() {
      return getExpsFieldBuilder().addBuilder(
          bilibili.app.distribution.setting.experimental.Exp.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public bilibili.app.distribution.setting.experimental.Exp.Builder addExpsBuilder(
        int index) {
      return getExpsFieldBuilder().addBuilder(
          index, bilibili.app.distribution.setting.experimental.Exp.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.distribution.setting.experimental.Exp exps = 2;</code>
     */
    public java.util.List<bilibili.app.distribution.setting.experimental.Exp.Builder> 
         getExpsBuilderList() {
      return getExpsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.distribution.setting.experimental.Exp, bilibili.app.distribution.setting.experimental.Exp.Builder, bilibili.app.distribution.setting.experimental.ExpOrBuilder> 
        getExpsFieldBuilder() {
      if (expsBuilder_ == null) {
        expsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.distribution.setting.experimental.Exp, bilibili.app.distribution.setting.experimental.Exp.Builder, bilibili.app.distribution.setting.experimental.ExpOrBuilder>(
                exps_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        exps_ = null;
      }
      return expsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.distribution.setting.experimental.ExperimentalConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.distribution.setting.experimental.ExperimentalConfig)
  private static final bilibili.app.distribution.setting.experimental.ExperimentalConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.distribution.setting.experimental.ExperimentalConfig();
  }

  public static bilibili.app.distribution.setting.experimental.ExperimentalConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExperimentalConfig>
      PARSER = new com.google.protobuf.AbstractParser<ExperimentalConfig>() {
    @java.lang.Override
    public ExperimentalConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExperimentalConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExperimentalConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.distribution.setting.experimental.ExperimentalConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

