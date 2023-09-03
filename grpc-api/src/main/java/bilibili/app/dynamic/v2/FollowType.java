// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.FollowType}
 */
public enum FollowType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>ft_not_follow = 0;</code>
   */
  ft_not_follow(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>ft_follow = 1;</code>
   */
  ft_follow(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>ft_not_follow = 0;</code>
   */
  public static final int ft_not_follow_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>ft_follow = 1;</code>
   */
  public static final int ft_follow_VALUE = 1;


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
  public static FollowType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FollowType forNumber(int value) {
    switch (value) {
      case 0: return ft_not_follow;
      case 1: return ft_follow;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FollowType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FollowType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FollowType>() {
          public FollowType findValueByNumber(int number) {
            return FollowType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(26);
  }

  private static final FollowType[] VALUES = values();

  public static FollowType valueOf(
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

  private FollowType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.FollowType)
}

