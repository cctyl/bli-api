// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/relation/interfaces/api.proto

package bilibili.relation.interface.v1;

public interface AtGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.relation.interface.v1.AtGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 分组类型  2: 我的关注 4:其他 ,其他自测
   * </pre>
   *
   * <code>int32 group_type = 1;</code>
   * @return The groupType.
   */
  int getGroupType();

  /**
   * <pre>
   * 分组名称
   * </pre>
   *
   * <code>string group_name = 2;</code>
   * @return The groupName.
   */
  java.lang.String getGroupName();
  /**
   * <pre>
   * 分组名称
   * </pre>
   *
   * <code>string group_name = 2;</code>
   * @return The bytes for groupName.
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .bilibili.relation.interface.v1.AtItem items = 3;</code>
   */
  java.util.List<bilibili.relation.interface.v1.AtItem> 
      getItemsList();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .bilibili.relation.interface.v1.AtItem items = 3;</code>
   */
  bilibili.relation.interface.v1.AtItem getItems(int index);
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .bilibili.relation.interface.v1.AtItem items = 3;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .bilibili.relation.interface.v1.AtItem items = 3;</code>
   */
  java.util.List<? extends bilibili.relation.interface.v1.AtItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .bilibili.relation.interface.v1.AtItem items = 3;</code>
   */
  bilibili.relation.interface.v1.AtItemOrBuilder getItemsOrBuilder(
      int index);
}
