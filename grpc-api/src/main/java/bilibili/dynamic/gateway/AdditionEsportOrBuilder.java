// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface AdditionEsportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.AdditionEsport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 电竞类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.EspaceStyle style = 1;</code>
   * @return The enum numeric value on the wire for style.
   */
  int getStyleValue();
  /**
   * <pre>
   * 电竞类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.EspaceStyle style = 1;</code>
   * @return The style.
   */
  bilibili.dynamic.gateway.EspaceStyle getStyle();

  /**
   * <pre>
   * moba类
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionEsportMoba addition_esport_moba = 2;</code>
   * @return Whether the additionEsportMoba field is set.
   */
  boolean hasAdditionEsportMoba();
  /**
   * <pre>
   * moba类
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionEsportMoba addition_esport_moba = 2;</code>
   * @return The additionEsportMoba.
   */
  bilibili.dynamic.gateway.AdditionEsportMoba getAdditionEsportMoba();
  /**
   * <pre>
   * moba类
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.AdditionEsportMoba addition_esport_moba = 2;</code>
   */
  bilibili.dynamic.gateway.AdditionEsportMobaOrBuilder getAdditionEsportMobaOrBuilder();

  /**
   * <pre>
   * 动态本身的类型 type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * 动态本身的类型 type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 附加卡类型
   * </pre>
   *
   * <code>string card_type = 4;</code>
   * @return The cardType.
   */
  java.lang.String getCardType();
  /**
   * <pre>
   * 附加卡类型
   * </pre>
   *
   * <code>string card_type = 4;</code>
   * @return The bytes for cardType.
   */
  com.google.protobuf.ByteString
      getCardTypeBytes();

  bilibili.dynamic.gateway.AdditionEsport.ItemCase getItemCase();
}