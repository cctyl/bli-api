// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/search/v2/search.proto

package bilibili.app.search.v2;

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
    internal_static_bilibili_app_search_v2_CancelChatTaskReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_CancelChatTaskReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_CancelChatTaskReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_CancelChatTaskReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_GetChatResultReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_GetChatResultReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SearchEggInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SearchEggInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SearchEggInfos_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SearchEggInfos_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SearchEggReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SearchEggReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SearchEggReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SearchEggReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SubmitChatTaskReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SubmitChatTaskReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_search_v2_SubmitChatTaskReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_search_v2_SubmitChatTaskReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#bilibili/app/search/v2/search.proto\022\026b" +
      "ilibili.app.search.v2\032,bilibili/broadcas" +
      "t/message/main/search.proto\"<\n\021CancelCha" +
      "tTaskReq\022\022\n\nsession_id\030\001 \001(\t\022\023\n\013from_sou" +
      "rce\030\002 \001(\t\"#\n\023CancelChatTaskReply\022\014\n\004code" +
      "\030\001 \001(\005\"J\n\020GetChatResultReq\022\r\n\005query\030\001 \001(" +
      "\t\022\022\n\nsession_id\030\002 \001(\t\022\023\n\013from_source\030\003 \001" +
      "(\t\"\362\001\n\rSearchEggInfo\022\020\n\010egg_type\030\001 \001(\005\022\n" +
      "\n\002id\030\002 \001(\003\022\025\n\ris_commercial\030\003 \001(\005\022\022\n\nmas" +
      "k_color\030\004 \001(\t\022\031\n\021mask_transparency\030\005 \001(\003" +
      "\022\013\n\003md5\030\006 \001(\t\022\017\n\007re_type\030\007 \001(\005\022\016\n\006re_url" +
      "\030\010 \001(\t\022\020\n\010re_value\030\t \001(\t\022\022\n\nshow_count\030\n" +
      " \001(\005\022\014\n\004size\030\013 \001(\003\022\016\n\006source\030\014 \001(\003\022\013\n\003ur" +
      "l\030\r \001(\t\"I\n\016SearchEggInfos\0227\n\010egg_info\030\001 " +
      "\003(\0132%.bilibili.app.search.v2.SearchEggIn" +
      "fo\"d\n\016SearchEggReply\022\014\n\004code\030\001 \001(\005\022\014\n\004se" +
      "id\030\002 \001(\t\0226\n\006result\030\003 \001(\0132&.bilibili.app." +
      "search.v2.SearchEggInfos\"\016\n\014SearchEggReq" +
      "\"7\n\023SubmitChatTaskReply\022\014\n\004code\030\001 \001(\005\022\022\n" +
      "\nsession_id\030\002 \001(\t\"I\n\021SubmitChatTaskReq\022\r" +
      "\n\005query\030\001 \001(\t\022\020\n\010track_id\030\002 \001(\t\022\023\n\013from_" +
      "source\030\003 \001(\t2\237\003\n\006Search\022h\n\016CancelChatTas" +
      "k\022).bilibili.app.search.v2.CancelChatTas" +
      "kReq\032+.bilibili.app.search.v2.CancelChat" +
      "TaskReply\022f\n\rGetChatResult\022(.bilibili.ap" +
      "p.search.v2.GetChatResultReq\032+.bilibili." +
      "broadcast.message.main.ChatResult\022Y\n\tSea" +
      "rchEgg\022$.bilibili.app.search.v2.SearchEg" +
      "gReq\032&.bilibili.app.search.v2.SearchEggR" +
      "eply\022h\n\016SubmitChatTask\022).bilibili.app.se" +
      "arch.v2.SubmitChatTaskReq\032+.bilibili.app" +
      ".search.v2.SubmitChatTaskReplyB\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.broadcast.message.main.SearchOuterClass.getDescriptor(),
        });
    internal_static_bilibili_app_search_v2_CancelChatTaskReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_search_v2_CancelChatTaskReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_CancelChatTaskReq_descriptor,
        new java.lang.String[] { "SessionId", "FromSource", });
    internal_static_bilibili_app_search_v2_CancelChatTaskReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_search_v2_CancelChatTaskReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_CancelChatTaskReply_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_bilibili_app_search_v2_GetChatResultReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_search_v2_GetChatResultReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_GetChatResultReq_descriptor,
        new java.lang.String[] { "Query", "SessionId", "FromSource", });
    internal_static_bilibili_app_search_v2_SearchEggInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_search_v2_SearchEggInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SearchEggInfo_descriptor,
        new java.lang.String[] { "EggType", "Id", "IsCommercial", "MaskColor", "MaskTransparency", "Md5", "ReType", "ReUrl", "ReValue", "ShowCount", "Size", "Source", "Url", });
    internal_static_bilibili_app_search_v2_SearchEggInfos_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_app_search_v2_SearchEggInfos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SearchEggInfos_descriptor,
        new java.lang.String[] { "EggInfo", });
    internal_static_bilibili_app_search_v2_SearchEggReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_app_search_v2_SearchEggReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SearchEggReply_descriptor,
        new java.lang.String[] { "Code", "Seid", "Result", });
    internal_static_bilibili_app_search_v2_SearchEggReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bilibili_app_search_v2_SearchEggReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SearchEggReq_descriptor,
        new java.lang.String[] { });
    internal_static_bilibili_app_search_v2_SubmitChatTaskReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bilibili_app_search_v2_SubmitChatTaskReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SubmitChatTaskReply_descriptor,
        new java.lang.String[] { "Code", "SessionId", });
    internal_static_bilibili_app_search_v2_SubmitChatTaskReq_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bilibili_app_search_v2_SubmitChatTaskReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_search_v2_SubmitChatTaskReq_descriptor,
        new java.lang.String[] { "Query", "TrackId", "FromSource", });
    bilibili.broadcast.message.main.SearchOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}