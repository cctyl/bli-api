// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.playershared.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 node_id = 1;</code>
   * @return The nodeId.
   */
  long getNodeId();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 cid = 3;</code>
   * @return The cid.
   */
  long getCid();
}