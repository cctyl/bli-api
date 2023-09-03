// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/restriction/restriction.proto

package bilibili.metadata.restriction;

public interface RestrictionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.metadata.restriction.Restriction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 青少年模式开关状态
   * </pre>
   *
   * <code>bool teenagers_mode = 1;</code>
   * @return The teenagersMode.
   */
  boolean getTeenagersMode();

  /**
   * <pre>
   * 课堂模式开关状态
   * </pre>
   *
   * <code>bool lessons_mode = 2;</code>
   * @return The lessonsMode.
   */
  boolean getLessonsMode();

  /**
   * <pre>
   * 模式类型(旧版)
   * </pre>
   *
   * <code>.bilibili.metadata.restriction.ModeType mode = 3;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * 模式类型(旧版)
   * </pre>
   *
   * <code>.bilibili.metadata.restriction.ModeType mode = 3;</code>
   * @return The mode.
   */
  bilibili.metadata.restriction.ModeType getMode();

  /**
   * <pre>
   * app 审核review状态
   * </pre>
   *
   * <code>bool review = 4;</code>
   * @return The review.
   */
  boolean getReview();

  /**
   * <pre>
   * 客户端是否选择关闭个性化推荐
   * </pre>
   *
   * <code>bool disable_rcmd = 5;</code>
   * @return The disableRcmd.
   */
  boolean getDisableRcmd();
}
