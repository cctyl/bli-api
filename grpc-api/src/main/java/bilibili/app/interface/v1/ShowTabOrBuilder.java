// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/media.proto

package bilibili.app.interface.v1;

public interface ShowTabOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.ShowTab)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.TabType tab_type = 1;</code>
   * @return The enum numeric value on the wire for tabType.
   */
  int getTabTypeValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.TabType tab_type = 1;</code>
   * @return The tabType.
   */
  bilibili.app.interface.v1.TabType getTabType();

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
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
