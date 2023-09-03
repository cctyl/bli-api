// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.pgc.gateway.player.v2.InlineType}
 */
public enum InlineType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_UNKNOWN = 0;</code>
   */
  TYPE_UNKNOWN(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_WHOLE = 1;</code>
   */
  TYPE_WHOLE(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_HE_CLIP = 2;</code>
   */
  TYPE_HE_CLIP(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_PREVIEW = 3;</code>
   */
  TYPE_PREVIEW(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_UNKNOWN = 0;</code>
   */
  public static final int TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_WHOLE = 1;</code>
   */
  public static final int TYPE_WHOLE_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_HE_CLIP = 2;</code>
   */
  public static final int TYPE_HE_CLIP_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>TYPE_PREVIEW = 3;</code>
   */
  public static final int TYPE_PREVIEW_VALUE = 3;


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
  public static InlineType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InlineType forNumber(int value) {
    switch (value) {
      case 0: return TYPE_UNKNOWN;
      case 1: return TYPE_WHOLE;
      case 2: return TYPE_HE_CLIP;
      case 3: return TYPE_PREVIEW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InlineType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InlineType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InlineType>() {
          public InlineType findValueByNumber(int number) {
            return InlineType.forNumber(number);
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
    return bilibili.pgc.gateway.player.v2.Playurl.getDescriptor().getEnumTypes().get(5);
  }

  private static final InlineType[] VALUES = values();

  public static InlineType valueOf(
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

  private InlineType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.pgc.gateway.player.v2.InlineType)
}

