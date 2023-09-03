// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.im.type.CmdId}
 */
public enum CmdId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *非法cmd
   * </pre>
   *
   * <code>EN_CMD_ID_INVALID = 0;</code>
   */
  EN_CMD_ID_INVALID(0),
  /**
   * <pre>
   * msg_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SEND_MSG = 200001;</code>
   */
  EN_CMD_ID_SEND_MSG(200001),
  /**
   * <pre>
   * sync_msg_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_MSG = 500001;</code>
   */
  EN_CMD_ID_SYNC_MSG(500001),
  /**
   * <pre>
   * 同步相关链
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_RELATION = 500002;</code>
   */
  EN_CMD_ID_SYNC_RELATION(500002),
  /**
   * <pre>
   * 客户端同步消息完成后，向服务器确认同步进度
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_ACK = 500003;</code>
   */
  EN_CMD_ID_SYNC_ACK(500003),
  /**
   * <pre>
   * 多端同步版本拉取消息
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_FETCH_SESSION_MSGS = 500006;</code>
   */
  EN_CMD_ID_SYNC_FETCH_SESSION_MSGS(500006),
  /**
   * <pre>
   * session_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_GET_SESSIONS = 1000001;</code>
   */
  EN_CMD_ID_SESSION_SVR_GET_SESSIONS(1000001),
  /**
   * <pre>
   * 新消息到达时获取会话列表
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_NEW_SESSIONS = 1000002;</code>
   */
  EN_CMD_ID_SESSION_SVR_NEW_SESSIONS(1000002),
  /**
   * <pre>
   * 获取已读位置有更新的会话列表
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_ACK_SESSIONS = 1000003;</code>
   */
  EN_CMD_ID_SESSION_SVR_ACK_SESSIONS(1000003),
  /**
   * <pre>
   * 更新已读进度
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_UPDATE_ACK = 1000004;</code>
   */
  EN_CMD_ID_SESSION_SVR_UPDATE_ACK(1000004),
  /**
   * <pre>
   * 置顶/取消置顶
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SET_TOP = 1000005;</code>
   */
  EN_CMD_ID_SESSION_SVR_SET_TOP(1000005),
  /**
   * <pre>
   * 删除会话
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_REMOVE_SESSION = 1000007;</code>
   */
  EN_CMD_ID_SESSION_SVR_REMOVE_SESSION(1000007),
  /**
   * <pre>
   * 单聊未读信息数
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SINGLE_UNREAD = 1000008;</code>
   */
  EN_CMD_ID_SESSION_SVR_SINGLE_UNREAD(1000008),
  /**
   * <pre>
   * 我创建的应援团未读数
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_MY_GROUP_UNREAD = 1000009;</code>
   */
  EN_CMD_ID_SESSION_SVR_MY_GROUP_UNREAD(1000009),
  /**
   * <pre>
   * 未关注的人批量设置为已读
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_UPDATE_UNFLW_READ = 1000010;</code>
   */
  EN_CMD_ID_SESSION_SVR_UPDATE_UNFLW_READ(1000010),
  /**
   * <pre>
   * 应援团消息助手
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_GROUP_ASSIS_MSG = 1000011;</code>
   */
  EN_CMD_ID_SESSION_SVR_GROUP_ASSIS_MSG(1000011),
  /**
   * <pre>
   * 更新应援团小助手消息已拉取进度
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_ACK_ASSIS_MSG = 1000012;</code>
   */
  EN_CMD_ID_SESSION_SVR_ACK_ASSIS_MSG(1000012),
  /**
   * <pre>
   * 拉会话详情
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SESSION_DETAIL = 1000015;</code>
   */
  EN_CMD_ID_SESSION_SVR_SESSION_DETAIL(1000015),
  /**
   * <pre>
   * 批量拉会话详情
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_BATCH_SESS_DETAIL = 1000016;</code>
   */
  EN_CMD_ID_SESSION_SVR_BATCH_SESS_DETAIL(1000016),
  /**
   * <pre>
   * 批量删除会话
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_BATCH_RM_SESSIONS = 1000017;</code>
   */
  EN_CMD_ID_SESSION_SVR_BATCH_RM_SESSIONS(1000017),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *非法cmd
   * </pre>
   *
   * <code>EN_CMD_ID_INVALID = 0;</code>
   */
  public static final int EN_CMD_ID_INVALID_VALUE = 0;
  /**
   * <pre>
   * msg_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SEND_MSG = 200001;</code>
   */
  public static final int EN_CMD_ID_SEND_MSG_VALUE = 200001;
  /**
   * <pre>
   * sync_msg_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_MSG = 500001;</code>
   */
  public static final int EN_CMD_ID_SYNC_MSG_VALUE = 500001;
  /**
   * <pre>
   * 同步相关链
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_RELATION = 500002;</code>
   */
  public static final int EN_CMD_ID_SYNC_RELATION_VALUE = 500002;
  /**
   * <pre>
   * 客户端同步消息完成后，向服务器确认同步进度
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_ACK = 500003;</code>
   */
  public static final int EN_CMD_ID_SYNC_ACK_VALUE = 500003;
  /**
   * <pre>
   * 多端同步版本拉取消息
   * </pre>
   *
   * <code>EN_CMD_ID_SYNC_FETCH_SESSION_MSGS = 500006;</code>
   */
  public static final int EN_CMD_ID_SYNC_FETCH_SESSION_MSGS_VALUE = 500006;
  /**
   * <pre>
   * session_svr
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_GET_SESSIONS = 1000001;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_GET_SESSIONS_VALUE = 1000001;
  /**
   * <pre>
   * 新消息到达时获取会话列表
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_NEW_SESSIONS = 1000002;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_NEW_SESSIONS_VALUE = 1000002;
  /**
   * <pre>
   * 获取已读位置有更新的会话列表
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_ACK_SESSIONS = 1000003;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_ACK_SESSIONS_VALUE = 1000003;
  /**
   * <pre>
   * 更新已读进度
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_UPDATE_ACK = 1000004;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_UPDATE_ACK_VALUE = 1000004;
  /**
   * <pre>
   * 置顶/取消置顶
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SET_TOP = 1000005;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_SET_TOP_VALUE = 1000005;
  /**
   * <pre>
   * 删除会话
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_REMOVE_SESSION = 1000007;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_REMOVE_SESSION_VALUE = 1000007;
  /**
   * <pre>
   * 单聊未读信息数
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SINGLE_UNREAD = 1000008;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_SINGLE_UNREAD_VALUE = 1000008;
  /**
   * <pre>
   * 我创建的应援团未读数
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_MY_GROUP_UNREAD = 1000009;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_MY_GROUP_UNREAD_VALUE = 1000009;
  /**
   * <pre>
   * 未关注的人批量设置为已读
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_UPDATE_UNFLW_READ = 1000010;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_UPDATE_UNFLW_READ_VALUE = 1000010;
  /**
   * <pre>
   * 应援团消息助手
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_GROUP_ASSIS_MSG = 1000011;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_GROUP_ASSIS_MSG_VALUE = 1000011;
  /**
   * <pre>
   * 更新应援团小助手消息已拉取进度
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_ACK_ASSIS_MSG = 1000012;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_ACK_ASSIS_MSG_VALUE = 1000012;
  /**
   * <pre>
   * 拉会话详情
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_SESSION_DETAIL = 1000015;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_SESSION_DETAIL_VALUE = 1000015;
  /**
   * <pre>
   * 批量拉会话详情
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_BATCH_SESS_DETAIL = 1000016;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_BATCH_SESS_DETAIL_VALUE = 1000016;
  /**
   * <pre>
   * 批量删除会话
   * </pre>
   *
   * <code>EN_CMD_ID_SESSION_SVR_BATCH_RM_SESSIONS = 1000017;</code>
   */
  public static final int EN_CMD_ID_SESSION_SVR_BATCH_RM_SESSIONS_VALUE = 1000017;


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
  public static CmdId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CmdId forNumber(int value) {
    switch (value) {
      case 0: return EN_CMD_ID_INVALID;
      case 200001: return EN_CMD_ID_SEND_MSG;
      case 500001: return EN_CMD_ID_SYNC_MSG;
      case 500002: return EN_CMD_ID_SYNC_RELATION;
      case 500003: return EN_CMD_ID_SYNC_ACK;
      case 500006: return EN_CMD_ID_SYNC_FETCH_SESSION_MSGS;
      case 1000001: return EN_CMD_ID_SESSION_SVR_GET_SESSIONS;
      case 1000002: return EN_CMD_ID_SESSION_SVR_NEW_SESSIONS;
      case 1000003: return EN_CMD_ID_SESSION_SVR_ACK_SESSIONS;
      case 1000004: return EN_CMD_ID_SESSION_SVR_UPDATE_ACK;
      case 1000005: return EN_CMD_ID_SESSION_SVR_SET_TOP;
      case 1000007: return EN_CMD_ID_SESSION_SVR_REMOVE_SESSION;
      case 1000008: return EN_CMD_ID_SESSION_SVR_SINGLE_UNREAD;
      case 1000009: return EN_CMD_ID_SESSION_SVR_MY_GROUP_UNREAD;
      case 1000010: return EN_CMD_ID_SESSION_SVR_UPDATE_UNFLW_READ;
      case 1000011: return EN_CMD_ID_SESSION_SVR_GROUP_ASSIS_MSG;
      case 1000012: return EN_CMD_ID_SESSION_SVR_ACK_ASSIS_MSG;
      case 1000015: return EN_CMD_ID_SESSION_SVR_SESSION_DETAIL;
      case 1000016: return EN_CMD_ID_SESSION_SVR_BATCH_SESS_DETAIL;
      case 1000017: return EN_CMD_ID_SESSION_SVR_BATCH_RM_SESSIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CmdId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CmdId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CmdId>() {
          public CmdId findValueByNumber(int number) {
            return CmdId.forNumber(number);
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
    return bilibili.im.type.Im.getDescriptor().getEnumTypes().get(0);
  }

  private static final CmdId[] VALUES = values();

  public static CmdId valueOf(
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

  private CmdId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.im.type.CmdId)
}
