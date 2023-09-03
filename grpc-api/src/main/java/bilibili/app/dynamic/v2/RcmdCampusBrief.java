// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.RcmdCampusBrief}
 */
public final class RcmdCampusBrief extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.RcmdCampusBrief)
    RcmdCampusBriefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RcmdCampusBrief.newBuilder() to construct.
  private RcmdCampusBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RcmdCampusBrief() {
    campusName_ = "";
    campusBadge_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RcmdCampusBrief();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_RcmdCampusBrief_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_RcmdCampusBrief_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.RcmdCampusBrief.class, bilibili.app.dynamic.v2.RcmdCampusBrief.Builder.class);
  }

  public static final int CAMPUS_ID_FIELD_NUMBER = 1;
  private long campusId_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 campus_id = 1;</code>
   * @return The campusId.
   */
  @java.lang.Override
  public long getCampusId() {
    return campusId_;
  }

  public static final int CAMPUS_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object campusName_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string campus_name = 2;</code>
   * @return The campusName.
   */
  @java.lang.Override
  public java.lang.String getCampusName() {
    java.lang.Object ref = campusName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campusName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string campus_name = 2;</code>
   * @return The bytes for campusName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampusNameBytes() {
    java.lang.Object ref = campusName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campusName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPUS_BADGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object campusBadge_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string campus_badge = 4;</code>
   * @return The campusBadge.
   */
  @java.lang.Override
  public java.lang.String getCampusBadge() {
    java.lang.Object ref = campusBadge_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campusBadge_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string campus_badge = 4;</code>
   * @return The bytes for campusBadge.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampusBadgeBytes() {
    java.lang.Object ref = campusBadge_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campusBadge_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
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
    if (campusId_ != 0L) {
      output.writeInt64(1, campusId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campusName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, campusName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campusBadge_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, campusBadge_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, url_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campusId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, campusId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campusName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, campusName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campusBadge_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, campusBadge_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, url_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.RcmdCampusBrief)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.RcmdCampusBrief other = (bilibili.app.dynamic.v2.RcmdCampusBrief) obj;

    if (getCampusId()
        != other.getCampusId()) return false;
    if (!getCampusName()
        .equals(other.getCampusName())) return false;
    if (!getCampusBadge()
        .equals(other.getCampusBadge())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
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
    hash = (37 * hash) + CAMPUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampusId());
    hash = (37 * hash) + CAMPUS_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCampusName().hashCode();
    hash = (37 * hash) + CAMPUS_BADGE_FIELD_NUMBER;
    hash = (53 * hash) + getCampusBadge().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.RcmdCampusBrief parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.RcmdCampusBrief prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.RcmdCampusBrief}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.RcmdCampusBrief)
      bilibili.app.dynamic.v2.RcmdCampusBriefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_RcmdCampusBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_RcmdCampusBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.RcmdCampusBrief.class, bilibili.app.dynamic.v2.RcmdCampusBrief.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.RcmdCampusBrief.newBuilder()
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
      campusId_ = 0L;
      campusName_ = "";
      campusBadge_ = "";
      url_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_RcmdCampusBrief_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.RcmdCampusBrief getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.RcmdCampusBrief.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.RcmdCampusBrief build() {
      bilibili.app.dynamic.v2.RcmdCampusBrief result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.RcmdCampusBrief buildPartial() {
      bilibili.app.dynamic.v2.RcmdCampusBrief result = new bilibili.app.dynamic.v2.RcmdCampusBrief(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.RcmdCampusBrief result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campusId_ = campusId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campusName_ = campusName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.campusBadge_ = campusBadge_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.url_ = url_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.RcmdCampusBrief) {
        return mergeFrom((bilibili.app.dynamic.v2.RcmdCampusBrief)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.RcmdCampusBrief other) {
      if (other == bilibili.app.dynamic.v2.RcmdCampusBrief.getDefaultInstance()) return this;
      if (other.getCampusId() != 0L) {
        setCampusId(other.getCampusId());
      }
      if (!other.getCampusName().isEmpty()) {
        campusName_ = other.campusName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCampusBadge().isEmpty()) {
        campusBadge_ = other.campusBadge_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000008;
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
              campusId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              campusName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              campusBadge_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 42: {
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private long campusId_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @return The campusId.
     */
    @java.lang.Override
    public long getCampusId() {
      return campusId_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @param value The campusId to set.
     * @return This builder for chaining.
     */
    public Builder setCampusId(long value) {

      campusId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 campus_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campusId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object campusName_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_name = 2;</code>
     * @return The campusName.
     */
    public java.lang.String getCampusName() {
      java.lang.Object ref = campusName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campusName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_name = 2;</code>
     * @return The bytes for campusName.
     */
    public com.google.protobuf.ByteString
        getCampusNameBytes() {
      java.lang.Object ref = campusName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campusName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_name = 2;</code>
     * @param value The campusName to set.
     * @return This builder for chaining.
     */
    public Builder setCampusName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      campusName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusName() {
      campusName_ = getDefaultInstance().getCampusName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_name = 2;</code>
     * @param value The bytes for campusName to set.
     * @return This builder for chaining.
     */
    public Builder setCampusNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      campusName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object campusBadge_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_badge = 4;</code>
     * @return The campusBadge.
     */
    public java.lang.String getCampusBadge() {
      java.lang.Object ref = campusBadge_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campusBadge_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_badge = 4;</code>
     * @return The bytes for campusBadge.
     */
    public com.google.protobuf.ByteString
        getCampusBadgeBytes() {
      java.lang.Object ref = campusBadge_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campusBadge_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_badge = 4;</code>
     * @param value The campusBadge to set.
     * @return This builder for chaining.
     */
    public Builder setCampusBadge(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      campusBadge_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_badge = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampusBadge() {
      campusBadge_ = getDefaultInstance().getCampusBadge();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string campus_badge = 4;</code>
     * @param value The bytes for campusBadge to set.
     * @return This builder for chaining.
     */
    public Builder setCampusBadgeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      campusBadge_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string url = 5;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string url = 5;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.RcmdCampusBrief)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.RcmdCampusBrief)
  private static final bilibili.app.dynamic.v2.RcmdCampusBrief DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.RcmdCampusBrief();
  }

  public static bilibili.app.dynamic.v2.RcmdCampusBrief getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RcmdCampusBrief>
      PARSER = new com.google.protobuf.AbstractParser<RcmdCampusBrief>() {
    @java.lang.Override
    public RcmdCampusBrief parsePartialFrom(
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

  public static com.google.protobuf.Parser<RcmdCampusBrief> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RcmdCampusBrief> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.RcmdCampusBrief getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

