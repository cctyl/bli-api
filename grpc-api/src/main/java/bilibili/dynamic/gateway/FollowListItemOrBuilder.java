// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface FollowListItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.FollowListItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * season_id
   * </pre>
   *
   * <code>int64 season_id = 1;</code>
   * @return The seasonId.
   */
  long getSeasonId();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string url = 4;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * 跳转链接
   * </pre>
   *
   * <code>string url = 4;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * new_ep
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.NewEP new_ep = 5;</code>
   * @return Whether the newEp field is set.
   */
  boolean hasNewEp();
  /**
   * <pre>
   * new_ep
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.NewEP new_ep = 5;</code>
   * @return The newEp.
   */
  bilibili.dynamic.gateway.NewEP getNewEp();
  /**
   * <pre>
   * new_ep
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.NewEP new_ep = 5;</code>
   */
  bilibili.dynamic.gateway.NewEPOrBuilder getNewEpOrBuilder();

  /**
   * <pre>
   * 子标题
   * </pre>
   *
   * <code>string sub_title = 6;</code>
   * @return The subTitle.
   */
  java.lang.String getSubTitle();
  /**
   * <pre>
   * 子标题
   * </pre>
   *
   * <code>string sub_title = 6;</code>
   * @return The bytes for subTitle.
   */
  com.google.protobuf.ByteString
      getSubTitleBytes();

  /**
   * <pre>
   * 卡片位次
   * </pre>
   *
   * <code>int64 pos = 7;</code>
   * @return The pos.
   */
  long getPos();
}
