// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

public interface SelectionModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.viewunite.v1.SelectionModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.Selection selection = 1;</code>
   */
  java.util.List<bilibili.app.viewunite.v1.Selection> 
      getSelectionList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.Selection selection = 1;</code>
   */
  bilibili.app.viewunite.v1.Selection getSelection(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.Selection selection = 1;</code>
   */
  int getSelectionCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.Selection selection = 1;</code>
   */
  java.util.List<? extends bilibili.app.viewunite.v1.SelectionOrBuilder> 
      getSelectionOrBuilderList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.Selection selection = 1;</code>
   */
  bilibili.app.viewunite.v1.SelectionOrBuilder getSelectionOrBuilder(
      int index);

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SerialSeason serial_season = 2;</code>
   */
  java.util.List<bilibili.app.viewunite.v1.SerialSeason> 
      getSerialSeasonList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SerialSeason serial_season = 2;</code>
   */
  bilibili.app.viewunite.v1.SerialSeason getSerialSeason(int index);
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SerialSeason serial_season = 2;</code>
   */
  int getSerialSeasonCount();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SerialSeason serial_season = 2;</code>
   */
  java.util.List<? extends bilibili.app.viewunite.v1.SerialSeasonOrBuilder> 
      getSerialSeasonOrBuilderList();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>repeated .bilibili.app.viewunite.v1.SerialSeason serial_season = 2;</code>
   */
  bilibili.app.viewunite.v1.SerialSeasonOrBuilder getSerialSeasonOrBuilder(
      int index);

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.PlayStrategy play_strategy = 3;</code>
   * @return Whether the playStrategy field is set.
   */
  boolean hasPlayStrategy();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.PlayStrategy play_strategy = 3;</code>
   * @return The playStrategy.
   */
  bilibili.app.viewunite.v1.PlayStrategy getPlayStrategy();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.viewunite.v1.PlayStrategy play_strategy = 3;</code>
   */
  bilibili.app.viewunite.v1.PlayStrategyOrBuilder getPlayStrategyOrBuilder();
}
