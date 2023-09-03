// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/playurl/v1/playurl.proto

package bilibili.app.playurl.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.playurl.v1.Group}
 */
public enum Group
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>UnknownGroup = 0;</code>
   */
  UnknownGroup(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>A = 1;</code>
   */
  A(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>B = 2;</code>
   */
  B(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>C = 3;</code>
   */
  C(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>UnknownGroup = 0;</code>
   */
  public static final int UnknownGroup_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>A = 1;</code>
   */
  public static final int A_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>B = 2;</code>
   */
  public static final int B_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>C = 3;</code>
   */
  public static final int C_VALUE = 3;


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
  public static Group valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Group forNumber(int value) {
    switch (value) {
      case 0: return UnknownGroup;
      case 1: return A;
      case 2: return B;
      case 3: return C;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Group>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Group> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Group>() {
          public Group findValueByNumber(int number) {
            return Group.forNumber(number);
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
    return bilibili.app.playurl.v1.Playurl.getDescriptor().getEnumTypes().get(3);
  }

  private static final Group[] VALUES = values();

  public static Group valueOf(
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

  private Group(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.playurl.v1.Group)
}

