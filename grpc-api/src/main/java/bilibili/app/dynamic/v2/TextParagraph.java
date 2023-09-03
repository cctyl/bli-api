// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.TextParagraph}
 */
public final class TextParagraph extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.TextParagraph)
    TextParagraphOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextParagraph.newBuilder() to construct.
  private TextParagraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextParagraph() {
    nodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextParagraph();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TextParagraph_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TextParagraph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bilibili.app.dynamic.v2.TextParagraph.class, bilibili.app.dynamic.v2.TextParagraph.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<bilibili.app.dynamic.v2.TextNode> nodes_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<bilibili.app.dynamic.v2.TextNode> getNodesList() {
    return nodes_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends bilibili.app.dynamic.v2.TextNodeOrBuilder> 
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
   */
  @java.lang.Override
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.TextNode getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
   */
  @java.lang.Override
  public bilibili.app.dynamic.v2.TextNodeOrBuilder getNodesOrBuilder(
      int index) {
    return nodes_.get(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodes_.get(i));
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
    if (!(obj instanceof bilibili.app.dynamic.v2.TextParagraph)) {
      return super.equals(obj);
    }
    bilibili.app.dynamic.v2.TextParagraph other = (bilibili.app.dynamic.v2.TextParagraph) obj;

    if (!getNodesList()
        .equals(other.getNodesList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bilibili.app.dynamic.v2.TextParagraph parseFrom(
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
  public static Builder newBuilder(bilibili.app.dynamic.v2.TextParagraph prototype) {
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
   * Protobuf type {@code bilibili.app.dynamic.v2.TextParagraph}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.TextParagraph)
      bilibili.app.dynamic.v2.TextParagraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TextParagraph_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TextParagraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bilibili.app.dynamic.v2.TextParagraph.class, bilibili.app.dynamic.v2.TextParagraph.Builder.class);
    }

    // Construct using bilibili.app.dynamic.v2.TextParagraph.newBuilder()
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
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
      } else {
        nodes_ = null;
        nodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_TextParagraph_descriptor;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TextParagraph getDefaultInstanceForType() {
      return bilibili.app.dynamic.v2.TextParagraph.getDefaultInstance();
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TextParagraph build() {
      bilibili.app.dynamic.v2.TextParagraph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bilibili.app.dynamic.v2.TextParagraph buildPartial() {
      bilibili.app.dynamic.v2.TextParagraph result = new bilibili.app.dynamic.v2.TextParagraph(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(bilibili.app.dynamic.v2.TextParagraph result) {
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
      }
    }

    private void buildPartial0(bilibili.app.dynamic.v2.TextParagraph result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bilibili.app.dynamic.v2.TextParagraph) {
        return mergeFrom((bilibili.app.dynamic.v2.TextParagraph)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bilibili.app.dynamic.v2.TextParagraph other) {
      if (other == bilibili.app.dynamic.v2.TextParagraph.getDefaultInstance()) return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodesFieldBuilder() : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
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
              bilibili.app.dynamic.v2.TextNode m =
                  input.readMessage(
                      bilibili.app.dynamic.v2.TextNode.parser(),
                      extensionRegistry);
              if (nodesBuilder_ == null) {
                ensureNodesIsMutable();
                nodes_.add(m);
              } else {
                nodesBuilder_.addMessage(m);
              }
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

    private java.util.List<bilibili.app.dynamic.v2.TextNode> nodes_ =
      java.util.Collections.emptyList();
    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<bilibili.app.dynamic.v2.TextNode>(nodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.TextNode, bilibili.app.dynamic.v2.TextNode.Builder, bilibili.app.dynamic.v2.TextNodeOrBuilder> nodesBuilder_;

    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.TextNode> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public bilibili.app.dynamic.v2.TextNode getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder setNodes(
        int index, bilibili.app.dynamic.v2.TextNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder setNodes(
        int index, bilibili.app.dynamic.v2.TextNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder addNodes(bilibili.app.dynamic.v2.TextNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder addNodes(
        int index, bilibili.app.dynamic.v2.TextNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder addNodes(
        bilibili.app.dynamic.v2.TextNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder addNodes(
        int index, bilibili.app.dynamic.v2.TextNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends bilibili.app.dynamic.v2.TextNode> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public bilibili.app.dynamic.v2.TextNode.Builder getNodesBuilder(
        int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public bilibili.app.dynamic.v2.TextNodeOrBuilder getNodesOrBuilder(
        int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);  } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public java.util.List<? extends bilibili.app.dynamic.v2.TextNodeOrBuilder> 
         getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public bilibili.app.dynamic.v2.TextNode.Builder addNodesBuilder() {
      return getNodesFieldBuilder().addBuilder(
          bilibili.app.dynamic.v2.TextNode.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public bilibili.app.dynamic.v2.TextNode.Builder addNodesBuilder(
        int index) {
      return getNodesFieldBuilder().addBuilder(
          index, bilibili.app.dynamic.v2.TextNode.getDefaultInstance());
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.TextNode nodes = 1;</code>
     */
    public java.util.List<bilibili.app.dynamic.v2.TextNode.Builder> 
         getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bilibili.app.dynamic.v2.TextNode, bilibili.app.dynamic.v2.TextNode.Builder, bilibili.app.dynamic.v2.TextNodeOrBuilder> 
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bilibili.app.dynamic.v2.TextNode, bilibili.app.dynamic.v2.TextNode.Builder, bilibili.app.dynamic.v2.TextNodeOrBuilder>(
                nodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.TextParagraph)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.TextParagraph)
  private static final bilibili.app.dynamic.v2.TextParagraph DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bilibili.app.dynamic.v2.TextParagraph();
  }

  public static bilibili.app.dynamic.v2.TextParagraph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextParagraph>
      PARSER = new com.google.protobuf.AbstractParser<TextParagraph>() {
    @java.lang.Override
    public TextParagraph parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextParagraph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextParagraph> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bilibili.app.dynamic.v2.TextParagraph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
