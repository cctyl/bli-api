// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v1/playurl.proto

package bilibili.pgc.gateway.player.v1;

public interface ResponseDataUrlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v1.ResponseDataUrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * 表示stream类型,按位表示
   * Value|  1   |  1  |  1   |  1   |     1
   * --------------------------------------------
   * desc | mask | p2p | dash | hevc | only-audio
   * </pre>
   *
   * <code>uint32 stream_type = 2;</code>
   * @return The streamType.
   */
  int getStreamType();

  /**
   * <pre>
   * 表示支持p2p的cdn厂商,按位表示
   * 值   | 1  |  1  |  1  | 1  |  1  | 1  | 1  | 1
   * -----------------------------------------------
   * CDN	| hw | bdy | bsy | ws | txy | qn | js | bvc
   * </pre>
   *
   * <code>uint32 ptag = 3;</code>
   * @return The ptag.
   */
  int getPtag();
}
