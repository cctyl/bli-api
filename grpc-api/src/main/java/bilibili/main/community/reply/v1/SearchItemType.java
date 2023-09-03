// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/main/community/reply/v1/reply.proto

package bilibili.main.community.reply.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.main.community.reply.v1.SearchItemType}
 */
public enum SearchItemType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>DEFAULT_ITEM_TYPE = 0;</code>
   */
  DEFAULT_ITEM_TYPE(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>GOODS = 1;</code>
   */
  GOODS(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>VIDEO = 2;</code>
   */
  VIDEO(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>ARTICLE = 3;</code>
   */
  ARTICLE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>DEFAULT_ITEM_TYPE = 0;</code>
   */
  public static final int DEFAULT_ITEM_TYPE_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>GOODS = 1;</code>
   */
  public static final int GOODS_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>VIDEO = 2;</code>
   */
  public static final int VIDEO_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>ARTICLE = 3;</code>
   */
  public static final int ARTICLE_VALUE = 3;


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
  public static SearchItemType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SearchItemType forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT_ITEM_TYPE;
      case 1: return GOODS;
      case 2: return VIDEO;
      case 3: return ARTICLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchItemType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SearchItemType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SearchItemType>() {
          public SearchItemType findValueByNumber(int number) {
            return SearchItemType.forNumber(number);
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
    return bilibili.main.community.reply.v1.ReplyOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final SearchItemType[] VALUES = values();

  public static SearchItemType valueOf(
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

  private SearchItemType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.main.community.reply.v1.SearchItemType)
}

