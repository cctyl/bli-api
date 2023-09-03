// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface LiveInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.LiveInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否在直播
   * 0:未直播 1:正在直播 (废弃)
   * </pre>
   *
   * <code>int32 is_living = 1;</code>
   * @return The isLiving.
   */
  int getIsLiving();

  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 直播状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.LiveState live_state = 3;</code>
   * @return The enum numeric value on the wire for liveState.
   */
  int getLiveStateValue();
  /**
   * <pre>
   * 直播状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.LiveState live_state = 3;</code>
   * @return The liveState.
   */
  bilibili.dynamic.gateway.LiveState getLiveState();
}
