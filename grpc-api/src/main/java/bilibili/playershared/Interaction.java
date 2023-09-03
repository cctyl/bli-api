// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.playershared.Interaction}
 */
public final class Interaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.playershared.Interaction)
    InteractionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Interaction.newBuilder() to construct.
  private Interaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Interaction() {
    msg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Interaction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_Interaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.playershared.Playershared.internal_static_bilibili_playershared_Interaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.playershared.Interaction.class, bilibili.playershared.Interaction.Builder.class);
  }

  public static final int HISTORY_NODE_FIELD_NUMBER = 1;
  private bilibili.playershared.Node historyNode_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Node history_node = 1;</code>
   * @return Whether the historyNode field is set.
   */
  @java.lang.Override
  public boolean hasHistoryNode() {
    return historyNode_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Node history_node = 1;</code>
   * @return The historyNode.
   */
  @java.lang.Override
  public bilibili.playershared.Node getHistoryNode() {
    return historyNode_ == null ? bilibili.playershared.Node.getDefaultInstance() : historyNode_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Node history_node = 1;</code>
   */
  @java.lang.Override
  public bilibili.playershared.NodeOrBuilder getHistoryNodeOrBuilder() {
    return historyNode_ == null ? bilibili.playershared.Node.getDefaultInstance() : historyNode_;
  }

  public static final int GRAPH_VERSION_FIELD_NUMBER = 2;
  private long graphVersion_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 graph_version = 2;</code>
   * @return The graphVersion.
   */
  @java.lang.Override
  public long getGraphVersion() {
    return graphVersion_;
  }

  public static final int MSG_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object msg_ = "";
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string msg = 3;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string msg = 3;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MARK_FIELD_NUMBER = 4;
  private long mark_ = 0L;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 mark = 4;</code>
   * @return The mark.
   */
  @java.lang.Override
  public long getMark() {
    return mark_;
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
    if (historyNode_ != null) {
      output.writeMessage(1, getHistoryNode());
    }
    if (graphVersion_ != 0L) {
      output.writeInt64(2, graphVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
    }
    if (mark_ != 0L) {
      output.writeInt64(4, mark_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (historyNode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHistoryNode());
    }
    if (graphVersion_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, graphVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
    }
    if (mark_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, mark_);
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
    if (!(obj instanceof bilibili.playershared.Interaction)) {
      return super.equals(obj);
    }
    bilibili.playershared.Interaction other = (bilibili.playershared.Interaction) obj;

    if (hasHistoryNode() != other.hasHistoryNode()) return false;
    if (hasHistoryNode()) {
      if (!getHistoryNode()
          .equals(other.getHistoryNode())) return false;
    }
    if (getGraphVersion()
        != other.getGraphVersion()) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
    if (getMark()
        != other.getMark()) return false;
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
    if (hasHistoryNode()) {
      hash = (37 * hash) + HISTORY_NODE_FIELD_NUMBER;
      hash = (53 * hash) + getHistoryNode().hashCode();
    }
    hash = (37 * hash) + GRAPH_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGraphVersion());
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + MARK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMark());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.playershared.Interaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.Interaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.Interaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.Interaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.Interaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.playershared.Interaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.playershared.Interaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.Interaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.Interaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.playershared.Interaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.playershared.Interaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.playershared.Interaction parseFrom(
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
  public static Builder newBuilder(bilibili.playershared.Interaction prototype) {
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
   * Protobuf type {@code bilibili.playershared.Interaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.playershared.Interaction)
      bilibili.playershared.InteractionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_Interaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_Interaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.playershared.Interaction.class, bilibili.playershared.Interaction.Builder.class);
    }

    // Construct using bilibili.playershared.Interaction.newBuilder()
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
      historyNode_ = null;
      if (historyNodeBuilder_ != null) {
        historyNodeBuilder_.dispose();
        historyNodeBuilder_ = null;
      }
      graphVersion_ = 0L;
      msg_ = "";
      mark_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.playershared.Playershared.internal_static_bilibili_playershared_Interaction_descriptor;
    }

    @java.lang.Override
    public bilibili.playershared.Interaction getDefaultInstanceForType() {
      return bilibili.playershared.Interaction.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.playershared.Interaction build() {
      bilibili.playershared.Interaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.playershared.Interaction buildPartial() {
      bilibili.playershared.Interaction result = new bilibili.playershared.Interaction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(bilibili.playershared.Interaction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.historyNode_ = historyNodeBuilder_ == null
            ? historyNode_
            : historyNodeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.graphVersion_ = graphVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.msg_ = msg_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.mark_ = mark_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.playershared.Interaction) {
        return mergeFrom((bilibili.playershared.Interaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.playershared.Interaction other) {
      if (other == bilibili.playershared.Interaction.getDefaultInstance()) return this;
      if (other.hasHistoryNode()) {
        mergeHistoryNode(other.getHistoryNode());
      }
      if (other.getGraphVersion() != 0L) {
        setGraphVersion(other.getGraphVersion());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getMark() != 0L) {
        setMark(other.getMark());
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
                  getHistoryNodeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              graphVersion_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              msg_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              mark_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private bilibili.playershared.Node historyNode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Node, bilibili.playershared.Node.Builder, bilibili.playershared.NodeOrBuilder> historyNodeBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     * @return Whether the historyNode field is set.
     */
    public boolean hasHistoryNode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     * @return The historyNode.
     */
    public bilibili.playershared.Node getHistoryNode() {
      if (historyNodeBuilder_ == null) {
        return historyNode_ == null ? bilibili.playershared.Node.getDefaultInstance() : historyNode_;
      } else {
        return historyNodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public Builder setHistoryNode(bilibili.playershared.Node value) {
      if (historyNodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        historyNode_ = value;
      } else {
        historyNodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public Builder setHistoryNode(
        bilibili.playershared.Node.Builder builderForValue) {
      if (historyNodeBuilder_ == null) {
        historyNode_ = builderForValue.build();
      } else {
        historyNodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public Builder mergeHistoryNode(bilibili.playershared.Node value) {
      if (historyNodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          historyNode_ != null &&
          historyNode_ != bilibili.playershared.Node.getDefaultInstance()) {
          getHistoryNodeBuilder().mergeFrom(value);
        } else {
          historyNode_ = value;
        }
      } else {
        historyNodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public Builder clearHistoryNode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      historyNode_ = null;
      if (historyNodeBuilder_ != null) {
        historyNodeBuilder_.dispose();
        historyNodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public bilibili.playershared.Node.Builder getHistoryNodeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHistoryNodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    public bilibili.playershared.NodeOrBuilder getHistoryNodeOrBuilder() {
      if (historyNodeBuilder_ != null) {
        return historyNodeBuilder_.getMessageOrBuilder();
      } else {
        return historyNode_ == null ?
            bilibili.playershared.Node.getDefaultInstance() : historyNode_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.bilibili.playershared.Node history_node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        bilibili.playershared.Node, bilibili.playershared.Node.Builder, bilibili.playershared.NodeOrBuilder> 
        getHistoryNodeFieldBuilder() {
      if (historyNodeBuilder_ == null) {
        historyNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            bilibili.playershared.Node, bilibili.playershared.Node.Builder, bilibili.playershared.NodeOrBuilder>(
                getHistoryNode(),
                getParentForChildren(),
                isClean());
        historyNode_ = null;
      }
      return historyNodeBuilder_;
    }

    private long graphVersion_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @return The graphVersion.
     */
    @java.lang.Override
    public long getGraphVersion() {
      return graphVersion_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @param value The graphVersion to set.
     * @return This builder for chaining.
     */
    public Builder setGraphVersion(long value) {

      graphVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGraphVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      graphVersion_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string msg = 3;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      msg_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string msg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      msg_ = getDefaultInstance().getMsg();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>string msg = 3;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      msg_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long mark_ ;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 mark = 4;</code>
     * @return The mark.
     */
    @java.lang.Override
    public long getMark() {
      return mark_;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 mark = 4;</code>
     * @param value The mark to set.
     * @return This builder for chaining.
     */
    public Builder setMark(long value) {

      mark_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>int64 mark = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMark() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mark_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.playershared.Interaction)
  }

  // @@protoc_insertion_point(class_scope:bilibili.playershared.Interaction)
  private static final bilibili.playershared.Interaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.playershared.Interaction();
  }

  public static bilibili.playershared.Interaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Interaction>
      PARSER = new com.google.protobuf.AbstractParser<Interaction>() {
    @java.lang.Override
    public Interaction parsePartialFrom(
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

  public static com.google.protobuf.Parser<Interaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Interaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.playershared.Interaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

