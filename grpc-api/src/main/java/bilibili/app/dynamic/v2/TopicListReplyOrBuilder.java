// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface TopicListReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.TopicListReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem items = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.TopicItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem items = 1;</code>
   */
  bilibili.app.dynamic.v2.TopicItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem items = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.TopicItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem items = 1;</code>
   */
  bilibili.app.dynamic.v2.TopicItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_more = 2;</code>
   * @return The hasMore.
   */
  boolean getHasMore();

  /**
   * <pre>
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();
}