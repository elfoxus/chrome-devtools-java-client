package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Configuration data for the highlighting of Flex item elements. */
public class FlexItemHighlightConfig {

  @Optional private BoxStyle baseSizeBox;

  @Optional private LineStyle baseSizeBorder;

  @Optional private LineStyle flexibilityArrow;

  /** Style of the box representing the item's base size */
  public BoxStyle getBaseSizeBox() {
    return baseSizeBox;
  }

  /** Style of the box representing the item's base size */
  public void setBaseSizeBox(BoxStyle baseSizeBox) {
    this.baseSizeBox = baseSizeBox;
  }

  /** Style of the border around the box representing the item's base size */
  public LineStyle getBaseSizeBorder() {
    return baseSizeBorder;
  }

  /** Style of the border around the box representing the item's base size */
  public void setBaseSizeBorder(LineStyle baseSizeBorder) {
    this.baseSizeBorder = baseSizeBorder;
  }

  /** Style of the arrow representing if the item grew or shrank */
  public LineStyle getFlexibilityArrow() {
    return flexibilityArrow;
  }

  /** Style of the arrow representing if the item grew or shrank */
  public void setFlexibilityArrow(LineStyle flexibilityArrow) {
    this.flexibilityArrow = flexibilityArrow;
  }
}
