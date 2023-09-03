// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface SearchUpperCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.SearchUpperCard)
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
   * <code>string sign = 3;</code>
   * @return The sign.
   */
  java.lang.String getSign();
  /**
   * <pre>
   * </pre>
   *
   * <code>string sign = 3;</code>
   * @return The bytes for sign.
   */
  com.google.protobuf.ByteString
      getSignBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 fans = 4;</code>
   * @return The fans.
   */
  int getFans();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 archives = 5;</code>
   * @return The archives.
   */
  int getArchives();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 live_status = 6;</code>
   * @return The liveStatus.
   */
  int getLiveStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 roomid = 7;</code>
   * @return The roomid.
   */
  int getRoomid();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.OfficialVerify official_verify = 8;</code>
   * @return Whether the officialVerify field is set.
   */
  boolean hasOfficialVerify();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.OfficialVerify official_verify = 8;</code>
   * @return The officialVerify.
   */
  bilibili.polymer.app.search.v1.OfficialVerify getOfficialVerify();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.OfficialVerify official_verify = 8;</code>
   */
  bilibili.polymer.app.search.v1.OfficialVerifyOrBuilder getOfficialVerifyOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 face_nft_new = 9;</code>
   * @return The faceNftNew.
   */
  int getFaceNftNew();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NftFaceIcon nft_face_icon = 10;</code>
   * @return Whether the nftFaceIcon field is set.
   */
  boolean hasNftFaceIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NftFaceIcon nft_face_icon = 10;</code>
   * @return The nftFaceIcon.
   */
  bilibili.polymer.app.search.v1.NftFaceIcon getNftFaceIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.NftFaceIcon nft_face_icon = 10;</code>
   */
  bilibili.polymer.app.search.v1.NftFaceIconOrBuilder getNftFaceIconOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.AvItem av_items = 11;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.AvItem> 
      getAvItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.AvItem av_items = 11;</code>
   */
  bilibili.polymer.app.search.v1.AvItem getAvItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.AvItem av_items = 11;</code>
   */
  int getAvItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.AvItem av_items = 11;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.AvItemOrBuilder> 
      getAvItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.AvItem av_items = 11;</code>
   */
  bilibili.polymer.app.search.v1.AvItemOrBuilder getAvItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_up = 12;</code>
   * @return The isUp.
   */
  boolean getIsUp();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 attentions = 13;</code>
   * @return The attentions.
   */
  int getAttentions();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 level = 14;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_senior_member = 15;</code>
   * @return The isSeniorMember.
   */
  int getIsSeniorMember();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.VipInfo vip = 16;</code>
   * @return Whether the vip field is set.
   */
  boolean hasVip();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.VipInfo vip = 16;</code>
   * @return The vip.
   */
  bilibili.polymer.app.search.v1.VipInfo getVip();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.VipInfo vip = 16;</code>
   */
  bilibili.polymer.app.search.v1.VipInfoOrBuilder getVipOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Relation relation = 17;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Relation relation = 17;</code>
   * @return The relation.
   */
  bilibili.polymer.app.search.v1.Relation getRelation();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Relation relation = 17;</code>
   */
  bilibili.polymer.app.search.v1.RelationOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string live_link = 18;</code>
   * @return The liveLink.
   */
  java.lang.String getLiveLink();
  /**
   * <pre>
   * </pre>
   *
   * <code>string live_link = 18;</code>
   * @return The bytes for liveLink.
   */
  com.google.protobuf.ByteString
      getLiveLinkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Notice notice = 19;</code>
   * @return Whether the notice field is set.
   */
  boolean hasNotice();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Notice notice = 19;</code>
   * @return The notice.
   */
  bilibili.polymer.app.search.v1.Notice getNotice();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.search.v1.Notice notice = 19;</code>
   */
  bilibili.polymer.app.search.v1.NoticeOrBuilder getNoticeOrBuilder();
}
