// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/interfaces/v1/history.proto

package bilibili.app.interface.v1;

/**
 * <pre>
 * 设备标识代码
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.interface.v1.DT}
 */
public enum DT
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <pre>
   * 手机端
   * </pre>
   *
   * <code>Phone = 1;</code>
   */
  Phone(1),
  /**
   * <pre>
   * ipad端
   * </pre>
   *
   * <code>Pad = 2;</code>
   */
  Pad(2),
  /**
   * <pre>
   * web端
   * </pre>
   *
   * <code>PC = 3;</code>
   */
  PC(3),
  /**
   * <pre>
   * TV端
   * </pre>
   *
   * <code>TV = 4;</code>
   */
  TV(4),
  /**
   * <pre>
   * 车机端
   * </pre>
   *
   * <code>Car = 5;</code>
   */
  Car(5),
  /**
   * <pre>
   * 物联设备
   * </pre>
   *
   * <code>Iot = 6;</code>
   */
  Iot(6),
  /**
   * <pre>
   * apad端
   * </pre>
   *
   * <code>AndPad = 7;</code>
   */
  AndPad(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <pre>
   * 手机端
   * </pre>
   *
   * <code>Phone = 1;</code>
   */
  public static final int Phone_VALUE = 1;
  /**
   * <pre>
   * ipad端
   * </pre>
   *
   * <code>Pad = 2;</code>
   */
  public static final int Pad_VALUE = 2;
  /**
   * <pre>
   * web端
   * </pre>
   *
   * <code>PC = 3;</code>
   */
  public static final int PC_VALUE = 3;
  /**
   * <pre>
   * TV端
   * </pre>
   *
   * <code>TV = 4;</code>
   */
  public static final int TV_VALUE = 4;
  /**
   * <pre>
   * 车机端
   * </pre>
   *
   * <code>Car = 5;</code>
   */
  public static final int Car_VALUE = 5;
  /**
   * <pre>
   * 物联设备
   * </pre>
   *
   * <code>Iot = 6;</code>
   */
  public static final int Iot_VALUE = 6;
  /**
   * <pre>
   * apad端
   * </pre>
   *
   * <code>AndPad = 7;</code>
   */
  public static final int AndPad_VALUE = 7;


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
  public static DT valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DT forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Phone;
      case 2: return Pad;
      case 3: return PC;
      case 4: return TV;
      case 5: return Car;
      case 6: return Iot;
      case 7: return AndPad;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DT>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DT> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DT>() {
          public DT findValueByNumber(int number) {
            return DT.forNumber(number);
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
    return bilibili.app.interface.v1.HistoryOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DT[] VALUES = values();

  public static DT valueOf(
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

  private DT(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.interface.v1.DT)
}
