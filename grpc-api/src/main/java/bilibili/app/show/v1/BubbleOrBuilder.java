// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/popular/v1/popular.proto

package bilibili.app.show.v1;

public interface BubbleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.show.v1.Bubble)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string bubble_content = 1;</code>
   * @return The bubbleContent.
   */
  java.lang.String getBubbleContent();
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string bubble_content = 1;</code>
   * @return The bytes for bubbleContent.
   */
  com.google.protobuf.ByteString
      getBubbleContentBytes();

  /**
   * <pre>
   * 版本
   * </pre>
   *
   * <code>int32 version = 2;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * 起始时间
   * </pre>
   *
   * <code>int64 stime = 3;</code>
   * @return The stime.
   */
  long getStime();
}