// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface CardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.Card)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   * @return Whether the card field is set.
   */
  boolean hasCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   * @return The card.
   */
  bilibili.web.interfaces.v1.AccountCard getCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccountCard card = 1;</code>
   */
  bilibili.web.interfaces.v1.AccountCardOrBuilder getCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   * @return Whether the space field is set.
   */
  boolean hasSpace();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   * @return The space.
   */
  bilibili.web.interfaces.v1.Space getSpace();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Space space = 2;</code>
   */
  bilibili.web.interfaces.v1.SpaceOrBuilder getSpaceOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool following = 3;</code>
   * @return The following.
   */
  boolean getFollowing();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 archive_count = 4;</code>
   * @return The archiveCount.
   */
  long getArchiveCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 article_count = 5;</code>
   * @return The articleCount.
   */
  int getArticleCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 follower = 6;</code>
   * @return The follower.
   */
  long getFollower();
}
