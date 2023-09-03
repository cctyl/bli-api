// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynRcmdUpExchangeReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynRcmdUpExchangeReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 登录用户id
   * </pre>
   *
   * <code>int64 uid = 1;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * 上一次不感兴趣的ts，单位：秒；该字段透传给搜索
   * </pre>
   *
   * <code>int64 dislikeTs = 2;</code>
   * @return The dislikeTs.
   */
  long getDislikeTs();

  /**
   * <pre>
   * 需要与服务端确认或参照客户端现有参数
   * </pre>
   *
   * <code>string from = 3;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * 需要与服务端确认或参照客户端现有参数
   * </pre>
   *
   * <code>string from = 3;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();
}