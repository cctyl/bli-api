// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface RcmdCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.RcmdCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * </pre>
   *
   * <code>string face = 3;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string reason = 5;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * </pre>
   *
   * <code>string reason = 5;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_followed = 6;</code>
   * @return The isFollowed.
   */
  boolean getIsFollowed();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OfficialInfo official = 7;</code>
   * @return Whether the official field is set.
   */
  boolean hasOfficial();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OfficialInfo official = 7;</code>
   * @return The official.
   */
  bilibili.app.nativeact.v1.OfficialInfo getOfficial();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OfficialInfo official = 7;</code>
   */
  bilibili.app.nativeact.v1.OfficialInfoOrBuilder getOfficialOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VipInfo vip = 8;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VipInfo vip = 8;</code>
   * @return The vip.
   */
  bilibili.app.nativeact.v1.VipInfo getVip();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VipInfo vip = 8;</code>
   */
  bilibili.app.nativeact.v1.VipInfoOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string rank_icon = 9;</code>
   * @return The rankIcon.
   */
  java.lang.String getRankIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string rank_icon = 9;</code>
   * @return The bytes for rankIcon.
   */
  com.google.protobuf.ByteString
      getRankIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RedirectType redirect_type = 10;</code>
   * @return The enum numeric value on the wire for redirectType.
   */
  int getRedirectTypeValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RedirectType redirect_type = 10;</code>
   * @return The redirectType.
   */
  bilibili.app.nativeact.v1.RedirectType getRedirectType();
}
