// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ResourceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ResourceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string raw_params = 1;</code>
   * @return The rawParams.
   */
  java.lang.String getRawParams();
  /**
   * <pre>
   * </pre>
   *
   * <code>string raw_params = 1;</code>
   * @return The bytes for rawParams.
   */
  com.google.protobuf.ByteString
      getRawParamsBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   * @return The params.
   */
  bilibili.app.nativeact.v1.ResourceParams getParams();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceParams params = 2;</code>
   */
  bilibili.app.nativeact.v1.ResourceParamsOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 primary_page_id = 3;</code>
   * @return The primaryPageId.
   */
  long getPrimaryPageId();
}