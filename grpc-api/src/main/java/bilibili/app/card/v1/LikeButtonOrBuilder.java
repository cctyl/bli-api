// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/common.proto

package bilibili.app.card.v1;

public interface LikeButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.LikeButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 Aid = 1;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool show_count = 3;</code>
   * @return The showCount.
   */
  boolean getShowCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>string event = 4;</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <pre>
   * </pre>
   *
   * <code>string event = 4;</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 selected = 5;</code>
   * @return The selected.
   */
  int getSelected();

  /**
   * <pre>
   * </pre>
   *
   * <code>string event_v2 = 6;</code>
   * @return The eventV2.
   */
  java.lang.String getEventV2();
  /**
   * <pre>
   * </pre>
   *
   * <code>string event_v2 = 6;</code>
   * @return The bytes for eventV2.
   */
  com.google.protobuf.ByteString
      getEventV2Bytes();
}
