// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynDetailReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynDetailReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * up主uid
   * </pre>
   *
   * <code>int64 uid = 1;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 2;</code>
   * @return The dynamicId.
   */
  java.lang.String getDynamicId();
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 2;</code>
   * @return The bytes for dynamicId.
   */
  com.google.protobuf.ByteString
      getDynamicIdBytes();

  /**
   * <pre>
   * 动态类型
   * </pre>
   *
   * <code>int64 dyn_type = 3;</code>
   * @return The dynType.
   */
  long getDynType();

  /**
   * <pre>
   * 业务方资源id
   * </pre>
   *
   * <code>int64 rid = 4;</code>
   * @return The rid.
   */
  long getRid();

  /**
   * <pre>
   * 广告参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdParam ad_param = 5;</code>
   * @return Whether the adParam field is set.
   */
  boolean hasAdParam();
  /**
   * <pre>
   * 广告参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdParam ad_param = 5;</code>
   * @return The adParam.
   */
  bilibili.app.dynamic.v2.AdParam getAdParam();
  /**
   * <pre>
   * 广告参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdParam ad_param = 5;</code>
   */
  bilibili.app.dynamic.v2.AdParamOrBuilder getAdParamOrBuilder();

  /**
   * <pre>
   * From来源
   * </pre>
   *
   * <code>string from = 6;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * From来源
   * </pre>
   *
   * <code>string from = 6;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 7;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 7;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 7;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * 分享id
   * </pre>
   *
   * <code>string share_id = 8;</code>
   * @return The shareId.
   */
  java.lang.String getShareId();
  /**
   * <pre>
   * 分享id
   * </pre>
   *
   * <code>string share_id = 8;</code>
   * @return The bytes for shareId.
   */
  com.google.protobuf.ByteString
      getShareIdBytes();

  /**
   * <pre>
   * 分享类型
   * 1:文字 2:图片 3:链接 4:视频 5:音频
   * </pre>
   *
   * <code>int32 share_mode = 9;</code>
   * @return The shareMode.
   */
  int getShareMode();

  /**
   * <pre>
   * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
   * </pre>
   *
   * <code>int32 local_time = 10;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * pattern
   * </pre>
   *
   * <code>string pattern = 11;</code>
   * @return The pattern.
   */
  java.lang.String getPattern();
  /**
   * <pre>
   * pattern
   * </pre>
   *
   * <code>string pattern = 11;</code>
   * @return The bytes for pattern.
   */
  com.google.protobuf.ByteString
      getPatternBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   * @return The config.
   */
  bilibili.app.dynamic.v2.Config getConfig();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   */
  bilibili.app.dynamic.v2.ConfigOrBuilder getConfigOrBuilder();
}