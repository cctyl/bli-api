// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.CampusMngItemType}
 */
public enum CampusMngItemType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_none = 0;</code>
   */
  campus_mng_none(0),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_basic_info = 1;</code>
   */
  campus_mng_basic_info(1),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_badge = 2;</code>
   */
  campus_mng_badge(2),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_slogan = 3;</code>
   */
  campus_mng_slogan(3),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz = 4;</code>
   */
  campus_mng_quiz(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_none = 0;</code>
   */
  public static final int campus_mng_none_VALUE = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_basic_info = 1;</code>
   */
  public static final int campus_mng_basic_info_VALUE = 1;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_badge = 2;</code>
   */
  public static final int campus_mng_badge_VALUE = 2;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_slogan = 3;</code>
   */
  public static final int campus_mng_slogan_VALUE = 3;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz = 4;</code>
   */
  public static final int campus_mng_quiz_VALUE = 4;


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
  public static CampusMngItemType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CampusMngItemType forNumber(int value) {
    switch (value) {
      case 0: return campus_mng_none;
      case 1: return campus_mng_basic_info;
      case 2: return campus_mng_badge;
      case 3: return campus_mng_slogan;
      case 4: return campus_mng_quiz;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CampusMngItemType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CampusMngItemType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CampusMngItemType>() {
          public CampusMngItemType findValueByNumber(int number) {
            return CampusMngItemType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(12);
  }

  private static final CampusMngItemType[] VALUES = values();

  public static CampusMngItemType valueOf(
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

  private CampusMngItemType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.CampusMngItemType)
}
