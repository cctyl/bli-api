// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface AdditionalButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.AdditionalButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 按钮类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AddButtonType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 按钮类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AddButtonType type = 1;</code>
   * @return The type.
   */
  bilibili.dynamic.gateway.AddButtonType getType();

  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle jump_style = 2;</code>
   * @return Whether the jumpStyle field is set.
   */
  boolean hasJumpStyle();
  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle jump_style = 2;</code>
   * @return The jumpStyle.
   */
  bilibili.dynamic.gateway.AdditionalButtonStyle getJumpStyle();
  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle jump_style = 2;</code>
   */
  bilibili.dynamic.gateway.AdditionalButtonStyleOrBuilder getJumpStyleOrBuilder();

  /**
   * <pre>
   * jump-跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The jumpUrl.
   */
  java.lang.String getJumpUrl();
  /**
   * <pre>
   * jump-跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The bytes for jumpUrl.
   */
  com.google.protobuf.ByteString
      getJumpUrlBytes();

  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle uncheck = 4;</code>
   * @return Whether the uncheck field is set.
   */
  boolean hasUncheck();
  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle uncheck = 4;</code>
   * @return The uncheck.
   */
  bilibili.dynamic.gateway.AdditionalButtonStyle getUncheck();
  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle uncheck = 4;</code>
   */
  bilibili.dynamic.gateway.AdditionalButtonStyleOrBuilder getUncheckOrBuilder();

  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle check = 5;</code>
   * @return Whether the check field is set.
   */
  boolean hasCheck();
  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle check = 5;</code>
   * @return The check.
   */
  bilibili.dynamic.gateway.AdditionalButtonStyle getCheck();
  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStyle check = 5;</code>
   */
  bilibili.dynamic.gateway.AdditionalButtonStyleOrBuilder getCheckOrBuilder();

  /**
   * <pre>
   * button-当前状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStatus status = 6;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * button-当前状态
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonStatus status = 6;</code>
   * @return The status.
   */
  bilibili.dynamic.gateway.AdditionalButtonStatus getStatus();

  /**
   * <pre>
   * 按钮点击样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonClickType click_type = 7;</code>
   * @return The enum numeric value on the wire for clickType.
   */
  int getClickTypeValue();
  /**
   * <pre>
   * 按钮点击样式
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionalButtonClickType click_type = 7;</code>
   * @return The clickType.
   */
  bilibili.dynamic.gateway.AdditionalButtonClickType getClickType();
}
