// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.search.v1.CardBusinessBadge}
 */
public final class CardBusinessBadge extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.search.v1.CardBusinessBadge)
    CardBusinessBadgeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardBusinessBadge.newBuilder() to construct.
  private CardBusinessBadge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardBusinessBadge() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardBusinessBadge();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_CardBusinessBadge_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_CardBusinessBadge_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.search.v1.CardBusinessBadge.class, bilibili.polymer.app.search.v1.CardBusinessBadge.Builder.class);
  }

  public static final int GOTO_ICON_FIELD_NUMBER = 1;
  private bilibili.polymer.app.search.v1.GotoIcon gotoIcon_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
   * @return Whether the gotoIcon field is set.
   */
  @java.lang.Override
  public boolean hasGotoIcon() {
    return gotoIcon_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
   * @return The gotoIcon.
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.GotoIcon getGotoIcon() {
    return gotoIcon_ == null ? bilibili.polymer.app.search.v1.GotoIcon.getDefaultInstance() : gotoIcon_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.GotoIconOrBuilder getGotoIconOrBuilder() {
    return gotoIcon_ == null ? bilibili.polymer.app.search.v1.GotoIcon.getDefaultInstance() : gotoIcon_;
  }

  public static final int BADGE_STYLE_FIELD_NUMBER = 2;
  private bilibili.polymer.app.search.v1.ReasonStyle badgeStyle_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
   * @return Whether the badgeStyle field is set.
   */
  @java.lang.Override
  public boolean hasBadgeStyle() {
    return badgeStyle_ != null;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
   * @return The badgeStyle.
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.ReasonStyle getBadgeStyle() {
    return badgeStyle_ == null ? bilibili.polymer.app.search.v1.ReasonStyle.getDefaultInstance() : badgeStyle_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
   */
  @java.lang.Override
  public bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getBadgeStyleOrBuilder() {
    return badgeStyle_ == null ? bilibili.polymer.app.search.v1.ReasonStyle.getDefaultInstance() : badgeStyle_;
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
    if (gotoIcon_ != null) {
      output.writeMessage(1, getGotoIcon());
    }
    if (badgeStyle_ != null) {
      output.writeMessage(2, getBadgeStyle());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gotoIcon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGotoIcon());
    }
    if (badgeStyle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBadgeStyle());
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
    if (!(obj instanceof bilibili.polymer.app.search.v1.CardBusinessBadge)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.search.v1.CardBusinessBadge other = (bilibili.polymer.app.search.v1.CardBusinessBadge) obj;

    if (hasGotoIcon() != other.hasGotoIcon()) return false;
    if (hasGotoIcon()) {
      if (!getGotoIcon()
          .equals(other.getGotoIcon())) return false;
    }
    if (hasBadgeStyle() != other.hasBadgeStyle()) return false;
    if (hasBadgeStyle()) {
      if (!getBadgeStyle()
          .equals(other.getBadgeStyle())) return false;
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
    if (hasGotoIcon()) {
      hash = (37 * hash) + GOTO_ICON_FIELD_NUMBER;
      hash = (53 * hash) + getGotoIcon().hashCode();
    }
    if (hasBadgeStyle()) {
      hash = (37 * hash) + BADGE_STYLE_FIELD_NUMBER;
      hash = (53 * hash) + getBadgeStyle().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.search.v1.CardBusinessBadge parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.search.v1.CardBusinessBadge prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.search.v1.CardBusinessBadge}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.search.v1.CardBusinessBadge)
      bilibili.polymer.app.search.v1.CardBusinessBadgeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_CardBusinessBadge_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_CardBusinessBadge_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.search.v1.CardBusinessBadge.class, bilibili.polymer.app.search.v1.CardBusinessBadge.Builder.class);
    }

    // Construct using bilibili.polymer.app.search.v1.CardBusinessBadge.newBuilder()
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
      gotoIcon_ = null;
      if (gotoIconBuilder_ != null) {
        gotoIconBuilder_.dispose();
        gotoIconBuilder_ = null;
      }
      badgeStyle_ = null;
      if (badgeStyleBuilder_ != null) {
        badgeStyleBuilder_.dispose();
        badgeStyleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.polymer.app.search.v1.SearchOuterClass.internal_static_bilibili_polymer_app_search_v1_CardBusinessBadge_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.CardBusinessBadge getDefaultInstanceForType() {
      return bilibili.polymer.app.search.v1.CardBusinessBadge.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.CardBusinessBadge build() {
      bilibili.polymer.app.search.v1.CardBusinessBadge result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.search.v1.CardBusinessBadge buildPartial() {
      bilibili.polymer.app.search.v1.CardBusinessBadge result = new bilibili.polymer.app.search.v1.CardBusinessBadge(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.polymer.app.search.v1.CardBusinessBadge result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gotoIcon_ = gotoIconBuilder_ == null
            ? gotoIcon_
            : gotoIconBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.badgeStyle_ = badgeStyleBuilder_ == null
            ? badgeStyle_
            : badgeStyleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.search.v1.CardBusinessBadge) {
        return mergeFrom((bilibili.polymer.app.search.v1.CardBusinessBadge)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.search.v1.CardBusinessBadge other) {
      if (other == bilibili.polymer.app.search.v1.CardBusinessBadge.getDefaultInstance()) return this;
      if (other.hasGotoIcon()) {
        mergeGotoIcon(other.getGotoIcon());
      }
      if (other.hasBadgeStyle()) {
        mergeBadgeStyle(other.getBadgeStyle());
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
                  getGotoIconFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBadgeStyleFieldBuilder().getBuilder(),
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

    private bilibili.polymer.app.search.v1.GotoIcon gotoIcon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.polymer.app.search.v1.GotoIcon, bilibili.polymer.app.search.v1.GotoIcon.Builder, bilibili.polymer.app.search.v1.GotoIconOrBuilder> gotoIconBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     * @return Whether the gotoIcon field is set.
     */
    public boolean hasGotoIcon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     * @return The gotoIcon.
     */
    public bilibili.polymer.app.search.v1.GotoIcon getGotoIcon() {
      if (gotoIconBuilder_ == null) {
        return gotoIcon_ == null ? bilibili.polymer.app.search.v1.GotoIcon.getDefaultInstance() : gotoIcon_;
      } else {
        return gotoIconBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public Builder setGotoIcon(bilibili.polymer.app.search.v1.GotoIcon value) {
      if (gotoIconBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gotoIcon_ = value;
      } else {
        gotoIconBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public Builder setGotoIcon(
        bilibili.polymer.app.search.v1.GotoIcon.Builder builderForValue) {
      if (gotoIconBuilder_ == null) {
        gotoIcon_ = builderForValue.build();
      } else {
        gotoIconBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public Builder mergeGotoIcon(bilibili.polymer.app.search.v1.GotoIcon value) {
      if (gotoIconBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          gotoIcon_ != null &&
          gotoIcon_ != bilibili.polymer.app.search.v1.GotoIcon.getDefaultInstance()) {
          getGotoIconBuilder().mergeFrom(value);
        } else {
          gotoIcon_ = value;
        }
      } else {
        gotoIconBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public Builder clearGotoIcon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gotoIcon_ = null;
      if (gotoIconBuilder_ != null) {
        gotoIconBuilder_.dispose();
        gotoIconBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public bilibili.polymer.app.search.v1.GotoIcon.Builder getGotoIconBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGotoIconFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    public bilibili.polymer.app.search.v1.GotoIconOrBuilder getGotoIconOrBuilder() {
      if (gotoIconBuilder_ != null) {
        return gotoIconBuilder_.getMessageOrBuilder();
      } else {
        return gotoIcon_ == null ?
            bilibili.polymer.app.search.v1.GotoIcon.getDefaultInstance() : gotoIcon_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.GotoIcon goto_icon = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.polymer.app.search.v1.GotoIcon, bilibili.polymer.app.search.v1.GotoIcon.Builder, bilibili.polymer.app.search.v1.GotoIconOrBuilder> 
        getGotoIconFieldBuilder() {
      if (gotoIconBuilder_ == null) {
        gotoIconBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.polymer.app.search.v1.GotoIcon, bilibili.polymer.app.search.v1.GotoIcon.Builder, bilibili.polymer.app.search.v1.GotoIconOrBuilder>(
                getGotoIcon(),
                getParentForChildren(),
                isClean());
        gotoIcon_ = null;
      }
      return gotoIconBuilder_;
    }

    private bilibili.polymer.app.search.v1.ReasonStyle badgeStyle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.polymer.app.search.v1.ReasonStyle, bilibili.polymer.app.search.v1.ReasonStyle.Builder, bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> badgeStyleBuilder_;
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     * @return Whether the badgeStyle field is set.
     */
    public boolean hasBadgeStyle() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     * @return The badgeStyle.
     */
    public bilibili.polymer.app.search.v1.ReasonStyle getBadgeStyle() {
      if (badgeStyleBuilder_ == null) {
        return badgeStyle_ == null ? bilibili.polymer.app.search.v1.ReasonStyle.getDefaultInstance() : badgeStyle_;
      } else {
        return badgeStyleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public Builder setBadgeStyle(bilibili.polymer.app.search.v1.ReasonStyle value) {
      if (badgeStyleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        badgeStyle_ = value;
      } else {
        badgeStyleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public Builder setBadgeStyle(
        bilibili.polymer.app.search.v1.ReasonStyle.Builder builderForValue) {
      if (badgeStyleBuilder_ == null) {
        badgeStyle_ = builderForValue.build();
      } else {
        badgeStyleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public Builder mergeBadgeStyle(bilibili.polymer.app.search.v1.ReasonStyle value) {
      if (badgeStyleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          badgeStyle_ != null &&
          badgeStyle_ != bilibili.polymer.app.search.v1.ReasonStyle.getDefaultInstance()) {
          getBadgeStyleBuilder().mergeFrom(value);
        } else {
          badgeStyle_ = value;
        }
      } else {
        badgeStyleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public Builder clearBadgeStyle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      badgeStyle_ = null;
      if (badgeStyleBuilder_ != null) {
        badgeStyleBuilder_.dispose();
        badgeStyleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public bilibili.polymer.app.search.v1.ReasonStyle.Builder getBadgeStyleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBadgeStyleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    public bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getBadgeStyleOrBuilder() {
      if (badgeStyleBuilder_ != null) {
        return badgeStyleBuilder_.getMessageOrBuilder();
      } else {
        return badgeStyle_ == null ?
            bilibili.polymer.app.search.v1.ReasonStyle.getDefaultInstance() : badgeStyle_;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.bilibili.polymer.app.search.v1.ReasonStyle badge_style = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.polymer.app.search.v1.ReasonStyle, bilibili.polymer.app.search.v1.ReasonStyle.Builder, bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> 
        getBadgeStyleFieldBuilder() {
      if (badgeStyleBuilder_ == null) {
        badgeStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.polymer.app.search.v1.ReasonStyle, bilibili.polymer.app.search.v1.ReasonStyle.Builder, bilibili.polymer.app.search.v1.ReasonStyleOrBuilder>(
                getBadgeStyle(),
                getParentForChildren(),
                isClean());
        badgeStyle_ = null;
      }
      return badgeStyleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.search.v1.CardBusinessBadge)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.search.v1.CardBusinessBadge)
  private static final bilibili.polymer.app.search.v1.CardBusinessBadge DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.search.v1.CardBusinessBadge();
  }

  public static bilibili.polymer.app.search.v1.CardBusinessBadge getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardBusinessBadge>
      PARSER = new com.google.protobuf.AbstractParser<CardBusinessBadge>() {
    @java.lang.Override
    public CardBusinessBadge parsePartialFrom(
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

  public static com.google.protobuf.Parser<CardBusinessBadge> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardBusinessBadge> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.search.v1.CardBusinessBadge getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

