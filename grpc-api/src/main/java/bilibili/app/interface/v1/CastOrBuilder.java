// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/media.proto

package bilibili.app.interface.v1;

public interface CastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.Cast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.MediaPerson person = 1;</code>
   */
  java.util.List<bilibili.app.interface.v1.MediaPerson> 
      getPersonList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.MediaPerson person = 1;</code>
   */
  bilibili.app.interface.v1.MediaPerson getPerson(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.MediaPerson person = 1;</code>
   */
  int getPersonCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.MediaPerson person = 1;</code>
   */
  java.util.List<? extends bilibili.app.interface.v1.MediaPersonOrBuilder> 
      getPersonOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.MediaPerson person = 1;</code>
   */
  bilibili.app.interface.v1.MediaPersonOrBuilder getPersonOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}