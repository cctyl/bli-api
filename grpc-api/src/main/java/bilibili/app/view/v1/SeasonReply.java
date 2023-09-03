// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 合集详情页-响应
 * </pre>
 *
 * Protobuf type {@code bilibili.app.view.v1.SeasonReply}
 */
public final class SeasonReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.view.v1.SeasonReply)
    SeasonReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeasonReply.newBuilder() to construct.
  private SeasonReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeasonReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeasonReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.view.v1.SeasonReply.class, bilibili.app.view.v1.SeasonReply.Builder.class);
  }

  public static final int SEASON_FIELD_NUMBER = 1;
  private bilibili.app.view.v1.UgcSeason season_;
  /**
   * <pre>
   * 合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
   * @return Whether the season field is set.
   */
  @java.lang.Override
  public boolean hasSeason() {
    return season_ != null;
  }
  /**
   * <pre>
   * 合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
   * @return The season.
   */
  @java.lang.Override
  public bilibili.app.view.v1.UgcSeason getSeason() {
    return season_ == null ? bilibili.app.view.v1.UgcSeason.getDefaultInstance() : season_;
  }
  /**
   * <pre>
   * 合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.view.v1.UgcSeasonOrBuilder getSeasonOrBuilder() {
    return season_ == null ? bilibili.app.view.v1.UgcSeason.getDefaultInstance() : season_;
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
    if (season_ != null) {
      output.writeMessage(1, getSeason());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (season_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSeason());
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
    if (!(obj instanceof bilibili.app.view.v1.SeasonReply)) {
      return super.equals(obj);
    }
    bilibili.app.view.v1.SeasonReply other = (bilibili.app.view.v1.SeasonReply) obj;

    if (hasSeason() != other.hasSeason()) return false;
    if (hasSeason()) {
      if (!getSeason()
          .equals(other.getSeason())) return false;
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
    if (hasSeason()) {
      hash = (37 * hash) + SEASON_FIELD_NUMBER;
      hash = (53 * hash) + getSeason().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.view.v1.SeasonReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.view.v1.SeasonReply parseFrom(
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
  public static Builder newBuilder(bilibili.app.view.v1.SeasonReply prototype) {
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
   * 合集详情页-响应
   * </pre>
   *
   * Protobuf type {@code bilibili.app.view.v1.SeasonReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.view.v1.SeasonReply)
      bilibili.app.view.v1.SeasonReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.view.v1.SeasonReply.class, bilibili.app.view.v1.SeasonReply.Builder.class);
    }

    // Construct using bilibili.app.view.v1.SeasonReply.newBuilder()
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
      season_ = null;
      if (seasonBuilder_ != null) {
        seasonBuilder_.dispose();
        seasonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.view.v1.ViewOuterClass.internal_static_bilibili_app_view_v1_SeasonReply_descriptor;
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonReply getDefaultInstanceForType() {
      return bilibili.app.view.v1.SeasonReply.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonReply build() {
      bilibili.app.view.v1.SeasonReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.view.v1.SeasonReply buildPartial() {
      bilibili.app.view.v1.SeasonReply result = new bilibili.app.view.v1.SeasonReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.view.v1.SeasonReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.season_ = seasonBuilder_ == null
            ? season_
            : seasonBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.view.v1.SeasonReply) {
        return mergeFrom((bilibili.app.view.v1.SeasonReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.view.v1.SeasonReply other) {
      if (other == bilibili.app.view.v1.SeasonReply.getDefaultInstance()) return this;
      if (other.hasSeason()) {
        mergeSeason(other.getSeason());
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
                  getSeasonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private bilibili.app.view.v1.UgcSeason season_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.UgcSeason, bilibili.app.view.v1.UgcSeason.Builder, bilibili.app.view.v1.UgcSeasonOrBuilder> seasonBuilder_;
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     * @return Whether the season field is set.
     */
    public boolean hasSeason() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     * @return The season.
     */
    public bilibili.app.view.v1.UgcSeason getSeason() {
      if (seasonBuilder_ == null) {
        return season_ == null ? bilibili.app.view.v1.UgcSeason.getDefaultInstance() : season_;
      } else {
        return seasonBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public Builder setSeason(bilibili.app.view.v1.UgcSeason value) {
      if (seasonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        season_ = value;
      } else {
        seasonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public Builder setSeason(
        bilibili.app.view.v1.UgcSeason.Builder builderForValue) {
      if (seasonBuilder_ == null) {
        season_ = builderForValue.build();
      } else {
        seasonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public Builder mergeSeason(bilibili.app.view.v1.UgcSeason value) {
      if (seasonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          season_ != null &&
          season_ != bilibili.app.view.v1.UgcSeason.getDefaultInstance()) {
          getSeasonBuilder().mergeFrom(value);
        } else {
          season_ = value;
        }
      } else {
        seasonBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public Builder clearSeason() {
      bitField0_ = (bitField0_ & ~0x00000001);
      season_ = null;
      if (seasonBuilder_ != null) {
        seasonBuilder_.dispose();
        seasonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public bilibili.app.view.v1.UgcSeason.Builder getSeasonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSeasonFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    public bilibili.app.view.v1.UgcSeasonOrBuilder getSeasonOrBuilder() {
      if (seasonBuilder_ != null) {
        return seasonBuilder_.getMessageOrBuilder();
      } else {
        return season_ == null ?
            bilibili.app.view.v1.UgcSeason.getDefaultInstance() : season_;
      }
    }
    /**
     * <pre>
     * 合集信息
     * </pre>
     *
     * <code>.bilibili.app.view.v1.UgcSeason season = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.app.view.v1.UgcSeason, bilibili.app.view.v1.UgcSeason.Builder, bilibili.app.view.v1.UgcSeasonOrBuilder> 
        getSeasonFieldBuilder() {
      if (seasonBuilder_ == null) {
        seasonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.app.view.v1.UgcSeason, bilibili.app.view.v1.UgcSeason.Builder, bilibili.app.view.v1.UgcSeasonOrBuilder>(
                getSeason(),
                getParentForChildren(),
                isClean());
        season_ = null;
      }
      return seasonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.view.v1.SeasonReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.view.v1.SeasonReply)
  private static final bilibili.app.view.v1.SeasonReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.view.v1.SeasonReply();
  }

  public static bilibili.app.view.v1.SeasonReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeasonReply>
      PARSER = new com.google.protobuf.AbstractParser<SeasonReply>() {
    @java.lang.Override
    public SeasonReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SeasonReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeasonReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.view.v1.SeasonReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

