// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface MsgFeedUnreadRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.MsgFeedUnreadRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; unread = 1;</code>
   */
  int getUnreadCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; unread = 1;</code>
   */
  boolean containsUnread(
      java.lang.String key);
  /**
   * Use {@link #getUnreadMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getUnread();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; unread = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getUnreadMap();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; unread = 1;</code>
   */
  long getUnreadOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; unread = 1;</code>
   */
  long getUnreadOrThrow(
      java.lang.String key);
}