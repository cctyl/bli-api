// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface LiveCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.LiveCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 has_live = 1;</code>
   * @return The hasLive.
   */
  int getHasLive();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveItem content = 2;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveItem content = 2;</code>
   * @return The content.
   */
  bilibili.app.nativeact.v1.LiveItem getContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveItem content = 2;</code>
   */
  bilibili.app.nativeact.v1.LiveItemOrBuilder getContentOrBuilder();
}
