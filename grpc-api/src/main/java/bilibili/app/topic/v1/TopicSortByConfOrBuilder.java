// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface TopicSortByConfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.TopicSortByConf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 default_sort_by = 1;</code>
   * @return The defaultSortBy.
   */
  long getDefaultSortBy();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  java.util.List<bilibili.app.topic.v1.SortContent> 
      getAllSortByList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  bilibili.app.topic.v1.SortContent getAllSortBy(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  int getAllSortByCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  java.util.List<? extends bilibili.app.topic.v1.SortContentOrBuilder> 
      getAllSortByOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.topic.v1.SortContent all_sort_by = 2;</code>
   */
  bilibili.app.topic.v1.SortContentOrBuilder getAllSortByOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 show_sort_by = 3;</code>
   * @return The showSortBy.
   */
  long getShowSortBy();
}
