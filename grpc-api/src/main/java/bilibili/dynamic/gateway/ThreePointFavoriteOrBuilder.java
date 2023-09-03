// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface ThreePointFavoriteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.ThreePointFavorite)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * icon
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * icon
   * </pre>
   *
   * <code>string icon = 1;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 物料ID
   * </pre>
   *
   * <code>int64 id = 3;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 是否订阅
   * </pre>
   *
   * <code>bool is_favourite = 4;</code>
   * @return The isFavourite.
   */
  boolean getIsFavourite();

  /**
   * <pre>
   * 取消收藏图标
   * </pre>
   *
   * <code>string cancel_icon = 5;</code>
   * @return The cancelIcon.
   */
  java.lang.String getCancelIcon();
  /**
   * <pre>
   * 取消收藏图标
   * </pre>
   *
   * <code>string cancel_icon = 5;</code>
   * @return The bytes for cancelIcon.
   */
  com.google.protobuf.ByteString
      getCancelIconBytes();

  /**
   * <pre>
   * 取消收藏文案
   * </pre>
   *
   * <code>string cancel_title = 6;</code>
   * @return The cancelTitle.
   */
  java.lang.String getCancelTitle();
  /**
   * <pre>
   * 取消收藏文案
   * </pre>
   *
   * <code>string cancel_title = 6;</code>
   * @return The bytes for cancelTitle.
   */
  com.google.protobuf.ByteString
      getCancelTitleBytes();
}
