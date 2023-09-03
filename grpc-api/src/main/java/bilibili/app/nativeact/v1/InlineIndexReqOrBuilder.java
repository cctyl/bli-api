// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface InlineIndexReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.InlineIndexReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 page_id = 1;</code>
   * @return The pageId.
   */
  long getPageId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 https_url_req = 2;</code>
   * @return The httpsUrlReq.
   */
  int getHttpsUrlReq();

  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 3;</code>
   * @return The fromSpmid.
   */
  java.lang.String getFromSpmid();
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 3;</code>
   * @return The bytes for fromSpmid.
   */
  com.google.protobuf.ByteString
      getFromSpmidBytes();

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
   * <code>int32 local_time = 5;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_cold_start = 6;</code>
   * @return The isColdStart.
   */
  boolean getIsColdStart();
}