// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * 提权样式
 * </pre>
 *
 * Protobuf type {@code bilibili.dynamic.gateway.WeightItem}
 */
public final class WeightItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.dynamic.gateway.WeightItem)
    WeightItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightItem.newBuilder() to construct.
  private WeightItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightItem() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeightItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_WeightItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_WeightItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.dynamic.gateway.WeightItem.class, bilibili.dynamic.gateway.WeightItem.Builder.class);
  }

  private int itemCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object item_;
  public enum ItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BUTTON(2),
    DISLIKE(3),
    ITEM_NOT_SET(0);
    private final int value;
    private ItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static ItemCase forNumber(int value) {
      switch (value) {
        case 2: return BUTTON;
        case 3: return DISLIKE;
        case 0: return ITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ItemCase
  getItemCase() {
    return ItemCase.forNumber(
        itemCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public bilibili.dynamic.gateway.WeightType getType() {
    bilibili.dynamic.gateway.WeightType result = bilibili.dynamic.gateway.WeightType.forNumber(type_);
    return result == null ? bilibili.dynamic.gateway.WeightType.UNRECOGNIZED : result;
  }

  public static final int BUTTON_FIELD_NUMBER = 2;
  /**
   * <pre>
   * 热门默认跳转按钮
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
   * @return Whether the button field is set.
   */
  @java.lang.Override
  public boolean hasButton() {
    return itemCase_ == 2;
  }
  /**
   * <pre>
   * 热门默认跳转按钮
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
   * @return The button.
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.WeightButton getButton() {
    if (itemCase_ == 2) {
       return (bilibili.dynamic.gateway.WeightButton) item_;
    }
    return bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
  }
  /**
   * <pre>
   * 热门默认跳转按钮
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.WeightButtonOrBuilder getButtonOrBuilder() {
    if (itemCase_ == 2) {
       return (bilibili.dynamic.gateway.WeightButton) item_;
    }
    return bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
  }

  public static final int DISLIKE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * 提权不感兴趣
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
   * @return Whether the dislike field is set.
   */
  @java.lang.Override
  public boolean hasDislike() {
    return itemCase_ == 3;
  }
  /**
   * <pre>
   * 提权不感兴趣
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
   * @return The dislike.
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.WeightDislike getDislike() {
    if (itemCase_ == 3) {
       return (bilibili.dynamic.gateway.WeightDislike) item_;
    }
    return bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
  }
  /**
   * <pre>
   * 提权不感兴趣
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
   */
  @java.lang.Override
  public bilibili.dynamic.gateway.WeightDislikeOrBuilder getDislikeOrBuilder() {
    if (itemCase_ == 3) {
       return (bilibili.dynamic.gateway.WeightDislike) item_;
    }
    return bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
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
    if (type_ != bilibili.dynamic.gateway.WeightType.weight_none.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (itemCase_ == 2) {
      output.writeMessage(2, (bilibili.dynamic.gateway.WeightButton) item_);
    }
    if (itemCase_ == 3) {
      output.writeMessage(3, (bilibili.dynamic.gateway.WeightDislike) item_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != bilibili.dynamic.gateway.WeightType.weight_none.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (itemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (bilibili.dynamic.gateway.WeightButton) item_);
    }
    if (itemCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (bilibili.dynamic.gateway.WeightDislike) item_);
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
    if (!(obj instanceof bilibili.dynamic.gateway.WeightItem)) {
      return super.equals(obj);
    }
    bilibili.dynamic.gateway.WeightItem other = (bilibili.dynamic.gateway.WeightItem) obj;

    if (type_ != other.type_) return false;
    if (!getItemCase().equals(other.getItemCase())) return false;
    switch (itemCase_) {
      case 2:
        if (!getButton()
            .equals(other.getButton())) return false;
        break;
      case 3:
        if (!getDislike()
            .equals(other.getDislike())) return false;
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
    hash = (53 * hash) + type_;
    switch (itemCase_) {
      case 2:
        hash = (37 * hash) + BUTTON_FIELD_NUMBER;
        hash = (53 * hash) + getButton().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DISLIKE_FIELD_NUMBER;
        hash = (53 * hash) + getDislike().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.WeightItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.WeightItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.dynamic.gateway.WeightItem parseFrom(
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
  public static Builder newBuilder(bilibili.dynamic.gateway.WeightItem prototype) {
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
   * 提权样式
   * </pre>
   *
   * Protobuf type {@code bilibili.dynamic.gateway.WeightItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.dynamic.gateway.WeightItem)
      bilibili.dynamic.gateway.WeightItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_WeightItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_WeightItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.dynamic.gateway.WeightItem.class, bilibili.dynamic.gateway.WeightItem.Builder.class);
    }

    // Construct using bilibili.dynamic.gateway.WeightItem.newBuilder()
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
      if (buttonBuilder_ != null) {
        buttonBuilder_.clear();
      }
      if (dislikeBuilder_ != null) {
        dislikeBuilder_.clear();
      }
      itemCase_ = 0;
      item_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.dynamic.gateway.Gateway.internal_static_bilibili_dynamic_gateway_WeightItem_descriptor;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.WeightItem getDefaultInstanceForType() {
      return bilibili.dynamic.gateway.WeightItem.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.WeightItem build() {
      bilibili.dynamic.gateway.WeightItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.dynamic.gateway.WeightItem buildPartial() {
      bilibili.dynamic.gateway.WeightItem result = new bilibili.dynamic.gateway.WeightItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.dynamic.gateway.WeightItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
    }

    private void buildPartialOneofs(bilibili.dynamic.gateway.WeightItem result) {
      result.itemCase_ = itemCase_;
      result.item_ = this.item_;
      if (itemCase_ == 2 &&
          buttonBuilder_ != null) {
        result.item_ = buttonBuilder_.build();
      }
      if (itemCase_ == 3 &&
          dislikeBuilder_ != null) {
        result.item_ = dislikeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.dynamic.gateway.WeightItem) {
        return mergeFrom((bilibili.dynamic.gateway.WeightItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.dynamic.gateway.WeightItem other) {
      if (other == bilibili.dynamic.gateway.WeightItem.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      switch (other.getItemCase()) {
        case BUTTON: {
          mergeButton(other.getButton());
          break;
        }
        case DISLIKE: {
          mergeDislike(other.getDislike());
          break;
        }
        case ITEM_NOT_SET: {
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getButtonFieldBuilder().getBuilder(),
                  extensionRegistry);
              itemCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDislikeFieldBuilder().getBuilder(),
                  extensionRegistry);
              itemCase_ = 3;
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
    private int itemCase_ = 0;
    private java.lang.Object item_;
    public ItemCase
        getItemCase() {
      return ItemCase.forNumber(
          itemCase_);
    }

    public Builder clearItem() {
      itemCase_ = 0;
      item_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
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
     * 类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.WeightType getType() {
      bilibili.dynamic.gateway.WeightType result = bilibili.dynamic.gateway.WeightType.forNumber(type_);
      return result == null ? bilibili.dynamic.gateway.WeightType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(bilibili.dynamic.gateway.WeightType value) {
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
     * 类型
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.WeightButton, bilibili.dynamic.gateway.WeightButton.Builder, bilibili.dynamic.gateway.WeightButtonOrBuilder> buttonBuilder_;
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     * @return Whether the button field is set.
     */
    @java.lang.Override
    public boolean hasButton() {
      return itemCase_ == 2;
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     * @return The button.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.WeightButton getButton() {
      if (buttonBuilder_ == null) {
        if (itemCase_ == 2) {
          return (bilibili.dynamic.gateway.WeightButton) item_;
        }
        return bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
      } else {
        if (itemCase_ == 2) {
          return buttonBuilder_.getMessage();
        }
        return bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    public Builder setButton(bilibili.dynamic.gateway.WeightButton value) {
      if (buttonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        buttonBuilder_.setMessage(value);
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    public Builder setButton(
        bilibili.dynamic.gateway.WeightButton.Builder builderForValue) {
      if (buttonBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        buttonBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    public Builder mergeButton(bilibili.dynamic.gateway.WeightButton value) {
      if (buttonBuilder_ == null) {
        if (itemCase_ == 2 &&
            item_ != bilibili.dynamic.gateway.WeightButton.getDefaultInstance()) {
          item_ = bilibili.dynamic.gateway.WeightButton.newBuilder((bilibili.dynamic.gateway.WeightButton) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 2) {
          buttonBuilder_.mergeFrom(value);
        } else {
          buttonBuilder_.setMessage(value);
        }
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    public Builder clearButton() {
      if (buttonBuilder_ == null) {
        if (itemCase_ == 2) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 2) {
          itemCase_ = 0;
          item_ = null;
        }
        buttonBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    public bilibili.dynamic.gateway.WeightButton.Builder getButtonBuilder() {
      return getButtonFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.WeightButtonOrBuilder getButtonOrBuilder() {
      if ((itemCase_ == 2) && (buttonBuilder_ != null)) {
        return buttonBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 2) {
          return (bilibili.dynamic.gateway.WeightButton) item_;
        }
        return bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 热门默认跳转按钮
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightButton button = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.WeightButton, bilibili.dynamic.gateway.WeightButton.Builder, bilibili.dynamic.gateway.WeightButtonOrBuilder> 
        getButtonFieldBuilder() {
      if (buttonBuilder_ == null) {
        if (!(itemCase_ == 2)) {
          item_ = bilibili.dynamic.gateway.WeightButton.getDefaultInstance();
        }
        buttonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.gateway.WeightButton, bilibili.dynamic.gateway.WeightButton.Builder, bilibili.dynamic.gateway.WeightButtonOrBuilder>(
                (bilibili.dynamic.gateway.WeightButton) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 2;
      onChanged();
      return buttonBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.WeightDislike, bilibili.dynamic.gateway.WeightDislike.Builder, bilibili.dynamic.gateway.WeightDislikeOrBuilder> dislikeBuilder_;
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     * @return Whether the dislike field is set.
     */
    @java.lang.Override
    public boolean hasDislike() {
      return itemCase_ == 3;
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     * @return The dislike.
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.WeightDislike getDislike() {
      if (dislikeBuilder_ == null) {
        if (itemCase_ == 3) {
          return (bilibili.dynamic.gateway.WeightDislike) item_;
        }
        return bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
      } else {
        if (itemCase_ == 3) {
          return dislikeBuilder_.getMessage();
        }
        return bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    public Builder setDislike(bilibili.dynamic.gateway.WeightDislike value) {
      if (dislikeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        dislikeBuilder_.setMessage(value);
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    public Builder setDislike(
        bilibili.dynamic.gateway.WeightDislike.Builder builderForValue) {
      if (dislikeBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        dislikeBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    public Builder mergeDislike(bilibili.dynamic.gateway.WeightDislike value) {
      if (dislikeBuilder_ == null) {
        if (itemCase_ == 3 &&
            item_ != bilibili.dynamic.gateway.WeightDislike.getDefaultInstance()) {
          item_ = bilibili.dynamic.gateway.WeightDislike.newBuilder((bilibili.dynamic.gateway.WeightDislike) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 3) {
          dislikeBuilder_.mergeFrom(value);
        } else {
          dislikeBuilder_.setMessage(value);
        }
      }
      itemCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    public Builder clearDislike() {
      if (dislikeBuilder_ == null) {
        if (itemCase_ == 3) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 3) {
          itemCase_ = 0;
          item_ = null;
        }
        dislikeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    public bilibili.dynamic.gateway.WeightDislike.Builder getDislikeBuilder() {
      return getDislikeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    @java.lang.Override
    public bilibili.dynamic.gateway.WeightDislikeOrBuilder getDislikeOrBuilder() {
      if ((itemCase_ == 3) && (dislikeBuilder_ != null)) {
        return dislikeBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 3) {
          return (bilibili.dynamic.gateway.WeightDislike) item_;
        }
        return bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 提权不感兴趣
     * </pre>
     *
     * <code>.bilibili.dynamic.gateway.WeightDislike dislike = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.dynamic.gateway.WeightDislike, bilibili.dynamic.gateway.WeightDislike.Builder, bilibili.dynamic.gateway.WeightDislikeOrBuilder> 
        getDislikeFieldBuilder() {
      if (dislikeBuilder_ == null) {
        if (!(itemCase_ == 3)) {
          item_ = bilibili.dynamic.gateway.WeightDislike.getDefaultInstance();
        }
        dislikeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.dynamic.gateway.WeightDislike, bilibili.dynamic.gateway.WeightDislike.Builder, bilibili.dynamic.gateway.WeightDislikeOrBuilder>(
                (bilibili.dynamic.gateway.WeightDislike) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 3;
      onChanged();
      return dislikeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.dynamic.gateway.WeightItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.dynamic.gateway.WeightItem)
  private static final bilibili.dynamic.gateway.WeightItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.dynamic.gateway.WeightItem();
  }

  public static bilibili.dynamic.gateway.WeightItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightItem>
      PARSER = new com.google.protobuf.AbstractParser<WeightItem>() {
    @java.lang.Override
    public WeightItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeightItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeightItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.dynamic.gateway.WeightItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

