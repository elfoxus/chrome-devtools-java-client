package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.types.dom.RGBA;

/** Configuration data for drawing the source order of an elements children. */
public class SourceOrderConfig {

  private RGBA parentOutlineColor;

  private RGBA childOutlineColor;

  /** the color to outline the givent element in. */
  public RGBA getParentOutlineColor() {
    return parentOutlineColor;
  }

  /** the color to outline the givent element in. */
  public void setParentOutlineColor(RGBA parentOutlineColor) {
    this.parentOutlineColor = parentOutlineColor;
  }

  /** the color to outline the child elements in. */
  public RGBA getChildOutlineColor() {
    return childOutlineColor;
  }

  /** the color to outline the child elements in. */
  public void setChildOutlineColor(RGBA childOutlineColor) {
    this.childOutlineColor = childOutlineColor;
  }
}
