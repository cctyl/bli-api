// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * 弹幕属性位值
 * </pre>
 *
 * Protobuf enum {@code bilibili.community.service.dm.v1.DMAttrBit}
 */
public enum DMAttrBit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 保护弹幕
   * </pre>
   *
   * <code>DMAttrBitProtect = 0;</code>
   */
  DMAttrBitProtect(0),
  /**
   * <pre>
   * 直播弹幕
   * </pre>
   *
   * <code>DMAttrBitFromLive = 1;</code>
   */
  DMAttrBitFromLive(1),
  /**
   * <pre>
   * 高赞弹幕
   * </pre>
   *
   * <code>DMAttrHighLike = 2;</code>
   */
  DMAttrHighLike(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 保护弹幕
   * </pre>
   *
   * <code>DMAttrBitProtect = 0;</code>
   */
  public static final int DMAttrBitProtect_VALUE = 0;
  /**
   * <pre>
   * 直播弹幕
   * </pre>
   *
   * <code>DMAttrBitFromLive = 1;</code>
   */
  public static final int DMAttrBitFromLive_VALUE = 1;
  /**
   * <pre>
   * 高赞弹幕
   * </pre>
   *
   * <code>DMAttrHighLike = 2;</code>
   */
  public static final int DMAttrHighLike_VALUE = 2;


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
  public static DMAttrBit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DMAttrBit forNumber(int value) {
    switch (value) {
      case 0: return DMAttrBitProtect;
      case 1: return DMAttrBitFromLive;
      case 2: return DMAttrHighLike;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DMAttrBit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DMAttrBit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DMAttrBit>() {
          public DMAttrBit findValueByNumber(int number) {
            return DMAttrBit.forNumber(number);
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
    return bilibili.community.service.dm.v1.Dm.getDescriptor().getEnumTypes().get(3);
  }

  private static final DMAttrBit[] VALUES = values();

  public static DMAttrBit valueOf(
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

  private DMAttrBit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.community.service.dm.v1.DMAttrBit)
}

