// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

public interface RoomUpdateEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.ogv.RoomUpdateEvent)
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
   * 房间变更状态
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.RoomType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 房间变更状态
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.RoomType type = 2;</code>
   * @return The type.
   */
  bilibili.broadcast.message.ogv.RoomType getType();

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