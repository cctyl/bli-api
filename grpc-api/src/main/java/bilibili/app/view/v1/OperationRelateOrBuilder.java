// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface OperationRelateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.OperationRelate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 模块标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 模块标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 相关推荐模块内容
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateItem relate_item = 2;</code>
   */
  java.util.List<bilibili.app.view.v1.RelateItem> 
      getRelateItemList();
  /**
   * <pre>
   * 相关推荐模块内容
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateItem relate_item = 2;</code>
   */
  bilibili.app.view.v1.RelateItem getRelateItem(int index);
  /**
   * <pre>
   * 相关推荐模块内容
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateItem relate_item = 2;</code>
   */
  int getRelateItemCount();
  /**
   * <pre>
   * 相关推荐模块内容
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateItem relate_item = 2;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.RelateItemOrBuilder> 
      getRelateItemOrBuilderList();
  /**
   * <pre>
   * 相关推荐模块内容
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateItem relate_item = 2;</code>
   */
  bilibili.app.view.v1.RelateItemOrBuilder getRelateItemOrBuilder(
      int index);

  /**
   * <pre>
   * AI相关推荐
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate ai_relate_item = 3;</code>
   */
  java.util.List<bilibili.app.view.v1.Relate> 
      getAiRelateItemList();
  /**
   * <pre>
   * AI相关推荐
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate ai_relate_item = 3;</code>
   */
  bilibili.app.view.v1.Relate getAiRelateItem(int index);
  /**
   * <pre>
   * AI相关推荐
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate ai_relate_item = 3;</code>
   */
  int getAiRelateItemCount();
  /**
   * <pre>
   * AI相关推荐
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate ai_relate_item = 3;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.RelateOrBuilder> 
      getAiRelateItemOrBuilderList();
  /**
   * <pre>
   * AI相关推荐
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate ai_relate_item = 3;</code>
   */
  bilibili.app.view.v1.RelateOrBuilder getAiRelateItemOrBuilder(
      int index);
}
