// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/interfaces/v1/interfaces.proto

package bilibili.web.interfaces.v1;

public interface ReplyContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.web.interfaces.v1.ReplyContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>int64 rp_id = 1;</code>
   * @return The rpId.
   */
  long getRpId();

  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyVote vote = 3;</code>
   * @return Whether the vote field is set.
   */
  boolean hasVote();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyVote vote = 3;</code>
   * @return The vote.
   */
  bilibili.web.interfaces.v1.ReplyVote getVote();
  /**
   * <pre>
   * </pre>
   *
   * <code>.bilibili.web.interfaces.v1.ReplyVote vote = 3;</code>
   */
  bilibili.web.interfaces.v1.ReplyVoteOrBuilder getVoteOrBuilder();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string topics = 5;</code>
   * @return A list containing the topics.
   */
  java.util.List<java.lang.String>
      getTopicsList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string topics = 5;</code>
   * @return The count of topics.
   */
  int getTopicsCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string topics = 5;</code>
   * @param index The index of the element to return.
   * @return The topics at the given index.
   */
  java.lang.String getTopics(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated string topics = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the topics at the given index.
   */
  com.google.protobuf.ByteString
      getTopicsBytes(int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 ip = 6;</code>
   * @return The ip.
   */
  int getIp();

  /**
   * <pre>
   * </pre>
   *
   * <code>int32 plat = 7;</code>
   * @return The plat.
   */
  int getPlat();

  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 8;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * </pre>
   *
   * <code>string device = 8;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 9;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * </pre>
   *
   * <code>string version = 9;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.ReplyMemberInfo members = 10;</code>
   */
  java.util.List<bilibili.web.interfaces.v1.ReplyMemberInfo> 
      getMembersList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.ReplyMemberInfo members = 10;</code>
   */
  bilibili.web.interfaces.v1.ReplyMemberInfo getMembers(int index);
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.ReplyMemberInfo members = 10;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.ReplyMemberInfo members = 10;</code>
   */
  java.util.List<? extends bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * </pre>
   *
   * <code>repeated .bilibili.web.interfaces.v1.ReplyMemberInfo members = 10;</code>
   */
  bilibili.web.interfaces.v1.ReplyMemberInfoOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.web.interfaces.v1.ReplyEmote&gt; emote = 11;</code>
   */
  int getEmoteCount();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.web.interfaces.v1.ReplyEmote&gt; emote = 11;</code>
   */
  boolean containsEmote(
      java.lang.String key);
  /**
   * Use {@link #getEmoteMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, bilibili.web.interfaces.v1.ReplyEmote>
  getEmote();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.web.interfaces.v1.ReplyEmote&gt; emote = 11;</code>
   */
  java.util.Map<java.lang.String, bilibili.web.interfaces.v1.ReplyEmote>
  getEmoteMap();
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.web.interfaces.v1.ReplyEmote&gt; emote = 11;</code>
   */
  /* nullable */
bilibili.web.interfaces.v1.ReplyEmote getEmoteOrDefault(
      java.lang.String key,
      /* nullable */
bilibili.web.interfaces.v1.ReplyEmote defaultValue);
  /**
   * <pre>
   * </pre>
   *
   * <code>map&lt;string, .bilibili.web.interfaces.v1.ReplyEmote&gt; emote = 11;</code>
   */
  bilibili.web.interfaces.v1.ReplyEmote getEmoteOrThrow(
      java.lang.String key);
}
