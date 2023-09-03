// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface Tab2ExtraDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.Tab2ExtraDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_url = 1;</code>
   * @return The coverUrl.
   */
  java.lang.String getCoverUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover_url = 1;</code>
   * @return The bytes for coverUrl.
   */
  com.google.protobuf.ByteString
      getCoverUrlBytes();

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
   * <code>string desc = 3;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 3;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 5;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 5;</code>
   * @return The button.
   */
  bilibili.ad.v1.AdButtonDto getButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 5;</code>
   */
  bilibili.ad.v1.AdButtonDtoOrBuilder getButtonOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 auto_animate_time_ms = 6;</code>
   * @return The autoAnimateTimeMs.
   */
  int getAutoAnimateTimeMs();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool enable_click = 7;</code>
   * @return The enableClick.
   */
  boolean getEnableClick();

  /**
   * <pre>
   * </pre>
   *
   * <code>string panel_url = 8;</code>
   * @return The panelUrl.
   */
  java.lang.String getPanelUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string panel_url = 8;</code>
   * @return The bytes for panelUrl.
   */
  com.google.protobuf.ByteString
      getPanelUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AppPackageDto download_whitelist = 9;</code>
   */
  java.util.List<bilibili.ad.v1.AppPackageDto> 
      getDownloadWhitelistList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AppPackageDto download_whitelist = 9;</code>
   */
  bilibili.ad.v1.AppPackageDto getDownloadWhitelist(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AppPackageDto download_whitelist = 9;</code>
   */
  int getDownloadWhitelistCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AppPackageDto download_whitelist = 9;</code>
   */
  java.util.List<? extends bilibili.ad.v1.AppPackageDtoOrBuilder> 
      getDownloadWhitelistOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AppPackageDto download_whitelist = 9;</code>
   */
  bilibili.ad.v1.AppPackageDtoOrBuilder getDownloadWhitelistOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string open_whitelist = 10;</code>
   * @return A list containing the openWhitelist.
   */
  java.util.List<java.lang.String>
      getOpenWhitelistList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string open_whitelist = 10;</code>
   * @return The count of openWhitelist.
   */
  int getOpenWhitelistCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string open_whitelist = 10;</code>
   * @param index The index of the element to return.
   * @return The openWhitelist at the given index.
   */
  java.lang.String getOpenWhitelist(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string open_whitelist = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the openWhitelist at the given index.
   */
  com.google.protobuf.ByteString
      getOpenWhitelistBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool use_ad_web_v2 = 11;</code>
   * @return The useAdWebV2.
   */
  boolean getUseAdWebV2();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool enable_store_direct_launch = 12;</code>
   * @return The enableStoreDirectLaunch.
   */
  boolean getEnableStoreDirectLaunch();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 sales_type = 13;</code>
   * @return The salesType.
   */
  int getSalesType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 landingpage_download_style = 15;</code>
   * @return The landingpageDownloadStyle.
   */
  int getLandingpageDownloadStyle();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 appstore_priority = 16;</code>
   * @return The appstorePriority.
   */
  int getAppstorePriority();

  /**
   * <pre>
   * </pre>
   *
   * <code>string appstore_url = 17;</code>
   * @return The appstoreUrl.
   */
  java.lang.String getAppstoreUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string appstore_url = 17;</code>
   * @return The bytes for appstoreUrl.
   */
  com.google.protobuf.ByteString
      getAppstoreUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 appstore_delay_time = 18;</code>
   * @return The appstoreDelayTime.
   */
  int getAppstoreDelayTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 page_cover_type = 19;</code>
   * @return The pageCoverType.
   */
  int getPageCoverType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 page_pull_type = 20;</code>
   * @return The pagePullType.
   */
  int getPagePullType();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AndroidGamePageRes android_game_page_res = 21;</code>
   * @return Whether the androidGamePageRes field is set.
   */
  boolean hasAndroidGamePageRes();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AndroidGamePageRes android_game_page_res = 21;</code>
   * @return The androidGamePageRes.
   */
  bilibili.ad.v1.AndroidGamePageRes getAndroidGamePageRes();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AndroidGamePageRes android_game_page_res = 21;</code>
   */
  bilibili.ad.v1.AndroidGamePageResOrBuilder getAndroidGamePageResOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.IosGamePageRes ios_game_page_res = 22;</code>
   * @return Whether the iosGamePageRes field is set.
   */
  boolean hasIosGamePageRes();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.IosGamePageRes ios_game_page_res = 22;</code>
   * @return The iosGamePageRes.
   */
  bilibili.ad.v1.IosGamePageRes getIosGamePageRes();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.IosGamePageRes ios_game_page_res = 22;</code>
   */
  bilibili.ad.v1.IosGamePageResOrBuilder getIosGamePageResOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdBusinessMarkDto ad_tag_style = 23;</code>
   * @return Whether the adTagStyle field is set.
   */
  boolean hasAdTagStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdBusinessMarkDto ad_tag_style = 23;</code>
   * @return The adTagStyle.
   */
  bilibili.ad.v1.AdBusinessMarkDto getAdTagStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdBusinessMarkDto ad_tag_style = 23;</code>
   */
  bilibili.ad.v1.AdBusinessMarkDtoOrBuilder getAdTagStyleOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdFeedbackPanelDto feedback_panel = 24;</code>
   * @return Whether the feedbackPanel field is set.
   */
  boolean hasFeedbackPanel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdFeedbackPanelDto feedback_panel = 24;</code>
   * @return The feedbackPanel.
   */
  bilibili.ad.v1.AdFeedbackPanelDto getFeedbackPanel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdFeedbackPanelDto feedback_panel = 24;</code>
   */
  bilibili.ad.v1.AdFeedbackPanelDtoOrBuilder getFeedbackPanelOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 25;</code>
   * @return The adCb.
   */
  java.lang.String getAdCb();
  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 25;</code>
   * @return The bytes for adCb.
   */
  com.google.protobuf.ByteString
      getAdCbBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 url_type = 26;</code>
   * @return The urlType.
   */
  int getUrlType();
}
