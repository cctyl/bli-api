// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynModuleType module_type = 1;</code>
   * @return The enum numeric value on the wire for moduleType.
   */
  int getModuleTypeValue();
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynModuleType module_type = 1;</code>
   * @return The moduleType.
   */
  bilibili.app.dynamic.v2.DynModuleType getModuleType();

  /**
   * <pre>
   * 用户模块 1
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthor module_author = 2;</code>
   * @return Whether the moduleAuthor field is set.
   */
  boolean hasModuleAuthor();
  /**
   * <pre>
   * 用户模块 1
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthor module_author = 2;</code>
   * @return The moduleAuthor.
   */
  bilibili.app.dynamic.v2.ModuleAuthor getModuleAuthor();
  /**
   * <pre>
   * 用户模块 1
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthor module_author = 2;</code>
   */
  bilibili.app.dynamic.v2.ModuleAuthorOrBuilder getModuleAuthorOrBuilder();

  /**
   * <pre>
   * 争议黄条模块 2
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDispute module_dispute = 3;</code>
   * @return Whether the moduleDispute field is set.
   */
  boolean hasModuleDispute();
  /**
   * <pre>
   * 争议黄条模块 2
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDispute module_dispute = 3;</code>
   * @return The moduleDispute.
   */
  bilibili.app.dynamic.v2.ModuleDispute getModuleDispute();
  /**
   * <pre>
   * 争议黄条模块 2
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDispute module_dispute = 3;</code>
   */
  bilibili.app.dynamic.v2.ModuleDisputeOrBuilder getModuleDisputeOrBuilder();

  /**
   * <pre>
   * 动态正文模块 3
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDesc module_desc = 4;</code>
   * @return Whether the moduleDesc field is set.
   */
  boolean hasModuleDesc();
  /**
   * <pre>
   * 动态正文模块 3
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDesc module_desc = 4;</code>
   * @return The moduleDesc.
   */
  bilibili.app.dynamic.v2.ModuleDesc getModuleDesc();
  /**
   * <pre>
   * 动态正文模块 3
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDesc module_desc = 4;</code>
   */
  bilibili.app.dynamic.v2.ModuleDescOrBuilder getModuleDescOrBuilder();

  /**
   * <pre>
   * 动态卡模块 4
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDynamic module_dynamic = 5;</code>
   * @return Whether the moduleDynamic field is set.
   */
  boolean hasModuleDynamic();
  /**
   * <pre>
   * 动态卡模块 4
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDynamic module_dynamic = 5;</code>
   * @return The moduleDynamic.
   */
  bilibili.app.dynamic.v2.ModuleDynamic getModuleDynamic();
  /**
   * <pre>
   * 动态卡模块 4
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleDynamic module_dynamic = 5;</code>
   */
  bilibili.app.dynamic.v2.ModuleDynamicOrBuilder getModuleDynamicOrBuilder();

  /**
   * <pre>
   * 点赞外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleLikeUser module_likeUser = 6;</code>
   * @return Whether the moduleLikeUser field is set.
   */
  boolean hasModuleLikeUser();
  /**
   * <pre>
   * 点赞外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleLikeUser module_likeUser = 6;</code>
   * @return The moduleLikeUser.
   */
  bilibili.app.dynamic.v2.ModuleLikeUser getModuleLikeUser();
  /**
   * <pre>
   * 点赞外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleLikeUser module_likeUser = 6;</code>
   */
  bilibili.app.dynamic.v2.ModuleLikeUserOrBuilder getModuleLikeUserOrBuilder();

  /**
   * <pre>
   * 小卡模块 6
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleExtend module_extend = 7;</code>
   * @return Whether the moduleExtend field is set.
   */
  boolean hasModuleExtend();
  /**
   * <pre>
   * 小卡模块 6
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleExtend module_extend = 7;</code>
   * @return The moduleExtend.
   */
  bilibili.app.dynamic.v2.ModuleExtend getModuleExtend();
  /**
   * <pre>
   * 小卡模块 6
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleExtend module_extend = 7;</code>
   */
  bilibili.app.dynamic.v2.ModuleExtendOrBuilder getModuleExtendOrBuilder();

  /**
   * <pre>
   * 大卡模块 5
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAdditional module_additional = 8;</code>
   * @return Whether the moduleAdditional field is set.
   */
  boolean hasModuleAdditional();
  /**
   * <pre>
   * 大卡模块 5
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAdditional module_additional = 8;</code>
   * @return The moduleAdditional.
   */
  bilibili.app.dynamic.v2.ModuleAdditional getModuleAdditional();
  /**
   * <pre>
   * 大卡模块 5
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAdditional module_additional = 8;</code>
   */
  bilibili.app.dynamic.v2.ModuleAdditionalOrBuilder getModuleAdditionalOrBuilder();

  /**
   * <pre>
   * 计数模块 8
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat = 9;</code>
   * @return Whether the moduleStat field is set.
   */
  boolean hasModuleStat();
  /**
   * <pre>
   * 计数模块 8
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat = 9;</code>
   * @return The moduleStat.
   */
  bilibili.app.dynamic.v2.ModuleStat getModuleStat();
  /**
   * <pre>
   * 计数模块 8
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat = 9;</code>
   */
  bilibili.app.dynamic.v2.ModuleStatOrBuilder getModuleStatOrBuilder();

  /**
   * <pre>
   * 折叠模块 9
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleFold module_fold = 10;</code>
   * @return Whether the moduleFold field is set.
   */
  boolean hasModuleFold();
  /**
   * <pre>
   * 折叠模块 9
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleFold module_fold = 10;</code>
   * @return The moduleFold.
   */
  bilibili.app.dynamic.v2.ModuleFold getModuleFold();
  /**
   * <pre>
   * 折叠模块 9
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleFold module_fold = 10;</code>
   */
  bilibili.app.dynamic.v2.ModuleFoldOrBuilder getModuleFoldOrBuilder();

  /**
   * <pre>
   * 评论外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleComment module_comment = 11;</code>
   * @return Whether the moduleComment field is set.
   */
  boolean hasModuleComment();
  /**
   * <pre>
   * 评论外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleComment module_comment = 11;</code>
   * @return The moduleComment.
   */
  bilibili.app.dynamic.v2.ModuleComment getModuleComment();
  /**
   * <pre>
   * 评论外露(废弃)
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleComment module_comment = 11;</code>
   */
  bilibili.app.dynamic.v2.ModuleCommentOrBuilder getModuleCommentOrBuilder();

  /**
   * <pre>
   * 外露交互模块(点赞、评论) 7
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleInteraction module_interaction = 12;</code>
   * @return Whether the moduleInteraction field is set.
   */
  boolean hasModuleInteraction();
  /**
   * <pre>
   * 外露交互模块(点赞、评论) 7
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleInteraction module_interaction = 12;</code>
   * @return The moduleInteraction.
   */
  bilibili.app.dynamic.v2.ModuleInteraction getModuleInteraction();
  /**
   * <pre>
   * 外露交互模块(点赞、评论) 7
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleInteraction module_interaction = 12;</code>
   */
  bilibili.app.dynamic.v2.ModuleInteractionOrBuilder getModuleInteractionOrBuilder();

  /**
   * <pre>
   * 转发卡-原卡用户模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthorForward module_author_forward = 13;</code>
   * @return Whether the moduleAuthorForward field is set.
   */
  boolean hasModuleAuthorForward();
  /**
   * <pre>
   * 转发卡-原卡用户模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthorForward module_author_forward = 13;</code>
   * @return The moduleAuthorForward.
   */
  bilibili.app.dynamic.v2.ModuleAuthorForward getModuleAuthorForward();
  /**
   * <pre>
   * 转发卡-原卡用户模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAuthorForward module_author_forward = 13;</code>
   */
  bilibili.app.dynamic.v2.ModuleAuthorForwardOrBuilder getModuleAuthorForwardOrBuilder();

  /**
   * <pre>
   * 广告卡
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAd module_ad = 14;</code>
   * @return Whether the moduleAd field is set.
   */
  boolean hasModuleAd();
  /**
   * <pre>
   * 广告卡
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAd module_ad = 14;</code>
   * @return The moduleAd.
   */
  bilibili.app.dynamic.v2.ModuleAd getModuleAd();
  /**
   * <pre>
   * 广告卡
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleAd module_ad = 14;</code>
   */
  bilibili.app.dynamic.v2.ModuleAdOrBuilder getModuleAdOrBuilder();

  /**
   * <pre>
   * 通栏
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBanner module_banner = 15;</code>
   * @return Whether the moduleBanner field is set.
   */
  boolean hasModuleBanner();
  /**
   * <pre>
   * 通栏
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBanner module_banner = 15;</code>
   * @return The moduleBanner.
   */
  bilibili.app.dynamic.v2.ModuleBanner getModuleBanner();
  /**
   * <pre>
   * 通栏
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBanner module_banner = 15;</code>
   */
  bilibili.app.dynamic.v2.ModuleBannerOrBuilder getModuleBannerOrBuilder();

  /**
   * <pre>
   * 获取物料失败
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleItemNull module_item_null = 16;</code>
   * @return Whether the moduleItemNull field is set.
   */
  boolean hasModuleItemNull();
  /**
   * <pre>
   * 获取物料失败
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleItemNull module_item_null = 16;</code>
   * @return The moduleItemNull.
   */
  bilibili.app.dynamic.v2.ModuleItemNull getModuleItemNull();
  /**
   * <pre>
   * 获取物料失败
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleItemNull module_item_null = 16;</code>
   */
  bilibili.app.dynamic.v2.ModuleItemNullOrBuilder getModuleItemNullOrBuilder();

  /**
   * <pre>
   * 分享组件
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleShareInfo module_share_info = 17;</code>
   * @return Whether the moduleShareInfo field is set.
   */
  boolean hasModuleShareInfo();
  /**
   * <pre>
   * 分享组件
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleShareInfo module_share_info = 17;</code>
   * @return The moduleShareInfo.
   */
  bilibili.app.dynamic.v2.ModuleShareInfo getModuleShareInfo();
  /**
   * <pre>
   * 分享组件
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleShareInfo module_share_info = 17;</code>
   */
  bilibili.app.dynamic.v2.ModuleShareInfoOrBuilder getModuleShareInfoOrBuilder();

  /**
   * <pre>
   * 相关推荐模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleRecommend module_recommend = 18;</code>
   * @return Whether the moduleRecommend field is set.
   */
  boolean hasModuleRecommend();
  /**
   * <pre>
   * 相关推荐模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleRecommend module_recommend = 18;</code>
   * @return The moduleRecommend.
   */
  bilibili.app.dynamic.v2.ModuleRecommend getModuleRecommend();
  /**
   * <pre>
   * 相关推荐模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleRecommend module_recommend = 18;</code>
   */
  bilibili.app.dynamic.v2.ModuleRecommendOrBuilder getModuleRecommendOrBuilder();

  /**
   * <pre>
   * 顶部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTop module_top = 19;</code>
   * @return Whether the moduleTop field is set.
   */
  boolean hasModuleTop();
  /**
   * <pre>
   * 顶部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTop module_top = 19;</code>
   * @return The moduleTop.
   */
  bilibili.app.dynamic.v2.ModuleTop getModuleTop();
  /**
   * <pre>
   * 顶部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTop module_top = 19;</code>
   */
  bilibili.app.dynamic.v2.ModuleTopOrBuilder getModuleTopOrBuilder();

  /**
   * <pre>
   * 底部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButtom module_buttom = 20;</code>
   * @return Whether the moduleButtom field is set.
   */
  boolean hasModuleButtom();
  /**
   * <pre>
   * 底部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButtom module_buttom = 20;</code>
   * @return The moduleButtom.
   */
  bilibili.app.dynamic.v2.ModuleButtom getModuleButtom();
  /**
   * <pre>
   * 底部模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButtom module_buttom = 20;</code>
   */
  bilibili.app.dynamic.v2.ModuleButtomOrBuilder getModuleButtomOrBuilder();

  /**
   * <pre>
   * 转发卡计数模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat_forward = 21;</code>
   * @return Whether the moduleStatForward field is set.
   */
  boolean hasModuleStatForward();
  /**
   * <pre>
   * 转发卡计数模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat_forward = 21;</code>
   * @return The moduleStatForward.
   */
  bilibili.app.dynamic.v2.ModuleStat getModuleStatForward();
  /**
   * <pre>
   * 转发卡计数模块
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStat module_stat_forward = 21;</code>
   */
  bilibili.app.dynamic.v2.ModuleStatOrBuilder getModuleStatForwardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStory module_story = 22;</code>
   * @return Whether the moduleStory field is set.
   */
  boolean hasModuleStory();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStory module_story = 22;</code>
   * @return The moduleStory.
   */
  bilibili.app.dynamic.v2.ModuleStory getModuleStory();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleStory module_story = 22;</code>
   */
  bilibili.app.dynamic.v2.ModuleStoryOrBuilder getModuleStoryOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopic module_topic = 23;</code>
   * @return Whether the moduleTopic field is set.
   */
  boolean hasModuleTopic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopic module_topic = 23;</code>
   * @return The moduleTopic.
   */
  bilibili.app.dynamic.v2.ModuleTopic getModuleTopic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopic module_topic = 23;</code>
   */
  bilibili.app.dynamic.v2.ModuleTopicOrBuilder getModuleTopicOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicDetailsExt module_topic_details_ext = 24;</code>
   * @return Whether the moduleTopicDetailsExt field is set.
   */
  boolean hasModuleTopicDetailsExt();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicDetailsExt module_topic_details_ext = 24;</code>
   * @return The moduleTopicDetailsExt.
   */
  bilibili.app.dynamic.v2.ModuleTopicDetailsExt getModuleTopicDetailsExt();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicDetailsExt module_topic_details_ext = 24;</code>
   */
  bilibili.app.dynamic.v2.ModuleTopicDetailsExtOrBuilder getModuleTopicDetailsExtOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopTag module_top_tag = 25;</code>
   * @return Whether the moduleTopTag field is set.
   */
  boolean hasModuleTopTag();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopTag module_top_tag = 25;</code>
   * @return The moduleTopTag.
   */
  bilibili.app.dynamic.v2.ModuleTopTag getModuleTopTag();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopTag module_top_tag = 25;</code>
   */
  bilibili.app.dynamic.v2.ModuleTopTagOrBuilder getModuleTopTagOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicBrief module_topic_brief = 26;</code>
   * @return Whether the moduleTopicBrief field is set.
   */
  boolean hasModuleTopicBrief();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicBrief module_topic_brief = 26;</code>
   * @return The moduleTopicBrief.
   */
  bilibili.app.dynamic.v2.ModuleTopicBrief getModuleTopicBrief();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTopicBrief module_topic_brief = 26;</code>
   */
  bilibili.app.dynamic.v2.ModuleTopicBriefOrBuilder getModuleTopicBriefOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTitle module_title = 27;</code>
   * @return Whether the moduleTitle field is set.
   */
  boolean hasModuleTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTitle module_title = 27;</code>
   * @return The moduleTitle.
   */
  bilibili.app.dynamic.v2.ModuleTitle getModuleTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTitle module_title = 27;</code>
   */
  bilibili.app.dynamic.v2.ModuleTitleOrBuilder getModuleTitleOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButton module_button = 28;</code>
   * @return Whether the moduleButton field is set.
   */
  boolean hasModuleButton();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButton module_button = 28;</code>
   * @return The moduleButton.
   */
  bilibili.app.dynamic.v2.ModuleButton getModuleButton();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleButton module_button = 28;</code>
   */
  bilibili.app.dynamic.v2.ModuleButtonOrBuilder getModuleButtonOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleNotice module_notice = 29;</code>
   * @return Whether the moduleNotice field is set.
   */
  boolean hasModuleNotice();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleNotice module_notice = 29;</code>
   * @return The moduleNotice.
   */
  bilibili.app.dynamic.v2.ModuleNotice getModuleNotice();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleNotice module_notice = 29;</code>
   */
  bilibili.app.dynamic.v2.ModuleNoticeOrBuilder getModuleNoticeOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusSummary module_opus_summary = 30;</code>
   * @return Whether the moduleOpusSummary field is set.
   */
  boolean hasModuleOpusSummary();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusSummary module_opus_summary = 30;</code>
   * @return The moduleOpusSummary.
   */
  bilibili.app.dynamic.v2.ModuleOpusSummary getModuleOpusSummary();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusSummary module_opus_summary = 30;</code>
   */
  bilibili.app.dynamic.v2.ModuleOpusSummaryOrBuilder getModuleOpusSummaryOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleCopyright module_copyright = 31;</code>
   * @return Whether the moduleCopyright field is set.
   */
  boolean hasModuleCopyright();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleCopyright module_copyright = 31;</code>
   * @return The moduleCopyright.
   */
  bilibili.app.dynamic.v2.ModuleCopyright getModuleCopyright();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleCopyright module_copyright = 31;</code>
   */
  bilibili.app.dynamic.v2.ModuleCopyrightOrBuilder getModuleCopyrightOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleParagraph module_paragraph = 32;</code>
   * @return Whether the moduleParagraph field is set.
   */
  boolean hasModuleParagraph();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleParagraph module_paragraph = 32;</code>
   * @return The moduleParagraph.
   */
  bilibili.app.dynamic.v2.ModuleParagraph getModuleParagraph();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleParagraph module_paragraph = 32;</code>
   */
  bilibili.app.dynamic.v2.ModuleParagraphOrBuilder getModuleParagraphOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBlocked module_blocked = 33;</code>
   * @return Whether the moduleBlocked field is set.
   */
  boolean hasModuleBlocked();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBlocked module_blocked = 33;</code>
   * @return The moduleBlocked.
   */
  bilibili.app.dynamic.v2.ModuleBlocked getModuleBlocked();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleBlocked module_blocked = 33;</code>
   */
  bilibili.app.dynamic.v2.ModuleBlockedOrBuilder getModuleBlockedOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTextNotice module_text_notice = 34;</code>
   * @return Whether the moduleTextNotice field is set.
   */
  boolean hasModuleTextNotice();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTextNotice module_text_notice = 34;</code>
   * @return The moduleTextNotice.
   */
  bilibili.app.dynamic.v2.ModuleTextNotice getModuleTextNotice();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleTextNotice module_text_notice = 34;</code>
   */
  bilibili.app.dynamic.v2.ModuleTextNoticeOrBuilder getModuleTextNoticeOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusCollection module_opus_collection = 35;</code>
   * @return Whether the moduleOpusCollection field is set.
   */
  boolean hasModuleOpusCollection();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusCollection module_opus_collection = 35;</code>
   * @return The moduleOpusCollection.
   */
  bilibili.app.dynamic.v2.ModuleOpusCollection getModuleOpusCollection();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.ModuleOpusCollection module_opus_collection = 35;</code>
   */
  bilibili.app.dynamic.v2.ModuleOpusCollectionOrBuilder getModuleOpusCollectionOrBuilder();

  bilibili.app.dynamic.v2.Module.ModuleItemCase getModuleItemCase();
}