// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playerunite/ugcanymodel/ugcanymodel.proto

package bilibili.app.playerunite.ugcanymodel;

public interface PlayLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.playerunite.ugcanymodel.PlayLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bilibili.app.playerunite.ugcanymodel.PlayLimitCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.bilibili.app.playerunite.ugcanymodel.PlayLimitCode code = 1;</code>
   * @return The code.
   */
  bilibili.app.playerunite.ugcanymodel.PlayLimitCode getCode();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string sub_message = 3;</code>
   * @return The subMessage.
   */
  java.lang.String getSubMessage();
  /**
   * <code>string sub_message = 3;</code>
   * @return The bytes for subMessage.
   */
  com.google.protobuf.ByteString
      getSubMessageBytes();

  /**
   * <code>.bilibili.app.playerunite.ugcanymodel.ButtonStyle button = 4;</code>
   * @return Whether the button field is set.
   */
  boolean hasButton();
  /**
   * <code>.bilibili.app.playerunite.ugcanymodel.ButtonStyle button = 4;</code>
   * @return The button.
   */
  bilibili.app.playerunite.ugcanymodel.ButtonStyle getButton();
  /**
   * <code>.bilibili.app.playerunite.ugcanymodel.ButtonStyle button = 4;</code>
   */
  bilibili.app.playerunite.ugcanymodel.ButtonStyleOrBuilder getButtonOrBuilder();
}
