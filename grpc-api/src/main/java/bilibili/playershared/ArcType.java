// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.playershared.ArcType}
 */
public enum ArcType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>ARC_TYPE_NORMAL = 0;</code>
   */
  ARC_TYPE_NORMAL(0),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>ARC_TYPE_INTERACT = 1;</code>
   */
  ARC_TYPE_INTERACT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>ARC_TYPE_NORMAL = 0;</code>
   */
  public static final int ARC_TYPE_NORMAL_VALUE = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>ARC_TYPE_INTERACT = 1;</code>
   */
  public static final int ARC_TYPE_INTERACT_VALUE = 1;


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
  public static ArcType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ArcType forNumber(int value) {
    switch (value) {
      case 0: return ARC_TYPE_NORMAL;
      case 1: return ARC_TYPE_INTERACT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ArcType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ArcType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ArcType>() {
          public ArcType findValueByNumber(int number) {
            return ArcType.forNumber(number);
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
    return bilibili.playershared.Playershared.getDescriptor().getEnumTypes().get(0);
  }

  private static final ArcType[] VALUES = values();

  public static ArcType valueOf(
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

  private ArcType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.playershared.ArcType)
}

