// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/single.proto

package bilibili.app.card.v1;

public interface DynamicHotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.DynamicHot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return Whether the base field is set.
   */
  boolean hasBase();
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return The base.
   */
  bilibili.app.card.v1.Base getBase();
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   */
  bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string top_left_title = 2;</code>
   * @return The topLeftTitle.
   */
  java.lang.String getTopLeftTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string top_left_title = 2;</code>
   * @return The bytes for topLeftTitle.
   */
  com.google.protobuf.ByteString
      getTopLeftTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string desc1 = 3;</code>
   * @return The desc1.
   */
  java.lang.String getDesc1();
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc1 = 3;</code>
   * @return The bytes for desc1.
   */
  com.google.protobuf.ByteString
      getDesc1Bytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 4;</code>
   * @return The desc2.
   */
  java.lang.String getDesc2();
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc2 = 4;</code>
   * @return The bytes for desc2.
   */
  com.google.protobuf.ByteString
      getDesc2Bytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string more_uri = 5;</code>
   * @return The moreUri.
   */
  java.lang.String getMoreUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string more_uri = 5;</code>
   * @return The bytes for moreUri.
   */
  com.google.protobuf.ByteString
      getMoreUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string more_text = 6;</code>
   * @return The moreText.
   */
  java.lang.String getMoreText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string more_text = 6;</code>
   * @return The bytes for moreText.
   */
  com.google.protobuf.ByteString
      getMoreTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 7;</code>
   * @return A list containing the covers.
   */
  java.util.List<java.lang.String>
      getCoversList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 7;</code>
   * @return The count of covers.
   */
  int getCoversCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 7;</code>
   * @param index The index of the element to return.
   * @return The covers at the given index.
   */
  java.lang.String getCovers(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the covers at the given index.
   */
  com.google.protobuf.ByteString
      getCoversBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text = 8;</code>
   * @return The coverRightText.
   */
  java.lang.String getCoverRightText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text = 8;</code>
   * @return The bytes for coverRightText.
   */
  com.google.protobuf.ByteString
      getCoverRightTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle top_rcmd_reason_style = 9;</code>
   * @return Whether the topRcmdReasonStyle field is set.
   */
  boolean hasTopRcmdReasonStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle top_rcmd_reason_style = 9;</code>
   * @return The topRcmdReasonStyle.
   */
  bilibili.app.card.v1.ReasonStyle getTopRcmdReasonStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.card.v1.ReasonStyle top_rcmd_reason_style = 9;</code>
   */
  bilibili.app.card.v1.ReasonStyleOrBuilder getTopRcmdReasonStyleOrBuilder();
}
