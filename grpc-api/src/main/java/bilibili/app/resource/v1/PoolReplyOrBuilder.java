// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/resource/v1/module.proto

package bilibili.app.resource.v1;

public interface PoolReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.resource.v1.PoolReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.ModuleReply modules = 2;</code>
   */
  java.util.List<bilibili.app.resource.v1.ModuleReply> 
      getModulesList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.ModuleReply modules = 2;</code>
   */
  bilibili.app.resource.v1.ModuleReply getModules(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.ModuleReply modules = 2;</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.ModuleReply modules = 2;</code>
   */
  java.util.List<? extends bilibili.app.resource.v1.ModuleReplyOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.ModuleReply modules = 2;</code>
   */
  bilibili.app.resource.v1.ModuleReplyOrBuilder getModulesOrBuilder(
      int index);
}
