// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ReserveButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ReserveButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReserveGoto goto = 1;</code>
   * @return The enum numeric value on the wire for goto.
   */
  int getGotoValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReserveGoto goto = 1;</code>
   * @return The goto.
   */
  bilibili.app.nativeact.v1.ReserveGoto getGoto();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.MessageBox message_box = 2;</code>
   * @return Whether the messageBox field is set.
   */
  boolean hasMessageBox();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.MessageBox message_box = 2;</code>
   * @return The messageBox.
   */
  bilibili.app.nativeact.v1.MessageBox getMessageBox();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.MessageBox message_box = 2;</code>
   */
  bilibili.app.nativeact.v1.MessageBoxOrBuilder getMessageBoxOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string reserve_params = 3;</code>
   * @return The reserveParams.
   */
  java.lang.String getReserveParams();
  /**
   * <pre>
   * </pre>
   *
   * <code>string reserve_params = 3;</code>
   * @return The bytes for reserveParams.
   */
  com.google.protobuf.ByteString
      getReserveParamsBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool has_done = 4;</code>
   * @return The hasDone.
   */
  boolean getHasDone();

  /**
   * <pre>
   * </pre>
   *
   * <code>string done_text = 5;</code>
   * @return The doneText.
   */
  java.lang.String getDoneText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string done_text = 5;</code>
   * @return The bytes for doneText.
   */
  com.google.protobuf.ByteString
      getDoneTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string undone_text = 6;</code>
   * @return The undoneText.
   */
  java.lang.String getUndoneText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string undone_text = 6;</code>
   * @return The bytes for undoneText.
   */
  com.google.protobuf.ByteString
      getUndoneTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_highlight = 8;</code>
   * @return The isHighlight.
   */
  boolean getIsHighlight();

  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 9;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 9;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
