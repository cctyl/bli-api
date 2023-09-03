// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface ShortFormVideoDownloadReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.ShortFormVideoDownloadReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否有下载分享按钮
   * </pre>
   *
   * <code>bool has_download_url = 1;</code>
   * @return The hasDownloadUrl.
   */
  boolean getHasDownloadUrl();

  /**
   * <pre>
   * 下载url
   * </pre>
   *
   * <code>string download_url = 2;</code>
   * @return The downloadUrl.
   */
  java.lang.String getDownloadUrl();
  /**
   * <pre>
   * 下载url
   * </pre>
   *
   * <code>string download_url = 2;</code>
   * @return The bytes for downloadUrl.
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();

  /**
   * <pre>
   * 文件md5
   * </pre>
   *
   * <code>string md5 = 3;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * 文件md5
   * </pre>
   *
   * <code>string md5 = 3;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();

  /**
   * <pre>
   * 文件大小(单位为Byte)
   * </pre>
   *
   * <code>int64 size = 4;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   * </pre>
   *
   * <code>string backup_download_url = 5;</code>
   * @return The backupDownloadUrl.
   */
  java.lang.String getBackupDownloadUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string backup_download_url = 5;</code>
   * @return The bytes for backupDownloadUrl.
   */
  com.google.protobuf.ByteString
      getBackupDownloadUrlBytes();
}
