// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

public interface PendantProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.broadcast.message.ogv.PendantProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pid = 1;</code>
   * @return The pid.
   */
  int getPid();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string image = 3;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <code>string image = 3;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <code>int64 expire = 4;</code>
   * @return The expire.
   */
  long getExpire();

  /**
   * <code>string image_enhance = 5;</code>
   * @return The imageEnhance.
   */
  java.lang.String getImageEnhance();
  /**
   * <code>string image_enhance = 5;</code>
   * @return The bytes for imageEnhance.
   */
  com.google.protobuf.ByteString
      getImageEnhanceBytes();
}