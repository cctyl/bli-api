// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/search.proto

package bilibili.app.interface.v1;

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
    internal_static_bilibili_app_interface_v1_DefaultWordsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_DefaultWordsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_NftFaceIcon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_NftFaceIcon_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_DefaultWordsReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_DefaultWordsReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_SuggestionResult3Req_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_ResultItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_ResultItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_OfficialVerify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_OfficialVerify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_interface_v1_ReasonStyle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_interface_v1_ReasonStyle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'bilibili/app/interfaces/v1/search.prot" +
      "o\022\031bilibili.app.interface.v1\"\236\001\n\021Default" +
      "WordsReply\022\017\n\007trackid\030\001 \001(\t\022\r\n\005param\030\002 \001" +
      "(\t\022\014\n\004show\030\003 \001(\t\022\014\n\004word\030\004 \001(\t\022\022\n\nshow_f" +
      "ront\030\005 \001(\003\022\017\n\007exp_str\030\006 \001(\t\022\014\n\004goto\030\007 \001(" +
      "\t\022\r\n\005value\030\010 \001(\t\022\013\n\003uri\030\t \001(\t\"E\n\013NftFace" +
      "Icon\022\023\n\013region_type\030\001 \001(\005\022\014\n\004icon\030\002 \001(\t\022" +
      "\023\n\013show_status\030\003 \001(\005\"\274\001\n\017DefaultWordsReq" +
      "\022\014\n\004from\030\001 \001(\003\022\023\n\013login_event\030\002 \001(\003\022\026\n\016t" +
      "eenagers_mode\030\003 \001(\005\022\024\n\014lessons_mode\030\004 \001(" +
      "\005\022\013\n\003tab\030\005 \001(\t\022\020\n\010event_id\030\006 \001(\t\022\014\n\004avid" +
      "\030\007 \001(\t\022\r\n\005query\030\010 \001(\t\022\n\n\002an\030\t \001(\003\022\020\n\010is_" +
      "fresh\030\n \001(\003\"o\n\026SuggestionResult3Reply\022\017\n" +
      "\007trackid\030\001 \001(\t\0223\n\004list\030\002 \003(\0132%.bilibili." +
      "app.interface.v1.ResultItem\022\017\n\007exp_str\030\003" +
      " \001(\t\"R\n\024SuggestionResult3Req\022\017\n\007keyword\030" +
      "\001 \001(\t\022\021\n\thighlight\030\002 \001(\005\022\026\n\016teenagers_mo" +
      "de\030\003 \001(\005\"\364\004\n\nResultItem\022\014\n\004from\030\001 \001(\t\022\r\n" +
      "\005title\030\002 \001(\t\022\017\n\007keyword\030\003 \001(\t\022\020\n\010positio" +
      "n\030\004 \001(\005\022\r\n\005cover\030\005 \001(\t\022\022\n\ncover_size\030\006 \001" +
      "(\001\022\020\n\010sug_type\030\007 \001(\t\022\021\n\tterm_type\030\010 \001(\005\022" +
      "\014\n\004goto\030\t \001(\t\022\013\n\003uri\030\n \001(\t\022B\n\017official_v" +
      "erify\030\013 \001(\0132).bilibili.app.interface.v1." +
      "OfficialVerify\022\r\n\005param\030\014 \001(\t\022\013\n\003mid\030\r \001" +
      "(\003\022\014\n\004fans\030\016 \001(\005\022\r\n\005level\030\017 \001(\005\022\020\n\010archi" +
      "ves\030\020 \001(\005\022\r\n\005ptime\030\021 \001(\003\022\030\n\020season_type_" +
      "name\030\022 \001(\t\022\014\n\004area\030\023 \001(\t\022\r\n\005style\030\024 \001(\t\022" +
      "\r\n\005label\030\025 \001(\t\022\016\n\006rating\030\026 \001(\001\022\014\n\004vote\030\027" +
      " \001(\005\0226\n\006badges\030\030 \003(\0132&.bilibili.app.inte" +
      "rface.v1.ReasonStyle\022\016\n\006styles\030\031 \001(\t\022\021\n\t" +
      "module_id\030\032 \001(\003\022\021\n\tlive_link\030\033 \001(\t\022\024\n\014fa" +
      "ce_nft_new\030\034 \001(\005\022=\n\rnft_face_icon\030\035 \001(\0132" +
      "&.bilibili.app.interface.v1.NftFaceIcon\"" +
      ",\n\016OfficialVerify\022\014\n\004type\030\001 \001(\005\022\014\n\004desc\030" +
      "\002 \001(\t\"\267\001\n\013ReasonStyle\022\014\n\004text\030\001 \001(\t\022\022\n\nt" +
      "ext_color\030\002 \001(\t\022\030\n\020text_color_night\030\003 \001(" +
      "\t\022\020\n\010bg_color\030\004 \001(\t\022\026\n\016bg_color_night\030\005 " +
      "\001(\t\022\024\n\014border_color\030\006 \001(\t\022\032\n\022border_colo" +
      "r_night\030\007 \001(\t\022\020\n\010bg_style\030\010 \001(\0052\342\001\n\006Sear" +
      "ch\022n\n\010Suggest3\022/.bilibili.app.interface." +
      "v1.SuggestionResult3Req\0321.bilibili.app.i" +
      "nterface.v1.SuggestionResult3Reply\022h\n\014De" +
      "faultWords\022*.bilibili.app.interface.v1.D" +
      "efaultWordsReq\032,.bilibili.app.interface." +
      "v1.DefaultWordsReply2|\n\nSearchTest\022n\n\010No" +
      "tExist\022/.bilibili.app.interface.v1.Sugge" +
      "stionResult3Req\0321.bilibili.app.interface" +
      ".v1.SuggestionResult3ReplyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_app_interface_v1_DefaultWordsReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_interface_v1_DefaultWordsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_DefaultWordsReply_descriptor,
        new java.lang.String[] { "Trackid", "Param", "Show", "Word", "ShowFront", "ExpStr", "Goto", "Value", "Uri", });
    internal_static_bilibili_app_interface_v1_NftFaceIcon_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_app_interface_v1_NftFaceIcon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_NftFaceIcon_descriptor,
        new java.lang.String[] { "RegionType", "Icon", "ShowStatus", });
    internal_static_bilibili_app_interface_v1_DefaultWordsReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bilibili_app_interface_v1_DefaultWordsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_DefaultWordsReq_descriptor,
        new java.lang.String[] { "From", "LoginEvent", "TeenagersMode", "LessonsMode", "Tab", "EventId", "Avid", "Query", "An", "IsFresh", });
    internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SuggestionResult3Reply_descriptor,
        new java.lang.String[] { "Trackid", "List", "ExpStr", });
    internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bilibili_app_interface_v1_SuggestionResult3Req_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_SuggestionResult3Req_descriptor,
        new java.lang.String[] { "Keyword", "Highlight", "TeenagersMode", });
    internal_static_bilibili_app_interface_v1_ResultItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bilibili_app_interface_v1_ResultItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_ResultItem_descriptor,
        new java.lang.String[] { "From", "Title", "Keyword", "Position", "Cover", "CoverSize", "SugType", "TermType", "Goto", "Uri", "OfficialVerify", "Param", "Mid", "Fans", "Level", "Archives", "Ptime", "SeasonTypeName", "Area", "Style", "Label", "Rating", "Vote", "Badges", "Styles", "ModuleId", "LiveLink", "FaceNftNew", "NftFaceIcon", });
    internal_static_bilibili_app_interface_v1_OfficialVerify_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bilibili_app_interface_v1_OfficialVerify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_OfficialVerify_descriptor,
        new java.lang.String[] { "Type", "Desc", });
    internal_static_bilibili_app_interface_v1_ReasonStyle_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bilibili_app_interface_v1_ReasonStyle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_interface_v1_ReasonStyle_descriptor,
        new java.lang.String[] { "Text", "TextColor", "TextColorNight", "BgColor", "BgColorNight", "BorderColor", "BorderColorNight", "BgStyle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
