// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

public interface CursorItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.CursorItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ugc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardUGC card_ugc = 1;</code>
   * @return Whether the cardUgc field is set.
   */
  boolean hasCardUgc();
  /**
   * <pre>
   * ugc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardUGC card_ugc = 1;</code>
   * @return The cardUgc.
   */
  bilibili.app.interface.v1.CardUGC getCardUgc();
  /**
   * <pre>
   * ugc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardUGC card_ugc = 1;</code>
   */
  bilibili.app.interface.v1.CardUGCOrBuilder getCardUgcOrBuilder();

  /**
   * <pre>
   * pgc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardOGV card_ogv = 2;</code>
   * @return Whether the cardOgv field is set.
   */
  boolean hasCardOgv();
  /**
   * <pre>
   * pgc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardOGV card_ogv = 2;</code>
   * @return The cardOgv.
   */
  bilibili.app.interface.v1.CardOGV getCardOgv();
  /**
   * <pre>
   * pgc稿件
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardOGV card_ogv = 2;</code>
   */
  bilibili.app.interface.v1.CardOGVOrBuilder getCardOgvOrBuilder();

  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardArticle card_article = 3;</code>
   * @return Whether the cardArticle field is set.
   */
  boolean hasCardArticle();
  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardArticle card_article = 3;</code>
   * @return The cardArticle.
   */
  bilibili.app.interface.v1.CardArticle getCardArticle();
  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardArticle card_article = 3;</code>
   */
  bilibili.app.interface.v1.CardArticleOrBuilder getCardArticleOrBuilder();

  /**
   * <pre>
   * 直播
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardLive card_live = 4;</code>
   * @return Whether the cardLive field is set.
   */
  boolean hasCardLive();
  /**
   * <pre>
   * 直播
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardLive card_live = 4;</code>
   * @return The cardLive.
   */
  bilibili.app.interface.v1.CardLive getCardLive();
  /**
   * <pre>
   * 直播
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardLive card_live = 4;</code>
   */
  bilibili.app.interface.v1.CardLiveOrBuilder getCardLiveOrBuilder();

  /**
   * <pre>
   * 课程
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardCheese card_cheese = 5;</code>
   * @return Whether the cardCheese field is set.
   */
  boolean hasCardCheese();
  /**
   * <pre>
   * 课程
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardCheese card_cheese = 5;</code>
   * @return The cardCheese.
   */
  bilibili.app.interface.v1.CardCheese getCardCheese();
  /**
   * <pre>
   * 课程
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.CardCheese card_cheese = 5;</code>
   */
  bilibili.app.interface.v1.CardCheeseOrBuilder getCardCheeseOrBuilder();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 6;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 目标uri/url
   * </pre>
   *
   * <code>string uri = 7;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 目标uri/url
   * </pre>
   *
   * <code>string uri = 7;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 观看时间
   * </pre>
   *
   * <code>int64 viewAt = 8;</code>
   * @return The viewAt.
   */
  long getViewAt();

  /**
   * <pre>
   * 历史记录id
   * </pre>
   *
   * <code>int64 kid = 9;</code>
   * @return The kid.
   */
  long getKid();

  /**
   * <pre>
   * 业务id
   * </pre>
   *
   * <code>int64 oid = 10;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 11;</code>
   * @return The business.
   */
  java.lang.String getBusiness();
  /**
   * <pre>
   * 业务类型
   * archive:视频 live:直播 article:专栏 goods:商品 show:展演
   * </pre>
   *
   * <code>string business = 11;</code>
   * @return The bytes for business.
   */
  com.google.protobuf.ByteString
      getBusinessBytes();

  /**
   * <pre>
   * 业务类型代码
   * </pre>
   *
   * <code>int32 tp = 12;</code>
   * @return The tp.
   */
  int getTp();

  /**
   * <pre>
   * 设备标识
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.DeviceType dt = 13;</code>
   * @return Whether the dt field is set.
   */
  boolean hasDt();
  /**
   * <pre>
   * 设备标识
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.DeviceType dt = 13;</code>
   * @return The dt.
   */
  bilibili.app.interface.v1.DeviceType getDt();
  /**
   * <pre>
   * 设备标识
   * </pre>
   *
   * <code>.bilibili.app.interface.v1.DeviceType dt = 13;</code>
   */
  bilibili.app.interface.v1.DeviceTypeOrBuilder getDtOrBuilder();

  /**
   * <pre>
   * 是否有分享按钮
   * </pre>
   *
   * <code>bool has_share = 14;</code>
   * @return The hasShare.
   */
  boolean getHasShare();

  bilibili.app.interface.v1.CursorItem.CardItemCase getCardItemCase();
}