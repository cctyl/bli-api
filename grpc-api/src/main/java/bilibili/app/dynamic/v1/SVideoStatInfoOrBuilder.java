// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface SVideoStatInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.SVideoStatInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 计数icon
   * 1:分享符号 2:评论符号 3:点赞符号
   * </pre>
   *
   * <code>int32 icon = 1;</code>
   * @return The icon.
   */
  int getIcon();

  /**
   * <pre>
   * 计数值
   * </pre>
   *
   * <code>int64 num = 2;</code>
   * @return The num.
   */
  long getNum();

  /**
   * <pre>
   * 选中状态
   * 1:选中
   * </pre>
   *
   * <code>int32 selected = 3;</code>
   * @return The selected.
   */
  int getSelected();

  /**
   * <pre>
   * 跳转链接(如评论)
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转链接(如评论)
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
