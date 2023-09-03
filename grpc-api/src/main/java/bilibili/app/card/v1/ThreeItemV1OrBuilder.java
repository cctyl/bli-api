// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/card/v1/single.proto

package bilibili.app.card.v1;

public interface ThreeItemV1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.card.v1.ThreeItemV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return Whether the base field is set.
   */
  boolean hasBase();
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   * @return The base.
   */
  bilibili.app.card.v1.Base getBase();
  /**
   * <pre>
   * 条目基本信息
   * </pre>
   *
   * <code>.bilibili.app.card.v1.Base base = 1;</code>
   */
  bilibili.app.card.v1.BaseOrBuilder getBaseOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 titleIcon = 2;</code>
   * @return The titleIcon.
   */
  int getTitleIcon();

  /**
   * <pre>
   * </pre>
   *
   * <code>string moreUri = 3;</code>
   * @return The moreUri.
   */
  java.lang.String getMoreUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string moreUri = 3;</code>
   * @return The bytes for moreUri.
   */
  com.google.protobuf.ByteString
      getMoreUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string moreText = 4;</code>
   * @return The moreText.
   */
  java.lang.String getMoreText();
  /**
   * <pre>
   * </pre>
   *
   * <code>string moreText = 4;</code>
   * @return The bytes for moreText.
   */
  com.google.protobuf.ByteString
      getMoreTextBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.ThreeItemV1Item items = 5;</code>
   */
  java.util.List<bilibili.app.card.v1.ThreeItemV1Item> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.ThreeItemV1Item items = 5;</code>
   */
  bilibili.app.card.v1.ThreeItemV1Item getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.ThreeItemV1Item items = 5;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.ThreeItemV1Item items = 5;</code>
   */
  java.util.List<? extends bilibili.app.card.v1.ThreeItemV1ItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.card.v1.ThreeItemV1Item items = 5;</code>
   */
  bilibili.app.card.v1.ThreeItemV1ItemOrBuilder getItemsOrBuilder(
      int index);
}
