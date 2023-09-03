// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface LiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.Live)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 主播UID
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 直播间id
   * </pre>
   *
   * <code>int64 roomid = 2;</code>
   * @return The roomid.
   */
  long getRoomid();

  /**
   * <pre>
   * 直播间url
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 直播间url
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string endpage_uri = 4;</code>
   * @return The endpageUri.
   */
  java.lang.String getEndpageUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string endpage_uri = 4;</code>
   * @return The bytes for endpageUri.
   */
  com.google.protobuf.ByteString
      getEndpageUriBytes();
}
