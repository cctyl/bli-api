// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/pgc/gateway/player/v2/playurl.proto

package bilibili.pgc.gateway.player.v2;

/**
 * <pre>
 * DRM技术类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.pgc.gateway.player.v2.DrmTechType}
 */
public enum DrmTechType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>NON = 0;</code>
   */
  NON(0),
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>FAIR_PLAY = 1;</code>
   */
  FAIR_PLAY(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>WIDE_VINE = 2;</code>
   */
  WIDE_VINE(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>BILI_DRM = 3;</code>
   */
  BILI_DRM(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>NON = 0;</code>
   */
  public static final int NON_VALUE = 0;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>FAIR_PLAY = 1;</code>
   */
  public static final int FAIR_PLAY_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>WIDE_VINE = 2;</code>
   */
  public static final int WIDE_VINE_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>BILI_DRM = 3;</code>
   */
  public static final int BILI_DRM_VALUE = 3;


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
  public static DrmTechType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DrmTechType forNumber(int value) {
    switch (value) {
      case 0: return NON;
      case 1: return FAIR_PLAY;
      case 2: return WIDE_VINE;
      case 3: return BILI_DRM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DrmTechType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DrmTechType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DrmTechType>() {
          public DrmTechType findValueByNumber(int number) {
            return DrmTechType.forNumber(number);
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
    return bilibili.pgc.gateway.player.v2.Playurl.getDescriptor().getEnumTypes().get(2);
  }

  private static final DrmTechType[] VALUES = values();

  public static DrmTechType valueOf(
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

  private DrmTechType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.pgc.gateway.player.v2.DrmTechType)
}
