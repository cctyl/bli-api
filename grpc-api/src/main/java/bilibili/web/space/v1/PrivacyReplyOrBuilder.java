// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/space/v1/space.proto

package bilibili.web.space.v1;

public interface PrivacyReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.space.v1.PrivacyReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; privacy = 1;</code>
   */
  int getPrivacyCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; privacy = 1;</code>
   */
  boolean containsPrivacy(
      java.lang.String key);
  /**
   * Use {@link #getPrivacyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getPrivacy();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; privacy = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getPrivacyMap();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; privacy = 1;</code>
   */
  long getPrivacyOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, int64&gt; privacy = 1;</code>
   */
  long getPrivacyOrThrow(
      java.lang.String key);
}