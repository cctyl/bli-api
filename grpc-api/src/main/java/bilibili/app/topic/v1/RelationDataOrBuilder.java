// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface RelationDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.RelationData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_fav = 1;</code>
   * @return The isFav.
   */
  boolean getIsFav();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_coin = 2;</code>
   * @return The isCoin.
   */
  boolean getIsCoin();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_follow = 3;</code>
   * @return The isFollow.
   */
  boolean getIsFollow();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_like = 4;</code>
   * @return The isLike.
   */
  boolean getIsLike();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 like_count = 5;</code>
   * @return The likeCount.
   */
  long getLikeCount();
}