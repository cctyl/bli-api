// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface TpcdPickTodayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.TpcdPickToday)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 1;</code>
   * @return The item.
   */
  bilibili.app.listener.v1.DetailItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.DetailItem item = 1;</code>
   */
  bilibili.app.listener.v1.DetailItemOrBuilder getItemOrBuilder();

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
   * <code>string pic = 3;</code>
   * @return The pic.
   */
  java.lang.String getPic();
  /**
   * <pre>
   * </pre>
   *
   * <code>string pic = 3;</code>
   * @return The bytes for pic.
   */
  com.google.protobuf.ByteString
      getPicBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pick_id = 4;</code>
   * @return The pickId.
   */
  long getPickId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pick_card_id = 5;</code>
   * @return The pickCardId.
   */
  long getPickCardId();
}
