// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface AddContractReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.AddContractReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 稿件avid
   * </pre>
   *
   * <code>int64 aid = 1;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * UP主mid
   * </pre>
   *
   * <code>int64 up_mid = 2;</code>
   * @return The upMid.
   */
  long getUpMid();

  /**
   * <pre>
   * 当前页面spm
   * </pre>
   *
   * <code>string spmid = 3;</code>
   * @return The spmid.
   */
  java.lang.String getSpmid();
  /**
   * <pre>
   * 当前页面spm
   * </pre>
   *
   * <code>string spmid = 3;</code>
   * @return The bytes for spmid.
   */
  com.google.protobuf.ByteString
      getSpmidBytes();
}
