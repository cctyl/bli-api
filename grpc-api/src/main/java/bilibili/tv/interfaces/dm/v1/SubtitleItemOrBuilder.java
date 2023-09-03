// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/tv/interfaces/dm/v1/dm.proto

package bilibili.tv.interfaces.dm.v1;

public interface SubtitleItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.tv.interfaces.dm.v1.SubtitleItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 字幕id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 字幕id str
   * </pre>
   *
   * <code>string id_str = 2;</code>
   * @return The idStr.
   */
  java.lang.String getIdStr();
  /**
   * <pre>
   * 字幕id str
   * </pre>
   *
   * <code>string id_str = 2;</code>
   * @return The bytes for idStr.
   */
  com.google.protobuf.ByteString
      getIdStrBytes();

  /**
   * <pre>
   * 字幕语言代码
   * </pre>
   *
   * <code>string lan = 3;</code>
   * @return The lan.
   */
  java.lang.String getLan();
  /**
   * <pre>
   * 字幕语言代码
   * </pre>
   *
   * <code>string lan = 3;</code>
   * @return The bytes for lan.
   */
  com.google.protobuf.ByteString
      getLanBytes();

  /**
   * <pre>
   * 字幕语言
   * </pre>
   *
   * <code>string lan_doc = 4;</code>
   * @return The lanDoc.
   */
  java.lang.String getLanDoc();
  /**
   * <pre>
   * 字幕语言
   * </pre>
   *
   * <code>string lan_doc = 4;</code>
   * @return The bytes for lanDoc.
   */
  com.google.protobuf.ByteString
      getLanDocBytes();

  /**
   * <pre>
   * 字幕文件url
   * </pre>
   *
   * <code>string subtitle_url = 5;</code>
   * @return The subtitleUrl.
   */
  java.lang.String getSubtitleUrl();
  /**
   * <pre>
   * 字幕文件url
   * </pre>
   *
   * <code>string subtitle_url = 5;</code>
   * @return The bytes for subtitleUrl.
   */
  com.google.protobuf.ByteString
      getSubtitleUrlBytes();

  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   * @return The author.
   */
  bilibili.tv.interfaces.dm.v1.UserInfo getAuthor();
  /**
   * <pre>
   * 字幕作者信息
   * </pre>
   *
   * <code>.bilibili.tv.interfaces.dm.v1.UserInfo author = 6;</code>
   */
  bilibili.tv.interfaces.dm.v1.UserInfoOrBuilder getAuthorOrBuilder();
}