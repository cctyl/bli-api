// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface RspSpecificSingleUnreadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.RspSpecificSingleUnread)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key -&gt; 用户uid, value -&gt;未读数
   * </pre>
   *
   * <code>map&lt;uint64, uint64&gt; talkerUnreadCnt = 1;</code>
   */
  int getTalkerUnreadCntCount();
  /**
   * <pre>
   * key -&gt; 用户uid, value -&gt;未读数
   * </pre>
   *
   * <code>map&lt;uint64, uint64&gt; talkerUnreadCnt = 1;</code>
   */
  boolean containsTalkerUnreadCnt(
      long key);
  /**
   * Use {@link #getTalkerUnreadCntMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.Long>
  getTalkerUnreadCnt();
  /**
   * <pre>
   * key -&gt; 用户uid, value -&gt;未读数
   * </pre>
   *
   * <code>map&lt;uint64, uint64&gt; talkerUnreadCnt = 1;</code>
   */
  java.util.Map<java.lang.Long, java.lang.Long>
  getTalkerUnreadCntMap();
  /**
   * <pre>
   * key -&gt; 用户uid, value -&gt;未读数
   * </pre>
   *
   * <code>map&lt;uint64, uint64&gt; talkerUnreadCnt = 1;</code>
   */
  long getTalkerUnreadCntOrDefault(
      long key,
      long defaultValue);
  /**
   * <pre>
   * key -&gt; 用户uid, value -&gt;未读数
   * </pre>
   *
   * <code>map&lt;uint64, uint64&gt; talkerUnreadCnt = 1;</code>
   */
  long getTalkerUnreadCntOrThrow(
      long key);

  /**
   * <pre>
   * 总未读数
   * </pre>
   *
   * <code>uint64 allUnreadCnt = 2;</code>
   * @return The allUnreadCnt.
   */
  long getAllUnreadCnt();
}