// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

/**
 * <pre>
 * 
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.NFTRegionType}
 */
public enum NFTRegionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>nft_region_default = 0;</code>
   */
  nft_region_default(0),
  /**
   * <code>nft_region_mainlang = 1;</code>
   */
  nft_region_mainlang(1),
  /**
   * <code>nft_region_gat = 2;</code>
   */
  nft_region_gat(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>nft_region_default = 0;</code>
   */
  public static final int nft_region_default_VALUE = 0;
  /**
   * <code>nft_region_mainlang = 1;</code>
   */
  public static final int nft_region_mainlang_VALUE = 1;
  /**
   * <code>nft_region_gat = 2;</code>
   */
  public static final int nft_region_gat_VALUE = 2;


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
  public static NFTRegionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NFTRegionType forNumber(int value) {
    switch (value) {
      case 0: return nft_region_default;
      case 1: return nft_region_mainlang;
      case 2: return nft_region_gat;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NFTRegionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NFTRegionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NFTRegionType>() {
          public NFTRegionType findValueByNumber(int number) {
            return NFTRegionType.forNumber(number);
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
    return bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(45);
  }

  private static final NFTRegionType[] VALUES = values();

  public static NFTRegionType valueOf(
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

  private NFTRegionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.NFTRegionType)
}
