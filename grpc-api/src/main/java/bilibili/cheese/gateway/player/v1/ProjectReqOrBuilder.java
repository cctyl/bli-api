// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/cheese/gateway/player/v1/playurl.proto

package bilibili.cheese.gateway.player.v1;

public interface ProjectReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.cheese.gateway.player.v1.ProjectReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 课程epid(与番剧不互通)
   * </pre>
   *
   * <code>int64 ep_id = 1;</code>
   * @return The epId.
   */
  long getEpId();

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
   * 投屏协议
   * 0:默认乐播 1:自建协议 2:云投屏
   * </pre>
   *
   * <code>int32 protocol = 11;</code>
   * @return The protocol.
   */
  int getProtocol();

  /**
   * <pre>
   * 投屏设备
   * 0:默认其他 1:OTT设备
   * </pre>
   *
   * <code>int32 device_type = 12;</code>
   * @return The deviceType.
   */
  int getDeviceType();

  /**
   * <pre>
   * 是否flv格式
   * </pre>
   *
   * <code>bool flv_proj = 13;</code>
   * @return The flvProj.
   */
  boolean getFlvProj();
}
