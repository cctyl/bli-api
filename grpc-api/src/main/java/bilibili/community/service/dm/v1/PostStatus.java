// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/community/service/dm/v1/dm.proto

package bilibili.community.service.dm.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf enum {@code bilibili.community.service.dm.v1.PostStatus}
 */
public enum PostStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * </pre>
   *
   * <code>PostStatusNormal = 0;</code>
   */
  PostStatusNormal(0),
  /**
   * <pre>
   * </pre>
   *
   * <code>PostStatusClosed = 1;</code>
   */
  PostStatusClosed(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * </pre>
   *
   * <code>PostStatusNormal = 0;</code>
   */
  public static final int PostStatusNormal_VALUE = 0;
  /**
   * <pre>
   * </pre>
   *
   * <code>PostStatusClosed = 1;</code>
   */
  public static final int PostStatusClosed_VALUE = 1;


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
  public static PostStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PostStatus forNumber(int value) {
    switch (value) {
      case 0: return PostStatusNormal;
      case 1: return PostStatusClosed;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PostStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PostStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PostStatus>() {
          public PostStatus findValueByNumber(int number) {
            return PostStatus.forNumber(number);
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
    return bilibili.community.service.dm.v1.Dm.getDescriptor().getEnumTypes().get(7);
  }

  private static final PostStatus[] VALUES = values();

  public static PostStatus valueOf(
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

  private PostStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.community.service.dm.v1.PostStatus)
}
