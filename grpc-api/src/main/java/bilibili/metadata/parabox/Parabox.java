// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/parabox/parabox.proto

package bilibili.metadata.parabox;

public final class Parabox {
  private Parabox() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_metadata_parabox_Exp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_metadata_parabox_Exp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_metadata_parabox_Exps_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_metadata_parabox_Exps_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'bilibili/metadata/parabox/parabox.prot" +
      "o\022\031bilibili.metadata.parabox\"!\n\003Exp\022\n\n\002i" +
      "d\030\001 \001(\003\022\016\n\006bucket\030\002 \001(\005\"4\n\004Exps\022,\n\004exps\030" +
      "\001 \003(\0132\036.bilibili.metadata.parabox.ExpB\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_metadata_parabox_Exp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_metadata_parabox_Exp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_metadata_parabox_Exp_descriptor,
        new java.lang.String[] { "Id", "Bucket", });
    internal_static_bilibili_metadata_parabox_Exps_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_metadata_parabox_Exps_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_metadata_parabox_Exps_descriptor,
        new java.lang.String[] { "Exps", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}