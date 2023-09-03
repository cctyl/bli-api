// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.community.service.dm.v1.BubbleType}
 */
public enum BubbleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeNone = 0;</code>
   */
  BubbleTypeNone(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeClickButton = 1;</code>
   */
  BubbleTypeClickButton(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeDmSettingPanel = 2;</code>
   */
  BubbleTypeDmSettingPanel(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeNone = 0;</code>
   */
  public static final int BubbleTypeNone_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeClickButton = 1;</code>
   */
  public static final int BubbleTypeClickButton_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>BubbleTypeDmSettingPanel = 2;</code>
   */
  public static final int BubbleTypeDmSettingPanel_VALUE = 2;


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
  public static BubbleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BubbleType forNumber(int value) {
    switch (value) {
      case 0: return BubbleTypeNone;
      case 1: return BubbleTypeClickButton;
      case 2: return BubbleTypeDmSettingPanel;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BubbleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BubbleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BubbleType>() {
          public BubbleType findValueByNumber(int number) {
            return BubbleType.forNumber(number);
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
    return bilibili.community.service.dm.v1.Dm.getDescriptor().getEnumTypes().get(1);
  }

  private static final BubbleType[] VALUES = values();

  public static BubbleType valueOf(
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

  private BubbleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.community.service.dm.v1.BubbleType)
}

