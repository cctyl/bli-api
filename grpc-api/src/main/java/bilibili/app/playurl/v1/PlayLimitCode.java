// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.playurl.v1.PlayLimitCode}
 */
public enum PlayLimitCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>PLCUnkown = 0;</code>
   */
  PLCUnkown(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>PLCUgcNotPayed = 1;</code>
   */
  PLCUgcNotPayed(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>PLCUnkown = 0;</code>
   */
  public static final int PLCUnkown_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>PLCUgcNotPayed = 1;</code>
   */
  public static final int PLCUgcNotPayed_VALUE = 1;


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
  public static PlayLimitCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayLimitCode forNumber(int value) {
    switch (value) {
      case 0: return PLCUnkown;
      case 1: return PLCUgcNotPayed;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayLimitCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayLimitCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayLimitCode>() {
          public PlayLimitCode findValueByNumber(int number) {
            return PlayLimitCode.forNumber(number);
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
    return bilibili.app.playurl.v1.Playurl.getDescriptor().getEnumTypes().get(5);
  }

  private static final PlayLimitCode[] VALUES = values();

  public static PlayLimitCode valueOf(
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

  private PlayLimitCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.playurl.v1.PlayLimitCode)
}

