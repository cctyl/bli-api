// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

public interface MainListReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.main.community.reply.v1.MainListReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 目标评论区id
   * </pre>
   *
   * <code>int64 oid = 1;</code>
   * @return The oid.
   */
  long getOid();

  /**
   * <pre>
   * 目标评论区业务type
   * </pre>
   *
   * <code>int64 type = 2;</code>
   * @return The type.
   */
  long getType();

  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 3;</code>
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 3;</code>
   * @return The cursor.
   */
  bilibili.main.community.reply.v1.CursorReq getCursor();
  /**
   * <pre>
   * 页面游标
   * </pre>
   *
   * <code>.bilibili.main.community.reply.v1.CursorReq cursor = 3;</code>
   */
  bilibili.main.community.reply.v1.CursorReqOrBuilder getCursorOrBuilder();

  /**
   * <pre>
   * 扩展数据json
   * </pre>
   *
   * <code>string extra = 4;</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <pre>
   * 扩展数据json
   * </pre>
   *
   * <code>string extra = 4;</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();

  /**
   * <pre>
   * 广告扩展
   * </pre>
   *
   * <code>string ad_extra = 5;</code>
   * @return The adExtra.
   */
  java.lang.String getAdExtra();
  /**
   * <pre>
   * 广告扩展
   * </pre>
   *
   * <code>string ad_extra = 5;</code>
   * @return The bytes for adExtra.
   */
  com.google.protobuf.ByteString
      getAdExtraBytes();

  /**
   * <pre>
   * 目标评论rpid
   * </pre>
   *
   * <code>int64 rpid = 6;</code>
   * @return The rpid.
   */
  long getRpid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 seek_rpid = 7;</code>
   * @return The seekRpid.
   */
  long getSeekRpid();

  /**
   * <pre>
   * 评论区筛选类型 取值可为: ["全部" "粉丝评论" "笔记长评"]
   * </pre>
   *
   * <code>string filter_tag_name = 8;</code>
   * @return The filterTagName.
   */
  java.lang.String getFilterTagName();
  /**
   * <pre>
   * 评论区筛选类型 取值可为: ["全部" "粉丝评论" "笔记长评"]
   * </pre>
   *
   * <code>string filter_tag_name = 8;</code>
   * @return The bytes for filterTagName.
   */
  com.google.protobuf.ByteString
      getFilterTagNameBytes();
}
