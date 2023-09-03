// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/main/dm.proto

package bilibili.broadcast.message.main;

public interface DanmakuElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.main.DanmakuElem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕dmid
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 弹幕出现位置(单位为ms)
   * </pre>
   *
   * <code>int32 progress = 2;</code>
   * @return The progress.
   */
  int getProgress();

  /**
   * <pre>
   * 弹幕类型
   * </pre>
   *
   * <code>int32 mode = 3;</code>
   * @return The mode.
   */
  int getMode();

  /**
   * <pre>
   * 弹幕字号
   * </pre>
   *
   * <code>int32 fontsize = 4;</code>
   * @return The fontsize.
   */
  int getFontsize();

  /**
   * <pre>
   * 弹幕颜色
   * </pre>
   *
   * <code>uint32 color = 5;</code>
   * @return The color.
   */
  int getColor();

  /**
   * <pre>
   * 发送着mid hash
   * </pre>
   *
   * <code>string mid_hash = 6;</code>
   * @return The midHash.
   */
  java.lang.String getMidHash();
  /**
   * <pre>
   * 发送着mid hash
   * </pre>
   *
   * <code>string mid_hash = 6;</code>
   * @return The bytes for midHash.
   */
  com.google.protobuf.ByteString
      getMidHashBytes();

  /**
   * <pre>
   * 弹幕正文
   * </pre>
   *
   * <code>string content = 7;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * 弹幕正文
   * </pre>
   *
   * <code>string content = 7;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * 发送时间
   * </pre>
   *
   * <code>int64 ctime = 8;</code>
   * @return The ctime.
   */
  long getCtime();

  /**
   * <pre>
   * 弹幕动作
   * </pre>
   *
   * <code>string action = 9;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * 弹幕动作
   * </pre>
   *
   * <code>string action = 9;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * 弹幕池
   * </pre>
   *
   * <code>int32 pool = 10;</code>
   * @return The pool.
   */
  int getPool();

  /**
   * <pre>
   * 弹幕id str
   * </pre>
   *
   * <code>string id_str = 11;</code>
   * @return The idStr.
   */
  java.lang.String getIdStr();
  /**
   * <pre>
   * 弹幕id str
   * </pre>
   *
   * <code>string id_str = 11;</code>
   * @return The bytes for idStr.
   */
  com.google.protobuf.ByteString
      getIdStrBytes();
}