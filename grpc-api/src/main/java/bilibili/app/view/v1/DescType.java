// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 枚举-文本类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.view.v1.DescType}
 */
public enum DescType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 占位
   * </pre>
   *
   * <code>DescTypeUnknown = 0;</code>
   */
  DescTypeUnknown(0),
  /**
   * <pre>
   * 文本
   * </pre>
   *
   * <code>DescTypeText = 1;</code>
   */
  DescTypeText(1),
  /**
   * <pre>
   * &#64;
   * </pre>
   *
   * <code>DescTypeAt = 2;</code>
   */
  DescTypeAt(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 占位
   * </pre>
   *
   * <code>DescTypeUnknown = 0;</code>
   */
  public static final int DescTypeUnknown_VALUE = 0;
  /**
   * <pre>
   * 文本
   * </pre>
   *
   * <code>DescTypeText = 1;</code>
   */
  public static final int DescTypeText_VALUE = 1;
  /**
   * <pre>
   * &#64;
   * </pre>
   *
   * <code>DescTypeAt = 2;</code>
   */
  public static final int DescTypeAt_VALUE = 2;


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
  public static DescType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DescType forNumber(int value) {
    switch (value) {
      case 0: return DescTypeUnknown;
      case 1: return DescTypeText;
      case 2: return DescTypeAt;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DescType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DescType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DescType>() {
          public DescType findValueByNumber(int number) {
            return DescType.forNumber(number);
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
    return bilibili.app.view.v1.ViewOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final DescType[] VALUES = values();

  public static DescType valueOf(
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

  private DescType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.view.v1.DescType)
}

