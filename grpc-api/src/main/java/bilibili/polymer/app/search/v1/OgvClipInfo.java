// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.OgvClipInfo}
 */
public final class OgvClipInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.OgvClipInfo)
    OgvClipInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OgvClipInfo.newBuilder() to construct.
  private OgvClipInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OgvClipInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OgvClipInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_OgvClipInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_OgvClipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.OgvClipInfo.class, bilibili.polymer.app.search.v1.OgvClipInfo.Builder.class);
  }

  public static final int PLAY_START_TIME_FIELD_NUMBER = 1;
  private long playStartTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 play_start_time = 1;</code>
   * @return The playStartTime.
   */
  @java.lang.Override
  public long getPlayStartTime() {
    return playStartTime_;
  }

  public static final int PLAY_END_TIME_FIELD_NUMBER = 2;
  private long playEndTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 play_end_time = 2;</code>
   * @return The playEndTime.
   */
  @java.lang.Override
  public long getPlayEndTime() {
    return playEndTime_;
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
    if (playStartTime_ != 0L) {
      output.writeInt64(1, playStartTime_);
    }
    if (playEndTime_ != 0L) {
      output.writeInt64(2, playEndTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playStartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, playStartTime_);
    }
    if (playEndTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, playEndTime_);
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.OgvClipInfo)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.OgvClipInfo other = (bilibili.polymer.app.search.v1.OgvClipInfo) obj;

    if (getPlayStartTime()
        != other.getPlayStartTime()) return false;
    if (getPlayEndTime()
        != other.getPlayEndTime()) return false;
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
    hash = (37 * hash) + PLAY_START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayStartTime());
    hash = (37 * hash) + PLAY_END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayEndTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.OgvClipInfo parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.OgvClipInfo prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.OgvClipInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.OgvClipInfo)
      bilibili.polymer.app.search.v1.OgvClipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_OgvClipInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_OgvClipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.OgvClipInfo.class, bilibili.polymer.app.search.v1.OgvClipInfo.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.OgvClipInfo.newBuilder()
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
      playStartTime_ = 0L;
      playEndTime_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_OgvClipInfo_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.OgvClipInfo getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.OgvClipInfo.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.OgvClipInfo build() {
      bilibili.polymer.app.search.v1.OgvClipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.OgvClipInfo buildPartial() {
      bilibili.polymer.app.search.v1.OgvClipInfo result = new bilibili.polymer.app.search.v1.OgvClipInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.OgvClipInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.playStartTime_ = playStartTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playEndTime_ = playEndTime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.OgvClipInfo) {
        return mergeFrom((bilibili.polymer.app.search.v1.OgvClipInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.OgvClipInfo other) {
      if (other == bilibili.polymer.app.search.v1.OgvClipInfo.getDefaultInstance()) return this;
      if (other.getPlayStartTime() != 0L) {
        setPlayStartTime(other.getPlayStartTime());
      }
      if (other.getPlayEndTime() != 0L) {
        setPlayEndTime(other.getPlayEndTime());
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
              playStartTime_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              playEndTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long playStartTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_start_time = 1;</code>
     * @return The playStartTime.
     */
    @java.lang.Override
    public long getPlayStartTime() {
      return playStartTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_start_time = 1;</code>
     * @param value The playStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setPlayStartTime(long value) {

      playStartTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_start_time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayStartTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      playStartTime_ = 0L;
      onChanged();
      return this;
    }

    private long playEndTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_end_time = 2;</code>
     * @return The playEndTime.
     */
    @java.lang.Override
    public long getPlayEndTime() {
      return playEndTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_end_time = 2;</code>
     * @param value The playEndTime to set.
     * @return This builder for chaining.
     */
    public Builder setPlayEndTime(long value) {

      playEndTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 play_end_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayEndTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      playEndTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.OgvClipInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.OgvClipInfo)
  private static final bilibili.polymer.app.search.v1.OgvClipInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.OgvClipInfo();
  }

  public static bilibili.polymer.app.search.v1.OgvClipInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OgvClipInfo>
      PARSER = new com.google.protobuf.AbstractParser<OgvClipInfo>() {
    @java.lang.Override
    public OgvClipInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<OgvClipInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OgvClipInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.OgvClipInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

