// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/viewunite/v1/viewunite.proto

package bilibili.app.viewunite.v1;

/**
 * <pre>
 * 素材来源
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.viewunite.v1.MaterialSource}
 */
public enum MaterialSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <pre>
   * 必剪素材
   * </pre>
   *
   * <code>BIJIAN = 1;</code>
   */
  BIJIAN(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <pre>
   * 必剪素材
   * </pre>
   *
   * <code>BIJIAN = 1;</code>
   */
  public static final int BIJIAN_VALUE = 1;


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
  public static MaterialSource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MaterialSource forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 1: return BIJIAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MaterialSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MaterialSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MaterialSource>() {
          public MaterialSource findValueByNumber(int number) {
            return MaterialSource.forNumber(number);
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
    return bilibili.app.viewunite.v1.Viewunite.getDescriptor().getEnumTypes().get(3);
  }

  private static final MaterialSource[] VALUES = values();

  public static MaterialSource valueOf(
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

  private MaterialSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.viewunite.v1.MaterialSource)
}

