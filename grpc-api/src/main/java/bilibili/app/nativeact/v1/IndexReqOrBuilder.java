// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface IndexReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.IndexReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page_id = 1;</code>
   * @return The pageId.
   */
  long getPageId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_from = 2;</code>
   * @return The activityFrom.
   */
  java.lang.String getActivityFrom();
  /**
   * <pre>
   * </pre>
   *
   * <code>string activity_from = 2;</code>
   * @return The bytes for activityFrom.
   */
  com.google.protobuf.ByteString
      getActivityFromBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 dynamic_id = 3;</code>
   * @return The dynamicId.
   */
  long getDynamicId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string share_origin = 4;</code>
   * @return The shareOrigin.
   */
  java.lang.String getShareOrigin();
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_origin = 4;</code>
   * @return The bytes for shareOrigin.
   */
  com.google.protobuf.ByteString
      getShareOriginBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 tab_id = 5;</code>
   * @return The tabId.
   */
  long getTabId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 tab_module_id = 6;</code>
   * @return The tabModuleId.
   */
  long getTabModuleId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 https_url_req = 7;</code>
   * @return The httpsUrlReq.
   */
  int getHttpsUrlReq();

  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 8;</code>
   * @return The fromSpmid.
   */
  java.lang.String getFromSpmid();
  /**
   * <pre>
   * </pre>
   *
   * <code>string from_spmid = 8;</code>
   * @return The bytes for fromSpmid.
   */
  com.google.protobuf.ByteString
      getFromSpmidBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string current_tab = 9;</code>
   * @return The currentTab.
   */
  java.lang.String getCurrentTab();
  /**
   * <pre>
   * </pre>
   *
   * <code>string current_tab = 9;</code>
   * @return The bytes for currentTab.
   */
  com.google.protobuf.ByteString
      getCurrentTabBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 10;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 10;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 10;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 local_time = 11;</code>
   * @return The localTime.
   */
  int getLocalTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_cold_start = 12;</code>
   * @return The isColdStart.
   */
  boolean getIsColdStart();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 primary_page_id = 13;</code>
   * @return The primaryPageId.
   */
  long getPrimaryPageId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string tab_from = 14;</code>
   * @return The tabFrom.
   */
  java.lang.String getTabFrom();
  /**
   * <pre>
   * </pre>
   *
   * <code>string tab_from = 14;</code>
   * @return The bytes for tabFrom.
   */
  com.google.protobuf.ByteString
      getTabFromBytes();
}