// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface LivePendantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.LivePendant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pendant_id = 3;</code>
   * @return The pendantId.
   */
  long getPendantId();
}