// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

public interface MetaDataCtrlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.MetaDataCtrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 客户端平台
   * </pre>
   *
   * <code>string platform = 1;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * 客户端平台
   * </pre>
   *
   * <code>string platform = 1;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <pre>
   * 客户端build号
   * </pre>
   *
   * <code>string build = 2;</code>
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   * <pre>
   * 客户端build号
   * </pre>
   *
   * <code>string build = 2;</code>
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString
      getBuildBytes();

  /**
   * <pre>
   * 客户端移动设备类型
   * </pre>
   *
   * <code>string mobi_app = 3;</code>
   * @return The mobiApp.
   */
  java.lang.String getMobiApp();
  /**
   * <pre>
   * 客户端移动设备类型
   * </pre>
   *
   * <code>string mobi_app = 3;</code>
   * @return The bytes for mobiApp.
   */
  com.google.protobuf.ByteString
      getMobiAppBytes();

  /**
   * <pre>
   * 客户端buvid
   * </pre>
   *
   * <code>string buvid = 4;</code>
   * @return The buvid.
   */
  java.lang.String getBuvid();
  /**
   * <pre>
   * 客户端buvid
   * </pre>
   *
   * <code>string buvid = 4;</code>
   * @return The bytes for buvid.
   */
  com.google.protobuf.ByteString
      getBuvidBytes();

  /**
   * <pre>
   * 用户设备信息
   * </pre>
   *
   * <code>string device = 5;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * 用户设备信息
   * </pre>
   *
   * <code>string device = 5;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * 请求来源页面的spmid
   * </pre>
   *
   * <code>string from_spmid = 6;</code>
   * @return The fromSpmid.
   */
  java.lang.String getFromSpmid();
  /**
   * <pre>
   * 请求来源页面的spmid
   * </pre>
   *
   * <code>string from_spmid = 6;</code>
   * @return The bytes for fromSpmid.
   */
  com.google.protobuf.ByteString
      getFromSpmidBytes();

  /**
   * <pre>
   * 请求来源页面
   * </pre>
   *
   * <code>string from = 7;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * 请求来源页面
   * </pre>
   *
   * <code>string from = 7;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 请求的trace_id
   * </pre>
   *
   * <code>string trace_id = 8;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * 请求的trace_id
   * </pre>
   *
   * <code>string trace_id = 8;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <pre>
   * 青少年模式
   * </pre>
   *
   * <code>int32 teenager_mode = 9;</code>
   * @return The teenagerMode.
   */
  int getTeenagerMode();

  /**
   * <pre>
   * 0:正常 1:冷启动
   * </pre>
   *
   * <code>int32 cold_start = 10;</code>
   * @return The coldStart.
   */
  int getColdStart();

  /**
   * <pre>
   * 客户端版本号
   * </pre>
   *
   * <code>string version = 11;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * 客户端版本号
   * </pre>
   *
   * <code>string version = 11;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * 网络状态
   * Unknown=0 WIFI=1 WWAN=2
   * </pre>
   *
   * <code>int32 network = 12;</code>
   * @return The network.
   */
  int getNetwork();

  /**
   * <pre>
   * 用户ip地址
   * </pre>
   *
   * <code>string ip = 13;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <pre>
   * 用户ip地址
   * </pre>
   *
   * <code>string ip = 13;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();
}