// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface OperationRelateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.OperationRelate)
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
   * <code>repeated .bilibili.web.interfaces.v1.RelateItem relate_item = 2;</code>
   */
  java.util.List<bilibili.web.interfaces.v1.RelateItem> 
      getRelateItemList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.RelateItem relate_item = 2;</code>
   */
  bilibili.web.interfaces.v1.RelateItem getRelateItem(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.RelateItem relate_item = 2;</code>
   */
  int getRelateItemCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.RelateItem relate_item = 2;</code>
   */
  java.util.List<? extends bilibili.web.interfaces.v1.RelateItemOrBuilder> 
      getRelateItemOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.RelateItem relate_item = 2;</code>
   */
  bilibili.web.interfaces.v1.RelateItemOrBuilder getRelateItemOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.Relate ai_relate_item = 3;</code>
   */
  java.util.List<bilibili.web.interfaces.v1.Relate> 
      getAiRelateItemList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.Relate ai_relate_item = 3;</code>
   */
  bilibili.web.interfaces.v1.Relate getAiRelateItem(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.Relate ai_relate_item = 3;</code>
   */
  int getAiRelateItemCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.Relate ai_relate_item = 3;</code>
   */
  java.util.List<? extends bilibili.web.interfaces.v1.RelateOrBuilder> 
      getAiRelateItemOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.Relate ai_relate_item = 3;</code>
   */
  bilibili.web.interfaces.v1.RelateOrBuilder getAiRelateItemOrBuilder(
      int index);
}