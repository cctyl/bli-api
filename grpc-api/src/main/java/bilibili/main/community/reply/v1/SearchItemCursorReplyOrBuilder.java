// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface SearchItemCursorReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.SearchItemCursorReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否有下一页
   * </pre>
   *
   * <code>bool has_next = 1;</code>
   * @return The hasNext.
   */
  boolean getHasNext();

  /**
   * <pre>
   * 下页
   * </pre>
   *
   * <code>int64 next = 2;</code>
   * @return The next.
   */
  long getNext();
}
