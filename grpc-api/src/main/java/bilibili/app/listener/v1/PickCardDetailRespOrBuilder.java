// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface PickCardDetailRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.PickCardDetailResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 card_id = 1;</code>
   * @return The cardId.
   */
  long getCardId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 pick_id = 2;</code>
   * @return The pickId.
   */
  long getPickId();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.CardModule modules = 3;</code>
   */
  java.util.List<bilibili.app.listener.v1.CardModule> 
      getModulesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.CardModule modules = 3;</code>
   */
  bilibili.app.listener.v1.CardModule getModules(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.CardModule modules = 3;</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.CardModule modules = 3;</code>
   */
  java.util.List<? extends bilibili.app.listener.v1.CardModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.listener.v1.CardModule modules = 3;</code>
   */
  bilibili.app.listener.v1.CardModuleOrBuilder getModulesOrBuilder(
      int index);
}
