// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/live/general/interfaces/v1/interfaces.proto

package bilibili.live.general.interfaces.v1;

public interface GetOnlineRankReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.live.general.interfaces.v1.GetOnlineRankReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ruid = 1;</code>
   * @return The ruid.
   */
  long getRuid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 room_id = 2;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page = 3;</code>
   * @return The page.
   */
  long getPage();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page_size = 4;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 5;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * </pre>
   *
   * <code>string platform = 5;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();
}
