// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface DanmuDefaultPlayerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.DanmuDefaultPlayerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否使用推荐弹幕设置
   * </pre>
   *
   * <code>bool player_danmaku_use_default_config = 1;</code>
   * @return The playerDanmakuUseDefaultConfig.
   */
  boolean getPlayerDanmakuUseDefaultConfig();

  /**
   * <pre>
   * 是否开启智能云屏蔽
   * </pre>
   *
   * <code>bool player_danmaku_ai_recommended_switch = 4;</code>
   * @return The playerDanmakuAiRecommendedSwitch.
   */
  boolean getPlayerDanmakuAiRecommendedSwitch();

  /**
   * <pre>
   * 智能云屏蔽等级
   * </pre>
   *
   * <code>int32 player_danmaku_ai_recommended_level = 5;</code>
   * @return The playerDanmakuAiRecommendedLevel.
   */
  int getPlayerDanmakuAiRecommendedLevel();

  /**
   * <pre>
   * 是否屏蔽顶端弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blocktop = 6;</code>
   * @return The playerDanmakuBlocktop.
   */
  boolean getPlayerDanmakuBlocktop();

  /**
   * <pre>
   * 是否屏蔽滚动弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blockscroll = 7;</code>
   * @return The playerDanmakuBlockscroll.
   */
  boolean getPlayerDanmakuBlockscroll();

  /**
   * <pre>
   * 是否屏蔽底端弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blockbottom = 8;</code>
   * @return The playerDanmakuBlockbottom.
   */
  boolean getPlayerDanmakuBlockbottom();

  /**
   * <pre>
   * 是否屏蔽彩色弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blockcolorful = 9;</code>
   * @return The playerDanmakuBlockcolorful.
   */
  boolean getPlayerDanmakuBlockcolorful();

  /**
   * <pre>
   * 是否屏蔽重复弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blockrepeat = 10;</code>
   * @return The playerDanmakuBlockrepeat.
   */
  boolean getPlayerDanmakuBlockrepeat();

  /**
   * <pre>
   * 是否屏蔽高级弹幕
   * </pre>
   *
   * <code>bool player_danmaku_blockspecial = 11;</code>
   * @return The playerDanmakuBlockspecial.
   */
  boolean getPlayerDanmakuBlockspecial();

  /**
   * <pre>
   * 弹幕不透明度
   * </pre>
   *
   * <code>float player_danmaku_opacity = 12;</code>
   * @return The playerDanmakuOpacity.
   */
  float getPlayerDanmakuOpacity();

  /**
   * <pre>
   * 弹幕缩放比例
   * </pre>
   *
   * <code>float player_danmaku_scalingfactor = 13;</code>
   * @return The playerDanmakuScalingfactor.
   */
  float getPlayerDanmakuScalingfactor();

  /**
   * <pre>
   * 弹幕显示区域
   * </pre>
   *
   * <code>float player_danmaku_domain = 14;</code>
   * @return The playerDanmakuDomain.
   */
  float getPlayerDanmakuDomain();

  /**
   * <pre>
   * 弹幕速度
   * </pre>
   *
   * <code>int32 player_danmaku_speed = 15;</code>
   * @return The playerDanmakuSpeed.
   */
  int getPlayerDanmakuSpeed();

  /**
   * <pre>
   * 是否开启弹幕
   * </pre>
   *
   * <code>bool inline_player_danmaku_switch = 16;</code>
   * @return The inlinePlayerDanmakuSwitch.
   */
  boolean getInlinePlayerDanmakuSwitch();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 player_danmaku_senior_mode_switch = 17;</code>
   * @return The playerDanmakuSeniorModeSwitch.
   */
  int getPlayerDanmakuSeniorModeSwitch();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 player_danmaku_ai_recommended_level_v2 = 18;</code>
   * @return The playerDanmakuAiRecommendedLevelV2.
   */
  int getPlayerDanmakuAiRecommendedLevelV2();

  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; player_danmaku_ai_recommended_level_v2_map = 19;</code>
   */
  int getPlayerDanmakuAiRecommendedLevelV2MapCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; player_danmaku_ai_recommended_level_v2_map = 19;</code>
   */
  boolean containsPlayerDanmakuAiRecommendedLevelV2Map(
      int key);
  /**
   * Use {@link #getPlayerDanmakuAiRecommendedLevelV2MapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getPlayerDanmakuAiRecommendedLevelV2Map();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; player_danmaku_ai_recommended_level_v2_map = 19;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getPlayerDanmakuAiRecommendedLevelV2MapMap();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; player_danmaku_ai_recommended_level_v2_map = 19;</code>
   */
  int getPlayerDanmakuAiRecommendedLevelV2MapOrDefault(
      int key,
      int defaultValue);
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; player_danmaku_ai_recommended_level_v2_map = 19;</code>
   */
  int getPlayerDanmakuAiRecommendedLevelV2MapOrThrow(
      int key);
}
