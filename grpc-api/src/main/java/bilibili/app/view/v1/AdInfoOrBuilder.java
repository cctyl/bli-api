// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface AdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.AdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 creative_id = 1;</code>
   * @return The creativeId.
   */
  long getCreativeId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 creative_type = 2;</code>
   * @return The creativeType.
   */
  long getCreativeType();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CreativeContent creative_content = 3;</code>
   * @return Whether the creativeContent field is set.
   */
  boolean hasCreativeContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CreativeContent creative_content = 3;</code>
   * @return The creativeContent.
   */
  bilibili.app.view.v1.CreativeContent getCreativeContent();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.view.v1.CreativeContent creative_content = 3;</code>
   */
  bilibili.app.view.v1.CreativeContentOrBuilder getCreativeContentOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 4;</code>
   * @return The adCb.
   */
  java.lang.String getAdCb();
  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 4;</code>
   * @return The bytes for adCb.
   */
  com.google.protobuf.ByteString
      getAdCbBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 card_type = 5;</code>
   * @return The cardType.
   */
  int getCardType();

  /**
   * <pre>
   * </pre>
   *
   * <code>bytes extra = 6;</code>
   * @return The extra.
   */
  com.google.protobuf.ByteString getExtra();
}