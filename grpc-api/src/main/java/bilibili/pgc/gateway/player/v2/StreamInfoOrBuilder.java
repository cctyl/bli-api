// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface StreamInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.StreamInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频质量
   * </pre>
   *
   * <code>int32 quality = 1;</code>
   * @return The quality.
   */
  int getQuality();

  /**
   * <pre>
   * 视频格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * 视频格式
   * </pre>
   *
   * <code>string format = 2;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>int32 err_code = 4;</code>
   * @return The errCode.
   */
  int getErrCode();

  /**
   * <pre>
   * 流限制信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.StreamLimit limit = 5;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * 流限制信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.StreamLimit limit = 5;</code>
   * @return The limit.
   */
  bilibili.pgc.gateway.player.v2.StreamLimit getLimit();
  /**
   * <pre>
   * 流限制信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.StreamLimit limit = 5;</code>
   */
  bilibili.pgc.gateway.player.v2.StreamLimitOrBuilder getLimitOrBuilder();

  /**
   * <pre>
   * 是否需要VIP
   * </pre>
   *
   * <code>bool need_vip = 6;</code>
   * @return The needVip.
   */
  boolean getNeedVip();

  /**
   * <pre>
   * 是否需要登录
   * </pre>
   *
   * <code>bool need_login = 7;</code>
   * @return The needLogin.
   */
  boolean getNeedLogin();

  /**
   * <pre>
   * 是否完整
   * </pre>
   *
   * <code>bool intact = 8;</code>
   * @return The intact.
   */
  boolean getIntact();

  /**
   * <pre>
   * 权限信息
   * </pre>
   *
   * <code>int64 attribute = 10;</code>
   * @return The attribute.
   */
  long getAttribute();

  /**
   * <pre>
   * 新版描述信息
   * </pre>
   *
   * <code>string new_description = 11;</code>
   * @return The newDescription.
   */
  java.lang.String getNewDescription();
  /**
   * <pre>
   * 新版描述信息
   * </pre>
   *
   * <code>string new_description = 11;</code>
   * @return The bytes for newDescription.
   */
  com.google.protobuf.ByteString
      getNewDescriptionBytes();

  /**
   * <pre>
   * 显示描述信息
   * </pre>
   *
   * <code>string display_desc = 12;</code>
   * @return The displayDesc.
   */
  java.lang.String getDisplayDesc();
  /**
   * <pre>
   * 显示描述信息
   * </pre>
   *
   * <code>string display_desc = 12;</code>
   * @return The bytes for displayDesc.
   */
  com.google.protobuf.ByteString
      getDisplayDescBytes();

  /**
   * <pre>
   * 上标
   * </pre>
   *
   * <code>string superscript = 13;</code>
   * @return The superscript.
   */
  java.lang.String getSuperscript();
  /**
   * <pre>
   * 上标
   * </pre>
   *
   * <code>string superscript = 13;</code>
   * @return The bytes for superscript.
   */
  com.google.protobuf.ByteString
      getSuperscriptBytes();

  /**
   * <pre>
   * 方案信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Scheme scheme = 14;</code>
   * @return Whether the scheme field is set.
   */
  boolean hasScheme();
  /**
   * <pre>
   * 方案信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Scheme scheme = 14;</code>
   * @return The scheme.
   */
  bilibili.pgc.gateway.player.v2.Scheme getScheme();
  /**
   * <pre>
   * 方案信息
   * </pre>
   *
   * <code>.bilibili.pgc.gateway.player.v2.Scheme scheme = 14;</code>
   */
  bilibili.pgc.gateway.player.v2.SchemeOrBuilder getSchemeOrBuilder();

  /**
   * <pre>
   * 是否支持DRM
   * </pre>
   *
   * <code>bool support_drm = 15;</code>
   * @return The supportDrm.
   */
  boolean getSupportDrm();

  /**
   * <pre>
   * 字幕信息
   * </pre>
   *
   * <code>string subtitle = 16;</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * 字幕信息
   * </pre>
   *
   * <code>string subtitle = 16;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();
}