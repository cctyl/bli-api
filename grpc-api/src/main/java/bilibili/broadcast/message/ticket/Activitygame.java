// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ticket/activitygame.proto

package bilibili.broadcast.message.ticket;

public final class Activitygame {
  private Activitygame() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_broadcast_message_ticket_RoomEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_broadcast_message_ticket_RoomEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4bilibili/broadcast/message/ticket/acti" +
      "vitygame.proto\022!bilibili.broadcast.messa" +
      "ge.ticket\"e\n\tRoomEvent\022B\n\013room_status\030\001 " +
      "\001(\0162-.bilibili.broadcast.message.ticket." +
      "RoomStatus\022\024\n\014room_message\030\002 \001(\t**\n\nRoom" +
      "Status\022\t\n\005Pause\020\000\022\010\n\004Play\020\001\022\007\n\003End\020\002B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_broadcast_message_ticket_RoomEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_broadcast_message_ticket_RoomEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_broadcast_message_ticket_RoomEvent_descriptor,
        new java.lang.String[] { "RoomStatus", "RoomMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}