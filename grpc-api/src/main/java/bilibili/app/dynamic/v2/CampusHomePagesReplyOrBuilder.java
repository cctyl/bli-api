// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface CampusHomePagesReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.CampusHomePagesReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusRcmdTop top = 1;</code>
   * @return Whether the top field is set.
   */
  boolean hasTop();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusRcmdTop top = 1;</code>
   * @return The top.
   */
  bilibili.app.dynamic.v2.CampusRcmdTop getTop();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusRcmdTop top = 1;</code>
   */
  bilibili.app.dynamic.v2.CampusRcmdTopOrBuilder getTopOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusTop campus_top = 2;</code>
   * @return Whether the campusTop field is set.
   */
  boolean hasCampusTop();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusTop campus_top = 2;</code>
   * @return The campusTop.
   */
  bilibili.app.dynamic.v2.CampusTop getCampusTop();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.CampusTop campus_top = 2;</code>
   */
  bilibili.app.dynamic.v2.CampusTopOrBuilder getCampusTopOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 page_type = 3;</code>
   * @return The pageType.
   */
  int getPageType();
}
