// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

public interface ParticipationCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.nativeact.v1.ParticipationCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>string image = 1;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string image = 1;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string selected_image = 2;</code>
   * @return The selectedImage.
   */
  java.lang.String getSelectedImage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string selected_image = 2;</code>
   * @return The bytes for selectedImage.
   */
  com.google.protobuf.ByteString
      getSelectedImageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ParticipationCardItem items = 3;</code>
   */
  java.util.List<bilibili.app.nativeact.v1.ParticipationCardItem> 
      getItemsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ParticipationCardItem items = 3;</code>
   */
  bilibili.app.nativeact.v1.ParticipationCardItem getItems(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ParticipationCardItem items = 3;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ParticipationCardItem items = 3;</code>
   */
  java.util.List<? extends bilibili.app.nativeact.v1.ParticipationCardItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.nativeact.v1.ParticipationCardItem items = 3;</code>
   */
  bilibili.app.nativeact.v1.ParticipationCardItemOrBuilder getItemsOrBuilder(
      int index);
}