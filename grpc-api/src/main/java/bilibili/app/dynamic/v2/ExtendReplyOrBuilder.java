// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ExtendReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ExtendReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 基础跳转地址
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 基础跳转地址
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.ExtendReplyParam> 
      getParamsList();
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  bilibili.app.dynamic.v2.ExtendReplyParam getParams(int index);
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  int getParamsCount();
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder> 
      getParamsOrBuilderList();
  /**
   * <pre>
   * 参数部分
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ExtendReplyParam params = 2;</code>
   */
  bilibili.app.dynamic.v2.ExtendReplyParamOrBuilder getParamsOrBuilder(
      int index);
}