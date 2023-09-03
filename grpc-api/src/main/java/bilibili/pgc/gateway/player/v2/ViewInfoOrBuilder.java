// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface ViewInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.ViewInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Dialog dialog = 1;</code>
   * @return Whether the dialog field is set.
   */
  boolean hasDialog();
  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Dialog dialog = 1;</code>
   * @return The dialog.
   */
  bilibili.pgc.gateway.player.v2.Dialog getDialog();
  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Dialog dialog = 1;</code>
   */
  bilibili.pgc.gateway.player.v2.DialogOrBuilder getDialogOrBuilder();

  /**
   * <pre>
   * Toast
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Toast toast = 2;</code>
   * @return Whether the toast field is set.
   */
  boolean hasToast();
  /**
   * <pre>
   * Toast
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Toast toast = 2;</code>
   * @return The toast.
   */
  bilibili.pgc.gateway.player.v2.Toast getToast();
  /**
   * <pre>
   * Toast
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Toast toast = 2;</code>
   */
  bilibili.pgc.gateway.player.v2.ToastOrBuilder getToastOrBuilder();

  /**
   * <pre>
   * 优惠券信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.CouponInfo coupon_info = 3;</code>
   * @return Whether the couponInfo field is set.
   */
  boolean hasCouponInfo();
  /**
   * <pre>
   * 优惠券信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.CouponInfo coupon_info = 3;</code>
   * @return The couponInfo.
   */
  bilibili.pgc.gateway.player.v2.CouponInfo getCouponInfo();
  /**
   * <pre>
   * 优惠券信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.CouponInfo coupon_info = 3;</code>
   */
  bilibili.pgc.gateway.player.v2.CouponInfoOrBuilder getCouponInfoOrBuilder();

  /**
   * <pre>
   * 未支付剧集ID列表
   * </pre>
   *
   * <code>repeated int64 demand_no_pay_epids = 4;</code>
   * @return A list containing the demandNoPayEpids.
   */
  java.util.List<java.lang.Long> getDemandNoPayEpidsList();
  /**
   * <pre>
   * 未支付剧集ID列表
   * </pre>
   *
   * <code>repeated int64 demand_no_pay_epids = 4;</code>
   * @return The count of demandNoPayEpids.
   */
  int getDemandNoPayEpidsCount();
  /**
   * <pre>
   * 未支付剧集ID列表
   * </pre>
   *
   * <code>repeated int64 demand_no_pay_epids = 4;</code>
   * @param index The index of the element to return.
   * @return The demandNoPayEpids at the given index.
   */
  long getDemandNoPayEpids(int index);

  /**
   * <pre>
   * 结束页
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.EndPage end_page = 5;</code>
   * @return Whether the endPage field is set.
   */
  boolean hasEndPage();
  /**
   * <pre>
   * 结束页
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.EndPage end_page = 5;</code>
   * @return The endPage.
   */
  bilibili.pgc.gateway.player.v2.EndPage getEndPage();
  /**
   * <pre>
   * 结束页
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.EndPage end_page = 5;</code>
   */
  bilibili.pgc.gateway.player.v2.EndPageOrBuilder getEndPageOrBuilder();

  /**
   * <pre>
   * 扩展配置
   * </pre>
   *
   * <code>map&lt;string, bool&gt; exp_config = 6;</code>
   */
  int getExpConfigCount();
  /**
   * <pre>
   * 扩展配置
   * </pre>
   *
   * <code>map&lt;string, bool&gt; exp_config = 6;</code>
   */
  boolean containsExpConfig(
      java.lang.String key);
  /**
   * Use {@link #getExpConfigMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getExpConfig();
  /**
   * <pre>
   * 扩展配置
   * </pre>
   *
   * <code>map&lt;string, bool&gt; exp_config = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getExpConfigMap();
  /**
   * <pre>
   * 扩展配置
   * </pre>
   *
   * <code>map&lt;string, bool&gt; exp_config = 6;</code>
   */
  boolean getExpConfigOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <pre>
   * 扩展配置
   * </pre>
   *
   * <code>map&lt;string, bool&gt; exp_config = 6;</code>
   */
  boolean getExpConfigOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PopWin pop_win = 7;</code>
   * @return Whether the popWin field is set.
   */
  boolean hasPopWin();
  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PopWin pop_win = 7;</code>
   * @return The popWin.
   */
  bilibili.pgc.gateway.player.v2.PopWin getPopWin();
  /**
   * <pre>
   * 弹窗
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PopWin pop_win = 7;</code>
   */
  bilibili.pgc.gateway.player.v2.PopWinOrBuilder getPopWinOrBuilder();

  /**
   * <pre>
   * 试看提示栏
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PromptBar try_watch_prompt_bar = 8;</code>
   * @return Whether the tryWatchPromptBar field is set.
   */
  boolean hasTryWatchPromptBar();
  /**
   * <pre>
   * 试看提示栏
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PromptBar try_watch_prompt_bar = 8;</code>
   * @return The tryWatchPromptBar.
   */
  bilibili.pgc.gateway.player.v2.PromptBar getTryWatchPromptBar();
  /**
   * <pre>
   * 试看提示栏
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PromptBar try_watch_prompt_bar = 8;</code>
   */
  bilibili.pgc.gateway.player.v2.PromptBarOrBuilder getTryWatchPromptBarOrBuilder();

  /**
   * <pre>
   * 支付提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PayTip pay_tip = 9;</code>
   * @return Whether the payTip field is set.
   */
  boolean hasPayTip();
  /**
   * <pre>
   * 支付提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PayTip pay_tip = 9;</code>
   * @return The payTip.
   */
  bilibili.pgc.gateway.player.v2.PayTip getPayTip();
  /**
   * <pre>
   * 支付提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.PayTip pay_tip = 9;</code>
   */
  bilibili.pgc.gateway.player.v2.PayTipOrBuilder getPayTipOrBuilder();

  /**
   * <pre>
   * 高清试看提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfo high_definition_trial_info = 10;</code>
   * @return Whether the highDefinitionTrialInfo field is set.
   */
  boolean hasHighDefinitionTrialInfo();
  /**
   * <pre>
   * 高清试看提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfo high_definition_trial_info = 10;</code>
   * @return The highDefinitionTrialInfo.
   */
  bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfo getHighDefinitionTrialInfo();
  /**
   * <pre>
   * 高清试看提示信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfo high_definition_trial_info = 10;</code>
   */
  bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfoOrBuilder getHighDefinitionTrialInfoOrBuilder();

  /**
   * <pre>
   * 弹窗扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Dialog&gt; ext_dialog = 11;</code>
   */
  int getExtDialogCount();
  /**
   * <pre>
   * 弹窗扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Dialog&gt; ext_dialog = 11;</code>
   */
  boolean containsExtDialog(
      java.lang.String key);
  /**
   * Use {@link #getExtDialogMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, bilibili.pgc.gateway.player.v2.Dialog>
  getExtDialog();
  /**
   * <pre>
   * 弹窗扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Dialog&gt; ext_dialog = 11;</code>
   */
  java.util.Map<java.lang.String, bilibili.pgc.gateway.player.v2.Dialog>
  getExtDialogMap();
  /**
   * <pre>
   * 弹窗扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Dialog&gt; ext_dialog = 11;</code>
   */
  /* nullable */
