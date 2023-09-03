// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.WFItemType}
 */
public enum WFItemType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WATER_FLOW_TYPE_NONE = 0;</code>
   */
  WATER_FLOW_TYPE_NONE(0),
  /**
   * <code>WATER_FLOW_TYPE_ARCHIVE = 1;</code>
   */
  WATER_FLOW_TYPE_ARCHIVE(1),
  /**
   * <code>WATER_FLOW_TYPE_DYNAMIC = 2;</code>
   */
  WATER_FLOW_TYPE_DYNAMIC(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WATER_FLOW_TYPE_NONE = 0;</code>
   */
  public static final int WATER_FLOW_TYPE_NONE_VALUE = 0;
  /**
   * <code>WATER_FLOW_TYPE_ARCHIVE = 1;</code>
   */
  public static final int WATER_FLOW_TYPE_ARCHIVE_VALUE = 1;
  /**
   * <code>WATER_FLOW_TYPE_DYNAMIC = 2;</code>
   */
  public static final int WATER_FLOW_TYPE_DYNAMIC_VALUE = 2;


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
  public static WFItemType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WFItemType forNumber(int value) {
    switch (value) {
      case 0: return WATER_FLOW_TYPE_NONE;
      case 1: return WATER_FLOW_TYPE_ARCHIVE;
      case 2: return WATER_FLOW_TYPE_DYNAMIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WFItemType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WFItemType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WFItemType>() {
          public WFItemType findValueByNumber(int number) {
            return WFItemType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(67);
  }

  private static final WFItemType[] VALUES = values();

  public static WFItemType valueOf(
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

  private WFItemType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.WFItemType)
}

