// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface ReplyVipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.ReplyVip)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 due_date = 2;</code>
   * @return The dueDate.
   */
  long getDueDate();

  /**
   * <pre>
   * </pre>
   *
   * <code>string due_remark = 3;</code>
   * @return The dueRemark.
   */
  java.lang.String getDueRemark();
  /**
   * <pre>
   * </pre>
   *
   * <code>string due_remark = 3;</code>
   * @return The bytes for dueRemark.
   */
  com.google.protobuf.ByteString
      getDueRemarkBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 access_status = 4;</code>
   * @return The accessStatus.
   */
  int getAccessStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 vip_status = 5;</code>
   * @return The vipStatus.
   */
  int getVipStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_status_warn = 6;</code>
   * @return The vipStatusWarn.
   */
  java.lang.String getVipStatusWarn();
  /**
   * <pre>
   * </pre>
   *
   * <code>string vip_status_warn = 6;</code>
   * @return The bytes for vipStatusWarn.
   */
  com.google.protobuf.ByteString
      getVipStatusWarnBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 theme_type = 7;</code>
   * @return The themeType.
   */
  int getThemeType();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.VipLabel label = 8;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.VipLabel label = 8;</code>
   * @return The label.
   */
  bilibili.web.interfaces.v1.VipLabel getLabel();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.VipLabel label = 8;</code>
   */
  bilibili.web.interfaces.v1.VipLabelOrBuilder getLabelOrBuilder();
}
