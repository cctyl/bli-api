// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package bilibili.app.dynamic.v2;

public interface ParagraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.Paragraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Paragraph.ParagraphType para_type = 1;</code>
   * @return The enum numeric value on the wire for paraType.
   */
  int getParaTypeValue();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Paragraph.ParagraphType para_type = 1;</code>
   * @return The paraType.
   */
  bilibili.app.dynamic.v2.Paragraph.ParagraphType getParaType();

  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Paragraph.ParagraphFormat para_format = 2;</code>
   * @return Whether the paraFormat field is set.
   */
  boolean hasParaFormat();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Paragraph.ParagraphFormat para_format = 2;</code>
   * @return The paraFormat.
   */
  bilibili.app.dynamic.v2.Paragraph.ParagraphFormat getParaFormat();
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.Paragraph.ParagraphFormat para_format = 2;</code>
   */
  bilibili.app.dynamic.v2.Paragraph.ParagraphFormatOrBuilder getParaFormatOrBuilder();

  /**
   * <code>.bilibili.app.dynamic.v2.TextParagraph text = 3;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.bilibili.app.dynamic.v2.TextParagraph text = 3;</code>
   * @return The text.
   */
  bilibili.app.dynamic.v2.TextParagraph getText();
  /**
   * <code>.bilibili.app.dynamic.v2.TextParagraph text = 3;</code>
   */
  bilibili.app.dynamic.v2.TextParagraphOrBuilder getTextOrBuilder();

  /**
   * <code>.bilibili.app.dynamic.v2.PicParagraph pic = 4;</code>
   * @return Whether the pic field is set.
   */
  boolean hasPic();
  /**
   * <code>.bilibili.app.dynamic.v2.PicParagraph pic = 4;</code>
   * @return The pic.
   */
  bilibili.app.dynamic.v2.PicParagraph getPic();
  /**
   * <code>.bilibili.app.dynamic.v2.PicParagraph pic = 4;</code>
   */
  bilibili.app.dynamic.v2.PicParagraphOrBuilder getPicOrBuilder();

  /**
   * <code>.bilibili.app.dynamic.v2.LineParagraph line = 5;</code>
   * @return Whether the line field is set.
   */
  boolean hasLine();
  /**
   * <code>.bilibili.app.dynamic.v2.LineParagraph line = 5;</code>
   * @return The line.
   */
  bilibili.app.dynamic.v2.LineParagraph getLine();
  /**
   * <code>.bilibili.app.dynamic.v2.LineParagraph line = 5;</code>
   */
  bilibili.app.dynamic.v2.LineParagraphOrBuilder getLineOrBuilder();

  /**
   * <code>.bilibili.app.dynamic.v2.CardParagraph link_card = 6;</code>
   * @return Whether the linkCard field is set.
   */
  boolean hasLinkCard();
  /**
   * <code>.bilibili.app.dynamic.v2.CardParagraph link_card = 6;</code>
   * @return The linkCard.
   */
  bilibili.app.dynamic.v2.CardParagraph getLinkCard();
  /**
   * <code>.bilibili.app.dynamic.v2.CardParagraph link_card = 6;</code>
   */
  bilibili.app.dynamic.v2.CardParagraphOrBuilder getLinkCardOrBuilder();

  bilibili.app.dynamic.v2.Paragraph.ContentCase getContentCase();
}