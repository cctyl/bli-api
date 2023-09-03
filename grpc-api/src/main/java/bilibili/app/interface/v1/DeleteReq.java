// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 删除历史记录-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.app.interface.v1.DeleteReq}
 */
public final class DeleteReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.interface.v1.DeleteReq)
    DeleteReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteReq.newBuilder() to construct.
  private DeleteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_DeleteReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_DeleteReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.interface.v1.DeleteReq.class, bilibili.app.interface.v1.DeleteReq.Builder.class);
  }

  public static final int HIS_INFO_FIELD_NUMBER = 1;
  private bilibili.app.interface.v1.HisInfo hisInfo_;
  /**
   * <pre>
   * 历史记录信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
   * @return Whether the hisInfo field is set.
   */
  @java.lang.Override
  public boolean hasHisInfo() {
    return hisInfo_ != null;
  }
  /**
   * <pre>
   * 历史记录信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
   * @return The hisInfo.
   */
  @java.lang.Override
  public bilibili.app.interface.v1.HisInfo getHisInfo() {
    return hisInfo_ == null ? bilibili.app.interface.v1.HisInfo.getDefaultInstance() : hisInfo_;
  }
  /**
   * <pre>
   * 历史记录信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.interface.v1.HisInfoOrBuilder getHisInfoOrBuilder() {
    return hisInfo_ == null ? bilibili.app.interface.v1.HisInfo.getDefaultInstance() : hisInfo_;
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
    if (hisInfo_ != null) {
      output.writeMessage(1, getHisInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hisInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHisInfo());
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
    if (!(obj instanceof bilibili.app.interface.v1.DeleteReq)) {
      return super.equals(obj);
    }
    bilibili.app.interface.v1.DeleteReq other = (bilibili.app.interface.v1.DeleteReq) obj;

    if (hasHisInfo() != other.hasHisInfo()) return false;
    if (hasHisInfo()) {
      if (!getHisInfo()
          .equals(other.getHisInfo())) return false;
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
    if (hasHisInfo()) {
      hash = (37 * hash) + HIS_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getHisInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.DeleteReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.DeleteReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.interface.v1.DeleteReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.interface.v1.DeleteReq prototype) {
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
   * 删除历史记录-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.app.interface.v1.DeleteReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.interface.v1.DeleteReq)
      bilibili.app.interface.v1.DeleteReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_DeleteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_DeleteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.interface.v1.DeleteReq.class, bilibili.app.interface.v1.DeleteReq.Builder.class);
    }

    // Construct using bilibili.app.interface.v1.DeleteReq.newBuilder()
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
      hisInfo_ = null;
      if (hisInfoBuilder_ != null) {
        hisInfoBuilder_.dispose();
        hisInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.interface.v1.HistoryOuterClass.internal_static_bilibili_app_interface_v1_DeleteReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.DeleteReq getDefaultInstanceForType() {
      return bilibili.app.interface.v1.DeleteReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.interface.v1.DeleteReq build() {
      bilibili.app.interface.v1.DeleteReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.interface.v1.DeleteReq buildPartial() {
      bilibili.app.interface.v1.DeleteReq result = new bilibili.app.interface.v1.DeleteReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.interface.v1.DeleteReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hisInfo_ = hisInfoBuilder_ == null
            ? hisInfo_
            : hisInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.interface.v1.DeleteReq) {
        return mergeFrom((bilibili.app.interface.v1.DeleteReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.interface.v1.DeleteReq other) {
      if (other == bilibili.app.interface.v1.DeleteReq.getDefaultInstance()) return this;
      if (other.hasHisInfo()) {
        mergeHisInfo(other.getHisInfo());
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
                  getHisInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private bilibili.app.interface.v1.HisInfo hisInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.HisInfo, bilibili.app.interface.v1.HisInfo.Builder, bilibili.app.interface.v1.HisInfoOrBuilder> hisInfoBuilder_;
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     * @return Whether the hisInfo field is set.
     */
    public boolean hasHisInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     * @return The hisInfo.
     */
    public bilibili.app.interface.v1.HisInfo getHisInfo() {
      if (hisInfoBuilder_ == null) {
        return hisInfo_ == null ? bilibili.app.interface.v1.HisInfo.getDefaultInstance() : hisInfo_;
      } else {
        return hisInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public Builder setHisInfo(bilibili.app.interface.v1.HisInfo value) {
      if (hisInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hisInfo_ = value;
      } else {
        hisInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public Builder setHisInfo(
        bilibili.app.interface.v1.HisInfo.Builder builderForValue) {
      if (hisInfoBuilder_ == null) {
        hisInfo_ = builderForValue.build();
      } else {
        hisInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public Builder mergeHisInfo(bilibili.app.interface.v1.HisInfo value) {
      if (hisInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          hisInfo_ != null &&
          hisInfo_ != bilibili.app.interface.v1.HisInfo.getDefaultInstance()) {
          getHisInfoBuilder().mergeFrom(value);
        } else {
          hisInfo_ = value;
        }
      } else {
        hisInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public Builder clearHisInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hisInfo_ = null;
      if (hisInfoBuilder_ != null) {
        hisInfoBuilder_.dispose();
        hisInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public bilibili.app.interface.v1.HisInfo.Builder getHisInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHisInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    public bilibili.app.interface.v1.HisInfoOrBuilder getHisInfoOrBuilder() {
      if (hisInfoBuilder_ != null) {
        return hisInfoBuilder_.getMessageOrBuilder();
      } else {
        return hisInfo_ == null ?
            bilibili.app.interface.v1.HisInfo.getDefaultInstance() : hisInfo_;
      }
    }
    /**
     * <pre>
     * 历史记录信息
     * </pre>
     *
     * <code>.bilibili.app.interface.v1.HisInfo his_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.interface.v1.HisInfo, bilibili.app.interface.v1.HisInfo.Builder, bilibili.app.interface.v1.HisInfoOrBuilder> 
        getHisInfoFieldBuilder() {
      if (hisInfoBuilder_ == null) {
        hisInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.interface.v1.HisInfo, bilibili.app.interface.v1.HisInfo.Builder, bilibili.app.interface.v1.HisInfoOrBuilder>(
                getHisInfo(),
                getParentForChildren(),
                isClean());
        hisInfo_ = null;
      }
      return hisInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.interface.v1.DeleteReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.interface.v1.DeleteReq)
  private static final bilibili.app.interface.v1.DeleteReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.interface.v1.DeleteReq();
  }

  public static bilibili.app.interface.v1.DeleteReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteReq>
      PARSER = new com.google.protobuf.AbstractParser<DeleteReq>() {
    @java.lang.Override
    public DeleteReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.interface.v1.DeleteReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

