// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface SubtitleItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.SubtitleItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string lan = 2;</code>
   * @return The lan.
   */
  java.lang.String getLan();
  /**
   * <pre>
   * </pre>
   *
   * <code>string lan = 2;</code>
   * @return The bytes for lan.
   */
  com.google.protobuf.ByteString
      getLanBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string lan_doc = 3;</code>
   * @return The lanDoc.
   */
  java.lang.String getLanDoc();
  /**
   * <pre>
   * </pre>
   *
   * <code>string lan_doc = 3;</code>
   * @return The bytes for lanDoc.
   */
  com.google.protobuf.ByteString
      getLanDocBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_lock = 4;</code>
   * @return The isLock.
   */
  boolean getIsLock();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 author_mid = 5;</code>
   * @return The authorMid.
   */
  long getAuthorMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle_url = 6;</code>
   * @return The subtitleUrl.
   */
  java.lang.String getSubtitleUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle_url = 6;</code>
   * @return The bytes for subtitleUrl.
   */
  com.google.protobuf.ByteString
      getSubtitleUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccInfo author = 7;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccInfo author = 7;</code>
   * @return The author.
   */
  bilibili.web.interfaces.v1.AccInfo getAuthor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.AccInfo author = 7;</code>
   */
  bilibili.web.interfaces.v1.AccInfoOrBuilder getAuthorOrBuilder();
}
