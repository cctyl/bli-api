// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

public interface CardArticleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.CardArticle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>repeated string covers = 1;</code>
   * @return A list containing the covers.
   */
  java.util.List<java.lang.String>
      getCoversList();
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>repeated string covers = 1;</code>
   * @return The count of covers.
   */
  int getCoversCount();
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>repeated string covers = 1;</code>
   * @param index The index of the element to return.
   * @return The covers at the given index.
   */
  java.lang.String getCovers(int index);
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>repeated string covers = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the covers at the given index.
   */
  com.google.protobuf.ByteString
      getCoversBytes(int index);

  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * UP主mid
   * </pre>
   *
   * <code>int64 mid = 3;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 是否展示关注按钮
   * </pre>
   *
   * <code>bool displayAttention = 4;</code>
   * @return The displayAttention.
   */
  boolean getDisplayAttention();

  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>string badge = 5;</code>
   * @return The badge.
   */
  java.lang.String getBadge();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>string badge = 5;</code>
   * @return The bytes for badge.
   */
  com.google.protobuf.ByteString
      getBadgeBytes();

  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Relation relation = 6;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Relation relation = 6;</code>
   * @return The relation.
   */
  bilibili.app.interface.v1.Relation getRelation();
  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Relation relation = 6;</code>
   */
  bilibili.app.interface.v1.RelationOrBuilder getRelationOrBuilder();
}
