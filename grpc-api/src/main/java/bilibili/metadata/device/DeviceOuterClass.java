// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/device/device.proto

package bilibili.metadata.device;

public final class DeviceOuterClass {
  private DeviceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_metadata_device_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_metadata_device_Device_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%bilibili/metadata/device/device.proto\022" +
      "\030bilibili.metadata.device\"\374\001\n\006Device\022\016\n\006" +
      "app_id\030\001 \001(\005\022\r\n\005build\030\002 \001(\005\022\r\n\005buvid\030\003 \001" +
      "(\t\022\020\n\010mobi_app\030\004 \001(\t\022\020\n\010platform\030\005 \001(\t\022\016" +
      "\n\006device\030\006 \001(\t\022\017\n\007channel\030\007 \001(\t\022\r\n\005brand" +
      "\030\010 \001(\t\022\r\n\005model\030\t \001(\t\022\r\n\005osver\030\n \001(\t\022\020\n\010" +
      "fp_local\030\013 \001(\t\022\021\n\tfp_remote\030\014 \001(\t\022\024\n\014ver" +
      "sion_name\030\r \001(\t\022\n\n\002fp\030\016 \001(\t\022\013\n\003fts\030\017 \001(\003" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_metadata_device_Device_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_metadata_device_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_metadata_device_Device_descriptor,
        new java.lang.String[] { "AppId", "Build", "Buvid", "MobiApp", "Platform", "Device", "Channel", "Brand", "Model", "Osver", "FpLocal", "FpRemote", "VersionName", "Fp", "Fts", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}