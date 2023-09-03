// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface SearchItemPreHookReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.SearchItemPreHookReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 输入框的文案
   * </pre>
   *
   * <code>string placeholder_text = 1;</code>
   * @return The placeholderText.
   */
  java.lang.String getPlaceholderText();
  /**
   * <pre>
   * 输入框的文案
   * </pre>
   *
   * <code>string placeholder_text = 1;</code>
   * @return The bytes for placeholderText.
   */
  com.google.protobuf.ByteString
      getPlaceholderTextBytes();

  /**
   * <pre>
   * 背景空白的时候的文案
   * </pre>
   *
   * <code>string background_text = 2;</code>
   * @return The backgroundText.
   */
  java.lang.String getBackgroundText();
  /**
   * <pre>
   * 背景空白的时候的文案
   * </pre>
   *
   * <code>string background_text = 2;</code>
   * @return The bytes for backgroundText.
   */
  com.google.protobuf.ByteString
      getBackgroundTextBytes();

  /**
   * <pre>
   * 有权限的tab栏的顺序
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.SearchItemType ordered_type = 3;</code>
   * @return A list containing the orderedType.
   */
  java.util.List<bilibili.main.community.reply.v1.SearchItemType> getOrderedTypeList();
  /**
   * <pre>
   * 有权限的tab栏的顺序
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.SearchItemType ordered_type = 3;</code>
   * @return The count of orderedType.
   */
  int getOrderedTypeCount();
  /**
   * <pre>
   * 有权限的tab栏的顺序
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.SearchItemType ordered_type = 3;</code>
   * @param index The index of the element to return.
   * @return The orderedType at the given index.
   */
  bilibili.main.community.reply.v1.SearchItemType getOrderedType(int index);
  /**
   * <pre>
   * 有权限的tab栏的顺序
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.SearchItemType ordered_type = 3;</code>
   * @return A list containing the enum numeric values on the wire for orderedType.
   */
  java.util.List<java.lang.Integer>
  getOrderedTypeValueList();
  /**
   * <pre>
   * 有权限的tab栏的顺序
   * </pre>
   *
   * <code>repeated .bilibili.main.community.reply.v1.SearchItemType ordered_type = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of orderedType at the given index.
   */
  int getOrderedTypeValue(int index);
}