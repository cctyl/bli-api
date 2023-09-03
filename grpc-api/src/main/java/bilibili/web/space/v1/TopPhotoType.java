// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/web/space/v1/space.proto

package bilibili.web.space.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.web.space.v1.TopPhotoType}
 */
public enum TopPhotoType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>PIC = 1;</code>
   */
  PIC(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>ARCHIVE = 2;</code>
   */
  ARCHIVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>PIC = 1;</code>
   */
  public static final int PIC_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>ARCHIVE = 2;</code>
   */
  public static final int ARCHIVE_VALUE = 2;


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
  public static TopPhotoType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TopPhotoType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return PIC;
      case 2: return ARCHIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TopPhotoType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TopPhotoType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TopPhotoType>() {
          public TopPhotoType findValueByNumber(int number) {
            return TopPhotoType.forNumber(number);
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
    return bilibili.web.space.v1.Space.getDescriptor().getEnumTypes().get(0);
  }

  private static final TopPhotoType[] VALUES = values();

  public static TopPhotoType valueOf(
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

  private TopPhotoType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.web.space.v1.TopPhotoType)
}

