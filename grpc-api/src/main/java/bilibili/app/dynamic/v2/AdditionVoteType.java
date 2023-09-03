// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 投票类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.AdditionVoteType}
 */
public enum AdditionVoteType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_none = 0;</code>
   */
  addition_vote_type_none(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_word = 1;</code>
   */
  addition_vote_type_word(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_pic = 2;</code>
   */
  addition_vote_type_pic(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_default = 3;</code>
   */
  addition_vote_type_default(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_none = 0;</code>
   */
  public static final int addition_vote_type_none_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_word = 1;</code>
   */
  public static final int addition_vote_type_word_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_pic = 2;</code>
   */
  public static final int addition_vote_type_pic_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>addition_vote_type_default = 3;</code>
   */
  public static final int addition_vote_type_default_VALUE = 3;


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
  public static AdditionVoteType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdditionVoteType forNumber(int value) {
    switch (value) {
      case 0: return addition_vote_type_none;
      case 1: return addition_vote_type_word;
      case 2: return addition_vote_type_pic;
      case 3: return addition_vote_type_default;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdditionVoteType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdditionVoteType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdditionVoteType>() {
          public AdditionVoteType findValueByNumber(int number) {
            return AdditionVoteType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(7);
  }

  private static final AdditionVoteType[] VALUES = values();

  public static AdditionVoteType valueOf(
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

  private AdditionVoteType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.AdditionVoteType)
}

