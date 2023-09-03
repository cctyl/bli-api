// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

public interface MedalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.im.type.Medal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 uid = 1;</code>
   * @return The uid.
   */
  long getUid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 medal_id = 2;</code>
   * @return The medalId.
   */
  int getMedalId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 level = 3;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <pre>
   * </pre>
   *
   * <code>string medal_name = 4;</code>
   * @return The medalName.
   */
  java.lang.String getMedalName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string medal_name = 4;</code>
   * @return The bytes for medalName.
   */
  com.google.protobuf.ByteString
      getMedalNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 score = 5;</code>
   * @return The score.
   */
  int getScore();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 intimacy = 6;</code>
   * @return The intimacy.
   */
  int getIntimacy();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 master_status = 7;</code>
   * @return The masterStatus.
   */
  int getMasterStatus();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 is_receive = 8;</code>
   * @return The isReceive.
   */
  int getIsReceive();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medal_color_start = 9;</code>
   * @return The medalColorStart.
   */
  long getMedalColorStart();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medal_color_end = 10;</code>
   * @return The medalColorEnd.
   */
  long getMedalColorEnd();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medal_color_border = 11;</code>
   * @return The medalColorBorder.
   */
  long getMedalColorBorder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medal_color_name = 12;</code>
   * @return The medalColorName.
   */
  long getMedalColorName();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 medal_color_level = 13;</code>
   * @return The medalColorLevel.
   */
  long getMedalColorLevel();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 guard_level = 14;</code>
   * @return The guardLevel.
   */
  long getGuardLevel();
}