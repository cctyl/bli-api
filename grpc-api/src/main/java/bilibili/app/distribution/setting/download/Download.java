// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/distribution/setting/download.proto

package bilibili.app.distribution.setting.download;

public final class Download {
  private Download() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_app_distribution_setting_download_DownloadSettingsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_app_distribution_setting_download_DownloadSettingsConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0bilibili/app/distribution/setting/down" +
      "load.proto\022*bilibili.app.distribution.se" +
      "tting.download\032/bilibili/app/distributio" +
      "n/v1/distribution.proto\"e\n\026DownloadSetti" +
      "ngsConfig\022K\n\032enable_download_auto_start\030" +
      "\001 \001(\0132\'.bilibili.app.distribution.v1.Boo" +
      "lValueB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bilibili.app.distribution.v1.DistributionOuterClass.getDescriptor(),
        });
    internal_static_bilibili_app_distribution_setting_download_DownloadSettingsConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_app_distribution_setting_download_DownloadSettingsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_app_distribution_setting_download_DownloadSettingsConfig_descriptor,
        new java.lang.String[] { "EnableDownloadAutoStart", });
    bilibili.app.distribution.v1.DistributionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}