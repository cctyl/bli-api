// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

public interface GetUidByNameRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.GetUidByNameRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * k:昵称 v:mid
   * </pre>
   *
   * <code>map&lt;string, int64&gt; uids = 1;</code>
   */
  int getUidsCount();
  /**
   * <pre>
   * k:昵称 v:mid
   * </pre>
   *
   * <code>map&lt;string, int64&gt; uids = 1;</code>
   */
  boolean containsUids(
      java.lang.String key);
  /**
   * Use {@link #getUidsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getUids();
  /**
   * <pre>
   * k:昵称 v:mid
   * </pre>
   *
   * <code>map&lt;string, int64&gt; uids = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getUidsMap();
  /**
   * <pre>
   * k:昵称 v:mid
   * </pre>
   *
   * <code>map&lt;string, int64&gt; uids = 1;</code>
   */
  long getUidsOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * k:昵称 v:mid
   * </pre>
   *
   * <code>map&lt;string, int64&gt; uids = 1;</code>
   */
  long getUidsOrThrow(
      java.lang.String key);
}