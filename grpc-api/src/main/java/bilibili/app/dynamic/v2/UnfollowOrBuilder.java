// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface UnfollowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.Unfollow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题展示文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题展示文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UnfollowUserItem list = 2;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.UnfollowUserItem> 
      getListList();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UnfollowUserItem list = 2;</code>
   */
  bilibili.app.dynamic.v2.UnfollowUserItem getList(int index);
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UnfollowUserItem list = 2;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UnfollowUserItem list = 2;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.UnfollowUserItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UnfollowUserItem list = 2;</code>
   */
  bilibili.app.dynamic.v2.UnfollowUserItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * trackID
   * </pre>
   *
   * <code>string TrackId = 3;</code>
   * @return The trackId.
   */
  java.lang.String getTrackId();
  /**
   * <pre>
   * trackID
   * </pre>
   *
   * <code>string TrackId = 3;</code>
   * @return The bytes for trackId.
   */
  com.google.protobuf.ByteString
      getTrackIdBytes();
}