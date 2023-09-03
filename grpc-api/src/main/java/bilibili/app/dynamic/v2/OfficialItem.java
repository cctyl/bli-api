// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * Protobuf type {@code bilibili.app.dynamic.v2.OfficialItem}
 */
public final class OfficialItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.OfficialItem)
    OfficialItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfficialItem.newBuilder() to construct.
  private OfficialItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfficialItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfficialItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_OfficialItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_OfficialItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.OfficialItem.class, bilibili.app.dynamic.v2.OfficialItem.Builder.class);
  }

  private int rcmdItemCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object rcmdItem_;
  public enum RcmdItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RCMD_ARCHIVE(2),
    RCMD_DYNAMIC(3),
    RCMDITEM_NOT_SET(0);
    private final int value;
    private RcmdItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RcmdItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static RcmdItemCase forNumber(int value) {
      switch (value) {
        case 2: return RCMD_ARCHIVE;
        case 3: return RCMD_DYNAMIC;
        case 0: return RCMDITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RcmdItemCase
  getRcmdItemCase() {
    return RcmdItemCase.forNumber(
        rcmdItemCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int RCMD_ARCHIVE_FIELD_NUMBER = 2;
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
   * @return Whether the rcmdArchive field is set.
   */
  @java.lang.Override
  public boolean hasRcmdArchive() {
    return rcmdItemCase_ == 2;
  }
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
   * @return The rcmdArchive.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.OfficialRcmdArchive getRcmdArchive() {
    if (rcmdItemCase_ == 2) {
       return (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_;
    }
    return bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
  }
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.OfficialRcmdArchiveOrBuilder getRcmdArchiveOrBuilder() {
    if (rcmdItemCase_ == 2) {
       return (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_;
    }
    return bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
  }

  public static final int RCMD_DYNAMIC_FIELD_NUMBER = 3;
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
   * @return Whether the rcmdDynamic field is set.
   */
  @java.lang.Override
  public boolean hasRcmdDynamic() {
    return rcmdItemCase_ == 3;
  }
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
   * @return The rcmdDynamic.
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.OfficialRcmdDynamic getRcmdDynamic() {
    if (rcmdItemCase_ == 3) {
       return (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_;
    }
    return bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
  }
  /**
   * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.OfficialRcmdDynamicOrBuilder getRcmdDynamicOrBuilder() {
    if (rcmdItemCase_ == 3) {
       return (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_;
    }
    return bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (rcmdItemCase_ == 2) {
      output.writeMessage(2, (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_);
    }
    if (rcmdItemCase_ == 3) {
      output.writeMessage(3, (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (rcmdItemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_);
    }
    if (rcmdItemCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_);
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
    if (!(obj instanceof bilibili.app.dynamic.v2.OfficialItem)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.OfficialItem other = (bilibili.app.dynamic.v2.OfficialItem) obj;

    if (getType()
        != other.getType()) return false;
    if (!getRcmdItemCase().equals(other.getRcmdItemCase())) return false;
    switch (rcmdItemCase_) {
      case 2:
        if (!getRcmdArchive()
            .equals(other.getRcmdArchive())) return false;
        break;
      case 3:
        if (!getRcmdDynamic()
            .equals(other.getRcmdDynamic())) return false;
        break;
      case 0:
      default:
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
    hash = (53 * hash) + getType();
    switch (rcmdItemCase_) {
      case 2:
        hash = (37 * hash) + RCMD_ARCHIVE_FIELD_NUMBER;
        hash = (53 * hash) + getRcmdArchive().hashCode();
        break;
      case 3:
        hash = (37 * hash) + RCMD_DYNAMIC_FIELD_NUMBER;
        hash = (53 * hash) + getRcmdDynamic().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.OfficialItem parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.OfficialItem prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.OfficialItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.OfficialItem)
      bilibili.app.dynamic.v2.OfficialItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_OfficialItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_OfficialItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.OfficialItem.class, bilibili.app.dynamic.v2.OfficialItem.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.OfficialItem.newBuilder()
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
      if (rcmdArchiveBuilder_ != null) {
        rcmdArchiveBuilder_.clear();
      }
      if (rcmdDynamicBuilder_ != null) {
        rcmdDynamicBuilder_.clear();
      }
      rcmdItemCase_ = 0;
      rcmdItem_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_OfficialItem_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialItem getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.OfficialItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialItem build() {
      bilibili.app.dynamic.v2.OfficialItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialItem buildPartial() {
      bilibili.app.dynamic.v2.OfficialItem result = new bilibili.app.dynamic.v2.OfficialItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.dynamic.v2.OfficialItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
    }

    private void buildPartialOneofs(bilibili.app.dynamic.v2.OfficialItem result) {
      result.rcmdItemCase_ = rcmdItemCase_;
      result.rcmdItem_ = this.rcmdItem_;
      if (rcmdItemCase_ == 2 &&
          rcmdArchiveBuilder_ != null) {
        result.rcmdItem_ = rcmdArchiveBuilder_.build();
      }
      if (rcmdItemCase_ == 3 &&
          rcmdDynamicBuilder_ != null) {
        result.rcmdItem_ = rcmdDynamicBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.OfficialItem) {
        return mergeFrom((bilibili.app.dynamic.v2.OfficialItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.OfficialItem other) {
      if (other == bilibili.app.dynamic.v2.OfficialItem.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      switch (other.getRcmdItemCase()) {
        case RCMD_ARCHIVE: {
          mergeRcmdArchive(other.getRcmdArchive());
          break;
        }
        case RCMD_DYNAMIC: {
          mergeRcmdDynamic(other.getRcmdDynamic());
          break;
        }
        case RCMDITEM_NOT_SET: {
          break;
        }
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
              type_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRcmdArchiveFieldBuilder().getBuilder(),
                  extensionRegistry);
              rcmdItemCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRcmdDynamicFieldBuilder().getBuilder(),
                  extensionRegistry);
              rcmdItemCase_ = 3;
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
    private int rcmdItemCase_ = 0;
    private java.lang.Object rcmdItem_;
    public RcmdItemCase
        getRcmdItemCase() {
      return RcmdItemCase.forNumber(
          rcmdItemCase_);
    }

    public Builder clearRcmdItem() {
      rcmdItemCase_ = 0;
      rcmdItem_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int type_ ;
    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.OfficialRcmdArchive, bilibili.app.dynamic.v2.OfficialRcmdArchive.Builder, bilibili.app.dynamic.v2.OfficialRcmdArchiveOrBuilder> rcmdArchiveBuilder_;
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     * @return Whether the rcmdArchive field is set.
     */
    @java.lang.Override
    public boolean hasRcmdArchive() {
      return rcmdItemCase_ == 2;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     * @return The rcmdArchive.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialRcmdArchive getRcmdArchive() {
      if (rcmdArchiveBuilder_ == null) {
        if (rcmdItemCase_ == 2) {
          return (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_;
        }
        return bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
      } else {
        if (rcmdItemCase_ == 2) {
          return rcmdArchiveBuilder_.getMessage();
        }
        return bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    public Builder setRcmdArchive(bilibili.app.dynamic.v2.OfficialRcmdArchive value) {
      if (rcmdArchiveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rcmdItem_ = value;
        onChanged();
      } else {
        rcmdArchiveBuilder_.setMessage(value);
      }
      rcmdItemCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    public Builder setRcmdArchive(
        bilibili.app.dynamic.v2.OfficialRcmdArchive.Builder builderForValue) {
      if (rcmdArchiveBuilder_ == null) {
        rcmdItem_ = builderForValue.build();
        onChanged();
      } else {
        rcmdArchiveBuilder_.setMessage(builderForValue.build());
      }
      rcmdItemCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    public Builder mergeRcmdArchive(bilibili.app.dynamic.v2.OfficialRcmdArchive value) {
      if (rcmdArchiveBuilder_ == null) {
        if (rcmdItemCase_ == 2 &&
            rcmdItem_ != bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance()) {
          rcmdItem_ = bilibili.app.dynamic.v2.OfficialRcmdArchive.newBuilder((bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_)
              .mergeFrom(value).buildPartial();
        } else {
          rcmdItem_ = value;
        }
        onChanged();
      } else {
        if (rcmdItemCase_ == 2) {
          rcmdArchiveBuilder_.mergeFrom(value);
        } else {
          rcmdArchiveBuilder_.setMessage(value);
        }
      }
      rcmdItemCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    public Builder clearRcmdArchive() {
      if (rcmdArchiveBuilder_ == null) {
        if (rcmdItemCase_ == 2) {
          rcmdItemCase_ = 0;
          rcmdItem_ = null;
          onChanged();
        }
      } else {
        if (rcmdItemCase_ == 2) {
          rcmdItemCase_ = 0;
          rcmdItem_ = null;
        }
        rcmdArchiveBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    public bilibili.app.dynamic.v2.OfficialRcmdArchive.Builder getRcmdArchiveBuilder() {
      return getRcmdArchiveFieldBuilder().getBuilder();
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialRcmdArchiveOrBuilder getRcmdArchiveOrBuilder() {
      if ((rcmdItemCase_ == 2) && (rcmdArchiveBuilder_ != null)) {
        return rcmdArchiveBuilder_.getMessageOrBuilder();
      } else {
        if (rcmdItemCase_ == 2) {
          return (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_;
        }
        return bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdArchive rcmd_archive = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.OfficialRcmdArchive, bilibili.app.dynamic.v2.OfficialRcmdArchive.Builder, bilibili.app.dynamic.v2.OfficialRcmdArchiveOrBuilder> 
        getRcmdArchiveFieldBuilder() {
      if (rcmdArchiveBuilder_ == null) {
        if (!(rcmdItemCase_ == 2)) {
          rcmdItem_ = bilibili.app.dynamic.v2.OfficialRcmdArchive.getDefaultInstance();
        }
        rcmdArchiveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.OfficialRcmdArchive, bilibili.app.dynamic.v2.OfficialRcmdArchive.Builder, bilibili.app.dynamic.v2.OfficialRcmdArchiveOrBuilder>(
                (bilibili.app.dynamic.v2.OfficialRcmdArchive) rcmdItem_,
                getParentForChildren(),
                isClean());
        rcmdItem_ = null;
      }
      rcmdItemCase_ = 2;
      onChanged();
      return rcmdArchiveBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.OfficialRcmdDynamic, bilibili.app.dynamic.v2.OfficialRcmdDynamic.Builder, bilibili.app.dynamic.v2.OfficialRcmdDynamicOrBuilder> rcmdDynamicBuilder_;
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     * @return Whether the rcmdDynamic field is set.
     */
    @java.lang.Override
    public boolean hasRcmdDynamic() {
      return rcmdItemCase_ == 3;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     * @return The rcmdDynamic.
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialRcmdDynamic getRcmdDynamic() {
      if (rcmdDynamicBuilder_ == null) {
        if (rcmdItemCase_ == 3) {
          return (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_;
        }
        return bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
      } else {
        if (rcmdItemCase_ == 3) {
          return rcmdDynamicBuilder_.getMessage();
        }
        return bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    public Builder setRcmdDynamic(bilibili.app.dynamic.v2.OfficialRcmdDynamic value) {
      if (rcmdDynamicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rcmdItem_ = value;
        onChanged();
      } else {
        rcmdDynamicBuilder_.setMessage(value);
      }
      rcmdItemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    public Builder setRcmdDynamic(
        bilibili.app.dynamic.v2.OfficialRcmdDynamic.Builder builderForValue) {
      if (rcmdDynamicBuilder_ == null) {
        rcmdItem_ = builderForValue.build();
        onChanged();
      } else {
        rcmdDynamicBuilder_.setMessage(builderForValue.build());
      }
      rcmdItemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    public Builder mergeRcmdDynamic(bilibili.app.dynamic.v2.OfficialRcmdDynamic value) {
      if (rcmdDynamicBuilder_ == null) {
        if (rcmdItemCase_ == 3 &&
            rcmdItem_ != bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance()) {
          rcmdItem_ = bilibili.app.dynamic.v2.OfficialRcmdDynamic.newBuilder((bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_)
              .mergeFrom(value).buildPartial();
        } else {
          rcmdItem_ = value;
        }
        onChanged();
      } else {
        if (rcmdItemCase_ == 3) {
          rcmdDynamicBuilder_.mergeFrom(value);
        } else {
          rcmdDynamicBuilder_.setMessage(value);
        }
      }
      rcmdItemCase_ = 3;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    public Builder clearRcmdDynamic() {
      if (rcmdDynamicBuilder_ == null) {
        if (rcmdItemCase_ == 3) {
          rcmdItemCase_ = 0;
          rcmdItem_ = null;
          onChanged();
        }
      } else {
        if (rcmdItemCase_ == 3) {
          rcmdItemCase_ = 0;
          rcmdItem_ = null;
        }
        rcmdDynamicBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    public bilibili.app.dynamic.v2.OfficialRcmdDynamic.Builder getRcmdDynamicBuilder() {
      return getRcmdDynamicFieldBuilder().getBuilder();
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    @java.lang.Override
    public bilibili.app.dynamic.v2.OfficialRcmdDynamicOrBuilder getRcmdDynamicOrBuilder() {
      if ((rcmdItemCase_ == 3) && (rcmdDynamicBuilder_ != null)) {
        return rcmdDynamicBuilder_.getMessageOrBuilder();
      } else {
        if (rcmdItemCase_ == 3) {
          return (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_;
        }
        return bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v2.OfficialRcmdDynamic rcmd_dynamic = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.dynamic.v2.OfficialRcmdDynamic, bilibili.app.dynamic.v2.OfficialRcmdDynamic.Builder, bilibili.app.dynamic.v2.OfficialRcmdDynamicOrBuilder> 
        getRcmdDynamicFieldBuilder() {
      if (rcmdDynamicBuilder_ == null) {
        if (!(rcmdItemCase_ == 3)) {
          rcmdItem_ = bilibili.app.dynamic.v2.OfficialRcmdDynamic.getDefaultInstance();
        }
        rcmdDynamicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.dynamic.v2.OfficialRcmdDynamic, bilibili.app.dynamic.v2.OfficialRcmdDynamic.Builder, bilibili.app.dynamic.v2.OfficialRcmdDynamicOrBuilder>(
                (bilibili.app.dynamic.v2.OfficialRcmdDynamic) rcmdItem_,
                getParentForChildren(),
                isClean());
        rcmdItem_ = null;
      }
      rcmdItemCase_ = 3;
      onChanged();
      return rcmdDynamicBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.OfficialItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.OfficialItem)
  private static final bilibili.app.dynamic.v2.OfficialItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.OfficialItem();
  }

  public static bilibili.app.dynamic.v2.OfficialItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfficialItem>
      PARSER = new com.google.protobuf.AbstractParser<OfficialItem>() {
    @java.lang.Override
    public OfficialItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfficialItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfficialItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.OfficialItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

