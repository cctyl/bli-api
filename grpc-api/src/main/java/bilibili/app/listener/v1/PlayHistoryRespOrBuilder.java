// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface PlayHistoryRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.PlayHistoryResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 total = 1;</code>
   * @return The total.
   */
  int getTotal();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool reach_end = 2;</code>
   * @return The reachEnd.
   */
  boolean getReachEnd();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DetailItem list = 3;</code>
   */
  java.util.List<bilibili.app.listener.v1.DetailItem> 
      getListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DetailItem list = 3;</code>
   */
  bilibili.app.listener.v1.DetailItem getList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DetailItem list = 3;</code>
   */
  int getListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DetailItem list = 3;</code>
   */
  java.util.List<? extends bilibili.app.listener.v1.DetailItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.DetailItem list = 3;</code>
   */
  bilibili.app.listener.v1.DetailItemOrBuilder getListOrBuilder(
      int index);
}
