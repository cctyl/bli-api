// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface ShareInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.ShareInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 稿件avid
   * </pre>
   *
   * <code>int64 aid = 1;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * 稿件bvid
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bvid.
   */
  java.lang.String getBvid();
  /**
   * <pre>
   * 稿件bvid
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bytes for bvid.
   */
  com.google.protobuf.ByteString
      getBvidBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * 稿件封面
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 稿件封面
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * up mid
   * </pre>
   *
   * <code>int64 mid = 6;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * up昵称
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * up昵称
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
