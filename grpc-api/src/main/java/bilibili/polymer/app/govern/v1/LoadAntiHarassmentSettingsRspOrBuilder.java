// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/community/govern/v1/govern.proto

package bilibili.polymer.app.govern.v1;

public interface LoadAntiHarassmentSettingsRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.govern.v1.LoadAntiHarassmentSettingsRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>bool anti_harassment_ret = 1;</code>
   * @return The antiHarassmentRet.
   */
  boolean getAntiHarassmentRet();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.govern.v1.AntiHarassmentSetting anti_harassment_setting = 2;</code>
   * @return Whether the antiHarassmentSetting field is set.
   */
  boolean hasAntiHarassmentSetting();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.govern.v1.AntiHarassmentSetting anti_harassment_setting = 2;</code>
   * @return The antiHarassmentSetting.
   */
  bilibili.polymer.app.govern.v1.AntiHarassmentSetting getAntiHarassmentSetting();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.polymer.app.govern.v1.AntiHarassmentSetting anti_harassment_setting = 2;</code>
   */
  bilibili.polymer.app.govern.v1.AntiHarassmentSettingOrBuilder getAntiHarassmentSettingOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 show_window = 3;</code>
   * @return The showWindow.
   */
  int getShowWindow();
}
