// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface DynMixUpListViewMoreReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.DynMixUpListViewMoreReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MixUpListItem items = 1;</code>
   */
  java.util.List<bilibili.dynamic.gateway.MixUpListItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MixUpListItem items = 1;</code>
   */
  bilibili.dynamic.gateway.MixUpListItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MixUpListItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MixUpListItem items = 1;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.MixUpListItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MixUpListItem items = 1;</code>
   */
  bilibili.dynamic.gateway.MixUpListItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string search_default_text = 2;</code>
   * @return The searchDefaultText.
   */
  java.lang.String getSearchDefaultText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string search_default_text = 2;</code>
   * @return The bytes for searchDefaultText.
   */
  com.google.protobuf.ByteString
      getSearchDefaultTextBytes();

  /**
   * <pre>
   * 排序类型列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.SortType sort_types = 3;</code>
   */
  java.util.List<bilibili.dynamic.gateway.SortType> 
      getSortTypesList();
  /**
   * <pre>
   * 排序类型列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.SortType sort_types = 3;</code>
   */
  bilibili.dynamic.gateway.SortType getSortTypes(int index);
  /**
   * <pre>
   * 排序类型列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.SortType sort_types = 3;</code>
   */
  int getSortTypesCount();
  /**
   * <pre>
   * 排序类型列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.SortType sort_types = 3;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.SortTypeOrBuilder> 
      getSortTypesOrBuilderList();
  /**
   * <pre>
   * 排序类型列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.SortType sort_types = 3;</code>
   */
  bilibili.dynamic.gateway.SortTypeOrBuilder getSortTypesOrBuilder(
      int index);

  /**
   * <pre>
   * 是否展示更多的排序策略
   * </pre>
   *
   * <code>bool show_more_sort_types = 4;</code>
   * @return The showMoreSortTypes.
   */
  boolean getShowMoreSortTypes();

  /**
   * <pre>
   * 默认排序策略
   * </pre>
   *
   * <code>int32 default_sort_type = 5;</code>
   * @return The defaultSortType.
   */
  int getDefaultSortType();
}
