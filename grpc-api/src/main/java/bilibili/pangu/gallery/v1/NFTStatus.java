// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pangu/gallery/v1/gallery.proto

package bilibili.pangu.gallery.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.pangu.gallery.v1.NFTStatus}
 */
public enum NFTStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  UNDEFINED(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>DOING = 2;</code>
   */
  DOING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  public static final int UNDEFINED_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>DOING = 2;</code>
   */
  public static final int DOING_VALUE = 2;


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
  public static NFTStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NFTStatus forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED;
      case 1: return NORMAL;
      case 2: return DOING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NFTStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NFTStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NFTStatus>() {
          public NFTStatus findValueByNumber(int number) {
            return NFTStatus.forNumber(number);
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
    return bilibili.pangu.gallery.v1.Gallery.getDescriptor().getEnumTypes().get(1);
  }

  private static final NFTStatus[] VALUES = values();

  public static NFTStatus valueOf(
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

  private NFTStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.pangu.gallery.v1.NFTStatus)
}

