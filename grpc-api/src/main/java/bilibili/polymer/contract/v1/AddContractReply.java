// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/contract/v1/contract.proto

package bilibili.polymer.contract.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.contract.v1.AddContractReply}
 */
public final class AddContractReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.contract.v1.AddContractReply)
    AddContractReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddContractReply.newBuilder() to construct.
  private AddContractReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddContractReply() {
    inputText_ = "";
    inputTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddContractReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.contract.v1.ContractOuterClass.internal_static_bilibili_polymer_contract_v1_AddContractReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.contract.v1.ContractOuterClass.internal_static_bilibili_polymer_contract_v1_AddContractReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.contract.v1.AddContractReply.class, bilibili.polymer.contract.v1.AddContractReply.Builder.class);
  }

  public static final int ALLOW_MESSAGE_FIELD_NUMBER = 1;
  private boolean allowMessage_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool allow_message = 1;</code>
   * @return The allowMessage.
   */
  @java.lang.Override
  public boolean getAllowMessage() {
    return allowMessage_;
  }

  public static final int ALLOW_REPLY_FIELD_NUMBER = 2;
  private boolean allowReply_ = false;
  /**
   * <pre>
   * </pre>
   *
   * <code>bool allow_reply = 2;</code>
   * @return The allowReply.
   */
  @java.lang.Override
  public boolean getAllowReply() {
    return allowReply_;
  }

  public static final int INPUT_TEXT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inputText_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_text = 3;</code>
   * @return The inputText.
   */
  @java.lang.Override
  public java.lang.String getInputText() {
    java.lang.Object ref = inputText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_text = 3;</code>
   * @return The bytes for inputText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInputTextBytes() {
    java.lang.Object ref = inputText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_TITLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inputTitle_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_title = 4;</code>
   * @return The inputTitle.
   */
  @java.lang.Override
  public java.lang.String getInputTitle() {
    java.lang.Object ref = inputTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_title = 4;</code>
   * @return The bytes for inputTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInputTitleBytes() {
    java.lang.Object ref = inputTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputTitle_ = b;
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
    if (allowMessage_ != false) {
      output.writeBool(1, allowMessage_);
    }
    if (allowReply_ != false) {
      output.writeBool(2, allowReply_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, inputText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, inputTitle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowMessage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, allowMessage_);
    }
    if (allowReply_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, allowReply_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, inputText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, inputTitle_);
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
    if (!(obj instanceof bilibili.polymer.contract.v1.AddContractReply)) {
      return super.equals(obj);
    }
    bilibili.polymer.contract.v1.AddContractReply other = (bilibili.polymer.contract.v1.AddContractReply) obj;

    if (getAllowMessage()
        != other.getAllowMessage()) return false;
    if (getAllowReply()
        != other.getAllowReply()) return false;
    if (!getInputText()
        .equals(other.getInputText())) return false;
    if (!getInputTitle()
        .equals(other.getInputTitle())) return false;
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
    hash = (37 * hash) + ALLOW_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMessage());
    hash = (37 * hash) + ALLOW_REPLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowReply());
    hash = (37 * hash) + INPUT_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getInputText().hashCode();
    hash = (37 * hash) + INPUT_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getInputTitle().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.contract.v1.AddContractReply parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.contract.v1.AddContractReply prototype) {
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
   * Protobuf type {@code bilibili.polymer.contract.v1.AddContractReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.contract.v1.AddContractReply)
      bilibili.polymer.contract.v1.AddContractReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.contract.v1.ContractOuterClass.internal_static_bilibili_polymer_contract_v1_AddContractReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.contract.v1.ContractOuterClass.internal_static_bilibili_polymer_contract_v1_AddContractReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.contract.v1.AddContractReply.class, bilibili.polymer.contract.v1.AddContractReply.Builder.class);
    }

    // Construct using bilibili.polymer.contract.v1.AddContractReply.newBuilder()
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
      allowMessage_ = false;
      allowReply_ = false;
      inputText_ = "";
      inputTitle_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.contract.v1.ContractOuterClass.internal_static_bilibili_polymer_contract_v1_AddContractReply_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.contract.v1.AddContractReply getDefaultInstanceForType() {
      return bilibili.polymer.contract.v1.AddContractReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.contract.v1.AddContractReply build() {
      bilibili.polymer.contract.v1.AddContractReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.contract.v1.AddContractReply buildPartial() {
      bilibili.polymer.contract.v1.AddContractReply result = new bilibili.polymer.contract.v1.AddContractReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.contract.v1.AddContractReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowMessage_ = allowMessage_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowReply_ = allowReply_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inputText_ = inputText_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.inputTitle_ = inputTitle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.contract.v1.AddContractReply) {
        return mergeFrom((bilibili.polymer.contract.v1.AddContractReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.contract.v1.AddContractReply other) {
      if (other == bilibili.polymer.contract.v1.AddContractReply.getDefaultInstance()) return this;
      if (other.getAllowMessage() != false) {
        setAllowMessage(other.getAllowMessage());
      }
      if (other.getAllowReply() != false) {
        setAllowReply(other.getAllowReply());
      }
      if (!other.getInputText().isEmpty()) {
        inputText_ = other.inputText_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getInputTitle().isEmpty()) {
        inputTitle_ = other.inputTitle_;
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
              allowMessage_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              allowReply_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              inputText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              inputTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private boolean allowMessage_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_message = 1;</code>
     * @return The allowMessage.
     */
    @java.lang.Override
    public boolean getAllowMessage() {
      return allowMessage_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_message = 1;</code>
     * @param value The allowMessage to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMessage(boolean value) {

      allowMessage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowMessage_ = false;
      onChanged();
      return this;
    }

    private boolean allowReply_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_reply = 2;</code>
     * @return The allowReply.
     */
    @java.lang.Override
    public boolean getAllowReply() {
      return allowReply_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_reply = 2;</code>
     * @param value The allowReply to set.
     * @return This builder for chaining.
     */
    public Builder setAllowReply(boolean value) {

      allowReply_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>bool allow_reply = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowReply() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowReply_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object inputText_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_text = 3;</code>
     * @return The inputText.
     */
    public java.lang.String getInputText() {
      java.lang.Object ref = inputText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_text = 3;</code>
     * @return The bytes for inputText.
     */
    public com.google.protobuf.ByteString
        getInputTextBytes() {
      java.lang.Object ref = inputText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_text = 3;</code>
     * @param value The inputText to set.
     * @return This builder for chaining.
     */
    public Builder setInputText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inputText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputText() {
      inputText_ = getDefaultInstance().getInputText();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_text = 3;</code>
     * @param value The bytes for inputText to set.
     * @return This builder for chaining.
     */
    public Builder setInputTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inputText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object inputTitle_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_title = 4;</code>
     * @return The inputTitle.
     */
    public java.lang.String getInputTitle() {
      java.lang.Object ref = inputTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_title = 4;</code>
     * @return The bytes for inputTitle.
     */
    public com.google.protobuf.ByteString
        getInputTitleBytes() {
      java.lang.Object ref = inputTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_title = 4;</code>
     * @param value The inputTitle to set.
     * @return This builder for chaining.
     */
    public Builder setInputTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inputTitle_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_title = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputTitle() {
      inputTitle_ = getDefaultInstance().getInputTitle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string input_title = 4;</code>
     * @param value The bytes for inputTitle to set.
     * @return This builder for chaining.
     */
    public Builder setInputTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inputTitle_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.contract.v1.AddContractReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.contract.v1.AddContractReply)
  private static final bilibili.polymer.contract.v1.AddContractReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.contract.v1.AddContractReply();
  }

  public static bilibili.polymer.contract.v1.AddContractReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddContractReply>
      PARSER = new com.google.protobuf.AbstractParser<AddContractReply>() {
    @java.lang.Override
    public AddContractReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddContractReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddContractReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.contract.v1.AddContractReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

