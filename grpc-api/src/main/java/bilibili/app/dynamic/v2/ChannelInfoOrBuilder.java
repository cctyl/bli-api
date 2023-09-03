// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ChannelInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ChannelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 channel_id = 1;</code>
   * @return The channelId.
   */
  long getChannelId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string channel_name = 2;</code>
   * @return The channelName.
   */
  java.lang.String getChannelName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string channel_name = 2;</code>
   * @return The bytes for channelName.
   */
  com.google.protobuf.ByteString
      getChannelNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 3;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   * </pre>
   *
   * <code>string desc = 3;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_atten = 4;</code>
   * @return The isAtten.
   */
  boolean getIsAtten();

  /**
   * <pre>
   * </pre>
   *
   * <code>string type_icon = 5;</code>
   * @return The typeIcon.
   */
  java.lang.String getTypeIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string type_icon = 5;</code>
   * @return The bytes for typeIcon.
   */
  com.google.protobuf.ByteString
      getTypeIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 6;</code>
   */
  java.util.List<bilibili.app.dynamic.v2.RcmdItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 6;</code>
   */
  bilibili.app.dynamic.v2.RcmdItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 6;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 6;</code>
   */
  java.util.List<? extends bilibili.app.dynamic.v2.RcmdItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.RcmdItem items = 6;</code>
   */
  bilibili.app.dynamic.v2.RcmdItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string icon = 7;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_uri = 8;</code>
   * @return The jumpUri.
   */
  java.lang.String getJumpUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string jump_uri = 8;</code>
   * @return The bytes for jumpUri.
   */
  com.google.protobuf.ByteString
      getJumpUriBytes();
}