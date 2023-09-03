// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/avatar.proto

package bilibili.dagw.component.avatar.v1;

public interface AvatarItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dagw.component.avatar.v1.AvatarItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.SizeSpec container_size = 1;</code>
   * @return Whether the containerSize field is set.
   */
  boolean hasContainerSize();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.SizeSpec container_size = 1;</code>
   * @return The containerSize.
   */
  bilibili.dagw.component.avatar.common.SizeSpec getContainerSize();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.common.SizeSpec container_size = 1;</code>
   */
  bilibili.dagw.component.avatar.common.SizeSpecOrBuilder getContainerSizeOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.LayerGroup layers = 2;</code>
   */
  java.util.List<bilibili.dagw.component.avatar.v1.LayerGroup> 
      getLayersList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.LayerGroup layers = 2;</code>
   */
  bilibili.dagw.component.avatar.v1.LayerGroup getLayers(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.LayerGroup layers = 2;</code>
   */
  int getLayersCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.LayerGroup layers = 2;</code>
   */
  java.util.List<? extends bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder> 
      getLayersOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.dagw.component.avatar.v1.LayerGroup layers = 2;</code>
   */
  bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder getLayersOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.v1.LayerGroup fallback_layers = 3;</code>
   * @return Whether the fallbackLayers field is set.
   */
  boolean hasFallbackLayers();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.v1.LayerGroup fallback_layers = 3;</code>
   * @return The fallbackLayers.
   */
  bilibili.dagw.component.avatar.v1.LayerGroup getFallbackLayers();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dagw.component.avatar.v1.LayerGroup fallback_layers = 3;</code>
   */
  bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder getFallbackLayersOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 mid = 4;</code>
   * @return The mid.
   */
  long getMid();
}