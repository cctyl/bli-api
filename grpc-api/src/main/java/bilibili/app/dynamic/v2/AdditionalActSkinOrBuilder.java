// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface AdditionalActSkinOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.AdditionalActSkin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 动画SVGA资源
   * </pre>
   *
   * <code>string svga = 1;</code>
   * @return The svga.
   */
  java.lang.String getSvga();
  /**
   * <pre>
   * 动画SVGA资源
   * </pre>
   *
   * <code>string svga = 1;</code>
   * @return The bytes for svga.
   */
  com.google.protobuf.ByteString
      getSvgaBytes();

  /**
   * <pre>
   * 动画SVGA最后一帧图片资源
   * </pre>
   *
   * <code>string last_image = 2;</code>
   * @return The lastImage.
   */
  java.lang.String getLastImage();
  /**
   * <pre>
   * 动画SVGA最后一帧图片资源
   * </pre>
   *
   * <code>string last_image = 2;</code>
   * @return The bytes for lastImage.
   */
  com.google.protobuf.ByteString
      getLastImageBytes();

  /**
   * <pre>
   * 动画播放次数
   * </pre>
   *
   * <code>int64 play_times = 3;</code>
   * @return The playTimes.
   */
  long getPlayTimes();
}
