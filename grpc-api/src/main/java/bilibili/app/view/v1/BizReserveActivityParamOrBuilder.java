// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface BizReserveActivityParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.BizReserveActivityParam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 活动id
   * </pre>
   *
   * <code>int64 activity_id = 1;</code>
   * @return The activityId.
   */
  long getActivityId();

  /**
   * <pre>
   * 场景
   * </pre>
   *
   * <code>string from = 2;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * 场景
   * </pre>
   *
   * <code>string from = 2;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 资源id
   * </pre>
   *
   * <code>int64 oid = 4;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 reserve_id = 5;</code>
   * @return The reserveId.
   */
  long getReserveId();
}
