// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface SearchItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.SearchItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * 商品
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.GoodsSearchItem goods = 2;</code>
   * @return Whether the goods field is set.
   */
  boolean hasGoods();
  /**
   * <pre>
   * 商品
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.GoodsSearchItem goods = 2;</code>
   * @return The goods.
   */
  bilibili.main.community.reply.v1.GoodsSearchItem getGoods();
  /**
   * <pre>
   * 商品
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.GoodsSearchItem goods = 2;</code>
   */
  bilibili.main.community.reply.v1.GoodsSearchItemOrBuilder getGoodsOrBuilder();

  /**
   * <pre>
   * 视频
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.VideoSearchItem video = 3;</code>
   * @return Whether the video field is set.
   */
  boolean hasVideo();
  /**
   * <pre>
   * 视频
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.VideoSearchItem video = 3;</code>
   * @return The video.
   */
  bilibili.main.community.reply.v1.VideoSearchItem getVideo();
  /**
   * <pre>
   * 视频
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.VideoSearchItem video = 3;</code>
   */
  bilibili.main.community.reply.v1.VideoSearchItemOrBuilder getVideoOrBuilder();

  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.ArticleSearchItem article = 4;</code>
   * @return Whether the article field is set.
   */
  boolean hasArticle();
  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.ArticleSearchItem article = 4;</code>
   * @return The article.
   */
  bilibili.main.community.reply.v1.ArticleSearchItem getArticle();
  /**
   * <pre>
   * 专栏
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.ArticleSearchItem article = 4;</code>
   */
  bilibili.main.community.reply.v1.ArticleSearchItemOrBuilder getArticleOrBuilder();

  bilibili.main.community.reply.v1.SearchItem.ItemCase getItemCase();
}
