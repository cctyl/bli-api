// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/topic/v1/topic.proto

package bilibili.app.topic.v1;

public interface PubLayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.topic.v1.PubLayer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 show_type = 1;</code>
   * @return The showType.
   */
  int getShowType();

  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 2;</code>
   * @return The jumpLink.
   */
  java.lang.String getJumpLink();
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_link = 2;</code>
   * @return The bytes for jumpLink.
   */
  com.google.protobuf.ByteString
      getJumpLinkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.ButtonMeta button_meta = 3;</code>
   * @return Whether the buttonMeta field is set.
   */
  boolean hasButtonMeta();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.ButtonMeta button_meta = 3;</code>
   * @return The buttonMeta.
   */
  bilibili.app.topic.v1.ButtonMeta getButtonMeta();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.topic.v1.ButtonMeta button_meta = 3;</code>
   */
  bilibili.app.topic.v1.ButtonMetaOrBuilder getButtonMetaOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool close_pub_layer_entry = 4;</code>
   * @return The closePubLayerEntry.
   */
  boolean getClosePubLayerEntry();
}
