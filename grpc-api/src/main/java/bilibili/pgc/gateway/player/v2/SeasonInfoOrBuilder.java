// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface SeasonInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.SeasonInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PGC SEASON ID
   * </pre>
   *
   * <code>int32 season_id = 1;</code>
   * @return The seasonId.
   */
  int getSeasonId();

  /**
   * <pre>
   * PGC SEASON 类型
   * </pre>
   *
   * <code>int32 season_type = 2;</code>
   * @return The seasonType.
   */
  int getSeasonType();

  /**
   * <pre>
   * PGC SEASON 状态
   * </pre>
   *
   * <code>int32 season_status = 3;</code>
   * @return The seasonStatus.
   */
  int getSeasonStatus();

  /**
   * <pre>
   * 封面
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 5;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 5;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 权限信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Rights rights = 6;</code>
   * @return Whether the rights field is set.
   */
  boolean hasRights();
  /**
   * <pre>
   * 权限信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Rights rights = 6;</code>
   * @return The rights.
   */
  bilibili.pgc.gateway.player.v2.Rights getRights();
  /**
   * <pre>
   * 权限信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Rights rights = 6;</code>
   */
  bilibili.pgc.gateway.player.v2.RightsOrBuilder getRightsOrBuilder();

  /**
   * <pre>
   * 模式
   * </pre>
   *
   * <code>int32 mode = 7;</code>
   * @return The mode.
   */
  int getMode();
}