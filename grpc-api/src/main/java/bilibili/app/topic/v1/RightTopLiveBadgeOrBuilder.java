// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface RightTopLiveBadgeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.RightTopLiveBadge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 live_status = 1;</code>
   * @return The liveStatus.
   */
  long getLiveStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   * @return Whether the inLive field is set.
   */
  boolean hasInLive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   * @return The inLive.
   */
  bilibili.app.topic.v1.LiveBadgeResource getInLive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.LiveBadgeResource in_live = 2;</code>
   */
  bilibili.app.topic.v1.LiveBadgeResourceOrBuilder getInLiveOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string live_stats_desc = 3;</code>
   * @return The liveStatsDesc.
   */
  java.lang.String getLiveStatsDesc();
  /**
   * <pre>
   * </pre>
   *
   * <code>string live_stats_desc = 3;</code>
   * @return The bytes for liveStatsDesc.
   */
  com.google.protobuf.ByteString
      getLiveStatsDescBytes();
}