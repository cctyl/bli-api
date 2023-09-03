// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 分P弹幕信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.DM}
 */
public final class DM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.DM)
    DMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DM.newBuilder() to construct.
  private DM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DM();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.DM.class, bilibili.app.view.v1.DM.Builder.class);
  }

  public static final int CLOSED_FIELD_NUMBER = 1;
  private boolean closed_ = false;
  /**
   * <pre>
   * 分P是否关闭弹幕
   * 0:正常 1:关闭
   * </pre>
   *
   * <code>bool closed = 1;</code>
   * @return The closed.
   */
  @java.lang.Override
  public boolean getClosed() {
    return closed_;
  }

  public static final int REAL_NAME_FIELD_NUMBER = 2;
  private boolean realName_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool real_name = 2;</code>
   * @return The realName.
   */
  @java.lang.Override
  public boolean getRealName() {
    return realName_;
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private long count_ = 0L;
  /**
   * <pre>
   * 分P弹幕总数
   * </pre>
   *
   * <code>int64 count = 3;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
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
    if (closed_ != false) {
      output.writeBool(1, closed_);
    }
    if (realName_ != false) {
      output.writeBool(2, realName_);
    }
    if (count_ != 0L) {
      output.writeInt64(3, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (closed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, closed_);
    }
    if (realName_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, realName_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, count_);
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
    if (!(obj instanceof bilibili.app.view.v1.DM)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.DM other = (bilibili.app.view.v1.DM) obj;

    if (getClosed()
        != other.getClosed()) return false;
    if (getRealName()
        != other.getRealName()) return false;
    if (getCount()
        != other.getCount()) return false;
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
    hash = (37 * hash) + CLOSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClosed());
    hash = (37 * hash) + REAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRealName());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.DM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.DM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.DM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.DM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.DM parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.DM prototype) {
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
   * 分P弹幕信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.DM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.DM)
      bilibili.app.view.v1.DMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.DM.class, bilibili.app.view.v1.DM.Builder.class);
    }

    // Construct using bilibili.app.view.v1.DM.newBuilder()
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
      closed_ = false;
      realName_ = false;
      count_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_DM_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.DM getDefaultInstanceForType() {
      return bilibili.app.view.v1.DM.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.DM build() {
      bilibili.app.view.v1.DM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.DM buildPartial() {
      bilibili.app.view.v1.DM result = new bilibili.app.view.v1.DM(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.DM result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.closed_ = closed_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.realName_ = realName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.count_ = count_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.DM) {
        return mergeFrom((bilibili.app.view.v1.DM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.DM other) {
      if (other == bilibili.app.view.v1.DM.getDefaultInstance()) return this;
      if (other.getClosed() != false) {
        setClosed(other.getClosed());
      }
      if (other.getRealName() != false) {
        setRealName(other.getRealName());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
              closed_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              realName_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              count_ = input.readInt64();
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

    private boolean closed_ ;
    /**
     * <pre>
     * 分P是否关闭弹幕
     * 0:正常 1:关闭
     * </pre>
     *
     * <code>bool closed = 1;</code>
     * @return The closed.
     */
    @java.lang.Override
    public boolean getClosed() {
      return closed_;
    }
    /**
     * <pre>
     * 分P是否关闭弹幕
     * 0:正常 1:关闭
     * </pre>
     *
     * <code>bool closed = 1;</code>
     * @param value The closed to set.
     * @return This builder for chaining.
     */
    public Builder setClosed(boolean value) {

      closed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分P是否关闭弹幕
     * 0:正常 1:关闭
     * </pre>
     *
     * <code>bool closed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClosed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      closed_ = false;
      onChanged();
      return this;
    }

    private boolean realName_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool real_name = 2;</code>
     * @return The realName.
     */
    @java.lang.Override
    public boolean getRealName() {
      return realName_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool real_name = 2;</code>
     * @param value The realName to set.
     * @return This builder for chaining.
     */
    public Builder setRealName(boolean value) {

      realName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool real_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRealName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      realName_ = false;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * 分P弹幕总数
     * </pre>
     *
     * <code>int64 count = 3;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * 分P弹幕总数
     * </pre>
     *
     * <code>int64 count = 3;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 分P弹幕总数
     * </pre>
     *
     * <code>int64 count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.DM)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.DM)
  private static final bilibili.app.view.v1.DM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.DM();
  }

  public static bilibili.app.view.v1.DM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DM>
      PARSER = new com.google.protobuf.AbstractParser<DM>() {
    @java.lang.Override
    public DM parsePartialFrom(
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

  public static com.google.protobuf.Parser<DM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.DM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

