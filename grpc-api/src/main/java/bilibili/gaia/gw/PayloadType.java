// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/gaia/gw/gw_api.proto

package bilibili.gaia.gw;

/**
 * <pre>
 * 负载类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.gaia.gw.PayloadType}
 */
public enum PayloadType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *非法值
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 0;</code>
   */
  INVALID_PAYLOAD(0),
  /**
   * <pre>
   *设备app列表，对应DeviceAppList
   * </pre>
   *
   * <code>DEVICE_APP_LIST = 1;</code>
   */
  DEVICE_APP_LIST(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *非法值
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 0;</code>
   */
  public static final int INVALID_PAYLOAD_VALUE = 0;
  /**
   * <pre>
   *设备app列表，对应DeviceAppList
   * </pre>
   *
   * <code>DEVICE_APP_LIST = 1;</code>
   */
  public static final int DEVICE_APP_LIST_VALUE = 1;


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
  public static PayloadType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PayloadType forNumber(int value) {
    switch (value) {
      case 0: return INVALID_PAYLOAD;
      case 1: return DEVICE_APP_LIST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PayloadType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PayloadType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PayloadType>() {
          public PayloadType findValueByNumber(int number) {
            return PayloadType.forNumber(number);
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
    return bilibili.gaia.gw.GwApi.getDescriptor().getEnumTypes().get(1);
  }

  private static final PayloadType[] VALUES = values();

  public static PayloadType valueOf(
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

  private PayloadType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.gaia.gw.PayloadType)
}

