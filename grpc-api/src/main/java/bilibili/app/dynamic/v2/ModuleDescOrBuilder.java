// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ModuleDescOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ModuleDesc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 描述信息(已按高亮拆分)
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.Description desc = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.Description> 
      getDescList();
  /**
   * <pre>
   * 描述信息(已按高亮拆分)
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.Description desc = 1;</code>
   */
  bilibili.app.dynamic.v2.Description getDesc(int index);
  /**
   * <pre>
   * 描述信息(已按高亮拆分)
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.Description desc = 1;</code>
   */
  int getDescCount();
  /**
   * <pre>
   * 描述信息(已按高亮拆分)
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.Description desc = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.DescriptionOrBuilder> 
      getDescOrBuilderList();
  /**
   * <pre>
   * 描述信息(已按高亮拆分)
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.Description desc = 1;</code>
   */
  bilibili.app.dynamic.v2.DescriptionOrBuilder getDescOrBuilder(
      int index);

  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string jump_uri = 2;</code>
   * @return The jumpUri.
   */
  java.lang.String getJumpUri();
  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string jump_uri = 2;</code>
   * @return The bytes for jumpUri.
   */
  com.google.protobuf.ByteString
      getJumpUriBytes();

  /**
   * <pre>
   * 文本原本
   * </pre>
   *
   * <code>string text = 3;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 文本原本
   * </pre>
   *
   * <code>string text = 3;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}