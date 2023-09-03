// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/listener/v1/listener.proto

package bilibili.app.listener.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.listener.v1.CardModuleType}
 */
public enum CardModuleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Module_invalid = 0;</code>
   */
  Module_invalid(0),
  /**
   * <code>Module_header = 1;</code>
   */
  Module_header(1),
  /**
   * <code>Module_archive = 2;</code>
   */
  Module_archive(2),
  /**
   * <code>Module_cbtn = 3;</code>
   */
  Module_cbtn(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Module_invalid = 0;</code>
   */
  public static final int Module_invalid_VALUE = 0;
  /**
   * <code>Module_header = 1;</code>
   */
  public static final int Module_header_VALUE = 1;
  /**
   * <code>Module_archive = 2;</code>
   */
  public static final int Module_archive_VALUE = 2;
  /**
   * <code>Module_cbtn = 3;</code>
   */
  public static final int Module_cbtn_VALUE = 3;


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
  public static CardModuleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CardModuleType forNumber(int value) {
    switch (value) {
      case 0: return Module_invalid;
      case 1: return Module_header;
      case 2: return Module_archive;
      case 3: return Module_cbtn;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CardModuleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CardModuleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CardModuleType>() {
          public CardModuleType findValueByNumber(int number) {
            return CardModuleType.forNumber(number);
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
    return bilibili.app.listener.v1.ListenerOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final CardModuleType[] VALUES = values();

  public static CardModuleType valueOf(
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

  private CardModuleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.listener.v1.CardModuleType)
}
