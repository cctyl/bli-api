// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface TopicDetailsFoldReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.TopicDetailsFoldReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TopicCardList topic_card_list = 1;</code>
   * @return Whether the topicCardList field is set.
   */
  boolean hasTopicCardList();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TopicCardList topic_card_list = 1;</code>
   * @return The topicCardList.
   */
  bilibili.app.topic.v1.TopicCardList getTopicCardList();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.TopicCardList topic_card_list = 1;</code>
   */
  bilibili.app.topic.v1.TopicCardListOrBuilder getTopicCardListOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 fold_count = 2;</code>
   * @return The foldCount.
   */
  long getFoldCount();
}
