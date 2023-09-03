// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface CardVideoDynListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.CardVideoDynList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.DynamicItem list = 1;</code>
   */
  java.util.List<bilibili.dynamic.gateway.DynamicItem> 
      getListList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.DynamicItem list = 1;</code>
   */
  bilibili.dynamic.gateway.DynamicItem getList(int index);
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.DynamicItem list = 1;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.DynamicItem list = 1;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.DynamicItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.DynamicItem list = 1;</code>
   */
  bilibili.dynamic.gateway.DynamicItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * 更新的动态数
   * </pre>
   *
   * <code>int64 update_num = 2;</code>
   * @return The updateNum.
   */
  long getUpdateNum();

  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The historyOffset.
   */
  java.lang.String getHistoryOffset();
  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The bytes for historyOffset.
   */
  com.google.protobuf.ByteString
      getHistoryOffsetBytes();

  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The updateBaseline.
   */
  java.lang.String getUpdateBaseline();
  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The bytes for updateBaseline.
   */
  com.google.protobuf.ByteString
      getUpdateBaselineBytes();

  /**
   * <pre>
   * 是否还有更多数据
   * </pre>
   *
   * <code>bool has_more = 5;</code>
   * @return The hasMore.
   */
  boolean getHasMore();
}