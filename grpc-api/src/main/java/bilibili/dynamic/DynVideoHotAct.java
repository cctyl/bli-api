// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.DynVideoHotAct}
 */
public final class DynVideoHotAct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.DynVideoHotAct)
    DynVideoHotActOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynVideoHotAct.newBuilder() to construct.
  private DynVideoHotAct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynVideoHotAct() {
    pic_ = "";
    title_ = "";
    link_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynVideoHotAct();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynVideoHotAct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynVideoHotAct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.DynVideoHotAct.class, bilibili.dynamic.DynVideoHotAct.Builder.class);
  }

  public static final int ACT_ID_FIELD_NUMBER = 1;
  private long actId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 act_id = 1;</code>
   * @return The actId.
   */
  @java.lang.Override
  public long getActId() {
    return actId_;
  }

  public static final int ETIME_FIELD_NUMBER = 2;
  private long etime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 etime = 2;</code>
   * @return The etime.
   */
  @java.lang.Override
  public long getEtime() {
    return etime_;
  }

  public static final int ID_FIELD_NUMBER = 3;
  private long id_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int PIC_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pic_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string pic = 4;</code>
   * @return The pic.
   */
  @java.lang.Override
  public java.lang.String getPic() {
    java.lang.Object ref = pic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string pic = 4;</code>
   * @return The bytes for pic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPicBytes() {
    java.lang.Object ref = pic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STIME_FIELD_NUMBER = 5;
  private long stime_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 stime = 5;</code>
   * @return The stime.
   */
  @java.lang.Override
  public long getStime() {
    return stime_;
  }

  public static final int TITLE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINK_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object link_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string link = 7;</code>
   * @return The link.
   */
  @java.lang.Override
  public java.lang.String getLink() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      link_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string link = 7;</code>
   * @return The bytes for link.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkBytes() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      link_ = b;
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
    if (actId_ != 0L) {
      output.writeInt64(1, actId_);
    }
    if (etime_ != 0L) {
      output.writeInt64(2, etime_);
    }
    if (id_ != 0L) {
      output.writeInt64(3, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pic_);
    }
    if (stime_ != 0L) {
      output.writeInt64(5, stime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, link_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (actId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, actId_);
    }
    if (etime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, etime_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pic_);
    }
    if (stime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, stime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, link_);
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
    if (!(obj instanceof bilibili.dynamic.DynVideoHotAct)) {
      return super.equals(obj);
    }
    bilibili.dynamic.DynVideoHotAct other = (bilibili.dynamic.DynVideoHotAct) obj;

    if (getActId()
        != other.getActId()) return false;
    if (getEtime()
        != other.getEtime()) return false;
    if (getId()
        != other.getId()) return false;
    if (!getPic()
        .equals(other.getPic())) return false;
    if (getStime()
        != other.getStime()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getLink()
        .equals(other.getLink())) return false;
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
    hash = (37 * hash) + ACT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActId());
    hash = (37 * hash) + ETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEtime());
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + PIC_FIELD_NUMBER;
    hash = (53 * hash) + getPic().hashCode();
    hash = (37 * hash) + STIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStime());
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + LINK_FIELD_NUMBER;
    hash = (53 * hash) + getLink().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.DynVideoHotAct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynVideoHotAct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.DynVideoHotAct parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.DynVideoHotAct prototype) {
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
   * Protobuf type {@code bilibili.dynamic.DynVideoHotAct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.DynVideoHotAct)
      bilibili.dynamic.DynVideoHotActOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynVideoHotAct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynVideoHotAct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.DynVideoHotAct.class, bilibili.dynamic.DynVideoHotAct.Builder.class);
    }

    // Construct using bilibili.dynamic.DynVideoHotAct.newBuilder()
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
      actId_ = 0L;
      etime_ = 0L;
      id_ = 0L;
      pic_ = "";
      stime_ = 0L;
      title_ = "";
      link_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_DynVideoHotAct_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.DynVideoHotAct getDefaultInstanceForType() {
      return bilibili.dynamic.DynVideoHotAct.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.DynVideoHotAct build() {
      bilibili.dynamic.DynVideoHotAct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.DynVideoHotAct buildPartial() {
      bilibili.dynamic.DynVideoHotAct result = new bilibili.dynamic.DynVideoHotAct(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.DynVideoHotAct result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.actId_ = actId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.etime_ = etime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pic_ = pic_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.stime_ = stime_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.link_ = link_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.DynVideoHotAct) {
        return mergeFrom((bilibili.dynamic.DynVideoHotAct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.DynVideoHotAct other) {
      if (other == bilibili.dynamic.DynVideoHotAct.getDefaultInstance()) return this;
      if (other.getActId() != 0L) {
        setActId(other.getActId());
      }
      if (other.getEtime() != 0L) {
        setEtime(other.getEtime());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getPic().isEmpty()) {
        pic_ = other.pic_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getStime() != 0L) {
        setStime(other.getStime());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (!other.getLink().isEmpty()) {
        link_ = other.link_;
        bitField0_ |= 0x00000040;
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
            case 8: {
              actId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              etime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              pic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              stime_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              link_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private long actId_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 act_id = 1;</code>
     * @return The actId.
     */
    @java.lang.Override
    public long getActId() {
      return actId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 act_id = 1;</code>
     * @param value The actId to set.
     * @return This builder for chaining.
     */
    public Builder setActId(long value) {

      actId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 act_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      actId_ = 0L;
      onChanged();
      return this;
    }

    private long etime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 etime = 2;</code>
     * @return The etime.
     */
    @java.lang.Override
    public long getEtime() {
      return etime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 etime = 2;</code>
     * @param value The etime to set.
     * @return This builder for chaining.
     */
    public Builder setEtime(long value) {

      etime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 etime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEtime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      etime_ = 0L;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object pic_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string pic = 4;</code>
     * @return The pic.
     */
    public java.lang.String getPic() {
      java.lang.Object ref = pic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pic = 4;</code>
     * @return The bytes for pic.
     */
    public com.google.protobuf.ByteString
        getPicBytes() {
      java.lang.Object ref = pic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pic = 4;</code>
     * @param value The pic to set.
     * @return This builder for chaining.
     */
    public Builder setPic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pic_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pic = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPic() {
      pic_ = getDefaultInstance().getPic();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pic = 4;</code>
     * @param value The bytes for pic to set.
     * @return This builder for chaining.
     */
    public Builder setPicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pic_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long stime_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 stime = 5;</code>
     * @return The stime.
     */
    @java.lang.Override
    public long getStime() {
      return stime_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 stime = 5;</code>
     * @param value The stime to set.
     * @return This builder for chaining.
     */
    public Builder setStime(long value) {

      stime_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 stime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStime() {
      bitField0_ = (bitField0_ & ~0x00000010);
      stime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 6;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 6;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 6;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string title = 6;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object link_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string link = 7;</code>
     * @return The link.
     */
    public java.lang.String getLink() {
      java.lang.Object ref = link_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        link_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string link = 7;</code>
     * @return The bytes for link.
     */
    public com.google.protobuf.ByteString
        getLinkBytes() {
      java.lang.Object ref = link_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        link_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string link = 7;</code>
     * @param value The link to set.
     * @return This builder for chaining.
     */
    public Builder setLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      link_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string link = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLink() {
      link_ = getDefaultInstance().getLink();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string link = 7;</code>
     * @param value The bytes for link to set.
     * @return This builder for chaining.
     */
    public Builder setLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      link_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.DynVideoHotAct)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.DynVideoHotAct)
  private static final bilibili.dynamic.DynVideoHotAct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.DynVideoHotAct();
  }

  public static bilibili.dynamic.DynVideoHotAct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynVideoHotAct>
      PARSER = new com.google.protobuf.AbstractParser<DynVideoHotAct>() {
    @java.lang.Override
    public DynVideoHotAct parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynVideoHotAct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynVideoHotAct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.DynVideoHotAct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

