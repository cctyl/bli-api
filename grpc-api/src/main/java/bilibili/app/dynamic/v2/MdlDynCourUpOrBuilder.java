// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface MdlDynCourUpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.MdlDynCourUp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string text_1 = 5;</code>
   * @return The text1.
   */
  java.lang.String getText1();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string text_1 = 5;</code>
   * @return The bytes for text1.
   */
  com.google.protobuf.ByteString
      getText1Bytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   * @return Whether the badge field is set.
   */
  boolean hasBadge();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   * @return The badge.
   */
  bilibili.app.dynamic.v2.VideoBadge getBadge();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   */
  bilibili.app.dynamic.v2.VideoBadgeOrBuilder getBadgeOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string play_icon = 7;</code>
   * @return The playIcon.
   */
  java.lang.String getPlayIcon();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string play_icon = 7;</code>
   * @return The bytes for playIcon.
   */
  com.google.protobuf.ByteString
      getPlayIconBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool can_play = 8;</code>
   * @return The canPlay.
   */
  boolean getCanPlay();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool is_preview = 9;</code>
   * @return The isPreview.
   */
  boolean getIsPreview();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 avid = 10;</code>
   * @return The avid.
   */
  long getAvid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 cid = 11;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 epid = 12;</code>
   * @return The epid.
   */
  long getEpid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 duration = 13;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 season_id = 14;</code>
   * @return The seasonId.
   */
  long getSeasonId();
}
