// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/note/sync.proto

package bilibili.broadcast.message.note;

public final class SyncOuterClass {
  private SyncOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_note_Sync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_note_Sync_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*bilibili/broadcast/message/note/sync.p" +
      "roto\022\037bilibili.broadcast.message.note\"%\n" +
      "\004Sync\022\017\n\007note_id\030\001 \001(\003\022\014\n\004hash\030\002 \001(\tB\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_broadcast_message_note_Sync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_broadcast_message_note_Sync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_note_Sync_descriptor,
        new java.lang.String[] { "NoteId", "Hash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}