// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/space.proto

package bilibili.app.interface.v1;

public interface ArcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.Arc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc archive = 1;</code>
   * @return Whether the archive field is set.
   */
  boolean hasArchive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc archive = 1;</code>
   * @return The archive.
   */
  bilibili.app.archive.v1.Arc getArchive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc archive = 1;</code>
   */
  bilibili.app.archive.v1.ArcOrBuilder getArchiveOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}