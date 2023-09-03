// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface ViewReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.ViewReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 稿件信息
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc arc = 1;</code>
   * @return Whether the arc field is set.
   */
  boolean hasArc();
  /**
   * <pre>
   * 稿件信息
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc arc = 1;</code>
   * @return The arc.
   */
  bilibili.app.archive.v1.Arc getArc();
  /**
   * <pre>
   * 稿件信息
   * </pre>
   *
   * <code>.bilibili.app.archive.v1.Arc arc = 1;</code>
   */
  bilibili.app.archive.v1.ArcOrBuilder getArcOrBuilder();

  /**
   * <pre>
   * 分P信息
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewPage pages = 2;</code>
   */
  java.util.List<bilibili.app.view.v1.ViewPage> 
      getPagesList();
  /**
   * <pre>
   * 分P信息
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewPage pages = 2;</code>
   */
  bilibili.app.view.v1.ViewPage getPages(int index);
  /**
   * <pre>
   * 分P信息
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewPage pages = 2;</code>
   */
  int getPagesCount();
  /**
   * <pre>
   * 分P信息
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewPage pages = 2;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.ViewPageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <pre>
   * 分P信息
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewPage pages = 2;</code>
   */
  bilibili.app.view.v1.ViewPageOrBuilder getPagesOrBuilder(
      int index);

  /**
   * <pre>
   * UP主扩展信息 ("OnwerExt"为源码中拼写错误)
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OnwerExt owner_ext = 3;</code>
   * @return Whether the ownerExt field is set.
   */
  boolean hasOwnerExt();
  /**
   * <pre>
   * UP主扩展信息 ("OnwerExt"为源码中拼写错误)
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OnwerExt owner_ext = 3;</code>
   * @return The ownerExt.
   */
  bilibili.app.view.v1.OnwerExt getOwnerExt();
  /**
   * <pre>
   * UP主扩展信息 ("OnwerExt"为源码中拼写错误)
   * </pre>
   *
   * <code>.bilibili.app.view.v1.OnwerExt owner_ext = 3;</code>
   */
  bilibili.app.view.v1.OnwerExtOrBuilder getOwnerExtOrBuilder();

  /**
   * <pre>
   * 稿件用户操作状态
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReqUser req_user = 4;</code>
   * @return Whether the reqUser field is set.
   */
  boolean hasReqUser();
  /**
   * <pre>
   * 稿件用户操作状态
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReqUser req_user = 4;</code>
   * @return The reqUser.
   */
  bilibili.app.view.v1.ReqUser getReqUser();
  /**
   * <pre>
   * 稿件用户操作状态
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReqUser req_user = 4;</code>
   */
  bilibili.app.view.v1.ReqUserOrBuilder getReqUserOrBuilder();

  /**
   * <pre>
   * 稿件TAG
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag tag = 5;</code>
   */
  java.util.List<bilibili.app.view.v1.Tag> 
      getTagList();
  /**
   * <pre>
   * 稿件TAG
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag tag = 5;</code>
   */
  bilibili.app.view.v1.Tag getTag(int index);
  /**
   * <pre>
   * 稿件TAG
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag tag = 5;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 稿件TAG
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag tag = 5;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.TagOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 稿件TAG
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag tag = 5;</code>
   */
  bilibili.app.view.v1.TagOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * TAG对应的图标
   * </pre>
   *
   * <code>map&lt;string, .bilibili.app.view.v1.TIcon&gt; t_icon = 6;</code>
   */
  int getTIconCount();
  /**
   * <pre>
   * TAG对应的图标
   * </pre>
   *
   * <code>map&lt;string, .bilibili.app.view.v1.TIcon&gt; t_icon = 6;</code>
   */
  boolean containsTIcon(
      java.lang.String key);
  /**
   * Use {@link #getTIconMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, bilibili.app.view.v1.TIcon>
  getTIcon();
  /**
   * <pre>
   * TAG对应的图标
   * </pre>
   *
   * <code>map&lt;string, .bilibili.app.view.v1.TIcon&gt; t_icon = 6;</code>
   */
  java.util.Map<java.lang.String, bilibili.app.view.v1.TIcon>
  getTIconMap();
  /**
   * <pre>
   * TAG对应的图标
   * </pre>
   *
   * <code>map&lt;string, .bilibili.app.view.v1.TIcon&gt; t_icon = 6;</code>
   */
  /* nullable */
