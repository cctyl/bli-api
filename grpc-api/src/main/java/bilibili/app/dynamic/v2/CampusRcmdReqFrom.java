// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.CampusRcmdReqFrom}
 */
public enum CampusRcmdReqFrom
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CAMPUS_RCMD_FROM_UNKNOWN = 0;</code>
   */
  CAMPUS_RCMD_FROM_UNKNOWN(0),
  /**
   * <code>CAMPUS_RCMD_FROM_HOME_UN_OPEN = 1;</code>
   */
  CAMPUS_RCMD_FROM_HOME_UN_OPEN(1),
  /**
   * <code>CAMPUS_RCMD_FROM_VISIT_OTHER = 2;</code>
   */
  CAMPUS_RCMD_FROM_VISIT_OTHER(2),
  /**
   * <code>CAMPUS_RCMD_FROM_HOME_MOMENT = 3;</code>
   */
  CAMPUS_RCMD_FROM_HOME_MOMENT(3),
  /**
   * <code>CAMPUS_RCMD_FROM_DYN_MOMENT = 4;</code>
   */
  CAMPUS_RCMD_FROM_DYN_MOMENT(4),
  /**
   * <code>CAMPUS_RCMD_FROM_PAGE_SUBORDINATE_MOMENT = 5;</code>
   */
  CAMPUS_RCMD_FROM_PAGE_SUBORDINATE_MOMENT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CAMPUS_RCMD_FROM_UNKNOWN = 0;</code>
   */
  public static final int CAMPUS_RCMD_FROM_UNKNOWN_VALUE = 0;
  /**
   * <code>CAMPUS_RCMD_FROM_HOME_UN_OPEN = 1;</code>
   */
  public static final int CAMPUS_RCMD_FROM_HOME_UN_OPEN_VALUE = 1;
  /**
   * <code>CAMPUS_RCMD_FROM_VISIT_OTHER = 2;</code>
   */
  public static final int CAMPUS_RCMD_FROM_VISIT_OTHER_VALUE = 2;
  /**
   * <code>CAMPUS_RCMD_FROM_HOME_MOMENT = 3;</code>
   */
  public static final int CAMPUS_RCMD_FROM_HOME_MOMENT_VALUE = 3;
  /**
   * <code>CAMPUS_RCMD_FROM_DYN_MOMENT = 4;</code>
   */
  public static final int CAMPUS_RCMD_FROM_DYN_MOMENT_VALUE = 4;
  /**
   * <code>CAMPUS_RCMD_FROM_PAGE_SUBORDINATE_MOMENT = 5;</code>
   */
  public static final int CAMPUS_RCMD_FROM_PAGE_SUBORDINATE_MOMENT_VALUE = 5;


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
  public static CampusRcmdReqFrom valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CampusRcmdReqFrom forNumber(int value) {
    switch (value) {
      case 0: return CAMPUS_RCMD_FROM_UNKNOWN;
      case 1: return CAMPUS_RCMD_FROM_HOME_UN_OPEN;
      case 2: return CAMPUS_RCMD_FROM_VISIT_OTHER;
      case 3: return CAMPUS_RCMD_FROM_HOME_MOMENT;
      case 4: return CAMPUS_RCMD_FROM_DYN_MOMENT;
      case 5: return CAMPUS_RCMD_FROM_PAGE_SUBORDINATE_MOMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CampusRcmdReqFrom>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CampusRcmdReqFrom> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CampusRcmdReqFrom>() {
          public CampusRcmdReqFrom findValueByNumber(int number) {
            return CampusRcmdReqFrom.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(9);
  }

  private static final CampusRcmdReqFrom[] VALUES = values();

  public static CampusRcmdReqFrom valueOf(
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

  private CampusRcmdReqFrom(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.CampusRcmdReqFrom)
}

