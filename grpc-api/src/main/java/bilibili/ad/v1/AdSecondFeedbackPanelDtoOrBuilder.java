// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface AdSecondFeedbackPanelDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.AdSecondFeedbackPanelDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 屏蔽理由id
   * </pre>
   *
   * <code>int32 reason_id = 1;</code>
   * @return The reasonId.
   */
  int getReasonId();

  /**
   * <pre>
   * 理由文案
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 理由文案
   * </pre>
   *
   * <code>string text = 2;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}