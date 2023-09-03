// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

/**
 * <pre>
 * 通知信息类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.broadcast.message.ogv.MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 默认
   * </pre>
   *
   * <code>DefaultType = 0;</code>
   */
  DefaultType(0),
  /**
   * <pre>
   * 房间用户
   * </pre>
   *
   * <code>ChatMessage = 1;</code>
   */
  ChatMessage(1),
  /**
   * <pre>
   * 系统通知
   * </pre>
   *
   * <code>SystemMessage = 2;</code>
   */
  SystemMessage(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 默认
   * </pre>
   *
   * <code>DefaultType = 0;</code>
   */
  public static final int DefaultType_VALUE = 0;
  /**
   * <pre>
   * 房间用户
   * </pre>
   *
   * <code>ChatMessage = 1;</code>
   */
  public static final int ChatMessage_VALUE = 1;
  /**
   * <pre>
   * 系统通知
   * </pre>
   *
   * <code>SystemMessage = 2;</code>
   */
  public static final int SystemMessage_VALUE = 2;


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
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return DefaultType;
      case 1: return ChatMessage;
      case 2: return SystemMessage;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
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
    return bilibili.broadcast.message.ogv.Freya.getDescriptor().getEnumTypes().get(3);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
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

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.broadcast.message.ogv.MessageType)
}

