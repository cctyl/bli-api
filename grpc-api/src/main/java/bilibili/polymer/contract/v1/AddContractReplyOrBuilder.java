// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/contract/v1/contract.proto

package bilibili.polymer.contract.v1;

public interface AddContractReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.contract.v1.AddContractReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>bool allow_message = 1;</code>
   * @return The allowMessage.
   */
  boolean getAllowMessage();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool allow_reply = 2;</code>
   * @return The allowReply.
   */
  boolean getAllowReply();

  /**
   * <pre>
   * </pre>
   *
   * <code>string input_text = 3;</code>
   * @return The inputText.
   */
  java.lang.String getInputText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_text = 3;</code>
   * @return The bytes for inputText.
   */
  com.google.protobuf.ByteString
      getInputTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string input_title = 4;</code>
   * @return The inputTitle.
   */
  java.lang.String getInputTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string input_title = 4;</code>
   * @return The bytes for inputTitle.
   */
  com.google.protobuf.ByteString
      getInputTitleBytes();
}
