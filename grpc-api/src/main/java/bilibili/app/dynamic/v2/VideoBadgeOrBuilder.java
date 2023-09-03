// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface VideoBadgeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.VideoBadge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 文案颜色-日间
   * </pre>
   *
   * <code>string text_color = 2;</code>
   * @return The textColor.
   */
  java.lang.String getTextColor();
  /**
   * <pre>
   * 文案颜色-日间
   * </pre>
   *
   * <code>string text_color = 2;</code>
   * @return The bytes for textColor.
   */
  com.google.protobuf.ByteString
      getTextColorBytes();

  /**
   * <pre>
   * 文案颜色-夜间
   * </pre>
   *
   * <code>string text_color_night = 3;</code>
   * @return The textColorNight.
   */
  java.lang.String getTextColorNight();
  /**
   * <pre>
   * 文案颜色-夜间
   * </pre>
   *
   * <code>string text_color_night = 3;</code>
   * @return The bytes for textColorNight.
   */
  com.google.protobuf.ByteString
      getTextColorNightBytes();

  /**
   * <pre>
   * 背景颜色-日间
   * </pre>
   *
   * <code>string bg_color = 4;</code>
   * @return The bgColor.
   */
  java.lang.String getBgColor();
  /**
   * <pre>
   * 背景颜色-日间
   * </pre>
   *
   * <code>string bg_color = 4;</code>
   * @return The bytes for bgColor.
   */
  com.google.protobuf.ByteString
      getBgColorBytes();

  /**
   * <pre>
   * 背景颜色-夜间
   * </pre>
   *
   * <code>string bg_color_night = 5;</code>
   * @return The bgColorNight.
   */
  java.lang.String getBgColorNight();
  /**
   * <pre>
   * 背景颜色-夜间
   * </pre>
   *
   * <code>string bg_color_night = 5;</code>
   * @return The bytes for bgColorNight.
   */
  com.google.protobuf.ByteString
      getBgColorNightBytes();

  /**
   * <pre>
   * 边框颜色-日间
   * </pre>
   *
   * <code>string border_color = 6;</code>
   * @return The borderColor.
   */
  java.lang.String getBorderColor();
  /**
   * <pre>
   * 边框颜色-日间
   * </pre>
   *
   * <code>string border_color = 6;</code>
   * @return The bytes for borderColor.
   */
  com.google.protobuf.ByteString
      getBorderColorBytes();

  /**
   * <pre>
   * 边框颜色-夜间
   * </pre>
   *
   * <code>string border_color_night = 7;</code>
   * @return The borderColorNight.
   */
  java.lang.String getBorderColorNight();
  /**
   * <pre>
   * 边框颜色-夜间
   * </pre>
   *
   * <code>string border_color_night = 7;</code>
   * @return The bytes for borderColorNight.
   */
  com.google.protobuf.ByteString
      getBorderColorNightBytes();

  /**
   * <pre>
   * 样式
   * </pre>
   *
   * <code>int32 bg_style = 8;</code>
   * @return The bgStyle.
   */
  int getBgStyle();

  /**
   * <pre>
   * 背景透明度-日间
   * </pre>
   *
   * <code>int32 bg_alpha = 9;</code>
   * @return The bgAlpha.
   */
  int getBgAlpha();

  /**
   * <pre>
   * 背景透明度-夜间
   * </pre>
   *
   * <code>int32 bg_alpha_night = 10;</code>
   * @return The bgAlphaNight.
   */
  int getBgAlphaNight();
}
