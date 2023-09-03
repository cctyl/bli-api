// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/opus.proto

package bilibili.app.dynamic.v2;

public interface OpusDetailReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.OpusDetailReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.OpusType opus_type = 1;</code>
   * @return The enum numeric value on the wire for opusType.
   */
  int getOpusTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.OpusType opus_type = 1;</code>
   * @return The opusType.
   */
  bilibili.app.dynamic.v2.OpusType getOpusType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 oid = 2;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 dyn_type = 3;</code>
   * @return The dynType.
   */
  long getDynType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string share_id = 4;</code>
   * @return The shareId.
   */
  java.lang.String getShareId();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string share_id = 4;</code>
   * @return The bytes for shareId.
   */
  com.google.protobuf.ByteString
      getShareIdBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 share_mode = 9;</code>
   * @return The shareMode.
   */
  int getShareMode();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 local_time = 10;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 11;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 11;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 11;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   * @return The config.
   */
  bilibili.app.dynamic.v2.Config getConfig();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Config config = 12;</code>
   */
  bilibili.app.dynamic.v2.ConfigOrBuilder getConfigOrBuilder();
}