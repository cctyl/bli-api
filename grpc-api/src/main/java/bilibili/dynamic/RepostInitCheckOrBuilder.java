// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

public interface RepostInitCheckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.RepostInitCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynIdentity repost_src = 1;</code>
   * @return Whether the repostSrc field is set.
   */
  boolean hasRepostSrc();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynIdentity repost_src = 1;</code>
   * @return The repostSrc.
   */
  bilibili.dynamic.DynIdentity getRepostSrc();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.dynamic.DynIdentity repost_src = 1;</code>
   */
  bilibili.dynamic.DynIdentityOrBuilder getRepostSrcOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>string share_id = 2;</code>
   * @return The shareId.
   */
  java.lang.String getShareId();
  /**
   * <pre>
   * </pre>
   *
   * <code>string share_id = 2;</code>
   * @return The bytes for shareId.
   */
  com.google.protobuf.ByteString
      getShareIdBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 share_mode = 3;</code>
   * @return The shareMode.
   */
  int getShareMode();
}
