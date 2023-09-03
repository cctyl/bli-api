// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface CommandDmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.CommandDm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 对象视频cid
   * </pre>
   *
   * <code>int64 oid = 2;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * 发送者mid
   * </pre>
   *
   * <code>int64 mid = 3;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 互动弹幕指令
   * </pre>
   *
   * <code>string command = 4;</code>
   * @return The command.
   */
  java.lang.String getCommand();
  /**
   * <pre>
   * 互动弹幕指令
   * </pre>
   *
   * <code>string command = 4;</code>
   * @return The bytes for command.
   */
  com.google.protobuf.ByteString
      getCommandBytes();

  /**
   * <pre>
   * 互动弹幕正文
   * </pre>
   *
   * <code>string content = 5;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * 互动弹幕正文
   * </pre>
   *
   * <code>string content = 5;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * 出现时间
   * </pre>
   *
   * <code>int32 progress = 6;</code>
   * @return The progress.
   */
  int getProgress();

  /**
   * <pre>
   * 创建时间
   * </pre>
   *
   * <code>string ctime = 7;</code>
   * @return The ctime.
   */
  java.lang.String getCtime();
  /**
   * <pre>
   * 创建时间
   * </pre>
   *
   * <code>string ctime = 7;</code>
   * @return The bytes for ctime.
   */
  com.google.protobuf.ByteString
      getCtimeBytes();

  /**
   * <pre>
   * 发布时间
   * </pre>
   *
   * <code>string mtime = 8;</code>
   * @return The mtime.
   */
  java.lang.String getMtime();
  /**
   * <pre>
   * 发布时间
   * </pre>
   *
   * <code>string mtime = 8;</code>
   * @return The bytes for mtime.
   */
  com.google.protobuf.ByteString
      getMtimeBytes();

  /**
   * <pre>
   * 扩展json数据
   * </pre>
   *
   * <code>string extra = 9;</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <pre>
   * 扩展json数据
   * </pre>
   *
   * <code>string extra = 9;</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();

  /**
   * <pre>
   * 弹幕id str类型
   * </pre>
   *
   * <code>string id_str = 10;</code>
   * @return The idStr.
   */
  java.lang.String getIdStr();
  /**
   * <pre>
   * 弹幕id str类型
   * </pre>
   *
   * <code>string id_str = 10;</code>
   * @return The bytes for idStr.
   */
  com.google.protobuf.ByteString
      getIdStrBytes();
}