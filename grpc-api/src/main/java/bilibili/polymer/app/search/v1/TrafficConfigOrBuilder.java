// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/app/search/v1/search.proto

package bilibili.polymer.app.search.v1;

public interface TrafficConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.polymer.app.search.v1.TrafficConfig)
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
   * <code>repeated .bilibili.polymer.app.search.v1.TrafficConfigOption options = 2;</code>
   */
  java.util.List<bilibili.polymer.app.search.v1.TrafficConfigOption> 
      getOptionsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TrafficConfigOption options = 2;</code>
   */
  bilibili.polymer.app.search.v1.TrafficConfigOption getOptions(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TrafficConfigOption options = 2;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TrafficConfigOption options = 2;</code>
   */
  java.util.List<? extends bilibili.polymer.app.search.v1.TrafficConfigOptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.polymer.app.search.v1.TrafficConfigOption options = 2;</code>
   */
  bilibili.polymer.app.search.v1.TrafficConfigOptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 default_option_id = 3;</code>
   * @return The defaultOptionId.
   */
  long getDefaultOptionId();
}