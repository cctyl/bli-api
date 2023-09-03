// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/nativeact/v1/nativeact.proto

package bilibili.app.nativeact.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.nativeact.v1.RedirectType}
 */
public enum RedirectType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeDefault = 0;</code>
   */
  RtTypeDefault(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeSpace = 1;</code>
   */
  RtTypeSpace(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeUri = 2;</code>
   */
  RtTypeUri(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeDefault = 0;</code>
   */
  public static final int RtTypeDefault_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeSpace = 1;</code>
   */
  public static final int RtTypeSpace_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>RtTypeUri = 2;</code>
   */
  public static final int RtTypeUri_VALUE = 2;


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
  public static RedirectType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RedirectType forNumber(int value) {
    switch (value) {
      case 0: return RtTypeDefault;
      case 1: return RtTypeSpace;
      case 2: return RtTypeUri;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RedirectType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RedirectType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RedirectType>() {
          public RedirectType findValueByNumber(int number) {
            return RedirectType.forNumber(number);
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
    return bilibili.app.nativeact.v1.Nativeact.getDescriptor().getEnumTypes().get(5);
  }

  private static final RedirectType[] VALUES = values();

  public static RedirectType valueOf(
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

  private RedirectType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.nativeact.v1.RedirectType)
}

