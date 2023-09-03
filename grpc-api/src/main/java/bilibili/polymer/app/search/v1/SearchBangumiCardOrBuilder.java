// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface SearchBangumiCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.SearchBangumiCard)
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
   * <code>int32 media_type = 3;</code>
   * @return The mediaType.
   */
  int getMediaType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 play_state = 4;</code>
   * @return The playState.
   */
  int getPlayState();

  /**
   * <pre>
   * </pre>
   *
   * <code>string area = 5;</code>
   * @return The area.
   */
  java.lang.String getArea();
  /**
   * <pre>
   * </pre>
   *
   * <code>string area = 5;</code>
   * @return The bytes for area.
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string style = 6;</code>
   * @return The style.
   */
  java.lang.String getStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string style = 6;</code>
   * @return The bytes for style.
   */
  com.google.protobuf.ByteString
      getStyleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string styles = 7;</code>
   * @return The styles.
   */
  java.lang.String getStyles();
  /**
   * <pre>
   * </pre>
   *
   * <code>string styles = 7;</code>
   * @return The bytes for styles.
   */
  com.google.protobuf.ByteString
      getStylesBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cv = 8;</code>
   * @return The cv.
   */
  java.lang.String getCv();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cv = 8;</code>
   * @return The bytes for cv.
   */
  com.google.protobuf.ByteString
      getCvBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>double rating = 9;</code>
   * @return The rating.
   */
  double getRating();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 vote = 10;</code>
   * @return The vote.
   */
  int getVote();

  /**
   * <pre>
   * </pre>
   *
   * <code>string target = 11;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * </pre>
   *
   * <code>string target = 11;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string staff = 12;</code>
   * @return The staff.
   */
  java.lang.String getStaff();
  /**
   * <pre>
   * </pre>
   *
   * <code>string staff = 12;</code>
   * @return The bytes for staff.
   */
  com.google.protobuf.ByteString
      getStaffBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string prompt = 13;</code>
   * @return The prompt.
   */
  java.lang.String getPrompt();
  /**
   * <pre>
   * </pre>
   *
   * <code>string prompt = 13;</code>
   * @return The bytes for prompt.
   */
  com.google.protobuf.ByteString
      getPromptBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 ptime = 14;</code>
   * @return The ptime.
   */
  long getPtime();

  /**
   * <pre>
   * </pre>
   *
   * <code>string season_type_name = 15;</code>
   * @return The seasonTypeName.
   */
  java.lang.String getSeasonTypeName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string season_type_name = 15;</code>
   * @return The bytes for seasonTypeName.
   */
  com.google.protobuf.ByteString
      getSeasonTypeNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Episode episodes = 16;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.Episode> 
      getEpisodesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Episode episodes = 16;</code>
   */
  bilibili.polymer.app.search.v1.Episode getEpisodes(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Episode episodes = 16;</code>
   */
  int getEpisodesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Episode episodes = 16;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.EpisodeOrBuilder> 
      getEpisodesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.Episode episodes = 16;</code>
   */
  bilibili.polymer.app.search.v1.EpisodeOrBuilder getEpisodesOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_selection = 17;</code>
   * @return The isSelection.
   */
  int getIsSelection();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_atten = 18;</code>
   * @return The isAtten.
   */
  int getIsAtten();

  /**
   * <pre>
   * </pre>
   *
   * <code>string label = 19;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * </pre>
   *
   * <code>string label = 19;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 season_id = 20;</code>
   * @return The seasonId.
   */
  long getSeasonId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string out_name = 21;</code>
   * @return The outName.
   */
  java.lang.String getOutName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string out_name = 21;</code>
   * @return The bytes for outName.
   */
  com.google.protobuf.ByteString
      getOutNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string out_icon = 22;</code>
   * @return The outIcon.
   */
  java.lang.String getOutIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string out_icon = 22;</code>
   * @return The bytes for outIcon.
   */
  com.google.protobuf.ByteString
      getOutIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string out_url = 23;</code>
   * @return The outUrl.
   */
  java.lang.String getOutUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string out_url = 23;</code>
   * @return The bytes for outUrl.
   */
  com.google.protobuf.ByteString
      getOutUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges = 24;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.ReasonStyle> 
      getBadgesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges = 24;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyle getBadges(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges = 24;</code>
   */
  int getBadgesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges = 24;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> 
      getBadgesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges = 24;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getBadgesOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_out = 25;</code>
   * @return The isOut.
   */
  int getIsOut();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.EpisodeNew episodes_new = 26;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.EpisodeNew> 
      getEpisodesNewList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.EpisodeNew episodes_new = 26;</code>
   */
  bilibili.polymer.app.search.v1.EpisodeNew getEpisodesNew(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.EpisodeNew episodes_new = 26;</code>
   */
  int getEpisodesNewCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.EpisodeNew episodes_new = 26;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.EpisodeNewOrBuilder> 
      getEpisodesNewOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.EpisodeNew episodes_new = 26;</code>
   */
  bilibili.polymer.app.search.v1.EpisodeNewOrBuilder getEpisodesNewOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.WatchButton watch_button = 27;</code>
   * @return Whether the watchButton field is set.
   */
  boolean hasWatchButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.WatchButton watch_button = 27;</code>
   * @return The watchButton.
   */
  bilibili.polymer.app.search.v1.WatchButton getWatchButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.WatchButton watch_button = 27;</code>
   */
  bilibili.polymer.app.search.v1.WatchButtonOrBuilder getWatchButtonOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string selection_style = 28;</code>
   * @return The selectionStyle.
   */
  java.lang.String getSelectionStyle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string selection_style = 28;</code>
   * @return The bytes for selectionStyle.
   */
  com.google.protobuf.ByteString
      getSelectionStyleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CheckMore check_more = 29;</code>
   * @return Whether the checkMore field is set.
   */
  boolean hasCheckMore();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CheckMore check_more = 29;</code>
   * @return The checkMore.
   */
  bilibili.polymer.app.search.v1.CheckMore getCheckMore();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CheckMore check_more = 29;</code>
   */
  bilibili.polymer.app.search.v1.CheckMoreOrBuilder getCheckMoreOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.FollowButton follow_button = 30;</code>
   * @return Whether the followButton field is set.
   */
  boolean hasFollowButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.FollowButton follow_button = 30;</code>
   * @return The followButton.
   */
  bilibili.polymer.app.search.v1.FollowButton getFollowButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.FollowButton follow_button = 30;</code>
   */
  bilibili.polymer.app.search.v1.FollowButtonOrBuilder getFollowButtonOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle style_label = 31;</code>
   * @return Whether the styleLabel field is set.
   */
  boolean hasStyleLabel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle style_label = 31;</code>
   * @return The styleLabel.
   */
  bilibili.polymer.app.search.v1.ReasonStyle getStyleLabel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.ReasonStyle style_label = 31;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getStyleLabelOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges_v2 = 32;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.ReasonStyle> 
      getBadgesV2List();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges_v2 = 32;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyle getBadgesV2(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges_v2 = 32;</code>
   */
  int getBadgesV2Count();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges_v2 = 32;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> 
      getBadgesV2OrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle badges_v2 = 32;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getBadgesV2OrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string styles_v2 = 33;</code>
   * @return The stylesV2.
   */
  java.lang.String getStylesV2();
  /**
   * <pre>
   * </pre>
   *
   * <code>string styles_v2 = 33;</code>
   * @return The bytes for stylesV2.
   */
  com.google.protobuf.ByteString
      getStylesV2Bytes();
}
