// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface TopicSquareInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.TopicSquareInfo)
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
   * <code>.bilibili.app.dynamic.v2.CampusLabel button = 2;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel button = 2;</code>
   * @return The button.
   */
  bilibili.app.dynamic.v2.CampusLabel getButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusLabel button = 2;</code>
   */
  bilibili.app.dynamic.v2.CampusLabelOrBuilder getButtonOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.TopicRcmdCard rcmd = 3;</code>
   * @return Whether the rcmd field is set.
   */
  boolean hasRcmd();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.TopicRcmdCard rcmd = 3;</code>
   * @return The rcmd.
   */
  bilibili.app.dynamic.v2.TopicRcmdCard getRcmd();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.TopicRcmdCard rcmd = 3;</code>
   */
  bilibili.app.dynamic.v2.TopicRcmdCardOrBuilder getRcmdOrBuilder();
}
