// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface UserPendantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.UserPendant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pid
   * </pre>
   *
   * <code>int64 pid = 1;</code>
   * @return The pid.
   */
  long getPid();

  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 图片链接
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <pre>
   * 图片链接
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <pre>
   * 有效期
   * </pre>
   *
   * <code>int64 expire = 4;</code>
   * @return The expire.
   */
  long getExpire();
}