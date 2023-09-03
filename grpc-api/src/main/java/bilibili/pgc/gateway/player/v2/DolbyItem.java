// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * 杜比音频信息
 * </pre>
 *
 * Protobuf type {@code bilibili.pgc.gateway.player.v2.DolbyItem}
 */
public final class DolbyItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.pgc.gateway.player.v2.DolbyItem)
    DolbyItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DolbyItem.newBuilder() to construct.
  private DolbyItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DolbyItem() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DolbyItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_DolbyItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_DolbyItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.pgc.gateway.player.v2.DolbyItem.class, bilibili.pgc.gateway.player.v2.DolbyItem.Builder.class);
  }

  /**
   * <pre>
   * 杜比类型
   * </pre>
   *
   * Protobuf enum {@code bilibili.pgc.gateway.player.v2.DolbyItem.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * NONE
     * </pre>
     *
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <pre>
     * 普通杜比音效
     * </pre>
     *
     * <code>COMMON = 1;</code>
     */
    COMMON(1),
    /**
     * <pre>
     * 全景杜比音效
     * </pre>
     *
     * <code>ATMOS = 2;</code>
     */
    ATMOS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * NONE
     * </pre>
     *
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <pre>
     * 普通杜比音效
     * </pre>
     *
     * <code>COMMON = 1;</code>
     */
    public static final int COMMON_VALUE = 1;
    /**
     * <pre>
     * 全景杜比音效
     * </pre>
     *
     * <code>ATMOS = 2;</code>
     */
    public static final int ATMOS_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return COMMON;
        case 2: return ATMOS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.DolbyItem.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:bilibili.pgc.gateway.player.v2.DolbyItem.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * 杜比类型
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * 杜比类型
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.pgc.gateway.player.v2.DolbyItem.Type getType() {
    bilibili.pgc.gateway.player.v2.DolbyItem.Type result = bilibili.pgc.gateway.player.v2.DolbyItem.Type.forNumber(type_);
    return result == null ? bilibili.pgc.gateway.player.v2.DolbyItem.Type.UNRECOGNIZED : result;
  }

  public static final int AUDIO_FIELD_NUMBER = 2;
  private bilibili.pgc.gateway.player.v2.DashItem audio_;
  /**
   * <pre>
   * 音频流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
   * @return Whether the audio field is set.
   */
  @java.lang.Override
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   * <pre>
   * 音频流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
   * @return The audio.
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.DashItem getAudio() {
    return audio_ == null ? bilibili.pgc.gateway.player.v2.DashItem.getDefaultInstance() : audio_;
  }
  /**
   * <pre>
   * 音频流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
   */
  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.DashItemOrBuilder getAudioOrBuilder() {
    return audio_ == null ? bilibili.pgc.gateway.player.v2.DashItem.getDefaultInstance() : audio_;
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
    if (type_ != bilibili.pgc.gateway.player.v2.DolbyItem.Type.NONE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (audio_ != null) {
      output.writeMessage(2, getAudio());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != bilibili.pgc.gateway.player.v2.DolbyItem.Type.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (audio_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAudio());
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
    if (!(obj instanceof bilibili.pgc.gateway.player.v2.DolbyItem)) {
      return super.equals(obj);
    }
    bilibili.pgc.gateway.player.v2.DolbyItem other = (bilibili.pgc.gateway.player.v2.DolbyItem) obj;

    if (type_ != other.type_) return false;
    if (hasAudio() != other.hasAudio()) return false;
    if (hasAudio()) {
      if (!getAudio()
          .equals(other.getAudio())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasAudio()) {
      hash = (37 * hash) + AUDIO_FIELD_NUMBER;
      hash = (53 * hash) + getAudio().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.pgc.gateway.player.v2.DolbyItem parseFrom(
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
  public static Builder newBuilder(bilibili.pgc.gateway.player.v2.DolbyItem prototype) {
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
   * 杜比音频信息
   * </pre>
   *
   * Protobuf type {@code bilibili.pgc.gateway.player.v2.DolbyItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.pgc.gateway.player.v2.DolbyItem)
      bilibili.pgc.gateway.player.v2.DolbyItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_DolbyItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_DolbyItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.pgc.gateway.player.v2.DolbyItem.class, bilibili.pgc.gateway.player.v2.DolbyItem.Builder.class);
    }

    // Construct using bilibili.pgc.gateway.player.v2.DolbyItem.newBuilder()
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
      audio_ = null;
      if (audioBuilder_ != null) {
        audioBuilder_.dispose();
        audioBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.pgc.gateway.player.v2.Playurl.internal_static_bilibili_pgc_gateway_player_v2_DolbyItem_descriptor;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.DolbyItem getDefaultInstanceForType() {
      return bilibili.pgc.gateway.player.v2.DolbyItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.DolbyItem build() {
      bilibili.pgc.gateway.player.v2.DolbyItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.DolbyItem buildPartial() {
      bilibili.pgc.gateway.player.v2.DolbyItem result = new bilibili.pgc.gateway.player.v2.DolbyItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.pgc.gateway.player.v2.DolbyItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.audio_ = audioBuilder_ == null
            ? audio_
            : audioBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.pgc.gateway.player.v2.DolbyItem) {
        return mergeFrom((bilibili.pgc.gateway.player.v2.DolbyItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.pgc.gateway.player.v2.DolbyItem other) {
      if (other == bilibili.pgc.gateway.player.v2.DolbyItem.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasAudio()) {
        mergeAudio(other.getAudio());
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
            case 18: {
              input.readMessage(
                  getAudioFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
     * 杜比类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * 杜比类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
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
     * 杜比类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.pgc.gateway.player.v2.DolbyItem.Type getType() {
      bilibili.pgc.gateway.player.v2.DolbyItem.Type result = bilibili.pgc.gateway.player.v2.DolbyItem.Type.forNumber(type_);
      return result == null ? bilibili.pgc.gateway.player.v2.DolbyItem.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 杜比类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.pgc.gateway.player.v2.DolbyItem.Type value) {
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
     * 杜比类型
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DolbyItem.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private bilibili.pgc.gateway.player.v2.DashItem audio_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v2.DashItem, bilibili.pgc.gateway.player.v2.DashItem.Builder, bilibili.pgc.gateway.player.v2.DashItemOrBuilder> audioBuilder_;
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     * @return Whether the audio field is set.
     */
    public boolean hasAudio() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     * @return The audio.
     */
    public bilibili.pgc.gateway.player.v2.DashItem getAudio() {
      if (audioBuilder_ == null) {
        return audio_ == null ? bilibili.pgc.gateway.player.v2.DashItem.getDefaultInstance() : audio_;
      } else {
        return audioBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public Builder setAudio(bilibili.pgc.gateway.player.v2.DashItem value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audio_ = value;
      } else {
        audioBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public Builder setAudio(
        bilibili.pgc.gateway.player.v2.DashItem.Builder builderForValue) {
      if (audioBuilder_ == null) {
        audio_ = builderForValue.build();
      } else {
        audioBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public Builder mergeAudio(bilibili.pgc.gateway.player.v2.DashItem value) {
      if (audioBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          audio_ != null &&
          audio_ != bilibili.pgc.gateway.player.v2.DashItem.getDefaultInstance()) {
          getAudioBuilder().mergeFrom(value);
        } else {
          audio_ = value;
        }
      } else {
        audioBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public Builder clearAudio() {
      bitField0_ = (bitField0_ & ~0x00000002);
      audio_ = null;
      if (audioBuilder_ != null) {
        audioBuilder_.dispose();
        audioBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public bilibili.pgc.gateway.player.v2.DashItem.Builder getAudioBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAudioFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    public bilibili.pgc.gateway.player.v2.DashItemOrBuilder getAudioOrBuilder() {
      if (audioBuilder_ != null) {
        return audioBuilder_.getMessageOrBuilder();
      } else {
        return audio_ == null ?
            bilibili.pgc.gateway.player.v2.DashItem.getDefaultInstance() : audio_;
      }
    }
    /**
     * <pre>
     * 音频流
     * </pre>
     *
     * <code>.bilibili.pgc.gateway.player.v2.DashItem audio = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.pgc.gateway.player.v2.DashItem, bilibili.pgc.gateway.player.v2.DashItem.Builder, bilibili.pgc.gateway.player.v2.DashItemOrBuilder> 
        getAudioFieldBuilder() {
      if (audioBuilder_ == null) {
        audioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.pgc.gateway.player.v2.DashItem, bilibili.pgc.gateway.player.v2.DashItem.Builder, bilibili.pgc.gateway.player.v2.DashItemOrBuilder>(
                getAudio(),
                getParentForChildren(),
                isClean());
        audio_ = null;
      }
      return audioBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.pgc.gateway.player.v2.DolbyItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.pgc.gateway.player.v2.DolbyItem)
  private static final bilibili.pgc.gateway.player.v2.DolbyItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.pgc.gateway.player.v2.DolbyItem();
  }

  public static bilibili.pgc.gateway.player.v2.DolbyItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DolbyItem>
      PARSER = new com.google.protobuf.AbstractParser<DolbyItem>() {
    @java.lang.Override
    public DolbyItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<DolbyItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DolbyItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.pgc.gateway.player.v2.DolbyItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

