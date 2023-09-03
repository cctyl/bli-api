// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.dynamic.gateway.DynUriType}
 */
public enum DynUriType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>dyn_uri_type_none = 0;</code>
   */
  dyn_uri_type_none(0),
  /**
   * <pre>
   * 直接跳转对应uri
   * </pre>
   *
   * <code>dyn_uri_type_direct = 1;</code>
   */
  dyn_uri_type_direct(1),
  /**
   * <pre>
   * 作为后缀拼接
   * </pre>
   *
   * <code>dyn_uri_type_suffix = 2;</code>
   */
  dyn_uri_type_suffix(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>dyn_uri_type_none = 0;</code>
   */
  public static final int dyn_uri_type_none_VALUE = 0;
  /**
   * <pre>
   * 直接跳转对应uri
   * </pre>
   *
   * <code>dyn_uri_type_direct = 1;</code>
   */
  public static final int dyn_uri_type_direct_VALUE = 1;
  /**
   * <pre>
   * 作为后缀拼接
   * </pre>
   *
   * <code>dyn_uri_type_suffix = 2;</code>
   */
  public static final int dyn_uri_type_suffix_VALUE = 2;


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
  public static DynUriType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DynUriType forNumber(int value) {
    switch (value) {
      case 0: return dyn_uri_type_none;
      case 1: return dyn_uri_type_direct;
      case 2: return dyn_uri_type_suffix;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DynUriType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DynUriType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DynUriType>() {
          public DynUriType findValueByNumber(int number) {
            return DynUriType.forNumber(number);
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
    return bilibili.dynamic.gateway.Gateway.getDescriptor().getEnumTypes().get(11);
  }

  private static final DynUriType[] VALUES = values();

  public static DynUriType valueOf(
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

  private DynUriType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.dynamic.gateway.DynUriType)
}

