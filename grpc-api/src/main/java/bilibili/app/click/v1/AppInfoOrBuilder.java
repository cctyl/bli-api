// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/click/v1/heartbeat.proto

package bilibili.app.click.v1;

public interface AppInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.click.v1.AppInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string top_page_class = 1;</code>
   * @return The topPageClass.
   */
  java.lang.String getTopPageClass();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string top_page_class = 1;</code>
   * @return The bytes for topPageClass.
   */
  com.google.protobuf.ByteString
      getTopPageClassBytes();

  /**
   * <pre>
   * 客户端首次启动时的毫秒时间戳
   * </pre>
   *
   * <code>int64 ftime = 2;</code>
   * @return The ftime.
   */
  long getFtime();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string did = 3;</code>
   * @return The did.
   */
  java.lang.String getDid();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string did = 3;</code>
   * @return The bytes for did.
   */
  com.google.protobuf.ByteString
      getDidBytes();
}
