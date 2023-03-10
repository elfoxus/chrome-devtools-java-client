package com.github.kklisura.cdt.protocol.types.domsnapshot;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.Rect;
import java.util.List;

/** Details of an element in the DOM tree with a LayoutObject. */
public class LayoutTreeNode {

  private Integer domNodeIndex;

  private Rect boundingBox;

  @Optional private String layoutText;

  @Optional private List<InlineTextBox> inlineTextNodes;

  @Optional private Integer styleIndex;

  @Optional private Integer paintOrder;

  @Optional private Boolean isStackingContext;

  /** The index of the related DOM node in the `domNodes` array returned by `getSnapshot`. */
  public Integer getDomNodeIndex() {
    return domNodeIndex;
  }

  /** The index of the related DOM node in the `domNodes` array returned by `getSnapshot`. */
  public void setDomNodeIndex(Integer domNodeIndex) {
    this.domNodeIndex = domNodeIndex;
  }

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   */
  public Rect getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   */
  public void setBoundingBox(Rect boundingBox) {
    this.boundingBox = boundingBox;
  }

  /** Contents of the LayoutText, if any. */
  public String getLayoutText() {
    return layoutText;
  }

  /** Contents of the LayoutText, if any. */
  public void setLayoutText(String layoutText) {
    this.layoutText = layoutText;
  }

  /** The post-layout inline text nodes, if any. */
  public List<InlineTextBox> getInlineTextNodes() {
    return inlineTextNodes;
  }

  /** The post-layout inline text nodes, if any. */
  public void setInlineTextNodes(List<InlineTextBox> inlineTextNodes) {
    this.inlineTextNodes = inlineTextNodes;
  }

  /** Index into the `computedStyles` array returned by `getSnapshot`. */
  public Integer getStyleIndex() {
    return styleIndex;
  }

  /** Index into the `computedStyles` array returned by `getSnapshot`. */
  public void setStyleIndex(Integer styleIndex) {
    this.styleIndex = styleIndex;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * getSnapshot was true.
   */
  public Integer getPaintOrder() {
    return paintOrder;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * getSnapshot was true.
   */
  public void setPaintOrder(Integer paintOrder) {
    this.paintOrder = paintOrder;
  }

  /** Set to true to indicate the element begins a new stacking context. */
  public Boolean getIsStackingContext() {
    return isStackingContext;
  }

  /** Set to true to indicate the element begins a new stacking context. */
  public void setIsStackingContext(Boolean isStackingContext) {
    this.isStackingContext = isStackingContext;
  }
}
