// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface PlayHistoryDelReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.PlayHistoryDelReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.PlayItem items = 1;</code>
   */
  java.util.List<bilibili.app.listener.v1.PlayItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.PlayItem items = 1;</code>
   */
  bilibili.app.listener.v1.PlayItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.PlayItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.PlayItem items = 1;</code>
   */
  java.util.List<? extends bilibili.app.listener.v1.PlayItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.PlayItem items = 1;</code>
   */
  bilibili.app.listener.v1.PlayItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool truncate = 2;</code>
   * @return The truncate.
   */
  boolean getTruncate();
}
