// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/mod.proto

package bilibili.broadcast.v1;

public final class ModRpcProto {
  private ModRpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModResourceRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bilibili.broadcast.v1.ModResourceResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * </pre>
     *
     * <code>int32 atcion = 1;</code>
     * @return The atcion.
     */
    int getAtcion();

    /**
     * <pre>
     * </pre>
     *
     * <code>string app_key = 2;</code>
     * @return The appKey.
     */
    java.lang.String getAppKey();
    /**
     * <pre>
     * </pre>
     *
     * <code>string app_key = 2;</code>
     * @return The bytes for appKey.
     */
    com.google.protobuf.ByteString
        getAppKeyBytes();

    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 3;</code>
     * @return The poolName.
     */
    java.lang.String getPoolName();
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 3;</code>
     * @return The bytes for poolName.
     */
    com.google.protobuf.ByteString
        getPoolNameBytes();

    /**
     * <pre>
     * </pre>
     *
     * <code>string module_name = 4;</code>
     * @return The moduleName.
     */
    java.lang.String getModuleName();
    /**
     * <pre>
     * </pre>
     *
     * <code>string module_name = 4;</code>
     * @return The bytes for moduleName.
     */
    com.google.protobuf.ByteString
        getModuleNameBytes();

    /**
     * <pre>
     * </pre>
     *
     * <code>int64 module_version = 5;</code>
     * @return The moduleVersion.
     */
    long getModuleVersion();

