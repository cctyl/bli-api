// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.FavFolderAction}
 */
public final class FavFolderAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.FavFolderAction)
    FavFolderActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FavFolderAction.newBuilder() to construct.
  private FavFolderAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FavFolderAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FavFolderAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_FavFolderAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_FavFolderAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.FavFolderAction.class, bilibili.app.listener.v1.FavFolderAction.Builder.class);
  }

  public static final int FID_FIELD_NUMBER = 1;
  private long fid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 fid = 1;</code>
   * @return The fid.
   */
  @java.lang.Override
  public long getFid() {
    return fid_;
  }

  public static final int FOLDER_TYPE_FIELD_NUMBER = 2;
  private int folderType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 folder_type = 2;</code>
   * @return The folderType.
   */
  @java.lang.Override
  public int getFolderType() {
    return folderType_;
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private int action_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 action = 3;</code>
   * @return The action.
   */
  @java.lang.Override
  public int getAction() {
    return action_;
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
    if (fid_ != 0L) {
      output.writeInt64(1, fid_);
    }
    if (folderType_ != 0) {
      output.writeInt32(2, folderType_);
    }
    if (action_ != 0) {
      output.writeInt32(3, action_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, fid_);
    }
    if (folderType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, folderType_);
    }
    if (action_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, action_);
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
    if (!(obj instanceof bilibili.app.listener.v1.FavFolderAction)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.FavFolderAction other = (bilibili.app.listener.v1.FavFolderAction) obj;

    if (getFid()
        != other.getFid()) return false;
    if (getFolderType()
        != other.getFolderType()) return false;
    if (getAction()
        != other.getAction()) return false;
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
    hash = (37 * hash) + FID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFid());
    hash = (37 * hash) + FOLDER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFolderType();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.FavFolderAction parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.FavFolderAction prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.FavFolderAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.FavFolderAction)
      bilibili.app.listener.v1.FavFolderActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_FavFolderAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_FavFolderAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.FavFolderAction.class, bilibili.app.listener.v1.FavFolderAction.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.FavFolderAction.newBuilder()
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
      fid_ = 0L;
      folderType_ = 0;
      action_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_FavFolderAction_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.FavFolderAction getDefaultInstanceForType() {
      return bilibili.app.listener.v1.FavFolderAction.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.FavFolderAction build() {
      bilibili.app.listener.v1.FavFolderAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.FavFolderAction buildPartial() {
      bilibili.app.listener.v1.FavFolderAction result = new bilibili.app.listener.v1.FavFolderAction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.FavFolderAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fid_ = fid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.folderType_ = folderType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.action_ = action_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.FavFolderAction) {
        return mergeFrom((bilibili.app.listener.v1.FavFolderAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.FavFolderAction other) {
      if (other == bilibili.app.listener.v1.FavFolderAction.getDefaultInstance()) return this;
      if (other.getFid() != 0L) {
        setFid(other.getFid());
      }
      if (other.getFolderType() != 0) {
        setFolderType(other.getFolderType());
      }
      if (other.getAction() != 0) {
        setAction(other.getAction());
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
              fid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              folderType_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              action_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long fid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 fid = 1;</code>
     * @return The fid.
     */
    @java.lang.Override
    public long getFid() {
      return fid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 fid = 1;</code>
     * @param value The fid to set.
     * @return This builder for chaining.
     */
    public Builder setFid(long value) {

      fid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 fid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fid_ = 0L;
      onChanged();
      return this;
    }

    private int folderType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 folder_type = 2;</code>
     * @return The folderType.
     */
    @java.lang.Override
    public int getFolderType() {
      return folderType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 folder_type = 2;</code>
     * @param value The folderType to set.
     * @return This builder for chaining.
     */
    public Builder setFolderType(int value) {

      folderType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 folder_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFolderType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      folderType_ = 0;
      onChanged();
      return this;
    }

    private int action_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 action = 3;</code>
     * @return The action.
     */
    @java.lang.Override
    public int getAction() {
      return action_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 action = 3;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(int value) {

      action_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 action = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      action_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.FavFolderAction)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.FavFolderAction)
  private static final bilibili.app.listener.v1.FavFolderAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.FavFolderAction();
  }

  public static bilibili.app.listener.v1.FavFolderAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FavFolderAction>
      PARSER = new com.google.protobuf.AbstractParser<FavFolderAction>() {
    @java.lang.Override
    public FavFolderAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<FavFolderAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FavFolderAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.FavFolderAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
