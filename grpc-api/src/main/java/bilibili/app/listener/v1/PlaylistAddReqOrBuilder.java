// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface PlaylistAddReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.PlaylistAddReq)
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
   * <code>.bilibili.app.listener.v1.PlayItem after = 2;</code>
   * @return Whether the after field is set.
   */
  boolean hasAfter();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem after = 2;</code>
   * @return The after.
   */
  bilibili.app.listener.v1.PlayItem getAfter();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem after = 2;</code>
   */
  bilibili.app.listener.v1.PlayItemOrBuilder getAfterOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool head = 3;</code>
   * @return Whether the head field is set.
   */
  boolean hasHead();
  /**
   * <pre>
   * </pre>
   *
   * <code>bool head = 3;</code>
   * @return The head.
   */
  boolean getHead();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool tail = 4;</code>
   * @return Whether the tail field is set.
   */
  boolean hasTail();
  /**
   * <pre>
   * </pre>
   *
   * <code>bool tail = 4;</code>
   * @return The tail.
   */
  boolean getTail();

  bilibili.app.listener.v1.PlaylistAddReq.PosCase getPosCase();
}