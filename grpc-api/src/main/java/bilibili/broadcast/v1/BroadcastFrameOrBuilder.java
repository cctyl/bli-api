// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/broadcast.proto

package bilibili.broadcast.v1;

public interface BroadcastFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.v1.BroadcastFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 请求消息信息
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.FrameOption options = 1;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * 请求消息信息
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.FrameOption options = 1;</code>
   * @return The options.
   */
  bilibili.broadcast.v1.FrameOption getOptions();
  /**
   * <pre>
   * 请求消息信息
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.FrameOption options = 1;</code>
   */
  bilibili.broadcast.v1.FrameOptionOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * 业务target_path
   * </pre>
   *
   * <code>string target_path = 2;</code>
   * @return The targetPath.
   */
  java.lang.String getTargetPath();
  /**
   * <pre>
   * 业务target_path
   * </pre>
   *
   * <code>string target_path = 2;</code>
   * @return The bytes for targetPath.
   */
  com.google.protobuf.ByteString
      getTargetPathBytes();

  /**
   * <pre>
   * 业务pb内容
   * </pre>
   *
   * <code>.google.protobuf.Any body = 3;</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <pre>
   * 业务pb内容
   * </pre>
   *
   * <code>.google.protobuf.Any body = 3;</code>
   * @return The body.
   */
  com.google.protobuf.Any getBody();
  /**
   * <pre>
   * 业务pb内容
   * </pre>
   *
   * <code>.google.protobuf.Any body = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getBodyOrBuilder();
}
