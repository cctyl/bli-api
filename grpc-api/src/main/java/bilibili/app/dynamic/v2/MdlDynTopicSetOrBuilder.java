// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface MdlDynTopicSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.MdlDynTopicSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem topics = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.TopicItem> 
      getTopicsList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem topics = 1;</code>
   */
  bilibili.app.dynamic.v2.TopicItem getTopics(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem topics = 1;</code>
   */
  int getTopicsCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem topics = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.TopicItemOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.TopicItem topics = 1;</code>
   */
  bilibili.app.dynamic.v2.TopicItemOrBuilder getTopicsOrBuilder(
      int index);

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconButton more_btn = 2;</code>
   * @return Whether the moreBtn field is set.
   */
  boolean hasMoreBtn();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconButton more_btn = 2;</code>
   * @return The moreBtn.
   */
  bilibili.app.dynamic.v2.IconButton getMoreBtn();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.IconButton more_btn = 2;</code>
   */
  bilibili.app.dynamic.v2.IconButtonOrBuilder getMoreBtnOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 topic_set_id = 3;</code>
   * @return The topicSetId.
   */
  long getTopicSetId();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 push_id = 4;</code>
   * @return The pushId.
   */
  long getPushId();
}
