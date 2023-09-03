// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.LiveTimeline}
 */
public final class LiveTimeline extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.LiveTimeline)
    LiveTimelineOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LiveTimeline.newBuilder() to construct.
  private LiveTimeline(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LiveTimeline() {
    name_ = "";
    cover_ = "";
    subtitle_ = "";
    h5Cover_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LiveTimeline();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_LiveTimeline_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_LiveTimeline_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.LiveTimeline.class, bilibili.web.interfaces.v1.LiveTimeline.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private long startTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 start_time = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public long getStartTime() {
    return startTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 3;
  private long endTime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 end_time = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public long getEndTime() {
    return endTime_;
  }

  public static final int COVER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cover_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The cover.
   */
  @java.lang.Override
  public java.lang.String getCover() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cover_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The bytes for cover.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoverBytes() {
    java.lang.Object ref = cover_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cover_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBTITLE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subtitle_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle = 5;</code>
   * @return The subtitle.
   */
  @java.lang.Override
  public java.lang.String getSubtitle() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subtitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle = 5;</code>
   * @return The bytes for subtitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubtitleBytes() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subtitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int H5_COVER_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object h5Cover_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string h5_cover = 6;</code>
   * @return The h5Cover.
   */
  @java.lang.Override
  public java.lang.String getH5Cover() {
    java.lang.Object ref = h5Cover_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      h5Cover_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string h5_cover = 6;</code>
   * @return The bytes for h5Cover.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getH5CoverBytes() {
    java.lang.Object ref = h5Cover_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      h5Cover_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (startTime_ != 0L) {
      output.writeInt64(2, startTime_);
    }
    if (endTime_ != 0L) {
      output.writeInt64(3, endTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cover_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, subtitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(h5Cover_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, h5Cover_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startTime_);
    }
    if (endTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, endTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cover_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cover_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, subtitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(h5Cover_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, h5Cover_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.LiveTimeline)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.LiveTimeline other = (bilibili.web.interfaces.v1.LiveTimeline) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getStartTime()
        != other.getStartTime()) return false;
    if (getEndTime()
        != other.getEndTime()) return false;
    if (!getCover()
        .equals(other.getCover())) return false;
    if (!getSubtitle()
        .equals(other.getSubtitle())) return false;
    if (!getH5Cover()
        .equals(other.getH5Cover())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTime());
    hash = (37 * hash) + COVER_FIELD_NUMBER;
    hash = (53 * hash) + getCover().hashCode();
    hash = (37 * hash) + SUBTITLE_FIELD_NUMBER;
    hash = (53 * hash) + getSubtitle().hashCode();
    hash = (37 * hash) + H5_COVER_FIELD_NUMBER;
    hash = (53 * hash) + getH5Cover().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.LiveTimeline parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.LiveTimeline prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.LiveTimeline}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.LiveTimeline)
      bilibili.web.interfaces.v1.LiveTimelineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_LiveTimeline_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_LiveTimeline_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.LiveTimeline.class, bilibili.web.interfaces.v1.LiveTimeline.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.LiveTimeline.newBuilder()
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
      name_ = "";
      startTime_ = 0L;
      endTime_ = 0L;
      cover_ = "";
      subtitle_ = "";
      h5Cover_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_LiveTimeline_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.LiveTimeline getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.LiveTimeline.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.LiveTimeline build() {
      bilibili.web.interfaces.v1.LiveTimeline result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.LiveTimeline buildPartial() {
      bilibili.web.interfaces.v1.LiveTimeline result = new bilibili.web.interfaces.v1.LiveTimeline(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.LiveTimeline result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endTime_ = endTime_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.cover_ = cover_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.subtitle_ = subtitle_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.h5Cover_ = h5Cover_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.LiveTimeline) {
        return mergeFrom((bilibili.web.interfaces.v1.LiveTimeline)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.LiveTimeline other) {
      if (other == bilibili.web.interfaces.v1.LiveTimeline.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getEndTime() != 0L) {
        setEndTime(other.getEndTime());
      }
      if (!other.getCover().isEmpty()) {
        cover_ = other.cover_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSubtitle().isEmpty()) {
        subtitle_ = other.subtitle_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getH5Cover().isEmpty()) {
        h5Cover_ = other.h5Cover_;
        bitField0_ |= 0x00000020;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              startTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              endTime_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              cover_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              subtitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              h5Cover_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long startTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 start_time = 2;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 start_time = 2;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(long value) {

      startTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 start_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long endTime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 end_time = 3;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 end_time = 3;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(long value) {

      endTime_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 end_time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object cover_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 4;</code>
     * @return The cover.
     */
    public java.lang.String getCover() {
      java.lang.Object ref = cover_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cover_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 4;</code>
     * @return The bytes for cover.
     */
    public com.google.protobuf.ByteString
        getCoverBytes() {
      java.lang.Object ref = cover_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cover_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 4;</code>
     * @param value The cover to set.
     * @return This builder for chaining.
     */
    public Builder setCover(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cover_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCover() {
      cover_ = getDefaultInstance().getCover();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string cover = 4;</code>
     * @param value The bytes for cover to set.
     * @return This builder for chaining.
     */
    public Builder setCoverBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cover_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object subtitle_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string subtitle = 5;</code>
     * @return The subtitle.
     */
    public java.lang.String getSubtitle() {
      java.lang.Object ref = subtitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subtitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string subtitle = 5;</code>
     * @return The bytes for subtitle.
     */
    public com.google.protobuf.ByteString
        getSubtitleBytes() {
      java.lang.Object ref = subtitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subtitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string subtitle = 5;</code>
     * @param value The subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subtitle_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string subtitle = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubtitle() {
      subtitle_ = getDefaultInstance().getSubtitle();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string subtitle = 5;</code>
     * @param value The bytes for subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subtitle_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object h5Cover_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string h5_cover = 6;</code>
     * @return The h5Cover.
     */
    public java.lang.String getH5Cover() {
      java.lang.Object ref = h5Cover_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        h5Cover_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string h5_cover = 6;</code>
     * @return The bytes for h5Cover.
     */
    public com.google.protobuf.ByteString
        getH5CoverBytes() {
      java.lang.Object ref = h5Cover_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        h5Cover_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string h5_cover = 6;</code>
     * @param value The h5Cover to set.
     * @return This builder for chaining.
     */
    public Builder setH5Cover(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      h5Cover_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string h5_cover = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearH5Cover() {
      h5Cover_ = getDefaultInstance().getH5Cover();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string h5_cover = 6;</code>
     * @param value The bytes for h5Cover to set.
     * @return This builder for chaining.
     */
    public Builder setH5CoverBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      h5Cover_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.LiveTimeline)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.LiveTimeline)
  private static final bilibili.web.interfaces.v1.LiveTimeline DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.LiveTimeline();
  }

  public static bilibili.web.interfaces.v1.LiveTimeline getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LiveTimeline>
      PARSER = new com.google.protobuf.AbstractParser<LiveTimeline>() {
    @java.lang.Override
    public LiveTimeline parsePartialFrom(
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

  public static com.google.protobuf.Parser<LiveTimeline> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LiveTimeline> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.LiveTimeline getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
