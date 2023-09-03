// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface SearchTopGameCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.SearchTopGameCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 array = 3;</code>
   * @return The array.
   */
  int getArray();

  /**
   * <pre>
   * </pre>
   *
   * <code>string background_image = 4;</code>
   * @return The backgroundImage.
   */
  java.lang.String getBackgroundImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string background_image = 4;</code>
   * @return The bytes for backgroundImage.
   */
  com.google.protobuf.ByteString
      getBackgroundImageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 button_type = 5;</code>
   * @return The buttonType.
   */
  int getButtonType();

  /**
   * <pre>
   * </pre>
   *
   * <code>string game_icon = 6;</code>
   * @return The gameIcon.
   */
  java.lang.String getGameIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string game_icon = 6;</code>
   * @return The bytes for gameIcon.
   */
  com.google.protobuf.ByteString
      getGameIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 game_base_id = 7;</code>
   * @return The gameBaseId.
   */
  long getGameBaseId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 game_status = 8;</code>
   * @return The gameStatus.
   */
  int getGameStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>string inline_type = 9;</code>
   * @return The inlineType.
   */
  java.lang.String getInlineType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string inline_type = 9;</code>
   * @return The bytes for inlineType.
   */
  com.google.protobuf.ByteString
      getInlineTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.TopGameUI top_game_ui = 10;</code>
   * @return Whether the topGameUi field is set.
   */
  boolean hasTopGameUi();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.TopGameUI top_game_ui = 10;</code>
   * @return The topGameUi.
   */
  bilibili.polymer.app.search.v1.TopGameUI getTopGameUi();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.TopGameUI top_game_ui = 10;</code>
   */
  bilibili.polymer.app.search.v1.TopGameUIOrBuilder getTopGameUiOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string notice_content = 11;</code>
   * @return The noticeContent.
   */
  java.lang.String getNoticeContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>string notice_content = 11;</code>
   * @return The bytes for noticeContent.
   */
  com.google.protobuf.ByteString
      getNoticeContentBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string notice_name = 12;</code>
   * @return The noticeName.
   */
  java.lang.String getNoticeName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string notice_name = 12;</code>
   * @return The bytes for noticeName.
   */
  com.google.protobuf.ByteString
      getNoticeNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>float rating = 13;</code>
   * @return The rating.
   */
  float getRating();

  /**
   * <pre>
   * </pre>
   *
   * <code>string score = 14;</code>
   * @return The score.
   */
  java.lang.String getScore();
  /**
   * <pre>
   * </pre>
   *
   * <code>string score = 14;</code>
   * @return The bytes for score.
   */
  com.google.protobuf.ByteString
      getScoreBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TabInfo tab_info = 15;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.TabInfo> 
      getTabInfoList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TabInfo tab_info = 15;</code>
   */
  bilibili.polymer.app.search.v1.TabInfo getTabInfo(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TabInfo tab_info = 15;</code>
   */
  int getTabInfoCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TabInfo tab_info = 15;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.TabInfoOrBuilder> 
      getTabInfoOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TabInfo tab_info = 15;</code>
   */
  bilibili.polymer.app.search.v1.TabInfoOrBuilder getTabInfoOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string tags = 16;</code>
   * @return The tags.
   */
  java.lang.String getTags();
  /**
   * <pre>
   * </pre>
   *
   * <code>string tags = 16;</code>
   * @return The bytes for tags.
   */
  com.google.protobuf.ByteString
      getTagsBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData ugc_inline = 17;</code>
   * @return Whether the ugcInline field is set.
   */
  boolean hasUgcInline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData ugc_inline = 17;</code>
   * @return The ugcInline.
   */
  bilibili.polymer.app.search.v1.SearchInlineData getUgcInline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData ugc_inline = 17;</code>
   */
  bilibili.polymer.app.search.v1.SearchInlineDataOrBuilder getUgcInlineOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string video_cover_image = 18;</code>
   * @return The videoCoverImage.
   */
  java.lang.String getVideoCoverImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string video_cover_image = 18;</code>
   * @return The bytes for videoCoverImage.
   */
  com.google.protobuf.ByteString
      getVideoCoverImageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData inline_live = 19;</code>
   * @return Whether the inlineLive field is set.
   */
  boolean hasInlineLive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData inline_live = 19;</code>
   * @return The inlineLive.
   */
  bilibili.polymer.app.search.v1.SearchInlineData getInlineLive();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.SearchInlineData inline_live = 19;</code>
   */
  bilibili.polymer.app.search.v1.SearchInlineDataOrBuilder getInlineLiveOrBuilder();
}
