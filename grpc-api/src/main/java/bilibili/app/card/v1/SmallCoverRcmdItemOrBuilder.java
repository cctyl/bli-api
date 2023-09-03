// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/single.proto

package bilibili.app.card.v1;

public interface SmallCoverRcmdItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.SmallCoverRcmdItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 参数
   * </pre>
   *
   * <code>string param = 4;</code>
   * @return The param.
   */
  java.lang.String getParam();
  /**
   * <pre>
   * 参数
   * </pre>
   *
   * <code>string param = 4;</code>
   * @return The bytes for param.
   */
  com.google.protobuf.ByteString
      getParamBytes();

  /**
   * <pre>
   * 跳转类型
   * av:视频稿件
   * </pre>
   *
   * <code>string goto = 5;</code>
   * @return The goto.
   */
  java.lang.String getGoto();
  /**
   * <pre>
   * 跳转类型
   * av:视频稿件
   * </pre>
   *
   * <code>string goto = 5;</code>
   * @return The bytes for goto.
   */
  com.google.protobuf.ByteString
      getGotoBytes();

  /**
   * <pre>
   * 封面右下角标文案
   * </pre>
   *
   * <code>string coverRightText1 = 6;</code>
   * @return The coverRightText1.
   */
  java.lang.String getCoverRightText1();
  /**
   * <pre>
   * 封面右下角标文案
   * </pre>
   *
   * <code>string coverRightText1 = 6;</code>
   * @return The bytes for coverRightText1.
   */
  com.google.protobuf.ByteString
      getCoverRightText1Bytes();

  /**
   * <pre>
   * 右侧文案1
   * </pre>
   *
   * <code>string rightDesc1 = 7;</code>
   * @return The rightDesc1.
   */
  java.lang.String getRightDesc1();
  /**
   * <pre>
   * 右侧文案1
   * </pre>
   *
   * <code>string rightDesc1 = 7;</code>
   * @return The bytes for rightDesc1.
   */
  com.google.protobuf.ByteString
      getRightDesc1Bytes();

  /**
   * <pre>
   * 右侧文案2
   * </pre>
   *
   * <code>string rightDesc2 = 8;</code>
   * @return The rightDesc2.
   */
  java.lang.String getRightDesc2();
  /**
   * <pre>
   * 右侧文案2
   * </pre>
   *
   * <code>string rightDesc2 = 8;</code>
   * @return The bytes for rightDesc2.
   */
  com.google.protobuf.ByteString
      getRightDesc2Bytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string coverGif = 9;</code>
   * @return The coverGif.
   */
  java.lang.String getCoverGif();
  /**
   * <pre>
   * </pre>
   *
   * <code>string coverGif = 9;</code>
   * @return The bytes for coverGif.
   */
  com.google.protobuf.ByteString
      getCoverGifBytes();

  /**
   * <pre>
   * 右侧文案1图标id
   * </pre>
   *
   * <code>int32 rightIcon1 = 10;</code>
   * @return The rightIcon1.
   */
  int getRightIcon1();

  /**
   * <pre>
   * 右侧文案2图标id
   * </pre>
   *
   * <code>int32 rightIcon2 = 11;</code>
   * @return The rightIcon2.
   */
  int getRightIcon2();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text_content_description = 12;</code>
   * @return The coverRightTextContentDescription.
   */
  java.lang.String getCoverRightTextContentDescription();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_right_text_content_description = 12;</code>
   * @return The bytes for coverRightTextContentDescription.
   */
  com.google.protobuf.ByteString
      getCoverRightTextContentDescriptionBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string right_desc1_content_description = 13;</code>
   * @return The rightDesc1ContentDescription.
   */
  java.lang.String getRightDesc1ContentDescription();
  /**
   * <pre>
   * </pre>
   *
   * <code>string right_desc1_content_description = 13;</code>
   * @return The bytes for rightDesc1ContentDescription.
   */
  com.google.protobuf.ByteString
      getRightDesc1ContentDescriptionBytes();
}