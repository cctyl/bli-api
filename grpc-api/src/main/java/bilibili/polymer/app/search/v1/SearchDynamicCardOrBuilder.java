// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface SearchDynamicCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.SearchDynamicCard)
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
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cover_count = 3;</code>
   * @return The coverCount.
   */
  int getCoverCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 4;</code>
   * @return A list containing the covers.
   */
  java.util.List<java.lang.String>
      getCoversList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 4;</code>
   * @return The count of covers.
   */
  int getCoversCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 4;</code>
   * @param index The index of the element to return.
   * @return The covers at the given index.
   */
  java.lang.String getCovers(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string covers = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the covers at the given index.
   */
  com.google.protobuf.ByteString
      getCoversBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Upper upper = 5;</code>
   * @return Whether the upper field is set.
   */
  boolean hasUpper();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Upper upper = 5;</code>
   * @return The upper.
   */
  bilibili.polymer.app.search.v1.Upper getUpper();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Upper upper = 5;</code>
   */
  bilibili.polymer.app.search.v1.UpperOrBuilder getUpperOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Stat stat = 6;</code>
   * @return Whether the stat field is set.
   */
  boolean hasStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Stat stat = 6;</code>
   * @return The stat.
   */
  bilibili.polymer.app.search.v1.Stat getStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Stat stat = 6;</code>
   */
  bilibili.polymer.app.search.v1.StatOrBuilder getStatOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DyTopic dy_topic = 7;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.DyTopic> 
      getDyTopicList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DyTopic dy_topic = 7;</code>
   */
  bilibili.polymer.app.search.v1.DyTopic getDyTopic(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DyTopic dy_topic = 7;</code>
   */
  int getDyTopicCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DyTopic dy_topic = 7;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.DyTopicOrBuilder> 
      getDyTopicOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.DyTopic dy_topic = 7;</code>
   */
  bilibili.polymer.app.search.v1.DyTopicOrBuilder getDyTopicOrBuilder(
      int index);
}
