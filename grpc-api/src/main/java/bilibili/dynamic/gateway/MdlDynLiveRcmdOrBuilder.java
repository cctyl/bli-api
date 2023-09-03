// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface MdlDynLiveRcmdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.MdlDynLiveRcmd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 直播数据
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * 直播数据
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * 是否是预约召回
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
   * @return The enum numeric value on the wire for reserveType.
   */
  int getReserveTypeValue();
  /**
   * <pre>
   * 是否是预约召回
   * </pre>
   *
   * <code>.bilibili.dynamic.gateway.ReserveType reserve_type = 2;</code>
   * @return The reserveType.
   */
  bilibili.dynamic.gateway.ReserveType getReserveType();
}