// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface OfficialDynamicsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.OfficialDynamicsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 campus_id = 1;</code>
   * @return The campusId.
   */
  long getCampusId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string campus_name = 2;</code>
   * @return The campusName.
   */
  java.lang.String getCampusName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string campus_name = 2;</code>
   * @return The bytes for campusName.
   */
  com.google.protobuf.ByteString
      getCampusNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  long getOffset();
}