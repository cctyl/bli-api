// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/resource/v1/module.proto

package bilibili.app.resource.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code bilibili.app.resource.v1.VersionListReq}
 */
public final class VersionListReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.resource.v1.VersionListReq)
    VersionListReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VersionListReq.newBuilder() to construct.
  private VersionListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VersionListReq() {
    poolName_ = "";
    versions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VersionListReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.resource.v1.ModuleOuterClass.internal_static_bilibili_app_resource_v1_VersionListReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.resource.v1.ModuleOuterClass.internal_static_bilibili_app_resource_v1_VersionListReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.resource.v1.VersionListReq.class, bilibili.app.resource.v1.VersionListReq.Builder.class);
  }

  public static final int POOL_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object poolName_ = "";
  /**
   * <pre>
   * </pre>
   *
   * <code>string pool_name = 1;</code>
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
   * <code>string pool_name = 1;</code>
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

  public static final int VERSIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.resource.v1.VersionReq> versions_;
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.resource.v1.VersionReq> getVersionsList() {
    return versions_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.resource.v1.VersionReqOrBuilder> 
      getVersionsOrBuilderList() {
    return versions_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
   */
  @java.lang.Override
  public int getVersionsCount() {
    return versions_.size();
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.resource.v1.VersionReq getVersions(int index) {
    return versions_.get(index);
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
   */
  @java.lang.Override
  public bilibili.app.resource.v1.VersionReqOrBuilder getVersionsOrBuilder(
      int index) {
    return versions_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poolName_);
    }
    for (int i = 0; i < versions_.size(); i++) {
      output.writeMessage(2, versions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poolName_);
    }
    for (int i = 0; i < versions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, versions_.get(i));
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
    if (!(obj instanceof bilibili.app.resource.v1.VersionListReq)) {
      return super.equals(obj);
    }
    bilibili.app.resource.v1.VersionListReq other = (bilibili.app.resource.v1.VersionListReq) obj;

    if (!getPoolName()
        .equals(other.getPoolName())) return false;
    if (!getVersionsList()
        .equals(other.getVersionsList())) return false;
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
    hash = (37 * hash) + POOL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPoolName().hashCode();
    if (getVersionsCount() > 0) {
      hash = (37 * hash) + VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getVersionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.resource.v1.VersionListReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.v1.VersionListReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.resource.v1.VersionListReq parseFrom(
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
  public static Builder newBuilder(bilibili.app.resource.v1.VersionListReq prototype) {
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
   * Protobuf type {@code bilibili.app.resource.v1.VersionListReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.resource.v1.VersionListReq)
      bilibili.app.resource.v1.VersionListReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.resource.v1.ModuleOuterClass.internal_static_bilibili_app_resource_v1_VersionListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.resource.v1.ModuleOuterClass.internal_static_bilibili_app_resource_v1_VersionListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.resource.v1.VersionListReq.class, bilibili.app.resource.v1.VersionListReq.Builder.class);
    }

    // Construct using bilibili.app.resource.v1.VersionListReq.newBuilder()
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
      poolName_ = "";
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
      } else {
        versions_ = null;
        versionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.resource.v1.ModuleOuterClass.internal_static_bilibili_app_resource_v1_VersionListReq_descriptor;
    }

    @java.lang.Override
    public bilibili.app.resource.v1.VersionListReq getDefaultInstanceForType() {
      return bilibili.app.resource.v1.VersionListReq.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.resource.v1.VersionListReq build() {
      bilibili.app.resource.v1.VersionListReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.resource.v1.VersionListReq buildPartial() {
      bilibili.app.resource.v1.VersionListReq result = new bilibili.app.resource.v1.VersionListReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.resource.v1.VersionListReq result) {
      if (versionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          versions_ = java.util.Collections.unmodifiableList(versions_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.versions_ = versions_;
      } else {
        result.versions_ = versionsBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.resource.v1.VersionListReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolName_ = poolName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.resource.v1.VersionListReq) {
        return mergeFrom((bilibili.app.resource.v1.VersionListReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.resource.v1.VersionListReq other) {
      if (other == bilibili.app.resource.v1.VersionListReq.getDefaultInstance()) return this;
      if (!other.getPoolName().isEmpty()) {
        poolName_ = other.poolName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (versionsBuilder_ == null) {
        if (!other.versions_.isEmpty()) {
          if (versions_.isEmpty()) {
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVersionsIsMutable();
            versions_.addAll(other.versions_);
          }
          onChanged();
        }
      } else {
        if (!other.versions_.isEmpty()) {
          if (versionsBuilder_.isEmpty()) {
            versionsBuilder_.dispose();
            versionsBuilder_ = null;
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000002);
            versionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVersionsFieldBuilder() : null;
          } else {
            versionsBuilder_.addAllMessages(other.versions_);
          }
        }
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
              poolName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bilibili.app.resource.v1.VersionReq m =
                  input.readMessage(
                      bilibili.app.resource.v1.VersionReq.parser(),
                      extensionRegistry);
              if (versionsBuilder_ == null) {
                ensureVersionsIsMutable();
                versions_.add(m);
              } else {
                versionsBuilder_.addMessage(m);
              }
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

    private java.lang.Object poolName_ = "";
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 1;</code>
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
     * <code>string pool_name = 1;</code>
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
     * <code>string pool_name = 1;</code>
     * @param value The poolName to set.
     * @return This builder for chaining.
     */
    public Builder setPoolName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      poolName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolName() {
      poolName_ = getDefaultInstance().getPoolName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string pool_name = 1;</code>
     * @param value The bytes for poolName to set.
     * @return This builder for chaining.
     */
    public Builder setPoolNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      poolName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<bilibili.app.resource.v1.VersionReq> versions_ =
      java.util.Collections.emptyList();
    private void ensureVersionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        versions_ = new java.util.ArrayList<bilibili.app.resource.v1.VersionReq>(versions_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.resource.v1.VersionReq, bilibili.app.resource.v1.VersionReq.Builder, bilibili.app.resource.v1.VersionReqOrBuilder> versionsBuilder_;

    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public java.util.List<bilibili.app.resource.v1.VersionReq> getVersionsList() {
      if (versionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(versions_);
      } else {
        return versionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public int getVersionsCount() {
      if (versionsBuilder_ == null) {
        return versions_.size();
      } else {
        return versionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public bilibili.app.resource.v1.VersionReq getVersions(int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);
      } else {
        return versionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder setVersions(
        int index, bilibili.app.resource.v1.VersionReq value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.set(index, value);
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder setVersions(
        int index, bilibili.app.resource.v1.VersionReq.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.set(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder addVersions(bilibili.app.resource.v1.VersionReq value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder addVersions(
        int index, bilibili.app.resource.v1.VersionReq value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(index, value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder addVersions(
        bilibili.app.resource.v1.VersionReq.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder addVersions(
        int index, bilibili.app.resource.v1.VersionReq.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder addAllVersions(
        java.lang.Iterable<? extends bilibili.app.resource.v1.VersionReq> values) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, versions_);
        onChanged();
      } else {
        versionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder clearVersions() {
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        versionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public Builder removeVersions(int index) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.remove(index);
        onChanged();
      } else {
        versionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public bilibili.app.resource.v1.VersionReq.Builder getVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public bilibili.app.resource.v1.VersionReqOrBuilder getVersionsOrBuilder(
        int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);  } else {
        return versionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public java.util.List<? extends bilibili.app.resource.v1.VersionReqOrBuilder> 
         getVersionsOrBuilderList() {
      if (versionsBuilder_ != null) {
        return versionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(versions_);
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public bilibili.app.resource.v1.VersionReq.Builder addVersionsBuilder() {
      return getVersionsFieldBuilder().addBuilder(
          bilibili.app.resource.v1.VersionReq.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public bilibili.app.resource.v1.VersionReq.Builder addVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().addBuilder(
          index, bilibili.app.resource.v1.VersionReq.getDefaultInstance());
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>repeated .bilibili.app.resource.v1.VersionReq versions = 2;</code>
     */
    public java.util.List<bilibili.app.resource.v1.VersionReq.Builder> 
         getVersionsBuilderList() {
      return getVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.resource.v1.VersionReq, bilibili.app.resource.v1.VersionReq.Builder, bilibili.app.resource.v1.VersionReqOrBuilder> 
        getVersionsFieldBuilder() {
      if (versionsBuilder_ == null) {
        versionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.resource.v1.VersionReq, bilibili.app.resource.v1.VersionReq.Builder, bilibili.app.resource.v1.VersionReqOrBuilder>(
                versions_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        versions_ = null;
      }
      return versionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.resource.v1.VersionListReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.resource.v1.VersionListReq)
  private static final bilibili.app.resource.v1.VersionListReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.resource.v1.VersionListReq();
  }

  public static bilibili.app.resource.v1.VersionListReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionListReq>
      PARSER = new com.google.protobuf.AbstractParser<VersionListReq>() {
    @java.lang.Override
    public VersionListReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<VersionListReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionListReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.resource.v1.VersionListReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

