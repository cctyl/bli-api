// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface UGCVideoSearchItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.UGCVideoSearchItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string up_nickname = 2;</code>
   * @return The upNickname.
   */
  java.lang.String getUpNickname();
  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string up_nickname = 2;</code>
   * @return The bytes for upNickname.
   */
  com.google.protobuf.ByteString
      getUpNicknameBytes();

  /**
   * <pre>
   * 时长(单位为秒)
   * </pre>
   *
   * <code>int64 duration = 3;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 封面
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();
}
