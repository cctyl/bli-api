// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/v1/distribution.proto

package bilibili.app.distribution.v1;

public interface Int32ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.distribution.v1.Int32Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 value = 1;</code>
   * @return The value.
   */
  int getValue();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int64 last_modified = 2;</code>
   * @return The lastModified.
   */
  long getLastModified();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 default_value = 3;</code>
   * @return The defaultValue.
   */
  int getDefaultValue();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string exp = 4;</code>
   * @return The exp.
   */
  java.lang.String getExp();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string exp = 4;</code>
   * @return The bytes for exp.
   */
  com.google.protobuf.ByteString
      getExpBytes();
}