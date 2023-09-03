// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.web.interfaces.v1.Rights}
 */
public final class Rights extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.web.interfaces.v1.Rights)
    RightsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rights.newBuilder() to construct.
  private Rights(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rights() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rights();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Rights_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Rights_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.web.interfaces.v1.Rights.class, bilibili.web.interfaces.v1.Rights.Builder.class);
  }

  public static final int BP_FIELD_NUMBER = 1;
  private int bp_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 bp = 1;</code>
   * @return The bp.
   */
  @java.lang.Override
  public int getBp() {
    return bp_;
  }

  public static final int ELEC_FIELD_NUMBER = 2;
  private int elec_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 elec = 2;</code>
   * @return The elec.
   */
  @java.lang.Override
  public int getElec() {
    return elec_;
  }

  public static final int DOWNLOAD_FIELD_NUMBER = 3;
  private int download_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 download = 3;</code>
   * @return The download.
   */
  @java.lang.Override
  public int getDownload() {
    return download_;
  }

  public static final int MOVIE_FIELD_NUMBER = 4;
  private int movie_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 movie = 4;</code>
   * @return The movie.
   */
  @java.lang.Override
  public int getMovie() {
    return movie_;
  }

  public static final int PAY_FIELD_NUMBER = 5;
  private int pay_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pay = 5;</code>
   * @return The pay.
   */
  @java.lang.Override
  public int getPay() {
    return pay_;
  }

  public static final int HD5_FIELD_NUMBER = 6;
  private int hd5_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 hd5 = 6;</code>
   * @return The hd5.
   */
  @java.lang.Override
  public int getHd5() {
    return hd5_;
  }

  public static final int NO_REPRINT_FIELD_NUMBER = 7;
  private int noReprint_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 no_reprint = 7;</code>
   * @return The noReprint.
   */
  @java.lang.Override
  public int getNoReprint() {
    return noReprint_;
  }

  public static final int AUTOPLAY_FIELD_NUMBER = 8;
  private int autoplay_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 autoplay = 8;</code>
   * @return The autoplay.
   */
  @java.lang.Override
  public int getAutoplay() {
    return autoplay_;
  }

  public static final int UGC_PAY_FIELD_NUMBER = 9;
  private int ugcPay_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ugc_pay = 9;</code>
   * @return The ugcPay.
   */
  @java.lang.Override
  public int getUgcPay() {
    return ugcPay_;
  }

  public static final int IS_COOPERATION_FIELD_NUMBER = 10;
  private int isCooperation_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_cooperation = 10;</code>
   * @return The isCooperation.
   */
  @java.lang.Override
  public int getIsCooperation() {
    return isCooperation_;
  }

  public static final int UGC_PAY_PREVIEW_FIELD_NUMBER = 11;
  private int ugcPayPreview_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ugc_pay_preview = 11;</code>
   * @return The ugcPayPreview.
   */
  @java.lang.Override
  public int getUgcPayPreview() {
    return ugcPayPreview_;
  }

  public static final int ARC_PAY_FIELD_NUMBER = 12;
  private int arcPay_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 arc_pay = 12;</code>
   * @return The arcPay.
   */
  @java.lang.Override
  public int getArcPay() {
    return arcPay_;
  }

  public static final int FREE_WATCH_FIELD_NUMBER = 13;
  private int freeWatch_ = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>int32 free_watch = 13;</code>
   * @return The freeWatch.
   */
  @java.lang.Override
  public int getFreeWatch() {
    return freeWatch_;
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
    if (bp_ != 0) {
      output.writeInt32(1, bp_);
    }
    if (elec_ != 0) {
      output.writeInt32(2, elec_);
    }
    if (download_ != 0) {
      output.writeInt32(3, download_);
    }
    if (movie_ != 0) {
      output.writeInt32(4, movie_);
    }
    if (pay_ != 0) {
      output.writeInt32(5, pay_);
    }
    if (hd5_ != 0) {
      output.writeInt32(6, hd5_);
    }
    if (noReprint_ != 0) {
      output.writeInt32(7, noReprint_);
    }
    if (autoplay_ != 0) {
      output.writeInt32(8, autoplay_);
    }
    if (ugcPay_ != 0) {
      output.writeInt32(9, ugcPay_);
    }
    if (isCooperation_ != 0) {
      output.writeInt32(10, isCooperation_);
    }
    if (ugcPayPreview_ != 0) {
      output.writeInt32(11, ugcPayPreview_);
    }
    if (arcPay_ != 0) {
      output.writeInt32(12, arcPay_);
    }
    if (freeWatch_ != 0) {
      output.writeInt32(13, freeWatch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bp_);
    }
    if (elec_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, elec_);
    }
    if (download_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, download_);
    }
    if (movie_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, movie_);
    }
    if (pay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pay_);
    }
    if (hd5_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, hd5_);
    }
    if (noReprint_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, noReprint_);
    }
    if (autoplay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, autoplay_);
    }
    if (ugcPay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, ugcPay_);
    }
    if (isCooperation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, isCooperation_);
    }
    if (ugcPayPreview_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, ugcPayPreview_);
    }
    if (arcPay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(12, arcPay_);
    }
    if (freeWatch_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(13, freeWatch_);
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
    if (!(obj instanceof bilibili.web.interfaces.v1.Rights)) {
      return super.equals(obj);
    }
    bilibili.web.interfaces.v1.Rights other = (bilibili.web.interfaces.v1.Rights) obj;

    if (getBp()
        != other.getBp()) return false;
    if (getElec()
        != other.getElec()) return false;
    if (getDownload()
        != other.getDownload()) return false;
    if (getMovie()
        != other.getMovie()) return false;
    if (getPay()
        != other.getPay()) return false;
    if (getHd5()
        != other.getHd5()) return false;
    if (getNoReprint()
        != other.getNoReprint()) return false;
    if (getAutoplay()
        != other.getAutoplay()) return false;
    if (getUgcPay()
        != other.getUgcPay()) return false;
    if (getIsCooperation()
        != other.getIsCooperation()) return false;
    if (getUgcPayPreview()
        != other.getUgcPayPreview()) return false;
    if (getArcPay()
        != other.getArcPay()) return false;
    if (getFreeWatch()
        != other.getFreeWatch()) return false;
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
    hash = (37 * hash) + BP_FIELD_NUMBER;
    hash = (53 * hash) + getBp();
    hash = (37 * hash) + ELEC_FIELD_NUMBER;
    hash = (53 * hash) + getElec();
    hash = (37 * hash) + DOWNLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getDownload();
    hash = (37 * hash) + MOVIE_FIELD_NUMBER;
    hash = (53 * hash) + getMovie();
    hash = (37 * hash) + PAY_FIELD_NUMBER;
    hash = (53 * hash) + getPay();
    hash = (37 * hash) + HD5_FIELD_NUMBER;
    hash = (53 * hash) + getHd5();
    hash = (37 * hash) + NO_REPRINT_FIELD_NUMBER;
    hash = (53 * hash) + getNoReprint();
    hash = (37 * hash) + AUTOPLAY_FIELD_NUMBER;
    hash = (53 * hash) + getAutoplay();
    hash = (37 * hash) + UGC_PAY_FIELD_NUMBER;
    hash = (53 * hash) + getUgcPay();
    hash = (37 * hash) + IS_COOPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getIsCooperation();
    hash = (37 * hash) + UGC_PAY_PREVIEW_FIELD_NUMBER;
    hash = (53 * hash) + getUgcPayPreview();
    hash = (37 * hash) + ARC_PAY_FIELD_NUMBER;
    hash = (53 * hash) + getArcPay();
    hash = (37 * hash) + FREE_WATCH_FIELD_NUMBER;
    hash = (53 * hash) + getFreeWatch();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.web.interfaces.v1.Rights parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Rights parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Rights parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.web.interfaces.v1.Rights parseFrom(
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
  public static Builder newBuilder(bilibili.web.interfaces.v1.Rights prototype) {
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
   * Protobuf type {@code bilibili.web.interfaces.v1.Rights}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.web.interfaces.v1.Rights)
      bilibili.web.interfaces.v1.RightsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Rights_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Rights_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.web.interfaces.v1.Rights.class, bilibili.web.interfaces.v1.Rights.Builder.class);
    }

    // Construct using bilibili.web.interfaces.v1.Rights.newBuilder()
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
      bp_ = 0;
      elec_ = 0;
      download_ = 0;
      movie_ = 0;
      pay_ = 0;
      hd5_ = 0;
      noReprint_ = 0;
      autoplay_ = 0;
      ugcPay_ = 0;
      isCooperation_ = 0;
      ugcPayPreview_ = 0;
      arcPay_ = 0;
      freeWatch_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.web.interfaces.v1.Interfaces.internal_static_bilibili_web_interfaces_v1_Rights_descriptor;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Rights getDefaultInstanceForType() {
      return bilibili.web.interfaces.v1.Rights.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Rights build() {
      bilibili.web.interfaces.v1.Rights result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.web.interfaces.v1.Rights buildPartial() {
      bilibili.web.interfaces.v1.Rights result = new bilibili.web.interfaces.v1.Rights(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.web.interfaces.v1.Rights result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bp_ = bp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.elec_ = elec_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.download_ = download_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.movie_ = movie_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.pay_ = pay_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.hd5_ = hd5_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.noReprint_ = noReprint_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.autoplay_ = autoplay_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.ugcPay_ = ugcPay_;
      }
      if (((from_bitField0_ & 0x00000200) != 0)) {
        result.isCooperation_ = isCooperation_;
      }
      if (((from_bitField0_ & 0x00000400) != 0)) {
        result.ugcPayPreview_ = ugcPayPreview_;
      }
      if (((from_bitField0_ & 0x00000800) != 0)) {
        result.arcPay_ = arcPay_;
      }
      if (((from_bitField0_ & 0x00001000) != 0)) {
        result.freeWatch_ = freeWatch_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.web.interfaces.v1.Rights) {
        return mergeFrom((bilibili.web.interfaces.v1.Rights)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.web.interfaces.v1.Rights other) {
      if (other == bilibili.web.interfaces.v1.Rights.getDefaultInstance()) return this;
      if (other.getBp() != 0) {
        setBp(other.getBp());
      }
      if (other.getElec() != 0) {
        setElec(other.getElec());
      }
      if (other.getDownload() != 0) {
        setDownload(other.getDownload());
      }
      if (other.getMovie() != 0) {
        setMovie(other.getMovie());
      }
      if (other.getPay() != 0) {
        setPay(other.getPay());
      }
      if (other.getHd5() != 0) {
        setHd5(other.getHd5());
      }
      if (other.getNoReprint() != 0) {
        setNoReprint(other.getNoReprint());
      }
      if (other.getAutoplay() != 0) {
        setAutoplay(other.getAutoplay());
      }
      if (other.getUgcPay() != 0) {
        setUgcPay(other.getUgcPay());
      }
      if (other.getIsCooperation() != 0) {
        setIsCooperation(other.getIsCooperation());
      }
      if (other.getUgcPayPreview() != 0) {
        setUgcPayPreview(other.getUgcPayPreview());
      }
      if (other.getArcPay() != 0) {
        setArcPay(other.getArcPay());
      }
      if (other.getFreeWatch() != 0) {
        setFreeWatch(other.getFreeWatch());
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
              bp_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              elec_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              download_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              movie_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              pay_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              hd5_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              noReprint_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              autoplay_ = input.readInt32();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
            case 72: {
              ugcPay_ = input.readInt32();
              bitField0_ |= 0x00000100;
              break;
            } // case 72
            case 80: {
              isCooperation_ = input.readInt32();
              bitField0_ |= 0x00000200;
              break;
            } // case 80
            case 88: {
              ugcPayPreview_ = input.readInt32();
              bitField0_ |= 0x00000400;
              break;
            } // case 88
            case 96: {
              arcPay_ = input.readInt32();
              bitField0_ |= 0x00000800;
              break;
            } // case 96
            case 104: {
              freeWatch_ = input.readInt32();
              bitField0_ |= 0x00001000;
              break;
            } // case 104
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

    private int bp_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 bp = 1;</code>
     * @return The bp.
     */
    @java.lang.Override
    public int getBp() {
      return bp_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 bp = 1;</code>
     * @param value The bp to set.
     * @return This builder for chaining.
     */
    public Builder setBp(int value) {

      bp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 bp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bp_ = 0;
      onChanged();
      return this;
    }

    private int elec_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 elec = 2;</code>
     * @return The elec.
     */
    @java.lang.Override
    public int getElec() {
      return elec_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 elec = 2;</code>
     * @param value The elec to set.
     * @return This builder for chaining.
     */
    public Builder setElec(int value) {

      elec_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 elec = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearElec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      elec_ = 0;
      onChanged();
      return this;
    }

    private int download_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 download = 3;</code>
     * @return The download.
     */
    @java.lang.Override
    public int getDownload() {
      return download_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 download = 3;</code>
     * @param value The download to set.
     * @return This builder for chaining.
     */
    public Builder setDownload(int value) {

      download_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 download = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      download_ = 0;
      onChanged();
      return this;
    }

    private int movie_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 movie = 4;</code>
     * @return The movie.
     */
    @java.lang.Override
    public int getMovie() {
      return movie_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 movie = 4;</code>
     * @param value The movie to set.
     * @return This builder for chaining.
     */
    public Builder setMovie(int value) {

      movie_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 movie = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMovie() {
      bitField0_ = (bitField0_ & ~0x00000008);
      movie_ = 0;
      onChanged();
      return this;
    }

    private int pay_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 pay = 5;</code>
     * @return The pay.
     */
    @java.lang.Override
    public int getPay() {
      return pay_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 pay = 5;</code>
     * @param value The pay to set.
     * @return This builder for chaining.
     */
    public Builder setPay(int value) {

      pay_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 pay = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPay() {
      bitField0_ = (bitField0_ & ~0x00000010);
      pay_ = 0;
      onChanged();
      return this;
    }

    private int hd5_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 hd5 = 6;</code>
     * @return The hd5.
     */
    @java.lang.Override
    public int getHd5() {
      return hd5_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 hd5 = 6;</code>
     * @param value The hd5 to set.
     * @return This builder for chaining.
     */
    public Builder setHd5(int value) {

      hd5_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 hd5 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHd5() {
      bitField0_ = (bitField0_ & ~0x00000020);
      hd5_ = 0;
      onChanged();
      return this;
    }

    private int noReprint_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 no_reprint = 7;</code>
     * @return The noReprint.
     */
    @java.lang.Override
    public int getNoReprint() {
      return noReprint_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 no_reprint = 7;</code>
     * @param value The noReprint to set.
     * @return This builder for chaining.
     */
    public Builder setNoReprint(int value) {

      noReprint_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 no_reprint = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNoReprint() {
      bitField0_ = (bitField0_ & ~0x00000040);
      noReprint_ = 0;
      onChanged();
      return this;
    }

    private int autoplay_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 autoplay = 8;</code>
     * @return The autoplay.
     */
    @java.lang.Override
    public int getAutoplay() {
      return autoplay_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 autoplay = 8;</code>
     * @param value The autoplay to set.
     * @return This builder for chaining.
     */
    public Builder setAutoplay(int value) {

      autoplay_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 autoplay = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoplay() {
      bitField0_ = (bitField0_ & ~0x00000080);
      autoplay_ = 0;
      onChanged();
      return this;
    }

    private int ugcPay_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay = 9;</code>
     * @return The ugcPay.
     */
    @java.lang.Override
    public int getUgcPay() {
      return ugcPay_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay = 9;</code>
     * @param value The ugcPay to set.
     * @return This builder for chaining.
     */
    public Builder setUgcPay(int value) {

      ugcPay_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearUgcPay() {
      bitField0_ = (bitField0_ & ~0x00000100);
      ugcPay_ = 0;
      onChanged();
      return this;
    }

    private int isCooperation_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 is_cooperation = 10;</code>
     * @return The isCooperation.
     */
    @java.lang.Override
    public int getIsCooperation() {
      return isCooperation_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 is_cooperation = 10;</code>
     * @param value The isCooperation to set.
     * @return This builder for chaining.
     */
    public Builder setIsCooperation(int value) {

      isCooperation_ = value;
      bitField0_ |= 0x00000200;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 is_cooperation = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCooperation() {
      bitField0_ = (bitField0_ & ~0x00000200);
      isCooperation_ = 0;
      onChanged();
      return this;
    }

    private int ugcPayPreview_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay_preview = 11;</code>
     * @return The ugcPayPreview.
     */
    @java.lang.Override
    public int getUgcPayPreview() {
      return ugcPayPreview_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay_preview = 11;</code>
     * @param value The ugcPayPreview to set.
     * @return This builder for chaining.
     */
    public Builder setUgcPayPreview(int value) {

      ugcPayPreview_ = value;
      bitField0_ |= 0x00000400;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 ugc_pay_preview = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearUgcPayPreview() {
      bitField0_ = (bitField0_ & ~0x00000400);
      ugcPayPreview_ = 0;
      onChanged();
      return this;
    }

    private int arcPay_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 arc_pay = 12;</code>
     * @return The arcPay.
     */
    @java.lang.Override
    public int getArcPay() {
      return arcPay_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 arc_pay = 12;</code>
     * @param value The arcPay to set.
     * @return This builder for chaining.
     */
    public Builder setArcPay(int value) {

      arcPay_ = value;
      bitField0_ |= 0x00000800;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 arc_pay = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearArcPay() {
      bitField0_ = (bitField0_ & ~0x00000800);
      arcPay_ = 0;
      onChanged();
      return this;
    }

    private int freeWatch_ ;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 free_watch = 13;</code>
     * @return The freeWatch.
     */
    @java.lang.Override
    public int getFreeWatch() {
      return freeWatch_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 free_watch = 13;</code>
     * @param value The freeWatch to set.
     * @return This builder for chaining.
     */
    public Builder setFreeWatch(int value) {

      freeWatch_ = value;
      bitField0_ |= 0x00001000;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 free_watch = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearFreeWatch() {
      bitField0_ = (bitField0_ & ~0x00001000);
      freeWatch_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.web.interfaces.v1.Rights)
  }

  // @@protoc_insertion_point(class_scope:bilibili.web.interfaces.v1.Rights)
  private static final bilibili.web.interfaces.v1.Rights DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.web.interfaces.v1.Rights();
  }

  public static bilibili.web.interfaces.v1.Rights getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rights>
      PARSER = new com.google.protobuf.AbstractParser<Rights>() {
    @java.lang.Override
    public Rights parsePartialFrom(
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

  public static com.google.protobuf.Parser<Rights> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rights> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.web.interfaces.v1.Rights getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

