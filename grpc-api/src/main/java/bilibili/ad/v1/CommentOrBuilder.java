// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface CommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.Comment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 game_base_id = 1;</code>
   * @return The gameBaseId.
   */
  long getGameBaseId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string user_name = 2;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_name = 2;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string user_face = 3;</code>
   * @return The userFace.
   */
  java.lang.String getUserFace();
  /**
   * <pre>
   * </pre>
   *
   * <code>string user_face = 3;</code>
   * @return The bytes for userFace.
   */
  com.google.protobuf.ByteString
      getUserFaceBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 user_level = 4;</code>
   * @return The userLevel.
   */
  int getUserLevel();

  /**
   * <pre>
   * </pre>
   *
   * <code>string comment_no = 5;</code>
   * @return The commentNo.
   */
  java.lang.String getCommentNo();
  /**
   * <pre>
   * </pre>
   *
   * <code>string comment_no = 5;</code>
   * @return The bytes for commentNo.
   */
  com.google.protobuf.ByteString
      getCommentNoBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 grade = 6;</code>
   * @return The grade.
   */
  int getGrade();

  /**
   * <pre>
   * </pre>
   *
   * <code>string content = 7;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>string content = 7;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 up_count = 8;</code>
   * @return The upCount.
   */
  int getUpCount();
}
