// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

public interface ModuleBannerUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.gateway.ModuleBannerUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  java.util.List<bilibili.dynamic.gateway.ModuleBannerUserItem> 
      getListList();
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  bilibili.dynamic.gateway.ModuleBannerUserItem getList(int index);
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  java.util.List<? extends bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 卡片列表
   * </pre>
   *
   * <code>repeated .bilibili.dynamic.gateway.ModuleBannerUserItem list = 1;</code>
   */
  bilibili.dynamic.gateway.ModuleBannerUserItemOrBuilder getListOrBuilder(
      int index);
}
