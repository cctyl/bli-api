// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/mixture/v1/mixture.proto

package bilibili.app.show.mixture.v1;

public interface WidgetItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.show.mixture.v1.WidgetItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string cover = 1;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string cover = 1;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string view = 2;</code>
   * @return The view.
   */
  java.lang.String getView();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string view = 2;</code>
   * @return The bytes for view.
   */
  com.google.protobuf.ByteString
      getViewBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.show.mixture.v1.RcmdReason rcmd_reason = 3;</code>
   * @return Whether the rcmdReason field is set.
   */
  boolean hasRcmdReason();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.show.mixture.v1.RcmdReason rcmd_reason = 3;</code>
   * @return The rcmdReason.
   */
  bilibili.app.show.mixture.v1.RcmdReason getRcmdReason();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.show.mixture.v1.RcmdReason rcmd_reason = 3;</code>
   */
  bilibili.app.show.mixture.v1.RcmdReasonOrBuilder getRcmdReasonOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string uri = 6;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string uri = 6;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string goto = 7;</code>
   * @return The goto.
   */
  java.lang.String getGoto();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string goto = 7;</code>
   * @return The bytes for goto.
   */
  com.google.protobuf.ByteString
      getGotoBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 id = 8;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 view_icon = 9;</code>
   * @return The viewIcon.
   */
  int getViewIcon();
}