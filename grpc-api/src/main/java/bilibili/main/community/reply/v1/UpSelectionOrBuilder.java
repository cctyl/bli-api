// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface UpSelectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.UpSelection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 待审评论数
   * </pre>
   *
   * <code>int64 pending_count = 1;</code>
   * @return The pendingCount.
   */
  long getPendingCount();

  /**
   * <pre>
   * 忽略评论数
   * </pre>
   *
   * <code>int64 ignore_count = 2;</code>
   * @return The ignoreCount.
   */
  long getIgnoreCount();
}
