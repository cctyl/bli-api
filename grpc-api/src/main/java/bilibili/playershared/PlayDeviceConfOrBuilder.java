// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

public interface PlayDeviceConfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.playershared.PlayDeviceConf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  int getDeviceConfsCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  boolean containsDeviceConfs(
      int key);
  /**
   * Use {@link #getDeviceConfsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf>
  getDeviceConfs();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  java.util.Map<java.lang.Integer, bilibili.playershared.DeviceConf>
  getDeviceConfsMap();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  /* nullable */
bilibili.playershared.DeviceConf getDeviceConfsOrDefault(
      int key,
      /* nullable */
bilibili.playershared.DeviceConf defaultValue);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;int32, .bilibili.playershared.DeviceConf&gt; device_confs = 1;</code>
   */
  bilibili.playershared.DeviceConf getDeviceConfsOrThrow(
      int key);
}
