// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

public interface ToastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.playershared.Toast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * toast文案
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * toast文案
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * toast按钮
   * </pre>
   *
   * <code>.bilibili.playershared.Button button = 2;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * toast按钮
   * </pre>
   *
   * <code>.bilibili.playershared.Button button = 2;</code>
   * @return The button.
   */
  bilibili.playershared.Button getButton();
  /**
   * <pre>
   * toast按钮
   * </pre>
   *
   * <code>.bilibili.playershared.Button button = 2;</code>
   */
  bilibili.playershared.ButtonOrBuilder getButtonOrBuilder();
}