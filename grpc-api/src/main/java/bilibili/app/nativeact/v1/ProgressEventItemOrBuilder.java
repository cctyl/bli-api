// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ProgressEventItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ProgressEventItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 item_id = 1;</code>
   * @return The itemId.
   */
  long getItemId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 num = 3;</code>
   * @return The num.
   */
  long getNum();

  /**
   * <pre>
   * </pre>
   *
   * <code>string display_num = 4;</code>
   * @return The displayNum.
   */
  java.lang.String getDisplayNum();
  /**
   * <pre>
   * </pre>
   *
   * <code>string display_num = 4;</code>
   * @return The bytes for displayNum.
   */
  com.google.protobuf.ByteString
      getDisplayNumBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string web_key = 5;</code>
   * @return The webKey.
   */
  java.lang.String getWebKey();
  /**
   * <pre>
   * </pre>
   *
   * <code>string web_key = 5;</code>
   * @return The bytes for webKey.
   */
  com.google.protobuf.ByteString
      getWebKeyBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 dimension = 6;</code>
   * @return The dimension.
   */
  long getDimension();
}