// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/fawkes/fawkes.proto

package bilibili.metadata.fawkes;

public final class Fawkes {
  private Fawkes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_metadata_fawkes_FawkesReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_metadata_fawkes_FawkesReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_metadata_fawkes_FawkesReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_metadata_fawkes_FawkesReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%bilibili/metadata/fawkes/fawkes.proto\022" +
      "\030bilibili.metadata.fawkes\")\n\013FawkesReply" +
      "\022\016\n\006config\030\001 \001(\t\022\n\n\002ff\030\002 \001(\t\"<\n\tFawkesRe" +
      "q\022\016\n\006appkey\030\001 \001(\t\022\013\n\003env\030\002 \001(\t\022\022\n\nsessio" +
      "n_id\030\003 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_metadata_fawkes_FawkesReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_metadata_fawkes_FawkesReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_metadata_fawkes_FawkesReply_descriptor,
        new java.lang.String[] { "Config", "Ff", });
    internal_static_bilibili_metadata_fawkes_FawkesReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_metadata_fawkes_FawkesReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_metadata_fawkes_FawkesReq_descriptor,
        new java.lang.String[] { "Appkey", "Env", "SessionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
