// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/room.proto

package bilibili.broadcast.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.broadcast.v1.RoomMessageEvent}
 */
public final class RoomMessageEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.broadcast.v1.RoomMessageEvent)
    RoomMessageEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomMessageEvent.newBuilder() to construct.
  private RoomMessageEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomMessageEvent() {
    targetPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoomMessageEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.broadcast.v1.Room.internal_static_bilibili_broadcast_v1_RoomMessageEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.broadcast.v1.Room.internal_static_bilibili_broadcast_v1_RoomMessageEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.broadcast.v1.RoomMessageEvent.class, bilibili.broadcast.v1.RoomMessageEvent.Builder.class);
  }

  public static final int TARGET_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object targetPath_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string target_path = 1;</code>
   * @return The targetPath.
   */
  @java.lang.Override
  public java.lang.String getTargetPath() {
    java.lang.Object ref = targetPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string target_path = 1;</code>
   * @return The bytes for targetPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetPathBytes() {
    java.lang.Object ref = targetPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 2;
  private com.google.protobuf.Any body_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any body = 2;</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any body = 2;</code>
   * @return The body.
   */
  @java.lang.Override
  public com.google.protobuf.Any getBody() {
    return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any body = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getBodyOrBuilder() {
    return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetPath_);
    }
    if (body_ != null) {
      output.writeMessage(2, getBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetPath_);
    }
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBody());
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
    if (!(obj instanceof bilibili.broadcast.v1.RoomMessageEvent)) {
      return super.equals(obj);
    }
    bilibili.broadcast.v1.RoomMessageEvent other = (bilibili.broadcast.v1.RoomMessageEvent) obj;

    if (!getTargetPath()
        .equals(other.getTargetPath())) return false;
    if (hasBody() != other.hasBody()) return false;
    if (hasBody()) {
      if (!getBody()
          .equals(other.getBody())) return false;
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
    hash = (37 * hash) + TARGET_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getTargetPath().hashCode();
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.broadcast.v1.RoomMessageEvent parseFrom(
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
  public static Builder newBuilder(bilibili.broadcast.v1.RoomMessageEvent prototype) {
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
   * Protobuf type {@code bilibili.broadcast.v1.RoomMessageEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.broadcast.v1.RoomMessageEvent)
      bilibili.broadcast.v1.RoomMessageEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.v1.Room.internal_static_bilibili_broadcast_v1_RoomMessageEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.v1.Room.internal_static_bilibili_broadcast_v1_RoomMessageEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.v1.RoomMessageEvent.class, bilibili.broadcast.v1.RoomMessageEvent.Builder.class);
    }

    // Construct using bilibili.broadcast.v1.RoomMessageEvent.newBuilder()
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
      targetPath_ = "";
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.broadcast.v1.Room.internal_static_bilibili_broadcast_v1_RoomMessageEvent_descriptor;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.RoomMessageEvent getDefaultInstanceForType() {
      return bilibili.broadcast.v1.RoomMessageEvent.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.broadcast.v1.RoomMessageEvent build() {
      bilibili.broadcast.v1.RoomMessageEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.RoomMessageEvent buildPartial() {
      bilibili.broadcast.v1.RoomMessageEvent result = new bilibili.broadcast.v1.RoomMessageEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.broadcast.v1.RoomMessageEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetPath_ = targetPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.body_ = bodyBuilder_ == null
            ? body_
            : bodyBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.broadcast.v1.RoomMessageEvent) {
        return mergeFrom((bilibili.broadcast.v1.RoomMessageEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.broadcast.v1.RoomMessageEvent other) {
      if (other == bilibili.broadcast.v1.RoomMessageEvent.getDefaultInstance()) return this;
      if (!other.getTargetPath().isEmpty()) {
        targetPath_ = other.targetPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBody()) {
        mergeBody(other.getBody());
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
              targetPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBodyFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object targetPath_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string target_path = 1;</code>
     * @return The targetPath.
     */
    public java.lang.String getTargetPath() {
      java.lang.Object ref = targetPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string target_path = 1;</code>
     * @return The bytes for targetPath.
     */
    public com.google.protobuf.ByteString
        getTargetPathBytes() {
      java.lang.Object ref = targetPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string target_path = 1;</code>
     * @param value The targetPath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      targetPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string target_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPath() {
      targetPath_ = getDefaultInstance().getTargetPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string target_path = 1;</code>
     * @param value The bytes for targetPath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      targetPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any body_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> bodyBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     * @return The body.
     */
    public com.google.protobuf.Any getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public Builder setBody(com.google.protobuf.Any value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
      } else {
        bodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public Builder setBody(
        com.google.protobuf.Any.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public Builder mergeBody(com.google.protobuf.Any value) {
      if (bodyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          body_ != null &&
          body_ != com.google.protobuf.Any.getDefaultInstance()) {
          getBodyBuilder().mergeFrom(value);
        } else {
          body_ = value;
        }
      } else {
        bodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000002);
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public com.google.protobuf.Any.Builder getBodyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : body_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.google.protobuf.Any body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.broadcast.v1.RoomMessageEvent)
  }

  // @@protoc_insertion_point(class_scope:bilibili.broadcast.v1.RoomMessageEvent)
  private static final bilibili.broadcast.v1.RoomMessageEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.broadcast.v1.RoomMessageEvent();
  }

  public static bilibili.broadcast.v1.RoomMessageEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomMessageEvent>
      PARSER = new com.google.protobuf.AbstractParser<RoomMessageEvent>() {
    @java.lang.Override
    public RoomMessageEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<RoomMessageEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomMessageEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.broadcast.v1.RoomMessageEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

