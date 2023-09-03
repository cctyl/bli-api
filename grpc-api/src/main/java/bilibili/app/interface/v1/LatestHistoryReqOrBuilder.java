// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

public interface LatestHistoryReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.LatestHistoryReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 1;</code>
   * @return The business.
   */
  java.lang.String getBusiness();
  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 1;</code>
   * @return The bytes for business.
   */
  com.google.protobuf.ByteString
      getBusinessBytes();

  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   * @return Whether the playerPreload field is set.
   */
  boolean hasPlayerPreload();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   * @return The playerPreload.
   */
  bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 2;</code>
   */
  bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder();
}
