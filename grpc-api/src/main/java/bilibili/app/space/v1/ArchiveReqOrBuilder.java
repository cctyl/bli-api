// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/space/v1/space.proto

package bilibili.app.space.v1;

public interface ArchiveReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.space.v1.ArchiveReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 vmid = 1;</code>
   * @return The vmid.
   */
  long getVmid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pn = 2;</code>
   * @return The pn.
   */
  int getPn();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ps = 3;</code>
   * @return The ps.
   */
  int getPs();

  /**
   * <pre>
   * </pre>
   *
   * <code>string order = 4;</code>
   * @return The order.
   */
  java.lang.String getOrder();
  /**
   * <pre>
   * </pre>
   *
   * <code>string order = 4;</code>
   * @return The bytes for order.
   */
  com.google.protobuf.ByteString
      getOrderBytes();
}