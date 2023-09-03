// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface TimeLineResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.TimeLineResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 time_line_id = 1;</code>
   * @return The timeLineId.
   */
  long getTimeLineId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string time_line_title = 2;</code>
   * @return The timeLineTitle.
   */
  java.lang.String getTimeLineTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string time_line_title = 2;</code>
   * @return The bytes for timeLineTitle.
   */
  com.google.protobuf.ByteString
      getTimeLineTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TimeLineEvents time_line_events = 3;</code>
   */
  java.util.List<bilibili.app.topic.v1.TimeLineEvents> 
      getTimeLineEventsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TimeLineEvents time_line_events = 3;</code>
   */
  bilibili.app.topic.v1.TimeLineEvents getTimeLineEvents(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TimeLineEvents time_line_events = 3;</code>
   */
  int getTimeLineEventsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TimeLineEvents time_line_events = 3;</code>
   */
  java.util.List<? extends bilibili.app.topic.v1.TimeLineEventsOrBuilder> 
      getTimeLineEventsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.TimeLineEvents time_line_events = 3;</code>
   */
  bilibili.app.topic.v1.TimeLineEventsOrBuilder getTimeLineEventsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_more = 4;</code>
   * @return The hasMore.
   */
  boolean getHasMore();
}