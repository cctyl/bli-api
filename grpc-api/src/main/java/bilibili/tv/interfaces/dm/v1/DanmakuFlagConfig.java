// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

/**
 * <pre>
 * 云屏蔽配置信息
 * </pre>
 *
 * Protobuf type {@code bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig}
 */
public final class DanmakuFlagConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)
    DanmakuFlagConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DanmakuFlagConfig.newBuilder() to construct.
  private DanmakuFlagConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DanmakuFlagConfig() {
    recText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DanmakuFlagConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_DanmakuFlagConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_DanmakuFlagConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.class, bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.Builder.class);
  }

  public static final int REC_FLAG_FIELD_NUMBER = 1;
  private int recFlag_ = 0;
  /**
   * <pre>
   * 云屏蔽等级
   * </pre>
   *
   * <code>int32 rec_flag = 1;</code>
   * @return The recFlag.
   */
  @java.lang.Override
  public int getRecFlag() {
    return recFlag_;
  }

  public static final int REC_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object recText_ = "";
  /**
   * <pre>
   * 云屏蔽文案
   * </pre>
   *
   * <code>string rec_text = 2;</code>
   * @return The recText.
   */
  @java.lang.Override
  public java.lang.String getRecText() {
    java.lang.Object ref = recText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 云屏蔽文案
   * </pre>
   *
   * <code>string rec_text = 2;</code>
   * @return The bytes for recText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecTextBytes() {
    java.lang.Object ref = recText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REC_SWITCH_FIELD_NUMBER = 3;
  private int recSwitch_ = 0;
  /**
   * <pre>
   * 云屏蔽开关
   * </pre>
   *
   * <code>int32 rec_switch = 3;</code>
   * @return The recSwitch.
   */
  @java.lang.Override
  public int getRecSwitch() {
    return recSwitch_;
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
    if (recFlag_ != 0) {
      output.writeInt32(1, recFlag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recText_);
    }
    if (recSwitch_ != 0) {
      output.writeInt32(3, recSwitch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recFlag_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, recFlag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recText_);
    }
    if (recSwitch_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, recSwitch_);
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
    if (!(obj instanceof bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)) {
      return super.equals(obj);
    }
    bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig other = (bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig) obj;

    if (getRecFlag()
        != other.getRecFlag()) return false;
    if (!getRecText()
        .equals(other.getRecText())) return false;
    if (getRecSwitch()
        != other.getRecSwitch()) return false;
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
    hash = (37 * hash) + REC_FLAG_FIELD_NUMBER;
    hash = (53 * hash) + getRecFlag();
    hash = (37 * hash) + REC_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getRecText().hashCode();
    hash = (37 * hash) + REC_SWITCH_FIELD_NUMBER;
    hash = (53 * hash) + getRecSwitch();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig parseFrom(
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
  public static Builder newBuilder(bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig prototype) {
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
   * 云屏蔽配置信息
   * </pre>
   *
   * Protobuf type {@code bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)
      bilibili.tv.interfaces.dm.v1.DanmakuFlagConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_DanmakuFlagConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_DanmakuFlagConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.class, bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.Builder.class);
    }

    // Construct using bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.newBuilder()
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
      recFlag_ = 0;
      recText_ = "";
      recSwitch_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.tv.interfaces.dm.v1.Dm.internal_static_bilibili_tv_interfaces_dm_v1_DanmakuFlagConfig_descriptor;
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig getDefaultInstanceForType() {
      return bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig build() {
      bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig buildPartial() {
      bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig result = new bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recFlag_ = recFlag_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recText_ = recText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.recSwitch_ = recSwitch_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig) {
        return mergeFrom((bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig other) {
      if (other == bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig.getDefaultInstance()) return this;
      if (other.getRecFlag() != 0) {
        setRecFlag(other.getRecFlag());
      }
      if (!other.getRecText().isEmpty()) {
        recText_ = other.recText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRecSwitch() != 0) {
        setRecSwitch(other.getRecSwitch());
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
              recFlag_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              recText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              recSwitch_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int recFlag_ ;
    /**
     * <pre>
     * 云屏蔽等级
     * </pre>
     *
     * <code>int32 rec_flag = 1;</code>
     * @return The recFlag.
     */
    @java.lang.Override
    public int getRecFlag() {
      return recFlag_;
    }
    /**
     * <pre>
     * 云屏蔽等级
     * </pre>
     *
     * <code>int32 rec_flag = 1;</code>
     * @param value The recFlag to set.
     * @return This builder for chaining.
     */
    public Builder setRecFlag(int value) {

      recFlag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云屏蔽等级
     * </pre>
     *
     * <code>int32 rec_flag = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecFlag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recFlag_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object recText_ = "";
    /**
     * <pre>
     * 云屏蔽文案
     * </pre>
     *
     * <code>string rec_text = 2;</code>
     * @return The recText.
     */
    public java.lang.String getRecText() {
      java.lang.Object ref = recText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 云屏蔽文案
     * </pre>
     *
     * <code>string rec_text = 2;</code>
     * @return The bytes for recText.
     */
    public com.google.protobuf.ByteString
        getRecTextBytes() {
      java.lang.Object ref = recText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 云屏蔽文案
     * </pre>
     *
     * <code>string rec_text = 2;</code>
     * @param value The recText to set.
     * @return This builder for chaining.
     */
    public Builder setRecText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      recText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云屏蔽文案
     * </pre>
     *
     * <code>string rec_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecText() {
      recText_ = getDefaultInstance().getRecText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云屏蔽文案
     * </pre>
     *
     * <code>string rec_text = 2;</code>
     * @param value The bytes for recText to set.
     * @return This builder for chaining.
     */
    public Builder setRecTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      recText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int recSwitch_ ;
    /**
     * <pre>
     * 云屏蔽开关
     * </pre>
     *
     * <code>int32 rec_switch = 3;</code>
     * @return The recSwitch.
     */
    @java.lang.Override
    public int getRecSwitch() {
      return recSwitch_;
    }
    /**
     * <pre>
     * 云屏蔽开关
     * </pre>
     *
     * <code>int32 rec_switch = 3;</code>
     * @param value The recSwitch to set.
     * @return This builder for chaining.
     */
    public Builder setRecSwitch(int value) {

      recSwitch_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云屏蔽开关
     * </pre>
     *
     * <code>int32 rec_switch = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecSwitch() {
      bitField0_ = (bitField0_ & ~0x00000004);
      recSwitch_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)
  }

  // @@protoc_insertion_point(class_scope:bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig)
  private static final bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig();
  }

  public static bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DanmakuFlagConfig>
      PARSER = new com.google.protobuf.AbstractParser<DanmakuFlagConfig>() {
    @java.lang.Override
    public DanmakuFlagConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DanmakuFlagConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DanmakuFlagConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.tv.interfaces.dm.v1.DanmakuFlagConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

