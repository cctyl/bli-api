// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/archive/v1/archive.proto

package bilibili.app.archive.v1;

public interface AuthorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.archive.v1.Author)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * UP主mid
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

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
   * UP主头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * UP主头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();
}
