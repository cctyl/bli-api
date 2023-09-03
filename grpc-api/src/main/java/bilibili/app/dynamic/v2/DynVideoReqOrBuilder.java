// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynVideoReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynVideoReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 透传 update_baseline
   * </pre>
   *
   * <code>string update_baseline = 1;</code>
   * @return The updateBaseline.
   */
  java.lang.String getUpdateBaseline();
  /**
   * <pre>
   * 透传 update_baseline
   * </pre>
   *
   * <code>string update_baseline = 1;</code>
   * @return The bytes for updateBaseline.
   */
  com.google.protobuf.ByteString
      getUpdateBaselineBytes();

  /**
   * <pre>
   * 透传 history_offset
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * 透传 history_offset
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   * 向下翻页数
   * </pre>
   *
   * <code>int32 page = 3;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * 刷新方式
   * 1:向上刷新 2:向下翻页
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Refresh refresh_type = 4;</code>
   * @return The enum numeric value on the wire for refreshType.
   */
  int getRefreshTypeValue();
  /**
   * <pre>
   * 刷新方式
   * 1:向上刷新 2:向下翻页
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Refresh refresh_type = 4;</code>
   * @return The refreshType.
   */
  bilibili.app.dynamic.v2.Refresh getRefreshType();

  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 5;</code>
   * @return Whether the playurlParam field is set.
   */
  boolean hasPlayurlParam();
  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 5;</code>
   * @return The playurlParam.
   */
  bilibili.app.dynamic.v2.PlayurlParam getPlayurlParam();
  /**
   * <pre>
   * 秒开参数 新版本废弃，统一使用player_args
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 5;</code>
   */
  bilibili.app.dynamic.v2.PlayurlParamOrBuilder getPlayurlParamOrBuilder();

  /**
   * <pre>
   * 综合页当前更新的最大值
   * </pre>
   *
   * <code>string assist_baseline = 6;</code>
   * @return The assistBaseline.
   */
  java.lang.String getAssistBaseline();
  /**
   * <pre>
   * 综合页当前更新的最大值
   * </pre>
   *
   * <code>string assist_baseline = 6;</code>
   * @return The bytes for assistBaseline.
   */
  com.google.protobuf.ByteString
      getAssistBaselineBytes();

  /**
   * <pre>
   * 客户端时区 兼容UTC-14和Etc/GMT+12,时区区间[-12,14] 东八区为8
   * </pre>
   *
   * <code>int32 local_time = 7;</code>
   * @return The localTime.
   */
  int getLocalTime();

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
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 9;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 9;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 9;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();
}
