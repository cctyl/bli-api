// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

public interface ResponseUrlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.listener.v1.ResponseUrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 order = 1;</code>
   * @return The order.
   */
  int getOrder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 length = 2;</code>
   * @return The length.
   */
  long getLength();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 size = 3;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   * </pre>
   *
   * <code>string ahead = 4;</code>
   * @return The ahead.
   */
  java.lang.String getAhead();
  /**
   * <pre>
   * </pre>
   *
   * <code>string ahead = 4;</code>
   * @return The bytes for ahead.
   */
  com.google.protobuf.ByteString
      getAheadBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string vhead = 5;</code>
   * @return The vhead.
   */
  java.lang.String getVhead();
  /**
   * <pre>
   * </pre>
   *
   * <code>string vhead = 5;</code>
   * @return The bytes for vhead.
   */
  com.google.protobuf.ByteString
      getVheadBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 6;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string url = 6;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string backup_url = 7;</code>
   * @return A list containing the backupUrl.
   */
  java.util.List<java.lang.String>
      getBackupUrlList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string backup_url = 7;</code>
   * @return The count of backupUrl.
   */
  int getBackupUrlCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string backup_url = 7;</code>
   * @param index The index of the element to return.
   * @return The backupUrl at the given index.
   */
  java.lang.String getBackupUrl(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string backup_url = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the backupUrl at the given index.
   */
  com.google.protobuf.ByteString
      getBackupUrlBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>string md5 = 8;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * </pre>
   *
   * <code>string md5 = 8;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();
}