// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.CampusMngQuiz}
 */
public final class CampusMngQuiz extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.CampusMngQuiz)
    CampusMngQuizOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampusMngQuiz.newBuilder() to construct.
  private CampusMngQuiz(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampusMngQuiz() {
    title_ = "";
    addLabel_ = "";
    submitLabel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampusMngQuiz();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusMngQuiz_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusMngQuiz_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.CampusMngQuiz.class, bilibili.app.dynamic.v2.CampusMngQuiz.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 1;</code>
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
   * 
   * </pre>
   *
   * <code>string title = 1;</code>
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

  public static final int MORE_LABEL_FIELD_NUMBER = 2;
  private bilibili.app.dynamic.v2.CampusLabel moreLabel_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
   * @return Whether the moreLabel field is set.
   */
  @java.lang.Override
  public boolean hasMoreLabel() {
    return moreLabel_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
   * @return The moreLabel.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusLabel getMoreLabel() {
    return moreLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : moreLabel_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusLabelOrBuilder getMoreLabelOrBuilder() {
    return moreLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : moreLabel_;
  }

  public static final int ADD_LABEL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object addLabel_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string add_label = 3;</code>
   * @return The addLabel.
   */
  @java.lang.Override
  public java.lang.String getAddLabel() {
    java.lang.Object ref = addLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addLabel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string add_label = 3;</code>
   * @return The bytes for addLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddLabelBytes() {
    java.lang.Object ref = addLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBMIT_LABEL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object submitLabel_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string submit_label = 4;</code>
   * @return The submitLabel.
   */
  @java.lang.Override
  public java.lang.String getSubmitLabel() {
    java.lang.Object ref = submitLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submitLabel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string submit_label = 4;</code>
   * @return The bytes for submitLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubmitLabelBytes() {
    java.lang.Object ref = submitLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submitLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUIZ_COUNT_FIELD_NUMBER = 5;
  private long quizCount_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 quiz_count = 5;</code>
   * @return The quizCount.
   */
  @java.lang.Override
  public long getQuizCount() {
    return quizCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (moreLabel_ != null) {
      output.writeMessage(2, getMoreLabel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(addLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, addLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(submitLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, submitLabel_);
    }
    if (quizCount_ != 0L) {
      output.writeInt64(5, quizCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (moreLabel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMoreLabel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(addLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, addLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(submitLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, submitLabel_);
    }
    if (quizCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, quizCount_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.CampusMngQuiz)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.CampusMngQuiz other = (bilibili.app.dynamic.v2.CampusMngQuiz) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (hasMoreLabel() != other.hasMoreLabel()) return false;
    if (hasMoreLabel()) {
      if (!getMoreLabel()
          .equals(other.getMoreLabel())) return false;
    }
    if (!getAddLabel()
        .equals(other.getAddLabel())) return false;
    if (!getSubmitLabel()
        .equals(other.getSubmitLabel())) return false;
    if (getQuizCount()
        != other.getQuizCount()) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (hasMoreLabel()) {
      hash = (37 * hash) + MORE_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getMoreLabel().hashCode();
    }
    hash = (37 * hash) + ADD_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getAddLabel().hashCode();
    hash = (37 * hash) + SUBMIT_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getSubmitLabel().hashCode();
    hash = (37 * hash) + QUIZ_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuizCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.CampusMngQuiz parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.CampusMngQuiz prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.CampusMngQuiz}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.CampusMngQuiz)
      bilibili.app.dynamic.v2.CampusMngQuizOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusMngQuiz_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusMngQuiz_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.CampusMngQuiz.class, bilibili.app.dynamic.v2.CampusMngQuiz.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.CampusMngQuiz.newBuilder()
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
      title_ = "";
      moreLabel_ = null;
      if (moreLabelBuilder_ != null) {
        moreLabelBuilder_.dispose();
        moreLabelBuilder_ = null;
      }
      addLabel_ = "";
      submitLabel_ = "";
      quizCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CampusMngQuiz_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusMngQuiz getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.CampusMngQuiz.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusMngQuiz build() {
      bilibili.app.dynamic.v2.CampusMngQuiz result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.CampusMngQuiz buildPartial() {
      bilibili.app.dynamic.v2.CampusMngQuiz result = new bilibili.app.dynamic.v2.CampusMngQuiz(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.CampusMngQuiz result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.moreLabel_ = moreLabelBuilder_ == null
            ? moreLabel_
            : moreLabelBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.addLabel_ = addLabel_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.submitLabel_ = submitLabel_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.quizCount_ = quizCount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.CampusMngQuiz) {
        return mergeFrom((bilibili.app.dynamic.v2.CampusMngQuiz)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.CampusMngQuiz other) {
      if (other == bilibili.app.dynamic.v2.CampusMngQuiz.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMoreLabel()) {
        mergeMoreLabel(other.getMoreLabel());
      }
      if (!other.getAddLabel().isEmpty()) {
        addLabel_ = other.addLabel_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSubmitLabel().isEmpty()) {
        submitLabel_ = other.submitLabel_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getQuizCount() != 0L) {
        setQuizCount(other.getQuizCount());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMoreLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              addLabel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              submitLabel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              quizCount_ = input.readInt64();
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string title = 1;</code>
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
     * 
     * </pre>
     *
     * <code>string title = 1;</code>
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
     * 
     * </pre>
     *
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private bilibili.app.dynamic.v2.CampusLabel moreLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder> moreLabelBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     * @return Whether the moreLabel field is set.
     */
    public boolean hasMoreLabel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     * @return The moreLabel.
     */
    public bilibili.app.dynamic.v2.CampusLabel getMoreLabel() {
      if (moreLabelBuilder_ == null) {
        return moreLabel_ == null ? bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : moreLabel_;
      } else {
        return moreLabelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public Builder setMoreLabel(bilibili.app.dynamic.v2.CampusLabel value) {
      if (moreLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        moreLabel_ = value;
      } else {
        moreLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public Builder setMoreLabel(
        bilibili.app.dynamic.v2.CampusLabel.Builder builderForValue) {
      if (moreLabelBuilder_ == null) {
        moreLabel_ = builderForValue.build();
      } else {
        moreLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public Builder mergeMoreLabel(bilibili.app.dynamic.v2.CampusLabel value) {
      if (moreLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          moreLabel_ != null &&
          moreLabel_ != bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance()) {
          getMoreLabelBuilder().mergeFrom(value);
        } else {
          moreLabel_ = value;
        }
      } else {
        moreLabelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public Builder clearMoreLabel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      moreLabel_ = null;
      if (moreLabelBuilder_ != null) {
        moreLabelBuilder_.dispose();
        moreLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public bilibili.app.dynamic.v2.CampusLabel.Builder getMoreLabelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMoreLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    public bilibili.app.dynamic.v2.CampusLabelOrBuilder getMoreLabelOrBuilder() {
      if (moreLabelBuilder_ != null) {
        return moreLabelBuilder_.getMessageOrBuilder();
      } else {
        return moreLabel_ == null ?
            bilibili.app.dynamic.v2.CampusLabel.getDefaultInstance() : moreLabel_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.CampusLabel more_label = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder> 
        getMoreLabelFieldBuilder() {
      if (moreLabelBuilder_ == null) {
        moreLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.CampusLabel, bilibili.app.dynamic.v2.CampusLabel.Builder, bilibili.app.dynamic.v2.CampusLabelOrBuilder>(
                getMoreLabel(),
                getParentForChildren(),
                isClean());
        moreLabel_ = null;
      }
      return moreLabelBuilder_;
    }

    private java.lang.Object addLabel_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string add_label = 3;</code>
     * @return The addLabel.
     */
    public java.lang.String getAddLabel() {
      java.lang.Object ref = addLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addLabel_ = s;
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
     * <code>string add_label = 3;</code>
     * @return The bytes for addLabel.
     */
    public com.google.protobuf.ByteString
        getAddLabelBytes() {
      java.lang.Object ref = addLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addLabel_ = b;
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
     * <code>string add_label = 3;</code>
     * @param value The addLabel to set.
     * @return This builder for chaining.
     */
    public Builder setAddLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      addLabel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string add_label = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddLabel() {
      addLabel_ = getDefaultInstance().getAddLabel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string add_label = 3;</code>
     * @param value The bytes for addLabel to set.
     * @return This builder for chaining.
     */
    public Builder setAddLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      addLabel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object submitLabel_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string submit_label = 4;</code>
     * @return The submitLabel.
     */
    public java.lang.String getSubmitLabel() {
      java.lang.Object ref = submitLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submitLabel_ = s;
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
     * <code>string submit_label = 4;</code>
     * @return The bytes for submitLabel.
     */
    public com.google.protobuf.ByteString
        getSubmitLabelBytes() {
      java.lang.Object ref = submitLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submitLabel_ = b;
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
     * <code>string submit_label = 4;</code>
     * @param value The submitLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      submitLabel_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string submit_label = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmitLabel() {
      submitLabel_ = getDefaultInstance().getSubmitLabel();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string submit_label = 4;</code>
     * @param value The bytes for submitLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      submitLabel_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long quizCount_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 quiz_count = 5;</code>
     * @return The quizCount.
     */
    @java.lang.Override
    public long getQuizCount() {
      return quizCount_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 quiz_count = 5;</code>
     * @param value The quizCount to set.
     * @return This builder for chaining.
     */
    public Builder setQuizCount(long value) {

      quizCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 quiz_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuizCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      quizCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.CampusMngQuiz)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.CampusMngQuiz)
  private static final bilibili.app.dynamic.v2.CampusMngQuiz DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.CampusMngQuiz();
  }

  public static bilibili.app.dynamic.v2.CampusMngQuiz getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampusMngQuiz>
      PARSER = new com.google.protobuf.AbstractParser<CampusMngQuiz>() {
    @java.lang.Override
    public CampusMngQuiz parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampusMngQuiz> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampusMngQuiz> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.CampusMngQuiz getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

