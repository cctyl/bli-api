// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/main/dm.proto

package bilibili.broadcast.message.main;

public final class Dm {
  private Dm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_main_DanmukuEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_main_DanmukuEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_main_DanmakuElem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_main_DanmakuElem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_main_CommandDm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_main_CommandDm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(bilibili/broadcast/message/main/dm.pro" +
      "to\022\037bilibili.broadcast.message.main\"K\n\014D" +
      "anmukuEvent\022;\n\005elems\030\001 \003(\0132,.bilibili.br" +
      "oadcast.message.main.DanmakuElem\"\272\001\n\013Dan" +
      "makuElem\022\n\n\002id\030\001 \001(\003\022\020\n\010progress\030\002 \001(\005\022\014" +
      "\n\004mode\030\003 \001(\005\022\020\n\010fontsize\030\004 \001(\005\022\r\n\005color\030" +
      "\005 \001(\r\022\020\n\010mid_hash\030\006 \001(\t\022\017\n\007content\030\007 \001(\t" +
      "\022\r\n\005ctime\030\010 \001(\003\022\016\n\006action\030\t \001(\t\022\014\n\004pool\030" +
      "\n \001(\005\022\016\n\006id_str\030\013 \001(\t\"\276\001\n\tCommandDm\022\n\n\002i" +
      "d\030\001 \001(\003\022\013\n\003oid\030\002 \001(\003\022\013\n\003mid\030\003 \001(\003\022\014\n\004typ" +
      "e\030\004 \001(\005\022\017\n\007command\030\005 \001(\t\022\017\n\007content\030\006 \001(" +
      "\t\022\r\n\005state\030\007 \001(\005\022\020\n\010progress\030\010 \001(\005\022\r\n\005ct" +
      "ime\030\t \001(\t\022\r\n\005mtime\030\n \001(\t\022\r\n\005extra\030\013 \001(\t\022" +
      "\r\n\005idStr\030\014 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_broadcast_message_main_DanmukuEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_broadcast_message_main_DanmukuEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_main_DanmukuEvent_descriptor,
        new java.lang.String[] { "Elems", });
    internal_static_bilibili_broadcast_message_main_DanmakuElem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_broadcast_message_main_DanmakuElem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_main_DanmakuElem_descriptor,
        new java.lang.String[] { "Id", "Progress", "Mode", "Fontsize", "Color", "MidHash", "Content", "Ctime", "Action", "Pool", "IdStr", });
    internal_static_bilibili_broadcast_message_main_CommandDm_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_broadcast_message_main_CommandDm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_main_CommandDm_descriptor,
        new java.lang.String[] { "Id", "Oid", "Mid", "Type", "Command", "Content", "State", "Progress", "Ctime", "Mtime", "Extra", "IdStr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
