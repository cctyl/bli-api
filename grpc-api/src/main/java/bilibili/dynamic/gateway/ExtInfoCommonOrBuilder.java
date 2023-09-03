// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface ExtInfoCommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.ExtInfoCommon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

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
   * 小图标
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * 小图标
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * poiType
   * </pre>
   *
   * <code>int32 poi_type = 4;</code>
   * @return The poiType.
   */
  int getPoiType();

  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.DynExtendType type = 5;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.DynExtendType type = 5;</code>
   * @return The type.
   */
  bilibili.dynamic.gateway.DynExtendType getType();

  /**
   * <pre>
   * 客户端埋点用
   * </pre>
   *
   * <code>string sub_module = 6;</code>
   * @return The subModule.
   */
  java.lang.String getSubModule();
  /**
   * <pre>
   * 客户端埋点用
   * </pre>
   *
   * <code>string sub_module = 6;</code>
   * @return The bytes for subModule.
   */
  com.google.protobuf.ByteString
      getSubModuleBytes();

  /**
   * <pre>
   * 行动点文案
   * </pre>
   *
   * <code>string action_text = 7;</code>
   * @return The actionText.
   */
  java.lang.String getActionText();
  /**
   * <pre>
   * 行动点文案
   * </pre>
   *
   * <code>string action_text = 7;</code>
   * @return The bytes for actionText.
   */
  com.google.protobuf.ByteString
      getActionTextBytes();

  /**
   * <pre>
   * 行动点链接
   * </pre>
   *
   * <code>string action_url = 8;</code>
   * @return The actionUrl.
   */
  java.lang.String getActionUrl();
  /**
   * <pre>
   * 行动点链接
   * </pre>
   *
   * <code>string action_url = 8;</code>
   * @return The bytes for actionUrl.
   */
  com.google.protobuf.ByteString
      getActionUrlBytes();

  /**
   * <pre>
   * 资源rid
   * </pre>
   *
   * <code>int64 rid = 9;</code>
   * @return The rid.
   */
  long getRid();

  /**
   * <pre>
   * 轻浏览是否展示
   * </pre>
   *
   * <code>bool is_show_light = 10;</code>
   * @return The isShowLight.
   */
  boolean getIsShowLight();
}
