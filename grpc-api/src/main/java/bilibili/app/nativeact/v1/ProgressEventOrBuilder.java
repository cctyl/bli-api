// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ProgressEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ProgressEvent)
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
   * <code>repeated .bilibili.app.nativeact.v1.ProgressEventItem items = 2;</code>
   */
  java.util.List<bilibili.app.nativeact.v1.ProgressEventItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ProgressEventItem items = 2;</code>
   */
  bilibili.app.nativeact.v1.ProgressEventItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ProgressEventItem items = 2;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ProgressEventItem items = 2;</code>
   */
  java.util.List<? extends bilibili.app.nativeact.v1.ProgressEventItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ProgressEventItem items = 2;</code>
   */
  bilibili.app.nativeact.v1.ProgressEventItemOrBuilder getItemsOrBuilder(
      int index);
}
