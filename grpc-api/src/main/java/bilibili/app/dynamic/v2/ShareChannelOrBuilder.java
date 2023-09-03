// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ShareChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ShareChannel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 分享名称
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 分享名称
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 分享按钮图片
   * </pre>
   *
   * <code>string image = 2;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <pre>
   * 分享按钮图片
   * </pre>
   *
   * <code>string image = 2;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <pre>
   * 分享渠道
   * </pre>
   *
   * <code>string channel = 3;</code>
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   * <pre>
   * 分享渠道
   * </pre>
   *
   * <code>string channel = 3;</code>
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ShareReserve reserve = 4;</code>
   * @return Whether the reserve field is set.
   */
  boolean hasReserve();
  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ShareReserve reserve = 4;</code>
   * @return The reserve.
   */
  bilibili.app.dynamic.v2.ShareReserve getReserve();
  /**
   * <pre>
   * 预约卡分享图信息，仅分享有预约信息的动态时存在
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ShareReserve reserve = 4;</code>
   */
  bilibili.app.dynamic.v2.ShareReserveOrBuilder getReserveOrBuilder();
}
