// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ReactionListReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ReactionListReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 动态ID
   * </pre>
   *
   * <code>int64 dynamic_id = 1;</code>
   * @return The dynamicId.
   */
  long getDynamicId();

  /**
   * <pre>
   * 动态类型
   * </pre>
   *
   * <code>int64 dyn_type = 2;</code>
   * @return The dynType.
   */
  long getDynType();

  /**
   * <pre>
   * 业务方资源id
   * </pre>
   *
   * <code>int64 rid = 3;</code>
   * @return The rid.
   */
  long getRid();

  /**
   * <pre>
   * 偏移,使用上一页回包中的offset字段；第一页不传。
   * </pre>
   *
   * <code>string offset = 4;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * 偏移,使用上一页回包中的offset字段；第一页不传。
   * </pre>
   *
   * <code>string offset = 4;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();
}