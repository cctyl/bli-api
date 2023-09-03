// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 附加卡按钮点击类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.AdditionalButtonClickType}
 */
public enum AdditionalButtonClickType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 通用按钮
   * </pre>
   *
   * <code>click_none = 0;</code>
   */
  click_none(0),
  /**
   * <pre>
   * 预约卡按钮
   * </pre>
   *
   * <code>click_up = 1;</code>
   */
  click_up(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 通用按钮
   * </pre>
   *
   * <code>click_none = 0;</code>
   */
  public static final int click_none_VALUE = 0;
  /**
   * <pre>
   * 预约卡按钮
   * </pre>
   *
   * <code>click_up = 1;</code>
   */
  public static final int click_up_VALUE = 1;


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
  public static AdditionalButtonClickType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdditionalButtonClickType forNumber(int value) {
    switch (value) {
      case 0: return click_none;
      case 1: return click_up;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdditionalButtonClickType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdditionalButtonClickType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdditionalButtonClickType>() {
          public AdditionalButtonClickType findValueByNumber(int number) {
            return AdditionalButtonClickType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final AdditionalButtonClickType[] VALUES = values();

  public static AdditionalButtonClickType valueOf(
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

  private AdditionalButtonClickType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.AdditionalButtonClickType)
}

