// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

public interface DynRedStyleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.DynRedStyle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 bg_type = 1;</code>
   * @return The bgType.
   */
  int getBgType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 corner_type = 2;</code>
   * @return The cornerType.
   */
  int getCornerType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 display_time = 3;</code>
   * @return The displayTime.
   */
  int getDisplayTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>string corner_mark = 4;</code>
   * @return The cornerMark.
   */
  java.lang.String getCornerMark();
  /**
   * <pre>
   * </pre>
   *
   * <code>string corner_mark = 4;</code>
   * @return The bytes for cornerMark.
   */
  com.google.protobuf.ByteString
      getCornerMarkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DynRedStyleUp up = 5;</code>
   * @return Whether the up field is set.
   */
  boolean hasUp();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DynRedStyleUp up = 5;</code>
   * @return The up.
   */
  bilibili.app.dynamic.v1.DynRedStyleUp getUp();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DynRedStyleUp up = 5;</code>
   */
  bilibili.app.dynamic.v1.DynRedStyleUpOrBuilder getUpOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 6;</code>
   * @return The type.
   */
  int getType();
}
