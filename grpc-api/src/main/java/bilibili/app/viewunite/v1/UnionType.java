// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.viewunite.v1.UnionType}
 */
public enum UnionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>UGC = 0;</code>
   */
  UGC(0),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>OGV = 1;</code>
   */
  OGV(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>UGC = 0;</code>
   */
  public static final int UGC_VALUE = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>OGV = 1;</code>
   */
  public static final int OGV_VALUE = 1;


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
  public static UnionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UnionType forNumber(int value) {
    switch (value) {
      case 0: return UGC;
      case 1: return OGV;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnionType>() {
          public UnionType findValueByNumber(int number) {
            return UnionType.forNumber(number);
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
    return bilibili.app.viewunite.v1.Viewunite.getDescriptor().getEnumTypes().get(7);
  }

  private static final UnionType[] VALUES = values();

  public static UnionType valueOf(
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

  private UnionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.viewunite.v1.UnionType)
}

