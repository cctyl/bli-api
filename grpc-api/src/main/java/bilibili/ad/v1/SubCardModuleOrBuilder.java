// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface SubCardModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.SubCardModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string subcard_type = 1;</code>
   * @return The subcardType.
   */
  java.lang.String getSubcardType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string subcard_type = 1;</code>
   * @return The bytes for subcardType.
   */
  com.google.protobuf.ByteString
      getSubcardTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

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
   * <code>string rank_stars = 4;</code>
   * @return The rankStars.
   */
  java.lang.String getRankStars();
  /**
   * <pre>
   * </pre>
   *
   * <code>string rank_stars = 4;</code>
   * @return The bytes for rankStars.
   */
  com.google.protobuf.ByteString
      getRankStarsBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string amount_number = 5;</code>
   * @return The amountNumber.
   */
  java.lang.String getAmountNumber();
  /**
   * <pre>
   * </pre>
   *
   * <code>string amount_number = 5;</code>
   * @return The bytes for amountNumber.
   */
  com.google.protobuf.ByteString
      getAmountNumberBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 6;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <pre>
   * </pre>
   *
   * <code>string avatar = 6;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 7;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 7;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 8;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 8;</code>
   * @return The button.
   */
  bilibili.ad.v1.AdButtonDto getButton();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.ad.v1.AdButtonDto button = 8;</code>
   */
  bilibili.ad.v1.AdButtonDtoOrBuilder getButtonOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.TagInfo tag_infos = 9;</code>
   */
  java.util.List<bilibili.ad.v1.TagInfo> 
      getTagInfosList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.TagInfo tag_infos = 9;</code>
   */
  bilibili.ad.v1.TagInfo getTagInfos(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.TagInfo tag_infos = 9;</code>
   */
  int getTagInfosCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.TagInfo tag_infos = 9;</code>
   */
  java.util.List<? extends bilibili.ad.v1.TagInfoOrBuilder> 
      getTagInfosOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.TagInfo tag_infos = 9;</code>
   */
  bilibili.ad.v1.TagInfoOrBuilder getTagInfosOrBuilder(
      int index);
}