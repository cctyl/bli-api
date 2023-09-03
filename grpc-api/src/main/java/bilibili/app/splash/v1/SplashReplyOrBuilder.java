// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/splash/v1/splash.proto

package bilibili.app.splash.v1;

public interface SplashReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.splash.v1.SplashReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 max_time = 1;</code>
   * @return The maxTime.
   */
  int getMaxTime();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 min_interval = 2;</code>
   * @return The minInterval.
   */
  int getMinInterval();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 pull_interval = 3;</code>
   * @return The pullInterval.
   */
  int getPullInterval();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.SplashItem list = 4;</code>
   */
  java.util.List<bilibili.app.splash.v1.SplashItem> 
      getListList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.SplashItem list = 4;</code>
   */
  bilibili.app.splash.v1.SplashItem getList(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.SplashItem list = 4;</code>
   */
  int getListCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.SplashItem list = 4;</code>
   */
  java.util.List<? extends bilibili.app.splash.v1.SplashItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.SplashItem list = 4;</code>
   */
  bilibili.app.splash.v1.SplashItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.ShowStrategy show = 5;</code>
   */
  java.util.List<bilibili.app.splash.v1.ShowStrategy> 
      getShowList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.ShowStrategy show = 5;</code>
   */
  bilibili.app.splash.v1.ShowStrategy getShow(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.ShowStrategy show = 5;</code>
   */
  int getShowCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.ShowStrategy show = 5;</code>
   */
  java.util.List<? extends bilibili.app.splash.v1.ShowStrategyOrBuilder> 
      getShowOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.app.splash.v1.ShowStrategy show = 5;</code>
   */
  bilibili.app.splash.v1.ShowStrategyOrBuilder getShowOrBuilder(
      int index);
}
