// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

public interface VideoSubtitleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.tv.interfaces.dm.v1.VideoSubtitle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频原语言代码
   * </pre>
   *
   * <code>string lan = 1;</code>
   * @return The lan.
   */
  java.lang.String getLan();
  /**
   * <pre>
   * 视频原语言代码
   * </pre>
   *
   * <code>string lan = 1;</code>
   * @return The bytes for lan.
   */
  com.google.protobuf.ByteString
      getLanBytes();

  /**
   * <pre>
   * 视频原语言
   * </pre>
   *
   * <code>string lanDoc = 2;</code>
   * @return The lanDoc.
   */
  java.lang.String getLanDoc();
  /**
   * <pre>
   * 视频原语言
   * </pre>
   *
   * <code>string lanDoc = 2;</code>
   * @return The bytes for lanDoc.
   */
  com.google.protobuf.ByteString
      getLanDocBytes();

  /**
   * <pre>
   * 视频字幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.SubtitleItem subtitles = 3;</code>
   */
  java.util.List<bilibili.tv.interfaces.dm.v1.SubtitleItem> 
      getSubtitlesList();
  /**
   * <pre>
   * 视频字幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.SubtitleItem subtitles = 3;</code>
   */
  bilibili.tv.interfaces.dm.v1.SubtitleItem getSubtitles(int index);
  /**
   * <pre>
   * 视频字幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.SubtitleItem subtitles = 3;</code>
   */
  int getSubtitlesCount();
  /**
   * <pre>
   * 视频字幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.SubtitleItem subtitles = 3;</code>
   */
  java.util.List<? extends bilibili.tv.interfaces.dm.v1.SubtitleItemOrBuilder> 
      getSubtitlesOrBuilderList();
  /**
   * <pre>
   * 视频字幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.SubtitleItem subtitles = 3;</code>
   */
  bilibili.tv.interfaces.dm.v1.SubtitleItemOrBuilder getSubtitlesOrBuilder(
      int index);
}