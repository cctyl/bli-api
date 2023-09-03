// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 批量拉取会话详情-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.RspSessionDetails}
 */
public final class RspSessionDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.RspSessionDetails)
    RspSessionDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RspSessionDetails.newBuilder() to construct.
  private RspSessionDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RspSessionDetails() {
    sessInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RspSessionDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_RspSessionDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_RspSessionDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.RspSessionDetails.class, bilibili.im.interface.v1.RspSessionDetails.Builder.class);
  }

  public static final int SESS_INFOS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.im.type.SessionInfo> sessInfos_;
  /**
   * <pre>
   * 会话详情列表
   * </pre>
   *
   * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.im.type.SessionInfo> getSessInfosList() {
    return sessInfos_;
  }
  /**
   * <pre>
   * 会话详情列表
   * </pre>
   *
   * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.im.type.SessionInfoOrBuilder> 
      getSessInfosOrBuilderList() {
    return sessInfos_;
  }
  /**
   * <pre>
   * 会话详情列表
   * </pre>
   *
   * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
   */
  @java.lang.Override
  public int getSessInfosCount() {
    return sessInfos_.size();
  }
  /**
   * <pre>
   * 会话详情列表
   * </pre>
   *
   * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
   */
  @java.lang.Override
  public bilibili.im.type.SessionInfo getSessInfos(int index) {
    return sessInfos_.get(index);
  }
  /**
   * <pre>
   * 会话详情列表
   * </pre>
   *
   * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
   */
  @java.lang.Override
  public bilibili.im.type.SessionInfoOrBuilder getSessInfosOrBuilder(
      int index) {
    return sessInfos_.get(index);
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
    for (int i = 0; i < sessInfos_.size(); i++) {
      output.writeMessage(1, sessInfos_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sessInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sessInfos_.get(i));
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
    if (!(obj instanceof bilibili.im.interface.v1.RspSessionDetails)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.RspSessionDetails other = (bilibili.im.interface.v1.RspSessionDetails) obj;

    if (!getSessInfosList()
        .equals(other.getSessInfosList())) return false;
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
    if (getSessInfosCount() > 0) {
      hash = (37 * hash) + SESS_INFOS_FIELD_NUMBER;
      hash = (53 * hash) + getSessInfosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.RspSessionDetails parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.RspSessionDetails prototype) {
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
   * 批量拉取会话详情-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.RspSessionDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.RspSessionDetails)
      bilibili.im.interface.v1.RspSessionDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_RspSessionDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_RspSessionDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.RspSessionDetails.class, bilibili.im.interface.v1.RspSessionDetails.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.RspSessionDetails.newBuilder()
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
      if (sessInfosBuilder_ == null) {
        sessInfos_ = java.util.Collections.emptyList();
      } else {
        sessInfos_ = null;
        sessInfosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_RspSessionDetails_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.RspSessionDetails getDefaultInstanceForType() {
      return bilibili.im.interface.v1.RspSessionDetails.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.RspSessionDetails build() {
      bilibili.im.interface.v1.RspSessionDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.RspSessionDetails buildPartial() {
      bilibili.im.interface.v1.RspSessionDetails result = new bilibili.im.interface.v1.RspSessionDetails(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.im.interface.v1.RspSessionDetails result) {
      if (sessInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sessInfos_ = java.util.Collections.unmodifiableList(sessInfos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sessInfos_ = sessInfos_;
      } else {
        result.sessInfos_ = sessInfosBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.im.interface.v1.RspSessionDetails result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.RspSessionDetails) {
        return mergeFrom((bilibili.im.interface.v1.RspSessionDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.RspSessionDetails other) {
      if (other == bilibili.im.interface.v1.RspSessionDetails.getDefaultInstance()) return this;
      if (sessInfosBuilder_ == null) {
        if (!other.sessInfos_.isEmpty()) {
          if (sessInfos_.isEmpty()) {
            sessInfos_ = other.sessInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSessInfosIsMutable();
            sessInfos_.addAll(other.sessInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.sessInfos_.isEmpty()) {
          if (sessInfosBuilder_.isEmpty()) {
            sessInfosBuilder_.dispose();
            sessInfosBuilder_ = null;
            sessInfos_ = other.sessInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sessInfosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSessInfosFieldBuilder() : null;
          } else {
            sessInfosBuilder_.addAllMessages(other.sessInfos_);
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
              bilibili.im.type.SessionInfo m =
                  input.readMessage(
                      bilibili.im.type.SessionInfo.parser(),
                      extensionRegistry);
              if (sessInfosBuilder_ == null) {
                ensureSessInfosIsMutable();
                sessInfos_.add(m);
              } else {
                sessInfosBuilder_.addMessage(m);
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

    private java.util.List<bilibili.im.type.SessionInfo> sessInfos_ =
      java.util.Collections.emptyList();
    private void ensureSessInfosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sessInfos_ = new java.util.ArrayList<bilibili.im.type.SessionInfo>(sessInfos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.im.type.SessionInfo, bilibili.im.type.SessionInfo.Builder, bilibili.im.type.SessionInfoOrBuilder> sessInfosBuilder_;

    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public java.util.List<bilibili.im.type.SessionInfo> getSessInfosList() {
      if (sessInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sessInfos_);
      } else {
        return sessInfosBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public int getSessInfosCount() {
      if (sessInfosBuilder_ == null) {
        return sessInfos_.size();
      } else {
        return sessInfosBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public bilibili.im.type.SessionInfo getSessInfos(int index) {
      if (sessInfosBuilder_ == null) {
        return sessInfos_.get(index);
      } else {
        return sessInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder setSessInfos(
        int index, bilibili.im.type.SessionInfo value) {
      if (sessInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessInfosIsMutable();
        sessInfos_.set(index, value);
        onChanged();
      } else {
        sessInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder setSessInfos(
        int index, bilibili.im.type.SessionInfo.Builder builderForValue) {
      if (sessInfosBuilder_ == null) {
        ensureSessInfosIsMutable();
        sessInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        sessInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder addSessInfos(bilibili.im.type.SessionInfo value) {
      if (sessInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessInfosIsMutable();
        sessInfos_.add(value);
        onChanged();
      } else {
        sessInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder addSessInfos(
        int index, bilibili.im.type.SessionInfo value) {
      if (sessInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessInfosIsMutable();
        sessInfos_.add(index, value);
        onChanged();
      } else {
        sessInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder addSessInfos(
        bilibili.im.type.SessionInfo.Builder builderForValue) {
      if (sessInfosBuilder_ == null) {
        ensureSessInfosIsMutable();
        sessInfos_.add(builderForValue.build());
        onChanged();
      } else {
        sessInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder addSessInfos(
        int index, bilibili.im.type.SessionInfo.Builder builderForValue) {
      if (sessInfosBuilder_ == null) {
        ensureSessInfosIsMutable();
        sessInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        sessInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder addAllSessInfos(
        java.lang.Iterable<? extends bilibili.im.type.SessionInfo> values) {
      if (sessInfosBuilder_ == null) {
        ensureSessInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sessInfos_);
        onChanged();
      } else {
        sessInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder clearSessInfos() {
      if (sessInfosBuilder_ == null) {
        sessInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sessInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public Builder removeSessInfos(int index) {
      if (sessInfosBuilder_ == null) {
        ensureSessInfosIsMutable();
        sessInfos_.remove(index);
        onChanged();
      } else {
        sessInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public bilibili.im.type.SessionInfo.Builder getSessInfosBuilder(
        int index) {
      return getSessInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public bilibili.im.type.SessionInfoOrBuilder getSessInfosOrBuilder(
        int index) {
      if (sessInfosBuilder_ == null) {
        return sessInfos_.get(index);  } else {
        return sessInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public java.util.List<? extends bilibili.im.type.SessionInfoOrBuilder> 
         getSessInfosOrBuilderList() {
      if (sessInfosBuilder_ != null) {
        return sessInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sessInfos_);
      }
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public bilibili.im.type.SessionInfo.Builder addSessInfosBuilder() {
      return getSessInfosFieldBuilder().addBuilder(
          bilibili.im.type.SessionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public bilibili.im.type.SessionInfo.Builder addSessInfosBuilder(
        int index) {
      return getSessInfosFieldBuilder().addBuilder(
          index, bilibili.im.type.SessionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * 会话详情列表
     * </pre>
     *
     * <code>repeated .bilibili.im.type.SessionInfo sess_infos = 1;</code>
     */
    public java.util.List<bilibili.im.type.SessionInfo.Builder> 
         getSessInfosBuilderList() {
      return getSessInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.im.type.SessionInfo, bilibili.im.type.SessionInfo.Builder, bilibili.im.type.SessionInfoOrBuilder> 
        getSessInfosFieldBuilder() {
      if (sessInfosBuilder_ == null) {
        sessInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.im.type.SessionInfo, bilibili.im.type.SessionInfo.Builder, bilibili.im.type.SessionInfoOrBuilder>(
                sessInfos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sessInfos_ = null;
      }
      return sessInfosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.RspSessionDetails)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.RspSessionDetails)
  private static final bilibili.im.interface.v1.RspSessionDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.RspSessionDetails();
  }

  public static bilibili.im.interface.v1.RspSessionDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RspSessionDetails>
      PARSER = new com.google.protobuf.AbstractParser<RspSessionDetails>() {
    @java.lang.Override
    public RspSessionDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<RspSessionDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RspSessionDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.RspSessionDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
