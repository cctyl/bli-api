// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface SearchSpecialCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.SearchSpecialCard)
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
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags = 3;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.ReasonStyle> 
      getNewRecTagsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags = 3;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyle getNewRecTags(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags = 3;</code>
   */
  int getNewRecTagsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags = 3;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> 
      getNewRecTagsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags = 3;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getNewRecTagsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CardBusinessBadge card_business_badge = 4;</code>
   * @return Whether the cardBusinessBadge field is set.
   */
  boolean hasCardBusinessBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CardBusinessBadge card_business_badge = 4;</code>
   * @return The cardBusinessBadge.
   */
  bilibili.polymer.app.search.v1.CardBusinessBadge getCardBusinessBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.CardBusinessBadge card_business_badge = 4;</code>
   */
  bilibili.polymer.app.search.v1.CardBusinessBadgeOrBuilder getCardBusinessBadgeOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 5;</code>
   * @return The badge.
   */
  java.lang.String getBadge();
  /**
   * <pre>
   * </pre>
   *
   * <code>string badge = 5;</code>
   * @return The bytes for badge.
   */
  com.google.protobuf.ByteString
      getBadgeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 6;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 6;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags_v2 = 7;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.ReasonStyle> 
      getNewRecTagsV2List();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags_v2 = 7;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyle getNewRecTagsV2(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags_v2 = 7;</code>
   */
  int getNewRecTagsV2Count();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags_v2 = 7;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.ReasonStyleOrBuilder> 
      getNewRecTagsV2OrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.ReasonStyle new_rec_tags_v2 = 7;</code>
   */
  bilibili.polymer.app.search.v1.ReasonStyleOrBuilder getNewRecTagsV2OrBuilder(
      int index);
}
