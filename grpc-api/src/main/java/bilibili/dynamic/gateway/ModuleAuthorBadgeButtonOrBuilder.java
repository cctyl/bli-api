// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface ModuleAuthorBadgeButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.ModuleAuthorBadgeButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 图标
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * 图标
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>int32 state = 3;</code>
   * @return The state.
   */
  int getState();

  /**
   * <pre>
   * 物料ID
   * </pre>
   *
   * <code>int64 id = 4;</code>
   * @return The id.
   */
  long getId();
}