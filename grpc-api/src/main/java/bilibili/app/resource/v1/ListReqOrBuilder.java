// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/resource/v1/module.proto

package bilibili.app.resource.v1;

public interface ListReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.resource.v1.ListReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string pool_name = 1;</code>
   * @return The poolName.
   */
  java.lang.String getPoolName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string pool_name = 1;</code>
   * @return The bytes for poolName.
   */
  com.google.protobuf.ByteString
      getPoolNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string module_name = 2;</code>
   * @return The moduleName.
   */
  java.lang.String getModuleName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string module_name = 2;</code>
   * @return The bytes for moduleName.
   */
  com.google.protobuf.ByteString
      getModuleNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionListReq version_list = 3;</code>
   */
  java.util.List<bilibili.app.resource.v1.VersionListReq> 
      getVersionListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionListReq version_list = 3;</code>
   */
  bilibili.app.resource.v1.VersionListReq getVersionList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionListReq version_list = 3;</code>
   */
  int getVersionListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionListReq version_list = 3;</code>
   */
  java.util.List<? extends bilibili.app.resource.v1.VersionListReqOrBuilder> 
      getVersionListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.resource.v1.VersionListReq version_list = 3;</code>
   */
  bilibili.app.resource.v1.VersionListReqOrBuilder getVersionListOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.resource.v1.EnvType env = 4;</code>
   * @return The enum numeric value on the wire for env.
   */
  int getEnvValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.resource.v1.EnvType env = 4;</code>
   * @return The env.
   */
  bilibili.app.resource.v1.EnvType getEnv();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 sys_ver = 5;</code>
   * @return The sysVer.
   */
  int getSysVer();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 scale = 6;</code>
   * @return The scale.
   */
  int getScale();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 arch = 7;</code>
   * @return The arch.
   */
  int getArch();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 list_version = 8;</code>
   * @return The listVersion.
   */
  long getListVersion();
}
