// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/metadata.proto

package bilibili.metadata;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.metadata.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 登录 access_key
   * </pre>
   *
   * <code>string access_key = 1;</code>
   * @return The accessKey.
   */
  java.lang.String getAccessKey();
  /**
   * <pre>
   * 登录 access_key
   * </pre>
   *
   * <code>string access_key = 1;</code>
   * @return The bytes for accessKey.
   */
  com.google.protobuf.ByteString
      getAccessKeyBytes();

  /**
   * <pre>
   * 包类型, 如 `android`
   * </pre>
   *
   * <code>string mobi_app = 2;</code>
   * @return The mobiApp.
   */
  java.lang.String getMobiApp();
  /**
   * <pre>
   * 包类型, 如 `android`
   * </pre>
   *
   * <code>string mobi_app = 2;</code>
   * @return The bytes for mobiApp.
   */
  com.google.protobuf.ByteString
      getMobiAppBytes();

  /**
   * <pre>
   * 运行设备, 留空即可
   * </pre>
   *
   * <code>string device = 3;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * 运行设备, 留空即可
   * </pre>
   *
   * <code>string device = 3;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * 构建id, 如 `7380300`
   * </pre>
   *
   * <code>int32 build = 4;</code>
   * @return The build.
   */
  int getBuild();

  /**
   * <pre>
   * APP分发渠道, 如 `master`
   * </pre>
   *
   * <code>string channel = 5;</code>
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   * <pre>
   * APP分发渠道, 如 `master`
   * </pre>
   *
   * <code>string channel = 5;</code>
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <pre>
   * 设备唯一标识
   * </pre>
   *
   * <code>string buvid = 6;</code>
   * @return The buvid.
   */
  java.lang.String getBuvid();
  /**
   * <pre>
   * 设备唯一标识
   * </pre>
   *
   * <code>string buvid = 6;</code>
   * @return The bytes for buvid.
   */
  com.google.protobuf.ByteString
      getBuvidBytes();

  /**
   * <pre>
   * 平台类型, 如 `android`
   * </pre>
   *
   * <code>string platform = 7;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * 平台类型, 如 `android`
   * </pre>
   *
   * <code>string platform = 7;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();
}
