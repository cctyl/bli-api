// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface ReqSessionDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.ReqSessionDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 会话详情请求列表
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.ReqSessionDetail sess_ids = 1;</code>
   */
  java.util.List<bilibili.im.interface.v1.ReqSessionDetail> 
      getSessIdsList();
  /**
   * <pre>
   * 会话详情请求列表
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.ReqSessionDetail sess_ids = 1;</code>
   */
  bilibili.im.interface.v1.ReqSessionDetail getSessIds(int index);
  /**
   * <pre>
   * 会话详情请求列表
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.ReqSessionDetail sess_ids = 1;</code>
   */
  int getSessIdsCount();
  /**
   * <pre>
   * 会话详情请求列表
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.ReqSessionDetail sess_ids = 1;</code>
   */
  java.util.List<? extends bilibili.im.interface.v1.ReqSessionDetailOrBuilder> 
      getSessIdsOrBuilderList();
  /**
   * <pre>
   * 会话详情请求列表
   * </pre>
   *
   * <code>repeated .bilibili.im.interface.v1.ReqSessionDetail sess_ids = 1;</code>
   */
  bilibili.im.interface.v1.ReqSessionDetailOrBuilder getSessIdsOrBuilder(
      int index);
}
