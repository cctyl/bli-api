// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface OfficialVerifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.OfficialVerify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 认证类型
   * 0:个人认证 1:官方认证
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   *认证名称
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   *认证名称
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();
}