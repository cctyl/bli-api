// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * 点赞用户模块
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.ModuleLikeUser}
 */
public final class ModuleLikeUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.ModuleLikeUser)
    ModuleLikeUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleLikeUser.newBuilder() to construct.
  private ModuleLikeUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleLikeUser() {
    likeUsers_ = java.util.Collections.emptyList();
    displayText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleLikeUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_ModuleLikeUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_ModuleLikeUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v1.ModuleLikeUser.class, bilibili.app.dynamic.v1.ModuleLikeUser.Builder.class);
  }

  public static final int LIKE_USERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v1.LikeUser> likeUsers_;
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v1.LikeUser> getLikeUsersList() {
    return likeUsers_;
  }
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v1.LikeUserOrBuilder> 
      getLikeUsersOrBuilderList() {
    return likeUsers_;
  }
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
   */
  @java.lang.Override
  public int getLikeUsersCount() {
    return likeUsers_.size();
  }
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.LikeUser getLikeUsers(int index) {
    return likeUsers_.get(index);
  }
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v1.LikeUserOrBuilder getLikeUsersOrBuilder(
      int index) {
    return likeUsers_.get(index);
  }

  public static final int DISPLAY_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayText_ = "";
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string display_text = 2;</code>
   * @return The displayText.
   */
  @java.lang.Override
  public java.lang.String getDisplayText() {
    java.lang.Object ref = displayText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string display_text = 2;</code>
   * @return The bytes for displayText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayTextBytes() {
    java.lang.Object ref = displayText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < likeUsers_.size(); i++) {
      output.writeMessage(1, likeUsers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayText_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < likeUsers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, likeUsers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayText_);
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
    if (!(obj instanceof bilibili.app.dynamic.v1.ModuleLikeUser)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v1.ModuleLikeUser other = (bilibili.app.dynamic.v1.ModuleLikeUser) obj;

    if (!getLikeUsersList()
        .equals(other.getLikeUsersList())) return false;
    if (!getDisplayText()
        .equals(other.getDisplayText())) return false;
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
    if (getLikeUsersCount() > 0) {
      hash = (37 * hash) + LIKE_USERS_FIELD_NUMBER;
      hash = (53 * hash) + getLikeUsersList().hashCode();
    }
    hash = (37 * hash) + DISPLAY_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayText().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v1.ModuleLikeUser parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v1.ModuleLikeUser prototype) {
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
   * 点赞用户模块
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.ModuleLikeUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.ModuleLikeUser)
      bilibili.app.dynamic.v1.ModuleLikeUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_ModuleLikeUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_ModuleLikeUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v1.ModuleLikeUser.class, bilibili.app.dynamic.v1.ModuleLikeUser.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v1.ModuleLikeUser.newBuilder()
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
      if (likeUsersBuilder_ == null) {
        likeUsers_ = java.util.Collections.emptyList();
      } else {
        likeUsers_ = null;
        likeUsersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      displayText_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v1.DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_ModuleLikeUser_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.ModuleLikeUser getDefaultInstanceForType() {
      return bilibili.app.dynamic.v1.ModuleLikeUser.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.ModuleLikeUser build() {
      bilibili.app.dynamic.v1.ModuleLikeUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v1.ModuleLikeUser buildPartial() {
      bilibili.app.dynamic.v1.ModuleLikeUser result = new bilibili.app.dynamic.v1.ModuleLikeUser(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v1.ModuleLikeUser result) {
      if (likeUsersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          likeUsers_ = java.util.Collections.unmodifiableList(likeUsers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.likeUsers_ = likeUsers_;
      } else {
        result.likeUsers_ = likeUsersBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v1.ModuleLikeUser result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayText_ = displayText_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v1.ModuleLikeUser) {
        return mergeFrom((bilibili.app.dynamic.v1.ModuleLikeUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v1.ModuleLikeUser other) {
      if (other == bilibili.app.dynamic.v1.ModuleLikeUser.getDefaultInstance()) return this;
      if (likeUsersBuilder_ == null) {
        if (!other.likeUsers_.isEmpty()) {
          if (likeUsers_.isEmpty()) {
            likeUsers_ = other.likeUsers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLikeUsersIsMutable();
            likeUsers_.addAll(other.likeUsers_);
          }
          onChanged();
        }
      } else {
        if (!other.likeUsers_.isEmpty()) {
          if (likeUsersBuilder_.isEmpty()) {
            likeUsersBuilder_.dispose();
            likeUsersBuilder_ = null;
            likeUsers_ = other.likeUsers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            likeUsersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLikeUsersFieldBuilder() : null;
          } else {
            likeUsersBuilder_.addAllMessages(other.likeUsers_);
          }
        }
      }
      if (!other.getDisplayText().isEmpty()) {
        displayText_ = other.displayText_;
        bitField0_ |= 0x00000002;
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
              bilibili.app.dynamic.v1.LikeUser m =
                  input.readMessage(
                      bilibili.app.dynamic.v1.LikeUser.parser(),
                      extensionRegistry);
              if (likeUsersBuilder_ == null) {
                ensureLikeUsersIsMutable();
                likeUsers_.add(m);
              } else {
                likeUsersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              displayText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<bilibili.app.dynamic.v1.LikeUser> likeUsers_ =
      java.util.Collections.emptyList();
    private void ensureLikeUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        likeUsers_ = new java.util.ArrayList<bilibili.app.dynamic.v1.LikeUser>(likeUsers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v1.LikeUser, bilibili.app.dynamic.v1.LikeUser.Builder, bilibili.app.dynamic.v1.LikeUserOrBuilder> likeUsersBuilder_;

    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v1.LikeUser> getLikeUsersList() {
      if (likeUsersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(likeUsers_);
      } else {
        return likeUsersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public int getLikeUsersCount() {
      if (likeUsersBuilder_ == null) {
        return likeUsers_.size();
      } else {
        return likeUsersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public bilibili.app.dynamic.v1.LikeUser getLikeUsers(int index) {
      if (likeUsersBuilder_ == null) {
        return likeUsers_.get(index);
      } else {
        return likeUsersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder setLikeUsers(
        int index, bilibili.app.dynamic.v1.LikeUser value) {
      if (likeUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLikeUsersIsMutable();
        likeUsers_.set(index, value);
        onChanged();
      } else {
        likeUsersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder setLikeUsers(
        int index, bilibili.app.dynamic.v1.LikeUser.Builder builderForValue) {
      if (likeUsersBuilder_ == null) {
        ensureLikeUsersIsMutable();
        likeUsers_.set(index, builderForValue.build());
        onChanged();
      } else {
        likeUsersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder addLikeUsers(bilibili.app.dynamic.v1.LikeUser value) {
      if (likeUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLikeUsersIsMutable();
        likeUsers_.add(value);
        onChanged();
      } else {
        likeUsersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder addLikeUsers(
        int index, bilibili.app.dynamic.v1.LikeUser value) {
      if (likeUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLikeUsersIsMutable();
        likeUsers_.add(index, value);
        onChanged();
      } else {
        likeUsersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder addLikeUsers(
        bilibili.app.dynamic.v1.LikeUser.Builder builderForValue) {
      if (likeUsersBuilder_ == null) {
        ensureLikeUsersIsMutable();
        likeUsers_.add(builderForValue.build());
        onChanged();
      } else {
        likeUsersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder addLikeUsers(
        int index, bilibili.app.dynamic.v1.LikeUser.Builder builderForValue) {
      if (likeUsersBuilder_ == null) {
        ensureLikeUsersIsMutable();
        likeUsers_.add(index, builderForValue.build());
        onChanged();
      } else {
        likeUsersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder addAllLikeUsers(
        java.lang.Iterable<? extends bilibili.app.dynamic.v1.LikeUser> values) {
      if (likeUsersBuilder_ == null) {
        ensureLikeUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, likeUsers_);
        onChanged();
      } else {
        likeUsersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder clearLikeUsers() {
      if (likeUsersBuilder_ == null) {
        likeUsers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        likeUsersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public Builder removeLikeUsers(int index) {
      if (likeUsersBuilder_ == null) {
        ensureLikeUsersIsMutable();
        likeUsers_.remove(index);
        onChanged();
      } else {
        likeUsersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public bilibili.app.dynamic.v1.LikeUser.Builder getLikeUsersBuilder(
        int index) {
      return getLikeUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public bilibili.app.dynamic.v1.LikeUserOrBuilder getLikeUsersOrBuilder(
        int index) {
      if (likeUsersBuilder_ == null) {
        return likeUsers_.get(index);  } else {
        return likeUsersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v1.LikeUserOrBuilder> 
         getLikeUsersOrBuilderList() {
      if (likeUsersBuilder_ != null) {
        return likeUsersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(likeUsers_);
      }
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public bilibili.app.dynamic.v1.LikeUser.Builder addLikeUsersBuilder() {
      return getLikeUsersFieldBuilder().addBuilder(
          bilibili.app.dynamic.v1.LikeUser.getDefaultInstance());
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public bilibili.app.dynamic.v1.LikeUser.Builder addLikeUsersBuilder(
        int index) {
      return getLikeUsersFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v1.LikeUser.getDefaultInstance());
    }
    /**
     * <pre>
     * 点赞用户
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.LikeUser like_users = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v1.LikeUser.Builder> 
         getLikeUsersBuilderList() {
      return getLikeUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v1.LikeUser, bilibili.app.dynamic.v1.LikeUser.Builder, bilibili.app.dynamic.v1.LikeUserOrBuilder> 
        getLikeUsersFieldBuilder() {
      if (likeUsersBuilder_ == null) {
        likeUsersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v1.LikeUser, bilibili.app.dynamic.v1.LikeUser.Builder, bilibili.app.dynamic.v1.LikeUserOrBuilder>(
                likeUsers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        likeUsers_ = null;
      }
      return likeUsersBuilder_;
    }

    private java.lang.Object displayText_ = "";
    /**
     * <pre>
     * 文案
     * </pre>
     *
     * <code>string display_text = 2;</code>
     * @return The displayText.
     */
    public java.lang.String getDisplayText() {
      java.lang.Object ref = displayText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 文案
     * </pre>
     *
     * <code>string display_text = 2;</code>
     * @return The bytes for displayText.
     */
    public com.google.protobuf.ByteString
        getDisplayTextBytes() {
      java.lang.Object ref = displayText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 文案
     * </pre>
     *
     * <code>string display_text = 2;</code>
     * @param value The displayText to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文案
     * </pre>
     *
     * <code>string display_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayText() {
      displayText_ = getDefaultInstance().getDisplayText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文案
     * </pre>
     *
     * <code>string display_text = 2;</code>
     * @param value The bytes for displayText to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayText_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.ModuleLikeUser)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.ModuleLikeUser)
  private static final bilibili.app.dynamic.v1.ModuleLikeUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v1.ModuleLikeUser();
  }

  public static bilibili.app.dynamic.v1.ModuleLikeUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleLikeUser>
      PARSER = new com.google.protobuf.AbstractParser<ModuleLikeUser>() {
    @java.lang.Override
    public ModuleLikeUser parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModuleLikeUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleLikeUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v1.ModuleLikeUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
