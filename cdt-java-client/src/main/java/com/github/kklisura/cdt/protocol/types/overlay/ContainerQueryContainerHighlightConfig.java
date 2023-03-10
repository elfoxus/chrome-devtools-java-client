package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class ContainerQueryContainerHighlightConfig {

  @Optional private LineStyle containerBorder;

  @Optional private LineStyle descendantBorder;

  /** The style of the container border. */
  public LineStyle getContainerBorder() {
    return containerBorder;
  }

  /** The style of the container border. */
  public void setContainerBorder(LineStyle containerBorder) {
    this.containerBorder = containerBorder;
  }

  /** The style of the descendants' borders. */
  public LineStyle getDescendantBorder() {
    return descendantBorder;
  }

  /** The style of the descendants' borders. */
  public void setDescendantBorder(LineStyle descendantBorder) {
    this.descendantBorder = descendantBorder;
  }
}
