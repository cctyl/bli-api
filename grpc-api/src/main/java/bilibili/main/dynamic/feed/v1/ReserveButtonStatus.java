// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/interfaces/feed/v1/api.proto

package bilibili.main.dynamic.feed.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.main.dynamic.feed.v1.ReserveButtonStatus}
 */
public enum ReserveButtonStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_NONE = 0;</code>
   */
  RESERVE_BUTTON_STATUS_NONE(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_UNCHECK = 1;</code>
   */
  RESERVE_BUTTON_STATUS_UNCHECK(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_CHECK = 2;</code>
   */
  RESERVE_BUTTON_STATUS_CHECK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_NONE = 0;</code>
   */
  public static final int RESERVE_BUTTON_STATUS_NONE_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_UNCHECK = 1;</code>
   */
  public static final int RESERVE_BUTTON_STATUS_UNCHECK_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>RESERVE_BUTTON_STATUS_CHECK = 2;</code>
   */
  public static final int RESERVE_BUTTON_STATUS_CHECK_VALUE = 2;


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
  public static ReserveButtonStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReserveButtonStatus forNumber(int value) {
    switch (value) {
      case 0: return RESERVE_BUTTON_STATUS_NONE;
      case 1: return RESERVE_BUTTON_STATUS_UNCHECK;
      case 2: return RESERVE_BUTTON_STATUS_CHECK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReserveButtonStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReserveButtonStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReserveButtonStatus>() {
          public ReserveButtonStatus findValueByNumber(int number) {
            return ReserveButtonStatus.forNumber(number);
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
    return bilibili.main.dynamic.feed.v1.Api.getDescriptor().getEnumTypes().get(2);
  }

  private static final ReserveButtonStatus[] VALUES = values();

  public static ReserveButtonStatus valueOf(
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

  private ReserveButtonStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.main.dynamic.feed.v1.ReserveButtonStatus)
}
