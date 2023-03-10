package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.RGBA;

/** Style information for drawing a box. */
public class BoxStyle {

  @Optional private RGBA fillColor;

  @Optional private RGBA hatchColor;

  /** The background color for the box (default: transparent) */
  public RGBA getFillColor() {
    return fillColor;
  }

  /** The background color for the box (default: transparent) */
  public void setFillColor(RGBA fillColor) {
    this.fillColor = fillColor;
  }

  /** The hatching color for the box (default: transparent) */
  public RGBA getHatchColor() {
    return hatchColor;
  }

  /** The hatching color for the box (default: transparent) */
  public void setHatchColor(RGBA hatchColor) {
    this.hatchColor = hatchColor;
  }
}
