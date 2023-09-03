// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface AdBusinessMarkDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.AdBusinessMarkDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 商业标样式
   * 0:不展示标 1:实心+文字 2:空心框+文字 3:纯文字标 4:纯图片标
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * 商业标文案
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 商业标文案
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 商业标文案颜色,如#80FFFFFF RGBA
   * </pre>
   *
   * <code>string text_color = 3;</code>
   * @return The textColor.
   */
  java.lang.String getTextColor();
  /**
   * <pre>
   * 商业标文案颜色,如#80FFFFFF RGBA
   * </pre>
   *
   * <code>string text_color = 3;</code>
   * @return The bytes for textColor.
   */
  com.google.protobuf.ByteString
      getTextColorBytes();

  /**
   * <pre>
   * 夜间模式文字色
   * </pre>
   *
   * <code>string text_color_night = 4;</code>
   * @return The textColorNight.
   */
  java.lang.String getTextColorNight();
  /**
   * <pre>
   * 夜间模式文字色
   * </pre>
   *
   * <code>string text_color_night = 4;</code>
   * @return The bytes for textColorNight.
   */
  com.google.protobuf.ByteString
      getTextColorNightBytes();

  /**
   * <pre>
   * 背景色
   * </pre>
   *
   * <code>string bg_color = 5;</code>
   * @return The bgColor.
   */
  java.lang.String getBgColor();
  /**
   * <pre>
   * 背景色
   * </pre>
   *
   * <code>string bg_color = 5;</code>
   * @return The bytes for bgColor.
   */
  com.google.protobuf.ByteString
      getBgColorBytes();

  /**
   * <pre>
   * 夜间模式背景色
   * </pre>
   *
   * <code>string bg_color_night = 6;</code>
   * @return The bgColorNight.
   */
  java.lang.String getBgColorNight();
  /**
   * <pre>
   * 夜间模式背景色
   * </pre>
   *
   * <code>string bg_color_night = 6;</code>
   * @return The bytes for bgColorNight.
   */
  com.google.protobuf.ByteString
      getBgColorNightBytes();

  /**
   * <pre>
   * 边框色
   * </pre>
   *
   * <code>string border_color = 7;</code>
   * @return The borderColor.
   */
  java.lang.String getBorderColor();
  /**
   * <pre>
   * 边框色
   * </pre>
   *
   * <code>string border_color = 7;</code>
   * @return The bytes for borderColor.
   */
  com.google.protobuf.ByteString
      getBorderColorBytes();

  /**
   * <pre>
   * 夜间模式边框色
   * </pre>
   *
   * <code>string border_color_night = 8;</code>
   * @return The borderColorNight.
   */
  java.lang.String getBorderColorNight();
  /**
   * <pre>
   * 夜间模式边框色
   * </pre>
   *
   * <code>string border_color_night = 8;</code>
   * @return The bytes for borderColorNight.
   */
  com.google.protobuf.ByteString
      getBorderColorNightBytes();

  /**
   * <pre>
   * 图片商业标
   * </pre>
   *
   * <code>string img_url = 9;</code>
   * @return The imgUrl.
   */
  java.lang.String getImgUrl();
  /**
   * <pre>
   * 图片商业标
   * </pre>
   *
   * <code>string img_url = 9;</code>
   * @return The bytes for imgUrl.
   */
  com.google.protobuf.ByteString
      getImgUrlBytes();

  /**
   * <pre>
   * 图片高度
   * </pre>
   *
   * <code>int32 img_height = 10;</code>
   * @return The imgHeight.
   */
  int getImgHeight();

  /**
   * <pre>
   * 图片宽度
   * </pre>
   *
   * <code>int32 img_width = 11;</code>
   * @return The imgWidth.
   */
  int getImgWidth();

  /**
   * <pre>
   * </pre>
   *
   * <code>string bg_border_color = 12;</code>
   * @return The bgBorderColor.
   */
  java.lang.String getBgBorderColor();
  /**
   * <pre>
   * </pre>
   *
   * <code>string bg_border_color = 12;</code>
   * @return The bytes for bgBorderColor.
   */
  com.google.protobuf.ByteString
      getBgBorderColorBytes();
}