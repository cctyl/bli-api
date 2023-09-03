// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface SourceContentDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.SourceContentDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 广告请求id
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * 广告请求id
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * 广告资源位source ID
   * </pre>
   *
   * <code>int32 source_id = 2;</code>
   * @return The sourceId.
   */
  int getSourceId();

  /**
   * <pre>
   * 广告资源位resource ID
   * </pre>
   *
   * <code>int32 resource_id = 3;</code>
   * @return The resourceId.
   */
  int getResourceId();

  /**
   * <pre>
   * 广告位上报标记,对广告返回数据恒为true
   * </pre>
   *
   * <code>bool is_ad_loc = 4;</code>
   * @return The isAdLoc.
   */
  boolean getIsAdLoc();

  /**
   * <pre>
   * 与天马现有逻辑一致, 0有含义
   * 0:内容 1:广告
   * </pre>
   *
   * <code>.google.protobuf.Int32Value server_type = 5;</code>
   * @return Whether the serverType field is set.
   */
  boolean hasServerType();
  /**
   * <pre>
   * 与天马现有逻辑一致, 0有含义
   * 0:内容 1:广告
   * </pre>
   *
   * <code>.google.protobuf.Int32Value server_type = 5;</code>
   * @return The serverType.
   */
  com.google.protobuf.Int32Value getServerType();
  /**
   * <pre>
   * 与天马现有逻辑一致, 0有含义
   * 0:内容 1:广告
   * </pre>
   *
   * <code>.google.protobuf.Int32Value server_type = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getServerTypeOrBuilder();

  /**
   * <pre>
   * 客户端IP回传拼接
   * </pre>
   *
   * <code>string client_ip = 6;</code>
   * @return The clientIp.
   */
  java.lang.String getClientIp();
  /**
   * <pre>
   * 客户端IP回传拼接
   * </pre>
   *
   * <code>string client_ip = 6;</code>
   * @return The bytes for clientIp.
   */
  com.google.protobuf.ByteString
      getClientIpBytes();

  /**
   * <pre>
   * 广告卡片位置在一刷中的位置, 天马用, 0有含义
   * </pre>
   *
   * <code>.google.protobuf.Int32Value card_index = 7;</code>
   * @return Whether the cardIndex field is set.
   */
  boolean hasCardIndex();
  /**
   * <pre>
   * 广告卡片位置在一刷中的位置, 天马用, 0有含义
   * </pre>
   *
   * <code>.google.protobuf.Int32Value card_index = 7;</code>
   * @return The cardIndex.
   */
  com.google.protobuf.Int32Value getCardIndex();
  /**
   * <pre>
   * 广告卡片位置在一刷中的位置, 天马用, 0有含义
   * </pre>
   *
   * <code>.google.protobuf.Int32Value card_index = 7;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getCardIndexOrBuilder();

  /**
   * <pre>
   * 广告资源位source 位次
   * </pre>
   *
   * <code>int32 index = 8;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <pre>
   * 广告内容
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdDto ad_content = 9;</code>
   * @return Whether the adContent field is set.
   */
  boolean hasAdContent();
  /**
   * <pre>
   * 广告内容
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdDto ad_content = 9;</code>
   * @return The adContent.
   */
  bilibili.ad.v1.AdDto getAdContent();
  /**
   * <pre>
   * 广告内容
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdDto ad_content = 9;</code>
   */
  bilibili.ad.v1.AdDtoOrBuilder getAdContentOrBuilder();
}
