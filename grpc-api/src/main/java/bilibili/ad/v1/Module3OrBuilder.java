// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/ad/v1/ad.proto

package bilibili.ad.v1;

public interface Module3OrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.ad.v1.Module3)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>bool display = 1;</code>
   * @return The display.
   */
  boolean getDisplay();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.QualityParmas quality_params = 3;</code>
   */
  java.util.List<bilibili.ad.v1.QualityParmas> 
      getQualityParamsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.QualityParmas quality_params = 3;</code>
   */
  bilibili.ad.v1.QualityParmas getQualityParams(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.QualityParmas quality_params = 3;</code>
   */
  int getQualityParamsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.QualityParmas quality_params = 3;</code>
   */
  java.util.List<? extends bilibili.ad.v1.QualityParmasOrBuilder> 
      getQualityParamsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.ad.v1.QualityParmas quality_params = 3;</code>
   */
  bilibili.ad.v1.QualityParmasOrBuilder getQualityParamsOrBuilder(
      int index);
}