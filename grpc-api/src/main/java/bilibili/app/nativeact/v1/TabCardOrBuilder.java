// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface TabCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.TabCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 current_tab = 1;</code>
   * @return The currentTab.
   */
  long getCurrentTab();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TabStyle style = 2;</code>
   * @return The enum numeric value on the wire for style.
   */
  int getStyleValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TabStyle style = 2;</code>
   * @return The style.
   */
  bilibili.app.nativeact.v1.TabStyle getStyle();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.TabItem items = 3;</code>
   */
  java.util.List<bilibili.app.nativeact.v1.TabItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.TabItem items = 3;</code>
   */
  bilibili.app.nativeact.v1.TabItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.TabItem items = 3;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.TabItem items = 3;</code>
   */
  java.util.List<? extends bilibili.app.nativeact.v1.TabItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.TabItem items = 3;</code>
   */
  bilibili.app.nativeact.v1.TabItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage bg_image = 4;</code>
   * @return Whether the bgImage field is set.
   */
  boolean hasBgImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage bg_image = 4;</code>
   * @return The bgImage.
   */
  bilibili.app.nativeact.v1.SizeImage getBgImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SizeImage bg_image = 4;</code>
   */
  bilibili.app.nativeact.v1.SizeImageOrBuilder getBgImageOrBuilder();
}