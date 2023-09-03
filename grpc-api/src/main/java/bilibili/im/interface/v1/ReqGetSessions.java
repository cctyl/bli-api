// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

/**
 * <pre>
 * 拉取会话记录列表-请求
 * </pre>
 *
 * Protobuf type {@code bilibili.im.interface.v1.ReqGetSessions}
 */
public final class ReqGetSessions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.im.interface.v1.ReqGetSessions)
    ReqGetSessionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqGetSessions.newBuilder() to construct.
  private ReqGetSessions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqGetSessions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqGetSessions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqGetSessions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqGetSessions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.im.interface.v1.ReqGetSessions.class, bilibili.im.interface.v1.ReqGetSessions.Builder.class);
  }

  public static final int BEGIN_TS_FIELD_NUMBER = 1;
  private long beginTs_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 begin_ts = 1;</code>
   * @return The beginTs.
   */
  @java.lang.Override
  public long getBeginTs() {
    return beginTs_;
  }

  public static final int END_TS_FIELD_NUMBER = 2;
  private long endTs_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 end_ts = 2;</code>
   * @return The endTs.
   */
  @java.lang.Override
  public long getEndTs() {
    return endTs_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int SESSION_TYPE_FIELD_NUMBER = 4;
  private int sessionType_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 session_type = 4;</code>
   * @return The sessionType.
   */
  @java.lang.Override
  public int getSessionType() {
    return sessionType_;
  }

  public static final int UNFOLLOW_FOLD_FIELD_NUMBER = 5;
  private int unfollowFold_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 unfollow_fold = 5;</code>
   * @return The unfollowFold.
   */
  @java.lang.Override
  public int getUnfollowFold() {
    return unfollowFold_;
  }

  public static final int GROUP_FOLD_FIELD_NUMBER = 6;
  private int groupFold_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 group_fold = 6;</code>
   * @return The groupFold.
   */
  @java.lang.Override
  public int getGroupFold() {
    return groupFold_;
  }

  public static final int SORT_RULE_FIELD_NUMBER = 7;
  private int sortRule_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 sort_rule = 7;</code>
   * @return The sortRule.
   */
  @java.lang.Override
  public int getSortRule() {
    return sortRule_;
  }

  public static final int TEENAGER_MODE_FIELD_NUMBER = 8;
  private int teenagerMode_ = 0;
  /**
   * <pre>
   * 青少年模式
   * </pre>
   *
   * <code>uint32 teenager_mode = 8;</code>
   * @return The teenagerMode.
   */
  @java.lang.Override
  public int getTeenagerMode() {
    return teenagerMode_;
  }

  public static final int LESSONS_MODE_FIELD_NUMBER = 9;
  private int lessonsMode_ = 0;
  /**
   * <pre>
   * 课堂模式
   * </pre>
   *
   * <code>uint32 lessons_mode = 9;</code>
   * @return The lessonsMode.
   */
  @java.lang.Override
  public int getLessonsMode() {
    return lessonsMode_;
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
    if (beginTs_ != 0L) {
      output.writeUInt64(1, beginTs_);
    }
    if (endTs_ != 0L) {
      output.writeUInt64(2, endTs_);
    }
    if (size_ != 0) {
      output.writeUInt32(3, size_);
    }
    if (sessionType_ != 0) {
      output.writeUInt32(4, sessionType_);
    }
    if (unfollowFold_ != 0) {
      output.writeUInt32(5, unfollowFold_);
    }
    if (groupFold_ != 0) {
      output.writeUInt32(6, groupFold_);
    }
    if (sortRule_ != 0) {
      output.writeUInt32(7, sortRule_);
    }
    if (teenagerMode_ != 0) {
      output.writeUInt32(8, teenagerMode_);
    }
    if (lessonsMode_ != 0) {
      output.writeUInt32(9, lessonsMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (beginTs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, beginTs_);
    }
    if (endTs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, endTs_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, size_);
    }
    if (sessionType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, sessionType_);
    }
    if (unfollowFold_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, unfollowFold_);
    }
    if (groupFold_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, groupFold_);
    }
    if (sortRule_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, sortRule_);
    }
    if (teenagerMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, teenagerMode_);
    }
    if (lessonsMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, lessonsMode_);
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
    if (!(obj instanceof bilibili.im.interface.v1.ReqGetSessions)) {
      return super.equals(obj);
    }
    bilibili.im.interface.v1.ReqGetSessions other = (bilibili.im.interface.v1.ReqGetSessions) obj;

    if (getBeginTs()
        != other.getBeginTs()) return false;
    if (getEndTs()
        != other.getEndTs()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getSessionType()
        != other.getSessionType()) return false;
    if (getUnfollowFold()
        != other.getUnfollowFold()) return false;
    if (getGroupFold()
        != other.getGroupFold()) return false;
    if (getSortRule()
        != other.getSortRule()) return false;
    if (getTeenagerMode()
        != other.getTeenagerMode()) return false;
    if (getLessonsMode()
        != other.getLessonsMode()) return false;
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
    hash = (37 * hash) + BEGIN_TS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBeginTs());
    hash = (37 * hash) + END_TS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTs());
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + SESSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionType();
    hash = (37 * hash) + UNFOLLOW_FOLD_FIELD_NUMBER;
    hash = (53 * hash) + getUnfollowFold();
    hash = (37 * hash) + GROUP_FOLD_FIELD_NUMBER;
    hash = (53 * hash) + getGroupFold();
    hash = (37 * hash) + SORT_RULE_FIELD_NUMBER;
    hash = (53 * hash) + getSortRule();
    hash = (37 * hash) + TEENAGER_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getTeenagerMode();
    hash = (37 * hash) + LESSONS_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getLessonsMode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.im.interface.v1.ReqGetSessions parseFrom(
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
  public static Builder newBuilder(bilibili.im.interface.v1.ReqGetSessions prototype) {
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
   * 拉取会话记录列表-请求
   * </pre>
   *
   * Protobuf type {@code bilibili.im.interface.v1.ReqGetSessions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.im.interface.v1.ReqGetSessions)
      bilibili.im.interface.v1.ReqGetSessionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqGetSessions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqGetSessions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.im.interface.v1.ReqGetSessions.class, bilibili.im.interface.v1.ReqGetSessions.Builder.class);
    }

    // Construct using bilibili.im.interface.v1.ReqGetSessions.newBuilder()
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
      beginTs_ = 0L;
      endTs_ = 0L;
      size_ = 0;
      sessionType_ = 0;
      unfollowFold_ = 0;
      groupFold_ = 0;
      sortRule_ = 0;
      teenagerMode_ = 0;
      lessonsMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.im.interface.v1.Im.internal_static_bilibili_im_interface_v1_ReqGetSessions_descriptor;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqGetSessions getDefaultInstanceForType() {
      return bilibili.im.interface.v1.ReqGetSessions.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqGetSessions build() {
      bilibili.im.interface.v1.ReqGetSessions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.im.interface.v1.ReqGetSessions buildPartial() {
      bilibili.im.interface.v1.ReqGetSessions result = new bilibili.im.interface.v1.ReqGetSessions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.im.interface.v1.ReqGetSessions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.beginTs_ = beginTs_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endTs_ = endTs_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.size_ = size_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sessionType_ = sessionType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.unfollowFold_ = unfollowFold_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.groupFold_ = groupFold_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.sortRule_ = sortRule_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.teenagerMode_ = teenagerMode_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.lessonsMode_ = lessonsMode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.im.interface.v1.ReqGetSessions) {
        return mergeFrom((bilibili.im.interface.v1.ReqGetSessions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.im.interface.v1.ReqGetSessions other) {
      if (other == bilibili.im.interface.v1.ReqGetSessions.getDefaultInstance()) return this;
      if (other.getBeginTs() != 0L) {
        setBeginTs(other.getBeginTs());
      }
      if (other.getEndTs() != 0L) {
        setEndTs(other.getEndTs());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getSessionType() != 0) {
        setSessionType(other.getSessionType());
      }
      if (other.getUnfollowFold() != 0) {
        setUnfollowFold(other.getUnfollowFold());
      }
      if (other.getGroupFold() != 0) {
        setGroupFold(other.getGroupFold());
      }
      if (other.getSortRule() != 0) {
        setSortRule(other.getSortRule());
      }
      if (other.getTeenagerMode() != 0) {
        setTeenagerMode(other.getTeenagerMode());
      }
      if (other.getLessonsMode() != 0) {
        setLessonsMode(other.getLessonsMode());
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
              beginTs_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              endTs_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              size_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              sessionType_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              unfollowFold_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              groupFold_ = input.readUInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              sortRule_ = input.readUInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              teenagerMode_ = input.readUInt32();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
            case 72: {
              lessonsMode_ = input.readUInt32();
              bitField0_ |= 0x00000100;
              break;
            } // case 72
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

    private long beginTs_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @return The beginTs.
     */
    @java.lang.Override
    public long getBeginTs() {
      return beginTs_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @param value The beginTs to set.
     * @return This builder for chaining.
     */
    public Builder setBeginTs(long value) {

      beginTs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 begin_ts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginTs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      beginTs_ = 0L;
      onChanged();
      return this;
    }

    private long endTs_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_ts = 2;</code>
     * @return The endTs.
     */
    @java.lang.Override
    public long getEndTs() {
      return endTs_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_ts = 2;</code>
     * @param value The endTs to set.
     * @return This builder for chaining.
     */
    public Builder setEndTs(long value) {

      endTs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint64 end_ts = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endTs_ = 0L;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {

      size_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      size_ = 0;
      onChanged();
      return this;
    }

    private int sessionType_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 4;</code>
     * @return The sessionType.
     */
    @java.lang.Override
    public int getSessionType() {
      return sessionType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 4;</code>
     * @param value The sessionType to set.
     * @return This builder for chaining.
     */
    public Builder setSessionType(int value) {

      sessionType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 session_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sessionType_ = 0;
      onChanged();
      return this;
    }

    private int unfollowFold_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 unfollow_fold = 5;</code>
     * @return The unfollowFold.
     */
    @java.lang.Override
    public int getUnfollowFold() {
      return unfollowFold_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 unfollow_fold = 5;</code>
     * @param value The unfollowFold to set.
     * @return This builder for chaining.
     */
    public Builder setUnfollowFold(int value) {

      unfollowFold_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 unfollow_fold = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnfollowFold() {
      bitField0_ = (bitField0_ & ~0x00000010);
      unfollowFold_ = 0;
      onChanged();
      return this;
    }

    private int groupFold_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 group_fold = 6;</code>
     * @return The groupFold.
     */
    @java.lang.Override
    public int getGroupFold() {
      return groupFold_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 group_fold = 6;</code>
     * @param value The groupFold to set.
     * @return This builder for chaining.
     */
    public Builder setGroupFold(int value) {

      groupFold_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 group_fold = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupFold() {
      bitField0_ = (bitField0_ & ~0x00000020);
      groupFold_ = 0;
      onChanged();
      return this;
    }

    private int sortRule_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 sort_rule = 7;</code>
     * @return The sortRule.
     */
    @java.lang.Override
    public int getSortRule() {
      return sortRule_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 sort_rule = 7;</code>
     * @param value The sortRule to set.
     * @return This builder for chaining.
     */
    public Builder setSortRule(int value) {

      sortRule_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>uint32 sort_rule = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearSortRule() {
      bitField0_ = (bitField0_ & ~0x00000040);
      sortRule_ = 0;
      onChanged();
      return this;
    }

    private int teenagerMode_ ;
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>uint32 teenager_mode = 8;</code>
     * @return The teenagerMode.
     */
    @java.lang.Override
    public int getTeenagerMode() {
      return teenagerMode_;
    }
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>uint32 teenager_mode = 8;</code>
     * @param value The teenagerMode to set.
     * @return This builder for chaining.
     */
    public Builder setTeenagerMode(int value) {

      teenagerMode_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 青少年模式
     * </pre>
     *
     * <code>uint32 teenager_mode = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeenagerMode() {
      bitField0_ = (bitField0_ & ~0x00000080);
      teenagerMode_ = 0;
      onChanged();
      return this;
    }

    private int lessonsMode_ ;
    /**
     * <pre>
     * 课堂模式
     * </pre>
     *
     * <code>uint32 lessons_mode = 9;</code>
     * @return The lessonsMode.
     */
    @java.lang.Override
    public int getLessonsMode() {
      return lessonsMode_;
    }
    /**
     * <pre>
     * 课堂模式
     * </pre>
     *
     * <code>uint32 lessons_mode = 9;</code>
     * @param value The lessonsMode to set.
     * @return This builder for chaining.
     */
    public Builder setLessonsMode(int value) {

      lessonsMode_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 课堂模式
     * </pre>
     *
     * <code>uint32 lessons_mode = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearLessonsMode() {
      bitField0_ = (bitField0_ & ~0x00000100);
      lessonsMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.im.interface.v1.ReqGetSessions)
  }

  // @@protoc_insertion_point(class_scope:bilibili.im.interface.v1.ReqGetSessions)
  private static final bilibili.im.interface.v1.ReqGetSessions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.im.interface.v1.ReqGetSessions();
  }

  public static bilibili.im.interface.v1.ReqGetSessions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqGetSessions>
      PARSER = new com.google.protobuf.AbstractParser<ReqGetSessions>() {
    @java.lang.Override
    public ReqGetSessions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReqGetSessions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqGetSessions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.im.interface.v1.ReqGetSessions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

