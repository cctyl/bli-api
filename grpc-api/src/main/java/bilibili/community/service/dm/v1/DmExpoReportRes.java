// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.community.service.dm.v1.DmExpoReportRes}
 */
public final class DmExpoReportRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.community.service.dm.v1.DmExpoReportRes)
    DmExpoReportResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DmExpoReportRes.newBuilder() to construct.
  private DmExpoReportRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DmExpoReportRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DmExpoReportRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_DmExpoReportRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_DmExpoReportRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.community.service.dm.v1.DmExpoReportRes.class, bilibili.community.service.dm.v1.DmExpoReportRes.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bilibili.community.service.dm.v1.DmExpoReportRes)) {
      return super.equals(obj);
    }
    bilibili.community.service.dm.v1.DmExpoReportRes other = (bilibili.community.service.dm.v1.DmExpoReportRes) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.community.service.dm.v1.DmExpoReportRes parseFrom(
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
  public static Builder newBuilder(bilibili.community.service.dm.v1.DmExpoReportRes prototype) {
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
   * Protobuf type {@code bilibili.community.service.dm.v1.DmExpoReportRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.community.service.dm.v1.DmExpoReportRes)
      bilibili.community.service.dm.v1.DmExpoReportResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_DmExpoReportRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_DmExpoReportRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.community.service.dm.v1.DmExpoReportRes.class, bilibili.community.service.dm.v1.DmExpoReportRes.Builder.class);
    }

    // Construct using bilibili.community.service.dm.v1.DmExpoReportRes.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.community.service.dm.v1.Dm.internal_static_bilibili_community_service_dm_v1_DmExpoReportRes_descriptor;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.DmExpoReportRes getDefaultInstanceForType() {
      return bilibili.community.service.dm.v1.DmExpoReportRes.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.DmExpoReportRes build() {
      bilibili.community.service.dm.v1.DmExpoReportRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.community.service.dm.v1.DmExpoReportRes buildPartial() {
      bilibili.community.service.dm.v1.DmExpoReportRes result = new bilibili.community.service.dm.v1.DmExpoReportRes(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.community.service.dm.v1.DmExpoReportRes) {
        return mergeFrom((bilibili.community.service.dm.v1.DmExpoReportRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.community.service.dm.v1.DmExpoReportRes other) {
      if (other == bilibili.community.service.dm.v1.DmExpoReportRes.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:bilibili.community.service.dm.v1.DmExpoReportRes)
  }

  // @@protoc_insertion_point(class_scope:bilibili.community.service.dm.v1.DmExpoReportRes)
  private static final bilibili.community.service.dm.v1.DmExpoReportRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.community.service.dm.v1.DmExpoReportRes();
  }

  public static bilibili.community.service.dm.v1.DmExpoReportRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DmExpoReportRes>
      PARSER = new com.google.protobuf.AbstractParser<DmExpoReportRes>() {
    @java.lang.Override
    public DmExpoReportRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<DmExpoReportRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DmExpoReportRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.community.service.dm.v1.DmExpoReportRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
