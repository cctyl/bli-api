// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

public interface CreateAttachCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.CreateAttachCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 商品大卡
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateGoodsCard goods = 1;</code>
   * @return Whether the goods field is set.
   */
  boolean hasGoods();
  /**
   * <pre>
   * 商品大卡
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateGoodsCard goods = 1;</code>
   * @return The goods.
   */
  bilibili.dynamic.CreateGoodsCard getGoods();
  /**
   * <pre>
   * 商品大卡
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateGoodsCard goods = 1;</code>
   */
  bilibili.dynamic.CreateGoodsCardOrBuilder getGoodsOrBuilder();

  /**
   * <pre>
   * 通用附加大卡，目前仅限定Match,Game,Ugc,Pugv,Reserve，且同时只能有一个
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateCommonAttachCard common_card = 2;</code>
   * @return Whether the commonCard field is set.
   */
  boolean hasCommonCard();
  /**
   * <pre>
   * 通用附加大卡，目前仅限定Match,Game,Ugc,Pugv,Reserve，且同时只能有一个
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateCommonAttachCard common_card = 2;</code>
   * @return The commonCard.
   */
  bilibili.dynamic.CreateCommonAttachCard getCommonCard();
  /**
   * <pre>
   * 通用附加大卡，目前仅限定Match,Game,Ugc,Pugv,Reserve，且同时只能有一个
   * </pre>
   *
   * <code>.bilibili.dynamic.CreateCommonAttachCard common_card = 2;</code>
   */
  bilibili.dynamic.CreateCommonAttachCardOrBuilder getCommonCardOrBuilder();
}