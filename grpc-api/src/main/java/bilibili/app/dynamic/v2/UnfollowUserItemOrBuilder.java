// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface UnfollowUserItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.UnfollowUserItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否有更新
   * </pre>
   *
   * <code>bool has_update = 1;</code>
   * @return The hasUpdate.
   */
  boolean getHasUpdate();

  /**
   * <pre>
   * up主头像
   * </pre>
   *
   * <code>string face = 2;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * up主头像
   * </pre>
   *
   * <code>string face = 2;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * up主昵称
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * up主昵称
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * up主uid
   * </pre>
   *
   * <code>int64 uid = 4;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * 排序字段 从1开始
   * </pre>
   *
   * <code>int32 pos = 5;</code>
   * @return The pos.
   */
  int getPos();

  /**
   * <pre>
   * 直播状态
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LiveState live_state = 6;</code>
   * @return The enum numeric value on the wire for liveState.
   */
  int getLiveStateValue();
  /**
   * <pre>
   * 直播状态
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LiveState live_state = 6;</code>
   * @return The liveState.
   */
  bilibili.app.dynamic.v2.LiveState getLiveState();

  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.OfficialVerify official = 7;</code>
   * @return Whether the official field is set.
   */
  boolean hasOfficial();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.OfficialVerify official = 7;</code>
   * @return The official.
   */
  bilibili.app.dynamic.v2.OfficialVerify getOfficial();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.OfficialVerify official = 7;</code>
   */
  bilibili.app.dynamic.v2.OfficialVerifyOrBuilder getOfficialOrBuilder();

  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipInfo vip = 8;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipInfo vip = 8;</code>
   * @return The vip.
   */
  bilibili.app.dynamic.v2.VipInfo getVip();
  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VipInfo vip = 8;</code>
   */
  bilibili.app.dynamic.v2.VipInfoOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * up介绍
   * </pre>
   *
   * <code>string sign = 9;</code>
   * @return The sign.
   */
  java.lang.String getSign();
  /**
   * <pre>
   * up介绍
   * </pre>
   *
   * <code>string sign = 9;</code>
   * @return The bytes for sign.
   */
  com.google.protobuf.ByteString
      getSignBytes();

  /**
   * <pre>
   * 标签信息
   * </pre>
   *
   * <code>string label = 10;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * 标签信息
   * </pre>
   *
   * <code>string label = 10;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * 按钮
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButton button = 11;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * 按钮
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButton button = 11;</code>
   * @return The button.
   */
  bilibili.app.dynamic.v2.AdditionalButton getButton();
  /**
   * <pre>
   * 按钮
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButton button = 11;</code>
   */
  bilibili.app.dynamic.v2.AdditionalButtonOrBuilder getButtonOrBuilder();

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 12;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 12;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
