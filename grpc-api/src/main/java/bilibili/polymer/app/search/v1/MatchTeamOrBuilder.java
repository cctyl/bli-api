// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface MatchTeamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.MatchTeam)
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
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 score = 4;</code>
   * @return The score.
   */
  int getScore();
}
