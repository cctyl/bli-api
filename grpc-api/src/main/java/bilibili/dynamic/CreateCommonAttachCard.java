// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

/**
 * <pre>
 * 创建动态时附带的通用附加卡详情
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.CreateCommonAttachCard}
 */
public final class CreateCommonAttachCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.CreateCommonAttachCard)
    CreateCommonAttachCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCommonAttachCard.newBuilder() to construct.
  private CreateCommonAttachCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCommonAttachCard() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCommonAttachCard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateCommonAttachCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateCommonAttachCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.CreateCommonAttachCard.class, bilibili.dynamic.CreateCommonAttachCard.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * 通用附加卡的类型
   * </pre>
   *
   * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * 通用附加卡的类型
   * </pre>
   *
   * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.dynamic.AttachCardType getType() {
    bilibili.dynamic.AttachCardType result = bilibili.dynamic.AttachCardType.forNumber(type_);
    return result == null ? bilibili.dynamic.AttachCardType.UNRECOGNIZED : result;
  }

  public static final int BIZ_ID_FIELD_NUMBER = 2;
  private long bizId_ = 0L;
  /**
   * <pre>
   * 通用附加卡的业务id
   * </pre>
   *
   * <code>int64 biz_id = 2;</code>
   * @return The bizId.
   */
  @java.lang.Override
  public long getBizId() {
    return bizId_;
  }

  public static final int RESERVE_SOURCE_FIELD_NUMBER = 3;
  private int reserveSource_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 reserve_source = 3;</code>
   * @return The reserveSource.
   */
  @java.lang.Override
  public int getReserveSource() {
    return reserveSource_;
  }

  public static final int RESERVE_LOTTERY_FIELD_NUMBER = 4;
  private int reserveLottery_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 reserve_lottery = 4;</code>
   * @return The reserveLottery.
   */
  @java.lang.Override
  public int getReserveLottery() {
    return reserveLottery_;
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
    if (type_ != bilibili.dynamic.AttachCardType.ATTACH_CARD_NONE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (bizId_ != 0L) {
      output.writeInt64(2, bizId_);
    }
    if (reserveSource_ != 0) {
      output.writeInt32(3, reserveSource_);
    }
    if (reserveLottery_ != 0) {
      output.writeInt32(4, reserveLottery_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != bilibili.dynamic.AttachCardType.ATTACH_CARD_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (bizId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bizId_);
    }
    if (reserveSource_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, reserveSource_);
    }
    if (reserveLottery_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, reserveLottery_);
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
    if (!(obj instanceof bilibili.dynamic.CreateCommonAttachCard)) {
      return super.equals(obj);
    }
    bilibili.dynamic.CreateCommonAttachCard other = (bilibili.dynamic.CreateCommonAttachCard) obj;

    if (type_ != other.type_) return false;
    if (getBizId()
        != other.getBizId()) return false;
    if (getReserveSource()
        != other.getReserveSource()) return false;
    if (getReserveLottery()
        != other.getReserveLottery()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + BIZ_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBizId());
    hash = (37 * hash) + RESERVE_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getReserveSource();
    hash = (37 * hash) + RESERVE_LOTTERY_FIELD_NUMBER;
    hash = (53 * hash) + getReserveLottery();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.CreateCommonAttachCard parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.CreateCommonAttachCard prototype) {
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
   * 创建动态时附带的通用附加卡详情
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.CreateCommonAttachCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.CreateCommonAttachCard)
      bilibili.dynamic.CreateCommonAttachCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateCommonAttachCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateCommonAttachCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.CreateCommonAttachCard.class, bilibili.dynamic.CreateCommonAttachCard.Builder.class);
    }

    // Construct using bilibili.dynamic.CreateCommonAttachCard.newBuilder()
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
      type_ = 0;
      bizId_ = 0L;
      reserveSource_ = 0;
      reserveLottery_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.Dynamic.internal_static_bilibili_dynamic_CreateCommonAttachCard_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateCommonAttachCard getDefaultInstanceForType() {
      return bilibili.dynamic.CreateCommonAttachCard.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.CreateCommonAttachCard build() {
      bilibili.dynamic.CreateCommonAttachCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.CreateCommonAttachCard buildPartial() {
      bilibili.dynamic.CreateCommonAttachCard result = new bilibili.dynamic.CreateCommonAttachCard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.CreateCommonAttachCard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bizId_ = bizId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reserveSource_ = reserveSource_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reserveLottery_ = reserveLottery_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.CreateCommonAttachCard) {
        return mergeFrom((bilibili.dynamic.CreateCommonAttachCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.CreateCommonAttachCard other) {
      if (other == bilibili.dynamic.CreateCommonAttachCard.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getBizId() != 0L) {
        setBizId(other.getBizId());
      }
      if (other.getReserveSource() != 0) {
        setReserveSource(other.getReserveSource());
      }
      if (other.getReserveLottery() != 0) {
        setReserveLottery(other.getReserveLottery());
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              bizId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              reserveSource_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              reserveLottery_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int type_ = 0;
    /**
     * <pre>
     * 通用附加卡的类型
     * </pre>
     *
     * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * 通用附加卡的类型
     * </pre>
     *
     * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 通用附加卡的类型
     * </pre>
     *
     * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.dynamic.AttachCardType getType() {
      bilibili.dynamic.AttachCardType result = bilibili.dynamic.AttachCardType.forNumber(type_);
      return result == null ? bilibili.dynamic.AttachCardType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 通用附加卡的类型
     * </pre>
     *
     * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.dynamic.AttachCardType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 通用附加卡的类型
     * </pre>
     *
     * <code>.bilibili.dynamic.AttachCardType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long bizId_ ;
    /**
     * <pre>
     * 通用附加卡的业务id
     * </pre>
     *
     * <code>int64 biz_id = 2;</code>
     * @return The bizId.
     */
    @java.lang.Override
    public long getBizId() {
      return bizId_;
    }
    /**
     * <pre>
     * 通用附加卡的业务id
     * </pre>
     *
     * <code>int64 biz_id = 2;</code>
     * @param value The bizId to set.
     * @return This builder for chaining.
     */
    public Builder setBizId(long value) {

      bizId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 通用附加卡的业务id
     * </pre>
     *
     * <code>int64 biz_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bizId_ = 0L;
      onChanged();
      return this;
    }

    private int reserveSource_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_source = 3;</code>
     * @return The reserveSource.
     */
    @java.lang.Override
    public int getReserveSource() {
      return reserveSource_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_source = 3;</code>
     * @param value The reserveSource to set.
     * @return This builder for chaining.
     */
    public Builder setReserveSource(int value) {

      reserveSource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_source = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveSource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      reserveSource_ = 0;
      onChanged();
      return this;
    }

    private int reserveLottery_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_lottery = 4;</code>
     * @return The reserveLottery.
     */
    @java.lang.Override
    public int getReserveLottery() {
      return reserveLottery_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_lottery = 4;</code>
     * @param value The reserveLottery to set.
     * @return This builder for chaining.
     */
    public Builder setReserveLottery(int value) {

      reserveLottery_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reserve_lottery = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveLottery() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reserveLottery_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.CreateCommonAttachCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.CreateCommonAttachCard)
  private static final bilibili.dynamic.CreateCommonAttachCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.CreateCommonAttachCard();
  }

  public static bilibili.dynamic.CreateCommonAttachCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCommonAttachCard>
      PARSER = new com.google.protobuf.AbstractParser<CreateCommonAttachCard>() {
    @java.lang.Override
    public CreateCommonAttachCard parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCommonAttachCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCommonAttachCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.CreateCommonAttachCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

