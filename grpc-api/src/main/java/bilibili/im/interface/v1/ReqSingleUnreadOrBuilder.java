// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface ReqSingleUnreadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.ReqSingleUnread)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 unread_type = 1;</code>
   * @return The unreadType.
   */
  int getUnreadType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 show_unfollow_list = 2;</code>
   * @return The showUnfollowList.
   */
  int getShowUnfollowList();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 uid = 3;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 show_dustbin = 4;</code>
   * @return The showDustbin.
   */
  int getShowDustbin();
}
