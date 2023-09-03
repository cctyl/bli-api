// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/polymer/community/govern/v1/govern.proto

package bilibili.polymer.app.govern.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.polymer.app.govern.v1.AntiHarassmentLimit}
 */
public enum AntiHarassmentLimit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>DefaultLimit = 0;</code>
   */
  DefaultLimit(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>FollowLimit = 1;</code>
   */
  FollowLimit(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>ReFollowLimit = 2;</code>
   */
  ReFollowLimit(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>TwoWayFollow = 3;</code>
   */
  TwoWayFollow(3),
  /**
   * <pre>
   * </pre>
   *
   * <code>AllLimit = 4;</code>
   */
  AllLimit(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>DefaultLimit = 0;</code>
   */
  public static final int DefaultLimit_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>FollowLimit = 1;</code>
   */
  public static final int FollowLimit_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>ReFollowLimit = 2;</code>
   */
  public static final int ReFollowLimit_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>TwoWayFollow = 3;</code>
   */
  public static final int TwoWayFollow_VALUE = 3;
  /**
   * <pre>
   * </pre>
   *
   * <code>AllLimit = 4;</code>
   */
  public static final int AllLimit_VALUE = 4;


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
  public static AntiHarassmentLimit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AntiHarassmentLimit forNumber(int value) {
    switch (value) {
      case 0: return DefaultLimit;
      case 1: return FollowLimit;
      case 2: return ReFollowLimit;
      case 3: return TwoWayFollow;
      case 4: return AllLimit;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AntiHarassmentLimit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AntiHarassmentLimit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AntiHarassmentLimit>() {
          public AntiHarassmentLimit findValueByNumber(int number) {
            return AntiHarassmentLimit.forNumber(number);
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
    return bilibili.polymer.app.govern.v1.Govern.getDescriptor().getEnumTypes().get(0);
  }

  private static final AntiHarassmentLimit[] VALUES = values();

  public static AntiHarassmentLimit valueOf(
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

  private AntiHarassmentLimit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.polymer.app.govern.v1.AntiHarassmentLimit)
}

