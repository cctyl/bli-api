// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 附加卡按钮状态
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.AdditionalButtonStatus}
 */
public enum AdditionalButtonStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>none = 0;</code>
   */
  none(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>uncheck = 1;</code>
   */
  uncheck(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>check = 2;</code>
   */
  check(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>none = 0;</code>
   */
  public static final int none_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>uncheck = 1;</code>
   */
  public static final int uncheck_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>check = 2;</code>
   */
  public static final int check_VALUE = 2;


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
  public static AdditionalButtonStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdditionalButtonStatus forNumber(int value) {
    switch (value) {
      case 0: return none;
      case 1: return uncheck;
      case 2: return check;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdditionalButtonStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdditionalButtonStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdditionalButtonStatus>() {
          public AdditionalButtonStatus findValueByNumber(int number) {
            return AdditionalButtonStatus.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final AdditionalButtonStatus[] VALUES = values();

  public static AdditionalButtonStatus valueOf(
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

  private AdditionalButtonStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.AdditionalButtonStatus)
}

