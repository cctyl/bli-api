// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/view/v1/view.proto

package bilibili.app.view.v1;

/**
 * <pre>
 * 错误代码
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.view.v1.ECode}
 */
public enum ECode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 正常
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <pre>
   * 稿件被UP主删除
   * </pre>
   *
   * <code>CODE404 = 1;</code>
   */
  CODE404(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 正常
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <pre>
   * 稿件被UP主删除
   * </pre>
   *
   * <code>CODE404 = 1;</code>
   */
  public static final int CODE404_VALUE = 1;


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
  public static ECode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ECode forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 1: return CODE404;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ECode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ECode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ECode>() {
          public ECode findValueByNumber(int number) {
            return ECode.forNumber(number);
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
    return bilibili.app.view.v1.ViewOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final ECode[] VALUES = values();

  public static ECode valueOf(
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

  private ECode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.view.v1.ECode)
}

