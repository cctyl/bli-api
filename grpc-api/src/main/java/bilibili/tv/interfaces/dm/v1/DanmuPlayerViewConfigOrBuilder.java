// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

public interface DanmuPlayerViewConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.tv.interfaces.dm.v1.DanmuPlayerViewConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕默认配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuDefaultPlayerConfig danmuku_default_player_config = 1;</code>
   * @return Whether the danmukuDefaultPlayerConfig field is set.
   */
  boolean hasDanmukuDefaultPlayerConfig();
  /**
   * <pre>
   * 弹幕默认配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuDefaultPlayerConfig danmuku_default_player_config = 1;</code>
   * @return The danmukuDefaultPlayerConfig.
   */
  bilibili.tv.interfaces.dm.v1.DanmuDefaultPlayerConfig getDanmukuDefaultPlayerConfig();
  /**
   * <pre>
   * 弹幕默认配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuDefaultPlayerConfig danmuku_default_player_config = 1;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmuDefaultPlayerConfigOrBuilder getDanmukuDefaultPlayerConfigOrBuilder();

  /**
   * <pre>
   * 弹幕用户配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuPlayerConfig danmuku_player_config = 2;</code>
   * @return Whether the danmukuPlayerConfig field is set.
   */
  boolean hasDanmukuPlayerConfig();
  /**
   * <pre>
   * 弹幕用户配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuPlayerConfig danmuku_player_config = 2;</code>
   * @return The danmukuPlayerConfig.
   */
  bilibili.tv.interfaces.dm.v1.DanmuPlayerConfig getDanmukuPlayerConfig();
  /**
   * <pre>
   * 弹幕用户配置
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmuPlayerConfig danmuku_player_config = 2;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmuPlayerConfigOrBuilder getDanmukuPlayerConfigOrBuilder();

  /**
   * <pre>
   * 弹幕显示区域自动配置列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig danmuku_player_dynamic_config = 3;</code>
   */
  java.util.List<bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig> 
      getDanmukuPlayerDynamicConfigList();
  /**
   * <pre>
   * 弹幕显示区域自动配置列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig danmuku_player_dynamic_config = 3;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig getDanmukuPlayerDynamicConfig(int index);
  /**
   * <pre>
   * 弹幕显示区域自动配置列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig danmuku_player_dynamic_config = 3;</code>
   */
  int getDanmukuPlayerDynamicConfigCount();
  /**
   * <pre>
   * 弹幕显示区域自动配置列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig danmuku_player_dynamic_config = 3;</code>
   */
  java.util.List<? extends bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfigOrBuilder> 
      getDanmukuPlayerDynamicConfigOrBuilderList();
  /**
   * <pre>
   * 弹幕显示区域自动配置列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfig danmuku_player_dynamic_config = 3;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmuPlayerDynamicConfigOrBuilder getDanmukuPlayerDynamicConfigOrBuilder(
      int index);
}
