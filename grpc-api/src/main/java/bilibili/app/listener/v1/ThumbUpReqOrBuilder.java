// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface ThumbUpReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.ThumbUpReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   * @return The item.
   */
  bilibili.app.listener.v1.PlayItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 1;</code>
   */
  bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 action = 2;</code>
   * @return The action.
   */
  int getAction();
}