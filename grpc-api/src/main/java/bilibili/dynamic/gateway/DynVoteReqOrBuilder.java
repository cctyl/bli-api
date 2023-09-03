// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface DynVoteReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.DynVoteReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 投票ID
   * </pre>
   *
   * <code>int64 vote_id = 1;</code>
   * @return The voteId.
   */
  long getVoteId();

  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @return A list containing the votes.
   */
  java.util.List<java.lang.Long> getVotesList();
  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @return The count of votes.
   */
  int getVotesCount();
  /**
   * <pre>
   * 选项索引数组
   * </pre>
   *
   * <code>repeated int64 votes = 2;</code>
   * @param index The index of the element to return.
   * @return The votes at the given index.
   */
  long getVotes(int index);

  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VoteStatus status = 3;</code>
   * @return The status.
   */
  bilibili.dynamic.gateway.VoteStatus getStatus();

  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 4;</code>
   * @return The dynamicId.
   */
  java.lang.String getDynamicId();
  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>string dynamic_id = 4;</code>
   * @return The bytes for dynamicId.
   */
  com.google.protobuf.ByteString
      getDynamicIdBytes();

  /**
   * <pre>
   * 是否分享
   * </pre>
   *
   * <code>bool share = 5;</code>
   * @return The share.
   */
  boolean getShare();
}
