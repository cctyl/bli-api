// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface QoeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.QoeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 style = 3;</code>
   * @return The style.
   */
  int getStyle();

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string feedback_title = 5;</code>
   * @return The feedbackTitle.
   */
  java.lang.String getFeedbackTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string feedback_title = 5;</code>
   * @return The bytes for feedbackTitle.
   */
  com.google.protobuf.ByteString
      getFeedbackTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.QoeScoreItem score_items = 6;</code>
   */
  java.util.List<bilibili.main.community.reply.v1.QoeScoreItem> 
      getScoreItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.QoeScoreItem score_items = 6;</code>
   */
  bilibili.main.community.reply.v1.QoeScoreItem getScoreItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.QoeScoreItem score_items = 6;</code>
   */
  int getScoreItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.QoeScoreItem score_items = 6;</code>
   */
  java.util.List<? extends bilibili.main.community.reply.v1.QoeScoreItemOrBuilder> 
      getScoreItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.QoeScoreItem score_items = 6;</code>
   */
  bilibili.main.community.reply.v1.QoeScoreItemOrBuilder getScoreItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 display_rank = 7;</code>
   * @return The displayRank.
   */
  long getDisplayRank();
}