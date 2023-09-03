// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

public interface CursorV2ReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.CursorV2Req)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   * @return The cursor.
   */
  bilibili.app.interface.v1.Cursor getCursor();
  /**
   * <pre>
   * 游标信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.Cursor cursor = 1;</code>
   */
  bilibili.app.interface.v1.CursorOrBuilder getCursorOrBuilder();

  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 2;</code>
   * @return The business.
   */
  java.lang.String getBusiness();
  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 2;</code>
   * @return The bytes for business.
   */
  com.google.protobuf.ByteString
      getBusinessBytes();

  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   * @return Whether the playerPreload field is set.
   */
  boolean hasPlayerPreload();
  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   * @return The playerPreload.
   */
  bilibili.app.interface.v1.PlayerPreloadParams getPlayerPreload();
  /**
   * <pre>
   * 秒开参数(旧版)
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.PlayerPreloadParams player_preload = 3;</code>
   */
  bilibili.app.interface.v1.PlayerPreloadParamsOrBuilder getPlayerPreloadOrBuilder();

  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   * @return Whether the playerArgs field is set.
   */
  boolean hasPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   * @return The playerArgs.
   */
  bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs();
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.archive.middleware.v1.PlayerArgs player_args = 4;</code>
   */
  bilibili.app.archive.middleware.v1.PlayerArgsOrBuilder getPlayerArgsOrBuilder();

  /**
   * <pre>
   * 是否选择本机的播放历史
   * </pre>
   *
   * <code>bool is_local = 5;</code>
   * @return The isLocal.
   */
  boolean getIsLocal();
}
