// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playeronline/v1/playeronline.proto

package bilibili.app.playeronline.v1;

public final class Playeronline {
  private Playeronline() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_NoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_NoReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_PlayerOnlineReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_PlayerOnlineReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_PremiereInfoReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_PremiereInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_playeronline_v1_ReportWatchReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_playeronline_v1_ReportWatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/bilibili/app/playeronline/v1/playeronl" +
      "ine.proto\022\034bilibili.app.playeronline.v1\"" +
      "\t\n\007NoReply\"\243\001\n\021PlayerOnlineReply\022\022\n\ntota" +
      "l_text\030\001 \001(\t\022\020\n\010sec_next\030\002 \001(\003\022\023\n\013bottom" +
      "_show\030\003 \001(\010\022\020\n\010sdm_show\030\004 \001(\010\022\020\n\010sdm_tex" +
      "t\030\005 \001(\t\022\024\n\014total_number\030\006 \001(\003\022\031\n\021total_n" +
      "umber_text\030\007 \001(\t\">\n\017PlayerOnlineReq\022\013\n\003a" +
      "id\030\001 \001(\003\022\013\n\003cid\030\002 \001(\003\022\021\n\tplay_open\030\003 \001(\010" +
      "\"Y\n\021PremiereInfoReply\022\032\n\022premiere_over_t" +
      "ext\030\001 \001(\t\022\023\n\013participant\030\002 \001(\003\022\023\n\013intera" +
      "ction\030\003 \001(\003\"\036\n\017PremiereInfoReq\022\013\n\003aid\030\001 " +
      "\001(\003\"9\n\016ReportWatchReq\022\013\n\003aid\030\001 \001(\003\022\013\n\003bi" +
      "z\030\002 \001(\t\022\r\n\005buvid\030\003 \001(\t2\322\002\n\014PlayerOnline\022" +
      "n\n\014PlayerOnline\022-.bilibili.app.playeronl" +
      "ine.v1.PlayerOnlineReq\032/.bilibili.app.pl" +
      "ayeronline.v1.PlayerOnlineReply\022n\n\014Premi" +
      "ereInfo\022-.bilibili.app.playeronline.v1.P" +
      "remiereInfoReq\032/.bilibili.app.playeronli" +
      "ne.v1.PremiereInfoReply\022b\n\013ReportWatch\022," +
      ".bilibili.app.playeronline.v1.ReportWatc" +
      "hReq\032%.bilibili.app.playeronline.v1.NoRe" +
      "plyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_app_playeronline_v1_NoReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_playeronline_v1_NoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_NoReply_descriptor,
        new java.lang.String[] { });
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_PlayerOnlineReply_descriptor,
        new java.lang.String[] { "TotalText", "SecNext", "BottomShow", "SdmShow", "SdmText", "TotalNumber", "TotalNumberText", });
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_playeronline_v1_PlayerOnlineReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_PlayerOnlineReq_descriptor,
        new java.lang.String[] { "Aid", "Cid", "PlayOpen", });
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_PremiereInfoReply_descriptor,
        new java.lang.String[] { "PremiereOverText", "Participant", "Interaction", });
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_app_playeronline_v1_PremiereInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_PremiereInfoReq_descriptor,
        new java.lang.String[] { "Aid", });
    internal_static_bilibili_app_playeronline_v1_ReportWatchReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_app_playeronline_v1_ReportWatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_playeronline_v1_ReportWatchReq_descriptor,
        new java.lang.String[] { "Aid", "Biz", "Buvid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}