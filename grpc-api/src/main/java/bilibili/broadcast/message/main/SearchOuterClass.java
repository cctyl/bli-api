// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/main/search.proto

package bilibili.broadcast.message.main;

public final class SearchOuterClass {
  private SearchOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_main_Bubble_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_main_Bubble_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_main_ChatResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_main_ChatResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,bilibili/broadcast/message/main/search" +
      ".proto\022\037bilibili.broadcast.message.main\032" +
      "\033google/protobuf/empty.proto\032%bilibili/a" +
      "pp/dynamic/v2/dynamic.proto\"@\n\006Bubble\0226\n" +
      "\nparagraphs\030\001 \003(\0132\".bilibili.app.dynamic" +
      ".v2.Paragraph\"\214\001\n\nChatResult\022\014\n\004code\030\001 \001" +
      "(\005\022\022\n\nsession_id\030\002 \001(\t\0227\n\006bubble\030\003 \003(\0132\'" +
      ".bilibili.broadcast.message.main.Bubble\022" +
      "\024\n\014rewrite_word\030\004 \001(\t\022\r\n\005title\030\005 \001(\t2a\n\006" +
      "Search\022W\n\016ChatResultPush\022\026.google.protob" +
      "uf.Empty\032+.bilibili.broadcast.message.ma" +
      "in.ChatResult0\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor(),
        });
    internal_static_bilibili_broadcast_message_main_Bubble_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_broadcast_message_main_Bubble_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_main_Bubble_descriptor,
        new java.lang.String[] { "Paragraphs", });
    internal_static_bilibili_broadcast_message_main_ChatResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_broadcast_message_main_ChatResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_main_ChatResult_descriptor,
        new java.lang.String[] { "Code", "SessionId", "Bubble", "RewriteWord", "Title", });
    com.google.protobuf.EmptyProto.getDescriptor();
    bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
