// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface CmIpadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.CmIpad)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   * @return Whether the cm field is set.
   */
  boolean hasCm();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   * @return The cm.
   */
  bilibili.app.view.v1.CM getCm();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CM cm = 1;</code>
   */
  bilibili.app.view.v1.CMOrBuilder getCmOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   * @return The author.
   */
  bilibili.app.archive.v1.Author getAuthor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Author author = 2;</code>
   */
  bilibili.app.archive.v1.AuthorOrBuilder getAuthorOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   * @return Whether the stat field is set.
   */
  boolean hasStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   * @return The stat.
   */
  bilibili.app.archive.v1.Stat getStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Stat stat = 3;</code>
   */
  bilibili.app.archive.v1.StatOrBuilder getStatOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 duration = 4;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 aid = 5;</code>
   * @return The aid.
   */
  long getAid();
}
