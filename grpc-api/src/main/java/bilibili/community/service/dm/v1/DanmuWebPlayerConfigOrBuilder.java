// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface DanmuWebPlayerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.DanmuWebPlayerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否开启弹幕
   * </pre>
   *
   * <code>bool dm_switch = 1;</code>
   * @return The dmSwitch.
   */
  boolean getDmSwitch();

  /**
   * <pre>
   * 是否开启智能云屏蔽
   * </pre>
   *
   * <code>bool ai_switch = 2;</code>
   * @return The aiSwitch.
   */
  boolean getAiSwitch();

  /**
   * <pre>
   * 智能云屏蔽等级
   * </pre>
   *
   * <code>int32 ai_level = 3;</code>
   * @return The aiLevel.
   */
  int getAiLevel();

  /**
   * <pre>
   * 是否屏蔽顶端弹幕
   * </pre>
   *
   * <code>bool blocktop = 4;</code>
   * @return The blocktop.
   */
  boolean getBlocktop();

  /**
   * <pre>
   * 是否屏蔽滚动弹幕
   * </pre>
   *
   * <code>bool blockscroll = 5;</code>
   * @return The blockscroll.
   */
  boolean getBlockscroll();

  /**
   * <pre>
   * 是否屏蔽底端弹幕
   * </pre>
   *
   * <code>bool blockbottom = 6;</code>
   * @return The blockbottom.
   */
  boolean getBlockbottom();

  /**
   * <pre>
   * 是否屏蔽彩色弹幕
   * </pre>
   *
   * <code>bool blockcolor = 7;</code>
   * @return The blockcolor.
   */
  boolean getBlockcolor();

  /**
   * <pre>
   * 是否屏蔽重复弹幕
   * </pre>
   *
   * <code>bool blockspecial = 8;</code>
   * @return The blockspecial.
   */
  boolean getBlockspecial();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool preventshade = 9;</code>
   * @return The preventshade.
   */
  boolean getPreventshade();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool dmask = 10;</code>
   * @return The dmask.
   */
  boolean getDmask();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>float opacity = 11;</code>
   * @return The opacity.
   */
  float getOpacity();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 dmarea = 12;</code>
   * @return The dmarea.
   */
  int getDmarea();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>float speedplus = 13;</code>
   * @return The speedplus.
   */
  float getSpeedplus();

  /**
   * <pre>
   * 弹幕字号
   * </pre>
   *
   * <code>float fontsize = 14;</code>
   * @return The fontsize.
   */
  float getFontsize();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool screensync = 15;</code>
   * @return The screensync.
   */
  boolean getScreensync();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool speedsync = 16;</code>
   * @return The speedsync.
   */
  boolean getSpeedsync();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string fontfamily = 17;</code>
   * @return The fontfamily.
   */
  java.lang.String getFontfamily();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string fontfamily = 17;</code>
   * @return The bytes for fontfamily.
   */
  com.google.protobuf.ByteString
      getFontfamilyBytes();

  /**
   * <pre>
   * 是否使用加粗
   * </pre>
   *
   * <code>bool bold = 18;</code>
   * @return The bold.
   */
  boolean getBold();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 fontborder = 19;</code>
   * @return The fontborder.
   */
  int getFontborder();

  /**
   * <pre>
   * 弹幕渲染类型
   * </pre>
   *
   * <code>string draw_type = 20;</code>
   * @return The drawType.
   */
  java.lang.String getDrawType();
  /**
   * <pre>
   * 弹幕渲染类型
   * </pre>
   *
   * <code>string draw_type = 20;</code>
   * @return The bytes for drawType.
   */
  com.google.protobuf.ByteString
      getDrawTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 senior_mode_switch = 21;</code>
   * @return The seniorModeSwitch.
   */
  int getSeniorModeSwitch();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ai_level_v2 = 22;</code>
   * @return The aiLevelV2.
   */
  int getAiLevelV2();

  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; ai_level_v2_map = 23;</code>
   */
  int getAiLevelV2MapCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; ai_level_v2_map = 23;</code>
   */
  boolean containsAiLevelV2Map(
      int key);
  /**
   * Use {@link #getAiLevelV2MapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getAiLevelV2Map();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; ai_level_v2_map = 23;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getAiLevelV2MapMap();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; ai_level_v2_map = 23;</code>
   */
  int getAiLevelV2MapOrDefault(
      int key,
      int defaultValue);
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; ai_level_v2_map = 23;</code>
   */
  int getAiLevelV2MapOrThrow(
      int key);
}
