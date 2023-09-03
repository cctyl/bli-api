// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface VideoInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.VideoInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频清晰度
   * </pre>
   *
   * <code>uint32 quality = 1;</code>
   * @return The quality.
   */
  int getQuality();

  /**
   * <pre>
   * 视频格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * 视频格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * 视频时长
   * </pre>
   *
   * <code>uint64 timelength = 3;</code>
   * @return The timelength.
   */
  long getTimelength();

  /**
   * <pre>
   * 视频编码id
   * </pre>
   *
   * <code>uint32 video_codecid = 4;</code>
   * @return The videoCodecid.
   */
  int getVideoCodecid();

  /**
   * <pre>
   * 视频流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.Stream stream_list = 5;</code>
   */
  java.util.List<bilibili.pgc.gateway.player.v2.Stream> 
      getStreamListList();
  /**
   * <pre>
   * 视频流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.Stream stream_list = 5;</code>
   */
  bilibili.pgc.gateway.player.v2.Stream getStreamList(int index);
  /**
   * <pre>
   * 视频流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.Stream stream_list = 5;</code>
   */
  int getStreamListCount();
  /**
   * <pre>
   * 视频流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.Stream stream_list = 5;</code>
   */
  java.util.List<? extends bilibili.pgc.gateway.player.v2.StreamOrBuilder> 
      getStreamListOrBuilderList();
  /**
   * <pre>
   * 视频流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.Stream stream_list = 5;</code>
   */
  bilibili.pgc.gateway.player.v2.StreamOrBuilder getStreamListOrBuilder(
      int index);

  /**
   * <pre>
   * 伴音流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.DashItem dash_audio = 6;</code>
   */
  java.util.List<bilibili.pgc.gateway.player.v2.DashItem> 
      getDashAudioList();
  /**
   * <pre>
   * 伴音流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.DashItem dash_audio = 6;</code>
   */
  bilibili.pgc.gateway.player.v2.DashItem getDashAudio(int index);
  /**
   * <pre>
   * 伴音流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.DashItem dash_audio = 6;</code>
   */
  int getDashAudioCount();
  /**
   * <pre>
   * 伴音流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.DashItem dash_audio = 6;</code>
   */
  java.util.List<? extends bilibili.pgc.gateway.player.v2.DashItemOrBuilder> 
      getDashAudioOrBuilderList();
  /**
   * <pre>
   * 伴音流
   * </pre>
   *
   * <code>repeated .bilibili.pgc.gateway.player.v2.DashItem dash_audio = 6;</code>
   */
  bilibili.pgc.gateway.player.v2.DashItemOrBuilder getDashAudioOrBuilder(
      int index);

  /**
   * <pre>
   * 杜比伴音流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DolbyItem dolby = 7;</code>
   * @return Whether the dolby field is set.
   */
  boolean hasDolby();
  /**
   * <pre>
   * 杜比伴音流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DolbyItem dolby = 7;</code>
   * @return The dolby.
   */
  bilibili.pgc.gateway.player.v2.DolbyItem getDolby();
  /**
   * <pre>
   * 杜比伴音流
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DolbyItem dolby = 7;</code>
   */
  bilibili.pgc.gateway.player.v2.DolbyItemOrBuilder getDolbyOrBuilder();
}
