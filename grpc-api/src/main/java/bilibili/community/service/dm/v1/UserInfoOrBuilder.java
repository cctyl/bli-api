// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.UserInfo)
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
   * 用户性别
   * </pre>
   *
   * <code>string sex = 3;</code>
   * @return The sex.
   */
  java.lang.String getSex();
  /**
   * <pre>
   * 用户性别
   * </pre>
   *
   * <code>string sex = 3;</code>
   * @return The bytes for sex.
   */
  com.google.protobuf.ByteString
      getSexBytes();

  /**
   * <pre>
   * 用户头像url
   * </pre>
   *
   * <code>string face = 4;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * 用户头像url
   * </pre>
   *
   * <code>string face = 4;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * 用户签名
   * </pre>
   *
   * <code>string sign = 5;</code>
   * @return The sign.
   */
  java.lang.String getSign();
  /**
   * <pre>
   * 用户签名
   * </pre>
   *
   * <code>string sign = 5;</code>
   * @return The bytes for sign.
   */
  com.google.protobuf.ByteString
      getSignBytes();

  /**
   * <pre>
   * 用户等级
   * </pre>
   *
   * <code>int32 rank = 6;</code>
   * @return The rank.
   */
  int getRank();
}
