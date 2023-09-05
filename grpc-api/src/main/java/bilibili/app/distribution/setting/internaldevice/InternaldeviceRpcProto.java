// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/internaldevice.proto

package bilibili.app.distribution.setting.internaldevice;

public final class InternaldeviceRpcProto {
  private InternaldeviceRpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InternalDeviceConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     * @return Whether the fts field is set.
     */
    boolean hasFts();
    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     * @return The fts.
     */
    bilibili.app.distribution.v1.DistributionRpcProto.Int64Value getFts();
    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     */
    bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder getFtsOrBuilder();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * Protobuf type {@code bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig}
   */
  public static final class InternalDeviceConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig)
      InternalDeviceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InternalDeviceConfig.newBuilder() to construct.
    private InternalDeviceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InternalDeviceConfig() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InternalDeviceConfig();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.class, bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.Builder.class);
    }

    public static final int FTS_FIELD_NUMBER = 1;
    private bilibili.app.distribution.v1.DistributionRpcProto.Int64Value fts_;
    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     * @return Whether the fts field is set.
     */
    @java.lang.Override
    public boolean hasFts() {
      return fts_ != null;
    }
    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     * @return The fts.
     */
    @java.lang.Override
    public bilibili.app.distribution.v1.DistributionRpcProto.Int64Value getFts() {
      return fts_ == null ? bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.getDefaultInstance() : fts_;
    }
    /**
     * <pre>
     * 首次启动时间
     * </pre>
     *
     * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
     */
    @java.lang.Override
    public bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder getFtsOrBuilder() {
      return fts_ == null ? bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.getDefaultInstance() : fts_;
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
      if (fts_ != null) {
        output.writeMessage(1, getFts());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fts_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getFts());
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
      if (!(obj instanceof bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig)) {
        return super.equals(obj);
      }
      bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig other = (bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig) obj;

      if (hasFts() != other.hasFts()) return false;
      if (hasFts()) {
        if (!getFts()
            .equals(other.getFts())) return false;
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
      if (hasFts()) {
        hash = (37 * hash) + FTS_FIELD_NUMBER;
        hash = (53 * hash) + getFts().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig parseFrom(
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
    public static Builder newBuilder(bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig prototype) {
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
     * Protobuf type {@code bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig)
        bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.class, bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.Builder.class);
      }

      // Construct using bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.newBuilder()
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
        fts_ = null;
        if (ftsBuilder_ != null) {
          ftsBuilder_.dispose();
          ftsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor;
      }

      @java.lang.Override
      public bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig getDefaultInstanceForType() {
        return bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.getDefaultInstance();
      }

      @java.lang.Override
      public bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig build() {
        bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig buildPartial() {
        bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig result = new bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fts_ = ftsBuilder_ == null
              ? fts_
              : ftsBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig) {
          return mergeFrom((bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig other) {
        if (other == bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig.getDefaultInstance()) return this;
        if (other.hasFts()) {
          mergeFts(other.getFts());
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
                    getFtsFieldBuilder().getBuilder(),
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

      private bilibili.app.distribution.v1.DistributionRpcProto.Int64Value fts_;
      private com.google.protobuf.SingleFieldBuilderV3<
          bilibili.app.distribution.v1.DistributionRpcProto.Int64Value, bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.Builder, bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder> ftsBuilder_;
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       * @return Whether the fts field is set.
       */
      public boolean hasFts() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       * @return The fts.
       */
      public bilibili.app.distribution.v1.DistributionRpcProto.Int64Value getFts() {
        if (ftsBuilder_ == null) {
          return fts_ == null ? bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.getDefaultInstance() : fts_;
        } else {
          return ftsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public Builder setFts(bilibili.app.distribution.v1.DistributionRpcProto.Int64Value value) {
        if (ftsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fts_ = value;
        } else {
          ftsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public Builder setFts(
          bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.Builder builderForValue) {
        if (ftsBuilder_ == null) {
          fts_ = builderForValue.build();
        } else {
          ftsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public Builder mergeFts(bilibili.app.distribution.v1.DistributionRpcProto.Int64Value value) {
        if (ftsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            fts_ != null &&
            fts_ != bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.getDefaultInstance()) {
            getFtsBuilder().mergeFrom(value);
          } else {
            fts_ = value;
          }
        } else {
          ftsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public Builder clearFts() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fts_ = null;
        if (ftsBuilder_ != null) {
          ftsBuilder_.dispose();
          ftsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.Builder getFtsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFtsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      public bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder getFtsOrBuilder() {
        if (ftsBuilder_ != null) {
          return ftsBuilder_.getMessageOrBuilder();
        } else {
          return fts_ == null ?
              bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.getDefaultInstance() : fts_;
        }
      }
      /**
       * <pre>
       * 首次启动时间
       * </pre>
       *
       * <code>.bilibili.app.distribution.v1.Int64Value fts = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          bilibili.app.distribution.v1.DistributionRpcProto.Int64Value, bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.Builder, bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder> 
          getFtsFieldBuilder() {
        if (ftsBuilder_ == null) {
          ftsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              bilibili.app.distribution.v1.DistributionRpcProto.Int64Value, bilibili.app.distribution.v1.DistributionRpcProto.Int64Value.Builder, bilibili.app.distribution.v1.DistributionRpcProto.Int64ValueOrBuilder>(
                  getFts(),
                  getParentForChildren(),
                  isClean());
          fts_ = null;
        }
        return ftsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig)
    }

    // @@protoc_insertion_point(class_scope:bilibili.app.distribution.setting.internaldevice.InternalDeviceConfig)
    private static final bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig();
    }

    public static bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InternalDeviceConfig>
        PARSER = new com.google.protobuf.AbstractParser<InternalDeviceConfig>() {
      @java.lang.Override
      public InternalDeviceConfig parsePartialFrom(
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

    public static com.google.protobuf.Parser<InternalDeviceConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InternalDeviceConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public bilibili.app.distribution.setting.internaldevice.InternaldeviceRpcProto.InternalDeviceConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6bilibili/app/distribution/setting/inte" +
      "rnaldevice.proto\0220bilibili.app.distribut" +
      "ion.setting.internaldevice\032/bilibili/app" +
      "/distribution/v1/distribution.proto\"M\n\024I" +
      "nternalDeviceConfig\0225\n\003fts\030\001 \001(\0132(.bilib" +
      "ili.app.distribution.v1.Int64ValueB\032B\026In" +
      "ternaldeviceRpcProtoP\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.app.distribution.v1.DistributionRpcProto.getDescriptor(),
        });
    internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_distribution_setting_internaldevice_InternalDeviceConfig_descriptor,
        new java.lang.String[] { "Fts", });
    bilibili.app.distribution.v1.DistributionRpcProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
