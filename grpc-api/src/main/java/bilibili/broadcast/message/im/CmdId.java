// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/im/notify.proto

package bilibili.broadcast.message.im;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.broadcast.message.im.CmdId}
 */
public enum CmdId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 非法cmd
   * </pre>
   *
   * <code>EN_CMD_ID_INVALID = 0;</code>
   */
  EN_CMD_ID_INVALID(0),
  /**
   * <pre>
   * 服务端主动发起
   * </pre>
   *
   * <code>EN_CMD_ID_MSG_NOTIFY = 1;</code>
   */
  EN_CMD_ID_MSG_NOTIFY(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_CMD_ID_KICK_OUT = 2;</code>
   */
  EN_CMD_ID_KICK_OUT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 非法cmd
   * </pre>
   *
   * <code>EN_CMD_ID_INVALID = 0;</code>
   */
  public static final int EN_CMD_ID_INVALID_VALUE = 0;
  /**
   * <pre>
   * 服务端主动发起
   * </pre>
   *
   * <code>EN_CMD_ID_MSG_NOTIFY = 1;</code>
   */
  public static final int EN_CMD_ID_MSG_NOTIFY_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_CMD_ID_KICK_OUT = 2;</code>
   */
  public static final int EN_CMD_ID_KICK_OUT_VALUE = 2;


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
      case 1: return EN_CMD_ID_MSG_NOTIFY;
      case 2: return EN_CMD_ID_KICK_OUT;
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
    return bilibili.broadcast.message.im.NotifyOuterClass.getDescriptor().getEnumTypes().get(1);
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

  // @@protoc_insertion_point(enum_scope:bilibili.broadcast.message.im.CmdId)
}

