// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface AdditionEsportMobaStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.AdditionEsportMobaStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文案类
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc addition_esport_moba_status_desc = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc> 
      getAdditionEsportMobaStatusDescList();
  /**
   * <pre>
   * 文案类
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc addition_esport_moba_status_desc = 1;</code>
   */
  bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc getAdditionEsportMobaStatusDesc(int index);
  /**
   * <pre>
   * 文案类
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc addition_esport_moba_status_desc = 1;</code>
   */
  int getAdditionEsportMobaStatusDescCount();
  /**
   * <pre>
   * 文案类
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc addition_esport_moba_status_desc = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.AdditionEsportMobaStatusDescOrBuilder> 
      getAdditionEsportMobaStatusDescOrBuilderList();
  /**
   * <pre>
   * 文案类
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.AdditionEsportMobaStatusDesc addition_esport_moba_status_desc = 1;</code>
   */
  bilibili.app.dynamic.v2.AdditionEsportMobaStatusDescOrBuilder getAdditionEsportMobaStatusDescOrBuilder(
      int index);

  /**
   * <pre>
   * 比赛状态文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 比赛状态文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 比赛状态状态
   * </pre>
   *
   * <code>int32 status = 3;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * 日间色值
   * </pre>
   *
   * <code>string color = 4;</code>
   * @return The color.
   */
  java.lang.String getColor();
  /**
   * <pre>
   * 日间色值
   * </pre>
   *
   * <code>string color = 4;</code>
   * @return The bytes for color.
   */
  com.google.protobuf.ByteString
      getColorBytes();

  /**
   * <pre>
   * 夜间色值
   * </pre>
   *
   * <code>string night_color = 5;</code>
   * @return The nightColor.
   */
  java.lang.String getNightColor();
  /**
   * <pre>
   * 夜间色值
   * </pre>
   *
   * <code>string night_color = 5;</code>
   * @return The bytes for nightColor.
   */
  com.google.protobuf.ByteString
      getNightColorBytes();
}