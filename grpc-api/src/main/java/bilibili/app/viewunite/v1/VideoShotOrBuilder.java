// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

public interface VideoShotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.viewunite.v1.VideoShot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string pv_data = 1;</code>
   * @return The pvData.
   */
  java.lang.String getPvData();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>string pv_data = 1;</code>
   * @return The bytes for pvData.
   */
  com.google.protobuf.ByteString
      getPvDataBytes();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 img_x_len = 2;</code>
   * @return The imgXLen.
   */
  int getImgXLen();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 imd_x_size = 3;</code>
   * @return The imdXSize.
   */
  int getImdXSize();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 img_y_len = 4;</code>
   * @return The imgYLen.
   */
  int getImgYLen();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>int32 img_y_size = 5;</code>
   * @return The imgYSize.
   */
  int getImgYSize();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated string image = 6;</code>
   * @return A list containing the image.
   */
  java.util.List<java.lang.String>
      getImageList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated string image = 6;</code>
   * @return The count of image.
   */
  int getImageCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated string image = 6;</code>
   * @param index The index of the element to return.
   * @return The image at the given index.
   */
  java.lang.String getImage(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated string image = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the image at the given index.
   */
  com.google.protobuf.ByteString
      getImageBytes(int index);
}
