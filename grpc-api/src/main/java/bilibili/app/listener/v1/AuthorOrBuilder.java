// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface AuthorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.Author)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 3;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 3;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FollowRelation relation = 4;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FollowRelation relation = 4;</code>
   * @return The relation.
   */
  bilibili.app.listener.v1.FollowRelation getRelation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FollowRelation relation = 4;</code>
   */
  bilibili.app.listener.v1.FollowRelationOrBuilder getRelationOrBuilder();
}