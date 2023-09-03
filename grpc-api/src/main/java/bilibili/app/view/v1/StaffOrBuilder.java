// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface StaffOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.Staff)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 成员mid
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 成员角色
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 成员角色
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 成员头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * 成员头像url
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * 成员昵称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 成员昵称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 成员官方信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 5;</code>
   * @return Whether the officialVerify field is set.
   */
  boolean hasOfficialVerify();
  /**
   * <pre>
   * 成员官方信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 5;</code>
   * @return The officialVerify.
   */
  bilibili.app.view.v1.OfficialVerify getOfficialVerify();
  /**
   * <pre>
   * 成员官方信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 5;</code>
   */
  bilibili.app.view.v1.OfficialVerifyOrBuilder getOfficialVerifyOrBuilder();

  /**
   * <pre>
   * 成员会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 6;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * 成员会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 6;</code>
   * @return The vip.
   */
  bilibili.app.view.v1.Vip getVip();
  /**
   * <pre>
   * 成员会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 6;</code>
   */
  bilibili.app.view.v1.VipOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * 是否关注该成员
   * </pre>
   *
   * <code>int32 attention = 7;</code>
   * @return The attention.
   */
  int getAttention();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 label_style = 8;</code>
   * @return The labelStyle.
   */
  int getLabelStyle();
}