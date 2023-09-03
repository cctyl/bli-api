// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/resource/v1/module.proto

package bilibili.app.resource.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.resource.v1.EnvType}
 */
public enum EnvType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>Release = 1;</code>
   */
  Release(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>Test = 2;</code>
   */
  Test(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>Release = 1;</code>
   */
  public static final int Release_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>Test = 2;</code>
   */
  public static final int Test_VALUE = 2;


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
  public static EnvType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EnvType forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Release;
      case 2: return Test;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnvType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnvType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnvType>() {
          public EnvType findValueByNumber(int number) {
            return EnvType.forNumber(number);
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
    return bilibili.app.resource.v1.ModuleOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final EnvType[] VALUES = values();

  public static EnvType valueOf(
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

  private EnvType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.resource.v1.EnvType)
}
