// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/dynamic/gw/gateway.proto

package bilibili.dynamic.gateway;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.dynamic.gateway.AddButtonBgStyle}
 */
public enum AddButtonBgStyle
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 默认填充
   * </pre>
   *
   * <code>fill = 0;</code>
   */
  fill(0),
  /**
   * <pre>
   * 描边
   * </pre>
   *
   * <code>stroke = 1;</code>
   */
  stroke(1),
  /**
   * <pre>
   * 置灰
   * </pre>
   *
   * <code>gray = 2;</code>
   */
  gray(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 默认填充
   * </pre>
   *
   * <code>fill = 0;</code>
   */
  public static final int fill_VALUE = 0;
  /**
   * <pre>
   * 描边
   * </pre>
   *
   * <code>stroke = 1;</code>
   */
  public static final int stroke_VALUE = 1;
  /**
   * <pre>
   * 置灰
   * </pre>
   *
   * <code>gray = 2;</code>
   */
  public static final int gray_VALUE = 2;


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
  public static AddButtonBgStyle valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AddButtonBgStyle forNumber(int value) {
    switch (value) {
      case 0: return fill;
      case 1: return stroke;
      case 2: return gray;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AddButtonBgStyle>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AddButtonBgStyle> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AddButtonBgStyle>() {
          public AddButtonBgStyle findValueByNumber(int number) {
            return AddButtonBgStyle.forNumber(number);
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
    return bilibili.dynamic.gateway.Gateway.getDescriptor().getEnumTypes().get(0);
  }

  private static final AddButtonBgStyle[] VALUES = values();

  public static AddButtonBgStyle valueOf(
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

  private AddButtonBgStyle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.dynamic.gateway.AddButtonBgStyle)
}
