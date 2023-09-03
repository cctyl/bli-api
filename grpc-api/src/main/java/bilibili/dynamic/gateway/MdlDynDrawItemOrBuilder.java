// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynDrawItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynDrawItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 图片链接
   * </pre>
   *
   * <code>string src = 1;</code>
   * @return The src.
   */
  java.lang.String getSrc();
  /**
   * <pre>
   * 图片链接
   * </pre>
   *
   * <code>string src = 1;</code>
   * @return The bytes for src.
   */
  com.google.protobuf.ByteString
      getSrcBytes();

  /**
   * <pre>
   * 图片宽度
   * </pre>
   *
   * <code>int64 width = 2;</code>
   * @return The width.
   */
  long getWidth();

  /**
   * <pre>
   * 图片高度
   * </pre>
   *
   * <code>int64 height = 3;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <pre>
   * 图片大小
   * </pre>
   *
   * <code>float size = 4;</code>
   * @return The size.
   */
  float getSize();

  /**
   * <pre>
   * 图片标签
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawTag tags = 5;</code>
   */
  java.util.List<bilibili.dynamic.gateway.MdlDynDrawTag> 
      getTagsList();
  /**
   * <pre>
   * 图片标签
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawTag tags = 5;</code>
   */
  bilibili.dynamic.gateway.MdlDynDrawTag getTags(int index);
  /**
   * <pre>
   * 图片标签
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawTag tags = 5;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * 图片标签
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawTag tags = 5;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.MdlDynDrawTagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <pre>
   * 图片标签
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.MdlDynDrawTag tags = 5;</code>
   */
  bilibili.dynamic.gateway.MdlDynDrawTagOrBuilder getTagsOrBuilder(
      int index);
}
