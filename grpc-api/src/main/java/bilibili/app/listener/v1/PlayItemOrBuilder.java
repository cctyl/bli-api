// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface PlayItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.PlayItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 item_type = 1;</code>
   * @return The itemType.
   */
  int getItemType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 oid = 3;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 sub_id = 4;</code>
   * @return A list containing the subId.
   */
  java.util.List<java.lang.Long> getSubIdList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 sub_id = 4;</code>
   * @return The count of subId.
   */
  int getSubIdCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int64 sub_id = 4;</code>
   * @param index The index of the element to return.
   * @return The subId at the given index.
   */
  long getSubId(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.EventTracking et = 5;</code>
   * @return Whether the et field is set.
   */
  boolean hasEt();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.EventTracking et = 5;</code>
   * @return The et.
   */
  bilibili.app.listener.v1.EventTracking getEt();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.EventTracking et = 5;</code>
   */
  bilibili.app.listener.v1.EventTrackingOrBuilder getEtOrBuilder();
}