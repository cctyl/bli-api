// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface RelateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.Relate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Arc arc = 1;</code>
   * @return Whether the arc field is set.
   */
  boolean hasArc();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Arc arc = 1;</code>
   * @return The arc.
   */
  bilibili.web.interfaces.v1.Arc getArc();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.Arc arc = 1;</code>
   */
  bilibili.web.interfaces.v1.ArcOrBuilder getArcOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bvid.
   */
  java.lang.String getBvid();
  /**
   * <pre>
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bytes for bvid.
   */
  com.google.protobuf.ByteString
      getBvidBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 season_type = 3;</code>
   * @return The seasonType.
   */
  long getSeasonType();
}
