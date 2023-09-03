// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface FavFolderListReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.FavFolderListReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int32 folder_types = 1;</code>
   * @return A list containing the folderTypes.
   */
  java.util.List<java.lang.Integer> getFolderTypesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int32 folder_types = 1;</code>
   * @return The count of folderTypes.
   */
  int getFolderTypesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated int32 folder_types = 1;</code>
   * @param index The index of the element to return.
   * @return The folderTypes at the given index.
   */
  int getFolderTypes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 2;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 2;</code>
   * @return The item.
   */
  bilibili.app.listener.v1.PlayItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.PlayItem item = 2;</code>
   */
  bilibili.app.listener.v1.PlayItemOrBuilder getItemOrBuilder();
}