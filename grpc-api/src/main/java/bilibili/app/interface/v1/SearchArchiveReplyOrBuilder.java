// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/space.proto

package bilibili.app.interface.v1;

public interface SearchArchiveReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.interface.v1.SearchArchiveReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.Arc archives = 1;</code>
   */
  java.util.List<bilibili.app.interface.v1.Arc> 
      getArchivesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.Arc archives = 1;</code>
   */
  bilibili.app.interface.v1.Arc getArchives(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.Arc archives = 1;</code>
   */
  int getArchivesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.Arc archives = 1;</code>
   */
  java.util.List<? extends bilibili.app.interface.v1.ArcOrBuilder> 
      getArchivesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.interface.v1.Arc archives = 1;</code>
   */
  bilibili.app.interface.v1.ArcOrBuilder getArchivesOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 total = 2;</code>
   * @return The total.
   */
  long getTotal();
}
