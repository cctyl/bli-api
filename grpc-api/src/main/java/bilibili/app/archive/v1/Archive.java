// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/archive/v1/archive.proto

package bilibili.app.archive.v1;

public final class Archive {
  private Archive() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Arc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Arc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Author_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Author_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Dimension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Dimension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Page_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Rights_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Rights_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_SeasonTheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_SeasonTheme_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_StaffInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_StaffInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_archive_v1_Stat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_archive_v1_Stat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%bilibili/app/archive/v1/archive.proto\022" +
      "\027bilibili.app.archive.v1\"\255\006\n\003Arc\022\013\n\003aid\030" +
      "\001 \001(\003\022\016\n\006videos\030\002 \001(\003\022\017\n\007type_id\030\003 \001(\005\022\021" +
      "\n\ttype_name\030\004 \001(\t\022\021\n\tcopyright\030\005 \001(\005\022\013\n\003" +
      "pic\030\006 \001(\t\022\r\n\005title\030\007 \001(\t\022\017\n\007pubdate\030\010 \001(" +
      "\003\022\r\n\005ctime\030\t \001(\003\022\014\n\004desc\030\n \001(\t\022\r\n\005state\030" +
      "\013 \001(\005\022\016\n\006access\030\014 \001(\005\022\021\n\tattribute\030\r \001(\005" +
      "\022\013\n\003tag\030\016 \001(\t\022\014\n\004tags\030\017 \003(\t\022\020\n\010duration\030" +
      "\020 \001(\003\022\022\n\nmission_id\030\021 \001(\003\022\020\n\010order_id\030\022 " +
      "\001(\003\022\024\n\014redirect_url\030\023 \001(\t\022\017\n\007forward\030\024 \001" +
      "(\003\022/\n\006rights\030\025 \001(\0132\037.bilibili.app.archiv" +
      "e.v1.Rights\022/\n\006author\030\026 \001(\0132\037.bilibili.a" +
      "pp.archive.v1.Author\022+\n\004stat\030\027 \001(\0132\035.bil" +
      "ibili.app.archive.v1.Stat\022\025\n\rreport_resu" +
      "lt\030\030 \001(\t\022\017\n\007dynamic\030\031 \001(\t\022\021\n\tfirst_cid\030\032" +
      " \001(\003\0225\n\tdimension\030\033 \001(\0132\".bilibili.app.a" +
      "rchive.v1.Dimension\0226\n\nstaff_info\030\034 \003(\0132" +
      "\".bilibili.app.archive.v1.StaffInfo\022\021\n\ts" +
      "eason_id\030\035 \001(\003\022\024\n\014attribute_v2\030\036 \001(\003\022:\n\014" +
      "season_theme\030\037 \001(\0132$.bilibili.app.archiv" +
      "e.v1.SeasonTheme\022\025\n\rshort_link_v2\030( \001(\t\022" +
      "\022\n\nup_from_v2\030) \001(\005\022\023\n\013first_frame\030* \001(\t" +
      "\"1\n\006Author\022\013\n\003mid\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\014\n" +
      "\004face\030\003 \001(\t\":\n\tDimension\022\r\n\005width\030\001 \001(\003\022" +
      "\016\n\006height\030\002 \001(\003\022\016\n\006rotate\030\003 \001(\003\"\307\001\n\004Page" +
      "\022\013\n\003cid\030\001 \001(\003\022\014\n\004page\030\002 \001(\005\022\014\n\004from\030\003 \001(" +
      "\t\022\014\n\004part\030\004 \001(\t\022\020\n\010duration\030\005 \001(\003\022\013\n\003vid" +
      "\030\006 \001(\t\022\014\n\004desc\030\007 \001(\t\022\017\n\007webLink\030\010 \001(\t\0225\n" +
      "\tdimension\030\t \001(\0132\".bilibili.app.archive." +
      "v1.Dimension\022\023\n\013first_frame\030\n \001(\t\"\205\002\n\006Ri" +
      "ghts\022\n\n\002bp\030\001 \001(\005\022\014\n\004elec\030\002 \001(\005\022\020\n\010downlo" +
      "ad\030\003 \001(\005\022\r\n\005movie\030\004 \001(\005\022\013\n\003pay\030\005 \001(\005\022\013\n\003" +
      "hd5\030\006 \001(\005\022\022\n\nno_reprint\030\007 \001(\005\022\020\n\010autopla" +
      "y\030\010 \001(\005\022\017\n\007ugc_pay\030\t \001(\005\022\026\n\016is_cooperati" +
      "on\030\n \001(\005\022\027\n\017ugc_pay_preview\030\013 \001(\005\022\025\n\rno_" +
      "background\030\014 \001(\005\022\017\n\007arc_pay\030\r \001(\005\022\026\n\016pay" +
      "_free_watch\030\016 \001(\005\"N\n\013SeasonTheme\022\020\n\010bg_c" +
      "olor\030\001 \001(\t\022\031\n\021selected_bg_color\030\002 \001(\t\022\022\n" +
      "\ntext_color\030\003 \001(\t\":\n\tStaffInfo\022\013\n\003mid\030\001 " +
      "\001(\003\022\r\n\005title\030\002 \001(\t\022\021\n\tattribute\030\003 \001(\003\"\256\001" +
      "\n\004Stat\022\013\n\003aid\030\001 \001(\003\022\014\n\004view\030\002 \001(\005\022\017\n\007dan" +
      "maku\030\003 \001(\005\022\r\n\005reply\030\004 \001(\005\022\013\n\003fav\030\005 \001(\005\022\014" +
      "\n\004coin\030\006 \001(\005\022\r\n\005share\030\007 \001(\005\022\020\n\010now_rank\030" +
      "\010 \001(\005\022\020\n\010his_rank\030\t \001(\005\022\014\n\004like\030\n \001(\005\022\017\n" +
      "\007dislike\030\013 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_app_archive_v1_Arc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_archive_v1_Arc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Arc_descriptor,
        new java.lang.String[] { "Aid", "Videos", "TypeId", "TypeName", "Copyright", "Pic", "Title", "Pubdate", "Ctime", "Desc", "State", "Access", "Attribute", "Tag", "Tags", "Duration", "MissionId", "OrderId", "RedirectUrl", "Forward", "Rights", "Author", "Stat", "ReportResult", "Dynamic", "FirstCid", "Dimension", "StaffInfo", "SeasonId", "AttributeV2", "SeasonTheme", "ShortLinkV2", "UpFromV2", "FirstFrame", });
    internal_static_bilibili_app_archive_v1_Author_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_archive_v1_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Author_descriptor,
        new java.lang.String[] { "Mid", "Name", "Face", });
    internal_static_bilibili_app_archive_v1_Dimension_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_archive_v1_Dimension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Dimension_descriptor,
        new java.lang.String[] { "Width", "Height", "Rotate", });
    internal_static_bilibili_app_archive_v1_Page_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_archive_v1_Page_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Page_descriptor,
        new java.lang.String[] { "Cid", "Page", "From", "Part", "Duration", "Vid", "Desc", "WebLink", "Dimension", "FirstFrame", });
    internal_static_bilibili_app_archive_v1_Rights_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_app_archive_v1_Rights_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Rights_descriptor,
        new java.lang.String[] { "Bp", "Elec", "Download", "Movie", "Pay", "Hd5", "NoReprint", "Autoplay", "UgcPay", "IsCooperation", "UgcPayPreview", "NoBackground", "ArcPay", "PayFreeWatch", });
    internal_static_bilibili_app_archive_v1_SeasonTheme_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_app_archive_v1_SeasonTheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_SeasonTheme_descriptor,
        new java.lang.String[] { "BgColor", "SelectedBgColor", "TextColor", });
    internal_static_bilibili_app_archive_v1_StaffInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bilibili_app_archive_v1_StaffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_StaffInfo_descriptor,
        new java.lang.String[] { "Mid", "Title", "Attribute", });
    internal_static_bilibili_app_archive_v1_Stat_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bilibili_app_archive_v1_Stat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_archive_v1_Stat_descriptor,
        new java.lang.String[] { "Aid", "View", "Danmaku", "Reply", "Fav", "Coin", "Share", "NowRank", "HisRank", "Like", "Dislike", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
