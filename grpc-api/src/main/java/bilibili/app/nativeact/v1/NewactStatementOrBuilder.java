// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface NewactStatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.NewactStatement)
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
   * <code>repeated .bilibili.app.nativeact.v1.NewactStatementItem items = 2;</code>
   */
  java.util.List<bilibili.app.nativeact.v1.NewactStatementItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.NewactStatementItem items = 2;</code>
   */
  bilibili.app.nativeact.v1.NewactStatementItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.NewactStatementItem items = 2;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.NewactStatementItem items = 2;</code>
   */
  java.util.List<? extends bilibili.app.nativeact.v1.NewactStatementItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.NewactStatementItem items = 2;</code>
   */
  bilibili.app.nativeact.v1.NewactStatementItemOrBuilder getItemsOrBuilder(
      int index);
}
