// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface DmSegMobileReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.DmSegMobileReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 稿件avid/漫画epid
   * </pre>
   *
   * <code>int64 pid = 1;</code>
   * @return The pid.
   */
  long getPid();

  /**
   * <pre>
   * 视频cid/漫画cid
   * </pre>
   *
   * <code>int64 oid = 2;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * 弹幕类型
   * 1:视频 2:漫画
   * </pre>
   *
   * <code>int32 type = 3;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * 分段(6min)
   * </pre>
   *
   * <code>int64 segment_index = 4;</code>
   * @return The segmentIndex.
   */
  long getSegmentIndex();

  /**
   * <pre>
   * 是否青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 5;</code>
   * @return The teenagersMode.
   */
  int getTeenagersMode();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ps = 6;</code>
   * @return The ps.
   */
  long getPs();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pe = 7;</code>
   * @return The pe.
   */
  long getPe();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pull_mode = 8;</code>
   * @return The pullMode.
   */
  int getPullMode();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 from_scene = 9;</code>
   * @return The fromScene.
   */
  int getFromScene();
}
