// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface SelectItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.SelectItem)
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
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 3;</code>
   * @return Whether the pageShare field is set.
   */
  boolean hasPageShare();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 3;</code>
   * @return The pageShare.
   */
  bilibili.app.nativeact.v1.PageShare getPageShare();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 3;</code>
   */
  bilibili.app.nativeact.v1.PageShareOrBuilder getPageShareOrBuilder();
}