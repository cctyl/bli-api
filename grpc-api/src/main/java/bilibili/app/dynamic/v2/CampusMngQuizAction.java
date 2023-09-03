// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.CampusMngQuizAction}
 */
public enum CampusMngQuizAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_list = 0;</code>
   */
  campus_mng_quiz_act_list(0),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_add = 1;</code>
   */
  campus_mng_quiz_act_add(1),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_del = 2;</code>
   */
  campus_mng_quiz_act_del(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_list = 0;</code>
   */
  public static final int campus_mng_quiz_act_list_VALUE = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_add = 1;</code>
   */
  public static final int campus_mng_quiz_act_add_VALUE = 1;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>campus_mng_quiz_act_del = 2;</code>
   */
  public static final int campus_mng_quiz_act_del_VALUE = 2;


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
  public static CampusMngQuizAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CampusMngQuizAction forNumber(int value) {
    switch (value) {
      case 0: return campus_mng_quiz_act_list;
      case 1: return campus_mng_quiz_act_add;
      case 2: return campus_mng_quiz_act_del;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CampusMngQuizAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CampusMngQuizAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CampusMngQuizAction>() {
          public CampusMngQuizAction findValueByNumber(int number) {
            return CampusMngQuizAction.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(13);
  }

  private static final CampusMngQuizAction[] VALUES = values();

  public static CampusMngQuizAction valueOf(
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

  private CampusMngQuizAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.CampusMngQuizAction)
}

