// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playerunite/v1/playerunite.proto

package bilibili.app.playerunite.v1;

public interface PlayViewUniteReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.playerunite.v1.PlayViewUniteReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 请求资源VOD信息
   * </pre>
   *
   * <code>.bilibili.playershared.VideoVod vod = 1;</code>
   * @return Whether the vod field is set.
   */
  boolean hasVod();
  /**
   * <pre>
   * 请求资源VOD信息
   * </pre>
   *
   * <code>.bilibili.playershared.VideoVod vod = 1;</code>
   * @return The vod.
   */
  bilibili.playershared.VideoVod getVod();
  /**
   * <pre>
   * 请求资源VOD信息
   * </pre>
   *
   * <code>.bilibili.playershared.VideoVod vod = 1;</code>
   */
  bilibili.playershared.VideoVodOrBuilder getVodOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string spmid = 2;</code>
   * @return The spmid.
   */
  java.lang.String getSpmid();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string spmid = 2;</code>
   * @return The bytes for spmid.
   */
  com.google.protobuf.ByteString
      getSpmidBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string from_spmid = 3;</code>
   * @return The fromSpmid.
   */
  java.lang.String getFromSpmid();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string from_spmid = 3;</code>
   * @return The bytes for fromSpmid.
   */
  com.google.protobuf.ByteString
      getFromSpmidBytes();

  /**
   * <pre>
   * 补充信息, 如ep_id等
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_content = 4;</code>
   */
  int getExtraContentCount();
  /**
   * <pre>
   * 补充信息, 如ep_id等
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_content = 4;</code>
   */
  boolean containsExtraContent(
      java.lang.String key);
  /**
   * Use {@link #getExtraContentMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getExtraContent();
  /**
   * <pre>
   * 补充信息, 如ep_id等
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_content = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getExtraContentMap();
  /**
   * <pre>
   * 补充信息, 如ep_id等
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_content = 4;</code>
   */
  /* nullable */
java.lang.String getExtraContentOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 补充信息, 如ep_id等
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_content = 4;</code>
   */
  java.lang.String getExtraContentOrThrow(
      java.lang.String key);
}
