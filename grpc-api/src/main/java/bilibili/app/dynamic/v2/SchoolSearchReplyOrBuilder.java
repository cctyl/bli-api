// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface SchoolSearchReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.SchoolSearchReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CampusInfo items = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.CampusInfo> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CampusInfo items = 1;</code>
   */
  bilibili.app.dynamic.v2.CampusInfo getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CampusInfo items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CampusInfo items = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.CampusInfoOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.CampusInfo items = 1;</code>
   */
  bilibili.app.dynamic.v2.CampusInfoOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.SearchToast toast = 2;</code>
   * @return Whether the toast field is set.
   */
  boolean hasToast();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.SearchToast toast = 2;</code>
   * @return The toast.
   */
  bilibili.app.dynamic.v2.SearchToast getToast();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.SearchToast toast = 2;</code>
   */
  bilibili.app.dynamic.v2.SearchToastOrBuilder getToastOrBuilder();
}
