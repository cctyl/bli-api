// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface TopicButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.TopicButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 按钮图标
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * 按钮图标
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * 按钮文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 按钮文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 跳转
   * </pre>
   *
   * <code>string jump_uri = 3;</code>
   * @return The jumpUri.
   */
  java.lang.String getJumpUri();
  /**
   * <pre>
   * 跳转
   * </pre>
   *
   * <code>string jump_uri = 3;</code>
   * @return The bytes for jumpUri.
   */
  com.google.protobuf.ByteString
      getJumpUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool red_dot = 4;</code>
   * @return The redDot.
   */
  boolean getRedDot();
}
