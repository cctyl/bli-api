// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/render/render.proto

package bilibili.render;

public final class RenderOuterClass {
  private RenderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_render_Render_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_render_Render_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034bilibili/render/render.proto\022\017bilibili" +
      ".render\032\031google/protobuf/any.proto\"X\n\006Re" +
      "nder\022\014\n\004code\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\013\n\003t" +
      "tl\030\003 \001(\t\022\"\n\004data\030\004 \001(\0132\024.google.protobuf" +
      ".AnyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_bilibili_render_Render_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_render_Render_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_render_Render_descriptor,
        new java.lang.String[] { "Code", "Message", "Ttl", "Data", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}