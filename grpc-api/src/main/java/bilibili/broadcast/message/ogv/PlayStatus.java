// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/broadcast/message/ogv/freya.proto

package bilibili.broadcast.message.ogv;

/**
 * <pre>
 * 播放状态
 * </pre>
 *
 * Protobuf enum {@code bilibili.broadcast.message.ogv.PlayStatus}
 */
public enum PlayStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 暂停
   * </pre>
   *
   * <code>Pause = 0;</code>
   */
  Pause(0),
  /**
   * <pre>
   * 播放
   * </pre>
   *
   * <code>Play = 1;</code>
   */
  Play(1),
  /**
   * <pre>
   * 终止
   * </pre>
   *
   * <code>End = 2;</code>
   */
  End(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 暂停
   * </pre>
   *
   * <code>Pause = 0;</code>
   */
  public static final int Pause_VALUE = 0;
  /**
   * <pre>
   * 播放
   * </pre>
   *
   * <code>Play = 1;</code>
   */
  public static final int Play_VALUE = 1;
  /**
   * <pre>
   * 终止
   * </pre>
   *
   * <code>End = 2;</code>
   */
  public static final int End_VALUE = 2;


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
  public static PlayStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayStatus forNumber(int value) {
    switch (value) {
      case 0: return Pause;
      case 1: return Play;
      case 2: return End;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayStatus>() {
          public PlayStatus findValueByNumber(int number) {
            return PlayStatus.forNumber(number);
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
    return bilibili.broadcast.message.ogv.Freya.getDescriptor().getEnumTypes().get(0);
  }

  private static final PlayStatus[] VALUES = values();

  public static PlayStatus valueOf(
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

  private PlayStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.broadcast.message.ogv.PlayStatus)
}
