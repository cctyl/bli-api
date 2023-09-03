// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.PlayActionReportReq}
 */
public final class PlayActionReportReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.PlayActionReportReq)
    PlayActionReportReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayActionReportReq.newBuilder() to construct.
  private PlayActionReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayActionReportReq() {
    fromSpmid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayActionReportReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayActionReportReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayActionReportReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.PlayActionReportReq.class, bilibili.app.listener.v1.PlayActionReportReq.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private bilibili.app.listener.v1.PlayItem item_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return The item.
   */
  @java.lang.Override
  public bilibili.app.listener.v1.PlayItem getItem() {
    return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder() {
    return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
  }

  public static final int FROM_SPMID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromSpmid_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 2;</code>
   * @return The fromSpmid.
   */
  @java.lang.Override
  public java.lang.String getFromSpmid() {
    java.lang.Object ref = fromSpmid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromSpmid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 2;</code>
   * @return The bytes for fromSpmid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromSpmidBytes() {
    java.lang.Object ref = fromSpmid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromSpmid_ = b;
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
    if (item_ != null) {
      output.writeMessage(1, getItem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSpmid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromSpmid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromSpmid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromSpmid_);
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
    if (!(obj instanceof bilibili.app.listener.v1.PlayActionReportReq)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.PlayActionReportReq other = (bilibili.app.listener.v1.PlayActionReportReq) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem()
          .equals(other.getItem())) return false;
    }
    if (!getFromSpmid()
        .equals(other.getFromSpmid())) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (37 * hash) + FROM_SPMID_FIELD_NUMBER;
    hash = (53 * hash) + getFromSpmid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.PlayActionReportReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.PlayActionReportReq prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.PlayActionReportReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.PlayActionReportReq)
      bilibili.app.listener.v1.PlayActionReportReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayActionReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayActionReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.PlayActionReportReq.class, bilibili.app.listener.v1.PlayActionReportReq.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.PlayActionReportReq.newBuilder()
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
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      fromSpmid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_PlayActionReportReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayActionReportReq getDefaultInstanceForType() {
      return bilibili.app.listener.v1.PlayActionReportReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayActionReportReq build() {
      bilibili.app.listener.v1.PlayActionReportReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.PlayActionReportReq buildPartial() {
      bilibili.app.listener.v1.PlayActionReportReq result = new bilibili.app.listener.v1.PlayActionReportReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.PlayActionReportReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.item_ = itemBuilder_ == null
            ? item_
            : itemBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fromSpmid_ = fromSpmid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.PlayActionReportReq) {
        return mergeFrom((bilibili.app.listener.v1.PlayActionReportReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.PlayActionReportReq other) {
      if (other == bilibili.app.listener.v1.PlayActionReportReq.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (!other.getFromSpmid().isEmpty()) {
        fromSpmid_ = other.fromSpmid_;
        bitField0_ |= 0x00000002;
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
                  getItemFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fromSpmid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private bilibili.app.listener.v1.PlayItem item_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder> itemBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     * @return The item.
     */
    public bilibili.app.listener.v1.PlayItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder setItem(bilibili.app.listener.v1.PlayItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
      } else {
        itemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder setItem(
        bilibili.app.listener.v1.PlayItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder mergeItem(bilibili.app.listener.v1.PlayItem value) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          item_ != null &&
          item_ != bilibili.app.listener.v1.PlayItem.getDefaultInstance()) {
          getItemBuilder().mergeFrom(value);
        } else {
          item_ = value;
        }
      } else {
        itemBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public Builder clearItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public bilibili.app.listener.v1.PlayItem.Builder getItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    public bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            bilibili.app.listener.v1.PlayItem.getDefaultInstance() : item_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.listener.v1.PlayItem, bilibili.app.listener.v1.PlayItem.Builder, bilibili.app.listener.v1.PlayItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private java.lang.Object fromSpmid_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_spmid = 2;</code>
     * @return The fromSpmid.
     */
    public java.lang.String getFromSpmid() {
      java.lang.Object ref = fromSpmid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromSpmid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_spmid = 2;</code>
     * @return The bytes for fromSpmid.
     */
    public com.google.protobuf.ByteString
        getFromSpmidBytes() {
      java.lang.Object ref = fromSpmid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromSpmid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_spmid = 2;</code>
     * @param value The fromSpmid to set.
     * @return This builder for chaining.
     */
    public Builder setFromSpmid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromSpmid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_spmid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromSpmid() {
      fromSpmid_ = getDefaultInstance().getFromSpmid();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string from_spmid = 2;</code>
     * @param value The bytes for fromSpmid to set.
     * @return This builder for chaining.
     */
    public Builder setFromSpmidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromSpmid_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.PlayActionReportReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.PlayActionReportReq)
  private static final bilibili.app.listener.v1.PlayActionReportReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.PlayActionReportReq();
  }

  public static bilibili.app.listener.v1.PlayActionReportReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayActionReportReq>
      PARSER = new com.google.protobuf.AbstractParser<PlayActionReportReq>() {
    @java.lang.Override
    public PlayActionReportReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayActionReportReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayActionReportReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.PlayActionReportReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

