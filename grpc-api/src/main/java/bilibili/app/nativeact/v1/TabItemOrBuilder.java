// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface TabItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.TabItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 page_id = 1;</code>
   * @return The pageId.
   */
  long getPageId();

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

  /**
   * <pre>
   * </pre>
   *
   * <code>bool disable_click = 3;</code>
   * @return The disableClick.
   */
  boolean getDisableClick();

  /**
   * <pre>
   * </pre>
   *
   * <code>string disable_click_toast = 4;</code>
   * @return The disableClickToast.
   */
  java.lang.String getDisableClickToast();
  /**
   * <pre>
   * </pre>
   *
   * <code>string disable_click_toast = 4;</code>
   * @return The bytes for disableClickToast.
   */
  com.google.protobuf.ByteString
      getDisableClickToastBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage selected_image = 5;</code>
   * @return Whether the selectedImage field is set.
   */
  boolean hasSelectedImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage selected_image = 5;</code>
   * @return The selectedImage.
   */
  bilibili.app.nativeact.v1.SizeImage getSelectedImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage selected_image = 5;</code>
   */
  bilibili.app.nativeact.v1.SizeImageOrBuilder getSelectedImageOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage unselected_image = 6;</code>
   * @return Whether the unselectedImage field is set.
   */
  boolean hasUnselectedImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage unselected_image = 6;</code>
   * @return The unselectedImage.
   */
  bilibili.app.nativeact.v1.SizeImage getUnselectedImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage unselected_image = 6;</code>
   */
  bilibili.app.nativeact.v1.SizeImageOrBuilder getUnselectedImageOrBuilder();
}
