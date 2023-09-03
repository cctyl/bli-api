// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynDrawOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynDraw)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawItem items = 1;</code>
   */
  java.util.List<bilibili.dynamic.gateway.MdlDynDrawItem> 
      getItemsList();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawItem items = 1;</code>
   */
  bilibili.dynamic.gateway.MdlDynDrawItem getItems(int index);
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawItem items = 1;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.MdlDynDrawItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawItem items = 1;</code>
   */
  bilibili.dynamic.gateway.MdlDynDrawItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 图文ID
   * </pre>
   *
   * <code>int64 id = 3;</code>
   * @return The id.
   */
  long getId();
}