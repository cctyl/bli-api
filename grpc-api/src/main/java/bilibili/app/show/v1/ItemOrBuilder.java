// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/show/rank/v1/rank.proto

package bilibili.app.show.v1;

public interface ItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.show.v1.Item)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面url
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 参数(稿件avid)
   * </pre>
   *
   * <code>string param = 3;</code>
   * @return The param.
   */
  java.lang.String getParam();
  /**
   * <pre>
   * 参数(稿件avid)
   * </pre>
   *
   * <code>string param = 3;</code>
   * @return The bytes for param.
   */
  com.google.protobuf.ByteString
      getParamBytes();

  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转uri
   * </pre>
   *
   * <code>string uri = 4;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 重定向url
   * </pre>
   *
   * <code>string redirect_url = 5;</code>
   * @return The redirectUrl.
   */
  java.lang.String getRedirectUrl();
  /**
   * <pre>
   * 重定向url
   * </pre>
   *
   * <code>string redirect_url = 5;</code>
   * @return The bytes for redirectUrl.
   */
  com.google.protobuf.ByteString
      getRedirectUrlBytes();

  /**
   * <pre>
   * 跳转类型
   * av:视频稿件
   * </pre>
   *
   * <code>string goto = 6;</code>
   * @return The goto.
   */
  java.lang.String getGoto();
  /**
   * <pre>
   * 跳转类型
   * av:视频稿件
   * </pre>
   *
   * <code>string goto = 6;</code>
   * @return The bytes for goto.
   */
  com.google.protobuf.ByteString
      getGotoBytes();

  /**
   * <pre>
   * 播放数
   * </pre>
   *
   * <code>int32 play = 7;</code>
   * @return The play.
   */
  int getPlay();

  /**
   * <pre>
   * 弹幕数
   * </pre>
   *
   * <code>int32 danmaku = 8;</code>
   * @return The danmaku.
   */
  int getDanmaku();

  /**
   * <pre>
   * UP主mid
   * </pre>
   *
   * <code>int64 mid = 9;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string name = 10;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * UP主昵称
   * </pre>
   *
   * <code>string name = 10;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * UP主头像url
   * </pre>
   *
   * <code>string face = 11;</code>
   * @return The face.
   */
  java.lang.String getFace();
  /**
   * <pre>
   * UP主头像url
   * </pre>
   *
   * <code>string face = 11;</code>
   * @return The bytes for face.
   */
  com.google.protobuf.ByteString
      getFaceBytes();

  /**
   * <pre>
   * 评论数
   * </pre>
   *
   * <code>int32 reply = 12;</code>
   * @return The reply.
   */
  int getReply();

  /**
   * <pre>
   * 收藏数
   * </pre>
   *
   * <code>int32 favourite = 13;</code>
   * @return The favourite.
   */
  int getFavourite();

  /**
   * <pre>
   * 发布时间
   * </pre>
   *
   * <code>int64 pub_date = 14;</code>
   * @return The pubDate.
   */
  long getPubDate();

  /**
   * <pre>
   * 分区tid
   * </pre>
   *
   * <code>int32 rid = 15;</code>
   * @return The rid.
   */
  int getRid();

  /**
   * <pre>
   * 子分区名
   * </pre>
   *
   * <code>string rname = 16;</code>
   * @return The rname.
   */
  java.lang.String getRname();
  /**
   * <pre>
   * 子分区名
   * </pre>
   *
   * <code>string rname = 16;</code>
   * @return The bytes for rname.
   */
  com.google.protobuf.ByteString
      getRnameBytes();

  /**
   * <pre>
   * 视频总时长
   * </pre>
   *
   * <code>int64 duration = 17;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 点赞数
   * </pre>
   *
   * <code>int32 like = 18;</code>
   * @return The like.
   */
  int getLike();

  /**
   * <pre>
   * 1P cid
   * </pre>
   *
   * <code>int64 cid = 19;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 综合评分
   * </pre>
   *
   * <code>int64 pts = 20;</code>
   * @return The pts.
   */
  long getPts();

  /**
   * <pre>
   * 合作视频文案
   * </pre>
   *
   * <code>string cooperation = 21;</code>
   * @return The cooperation.
   */
  java.lang.String getCooperation();
  /**
   * <pre>
   * 合作视频文案
   * </pre>
   *
   * <code>string cooperation = 21;</code>
   * @return The bytes for cooperation.
   */
  com.google.protobuf.ByteString
      getCooperationBytes();

  /**
   * <pre>
   * 属性位
   * 0:未关注 1:已关注
   * </pre>
   *
   * <code>int32 attribute = 22;</code>
   * @return The attribute.
   */
  int getAttribute();

  /**
   * <pre>
   * UP主粉丝数
   * </pre>
   *
   * <code>int64 follower = 23;</code>
   * @return The follower.
   */
  long getFollower();

  /**
   * <pre>
   * UP主认证信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.OfficialVerify official_verify = 24;</code>
   * @return Whether the officialVerify field is set.
   */
  boolean hasOfficialVerify();
  /**
   * <pre>
   * UP主认证信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.OfficialVerify official_verify = 24;</code>
   * @return The officialVerify.
   */
  bilibili.app.show.v1.OfficialVerify getOfficialVerify();
  /**
   * <pre>
   * UP主认证信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.OfficialVerify official_verify = 24;</code>
   */
  bilibili.app.show.v1.OfficialVerifyOrBuilder getOfficialVerifyOrBuilder();

  /**
   * <pre>
   * 同一UP收起子项列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item children = 25;</code>
   */
  java.util.List<bilibili.app.show.v1.Item> 
      getChildrenList();
  /**
   * <pre>
   * 同一UP收起子项列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item children = 25;</code>
   */
  bilibili.app.show.v1.Item getChildren(int index);
  /**
   * <pre>
   * 同一UP收起子项列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item children = 25;</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * 同一UP收起子项列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item children = 25;</code>
   */
  java.util.List<? extends bilibili.app.show.v1.ItemOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * 同一UP收起子项列表
   * </pre>
   *
   * <code>repeated .bilibili.app.show.v1.Item children = 25;</code>
   */
  bilibili.app.show.v1.ItemOrBuilder getChildrenOrBuilder(
      int index);

  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.Relation relation = 26;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.Relation relation = 26;</code>
   * @return The relation.
   */
  bilibili.app.show.v1.Relation getRelation();
  /**
   * <pre>
   * 关系信息
   * </pre>
   *
   * <code>.bilibili.app.show.v1.Relation relation = 26;</code>
   */
  bilibili.app.show.v1.RelationOrBuilder getRelationOrBuilder();
}