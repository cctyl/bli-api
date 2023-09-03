// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/playershared/playershared.proto

package bilibili.playershared;

public interface PlayArcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.playershared.PlayArc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.VideoType video_type = 1;</code>
   * @return The enum numeric value on the wire for videoType.
   */
  int getVideoTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.VideoType video_type = 1;</code>
   * @return The videoType.
   */
  bilibili.playershared.VideoType getVideoType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>uint64 aid = 2;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>uint64 cid = 3;</code>
   * @return The cid.
   */
  long getCid();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.DrmTechType drm_tech_type = 4;</code>
   * @return The enum numeric value on the wire for drmTechType.
   */
  int getDrmTechTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.DrmTechType drm_tech_type = 4;</code>
   * @return The drmTechType.
   */
  bilibili.playershared.DrmTechType getDrmTechType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.ArcType arc_type = 5;</code>
   * @return The enum numeric value on the wire for arcType.
   */
  int getArcTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.ArcType arc_type = 5;</code>
   * @return The arcType.
   */
  bilibili.playershared.ArcType getArcType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Interaction interaction = 6;</code>
   * @return Whether the interaction field is set.
   */
  boolean hasInteraction();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Interaction interaction = 6;</code>
   * @return The interaction.
   */
  bilibili.playershared.Interaction getInteraction();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Interaction interaction = 6;</code>
   */
  bilibili.playershared.InteractionOrBuilder getInteractionOrBuilder();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Dimension dimension = 7;</code>
   * @return Whether the dimension field is set.
   */
  boolean hasDimension();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Dimension dimension = 7;</code>
   * @return The dimension.
   */
  bilibili.playershared.Dimension getDimension();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.playershared.Dimension dimension = 7;</code>
   */
  bilibili.playershared.DimensionOrBuilder getDimensionOrBuilder();
}