bilibili.pgc.gateway.player.v2.Dialog getExtDialogOrDefault(
      java.lang.String key,
      /* nullable */
bilibili.pgc.gateway.player.v2.Dialog defaultValue);
  /**
   * <pre>
   * 弹窗扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Dialog&gt; ext_dialog = 11;</code>
   */
  bilibili.pgc.gateway.player.v2.Dialog getExtDialogOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 动画
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Animation animation = 12;</code>
   * @return Whether the animation field is set.
   */
  boolean hasAnimation();
  /**
   * <pre>
   * 动画
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Animation animation = 12;</code>
   * @return The animation.
   */
  bilibili.pgc.gateway.player.v2.Animation getAnimation();
  /**
   * <pre>
   * 动画
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Animation animation = 12;</code>
   */
  bilibili.pgc.gateway.player.v2.AnimationOrBuilder getAnimationOrBuilder();

  /**
   * <pre>
   * Toast扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Toast&gt; ext_toast = 13;</code>
   */
  int getExtToastCount();
  /**
   * <pre>
   * Toast扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Toast&gt; ext_toast = 13;</code>
   */
  boolean containsExtToast(
      java.lang.String key);
  /**
   * Use {@link #getExtToastMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, bilibili.pgc.gateway.player.v2.Toast>
  getExtToast();
  /**
   * <pre>
   * Toast扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Toast&gt; ext_toast = 13;</code>
   */
  java.util.Map<java.lang.String, bilibili.pgc.gateway.player.v2.Toast>
  getExtToastMap();
  /**
   * <pre>
   * Toast扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Toast&gt; ext_toast = 13;</code>
   */
  /* nullable */
bilibili.pgc.gateway.player.v2.Toast getExtToastOrDefault(
      java.lang.String key,
      /* nullable */
bilibili.pgc.gateway.player.v2.Toast defaultValue);
  /**
   * <pre>
   * Toast扩展
   * </pre>
   *
   * <code>map&lt;string, .bilibili.pgc.gateway.player.v2.Toast&gt; ext_toast = 13;</code>
   */
  bilibili.pgc.gateway.player.v2.Toast getExtToastOrThrow(
      java.lang.String key);
}
