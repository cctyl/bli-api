// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/gaia/gw/gw_api.proto

package bilibili.gaia.gw;

/**
 * <pre>
 * 待加密的pb对象
 * </pre>
 *
 * Protobuf type {@code bilibili.gaia.gw.DeviceAppList}
 */
public final class DeviceAppList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.gaia.gw.DeviceAppList)
    DeviceAppListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceAppList.newBuilder() to construct.
  private DeviceAppList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceAppList() {
    source_ = "";
    systemAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    userAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceAppList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_DeviceAppList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_DeviceAppList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.gaia.gw.DeviceAppList.class, bilibili.gaia.gw.DeviceAppList.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object source_ = "";
  /**
   * <pre>
   * 上报类型
   * first_installation:首次安装上报 first_open:每日启动上报
   * </pre>
   *
   * <code>string source = 1;</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 上报类型
   * first_installation:首次安装上报 first_open:每日启动上报
   * </pre>
   *
   * <code>string source = 1;</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYSTEM_APP_LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList systemAppList_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * 安装的系统程序列表
   * </pre>
   *
   * <code>repeated string system_app_list = 2;</code>
   * @return A list containing the systemAppList.
   */
  public com.google.protobuf.ProtocolStringList
      getSystemAppListList() {
    return systemAppList_;
  }
  /**
   * <pre>
   * 安装的系统程序列表
   * </pre>
   *
   * <code>repeated string system_app_list = 2;</code>
   * @return The count of systemAppList.
   */
  public int getSystemAppListCount() {
    return systemAppList_.size();
  }
  /**
   * <pre>
   * 安装的系统程序列表
   * </pre>
   *
   * <code>repeated string system_app_list = 2;</code>
   * @param index The index of the element to return.
   * @return The systemAppList at the given index.
   */
  public java.lang.String getSystemAppList(int index) {
    return systemAppList_.get(index);
  }
  /**
   * <pre>
   * 安装的系统程序列表
   * </pre>
   *
   * <code>repeated string system_app_list = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the systemAppList at the given index.
   */
  public com.google.protobuf.ByteString
      getSystemAppListBytes(int index) {
    return systemAppList_.getByteString(index);
  }

  public static final int USER_APP_LIST_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userAppList_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   *安装的用户程序列表
   * </pre>
   *
   * <code>repeated string user_app_list = 3;</code>
   * @return A list containing the userAppList.
   */
  public com.google.protobuf.ProtocolStringList
      getUserAppListList() {
    return userAppList_;
  }
  /**
   * <pre>
   *安装的用户程序列表
   * </pre>
   *
   * <code>repeated string user_app_list = 3;</code>
   * @return The count of userAppList.
   */
  public int getUserAppListCount() {
    return userAppList_.size();
  }
  /**
   * <pre>
   *安装的用户程序列表
   * </pre>
   *
   * <code>repeated string user_app_list = 3;</code>
   * @param index The index of the element to return.
   * @return The userAppList at the given index.
   */
  public java.lang.String getUserAppList(int index) {
    return userAppList_.get(index);
  }
  /**
   * <pre>
   *安装的用户程序列表
   * </pre>
   *
   * <code>repeated string user_app_list = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userAppList at the given index.
   */
  public com.google.protobuf.ByteString
      getUserAppListBytes(int index) {
    return userAppList_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    for (int i = 0; i < systemAppList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, systemAppList_.getRaw(i));
    }
    for (int i = 0; i < userAppList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userAppList_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < systemAppList_.size(); i++) {
        dataSize += computeStringSizeNoTag(systemAppList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSystemAppListList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < userAppList_.size(); i++) {
        dataSize += computeStringSizeNoTag(userAppList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserAppListList().size();
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
    if (!(obj instanceof bilibili.gaia.gw.DeviceAppList)) {
      return super.equals(obj);
    }
    bilibili.gaia.gw.DeviceAppList other = (bilibili.gaia.gw.DeviceAppList) obj;

    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getSystemAppListList()
        .equals(other.getSystemAppListList())) return false;
    if (!getUserAppListList()
        .equals(other.getUserAppListList())) return false;
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    if (getSystemAppListCount() > 0) {
      hash = (37 * hash) + SYSTEM_APP_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSystemAppListList().hashCode();
    }
    if (getUserAppListCount() > 0) {
      hash = (37 * hash) + USER_APP_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getUserAppListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.DeviceAppList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.DeviceAppList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.gaia.gw.DeviceAppList parseFrom(
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
  public static Builder newBuilder(bilibili.gaia.gw.DeviceAppList prototype) {
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
   * 待加密的pb对象
   * </pre>
   *
   * Protobuf type {@code bilibili.gaia.gw.DeviceAppList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.gaia.gw.DeviceAppList)
      bilibili.gaia.gw.DeviceAppListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_DeviceAppList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_DeviceAppList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.gaia.gw.DeviceAppList.class, bilibili.gaia.gw.DeviceAppList.Builder.class);
    }

    // Construct using bilibili.gaia.gw.DeviceAppList.newBuilder()
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
      source_ = "";
      systemAppList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      userAppList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.gaia.gw.GwApi.internal_static_bilibili_gaia_gw_DeviceAppList_descriptor;
    }

    @java.lang.Override
    public bilibili.gaia.gw.DeviceAppList getDefaultInstanceForType() {
      return bilibili.gaia.gw.DeviceAppList.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.gaia.gw.DeviceAppList build() {
      bilibili.gaia.gw.DeviceAppList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.gaia.gw.DeviceAppList buildPartial() {
      bilibili.gaia.gw.DeviceAppList result = new bilibili.gaia.gw.DeviceAppList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.gaia.gw.DeviceAppList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.source_ = source_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        systemAppList_.makeImmutable();
        result.systemAppList_ = systemAppList_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        userAppList_.makeImmutable();
        result.userAppList_ = userAppList_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.gaia.gw.DeviceAppList) {
        return mergeFrom((bilibili.gaia.gw.DeviceAppList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.gaia.gw.DeviceAppList other) {
      if (other == bilibili.gaia.gw.DeviceAppList.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.systemAppList_.isEmpty()) {
        if (systemAppList_.isEmpty()) {
          systemAppList_ = other.systemAppList_;
          bitField0_ |= 0x00000002;
        } else {
          ensureSystemAppListIsMutable();
          systemAppList_.addAll(other.systemAppList_);
        }
        onChanged();
      }
      if (!other.userAppList_.isEmpty()) {
        if (userAppList_.isEmpty()) {
          userAppList_ = other.userAppList_;
          bitField0_ |= 0x00000004;
        } else {
          ensureUserAppListIsMutable();
          userAppList_.addAll(other.userAppList_);
        }
        onChanged();
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
              source_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSystemAppListIsMutable();
              systemAppList_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserAppListIsMutable();
              userAppList_.add(s);
              break;
            } // case 26
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

    private java.lang.Object source_ = "";
    /**
     * <pre>
     * 上报类型
     * first_installation:首次安装上报 first_open:每日启动上报
     * </pre>
     *
     * <code>string source = 1;</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 上报类型
     * first_installation:首次安装上报 first_open:每日启动上报
     * </pre>
     *
     * <code>string source = 1;</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 上报类型
     * first_installation:首次安装上报 first_open:每日启动上报
     * </pre>
     *
     * <code>string source = 1;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      source_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报类型
     * first_installation:首次安装上报 first_open:每日启动上报
     * </pre>
     *
     * <code>string source = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      source_ = getDefaultInstance().getSource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上报类型
     * first_installation:首次安装上报 first_open:每日启动上报
     * </pre>
     *
     * <code>string source = 1;</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      source_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList systemAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSystemAppListIsMutable() {
      if (!systemAppList_.isModifiable()) {
        systemAppList_ = new com.google.protobuf.LazyStringArrayList(systemAppList_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @return A list containing the systemAppList.
     */
    public com.google.protobuf.ProtocolStringList
        getSystemAppListList() {
      systemAppList_.makeImmutable();
      return systemAppList_;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @return The count of systemAppList.
     */
    public int getSystemAppListCount() {
      return systemAppList_.size();
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param index The index of the element to return.
     * @return The systemAppList at the given index.
     */
    public java.lang.String getSystemAppList(int index) {
      return systemAppList_.get(index);
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the systemAppList at the given index.
     */
    public com.google.protobuf.ByteString
        getSystemAppListBytes(int index) {
      return systemAppList_.getByteString(index);
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param index The index to set the value at.
     * @param value The systemAppList to set.
     * @return This builder for chaining.
     */
    public Builder setSystemAppList(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSystemAppListIsMutable();
      systemAppList_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param value The systemAppList to add.
     * @return This builder for chaining.
     */
    public Builder addSystemAppList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSystemAppListIsMutable();
      systemAppList_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param values The systemAppList to add.
     * @return This builder for chaining.
     */
    public Builder addAllSystemAppList(
        java.lang.Iterable<java.lang.String> values) {
      ensureSystemAppListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, systemAppList_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSystemAppList() {
      systemAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 安装的系统程序列表
     * </pre>
     *
     * <code>repeated string system_app_list = 2;</code>
     * @param value The bytes of the systemAppList to add.
     * @return This builder for chaining.
     */
    public Builder addSystemAppListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSystemAppListIsMutable();
      systemAppList_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList userAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserAppListIsMutable() {
      if (!userAppList_.isModifiable()) {
        userAppList_ = new com.google.protobuf.LazyStringArrayList(userAppList_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @return A list containing the userAppList.
     */
    public com.google.protobuf.ProtocolStringList
        getUserAppListList() {
      userAppList_.makeImmutable();
      return userAppList_;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @return The count of userAppList.
     */
    public int getUserAppListCount() {
      return userAppList_.size();
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param index The index of the element to return.
     * @return The userAppList at the given index.
     */
    public java.lang.String getUserAppList(int index) {
      return userAppList_.get(index);
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the userAppList at the given index.
     */
    public com.google.protobuf.ByteString
        getUserAppListBytes(int index) {
      return userAppList_.getByteString(index);
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param index The index to set the value at.
     * @param value The userAppList to set.
     * @return This builder for chaining.
     */
    public Builder setUserAppList(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserAppListIsMutable();
      userAppList_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param value The userAppList to add.
     * @return This builder for chaining.
     */
    public Builder addUserAppList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserAppListIsMutable();
      userAppList_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param values The userAppList to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserAppList(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserAppListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userAppList_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserAppList() {
      userAppList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *安装的用户程序列表
     * </pre>
     *
     * <code>repeated string user_app_list = 3;</code>
     * @param value The bytes of the userAppList to add.
     * @return This builder for chaining.
     */
    public Builder addUserAppListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserAppListIsMutable();
      userAppList_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:bilibili.gaia.gw.DeviceAppList)
  }

  // @@protoc_insertion_point(class_scope:bilibili.gaia.gw.DeviceAppList)
  private static final bilibili.gaia.gw.DeviceAppList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.gaia.gw.DeviceAppList();
  }

  public static bilibili.gaia.gw.DeviceAppList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceAppList>
      PARSER = new com.google.protobuf.AbstractParser<DeviceAppList>() {
    @java.lang.Override
    public DeviceAppList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceAppList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceAppList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.gaia.gw.DeviceAppList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

