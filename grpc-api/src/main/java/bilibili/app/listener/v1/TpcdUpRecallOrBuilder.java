// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface TpcdUpRecallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.TpcdUpRecall)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 up_mid = 1;</code>
   * @return The upMid.
   */
  long getUpMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 3;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 3;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medialist_type = 4;</code>
   * @return The medialistType.
   */
  long getMedialistType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medialist_biz_id = 5;</code>
   * @return The medialistBizId.
   */
  long getMedialistBizId();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 6;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 6;</code>
   * @return The item.
   */
  bilibili.app.listener.v1.DetailItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 6;</code>
   */
  bilibili.app.listener.v1.DetailItemOrBuilder getItemOrBuilder();
}