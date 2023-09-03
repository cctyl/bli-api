// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/common.proto

package bilibili.app.card.v1;

public interface ThreePointV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.ThreePointV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle = 2;</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string subtitle = 2;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.DislikeReason reasons = 3;</code>
   */
  java.util.List<bilibili.app.card.v1.DislikeReason> 
      getReasonsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.DislikeReason reasons = 3;</code>
   */
  bilibili.app.card.v1.DislikeReason getReasons(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.DislikeReason reasons = 3;</code>
   */
  int getReasonsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.DislikeReason reasons = 3;</code>
   */
  java.util.List<? extends bilibili.app.card.v1.DislikeReasonOrBuilder> 
      getReasonsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.DislikeReason reasons = 3;</code>
   */
  bilibili.app.card.v1.DislikeReasonOrBuilder getReasonsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 5;</code>
   * @return The id.
   */
  long getId();
}
