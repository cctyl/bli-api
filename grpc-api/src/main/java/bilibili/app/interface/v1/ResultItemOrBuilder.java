// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/search.proto

package bilibili.app.interface.v1;

public interface ResultItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.ResultItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 来源
   * </pre>
   *
   * <code>string from = 1;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * 来源
   * </pre>
   *
   * <code>string from = 1;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 显示结果(语法高亮)
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 显示结果(语法高亮)
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 搜索关键字
   * </pre>
   *
   * <code>string keyword = 3;</code>
   * @return The keyword.
   */
  java.lang.String getKeyword();
  /**
   * <pre>
   * 搜索关键字
   * </pre>
   *
   * <code>string keyword = 3;</code>
   * @return The bytes for keyword.
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <pre>
   * 序号
   * </pre>
   *
   * <code>int32 position = 4;</code>
   * @return The position.
   */
  int getPosition();

  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 图片尺寸
   * </pre>
   *
   * <code>double cover_size = 6;</code>
   * @return The coverSize.
   */
  double getCoverSize();

  /**
   * <pre>
   * sug词类型
   * </pre>
   *
   * <code>string sug_type = 7;</code>
   * @return The sugType.
   */
  java.lang.String getSugType();
  /**
   * <pre>
   * sug词类型
   * </pre>
   *
   * <code>string sug_type = 7;</code>
   * @return The bytes for sugType.
   */
  com.google.protobuf.ByteString
      getSugTypeBytes();

  /**
   * <pre>
   * 词条大类型
   * </pre>
   *
   * <code>int32 term_type = 8;</code>
   * @return The termType.
   */
  int getTermType();

  /**
   * <pre>
   * 跳转类型
   * </pre>
   *
   * <code>string goto = 9;</code>
   * @return The goto.
   */
  java.lang.String getGoto();
  /**
   * <pre>
   * 跳转类型
   * </pre>
   *
   * <code>string goto = 9;</code>
   * @return The bytes for goto.
   */
  com.google.protobuf.ByteString
      getGotoBytes();

  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 10;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 10;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.OfficialVerify official_verify = 11;</code>
   * @return Whether the officialVerify field is set.
   */
  boolean hasOfficialVerify();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.OfficialVerify official_verify = 11;</code>
   * @return The officialVerify.
   */
  bilibili.app.interface.v1.OfficialVerify getOfficialVerify();
  /**
   * <pre>
   * 认证信息
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.OfficialVerify official_verify = 11;</code>
   */
  bilibili.app.interface.v1.OfficialVerifyOrBuilder getOfficialVerifyOrBuilder();

  /**
   * <pre>
   * 跳转参数
   * </pre>
   *
   * <code>string param = 12;</code>
   * @return The param.
   */
  java.lang.String getParam();
  /**
   * <pre>
   * 跳转参数
   * </pre>
   *
   * <code>string param = 12;</code>
   * @return The bytes for param.
   */
  com.google.protobuf.ByteString
      getParamBytes();

  /**
   * <pre>
   * up主mid
   * </pre>
   *
   * <code>int64 mid = 13;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 粉丝数
   * </pre>
   *
   * <code>int32 fans = 14;</code>
   * @return The fans.
   */
  int getFans();

  /**
   * <pre>
   * up主等级
   * </pre>
   *
   * <code>int32 level = 15;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <pre>
   * up主稿件数
   * </pre>
   *
   * <code>int32 archives = 16;</code>
   * @return The archives.
   */
  int getArchives();

  /**
   * <pre>
   * 投稿时间
   * </pre>
   *
   * <code>int64 ptime = 17;</code>
   * @return The ptime.
   */
  long getPtime();

  /**
   * <pre>
   * season类型名称
   * </pre>
   *
   * <code>string season_type_name = 18;</code>
   * @return The seasonTypeName.
   */
  java.lang.String getSeasonTypeName();
  /**
   * <pre>
   * season类型名称
   * </pre>
   *
   * <code>string season_type_name = 18;</code>
   * @return The bytes for seasonTypeName.
   */
  com.google.protobuf.ByteString
      getSeasonTypeNameBytes();

  /**
   * <pre>
   * 地区
   * </pre>
   *
   * <code>string area = 19;</code>
   * @return The area.
   */
  java.lang.String getArea();
  /**
   * <pre>
   * 地区
   * </pre>
   *
   * <code>string area = 19;</code>
   * @return The bytes for area.
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <pre>
   * 作品风格
   * </pre>
   *
   * <code>string style = 20;</code>
   * @return The style.
   */
  java.lang.String getStyle();
  /**
   * <pre>
   * 作品风格
   * </pre>
   *
   * <code>string style = 20;</code>
   * @return The bytes for style.
   */
  com.google.protobuf.ByteString
      getStyleBytes();

  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string label = 21;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string label = 21;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * 评分
   * </pre>
   *
   * <code>double rating = 22;</code>
   * @return The rating.
   */
  double getRating();

  /**
   * <pre>
   * 投票数
   * </pre>
   *
   * <code>int32 vote = 23;</code>
   * @return The vote.
   */
  int getVote();

  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ReasonStyle badges = 24;</code>
   */
  java.util.List<bilibili.app.interface.v1.ReasonStyle> 
      getBadgesList();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ReasonStyle badges = 24;</code>
   */
  bilibili.app.interface.v1.ReasonStyle getBadges(int index);
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ReasonStyle badges = 24;</code>
   */
  int getBadgesCount();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ReasonStyle badges = 24;</code>
   */
  java.util.List<? extends bilibili.app.interface.v1.ReasonStyleOrBuilder> 
      getBadgesOrBuilderList();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.ReasonStyle badges = 24;</code>
   */
  bilibili.app.interface.v1.ReasonStyleOrBuilder getBadgesOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string styles = 25;</code>
   * @return The styles.
   */
  java.lang.String getStyles();
  /**
   * <pre>
   * </pre>
   *
   * <code>string styles = 25;</code>
   * @return The bytes for styles.
   */
  com.google.protobuf.ByteString
      getStylesBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 module_id = 26;</code>
   * @return The moduleId.
   */
  long getModuleId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string live_link = 27;</code>
   * @return The liveLink.
   */
  java.lang.String getLiveLink();
  /**
   * <pre>
   * </pre>
   *
   * <code>string live_link = 27;</code>
   * @return The bytes for liveLink.
   */
  com.google.protobuf.ByteString
      getLiveLinkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 face_nft_new = 28;</code>
   * @return The faceNftNew.
   */
  int getFaceNftNew();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.NftFaceIcon nft_face_icon = 29;</code>
   * @return Whether the nftFaceIcon field is set.
   */
  boolean hasNftFaceIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.NftFaceIcon nft_face_icon = 29;</code>
   * @return The nftFaceIcon.
   */
  bilibili.app.interface.v1.NftFaceIcon getNftFaceIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.NftFaceIcon nft_face_icon = 29;</code>
   */
  bilibili.app.interface.v1.NftFaceIconOrBuilder getNftFaceIconOrBuilder();
}