// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pgc/gateway/vega/v1/vega.proto

package pgc.gateway.vega.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code pgc.gateway.vega.v1.HeartbeatResp}
 */
public final class HeartbeatResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pgc.gateway.vega.v1.HeartbeatResp)
    HeartbeatRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeartbeatResp.newBuilder() to construct.
  private HeartbeatResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartbeatResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeartbeatResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pgc.gateway.vega.v1.VegaOuterClass.internal_static_pgc_gateway_vega_v1_HeartbeatResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pgc.gateway.vega.v1.VegaOuterClass.internal_static_pgc_gateway_vega_v1_HeartbeatResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pgc.gateway.vega.v1.HeartbeatResp.class, pgc.gateway.vega.v1.HeartbeatResp.Builder.class);
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
    if (!(obj instanceof pgc.gateway.vega.v1.HeartbeatResp)) {
      return super.equals(obj);
    }
    pgc.gateway.vega.v1.HeartbeatResp other = (pgc.gateway.vega.v1.HeartbeatResp) obj;

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

  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pgc.gateway.vega.v1.HeartbeatResp parseFrom(
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
  public static Builder newBuilder(pgc.gateway.vega.v1.HeartbeatResp prototype) {
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
   * Protobuf type {@code pgc.gateway.vega.v1.HeartbeatResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pgc.gateway.vega.v1.HeartbeatResp)
      pgc.gateway.vega.v1.HeartbeatRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pgc.gateway.vega.v1.VegaOuterClass.internal_static_pgc_gateway_vega_v1_HeartbeatResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pgc.gateway.vega.v1.VegaOuterClass.internal_static_pgc_gateway_vega_v1_HeartbeatResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pgc.gateway.vega.v1.HeartbeatResp.class, pgc.gateway.vega.v1.HeartbeatResp.Builder.class);
    }

    // Construct using pgc.gateway.vega.v1.HeartbeatResp.newBuilder()
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
      return pgc.gateway.vega.v1.VegaOuterClass.internal_static_pgc_gateway_vega_v1_HeartbeatResp_descriptor;
    }

    @java.lang.Override
    public pgc.gateway.vega.v1.HeartbeatResp getDefaultInstanceForType() {
      return pgc.gateway.vega.v1.HeartbeatResp.getDefaultInstance();
    }

    @java.lang.Override
    public pgc.gateway.vega.v1.HeartbeatResp build() {
      pgc.gateway.vega.v1.HeartbeatResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pgc.gateway.vega.v1.HeartbeatResp buildPartial() {
      pgc.gateway.vega.v1.HeartbeatResp result = new pgc.gateway.vega.v1.HeartbeatResp(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pgc.gateway.vega.v1.HeartbeatResp) {
        return mergeFrom((pgc.gateway.vega.v1.HeartbeatResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pgc.gateway.vega.v1.HeartbeatResp other) {
      if (other == pgc.gateway.vega.v1.HeartbeatResp.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:pgc.gateway.vega.v1.HeartbeatResp)
  }

  // @@protoc_insertion_point(class_scope:pgc.gateway.vega.v1.HeartbeatResp)
  private static final pgc.gateway.vega.v1.HeartbeatResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pgc.gateway.vega.v1.HeartbeatResp();
  }

  public static pgc.gateway.vega.v1.HeartbeatResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartbeatResp>
      PARSER = new com.google.protobuf.AbstractParser<HeartbeatResp>() {
    @java.lang.Override
    public HeartbeatResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<HeartbeatResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartbeatResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pgc.gateway.vega.v1.HeartbeatResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

