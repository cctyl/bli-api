// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/v1/distribution.proto

package bilibili.app.distribution.v1;

public interface SetUserPreferenceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.distribution.v1.SetUserPreferenceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .google.protobuf.Any preference = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getPreferenceList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .google.protobuf.Any preference = 1;</code>
   */
  com.google.protobuf.Any getPreference(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .google.protobuf.Any preference = 1;</code>
   */
  int getPreferenceCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .google.protobuf.Any preference = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getPreferenceOrBuilderList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .google.protobuf.Any preference = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getPreferenceOrBuilder(
      int index);

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_context = 2;</code>
   */
  int getExtraContextCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_context = 2;</code>
   */
  boolean containsExtraContext(
      java.lang.String key);
  /**
   * Use {@link #getExtraContextMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getExtraContext();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_context = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getExtraContextMap();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_context = 2;</code>
   */
  /* nullable */
java.lang.String getExtraContextOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; extra_context = 2;</code>
   */
  java.lang.String getExtraContextOrThrow(
      java.lang.String key);
}
