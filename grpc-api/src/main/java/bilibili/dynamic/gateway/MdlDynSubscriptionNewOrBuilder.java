// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynSubscriptionNewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynSubscriptionNew)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *样式类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynSubscriptionNewStyle style = 1;</code>
   * @return The enum numeric value on the wire for style.
   */
  int getStyleValue();
  /**
   * <pre>
   *样式类型
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynSubscriptionNewStyle style = 1;</code>
   * @return The style.
   */
  bilibili.dynamic.gateway.MdlDynSubscriptionNewStyle getStyle();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynSubscription dyn_subscription = 2;</code>
   * @return Whether the dynSubscription field is set.
   */
  boolean hasDynSubscription();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynSubscription dyn_subscription = 2;</code>
   * @return The dynSubscription.
   */
  bilibili.dynamic.gateway.MdlDynSubscription getDynSubscription();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynSubscription dyn_subscription = 2;</code>
   */
  bilibili.dynamic.gateway.MdlDynSubscriptionOrBuilder getDynSubscriptionOrBuilder();

  /**
   * <pre>
   * 直播推荐
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynLiveRcmd dyn_live_rcmd = 3;</code>
   * @return Whether the dynLiveRcmd field is set.
   */
  boolean hasDynLiveRcmd();
  /**
   * <pre>
   * 直播推荐
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynLiveRcmd dyn_live_rcmd = 3;</code>
   * @return The dynLiveRcmd.
   */
  bilibili.dynamic.gateway.MdlDynLiveRcmd getDynLiveRcmd();
  /**
   * <pre>
   * 直播推荐
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.MdlDynLiveRcmd dyn_live_rcmd = 3;</code>
   */
  bilibili.dynamic.gateway.MdlDynLiveRcmdOrBuilder getDynLiveRcmdOrBuilder();

  bilibili.dynamic.gateway.MdlDynSubscriptionNew.ItemCase getItemCase();
}