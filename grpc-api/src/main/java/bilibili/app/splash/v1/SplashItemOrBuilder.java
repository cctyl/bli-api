// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/splash/v1/splash.proto

package bilibili.app.splash.v1;

public interface SplashItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.splash.v1.SplashItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 card_type = 3;</code>
   * @return The cardType.
   */
  int getCardType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 duration = 4;</code>
   * @return The duration.
   */
  int getDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 begin_time = 5;</code>
   * @return The beginTime.
   */
  long getBeginTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 end_time = 6;</code>
   * @return The endTime.
   */
  long getEndTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>string thumb = 7;</code>
   * @return The thumb.
   */
  java.lang.String getThumb();
  /**
   * <pre>
   * </pre>
   *
   * <code>string thumb = 7;</code>
   * @return The bytes for thumb.
   */
  com.google.protobuf.ByteString
      getThumbBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string hash = 8;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * </pre>
   *
   * <code>string hash = 8;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string logo_url = 9;</code>
   * @return The logoUrl.
   */
  java.lang.String getLogoUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string logo_url = 9;</code>
   * @return The bytes for logoUrl.
   */
  com.google.protobuf.ByteString
      getLogoUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string logo_hash = 10;</code>
   * @return The logoHash.
   */
  java.lang.String getLogoHash();
  /**
   * <pre>
   * </pre>
   *
   * <code>string logo_hash = 10;</code>
   * @return The bytes for logoHash.
   */
  com.google.protobuf.ByteString
      getLogoHashBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string video_url = 11;</code>
   * @return The videoUrl.
   */
  java.lang.String getVideoUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string video_url = 11;</code>
   * @return The bytes for videoUrl.
   */
  com.google.protobuf.ByteString
      getVideoUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string video_hash = 12;</code>
   * @return The videoHash.
   */
  java.lang.String getVideoHash();
  /**
   * <pre>
   * </pre>
   *
   * <code>string video_hash = 12;</code>
   * @return The bytes for videoHash.
   */
  com.google.protobuf.ByteString
      getVideoHashBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 video_width = 13;</code>
   * @return The videoWidth.
   */
  int getVideoWidth();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 video_height = 14;</code>
   * @return The videoHeight.
   */
  int getVideoHeight();

  /**
   * <pre>
   * </pre>
   *
   * <code>string schema = 15;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <pre>
   * </pre>
   *
   * <code>string schema = 15;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string schema_title = 16;</code>
   * @return The schemaTitle.
   */
  java.lang.String getSchemaTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string schema_title = 16;</code>
   * @return The bytes for schemaTitle.
   */
  com.google.protobuf.ByteString
      getSchemaTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string schema_package_name = 17;</code>
   * @return The schemaPackageName.
   */
  java.lang.String getSchemaPackageName();
  /**
   * <pre>
   * </pre>
   *
   * <code>string schema_package_name = 17;</code>
   * @return The bytes for schemaPackageName.
   */
  com.google.protobuf.ByteString
      getSchemaPackageNameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string schema_callup_whiteList = 18;</code>
   * @return A list containing the schemaCallupWhiteList.
   */
  java.util.List<java.lang.String>
      getSchemaCallupWhiteListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string schema_callup_whiteList = 18;</code>
   * @return The count of schemaCallupWhiteList.
   */
  int getSchemaCallupWhiteListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string schema_callup_whiteList = 18;</code>
   * @param index The index of the element to return.
   * @return The schemaCallupWhiteList at the given index.
   */
  java.lang.String getSchemaCallupWhiteList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string schema_callup_whiteList = 18;</code>
   * @param index The index of the value to return.
   * @return The bytes of the schemaCallupWhiteList at the given index.
   */
  com.google.protobuf.ByteString
      getSchemaCallupWhiteListBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 skip = 19;</code>
   * @return The skip.
   */
  int getSkip();

  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 20;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri = 20;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string uri_title = 21;</code>
   * @return The uriTitle.
   */
  java.lang.String getUriTitle();
  /**
   * <pre>
   * </pre>
   *
   * <code>string uri_title = 21;</code>
   * @return The bytes for uriTitle.
   */
  com.google.protobuf.ByteString
      getUriTitleBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 source = 22;</code>
   * @return The source.
   */
  int getSource();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 cm_mark = 23;</code>
   * @return The cmMark.
   */
  int getCmMark();

  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 24;</code>
   * @return The adCb.
   */
  java.lang.String getAdCb();
  /**
   * <pre>
   * </pre>
   *
   * <code>string ad_cb = 24;</code>
   * @return The bytes for adCb.
   */
  com.google.protobuf.ByteString
      getAdCbBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 resource_id = 25;</code>
   * @return The resourceId.
   */
  long getResourceId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string request_id = 26;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * </pre>
   *
   * <code>string request_id = 26;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string client_ip = 27;</code>
   * @return The clientIp.
   */
  java.lang.String getClientIp();
  /**
   * <pre>
   * </pre>
   *
   * <code>string client_ip = 27;</code>
   * @return The bytes for clientIp.
   */
  com.google.protobuf.ByteString
      getClientIpBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_ad = 28;</code>
   * @return The isAd.
   */
  boolean getIsAd();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool is_ad_loc = 29;</code>
   * @return The isAdLoc.
   */
  boolean getIsAdLoc();

  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any extra = 30;</code>
   * @return Whether the extra field is set.
   */
  boolean hasExtra();
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any extra = 30;</code>
   * @return The extra.
   */
  com.google.protobuf.Any getExtra();
  /**
   * <pre>
   * </pre>
   *
   * <code>.google.protobuf.Any extra = 30;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtraOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 card_index = 31;</code>
   * @return The cardIndex.
   */
  long getCardIndex();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 server_type = 32;</code>
   * @return The serverType.
   */
  long getServerType();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 index = 33;</code>
   * @return The index.
   */
  long getIndex();

  /**
   * <pre>
   * </pre>
   *
   * <code>string click_url = 34;</code>
   * @return The clickUrl.
   */
  java.lang.String getClickUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string click_url = 34;</code>
   * @return The bytes for clickUrl.
   */
  com.google.protobuf.ByteString
      getClickUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string show_url = 35;</code>
   * @return The showUrl.
   */
  java.lang.String getShowUrl();
  /**
   * <pre>
   * </pre>
   *
   * <code>string show_url = 35;</code>
   * @return The bytes for showUrl.
   */
  com.google.protobuf.ByteString
      getShowUrlBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 time_target = 36;</code>
   * @return The timeTarget.
   */
  int getTimeTarget();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 encryption = 37;</code>
   * @return The encryption.
   */
  int getEncryption();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool enable_pre_download = 38;</code>
   * @return The enablePreDownload.
   */
  boolean getEnablePreDownload();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool enable_background_download = 39;</code>
   * @return The enableBackgroundDownload.
   */
  boolean getEnableBackgroundDownload();
}
