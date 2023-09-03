// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户mid
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 用户昵称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 用户昵称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 用户头像
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * 用户头像
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.OfficialVerify official = 4;</code>
   * @return Whether the official field is set.
   */
  boolean hasOfficial();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.OfficialVerify official = 4;</code>
   * @return The official.
   */
  bilibili.dynamic.gateway.OfficialVerify getOfficial();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.OfficialVerify official = 4;</code>
   */
  bilibili.dynamic.gateway.OfficialVerifyOrBuilder getOfficialOrBuilder();

  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VipInfo vip = 5;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VipInfo vip = 5;</code>
   * @return The vip.
   */
  bilibili.dynamic.gateway.VipInfo getVip();
  /**
   * <pre>
   * 大会员信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.VipInfo vip = 5;</code>
   */
  bilibili.dynamic.gateway.VipInfoOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.LiveInfo live = 6;</code>
   * @return Whether the live field is set.
   */
  boolean hasLive();
  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.LiveInfo live = 6;</code>
   * @return The live.
   */
  bilibili.dynamic.gateway.LiveInfo getLive();
  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.LiveInfo live = 6;</code>
   */
  bilibili.dynamic.gateway.LiveInfoOrBuilder getLiveOrBuilder();

  /**
   * <pre>
   * 空间页跳转链接
   * </pre>
   *
   * <code>string uri = 7;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 空间页跳转链接
   * </pre>
   *
   * <code>string uri = 7;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 挂件信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.UserPendant pendant = 8;</code>
   * @return Whether the pendant field is set.
   */
  boolean hasPendant();
  /**
   * <pre>
   * 挂件信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.UserPendant pendant = 8;</code>
   * @return The pendant.
   */
  bilibili.dynamic.gateway.UserPendant getPendant();
  /**
   * <pre>
   * 挂件信息
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.UserPendant pendant = 8;</code>
   */
  bilibili.dynamic.gateway.UserPendantOrBuilder getPendantOrBuilder();

  /**
   * <pre>
   * 认证名牌
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Nameplate nameplate = 9;</code>
   * @return Whether the nameplate field is set.
   */
  boolean hasNameplate();
  /**
   * <pre>
   * 认证名牌
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Nameplate nameplate = 9;</code>
   * @return The nameplate.
   */
  bilibili.dynamic.gateway.Nameplate getNameplate();
  /**
   * <pre>
   * 认证名牌
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.Nameplate nameplate = 9;</code>
   */
  bilibili.dynamic.gateway.NameplateOrBuilder getNameplateOrBuilder();
}
