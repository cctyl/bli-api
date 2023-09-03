// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface DynVideoPersonalReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.DynVideoPersonalReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v1.DynamicItem> 
      getListList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  bilibili.app.dynamic.v1.DynamicItem getList(int index);
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v1.DynamicItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  bilibili.app.dynamic.v1.DynamicItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * 偏移量
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * 偏移量
   * </pre>
   *
   * <code>string offset = 2;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   * 是否还有更多数据
   * </pre>
   *
   * <code>int32 has_more = 3;</code>
   * @return The hasMore.
   */
  int getHasMore();

  /**
   * <pre>
   * 已读进度
   * </pre>
   *
   * <code>string read_offset = 4;</code>
   * @return The readOffset.
   */
  java.lang.String getReadOffset();
  /**
   * <pre>
   * 已读进度
   * </pre>
   *
   * <code>string read_offset = 4;</code>
   * @return The bytes for readOffset.
   */
  com.google.protobuf.ByteString
      getReadOffsetBytes();
}