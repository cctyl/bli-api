// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface ShareOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.Share)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Video video = 2;</code>
   * @return Whether the video field is set.
   */
  boolean hasVideo();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Video video = 2;</code>
   * @return The video.
   */
  bilibili.polymer.app.search.v1.Video getVideo();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Video video = 2;</code>
   */
  bilibili.polymer.app.search.v1.VideoOrBuilder getVideoOrBuilder();
}
