// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface SearchInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.SearchInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 2;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.DynamicItem> 
      getListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 2;</code>
   */
  bilibili.app.dynamic.v2.DynamicItem getList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 2;</code>
   */
  int getListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 2;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.DynamicItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.DynamicItem list = 2;</code>
   */
  bilibili.app.dynamic.v2.DynamicItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string track_id = 3;</code>
   * @return The trackId.
   */
  java.lang.String getTrackId();
  /**
   * <pre>
   * </pre>
   *
   * <code>string track_id = 3;</code>
   * @return The bytes for trackId.
   */
  com.google.protobuf.ByteString
      getTrackIdBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 total = 4;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_more = 5;</code>
   * @return The hasMore.
   */
  boolean getHasMore();

  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 6;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 6;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}