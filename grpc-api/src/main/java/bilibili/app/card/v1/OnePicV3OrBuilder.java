// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/double.proto

package bilibili.app.card.v1;

public interface OnePicV3OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.OnePicV3)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return Whether the base field is set.
   */
  boolean hasBase();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return The base.
   */
  bilibili.app.card.v1.Base getBase();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   */
  bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text_1 = 2;</code>
   * @return The coverLeftText1.
   */
  java.lang.String getCoverLeftText1();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text_1 = 2;</code>
   * @return The bytes for coverLeftText1.
   */
  com.google.protobuf.ByteString
      getCoverLeftText1Bytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_left_icon_1 = 3;</code>
   * @return The coverLeftIcon1.
   */
  int getCoverLeftIcon1();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text = 4;</code>
   * @return The coverRightText.
   */
  java.lang.String getCoverRightText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text = 4;</code>
   * @return The bytes for coverRightText.
   */
  com.google.protobuf.ByteString
      getCoverRightTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_right_icon = 5;</code>
   * @return The coverRightIcon.
   */
  int getCoverRightIcon();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_background_color = 6;</code>
   * @return The coverRightBackgroundColor.
   */
  java.lang.String getCoverRightBackgroundColor();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_background_color = 6;</code>
   * @return The bytes for coverRightBackgroundColor.
   */
  com.google.protobuf.ByteString
      getCoverRightBackgroundColorBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 7;</code>
   * @return The badge.
   */
  java.lang.String getBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 7;</code>
   * @return The bytes for badge.
   */
  com.google.protobuf.ByteString
      getBadgeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle rcmd_reason_style = 8;</code>
   * @return Whether the rcmdReasonStyle field is set.
   */
  boolean hasRcmdReasonStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle rcmd_reason_style = 8;</code>
   * @return The rcmdReasonStyle.
   */
  bilibili.app.card.v1.ReasonStyle getRcmdReasonStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle rcmd_reason_style = 8;</code>
   */
  bilibili.app.card.v1.ReasonStyleOrBuilder getRcmdReasonStyleOrBuilder();
}