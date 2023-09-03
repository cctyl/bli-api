// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface ExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.Expression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string keyword = 1;</code>
   * @return A list containing the keyword.
   */
  java.util.List<java.lang.String>
      getKeywordList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string keyword = 1;</code>
   * @return The count of keyword.
   */
  int getKeywordCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string keyword = 1;</code>
   * @param index The index of the element to return.
   * @return The keyword at the given index.
   */
  java.lang.String getKeyword(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string keyword = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keyword at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.Period period = 3;</code>
   */
  java.util.List<bilibili.community.service.dm.v1.Period> 
      getPeriodList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.Period period = 3;</code>
   */
  bilibili.community.service.dm.v1.Period getPeriod(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.Period period = 3;</code>
   */
  int getPeriodCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.Period period = 3;</code>
   */
  java.util.List<? extends bilibili.community.service.dm.v1.PeriodOrBuilder> 
      getPeriodOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.Period period = 3;</code>
   */
  bilibili.community.service.dm.v1.PeriodOrBuilder getPeriodOrBuilder(
      int index);
}