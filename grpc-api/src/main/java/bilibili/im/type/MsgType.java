// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

/**
 * <pre>
 * 消息类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.im.type.MsgType}
 */
public enum MsgType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 基础消息类型
   * </pre>
   *
   * <code>EN_INVALID_MSG_TYPE = 0;</code>
   */
  EN_INVALID_MSG_TYPE(0),
  /**
   * <pre>
   * 文本消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_TEXT = 1;</code>
   */
  EN_MSG_TYPE_TEXT(1),
  /**
   * <pre>
   * 图片消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_PIC = 2;</code>
   */
  EN_MSG_TYPE_PIC(2),
  /**
   * <pre>
   * 语音消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_AUDIO = 3;</code>
   */
  EN_MSG_TYPE_AUDIO(3),
  /**
   * <pre>
   * 分享消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_SHARE = 4;</code>
   */
  EN_MSG_TYPE_SHARE(4),
  /**
   * <pre>
   * 撤回消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_DRAW_BACK = 5;</code>
   */
  EN_MSG_TYPE_DRAW_BACK(5),
  /**
   * <pre>
   * 自定义表情
   * </pre>
   *
   * <code>EN_MSG_TYPE_CUSTOM_FACE = 6;</code>
   */
  EN_MSG_TYPE_CUSTOM_FACE(6),
  /**
   * <pre>
   * 分享v2消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_SHARE_V2 = 7;</code>
   */
  EN_MSG_TYPE_SHARE_V2(7),
  /**
   * <pre>
   * 系统撤销
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_CANCEL = 8;</code>
   */
  EN_MSG_TYPE_SYS_CANCEL(8),
  /**
   * <pre>
   * 小程序
   * </pre>
   *
   * <code>EN_MSG_TYPE_MINI_PROGRAM = 9;</code>
   */
  EN_MSG_TYPE_MINI_PROGRAM(9),
  /**
   * <pre>
   * 扩展消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_MSG = 10;</code>
   */
  EN_MSG_TYPE_NOTIFY_MSG(10),
  /**
   * <pre>
   * 视频卡片
   * </pre>
   *
   * <code>EN_MSG_TYPE_VIDEO_CARD = 11;</code>
   */
  EN_MSG_TYPE_VIDEO_CARD(11),
  /**
   * <pre>
   * 专栏卡片
   * </pre>
   *
   * <code>EN_MSG_TYPE_ARTICLE_CARD = 12;</code>
   */
  EN_MSG_TYPE_ARTICLE_CARD(12),
  /**
   * <pre>
   * 图片卡
   * </pre>
   *
   * <code>EN_MSG_TYPE_PICTURE_CARD = 13;</code>
   */
  EN_MSG_TYPE_PICTURE_CARD(13),
  /**
   * <pre>
   * 异形卡
   * </pre>
   *
   * <code>EN_MSG_TYPE_COMMON_SHARE_CARD = 14;</code>
   */
  EN_MSG_TYPE_COMMON_SHARE_CARD(14),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_BIZ_MSG_TYPE = 50;</code>
   */
  EN_MSG_TYPE_BIZ_MSG_TYPE(50),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_MODIFY_MSG_TYPE = 51;</code>
   */
  EN_MSG_TYPE_MODIFY_MSG_TYPE(51),
  /**
   * <pre>
   * 功能类系统消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_CHANGED = 101;</code>
   */
  EN_MSG_TYPE_GROUP_MEMBER_CHANGED(101),
  /**
   * <pre>
   * 群状态变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_STATUS_CHANGED = 102;</code>
   */
  EN_MSG_TYPE_GROUP_STATUS_CHANGED(102),
  /**
   * <pre>
   * 群动态变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DYNAMIC_CHANGED = 103;</code>
   */
  EN_MSG_TYPE_GROUP_DYNAMIC_CHANGED(103),
  /**
   * <pre>
   * 群列表变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_LIST_CHANGED = 104;</code>
   */
  EN_MSG_TYPE_GROUP_LIST_CHANGED(104),
  /**
   * <pre>
   * 好友列表变更
   * </pre>
   *
   * <code>EM_MSG_TYPE_FRIEND_LIST_CHANGED = 105;</code>
   */
  EM_MSG_TYPE_FRIEND_LIST_CHANGED(105),
  /**
   * <pre>
   * 群详情发生变化
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DETAIL_CHANGED = 106;</code>
   */
  EN_MSG_TYPE_GROUP_DETAIL_CHANGED(106),
  /**
   * <pre>
   * 群成员角色发生变化
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED = 107;</code>
   */
  EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED(107),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTICE_WATCH_LIST = 108;</code>
   */
  EN_MSG_TYPE_NOTICE_WATCH_LIST(108),
  /**
   * <pre>
   * 消息系统，收到新的reply
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED = 109;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED(109),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED = 110;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED(110),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED = 111;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED(111),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_UP_RECIEVED = 112;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_UP_RECIEVED(112),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_V2 = 113;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_V2(113),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_V2 = 114;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_V2(114),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_V2 = 115;</code>
   */
  EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_V2(115),
  /**
   * <pre>
   * 群详情发生变化,多端同步版本需要即时消息，无需落地
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DETAIL_CHANGED_MULTI = 116;</code>
   */
  EN_MSG_TYPE_GROUP_DETAIL_CHANGED_MULTI(116),
  /**
   * <pre>
   * 群成员角色发生变化,多端同步版本需要即时消息，无需落地
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_MULTI = 117;</code>
   */
  EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_MULTI(117),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_ANTI_DISTURB = 118;</code>
   */
  EN_MSG_TYPE_NOTIFY_ANTI_DISTURB(118),
  /**
   * <pre>
   * 系统通知栏消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_DISSOLVED = 201;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_DISSOLVED(201),
  /**
   * <pre>
   * 入群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_JOINED = 202;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_JOINED(202),
  /**
   * <pre>
   * 成员主动退群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_MEMBER_EXITED = 203;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_MEMBER_EXITED(203),
  /**
   * <pre>
   * 房管被撤
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_FIRED = 204;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_ADMIN_FIRED(204),
  /**
   * <pre>
   * 成员被T
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_MEMBER_KICKED = 205;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_MEMBER_KICKED(205),
  /**
   * <pre>
   * 管理T人
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_KICK_OFF = 206;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_ADMIN_KICK_OFF(206),
  /**
   * <pre>
   * 管理上任
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_DUTY = 207;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_ADMIN_DUTY(207),
  /**
   * <pre>
   * 自动创建
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_AUTO_CREATED = 208;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_AUTO_CREATED(208),
  /**
   * <pre>
   * 好友申请
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_FRIEND_APPLY = 210;</code>
   */
  EN_MSG_TYPE_SYS_FRIEND_APPLY(210),
  /**
   * <pre>
   * 好友申请通过
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_FRIEND_APPLY_ACK = 211;</code>
   */
  EN_MSG_TYPE_SYS_FRIEND_APPLY_ACK(211),
  /**
   * <pre>
   * 用户加群申请
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_APPLY_FOR_JOINING = 212;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_APPLY_FOR_JOINING(212),
  /**
   * <pre>
   * 通知管理员,有其他管理员已经同意用户加群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_ACCEPTED_USER_APPLY = 213;</code>
   */
  EN_MSG_TYPE_SYS_GROUP_ADMIN_ACCEPTED_USER_APPLY(213),
  /**
   * <pre>
   * 聊天窗口通知消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_MEMBER_JOINED = 301;</code>
   */
  EN_MSG_TYPE_CHAT_MEMBER_JOINED(301),
  /**
   * <pre>
   * 退群
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_MEMBER_EXITED = 302;</code>
   */
  EN_MSG_TYPE_CHAT_MEMBER_EXITED(302),
  /**
   * <pre>
   * 冻结
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_FREEZED = 303;</code>
   */
  EN_MSG_TYPE_CHAT_GROUP_FREEZED(303),
  /**
   * <pre>
   * 解散
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_DISSOLVED = 304;</code>
   */
  EN_MSG_TYPE_CHAT_GROUP_DISSOLVED(304),
  /**
   * <pre>
   * 开通应援团
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_CREATED = 305;</code>
   */
  EN_MSG_TYPE_CHAT_GROUP_CREATED(305),
  /**
   * <pre>
   * 弹出会话
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_POPUP_SESSION = 306;</code>
   */
  EN_MSG_TYPE_CHAT_POPUP_SESSION(306),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 基础消息类型
   * </pre>
   *
   * <code>EN_INVALID_MSG_TYPE = 0;</code>
   */
  public static final int EN_INVALID_MSG_TYPE_VALUE = 0;
  /**
   * <pre>
   * 文本消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_TEXT = 1;</code>
   */
  public static final int EN_MSG_TYPE_TEXT_VALUE = 1;
  /**
   * <pre>
   * 图片消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_PIC = 2;</code>
   */
  public static final int EN_MSG_TYPE_PIC_VALUE = 2;
  /**
   * <pre>
   * 语音消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_AUDIO = 3;</code>
   */
  public static final int EN_MSG_TYPE_AUDIO_VALUE = 3;
  /**
   * <pre>
   * 分享消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_SHARE = 4;</code>
   */
  public static final int EN_MSG_TYPE_SHARE_VALUE = 4;
  /**
   * <pre>
   * 撤回消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_DRAW_BACK = 5;</code>
   */
  public static final int EN_MSG_TYPE_DRAW_BACK_VALUE = 5;
  /**
   * <pre>
   * 自定义表情
   * </pre>
   *
   * <code>EN_MSG_TYPE_CUSTOM_FACE = 6;</code>
   */
  public static final int EN_MSG_TYPE_CUSTOM_FACE_VALUE = 6;
  /**
   * <pre>
   * 分享v2消息
   * </pre>
   *
   * <code>EN_MSG_TYPE_SHARE_V2 = 7;</code>
   */
  public static final int EN_MSG_TYPE_SHARE_V2_VALUE = 7;
  /**
   * <pre>
   * 系统撤销
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_CANCEL = 8;</code>
   */
  public static final int EN_MSG_TYPE_SYS_CANCEL_VALUE = 8;
  /**
   * <pre>
   * 小程序
   * </pre>
   *
   * <code>EN_MSG_TYPE_MINI_PROGRAM = 9;</code>
   */
  public static final int EN_MSG_TYPE_MINI_PROGRAM_VALUE = 9;
  /**
   * <pre>
   * 扩展消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_MSG = 10;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_MSG_VALUE = 10;
  /**
   * <pre>
   * 视频卡片
   * </pre>
   *
   * <code>EN_MSG_TYPE_VIDEO_CARD = 11;</code>
   */
  public static final int EN_MSG_TYPE_VIDEO_CARD_VALUE = 11;
  /**
   * <pre>
   * 专栏卡片
   * </pre>
   *
   * <code>EN_MSG_TYPE_ARTICLE_CARD = 12;</code>
   */
  public static final int EN_MSG_TYPE_ARTICLE_CARD_VALUE = 12;
  /**
   * <pre>
   * 图片卡
   * </pre>
   *
   * <code>EN_MSG_TYPE_PICTURE_CARD = 13;</code>
   */
  public static final int EN_MSG_TYPE_PICTURE_CARD_VALUE = 13;
  /**
   * <pre>
   * 异形卡
   * </pre>
   *
   * <code>EN_MSG_TYPE_COMMON_SHARE_CARD = 14;</code>
   */
  public static final int EN_MSG_TYPE_COMMON_SHARE_CARD_VALUE = 14;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_BIZ_MSG_TYPE = 50;</code>
   */
  public static final int EN_MSG_TYPE_BIZ_MSG_TYPE_VALUE = 50;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_MODIFY_MSG_TYPE = 51;</code>
   */
  public static final int EN_MSG_TYPE_MODIFY_MSG_TYPE_VALUE = 51;
  /**
   * <pre>
   * 功能类系统消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_CHANGED = 101;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_MEMBER_CHANGED_VALUE = 101;
  /**
   * <pre>
   * 群状态变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_STATUS_CHANGED = 102;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_STATUS_CHANGED_VALUE = 102;
  /**
   * <pre>
   * 群动态变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DYNAMIC_CHANGED = 103;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_DYNAMIC_CHANGED_VALUE = 103;
  /**
   * <pre>
   * 群列表变更
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_LIST_CHANGED = 104;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_LIST_CHANGED_VALUE = 104;
  /**
   * <pre>
   * 好友列表变更
   * </pre>
   *
   * <code>EM_MSG_TYPE_FRIEND_LIST_CHANGED = 105;</code>
   */
  public static final int EM_MSG_TYPE_FRIEND_LIST_CHANGED_VALUE = 105;
  /**
   * <pre>
   * 群详情发生变化
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DETAIL_CHANGED = 106;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_DETAIL_CHANGED_VALUE = 106;
  /**
   * <pre>
   * 群成员角色发生变化
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED = 107;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_VALUE = 107;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTICE_WATCH_LIST = 108;</code>
   */
  public static final int EN_MSG_TYPE_NOTICE_WATCH_LIST_VALUE = 108;
  /**
   * <pre>
   * 消息系统，收到新的reply
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED = 109;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_VALUE = 109;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED = 110;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_VALUE = 110;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED = 111;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_VALUE = 111;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_UP_RECIEVED = 112;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_UP_RECIEVED_VALUE = 112;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_V2 = 113;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_V2_VALUE = 113;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_V2 = 114;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_V2_VALUE = 114;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_V2 = 115;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_V2_VALUE = 115;
  /**
   * <pre>
   * 群详情发生变化,多端同步版本需要即时消息，无需落地
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_DETAIL_CHANGED_MULTI = 116;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_DETAIL_CHANGED_MULTI_VALUE = 116;
  /**
   * <pre>
   * 群成员角色发生变化,多端同步版本需要即时消息，无需落地
   * </pre>
   *
   * <code>EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_MULTI = 117;</code>
   */
  public static final int EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_MULTI_VALUE = 117;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_TYPE_NOTIFY_ANTI_DISTURB = 118;</code>
   */
  public static final int EN_MSG_TYPE_NOTIFY_ANTI_DISTURB_VALUE = 118;
  /**
   * <pre>
   * 系统通知栏消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_DISSOLVED = 201;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_DISSOLVED_VALUE = 201;
  /**
   * <pre>
   * 入群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_JOINED = 202;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_JOINED_VALUE = 202;
  /**
   * <pre>
   * 成员主动退群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_MEMBER_EXITED = 203;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_MEMBER_EXITED_VALUE = 203;
  /**
   * <pre>
   * 房管被撤
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_FIRED = 204;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_ADMIN_FIRED_VALUE = 204;
  /**
   * <pre>
   * 成员被T
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_MEMBER_KICKED = 205;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_MEMBER_KICKED_VALUE = 205;
  /**
   * <pre>
   * 管理T人
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_KICK_OFF = 206;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_ADMIN_KICK_OFF_VALUE = 206;
  /**
   * <pre>
   * 管理上任
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_DUTY = 207;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_ADMIN_DUTY_VALUE = 207;
  /**
   * <pre>
   * 自动创建
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_AUTO_CREATED = 208;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_AUTO_CREATED_VALUE = 208;
  /**
   * <pre>
   * 好友申请
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_FRIEND_APPLY = 210;</code>
   */
  public static final int EN_MSG_TYPE_SYS_FRIEND_APPLY_VALUE = 210;
  /**
   * <pre>
   * 好友申请通过
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_FRIEND_APPLY_ACK = 211;</code>
   */
  public static final int EN_MSG_TYPE_SYS_FRIEND_APPLY_ACK_VALUE = 211;
  /**
   * <pre>
   * 用户加群申请
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_APPLY_FOR_JOINING = 212;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_APPLY_FOR_JOINING_VALUE = 212;
  /**
   * <pre>
   * 通知管理员,有其他管理员已经同意用户加群
   * </pre>
   *
   * <code>EN_MSG_TYPE_SYS_GROUP_ADMIN_ACCEPTED_USER_APPLY = 213;</code>
   */
  public static final int EN_MSG_TYPE_SYS_GROUP_ADMIN_ACCEPTED_USER_APPLY_VALUE = 213;
  /**
   * <pre>
   * 聊天窗口通知消息类型
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_MEMBER_JOINED = 301;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_MEMBER_JOINED_VALUE = 301;
  /**
   * <pre>
   * 退群
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_MEMBER_EXITED = 302;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_MEMBER_EXITED_VALUE = 302;
  /**
   * <pre>
   * 冻结
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_FREEZED = 303;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_GROUP_FREEZED_VALUE = 303;
  /**
   * <pre>
   * 解散
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_DISSOLVED = 304;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_GROUP_DISSOLVED_VALUE = 304;
  /**
   * <pre>
   * 开通应援团
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_GROUP_CREATED = 305;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_GROUP_CREATED_VALUE = 305;
  /**
   * <pre>
   * 弹出会话
   * </pre>
   *
   * <code>EN_MSG_TYPE_CHAT_POPUP_SESSION = 306;</code>
   */
  public static final int EN_MSG_TYPE_CHAT_POPUP_SESSION_VALUE = 306;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MsgType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MsgType forNumber(int value) {
    switch (value) {
      case 0: return EN_INVALID_MSG_TYPE;
      case 1: return EN_MSG_TYPE_TEXT;
      case 2: return EN_MSG_TYPE_PIC;
      case 3: return EN_MSG_TYPE_AUDIO;
      case 4: return EN_MSG_TYPE_SHARE;
      case 5: return EN_MSG_TYPE_DRAW_BACK;
      case 6: return EN_MSG_TYPE_CUSTOM_FACE;
      case 7: return EN_MSG_TYPE_SHARE_V2;
      case 8: return EN_MSG_TYPE_SYS_CANCEL;
      case 9: return EN_MSG_TYPE_MINI_PROGRAM;
      case 10: return EN_MSG_TYPE_NOTIFY_MSG;
      case 11: return EN_MSG_TYPE_VIDEO_CARD;
      case 12: return EN_MSG_TYPE_ARTICLE_CARD;
      case 13: return EN_MSG_TYPE_PICTURE_CARD;
      case 14: return EN_MSG_TYPE_COMMON_SHARE_CARD;
      case 50: return EN_MSG_TYPE_BIZ_MSG_TYPE;
      case 51: return EN_MSG_TYPE_MODIFY_MSG_TYPE;
      case 101: return EN_MSG_TYPE_GROUP_MEMBER_CHANGED;
      case 102: return EN_MSG_TYPE_GROUP_STATUS_CHANGED;
      case 103: return EN_MSG_TYPE_GROUP_DYNAMIC_CHANGED;
      case 104: return EN_MSG_TYPE_GROUP_LIST_CHANGED;
      case 105: return EM_MSG_TYPE_FRIEND_LIST_CHANGED;
      case 106: return EN_MSG_TYPE_GROUP_DETAIL_CHANGED;
      case 107: return EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED;
      case 108: return EN_MSG_TYPE_NOTICE_WATCH_LIST;
      case 109: return EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED;
      case 110: return EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED;
      case 111: return EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED;
      case 112: return EN_MSG_TYPE_NOTIFY_NEW_UP_RECIEVED;
      case 113: return EN_MSG_TYPE_NOTIFY_NEW_REPLY_RECIEVED_V2;
      case 114: return EN_MSG_TYPE_NOTIFY_NEW_AT_RECIEVED_V2;
      case 115: return EN_MSG_TYPE_NOTIFY_NEW_PRAISE_RECIEVED_V2;
      case 116: return EN_MSG_TYPE_GROUP_DETAIL_CHANGED_MULTI;
      case 117: return EN_MSG_TYPE_GROUP_MEMBER_ROLE_CHANGED_MULTI;
      case 118: return EN_MSG_TYPE_NOTIFY_ANTI_DISTURB;
      case 201: return EN_MSG_TYPE_SYS_GROUP_DISSOLVED;
      case 202: return EN_MSG_TYPE_SYS_GROUP_JOINED;
      case 203: return EN_MSG_TYPE_SYS_GROUP_MEMBER_EXITED;
      case 204: return EN_MSG_TYPE_SYS_GROUP_ADMIN_FIRED;
      case 205: return EN_MSG_TYPE_SYS_GROUP_MEMBER_KICKED;
      case 206: return EN_MSG_TYPE_SYS_GROUP_ADMIN_KICK_OFF;
      case 207: return EN_MSG_TYPE_SYS_GROUP_ADMIN_DUTY;
      case 208: return EN_MSG_TYPE_SYS_GROUP_AUTO_CREATED;
      case 210: return EN_MSG_TYPE_SYS_FRIEND_APPLY;
      case 211: return EN_MSG_TYPE_SYS_FRIEND_APPLY_ACK;
      case 212: return EN_MSG_TYPE_SYS_GROUP_APPLY_FOR_JOINING;
      case 213: return EN_MSG_TYPE_SYS_GROUP_ADMIN_ACCEPTED_USER_APPLY;
      case 301: return EN_MSG_TYPE_CHAT_MEMBER_JOINED;
      case 302: return EN_MSG_TYPE_CHAT_MEMBER_EXITED;
      case 303: return EN_MSG_TYPE_CHAT_GROUP_FREEZED;
      case 304: return EN_MSG_TYPE_CHAT_GROUP_DISSOLVED;
      case 305: return EN_MSG_TYPE_CHAT_GROUP_CREATED;
      case 306: return EN_MSG_TYPE_CHAT_POPUP_SESSION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MsgType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
          public MsgType findValueByNumber(int number) {
            return MsgType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return bilibili.im.type.Im.getDescriptor().getEnumTypes().get(3);
  }

  private static final MsgType[] VALUES = values();

  public static MsgType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MsgType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.im.type.MsgType)
}

