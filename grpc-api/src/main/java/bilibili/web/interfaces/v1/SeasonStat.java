// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.SeasonStat}
 */
public final class SeasonStat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.SeasonStat)
    SeasonStatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeasonStat.newBuilder() to construct.
  private SeasonStat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeasonStat() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeasonStat();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_SeasonStat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_SeasonStat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.SeasonStat.class, bilibili.web.interfaces.v1.SeasonStat.Builder.class);
  }

  public static final int SEASON_ID_FIELD_NUMBER = 1;
  private long seasonId_ = 0L;
  /**
   * <pre>
   * </pre>
   *
   * <code>int64 season_id = 1;</code>
   * @return The seasonId.
   */
  @java.lang.Override
  public long getSeasonId() {
    return seasonId_;
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 view = 2;</code>
   * @return The view.
   */
  @java.lang.Override
  public int getView() {
    return view_;
  }

  public static final int DANMAKU_FIELD_NUMBER = 3;
  private int danmaku_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 danmaku = 3;</code>
   * @return The danmaku.
   */
  @java.lang.Override
  public int getDanmaku() {
    return danmaku_;
  }

  public static final int REPLY_FIELD_NUMBER = 4;
  private int reply_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 reply = 4;</code>
   * @return The reply.
   */
  @java.lang.Override
  public int getReply() {
    return reply_;
  }

  public static final int FAV_FIELD_NUMBER = 5;
  private int fav_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 fav = 5;</code>
   * @return The fav.
   */
  @java.lang.Override
  public int getFav() {
    return fav_;
  }

  public static final int COIN_FIELD_NUMBER = 6;
  private int coin_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 coin = 6;</code>
   * @return The coin.
   */
  @java.lang.Override
  public int getCoin() {
    return coin_;
  }

  public static final int SHARE_FIELD_NUMBER = 7;
  private int share_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 share = 7;</code>
   * @return The share.
   */
  @java.lang.Override
  public int getShare() {
    return share_;
  }

  public static final int NOW_RANK_FIELD_NUMBER = 8;
  private int nowRank_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 now_rank = 8;</code>
   * @return The nowRank.
   */
  @java.lang.Override
  public int getNowRank() {
    return nowRank_;
  }

  public static final int HIS_RANK_FIELD_NUMBER = 9;
  private int hisRank_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 his_rank = 9;</code>
   * @return The hisRank.
   */
  @java.lang.Override
  public int getHisRank() {
    return hisRank_;
  }

  public static final int LIKE_FIELD_NUMBER = 10;
  private int like_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 like = 10;</code>
   * @return The like.
   */
  @java.lang.Override
  public int getLike() {
    return like_;
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
      output.writeInt64(1, seasonId_);
    }
    if (view_ != 0) {
      output.writeInt32(2, view_);
    }
    if (danmaku_ != 0) {
      output.writeInt32(3, danmaku_);
    }
    if (reply_ != 0) {
      output.writeInt32(4, reply_);
    }
    if (fav_ != 0) {
      output.writeInt32(5, fav_);
    }
    if (coin_ != 0) {
      output.writeInt32(6, coin_);
    }
    if (share_ != 0) {
      output.writeInt32(7, share_);
    }
    if (nowRank_ != 0) {
      output.writeInt32(8, nowRank_);
    }
    if (hisRank_ != 0) {
      output.writeInt32(9, hisRank_);
    }
    if (like_ != 0) {
      output.writeInt32(10, like_);
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
        .computeInt64Size(1, seasonId_);
    }
    if (view_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, view_);
    }
    if (danmaku_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, danmaku_);
    }
    if (reply_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, reply_);
    }
    if (fav_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, fav_);
    }
    if (coin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, coin_);
    }
    if (share_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, share_);
    }
    if (nowRank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, nowRank_);
    }
    if (hisRank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, hisRank_);
    }
    if (like_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, like_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.SeasonStat)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.SeasonStat other = (bilibili.web.interfaces.v1.SeasonStat) obj;

    if (getSeasonId()
        != other.getSeasonId()) return false;
    if (getView()
        != other.getView()) return false;
    if (getDanmaku()
        != other.getDanmaku()) return false;
    if (getReply()
        != other.getReply()) return false;
    if (getFav()
        != other.getFav()) return false;
    if (getCoin()
        != other.getCoin()) return false;
    if (getShare()
        != other.getShare()) return false;
    if (getNowRank()
        != other.getNowRank()) return false;
    if (getHisRank()
        != other.getHisRank()) return false;
    if (getLike()
        != other.getLike()) return false;
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
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + getView();
    hash = (37 * hash) + DANMAKU_FIELD_NUMBER;
    hash = (53 * hash) + getDanmaku();
    hash = (37 * hash) + REPLY_FIELD_NUMBER;
    hash = (53 * hash) + getReply();
    hash = (37 * hash) + FAV_FIELD_NUMBER;
    hash = (53 * hash) + getFav();
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + getCoin();
    hash = (37 * hash) + SHARE_FIELD_NUMBER;
    hash = (53 * hash) + getShare();
    hash = (37 * hash) + NOW_RANK_FIELD_NUMBER;
    hash = (53 * hash) + getNowRank();
    hash = (37 * hash) + HIS_RANK_FIELD_NUMBER;
    hash = (53 * hash) + getHisRank();
    hash = (37 * hash) + LIKE_FIELD_NUMBER;
    hash = (53 * hash) + getLike();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.SeasonStat parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.SeasonStat prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.SeasonStat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.SeasonStat)
      bilibili.web.interfaces.v1.SeasonStatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_SeasonStat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_SeasonStat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.SeasonStat.class, bilibili.web.interfaces.v1.SeasonStat.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.SeasonStat.newBuilder()
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
      view_ = 0;
      danmaku_ = 0;
      reply_ = 0;
      fav_ = 0;
      coin_ = 0;
      share_ = 0;
      nowRank_ = 0;
      hisRank_ = 0;
      like_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_SeasonStat_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.SeasonStat getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.SeasonStat.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.SeasonStat build() {
      bilibili.web.interfaces.v1.SeasonStat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.SeasonStat buildPartial() {
      bilibili.web.interfaces.v1.SeasonStat result = new bilibili.web.interfaces.v1.SeasonStat(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.SeasonStat result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.seasonId_ = seasonId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.view_ = view_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.danmaku_ = danmaku_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reply_ = reply_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fav_ = fav_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.coin_ = coin_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.share_ = share_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.nowRank_ = nowRank_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.hisRank_ = hisRank_;
      }
      if (((from_bitField0_ & 0x00000200) != 0)) {
        result.like_ = like_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.SeasonStat) {
        return mergeFrom((bilibili.web.interfaces.v1.SeasonStat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.SeasonStat other) {
      if (other == bilibili.web.interfaces.v1.SeasonStat.getDefaultInstance()) return this;
      if (other.getSeasonId() != 0L) {
        setSeasonId(other.getSeasonId());
      }
      if (other.getView() != 0) {
        setView(other.getView());
      }
      if (other.getDanmaku() != 0) {
        setDanmaku(other.getDanmaku());
      }
      if (other.getReply() != 0) {
        setReply(other.getReply());
      }
      if (other.getFav() != 0) {
        setFav(other.getFav());
      }
      if (other.getCoin() != 0) {
        setCoin(other.getCoin());
      }
      if (other.getShare() != 0) {
        setShare(other.getShare());
      }
      if (other.getNowRank() != 0) {
        setNowRank(other.getNowRank());
      }
      if (other.getHisRank() != 0) {
        setHisRank(other.getHisRank());
      }
      if (other.getLike() != 0) {
        setLike(other.getLike());
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
              seasonId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              view_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              danmaku_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              reply_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              fav_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              coin_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              share_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              nowRank_ = input.readInt32();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
            case 72: {
              hisRank_ = input.readInt32();
              bitField0_ |= 0x00000100;
              break;
            } // case 72
            case 80: {
              like_ = input.readInt32();
              bitField0_ |= 0x00000200;
              break;
            } // case 80
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
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
     * @return The seasonId.
     */
    @java.lang.Override
    public long getSeasonId() {
      return seasonId_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
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
     * </pre>
     *
     * <code>int64 season_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      seasonId_ = 0L;
      onChanged();
      return this;
    }

    private int view_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 view = 2;</code>
     * @return The view.
     */
    @java.lang.Override
    public int getView() {
      return view_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 view = 2;</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(int value) {

      view_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 view = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000002);
      view_ = 0;
      onChanged();
      return this;
    }

    private int danmaku_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 danmaku = 3;</code>
     * @return The danmaku.
     */
    @java.lang.Override
    public int getDanmaku() {
      return danmaku_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 danmaku = 3;</code>
     * @param value The danmaku to set.
     * @return This builder for chaining.
     */
    public Builder setDanmaku(int value) {

      danmaku_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 danmaku = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDanmaku() {
      bitField0_ = (bitField0_ & ~0x00000004);
      danmaku_ = 0;
      onChanged();
      return this;
    }

    private int reply_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reply = 4;</code>
     * @return The reply.
     */
    @java.lang.Override
    public int getReply() {
      return reply_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reply = 4;</code>
     * @param value The reply to set.
     * @return This builder for chaining.
     */
    public Builder setReply(int value) {

      reply_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 reply = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReply() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reply_ = 0;
      onChanged();
      return this;
    }

    private int fav_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 fav = 5;</code>
     * @return The fav.
     */
    @java.lang.Override
    public int getFav() {
      return fav_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 fav = 5;</code>
     * @param value The fav to set.
     * @return This builder for chaining.
     */
    public Builder setFav(int value) {

      fav_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 fav = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFav() {
      bitField0_ = (bitField0_ & ~0x00000010);
      fav_ = 0;
      onChanged();
      return this;
    }

    private int coin_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coin = 6;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coin = 6;</code>
     * @param value The coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoin(int value) {

      coin_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 coin = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      bitField0_ = (bitField0_ & ~0x00000020);
      coin_ = 0;
      onChanged();
      return this;
    }

    private int share_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 share = 7;</code>
     * @return The share.
     */
    @java.lang.Override
    public int getShare() {
      return share_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 share = 7;</code>
     * @param value The share to set.
     * @return This builder for chaining.
     */
    public Builder setShare(int value) {

      share_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 share = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearShare() {
      bitField0_ = (bitField0_ & ~0x00000040);
      share_ = 0;
      onChanged();
      return this;
    }

    private int nowRank_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 now_rank = 8;</code>
     * @return The nowRank.
     */
    @java.lang.Override
    public int getNowRank() {
      return nowRank_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 now_rank = 8;</code>
     * @param value The nowRank to set.
     * @return This builder for chaining.
     */
    public Builder setNowRank(int value) {

      nowRank_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 now_rank = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearNowRank() {
      bitField0_ = (bitField0_ & ~0x00000080);
      nowRank_ = 0;
      onChanged();
      return this;
    }

    private int hisRank_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 his_rank = 9;</code>
     * @return The hisRank.
     */
    @java.lang.Override
    public int getHisRank() {
      return hisRank_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 his_rank = 9;</code>
     * @param value The hisRank to set.
     * @return This builder for chaining.
     */
    public Builder setHisRank(int value) {

      hisRank_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 his_rank = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearHisRank() {
      bitField0_ = (bitField0_ & ~0x00000100);
      hisRank_ = 0;
      onChanged();
      return this;
    }

    private int like_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 like = 10;</code>
     * @return The like.
     */
    @java.lang.Override
    public int getLike() {
      return like_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 like = 10;</code>
     * @param value The like to set.
     * @return This builder for chaining.
     */
    public Builder setLike(int value) {

      like_ = value;
      bitField0_ |= 0x00000200;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 like = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearLike() {
      bitField0_ = (bitField0_ & ~0x00000200);
      like_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.SeasonStat)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.SeasonStat)
  private static final bilibili.web.interfaces.v1.SeasonStat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.SeasonStat();
  }

  public static bilibili.web.interfaces.v1.SeasonStat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeasonStat>
      PARSER = new com.google.protobuf.AbstractParser<SeasonStat>() {
    @java.lang.Override
    public SeasonStat parsePartialFrom(
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

  public static com.google.protobuf.Parser<SeasonStat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeasonStat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.SeasonStat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

