// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface Module1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.Module1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string game_name = 1;</code>
   * @return The gameName.
   */
  java.lang.String getGameName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string game_name = 1;</code>
   * @return The bytes for gameName.
   */
  com.google.protobuf.ByteString
      getGameNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string game_icon = 2;</code>
   * @return The gameIcon.
   */
  java.lang.String getGameIcon();
  /**
   * <pre>
   * </pre>
   *
   * <code>string game_icon = 2;</code>
   * @return The bytes for gameIcon.
   */
  com.google.protobuf.ByteString
      getGameIconBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string developer_input_name = 3;</code>
   * @return The developerInputName.
   */
  java.lang.String getDeveloperInputName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string developer_input_name = 3;</code>
   * @return The bytes for developerInputName.
   */
  com.google.protobuf.ByteString
      getDeveloperInputNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AndroidTag tag_list = 4;</code>
   */
  java.util.List<bilibili.ad.v1.AndroidTag> 
      getTagListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AndroidTag tag_list = 4;</code>
   */
  bilibili.ad.v1.AndroidTag getTagList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AndroidTag tag_list = 4;</code>
   */
  int getTagListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AndroidTag tag_list = 4;</code>
   */
  java.util.List<? extends bilibili.ad.v1.AndroidTagOrBuilder> 
      getTagListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.AndroidTag tag_list = 4;</code>
   */
  bilibili.ad.v1.AndroidTagOrBuilder getTagListOrBuilder(
      int index);
}