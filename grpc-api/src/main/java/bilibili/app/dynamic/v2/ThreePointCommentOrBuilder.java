// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ThreePointCommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ThreePointComment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 精选评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_selection = 1;</code>
   * @return Whether the upSelection field is set.
   */
  boolean hasUpSelection();
  /**
   * <pre>
   * 精选评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_selection = 1;</code>
   * @return The upSelection.
   */
  bilibili.app.dynamic.v2.CommentDetail getUpSelection();
  /**
   * <pre>
   * 精选评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_selection = 1;</code>
   */
  bilibili.app.dynamic.v2.CommentDetailOrBuilder getUpSelectionOrBuilder();

  /**
   * <pre>
   * up关闭评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_close = 2;</code>
   * @return Whether the upClose field is set.
   */
  boolean hasUpClose();
  /**
   * <pre>
   * up关闭评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_close = 2;</code>
   * @return The upClose.
   */
  bilibili.app.dynamic.v2.CommentDetail getUpClose();
  /**
   * <pre>
   * up关闭评论区功能
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CommentDetail up_close = 2;</code>
   */
  bilibili.app.dynamic.v2.CommentDetailOrBuilder getUpCloseOrBuilder();

  /**
   * <pre>
   * icon
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * icon
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}