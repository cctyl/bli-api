// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface NavigationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.Navigation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation children = 2;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.Navigation> 
      getChildrenList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation children = 2;</code>
   */
  bilibili.polymer.app.search.v1.Navigation getChildren(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation children = 2;</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation children = 2;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.NavigationOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation children = 2;</code>
   */
  bilibili.polymer.app.search.v1.NavigationOrBuilder getChildrenOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation inline_children = 3;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.Navigation> 
      getInlineChildrenList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation inline_children = 3;</code>
   */
  bilibili.polymer.app.search.v1.Navigation getInlineChildren(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation inline_children = 3;</code>
   */
  int getInlineChildrenCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation inline_children = 3;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.NavigationOrBuilder> 
      getInlineChildrenOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Navigation inline_children = 3;</code>
   */
  bilibili.polymer.app.search.v1.NavigationOrBuilder getInlineChildrenOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NavigationButton button = 6;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NavigationButton button = 6;</code>
   * @return The button.
   */
  bilibili.polymer.app.search.v1.NavigationButton getButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NavigationButton button = 6;</code>
   */
  bilibili.polymer.app.search.v1.NavigationButtonOrBuilder getButtonOrBuilder();
}