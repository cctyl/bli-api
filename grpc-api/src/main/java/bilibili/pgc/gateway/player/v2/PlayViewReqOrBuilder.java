// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface PlayViewReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.PlayViewReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 剧集epid
   * </pre>
   *
   * <code>int64 epid = 1;</code>
   * @return The epid.
   */
  long getEpid();

  /**
   * <pre>
   * 视频cid
   * </pre>
   *
   * <code>int64 cid = 2;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 清晰度
   * </pre>
   *
   * <code>int64 qn = 3;</code>
   * @return The qn.
   */
  long getQn();

  /**
   * <pre>
   * 视频流版本
   * </pre>
   *
   * <code>int32 fnver = 4;</code>
   * @return The fnver.
   */
  int getFnver();

  /**
   * <pre>
   * 视频流格式
   * </pre>
   *
   * <code>int32 fnval = 5;</code>
   * @return The fnval.
   */
  int getFnval();

  /**
   * <pre>
   * 下载模式
   * 0:播放 1:flv下载 2:dash下载
   * </pre>
   *
   * <code>uint32 download = 6;</code>
   * @return The download.
   */
  int getDownload();

  /**
   * <pre>
   * 流url强制是用域名
   * 0:允许使用ip 1:使用http 2:使用https
   * </pre>
   *
   * <code>int32 force_host = 7;</code>
   * @return The forceHost.
   */
  int getForceHost();

  /**
   * <pre>
   * 是否4K
   * </pre>
   *
   * <code>bool fourk = 8;</code>
   * @return The fourk.
   */
  boolean getFourk();

  /**
   * <pre>
   * 当前页spm
   * </pre>
   *
   * <code>string spmid = 9;</code>
   * @return The spmid.
   */
  java.lang.String getSpmid();
  /**
   * <pre>
   * 当前页spm
   * </pre>
   *
   * <code>string spmid = 9;</code>
   * @return The bytes for spmid.
   */
  com.google.protobuf.ByteString
      getSpmidBytes();

  /**
   * <pre>
   * 上一页spm
   * </pre>
   *
   * <code>string from_spmid = 10;</code>
   * @return The fromSpmid.
   */
  java.lang.String getFromSpmid();
  /**
   * <pre>
   * 上一页spm
   * </pre>
   *
   * <code>string from_spmid = 10;</code>
   * @return The bytes for fromSpmid.
   */
  com.google.protobuf.ByteString
      getFromSpmidBytes();

  /**
   * <pre>
   * 青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 11;</code>
   * @return The teenagersMode.
   */
  int getTeenagersMode();

  /**
   * <pre>
   * 视频编码
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.CodeType prefer_codec_type = 12;</code>
   * @return The enum numeric value on the wire for preferCodecType.
   */
  int getPreferCodecTypeValue();
  /**
   * <pre>
   * 视频编码
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.CodeType prefer_codec_type = 12;</code>
   * @return The preferCodecType.
   */
  bilibili.pgc.gateway.player.v2.CodeType getPreferCodecType();

  /**
   * <pre>
   * 是否强制请求预览视频
   * </pre>
   *
   * <code>bool is_preview = 13;</code>
   * @return The isPreview.
   */
  boolean getIsPreview();

  /**
   * <pre>
   * 一起看房间id
   * </pre>
   *
   * <code>int64 room_id = 14;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <pre>
   * 是否需要展示信息
   * </pre>
   *
   * <code>bool is_need_view_info = 15;</code>
   * @return The isNeedViewInfo.
   */
  boolean getIsNeedViewInfo();

  /**
   * <pre>
   * 场景控制
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.SceneControl scene_control = 16;</code>
   * @return Whether the sceneControl field is set.
   */
  boolean hasSceneControl();
  /**
   * <pre>
   * 场景控制
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.SceneControl scene_control = 16;</code>
   * @return The sceneControl.
   */
  bilibili.pgc.gateway.player.v2.SceneControl getSceneControl();
  /**
   * <pre>
   * 场景控制
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.SceneControl scene_control = 16;</code>
   */
  bilibili.pgc.gateway.player.v2.SceneControlOrBuilder getSceneControlOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.InlineScene inline_scene = 17;</code>
   * @return The enum numeric value on the wire for inlineScene.
   */
  int getInlineSceneValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.InlineScene inline_scene = 17;</code>
   * @return The inlineScene.
   */
  bilibili.pgc.gateway.player.v2.InlineScene getInlineScene();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 material_no = 18;</code>
   * @return The materialNo.
   */
  long getMaterialNo();

  /**
   * <pre>
   * DRM 安全等级
   * </pre>
   *
   * <code>int32 security_level = 19;</code>
   * @return The securityLevel.
   */
  int getSecurityLevel();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 season_id = 20;</code>
   * @return The seasonId.
   */
  long getSeasonId();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DataControl data_control = 21;</code>
   * @return Whether the dataControl field is set.
   */
  boolean hasDataControl();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DataControl data_control = 21;</code>
   * @return The dataControl.
   */
  bilibili.pgc.gateway.player.v2.DataControl getDataControl();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.DataControl data_control = 21;</code>
   */
  bilibili.pgc.gateway.player.v2.DataControlOrBuilder getDataControlOrBuilder();
}