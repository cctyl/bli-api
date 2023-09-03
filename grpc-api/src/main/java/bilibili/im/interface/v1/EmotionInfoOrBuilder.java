// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface EmotionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.EmotionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 表情
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 表情
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 表情url
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * 表情url
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * 表情大小
   * 0:未知 1:min 2:max
   * </pre>
   *
   * <code>int32 size = 3;</code>
   * @return The size.
   */
  int getSize();

  /**
   * <pre>
   * gif url
   * </pre>
   *
   * <code>string gif_url = 4;</code>
   * @return The gifUrl.
   */
  java.lang.String getGifUrl();
  /**
   * <pre>
   * gif url
   * </pre>
   *
   * <code>string gif_url = 4;</code>
   * @return The bytes for gifUrl.
   */
  com.google.protobuf.ByteString
      getGifUrlBytes();
}