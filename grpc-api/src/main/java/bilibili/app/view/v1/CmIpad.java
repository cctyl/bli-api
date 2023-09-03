// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.CmIpad}
 */
public final class CmIpad extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.CmIpad)
    CmIpadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CmIpad.newBuilder() to construct.
  private CmIpad(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CmIpad() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CmIpad();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CmIpad_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CmIpad_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.CmIpad.class, bilibili.app.view.v1.CmIpad.Builder.class);
  }

  public static final int CM_FIELD_NUMBER = 1;
  private bilibili.app.view.v1.CM cm_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   * @return Whether the cm field is set.
   */
  @java.lang.Override
  public boolean hasCm() {
    return cm_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   * @return The cm.
   */
  @java.lang.Override
  public bilibili.app.view.v1.CM getCm() {
    return cm_ == null ? bilibili.app.view.v1.CM.getDefaultInstance() : cm_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.CMOrBuilder getCmOrBuilder() {
    return cm_ == null ? bilibili.app.view.v1.CM.getDefaultInstance() : cm_;
  }

  public static final int AUTHOR_FIELD_NUMBER = 2;
  private bilibili.app.archive.v1.Author author_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   * @return Whether the author field is set.
   */
  @java.lang.Override
  public boolean hasAuthor() {
    return author_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   * @return The author.
   */
  @java.lang.Override
  public bilibili.app.archive.v1.Author getAuthor() {
    return author_ == null ? bilibili.app.archive.v1.Author.getDefaultInstance() : author_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.v1.AuthorOrBuilder getAuthorOrBuilder() {
    return author_ == null ? bilibili.app.archive.v1.Author.getDefaultInstance() : author_;
  }

  public static final int STAT_FIELD_NUMBER = 3;
  private bilibili.app.archive.v1.Stat stat_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   * @return Whether the stat field is set.
   */
  @java.lang.Override
  public boolean hasStat() {
    return stat_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   * @return The stat.
   */
  @java.lang.Override
  public bilibili.app.archive.v1.Stat getStat() {
    return stat_ == null ? bilibili.app.archive.v1.Stat.getDefaultInstance() : stat_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.archive.v1.StatOrBuilder getStatOrBuilder() {
    return stat_ == null ? bilibili.app.archive.v1.Stat.getDefaultInstance() : stat_;
  }

  public static final int DURATION_FIELD_NUMBER = 4;
  private long duration_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 duration = 4;</code>
   * @return The duration.
   */
  @java.lang.Override
  public long getDuration() {
    return duration_;
  }

  public static final int AID_FIELD_NUMBER = 5;
  private long aid_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 aid = 5;</code>
   * @return The aid.
   */
  @java.lang.Override
  public long getAid() {
    return aid_;
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
    if (cm_ != null) {
      output.writeMessage(1, getCm());
    }
    if (author_ != null) {
      output.writeMessage(2, getAuthor());
    }
    if (stat_ != null) {
      output.writeMessage(3, getStat());
    }
    if (duration_ != 0L) {
      output.writeInt64(4, duration_);
    }
    if (aid_ != 0L) {
      output.writeInt64(5, aid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCm());
    }
    if (author_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthor());
    }
    if (stat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStat());
    }
    if (duration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, duration_);
    }
    if (aid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, aid_);
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
    if (!(obj instanceof bilibili.app.view.v1.CmIpad)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.CmIpad other = (bilibili.app.view.v1.CmIpad) obj;

    if (hasCm() != other.hasCm()) return false;
    if (hasCm()) {
      if (!getCm()
          .equals(other.getCm())) return false;
    }
    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor()
          .equals(other.getAuthor())) return false;
    }
    if (hasStat() != other.hasStat()) return false;
    if (hasStat()) {
      if (!getStat()
          .equals(other.getStat())) return false;
    }
    if (getDuration()
        != other.getDuration()) return false;
    if (getAid()
        != other.getAid()) return false;
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
    if (hasCm()) {
      hash = (37 * hash) + CM_FIELD_NUMBER;
      hash = (53 * hash) + getCm().hashCode();
    }
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    if (hasStat()) {
      hash = (37 * hash) + STAT_FIELD_NUMBER;
      hash = (53 * hash) + getStat().hashCode();
    }
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDuration());
    hash = (37 * hash) + AID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.CmIpad parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.CmIpad parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CmIpad parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.CmIpad parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.CmIpad prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.CmIpad}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.CmIpad)
      bilibili.app.view.v1.CmIpadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CmIpad_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CmIpad_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.CmIpad.class, bilibili.app.view.v1.CmIpad.Builder.class);
    }

    // Construct using bilibili.app.view.v1.CmIpad.newBuilder()
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
      cm_ = null;
      if (cmBuilder_ != null) {
        cmBuilder_.dispose();
        cmBuilder_ = null;
      }
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      stat_ = null;
      if (statBuilder_ != null) {
        statBuilder_.dispose();
        statBuilder_ = null;
      }
      duration_ = 0L;
      aid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_CmIpad_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.CmIpad getDefaultInstanceForType() {
      return bilibili.app.view.v1.CmIpad.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.CmIpad build() {
      bilibili.app.view.v1.CmIpad result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.CmIpad buildPartial() {
      bilibili.app.view.v1.CmIpad result = new bilibili.app.view.v1.CmIpad(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.CmIpad result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cm_ = cmBuilder_ == null
            ? cm_
            : cmBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.author_ = authorBuilder_ == null
            ? author_
            : authorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.stat_ = statBuilder_ == null
            ? stat_
            : statBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.duration_ = duration_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.aid_ = aid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.CmIpad) {
        return mergeFrom((bilibili.app.view.v1.CmIpad)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.CmIpad other) {
      if (other == bilibili.app.view.v1.CmIpad.getDefaultInstance()) return this;
      if (other.hasCm()) {
        mergeCm(other.getCm());
      }
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
      }
      if (other.hasStat()) {
        mergeStat(other.getStat());
      }
      if (other.getDuration() != 0L) {
        setDuration(other.getDuration());
      }
      if (other.getAid() != 0L) {
        setAid(other.getAid());
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
                  getCmFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAuthorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getStatFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              duration_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              aid_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private bilibili.app.view.v1.CM cm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.CM, bilibili.app.view.v1.CM.Builder, bilibili.app.view.v1.CMOrBuilder> cmBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     * @return Whether the cm field is set.
     */
    public boolean hasCm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     * @return The cm.
     */
    public bilibili.app.view.v1.CM getCm() {
      if (cmBuilder_ == null) {
        return cm_ == null ? bilibili.app.view.v1.CM.getDefaultInstance() : cm_;
      } else {
        return cmBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public Builder setCm(bilibili.app.view.v1.CM value) {
      if (cmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cm_ = value;
      } else {
        cmBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public Builder setCm(
        bilibili.app.view.v1.CM.Builder builderForValue) {
      if (cmBuilder_ == null) {
        cm_ = builderForValue.build();
      } else {
        cmBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public Builder mergeCm(bilibili.app.view.v1.CM value) {
      if (cmBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cm_ != null &&
          cm_ != bilibili.app.view.v1.CM.getDefaultInstance()) {
          getCmBuilder().mergeFrom(value);
        } else {
          cm_ = value;
        }
      } else {
        cmBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public Builder clearCm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cm_ = null;
      if (cmBuilder_ != null) {
        cmBuilder_.dispose();
        cmBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public bilibili.app.view.v1.CM.Builder getCmBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCmFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    public bilibili.app.view.v1.CMOrBuilder getCmOrBuilder() {
      if (cmBuilder_ != null) {
        return cmBuilder_.getMessageOrBuilder();
      } else {
        return cm_ == null ?
            bilibili.app.view.v1.CM.getDefaultInstance() : cm_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.CM cm = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.CM, bilibili.app.view.v1.CM.Builder, bilibili.app.view.v1.CMOrBuilder> 
        getCmFieldBuilder() {
      if (cmBuilder_ == null) {
        cmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.CM, bilibili.app.view.v1.CM.Builder, bilibili.app.view.v1.CMOrBuilder>(
                getCm(),
                getParentForChildren(),
                isClean());
        cm_ = null;
      }
      return cmBuilder_;
    }

    private bilibili.app.archive.v1.Author author_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.v1.Author, bilibili.app.archive.v1.Author.Builder, bilibili.app.archive.v1.AuthorOrBuilder> authorBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     * @return Whether the author field is set.
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     * @return The author.
     */
    public bilibili.app.archive.v1.Author getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null ? bilibili.app.archive.v1.Author.getDefaultInstance() : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public Builder setAuthor(bilibili.app.archive.v1.Author value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
      } else {
        authorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public Builder setAuthor(
        bilibili.app.archive.v1.Author.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public Builder mergeAuthor(bilibili.app.archive.v1.Author value) {
      if (authorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          author_ != null &&
          author_ != bilibili.app.archive.v1.Author.getDefaultInstance()) {
          getAuthorBuilder().mergeFrom(value);
        } else {
          author_ = value;
        }
      } else {
        authorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public Builder clearAuthor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public bilibili.app.archive.v1.Author.Builder getAuthorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    public bilibili.app.archive.v1.AuthorOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null ?
            bilibili.app.archive.v1.Author.getDefaultInstance() : author_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Author author = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.v1.Author, bilibili.app.archive.v1.Author.Builder, bilibili.app.archive.v1.AuthorOrBuilder> 
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.archive.v1.Author, bilibili.app.archive.v1.Author.Builder, bilibili.app.archive.v1.AuthorOrBuilder>(
                getAuthor(),
                getParentForChildren(),
                isClean());
        author_ = null;
      }
      return authorBuilder_;
    }

    private bilibili.app.archive.v1.Stat stat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.v1.Stat, bilibili.app.archive.v1.Stat.Builder, bilibili.app.archive.v1.StatOrBuilder> statBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     * @return Whether the stat field is set.
     */
    public boolean hasStat() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     * @return The stat.
     */
    public bilibili.app.archive.v1.Stat getStat() {
      if (statBuilder_ == null) {
        return stat_ == null ? bilibili.app.archive.v1.Stat.getDefaultInstance() : stat_;
      } else {
        return statBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public Builder setStat(bilibili.app.archive.v1.Stat value) {
      if (statBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stat_ = value;
      } else {
        statBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public Builder setStat(
        bilibili.app.archive.v1.Stat.Builder builderForValue) {
      if (statBuilder_ == null) {
        stat_ = builderForValue.build();
      } else {
        statBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public Builder mergeStat(bilibili.app.archive.v1.Stat value) {
      if (statBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          stat_ != null &&
          stat_ != bilibili.app.archive.v1.Stat.getDefaultInstance()) {
          getStatBuilder().mergeFrom(value);
        } else {
          stat_ = value;
        }
      } else {
        statBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public Builder clearStat() {
      bitField0_ = (bitField0_ & ~0x00000004);
      stat_ = null;
      if (statBuilder_ != null) {
        statBuilder_.dispose();
        statBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public bilibili.app.archive.v1.Stat.Builder getStatBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStatFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    public bilibili.app.archive.v1.StatOrBuilder getStatOrBuilder() {
      if (statBuilder_ != null) {
        return statBuilder_.getMessageOrBuilder();
      } else {
        return stat_ == null ?
            bilibili.app.archive.v1.Stat.getDefaultInstance() : stat_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.archive.v1.Stat, bilibili.app.archive.v1.Stat.Builder, bilibili.app.archive.v1.StatOrBuilder> 
        getStatFieldBuilder() {
      if (statBuilder_ == null) {
        statBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.archive.v1.Stat, bilibili.app.archive.v1.Stat.Builder, bilibili.app.archive.v1.StatOrBuilder>(
                getStat(),
                getParentForChildren(),
                isClean());
        stat_ = null;
      }
      return statBuilder_;
    }

    private long duration_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 duration = 4;</code>
     * @return The duration.
     */
    @java.lang.Override
    public long getDuration() {
      return duration_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 duration = 4;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(long value) {

      duration_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 duration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000008);
      duration_ = 0L;
      onChanged();
      return this;
    }

    private long aid_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 5;</code>
     * @return The aid.
     */
    @java.lang.Override
    public long getAid() {
      return aid_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 5;</code>
     * @param value The aid to set.
     * @return This builder for chaining.
     */
    public Builder setAid(long value) {

      aid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 aid = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      aid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.CmIpad)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.CmIpad)
  private static final bilibili.app.view.v1.CmIpad DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.CmIpad();
  }

  public static bilibili.app.view.v1.CmIpad getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CmIpad>
      PARSER = new com.google.protobuf.AbstractParser<CmIpad>() {
    @java.lang.Override
    public CmIpad parsePartialFrom(
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

  public static com.google.protobuf.Parser<CmIpad> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CmIpad> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.CmIpad getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
