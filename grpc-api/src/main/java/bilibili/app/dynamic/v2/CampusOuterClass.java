// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/campus.proto

package bilibili.app.dynamic.v2;

public final class CampusOuterClass {
  private CampusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_dynamic_v2_CampusWaterFlowItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_dynamic_v2_CampusWaterFlowItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_dynamic_v2_WFItemDefault_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_dynamic_v2_WFItemDefault_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$bilibili/app/dynamic/v2/campus.proto\022\027" +
      "bilibili.app.dynamic.v2\0320bilibili/app/ar" +
      "chive/middleware/v1/preload.proto\032$bilib" +
      "ili/pagination/pagination.proto\032)bilibil" +
      "i/app/dynamic/common/dynamic.proto\032%bili" +
      "bili/app/dynamic/v2/dynamic.proto\"\254\001\n\023Ca" +
      "mpusWaterFlowItem\022\021\n\titem_type\030\001 \001(\005\022:\n\010" +
      "wh_ratio\030\002 \001(\0132(.bilibili.app.dynamic.co" +
      "mmon.ItemWHRatio\022>\n\014item_default\030\003 \001(\0132&" +
      ".bilibili.app.dynamic.v2.WFItemDefaultH\000" +
      "B\006\n\004item\"\262\001\n\020WaterFlowRcmdReq\022\021\n\tcampus_" +
      "id\030\001 \001(\003\022\014\n\004page\030\002 \001(\005\022C\n\013player_args\030\003 " +
      "\001(\0132..bilibili.app.archive.middleware.v1" +
      ".PlayerArgs\0228\n\004from\030\004 \001(\0162*.bilibili.app" +
      ".dynamic.v2.CampusRcmdReqFrom\"\212\001\n\021WaterF" +
      "lowRcmdResp\022;\n\005items\030\001 \003(\0132,.bilibili.ap" +
      "p.dynamic.v2.CampusWaterFlowItem\0228\n\006offs" +
      "et\030\002 \001(\0132(.bilibili.pagination.FeedPagin" +
      "ationReply\"\300\003\n\rWFItemDefault\022\r\n\005title\030\001 " +
      "\001(\t\022\r\n\005cover\030\002 \001(\t\022A\n\rbottom_left_1\030\003 \001(" +
      "\0132*.bilibili.app.dynamic.v2.CoverIconWit" +
      "hText\022A\n\rbottom_left_2\030\004 \001(\0132*.bilibili." +
      "app.dynamic.v2.CoverIconWithText\022B\n\016bott" +
      "om_right_1\030\005 \001(\0132*.bilibili.app.dynamic." +
      "v2.CoverIconWithText\022\013\n\003uri\030\006 \001(\t\0228\n\013rcm" +
      "d_reason\030\007 \001(\0132#.bilibili.app.dynamic.v2" +
      ".RcmdReason\022L\n\013annotations\030\010 \003(\01327.bilib" +
      "ili.app.dynamic.v2.WFItemDefault.Annotat" +
      "ionsEntry\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\0012p\n\006Campus\022f\n\rWater" +
      "FlowRcmd\022).bilibili.app.dynamic.v2.Water" +
      "FlowRcmdReq\032*.bilibili.app.dynamic.v2.Wa" +
      "terFlowRcmdRespB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.app.archive.middleware.v1.Preload.getDescriptor(),
          bilibili.pagination.PaginationOuterClass.getDescriptor(),
          bilibili.app.dynamic.common.Dynamic.getDescriptor(),
          bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor(),
        });
    internal_static_bilibili_app_dynamic_v2_CampusWaterFlowItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_dynamic_v2_CampusWaterFlowItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_dynamic_v2_CampusWaterFlowItem_descriptor,
        new java.lang.String[] { "ItemType", "WhRatio", "ItemDefault", "Item", });
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdReq_descriptor,
        new java.lang.String[] { "CampusId", "Page", "PlayerArgs", "From", });
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdResp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_dynamic_v2_WaterFlowRcmdResp_descriptor,
        new java.lang.String[] { "Items", "Offset", });
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_dynamic_v2_WFItemDefault_descriptor,
        new java.lang.String[] { "Title", "Cover", "BottomLeft1", "BottomLeft2", "BottomRight1", "Uri", "RcmdReason", "Annotations", });
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_AnnotationsEntry_descriptor =
      internal_static_bilibili_app_dynamic_v2_WFItemDefault_descriptor.getNestedTypes().get(0);
    internal_static_bilibili_app_dynamic_v2_WFItemDefault_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_dynamic_v2_WFItemDefault_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    bilibili.app.archive.middleware.v1.Preload.getDescriptor();
    bilibili.pagination.PaginationOuterClass.getDescriptor();
    bilibili.app.dynamic.common.Dynamic.getDescriptor();
    bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}