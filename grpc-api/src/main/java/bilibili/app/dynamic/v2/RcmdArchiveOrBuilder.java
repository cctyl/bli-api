// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface RcmdArchiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.RcmdArchive)
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
   * 封面图
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 视频封面展示项 1
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CoverIcon cover_left_icon_1 = 3;</code>
   * @return The enum numeric value on the wire for coverLeftIcon1.
   */
  int getCoverLeftIcon1Value();
  /**
   * <pre>
   * 视频封面展示项 1
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CoverIcon cover_left_icon_1 = 3;</code>
   * @return The coverLeftIcon1.
   */
  bilibili.app.dynamic.v2.CoverIcon getCoverLeftIcon1();

  /**
   * <pre>
   * 视频封面展示项 1
   * </pre>
   *
   * <code>string cover_left_text_1 = 4;</code>
   * @return The coverLeftText1.
   */
  java.lang.String getCoverLeftText1();
  /**
   * <pre>
   * 视频封面展示项 1
   * </pre>
   *
   * <code>string cover_left_text_1 = 4;</code>
   * @return The bytes for coverLeftText1.
   */
  com.google.protobuf.ByteString
      getCoverLeftText1Bytes();

  /**
   * <pre>
   * 秒开地址
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 秒开地址
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 是否PGC
   * </pre>
   *
   * <code>bool is_pgc = 6;</code>
   * @return The isPgc.
   */
  boolean getIsPgc();

  /**
   * <pre>
   * aid
   * </pre>
   *
   * <code>int64 aid = 7;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconBadge badge = 8;</code>
   * @return Whether the badge field is set.
   */
  boolean hasBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconBadge badge = 8;</code>
   * @return The badge.
   */
  bilibili.app.dynamic.v2.IconBadge getBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconBadge badge = 8;</code>
   */
  bilibili.app.dynamic.v2.IconBadgeOrBuilder getBadgeOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_left_icon2 = 9;</code>
   * @return The coverLeftIcon2.
   */
  int getCoverLeftIcon2();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text2 = 10;</code>
   * @return The coverLeftText2.
   */
  java.lang.String getCoverLeftText2();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text2 = 10;</code>
   * @return The bytes for coverLeftText2.
   */
  com.google.protobuf.ByteString
      getCoverLeftText2Bytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_left_icon3 = 11;</code>
   * @return The coverLeftIcon3.
   */
  int getCoverLeftIcon3();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text3 = 12;</code>
   * @return The coverLeftText3.
   */
  java.lang.String getCoverLeftText3();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_left_text3 = 12;</code>
   * @return The bytes for coverLeftText3.
   */
  com.google.protobuf.ByteString
      getCoverLeftText3Bytes();
}