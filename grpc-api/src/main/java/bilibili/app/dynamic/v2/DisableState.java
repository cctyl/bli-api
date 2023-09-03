// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.DisableState}
 */
public enum DisableState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 高亮
   * </pre>
   *
   * <code>highlight = 0;</code>
   */
  highlight(0),
  /**
   * <pre>
   * 置灰(按钮不可点击)
   * </pre>
   *
   * <code>gary = 1;</code>
   */
  gary(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 高亮
   * </pre>
   *
   * <code>highlight = 0;</code>
   */
  public static final int highlight_VALUE = 0;
  /**
   * <pre>
   * 置灰(按钮不可点击)
   * </pre>
   *
   * <code>gary = 1;</code>
   */
  public static final int gary_VALUE = 1;


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
  public static DisableState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DisableState forNumber(int value) {
    switch (value) {
      case 0: return highlight;
      case 1: return gary;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisableState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisableState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisableState>() {
          public DisableState findValueByNumber(int number) {
            return DisableState.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(19);
  }

  private static final DisableState[] VALUES = values();

  public static DisableState valueOf(
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

  private DisableState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.DisableState)
}

