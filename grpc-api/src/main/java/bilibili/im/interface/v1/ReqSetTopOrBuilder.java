// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/interfaces/v1/im.proto

package bilibili.im.interface.v1;

public interface ReqSetTopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.interface.v1.ReqSetTop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 talker_id = 1;</code>
   * @return The talkerId.
   */
  long getTalkerId();

  /**
   * <pre>
   * </pre>
   *
   * <code>uint32 session_type = 2;</code>
   * @return The sessionType.
   */
  int getSessionType();

  /**
   * <pre>
   *
   * 0:置顶 1:取消置顶
   * </pre>
   *
   * <code>uint32 op_type = 3;</code>
   * @return The opType.
   */
  int getOpType();
}
