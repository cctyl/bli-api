// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/common.proto

package bilibili.app.card.v1;

public interface PlayerArgsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.PlayerArgs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_live = 1;</code>
   * @return The isLive.
   */
  int getIsLive();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 aid = 2;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 cid = 3;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 sub_type = 4;</code>
   * @return The subType.
   */
  int getSubType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_id = 5;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ep_id = 7;</code>
   * @return The epId.
   */
  long getEpId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_preview = 8;</code>
   * @return The isPreview.
   */
  int getIsPreview();

  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 9;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 9;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 duration = 10;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 season_id = 11;</code>
   * @return The seasonId.
   */
  long getSeasonId();
}
