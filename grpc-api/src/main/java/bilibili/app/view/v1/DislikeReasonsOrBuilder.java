// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface DislikeReasonsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.DislikeReasons)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 类型
   * 1:全部类型 3:TAG 4:UP主
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 相关UP主mid
   * </pre>
   *
   * <code>int64 mid = 2;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 相关分区tid
   * </pre>
   *
   * <code>int32 rid = 3;</code>
   * @return The rid.
   */
  int getRid();

  /**
   * <pre>
   * 相关TAG id
   * </pre>
   *
   * <code>int64 tag_id = 4;</code>
   * @return The tagId.
   */
  long getTagId();

  /**
   * <pre>
   * 相关名称
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 相关名称
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}