// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

public interface HistoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.view.v1.History)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 播放进度分P cid
   * </pre>
   *
   * <code>int64 cid = 1;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 播放进度时间
   * 0:未观看 -1:已看完 正整数:播放时间进度
   * </pre>
   *
   * <code>int64 progress = 2;</code>
   * @return The progress.
   */
  long getProgress();
}