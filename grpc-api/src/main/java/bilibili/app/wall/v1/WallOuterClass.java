// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/wall/v1/wall.proto

package bilibili.app.wall.v1;

public final class WallOuterClass {
  private WallOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_wall_v1_RuleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_wall_v1_RuleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_wall_v1_RuleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_wall_v1_RuleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_wall_v1_RulesInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_wall_v1_RulesInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_wall_v1_RulesReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_wall_v1_RulesReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_wall_v1_RulesReply_RulesInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_wall_v1_RulesReply_RulesInfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037bilibili/app/wall/v1/wall.proto\022\024bilib" +
      "ili.app.wall.v1\"I\n\010RuleInfo\022\n\n\002tf\030\001 \001(\010\022" +
      "\t\n\001m\030\002 \001(\t\022\t\n\001a\030\003 \001(\t\022\t\n\001p\030\004 \001(\t\022\020\n\010a_ba" +
      "ckup\030\005 \003(\t\"\r\n\013RuleRequest\">\n\tRulesInfo\0221" +
      "\n\trulesInfo\030\001 \003(\0132\036.bilibili.app.wall.v1" +
      ".RuleInfo\"\267\001\n\nRulesReply\022B\n\trulesInfo\030\001 " +
      "\003(\0132/.bilibili.app.wall.v1.RulesReply.Ru" +
      "lesInfoEntry\022\022\n\nhash_value\030\002 \001(\t\032Q\n\016Rule" +
      "sInfoEntry\022\013\n\003key\030\001 \001(\t\022.\n\005value\030\002 \001(\0132\037" +
      ".bilibili.app.wall.v1.RulesInfo:\0028\0012W\n\004W" +
      "all\022O\n\010RuleInfo\022!.bilibili.app.wall.v1.R" +
      "uleRequest\032 .bilibili.app.wall.v1.RulesR" +
      "eplyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_app_wall_v1_RuleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_wall_v1_RuleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_wall_v1_RuleInfo_descriptor,
        new java.lang.String[] { "Tf", "M", "A", "P", "ABackup", });
    internal_static_bilibili_app_wall_v1_RuleRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_wall_v1_RuleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_wall_v1_RuleRequest_descriptor,
        new java.lang.String[] { });
    internal_static_bilibili_app_wall_v1_RulesInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_wall_v1_RulesInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_wall_v1_RulesInfo_descriptor,
        new java.lang.String[] { "RulesInfo", });
    internal_static_bilibili_app_wall_v1_RulesReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_wall_v1_RulesReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_wall_v1_RulesReply_descriptor,
        new java.lang.String[] { "RulesInfo", "HashValue", });
    internal_static_bilibili_app_wall_v1_RulesReply_RulesInfoEntry_descriptor =
      internal_static_bilibili_app_wall_v1_RulesReply_descriptor.getNestedTypes().get(0);
    internal_static_bilibili_app_wall_v1_RulesReply_RulesInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_wall_v1_RulesReply_RulesInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}