bilibili.app.view.v1.TIcon getTIconOrDefault(
      java.lang.String key,
      /* nullable */
bilibili.app.view.v1.TIcon defaultValue);
  /**
   * <pre>
   * TAG对应的图标
   * </pre>
   *
   * <code>map&lt;string, .bilibili.app.view.v1.TIcon&gt; t_icon = 6;</code>
   */
  bilibili.app.view.v1.TIcon getTIconOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 稿件映射的PGC剧集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Season season = 7;</code>
   * @return Whether the season field is set.
   */
  boolean hasSeason();
  /**
   * <pre>
   * 稿件映射的PGC剧集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Season season = 7;</code>
   * @return The season.
   */
  bilibili.app.view.v1.Season getSeason();
  /**
   * <pre>
   * 稿件映射的PGC剧集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Season season = 7;</code>
   */
  bilibili.app.view.v1.SeasonOrBuilder getSeasonOrBuilder();

  /**
   * <pre>
   * 充电排行
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ElecRank elec_rank = 8;</code>
   * @return Whether the elecRank field is set.
   */
  boolean hasElecRank();
  /**
   * <pre>
   * 充电排行
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ElecRank elec_rank = 8;</code>
   * @return The elecRank.
   */
  bilibili.app.view.v1.ElecRank getElecRank();
  /**
   * <pre>
   * 充电排行
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ElecRank elec_rank = 8;</code>
   */
  bilibili.app.view.v1.ElecRankOrBuilder getElecRankOrBuilder();

  /**
   * <pre>
   * 历史观看进度
   * </pre>
   *
   * <code>.bilibili.app.view.v1.History history = 9;</code>
   * @return Whether the history field is set.
   */
  boolean hasHistory();
  /**
   * <pre>
   * 历史观看进度
   * </pre>
   *
   * <code>.bilibili.app.view.v1.History history = 9;</code>
   * @return The history.
   */
  bilibili.app.view.v1.History getHistory();
  /**
   * <pre>
   * 历史观看进度
   * </pre>
   *
   * <code>.bilibili.app.view.v1.History history = 9;</code>
   */
  bilibili.app.view.v1.HistoryOrBuilder getHistoryOrBuilder();

  /**
   * <pre>
   * 视频相关推荐列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate relates = 10;</code>
   */
  java.util.List<bilibili.app.view.v1.Relate> 
      getRelatesList();
  /**
   * <pre>
   * 视频相关推荐列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate relates = 10;</code>
   */
  bilibili.app.view.v1.Relate getRelates(int index);
  /**
   * <pre>
   * 视频相关推荐列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate relates = 10;</code>
   */
  int getRelatesCount();
  /**
   * <pre>
   * 视频相关推荐列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate relates = 10;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.RelateOrBuilder> 
      getRelatesOrBuilderList();
  /**
   * <pre>
   * 视频相关推荐列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Relate relates = 10;</code>
   */
  bilibili.app.view.v1.RelateOrBuilder getRelatesOrBuilder(
      int index);

  /**
   * <pre>
   * 不感兴趣原因
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Dislike dislike = 11;</code>
   * @return Whether the dislike field is set.
   */
  boolean hasDislike();
  /**
   * <pre>
   * 不感兴趣原因
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Dislike dislike = 11;</code>
   * @return The dislike.
   */
  bilibili.app.view.v1.Dislike getDislike();
  /**
   * <pre>
   * 不感兴趣原因
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Dislike dislike = 11;</code>
   */
  bilibili.app.view.v1.DislikeOrBuilder getDislikeOrBuilder();

  /**
   * <pre>
   * 播放图标动画配置档
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PlayerIcon player_icon = 12;</code>
   * @return Whether the playerIcon field is set.
   */
  boolean hasPlayerIcon();
  /**
   * <pre>
   * 播放图标动画配置档
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PlayerIcon player_icon = 12;</code>
   * @return The playerIcon.
   */
  bilibili.app.view.v1.PlayerIcon getPlayerIcon();
  /**
   * <pre>
   * 播放图标动画配置档
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PlayerIcon player_icon = 12;</code>
   */
  bilibili.app.view.v1.PlayerIconOrBuilder getPlayerIconOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_active = 13;</code>
   * @return The vipActive.
   */
  java.lang.String getVipActive();
  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_active = 13;</code>
   * @return The bytes for vipActive.
   */
  com.google.protobuf.ByteString
      getVipActiveBytes();

  /**
   * <pre>
   * 稿件bvid
   * </pre>
   *
   * <code>string bvid = 14;</code>
   * @return The bvid.
   */
  java.lang.String getBvid();
  /**
   * <pre>
   * 稿件bvid
   * </pre>
   *
   * <code>string bvid = 14;</code>
   * @return The bytes for bvid.
   */
  com.google.protobuf.ByteString
      getBvidBytes();

  /**
   * <pre>
   * 获得荣誉信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Honor honor = 15;</code>
   * @return Whether the honor field is set.
   */
  boolean hasHonor();
  /**
   * <pre>
   * 获得荣誉信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Honor honor = 15;</code>
   * @return The honor.
   */
  bilibili.app.view.v1.Honor getHonor();
  /**
   * <pre>
   * 获得荣誉信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Honor honor = 15;</code>
   */
  bilibili.app.view.v1.HonorOrBuilder getHonorOrBuilder();

  /**
   * <pre>
   * 相关推荐顶部tab
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateTab relate_tab = 16;</code>
   */
  java.util.List<bilibili.app.view.v1.RelateTab> 
      getRelateTabList();
  /**
   * <pre>
   * 相关推荐顶部tab
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateTab relate_tab = 16;</code>
   */
  bilibili.app.view.v1.RelateTab getRelateTab(int index);
  /**
   * <pre>
   * 相关推荐顶部tab
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateTab relate_tab = 16;</code>
   */
  int getRelateTabCount();
  /**
   * <pre>
   * 相关推荐顶部tab
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateTab relate_tab = 16;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.RelateTabOrBuilder> 
      getRelateTabOrBuilderList();
  /**
   * <pre>
   * 相关推荐顶部tab
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.RelateTab relate_tab = 16;</code>
   */
  bilibili.app.view.v1.RelateTabOrBuilder getRelateTabOrBuilder(
      int index);

  /**
   * <pre>
   * 参与的活动页面url
   * </pre>
   *
   * <code>string activity_url = 17;</code>
   * @return The activityUrl.
   */
  java.lang.String getActivityUrl();
  /**
   * <pre>
   * 参与的活动页面url
   * </pre>
   *
   * <code>string activity_url = 17;</code>
   * @return The bytes for activityUrl.
   */
  com.google.protobuf.ByteString
      getActivityUrlBytes();

  /**
   * <pre>
   * 稿件引用bgm列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Bgm bgm = 18;</code>
   */
  java.util.List<bilibili.app.view.v1.Bgm> 
      getBgmList();
  /**
   * <pre>
   * 稿件引用bgm列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Bgm bgm = 18;</code>
   */
  bilibili.app.view.v1.Bgm getBgm(int index);
  /**
   * <pre>
   * 稿件引用bgm列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Bgm bgm = 18;</code>
   */
  int getBgmCount();
  /**
   * <pre>
   * 稿件引用bgm列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Bgm bgm = 18;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.BgmOrBuilder> 
      getBgmOrBuilderList();
  /**
   * <pre>
   * 稿件引用bgm列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Bgm bgm = 18;</code>
   */
  bilibili.app.view.v1.BgmOrBuilder getBgmOrBuilder(
      int index);

  /**
   * <pre>
   * 联合投稿成员列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Staff staff = 19;</code>
   */
  java.util.List<bilibili.app.view.v1.Staff> 
      getStaffList();
  /**
   * <pre>
   * 联合投稿成员列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Staff staff = 19;</code>
   */
  bilibili.app.view.v1.Staff getStaff(int index);
  /**
   * <pre>
   * 联合投稿成员列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Staff staff = 19;</code>
   */
  int getStaffCount();
  /**
   * <pre>
   * 联合投稿成员列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Staff staff = 19;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.StaffOrBuilder> 
      getStaffOrBuilderList();
  /**
   * <pre>
   * 联合投稿成员列表
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Staff staff = 19;</code>
   */
  bilibili.app.view.v1.StaffOrBuilder getStaffOrBuilder(
      int index);

  /**
   * <pre>
   * 争议信息
   * </pre>
   *
   * <code>string argue_msg = 20;</code>
   * @return The argueMsg.
   */
  java.lang.String getArgueMsg();
  /**
   * <pre>
   * 争议信息
   * </pre>
   *
   * <code>string argue_msg = 20;</code>
   * @return The bytes for argueMsg.
   */
  com.google.protobuf.ByteString
      getArgueMsgBytes();

  /**
   * <pre>
   * 短链接
   * </pre>
   *
   * <code>string short_link = 21;</code>
   * @return The shortLink.
   */
  java.lang.String getShortLink();
  /**
   * <pre>
   * 短链接
   * </pre>
   *
   * <code>string short_link = 21;</code>
   * @return The bytes for shortLink.
   */
  com.google.protobuf.ByteString
      getShortLinkBytes();

  /**
   * <pre>
   * 播放实验
   * 1:相关推荐自动播放
   * </pre>
   *
   * <code>int32 play_param = 22;</code>
   * @return The playParam.
   */
  int getPlayParam();

  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Label label = 23;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Label label = 23;</code>
   * @return The label.
   */
  bilibili.app.view.v1.Label getLabel();
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Label label = 23;</code>
   */
  bilibili.app.view.v1.LabelOrBuilder getLabelOrBuilder();

  /**
   * <pre>
   * UGC视频合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason ugc_season = 24;</code>
   * @return Whether the ugcSeason field is set.
   */
  boolean hasUgcSeason();
  /**
   * <pre>
   * UGC视频合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason ugc_season = 24;</code>
   * @return The ugcSeason.
   */
  bilibili.app.view.v1.UgcSeason getUgcSeason();
  /**
   * <pre>
   * UGC视频合集信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UgcSeason ugc_season = 24;</code>
   */
  bilibili.app.view.v1.UgcSeasonOrBuilder getUgcSeasonOrBuilder();

  /**
   * <pre>
   * 配置信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Config config = 25;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * 配置信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Config config = 25;</code>
   * @return The config.
   */
  bilibili.app.view.v1.Config getConfig();
  /**
   * <pre>
   * 配置信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Config config = 25;</code>
   */
  bilibili.app.view.v1.ConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * 分享副标题(已观看xxx次)
   * </pre>
   *
   * <code>string share_subtitle = 26;</code>
   * @return The shareSubtitle.
   */
  java.lang.String getShareSubtitle();
  /**
   * <pre>
   * 分享副标题(已观看xxx次)
   * </pre>
   *
   * <code>string share_subtitle = 26;</code>
   * @return The bytes for shareSubtitle.
   */
  com.google.protobuf.ByteString
      getShareSubtitleBytes();

  /**
   * <pre>
   * 互动视频信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Interaction interaction = 27;</code>
   * @return Whether the interaction field is set.
   */
  boolean hasInteraction();
  /**
   * <pre>
   * 互动视频信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Interaction interaction = 27;</code>
   * @return The interaction.
   */
  bilibili.app.view.v1.Interaction getInteraction();
  /**
   * <pre>
   * 互动视频信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Interaction interaction = 27;</code>
   */
  bilibili.app.view.v1.InteractionOrBuilder getInteractionOrBuilder();

  /**
   * <pre>
   * 错误码
   * DEFAULT:正常 CODE404:视频被UP主删除
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ECode ecode = 28;</code>
   * @return The enum numeric value on the wire for ecode.
   */
  int getEcodeValue();
  /**
   * <pre>
   * 错误码
   * DEFAULT:正常 CODE404:视频被UP主删除
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ECode ecode = 28;</code>
   * @return The ecode.
   */
  bilibili.app.view.v1.ECode getEcode();

  /**
   * <pre>
   * 404页信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CustomConfig custom_config = 29;</code>
   * @return Whether the customConfig field is set.
   */
  boolean hasCustomConfig();
  /**
   * <pre>
   * 404页信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CustomConfig custom_config = 29;</code>
   * @return The customConfig.
   */
  bilibili.app.view.v1.CustomConfig getCustomConfig();
  /**
   * <pre>
   * 404页信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CustomConfig custom_config = 29;</code>
   */
  bilibili.app.view.v1.CustomConfigOrBuilder getCustomConfigOrBuilder();

  /**
   * <pre>
   * 广告
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.CM cms = 30;</code>
   */
  java.util.List<bilibili.app.view.v1.CM> 
      getCmsList();
  /**
   * <pre>
   * 广告
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.CM cms = 30;</code>
   */
  bilibili.app.view.v1.CM getCms(int index);
  /**
   * <pre>
   * 广告
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.CM cms = 30;</code>
   */
  int getCmsCount();
  /**
   * <pre>
   * 广告
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.CM cms = 30;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.CMOrBuilder> 
      getCmsOrBuilderList();
  /**
   * <pre>
   * 广告
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.CM cms = 30;</code>
   */
  bilibili.app.view.v1.CMOrBuilder getCmsOrBuilder(
      int index);

  /**
   * <pre>
   * 广告配置
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CMConfig cm_config = 31;</code>
   * @return Whether the cmConfig field is set.
   */
  boolean hasCmConfig();
  /**
   * <pre>
   * 广告配置
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CMConfig cm_config = 31;</code>
   * @return The cmConfig.
   */
  bilibili.app.view.v1.CMConfig getCmConfig();
  /**
   * <pre>
   * 广告配置
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CMConfig cm_config = 31;</code>
   */
  bilibili.app.view.v1.CMConfigOrBuilder getCmConfigOrBuilder();

  /**
   * <pre>
   * 播放页定制tab
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Tab tab = 32;</code>
   * @return Whether the tab field is set.
   */
  boolean hasTab();
  /**
   * <pre>
   * 播放页定制tab
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Tab tab = 32;</code>
   * @return The tab.
   */
  bilibili.app.view.v1.Tab getTab();
  /**
   * <pre>
   * 播放页定制tab
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Tab tab = 32;</code>
   */
  bilibili.app.view.v1.TabOrBuilder getTabOrBuilder();

  /**
   * <pre>
   * 排行榜
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Rank rank = 33;</code>
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   * <pre>
   * 排行榜
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Rank rank = 33;</code>
   * @return The rank.
   */
  bilibili.app.view.v1.Rank getRank();
  /**
   * <pre>
   * 排行榜
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Rank rank = 33;</code>
   */
  bilibili.app.view.v1.RankOrBuilder getRankOrBuilder();

  /**
   * <pre>
   * 免流面板定制
   * </pre>
   *
   * <code>.bilibili.app.view.v1.TFPanelCustomized tf_panel_customized = 34;</code>
   * @return Whether the tfPanelCustomized field is set.
   */
  boolean hasTfPanelCustomized();
  /**
   * <pre>
   * 免流面板定制
   * </pre>
   *
   * <code>.bilibili.app.view.v1.TFPanelCustomized tf_panel_customized = 34;</code>
   * @return The tfPanelCustomized.
   */
  bilibili.app.view.v1.TFPanelCustomized getTfPanelCustomized();
  /**
   * <pre>
   * 免流面板定制
   * </pre>
   *
   * <code>.bilibili.app.view.v1.TFPanelCustomized tf_panel_customized = 34;</code>
   */
  bilibili.app.view.v1.TFPanelCustomizedOrBuilder getTfPanelCustomizedOrBuilder();

  /**
   * <pre>
   * UP主发起活动
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpAct up_act = 35;</code>
   * @return Whether the upAct field is set.
   */
  boolean hasUpAct();
  /**
   * <pre>
   * UP主发起活动
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpAct up_act = 35;</code>
   * @return The upAct.
   */
  bilibili.app.view.v1.UpAct getUpAct();
  /**
   * <pre>
   * UP主发起活动
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpAct up_act = 35;</code>
   */
  bilibili.app.view.v1.UpActOrBuilder getUpActOrBuilder();

  /**
   * <pre>
   * 用户装扮
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UserGarb user_garb = 36;</code>
   * @return Whether the userGarb field is set.
   */
  boolean hasUserGarb();
  /**
   * <pre>
   * 用户装扮
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UserGarb user_garb = 36;</code>
   * @return The userGarb.
   */
  bilibili.app.view.v1.UserGarb getUserGarb();
  /**
   * <pre>
   * 用户装扮
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UserGarb user_garb = 36;</code>
   */
  bilibili.app.view.v1.UserGarbOrBuilder getUserGarbOrBuilder();

  /**
   * <pre>
   * 大型活动合集
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ActivitySeason activity_season = 37;</code>
   * @return Whether the activitySeason field is set.
   */
  boolean hasActivitySeason();
  /**
   * <pre>
   * 大型活动合集
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ActivitySeason activity_season = 37;</code>
   * @return The activitySeason.
   */
  bilibili.app.view.v1.ActivitySeason getActivitySeason();
  /**
   * <pre>
   * 大型活动合集
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ActivitySeason activity_season = 37;</code>
   */
  bilibili.app.view.v1.ActivitySeasonOrBuilder getActivitySeasonOrBuilder();

  /**
   * <pre>
   * 评论样式
   * </pre>
   *
   * <code>string badge_url = 38;</code>
   * @return The badgeUrl.
   */
  java.lang.String getBadgeUrl();
  /**
   * <pre>
   * 评论样式
   * </pre>
   *
   * <code>string badge_url = 38;</code>
   * @return The bytes for badgeUrl.
   */
  com.google.protobuf.ByteString
      getBadgeUrlBytes();

  /**
   * <pre>
   * 直播预约信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LiveOrderInfo live_order_info = 39;</code>
   * @return Whether the liveOrderInfo field is set.
   */
  boolean hasLiveOrderInfo();
  /**
   * <pre>
   * 直播预约信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LiveOrderInfo live_order_info = 39;</code>
   * @return The liveOrderInfo.
   */
  bilibili.app.view.v1.LiveOrderInfo getLiveOrderInfo();
  /**
   * <pre>
   * 直播预约信息
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LiveOrderInfo live_order_info = 39;</code>
   */
  bilibili.app.view.v1.LiveOrderInfoOrBuilder getLiveOrderInfoOrBuilder();

  /**
   * <pre>
   * 稿件简介v2
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.DescV2 desc_v2 = 40;</code>
   */
  java.util.List<bilibili.app.view.v1.DescV2> 
      getDescV2List();
  /**
   * <pre>
   * 稿件简介v2
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.DescV2 desc_v2 = 40;</code>
   */
  bilibili.app.view.v1.DescV2 getDescV2(int index);
  /**
   * <pre>
   * 稿件简介v2
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.DescV2 desc_v2 = 40;</code>
   */
  int getDescV2Count();
  /**
   * <pre>
   * 稿件简介v2
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.DescV2 desc_v2 = 40;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.DescV2OrBuilder> 
      getDescV2OrBuilderList();
  /**
   * <pre>
   * 稿件简介v2
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.DescV2 desc_v2 = 40;</code>
   */
  bilibili.app.view.v1.DescV2OrBuilder getDescV2OrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CmIpad cm_ipad = 41;</code>
   * @return Whether the cmIpad field is set.
   */
  boolean hasCmIpad();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CmIpad cm_ipad = 41;</code>
   * @return The cmIpad.
   */
  bilibili.app.view.v1.CmIpad getCmIpad();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CmIpad cm_ipad = 41;</code>
   */
  bilibili.app.view.v1.CmIpadOrBuilder getCmIpadOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial sticker = 42;</code>
   */
  java.util.List<bilibili.app.view.v1.ViewMaterial> 
      getStickerList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial sticker = 42;</code>
   */
  bilibili.app.view.v1.ViewMaterial getSticker(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial sticker = 42;</code>
   */
  int getStickerCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial sticker = 42;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.ViewMaterialOrBuilder> 
      getStickerOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial sticker = 42;</code>
   */
  bilibili.app.view.v1.ViewMaterialOrBuilder getStickerOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpLikeImg up_like_img = 43;</code>
   * @return Whether the upLikeImg field is set.
   */
  boolean hasUpLikeImg();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpLikeImg up_like_img = 43;</code>
   * @return The upLikeImg.
   */
  bilibili.app.view.v1.UpLikeImg getUpLikeImg();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.UpLikeImg up_like_img = 43;</code>
   */
  bilibili.app.view.v1.UpLikeImgOrBuilder getUpLikeImgOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeCustom like_custom = 44;</code>
   * @return Whether the likeCustom field is set.
   */
  boolean hasLikeCustom();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeCustom like_custom = 44;</code>
   * @return The likeCustom.
   */
  bilibili.app.view.v1.LikeCustom getLikeCustom();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeCustom like_custom = 44;</code>
   */
  bilibili.app.view.v1.LikeCustomOrBuilder getLikeCustomOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag desc_tag = 45;</code>
   */
  java.util.List<bilibili.app.view.v1.Tag> 
      getDescTagList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag desc_tag = 45;</code>
   */
  bilibili.app.view.v1.Tag getDescTag(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag desc_tag = 45;</code>
   */
  int getDescTagCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag desc_tag = 45;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.TagOrBuilder> 
      getDescTagOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.Tag desc_tag = 45;</code>
   */
  bilibili.app.view.v1.TagOrBuilder getDescTagOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.SpecialCell special_cell = 46;</code>
   * @return Whether the specialCell field is set.
   */
  boolean hasSpecialCell();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.SpecialCell special_cell = 46;</code>
   * @return The specialCell.
   */
  bilibili.app.view.v1.SpecialCell getSpecialCell();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.SpecialCell special_cell = 46;</code>
   */
  bilibili.app.view.v1.SpecialCellOrBuilder getSpecialCellOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Online online = 47;</code>
   * @return Whether the online field is set.
   */
  boolean hasOnline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Online online = 47;</code>
   * @return The online.
   */
  bilibili.app.view.v1.Online getOnline();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.Online online = 47;</code>
   */
  bilibili.app.view.v1.OnlineOrBuilder getOnlineOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any cm_under_player = 48;</code>
   * @return Whether the cmUnderPlayer field is set.
   */
  boolean hasCmUnderPlayer();
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any cm_under_player = 48;</code>
   * @return The cmUnderPlayer.
   */
  com.google.protobuf.Any getCmUnderPlayer();
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any cm_under_player = 48;</code>
   */
  com.google.protobuf.AnyOrBuilder getCmUnderPlayerOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial video_source = 49;</code>
   */
  java.util.List<bilibili.app.view.v1.ViewMaterial> 
      getVideoSourceList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial video_source = 49;</code>
   */
  bilibili.app.view.v1.ViewMaterial getVideoSource(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial video_source = 49;</code>
   */
  int getVideoSourceCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial video_source = 49;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.ViewMaterialOrBuilder> 
      getVideoSourceOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.ViewMaterial video_source = 49;</code>
   */
  bilibili.app.view.v1.ViewMaterialOrBuilder getVideoSourceOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.SpecialCell special_cell_new = 50;</code>
   */
  java.util.List<bilibili.app.view.v1.SpecialCell> 
      getSpecialCellNewList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.SpecialCell special_cell_new = 50;</code>
   */
  bilibili.app.view.v1.SpecialCell getSpecialCellNew(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.SpecialCell special_cell_new = 50;</code>
   */
  int getSpecialCellNewCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.SpecialCell special_cell_new = 50;</code>
   */
  java.util.List<? extends bilibili.app.view.v1.SpecialCellOrBuilder> 
      getSpecialCellNewOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.view.v1.SpecialCell special_cell_new = 50;</code>
   */
  bilibili.app.view.v1.SpecialCellOrBuilder getSpecialCellNewOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereResource premiere = 51;</code>
   * @return Whether the premiere field is set.
   */
  boolean hasPremiere();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereResource premiere = 51;</code>
   * @return The premiere.
   */
  bilibili.app.view.v1.PremiereResource getPremiere();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PremiereResource premiere = 51;</code>
   */
  bilibili.app.view.v1.PremiereResourceOrBuilder getPremiereOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool refresh_special_cell = 52;</code>
   * @return The refreshSpecialCell.
   */
  boolean getRefreshSpecialCell();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.MaterialLeft material_left = 53;</code>
   * @return Whether the materialLeft field is set.
   */
  boolean hasMaterialLeft();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.MaterialLeft material_left = 53;</code>
   * @return The materialLeft.
   */
  bilibili.app.view.v1.MaterialLeft getMaterialLeft();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.MaterialLeft material_left = 53;</code>
   */
  bilibili.app.view.v1.MaterialLeftOrBuilder getMaterialLeftOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 notes_count = 54;</code>
   * @return The notesCount.
   */
  long getNotesCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PullClientAction pull_action = 55;</code>
   * @return Whether the pullAction field is set.
   */
  boolean hasPullAction();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PullClientAction pull_action = 55;</code>
   * @return The pullAction.
   */
  bilibili.app.view.v1.PullClientAction getPullAction();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.PullClientAction pull_action = 55;</code>
   */
  bilibili.app.view.v1.PullClientActionOrBuilder getPullActionOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ArcExtra arc_extra = 56;</code>
   * @return Whether the arcExtra field is set.
   */
  boolean hasArcExtra();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ArcExtra arc_extra = 56;</code>
   * @return The arcExtra.
   */
  bilibili.app.view.v1.ArcExtra getArcExtra();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ArcExtra arc_extra = 56;</code>
   */
  bilibili.app.view.v1.ArcExtraOrBuilder getArcExtraOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 57;</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 57;</code>
   * @return The pagination.
   */
  bilibili.pagination.PaginationReply getPagination();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pagination.PaginationReply pagination = 57;</code>
   */
  bilibili.pagination.PaginationReplyOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeAnimation like_animation = 58;</code>
   * @return Whether the likeAnimation field is set.
   */
  boolean hasLikeAnimation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeAnimation like_animation = 58;</code>
   * @return The likeAnimation.
   */
  bilibili.app.view.v1.LikeAnimation getLikeAnimation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.LikeAnimation like_animation = 58;</code>
   */
  bilibili.app.view.v1.LikeAnimationOrBuilder getLikeAnimationOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReplyStyle reply_preface = 59;</code>
   * @return Whether the replyPreface field is set.
   */
  boolean hasReplyPreface();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReplyStyle reply_preface = 59;</code>
   * @return The replyPreface.
   */
  bilibili.app.view.v1.ReplyStyle getReplyPreface();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.ReplyStyle reply_preface = 59;</code>
   */
  bilibili.app.view.v1.ReplyStyleOrBuilder getReplyPrefaceOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.RefreshPage refresh_page = 60;</code>
   * @return Whether the refreshPage field is set.
   */
  boolean hasRefreshPage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.RefreshPage refresh_page = 60;</code>
   * @return The refreshPage.
   */
  bilibili.app.view.v1.RefreshPage getRefreshPage();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.RefreshPage refresh_page = 60;</code>
   */
  bilibili.app.view.v1.RefreshPageOrBuilder getRefreshPageOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CoinCustom coin_custom = 61;</code>
   * @return Whether the coinCustom field is set.
   */
  boolean hasCoinCustom();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CoinCustom coin_custom = 61;</code>
   * @return The coinCustom.
   */
  bilibili.app.view.v1.CoinCustom getCoinCustom();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CoinCustom coin_custom = 61;</code>
   */
  bilibili.app.view.v1.CoinCustomOrBuilder getCoinCustomOrBuilder();
}
