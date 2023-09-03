// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

public interface VolumeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.playershared.VolumeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Measured integrated loudness 实际综合响度
   * </pre>
   *
   * <code>double measured_i = 1;</code>
   * @return The measuredI.
   */
  double getMeasuredI();

  /**
   * <pre>
   * Measured loudness range 实际响度范围
   * </pre>
   *
   * <code>double measured_lra = 2;</code>
   * @return The measuredLra.
   */
  double getMeasuredLra();

  /**
   * <pre>
   * Measured true peak 实际响度真峰值
   * </pre>
   *
   * <code>double measured_tp = 3;</code>
   * @return The measuredTp.
   */
  double getMeasuredTp();

  /**
   * <pre>
   * Measured threshold 实际响度阈值
   * </pre>
   *
   * <code>double measured_threshold = 4;</code>
   * @return The measuredThreshold.
   */
  double getMeasuredThreshold();

  /**
   * <pre>
   * Target offset gain(Gain is applied before the true-peak limiter) 目标增益Offset(增益在真实峰值限制器之前应用)
   * </pre>
   *
   * <code>double target_offset = 5;</code>
   * @return The targetOffset.
   */
  double getTargetOffset();

  /**
   * <pre>
   * Target integrated loudness 目标综合响度
   * </pre>
   *
   * <code>double target_i = 6;</code>
   * @return The targetI.
   */
  double getTargetI();

  /**
   * <pre>
   * Target true peak 目标响度真峰值
   * </pre>
   *
   * <code>double target_tp = 7;</code>
   * @return The targetTp.
   */
  double getTargetTp();
}
