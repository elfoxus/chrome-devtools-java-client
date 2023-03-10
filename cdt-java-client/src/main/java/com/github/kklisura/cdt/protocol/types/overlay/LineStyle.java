package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.RGBA;

/** Style information for drawing a line. */
public class LineStyle {

  @Optional private RGBA color;

  @Optional private LineStylePattern pattern;

  /** The color of the line (default: transparent) */
  public RGBA getColor() {
    return color;
  }

  /** The color of the line (default: transparent) */
  public void setColor(RGBA color) {
    this.color = color;
  }

  /** The line pattern (default: solid) */
  public LineStylePattern getPattern() {
    return pattern;
  }

  /** The line pattern (default: solid) */
  public void setPattern(LineStylePattern pattern) {
    this.pattern = pattern;
  }
}
