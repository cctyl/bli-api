// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ModuleItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ModuleItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ModuleItem.CardDetailCase card_type = 1;</code>
   * @return The enum numeric value on the wire for cardType.
   */
  int getCardTypeValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ModuleItem.CardDetailCase card_type = 1;</code>
   * @return The cardType.
   */
  bilibili.app.nativeact.v1.ModuleItem.CardDetailCase getCardType();

  /**
   * <pre>
   * </pre>
   *
   * <code>string card_id = 2;</code>
   * @return The cardId.
   */
  java.lang.String getCardId();
  /**
   * <pre>
   * </pre>
   *
   * <code>string card_id = 2;</code>
   * @return The bytes for cardId.
   */
  com.google.protobuf.ByteString
      getCardIdBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.EditorRecommendCard editor_recommend_card = 10;</code>
   * @return Whether the editorRecommendCard field is set.
   */
  boolean hasEditorRecommendCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.EditorRecommendCard editor_recommend_card = 10;</code>
   * @return The editorRecommendCard.
   */
  bilibili.app.nativeact.v1.EditorRecommendCard getEditorRecommendCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.EditorRecommendCard editor_recommend_card = 10;</code>
   */
  bilibili.app.nativeact.v1.EditorRecommendCardOrBuilder getEditorRecommendCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ParticipationCard participation_card = 11;</code>
   * @return Whether the participationCard field is set.
   */
  boolean hasParticipationCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ParticipationCard participation_card = 11;</code>
   * @return The participationCard.
   */
  bilibili.app.nativeact.v1.ParticipationCard getParticipationCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ParticipationCard participation_card = 11;</code>
   */
  bilibili.app.nativeact.v1.ParticipationCardOrBuilder getParticipationCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.HeaderCard header_card = 12;</code>
   * @return Whether the headerCard field is set.
   */
  boolean hasHeaderCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.HeaderCard header_card = 12;</code>
   * @return The headerCard.
   */
  bilibili.app.nativeact.v1.HeaderCard getHeaderCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.HeaderCard header_card = 12;</code>
   */
  bilibili.app.nativeact.v1.HeaderCardOrBuilder getHeaderCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicCard dynamic_card = 13;</code>
   * @return Whether the dynamicCard field is set.
   */
  boolean hasDynamicCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicCard dynamic_card = 13;</code>
   * @return The dynamicCard.
   */
  bilibili.app.nativeact.v1.DynamicCard getDynamicCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicCard dynamic_card = 13;</code>
   */
  bilibili.app.nativeact.v1.DynamicCardOrBuilder getDynamicCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextCard text_card = 14;</code>
   * @return Whether the textCard field is set.
   */
  boolean hasTextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextCard text_card = 14;</code>
   * @return The textCard.
   */
  bilibili.app.nativeact.v1.TextCard getTextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextCard text_card = 14;</code>
   */
  bilibili.app.nativeact.v1.TextCardOrBuilder getTextCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextTitleCard text_title_card = 15;</code>
   * @return Whether the textTitleCard field is set.
   */
  boolean hasTextTitleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextTitleCard text_title_card = 15;</code>
   * @return The textTitleCard.
   */
  bilibili.app.nativeact.v1.TextTitleCard getTextTitleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TextTitleCard text_title_card = 15;</code>
   */
  bilibili.app.nativeact.v1.TextTitleCardOrBuilder getTextTitleCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ImageTitleCard image_title_card = 16;</code>
   * @return Whether the imageTitleCard field is set.
   */
  boolean hasImageTitleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ImageTitleCard image_title_card = 16;</code>
   * @return The imageTitleCard.
   */
  bilibili.app.nativeact.v1.ImageTitleCard getImageTitleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ImageTitleCard image_title_card = 16;</code>
   */
  bilibili.app.nativeact.v1.ImageTitleCardOrBuilder getImageTitleCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicMoreCard dynamic_more_card = 17;</code>
   * @return Whether the dynamicMoreCard field is set.
   */
  boolean hasDynamicMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicMoreCard dynamic_more_card = 17;</code>
   * @return The dynamicMoreCard.
   */
  bilibili.app.nativeact.v1.DynamicMoreCard getDynamicMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicMoreCard dynamic_more_card = 17;</code>
   */
  bilibili.app.nativeact.v1.DynamicMoreCardOrBuilder getDynamicMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicActMoreCard dynamic_act_more_card = 18;</code>
   * @return Whether the dynamicActMoreCard field is set.
   */
  boolean hasDynamicActMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicActMoreCard dynamic_act_more_card = 18;</code>
   * @return The dynamicActMoreCard.
   */
  bilibili.app.nativeact.v1.DynamicActMoreCard getDynamicActMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.DynamicActMoreCard dynamic_act_more_card = 18;</code>
   */
  bilibili.app.nativeact.v1.DynamicActMoreCardOrBuilder getDynamicActMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveCard live_card = 19;</code>
   * @return Whether the liveCard field is set.
   */
  boolean hasLiveCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveCard live_card = 19;</code>
   * @return The liveCard.
   */
  bilibili.app.nativeact.v1.LiveCard getLiveCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.LiveCard live_card = 19;</code>
   */
  bilibili.app.nativeact.v1.LiveCardOrBuilder getLiveCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselImgCard carousel_img_card = 20;</code>
   * @return Whether the carouselImgCard field is set.
   */
  boolean hasCarouselImgCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselImgCard carousel_img_card = 20;</code>
   * @return The carouselImgCard.
   */
  bilibili.app.nativeact.v1.CarouselImgCard getCarouselImgCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselImgCard carousel_img_card = 20;</code>
   */
  bilibili.app.nativeact.v1.CarouselImgCardOrBuilder getCarouselImgCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselWordCard carousel_word_card = 21;</code>
   * @return Whether the carouselWordCard field is set.
   */
  boolean hasCarouselWordCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselWordCard carousel_word_card = 21;</code>
   * @return The carouselWordCard.
   */
  bilibili.app.nativeact.v1.CarouselWordCard getCarouselWordCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.CarouselWordCard carousel_word_card = 21;</code>
   */
  bilibili.app.nativeact.v1.CarouselWordCardOrBuilder getCarouselWordCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceCard resource_card = 22;</code>
   * @return Whether the resourceCard field is set.
   */
  boolean hasResourceCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceCard resource_card = 22;</code>
   * @return The resourceCard.
   */
  bilibili.app.nativeact.v1.ResourceCard getResourceCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceCard resource_card = 22;</code>
   */
  bilibili.app.nativeact.v1.ResourceCardOrBuilder getResourceCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceMoreCard resource_more_card = 23;</code>
   * @return Whether the resourceMoreCard field is set.
   */
  boolean hasResourceMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceMoreCard resource_more_card = 23;</code>
   * @return The resourceMoreCard.
   */
  bilibili.app.nativeact.v1.ResourceMoreCard getResourceMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ResourceMoreCard resource_more_card = 23;</code>
   */
  bilibili.app.nativeact.v1.ResourceMoreCardOrBuilder getResourceMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.GameCard game_card = 24;</code>
   * @return Whether the gameCard field is set.
   */
  boolean hasGameCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.GameCard game_card = 24;</code>
   * @return The gameCard.
   */
  bilibili.app.nativeact.v1.GameCard getGameCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.GameCard game_card = 24;</code>
   */
  bilibili.app.nativeact.v1.GameCardOrBuilder getGameCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoCard video_card = 25;</code>
   * @return Whether the videoCard field is set.
   */
  boolean hasVideoCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoCard video_card = 25;</code>
   * @return The videoCard.
   */
  bilibili.app.nativeact.v1.VideoCard getVideoCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoCard video_card = 25;</code>
   */
  bilibili.app.nativeact.v1.VideoCardOrBuilder getVideoCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoMoreCard video_more_card = 26;</code>
   * @return Whether the videoMoreCard field is set.
   */
  boolean hasVideoMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoMoreCard video_more_card = 26;</code>
   * @return The videoMoreCard.
   */
  bilibili.app.nativeact.v1.VideoMoreCard getVideoMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VideoMoreCard video_more_card = 26;</code>
   */
  bilibili.app.nativeact.v1.VideoMoreCardOrBuilder getVideoMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdCard recommend_card = 27;</code>
   * @return Whether the recommendCard field is set.
   */
  boolean hasRecommendCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdCard recommend_card = 27;</code>
   * @return The recommendCard.
   */
  bilibili.app.nativeact.v1.RcmdCard getRecommendCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdCard recommend_card = 27;</code>
   */
  bilibili.app.nativeact.v1.RcmdCardOrBuilder getRecommendCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdVerticalCard recommend_vertical_card = 28;</code>
   * @return Whether the recommendVerticalCard field is set.
   */
  boolean hasRecommendVerticalCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdVerticalCard recommend_vertical_card = 28;</code>
   * @return The recommendVerticalCard.
   */
  bilibili.app.nativeact.v1.RcmdVerticalCard getRecommendVerticalCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RcmdVerticalCard recommend_vertical_card = 28;</code>
   */
  bilibili.app.nativeact.v1.RcmdVerticalCardOrBuilder getRecommendVerticalCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCard relativeact_card = 29;</code>
   * @return Whether the relativeactCard field is set.
   */
  boolean hasRelativeactCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCard relativeact_card = 29;</code>
   * @return The relativeactCard.
   */
  bilibili.app.nativeact.v1.RelativeactCard getRelativeactCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCard relativeact_card = 29;</code>
   */
  bilibili.app.nativeact.v1.RelativeactCardOrBuilder getRelativeactCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCapsuleCard relativeact_capsule_card = 30;</code>
   * @return Whether the relativeactCapsuleCard field is set.
   */
  boolean hasRelativeactCapsuleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCapsuleCard relativeact_capsule_card = 30;</code>
   * @return The relativeactCapsuleCard.
   */
  bilibili.app.nativeact.v1.RelativeactCapsuleCard getRelativeactCapsuleCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.RelativeactCapsuleCard relativeact_capsule_card = 30;</code>
   */
  bilibili.app.nativeact.v1.RelativeactCapsuleCardOrBuilder getRelativeactCapsuleCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.StatementCard statement_card = 31;</code>
   * @return Whether the statementCard field is set.
   */
  boolean hasStatementCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.StatementCard statement_card = 31;</code>
   * @return The statementCard.
   */
  bilibili.app.nativeact.v1.StatementCard getStatementCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.StatementCard statement_card = 31;</code>
   */
  bilibili.app.nativeact.v1.StatementCardOrBuilder getStatementCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.IconCard icon_card = 32;</code>
   * @return Whether the iconCard field is set.
   */
  boolean hasIconCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.IconCard icon_card = 32;</code>
   * @return The iconCard.
   */
  bilibili.app.nativeact.v1.IconCard getIconCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.IconCard icon_card = 32;</code>
   */
  bilibili.app.nativeact.v1.IconCardOrBuilder getIconCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VoteCard vote_card = 33;</code>
   * @return Whether the voteCard field is set.
   */
  boolean hasVoteCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VoteCard vote_card = 33;</code>
   * @return The voteCard.
   */
  bilibili.app.nativeact.v1.VoteCard getVoteCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.VoteCard vote_card = 33;</code>
   */
  bilibili.app.nativeact.v1.VoteCardOrBuilder getVoteCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReserveCard reserve_card = 34;</code>
   * @return Whether the reserveCard field is set.
   */
  boolean hasReserveCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReserveCard reserve_card = 34;</code>
   * @return The reserveCard.
   */
  bilibili.app.nativeact.v1.ReserveCard getReserveCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReserveCard reserve_card = 34;</code>
   */
  bilibili.app.nativeact.v1.ReserveCardOrBuilder getReserveCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineHeadCard timeline_head_card = 35;</code>
   * @return Whether the timelineHeadCard field is set.
   */
  boolean hasTimelineHeadCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineHeadCard timeline_head_card = 35;</code>
   * @return The timelineHeadCard.
   */
  bilibili.app.nativeact.v1.TimelineHeadCard getTimelineHeadCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineHeadCard timeline_head_card = 35;</code>
   */
  bilibili.app.nativeact.v1.TimelineHeadCardOrBuilder getTimelineHeadCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventTextCard timeline_event_text_card = 36;</code>
   * @return Whether the timelineEventTextCard field is set.
   */
  boolean hasTimelineEventTextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventTextCard timeline_event_text_card = 36;</code>
   * @return The timelineEventTextCard.
   */
  bilibili.app.nativeact.v1.TimelineEventTextCard getTimelineEventTextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventTextCard timeline_event_text_card = 36;</code>
   */
  bilibili.app.nativeact.v1.TimelineEventTextCardOrBuilder getTimelineEventTextCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImageCard timeline_event_image_card = 37;</code>
   * @return Whether the timelineEventImageCard field is set.
   */
  boolean hasTimelineEventImageCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImageCard timeline_event_image_card = 37;</code>
   * @return The timelineEventImageCard.
   */
  bilibili.app.nativeact.v1.TimelineEventImageCard getTimelineEventImageCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImageCard timeline_event_image_card = 37;</code>
   */
  bilibili.app.nativeact.v1.TimelineEventImageCardOrBuilder getTimelineEventImageCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImagetextCard timeline_event_imagetext_card = 38;</code>
   * @return Whether the timelineEventImagetextCard field is set.
   */
  boolean hasTimelineEventImagetextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImagetextCard timeline_event_imagetext_card = 38;</code>
   * @return The timelineEventImagetextCard.
   */
  bilibili.app.nativeact.v1.TimelineEventImagetextCard getTimelineEventImagetextCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventImagetextCard timeline_event_imagetext_card = 38;</code>
   */
  bilibili.app.nativeact.v1.TimelineEventImagetextCardOrBuilder getTimelineEventImagetextCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventResourceCard timeline_event_resource_card = 39;</code>
   * @return Whether the timelineEventResourceCard field is set.
   */
  boolean hasTimelineEventResourceCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventResourceCard timeline_event_resource_card = 39;</code>
   * @return The timelineEventResourceCard.
   */
  bilibili.app.nativeact.v1.TimelineEventResourceCard getTimelineEventResourceCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineEventResourceCard timeline_event_resource_card = 39;</code>
   */
  bilibili.app.nativeact.v1.TimelineEventResourceCardOrBuilder getTimelineEventResourceCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineMoreCard timeline_more_card = 40;</code>
   * @return Whether the timelineMoreCard field is set.
   */
  boolean hasTimelineMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineMoreCard timeline_more_card = 40;</code>
   * @return The timelineMoreCard.
   */
  bilibili.app.nativeact.v1.TimelineMoreCard getTimelineMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineMoreCard timeline_more_card = 40;</code>
   */
  bilibili.app.nativeact.v1.TimelineMoreCardOrBuilder getTimelineMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineUnfoldCard timeline_unfold_card = 41;</code>
   * @return Whether the timelineUnfoldCard field is set.
   */
  boolean hasTimelineUnfoldCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineUnfoldCard timeline_unfold_card = 41;</code>
   * @return The timelineUnfoldCard.
   */
  bilibili.app.nativeact.v1.TimelineUnfoldCard getTimelineUnfoldCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TimelineUnfoldCard timeline_unfold_card = 41;</code>
   */
  bilibili.app.nativeact.v1.TimelineUnfoldCardOrBuilder getTimelineUnfoldCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvOneCard ogv_one_card = 42;</code>
   * @return Whether the ogvOneCard field is set.
   */
  boolean hasOgvOneCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvOneCard ogv_one_card = 42;</code>
   * @return The ogvOneCard.
   */
  bilibili.app.nativeact.v1.OgvOneCard getOgvOneCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvOneCard ogv_one_card = 42;</code>
   */
  bilibili.app.nativeact.v1.OgvOneCardOrBuilder getOgvOneCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvThreeCard ogv_three_card = 43;</code>
   * @return Whether the ogvThreeCard field is set.
   */
  boolean hasOgvThreeCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvThreeCard ogv_three_card = 43;</code>
   * @return The ogvThreeCard.
   */
  bilibili.app.nativeact.v1.OgvThreeCard getOgvThreeCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvThreeCard ogv_three_card = 43;</code>
   */
  bilibili.app.nativeact.v1.OgvThreeCardOrBuilder getOgvThreeCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvMoreCard ogv_more_card = 44;</code>
   * @return Whether the ogvMoreCard field is set.
   */
  boolean hasOgvMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvMoreCard ogv_more_card = 44;</code>
   * @return The ogvMoreCard.
   */
  bilibili.app.nativeact.v1.OgvMoreCard getOgvMoreCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.OgvMoreCard ogv_more_card = 44;</code>
   */
  bilibili.app.nativeact.v1.OgvMoreCardOrBuilder getOgvMoreCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NavigationCard navigation_card = 45;</code>
   * @return Whether the navigationCard field is set.
   */
  boolean hasNavigationCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NavigationCard navigation_card = 45;</code>
   * @return The navigationCard.
   */
  bilibili.app.nativeact.v1.NavigationCard getNavigationCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NavigationCard navigation_card = 45;</code>
   */
  bilibili.app.nativeact.v1.NavigationCardOrBuilder getNavigationCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReplyCard reply_card = 46;</code>
   * @return Whether the replyCard field is set.
   */
  boolean hasReplyCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReplyCard reply_card = 46;</code>
   * @return The replyCard.
   */
  bilibili.app.nativeact.v1.ReplyCard getReplyCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ReplyCard reply_card = 46;</code>
   */
  bilibili.app.nativeact.v1.ReplyCardOrBuilder getReplyCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TabCard tab_card = 47;</code>
   * @return Whether the tabCard field is set.
   */
  boolean hasTabCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TabCard tab_card = 47;</code>
   * @return The tabCard.
   */
  bilibili.app.nativeact.v1.TabCard getTabCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.TabCard tab_card = 47;</code>
   */
  bilibili.app.nativeact.v1.TabCardOrBuilder getTabCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactHeader newact_header = 48;</code>
   * @return Whether the newactHeader field is set.
   */
  boolean hasNewactHeader();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactHeader newact_header = 48;</code>
   * @return The newactHeader.
   */
  bilibili.app.nativeact.v1.NewactHeader getNewactHeader();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactHeader newact_header = 48;</code>
   */
  bilibili.app.nativeact.v1.NewactHeaderOrBuilder getNewactHeaderOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactAward newact_award = 49;</code>
   * @return Whether the newactAward field is set.
   */
  boolean hasNewactAward();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactAward newact_award = 49;</code>
   * @return The newactAward.
   */
  bilibili.app.nativeact.v1.NewactAward getNewactAward();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactAward newact_award = 49;</code>
   */
  bilibili.app.nativeact.v1.NewactAwardOrBuilder getNewactAwardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactStatement newact_statement = 50;</code>
   * @return Whether the newactStatement field is set.
   */
  boolean hasNewactStatement();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactStatement newact_statement = 50;</code>
   * @return The newactStatement.
   */
  bilibili.app.nativeact.v1.NewactStatement getNewactStatement();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.NewactStatement newact_statement = 50;</code>
   */
  bilibili.app.nativeact.v1.NewactStatementOrBuilder getNewactStatementOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ProgressCard progress_card = 51;</code>
   * @return Whether the progressCard field is set.
   */
  boolean hasProgressCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ProgressCard progress_card = 51;</code>
   * @return The progressCard.
   */
  bilibili.app.nativeact.v1.ProgressCard getProgressCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.ProgressCard progress_card = 51;</code>
   */
  bilibili.app.nativeact.v1.ProgressCardOrBuilder getProgressCardOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SelectCard select_card = 52;</code>
   * @return Whether the selectCard field is set.
   */
  boolean hasSelectCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SelectCard select_card = 52;</code>
   * @return The selectCard.
   */
  bilibili.app.nativeact.v1.SelectCard getSelectCard();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.nativeact.v1.SelectCard select_card = 52;</code>
   */
  bilibili.app.nativeact.v1.SelectCardOrBuilder getSelectCardOrBuilder();

  bilibili.app.nativeact.v1.ModuleItem.CardDetailCase getCardDetailCase();
}
