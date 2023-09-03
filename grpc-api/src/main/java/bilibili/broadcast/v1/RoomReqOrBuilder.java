// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/v1/room.proto

package bilibili.broadcast.v1;

public interface RoomReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.v1.RoomReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * {type}://{room_id}
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * {type}://{room_id}
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomJoinEvent join = 2;</code>
   * @return Whether the join field is set.
   */
  boolean hasJoin();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomJoinEvent join = 2;</code>
   * @return The join.
   */
  bilibili.broadcast.v1.RoomJoinEvent getJoin();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomJoinEvent join = 2;</code>
   */
  bilibili.broadcast.v1.RoomJoinEventOrBuilder getJoinOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomLeaveEvent leave = 3;</code>
   * @return Whether the leave field is set.
   */
  boolean hasLeave();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomLeaveEvent leave = 3;</code>
   * @return The leave.
   */
  bilibili.broadcast.v1.RoomLeaveEvent getLeave();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomLeaveEvent leave = 3;</code>
   */
  bilibili.broadcast.v1.RoomLeaveEventOrBuilder getLeaveOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomOnlineEvent online = 4;</code>
   * @return Whether the online field is set.
   */
  boolean hasOnline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomOnlineEvent online = 4;</code>
   * @return The online.
   */
  bilibili.broadcast.v1.RoomOnlineEvent getOnline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomOnlineEvent online = 4;</code>
   */
  bilibili.broadcast.v1.RoomOnlineEventOrBuilder getOnlineOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomMessageEvent msg = 5;</code>
   * @return Whether the msg field is set.
   */
  boolean hasMsg();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomMessageEvent msg = 5;</code>
   * @return The msg.
   */
  bilibili.broadcast.v1.RoomMessageEvent getMsg();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.v1.RoomMessageEvent msg = 5;</code>
   */
  bilibili.broadcast.v1.RoomMessageEventOrBuilder getMsgOrBuilder();

  bilibili.broadcast.v1.RoomReq.EventCase getEventCase();
}
