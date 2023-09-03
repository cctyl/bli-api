// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/metadata/network/network.proto

package bilibili.metadata.network;

/**
 * <pre>
 * 网络类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.metadata.network.NetworkType}
 */
public enum NetworkType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>NT_UNKNOWN = 0;</code>
   */
  NT_UNKNOWN(0),
  /**
   * <pre>
   * WIFI
   * </pre>
   *
   * <code>WIFI = 1;</code>
   */
  WIFI(1),
  /**
   * <pre>
   * 蜂窝网络
   * </pre>
   *
   * <code>CELLULAR = 2;</code>
   */
  CELLULAR(2),
  /**
   * <pre>
   * 未连接
   * </pre>
   *
   * <code>OFFLINE = 3;</code>
   */
  OFFLINE(3),
  /**
   * <pre>
   * 其他网络
   * </pre>
   *
   * <code>OTHERNET = 4;</code>
   */
  OTHERNET(4),
  /**
   * <pre>
   * 以太网
   * </pre>
   *
   * <code>ETHERNET = 5;</code>
   */
  ETHERNET(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>NT_UNKNOWN = 0;</code>
   */
  public static final int NT_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * WIFI
   * </pre>
   *
   * <code>WIFI = 1;</code>
   */
  public static final int WIFI_VALUE = 1;
  /**
   * <pre>
   * 蜂窝网络
   * </pre>
   *
   * <code>CELLULAR = 2;</code>
   */
  public static final int CELLULAR_VALUE = 2;
  /**
   * <pre>
   * 未连接
   * </pre>
   *
   * <code>OFFLINE = 3;</code>
   */
  public static final int OFFLINE_VALUE = 3;
  /**
   * <pre>
   * 其他网络
   * </pre>
   *
   * <code>OTHERNET = 4;</code>
   */
  public static final int OTHERNET_VALUE = 4;
  /**
   * <pre>
   * 以太网
   * </pre>
   *
   * <code>ETHERNET = 5;</code>
   */
  public static final int ETHERNET_VALUE = 5;


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
  public static NetworkType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NetworkType forNumber(int value) {
    switch (value) {
      case 0: return NT_UNKNOWN;
      case 1: return WIFI;
      case 2: return CELLULAR;
      case 3: return OFFLINE;
      case 4: return OTHERNET;
      case 5: return ETHERNET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NetworkType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NetworkType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NetworkType>() {
          public NetworkType findValueByNumber(int number) {
            return NetworkType.forNumber(number);
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
    return bilibili.metadata.network.NetworkOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final NetworkType[] VALUES = values();

  public static NetworkType valueOf(
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

  private NetworkType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.metadata.network.NetworkType)
}

