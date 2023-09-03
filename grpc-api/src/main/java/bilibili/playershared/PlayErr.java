// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 错误码
 * </pre>
 *
 * Protobuf enum {@code bilibili.playershared.PlayErr}
 */
public enum PlayErr
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>NoErr = 0;</code>
   */
  NoErr(0),
  /**
   * <pre>
   * 管控类型的错误码
   * </pre>
   *
   * <code>WithMultiDeviceLoginErr = 1;</code>
   */
  WithMultiDeviceLoginErr(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>NoErr = 0;</code>
   */
  public static final int NoErr_VALUE = 0;
  /**
   * <pre>
   * 管控类型的错误码
   * </pre>
   *
   * <code>WithMultiDeviceLoginErr = 1;</code>
   */
  public static final int WithMultiDeviceLoginErr_VALUE = 1;


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
  public static PlayErr valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayErr forNumber(int value) {
    switch (value) {
      case 0: return NoErr;
      case 1: return WithMultiDeviceLoginErr;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayErr>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayErr> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayErr>() {
          public PlayErr findValueByNumber(int number) {
            return PlayErr.forNumber(number);
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
    return bilibili.playershared.Playershared.getDescriptor().getEnumTypes().get(4);
  }

  private static final PlayErr[] VALUES = values();

  public static PlayErr valueOf(
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

  private PlayErr(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.playershared.PlayErr)
}
