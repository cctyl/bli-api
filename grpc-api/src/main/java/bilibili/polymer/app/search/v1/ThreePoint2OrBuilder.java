// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface ThreePoint2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.ThreePoint2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason dislike_reasons = 1;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.DislikeReason> 
      getDislikeReasonsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason dislike_reasons = 1;</code>
   */
  bilibili.polymer.app.search.v1.DislikeReason getDislikeReasons(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason dislike_reasons = 1;</code>
   */
  int getDislikeReasonsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason dislike_reasons = 1;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.DislikeReasonOrBuilder> 
      getDislikeReasonsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason dislike_reasons = 1;</code>
   */
  bilibili.polymer.app.search.v1.DislikeReasonOrBuilder getDislikeReasonsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason feedbacks = 2;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.DislikeReason> 
      getFeedbacksList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason feedbacks = 2;</code>
   */
  bilibili.polymer.app.search.v1.DislikeReason getFeedbacks(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason feedbacks = 2;</code>
   */
  int getFeedbacksCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason feedbacks = 2;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.DislikeReasonOrBuilder> 
      getFeedbacksOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DislikeReason feedbacks = 2;</code>
   */
  bilibili.polymer.app.search.v1.DislikeReasonOrBuilder getFeedbacksOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 watch_later = 3;</code>
   * @return The watchLater.
   */
  int getWatchLater();
}
