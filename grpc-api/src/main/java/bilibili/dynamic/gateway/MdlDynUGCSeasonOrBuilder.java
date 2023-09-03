// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynUGCSeasonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynUGCSeason)
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
   * 秒开地址
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 秒开地址
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

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
   * 视频封面展示项 2
   * </pre>
   *
   * <code>string cover_left_text_2 = 5;</code>
   * @return The coverLeftText2.
   */
  java.lang.String getCoverLeftText2();
  /**
   * <pre>
   * 视频封面展示项 2
   * </pre>
   *
   * <code>string cover_left_text_2 = 5;</code>
   * @return The bytes for coverLeftText2.
   */
  com.google.protobuf.ByteString
      getCoverLeftText2Bytes();

  /**
   * <pre>
   * 封面视频展示项 3
   * </pre>
   *
   * <code>string cover_left_text_3 = 6;</code>
   * @return The coverLeftText3.
   */
  java.lang.String getCoverLeftText3();
  /**
   * <pre>
   * 封面视频展示项 3
   * </pre>
   *
   * <code>string cover_left_text_3 = 6;</code>
   * @return The bytes for coverLeftText3.
   */
  com.google.protobuf.ByteString
      getCoverLeftText3Bytes();

  /**
   * <pre>
   * 卡片物料id
   * </pre>
   *
   * <code>int64 id = 7;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * inline播放地址
   * </pre>
   *
   * <code>string inlineURL = 8;</code>
   * @return The inlineURL.
   */
  java.lang.String getInlineURL();
  /**
   * <pre>
   * inline播放地址
   * </pre>
   *
   * <code>string inlineURL = 8;</code>
   * @return The bytes for inlineURL.
   */
  com.google.protobuf.ByteString
      getInlineURLBytes();

  /**
   * <pre>
   * 是否能够自动播放
   * </pre>
   *
   * <code>bool can_play = 9;</code>
   * @return The canPlay.
   */
  boolean getCanPlay();

  /**
   * <pre>
   * 播放按钮
   * </pre>
   *
   * <code>string play_icon = 10;</code>
   * @return The playIcon.
   */
  java.lang.String getPlayIcon();
  /**
   * <pre>
   * 播放按钮
   * </pre>
   *
   * <code>string play_icon = 10;</code>
   * @return The bytes for playIcon.
   */
  com.google.protobuf.ByteString
      getPlayIconBytes();

  /**
   * <pre>
   * avid
   * </pre>
   *
   * <code>int64 avid = 11;</code>
   * @return The avid.
   */
  long getAvid();

  /**
   * <pre>
   * cid
   * </pre>
   *
   * <code>int64 cid = 12;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 尺寸信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Dimension dimension = 13;</code>
   * @return Whether the dimension field is set.
   */
  boolean hasDimension();
  /**
   * <pre>
   * 尺寸信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Dimension dimension = 13;</code>
   * @return The dimension.
   */
  bilibili.dynamic.gateway.Dimension getDimension();
  /**
   * <pre>
   * 尺寸信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Dimension dimension = 13;</code>
   */
  bilibili.dynamic.gateway.DimensionOrBuilder getDimensionOrBuilder();

  /**
   * <pre>
   * 时长
   * </pre>
   *
   * <code>int64 duration = 14;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string jump_url = 15;</code>
   * @return The jumpUrl.
   */
  java.lang.String getJumpUrl();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string jump_url = 15;</code>
   * @return The bytes for jumpUrl.
   */
  com.google.protobuf.ByteString
      getJumpUrlBytes();
}
