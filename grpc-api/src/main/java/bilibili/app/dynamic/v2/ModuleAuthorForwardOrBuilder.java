// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ModuleAuthorForwardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ModuleAuthorForward)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 展示标题
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ModuleAuthorForwardTitle title = 1;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.ModuleAuthorForwardTitle> 
      getTitleList();
  /**
   * <pre>
   * 展示标题
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ModuleAuthorForwardTitle title = 1;</code>
   */
  bilibili.app.dynamic.v2.ModuleAuthorForwardTitle getTitle(int index);
  /**
   * <pre>
   * 展示标题
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ModuleAuthorForwardTitle title = 1;</code>
   */
  int getTitleCount();
  /**
   * <pre>
   * 展示标题
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ModuleAuthorForwardTitle title = 1;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.ModuleAuthorForwardTitleOrBuilder> 
      getTitleOrBuilderList();
  /**
   * <pre>
   * 展示标题
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ModuleAuthorForwardTitle title = 1;</code>
   */
  bilibili.app.dynamic.v2.ModuleAuthorForwardTitleOrBuilder getTitleOrBuilder(
      int index);

  /**
   * <pre>
   * 源卡片跳转链接
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * 源卡片跳转链接
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * 用户uid
   * </pre>
   *
   * <code>int64 uid = 3;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * 时间标签
   * </pre>
   *
   * <code>string ptime_label_text = 4;</code>
   * @return The ptimeLabelText.
   */
  java.lang.String getPtimeLabelText();
  /**
   * <pre>
   * 时间标签
   * </pre>
   *
   * <code>string ptime_label_text = 4;</code>
   * @return The bytes for ptimeLabelText.
   */
  com.google.protobuf.ByteString
      getPtimeLabelTextBytes();

  /**
   * <pre>
   * 是否展示关注
   * </pre>
   *
   * <code>bool show_follow = 5;</code>
   * @return The showFollow.
   */
  boolean getShowFollow();

  /**
   * <pre>
   * 源up主头像
   * </pre>
   *
   * <code>string face_url = 6;</code>
   * @return The faceUrl.
   */
  java.lang.String getFaceUrl();
  /**
   * <pre>
   * 源up主头像
   * </pre>
   *
   * <code>string face_url = 6;</code>
   * @return The bytes for faceUrl.
   */
  com.google.protobuf.ByteString
      getFaceUrlBytes();

  /**
   * <pre>
   * 双向关系
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Relation relation = 7;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * 双向关系
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Relation relation = 7;</code>
   * @return The relation.
   */
  bilibili.app.dynamic.v2.Relation getRelation();
  /**
   * <pre>
   * 双向关系
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Relation relation = 7;</code>
   */
  bilibili.app.dynamic.v2.RelationOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * 右侧操作区域 - 三点样式
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 8;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.ThreePointItem> 
      getTpListList();
  /**
   * <pre>
   * 右侧操作区域 - 三点样式
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 8;</code>
   */
  bilibili.app.dynamic.v2.ThreePointItem getTpList(int index);
  /**
   * <pre>
   * 右侧操作区域 - 三点样式
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 8;</code>
   */
  int getTpListCount();
  /**
   * <pre>
   * 右侧操作区域 - 三点样式
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 8;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.ThreePointItemOrBuilder> 
      getTpListOrBuilderList();
  /**
   * <pre>
   * 右侧操作区域 - 三点样式
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 8;</code>
   */
  bilibili.app.dynamic.v2.ThreePointItemOrBuilder getTpListOrBuilder(
      int index);
}