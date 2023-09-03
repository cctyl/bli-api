// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

public interface DmSegMobileReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.tv.interfaces.dm.v1.DmSegMobileReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmakuElem elems = 1;</code>
   */
  java.util.List<bilibili.tv.interfaces.dm.v1.DanmakuElem> 
      getElemsList();
  /**
   * <pre>
   * 弹幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmakuElem elems = 1;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmakuElem getElems(int index);
  /**
   * <pre>
   * 弹幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmakuElem elems = 1;</code>
   */
  int getElemsCount();
  /**
   * <pre>
   * 弹幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmakuElem elems = 1;</code>
   */
  java.util.List<? extends bilibili.tv.interfaces.dm.v1.DanmakuElemOrBuilder> 
      getElemsOrBuilderList();
  /**
   * <pre>
   * 弹幕列表
   * </pre>
   *
   * <code>repeated .bilibili.tv.interfaces.dm.v1.DanmakuElem elems = 1;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmakuElemOrBuilder getElemsOrBuilder(
      int index);

  /**
   * <pre>
   * 是否已关闭弹幕
   * 0:未关闭 1:已关闭
   * </pre>
   *
   * <code>int32 state = 2;</code>
   * @return The state.
   */
  int getState();

  /**
   * <pre>
   * 弹幕云屏蔽ai评分值
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmakuAIFlag ai_flag = 3;</code>
   * @return Whether the aiFlag field is set.
   */
  boolean hasAiFlag();
  /**
   * <pre>
   * 弹幕云屏蔽ai评分值
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmakuAIFlag ai_flag = 3;</code>
   * @return The aiFlag.
   */
  bilibili.tv.interfaces.dm.v1.DanmakuAIFlag getAiFlag();
  /**
   * <pre>
   * 弹幕云屏蔽ai评分值
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.DanmakuAIFlag ai_flag = 3;</code>
   */
  bilibili.tv.interfaces.dm.v1.DanmakuAIFlagOrBuilder getAiFlagOrBuilder();
}