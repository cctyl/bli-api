// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dagw/component/avatar/v1/plugin.proto

package bilibili.dagw.component.avatar.v1.plugin;

public final class Plugin {
  private Plugin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_CommentDoubleClickConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_CommentDoubleClickConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeContentV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeContentV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_Interaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_Interaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_NFTImageV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_NFTImageV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationAnimation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationAnimation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationV2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.bilibili/dagw/component/avatar/v1/plug" +
      "in.proto\022(bilibili.dagw.component.avatar" +
      ".v1.plugin\0322bilibili/dagw/component/avat" +
      "ar/common/common.proto\"\177\n\030CommentDoubleC" +
      "lickConfig\022J\n\013interaction\030\001 \001(\01325.bilibi" +
      "li.dagw.component.avatar.v1.plugin.Inter" +
      "action\022\027\n\017animation_scale\030\002 \001(\001\"U\n\nGyroC" +
      "onfig\022G\n\tgyroscope\030\001 \001(\01324.bilibili.dagw" +
      ".component.avatar.v1.plugin.NFTImageV2\"\224" +
      "\001\n\022GyroscopeContentV2\022\020\n\010file_url\030\001 \001(\t\022" +
      "\r\n\005scale\030\002 \001(\002\022]\n\024physical_orientation\030\003" +
      " \003(\0132?.bilibili.dagw.component.avatar.v1" +
      ".plugin.PhysicalOrientationV2\"y\n\021Gyrosco" +
      "peEntityV2\022\024\n\014display_type\030\001 \001(\t\022N\n\010cont" +
      "ents\030\002 \003(\0132<.bilibili.dagw.component.ava" +
      "tar.v1.plugin.GyroscopeContentV2\"S\n\013Inte" +
      "raction\022\016\n\006nft_id\030\001 \001(\t\022\017\n\007enabled\030\002 \001(\010" +
      "\022\r\n\005itype\030\003 \001(\t\022\024\n\014metadata_url\030\004 \001(\t\"\"\n" +
      "\017LiveAnimeConfig\022\017\n\007is_live\030\001 \001(\010\"\266\001\n\rLi" +
      "veAnimeItem\022A\n\005color\030\001 \001(\01322.bilibili.da" +
      "gw.component.avatar.common.ColorConfig\022\023" +
      "\n\013start_ratio\030\002 \001(\001\022\021\n\tend_ratio\030\003 \001(\001\022\024" +
      "\n\014start_stroke\030\004 \001(\001\022\025\n\rstart_opacity\030\005 " +
      "\001(\001\022\r\n\005phase\030\006 \001(\003\"\\\n\nNFTImageV2\022N\n\tgyro" +
      "scope\030\001 \003(\0132;.bilibili.dagw.component.av" +
      "atar.v1.plugin.GyroscopeEntityV2\"<\n\034Phys" +
      "icalOrientationAnimation\022\014\n\004type\030\001 \001(\t\022\016" +
      "\n\006bezier\030\003 \001(\t\"\201\001\n\025PhysicalOrientationV2" +
      "\022\014\n\004type\030\001 \001(\t\022Z\n\nanimations\030\003 \003(\0132F.bil" +
      "ibili.dagw.component.avatar.v1.plugin.Ph" +
      "ysicalOrientationAnimationB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.dagw.component.avatar.common.Common.getDescriptor(),
        });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_CommentDoubleClickConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_CommentDoubleClickConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_CommentDoubleClickConfig_descriptor,
        new java.lang.String[] { "Interaction", "AnimationScale", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroConfig_descriptor,
        new java.lang.String[] { "Gyroscope", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeContentV2_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeContentV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeContentV2_descriptor,
        new java.lang.String[] { "FileUrl", "Scale", "PhysicalOrientation", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_GyroscopeEntityV2_descriptor,
        new java.lang.String[] { "DisplayType", "Contents", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_Interaction_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_Interaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_Interaction_descriptor,
        new java.lang.String[] { "NftId", "Enabled", "Itype", "MetadataUrl", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeConfig_descriptor,
        new java.lang.String[] { "IsLive", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeItem_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_LiveAnimeItem_descriptor,
        new java.lang.String[] { "Color", "StartRatio", "EndRatio", "StartStroke", "StartOpacity", "Phase", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_NFTImageV2_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_NFTImageV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_NFTImageV2_descriptor,
        new java.lang.String[] { "Gyroscope", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationAnimation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationAnimation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationAnimation_descriptor,
        new java.lang.String[] { "Type", "Bezier", });
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationV2_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_dagw_component_avatar_v1_plugin_PhysicalOrientationV2_descriptor,
        new java.lang.String[] { "Type", "Animations", });
    bilibili.dagw.component.avatar.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
