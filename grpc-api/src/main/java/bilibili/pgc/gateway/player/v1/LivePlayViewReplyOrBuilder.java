// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v1/playurl.proto

package bilibili.pgc.gateway.player.v1;

public interface LivePlayViewReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v1.LivePlayViewReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   * @return Whether the roomInfo field is set.
   */
  boolean hasRoomInfo();
  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   * @return The roomInfo.
   */
  bilibili.pgc.gateway.player.v1.RoomInfo getRoomInfo();
  /**
   * <pre>
   * 房间信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.RoomInfo room_info = 1;</code>
   */
  bilibili.pgc.gateway.player.v1.RoomInfoOrBuilder getRoomInfoOrBuilder();

  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   * @return Whether the playInfo field is set.
   */
  boolean hasPlayInfo();
  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   * @return The playInfo.
   */
  bilibili.pgc.gateway.player.v1.LivePlayInfo getPlayInfo();
  /**
   * <pre>
   * 播放信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v1.LivePlayInfo play_info = 2;</code>
   */
  bilibili.pgc.gateway.player.v1.LivePlayInfoOrBuilder getPlayInfoOrBuilder();
}
