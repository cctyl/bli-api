// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/im/notify.proto

package bilibili.broadcast.message.im;

public interface NotifyRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.im.NotifyRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>uint64 uid = 1;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * 命令id
   * </pre>
   *
   * <code>uint64 cmd = 2;</code>
   * @return The cmd.
   */
  long getCmd();

  /**
   * <pre>
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.message.im.PLType payload_type = 4;</code>
   * @return The enum numeric value on the wire for payloadType.
   */
  int getPayloadTypeValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.broadcast.message.im.PLType payload_type = 4;</code>
   * @return The payloadType.
   */
  bilibili.broadcast.message.im.PLType getPayloadType();
}