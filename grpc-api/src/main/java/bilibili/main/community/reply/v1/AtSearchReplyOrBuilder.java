// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface AtSearchReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.AtSearchReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 评论at用户搜索组
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.AtGroup groups = 1;</code>
   */
  java.util.List<bilibili.main.community.reply.v1.AtGroup> 
      getGroupsList();
  /**
   * <pre>
   * 评论at用户搜索组
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.AtGroup groups = 1;</code>
   */
  bilibili.main.community.reply.v1.AtGroup getGroups(int index);
  /**
   * <pre>
   * 评论at用户搜索组
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.AtGroup groups = 1;</code>
   */
  int getGroupsCount();
  /**
   * <pre>
   * 评论at用户搜索组
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.AtGroup groups = 1;</code>
   */
  java.util.List<? extends bilibili.main.community.reply.v1.AtGroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <pre>
   * 评论at用户搜索组
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.AtGroup groups = 1;</code>
   */
  bilibili.main.community.reply.v1.AtGroupOrBuilder getGroupsOrBuilder(
      int index);
}