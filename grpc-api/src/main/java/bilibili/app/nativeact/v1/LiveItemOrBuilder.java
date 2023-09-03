// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface LiveItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.LiveItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_id = 1;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 uid = 2;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 live_status = 3;</code>
   * @return The liveStatus.
   */
  long getLiveStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_type = 4;</code>
   * @return The roomType.
   */
  long getRoomType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 play_type = 5;</code>
   * @return The playType.
   */
  long getPlayType();

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 7;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 7;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 online = 8;</code>
   * @return The online.
   */
  long getOnline();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 area_id = 9;</code>
   * @return The areaId.
   */
  long getAreaId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string area_name = 10;</code>
   * @return The areaName.
   */
  java.lang.String getAreaName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string area_name = 10;</code>
   * @return The bytes for areaName.
   */
  com.google.protobuf.ByteString
      getAreaNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 parent_area_id = 11;</code>
   * @return The parentAreaId.
   */
  long getParentAreaId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string parent_area_name = 12;</code>
   * @return The parentAreaName.
   */
  java.lang.String getParentAreaName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string parent_area_name = 12;</code>
   * @return The bytes for parentAreaName.
   */
  com.google.protobuf.ByteString
      getParentAreaNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 live_screen_type = 13;</code>
   * @return The liveScreenType.
   */
  long getLiveScreenType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 last_end_time = 14;</code>
   * @return The lastEndTime.
   */
  long getLastEndTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>string link = 15;</code>
   * @return The link.
   */
  java.lang.String getLink();
  /**
   * <pre>
   * </pre>
   *
   * <code>string link = 15;</code>
   * @return The bytes for link.
   */
  com.google.protobuf.ByteString
      getLinkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 live_id = 16;</code>
   * @return The liveId.
   */
  long getLiveId();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveWatchedShow watched_show = 17;</code>
   * @return Whether the watchedShow field is set.
   */
  boolean hasWatchedShow();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveWatchedShow watched_show = 17;</code>
   * @return The watchedShow.
   */
  bilibili.app.nativeact.v1.LiveWatchedShow getWatchedShow();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveWatchedShow watched_show = 17;</code>
   */
  bilibili.app.nativeact.v1.LiveWatchedShowOrBuilder getWatchedShowOrBuilder();
}