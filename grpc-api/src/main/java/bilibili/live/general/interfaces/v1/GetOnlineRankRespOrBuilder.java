// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/live/general/interfaces/v1/interfaces.proto

package bilibili.live.general.interfaces.v1;

public interface GetOnlineRankRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.live.general.interfaces.v1.GetOnlineRankResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.live.general.interfaces.v1.GetOnlineRankResp.OnlineRankItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.live.general.interfaces.v1.GetOnlineRankResp.OnlineRankItem item = 1;</code>
   * @return The item.
   */
  bilibili.live.general.interfaces.v1.GetOnlineRankResp.OnlineRankItem getItem();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.live.general.interfaces.v1.GetOnlineRankResp.OnlineRankItem item = 1;</code>
   */
  bilibili.live.general.interfaces.v1.GetOnlineRankResp.OnlineRankItemOrBuilder getItemOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 online_num = 2;</code>
   * @return The onlineNum.
   */
  long getOnlineNum();
}
