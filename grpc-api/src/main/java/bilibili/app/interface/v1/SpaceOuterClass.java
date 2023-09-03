// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/space.proto

package bilibili.app.interface.v1;

public final class SpaceOuterClass {
  private SpaceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_Arc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_Arc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_Dynamic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_Dynamic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchTabReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchTabReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchTabReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchTabReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchArchiveReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchArchiveReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchArchiveReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchDynamicReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchDynamicReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SearchDynamicReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SearchDynamicReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_Tab_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_Tab_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&bilibili/app/interfaces/v1/space.proto" +
      "\022\031bilibili.app.interface.v1\0320bilibili/ap" +
      "p/archive/middleware/v1/preload.proto\032%b" +
      "ilibili/app/archive/v1/archive.proto\032%bi" +
      "libili/app/dynamic/v2/dynamic.proto\"A\n\003A" +
      "rc\022-\n\007archive\030\001 \001(\0132\034.bilibili.app.archi" +
      "ve.v1.Arc\022\013\n\003uri\030\002 \001(\t\"@\n\007Dynamic\0225\n\007dyn" +
      "amic\030\001 \001(\0132$.bilibili.app.dynamic.v2.Dyn" +
      "amicItem\"M\n\016SearchTabReply\022\r\n\005focus\030\001 \001(" +
      "\003\022,\n\004tabs\030\002 \003(\0132\036.bilibili.app.interface" +
      ".v1.Tab\":\n\014SearchTabReq\022\017\n\007keyword\030\001 \001(\t" +
      "\022\013\n\003mid\030\002 \001(\003\022\014\n\004from\030\003 \001(\005\"U\n\022SearchArc" +
      "hiveReply\0220\n\010archives\030\001 \003(\0132\036.bilibili.a" +
      "pp.interface.v1.Arc\022\r\n\005total\030\002 \001(\003\"\215\001\n\020S" +
      "earchArchiveReq\022\017\n\007keyword\030\001 \001(\t\022\013\n\003mid\030" +
      "\002 \001(\003\022\n\n\002pn\030\003 \001(\003\022\n\n\002ps\030\004 \001(\003\022C\n\013player_" +
      "args\030\005 \001(\0132..bilibili.app.archive.middle" +
      "ware.v1.PlayerArgs\"Y\n\022SearchDynamicReply" +
      "\0224\n\010dynamics\030\001 \003(\0132\".bilibili.app.interf" +
      "ace.v1.Dynamic\022\r\n\005total\030\002 \001(\003\"\215\001\n\020Search" +
      "DynamicReq\022\017\n\007keyword\030\001 \001(\t\022\013\n\003mid\030\002 \001(\003" +
      "\022\n\n\002pn\030\003 \001(\003\022\n\n\002ps\030\004 \001(\003\022C\n\013player_args\030" +
      "\005 \001(\0132..bilibili.app.archive.middleware." +
      "v1.PlayerArgs\"!\n\003Tab\022\r\n\005title\030\001 \001(\t\022\013\n\003u" +
      "ri\030\002 \001(\t*&\n\004From\022\016\n\nArchiveTab\020\000\022\016\n\nDyna" +
      "micTab\020\0012\302\002\n\005Space\022_\n\tSearchTab\022\'.bilibi" +
      "li.app.interface.v1.SearchTabReq\032).bilib" +
      "ili.app.interface.v1.SearchTabReply\022k\n\rS" +
      "earchArchive\022+.bilibili.app.interface.v1" +
      ".SearchArchiveReq\032-.bilibili.app.interfa" +
      "ce.v1.SearchArchiveReply\022k\n\rSearchDynami" +
      "c\022+.bilibili.app.interface.v1.SearchDyna" +
      "micReq\032-.bilibili.app.interface.v1.Searc" +
      "hDynamicReplyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.app.archive.middleware.v1.Preload.getDescriptor(),
          bilibili.app.archive.v1.Archive.getDescriptor(),
          bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor(),
        });
    internal_static_bilibili_app_interface_v1_Arc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_interface_v1_Arc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_Arc_descriptor,
        new java.lang.String[] { "Archive", "Uri", });
    internal_static_bilibili_app_interface_v1_Dynamic_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_interface_v1_Dynamic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_Dynamic_descriptor,
        new java.lang.String[] { "Dynamic", });
    internal_static_bilibili_app_interface_v1_SearchTabReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_interface_v1_SearchTabReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchTabReply_descriptor,
        new java.lang.String[] { "Focus", "Tabs", });
    internal_static_bilibili_app_interface_v1_SearchTabReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_interface_v1_SearchTabReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchTabReq_descriptor,
        new java.lang.String[] { "Keyword", "Mid", "From", });
    internal_static_bilibili_app_interface_v1_SearchArchiveReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_app_interface_v1_SearchArchiveReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchArchiveReply_descriptor,
        new java.lang.String[] { "Archives", "Total", });
    internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_app_interface_v1_SearchArchiveReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchArchiveReq_descriptor,
        new java.lang.String[] { "Keyword", "Mid", "Pn", "Ps", "PlayerArgs", });
    internal_static_bilibili_app_interface_v1_SearchDynamicReply_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bilibili_app_interface_v1_SearchDynamicReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchDynamicReply_descriptor,
        new java.lang.String[] { "Dynamics", "Total", });
    internal_static_bilibili_app_interface_v1_SearchDynamicReq_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bilibili_app_interface_v1_SearchDynamicReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SearchDynamicReq_descriptor,
        new java.lang.String[] { "Keyword", "Mid", "Pn", "Ps", "PlayerArgs", });
    internal_static_bilibili_app_interface_v1_Tab_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bilibili_app_interface_v1_Tab_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_Tab_descriptor,
        new java.lang.String[] { "Title", "Uri", });
    bilibili.app.archive.middleware.v1.Preload.getDescriptor();
    bilibili.app.archive.v1.Archive.getDescriptor();
    bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
