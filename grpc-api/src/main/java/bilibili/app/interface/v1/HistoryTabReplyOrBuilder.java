// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

public interface HistoryTabReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.HistoryTabReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tab列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorTab tab = 1;</code>
   */
  java.util.List<bilibili.app.interface.v1.CursorTab> 
      getTabList();
  /**
   * <pre>
   * tab列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorTab tab = 1;</code>
   */
  bilibili.app.interface.v1.CursorTab getTab(int index);
  /**
   * <pre>
   * tab列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorTab tab = 1;</code>
   */
  int getTabCount();
  /**
   * <pre>
   * tab列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorTab tab = 1;</code>
   */
  java.util.List<? extends bilibili.app.interface.v1.CursorTabOrBuilder> 
      getTabOrBuilderList();
  /**
   * <pre>
   * tab列表
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.CursorTab tab = 1;</code>
   */
  bilibili.app.interface.v1.CursorTabOrBuilder getTabOrBuilder(
      int index);
}