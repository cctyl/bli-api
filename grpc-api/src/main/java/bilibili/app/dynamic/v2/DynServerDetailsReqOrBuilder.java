// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface DynServerDetailsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynServerDetailsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 local_time = 2;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 3;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string mobi_app = 4;</code>
   * @return The mobiApp.
   */
  java.lang.String getMobiApp();
  /**
   * <pre>
   * </pre>
   *
   * <code>string mobi_app = 4;</code>
   * @return The bytes for mobiApp.
   */
  com.google.protobuf.ByteString
      getMobiAppBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 5;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 5;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string buvid = 6;</code>
   * @return The buvid.
   */
  java.lang.String getBuvid();
  /**
   * <pre>
   * </pre>
   *
   * <code>string buvid = 6;</code>
   * @return The bytes for buvid.
   */
  com.google.protobuf.ByteString
      getBuvidBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 build = 7;</code>
   * @return The build.
   */
  long getBuild();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 8;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 9;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 9;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_master = 10;</code>
   * @return The isMaster.
   */
  boolean getIsMaster();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated int64 top_dynamic_ids = 11;</code>
   * @return A list containing the topDynamicIds.
   */
  java.util.List<java.lang.Long> getTopDynamicIdsList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated int64 top_dynamic_ids = 11;</code>
   * @return The count of topDynamicIds.
   */
  int getTopDynamicIdsCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated int64 top_dynamic_ids = 11;</code>
   * @param index The index of the element to return.
   * @return The topDynamicIds at the given index.
   */
  long getTopDynamicIds(int index);
}
