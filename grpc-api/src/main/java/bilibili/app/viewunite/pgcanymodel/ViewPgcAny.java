// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/pgcanymodel.proto

package bilibili.app.viewunite.pgcanymodel;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.viewunite.pgcanymodel.ViewPgcAny}
 */
public final class ViewPgcAny extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.viewunite.pgcanymodel.ViewPgcAny)
    ViewPgcAnyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ViewPgcAny.newBuilder() to construct.
  private ViewPgcAny(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViewPgcAny() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ViewPgcAny();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.viewunite.pgcanymodel.Pgcanymodel.internal_static_bilibili_app_viewunite_pgcanymodel_ViewPgcAny_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.viewunite.pgcanymodel.Pgcanymodel.internal_static_bilibili_app_viewunite_pgcanymodel_ViewPgcAny_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.viewunite.pgcanymodel.ViewPgcAny.class, bilibili.app.viewunite.pgcanymodel.ViewPgcAny.Builder.class);
  }

  public static final int SEASON_ID_FIELD_NUMBER = 1;
  private long seasonId_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>uint64 season_id = 1;</code>
   * @return The seasonId.
   */
  @java.lang.Override
  public long getSeasonId() {
    return seasonId_;
  }

  public static final int SEASON_TYPE_FIELD_NUMBER = 2;
  private int seasonType_ = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 season_type = 2;</code>
   * @return The seasonType.
   */
  @java.lang.Override
  public int getSeasonType() {
    return seasonType_;
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
    if (seasonId_ != 0L) {
      output.writeUInt64(1, seasonId_);
    }
    if (seasonType_ != 0) {
      output.writeInt32(2, seasonType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seasonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, seasonId_);
    }
    if (seasonType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, seasonType_);
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
    if (!(obj instanceof bilibili.app.viewunite.pgcanymodel.ViewPgcAny)) {
      return super.equals(obj);
    }
    bilibili.app.viewunite.pgcanymodel.ViewPgcAny other = (bilibili.app.viewunite.pgcanymodel.ViewPgcAny) obj;

    if (getSeasonId()
        != other.getSeasonId()) return false;
    if (getSeasonType()
        != other.getSeasonType()) return false;
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
    hash = (37 * hash) + SEASON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeasonId());
    hash = (37 * hash) + SEASON_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSeasonType();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny parseFrom(
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
  public static Builder newBuilder(bilibili.app.viewunite.pgcanymodel.ViewPgcAny prototype) {
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
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.viewunite.pgcanymodel.ViewPgcAny}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.viewunite.pgcanymodel.ViewPgcAny)
      bilibili.app.viewunite.pgcanymodel.ViewPgcAnyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.viewunite.pgcanymodel.Pgcanymodel.internal_static_bilibili_app_viewunite_pgcanymodel_ViewPgcAny_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.viewunite.pgcanymodel.Pgcanymodel.internal_static_bilibili_app_viewunite_pgcanymodel_ViewPgcAny_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.viewunite.pgcanymodel.ViewPgcAny.class, bilibili.app.viewunite.pgcanymodel.ViewPgcAny.Builder.class);
    }

    // Construct using bilibili.app.viewunite.pgcanymodel.ViewPgcAny.newBuilder()
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
      seasonId_ = 0L;
      seasonType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.viewunite.pgcanymodel.Pgcanymodel.internal_static_bilibili_app_viewunite_pgcanymodel_ViewPgcAny_descriptor;
    }

    @java.lang.Override
    public bilibili.app.viewunite.pgcanymodel.ViewPgcAny getDefaultInstanceForType() {
      return bilibili.app.viewunite.pgcanymodel.ViewPgcAny.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.viewunite.pgcanymodel.ViewPgcAny build() {
      bilibili.app.viewunite.pgcanymodel.ViewPgcAny result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.viewunite.pgcanymodel.ViewPgcAny buildPartial() {
      bilibili.app.viewunite.pgcanymodel.ViewPgcAny result = new bilibili.app.viewunite.pgcanymodel.ViewPgcAny(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.app.viewunite.pgcanymodel.ViewPgcAny result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.seasonId_ = seasonId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seasonType_ = seasonType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.viewunite.pgcanymodel.ViewPgcAny) {
        return mergeFrom((bilibili.app.viewunite.pgcanymodel.ViewPgcAny)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.viewunite.pgcanymodel.ViewPgcAny other) {
      if (other == bilibili.app.viewunite.pgcanymodel.ViewPgcAny.getDefaultInstance()) return this;
      if (other.getSeasonId() != 0L) {
        setSeasonId(other.getSeasonId());
      }
      if (other.getSeasonType() != 0) {
        setSeasonType(other.getSeasonType());
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
              seasonId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              seasonType_ = input.readInt32();
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

    private long seasonId_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint64 season_id = 1;</code>
     * @return The seasonId.
     */
    @java.lang.Override
    public long getSeasonId() {
      return seasonId_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint64 season_id = 1;</code>
     * @param value The seasonId to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonId(long value) {

      seasonId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>uint64 season_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      seasonId_ = 0L;
      onChanged();
      return this;
    }

    private int seasonType_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 season_type = 2;</code>
     * @return The seasonType.
     */
    @java.lang.Override
    public int getSeasonType() {
      return seasonType_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 season_type = 2;</code>
     * @param value The seasonType to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonType(int value) {

      seasonType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int32 season_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seasonType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.viewunite.pgcanymodel.ViewPgcAny)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.viewunite.pgcanymodel.ViewPgcAny)
  private static final bilibili.app.viewunite.pgcanymodel.ViewPgcAny DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.viewunite.pgcanymodel.ViewPgcAny();
  }

  public static bilibili.app.viewunite.pgcanymodel.ViewPgcAny getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViewPgcAny>
      PARSER = new com.google.protobuf.AbstractParser<ViewPgcAny>() {
    @java.lang.Override
    public ViewPgcAny parsePartialFrom(
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

  public static com.google.protobuf.Parser<ViewPgcAny> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViewPgcAny> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.viewunite.pgcanymodel.ViewPgcAny getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

