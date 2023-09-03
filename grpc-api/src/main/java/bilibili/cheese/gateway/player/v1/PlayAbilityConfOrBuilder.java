// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/cheese/gateway/player/v1/playurl.proto

package bilibili.cheese.gateway.player.v1;

public interface PlayAbilityConfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.cheese.gateway.player.v1.PlayAbilityConf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 后台播放
   * </pre>
   *
   * <code>bool background_play_disable = 1;</code>
   * @return The backgroundPlayDisable.
   */
  boolean getBackgroundPlayDisable();

  /**
   * <pre>
   * 镜像反转
   * </pre>
   *
   * <code>bool flip_disable = 2;</code>
   * @return The flipDisable.
   */
  boolean getFlipDisable();

  /**
   * <pre>
   * 支持投屏
   * </pre>
   *
   * <code>bool cast_disable = 3;</code>
   * @return The castDisable.
   */
  boolean getCastDisable();

  /**
   * <pre>
   * 反馈
   * </pre>
   *
   * <code>bool feedback_disable = 4;</code>
   * @return The feedbackDisable.
   */
  boolean getFeedbackDisable();

  /**
   * <pre>
   * 字幕
   * </pre>
   *
   * <code>bool subtitle_disable = 5;</code>
   * @return The subtitleDisable.
   */
  boolean getSubtitleDisable();

  /**
   * <pre>
   * 播放速度
   * </pre>
   *
   * <code>bool playback_rate_disable = 6;</code>
   * @return The playbackRateDisable.
   */
  boolean getPlaybackRateDisable();

  /**
   * <pre>
   * 定时停止播放
   * </pre>
   *
   * <code>bool time_up_disable = 7;</code>
   * @return The timeUpDisable.
   */
  boolean getTimeUpDisable();

  /**
   * <pre>
   * 播放方式
   * </pre>
   *
   * <code>bool playback_mode_disable = 8;</code>
   * @return The playbackModeDisable.
   */
  boolean getPlaybackModeDisable();

  /**
   * <pre>
   * 画面尺寸
   * </pre>
   *
   * <code>bool scale_mode_disable = 9;</code>
   * @return The scaleModeDisable.
   */
  boolean getScaleModeDisable();

  /**
   * <pre>
   * 顶
   * </pre>
   *
   * <code>bool like_disable = 10;</code>
   * @return The likeDisable.
   */
  boolean getLikeDisable();

  /**
   * <pre>
   * 踩
   * </pre>
   *
   * <code>bool dislike_disable = 11;</code>
   * @return The dislikeDisable.
   */
  boolean getDislikeDisable();

  /**
   * <pre>
   * 投币
   * </pre>
   *
   * <code>bool coin_disable = 12;</code>
   * @return The coinDisable.
   */
  boolean getCoinDisable();

  /**
   * <pre>
   * 充电
   * </pre>
   *
   * <code>bool elec_disable = 13;</code>
   * @return The elecDisable.
   */
  boolean getElecDisable();

  /**
   * <pre>
   * 分享
   * </pre>
   *
   * <code>bool share_disable = 14;</code>
   * @return The shareDisable.
   */
  boolean getShareDisable();

  /**
   * <pre>
   * 截图
   * </pre>
   *
   * <code>bool screen_shot_disable = 15;</code>
   * @return The screenShotDisable.
   */
  boolean getScreenShotDisable();

  /**
   * <pre>
   * 锁屏
   * </pre>
   *
   * <code>bool lock_screen_disable = 16;</code>
   * @return The lockScreenDisable.
   */
  boolean getLockScreenDisable();

  /**
   * <pre>
   * 相关推荐
   * </pre>
   *
   * <code>bool recommend_disable = 17;</code>
   * @return The recommendDisable.
   */
  boolean getRecommendDisable();

  /**
   * <pre>
   * 倍速
   * </pre>
   *
   * <code>bool playback_speed_disable = 18;</code>
   * @return The playbackSpeedDisable.
   */
  boolean getPlaybackSpeedDisable();

  /**
   * <pre>
   * 清晰度
   * </pre>
   *
   * <code>bool definition_disable = 19;</code>
   * @return The definitionDisable.
   */
  boolean getDefinitionDisable();

  /**
   * <pre>
   * 选集
   * </pre>
   *
   * <code>bool selections_disable = 20;</code>
   * @return The selectionsDisable.
   */
  boolean getSelectionsDisable();

  /**
   * <pre>
   * 下一集
   * </pre>
   *
   * <code>bool next_disable = 21;</code>
   * @return The nextDisable.
   */
  boolean getNextDisable();

  /**
   * <pre>
   * 编辑弹幕
   * </pre>
   *
   * <code>bool edit_dm_disable = 22;</code>
   * @return The editDmDisable.
   */
  boolean getEditDmDisable();

  /**
   * <pre>
   * 外层面板弹幕设置
   * </pre>
   *
   * <code>bool outer_dm_disable = 25;</code>
   * @return The outerDmDisable.
   */
  boolean getOuterDmDisable();

  /**
   * <pre>
   * 三点内弹幕设置
   * </pre>
   *
   * <code>bool inner_dm_disable = 26;</code>
   * @return The innerDmDisable.
   */
  boolean getInnerDmDisable();

  /**
   * <pre>
   * 画中画
   * </pre>
   *
   * <code>bool small_window_disable = 27;</code>
   * @return The smallWindowDisable.
   */
  boolean getSmallWindowDisable();
}