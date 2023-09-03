// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface RspSessionMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.RspSessionMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.im.type.Msg messages = 1;</code>
   */
  java.util.List<bilibili.im.type.Msg> 
      getMessagesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.im.type.Msg messages = 1;</code>
   */
  bilibili.im.type.Msg getMessages(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.im.type.Msg messages = 1;</code>
   */
  int getMessagesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.im.type.Msg messages = 1;</code>
   */
  java.util.List<? extends bilibili.im.type.MsgOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.im.type.Msg messages = 1;</code>
   */
  bilibili.im.type.MsgOrBuilder getMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 has_more = 2;</code>
   * @return The hasMore.
   */
  int getHasMore();

  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 min_seqno = 3;</code>
   * @return The minSeqno.
   */
  long getMinSeqno();

  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 max_seqno = 4;</code>
   * @return The maxSeqno.
   */
  long getMaxSeqno();

  /**
   * <pre>
   * 表情资源信息
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.EmotionInfo e_infos = 5;</code>
   */
  java.util.List<bilibili.im.interface.v1.EmotionInfo> 
      getEInfosList();
  /**
   * <pre>
   * 表情资源信息
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.EmotionInfo e_infos = 5;</code>
   */
  bilibili.im.interface.v1.EmotionInfo getEInfos(int index);
  /**
   * <pre>
   * 表情资源信息
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.EmotionInfo e_infos = 5;</code>
   */
  int getEInfosCount();
  /**
   * <pre>
   * 表情资源信息
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.EmotionInfo e_infos = 5;</code>
   */
  java.util.List<? extends bilibili.im.interface.v1.EmotionInfoOrBuilder> 
      getEInfosOrBuilderList();
  /**
   * <pre>
   * 表情资源信息
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.EmotionInfo e_infos = 5;</code>
   */
  bilibili.im.interface.v1.EmotionInfoOrBuilder getEInfosOrBuilder(
      int index);
}
