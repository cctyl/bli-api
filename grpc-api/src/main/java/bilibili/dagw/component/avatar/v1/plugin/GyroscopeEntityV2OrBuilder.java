// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/plugin.proto

package bilibili.dagw.component.avatar.v1.plugin;

public interface GyroscopeEntityV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string display_type = 1;</code>
   * @return The displayType.
   */
  java.lang.String getDisplayType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string display_type = 1;</code>
   * @return The bytes for displayType.
   */
  com.google.protobuf.ByteString
      getDisplayTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  java.util.List<bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2> 
      getContentsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 getContents(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  int getContentsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  java.util.List<? extends bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder> 
      getContentsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2 contents = 2;</code>
   */
  bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder getContentsOrBuilder(
      int index);
}
