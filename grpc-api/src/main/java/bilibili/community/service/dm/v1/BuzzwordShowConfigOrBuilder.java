// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

public interface BuzzwordShowConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.community.service.dm.v1.BuzzwordShowConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string schema = 2;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <pre>
   * </pre>
   *
   * <code>string schema = 2;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 source = 3;</code>
   * @return The source.
   */
  int getSource();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 id = 4;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 buzzword_id = 5;</code>
   * @return The buzzwordId.
   */
  long getBuzzwordId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 schema_type = 6;</code>
   * @return The schemaType.
   */
  int getSchemaType();
}
