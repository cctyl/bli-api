// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface LabelV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.LabelV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @return A list containing the content.
   */
  java.util.List<java.lang.String>
      getContentList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @return The count of content.
   */
  int getContentCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @param index The index of the element to return.
   * @return The content at the given index.
   */
  java.lang.String getContent(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string content = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the content at the given index.
   */
  com.google.protobuf.ByteString
      getContentBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool exposure_once = 3;</code>
   * @return The exposureOnce.
   */
  boolean getExposureOnce();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 exposure_type = 4;</code>
   * @return The exposureType.
   */
  int getExposureType();
}
