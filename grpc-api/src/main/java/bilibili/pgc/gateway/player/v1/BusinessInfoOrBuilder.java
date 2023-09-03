// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v1/playurl.proto

package bilibili.pgc.gateway.player.v1;

public interface BusinessInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v1.BusinessInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 当前视频是否是预览
   * </pre>
   *
   * <code>bool is_preview = 1;</code>
   * @return The isPreview.
   */
  boolean getIsPreview();

  /**
   * <pre>
   * 用户是否承包过
   * </pre>
   *
   * <code>bool bp = 2;</code>
   * @return The bp.
   */
  boolean getBp();

  /**
   * <pre>
   * drm使用
   * </pre>
   *
   * <code>string marlin_token = 3;</code>
   * @return The marlinToken.
   */
  java.lang.String getMarlinToken();
  /**
   * <pre>
   * drm使用
   * </pre>
   *
   * <code>string marlin_token = 3;</code>
   * @return The bytes for marlinToken.
   */
  com.google.protobuf.ByteString
      getMarlinTokenBytes();
}
