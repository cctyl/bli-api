// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface CampusBillBoardReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.CampusBillBoardReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 campus_id = 1;</code>
   * @return The campusId.
   */
  long getCampusId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string version_code = 2;</code>
   * @return The versionCode.
   */
  java.lang.String getVersionCode();
  /**
   * <pre>
   * </pre>
   *
   * <code>string version_code = 2;</code>
   * @return The bytes for versionCode.
   */
  com.google.protobuf.ByteString
      getVersionCodeBytes();

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
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusReqFromType from_type = 4;</code>
   * @return The enum numeric value on the wire for fromType.
   */
  int getFromTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusReqFromType from_type = 4;</code>
   * @return The fromType.
   */
  bilibili.app.dynamic.v2.CampusReqFromType getFromType();
}