// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

public interface RelationLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.type.RelationLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 操作类型
   * </pre>
   *
   * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
   * @return The enum numeric value on the wire for logType.
   */
  int getLogTypeValue();
  /**
   * <pre>
   * 操作类型
   * </pre>
   *
   * <code>.bilibili.im.type.RelationLogType log_type = 1;</code>
   * @return The logType.
   */
  bilibili.im.type.RelationLogType getLogType();

  /**
   * <pre>
   * 操作seqno
   * </pre>
   *
   * <code>uint64 oplog_seqno = 2;</code>
   * @return The oplogSeqno.
   */
  long getOplogSeqno();

  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   * @return Whether the friendRelation field is set.
   */
  boolean hasFriendRelation();
  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   * @return The friendRelation.
   */
  bilibili.im.type.FriendRelation getFriendRelation();
  /**
   * <pre>
   * 好友信息
   * </pre>
   *
   * <code>.bilibili.im.type.FriendRelation friend_relation = 3;</code>
   */
  bilibili.im.type.FriendRelationOrBuilder getFriendRelationOrBuilder();

  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   * @return Whether the groupRelation field is set.
   */
  boolean hasGroupRelation();
  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   * @return The groupRelation.
   */
  bilibili.im.type.GroupRelation getGroupRelation();
  /**
   * <pre>
   * 群信息
   * </pre>
   *
   * <code>.bilibili.im.type.GroupRelation group_relation = 4;</code>
   */
  bilibili.im.type.GroupRelationOrBuilder getGroupRelationOrBuilder();
}