// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/im/type/im.proto

package bilibili.im.type;

/**
 * <pre>
 * 消息来源
 * </pre>
 *
 * Protobuf enum {@code bilibili.im.type.MsgSource}
 */
public enum MsgSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_UNKONW = 0;</code>
   */
  EN_MSG_SOURCE_UNKONW(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_IOS = 1;</code>
   */
  EN_MSG_SOURCE_IOS(1),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_ANDRIOD = 2;</code>
   */
  EN_MSG_SOURCE_ANDRIOD(2),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_H5 = 3;</code>
   */
  EN_MSG_SOURCE_H5(3),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_PC = 4;</code>
   */
  EN_MSG_SOURCE_PC(4),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_BACKSTAGE = 5;</code>
   */
  EN_MSG_SOURCE_BACKSTAGE(5),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_BIZ = 6;</code>
   */
  EN_MSG_SOURCE_BIZ(6),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_WEB = 7;</code>
   */
  EN_MSG_SOURCE_WEB(7),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_FOLLOWED = 8;</code>
   */
  EN_MSG_SOURCE_AUTOREPLY_BY_FOLLOWED(8),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_RECEIVE_MSG = 9;</code>
   */
  EN_MSG_SOURCE_AUTOREPLY_BY_RECEIVE_MSG(9),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_KEYWORDS = 10;</code>
   */
  EN_MSG_SOURCE_AUTOREPLY_BY_KEYWORDS(10),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_VOYAGE = 11;</code>
   */
  EN_MSG_SOURCE_AUTOREPLY_BY_VOYAGE(11),
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_VC_ATTACH_MSG = 12;</code>
   */
  EN_MSG_SOURCE_VC_ATTACH_MSG(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_UNKONW = 0;</code>
   */
  public static final int EN_MSG_SOURCE_UNKONW_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_IOS = 1;</code>
   */
  public static final int EN_MSG_SOURCE_IOS_VALUE = 1;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_ANDRIOD = 2;</code>
   */
  public static final int EN_MSG_SOURCE_ANDRIOD_VALUE = 2;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_H5 = 3;</code>
   */
  public static final int EN_MSG_SOURCE_H5_VALUE = 3;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_PC = 4;</code>
   */
  public static final int EN_MSG_SOURCE_PC_VALUE = 4;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_BACKSTAGE = 5;</code>
   */
  public static final int EN_MSG_SOURCE_BACKSTAGE_VALUE = 5;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_BIZ = 6;</code>
   */
  public static final int EN_MSG_SOURCE_BIZ_VALUE = 6;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_WEB = 7;</code>
   */
  public static final int EN_MSG_SOURCE_WEB_VALUE = 7;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_FOLLOWED = 8;</code>
   */
  public static final int EN_MSG_SOURCE_AUTOREPLY_BY_FOLLOWED_VALUE = 8;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_RECEIVE_MSG = 9;</code>
   */
  public static final int EN_MSG_SOURCE_AUTOREPLY_BY_RECEIVE_MSG_VALUE = 9;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_KEYWORDS = 10;</code>
   */
  public static final int EN_MSG_SOURCE_AUTOREPLY_BY_KEYWORDS_VALUE = 10;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_AUTOREPLY_BY_VOYAGE = 11;</code>
   */
  public static final int EN_MSG_SOURCE_AUTOREPLY_BY_VOYAGE_VALUE = 11;
  /**
   * <pre>
   * </pre>
   *
   * <code>EN_MSG_SOURCE_VC_ATTACH_MSG = 12;</code>
   */
  public static final int EN_MSG_SOURCE_VC_ATTACH_MSG_VALUE = 12;


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
  public static MsgSource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MsgSource forNumber(int value) {
    switch (value) {
      case 0: return EN_MSG_SOURCE_UNKONW;
      case 1: return EN_MSG_SOURCE_IOS;
      case 2: return EN_MSG_SOURCE_ANDRIOD;
      case 3: return EN_MSG_SOURCE_H5;
      case 4: return EN_MSG_SOURCE_PC;
      case 5: return EN_MSG_SOURCE_BACKSTAGE;
      case 6: return EN_MSG_SOURCE_BIZ;
      case 7: return EN_MSG_SOURCE_WEB;
      case 8: return EN_MSG_SOURCE_AUTOREPLY_BY_FOLLOWED;
      case 9: return EN_MSG_SOURCE_AUTOREPLY_BY_RECEIVE_MSG;
      case 10: return EN_MSG_SOURCE_AUTOREPLY_BY_KEYWORDS;
      case 11: return EN_MSG_SOURCE_AUTOREPLY_BY_VOYAGE;
      case 12: return EN_MSG_SOURCE_VC_ATTACH_MSG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MsgSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MsgSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MsgSource>() {
          public MsgSource findValueByNumber(int number) {
            return MsgSource.forNumber(number);
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
    return bilibili.im.type.Im.getDescriptor().getEnumTypes().get(2);
  }

  private static final MsgSource[] VALUES = values();

  public static MsgSource valueOf(
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

  private MsgSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.im.type.MsgSource)
}