    /**
     * <pre>
     * </pre>
     *
     * <code>int64 list_version = 6;</code>
     * @return The listVersion.
     */
    long getListVersion();
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code bilibili.broadcast.v1.ModResourceResp}
   */
  public static final class ModResourceResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bilibili.broadcast.v1.ModResourceResp)
      ModResourceRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModResourceResp.newBuilder() to construct.
    private ModResourceResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModResourceResp() {
      appKey_ = "";
      poolName_ = "";
      moduleName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ModResourceResp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.broadcast.v1.ModRpcProto.internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.broadcast.v1.ModRpcProto.internal_static_bilibili_broadcast_v1_ModResourceResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.broadcast.v1.ModRpcProto.ModResourceResp.class, bilibili.broadcast.v1.ModRpcProto.ModResourceResp.Builder.class);
    }

    public static final int ATCION_FIELD_NUMBER = 1;
    private int atcion_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>int32 atcion = 1;</code>
     * @return The atcion.
     */
    @java.lang.Override
    public int getAtcion() {
      return atcion_;
    }

    public static final int APP_KEY_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object appKey_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string app_key = 2;</code>
     * @return The appKey.
     */
    @java.lang.Override
    public java.lang.String getAppKey() {
      java.lang.Object ref = appKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appKey_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string app_key = 2;</code>
     * @return The bytes for appKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAppKeyBytes() {
      java.lang.Object ref = appKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int POOL_NAME_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object poolName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 3;</code>
     * @return The poolName.
     */
    @java.lang.Override
    public java.lang.String getPoolName() {
      java.lang.Object ref = poolName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poolName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 3;</code>
     * @return The bytes for poolName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPoolNameBytes() {
      java.lang.Object ref = poolName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poolName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MODULE_NAME_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object moduleName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string module_name = 4;</code>
     * @return The moduleName.
     */
    @java.lang.Override
    public java.lang.String getModuleName() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moduleName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string module_name = 4;</code>
     * @return The bytes for moduleName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModuleNameBytes() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moduleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MODULE_VERSION_FIELD_NUMBER = 5;
    private long moduleVersion_ = 0L;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 module_version = 5;</code>
     * @return The moduleVersion.
     */
    @java.lang.Override
    public long getModuleVersion() {
      return moduleVersion_;
    }

    public static final int LIST_VERSION_FIELD_NUMBER = 6;
    private long listVersion_ = 0L;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 list_version = 6;</code>
     * @return The listVersion.
     */
    @java.lang.Override
    public long getListVersion() {
      return listVersion_;
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
      if (atcion_ != 0) {
        output.writeInt32(1, atcion_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appKey_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appKey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, poolName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, moduleName_);
      }
      if (moduleVersion_ != 0L) {
        output.writeInt64(5, moduleVersion_);
      }
      if (listVersion_ != 0L) {
        output.writeInt64(6, listVersion_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (atcion_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, atcion_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appKey_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appKey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, poolName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, moduleName_);
      }
      if (moduleVersion_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, moduleVersion_);
      }
      if (listVersion_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, listVersion_);
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
      if (!(obj instanceof bilibili.broadcast.v1.ModRpcProto.ModResourceResp)) {
        return super.equals(obj);
      }
      bilibili.broadcast.v1.ModRpcProto.ModResourceResp other = (bilibili.broadcast.v1.ModRpcProto.ModResourceResp) obj;

      if (getAtcion()
          != other.getAtcion()) return false;
      if (!getAppKey()
          .equals(other.getAppKey())) return false;
      if (!getPoolName()
          .equals(other.getPoolName())) return false;
      if (!getModuleName()
          .equals(other.getModuleName())) return false;
      if (getModuleVersion()
          != other.getModuleVersion()) return false;
      if (getListVersion()
          != other.getListVersion()) return false;
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
      hash = (37 * hash) + ATCION_FIELD_NUMBER;
      hash = (53 * hash) + getAtcion();
      hash = (37 * hash) + APP_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getAppKey().hashCode();
      hash = (37 * hash) + POOL_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPoolName().hashCode();
      hash = (37 * hash) + MODULE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getModuleName().hashCode();
      hash = (37 * hash) + MODULE_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getModuleVersion());
      hash = (37 * hash) + LIST_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getListVersion());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp parseFrom(
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
    public static Builder newBuilder(bilibili.broadcast.v1.ModRpcProto.ModResourceResp prototype) {
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
     * Protobuf type {@code bilibili.broadcast.v1.ModResourceResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bilibili.broadcast.v1.ModResourceResp)
        bilibili.broadcast.v1.ModRpcProto.ModResourceRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return bilibili.broadcast.v1.ModRpcProto.internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return bilibili.broadcast.v1.ModRpcProto.internal_static_bilibili_broadcast_v1_ModResourceResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                bilibili.broadcast.v1.ModRpcProto.ModResourceResp.class, bilibili.broadcast.v1.ModRpcProto.ModResourceResp.Builder.class);
      }

      // Construct using bilibili.broadcast.v1.ModRpcProto.ModResourceResp.newBuilder()
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
        atcion_ = 0;
        appKey_ = "";
        poolName_ = "";
        moduleName_ = "";
        moduleVersion_ = 0L;
        listVersion_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bilibili.broadcast.v1.ModRpcProto.internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor;
      }

      @java.lang.Override
      public bilibili.broadcast.v1.ModRpcProto.ModResourceResp getDefaultInstanceForType() {
        return bilibili.broadcast.v1.ModRpcProto.ModResourceResp.getDefaultInstance();
      }

      @java.lang.Override
      public bilibili.broadcast.v1.ModRpcProto.ModResourceResp build() {
        bilibili.broadcast.v1.ModRpcProto.ModResourceResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public bilibili.broadcast.v1.ModRpcProto.ModResourceResp buildPartial() {
        bilibili.broadcast.v1.ModRpcProto.ModResourceResp result = new bilibili.broadcast.v1.ModRpcProto.ModResourceResp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(bilibili.broadcast.v1.ModRpcProto.ModResourceResp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.atcion_ = atcion_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.appKey_ = appKey_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.poolName_ = poolName_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.moduleName_ = moduleName_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.moduleVersion_ = moduleVersion_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.listVersion_ = listVersion_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bilibili.broadcast.v1.ModRpcProto.ModResourceResp) {
          return mergeFrom((bilibili.broadcast.v1.ModRpcProto.ModResourceResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(bilibili.broadcast.v1.ModRpcProto.ModResourceResp other) {
        if (other == bilibili.broadcast.v1.ModRpcProto.ModResourceResp.getDefaultInstance()) return this;
        if (other.getAtcion() != 0) {
          setAtcion(other.getAtcion());
        }
        if (!other.getAppKey().isEmpty()) {
          appKey_ = other.appKey_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getPoolName().isEmpty()) {
          poolName_ = other.poolName_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getModuleName().isEmpty()) {
          moduleName_ = other.moduleName_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.getModuleVersion() != 0L) {
          setModuleVersion(other.getModuleVersion());
        }
        if (other.getListVersion() != 0L) {
          setListVersion(other.getListVersion());
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
                atcion_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                appKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                poolName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                moduleName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                moduleVersion_ = input.readInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                listVersion_ = input.readInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
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

      private int atcion_ ;
      /**
       * <pre>
       * </pre>
       *
       * <code>int32 atcion = 1;</code>
       * @return The atcion.
       */
      @java.lang.Override
      public int getAtcion() {
        return atcion_;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int32 atcion = 1;</code>
       * @param value The atcion to set.
       * @return This builder for chaining.
       */
      public Builder setAtcion(int value) {

        atcion_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int32 atcion = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAtcion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        atcion_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object appKey_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string app_key = 2;</code>
       * @return The appKey.
       */
      public java.lang.String getAppKey() {
        java.lang.Object ref = appKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          appKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string app_key = 2;</code>
       * @return The bytes for appKey.
       */
      public com.google.protobuf.ByteString
          getAppKeyBytes() {
        java.lang.Object ref = appKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string app_key = 2;</code>
       * @param value The appKey to set.
       * @return This builder for chaining.
       */
      public Builder setAppKey(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        appKey_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string app_key = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppKey() {
        appKey_ = getDefaultInstance().getAppKey();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string app_key = 2;</code>
       * @param value The bytes for appKey to set.
       * @return This builder for chaining.
       */
      public Builder setAppKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        appKey_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object poolName_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string pool_name = 3;</code>
       * @return The poolName.
       */
      public java.lang.String getPoolName() {
        java.lang.Object ref = poolName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          poolName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string pool_name = 3;</code>
       * @return The bytes for poolName.
       */
      public com.google.protobuf.ByteString
          getPoolNameBytes() {
        java.lang.Object ref = poolName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          poolName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string pool_name = 3;</code>
       * @param value The poolName to set.
       * @return This builder for chaining.
       */
      public Builder setPoolName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        poolName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string pool_name = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolName() {
        poolName_ = getDefaultInstance().getPoolName();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string pool_name = 3;</code>
       * @param value The bytes for poolName to set.
       * @return This builder for chaining.
       */
      public Builder setPoolNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        poolName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object moduleName_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string module_name = 4;</code>
       * @return The moduleName.
       */
      public java.lang.String getModuleName() {
        java.lang.Object ref = moduleName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          moduleName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string module_name = 4;</code>
       * @return The bytes for moduleName.
       */
      public com.google.protobuf.ByteString
          getModuleNameBytes() {
        java.lang.Object ref = moduleName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          moduleName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string module_name = 4;</code>
       * @param value The moduleName to set.
       * @return This builder for chaining.
       */
      public Builder setModuleName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        moduleName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string module_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleName() {
        moduleName_ = getDefaultInstance().getModuleName();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string module_name = 4;</code>
       * @param value The bytes for moduleName to set.
       * @return This builder for chaining.
       */
      public Builder setModuleNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        moduleName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private long moduleVersion_ ;
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 module_version = 5;</code>
       * @return The moduleVersion.
       */
      @java.lang.Override
      public long getModuleVersion() {
        return moduleVersion_;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 module_version = 5;</code>
       * @param value The moduleVersion to set.
       * @return This builder for chaining.
       */
      public Builder setModuleVersion(long value) {

        moduleVersion_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 module_version = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        moduleVersion_ = 0L;
        onChanged();
        return this;
      }

      private long listVersion_ ;
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 list_version = 6;</code>
       * @return The listVersion.
       */
      @java.lang.Override
      public long getListVersion() {
        return listVersion_;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 list_version = 6;</code>
       * @param value The listVersion to set.
       * @return This builder for chaining.
       */
      public Builder setListVersion(long value) {

        listVersion_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 list_version = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearListVersion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        listVersion_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:bilibili.broadcast.v1.ModResourceResp)
    }

    // @@protoc_insertion_point(class_scope:bilibili.broadcast.v1.ModResourceResp)
    private static final bilibili.broadcast.v1.ModRpcProto.ModResourceResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new bilibili.broadcast.v1.ModRpcProto.ModResourceResp();
    }

    public static bilibili.broadcast.v1.ModRpcProto.ModResourceResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ModResourceResp>
        PARSER = new com.google.protobuf.AbstractParser<ModResourceResp>() {
      @java.lang.Override
      public ModResourceResp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ModResourceResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ModResourceResp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public bilibili.broadcast.v1.ModRpcProto.ModResourceResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_v1_ModResourceResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037bilibili/broadcast/v1/mod.proto\022\025bilib" +
      "ili.broadcast.v1\032\033google/protobuf/empty." +
      "proto\"\210\001\n\017ModResourceResp\022\016\n\006atcion\030\001 \001(" +
      "\005\022\017\n\007app_key\030\002 \001(\t\022\021\n\tpool_name\030\003 \001(\t\022\023\n" +
      "\013module_name\030\004 \001(\t\022\026\n\016module_version\030\005 \001" +
      "(\003\022\024\n\014list_version\030\006 \001(\0032_\n\nModManager\022Q" +
      "\n\rWatchResource\022\026.google.protobuf.Empty\032" +
      "&.bilibili.broadcast.v1.ModResourceResp0" +
      "\001B\017B\013ModRpcProtoP\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_broadcast_v1_ModResourceResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_v1_ModResourceResp_descriptor,
        new java.lang.String[] { "Atcion", "AppKey", "PoolName", "ModuleName", "ModuleVersion", "ListVersion", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
