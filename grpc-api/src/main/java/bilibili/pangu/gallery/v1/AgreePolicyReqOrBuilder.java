// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pangu/gallery/v1/gallery.proto

package bilibili.pangu.gallery.v1;

public interface AgreePolicyReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pangu.gallery.v1.AgreePolicyReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pangu.gallery.v1.PolicyType policy_type = 1;</code>
   * @return The enum numeric value on the wire for policyType.
   */
  int getPolicyTypeValue();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.pangu.gallery.v1.PolicyType policy_type = 1;</code>
   * @return The policyType.
   */
  bilibili.pangu.gallery.v1.PolicyType getPolicyType();

  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}