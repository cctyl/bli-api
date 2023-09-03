// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface FavItemDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.FavItemDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItem item = 1;</code>
   * @return The item.
   */
  bilibili.app.listener.v1.FavItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItem item = 1;</code>
   */
  bilibili.app.listener.v1.FavItemOrBuilder getItemOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemAuthor owner = 2;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemAuthor owner = 2;</code>
   * @return The owner.
   */
  bilibili.app.listener.v1.FavItemAuthor getOwner();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemAuthor owner = 2;</code>
   */
  bilibili.app.listener.v1.FavItemAuthorOrBuilder getOwnerOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemStat stat = 3;</code>
   * @return Whether the stat field is set.
   */
  boolean hasStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemStat stat = 3;</code>
   * @return The stat.
   */
  bilibili.app.listener.v1.FavItemStat getStat();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.listener.v1.FavItemStat stat = 3;</code>
   */
  bilibili.app.listener.v1.FavItemStatOrBuilder getStatOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * </pre>
   *
   * <code>string cover = 4;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 duration = 6;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 state = 7;</code>
   * @return The state.
   */
  int getState();

  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 8;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 8;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 parts = 9;</code>
   * @return The parts.
   */
  int getParts();
}
