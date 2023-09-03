// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface PlayViewReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.PlayViewReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频流信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.VideoInfo video_info = 1;</code>
   * @return Whether the videoInfo field is set.
   */
  boolean hasVideoInfo();
  /**
   * <pre>
   * 视频流信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.VideoInfo video_info = 1;</code>
   * @return The videoInfo.
   */
  bilibili.pgc.gateway.player.v2.VideoInfo getVideoInfo();
  /**
   * <pre>
   * 视频流信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.VideoInfo video_info = 1;</code>
   */
  bilibili.pgc.gateway.player.v2.VideoInfoOrBuilder getVideoInfoOrBuilder();

  /**
   * <pre>
   * 播放控件用户自定义配置
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityConf play_conf = 2;</code>
   * @return Whether the playConf field is set.
   */
  boolean hasPlayConf();
  /**
   * <pre>
   * 播放控件用户自定义配置
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityConf play_conf = 2;</code>
   * @return The playConf.
   */
  bilibili.pgc.gateway.player.v2.PlayAbilityConf getPlayConf();
  /**
   * <pre>
   * 播放控件用户自定义配置
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityConf play_conf = 2;</code>
   */
  bilibili.pgc.gateway.player.v2.PlayAbilityConfOrBuilder getPlayConfOrBuilder();

  /**
   * <pre>
   * 业务需要的其他信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo business = 3;</code>
   * @return Whether the business field is set.
   */
  boolean hasBusiness();
  /**
   * <pre>
   * 业务需要的其他信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo business = 3;</code>
   * @return The business.
   */
  bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo getBusiness();
  /**
   * <pre>
   * 业务需要的其他信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo business = 3;</code>
   */
  bilibili.pgc.gateway.player.v2.PlayViewBusinessInfoOrBuilder getBusinessOrBuilder();

  /**
   * <pre>
   * 事件
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Event event = 4;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * 事件
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Event event = 4;</code>
   * @return The event.
   */
  bilibili.pgc.gateway.player.v2.Event getEvent();
  /**
   * <pre>
   * 事件
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Event event = 4;</code>
   */
  bilibili.pgc.gateway.player.v2.EventOrBuilder getEventOrBuilder();

  /**
   * <pre>
   * 展示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.ViewInfo view_info = 5;</code>
   * @return Whether the viewInfo field is set.
   */
  boolean hasViewInfo();
  /**
   * <pre>
   * 展示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.ViewInfo view_info = 5;</code>
   * @return The viewInfo.
   */
  bilibili.pgc.gateway.player.v2.ViewInfo getViewInfo();
  /**
   * <pre>
   * 展示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.ViewInfo view_info = 5;</code>
   */
  bilibili.pgc.gateway.player.v2.ViewInfoOrBuilder getViewInfoOrBuilder();

  /**
   * <pre>
   * 自定义配置扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityExtConf play_ext_conf = 6;</code>
   * @return Whether the playExtConf field is set.
   */
  boolean hasPlayExtConf();
  /**
   * <pre>
   * 自定义配置扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityExtConf play_ext_conf = 6;</code>
   * @return The playExtConf.
   */
  bilibili.pgc.gateway.player.v2.PlayAbilityExtConf getPlayExtConf();
  /**
   * <pre>
   * 自定义配置扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayAbilityExtConf play_ext_conf = 6;</code>
   */
  bilibili.pgc.gateway.player.v2.PlayAbilityExtConfOrBuilder getPlayExtConfOrBuilder();

  /**
   * <pre>
   * 播放扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayExtInfo play_ext_info = 7;</code>
   * @return Whether the playExtInfo field is set.
   */
  boolean hasPlayExtInfo();
  /**
   * <pre>
   * 播放扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayExtInfo play_ext_info = 7;</code>
   * @return The playExtInfo.
   */
  bilibili.pgc.gateway.player.v2.PlayExtInfo getPlayExtInfo();
  /**
   * <pre>
   * 播放扩展信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PlayExtInfo play_ext_info = 7;</code>
   */
  bilibili.pgc.gateway.player.v2.PlayExtInfoOrBuilder getPlayExtInfoOrBuilder();
}
