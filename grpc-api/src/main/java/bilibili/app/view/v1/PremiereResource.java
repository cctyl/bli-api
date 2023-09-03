// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.PremiereResource}
 */
public final class PremiereResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.PremiereResource)
    PremiereResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PremiereResource.newBuilder() to construct.
  private PremiereResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PremiereResource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PremiereResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_PremiereResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_PremiereResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.PremiereResource.class, bilibili.app.view.v1.PremiereResource.Builder.class);
  }

  public static final int PREMIERE_FIELD_NUMBER = 1;
  private bilibili.app.view.v1.Premiere premiere_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
   * @return Whether the premiere field is set.
   */
  @java.lang.Override
  public boolean hasPremiere() {
    return premiere_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
   * @return The premiere.
   */
  @java.lang.Override
  public bilibili.app.view.v1.Premiere getPremiere() {
    return premiere_ == null ? bilibili.app.view.v1.Premiere.getDefaultInstance() : premiere_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.PremiereOrBuilder getPremiereOrBuilder() {
    return premiere_ == null ? bilibili.app.view.v1.Premiere.getDefaultInstance() : premiere_;
  }

  public static final int RESERVE_FIELD_NUMBER = 2;
  private bilibili.app.view.v1.PremiereReserve reserve_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
   * @return Whether the reserve field is set.
   */
  @java.lang.Override
  public boolean hasReserve() {
    return reserve_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
   * @return The reserve.
   */
  @java.lang.Override
  public bilibili.app.view.v1.PremiereReserve getReserve() {
    return reserve_ == null ? bilibili.app.view.v1.PremiereReserve.getDefaultInstance() : reserve_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.PremiereReserveOrBuilder getReserveOrBuilder() {
    return reserve_ == null ? bilibili.app.view.v1.PremiereReserve.getDefaultInstance() : reserve_;
  }

  public static final int TEXT_FIELD_NUMBER = 3;
  private bilibili.app.view.v1.PremiereText text_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
   * @return The text.
   */
  @java.lang.Override
  public bilibili.app.view.v1.PremiereText getText() {
    return text_ == null ? bilibili.app.view.v1.PremiereText.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.PremiereTextOrBuilder getTextOrBuilder() {
    return text_ == null ? bilibili.app.view.v1.PremiereText.getDefaultInstance() : text_;
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
    if (premiere_ != null) {
      output.writeMessage(1, getPremiere());
    }
    if (reserve_ != null) {
      output.writeMessage(2, getReserve());
    }
    if (text_ != null) {
      output.writeMessage(3, getText());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (premiere_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPremiere());
    }
    if (reserve_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReserve());
    }
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getText());
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
    if (!(obj instanceof bilibili.app.view.v1.PremiereResource)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.PremiereResource other = (bilibili.app.view.v1.PremiereResource) obj;

    if (hasPremiere() != other.hasPremiere()) return false;
    if (hasPremiere()) {
      if (!getPremiere()
          .equals(other.getPremiere())) return false;
    }
    if (hasReserve() != other.hasReserve()) return false;
    if (hasReserve()) {
      if (!getReserve()
          .equals(other.getReserve())) return false;
    }
    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
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
    if (hasPremiere()) {
      hash = (37 * hash) + PREMIERE_FIELD_NUMBER;
      hash = (53 * hash) + getPremiere().hashCode();
    }
    if (hasReserve()) {
      hash = (37 * hash) + RESERVE_FIELD_NUMBER;
      hash = (53 * hash) + getReserve().hashCode();
    }
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.PremiereResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.PremiereResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.PremiereResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.PremiereResource parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.PremiereResource prototype) {
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
   * Protobuf type {@code bilibili.app.view.v1.PremiereResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.PremiereResource)
      bilibili.app.view.v1.PremiereResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_PremiereResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_PremiereResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.PremiereResource.class, bilibili.app.view.v1.PremiereResource.Builder.class);
    }

    // Construct using bilibili.app.view.v1.PremiereResource.newBuilder()
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
      premiere_ = null;
      if (premiereBuilder_ != null) {
        premiereBuilder_.dispose();
        premiereBuilder_ = null;
      }
      reserve_ = null;
      if (reserveBuilder_ != null) {
        reserveBuilder_.dispose();
        reserveBuilder_ = null;
      }
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_PremiereResource_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.PremiereResource getDefaultInstanceForType() {
      return bilibili.app.view.v1.PremiereResource.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.PremiereResource build() {
      bilibili.app.view.v1.PremiereResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.PremiereResource buildPartial() {
      bilibili.app.view.v1.PremiereResource result = new bilibili.app.view.v1.PremiereResource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.PremiereResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.premiere_ = premiereBuilder_ == null
            ? premiere_
            : premiereBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reserve_ = reserveBuilder_ == null
            ? reserve_
            : reserveBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.text_ = textBuilder_ == null
            ? text_
            : textBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.PremiereResource) {
        return mergeFrom((bilibili.app.view.v1.PremiereResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.PremiereResource other) {
      if (other == bilibili.app.view.v1.PremiereResource.getDefaultInstance()) return this;
      if (other.hasPremiere()) {
        mergePremiere(other.getPremiere());
      }
      if (other.hasReserve()) {
        mergeReserve(other.getReserve());
      }
      if (other.hasText()) {
        mergeText(other.getText());
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
                  getPremiereFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getReserveFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private bilibili.app.view.v1.Premiere premiere_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.Premiere, bilibili.app.view.v1.Premiere.Builder, bilibili.app.view.v1.PremiereOrBuilder> premiereBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     * @return Whether the premiere field is set.
     */
    public boolean hasPremiere() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     * @return The premiere.
     */
    public bilibili.app.view.v1.Premiere getPremiere() {
      if (premiereBuilder_ == null) {
        return premiere_ == null ? bilibili.app.view.v1.Premiere.getDefaultInstance() : premiere_;
      } else {
        return premiereBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public Builder setPremiere(bilibili.app.view.v1.Premiere value) {
      if (premiereBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        premiere_ = value;
      } else {
        premiereBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public Builder setPremiere(
        bilibili.app.view.v1.Premiere.Builder builderForValue) {
      if (premiereBuilder_ == null) {
        premiere_ = builderForValue.build();
      } else {
        premiereBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public Builder mergePremiere(bilibili.app.view.v1.Premiere value) {
      if (premiereBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          premiere_ != null &&
          premiere_ != bilibili.app.view.v1.Premiere.getDefaultInstance()) {
          getPremiereBuilder().mergeFrom(value);
        } else {
          premiere_ = value;
        }
      } else {
        premiereBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public Builder clearPremiere() {
      bitField0_ = (bitField0_ & ~0x00000001);
      premiere_ = null;
      if (premiereBuilder_ != null) {
        premiereBuilder_.dispose();
        premiereBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public bilibili.app.view.v1.Premiere.Builder getPremiereBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPremiereFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    public bilibili.app.view.v1.PremiereOrBuilder getPremiereOrBuilder() {
      if (premiereBuilder_ != null) {
        return premiereBuilder_.getMessageOrBuilder();
      } else {
        return premiere_ == null ?
            bilibili.app.view.v1.Premiere.getDefaultInstance() : premiere_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.Premiere premiere = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.Premiere, bilibili.app.view.v1.Premiere.Builder, bilibili.app.view.v1.PremiereOrBuilder> 
        getPremiereFieldBuilder() {
      if (premiereBuilder_ == null) {
        premiereBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.Premiere, bilibili.app.view.v1.Premiere.Builder, bilibili.app.view.v1.PremiereOrBuilder>(
                getPremiere(),
                getParentForChildren(),
                isClean());
        premiere_ = null;
      }
      return premiereBuilder_;
    }

    private bilibili.app.view.v1.PremiereReserve reserve_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.PremiereReserve, bilibili.app.view.v1.PremiereReserve.Builder, bilibili.app.view.v1.PremiereReserveOrBuilder> reserveBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     * @return Whether the reserve field is set.
     */
    public boolean hasReserve() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     * @return The reserve.
     */
    public bilibili.app.view.v1.PremiereReserve getReserve() {
      if (reserveBuilder_ == null) {
        return reserve_ == null ? bilibili.app.view.v1.PremiereReserve.getDefaultInstance() : reserve_;
      } else {
        return reserveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public Builder setReserve(bilibili.app.view.v1.PremiereReserve value) {
      if (reserveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reserve_ = value;
      } else {
        reserveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public Builder setReserve(
        bilibili.app.view.v1.PremiereReserve.Builder builderForValue) {
      if (reserveBuilder_ == null) {
        reserve_ = builderForValue.build();
      } else {
        reserveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public Builder mergeReserve(bilibili.app.view.v1.PremiereReserve value) {
      if (reserveBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          reserve_ != null &&
          reserve_ != bilibili.app.view.v1.PremiereReserve.getDefaultInstance()) {
          getReserveBuilder().mergeFrom(value);
        } else {
          reserve_ = value;
        }
      } else {
        reserveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public Builder clearReserve() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reserve_ = null;
      if (reserveBuilder_ != null) {
        reserveBuilder_.dispose();
        reserveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public bilibili.app.view.v1.PremiereReserve.Builder getReserveBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReserveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    public bilibili.app.view.v1.PremiereReserveOrBuilder getReserveOrBuilder() {
      if (reserveBuilder_ != null) {
        return reserveBuilder_.getMessageOrBuilder();
      } else {
        return reserve_ == null ?
            bilibili.app.view.v1.PremiereReserve.getDefaultInstance() : reserve_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereReserve reserve = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.PremiereReserve, bilibili.app.view.v1.PremiereReserve.Builder, bilibili.app.view.v1.PremiereReserveOrBuilder> 
        getReserveFieldBuilder() {
      if (reserveBuilder_ == null) {
        reserveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.PremiereReserve, bilibili.app.view.v1.PremiereReserve.Builder, bilibili.app.view.v1.PremiereReserveOrBuilder>(
                getReserve(),
                getParentForChildren(),
                isClean());
        reserve_ = null;
      }
      return reserveBuilder_;
    }

    private bilibili.app.view.v1.PremiereText text_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.PremiereText, bilibili.app.view.v1.PremiereText.Builder, bilibili.app.view.v1.PremiereTextOrBuilder> textBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     * @return The text.
     */
    public bilibili.app.view.v1.PremiereText getText() {
      if (textBuilder_ == null) {
        return text_ == null ? bilibili.app.view.v1.PremiereText.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public Builder setText(bilibili.app.view.v1.PremiereText value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
      } else {
        textBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public Builder setText(
        bilibili.app.view.v1.PremiereText.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public Builder mergeText(bilibili.app.view.v1.PremiereText value) {
      if (textBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          text_ != null &&
          text_ != bilibili.app.view.v1.PremiereText.getDefaultInstance()) {
          getTextBuilder().mergeFrom(value);
        } else {
          text_ = value;
        }
      } else {
        textBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000004);
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public bilibili.app.view.v1.PremiereText.Builder getTextBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    public bilibili.app.view.v1.PremiereTextOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            bilibili.app.view.v1.PremiereText.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.app.view.v1.PremiereText text = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.PremiereText, bilibili.app.view.v1.PremiereText.Builder, bilibili.app.view.v1.PremiereTextOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.PremiereText, bilibili.app.view.v1.PremiereText.Builder, bilibili.app.view.v1.PremiereTextOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.PremiereResource)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.PremiereResource)
  private static final bilibili.app.view.v1.PremiereResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.PremiereResource();
  }

  public static bilibili.app.view.v1.PremiereResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PremiereResource>
      PARSER = new com.google.protobuf.AbstractParser<PremiereResource>() {
    @java.lang.Override
    public PremiereResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<PremiereResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PremiereResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.PremiereResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
