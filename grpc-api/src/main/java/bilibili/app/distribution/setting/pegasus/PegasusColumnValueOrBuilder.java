// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/pegasus.proto

package bilibili.app.distribution.setting.pegasus;

public interface PegasusColumnValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.distribution.setting.pegasus.PegasusColumnValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.Int64Value value = 1;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.Int64Value value = 1;</code>
   * @return The value.
   */
  bilibili.app.distribution.v1.Int64Value getValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.Int64Value value = 1;</code>
   */
  bilibili.app.distribution.v1.Int64ValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue affected_by_server_side = 2;</code>
   * @return Whether the affectedByServerSide field is set.
   */
  boolean hasAffectedByServerSide();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue affected_by_server_side = 2;</code>
   * @return The affectedByServerSide.
   */
  bilibili.app.distribution.v1.BoolValue getAffectedByServerSide();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.distribution.v1.BoolValue affected_by_server_side = 2;</code>
   */
  bilibili.app.distribution.v1.BoolValueOrBuilder getAffectedByServerSideOrBuilder();
}