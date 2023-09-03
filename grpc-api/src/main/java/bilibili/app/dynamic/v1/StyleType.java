// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package bilibili.app.dynamic.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v1.StyleType}
 */
public enum StyleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_NONE = 0;</code>
   */
  STYLE_TYPE_NONE(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_LIVE = 1;</code>
   */
  STYLE_TYPE_LIVE(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_DYN_UP = 2;</code>
   */
  STYLE_TYPE_DYN_UP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_NONE = 0;</code>
   */
  public static final int STYLE_TYPE_NONE_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_LIVE = 1;</code>
   */
  public static final int STYLE_TYPE_LIVE_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>STYLE_TYPE_DYN_UP = 2;</code>
   */
  public static final int STYLE_TYPE_DYN_UP_VALUE = 2;


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
  public static StyleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StyleType forNumber(int value) {
    switch (value) {
      case 0: return STYLE_TYPE_NONE;
      case 1: return STYLE_TYPE_LIVE;
      case 2: return STYLE_TYPE_DYN_UP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StyleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StyleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StyleType>() {
          public StyleType findValueByNumber(int number) {
            return StyleType.forNumber(number);
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
    return bilibili.app.dynamic.v1.DynamicOuterClass.getDescriptor().getEnumTypes().get(5);
  }

  private static final StyleType[] VALUES = values();

  public static StyleType valueOf(
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

  private StyleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v1.StyleType)
}

