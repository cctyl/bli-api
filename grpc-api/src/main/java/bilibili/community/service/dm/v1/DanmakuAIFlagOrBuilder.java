// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface DanmakuAIFlagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.DanmakuAIFlag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕ai云屏蔽条目
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.DanmakuFlag dm_flags = 1;</code>
   */
  java.util.List<bilibili.community.service.dm.v1.DanmakuFlag> 
      getDmFlagsList();
  /**
   * <pre>
   * 弹幕ai云屏蔽条目
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.DanmakuFlag dm_flags = 1;</code>
   */
  bilibili.community.service.dm.v1.DanmakuFlag getDmFlags(int index);
  /**
   * <pre>
   * 弹幕ai云屏蔽条目
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.DanmakuFlag dm_flags = 1;</code>
   */
  int getDmFlagsCount();
  /**
   * <pre>
   * 弹幕ai云屏蔽条目
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.DanmakuFlag dm_flags = 1;</code>
   */
  java.util.List<? extends bilibili.community.service.dm.v1.DanmakuFlagOrBuilder> 
      getDmFlagsOrBuilderList();
  /**
   * <pre>
   * 弹幕ai云屏蔽条目
   * </pre>
   *
   * <code>repeated .bilibili.community.service.dm.v1.DanmakuFlag dm_flags = 1;</code>
   */
  bilibili.community.service.dm.v1.DanmakuFlagOrBuilder getDmFlagsOrBuilder(
      int index);
}