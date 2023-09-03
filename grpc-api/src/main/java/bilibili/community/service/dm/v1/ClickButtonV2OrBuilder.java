// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface ClickButtonV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.ClickButtonV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text = 1;</code>
   * @return A list containing the portraitText.
   */
  java.util.List<java.lang.String>
      getPortraitTextList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text = 1;</code>
   * @return The count of portraitText.
   */
  int getPortraitTextCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text = 1;</code>
   * @param index The index of the element to return.
   * @return The portraitText at the given index.
   */
  java.lang.String getPortraitText(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the portraitText at the given index.
   */
  com.google.protobuf.ByteString
      getPortraitTextBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text = 2;</code>
   * @return A list containing the landscapeText.
   */
  java.util.List<java.lang.String>
      getLandscapeTextList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text = 2;</code>
   * @return The count of landscapeText.
   */
  int getLandscapeTextCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text = 2;</code>
   * @param index The index of the element to return.
   * @return The landscapeText at the given index.
   */
  java.lang.String getLandscapeText(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the landscapeText at the given index.
   */
  com.google.protobuf.ByteString
      getLandscapeTextBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text_focus = 3;</code>
   * @return A list containing the portraitTextFocus.
   */
  java.util.List<java.lang.String>
      getPortraitTextFocusList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text_focus = 3;</code>
   * @return The count of portraitTextFocus.
   */
  int getPortraitTextFocusCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text_focus = 3;</code>
   * @param index The index of the element to return.
   * @return The portraitTextFocus at the given index.
   */
  java.lang.String getPortraitTextFocus(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string portrait_text_focus = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the portraitTextFocus at the given index.
   */
  com.google.protobuf.ByteString
      getPortraitTextFocusBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text_focus = 4;</code>
   * @return A list containing the landscapeTextFocus.
   */
  java.util.List<java.lang.String>
      getLandscapeTextFocusList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text_focus = 4;</code>
   * @return The count of landscapeTextFocus.
   */
  int getLandscapeTextFocusCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text_focus = 4;</code>
   * @param index The index of the element to return.
   * @return The landscapeTextFocus at the given index.
   */
  java.lang.String getLandscapeTextFocus(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string landscape_text_focus = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the landscapeTextFocus at the given index.
   */
  com.google.protobuf.ByteString
      getLandscapeTextFocusBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 render_type = 5;</code>
   * @return The renderType.
   */
  int getRenderType();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool text_input_post = 6;</code>
   * @return The textInputPost.
   */
  boolean getTextInputPost();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool exposure_once = 7;</code>
   * @return The exposureOnce.
   */
  boolean getExposureOnce();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 exposure_type = 8;</code>
   * @return The exposureType.
   */
  int getExposureType();
}