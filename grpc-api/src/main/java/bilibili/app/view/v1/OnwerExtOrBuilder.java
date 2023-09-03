// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface OnwerExtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.OnwerExt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 1;</code>
   * @return Whether the officialVerify field is set.
   */
  boolean hasOfficialVerify();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 1;</code>
   * @return The officialVerify.
   */
  bilibili.app.view.v1.OfficialVerify getOfficialVerify();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OfficialVerify official_verify = 1;</code>
   */
  bilibili.app.view.v1.OfficialVerifyOrBuilder getOfficialVerifyOrBuilder();

  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Live live = 2;</code>
   * @return Whether the live field is set.
   */
  boolean hasLive();
  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Live live = 2;</code>
   * @return The live.
   */
  bilibili.app.view.v1.Live getLive();
  /**
   * <pre>
   * 直播信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Live live = 2;</code>
   */
  bilibili.app.view.v1.LiveOrBuilder getLiveOrBuilder();

  /**
   * <pre>
   * 会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 3;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * 会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 3;</code>
   * @return The vip.
   */
  bilibili.app.view.v1.Vip getVip();
  /**
   * <pre>
   * 会员信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Vip vip = 3;</code>
   */
  bilibili.app.view.v1.VipOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 assists = 4;</code>
   * @return A list containing the assists.
   */
  java.util.List<java.lang.Long> getAssistsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 assists = 4;</code>
   * @return The count of assists.
   */
  int getAssistsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 assists = 4;</code>
   * @param index The index of the element to return.
   * @return The assists at the given index.
   */
  long getAssists(int index);

  /**
   * <pre>
   * 粉丝数
   * </pre>
   *
   * <code>int64 fans = 5;</code>
   * @return The fans.
   */
  long getFans();

  /**
   * <pre>
   * 总投稿数
   * </pre>
   *
   * <code>string arc_count = 6;</code>
   * @return The arcCount.
   */
  java.lang.String getArcCount();
  /**
   * <pre>
   * 总投稿数
   * </pre>
   *
   * <code>string arc_count = 6;</code>
   * @return The bytes for arcCount.
   */
  com.google.protobuf.ByteString
      getArcCountBytes();
}