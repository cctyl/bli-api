// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface VideoMoreCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.VideoMoreCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

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

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   * @return Whether the subpageData field is set.
   */
  boolean hasSubpageData();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   * @return The subpageData.
   */
  bilibili.app.nativeact.v1.SubpageData getSubpageData();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SubpageData subpage_data = 3;</code>
   */
  bilibili.app.nativeact.v1.SubpageDataOrBuilder getSubpageDataOrBuilder();
}
