// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

public interface AnimationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.pgc.gateway.player.v2.Animation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; qn_svga_animation_map = 1;</code>
   */
  int getQnSvgaAnimationMapCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; qn_svga_animation_map = 1;</code>
   */
  boolean containsQnSvgaAnimationMap(
      java.lang.String key);
  /**
   * Use {@link #getQnSvgaAnimationMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getQnSvgaAnimationMap();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; qn_svga_animation_map = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getQnSvgaAnimationMapMap();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; qn_svga_animation_map = 1;</code>
   */
  /* nullable */
java.lang.String getQnSvgaAnimationMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>map&lt;string, string&gt; qn_svga_animation_map = 1;</code>
   */
  java.lang.String getQnSvgaAnimationMapOrThrow(
      java.lang.String key);
}
