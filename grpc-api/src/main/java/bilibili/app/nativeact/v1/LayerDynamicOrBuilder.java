// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface LayerDynamicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.LayerDynamic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic = 2;</code>
   * @return Whether the dynamic field is set.
   */
  boolean hasDynamic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic = 2;</code>
   * @return The dynamic.
   */
  bilibili.app.dynamic.v2.DynamicItem getDynamic();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DynamicItem dynamic = 2;</code>
   */
  bilibili.app.dynamic.v2.DynamicItemOrBuilder getDynamicOrBuilder();
}