// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface DynVideoPersonalReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.DynVideoPersonalReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被访问者的 UID
   * </pre>
   *
   * <code>int64 host_uid = 1;</code>
   * @return The hostUid.
   */
  long getHostUid();

  /**
   * <pre>
   * 偏移量 第一页可传空
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * 偏移量 第一页可传空
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   * 标明下拉几次
   * </pre>
   *
   * <code>int32 page = 3;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * 是否是预加载
   * </pre>
   *
   * <code>int32 is_preload = 4;</code>
   * @return The isPreload.
   */
  int getIsPreload();

  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayurlParam playurl_param = 5;</code>
   * @return Whether the playurlParam field is set.
   */
  boolean hasPlayurlParam();
  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayurlParam playurl_param = 5;</code>
   * @return The playurlParam.
   */
  bilibili.dynamic.gateway.PlayurlParam getPlayurlParam();
  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayurlParam playurl_param = 5;</code>
   */
  bilibili.dynamic.gateway.PlayurlParamOrBuilder getPlayurlParamOrBuilder();

  /**
   * <pre>
   * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
   * </pre>
   *
   * <code>int32 local_time = 6;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * 服务端生成的透传上报字段
   * </pre>
   *
   * <code>string footprint = 7;</code>
   * @return The footprint.
   */
  java.lang.String getFootprint();
  /**
   * <pre>
   * 服务端生成的透传上报字段
   * </pre>
   *
   * <code>string footprint = 7;</code>
   * @return The bytes for footprint.
   */
  com.google.protobuf.ByteString
      getFootprintBytes();

  /**
   * <pre>
   * 来源
   * </pre>
   *
   * <code>string from = 8;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * 来源
   * </pre>
   *
   * <code>string from = 8;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayerArgs player_args = 9;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayerArgs player_args = 9;</code>
   * @return The playerArgs.
   */
  bilibili.dynamic.gateway.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.PlayerArgs player_args = 9;</code>
   */
  bilibili.dynamic.gateway.PlayerArgsOrBuilder getPlayerArgsOrBuilder();
}
