// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

public interface RoomMemberChangeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.ogv.RoomMemberChangeEvent)
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
   * 房主id
   * </pre>
   *
   * <code>int64 owner_id = 2;</code>
   * @return The ownerId.
   */
  long getOwnerId();

  /**
   * <pre>
   * 房间成员列表
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.ogv.UserInfoProto members = 3;</code>
   */
  java.util.List<bilibili.broadcast.message.ogv.UserInfoProto> 
      getMembersList();
  /**
   * <pre>
   * 房间成员列表
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.ogv.UserInfoProto members = 3;</code>
   */
  bilibili.broadcast.message.ogv.UserInfoProto getMembers(int index);
  /**
   * <pre>
   * 房间成员列表
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.ogv.UserInfoProto members = 3;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * 房间成员列表
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.ogv.UserInfoProto members = 3;</code>
   */
  java.util.List<? extends bilibili.broadcast.message.ogv.UserInfoProtoOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * 房间成员列表
   * </pre>
   *
   * <code>repeated .bilibili.broadcast.message.ogv.UserInfoProto members = 3;</code>
   */
  bilibili.broadcast.message.ogv.UserInfoProtoOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 4;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 4;</code>
   * @return The message.
   */
  bilibili.broadcast.message.ogv.MessageProto getMessage();
  /**
   * <pre>
   * 提示信息
   * </pre>
   *
   * <code>.bilibili.broadcast.message.ogv.MessageProto message = 4;</code>
   */
  bilibili.broadcast.message.ogv.MessageProtoOrBuilder getMessageOrBuilder();
}