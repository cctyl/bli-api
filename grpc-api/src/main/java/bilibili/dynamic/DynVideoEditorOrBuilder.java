// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/common/dynamic.proto

package bilibili.dynamic;

public interface DynVideoEditorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.dynamic.DynVideoEditor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 cid = 1;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 upfrom = 2;</code>
   * @return The upfrom.
   */
  int getUpfrom();

  /**
   * <pre>
   * 滤镜
   * </pre>
   *
   * <code>string filters = 3;</code>
   * @return The filters.
   */
  java.lang.String getFilters();
  /**
   * <pre>
   * 滤镜
   * </pre>
   *
   * <code>string filters = 3;</code>
   * @return The bytes for filters.
   */
  com.google.protobuf.ByteString
      getFiltersBytes();

  /**
   * <pre>
   * 字体
   * </pre>
   *
   * <code>string fonts = 4;</code>
   * @return The fonts.
   */
  java.lang.String getFonts();
  /**
   * <pre>
   * 字体
   * </pre>
   *
   * <code>string fonts = 4;</code>
   * @return The bytes for fonts.
   */
  com.google.protobuf.ByteString
      getFontsBytes();

  /**
   * <pre>
   * 字幕
   * </pre>
   *
   * <code>string subtitles = 5;</code>
   * @return The subtitles.
   */
  java.lang.String getSubtitles();
  /**
   * <pre>
   * 字幕
   * </pre>
   *
   * <code>string subtitles = 5;</code>
   * @return The bytes for subtitles.
   */
  com.google.protobuf.ByteString
      getSubtitlesBytes();

  /**
   * <pre>
   * bgm
   * </pre>
   *
   * <code>string bgms = 6;</code>
   * @return The bgms.
   */
  java.lang.String getBgms();
  /**
   * <pre>
   * bgm
   * </pre>
   *
   * <code>string bgms = 6;</code>
   * @return The bytes for bgms.
   */
  com.google.protobuf.ByteString
      getBgmsBytes();

  /**
   * <pre>
   * 3d拍摄贴纸
   * </pre>
   *
   * <code>string stickers = 7;</code>
   * @return The stickers.
   */
  java.lang.String getStickers();
  /**
   * <pre>
   * 3d拍摄贴纸
   * </pre>
   *
   * <code>string stickers = 7;</code>
   * @return The bytes for stickers.
   */
  com.google.protobuf.ByteString
      getStickersBytes();

  /**
   * <pre>
   * 2d投稿贴纸
   * </pre>
   *
   * <code>string videoup_stickers = 8;</code>
   * @return The videoupStickers.
   */
  java.lang.String getVideoupStickers();
  /**
   * <pre>
   * 2d投稿贴纸
   * </pre>
   *
   * <code>string videoup_stickers = 8;</code>
   * @return The bytes for videoupStickers.
   */
  com.google.protobuf.ByteString
      getVideoupStickersBytes();

  /**
   * <pre>
   * 视频转场特效
   * </pre>
   *
   * <code>string trans = 9;</code>
   * @return The trans.
   */
  java.lang.String getTrans();
  /**
   * <pre>
   * 视频转场特效
   * </pre>
   *
   * <code>string trans = 9;</code>
   * @return The bytes for trans.
   */
  com.google.protobuf.ByteString
      getTransBytes();

  /**
   * <pre>
   * 编辑器的主题使用相关
   * </pre>
   *
   * <code>string makeups = 10;</code>
   * @return The makeups.
   */
  java.lang.String getMakeups();
  /**
   * <pre>
   * 编辑器的主题使用相关
   * </pre>
   *
   * <code>string makeups = 10;</code>
   * @return The bytes for makeups.
   */
  com.google.protobuf.ByteString
      getMakeupsBytes();

  /**
   * <pre>
   * 整容之外科手术
   * </pre>
   *
   * <code>string surgerys = 11;</code>
   * @return The surgerys.
   */
  java.lang.String getSurgerys();
  /**
   * <pre>
   * 整容之外科手术
   * </pre>
   *
   * <code>string surgerys = 11;</code>
   * @return The bytes for surgerys.
   */
  com.google.protobuf.ByteString
      getSurgerysBytes();

  /**
   * <pre>
   * 美摄特定的videofx
   * </pre>
   *
   * <code>string videofxs = 12;</code>
   * @return The videofxs.
   */
  java.lang.String getVideofxs();
  /**
   * <pre>
   * 美摄特定的videofx
   * </pre>
   *
   * <code>string videofxs = 12;</code>
   * @return The bytes for videofxs.
   */
  com.google.protobuf.ByteString
      getVideofxsBytes();

  /**
   * <pre>
   * 编辑器的主题使用相关
   * </pre>
   *
   * <code>string themes = 13;</code>
   * @return The themes.
   */
  java.lang.String getThemes();
  /**
   * <pre>
   * 编辑器的主题使用相关
   * </pre>
   *
   * <code>string themes = 13;</code>
   * @return The bytes for themes.
   */
  com.google.protobuf.ByteString
      getThemesBytes();

  /**
   * <pre>
   * 拍摄之稿件合拍
   * </pre>
   *
   * <code>string cooperates = 14;</code>
   * @return The cooperates.
   */
  java.lang.String getCooperates();
  /**
   * <pre>
   * 拍摄之稿件合拍
   * </pre>
   *
   * <code>string cooperates = 14;</code>
   * @return The bytes for cooperates.
   */
  com.google.protobuf.ByteString
      getCooperatesBytes();

  /**
   * <pre>
   * 拍摄之音乐卡点视频
   * </pre>
   *
   * <code>string rhythms = 15;</code>
   * @return The rhythms.
   */
  java.lang.String getRhythms();
  /**
   * <pre>
   * 拍摄之音乐卡点视频
   * </pre>
   *
   * <code>string rhythms = 15;</code>
   * @return The bytes for rhythms.
   */
  com.google.protobuf.ByteString
      getRhythmsBytes();

  /**
   * <pre>
   * mvp特效
   * </pre>
   *
   * <code>string effects = 16;</code>
   * @return The effects.
   */
  java.lang.String getEffects();
  /**
   * <pre>
   * mvp特效
   * </pre>
   *
   * <code>string effects = 16;</code>
   * @return The bytes for effects.
   */
  com.google.protobuf.ByteString
      getEffectsBytes();

  /**
   * <pre>
   * mvp背景
   * </pre>
   *
   * <code>string backgrounds = 17;</code>
   * @return The backgrounds.
   */
  java.lang.String getBackgrounds();
  /**
   * <pre>
   * mvp背景
   * </pre>
   *
   * <code>string backgrounds = 17;</code>
   * @return The bytes for backgrounds.
   */
  com.google.protobuf.ByteString
      getBackgroundsBytes();

  /**
   * <pre>
   * mvp视频
   * </pre>
   *
   * <code>string videos = 18;</code>
   * @return The videos.
   */
  java.lang.String getVideos();
  /**
   * <pre>
   * mvp视频
   * </pre>
   *
   * <code>string videos = 18;</code>
   * @return The bytes for videos.
   */
  com.google.protobuf.ByteString
      getVideosBytes();

  /**
   * <pre>
   * mvp音效
   * </pre>
   *
   * <code>string sounds = 19;</code>
   * @return The sounds.
   */
  java.lang.String getSounds();
  /**
   * <pre>
   * mvp音效
   * </pre>
   *
   * <code>string sounds = 19;</code>
   * @return The bytes for sounds.
   */
  com.google.protobuf.ByteString
      getSoundsBytes();

  /**
   * <pre>
   * mvp花字
   * </pre>
   *
   * <code>string flowers = 20;</code>
   * @return The flowers.
   */
  java.lang.String getFlowers();
  /**
   * <pre>
   * mvp花字
   * </pre>
   *
   * <code>string flowers = 20;</code>
   * @return The bytes for flowers.
   */
  com.google.protobuf.ByteString
      getFlowersBytes();

  /**
   * <pre>
   * mvp封面模板
   * </pre>
   *
   * <code>string cover_templates = 21;</code>
   * @return The coverTemplates.
   */
  java.lang.String getCoverTemplates();
  /**
   * <pre>
   * mvp封面模板
   * </pre>
   *
   * <code>string cover_templates = 21;</code>
   * @return The bytes for coverTemplates.
   */
  com.google.protobuf.ByteString
      getCoverTemplatesBytes();

  /**
   * <pre>
   * tts
   * </pre>
   *
   * <code>string tts = 22;</code>
   * @return The tts.
   */
  java.lang.String getTts();
  /**
   * <pre>
   * tts
   * </pre>
   *
   * <code>string tts = 22;</code>
   * @return The bytes for tts.
   */
  com.google.protobuf.ByteString
      getTtsBytes();

  /**
   * <pre>
   * openings
   * </pre>
   *
   * <code>string openings = 23;</code>
   * @return The openings.
   */
  java.lang.String getOpenings();
  /**
   * <pre>
   * openings
   * </pre>
   *
   * <code>string openings = 23;</code>
   * @return The bytes for openings.
   */
  com.google.protobuf.ByteString
      getOpeningsBytes();

  /**
   * <pre>
   * 录音题词
   * </pre>
   *
   * <code>bool record_text = 24;</code>
   * @return The recordText.
   */
  boolean getRecordText();

  /**
   * <pre>
   * 虚拟形象上报
   * </pre>
   *
   * <code>string vupers = 25;</code>
   * @return The vupers.
   */
  java.lang.String getVupers();
  /**
   * <pre>
   * 虚拟形象上报
   * </pre>
   *
   * <code>string vupers = 25;</code>
   * @return The bytes for vupers.
   */
  com.google.protobuf.ByteString
      getVupersBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string features = 26;</code>
   * @return The features.
   */
  java.lang.String getFeatures();
  /**
   * <pre>
   * </pre>
   *
   * <code>string features = 26;</code>
   * @return The bytes for features.
   */
  com.google.protobuf.ByteString
      getFeaturesBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string bcut_features = 27;</code>
   * @return The bcutFeatures.
   */
  java.lang.String getBcutFeatures();
  /**
   * <pre>
   * </pre>
   *
   * <code>string bcut_features = 27;</code>
   * @return The bytes for bcutFeatures.
   */
  com.google.protobuf.ByteString
      getBcutFeaturesBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 audio_record = 28;</code>
   * @return The audioRecord.
   */
  int getAudioRecord();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 camera = 29;</code>
   * @return The camera.
   */
  int getCamera();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 speed = 30;</code>
   * @return The speed.
   */
  int getSpeed();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 camera_rotate = 31;</code>
   * @return The cameraRotate.
   */
  int getCameraRotate();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 screen_record = 32;</code>
   * @return The screenRecord.
   */
  int getScreenRecord();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 default_end = 33;</code>
   * @return The defaultEnd.
   */
  int getDefaultEnd();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 duration = 34;</code>
   * @return The duration.
   */
  int getDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pic_count = 35;</code>
   * @return The picCount.
   */
  int getPicCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 video_count = 36;</code>
   * @return The videoCount.
   */
  int getVideoCount();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 shot_duration = 37;</code>
   * @return The shotDuration.
   */
  int getShotDuration();

  /**
   * <pre>
   * </pre>
   *
   * <code>string shot_game = 38;</code>
   * @return The shotGame.
   */
  java.lang.String getShotGame();
  /**
   * <pre>
   * </pre>
   *
   * <code>string shot_game = 38;</code>
   * @return The bytes for shotGame.
   */
  com.google.protobuf.ByteString
      getShotGameBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool highlight = 39;</code>
   * @return The highlight.
   */
  boolean getHighlight();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 highlight_cnt = 40;</code>
   * @return The highlightCnt.
   */
  int getHighlightCnt();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pip_count = 41;</code>
   * @return The pipCount.
   */
  int getPipCount();
}
