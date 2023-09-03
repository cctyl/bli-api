// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface PageRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.PageResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_online = 1;</code>
   * @return The isOnline.
   */
  boolean getIsOnline();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool ignore_app_dark_theme = 2;</code>
   * @return The ignoreAppDarkTheme.
   */
  boolean getIgnoreAppDarkTheme();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Color page_color = 3;</code>
   * @return Whether the pageColor field is set.
   */
  boolean hasPageColor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Color page_color = 3;</code>
   * @return The pageColor.
   */
  bilibili.app.nativeact.v1.Color getPageColor();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Color page_color = 3;</code>
   */
  bilibili.app.nativeact.v1.ColorOrBuilder getPageColorOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 4;</code>
   * @return Whether the pageShare field is set.
   */
  boolean hasPageShare();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 4;</code>
   * @return The pageShare.
   */
  bilibili.app.nativeact.v1.PageShare getPageShare();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.PageShare page_share = 4;</code>
   */
  bilibili.app.nativeact.v1.PageShareOrBuilder getPageShareOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module page_header = 5;</code>
   * @return Whether the pageHeader field is set.
   */
  boolean hasPageHeader();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module page_header = 5;</code>
   * @return The pageHeader.
   */
  bilibili.app.nativeact.v1.Module getPageHeader();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module page_header = 5;</code>
   */
  bilibili.app.nativeact.v1.ModuleOrBuilder getPageHeaderOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module participation = 6;</code>
   * @return Whether the participation field is set.
   */
  boolean hasParticipation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module participation = 6;</code>
   * @return The participation.
   */
  bilibili.app.nativeact.v1.Module getParticipation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.Module participation = 6;</code>
   */
  bilibili.app.nativeact.v1.ModuleOrBuilder getParticipationOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.Module module_list = 7;</code>
   */
  java.util.List<bilibili.app.nativeact.v1.Module> 
      getModuleListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.Module module_list = 7;</code>
   */
  bilibili.app.nativeact.v1.Module getModuleList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.Module module_list = 7;</code>
   */
  int getModuleListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.Module module_list = 7;</code>
   */
  java.util.List<? extends bilibili.app.nativeact.v1.ModuleOrBuilder> 
      getModuleListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.Module module_list = 7;</code>
   */
  bilibili.app.nativeact.v1.ModuleOrBuilder getModuleListOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_dynamic_feed = 8;</code>
   * @return The isDynamicFeed.
   */
  boolean getIsDynamicFeed();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LayerDynamic layer_dynamic = 9;</code>
   * @return Whether the layerDynamic field is set.
   */
  boolean hasLayerDynamic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LayerDynamic layer_dynamic = 9;</code>
   * @return The layerDynamic.
   */
  bilibili.app.nativeact.v1.LayerDynamic getLayerDynamic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LayerDynamic layer_dynamic = 9;</code>
   */
  bilibili.app.nativeact.v1.LayerDynamicOrBuilder getLayerDynamicOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_editor_feed = 10;</code>
   * @return The isEditorFeed.
   */
  boolean getIsEditorFeed();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 sponsor_type = 11;</code>
   * @return The sponsorType.
   */
  long getSponsorType();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TopTab top_tab = 12;</code>
   * @return Whether the topTab field is set.
   */
  boolean hasTopTab();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TopTab top_tab = 12;</code>
   * @return The topTab.
   */
  bilibili.app.nativeact.v1.TopTab getTopTab();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TopTab top_tab = 12;</code>
   */
  bilibili.app.nativeact.v1.TopTabOrBuilder getTopTabOrBuilder();
}