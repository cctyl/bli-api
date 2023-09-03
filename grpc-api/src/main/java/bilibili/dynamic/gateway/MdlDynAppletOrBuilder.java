// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynAppletOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynApplet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 小程序id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 主标题
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 主标题
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string sub_title = 5;</code>
   * @return The subTitle.
   */
  java.lang.String getSubTitle();
  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string sub_title = 5;</code>
   * @return The bytes for subTitle.
   */
  com.google.protobuf.ByteString
      getSubTitleBytes();

  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 6;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 6;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 小程序icon
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * 小程序icon
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * 小程序标题
   * </pre>
   *
   * <code>string label = 8;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * 小程序标题
   * </pre>
   *
   * <code>string label = 8;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * 按钮文案
   * </pre>
   *
   * <code>string button_title = 9;</code>
   * @return The buttonTitle.
   */
  java.lang.String getButtonTitle();
  /**
   * <pre>
   * 按钮文案
   * </pre>
   *
   * <code>string button_title = 9;</code>
   * @return The bytes for buttonTitle.
   */
  com.google.protobuf.ByteString
      getButtonTitleBytes();
}