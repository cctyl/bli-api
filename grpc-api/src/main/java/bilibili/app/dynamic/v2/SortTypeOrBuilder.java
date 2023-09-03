// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface SortTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.SortType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 排序策略
   * 1:推荐排序 2:最常访问 3:最近关注
   * </pre>
   *
   * <code>int32 sort_type = 1;</code>
   * @return The sortType.
   */
  int getSortType();

  /**
   * <pre>
   * 排序策略名称
   * </pre>
   *
   * <code>string sort_type_name = 2;</code>
   * @return The sortTypeName.
   */
  java.lang.String getSortTypeName();
  /**
   * <pre>
   * 排序策略名称
   * </pre>
   *
   * <code>string sort_type_name = 2;</code>
   * @return The bytes for sortTypeName.
   */
  com.google.protobuf.ByteString
      getSortTypeNameBytes();
}
