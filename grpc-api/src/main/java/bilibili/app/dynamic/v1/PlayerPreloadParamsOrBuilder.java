// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface PlayerPreloadParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.PlayerPreloadParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 清晰度
   * </pre>
   *
   * <code>int32 qn = 1;</code>
   * @return The qn.
   */
  int getQn();

  /**
   * <pre>
   * 流版本
   * </pre>
   *
   * <code>int32 fnver = 2;</code>
   * @return The fnver.
   */
  int getFnver();

  /**
   * <pre>
   * 流类型
   * </pre>
   *
   * <code>int32 fnval = 3;</code>
   * @return The fnval.
   */
  int getFnval();

  /**
   * <pre>
   * 是否强制使用域名
   * </pre>
   *
   * <code>int32 force_host = 4;</code>
   * @return The forceHost.
   */
  int getForceHost();

  /**
   * <pre>
   * 是否4k
   * </pre>
   *
   * <code>int32 fourk = 5;</code>
   * @return The fourk.
   */
  int getFourk();
}
