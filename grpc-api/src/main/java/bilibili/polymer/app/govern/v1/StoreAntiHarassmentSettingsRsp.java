// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/community/govern/v1/govern.proto

package bilibili.polymer.app.govern.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp}
 */
public final class StoreAntiHarassmentSettingsRsp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)
    StoreAntiHarassmentSettingsRspOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoreAntiHarassmentSettingsRsp.newBuilder() to construct.
  private StoreAntiHarassmentSettingsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreAntiHarassmentSettingsRsp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StoreAntiHarassmentSettingsRsp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_StoreAntiHarassmentSettingsRsp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_StoreAntiHarassmentSettingsRsp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.class, bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.Builder.class);
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
    if (!(obj instanceof bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)) {
      return super.equals(obj);
    }
    bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp other = (bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp) obj;

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

  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp parseFrom(
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
  public static Builder newBuilder(bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp prototype) {
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
   * Protobuf type {@code bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)
      bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRspOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_StoreAntiHarassmentSettingsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_StoreAntiHarassmentSettingsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.class, bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.Builder.class);
    }

    // Construct using bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.newBuilder()
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
      return bilibili.polymer.app.govern.v1.Govern.internal_static_bilibili_polymer_app_govern_v1_StoreAntiHarassmentSettingsRsp_descriptor;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp getDefaultInstanceForType() {
      return bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp build() {
      bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp buildPartial() {
      bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp result = new bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp) {
        return mergeFrom((bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp other) {
      if (other == bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)
  }

  // @@protoc_insertion_point(class_scope:bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp)
  private static final bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp();
  }

  public static bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreAntiHarassmentSettingsRsp>
      PARSER = new com.google.protobuf.AbstractParser<StoreAntiHarassmentSettingsRsp>() {
    @java.lang.Override
    public StoreAntiHarassmentSettingsRsp parsePartialFrom(
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

  public static com.google.protobuf.Parser<StoreAntiHarassmentSettingsRsp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreAntiHarassmentSettingsRsp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.polymer.app.govern.v1.StoreAntiHarassmentSettingsRsp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
