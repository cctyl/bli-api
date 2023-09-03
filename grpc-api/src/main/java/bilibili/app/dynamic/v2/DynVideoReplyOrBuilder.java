// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynVideoReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynVideoReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoDynList dynamic_list = 1;</code>
   * @return Whether the dynamicList field is set.
   */
  boolean hasDynamicList();
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoDynList dynamic_list = 1;</code>
   * @return The dynamicList.
   */
  bilibili.app.dynamic.v2.CardVideoDynList getDynamicList();
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoDynList dynamic_list = 1;</code>
   */
  bilibili.app.dynamic.v2.CardVideoDynListOrBuilder getDynamicListOrBuilder();

  /**
   * <pre>
   * 动态卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoUpList video_up_list = 2;</code>
   * @return Whether the videoUpList field is set.
   */
  boolean hasVideoUpList();
  /**
   * <pre>
   * 动态卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoUpList video_up_list = 2;</code>
   * @return The videoUpList.
   */
  bilibili.app.dynamic.v2.CardVideoUpList getVideoUpList();
  /**
   * <pre>
   * 动态卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoUpList video_up_list = 2;</code>
   */
  bilibili.app.dynamic.v2.CardVideoUpListOrBuilder getVideoUpListOrBuilder();

  /**
   * <pre>
   * 视频页-我的追番
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoFollowList video_follow_list = 3;</code>
   * @return Whether the videoFollowList field is set.
   */
  boolean hasVideoFollowList();
  /**
   * <pre>
   * 视频页-我的追番
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoFollowList video_follow_list = 3;</code>
   * @return The videoFollowList.
   */
  bilibili.app.dynamic.v2.CardVideoFollowList getVideoFollowList();
  /**
   * <pre>
   * 视频页-我的追番
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CardVideoFollowList video_follow_list = 3;</code>
   */
  bilibili.app.dynamic.v2.CardVideoFollowListOrBuilder getVideoFollowListOrBuilder();
}