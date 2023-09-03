// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynSpaceSearchDetailsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynSpaceSearchDetailsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string search_words = 2;</code>
   * @return A list containing the searchWords.
   */
  java.util.List<java.lang.String>
      getSearchWordsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string search_words = 2;</code>
   * @return The count of searchWords.
   */
  int getSearchWordsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string search_words = 2;</code>
   * @param index The index of the element to return.
   * @return The searchWords at the given index.
   */
  java.lang.String getSearchWords(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string search_words = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the searchWords at the given index.
   */
  com.google.protobuf.ByteString
      getSearchWordsBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 local_time = 3;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string mobi_app = 5;</code>
   * @return The mobiApp.
   */
  java.lang.String getMobiApp();
  /**
   * <pre>
   * </pre>
   *
   * <code>string mobi_app = 5;</code>
   * @return The bytes for mobiApp.
   */
  com.google.protobuf.ByteString
      getMobiAppBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 6;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 6;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string buvid = 7;</code>
   * @return The buvid.
   */
  java.lang.String getBuvid();
  /**
   * <pre>
   * </pre>
   *
   * <code>string buvid = 7;</code>
   * @return The bytes for buvid.
   */
  com.google.protobuf.ByteString
      getBuvidBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 build = 8;</code>
   * @return The build.
   */
  long getBuild();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 9;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 10;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 10;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string ip = 11;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <pre>
   * </pre>
   *
   * <code>string ip = 11;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 net_type = 12;</code>
   * @return The netType.
   */
  int getNetType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 tf_type = 13;</code>
   * @return The tfType.
   */
  int getTfType();
}