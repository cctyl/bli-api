// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.listener.v1.SortOption}
 */
public final class SortOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.listener.v1.SortOption)
    SortOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortOption.newBuilder() to construct.
  private SortOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortOption() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_SortOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_SortOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.listener.v1.SortOption.class, bilibili.app.listener.v1.SortOption.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private int order_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 order = 1;</code>
   * @return The order.
   */
  @java.lang.Override
  public int getOrder() {
    return order_;
  }

  public static final int SORT_FIELD_FIELD_NUMBER = 2;
  private int sortField_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 sort_field = 2;</code>
   * @return The sortField.
   */
  @java.lang.Override
  public int getSortField() {
    return sortField_;
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
    if (order_ != 0) {
      output.writeInt32(1, order_);
    }
    if (sortField_ != 0) {
      output.writeInt32(2, sortField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (order_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, order_);
    }
    if (sortField_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sortField_);
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
    if (!(obj instanceof bilibili.app.listener.v1.SortOption)) {
      return super.equals(obj);
    }
    bilibili.app.listener.v1.SortOption other = (bilibili.app.listener.v1.SortOption) obj;

    if (getOrder()
        != other.getOrder()) return false;
    if (getSortField()
        != other.getSortField()) return false;
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
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder();
    hash = (37 * hash) + SORT_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getSortField();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.listener.v1.SortOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.SortOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.SortOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.listener.v1.SortOption parseFrom(
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
  public static Builder newBuilder(bilibili.app.listener.v1.SortOption prototype) {
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
   * Protobuf type {@code bilibili.app.listener.v1.SortOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.listener.v1.SortOption)
      bilibili.app.listener.v1.SortOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_SortOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_SortOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.listener.v1.SortOption.class, bilibili.app.listener.v1.SortOption.Builder.class);
    }

    // Construct using bilibili.app.listener.v1.SortOption.newBuilder()
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
      order_ = 0;
      sortField_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.listener.v1.ListenerOuterClass.internal_static_bilibili_app_listener_v1_SortOption_descriptor;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.SortOption getDefaultInstanceForType() {
      return bilibili.app.listener.v1.SortOption.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.listener.v1.SortOption build() {
      bilibili.app.listener.v1.SortOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.listener.v1.SortOption buildPartial() {
      bilibili.app.listener.v1.SortOption result = new bilibili.app.listener.v1.SortOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.listener.v1.SortOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.order_ = order_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sortField_ = sortField_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.listener.v1.SortOption) {
        return mergeFrom((bilibili.app.listener.v1.SortOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.listener.v1.SortOption other) {
      if (other == bilibili.app.listener.v1.SortOption.getDefaultInstance()) return this;
      if (other.getOrder() != 0) {
        setOrder(other.getOrder());
      }
      if (other.getSortField() != 0) {
        setSortField(other.getSortField());
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
              order_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sortField_ = input.readInt32();
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

    private int order_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 1;</code>
     * @return The order.
     */
    @java.lang.Override
    public int getOrder() {
      return order_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 1;</code>
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(int value) {

      order_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 order = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrder() {
      bitField0_ = (bitField0_ & ~0x00000001);
      order_ = 0;
      onChanged();
      return this;
    }

    private int sortField_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 sort_field = 2;</code>
     * @return The sortField.
     */
    @java.lang.Override
    public int getSortField() {
      return sortField_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 sort_field = 2;</code>
     * @param value The sortField to set.
     * @return This builder for chaining.
     */
    public Builder setSortField(int value) {

      sortField_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 sort_field = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSortField() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sortField_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.listener.v1.SortOption)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.listener.v1.SortOption)
  private static final bilibili.app.listener.v1.SortOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.listener.v1.SortOption();
  }

  public static bilibili.app.listener.v1.SortOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortOption>
      PARSER = new com.google.protobuf.AbstractParser<SortOption>() {
    @java.lang.Override
    public SortOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<SortOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.listener.v1.SortOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
