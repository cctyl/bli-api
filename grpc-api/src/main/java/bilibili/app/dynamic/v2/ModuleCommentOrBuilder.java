// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ModuleCommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ModuleComment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 评论外露展示项
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.CmtShowItem> 
      getCmtShowItemList();
  /**
   * <pre>
   * 评论外露展示项
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  bilibili.app.dynamic.v2.CmtShowItem getCmtShowItem(int index);
  /**
   * <pre>
   * 评论外露展示项
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  int getCmtShowItemCount();
  /**
   * <pre>
   * 评论外露展示项
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.CmtShowItemOrBuilder> 
      getCmtShowItemOrBuilderList();
  /**
   * <pre>
   * 评论外露展示项
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  bilibili.app.dynamic.v2.CmtShowItemOrBuilder getCmtShowItemOrBuilder(
      int index);
}