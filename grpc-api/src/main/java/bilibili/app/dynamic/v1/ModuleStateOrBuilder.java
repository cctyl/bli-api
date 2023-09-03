// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface ModuleStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.ModuleState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 转发数
   * </pre>
   *
   * <code>int32 repost = 1;</code>
   * @return The repost.
   */
  int getRepost();

  /**
   * <pre>
   * 点赞数
   * </pre>
   *
   * <code>int32 like = 2;</code>
   * @return The like.
   */
  int getLike();

  /**
   * <pre>
   * 评论数
   * </pre>
   *
   * <code>int32 reply = 3;</code>
   * @return The reply.
   */
  int getReply();

  /**
   * <pre>
   * 点赞拓展信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.LikeInfo like_info = 4;</code>
   * @return Whether the likeInfo field is set.
   */
  boolean hasLikeInfo();
  /**
   * <pre>
   * 点赞拓展信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.LikeInfo like_info = 4;</code>
   * @return The likeInfo.
   */
  bilibili.app.dynamic.v1.LikeInfo getLikeInfo();
  /**
   * <pre>
   * 点赞拓展信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.LikeInfo like_info = 4;</code>
   */
  bilibili.app.dynamic.v1.LikeInfoOrBuilder getLikeInfoOrBuilder();

  /**
   * <pre>
   * 禁评
   * </pre>
   *
   * <code>bool no_comment = 5;</code>
   * @return The noComment.
   */
  boolean getNoComment();

  /**
   * <pre>
   * 禁转
   * </pre>
   *
   * <code>bool no_forward = 6;</code>
   * @return The noForward.
   */
  boolean getNoForward();
}