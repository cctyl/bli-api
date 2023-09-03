// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface UnfollowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.Unfollow)
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
   * <code>repeated .bilibili.dynamic.gateway.UnfollowUserItem list = 2;</code>
   */
  java.util.List<bilibili.dynamic.gateway.UnfollowUserItem> 
      getListList();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.UnfollowUserItem list = 2;</code>
   */
  bilibili.dynamic.gateway.UnfollowUserItem getList(int index);
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.UnfollowUserItem list = 2;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.UnfollowUserItem list = 2;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.UnfollowUserItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 无关注列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.UnfollowUserItem list = 2;</code>
   */
  bilibili.dynamic.gateway.UnfollowUserItemOrBuilder getListOrBuilder(
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