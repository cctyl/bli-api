// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface FeedFilterReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.FeedFilterReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string offset = 1;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string offset = 1;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>bool has_more = 2;</code>
   * @return The hasMore.
   */
  boolean getHasMore();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 3;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.DynamicItem> 
      getListList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 3;</code>
   */
  bilibili.app.dynamic.v2.DynamicItem getList(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 3;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 3;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 3;</code>
   */
  bilibili.app.dynamic.v2.DynamicItemOrBuilder getListOrBuilder(
      int index);
}