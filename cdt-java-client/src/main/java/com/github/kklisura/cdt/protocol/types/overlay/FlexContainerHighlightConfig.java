package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Configuration data for the highlighting of Flex container elements. */
public class FlexContainerHighlightConfig {

  @Optional private LineStyle containerBorder;

  @Optional private LineStyle lineSeparator;

  @Optional private LineStyle itemSeparator;

  @Optional private BoxStyle mainDistributedSpace;

  @Optional private BoxStyle crossDistributedSpace;

  @Optional private BoxStyle rowGapSpace;

  @Optional private BoxStyle columnGapSpace;

  @Optional private LineStyle crossAlignment;

  /** The style of the container border */
  public LineStyle getContainerBorder() {
    return containerBorder;
  }

  /** The style of the container border */
  public void setContainerBorder(LineStyle containerBorder) {
    this.containerBorder = containerBorder;
  }

  /** The style of the separator between lines */
  public LineStyle getLineSeparator() {
    return lineSeparator;
  }

  /** The style of the separator between lines */
  public void setLineSeparator(LineStyle lineSeparator) {
    this.lineSeparator = lineSeparator;
  }

  /** The style of the separator between items */
  public LineStyle getItemSeparator() {
    return itemSeparator;
  }

  /** The style of the separator between items */
  public void setItemSeparator(LineStyle itemSeparator) {
    this.itemSeparator = itemSeparator;
  }

  /** Style of content-distribution space on the main axis (justify-content). */
  public BoxStyle getMainDistributedSpace() {
    return mainDistributedSpace;
  }

  /** Style of content-distribution space on the main axis (justify-content). */
  public void setMainDistributedSpace(BoxStyle mainDistributedSpace) {
    this.mainDistributedSpace = mainDistributedSpace;
  }

  /** Style of content-distribution space on the cross axis (align-content). */
  public BoxStyle getCrossDistributedSpace() {
    return crossDistributedSpace;
  }

  /** Style of content-distribution space on the cross axis (align-content). */
  public void setCrossDistributedSpace(BoxStyle crossDistributedSpace) {
    this.crossDistributedSpace = crossDistributedSpace;
  }

  /** Style of empty space caused by row gaps (gap/row-gap). */
  public BoxStyle getRowGapSpace() {
    return rowGapSpace;
  }

  /** Style of empty space caused by row gaps (gap/row-gap). */
  public void setRowGapSpace(BoxStyle rowGapSpace) {
    this.rowGapSpace = rowGapSpace;
  }

  /** Style of empty space caused by columns gaps (gap/column-gap). */
  public BoxStyle getColumnGapSpace() {
    return columnGapSpace;
  }

  /** Style of empty space caused by columns gaps (gap/column-gap). */
  public void setColumnGapSpace(BoxStyle columnGapSpace) {
    this.columnGapSpace = columnGapSpace;
  }

  /** Style of the self-alignment line (align-items). */
  public LineStyle getCrossAlignment() {
    return crossAlignment;
  }

  /** Style of the self-alignment line (align-items). */
  public void setCrossAlignment(LineStyle crossAlignment) {
    this.crossAlignment = crossAlignment;
  }
}
