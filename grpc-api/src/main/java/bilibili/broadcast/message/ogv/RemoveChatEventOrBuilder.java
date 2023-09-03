// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

public interface RemoveChatEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.ogv.RemoveChatEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 房间id
   * </pre>
   *
   * <code>int64 room_id = 1;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <pre>
   * 撤回的聊天信息id
   * </pre>
   *
   * <code>int64 msg_id = 2;</code>
   * @return The msgId.
   */
  long getMsgId();

  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 3;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 3;</code>
   * @return The message.
   */
  bilibili.broadcast.message.ogv.MessageProto getMessage();
  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 3;</code>
   */
  bilibili.broadcast.message.ogv.MessageProtoOrBuilder getMessageOrBuilder();
}
